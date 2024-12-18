package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.GDx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36651GDx implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String A12 = AbstractC31172DnG.A12(uri);
        if (A12 == null) {
            A12 = "megaphone";
        }
        FragmentActivity fragmentActivity = this.A00;
        boolean A1W = AbstractC167007dF.A1W(fragmentActivity.findViewById(R.id.layout_container_main));
        FVS.A01();
        UserSession userSession = this.A01;
        Integer num = C05F.A01;
        if (A1W) {
            FVS.A01();
            Bundle A00 = FVT.A00(userSession, num, A12, A1W);
            EfA efA = new EfA();
            efA.setArguments(A00);
            C140966Yy A0N = AbstractC31174DnI.A0N(efA, fragmentActivity, userSession);
            A0N.A0A = "GDPR.Fragment.Entrance";
            A0N.A0G = true;
            A0N.A04();
            return;
        }
        if (AbstractC03270Dk.A02(userSession) != null) {
            AbstractC25228BEl.A1G(fragmentActivity, FVT.A00(userSession, num, A12, A1W), userSession, ModalActivity.class, "gdpr_consent");
            return;
        }
        throw AbstractC166987dD.A14("Must call setUserId() with non-null userId first");
    }

    public C36651GDx(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
