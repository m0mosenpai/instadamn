package X;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.SiY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63369SiY {
    public static final Map A00 = AbstractC166987dD.A1G();
    public static final Map A01 = AbstractC166987dD.A1G();

    public static void A04(ReactPropGroup reactPropGroup, Class cls, Method method, Map map) {
        AbstractC63177Sec r62;
        AbstractC63177Sec abstractC63177Sec;
        String[] names = reactPropGroup.names();
        int i = 0;
        if (cls != Dynamic.class) {
            if (cls != Integer.TYPE) {
                if (cls != Float.TYPE) {
                    if (cls != Double.TYPE) {
                        if (cls != Integer.class) {
                            StringBuilder A1C = AbstractC166987dD.A1C();
                            A1C.append("Unrecognized type: ");
                            A1C.append(cls);
                            A1C.append(" for method: ");
                            AbstractC58318PtA.A1Q(method.getDeclaringClass(), A1C);
                            A1C.append("#");
                            throw AbstractC166987dD.A18(AbstractC166997dE.A0x(method.getName(), A1C));
                        }
                        while (i < names.length) {
                            boolean equals = "Color".equals(reactPropGroup.customType());
                            String str = names[i];
                            if (equals) {
                                abstractC63177Sec = new AbstractC63177Sec(reactPropGroup, BaseViewManager.STATE_MIXED, method, i);
                            } else {
                                abstractC63177Sec = new AbstractC63177Sec(reactPropGroup, "number", method, i);
                            }
                            map.put(str, abstractC63177Sec);
                            i++;
                        }
                        return;
                    }
                    while (i < names.length) {
                        map.put(names[i], new R60(reactPropGroup, method, reactPropGroup.defaultDouble(), i));
                        i++;
                    }
                    return;
                }
                while (i < names.length) {
                    map.put(names[i], new R61(reactPropGroup, method, reactPropGroup.defaultFloat(), i));
                    i++;
                }
                return;
            }
            while (i < names.length) {
                boolean equals2 = "Color".equals(reactPropGroup.customType());
                String str2 = names[i];
                int defaultInt = reactPropGroup.defaultInt();
                if (equals2) {
                    r62 = new C60536R5z(reactPropGroup, method, i, defaultInt);
                } else {
                    r62 = new R62(reactPropGroup, method, i, defaultInt);
                }
                map.put(str2, r62);
                i++;
            }
            return;
        }
        while (i < names.length) {
            map.put(names[i], new AbstractC63177Sec(reactPropGroup, BaseViewManager.STATE_MIXED, method, i));
            i++;
        }
    }

    public static AbstractC63177Sec A00(ReactProp reactProp, Class cls, Method method) {
        if (cls == Dynamic.class) {
            return new AbstractC63177Sec(reactProp, BaseViewManager.STATE_MIXED, method);
        }
        if (cls == Boolean.TYPE) {
            return new R5y(reactProp, method, reactProp.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            boolean equals = "Color".equals(reactProp.customType());
            int defaultInt = reactProp.defaultInt();
            if (equals) {
                return new C60536R5z(reactProp, method, defaultInt);
            }
            return new R62(reactProp, method, defaultInt);
        }
        if (cls == Float.TYPE) {
            return new R61(reactProp, method, reactProp.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new R60(reactProp, method, reactProp.defaultDouble());
        }
        if (cls == String.class) {
            return new AbstractC63177Sec(reactProp, "String", method);
        }
        if (cls == Boolean.class) {
            return new AbstractC63177Sec(reactProp, "boolean", method);
        }
        if (cls == Integer.class) {
            if ("Color".equals(reactProp.customType())) {
                return new AbstractC63177Sec(reactProp, BaseViewManager.STATE_MIXED, method);
            }
            return new AbstractC63177Sec(reactProp, "number", method);
        }
        if (cls == ReadableArray.class) {
            return new AbstractC63177Sec(reactProp, "Array", method);
        }
        if (cls == ReadableMap.class) {
            return new AbstractC63177Sec(reactProp, "Map", method);
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Unrecognized type: ");
        A1C.append(cls);
        A1C.append(" for method: ");
        AbstractC58318PtA.A1Q(method.getDeclaringClass(), A1C);
        A1C.append("#");
        throw AbstractC166987dD.A18(AbstractC166997dE.A0x(method.getName(), A1C));
    }

    public static RuntimeException A01(Class cls, String str, Executable executable) {
        return new RuntimeException(AnonymousClass001.A0u(str, cls.getName(), "#", executable.getName()));
    }

    public static Map A02(Class cls) {
        if (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (cls2 != ReactShadowNode.class) {
                }
            }
            Map map = A00;
            Map map2 = (Map) map.get(cls);
            if (map2 == null) {
                HashMap A10 = AbstractC58318PtA.A10(A02(cls.getSuperclass()));
                for (Method method : cls.getDeclaredMethods()) {
                    ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
                    if (reactProp != null) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == 1) {
                            A10.put(reactProp.name(), A00(reactProp, parameterTypes[0], method));
                        } else {
                            throw A01(cls, "Wrong number of args for prop setter: ", method);
                        }
                    }
                    ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
                    if (reactPropGroup != null) {
                        Class<?>[] parameterTypes2 = method.getParameterTypes();
                        if (parameterTypes2.length == 2) {
                            if (parameterTypes2[0] == Integer.TYPE) {
                                A04(reactPropGroup, parameterTypes2[1], method, A10);
                            } else {
                                throw A01(cls, "Second argument should be property index: ", method);
                            }
                        } else {
                            throw A01(cls, "Wrong number of args for group prop setter: ", method);
                        }
                    }
                }
                map.put(cls, A10);
                return A10;
            }
            return map2;
        }
        return A01;
    }

    public static Map A03(Class cls) {
        if (cls == ViewManager.class) {
            return A01;
        }
        Map map = A00;
        Map map2 = (Map) map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap A10 = AbstractC58318PtA.A10(A03(cls.getSuperclass()));
        for (Method method : cls.getDeclaredMethods()) {
            ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
            if (reactProp != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 2) {
                    if (View.class.isAssignableFrom(parameterTypes[0])) {
                        A10.put(reactProp.name(), A00(reactProp, parameterTypes[1], method));
                    } else {
                        throw A01(cls, "First param should be a view subclass to be updated: ", method);
                    }
                } else {
                    throw A01(cls, "Wrong number of args for prop setter: ", method);
                }
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
            if (reactPropGroup != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length == 3) {
                    if (View.class.isAssignableFrom(parameterTypes2[0])) {
                        if (parameterTypes2[1] == Integer.TYPE) {
                            A04(reactPropGroup, parameterTypes2[2], method, A10);
                        } else {
                            throw A01(cls, "Second argument should be property index: ", method);
                        }
                    } else {
                        throw A01(cls, "First param should be a view subclass to be updated: ", method);
                    }
                } else {
                    throw A01(cls, "Wrong number of args for group prop setter: ", method);
                }
            }
        }
        map.put(cls, A10);
        return A10;
    }
}
