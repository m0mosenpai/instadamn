package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.GUy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37064GUy extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ EMG A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37064GUy(FragmentActivity fragmentActivity, EMG emg, C38321qM c38321qM, Integer num, String str, int i) {
        super(1);
        this.A02 = emg;
        this.A03 = c38321qM;
        this.A00 = i;
        this.A04 = num;
        this.A01 = fragmentActivity;
        this.A05 = str;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SavedCollection savedCollection = (SavedCollection) obj;
        C14360o3.A0B(savedCollection, 0);
        EMG emg = this.A02;
        InterfaceC09390do interfaceC09390do = emg.A0M;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C38321qM c38321qM = this.A03;
        int i = this.A00;
        Integer num = this.A04;
        AbstractC35273Fh8.A07(A0r, c38321qM, savedCollection, num, i);
        FragmentActivity fragmentActivity = this.A01;
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        String A15 = AbstractC25225BEi.A15(emg.A0N);
        String str = emg.A0E;
        AbstractC167007dF.A1H(A0r2, 5, str);
        G95 g95 = new G95(fragmentActivity, A0r2, c38321qM, emg, savedCollection, A15, str, i);
        ImageUrl A1S = c38321qM.A1S();
        if (A1S != null) {
            String str2 = savedCollection.A0G;
            String str3 = this.A05;
            boolean A1X = AbstractC167007dF.A1X(num, C05F.A00);
            emg.A08();
            EnumC33416Epn enumC33416Epn = savedCollection.A07;
            C14360o3.A07(enumC33416Epn);
            AbstractC35236FgV.A00(fragmentActivity, A1S, g95, enumC33416Epn, str2, str3, true, A1X, false);
            return C0eB.A00;
        }
        throw AbstractC166997dE.A0g();
    }
}
