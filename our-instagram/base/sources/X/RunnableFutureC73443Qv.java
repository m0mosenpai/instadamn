package X;

import java.util.concurrent.RunnableFuture;

/* renamed from: X.3Qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableFutureC73443Qv extends AbstractC73453Qw implements RunnableFuture {
    public volatile AbstractRunnableC25421Lw A00;

    @Override // X.AbstractC25011Ke
    public final String A07() {
        AbstractRunnableC25421Lw abstractRunnableC25421Lw = this.A00;
        if (abstractRunnableC25421Lw != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("task=[");
            sb.append(abstractRunnableC25421Lw);
            sb.append("]");
            return sb.toString();
        }
        return super.A07();
    }

    @Override // X.AbstractC25011Ke
    public final void A08() {
        AbstractRunnableC25421Lw abstractRunnableC25421Lw;
        Object obj = this.value;
        if ((obj instanceof C25561Mm) && ((C25561Mm) obj).A01 && (abstractRunnableC25421Lw = this.A00) != null) {
            abstractRunnableC25421Lw.A03();
        }
        this.A00 = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        AbstractRunnableC25421Lw abstractRunnableC25421Lw = this.A00;
        if (abstractRunnableC25421Lw != null) {
            abstractRunnableC25421Lw.run();
        }
        this.A00 = null;
    }
}
