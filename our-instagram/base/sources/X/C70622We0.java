package X;

import android.os.Bundle;

/* renamed from: X.We0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70622We0 implements XCJ {
    public final /* synthetic */ C31250DoY A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    @Override // X.XCJ
    public final void DFf() {
    }

    public C70622We0(C31250DoY c31250DoY, String str, String str2) {
        this.A00 = c31250DoY;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.XCJ
    public final void DqC(String str) {
        C31250DoY c31250DoY = this.A00;
        C140966Yy c140966Yy = new C140966Yy(c31250DoY.A05, c31250DoY.A0A);
        AbstractC65702TsY.A0q();
        String str2 = this.A02;
        String str3 = this.A01;
        AbstractC167017dG.A1N(str2, str);
        Bundle bundle = new Bundle();
        bundle.putString("media_id", str2);
        bundle.putString("access_token", str);
        bundle.putString("ad_account_id", str3);
        V0s v0s = new V0s();
        v0s.setArguments(bundle);
        c140966Yy.A0E(v0s);
        c140966Yy.A04();
    }
}
