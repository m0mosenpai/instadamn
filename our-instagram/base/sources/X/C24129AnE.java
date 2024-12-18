package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.AnE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24129AnE implements C7XU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ C189478aR A03;
    public final /* synthetic */ C7XU A04;
    public final /* synthetic */ C3DN A05;

    public C24129AnE(Context context, Context context2, Fragment fragment, C189478aR c189478aR, C7XU c7xu, C3DN c3dn) {
        this.A04 = c7xu;
        this.A03 = c189478aR;
        this.A00 = context;
        this.A01 = context2;
        this.A02 = fragment;
        this.A05 = c3dn;
    }

    @Override // X.C7XU
    public final void DAy() {
        C189478aR.A00(this.A00, this.A01, this.A02, this.A03, this.A05);
    }

    @Override // X.C7XU
    public final void DB3() {
        C7XU c7xu = this.A04;
        if (c7xu != null) {
            c7xu.DB3();
        }
    }
}
