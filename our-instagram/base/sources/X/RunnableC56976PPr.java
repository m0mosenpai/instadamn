package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.PPr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56976PPr implements Runnable {
    public final /* synthetic */ MediaCaptureActivity A00;
    public final /* synthetic */ boolean A01;

    public RunnableC56976PPr(MediaCaptureActivity mediaCaptureActivity, boolean z) {
        this.A00 = mediaCaptureActivity;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        MediaCaptureActivity mediaCaptureActivity = this.A00;
        if (MX5.A00(mediaCaptureActivity).A0C != null) {
            z = this.A01;
            C47Z A03 = C25A.A00(mediaCaptureActivity.A04).A03(MX5.A00(mediaCaptureActivity).A0C);
            if (A03 != null && !A03.A5S) {
                mediaCaptureActivity.Di2(z);
                return;
            }
        } else {
            C47Z A032 = C25A.A00(mediaCaptureActivity.A04).A03(MSX.A0L(mediaCaptureActivity).E3z());
            if (A032 == null) {
                return;
            }
            A032.A13.A00((MediaUploadMetadata) O00.A00.get(A032.A3L));
            if (A032.A11()) {
                return;
            }
            z = this.A01;
            if (A032.A5U && A032.A3Z != null && A032.A33 != null) {
                mediaCaptureActivity.AIe();
            } else {
                MX1.A01(mediaCaptureActivity.A04).A05(mediaCaptureActivity.A01);
                A032.A0P(System.currentTimeMillis());
                if (AbstractC50722MaN.A00(mediaCaptureActivity.A04)) {
                    Fragment A0Q = mediaCaptureActivity.getSupportFragmentManager().A0Q("MediaCaptureActivity");
                    if (A0Q instanceof C50724MaP) {
                        C50724MaP c50724MaP = (C50724MaP) A0Q;
                        c50724MaP.A0D();
                        C50724MaP.A01(c50724MaP).A07(c50724MaP.requireContext(), c50724MaP.A0D, c50724MaP.A0S, "MediaCaptureActivity");
                    }
                }
                AnonymousClass841 A0L = MSX.A0L(mediaCaptureActivity);
                UserSession userSession = mediaCaptureActivity.A04;
                CreationSession creationSession = ((MX5) A0L).A01;
                PhotoSession A02 = creationSession.A02();
                MXB mxb = mediaCaptureActivity.A07;
                mxb.getClass();
                FilterGroupModel filterGroupModel = null;
                P07 p07 = new P07(mediaCaptureActivity, userSession, new C56211OxK(mediaCaptureActivity, A032, z), A02, mxb, A0L, mediaCaptureActivity, creationSession.A09, mediaCaptureActivity, null, creationSession.A02);
                PhotoSession A022 = MX5.A00(mediaCaptureActivity).A02();
                if (A022 != null) {
                    filterGroupModel = A022.A07;
                }
                boolean z2 = true;
                if (mediaCaptureActivity.Bmb(MSX.A0L(mediaCaptureActivity).E4J()).Co2(p07, filterGroupModel, new EnumC53116NeT[]{EnumC53116NeT.A03}, false)) {
                    MXB mxb2 = mediaCaptureActivity.A07;
                    mxb2.getClass();
                    mxb2.A0A(null, C05F.A01);
                    AnonymousClass229.A01(mediaCaptureActivity.A04).A22(A032.A2e, false);
                    return;
                }
                MX1.A01(mediaCaptureActivity.A04).A08("savePhotoDraft(exitCreationFlowAfterSave): final render request failed");
                C9GR.A01(mediaCaptureActivity, "unable_to_save_image", 2131976048, 0);
                boolean A1W = AbstractC167007dF.A1W(filterGroupModel);
                boolean A1W2 = AbstractC167007dF.A1W(A032.A33);
                if (A032.A3Z == null) {
                    z2 = false;
                }
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append(" Has FilterGroup: ");
                A1C.append(A1W);
                A1C.append(" Has ImageFilePath: ");
                A1C.append(A1W2);
                A1C.append(" Has Original photo: ");
                A1C.append(z2);
                AbstractC12120kG.A01("MediaCaptureActivity_SaveDraftFailure", A1C.toString());
                return;
            }
        }
        mediaCaptureActivity.runOnUiThread(new RunnableC56977PPs(mediaCaptureActivity, z));
    }
}
