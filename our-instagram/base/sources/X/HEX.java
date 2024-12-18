package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class HEX extends C2US {
    public final C155946zO A00;
    public final HFS A01;
    public final HF1 A02;
    public final C42882Ixw A03;
    public final C152996uT A04;
    public final C38U A05;
    public final InterfaceC62602sz A06;
    public final C65842yM A07;
    public final List A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HEX(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C38N c38n, C42882Ixw c42882Ixw, C38U c38u, InterfaceC62602sz interfaceC62602sz, List list, boolean z) {
        super(false);
        AbstractC25234BEr.A0k(2, userSession, c38u, interfaceC62602sz, c42882Ixw);
        this.A08 = list;
        this.A05 = c38u;
        this.A06 = interfaceC62602sz;
        this.A03 = c42882Ixw;
        this.A09 = z;
        C152996uT c152996uT = new C152996uT(context);
        this.A04 = c152996uT;
        C65842yM c65842yM = new C65842yM(context);
        this.A07 = c65842yM;
        HFS hfs = new HFS(interfaceC60442pS, userSession, null, c38n);
        this.A01 = hfs;
        HF1 hf1 = new HF1(userSession, interfaceC60442pS);
        this.A02 = hf1;
        this.A00 = new C155946zO(null, c38u, C05F.A0C);
        init(c152996uT, c65842yM, hfs, hf1);
    }

    public static void A00(HCU hcu) {
        ((HEX) hcu.A06.getValue()).A01();
    }

    @Override // X.C2UT, android.widget.Adapter
    public final boolean isEmpty() {
        if (this.A00.A02() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (X.AbstractC001800i.A0u(r6, r5) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r14 = this;
            r14.clear()
            X.6zO r3 = r14.A00
            r3.A06()
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L80
            int r2 = r3.A02()
            r11 = 0
        L13:
            if (r11 >= r2) goto L8d
            r0 = 3
            int r9 = r11 / r0
            int r10 = r11 % r0
            java.util.List r0 = r3.A01
            java.lang.Object r1 = r0.get(r11)
            X.1qM r1 = (X.C38321qM) r1
            int r12 = X.AbstractC76283bY.A00(r1)
            r0 = 2
            r13 = 0
            if (r10 >= r0) goto L2b
            r13 = 1
        L2b:
            X.IIu r8 = new X.IIu
            r8.<init>(r9, r10, r11, r12, r13)
            X.JLg r7 = X.AbstractC82403m3.A03(r1)
            if (r7 == 0) goto L5d
            java.util.List r6 = r14.A08
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L5d
            X.JLH r0 = r7.BcS()
            r5 = 0
            if (r0 == 0) goto L7e
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r0 = r0.C0K()
        L49:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r4 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.A0E
            if (r0 == r4) goto L65
            X.JLH r0 = r7.BcS()
            if (r0 == 0) goto L57
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r5 = r0.C0K()
        L57:
            boolean r0 = X.AbstractC001800i.A0u(r6, r5)
            if (r0 == 0) goto L65
        L5d:
            X.HFS r0 = r14.A01
        L5f:
            r14.addModel(r1, r8, r0)
        L62:
            int r11 = r11 + 1
            goto L13
        L65:
            X.JLH r0 = r7.BcS()
            if (r0 == 0) goto L62
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r0 = r0.C0K()
            if (r0 != r4) goto L62
            boolean r0 = r6.contains(r4)
            if (r0 == 0) goto L62
            boolean r0 = r14.A09
            if (r0 == 0) goto L5d
            X.HF1 r0 = r14.A02
            goto L5f
        L7e:
            r0 = r5
            goto L49
        L80:
            X.Ixw r0 = r14.A03
            X.73r r2 = r0.Afz()
            X.6up r1 = r0.A00
            X.6uT r0 = r14.A04
            r14.addModel(r2, r1, r0)
        L8d:
            X.2sz r1 = r14.A06
            boolean r0 = r1.CLJ()
            if (r0 != 0) goto L9b
            boolean r0 = r1.CUG()
            if (r0 == 0) goto La0
        L9b:
            X.2yM r0 = r14.A07
            r14.addModel(r1, r0)
        La0:
            r14.notifyDataSetChangedSmart()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HEX.A01():void");
    }
}
