package X;

/* renamed from: X.GLc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36829GLc implements Runnable {
    public final /* synthetic */ EV0 A00;

    public RunnableC36829GLc(EV0 ev0) {
        this.A00 = ev0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C33228ElK c33228ElK = (C33228ElK) this.A00.A01;
        c33228ElK.A02.A0D = false;
        ((C2UU) AbstractC31175DnJ.A0P(c33228ElK)).notifyDataSetChanged();
    }
}
