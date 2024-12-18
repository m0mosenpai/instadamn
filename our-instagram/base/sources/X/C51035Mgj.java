package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mgj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51035Mgj extends AbstractC52922bZ {
    public final UserSession A00;
    public final C1817984o A01;
    public final List A02;
    public final InterfaceC24731Iq A03;
    public final InterfaceC19390xP A04;
    public final InterfaceC19390xP A05;
    public final C05A A06;
    public final OGx A07;
    public final C05A A08;

    public C51035Mgj(UserSession userSession, OGx oGx, C1817984o c1817984o, AudioOverlayTrack audioOverlayTrack, List list) {
        int A07 = AbstractC25230BEn.A07(2, list, oGx);
        this.A00 = userSession;
        this.A02 = list;
        this.A07 = oGx;
        this.A01 = c1817984o;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A03 = c24721Ip;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A08 = A00;
        C008002u A002 = C10E.A00(c16930sl);
        this.A06 = A002;
        this.A04 = AbstractC07080Za.A03(c24721Ip);
        C15150pV A03 = C10Q.A03(C57201Pal.A00, A00, A002);
        this.A05 = AbstractC208910l.A01(new C51660Mrr(c16930sl, c16930sl), AbstractC141776au.A00(this), A03, C10I.A01);
        AbstractC23641Du.A05(C12L.A00.AOT(1632833315, A07), new PZO(this, list, null), AbstractC141776au.A00(this));
        if (audioOverlayTrack != null) {
            A002.Egh(AbstractC16960so.A1M(audioOverlayTrack));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C51035Mgj r6, java.util.Map r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 46
            boolean r0 = X.C57146PWy.A01(r8, r3)
            if (r0 == 0) goto L7a
            r5 = r8
            X.PWy r5 = (X.C57146PWy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L48
            if (r0 == r2) goto L5a
            if (r0 != r3) goto L80
            java.lang.Object r6 = r5.A01
            X.Mgj r6 = (X.C51035Mgj) r6
            X.AbstractC09560e7.A00(r1)
        L2b:
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L2f:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L3f
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r1 = r1.A00
            X.05A r0 = r6.A08
            r0.Egh(r1)
        L3c:
            X.0eB r4 = X.C0eB.A00
            return r4
        L3f:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L3c
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L48:
            X.AbstractC09560e7.A00(r1)
            X.OGx r1 = r6.A07
            r0 = 10
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r1 = r1.A00(r7, r5, r0)
            if (r1 != r4) goto L61
            return r4
        L5a:
            java.lang.Object r6 = r5.A01
            X.Mgj r6 = (X.C51035Mgj) r6
            X.AbstractC09560e7.A00(r1)
        L61:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L2f
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L85
            X.1Iq r1 = r6.A03
            X.NdY r0 = X.C53059NdY.A00
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r0 = r1.EMz(r0, r5)
            if (r0 != r4) goto L2b
            return r4
        L7a:
            X.PWy r5 = new X.PWy
            r5.<init>(r6, r8, r3)
            goto L16
        L80:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L85:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51035Mgj.A00(X.Mgj, java.util.Map, X.1Ds):java.lang.Object");
    }

    public static final LinkedHashMap A01(List list) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        for (Object obj : list) {
            ((List) JQ0.A0h(((C9ZC) obj).A02, A1I)).add(obj);
        }
        LinkedHashMap A0y = AbstractC43594JPz.A0y(A1I);
        Iterator A14 = AbstractC166997dE.A14(A1I);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            Object key = A1K.getKey();
            Iterable<C9ZC> iterable = (Iterable) A1K.getValue();
            LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(iterable));
            for (C9ZC c9zc : iterable) {
                A18.put(c9zc.A01, Float.valueOf(c9zc.A00));
            }
            A0y.put(key, A18);
        }
        return A0y;
    }
}
