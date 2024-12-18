package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.V3i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67943V3i extends C1P1 {
    public final /* synthetic */ InterfaceC1116050z A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C36981nv A02;

    public C67943V3i(InterfaceC1116050z interfaceC1116050z, UserSession userSession, C36981nv c36981nv) {
        this.A02 = c36981nv;
        this.A01 = userSession;
        this.A00 = interfaceC1116050z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-604010279);
        InterfaceC1116050z interfaceC1116050z = this.A00;
        if (interfaceC1116050z != null) {
            interfaceC1116050z.AVi("explore_popular_background_prefetch");
        }
        C0f9.A0A(-2083658198, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1384737682);
        C2044693f c2044693f = (C2044693f) obj;
        int A0N = AbstractC167017dG.A0N(c2044693f, -1184254646);
        C36981nv c36981nv = this.A02;
        C36981nv.A00(this.A00, this.A01, c36981nv, c2044693f);
        C0f9.A0A(1159186887, A0N);
        C0f9.A0A(1335049634, A03);
    }
}
