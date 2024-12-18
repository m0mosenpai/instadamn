package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Egh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32994Egh extends ESM {
    public final /* synthetic */ C32983Efp A00;

    public C32994Egh(FragmentActivity fragmentActivity, C07270a1 c07270a1, C32983Efp c32983Efp) {
        this.A00 = c32983Efp;
        this.A01 = c07270a1;
        super.A00 = fragmentActivity;
        this.A03 = false;
        this.A02 = "email";
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1205956604);
        super.onFinish();
        ((EMQ) this.A00).A03.A00();
        C0f9.A0A(1413174170, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1402777862);
        super.onStart();
        ((EMQ) this.A00).A03.A01();
        C0f9.A0A(-460787668, A03);
    }
}
