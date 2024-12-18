package X;

import android.content.res.Resources;

/* renamed from: X.M3j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49942M3j implements Runnable {
    public final /* synthetic */ C5QE A00;
    public final /* synthetic */ C44460JlS A01;

    public RunnableC49942M3j(C5QE c5qe, C44460JlS c44460JlS) {
        this.A01 = c44460JlS;
        this.A00 = c5qe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A0C(EnumC141996bI.A06);
        Resources A0M = AbstractC166997dE.A0M(this.A01.A0D());
        C5QE c5qe = this.A00;
        C14360o3.A0B(c5qe, 1);
        A0K.A0D = c5qe.A01(A0M);
        AbstractC31178DnM.A1N(c41451vu, A0K);
    }
}
