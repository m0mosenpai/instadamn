package com.facebook.mill.immutablecursor;

import X.C00O;
import X.C0eB;
import X.C14360o3;
import X.C70009VzU;
import X.C70010VzV;
import X.VMY;
import com.facebook.mill.runtime.TypeSqlQuery;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes11.dex */
public final class TypeSqlQueryImpl implements TypeSqlQuery {
    public static final VMY Companion = new Object();
    public static final int SQLITE_BLOB = 4;
    public static final int SQLITE_FLOAT = 2;
    public static final int SQLITE_INTEGER = 1;
    public static final int SQLITE_NULL = 5;
    public static final int SQLITE_TEXT = 3;
    public byte[] columnTypes;
    public NativeHolder mNativeHolder;
    public int size;

    public TypeSqlQueryImpl(NativeHolder nativeHolder) {
        C14360o3.A0B(nativeHolder, 1);
        this.mNativeHolder = nativeHolder;
        C70010VzV.A00();
        C70009VzU.A00();
        this.size = -1;
    }

    private final native int getSize();

    private final native boolean isNull(int i);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public native void close();

    public native byte[] getBlob(int i);

    public native boolean getBoolean(int i);

    public native double getDouble(int i);

    public native float getFloat(int i);

    public native int getInt(int i);

    public native long getLong(int i);

    public native String getString(int i);

    public native int getType(int i);

    public native boolean next();

    public native void resetPosition();

    @Override // com.facebook.mill.runtime.TypeSqlQuery
    public void setColumnTypes(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        this.columnTypes = bArr;
    }

    public byte[] getColumnTypes() {
        byte[] bArr = this.columnTypes;
        if (bArr != null) {
            return bArr;
        }
        C14360o3.A0F("columnTypes");
        throw C00O.createAndThrow();
    }

    public int getCount() {
        int i = this.size;
        if (i == -1) {
            int size = getSize();
            this.size = size;
            return size;
        }
        return i;
    }

    public Object getAny(int i) {
        int type = getType(i);
        if (type != 1) {
            if (type != 2) {
                if (type != 4) {
                    if (type != 5) {
                        return getString(i);
                    }
                    return C0eB.A00;
                }
                return getBlob(i);
            }
            return Float.valueOf(getFloat(i));
        }
        return Integer.valueOf(getInt(i));
    }

    public Object getNullableAny(int i) {
        if (isNull(i)) {
            return null;
        }
        return getAny(i);
    }

    public byte[] getNullableBlob(int i) {
        if (isNull(i)) {
            return null;
        }
        return getBlob(i);
    }

    public Boolean getNullableBoolean(int i) {
        if (isNull(i)) {
            return null;
        }
        return Boolean.valueOf(getBoolean(i));
    }

    public Double getNullableDouble(int i) {
        if (isNull(i)) {
            return null;
        }
        return Double.valueOf(getDouble(i));
    }

    public Float getNullableFloat(int i) {
        if (isNull(i)) {
            return null;
        }
        return Float.valueOf(getFloat(i));
    }

    public Integer getNullableInt(int i) {
        if (isNull(i)) {
            return null;
        }
        return Integer.valueOf(getInt(i));
    }

    public Long getNullableLong(int i) {
        if (isNull(i)) {
            return null;
        }
        return Long.valueOf(getLong(i));
    }

    public String getNullableString(int i) {
        if (isNull(i)) {
            return null;
        }
        return getString(i);
    }
}
