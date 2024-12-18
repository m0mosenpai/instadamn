package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class OSB {
    public static final SYM A00 = new SYM();

    public static final void A00(UserSession userSession, String str, String str2, boolean z) {
        GestureDetectorOnGestureListenerC72583Nf gestureDetectorOnGestureListenerC72583Nf;
        C55782hJ A002 = C55772hI.A00(userSession);
        String str3 = str;
        if (!z) {
            str3 = null;
        }
        TGD tgd = new TGD(str2, str3);
        A002.A0F = z;
        A002.A0D("separate_process", tgd);
        if (z && (gestureDetectorOnGestureListenerC72583Nf = C172077lc.A00(userSession).A01) != null) {
            gestureDetectorOnGestureListenerC72583Nf.A00(str2, str);
        }
    }
}
