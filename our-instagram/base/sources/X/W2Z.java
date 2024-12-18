package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class W2Z {
    public final C25531Mh A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    public W2Z(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = AbstractC09440dt.A01(new X31(this, 5));
        C17050sx A01 = AbstractC09440dt.A01(new X31(this, 4));
        this.A02 = A01;
        C18920wW c18920wW = (C18920wW) A01.getValue();
        this.A00 = new C25531Mh(c18920wW.A00(c18920wW.A00, "fulcrum_event"), 156);
    }

    public static final C006802i A00(W2Z w2z) {
        return (C006802i) AbstractC166987dD.A17(w2z.A03);
    }
}
