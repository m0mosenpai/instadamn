package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6CG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CG {
    public final UserSession A00;
    public final InterfaceC19630xq A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EW(this, 28));

    public static final void A00(C6CG c6cg, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4) {
        C6CH c6ch = (C6CH) c6cg.A02.getValue();
        if (!c6ch.A00) {
            c6ch.A00 = true;
            C006802i c006802i = c6ch.A01;
            c006802i.markerAnnotate(724764879, "MC_VALUE", C6CH.A00(Boolean.valueOf(z)));
            c006802i.markerAnnotate(724764879, "STORED_VALUE", C6CH.A00(bool));
            c006802i.markerAnnotate(724764879, "LOGIN_BIT", C6CH.A00(Boolean.valueOf(z2)));
            c006802i.markerAnnotate(724764879, "KILLSWITCH_VALUE", C6CH.A00(Boolean.valueOf(z3)));
            c006802i.markerAnnotate(724764879, "RESULT", C6CH.A00(Boolean.valueOf(z4)));
            c006802i.markerEnd(724764879, (short) 2);
        }
    }

    public C6CG(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = C1AT.A01(userSession).A04(C1AV.A3X, getClass());
    }
}
