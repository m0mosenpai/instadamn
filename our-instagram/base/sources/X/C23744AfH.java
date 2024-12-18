package X;

import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.R;

/* renamed from: X.AfH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23744AfH implements InterfaceC25179BCc {
    public final /* synthetic */ C214869fO A00;
    public final /* synthetic */ C23786Afx A01;

    @Override // X.InterfaceC25179BCc
    public final void Dx6(C55U c55u) {
        View view;
        C14360o3.A0B(c55u, 0);
        this.A01.Dx6(c55u);
        C214869fO c214869fO = this.A00;
        if (c214869fO.A00 == null && (view = c214869fO.mView) != null) {
            View findViewById = view.findViewById(R.id.pre_capture_controls_container);
            View view2 = c214869fO.mView;
            if (view2 != null) {
                C69459Vni c69459Vni = new C69459Vni(findViewById, view2.findViewById(R.id.quick_capture_fragment_container), C05F.A01);
                float f = c214869fO.A04;
                float scaledMinimumFlingVelocity = ViewConfiguration.get(c69459Vni.A0D.getContext()).getScaledMinimumFlingVelocity();
                c69459Vni.A04 = Float.valueOf(scaledMinimumFlingVelocity + ((r1.getScaledMaximumFlingVelocity() - scaledMinimumFlingVelocity) * Math.min(Math.max(0.0f, 1.0f), Math.max(Math.min(0.0f, 1.0f), f))));
                c69459Vni.A02 = Math.max(c214869fO.A03, 1.0f);
                c69459Vni.A03 = c214869fO.A05;
                WO5.A00(c69459Vni.A0C, 2, c69459Vni);
                c214869fO.A00 = c69459Vni;
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public C23744AfH(C214869fO c214869fO, C23786Afx c23786Afx) {
        this.A01 = c23786Afx;
        this.A00 = c214869fO;
    }

    @Override // X.InterfaceC25179BCc
    public final void DV4() {
        C23786Afx.A00(this.A01);
    }
}
