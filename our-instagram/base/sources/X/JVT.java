package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JVT extends AbstractC161727Mh {
    public static final InterfaceC09390do A06 = AbstractC09440dt.A01(MG3.A00);
    public final UserSession A00;
    public final JVS A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;
    public final InterfaceC09390do A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JVT(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C7ZX c7zx, AnonymousClass988 anonymousClass988, C7IM c7im, C163357Sy c163357Sy, C7T2 c7t2) {
        super(c163357Sy.createViewHolder(layoutInflater, viewGroup), c163357Sy, c7zx);
        AbstractC167007dF.A1I(c163357Sy, 3, c7t2);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        C17050sx A01 = C50252MHh.A01(this, 29);
        this.A05 = A01;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new JVS(new C47649L2i(AbstractC37301Gc2.A03(this), userSession, c7t2, A01));
    }

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        JVS jvs = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return jvs.AWm(A03, userSession, this.A02, c160787Im, this.A03, c18a, false);
    }
}
