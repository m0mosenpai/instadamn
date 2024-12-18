package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes7.dex */
public final class HJB extends C3PD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C42090Ikx A01;
    public final /* synthetic */ C79853ha A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ IGU A04;

    public HJB(C42090Ikx c42090Ikx, C79853ha c79853ha, C38321qM c38321qM, IGU igu, int i) {
        this.A02 = c79853ha;
        this.A04 = igu;
        this.A03 = c38321qM;
        this.A01 = c42090Ikx;
        this.A00 = i;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        FragmentActivity activity;
        C3DN A0r;
        C79853ha c79853ha = this.A02;
        IGU igu = this.A04;
        if (C79853ha.A01(this.A03, igu.A01) && (activity = c79853ha.A00.getActivity()) != null && (A0r = AbstractC31172DnG.A0r(activity)) != null) {
            ((C3DP) A0r).A0H = new C43026J0r(this.A01, igu, this.A00);
            A0r.A0B();
            return true;
        }
        return true;
    }
}
