package X;

import android.widget.TextView;

/* renamed from: X.WwG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71566WwG implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ V0W A01;
    public final /* synthetic */ C23031Ai A02;

    public RunnableC71566WwG(TextView textView, V0W v0w, C23031Ai c23031Ai) {
        this.A01 = v0w;
        this.A00 = textView;
        this.A02 = c23031Ai;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V0W v0w = this.A01;
        C5SU A0f = AbstractC167017dG.A0f(v0w.requireActivity(), v0w.requireContext().getString(2131971016));
        A0f.A03(this.A00);
        A0f.A0B = true;
        A0f.A02();
        AbstractC166997dE.A1P(A0f);
        C23031Ai c23031Ai = this.A02;
        AbstractC167007dF.A1L(c23031Ai, c23031Ai.A40, C23031Ai.A8c, 113, true);
    }
}
