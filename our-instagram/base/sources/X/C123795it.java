package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.5it, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123795it {
    public static int A08;
    public double A00;
    public C89773zJ A02;
    public final C123805iu A04 = new Object();
    public final C123805iu A05 = new Object();
    public final C123805iu A06 = new Object();
    public boolean A03 = true;
    public double A01 = 0.0d;
    public final CopyOnWriteArraySet A07 = new CopyOnWriteArraySet();

    public final void A00(double d) {
        if (this.A00 == d && A01()) {
            return;
        }
        this.A00 = d;
        Iterator it = this.A07.iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next();
        throw new NullPointerException("onSpringEndStateChange");
    }

    public final boolean A01() {
        C123805iu c123805iu = this.A04;
        if (Math.abs(c123805iu.A01) <= 0.005d) {
            if (Math.abs(this.A00 - c123805iu.A00) <= 0.005d || this.A02.A01 == 0.0d) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5iu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.5iu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.5iu, java.lang.Object] */
    public C123795it() {
        A08++;
        this.A02 = C89773zJ.A02;
    }
}
