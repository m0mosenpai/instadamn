package X;

import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: X.57Z, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class C57Z {
    public static final void A02(C12W c12w) {
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) c12w.get(AnonymousClass195.A00);
        if (anonymousClass195 != null) {
            Iterator it = anonymousClass195.Anf().iterator();
            while (it.hasNext()) {
                ((AnonymousClass195) it.next()).AGH(null);
            }
        }
    }

    public static final AnonymousClass195 A00(C12W c12w) {
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) c12w.get(AnonymousClass195.A00);
        if (anonymousClass195 != null) {
            return anonymousClass195;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Current context doesn't contain Job in it: ");
        sb.append(c12w);
        throw new IllegalStateException(sb.toString());
    }

    public static final void A01(CancellationException cancellationException, C12W c12w) {
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) c12w.get(AnonymousClass195.A00);
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(cancellationException);
        }
    }

    public static final boolean A03(C12W c12w) {
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) c12w.get(AnonymousClass195.A00);
        if (anonymousClass195 != null) {
            return anonymousClass195.isActive();
        }
        return true;
    }
}
