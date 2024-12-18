package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class R97 extends C102314j6 {
    public SP8 A00;
    public List A01;

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return this;
    }

    public final void A0A() {
        super.fillInStackTrace();
    }

    @Override // X.C102314j6, X.AnonymousClass400, java.lang.Throwable
    public final String getMessage() {
        String A09 = A09();
        List list = this.A01;
        if (list != null) {
            StringBuilder A0s = AbstractC58318PtA.A0s(A09);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC58318PtA.A1V(A0s, it.next());
                if (it.hasNext()) {
                    AbstractC58318PtA.A1S(A0s);
                }
            }
            return MSX.A0l(A0s, '.');
        }
        return A09;
    }
}
