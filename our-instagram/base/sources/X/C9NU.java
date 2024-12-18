package X;

import com.instagram.api.schemas.WearablesAppAttributionType;

/* renamed from: X.9NU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9NU extends AbstractC224309vG {
    public static final C9NU A02 = new Object();
    public static final WearablesAppAttributionType A00 = WearablesAppAttributionType.A05;
    public static final EnumC223259tC A01 = EnumC223259tC.A0L;

    public static final boolean A00(AbstractC12990ll abstractC12990ll, String str) {
        if (str != null) {
            if (AbstractC001900j.A0a(str, "Hammerhead", true) || AbstractC001900j.A0a(str, "com.facebook.hammerhead", false) || AbstractC001900j.A0a(str, "Ray-Ban | Meta", false) || AbstractC001900j.A0a(str, C18U.A04(C06090Tz.A05, abstractC12990ll, 36880626472780120L), false)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
