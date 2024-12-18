package X;

import com.facebook.R;

/* loaded from: classes7.dex */
public final class HDY extends AbstractC193068gm {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C146026hz A01;

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        C14360o3.A0B(abstractC115105If, 0);
        this.A01.A03.EJJ();
        Throwable A01 = abstractC115105If.A01();
        String A00 = AbstractC111324zv.A00(57);
        if (A01 != null) {
            C0w9.A06("ReelViewerFragment#openBloks", A00, A01);
        } else {
            C0w9.A03("ReelViewerFragment#openBloks", A00);
        }
    }

    public HDY(C41181vS c41181vS, C146026hz c146026hz) {
        this.A01 = c146026hz;
        this.A00 = c41181vS;
    }

    @Override // X.AbstractC192848gQ
    public final void A01() {
        this.A01.A00 = false;
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q c66246U5q = (C66246U5q) obj;
        C14360o3.A0B(c66246U5q, 0);
        C146026hz c146026hz = this.A01;
        AbstractC59962oe abstractC59962oe = c146026hz.A01;
        AbstractC10360h2 abstractC10360h2 = abstractC59962oe.mFragmentManager;
        if (!C06P.A00(abstractC10360h2) && C06P.A01(abstractC10360h2)) {
            C41181vS c41181vS = this.A00;
            C62862tP A03 = C62862tP.A03(abstractC59962oe, c146026hz.A02, null);
            if (c41181vS != null) {
                A03.A01.put(R.id.open_share_sheet_handler, new C42564Isi(c41181vS, c146026hz));
            }
            AbstractC33787EwD.A00(A03, c66246U5q);
        }
    }
}
