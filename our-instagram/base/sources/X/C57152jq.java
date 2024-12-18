package X;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2jq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57152jq implements InterfaceC57162jr {
    public long A00;
    public final boolean A04;
    public final C57102jl A05;
    public final Map A03 = new HashMap();
    public final C57172js A02 = new C57172js();
    public final C57172js A01 = new C57172js();
    public final List A06 = new ArrayList(1);

    public static Rect A00(C3QX c3qx) {
        if (c3qx != null) {
            Rect rect = c3qx.A02;
            if (rect.top != Integer.MIN_VALUE && rect.left != Integer.MIN_VALUE && rect.right != Integer.MIN_VALUE && rect.bottom != Integer.MIN_VALUE) {
                return rect;
            }
        }
        throw new IllegalStateException("This viewpoint has not been measured or is a group which will never return a measurement since it's made up of subviews that could be offscreen");
    }

    private void A01(C57172js c57172js) {
        for (C59062n7 c59062n7 : c57172js.A00.values()) {
            C3QX c3qx = (C3QX) this.A03.get(c59062n7.A00);
            if (c3qx != null) {
                c3qx.A01 = C05F.A0C;
                c3qx.A03.clear();
                c59062n7.A01(this);
            } else if (this.A05 != null) {
                C0w9.A01.EmN("ViewpointSnapshotReducerJv", AnonymousClass001.A0R("null view property for removed item ", c59062n7.A00));
            }
        }
    }

    public final void A02() {
        C57172js c57172js = this.A02;
        Iterator it = c57172js.A01.iterator();
        while (it.hasNext()) {
            ((C59062n7) it.next()).A01(this);
        }
        A01(c57172js);
        C57172js c57172js2 = this.A01;
        Iterator it2 = c57172js2.A01.iterator();
        while (it2.hasNext()) {
            ((C59062n7) it2.next()).A01(this);
        }
        A01(c57172js2);
    }

    public final void A03(long j, List list) {
        this.A00 = j;
        List list2 = this.A06;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            list2.add(new Rect((Rect) it.next()));
        }
        C57172js c57172js = this.A02;
        Iterator it2 = c57172js.A00.values().iterator();
        while (it2.hasNext()) {
            this.A03.remove(((C59062n7) it2.next()).A00);
        }
        C57172js c57172js2 = this.A01;
        Iterator it3 = c57172js2.A00.values().iterator();
        while (it3.hasNext()) {
            this.A03.remove(((C59062n7) it3.next()).A00);
        }
        Iterator it4 = this.A03.values().iterator();
        while (it4.hasNext()) {
            ((C3QX) it4.next()).A03.clear();
        }
        C57172js.A00(c57172js);
        C57172js.A00(c57172js2);
    }

    @Override // X.InterfaceC57162jr
    public final long B0m(C59062n7 c59062n7) {
        C3QX c3qx = (C3QX) this.A03.get(c59062n7.A00);
        if (c3qx == null) {
            return 0L;
        }
        return this.A00 - c3qx.A00;
    }

    @Override // X.InterfaceC57162jr
    public final void BA6(Rect rect, C59062n7 c59062n7) {
        rect.set(A00((C3QX) this.A03.get(c59062n7.A00)));
    }

    @Override // X.InterfaceC57162jr
    public final int BQL(C59062n7 c59062n7) {
        return A00((C3QX) this.A03.get(c59062n7.A00)).height();
    }

    @Override // X.InterfaceC57162jr
    public final int BQM(C59062n7 c59062n7) {
        return A00((C3QX) this.A03.get(c59062n7.A00)).width();
    }

    @Override // X.InterfaceC57162jr
    public final long BmE() {
        return this.A00;
    }

    @Override // X.InterfaceC57162jr
    public final Integer CFq(C59062n7 c59062n7) {
        return ((C3QX) this.A03.get(c59062n7.A00)).A01;
    }

    @Override // X.InterfaceC57162jr
    public final float CGk(C59062n7 c59062n7) {
        C3QX c3qx = (C3QX) this.A03.get(c59062n7.A00);
        if (c3qx != null) {
            Rect A00 = A00(c3qx);
            int height = A00.height() * A00.width();
            int i = 0;
            for (Rect rect : c3qx.A03) {
                i += rect.height() * rect.width();
            }
            return i / height;
        }
        return 0.0f;
    }

    public C57152jq(C57102jl c57102jl, boolean z) {
        this.A05 = c57102jl;
        this.A04 = z;
    }

    @Override // X.InterfaceC57162jr
    public final void BA8(Rect rect, C59062n7 c59062n7) {
        rect.setEmpty();
        Iterator it = ((C3QX) this.A03.get(c59062n7.A00)).A03.iterator();
        while (it.hasNext()) {
            rect.union((Rect) it.next());
        }
    }

    @Override // X.InterfaceC57162jr
    public final void BA9(C59062n7 c59062n7, List list) {
        list.clear();
        list.addAll(((C3QX) this.A03.get(c59062n7.A00)).A03);
    }

    @Override // X.InterfaceC57162jr
    public final void CGX(Rect rect) {
        rect.setEmpty();
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            rect.union((Rect) it.next());
        }
    }
}
