package X;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.0JJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0JJ {
    public static C0JJ A2c;
    public static Field[] A2d;
    public static final Object A2e = new Object();
    public boolean A18 = false;
    public boolean A0z = false;
    public boolean A10 = false;
    public boolean A0y = false;
    public boolean A0v = false;
    public int A0E = 0;
    public double A01 = 0.0d;
    public boolean A0w = false;
    public int A0F = 0;
    public double A02 = 0.0d;
    public boolean A0x = false;
    public int A0G = 0;
    public double A03 = 0.0d;
    public boolean A2b = false;
    public int A0n = 0;
    public double A09 = 0.0d;
    public boolean A28 = false;
    public int A0X = 0;
    public double A07 = 0.0d;
    public boolean A2F = false;
    public int A0b = 0;
    public double A08 = 0.0d;
    public boolean A1G = false;
    public int A0O = 0;
    public double A04 = 0.0d;
    public boolean A0u = false;
    public int A0D = 0;
    public double A00 = 0.0d;
    public boolean A2W = false;
    public boolean A2V = false;
    public boolean A17 = false;
    public boolean A16 = false;
    public boolean A2T = false;
    public boolean A2J = false;
    public boolean A2P = false;
    public int A0k = 0;
    public boolean A2S = false;
    public int A0l = 0;
    public boolean A2K = false;
    public int A0f = 0;
    public boolean A2N = false;
    public int A0i = 0;
    public boolean A2M = false;
    public int A0h = 0;
    public boolean A2O = false;
    public int A0j = 0;
    public boolean A2L = false;
    public int A0g = 0;
    public boolean A2R = false;
    public boolean A2Q = false;
    public boolean A2I = false;
    public boolean A1g = false;
    public boolean A19 = false;
    public boolean A1b = false;
    public boolean A1f = false;
    public boolean A2X = false;
    public boolean A1K = false;
    public boolean A1Z = false;
    public boolean A1j = false;
    public boolean A1W = false;
    public boolean A1X = false;
    public boolean A1O = false;
    public boolean A1V = false;
    public boolean A1h = false;
    public boolean A1I = false;
    public boolean A1c = false;
    public boolean A1l = false;
    public boolean A1Y = false;
    public boolean A1k = false;
    public boolean A1J = false;
    public boolean A1e = false;
    public boolean A1m = false;
    public double A05 = 0.0d;
    public boolean A1d = false;
    public int A0P = 9;
    public int A0Q = 1;
    public boolean A1U = false;
    public boolean A1M = false;
    public boolean A1L = false;
    public boolean A1P = false;
    public boolean A1S = false;
    public boolean A1a = false;
    public boolean A1R = false;
    public boolean A1Q = false;
    public boolean A1H = false;
    public boolean A1i = false;
    public boolean A1T = false;
    public boolean A1N = false;
    public boolean A2Y = false;
    public double A06 = 0.0d;
    public boolean A1v = false;
    public int A0S = 0;
    public boolean A1t = false;
    public int A0R = 0;
    public boolean A1u = false;
    public long A0o = 0;
    public boolean A1s = false;
    public float A0A = 0.0f;
    public boolean A1z = false;
    public float A0C = 0.0f;
    public boolean A1y = false;
    public float A0B = 0.0f;
    public boolean A1x = false;
    public boolean A1w = false;
    public boolean A2E = false;
    public boolean A2C = false;
    public boolean A2D = false;
    public int A0a = 0;
    public boolean A2B = false;
    public int A0Z = 0;
    public boolean A2A = false;
    public int A0Y = 0;
    public boolean A0s = false;
    public boolean A29 = false;
    public boolean A11 = false;
    public int A0e = 0;
    public boolean A12 = false;
    public int A0m = 0;
    public boolean A2U = false;
    public boolean A0p = false;
    public boolean A0t = false;
    public boolean A14 = false;
    public boolean A0r = false;
    public boolean A0q = false;
    public boolean A2G = false;
    public int A0c = 0;
    public boolean A2H = false;
    public int A0d = 0;
    public boolean A15 = false;
    public boolean A2a = false;
    public boolean A1F = false;
    public int A0N = 0;
    public int A0H = 0;
    public int A0M = 10;
    public int A0I = 0;
    public int A0J = 0;
    public int A0L = 0;
    public int A0K = 1000;
    public boolean A1A = false;
    public boolean A1B = false;
    public boolean A13 = false;
    public boolean A22 = false;
    public boolean A20 = false;
    public boolean A24 = false;
    public boolean A26 = false;
    public int A0W = 0;
    public int A0U = 0;
    public boolean A1C = false;
    public boolean A23 = false;
    public boolean A21 = false;
    public boolean A25 = false;
    public boolean A27 = false;
    public int A0V = 0;
    public int A0T = 0;
    public boolean A1n = false;
    public boolean A1o = false;
    public boolean A2Z = false;
    public boolean A1D = false;
    public boolean A1E = false;
    public boolean A1q = false;
    public boolean A1r = false;
    public boolean A1p = false;

    public static C0JJ A00(Context context) {
        C0JJ c0jj;
        if (A2c == null) {
            synchronized (A2e) {
                if (A2c == null) {
                    if (!(!A01(context).exists())) {
                        c0jj = new C0JJ();
                    } else {
                        try {
                            c0jj = new C0JJ();
                            try {
                                try {
                                    try {
                                        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(context.getFileStreamPath("risky_startup_config"))));
                                        try {
                                            c0jj.A18 = dataInputStream.readBoolean();
                                            c0jj.A0z = dataInputStream.readBoolean();
                                            c0jj.A10 = dataInputStream.readBoolean();
                                            c0jj.A0y = dataInputStream.readBoolean();
                                            c0jj.A0v = dataInputStream.readBoolean();
                                            c0jj.A0E = dataInputStream.readInt();
                                            c0jj.A0w = dataInputStream.readBoolean();
                                            c0jj.A0F = dataInputStream.readInt();
                                            c0jj.A0x = dataInputStream.readBoolean();
                                            c0jj.A0G = dataInputStream.readInt();
                                            c0jj.A2b = dataInputStream.readBoolean();
                                            c0jj.A0n = dataInputStream.readInt();
                                            c0jj.A28 = dataInputStream.readBoolean();
                                            c0jj.A0X = dataInputStream.readInt();
                                            c0jj.A2F = dataInputStream.readBoolean();
                                            c0jj.A0b = dataInputStream.readInt();
                                            c0jj.A1G = dataInputStream.readBoolean();
                                            c0jj.A0O = dataInputStream.readInt();
                                            c0jj.A0u = dataInputStream.readBoolean();
                                            c0jj.A0D = dataInputStream.readInt();
                                            c0jj.A2W = dataInputStream.readBoolean();
                                            c0jj.A2V = dataInputStream.readBoolean();
                                            c0jj.A17 = dataInputStream.readBoolean();
                                            c0jj.A16 = dataInputStream.readBoolean();
                                            c0jj.A2T = dataInputStream.readBoolean();
                                            c0jj.A2J = dataInputStream.readBoolean();
                                            c0jj.A2P = dataInputStream.readBoolean();
                                            c0jj.A0k = dataInputStream.readInt();
                                            c0jj.A2S = dataInputStream.readBoolean();
                                            c0jj.A0l = dataInputStream.readInt();
                                            c0jj.A2K = dataInputStream.readBoolean();
                                            c0jj.A0f = dataInputStream.readInt();
                                            c0jj.A2N = dataInputStream.readBoolean();
                                            c0jj.A0i = dataInputStream.readInt();
                                            c0jj.A2M = dataInputStream.readBoolean();
                                            c0jj.A0h = dataInputStream.readInt();
                                            c0jj.A2O = dataInputStream.readBoolean();
                                            c0jj.A0j = dataInputStream.readInt();
                                            c0jj.A2L = dataInputStream.readBoolean();
                                            c0jj.A0g = dataInputStream.readInt();
                                            c0jj.A2R = dataInputStream.readBoolean();
                                            c0jj.A2Q = dataInputStream.readBoolean();
                                            c0jj.A2I = dataInputStream.readBoolean();
                                            c0jj.A1g = dataInputStream.readBoolean();
                                            c0jj.A01 = dataInputStream.readDouble();
                                            c0jj.A02 = dataInputStream.readDouble();
                                            c0jj.A03 = dataInputStream.readDouble();
                                            c0jj.A09 = dataInputStream.readDouble();
                                            c0jj.A07 = dataInputStream.readDouble();
                                            c0jj.A08 = dataInputStream.readDouble();
                                            c0jj.A04 = dataInputStream.readDouble();
                                            c0jj.A00 = dataInputStream.readDouble();
                                            c0jj.A19 = dataInputStream.readBoolean();
                                            c0jj.A1b = dataInputStream.readBoolean();
                                            c0jj.A1f = dataInputStream.readBoolean();
                                            c0jj.A2X = dataInputStream.readBoolean();
                                            c0jj.A1K = dataInputStream.readBoolean();
                                            c0jj.A1Z = dataInputStream.readBoolean();
                                            c0jj.A1j = dataInputStream.readBoolean();
                                            c0jj.A1W = dataInputStream.readBoolean();
                                            c0jj.A1X = dataInputStream.readBoolean();
                                            c0jj.A1O = dataInputStream.readBoolean();
                                            c0jj.A1V = dataInputStream.readBoolean();
                                            c0jj.A1h = dataInputStream.readBoolean();
                                            c0jj.A1I = dataInputStream.readBoolean();
                                            c0jj.A1c = dataInputStream.readBoolean();
                                            c0jj.A1l = dataInputStream.readBoolean();
                                            c0jj.A1Y = dataInputStream.readBoolean();
                                            c0jj.A1k = dataInputStream.readBoolean();
                                            c0jj.A1J = dataInputStream.readBoolean();
                                            c0jj.A1e = dataInputStream.readBoolean();
                                            c0jj.A1m = dataInputStream.readBoolean();
                                            c0jj.A05 = dataInputStream.readDouble();
                                            c0jj.A1d = dataInputStream.readBoolean();
                                            c0jj.A0P = dataInputStream.readInt();
                                            c0jj.A0Q = dataInputStream.readInt();
                                            c0jj.A1U = dataInputStream.readBoolean();
                                            c0jj.A1M = dataInputStream.readBoolean();
                                            c0jj.A1L = dataInputStream.readBoolean();
                                            c0jj.A1P = dataInputStream.readBoolean();
                                            c0jj.A1S = dataInputStream.readBoolean();
                                            c0jj.A1a = dataInputStream.readBoolean();
                                            c0jj.A1R = dataInputStream.readBoolean();
                                            c0jj.A1Q = dataInputStream.readBoolean();
                                            c0jj.A1H = dataInputStream.readBoolean();
                                            c0jj.A1i = dataInputStream.readBoolean();
                                            c0jj.A1T = dataInputStream.readBoolean();
                                            c0jj.A1N = dataInputStream.readBoolean();
                                            c0jj.A2Y = dataInputStream.readBoolean();
                                            c0jj.A06 = dataInputStream.readDouble();
                                            c0jj.A1v = dataInputStream.readBoolean();
                                            c0jj.A0S = dataInputStream.readInt();
                                            c0jj.A1t = dataInputStream.readBoolean();
                                            c0jj.A0R = dataInputStream.readInt();
                                            c0jj.A1u = dataInputStream.readBoolean();
                                            c0jj.A0o = dataInputStream.readLong();
                                            c0jj.A1s = dataInputStream.readBoolean();
                                            c0jj.A0A = dataInputStream.readFloat();
                                            c0jj.A1z = dataInputStream.readBoolean();
                                            c0jj.A0C = dataInputStream.readFloat();
                                            c0jj.A1y = dataInputStream.readBoolean();
                                            c0jj.A0B = dataInputStream.readFloat();
                                            c0jj.A1x = dataInputStream.readBoolean();
                                            c0jj.A1w = dataInputStream.readBoolean();
                                            c0jj.A2E = dataInputStream.readBoolean();
                                            c0jj.A2C = dataInputStream.readBoolean();
                                            c0jj.A2D = dataInputStream.readBoolean();
                                            c0jj.A0a = dataInputStream.readInt();
                                            c0jj.A2B = dataInputStream.readBoolean();
                                            c0jj.A0Z = dataInputStream.readInt();
                                            c0jj.A2A = dataInputStream.readBoolean();
                                            c0jj.A0Y = dataInputStream.readInt();
                                            c0jj.A0s = dataInputStream.readBoolean();
                                            c0jj.A29 = dataInputStream.readBoolean();
                                            c0jj.A11 = dataInputStream.readBoolean();
                                            c0jj.A0e = dataInputStream.readInt();
                                            c0jj.A12 = dataInputStream.readBoolean();
                                            c0jj.A0m = dataInputStream.readInt();
                                            c0jj.A2U = dataInputStream.readBoolean();
                                            c0jj.A0p = dataInputStream.readBoolean();
                                            c0jj.A0t = dataInputStream.readBoolean();
                                            dataInputStream.readBoolean();
                                            dataInputStream.readBoolean();
                                            dataInputStream.readBoolean();
                                            c0jj.A14 = dataInputStream.readBoolean();
                                            c0jj.A0r = dataInputStream.readBoolean();
                                            c0jj.A0q = dataInputStream.readBoolean();
                                            c0jj.A2G = dataInputStream.readBoolean();
                                            c0jj.A0c = dataInputStream.readInt();
                                            c0jj.A2H = dataInputStream.readBoolean();
                                            c0jj.A0d = dataInputStream.readInt();
                                            c0jj.A15 = dataInputStream.readBoolean();
                                            c0jj.A2a = dataInputStream.readBoolean();
                                            dataInputStream.readBoolean();
                                            dataInputStream.readBoolean();
                                            dataInputStream.readBoolean();
                                            c0jj.A1F = dataInputStream.readBoolean();
                                            c0jj.A0N = dataInputStream.readInt();
                                            c0jj.A0H = dataInputStream.readInt();
                                            c0jj.A0M = dataInputStream.readInt();
                                            c0jj.A0I = dataInputStream.readInt();
                                            c0jj.A0J = dataInputStream.readInt();
                                            c0jj.A0L = dataInputStream.readInt();
                                            c0jj.A0K = dataInputStream.readInt();
                                            c0jj.A1A = dataInputStream.readBoolean();
                                            c0jj.A1B = dataInputStream.readBoolean();
                                            dataInputStream.readInt();
                                            dataInputStream.readBoolean();
                                            dataInputStream.readInt();
                                            dataInputStream.readInt();
                                            dataInputStream.readInt();
                                            dataInputStream.readBoolean();
                                            dataInputStream.readInt();
                                            dataInputStream.readBoolean();
                                            c0jj.A13 = dataInputStream.readBoolean();
                                            c0jj.A22 = dataInputStream.readBoolean();
                                            c0jj.A20 = dataInputStream.readBoolean();
                                            c0jj.A24 = dataInputStream.readBoolean();
                                            c0jj.A26 = dataInputStream.readBoolean();
                                            c0jj.A0W = dataInputStream.readInt();
                                            c0jj.A0U = dataInputStream.readInt();
                                            c0jj.A1C = dataInputStream.readBoolean();
                                            c0jj.A23 = dataInputStream.readBoolean();
                                            c0jj.A21 = dataInputStream.readBoolean();
                                            c0jj.A25 = dataInputStream.readBoolean();
                                            c0jj.A27 = dataInputStream.readBoolean();
                                            c0jj.A0V = dataInputStream.readInt();
                                            c0jj.A0T = dataInputStream.readInt();
                                            c0jj.A1n = dataInputStream.readBoolean();
                                            c0jj.A1o = dataInputStream.readBoolean();
                                            c0jj.A2Z = dataInputStream.readBoolean();
                                            c0jj.A1D = dataInputStream.readBoolean();
                                            c0jj.A1E = dataInputStream.readBoolean();
                                            dataInputStream.readBoolean();
                                            dataInputStream.readBoolean();
                                            dataInputStream.readInt();
                                            c0jj.A1q = dataInputStream.readBoolean();
                                            c0jj.A1r = dataInputStream.readBoolean();
                                            c0jj.A1p = dataInputStream.readBoolean();
                                            dataInputStream.close();
                                        } catch (Throwable th) {
                                            try {
                                                dataInputStream.close();
                                            } catch (Throwable th2) {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e) {
                                        android.util.Log.e("RiskyStartupConfig", "Failed to read risky config, some values left unset", e);
                                    }
                                } catch (EOFException e2) {
                                    String.format("underflowed config file, leaving remaining values unset. Error: %s", e2.getMessage());
                                }
                            } catch (FileNotFoundException unused) {
                                android.util.Log.e("RiskyStartupConfig", "Config not found, using default values. This likely means that this is a fresh install, data was cleared, or that the prior startup attempt crashed.");
                            }
                            String.format("Current Read Config: %s", c0jj);
                            A02(context);
                        } catch (Throwable th3) {
                            A02(context);
                            throw th3;
                        }
                    }
                    A2c = c0jj;
                }
            }
        }
        C0JJ c0jj2 = A2c;
        AbstractC05810Sj.A00(c0jj2);
        return c0jj2;
    }

    public static void A02(Context context) {
        File A01 = A01(context);
        if (!A01.exists()) {
            try {
                if (!A01.createNewFile()) {
                    android.util.Log.w("RiskyStartupConfig", String.format("Could not create has read marker file for %s", A01.getName()));
                }
            } catch (IOException e) {
                android.util.Log.e("RiskyStartupConfig", String.format("Error creating has read marker file for %s", A01.getName()), e);
            }
        }
    }

    public static Field[] A04() {
        Field[] fieldArr = A2d;
        if (fieldArr == null) {
            Field[] declaredFields = C0JJ.class.getDeclaredFields();
            ArrayList arrayList = new ArrayList(declaredFields.length);
            for (Field field : declaredFields) {
                if ((field.getModifiers() & 8) != 8) {
                    Class<?> type = field.getType();
                    if (!type.isPrimitive() && !String.class.isAssignableFrom(type)) {
                        String.format("Ignoring field %s because it's type %s does not look like MC (Is Prim: %s Is String: %s)", field.getName(), type.getName(), Boolean.valueOf(type.isPrimitive()), Boolean.valueOf(String.class.isAssignableFrom(type)));
                    } else {
                        field.setAccessible(true);
                        arrayList.add(field);
                    }
                }
            }
            Collections.sort(arrayList, new C15110pR(1));
            Field[] fieldArr2 = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
            A2d = fieldArr2;
            return fieldArr2;
        }
        return fieldArr;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0JJ)) {
            return Arrays.deepEquals(A03(this), A03(obj));
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append('[');
            sb.append('\n');
            for (Field field : A04()) {
                sb.append('\t');
                sb.append(field.getName());
                sb.append(": ");
                sb.append(field.get(this));
                sb.append('\n');
            }
            sb.append(']');
            return sb.toString();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static File A01(Context context) {
        String str;
        C0JA A00 = C0JA.A00();
        if (A00 != null && !A00.A04()) {
            C0J9 c0j9 = A00.A00;
            if (c0j9 != null) {
                str = c0j9.A00;
            } else {
                str = null;
            }
        } else {
            str = "#MAIN#";
        }
        String A0R = AnonymousClass001.A0R("RSC_READ_", str);
        File A002 = C0eS.A00(context, 1832390025);
        A002.mkdirs();
        return new File(A002, A0R);
    }

    public static Object[] A03(Object obj) {
        Field[] A04 = A04();
        int length = A04.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            try {
                objArr[i] = A04[i].get(obj);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return objArr;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(A03(this));
    }
}
