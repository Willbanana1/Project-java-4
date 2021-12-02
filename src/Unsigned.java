

import java.nio.ByteBuffer;

public class Unsigned extends Number{

    // целое неотрицательное
        private byte[] values;

        public Unsigned(int value) {
            this.values = ByteBuffer.allocate(4).putInt(value).array();
        }

        
        /** 
         * @return int
         */
        @Override
        public int intValue() {
            return ByteBuffer.wrap(values).getInt();
        }

        
        /** 
         * @return long
         */
        @Override
        public long longValue() {
            return ByteBuffer.wrap(values).getLong();
        }

        
        /** 
         * @return float
         */
        @Override
        public float floatValue() {
            return  ByteBuffer.wrap(values).getFloat();
        }

        
        /** 
         * @return double
         */
        @Override
        public double doubleValue() {
            return  ByteBuffer.wrap(values).getDouble();
        }

}
