package X;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Kv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48532Kv {
    public Map A00;
    public static final String A02 = C48442Kl.A01("Data");
    public static final C48532Kv A01 = new C48552Kx().A00();

    public final boolean equals(Object o) {
        boolean equals;
        if (this != o) {
            if (o != null && getClass() == o.getClass()) {
                Map map = this.A00;
                java.util.Set keySet = map.keySet();
                Map map2 = ((C48532Kv) o).A00;
                if (keySet.equals(map2.keySet())) {
                    for (Object obj : keySet) {
                        Object obj2 = map.get(obj);
                        Object obj3 = map2.get(obj);
                        if (obj2 != null) {
                            if (obj3 != null) {
                                if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                                    equals = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                                } else {
                                    equals = obj2.equals(obj3);
                                }
                                if (!equals) {
                                }
                            }
                        } else if (obj2 == obj3) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0063: IF  (r4 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:41:0x006f (LINE:99), block:B:35:0x0063 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, X.2Kv] */
    public static C48532Kv A00(byte[] bytes) {
        ObjectInputStream objectInputStream;
        InputStream inputStream;
        if (bytes.length <= 10240) {
            HashMap hashMap = new HashMap();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                            hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e) {
                            android.util.Log.e(A02, "Error in Data#fromByteArray: ", e);
                        }
                    } catch (IOException | ClassNotFoundException e2) {
                        e = e2;
                        String str = A02;
                        android.util.Log.e(str, "Error in Data#fromByteArray: ", e);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e3) {
                                android.util.Log.e(str, "Error in Data#fromByteArray: ", e3);
                            }
                        }
                        byteArrayInputStream.close();
                        ?? obj = new Object();
                        obj.A00 = new HashMap(hashMap);
                        return obj;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e4) {
                            android.util.Log.e(A02, "Error in Data#fromByteArray: ", e4);
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e5) {
                        android.util.Log.e(A02, "Error in Data#fromByteArray: ", e5);
                        throw th;
                    }
                }
            } catch (IOException | ClassNotFoundException e6) {
                e = e6;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream.close();
                throw th;
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException e7) {
                android.util.Log.e(A02, "Error in Data#fromByteArray: ", e7);
            }
            ?? obj2 = new Object();
            obj2.A00 = new HashMap(hashMap);
            return obj2;
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    public static byte[] A01(C48532Kv data) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            objectOutputStream.writeInt(data.A00.size());
            for (Map.Entry entry : data.A00.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e2) {
                android.util.Log.e(A02, "Error in Data#toByteArray: ", e2);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                android.util.Log.e(A02, "Error in Data#toByteArray: ", e3);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e4) {
            e = e4;
            objectOutputStream2 = objectOutputStream;
            String str = A02;
            android.util.Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e5) {
                    android.util.Log.e(str, "Error in Data#toByteArray: ", e5);
                }
            }
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (IOException e6) {
                android.util.Log.e(str, "Error in Data#toByteArray: ", e6);
                return byteArray;
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e7) {
                    android.util.Log.e(A02, "Error in Data#toByteArray: ", e7);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e8) {
                android.util.Log.e(A02, "Error in Data#toByteArray: ", e8);
                throw th;
            }
        }
    }

    public final int A02(String key, int defaultValue) {
        Object obj = this.A00.get(key);
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        return defaultValue;
    }

    public final String A03(String key) {
        Object obj = this.A00.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        Map map = this.A00;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
