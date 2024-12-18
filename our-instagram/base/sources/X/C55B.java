package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.55B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C55B extends C54t implements Serializable {
    public final List A00;

    @Override // X.AbstractC911344p
    public final AbstractC911344p A04(String str) {
        return null;
    }

    @Override // X.AbstractC911344p
    public final boolean A0A() {
        return true;
    }

    @Override // X.AbstractC911444q
    public final boolean A01(AbstractC913345m abstractC913345m) {
        return this.A00.isEmpty();
    }

    @Override // X.AbstractC911344p
    public final Iterator A08() {
        return this.A00.iterator();
    }

    public final void A0C(AbstractC911344p abstractC911344p) {
        if (abstractC911344p == null) {
            abstractC911344p = C60603RBu.A00;
        }
        this.A00.add(abstractC911344p);
    }

    @Override // X.InterfaceC911544r
    public final void EOv(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar) {
        SX7 A02 = abstractC63023Sar.A02(anonymousClass182, abstractC63023Sar.A04(C16R.A0C, this));
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C54u) ((AbstractC911344p) it.next())).EOr(anonymousClass182, abstractC913345m);
        }
        abstractC63023Sar.A03(anonymousClass182, A02);
    }

    @Override // X.AbstractC911344p
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C55B)) {
            return false;
        }
        return this.A00.equals(((C55B) obj).A00);
    }

    @Override // X.C54u
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C55B(C913045j c913045j) {
        super(c913045j);
        this.A00 = new ArrayList();
    }

    @Override // X.AbstractC911344p
    public final AbstractC911344p A05(String str) {
        return C60605RBw.A00;
    }
}
