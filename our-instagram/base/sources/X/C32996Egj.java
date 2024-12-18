package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Egj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32996Egj extends ESM {
    public final /* synthetic */ EKE A00;

    public C32996Egj(FragmentActivity fragmentActivity, C07270a1 c07270a1, EKE eke) {
        String A00 = AbstractC31189DnY.A00();
        this.A00 = eke;
        this.A01 = c07270a1;
        super.A00 = fragmentActivity;
        this.A03 = false;
        this.A02 = A00;
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1937266298);
        super.onFinish();
        EVN evn = this.A00.A07;
        if (evn != null) {
            evn.A00();
        }
        C0f9.A0A(2136767930, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-632144093);
        super.onStart();
        EVN evn = this.A00.A07;
        if (evn != null) {
            evn.A01();
        }
        C0f9.A0A(1199193664, A03);
    }
}
