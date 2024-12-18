package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.FPr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34681FPr {
    public List A00;
    public List A01;
    public List A02;

    public final List A00() {
        if (this.A02 == null) {
            this.A02 = AbstractC25230BEn.A0q(this.A01);
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                this.A02.add(((C34517FJd) it.next()).A01);
            }
        }
        return this.A02;
    }
}
