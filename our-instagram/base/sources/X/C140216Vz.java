package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.6Vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140216Vz extends AbstractC136346Fn {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C2W2 A03;

    public C140216Vz(final Context context, final C2W2 c2w2, final C135266Ab c135266Ab, final Object obj, final Object obj2, final AbstractC79173gO[] abstractC79173gOArr, final int i, int i2, final long j) {
        super(new Callable() { // from class: X.6W0
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                C135266Ab c135266Ab2 = c135266Ab;
                if (c135266Ab2 != null) {
                    C2W2 c2w22 = c2w2;
                    long j2 = j;
                    C79243gV c79243gV = c135266Ab2.A01;
                    if (c2w22 == c135266Ab2.A00 && AbstractC78603fS.A02(j2, c79243gV.A01, AbstractC78673fZ.A00(c79243gV.A01(), c79243gV.A00()))) {
                        return new C135266Ab(c2w22, c79243gV, obj2, c135266Ab2.A03);
                    }
                }
                C135276Ac c135276Ac = C135266Ab.A04;
                Object obj3 = obj;
                return c135276Ac.A03(c135276Ac.A01(context, c135266Ab2, obj3, abstractC79173gOArr, i), c2w2, obj2, j);
            }
        });
        this.A03 = c2w2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
    }
}
