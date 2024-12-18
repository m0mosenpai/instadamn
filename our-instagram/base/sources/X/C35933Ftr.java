package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* renamed from: X.Ftr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35933Ftr implements InterfaceC43400JFp {
    public final /* synthetic */ C33171EkI A00;

    public C35933Ftr(C33171EkI c33171EkI) {
        this.A00 = c33171EkI;
    }

    @Override // X.InterfaceC43400JFp
    public final void DlB(boolean z) {
        C33171EkI c33171EkI = this.A00;
        FragmentActivity fragmentActivity = (FragmentActivity) c33171EkI.A02;
        DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) c33171EkI.A01;
        UserSession userSession = directShareSheetFragment.A0H;
        String str = directShareSheetFragment.A18;
        if (str == null) {
            str = "";
        }
        String str2 = directShareSheetFragment.A0y;
        C38321qM c38321qM = directShareSheetFragment.A0d;
        c38321qM.getClass();
        C55220Oej.A00.A09(fragmentActivity, userSession, c38321qM, directShareSheetFragment, directShareSheetFragment.A0e, str, str2, z);
    }
}
