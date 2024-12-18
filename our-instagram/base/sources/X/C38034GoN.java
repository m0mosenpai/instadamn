package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.GoN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38034GoN extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C62862tP A01;
    public final /* synthetic */ C61142qc A02;
    public final /* synthetic */ C1M1 A03;
    public final /* synthetic */ C37432GeC A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38034GoN(FragmentActivity fragmentActivity, C62862tP c62862tP, C61142qc c61142qc, C1M1 c1m1, C37432GeC c37432GeC, Integer num, boolean z, boolean z2, boolean z3) {
        super(0);
        this.A04 = c37432GeC;
        this.A01 = c62862tP;
        this.A00 = fragmentActivity;
        this.A02 = c61142qc;
        this.A08 = z;
        this.A05 = num;
        this.A06 = z2;
        this.A07 = z3;
        this.A03 = c1m1;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C37432GeC c37432GeC = this.A04;
        if (!c37432GeC.A0H) {
            C62862tP c62862tP = this.A01;
            FragmentActivity fragmentActivity = this.A00;
            Fragment fragment = c37432GeC.A04;
            C61142qc c61142qc = this.A02;
            boolean z = this.A08;
            Integer num = this.A05;
            boolean z2 = this.A06;
            C60972qL c60972qL = c37432GeC.A07;
            boolean z3 = this.A07;
            String str = c37432GeC.A0B;
            C1M1 c1m1 = this.A03;
            SearchContext searchContext = c37432GeC.A0A;
            AbstractC25229BEm.A1J(fragment, 3, c60972qL);
            return new C37443GeN(fragmentActivity, fragment, c62862tP, null, null, c61142qc, null, c60972qL, null, C57332k8.A0m.A00(c60972qL.A00, c60972qL.A01), searchContext, c1m1, num, C05F.A0C, str, z, true, z2, false, false, false, z3);
        }
        return null;
    }
}
