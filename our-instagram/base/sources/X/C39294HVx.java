package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HVx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39294HVx extends C17T implements JMF {
    public List A00;

    @Override // X.JMF
    public final List BGq() {
        return A08(-1442782083, C39216HOz.class);
    }

    @Override // X.JMF
    public final List BhB() {
        return this.A00;
    }

    @Override // X.JMF
    public final List BhH() {
        return A08(-1196402883, HS2.class);
    }

    @Override // X.JMF
    public final JMF EBN(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(1376807024, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1F(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.JMF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I05.A00(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    @Override // X.JMF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.H7M F4b(X.C1DY r8) {
        /*
            r7 = this;
            java.util.List r0 = r7.BGq()
            r2 = 0
            if (r0 == 0) goto L23
            java.util.ArrayList r5 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        Lf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r1.next()
            X.3vf r0 = (X.InterfaceC87713vf) r0
            X.3ve r0 = r0.EtZ()
            r5.add(r0)
            goto Lf
        L23:
            r5 = r2
        L24:
            java.lang.String r4 = r7.A0f()
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r1 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            r0 = 1376807024(0x52106870, float:1.5505687E11)
            com.google.common.collect.ImmutableList r0 = r7.A08(r0, r1)
            if (r0 == 0) goto L59
            java.util.ArrayList r6 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r1 = r0.iterator()
        L3b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L45
            X.AbstractC37304Gc5.A1F(r8, r6, r1)
            goto L3b
        L45:
            if (r6 == 0) goto L59
            java.util.ArrayList r3 = X.AbstractC167007dF.A0i(r6)
            java.util.Iterator r1 = r6.iterator()
        L4f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5a
            X.AbstractC37304Gc5.A1H(r8, r3, r1)
            goto L4f
        L59:
            r3 = r2
        L5a:
            java.util.List r0 = r7.BhH()
            if (r0 == 0) goto L7c
            java.util.ArrayList r2 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L68:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r1.next()
            X.JL4 r0 = (X.JL4) r0
            X.H4j r0 = r0.EyO()
            r2.add(r0)
            goto L68
        L7c:
            X.H7M r0 = new X.H7M
            r0.<init>(r4, r5, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39294HVx.F4b(X.1DY):X.H7M");
    }

    @Override // X.JMF
    public final H7M F4c(C1DV c1dv) {
        return F4b(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.JMF
    public final String getMediaId() {
        return A0f();
    }
}
