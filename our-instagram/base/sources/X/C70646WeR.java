package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;

/* renamed from: X.WeR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70646WeR implements XCN {
    public final /* synthetic */ V10 A00;

    public C70646WeR(V10 v10) {
        this.A00 = v10;
    }

    @Override // X.XCN
    public final void Cs8(Fragment fragment) {
        V10 v10 = this.A00;
        if (v10.getActivity() != null) {
            FragmentActivity requireActivity = v10.requireActivity();
            PromoteData promoteData = v10.A0A;
            if (promoteData == null) {
                C14360o3.A0F("promoteData");
                throw C00O.createAndThrow();
            }
            AbstractC31177DnL.A16(fragment, requireActivity, promoteData.A0y);
        }
    }

    @Override // X.XCN
    public final void Czv() {
        V10.A02(this.A00);
    }
}
