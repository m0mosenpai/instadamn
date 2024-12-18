package X;

import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.9Mo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209069Mo {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C74T A00(Drawable drawable) {
        boolean z = drawable instanceof C5RO;
        Object obj = drawable;
        if (z) {
            C5RO c5ro = (C5RO) drawable;
            if (c5ro != null) {
                obj = c5ro.Afg();
            } else {
                obj = null;
            }
        }
        boolean z2 = obj instanceof C194808jg;
        Object obj2 = obj;
        if (z2) {
            obj2 = ((C194808jg) obj).A04();
        }
        if (!(obj2 instanceof C74T)) {
            return null;
        }
        return (C74T) obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r0 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C210399Se A01(android.graphics.drawable.Drawable r2) {
        /*
            boolean r0 = r2 instanceof X.C194808jg
            if (r0 == 0) goto La
            X.8jg r2 = (X.C194808jg) r2
            android.graphics.drawable.Drawable r2 = r2.A04()
        La:
            boolean r0 = r2 instanceof X.C210399Se
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof X.InterfaceC25171BBr
            r1 = 0
            if (r0 == 0) goto L24
            X.BBr r2 = (X.InterfaceC25171BBr) r2
            if (r2 == 0) goto L22
            android.graphics.drawable.Drawable r2 = r2.Ad0()
        L1b:
            boolean r0 = r2 instanceof X.C210399Se
            if (r0 == 0) goto L24
        L1f:
            X.9Se r2 = (X.C210399Se) r2
            return r2
        L22:
            r2 = r1
            goto L1b
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC209069Mo.A01(android.graphics.drawable.Drawable):X.9Se");
    }

    public static final C5RQ A02(Drawable drawable) {
        boolean z = drawable instanceof C194808jg;
        Object obj = drawable;
        if (z) {
            obj = ((C194808jg) drawable).A04();
        }
        if (obj instanceof C5RQ) {
            return (C5RQ) obj;
        }
        return null;
    }

    public static final boolean A03(Drawable drawable) {
        C6RB c6rb;
        if ((drawable instanceof C6RB) && (c6rb = (C6RB) drawable) != null && c6rb.A0I != null) {
            return true;
        }
        return false;
    }

    public static final boolean A05(java.util.Set set) {
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C74T A00 = A00(AbstractC166987dD.A0Z(it));
                if (A00 != null && ((C74P) A00).A0s) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A04(Drawable drawable) {
        if (A00(drawable) == null && A02(drawable) == null && !A03(drawable)) {
            return false;
        }
        return true;
    }
}
