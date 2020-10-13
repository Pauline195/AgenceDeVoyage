package com.inti.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import com.inti.service.impl.HotelService;
import com.inti.service.interfaces.IHotelService;

public class HotelConverter {

	@FacesConverter("deptConverter")
	public class DepartementConverter implements Converter {

		@Override
		public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
			if (arg2 != null && arg2.trim().length() > 0) {
				try {
					IHotelService hotelService = new HotelService();
					return HotelService.rechercherHotelParNom(arg2);
				} catch (NumberFormatException ex) {
					throw new ConverterException(
							new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid value"));
				}
			} else {
				return null;
			}
		}

		@Override
		public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
			// TODO Auto-generated method stub
			return null;
		}

	}

	
	
}
