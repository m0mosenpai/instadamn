package X;

import android.os.Bundle;

/* renamed from: X.3Us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC74143Us {
    public static final AbstractC74143Us A03 = new AbstractC74143Us() { // from class: X.3Ut
        @Override // X.AbstractC74143Us
        public final Class A00() {
            return String.class;
        }

        @Override // X.AbstractC74143Us
        public final /* bridge */ /* synthetic */ void A02(Bundle bundle, Object obj, String str) {
            bundle.putString(str, (String) obj);
        }
    };
    public static final AbstractC74143Us A01 = new AbstractC74143Us() { // from class: X.3Uu
        @Override // X.AbstractC74143Us
        public final Class A00() {
            return Integer.class;
        }

        @Override // X.AbstractC74143Us
        public final /* bridge */ /* synthetic */ void A02(Bundle bundle, Object obj, String str) {
            bundle.putInt(str, ((Number) obj).intValue());
        }
    };
    public static final AbstractC74143Us A00 = new AbstractC74143Us() { // from class: X.3Uv
        @Override // X.AbstractC74143Us
        public final Class A00() {
            return Boolean.class;
        }

        @Override // X.AbstractC74143Us
        public final /* bridge */ /* synthetic */ void A02(Bundle bundle, Object obj, String str) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    };
    public static final AbstractC74143Us A02 = new AbstractC74143Us() { // from class: X.3Uw
    };

    public final void A01(Bundle bundle, C91M c91m, String str, String str2) {
        Object string;
        try {
            if (this instanceof C74173Uw) {
                string = Long.valueOf(bundle.getLong(str, Long.MAX_VALUE));
            } else if (this instanceof C74163Uv) {
                string = Boolean.valueOf(bundle.getBoolean(str, false));
            } else if (this instanceof C3Uu) {
                string = Integer.valueOf(bundle.getInt(str, 0));
            } else {
                string = bundle.getString(str, null);
            }
            A03(c91m, string, str2);
        } catch (ClassCastException e) {
            C0K8.A0F(AbstractC58317Pt9.A00(582), "bundleToPreferences got ClassCastException", e);
        }
    }

    public Class A00() {
        return Long.class;
    }

    public void A02(Bundle bundle, Object obj, String str) {
        bundle.putLong(str, ((Number) obj).longValue());
    }

    public final void A03(C91M c91m, Object obj, String str) {
        if (this instanceof C74173Uw) {
            c91m.E7E(str, ((Number) obj).longValue());
            return;
        }
        if (this instanceof C74163Uv) {
            c91m.E75(str, ((Boolean) obj).booleanValue());
        } else if (this instanceof C3Uu) {
            c91m.E7B(str, ((Number) obj).intValue());
        } else {
            c91m.E7I(str, (String) obj);
        }
    }

    public final void A04(InterfaceC65365Tix interfaceC65365Tix, C4N8 c4n8, Object obj, String str) {
        Object string;
        int intValue;
        boolean booleanValue;
        long longValue;
        if (this instanceof C74173Uw) {
            Number number = (Number) obj;
            if (number == null) {
                longValue = Long.MAX_VALUE;
            } else {
                longValue = number.longValue();
            }
            C14360o3.A0B(str, 0);
            string = Long.valueOf(((C4N7) c4n8).getLong(str, longValue));
        } else if (this instanceof C74163Uv) {
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                booleanValue = false;
            } else {
                booleanValue = bool.booleanValue();
            }
            C14360o3.A0B(str, 0);
            string = Boolean.valueOf(((C4N7) c4n8).getBoolean(str, booleanValue));
        } else if (this instanceof C3Uu) {
            Number number2 = (Number) obj;
            if (number2 == null) {
                intValue = 0;
            } else {
                intValue = number2.intValue();
            }
            C14360o3.A0B(str, 0);
            string = Integer.valueOf(((C4N7) c4n8).getInt(str, intValue));
        } else {
            String str2 = (String) obj;
            C14360o3.A0B(str, 0);
            C14360o3.A0B(str2, 1);
            string = ((C4N7) c4n8).getString(str, str2);
        }
        interfaceC65365Tix.onResult(string);
    }
}
