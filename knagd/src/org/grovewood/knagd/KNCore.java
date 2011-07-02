
package org.grovewood.knagd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KNCore
{
	public interface Converter
	{
		Object Convert(byte[] array);
	}
	public enum DataTypes implements Converter
	{
		KNBoolean,

		KN1ByteInteger,
		KN2ByteInteger,
		KN4ByteInteger,
		KN8ByteInteger,

		KNFloat,
		KNShortFloat,

		KNCharacter,
		KNString,
		
		KNDateTime,
		KNDate,
		KNTimeStamp;

		@Override
		public Object Convert(byte[] array)
		{
			// TODO Auto-generated method stub
			return null;
		}
	}

	private final Logger log = LoggerFactory.getLogger(getClass());
	
	void input(DataTypes dataStream)
	{
		// Do stuff.
	}
	
	
}
