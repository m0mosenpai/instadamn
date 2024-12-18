package com.facebook.pando;

import X.AbstractC38301qK;
import X.C09170dP;
import com.facebook.jni.HybridClassBase;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class TreeUpdaterJNI extends HybridClassBase {
    public static final TreeUpdaterJNI $redex_init_class = null;

    private final native void build();

    private native void initHybridForRawBuilder();

    private native void initHybridForUpdateBuilder(TreeJNI treeJNI);

    private final native void setBoolean(String str, Boolean bool);

    private final native void setBooleanList(String str, Iterable iterable);

    private final native void setDouble(String str, Double d);

    private final native void setDoubleList(String str, Iterable iterable);

    private final native void setEmptyList(String str);

    private final native void setInt(String str, Integer num);

    private final native void setIntList(String str, Iterable iterable);

    private final native void setLong(String str, Long l);

    private final native void setLongList(String str, Iterable iterable);

    private final native void setNull(String str);

    private final native void setString(String str, String str2);

    private final native void setStringList(String str, Iterable iterable);

    private final native void setTreeUpdater(String str, TreeUpdaterJNI treeUpdaterJNI);

    private final native void setTreeUpdaterList(String str, Iterable iterable);

    public final native TreeJNI applyToTree(TreeJNI treeJNI);

    public final native TreeJNI treeFromUpdater(Class cls);

    static {
        C09170dP.A0C("pando-jni");
    }

    public TreeUpdaterJNI(String str, Map map) {
        initHybridForRawBuilder();
        constructTreeWithArgs(map);
    }

    private void constructTreeWithArgs(Map map) {
        String str;
        Double d;
        String str2;
        String str3;
        int A02;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value == null) {
                setNull((String) entry.getKey());
            } else if (value instanceof Integer) {
                setInt((String) entry.getKey(), (Integer) value);
            } else if (value instanceof Long) {
                setLong((String) entry.getKey(), (Long) value);
            } else {
                if (value instanceof Double) {
                    str = (String) entry.getKey();
                    d = (Double) value;
                } else if (value instanceof Float) {
                    str = (String) entry.getKey();
                    d = Double.valueOf(((Number) value).doubleValue());
                } else if (value instanceof Boolean) {
                    setBoolean((String) entry.getKey(), (Boolean) value);
                } else {
                    if (value instanceof String) {
                        str2 = (String) entry.getKey();
                        str3 = (String) value;
                    } else if (value instanceof Enum) {
                        str2 = (String) entry.getKey();
                        str3 = value.toString();
                    } else if (value instanceof TreeUpdaterJNI) {
                        setTreeUpdater((String) entry.getKey(), (TreeUpdaterJNI) value);
                    } else if (value instanceof Iterable) {
                        String str4 = (String) entry.getKey();
                        Iterable iterable = (Iterable) value;
                        if (iterable instanceof Collection) {
                            A02 = ((Collection) iterable).size();
                        } else {
                            Iterator it = iterable.iterator();
                            long j = 0;
                            while (it.hasNext()) {
                                it.next();
                                j++;
                            }
                            A02 = AbstractC38301qK.A02(j);
                        }
                        if (A02 == 0) {
                            setEmptyList(str4);
                        } else {
                            Object next = iterable.iterator().next();
                            if (next instanceof Integer) {
                                setIntList(str4, iterable);
                            } else if (next instanceof Long) {
                                setLongList(str4, iterable);
                            } else if (next instanceof Double) {
                                setDoubleList(str4, iterable);
                            } else if (next instanceof Boolean) {
                                setBooleanList(str4, iterable);
                            } else if (next instanceof String) {
                                setStringList(str4, iterable);
                            } else if (next instanceof TreeUpdaterJNI) {
                                setTreeUpdaterList(str4, iterable);
                            }
                        }
                    }
                    setString(str2, str3);
                }
                setDouble(str, d);
            }
        }
        build();
    }

    public TreeUpdaterJNI(Map map, TreeJNI treeJNI) {
        initHybridForUpdateBuilder(treeJNI);
        constructTreeWithArgs(map);
    }
}
