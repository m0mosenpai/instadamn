package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.6TO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6TO extends AbstractC136346Fn {
    public final int A00;
    public final int A01;
    public final List A02;

    public C6TO(final C2W2 c2w2, final C6TN c6tn, final C136336Fm c136336Fm, final Object obj, final List list, int i, int i2) {
        super(new Callable() { // from class: X.6TP
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                return c6tn.EKC(c2w2, c136336Fm, obj, list);
            }
        });
        this.A02 = list;
        this.A01 = i;
        this.A00 = i2;
    }
}
