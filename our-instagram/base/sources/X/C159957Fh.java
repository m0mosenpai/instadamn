package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159957Fh {
    public final C159967Fi A00;

    public static final String A00(AbstractC160207Gg abstractC160207Gg) {
        StringBuilder sb;
        String str;
        if ((abstractC160207Gg instanceof C7CG) && (str = ((C7CG) abstractC160207Gg).A07) != null) {
            sb = new StringBuilder();
            sb.append(str);
        } else {
            sb = new StringBuilder();
            sb.append(abstractC160207Gg.A02().A00);
        }
        sb.append(" text entry");
        return sb.toString();
    }

    public C159957Fh(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC83713oG interfaceC83713oG, InterfaceC08830cm interfaceC08830cm) {
        this.A00 = new C159967Fi(interfaceC11380iw, userSession, interfaceC83713oG, interfaceC08830cm);
    }
}
