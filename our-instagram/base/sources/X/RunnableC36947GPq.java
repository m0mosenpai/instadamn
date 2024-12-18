package X;

/* renamed from: X.GPq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36947GPq implements Runnable {
    public final /* synthetic */ AbstractC36003Fv1 A00;
    public final /* synthetic */ AbstractC34714FQz A01;
    public final /* synthetic */ boolean A02;

    public RunnableC36947GPq(AbstractC36003Fv1 abstractC36003Fv1, AbstractC34714FQz abstractC34714FQz, boolean z) {
        this.A00 = abstractC36003Fv1;
        this.A01 = abstractC34714FQz;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC36003Fv1 abstractC36003Fv1 = this.A00;
        AbstractC34714FQz abstractC34714FQz = this.A01;
        boolean z = this.A02;
        abstractC36003Fv1.A01 = abstractC34714FQz;
        if (z) {
            abstractC36003Fv1.A00 = abstractC34714FQz.A00();
        }
    }
}
