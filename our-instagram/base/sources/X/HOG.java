package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.CreateModeType;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HOG extends C17T implements InterfaceC120925dk {
    public InterfaceC43526JKm A00;
    public List A01;

    @Override // X.InterfaceC120925dk
    public final List Am1() {
        return A08(94431075, HNQ.class);
    }

    @Override // X.InterfaceC120925dk
    public final List B97() {
        return this.A01;
    }

    @Override // X.InterfaceC120925dk
    public final JLP B9p() {
        return (JLP) A05(541661630, HP5.class);
    }

    @Override // X.InterfaceC120925dk
    public final JJO BAg() {
        return (JJO) A05(1841734510, HPF.class);
    }

    @Override // X.InterfaceC120925dk
    public final List BeM() {
        return A08(-276693162, HRl.class);
    }

    @Override // X.InterfaceC120925dk
    public final InterfaceC43526JKm C5m() {
        InterfaceC43526JKm interfaceC43526JKm = this.A00;
        if (interfaceC43526JKm == null) {
            return (InterfaceC43526JKm) A05(-732727820, HXZ.class);
        }
        return interfaceC43526JKm;
    }

    @Override // X.InterfaceC120925dk
    public final CreateModeType CBR() {
        return (CreateModeType) A0N(3575610, J9Q.A00);
    }

    @Override // X.InterfaceC120925dk
    public final InterfaceC120925dk E8w(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(1778619833, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        InterfaceC43526JKm C5m = C5m();
        if (C5m != null) {
            C5m.ECC(c1dy);
        } else {
            C5m = null;
        }
        this.A00 = C5m;
        return this;
    }

    @Override // X.InterfaceC120925dk
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, Hm6.A00(this));
    }

    @Override // X.InterfaceC120925dk
    public final String C8B() {
        return A0i(1825632156);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    @Override // X.InterfaceC120925dk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C120915dj Ese(X.C1DY r11) {
        /*
            r10 = this;
            java.util.List r0 = r10.Am1()
            r4 = 0
            if (r0 == 0) goto L23
            java.util.ArrayList r7 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        Lf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r1.next()
            X.JKn r0 = (X.InterfaceC43527JKn) r0
            X.H2X r0 = r0.Erd()
            r7.add(r0)
            goto Lf
        L23:
            r7 = r4
        L24:
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r1 = com.instagram.user.model.ImmutablePandoUserDict.class
            r0 = 1778619833(0x6a0395b9, float:3.976908E25)
            com.google.common.collect.ImmutableList r0 = r10.A08(r0, r1)
            if (r0 == 0) goto L55
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r1 = r0.iterator()
        L37:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L41
            X.AbstractC31179DnN.A1I(r11, r2, r1)
            goto L37
        L41:
            if (r2 == 0) goto L55
            java.util.ArrayList r8 = X.AbstractC167007dF.A0i(r2)
            java.util.Iterator r1 = r2.iterator()
        L4b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L56
            X.AbstractC37303Gc4.A18(r11, r8, r1)
            goto L4b
        L55:
            r8 = r4
        L56:
            X.JLP r0 = r10.B9p()
            if (r0 == 0) goto L92
            X.H3P r2 = r0.Etl()
        L60:
            X.JJO r0 = r10.BAg()
            if (r0 == 0) goto L90
            X.H3S r3 = r0.Etz()
        L6a:
            java.lang.String r5 = r10.A0W()
            java.util.List r0 = r10.BeM()
            if (r0 == 0) goto L94
            java.util.ArrayList r9 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L7c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r1.next()
            X.JL1 r0 = (X.JL1) r0
            X.H4X r0 = r0.Ey2()
            r9.add(r0)
            goto L7c
        L90:
            r3 = r4
            goto L6a
        L92:
            r2 = r4
            goto L60
        L94:
            r9 = r4
        L95:
            X.JKm r0 = r10.C5m()
            if (r0 == 0) goto L9f
            X.H7z r4 = r0.F77(r11)
        L9f:
            r0 = 1825632156(0x6cd0ef9c, float:2.0207048E27)
            java.lang.String r6 = r10.A0i(r0)
            com.instagram.api.schemas.CreateModeType r1 = r10.CBR()
            X.5dj r0 = new X.5dj
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HOG.Ese(X.1DY):X.5dj");
    }

    @Override // X.InterfaceC120925dk
    public final C120915dj Esf(C1DV c1dv) {
        return Ese(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // X.InterfaceC120925dk
    public final String getName() {
        return A0W();
    }
}
