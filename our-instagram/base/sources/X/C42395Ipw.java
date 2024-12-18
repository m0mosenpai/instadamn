package X;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ipw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42395Ipw implements InterfaceC57162jr {
    public long A00;
    public final Map A03 = AbstractC166987dD.A1I();
    public final ILI A02 = new ILI();
    public final ILI A01 = new ILI();

    @Override // X.InterfaceC57162jr
    public final long B0m(C59062n7 c59062n7) {
        C14360o3.A0B(c59062n7, 0);
        C41093IHk c41093IHk = (C41093IHk) this.A03.get(c59062n7.A05);
        if (c41093IHk == null) {
            return 0L;
        }
        return this.A00 - c41093IHk.A03;
    }

    @Override // X.InterfaceC57162jr
    public final void BA8(Rect rect, C59062n7 c59062n7) {
        C14360o3.A0B(rect, 1);
        rect.setEmpty();
        C41093IHk c41093IHk = (C41093IHk) this.A03.get(c59062n7.A05);
        if (c41093IHk != null) {
            Iterator it = c41093IHk.A02.iterator();
            while (it.hasNext()) {
                rect.union((Rect) it.next());
            }
        }
    }

    @Override // X.InterfaceC57162jr
    public final void BA9(C59062n7 c59062n7, List list) {
        C14360o3.A0B(list, 1);
        list.clear();
        C41093IHk c41093IHk = (C41093IHk) this.A03.get(c59062n7.A05);
        if (c41093IHk != null) {
            list.addAll(c41093IHk.A02);
        }
    }

    @Override // X.InterfaceC57162jr
    public final Integer CFq(C59062n7 c59062n7) {
        C14360o3.A0B(c59062n7, 0);
        C41093IHk c41093IHk = (C41093IHk) this.A03.get(c59062n7.A05);
        if (c41093IHk != null) {
            return c41093IHk.A00;
        }
        return C05F.A0C;
    }

    @Override // X.InterfaceC57162jr
    public final void CGX(Rect rect) {
    }

    @Override // X.InterfaceC57162jr
    public final float CGk(C59062n7 c59062n7) {
        C14360o3.A0B(c59062n7, 0);
        Map map = this.A03;
        String str = c59062n7.A05;
        C41093IHk c41093IHk = (C41093IHk) map.get(str);
        if (c41093IHk == null) {
            return 0.0f;
        }
        int i = 0;
        int i2 = 0;
        for (Rect rect : c41093IHk.A01) {
            i2 += rect.height() * rect.width();
        }
        for (Rect rect2 : c41093IHk.A02) {
            i += rect2.height() * rect2.width();
        }
        if (i2 == 0) {
            C0K8.A0E("ViewpointSnapshotImpl", AnonymousClass001.A0R("Total possible area is empty for viewpoint data: ", str));
            return 0.0f;
        }
        return i / i2;
    }

    private final void A00(ILI ili) {
        Iterator A16 = AbstractC166997dE.A16(ili.A00);
        while (A16.hasNext()) {
            C59062n7 c59062n7 = (C59062n7) A16.next();
            C41093IHk c41093IHk = (C41093IHk) this.A03.get(c59062n7.A05);
            if (c41093IHk != null) {
                c41093IHk.A00 = C05F.A0C;
                c41093IHk.A01.clear();
                c41093IHk.A02.clear();
                c59062n7.A01(this);
            }
        }
    }

    public final void A01() {
        ILI ili = this.A02;
        Iterator it = ili.A01.iterator();
        while (it.hasNext()) {
            ((C59062n7) it.next()).A01(this);
        }
        A00(ili);
        ILI ili2 = this.A01;
        Iterator it2 = ili2.A01.iterator();
        while (it2.hasNext()) {
            ((C59062n7) it2.next()).A01(this);
        }
        A00(ili2);
    }

    public final void A02(long j) {
        this.A00 = j;
        ILI ili = this.A02;
        Iterator A16 = AbstractC166997dE.A16(ili.A00);
        while (A16.hasNext()) {
            this.A03.remove(((C59062n7) A16.next()).A05);
        }
        ILI ili2 = this.A01;
        Iterator A162 = AbstractC166997dE.A16(ili2.A00);
        while (A162.hasNext()) {
            this.A03.remove(((C59062n7) A162.next()).A05);
        }
        Iterator A163 = AbstractC166997dE.A16(this.A03);
        while (A163.hasNext()) {
            C41093IHk c41093IHk = (C41093IHk) A163.next();
            c41093IHk.A01.clear();
            c41093IHk.A02.clear();
        }
        ili.A00();
        ili2.A00();
    }

    @Override // X.InterfaceC57162jr
    public final long BmE() {
        return this.A00;
    }

    @Override // X.InterfaceC57162jr
    public final void BA6(Rect rect, C59062n7 c59062n7) {
        AbstractC167017dG.A1N(c59062n7, rect);
        rect.setEmpty();
        C41093IHk c41093IHk = (C41093IHk) this.A03.get(c59062n7.A05);
        if (c41093IHk != null) {
            Iterator it = c41093IHk.A01.iterator();
            while (it.hasNext()) {
                rect.union((Rect) it.next());
            }
        }
    }

    @Override // X.InterfaceC57162jr
    public final int BQL(C59062n7 c59062n7) {
        Rect A0U = AbstractC166987dD.A0U();
        BA6(A0U, c59062n7);
        return A0U.height();
    }

    @Override // X.InterfaceC57162jr
    public final int BQM(C59062n7 c59062n7) {
        Rect A0U = AbstractC166987dD.A0U();
        BA6(A0U, c59062n7);
        return A0U.width();
    }
}
