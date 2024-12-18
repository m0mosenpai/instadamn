package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;

/* loaded from: classes6.dex */
public abstract class ETO extends C1P1 {
    public final Context A00;
    public final View A01;
    public final AbstractC10360h2 A02;
    public final boolean A03;
    public final Handler A04 = new Handler();

    public ETO(Context context, View view, AbstractC10360h2 abstractC10360h2, boolean z) {
        this.A00 = context;
        this.A02 = abstractC10360h2;
        this.A03 = z;
        this.A01 = view;
    }

    @Override // X.C1P1
    public void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1638653293);
        C9GR.A07(this.A00, 2131972429);
        C0f9.A0A(-796472901, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-2132906898);
        this.A04.post(new GMY(this));
        C0f9.A0A(1051232325, A03);
    }
}
