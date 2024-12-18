package X;

import com.google.common.collect.ImmutableList;

/* loaded from: classes8.dex */
public final class L83 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImmutableList A01;
    public final /* synthetic */ ImmutableList A02;
    public final /* synthetic */ C1346766r A03;
    public final /* synthetic */ C47914LEi A04;
    public final /* synthetic */ L94 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public L83(ImmutableList immutableList, ImmutableList immutableList2, C1346766r c1346766r, C47914LEi c47914LEi, L94 l94, String str, String str2, int i) {
        this.A05 = l94;
        this.A00 = i;
        this.A04 = c47914LEi;
        this.A01 = immutableList;
        this.A06 = str;
        this.A07 = str2;
        this.A02 = immutableList2;
        this.A03 = c1346766r;
    }

    public final void A00(Throwable th) {
        L94 l94 = this.A05;
        if (l94 != null) {
            l94.A01.markerPoint(20132336, l94.A00, "deidentified_request_params_fetch_failure");
        }
        C1346766r c1346766r = this.A03;
        C14360o3.A0A(c1346766r);
        C14360o3.A0A(this.A02);
        if (l94 != null) {
            l94.A00("failed");
            l94.A01("fetch failed", null);
        }
        th.getMessage();
        C48496Lcn.A01(c1346766r, th.getMessage());
        c1346766r.A00();
    }
}
