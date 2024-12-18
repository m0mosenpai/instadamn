package X;

import android.content.Context;

/* renamed from: X.GNi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36887GNi implements Runnable {
    public final /* synthetic */ AnonymousClass436 A00;
    public final /* synthetic */ EI4 A01;

    public RunnableC36887GNi(AnonymousClass436 anonymousClass436, EI4 ei4) {
        this.A01 = ei4;
        this.A00 = anonymousClass436;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2JS A0k;
        EI4 ei4 = this.A01;
        if (!ei4.mDetached) {
            AnonymousClass436 anonymousClass436 = this.A00;
            if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && A0k.getCoercedBooleanField(0, AbstractC111324zv.A00(1377))) {
                AbstractC31179DnN.A0x(ei4);
                return;
            }
            Context context = ei4.getContext();
            if (context == null) {
                return;
            }
            C9GR.A0F(context, "AI Subscription item deletion", 2131952871);
        }
    }
}
