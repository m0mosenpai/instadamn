package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.K5r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45358K5r extends UDB {
    public C18920wW A00;
    public C47954LGp A01;
    public LEO A02;
    public Integer A03;
    public UserSession A04;
    public C2DS A05;
    public final C41761wQ A06 = AbstractC31174DnI.A0S();

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ea  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45358K5r.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C0SG
    public final int A0E() {
        return R.style.ExternalShareSheetDialogTheme;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(96840137);
        super.onCreate(bundle);
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A04 = A0S;
        if (A0S != null) {
            this.A05 = C2JD.A00(A0S);
            Context A0O = AbstractC166987dD.A0O(requireContext());
            UserSession userSession = this.A04;
            if (userSession != null) {
                this.A01 = AbstractC46924Kp5.A00(A0O, userSession);
                UserSession userSession2 = this.A04;
                if (userSession2 != null) {
                    this.A02 = new LEO(userSession2);
                    UserSession userSession3 = this.A04;
                    if (userSession3 != null) {
                        this.A00 = AbstractC12220kQ.A02(userSession3);
                        C0f9.A09(1390128649, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1489578824);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.external_share_bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(259944102, A02);
        return inflate;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1846238642);
        super.onDestroyView();
        this.A06.A01();
        C0f9.A09(1029053688, A02);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(490949319);
        super.onStop();
        Dialog dialog = super.A01;
        if (dialog != null) {
            dialog.dismiss();
        }
        C0f9.A09(1525830226, A02);
    }
}
