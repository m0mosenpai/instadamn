package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36668GEo implements GYB {
    public final Context A00;
    public final FragmentActivity A01;
    public final AbstractC018607g A02;
    public final UserSession A03;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C25621Ms A0M = AbstractC31173DnH.A0M(this.A03);
        A0M.A0B("notifications/set_message_only_push_notifs/");
        A0M.A0S(C40781ul.class, C55702hA.class);
        C1ON A0U = AbstractC31172DnG.A0U(A0M, true);
        C31702Dw7.A01(A0U, this, 28);
        Context context = this.A00;
        C1GJ.A00(context, this.A02, A0U);
        Boolean A00 = AbstractC47112Ed.A00(context, EnumC47122Ee.A08, true);
        if (A00 != null && !A00.booleanValue()) {
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(2131961116);
            A0I.A09(2131961115);
            DialogInterfaceOnClickListenerC35454FkB.A02(A0I, this, 55, 2131963271);
            AbstractC31176DnK.A16(null, A0I, 2131968687);
        }
    }

    public C36668GEo(Fragment fragment, UserSession userSession) {
        this.A03 = userSession;
        Context requireContext = fragment.requireContext();
        this.A00 = requireContext;
        this.A02 = AbstractC018607g.A00(fragment);
        this.A01 = (FragmentActivity) AbstractC13320mI.A00(requireContext, FragmentActivity.class);
    }
}
