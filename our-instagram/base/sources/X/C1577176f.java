package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import com.facebook.common.dextricks.StringTreeSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.76f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1577176f implements InterfaceC162347Ow {
    public final C162817Qs A00;
    public final C162247Oj A01;
    public final Collection A02;
    public final Collection A03;
    public final Collection A04;
    public final Collection A05;
    public final Collection A06;
    public final Collection A07;
    public final Collection A08;
    public final Collection A09;

    @Override // X.InterfaceC162347Ow
    public final void Ec3(C74843Xy c74843Xy) {
        C14360o3.A0B(c74843Xy, 0);
        C162817Qs c162817Qs = this.A00;
        if (c162817Qs.A02(c74843Xy, C05F.A00)) {
            Iterator it = this.A07.iterator();
            while (it.hasNext()) {
                ((C162817Qs) it.next()).A02(c162817Qs.A09, C05F.A0C);
            }
            Iterator it2 = this.A09.iterator();
            while (it2.hasNext()) {
                ((C162817Qs) it2.next()).A02(c162817Qs.A09, C05F.A0N);
            }
            Iterator it3 = this.A03.iterator();
            while (it3.hasNext()) {
                ((C162817Qs) it3.next()).A02(c162817Qs.A09, C05F.A0j);
            }
            Iterator it4 = this.A05.iterator();
            while (it4.hasNext()) {
                ((C162817Qs) it4.next()).A02(c162817Qs.A09, C05F.A0u);
            }
        }
    }

    @Override // X.InterfaceC162347Ow
    public final void FCi(C74843Xy c74843Xy, float f) {
        C14360o3.A0B(c74843Xy, 0);
        if (this.A01.A05(c74843Xy, C05F.A00, f)) {
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                ((C162247Oj) it.next()).A05(c74843Xy, C05F.A0C, f);
            }
            Iterator it2 = this.A08.iterator();
            while (it2.hasNext()) {
                ((C162247Oj) it2.next()).A05(c74843Xy, C05F.A0N, f);
            }
            Iterator it3 = this.A02.iterator();
            while (it3.hasNext()) {
                ((C162247Oj) it3.next()).A05(c74843Xy, C05F.A0j, f);
            }
            Iterator it4 = this.A04.iterator();
            while (it4.hasNext()) {
                ((C162247Oj) it4.next()).A05(c74843Xy, C05F.A0u, f);
            }
        }
    }

    @Override // X.InterfaceC162347Ow
    public final void AI4() {
        C162817Qs c162817Qs = this.A00;
        Integer num = C05F.A00;
        C74843Xy c74843Xy = c162817Qs.A0A;
        if (c74843Xy.A00 == num && c74843Xy.A01[0] == 0.0f) {
            return;
        }
        Arrays.fill(c74843Xy.A01, C74843Xy.A00(num), C7R3.A00(C05F.A15) + 1, 0.0f);
        C74843Xy.A01(c74843Xy);
        c162817Qs.A03 = true;
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            ((C162247Oj) it.next()).A04(C05F.A0C);
        }
        Iterator it2 = this.A08.iterator();
        while (it2.hasNext()) {
            ((C162247Oj) it2.next()).A04(C05F.A0N);
        }
        Iterator it3 = this.A02.iterator();
        while (it3.hasNext()) {
            ((C162247Oj) it3.next()).A04(C05F.A0j);
        }
        Iterator it4 = this.A04.iterator();
        while (it4.hasNext()) {
            ((C162247Oj) it4.next()).A04(C05F.A0u);
        }
    }

    @Override // X.InterfaceC162347Ow
    public final C74843Xy BLT() {
        return this.A00.A08;
    }

    @Override // X.InterfaceC162347Ow
    public final C74843Xy C0D() {
        return this.A00.A09;
    }

    @Override // X.InterfaceC162347Ow
    public final void Ctd(float f) {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            C7MU.A00(((C162247Oj) it.next()).A01, (int) f);
        }
        Iterator it2 = this.A08.iterator();
        while (it2.hasNext()) {
            C7MU.A00(((C162247Oj) it2.next()).A01, (int) f);
        }
        Iterator it3 = this.A02.iterator();
        while (it3.hasNext()) {
            C7MU.A00(((C162247Oj) it3.next()).A01, (int) f);
        }
        Iterator it4 = this.A04.iterator();
        while (it4.hasNext()) {
            C7MU.A00(((C162247Oj) it4.next()).A01, (int) f);
        }
    }

    @Override // X.InterfaceC162347Ow
    public final void EJl() {
        C162817Qs c162817Qs = this.A00;
        c162817Qs.A08.A08(c162817Qs.A09, C05F.A00);
        for (C162817Qs c162817Qs2 : this.A07) {
            c162817Qs2.A08.A08(c162817Qs2.A09, C05F.A0C);
        }
        for (C162817Qs c162817Qs3 : this.A09) {
            c162817Qs3.A08.A08(c162817Qs3.A09, C05F.A0N);
        }
        for (C162817Qs c162817Qs4 : this.A03) {
            c162817Qs4.A08.A08(c162817Qs4.A09, C05F.A0j);
        }
        for (C162817Qs c162817Qs5 : this.A05) {
            c162817Qs5.A08.A08(c162817Qs5.A09, C05F.A0u);
        }
    }

    public C1577176f(Collection collection, Collection collection2, Collection collection3, Collection collection4, Collection collection5, Collection collection6, Collection collection7, Collection collection8) {
        C162817Qs A00;
        C162817Qs A002;
        C162817Qs A003;
        C162817Qs A004;
        C162817Qs c162817Qs = new C162817Qs(null, StringTreeSet.MAX_SYMBOL_COUNT);
        this.A00 = c162817Qs;
        new Object();
        C162247Oj c162247Oj = (C162247Oj) AbstractC162857Qw.A00(c162817Qs, false).A01;
        this.A01 = c162247Oj;
        this.A06 = collection5;
        this.A08 = collection7;
        this.A02 = collection;
        this.A04 = collection3;
        this.A07 = collection6;
        this.A09 = collection8;
        this.A03 = collection2;
        this.A05 = collection4;
        C162247Oj c162247Oj2 = (C162247Oj) AbstractC001800i.A0A(collection5);
        C162247Oj c162247Oj3 = (C162247Oj) AbstractC001800i.A0A(collection7);
        C162247Oj c162247Oj4 = (C162247Oj) AbstractC001800i.A0A(collection);
        C162247Oj c162247Oj5 = (C162247Oj) AbstractC001800i.A0A(collection3);
        Shape shape = c162247Oj.A03;
        boolean z = false;
        if (shape instanceof C162817Qs) {
            if (c162247Oj2 != null && (A004 = c162247Oj2.A00()) != null) {
                C162817Qs c162817Qs2 = (C162817Qs) shape;
                C74843Xy c74843Xy = A004.A09;
                Integer num = C05F.A0C;
                c162817Qs2.A02(c74843Xy, num);
                C74843Xy c74843Xy2 = A004.A0A;
                C14360o3.A0B(c74843Xy2, 0);
                c162817Qs2.A0A.A08(c74843Xy2, num);
                c162817Qs2.A03 = true;
                Drawable drawable = (Drawable) c162247Oj2.A05.get();
                if (drawable != null) {
                    drawable.invalidateSelf();
                }
                z = true;
            }
            if (c162247Oj3 != null && (A003 = c162247Oj3.A00()) != null) {
                C162817Qs c162817Qs3 = (C162817Qs) shape;
                C74843Xy c74843Xy3 = A003.A09;
                Integer num2 = C05F.A0N;
                c162817Qs3.A02(c74843Xy3, num2);
                C74843Xy c74843Xy4 = A003.A0A;
                C14360o3.A0B(c74843Xy4, 0);
                c162817Qs3.A0A.A08(c74843Xy4, num2);
                c162817Qs3.A03 = true;
                Drawable drawable2 = (Drawable) c162247Oj3.A05.get();
                if (drawable2 != null) {
                    drawable2.invalidateSelf();
                }
                z = true;
            }
            if (c162247Oj4 != null && (A002 = c162247Oj4.A00()) != null) {
                C162817Qs c162817Qs4 = (C162817Qs) shape;
                C74843Xy c74843Xy5 = A002.A09;
                Integer num3 = C05F.A0j;
                c162817Qs4.A02(c74843Xy5, num3);
                C74843Xy c74843Xy6 = A002.A0A;
                C14360o3.A0B(c74843Xy6, 0);
                c162817Qs4.A0A.A08(c74843Xy6, num3);
                c162817Qs4.A03 = true;
                Drawable drawable3 = (Drawable) c162247Oj4.A05.get();
                if (drawable3 != null) {
                    drawable3.invalidateSelf();
                }
                z = true;
            }
            if (c162247Oj5 != null && (A00 = c162247Oj5.A00()) != null) {
                C162817Qs c162817Qs5 = (C162817Qs) shape;
                C74843Xy c74843Xy7 = A00.A09;
                Integer num4 = C05F.A0u;
                c162817Qs5.A02(c74843Xy7, num4);
                C74843Xy c74843Xy8 = A00.A0A;
                C14360o3.A0B(c74843Xy8, 0);
                c162817Qs5.A0A.A08(c74843Xy8, num4);
                c162817Qs5.A03 = true;
                Drawable drawable4 = (Drawable) c162247Oj5.A05.get();
                if (drawable4 != null) {
                    drawable4.invalidateSelf();
                }
            } else if (!z) {
                return;
            }
            C162817Qs c162817Qs6 = (C162817Qs) shape;
            c162817Qs6.A08.A08(c162817Qs6.A09, C05F.A00);
        }
    }
}
