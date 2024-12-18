package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.3HE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HE implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C65422xe A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public C3HE(C65422xe c65422xe, Runnable runnable, List list, List list2, int i) {
        this.A01 = c65422xe;
        this.A04 = list;
        this.A03 = list2;
        this.A00 = i;
        this.A02 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C66582za A00 = AbstractC66552zX.A00(new C3HH(this));
        this.A01.A03.execute(new Runnable() { // from class: X.3HJ
            @Override // java.lang.Runnable
            public final void run() {
                C3HE c3he = C3HE.this;
                C65422xe c65422xe = c3he.A01;
                if (c65422xe.A00 == c3he.A00) {
                    List list = c3he.A03;
                    C66582za c66582za = A00;
                    Runnable runnable = c3he.A02;
                    List list2 = c65422xe.A02;
                    c65422xe.A01 = list;
                    c65422xe.A02 = Collections.unmodifiableList(list);
                    c66582za.A02(c65422xe.A05);
                    C65422xe.A00(c65422xe, runnable, list2);
                }
            }
        });
    }
}
