package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lmr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49065Lmr implements InterfaceC50432MOm {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ JV2 A02;

    public C49065Lmr(InterfaceC11380iw interfaceC11380iw, UserSession userSession, JV2 jv2) {
        this.A02 = jv2;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC50432MOm
    public final void D6U(Object obj) {
        C14360o3.A0B(obj, 0);
        JV2 jv2 = this.A02;
        jv2.A00 = null;
        C7TA.A00(this.A00, this.A01, jv2, (String) obj);
    }
}
