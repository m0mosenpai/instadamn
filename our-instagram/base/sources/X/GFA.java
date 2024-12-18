package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class GFA implements GYE {
    public final /* synthetic */ C146966jY A00;

    public GFA(C146966jY c146966jY) {
        this.A00 = c146966jY;
    }

    @Override // X.GYE
    public final C6WQ AxL(Context context) {
        C146966jY c146966jY = this.A00;
        C6WQ c6wq = c146966jY.A00;
        if (c6wq == null) {
            c6wq = AbstractC31174DnI.A0i(context);
            AbstractC31176DnK.A13(context, c6wq);
        }
        if (c146966jY.A00 == null) {
            c146966jY.A00 = c6wq;
        }
        return c6wq;
    }
}
