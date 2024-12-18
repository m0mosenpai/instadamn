package X;

import android.content.Context;

/* renamed from: X.ETp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32513ETp extends C1P1 {
    public final Context A00;
    public final C6WQ A01;

    public C32513ETp(Context context, C6WQ c6wq, String str) {
        C14360o3.A0B(str, 1);
        this.A00 = context;
        this.A01 = c6wq;
        c6wq.A00(context.getString(2131972604));
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1511474765);
        AbstractC35254Fgn.A02(this.A00, abstractC115105If);
        C0f9.A0A(-914136833, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-314105232);
        this.A01.hide();
        super.onFinish();
        C0f9.A0A(-1275840680, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-62375715);
        C0fJ.A00(this.A01);
        super.onStart();
        C0f9.A0A(1305427561, A03);
    }
}
