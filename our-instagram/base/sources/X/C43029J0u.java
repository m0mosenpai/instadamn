package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.DexOptimization;

/* renamed from: X.J0u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43029J0u implements C7XU {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ EnumC37319GcL A01;
    public final /* synthetic */ C50674MYs A02;
    public final /* synthetic */ C153936w2 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    @Override // X.C7XU
    public final void DB3() {
    }

    public C43029J0u(FragmentActivity fragmentActivity, EnumC37319GcL enumC37319GcL, C50674MYs c50674MYs, C153936w2 c153936w2, String str, String str2) {
        this.A03 = c153936w2;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = enumC37319GcL;
        this.A02 = c50674MYs;
        this.A00 = fragmentActivity;
    }

    @Override // X.C7XU
    public final void DAy() {
        C153936w2.A04(C153936w2.A02(this.A01, this.A05), this.A03, DexOptimization.OPT_KEY_CLIENT, "pre_reveal_action_sheet", "impression", this.A04, null);
        new C31727DwY(this.A02).A05(this.A00);
    }
}
