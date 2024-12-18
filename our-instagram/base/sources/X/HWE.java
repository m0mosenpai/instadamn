package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ACRType;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.reels.ReelType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HWE extends C17T implements InterfaceC37821pL {
    public C38321qM A00;
    public List A01;

    @Override // X.InterfaceC37821pL
    public final ACRType AYG() {
        return (ACRType) A0N(-772425076, C43326JCt.A00);
    }

    @Override // X.InterfaceC37821pL
    public final C38321qM Bft() {
        return this.A00;
    }

    @Override // X.InterfaceC37821pL
    public final ReelType Blz() {
        return (ReelType) A0N(1096874389, C43327JCu.A00);
    }

    @Override // X.InterfaceC37821pL
    public final List Byl() {
        return this.A01;
    }

    @Override // X.InterfaceC37821pL
    public final InterfaceC43521JKh CAG() {
        return (InterfaceC43521JKh) A05(-2028976363, HVN.class);
    }

    @Override // X.InterfaceC37821pL
    public final InterfaceC37821pL EBa(C1DY c1dy) {
        ArrayList arrayList;
        this.A00 = AbstractC37304Gc5.A0D(c1dy, this, 700235949);
        ImmutableList A08 = A08(-1428838723, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1F(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    @Override // X.InterfaceC37821pL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C37801pJ F5H(X.C1DY r20) {
        /*
            r19 = this;
            r2 = r19
            com.instagram.api.schemas.ACRType r5 = r2.AYG()
            r0 = 501281532(0x1de0f2fc, float:5.9543546E-21)
            java.lang.Long r9 = r2.A0L(r0)
            r0 = 1583739286(0x5e65f196, float:4.1422974E18)
            java.lang.String r12 = r2.A0i(r0)
            r0 = 1025801609(0x3d247d89, float:0.040158782)
            java.lang.String r13 = r2.A0i(r0)
            r0 = -967891612(0xffffffffc64f2564, float:-13257.348)
            java.lang.String r14 = r2.A0i(r0)
            r0 = 1492668633(0x58f850d9, float:2.184209E15)
            java.lang.String r15 = r2.A0i(r0)
            java.lang.Long r10 = X.AbstractC37303Gc4.A0P(r2)
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r1 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            r0 = 700235949(0x29bcc0ad, float:8.382301E-14)
            r4 = r20
            X.1qM r0 = X.AbstractC37304Gc5.A0D(r4, r2, r0)
            r6 = 0
            if (r0 == 0) goto L67
            X.17M r7 = r4.A00(r0)
            X.1qM r7 = (X.C38321qM) r7
        L41:
            r0 = 501699126(0x1de75236, float:6.1230195E-21)
            java.lang.Long r11 = r2.A0L(r0)
            com.instagram.model.reels.ReelType r8 = r2.Blz()
            r0 = -1428838723(0xffffffffaad5a6bd, float:-3.7952099E-13)
            com.google.common.collect.ImmutableList r0 = r2.A08(r0, r1)
            if (r0 == 0) goto L7d
            java.util.ArrayList r3 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r1 = r0.iterator()
        L5d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L69
            X.AbstractC37304Gc5.A1F(r4, r3, r1)
            goto L5d
        L67:
            r7 = r6
            goto L41
        L69:
            if (r3 == 0) goto L7d
            java.util.ArrayList r1 = X.AbstractC167017dG.A0q(r3)
            java.util.Iterator r3 = r3.iterator()
        L73:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7e
            X.AbstractC37304Gc5.A1H(r4, r1, r3)
            goto L73
        L7d:
            r1 = r6
        L7e:
            java.lang.String r16 = r2.A0Y()
            X.JKh r0 = r2.CAG()
            if (r0 == 0) goto L8c
            X.H6w r6 = r0.F3S()
        L8c:
            java.lang.String r17 = X.AbstractC37304Gc5.A0f(r2)
            X.1pJ r4 = new X.1pJ
            r18 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HWE.F5H(X.1DY):X.1pJ");
    }

    @Override // X.InterfaceC37821pL
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I2T.A00(this));
    }

    @Override // X.InterfaceC37821pL
    public final Long AYJ() {
        return A0L(501281532);
    }

    @Override // X.InterfaceC37821pL
    public final String AYe() {
        return A0i(1583739286);
    }

    @Override // X.InterfaceC37821pL
    public final String Aqt() {
        return A0i(-967891612);
    }

    @Override // X.InterfaceC37821pL
    public final String Ar0() {
        return A0i(1492668633);
    }

    @Override // X.InterfaceC37821pL
    public final Long BF7() {
        return AbstractC37303Gc4.A0P(this);
    }

    @Override // X.InterfaceC37821pL
    public final Long Bly() {
        return A0L(501699126);
    }

    @Override // X.InterfaceC37821pL
    public final String CAR() {
        return AbstractC37304Gc5.A0f(this);
    }

    @Override // X.InterfaceC37821pL
    public final String getAudioClusterId() {
        return A0i(1025801609);
    }

    @Override // X.InterfaceC37821pL
    public final String getTitle() {
        return A0Y();
    }
}
