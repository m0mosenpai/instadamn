package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Inv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42271Inv implements InterfaceC41501vz {
    public final AbstractC12990ll A00;
    public final String A01;
    public final String A02;
    public final WeakReference A03;

    public C42271Inv(AnonymousClass630 anonymousClass630, AbstractC12990ll abstractC12990ll, String str, String str2) {
        C14360o3.A0B(str2, 4);
        this.A00 = abstractC12990ll;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = AbstractC25225BEi.A16(anonymousClass630);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1134397147);
        C57452kK c57452kK = (C57452kK) obj;
        int A032 = C0f9.A03(-1615561305);
        C14360o3.A0B(c57452kK, 0);
        AnonymousClass630 anonymousClass630 = (AnonymousClass630) this.A03.get();
        if (anonymousClass630 == null) {
            AbstractC25651Mw.A00(this.A00).A02(this, C57452kK.class);
        } else {
            C38321qM c38321qM = c57452kK.A00;
            if (AbstractC002300n.A0g(c38321qM.getId(), this.A01, false)) {
                AnonymousClass630.A03(new J5F(anonymousClass630, HxB.A00(c38321qM), this.A02));
            }
        }
        C0f9.A0A(-2015625496, A032);
        C0f9.A0A(10810100, A03);
    }
}
