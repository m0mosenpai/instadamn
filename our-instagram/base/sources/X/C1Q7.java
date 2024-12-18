package X;

import android.content.Context;

/* renamed from: X.1Q7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Q7 implements InterfaceC13060ls {
    public final Context A00;
    public final boolean A01;

    public C1Q7(Context context, boolean z) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A01 = z;
    }

    @Override // X.InterfaceC13060ls
    public final void Cww(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        if (this.A01) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk(6) { // from class: X.0vQ
                @Override // java.lang.Runnable
                public final void run() {
                    runnable.run();
                }
            });
        }
    }

    @Override // X.InterfaceC13060ls
    public final void Cwy(AbstractC12990ll abstractC12990ll) {
        final Context context = this.A00;
        if (!AbstractC71553Ja.A01) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk(702457576) { // from class: X.0vQ
                @Override // java.lang.Runnable
                public final void run() {
                    runnable.run();
                }
            });
        }
    }
}
