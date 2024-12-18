package X;

import android.content.Context;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.lang.reflect.Method;

/* renamed from: X.Sec, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63177Sec {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final Method A03;
    public static final ThreadLocal A06 = new TYW(2);
    public static final ThreadLocal A07 = new TYW(3);
    public static final ThreadLocal A04 = new TYW(1);
    public static final ThreadLocal A05 = new TYW(2);

    public final Object A00(Context context, Object obj) {
        boolean A1a;
        double A00;
        float A09;
        int A0H;
        if (!(this instanceof R5x) && !(this instanceof R5w)) {
            if (this instanceof R62) {
                R62 r62 = (R62) this;
                if (obj == null) {
                    A0H = r62.A00;
                } else {
                    A0H = AbstractC166987dD.A0H(obj);
                }
                return Integer.valueOf(A0H);
            }
            if (this instanceof R61) {
                R61 r61 = (R61) this;
                if (obj == null) {
                    A09 = r61.A00;
                } else {
                    A09 = AbstractC166987dD.A09(obj);
                }
                return Float.valueOf(A09);
            }
            if (this instanceof R5v) {
                if (!(obj instanceof Dynamic)) {
                    return new T02(obj);
                }
                return obj;
            }
            if (this instanceof R60) {
                R60 r60 = (R60) this;
                if (obj == null) {
                    A00 = r60.A00;
                } else {
                    A00 = MSW.A00(obj);
                }
                return Double.valueOf(A00);
            }
            if (this instanceof C60536R5z) {
                C60536R5z c60536R5z = (C60536R5z) this;
                if (obj == null) {
                    return Integer.valueOf(c60536R5z.A00);
                }
            } else {
                if (this instanceof R5u) {
                    if (obj != null) {
                        if (obj instanceof Double) {
                            return Integer.valueOf(AbstractC166987dD.A0H(obj));
                        }
                        return obj;
                    }
                    return null;
                }
                if (this instanceof R5t) {
                    if (obj == null) {
                        return null;
                    }
                } else {
                    if (this instanceof R5s) {
                        if (obj != null) {
                            A1a = AbstractC166987dD.A1a(obj);
                        } else {
                            return null;
                        }
                    } else if (this instanceof R5y) {
                        R5y r5y = (R5y) this;
                        if (obj == null) {
                            A1a = r5y.A00;
                        } else {
                            A1a = AbstractC166987dD.A1a(obj);
                        }
                    }
                    if (A1a) {
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }
            }
            return C63233Sfl.A00(context, obj);
        }
        return obj;
    }

    public AbstractC63177Sec(ReactPropGroup reactPropGroup, String str, Method method, int i) {
        this.A01 = reactPropGroup.names()[i];
        String customType = reactPropGroup.customType();
        this.A02 = "__default_type__".equals(customType) ? str : customType;
        this.A03 = method;
        this.A00 = Integer.valueOf(i);
    }

    public AbstractC63177Sec(ReactProp reactProp, String str, Method method) {
        this.A01 = reactProp.name();
        String customType = reactProp.customType();
        this.A02 = "__default_type__".equals(customType) ? str : customType;
        this.A03 = method;
        this.A00 = null;
    }
}
