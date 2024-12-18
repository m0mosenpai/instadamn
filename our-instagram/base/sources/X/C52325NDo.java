package X;

import com.instagram.common.session.UserSession;
import com.instagram.trials.model.TrialMetricsData;
import com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl;
import com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel;

/* renamed from: X.NDo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52325NDo extends AbstractC61132qb {
    public final EnumC37319GcL A00;
    public final UserSession A01;
    public final TrialMetricsData A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        ClipsTrialBottomSheetRepositoryImpl clipsTrialBottomSheetRepositoryImpl = new ClipsTrialBottomSheetRepositoryImpl(userSession);
        String str = this.A03;
        String str2 = this.A06;
        C153936w2 A01 = AbstractC153926w1.A01(AbstractC31171DnF.A0D(this.A04), userSession, str2);
        boolean z = this.A08;
        String str3 = this.A05;
        EnumC37319GcL enumC37319GcL = this.A00;
        boolean z2 = this.A07;
        return new ClipsTrialBottomSheetViewModel(enumC37319GcL, new C54482O5k(userSession), AbstractC153926w1.A00(userSession), A01, this.A02, clipsTrialBottomSheetRepositoryImpl, str, str2, str3, z, z2, this.A09);
    }

    public C52325NDo(EnumC37319GcL enumC37319GcL, UserSession userSession, TrialMetricsData trialMetricsData, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        MSZ.A1O(userSession, str3);
        this.A01 = userSession;
        this.A03 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A08 = z;
        this.A05 = str4;
        this.A00 = enumC37319GcL;
        this.A07 = z2;
        this.A02 = trialMetricsData;
        this.A09 = z3;
    }
}
