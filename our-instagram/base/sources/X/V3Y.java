package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V3Y extends C1P1 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C36981nv A01;

    public V3Y(UserSession userSession, C36981nv c36981nv) {
        this.A01 = c36981nv;
        this.A00 = userSession;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1197440087);
        C2044693f c2044693f = (C2044693f) obj;
        int A0N = AbstractC167017dG.A0N(c2044693f, -1464905278);
        C36981nv.A00(null, this.A00, this.A01, c2044693f);
        C0f9.A0A(1742187767, A0N);
        C0f9.A0A(1767890555, A03);
    }
}
