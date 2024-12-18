package X;

import android.content.Context;

/* loaded from: classes6.dex */
public abstract class ET4 extends C1P1 {
    public final Context A00;
    public final AbstractC10360h2 A01;

    public ET4(Context context, AbstractC10360h2 abstractC10360h2) {
        this.A00 = context;
        this.A01 = abstractC10360h2;
    }

    @Override // X.C1P1
    public void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1553224391);
        C9GR.A07(this.A00, 2131972429);
        C0f9.A0A(-491435632, A03);
    }

    @Override // X.C1P1
    public void onFinish() {
        int A03 = C0f9.A03(-1086695173);
        C11T.A03(new GMV(this));
        C0f9.A0A(-1739757778, A03);
    }
}
