package com.facebook.react.bridge;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31172DnG;
import X.AbstractC37303Gc4;
import X.AbstractC43594JPz;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.C64899TYz;
import X.InterfaceC65656Tqi;
import X.InterfaceC65657Tqj;
import X.MSW;
import X.T0F;
import X.T0G;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class Arguments {
    public static Bundle toBundle(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        Bundle A0b = AbstractC166987dD.A0b();
        while (keySetIterator.CLQ()) {
            String Csu = keySetIterator.Csu();
            switch (readableMap.getType(Csu).ordinal()) {
                case 0:
                    A0b.putString(Csu, null);
                    break;
                case 1:
                    A0b.putBoolean(Csu, readableMap.getBoolean(Csu));
                    break;
                case 2:
                    A0b.putDouble(Csu, readableMap.getDouble(Csu));
                    break;
                case 3:
                    A0b.putString(Csu, readableMap.getString(Csu));
                    break;
                case 4:
                    A0b.putBundle(Csu, toBundle(readableMap.getMap(Csu)));
                    break;
                case 5:
                    A0b.putSerializable(Csu, toList(readableMap.getArray(Csu)));
                    break;
                default:
                    throw AbstractC58320PtC.A0l("Could not convert object with key: ", Csu, ".");
            }
        }
        return A0b;
    }

    public static ArrayList toList(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (readableArray.getType(i).ordinal()) {
                case 0:
                    A1E.add(null);
                    break;
                case 1:
                    A1E.add(Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case 2:
                    double d = readableArray.getDouble(i);
                    if (d == Math.rint(d)) {
                        AbstractC166997dE.A1W(A1E, (int) d);
                        break;
                    } else {
                        A1E.add(Double.valueOf(d));
                        break;
                    }
                case 3:
                    A1E.add(readableArray.getString(i));
                    break;
                case 4:
                    A1E.add(toBundle(readableArray.getMap(i)));
                    break;
                case 5:
                    A1E.add(toList(readableArray.getArray(i)));
                    break;
                default:
                    throw AbstractC166987dD.A12("Could not convert object in array.");
            }
        }
        return A1E;
    }

    public static InterfaceC65656Tqi fromArray(Object obj) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        int i = 0;
        if (obj instanceof String[]) {
            String[] strArr = (String[]) obj;
            int length = strArr.length;
            while (i < length) {
                writableNativeArray.pushString(strArr[i]);
                i++;
            }
        } else if (obj instanceof Bundle[]) {
            Bundle[] bundleArr = (Bundle[]) obj;
            int length2 = bundleArr.length;
            while (i < length2) {
                writableNativeArray.pushMap(fromBundle(bundleArr[i]));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i < length3) {
                writableNativeArray.pushInt(iArr[i]);
                i++;
            }
        } else if (obj instanceof float[]) {
            int length4 = ((float[]) obj).length;
            while (i < length4) {
                writableNativeArray.pushDouble(r5[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length5 = dArr.length;
            while (i < length5) {
                writableNativeArray.pushDouble(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length6 = zArr.length;
            while (i < length6) {
                writableNativeArray.pushBoolean(zArr[i]);
                i++;
            }
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            int length7 = parcelableArr.length;
            while (i < length7) {
                Parcelable parcelable = parcelableArr[i];
                if (parcelable instanceof Bundle) {
                    writableNativeArray.pushMap(fromBundle((Bundle) parcelable));
                    i++;
                } else {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    throw AbstractC43594JPz.A0n(AbstractC58318PtA.A0X(parcelable, "Unexpected array member type ", A1C), A1C);
                }
            }
        } else {
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            throw AbstractC43594JPz.A0n(AbstractC58318PtA.A0X(obj, "Unknown array type ", A1C2), A1C2);
        }
        return writableNativeArray;
    }

    public static WritableNativeArray fromJavaArgs(Object[] objArr) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : objArr) {
            if (obj == null) {
                writableNativeArray.pushNull();
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class) {
                    writableNativeArray.pushBoolean(AbstractC166987dD.A1a(obj));
                } else if (cls != Integer.class && cls != Double.class && cls != Float.class) {
                    if (cls == String.class) {
                        writableNativeArray.pushString(obj.toString());
                    } else if (cls == WritableNativeMap.class) {
                        writableNativeArray.pushMap((ReadableNativeMap) obj);
                    } else if (cls == WritableNativeArray.class) {
                        writableNativeArray.pushArray((ReadableNativeArray) obj);
                    } else {
                        throw AbstractC166987dD.A18(AbstractC167017dG.A0n(cls, "Cannot convert argument of type ", AbstractC166987dD.A1C()));
                    }
                } else {
                    writableNativeArray.pushDouble(((Number) obj).doubleValue());
                }
            }
        }
        return writableNativeArray;
    }

    public static InterfaceC65656Tqi fromList(List list) {
        InterfaceC65656Tqi fromArray;
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : list) {
            if (obj == null) {
                writableNativeArray.pushNull();
            } else {
                Class<?> cls = obj.getClass();
                if (cls.isArray()) {
                    fromArray = fromArray(obj);
                } else if (obj instanceof Bundle) {
                    writableNativeArray.pushMap(fromBundle((Bundle) obj));
                } else if (obj instanceof List) {
                    fromArray = fromList((List) obj);
                } else if (obj instanceof String) {
                    writableNativeArray.pushString((String) obj);
                } else if (obj instanceof Integer) {
                    writableNativeArray.pushInt(AbstractC166987dD.A0H(obj));
                } else if (obj instanceof Number) {
                    writableNativeArray.pushDouble(MSW.A00(obj));
                } else if (obj instanceof Boolean) {
                    writableNativeArray.pushBoolean(AbstractC166987dD.A1a(obj));
                } else {
                    throw AbstractC37303Gc4.A0M(cls, "Unknown value type ", AbstractC166987dD.A1C());
                }
                writableNativeArray.pushArray(fromArray);
            }
        }
        return writableNativeArray;
    }

    public static WritableNativeArray makeNativeArray(List list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object makeNativeObject = makeNativeObject(it.next());
                if (makeNativeObject == null) {
                    writableNativeArray.pushNull();
                } else if (makeNativeObject instanceof Boolean) {
                    writableNativeArray.pushBoolean(AbstractC166987dD.A1a(makeNativeObject));
                } else if (makeNativeObject instanceof Integer) {
                    writableNativeArray.pushInt(AbstractC166987dD.A0H(makeNativeObject));
                } else if (makeNativeObject instanceof Double) {
                    writableNativeArray.pushDouble(MSW.A00(makeNativeObject));
                } else if (makeNativeObject instanceof String) {
                    writableNativeArray.pushString((String) makeNativeObject);
                } else if (makeNativeObject instanceof WritableNativeArray) {
                    writableNativeArray.pushArray((ReadableNativeArray) makeNativeObject);
                } else if (makeNativeObject instanceof WritableNativeMap) {
                    writableNativeArray.pushMap((ReadableNativeMap) makeNativeObject);
                } else {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    throw AbstractC43594JPz.A0n(AbstractC58318PtA.A0X(makeNativeObject, "Could not convert ", A1C), A1C);
                }
            }
        }
        return writableNativeArray;
    }

    public static Object makeNativeObject(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Float) && !(obj instanceof Long) && !(obj instanceof Byte) && !(obj instanceof Short)) {
            if (obj.getClass().isArray()) {
                return makeNativeArray(new C64899TYz(obj));
            }
            if (obj instanceof List) {
                return makeNativeArray((List) obj);
            }
            if (obj instanceof Map) {
                return makeNativeMap((Map) obj);
            }
            if (obj instanceof Bundle) {
                return makeNativeMap((Bundle) obj);
            }
            if (obj instanceof T0G) {
                return makeNativeMap(((T0G) obj).toHashMap());
            }
            if (obj instanceof T0F) {
                return makeNativeArray(((T0F) obj).toArrayList());
            }
            return obj;
        }
        return Double.valueOf(MSW.A00(obj));
    }

    public static void addEntry(WritableNativeMap writableNativeMap, String str, Object obj) {
        Object makeNativeObject = makeNativeObject(obj);
        if (makeNativeObject == null) {
            writableNativeMap.putNull(str);
            return;
        }
        if (makeNativeObject instanceof Boolean) {
            writableNativeMap.putBoolean(str, AbstractC166987dD.A1a(makeNativeObject));
            return;
        }
        if (makeNativeObject instanceof Integer) {
            writableNativeMap.putInt(str, AbstractC166987dD.A0H(makeNativeObject));
            return;
        }
        if (makeNativeObject instanceof Number) {
            writableNativeMap.putDouble(str, MSW.A00(makeNativeObject));
            return;
        }
        if (makeNativeObject instanceof String) {
            writableNativeMap.putString(str, (String) makeNativeObject);
            return;
        }
        if (makeNativeObject instanceof WritableNativeArray) {
            writableNativeMap.putArray(str, (ReadableNativeArray) makeNativeObject);
        } else if (makeNativeObject instanceof WritableNativeMap) {
            writableNativeMap.putMap(str, (ReadableNativeMap) makeNativeObject);
        } else {
            StringBuilder A1C = AbstractC166987dD.A1C();
            throw AbstractC43594JPz.A0n(AbstractC58318PtA.A0X(makeNativeObject, "Could not convert ", A1C), A1C);
        }
    }

    public static InterfaceC65657Tqj fromBundle(Bundle bundle) {
        InterfaceC65656Tqi fromArray;
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        Iterator A14 = AbstractC58319PtB.A14(bundle);
        while (A14.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A14);
            Object obj = bundle.get(A1B);
            if (obj == null) {
                A0c.putNull(A1B);
            } else {
                Class<?> cls = obj.getClass();
                if (cls.isArray()) {
                    fromArray = fromArray(obj);
                } else if (obj instanceof String) {
                    A0c.putString(A1B, (String) obj);
                } else if (obj instanceof Number) {
                    if (obj instanceof Integer) {
                        A0c.putInt(A1B, AbstractC166987dD.A0H(obj));
                    } else {
                        A0c.putDouble(A1B, MSW.A00(obj));
                    }
                } else if (obj instanceof Boolean) {
                    A0c.putBoolean(A1B, AbstractC166987dD.A1a(obj));
                } else if (obj instanceof Bundle) {
                    A0c.putMap(A1B, fromBundle((Bundle) obj));
                } else if (obj instanceof List) {
                    fromArray = fromList((List) obj);
                } else {
                    throw AbstractC37303Gc4.A0M(cls, "Could not convert ", AbstractC166987dD.A1C());
                }
                A0c.putArray(A1B, fromArray);
            }
        }
        return A0c;
    }

    public static WritableNativeMap makeNativeMap(Map map) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        if (map != null) {
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                addEntry(A0c, AbstractC31172DnG.A17(A1K), A1K.getValue());
            }
        }
        return A0c;
    }

    public static WritableNativeMap makeNativeMap(Bundle bundle) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        if (bundle != null) {
            Iterator A14 = AbstractC58319PtB.A14(bundle);
            while (A14.hasNext()) {
                String A1B = AbstractC166987dD.A1B(A14);
                addEntry(A0c, A1B, bundle.get(A1B));
            }
        }
        return A0c;
    }
}
