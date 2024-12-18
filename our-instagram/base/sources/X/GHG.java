package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class GHG implements C7XU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ C19260xA A03;
    public final /* synthetic */ C3DP A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ boolean A06;

    public GHG(Fragment fragment, C19260xA c19260xA, C3DP c3dp, Integer num, int i, int i2, boolean z) {
        this.A04 = c3dp;
        this.A02 = fragment;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = z;
        this.A05 = num;
        this.A03 = c19260xA;
    }

    @Override // X.C7XU
    public final void DAy() {
        C3DP c3dp = this.A04;
        Fragment fragment = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A06;
        c3dp.A0M(fragment, this.A03, this.A05, i, i2, z);
    }

    @Override // X.C7XU
    public final void DB3() {
        C7XU c7xu = this.A04.A0H;
        if (c7xu != null) {
            c7xu.DB3();
        }
    }
}
