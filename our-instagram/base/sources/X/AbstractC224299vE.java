package X;

import android.graphics.Bitmap;

/* renamed from: X.9vE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224299vE {
    public C9RO A00;

    public final C9RO A00(AnonymousClass810 anonymousClass810) {
        C9RO c9ro = this.A00;
        if (c9ro == null) {
            c9ro = new C9RO(new C179387xo());
            this.A00 = c9ro;
        }
        c9ro.A00 = false;
        AnonymousClass812 anonymousClass812 = anonymousClass810.A02;
        int i = anonymousClass812.A01;
        int i2 = anonymousClass812.A00;
        c9ro.FBE(i, i2, i, i2, 0, 0, 0, false);
        c9ro.A00(anonymousClass810);
        return c9ro;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0101, code lost:
    
        if (r0 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x003d, code lost:
    
        if (r4.A00 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C9RO A01(X.C5NJ r22, long r23, long r25) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC224299vE.A01(X.5NJ, long, long):X.9RO");
    }

    public void A02() {
        if (this instanceof C221799qi) {
            C221799qi c221799qi = (C221799qi) this;
            AnonymousClass810 anonymousClass810 = c221799qi.A00;
            if (anonymousClass810 != null) {
                anonymousClass810.A01();
            }
            c221799qi.A00 = null;
            return;
        }
        Bitmap bitmap = ((C221809qj) this).A00;
        if (bitmap == null) {
            return;
        }
        bitmap.recycle();
    }
}
