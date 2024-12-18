package X;

import com.instagram.reels.store.ReelStore;

/* loaded from: classes6.dex */
public final class ESP extends C1P1 {
    public final /* synthetic */ C35126FeT A00;

    public ESP(C35126FeT c35126FeT) {
        this.A00 = c35126FeT;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1178689389);
        int A032 = C0f9.A03(1002049526);
        C35126FeT c35126FeT = this.A00;
        ReelStore A04 = C1OU.A04(c35126FeT.A00);
        C37771pE c37771pE = ((EBB) obj).A00;
        c37771pE.getClass();
        String id = A04.A0I(c37771pE, true).getId();
        c35126FeT.A04.add(id);
        C38321qM c38321qM = c35126FeT.A01;
        c38321qM.getClass();
        c38321qM.A4N(id);
        C0f9.A0A(837831229, A032);
        C0f9.A0A(-608250807, A03);
    }
}
