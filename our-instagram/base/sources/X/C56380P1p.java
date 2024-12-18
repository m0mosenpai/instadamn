package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.P1p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56380P1p implements GXZ {
    public final /* synthetic */ C9J0 A00;
    public final /* synthetic */ N5T A01;

    public C56380P1p(C9J0 c9j0, N5T n5t) {
        this.A01 = n5t;
        this.A00 = c9j0;
    }

    @Override // X.GXZ
    public final void Ehy(List list, String str) {
        N5T n5t = this.A01;
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(n5t.A0E);
        C9J0 c9j0 = this.A00;
        OVo oVo = new OVo(n5t.requireActivity(), AbstractC018607g.A00(n5t.requireActivity()), AbstractC166987dD.A0r(n5t.A0I));
        Context requireContext = n5t.requireContext();
        FragmentActivity requireActivity = n5t.requireActivity();
        AbstractC166987dD.A1Z(new C57163PZh(A0Z, c9j0, oVo, requireContext, requireActivity, list, str, null, 2), AbstractC141776au.A00(A0Z));
        C9GR.A07(n5t.requireContext(), 2131973315);
    }
}
