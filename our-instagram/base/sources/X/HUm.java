package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HUm extends C17T implements C47H {
    public InterfaceC115885Me A00;
    public User A01;
    public List A02;
    public List A03;

    @Override // X.C47H
    public final C47F AvM() {
        return (C47F) A05(-1183438890, C39251HSj.class);
    }

    @Override // X.C47H
    public final List BR6() {
        return this.A02;
    }

    @Override // X.C47H
    public final InterfaceC115885Me Bfs() {
        InterfaceC115885Me interfaceC115885Me = this.A00;
        if (interfaceC115885Me == null) {
            return (InterfaceC115885Me) A05(700235949, C33024EhS.class);
        }
        return interfaceC115885Me;
    }

    @Override // X.C47H
    public final List ByM() {
        return this.A03;
    }

    @Override // X.C47H
    public final User CDj() {
        User user = this.A01;
        if (user != null) {
            return user;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'user' field.");
    }

    @Override // X.C47H
    public final C47H EAu(C1DY c1dy) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ImmutableList A08 = A08(-3896982, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1F(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        InterfaceC115885Me Bfs = Bfs();
        if (Bfs != null) {
            Bfs.E9T(c1dy);
        } else {
            Bfs = null;
        }
        this.A00 = Bfs;
        ImmutableList A082 = A08(378965114, ImmutablePandoUserDict.class);
        if (A082 != null) {
            arrayList2 = AbstractC167017dG.A0q(A082);
            Iterator<E> it2 = A082.iterator();
            while (it2.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        this.A03 = arrayList2;
        this.A01 = AbstractC37302Gc3.A0P(c1dy, this, 3599307);
        return this;
    }

    @Override // X.C47H
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, Hv4.A00(this));
    }

    @Override // X.C47H
    public final String Af0() {
        return A0i(-168253766);
    }

    @Override // X.C47H
    public final String Alc() {
        return A0i(552573414);
    }

    @Override // X.C47H
    public final Boolean B7Q() {
        return getOptionalBooleanValueByHashCode(1601672934);
    }

    @Override // X.C47H
    public final Boolean BCj() {
        return getOptionalBooleanValueByHashCode(-1011195986);
    }

    @Override // X.C47H
    public final String BEi() {
        return AbstractC37304Gc5.A0i(this);
    }

    @Override // X.C47H
    public final List BL9() {
        return getOptionalStringListByHashCode(2040312680);
    }

    @Override // X.C47H
    public final Integer BQb() {
        return getOptionalIntValueByHashCode(-9393932);
    }

    @Override // X.C47H
    public final List BR1() {
        return A0n(2140775389);
    }

    @Override // X.C47H
    public final Float Bqj() {
        return A0K(109264530);
    }

    @Override // X.C47H
    public final String ByJ() {
        return A0h(-823445795);
    }

    @Override // X.C47H
    public final List C8C() {
        return getOptionalStringListByHashCode(760022103);
    }

    @Override // X.C47H
    public final String CEI() {
        return A0j(3601339);
    }

    @Override // X.C47H
    public final Float CER() {
        return A0K(111972721);
    }

    @Override // X.C47H
    public final Boolean CZO() {
        return getOptionalBooleanValueByHashCode(91445688);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    @Override // X.C47H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47G F2Y(X.C1DY r27) {
        /*
            r26 = this;
            r1 = 225490031(0xd70b46f, float:7.41729E-31)
            r0 = r26
            java.lang.String r15 = r0.A0h(r1)
            r1 = -168253766(0xfffffffff5f8a6ba, float:-6.3040588E32)
            java.lang.String r16 = r0.A0i(r1)
            r1 = 552573414(0x20ef99e6, float:4.0590016E-19)
            java.lang.String r17 = r0.A0i(r1)
            X.47F r1 = r0.AvM()
            if (r1 == 0) goto L6e
            X.47E r7 = r1.EzI()
        L21:
            r1 = 1601672934(0x5f7796e6, float:1.78407E19)
            java.lang.Boolean r9 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1011195986(0xffffffffc3ba5fae, float:-372.7475)
            java.lang.Boolean r10 = r0.getOptionalBooleanValueByHashCode(r1)
            java.lang.String r18 = X.AbstractC37304Gc5.A0i(r0)
            r1 = 91445688(0x57359b8, float:1.1442284E-35)
            java.lang.Boolean r11 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 2040312680(0x799cb368, float:1.0170464E35)
            com.google.common.collect.ImmutableList r21 = r0.getOptionalStringListByHashCode(r1)
            r1 = -9393932(0xffffffffff70a8f4, float:-3.1989197E38)
            java.lang.Integer r14 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 2140775389(0x7f99a3dd, float:NaN)
            java.util.List r22 = r0.A0n(r1)
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r2 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            r1 = -3896982(0xffffffffffc4896a, float:NaN)
            com.google.common.collect.ImmutableList r2 = r0.A08(r1, r2)
            r1 = r27
            if (r2 == 0) goto L84
            java.util.ArrayList r3 = X.AbstractC167017dG.A0q(r2)
            java.util.Iterator r4 = r2.iterator()
        L64:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L70
            X.AbstractC37304Gc5.A1F(r1, r3, r4)
            goto L64
        L6e:
            r7 = 0
            goto L21
        L70:
            if (r3 == 0) goto L84
            java.util.ArrayList r4 = X.AbstractC167007dF.A0i(r3)
            java.util.Iterator r3 = r3.iterator()
        L7a:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L85
            X.AbstractC37304Gc5.A1H(r1, r4, r3)
            goto L7a
        L84:
            r4 = 0
        L85:
            X.5Me r2 = r0.Bfs()
            if (r2 == 0) goto Lba
            X.5Md r6 = r2.ExT(r1)
        L8f:
            r2 = 109264530(0x6833e92, float:4.936866E-35)
            java.lang.Float r12 = r0.A0K(r2)
            r2 = -823445795(0xffffffffceeb36dd, float:-1.9731206E9)
            java.lang.String r19 = r0.A0h(r2)
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r3 = com.instagram.user.model.ImmutablePandoUserDict.class
            r2 = 378965114(0x16968c7a, float:2.432246E-25)
            com.google.common.collect.ImmutableList r3 = r0.A08(r2, r3)
            if (r3 == 0) goto Ld0
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r3)
            java.util.Iterator r3 = r3.iterator()
        Lb0:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lbc
            X.AbstractC31179DnN.A1I(r1, r2, r3)
            goto Lb0
        Lba:
            r6 = 0
            goto L8f
        Lbc:
            if (r2 == 0) goto Ld0
            java.util.ArrayList r3 = X.AbstractC167007dF.A0i(r2)
            java.util.Iterator r2 = r2.iterator()
        Lc6:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Ld1
            X.AbstractC37303Gc4.A18(r1, r3, r2)
            goto Lc6
        Ld0:
            r3 = 0
        Ld1:
            r2 = 760022103(0x2d4d0457, float:1.16538645E-11)
            com.google.common.collect.ImmutableList r25 = r0.getOptionalStringListByHashCode(r2)
            r2 = 3599307(0x36ebcb, float:5.043703E-39)
            X.17M r8 = X.AbstractC37303Gc4.A07(r1, r0, r2)
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            r1 = 3601339(0x36f3bb, float:5.046551E-39)
            java.lang.String r20 = r0.A0j(r1)
            r1 = 111972721(0x6ac9171, float:6.4912916E-35)
            java.lang.Float r13 = r0.A0K(r1)
            X.47G r5 = new X.47G
            r23 = r4
            r24 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HUm.F2Y(X.1DY):X.47G");
    }

    @Override // X.C47H
    public final String getAlgorithm() {
        return A0h(225490031);
    }
}
