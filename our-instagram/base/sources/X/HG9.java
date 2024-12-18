package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.save.model.SavedCollection;

/* loaded from: classes7.dex */
public final class HG9 extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Fragment A03;
    public final /* synthetic */ C38321qM A04;
    public final /* synthetic */ C41645Ibb A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(618237224);
        SavedCollection savedCollection = (SavedCollection) obj;
        int A032 = C0f9.A03(-695971953);
        C41645Ibb c41645Ibb = this.A05;
        c41645Ibb.A01.E4s(new C36117Fwr(savedCollection, C05F.A00));
        c41645Ibb.A02(this.A03, this.A04, savedCollection, null, this.A00, this.A01);
        InterfaceC60442pS interfaceC60442pS = c41645Ibb.A03;
        interfaceC60442pS.getClass();
        AbstractC41756IeX.A03(interfaceC60442pS, c41645Ibb.A02, savedCollection, this.A07, this.A02);
        C0f9.A0A(-895490198, A032);
        C0f9.A0A(1610280275, A03);
    }

    public HG9(Fragment fragment, C38321qM c38321qM, C41645Ibb c41645Ibb, String str, String str2, int i, int i2, int i3) {
        this.A05 = c41645Ibb;
        this.A04 = c38321qM;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = fragment;
        this.A07 = str;
        this.A02 = i3;
        this.A06 = str2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1436802516);
        C41645Ibb c41645Ibb = this.A05;
        String str = this.A06;
        FragmentActivity fragmentActivity = c41645Ibb.A00;
        C9GR.A03(fragmentActivity, AbstractC166997dE.A0r(fragmentActivity.getResources(), str, 2131956945), "create_collection_failure_notification", 1);
        C0f9.A0A(1405036630, A03);
    }
}
