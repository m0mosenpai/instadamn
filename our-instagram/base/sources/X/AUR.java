package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;

/* loaded from: classes4.dex */
public final class AUR implements InterfaceC58362lv {
    public final /* synthetic */ C189588ad A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public AUR(C189588ad c189588ad, boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = c189588ad;
        this.A02 = z2;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C9BW c9bw = (C9BW) obj;
        C14360o3.A0B(c9bw, 0);
        if (this.A01) {
            ((ClipsCreationDraftViewModel) this.A00.A0J.getValue()).A0B();
            return;
        }
        if (this.A02) {
            return;
        }
        try {
            AKF akf = AKF.A00;
            C189588ad c189588ad = this.A00;
            Context requireContext = c189588ad.requireContext();
            UserSession session = c189588ad.getSession();
            Bitmap bitmap = (Bitmap) c9bw.A01;
            ClipsCreationDraftViewModel clipsCreationDraftViewModel = (ClipsCreationDraftViewModel) c189588ad.A0J.getValue();
            C5JK c5jk = C5JK.A05;
            AnonymousClass840 anonymousClass840 = c189588ad.A0A;
            if (anonymousClass840 == null) {
                C14360o3.A0F("_cameraSession");
                throw C00O.createAndThrow();
            }
            C0fJ.A00(akf.A01(requireContext, bitmap, session, clipsCreationDraftViewModel, c5jk, anonymousClass840.A02.A01.A0j, new MHQ(c189588ad, 37)));
        } catch (NullPointerException e) {
            AbstractC12120kG.A0I(C189588ad.__redex_internal_original_name, e, AbstractC06930Yk.A0E());
        }
    }
}
