package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Cvc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29281Cvc implements GZ7 {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C148516mM A01;
    public final /* synthetic */ String A02;

    public C29281Cvc(Fragment fragment, C148516mM c148516mM, String str) {
        this.A01 = c148516mM;
        this.A00 = fragment;
        this.A02 = str;
    }

    @Override // X.GZ7
    public final void Dpv(C38321qM c38321qM) {
        C28422CgU.A01(this.A00.getActivity(), this.A01.A00, c38321qM, this.A02);
    }

    @Override // X.GZ7
    public final void onFail(String str) {
        C0w9.A03(AbstractC111324zv.A00(3733), "Failed to fetch comment share sticker original media");
    }
}
