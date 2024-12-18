package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HDT extends C69503VpY {
    public final int A00;
    public final Object A01;

    public HDT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C69503VpY
    public final void A00(UserSession userSession) {
        switch (this.A00) {
            case 0:
                AbstractC167007dF.A0J().postDelayed(new RunnableC36805GKe((C32301EKo) this.A01), 200L);
                return;
            case 1:
                ((C148146lk) this.A01).A0c.invoke();
                return;
            default:
                IDX idx = (IDX) this.A01;
                if (idx != null) {
                    idx.A00.A0A.CvG();
                    return;
                }
                return;
        }
    }
}
