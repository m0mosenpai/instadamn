package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.Ahj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23890Ahj implements InterfaceC50450MPe {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C22P A01;
    public final /* synthetic */ C9JS A02;
    public final /* synthetic */ ClipsCreationDraftViewModel A03;

    public C23890Ahj(FragmentActivity fragmentActivity, C22P c22p, C9JS c9js, ClipsCreationDraftViewModel clipsCreationDraftViewModel) {
        this.A03 = clipsCreationDraftViewModel;
        this.A00 = fragmentActivity;
        this.A01 = c22p;
        this.A02 = c9js;
    }

    @Override // X.InterfaceC50450MPe
    public final void D9U() {
        this.A03.A0B();
    }

    @Override // X.InterfaceC50450MPe
    public final void Dej(C38321qM c38321qM) {
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A03;
        AbstractC166987dD.A1Z(new PYv(clipsCreationDraftViewModel, null, 8), AbstractC141776au.A00(clipsCreationDraftViewModel));
        UserSession userSession = clipsCreationDraftViewModel.A0D;
        FragmentActivity fragmentActivity = this.A00;
        Context context = clipsCreationDraftViewModel.A04;
        C22P c22p = this.A01;
        C9JS c9js = this.A02;
        C37855Gl9 c37855Gl9 = C37855Gl9.A00;
        INH A0C = AbstractC86593tX.A0C(c22p);
        c37855Gl9.A0G(fragmentActivity, c9js, c38321qM, A0C);
        A0C.A0q = true;
        C6XJ.A02(fragmentActivity, A0C.A00(), userSession, TransparentModalActivity.class, "clips_camera").A0C(context);
        if (fragmentActivity instanceof ModalActivity) {
            ((ModalActivity) fragmentActivity).finish();
        }
    }
}
