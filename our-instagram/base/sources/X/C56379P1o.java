package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import java.util.List;

/* renamed from: X.P1o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56379P1o implements GXZ {
    public final /* synthetic */ N6J A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public C56379P1o(N6J n6j, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = n6j;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.GXZ
    public final void Ehy(List list, String str) {
        N6J n6j = this.A00;
        C47Z A04 = NJR.A04(n6j);
        if (A04 != null) {
            InterfaceC16820sZ interfaceC16820sZ = this.A01;
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(n6j.A0R);
            Context requireContext = n6j.requireContext();
            FragmentActivity requireActivity = n6j.requireActivity();
            C128175qm A00 = ClipsSharingDraftViewModel.A00(n6j);
            AbstractC166987dD.A1Z(new PXy(requireContext, requireActivity, A0Z, A04, list, A00, str, null, 1), AbstractC141776au.A00(A0Z));
            interfaceC16820sZ.invoke();
        }
    }
}
