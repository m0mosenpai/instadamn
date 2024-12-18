package X;

import android.app.Activity;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;

/* renamed from: X.FtX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35913FtX implements XCH {
    public final Activity A00;
    public final Fragment A01;
    public final UserSession A02;
    public final ClipsCelebrationReshareViewModel A03;
    public final C38321qM A04;

    @Override // X.XCH
    public final void CJl() {
    }

    @Override // X.XCH
    public final void CKJ() {
        Fragment fragment = this.A01;
        int A0A = AbstractC13880nE.A0A(fragment.requireContext());
        int A09 = AbstractC13880nE.A09(fragment.requireContext());
        float f = A0A;
        float f2 = A09;
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        UserSession userSession = this.A02;
        C69753Bj c69753Bj = new C69753Bj(userSession);
        rectF.offsetTo(0.0f, f2);
        if (C18U.A06(C06090Tz.A05, userSession, 36316697266819694L)) {
            C34726FRp A07 = C28531Zo.A04.A02.A07(c69753Bj, userSession, C2EY.A1F);
            String id = this.A04.getId();
            if (id != null) {
                A07.A06(id);
                A07.A07.putParcelable("DirectShareSheetConstants.clips_celebration_reshare_view_model", this.A03);
                AbstractC31176DnK.A0x(this.A00, A07.A00(), C3DN.A00);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        AbstractC35183Ffa.A00(this.A00, rectF, rectF, C22P.A2o, userSession, null, this.A03, this.A04, null, AbstractC111324zv.A00(791), null, 0, false);
    }

    public C35913FtX(Activity activity, Fragment fragment, UserSession userSession, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, C38321qM c38321qM) {
        this.A02 = userSession;
        this.A01 = fragment;
        this.A00 = activity;
        this.A04 = c38321qM;
        this.A03 = clipsCelebrationReshareViewModel;
    }
}
