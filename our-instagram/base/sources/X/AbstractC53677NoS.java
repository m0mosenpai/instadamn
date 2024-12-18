package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NoS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53677NoS {
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0oO, java.lang.Object] */
    public static final C09530e4 A00(UserSession userSession) {
        C09530e4 A1L;
        C06090Tz c06090Tz = C06090Tz.A06;
        boolean z = false;
        if (C18U.A06(c06090Tz, userSession, 36330329492964156L)) {
            String A0f = MSY.A0f(AbstractC23021Ah.A00(userSession), "clips_audio_enhance_model_path", "");
            boolean A06 = C1RQ.A00().A06(EnumC27091Ti.A0H);
            if (!C14360o3.A0K(A0f, "") && A06) {
                z = true;
            }
            A1L = AbstractC166987dD.A1L(Boolean.valueOf(z), A0f);
        } else {
            A1L = AbstractC166987dD.A1L(false, "");
        }
        Boolean bool = (Boolean) A1L.A00;
        boolean booleanValue = bool.booleanValue();
        String str = (String) A1L.A01;
        C14360o3.A0B(str, 1);
        int A00 = (int) C18U.A00(c06090Tz, userSession, 37160443592376434L);
        ?? obj = new Object();
        obj.A00 = C18U.A06(c06090Tz, userSession, 36330329492964156L);
        ?? obj2 = new Object();
        obj2.A00 = C18U.A06(c06090Tz, userSession, 2342159027876138880L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36316018662313854L);
        boolean A063 = C18U.A06(c06090Tz, userSession, 2342159027876073343L);
        if (obj.A00 && !booleanValue) {
            obj.A00 = false;
            obj2.A00 = true;
        }
        return AbstractC166987dD.A1L(bool, new C51507Mos(str, obj, obj2, A00, A062, A063));
    }
}
