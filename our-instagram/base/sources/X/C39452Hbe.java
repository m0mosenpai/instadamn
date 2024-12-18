package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Hbe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39452Hbe extends PJX {
    public final int A00;
    public final Object A01;

    public C39452Hbe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.PJX, X.MRA
    public final void Dfe() {
        FragmentActivity requireActivity;
        String A00;
        switch (this.A00) {
            case 0:
                requireActivity = ((Fragment) this.A01).requireActivity();
                A00 = MSV.A00(61);
                C9GR.A0E(requireActivity, A00);
                return;
            case 1:
                C9GR.A0D(((C28189Cbd) this.A01).A02, MSV.A00(61));
                return;
            default:
                requireActivity = ((C41646Ibe) this.A01).A02.getActivity();
                A00 = "product_report_failed_to_load";
                C9GR.A0E(requireActivity, A00);
                return;
        }
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        switch (this.A00) {
            case 0:
                C9GR.A0F(((Fragment) this.A01).requireActivity(), "report_submit_success", 2131975414);
                return;
            case 1:
                return;
            default:
                C41646Ibe c41646Ibe = (C41646Ibe) this.A01;
                C3YS.A00(c41646Ibe.A03).A04(AbstractC16960so.A1O(c41646Ibe.A0D));
                return;
        }
    }
}
