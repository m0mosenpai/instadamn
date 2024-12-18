package X;

/* renamed from: X.GLd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36830GLd implements Runnable {
    public final /* synthetic */ EV0 A00;

    public RunnableC36830GLd(EV0 ev0) {
        this.A00 = ev0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C33228ElK c33228ElK = (C33228ElK) this.A00.A01;
        c33228ElK.A02.A0D = true;
        ((C2UU) AbstractC31175DnJ.A0P(c33228ElK)).notifyDataSetChanged();
    }
}
