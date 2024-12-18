package X;

import java.util.Iterator;

/* renamed from: X.Vtm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69692Vtm {
    public Object A00;
    public boolean A01;
    public final Iterator A02;

    public final Object A00() {
        if (!this.A01) {
            return this.A02.next();
        }
        Object obj = this.A00;
        this.A01 = false;
        this.A00 = null;
        return obj;
    }

    public final boolean A01() {
        if (!this.A01 && !this.A02.hasNext()) {
            return false;
        }
        return true;
    }

    public C69692Vtm(Iterator it) {
        this.A02 = it;
    }
}
