package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.WwF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71565WwF implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C66359UCf A01;
    public final /* synthetic */ C23031Ai A02;

    public RunnableC71565WwF(FragmentActivity fragmentActivity, C66359UCf c66359UCf, C23031Ai c23031Ai) {
        this.A00 = fragmentActivity;
        this.A01 = c66359UCf;
        this.A02 = c23031Ai;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentActivity fragmentActivity = this.A00;
        C5SU A0f = AbstractC167017dG.A0f(fragmentActivity, fragmentActivity.getString(2131970764));
        A0f.A03(this.A01);
        A0f.A0B = true;
        A0f.A02();
        AbstractC166997dE.A1P(A0f);
        C23031Ai c23031Ai = this.A02;
        AbstractC167007dF.A1L(c23031Ai, c23031Ai.A40, C23031Ai.A8c, 113, true);
    }
}
