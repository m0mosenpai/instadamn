package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Bpv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26660Bpv extends AbstractC50792Va {

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public android.net.Uri A00;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public C27771Wf A01;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public Integer A02;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public Object A03;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public String A04;

    @Override // X.AbstractC50812Vc
    public final boolean A0S() {
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0T() {
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0U() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final void A0j(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C2XE c2xe, C2WI c2wi) {
        C14360o3.A0B(accessibilityNodeInfoCompat, 2);
        accessibilityNodeInfoCompat.setClassName(AbstractC111324zv.A00(346));
    }

    @Override // X.AbstractC50792Va
    public final void A0p(C2XE c2xe) {
        C1W1 c1w1 = null;
        c2xe.A05(ContextChain.class);
        Integer num = this.A02;
        A03(c2xe);
        Boolean A0a = AbstractC166997dE.A0a();
        C59232nO.A02();
        C59232nO.A02();
        if (num == null) {
            num = C05F.A00;
        }
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                C59232nO.A02();
            }
        } else {
            synchronized (C59232nO.class) {
                C1WP.A01.Bfa();
            }
            c1w1 = C27711Vz.A00;
        }
        C2Y5 c2y5 = c2xe.A05;
        c2y5.getClass();
        ((C28941Cpp) c2y5.A05).A00 = c1w1;
        C2Y5 c2y52 = c2xe.A05;
        c2y52.getClass();
        ((C28941Cpp) c2y52.A05).A01 = A0a;
    }

    @Override // X.AbstractC50792Va
    public final void A0s(C2XE c2xe, C2WI c2wi, C2W6 c2w6) {
        int i;
        int i2;
        c2xe.A05(ContextChain.class);
        C27771Wf c27771Wf = this.A01;
        c2xe.A05.getClass();
        boolean A1Y = AbstractC25229BEm.A1Y(c2w6);
        if (c27771Wf == null) {
            C59232nO.A02();
        }
        int A05 = c2w6.A05();
        int A00 = c2w6.A00();
        if (c2w6.A00) {
            i = c2w6.A02() + c2w6.A03();
            i2 = c2w6.A04() + c2w6.A01();
        } else {
            i = 0;
            i2 = 0;
        }
        Rect rect = new Rect(A1Y ? 1 : 0, A1Y ? 1 : 0, A05 - i, A00 - i2);
        C59232nO.A02();
        C28937Cpl c28937Cpl = (C28937Cpl) c2wi;
        c28937Cpl.A00 = rect;
        c28937Cpl.A02 = null;
        c28937Cpl.A01 = null;
    }

    @Override // X.AbstractC50792Va
    public final boolean A13() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A17() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r1.equals(r0) == false) goto L12;
     */
    @Override // X.AbstractC50792Va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A19(X.AbstractC50812Vc r5, boolean r6) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L6a
            r2 = 0
            if (r5 == 0) goto L1e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L1e
            X.Bpv r5 = (X.C26660Bpv) r5
            java.lang.Object r1 = r4.A03
            java.lang.Object r0 = r5.A03
            if (r1 == 0) goto L1f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L22
        L1e:
            return r2
        L1f:
            if (r0 == 0) goto L22
            return r2
        L22:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 != 0) goto L1e
            X.1Wf r1 = r4.A01
            X.1Wf r0 = r5.A01
            if (r1 == 0) goto L37
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3a
            return r2
        L37:
            if (r0 == 0) goto L3a
            return r2
        L3a:
            java.lang.Integer r1 = r4.A02
            java.lang.Integer r0 = r5.A02
            if (r1 == 0) goto L47
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4a
            return r2
        L47:
            if (r0 == 0) goto L4a
            return r2
        L4a:
            android.net.Uri r1 = r4.A00
            android.net.Uri r0 = r5.A00
            if (r1 == 0) goto L57
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5a
            return r2
        L57:
            if (r0 == 0) goto L5a
            return r2
        L5a:
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r5.A04
            if (r1 == 0) goto L67
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6a
            return r2
        L67:
            if (r0 == 0) goto L6a
            return r2
        L6a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26660Bpv.A19(X.2Vc, boolean):boolean");
    }

    @Override // X.AbstractC50792Va, X.InterfaceC50822Vd
    public final boolean AFr() {
        return true;
    }

    @Override // X.AbstractC50792Va, X.InterfaceC50822Vd
    public final int E4c() {
        return 15;
    }

    public C26660Bpv() {
        super("FrescoVitoImage2");
        this.A02 = AbstractC27752CLt.A00;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0V(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2, AbstractC50922Vo abstractC50922Vo, AbstractC50922Vo abstractC50922Vo2) {
        android.net.Uri uri;
        android.net.Uri uri2;
        C27771Wf c27771Wf;
        Float A0m;
        C26660Bpv c26660Bpv = (C26660Bpv) abstractC50812Vc;
        C26660Bpv c26660Bpv2 = (C26660Bpv) abstractC50812Vc2;
        Float f = null;
        if (c26660Bpv == null) {
            uri = null;
        } else {
            uri = c26660Bpv.A00;
        }
        if (c26660Bpv2 == null) {
            uri2 = null;
        } else {
            uri2 = c26660Bpv2.A00;
        }
        C27771Wf c27771Wf2 = null;
        if (c26660Bpv != null) {
            c27771Wf2 = c26660Bpv.A01;
        }
        if (c26660Bpv2 == null) {
            c27771Wf = null;
        } else {
            c27771Wf = c26660Bpv2.A01;
        }
        if (c26660Bpv == null) {
            A0m = null;
        } else {
            A0m = AbstractC25227BEk.A0m();
        }
        if (c26660Bpv2 != null) {
            f = AbstractC25227BEk.A0m();
        }
        if (C02O.A00(uri, uri2) && C02O.A00(c27771Wf2, c27771Wf) && C02O.A00(A0m, f)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0W(C2XE c2xe, C2XE c2xe2) {
        if (c2xe.A05(ContextChain.class) != null) {
            if (!c2xe.A05(ContextChain.class).equals(c2xe2.A05(ContextChain.class))) {
                return false;
            }
            return true;
        }
        if (c2xe2.A05(ContextChain.class) != null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2WI, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final /* bridge */ /* synthetic */ C2WI A0e() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Mh, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final /* bridge */ /* synthetic */ InterfaceC115915Mh A0f() {
        return new Object();
    }

    @Override // X.AbstractC50792Va
    public final void A0r(C2XE c2xe, C2WI c2wi, C2Vj c2Vj, C2W6 c2w6, int i, int i2) {
        C14360o3.A0B(c2Vj, 4);
        AbstractC85943sO.A01(c2Vj, 1.0f, i, i2);
    }

    @Override // X.AbstractC50792Va
    public final void A0t(C2XE c2xe, C2WI c2wi, Object obj) {
        InterfaceC59242nQ interfaceC59242nQ = (InterfaceC59242nQ) obj;
        Object obj2 = this.A03;
        ContextChain contextChain = (ContextChain) c2xe.A05(ContextChain.class);
        C2nP A03 = A03(c2xe);
        C28937Cpl c28937Cpl = (C28937Cpl) c2wi;
        C2nP c2nP = c28937Cpl.A02;
        C2Y5 c2y5 = c2xe.A05;
        c2y5.getClass();
        C1W1 c1w1 = ((C28941Cpp) c2y5.A05).A00;
        C1W1 c1w12 = c28937Cpl.A01;
        Rect rect = c28937Cpl.A00;
        AbstractC25229BEm.A1J(interfaceC59242nQ, 1, rect);
        if (c2nP == null) {
            c2nP = A03;
        }
        C1WN A00 = C59232nO.A00();
        C14360o3.A0A(c2nP);
        A00.AUt(rect, contextChain, null, null, interfaceC59242nQ, c2nP, null, null, obj2);
        if (c1w1 != null) {
            c1w1.A04();
        }
        if (c1w12 != null) {
            c1w12.A04();
        }
    }

    @Override // X.AbstractC50792Va
    public final void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
        InterfaceC59242nQ interfaceC59242nQ = (InterfaceC59242nQ) obj;
        Object obj2 = this.A03;
        C2nP A03 = A03(c2xe);
        C28937Cpl c28937Cpl = (C28937Cpl) c2wi;
        C2nP c2nP = c28937Cpl.A02;
        C2Y5 c2y5 = c2xe.A05;
        c2y5.getClass();
        C1W1 c1w1 = ((C28941Cpp) c2y5.A05).A00;
        C1W1 c1w12 = c28937Cpl.A01;
        Rect rect = c28937Cpl.A00;
        ContextChain contextChain = (ContextChain) c2xe.A05(ContextChain.class);
        AbstractC25229BEm.A1J(interfaceC59242nQ, 1, rect);
        if (c2nP == null) {
            c2nP = A03;
        }
        interfaceC59242nQ.EZQ(true);
        C59232nO.A02();
        C59232nO.A02();
        C1WN A00 = C59232nO.A00();
        C14360o3.A0A(c2nP);
        A00.AUt(rect, contextChain, null, null, interfaceC59242nQ, c2nP, null, null, obj2);
        if (c1w1 != null) {
            c1w1.A04();
        }
        if (c1w12 != null) {
            c1w12.A04();
        }
    }

    @Override // X.AbstractC50792Va
    public final void A0v(C2XE c2xe, C2WI c2wi, Object obj) {
        InterfaceC59242nQ interfaceC59242nQ = (InterfaceC59242nQ) obj;
        C2Y5 c2y5 = c2xe.A05;
        c2y5.getClass();
        C1W1 c1w1 = ((C28941Cpp) c2y5.A05).A00;
        C1W1 c1w12 = ((C28937Cpl) c2wi).A01;
        C14360o3.A0B(interfaceC59242nQ, 1);
        C59232nO.A02();
        C59232nO.A00().EEG(interfaceC59242nQ);
        if (c1w1 != null) {
            c1w1.A04();
        }
        if (c1w12 != null) {
            c1w12.A04();
        }
    }

    @Override // X.AbstractC50792Va
    public final void A0w(C2XE c2xe, C2WI c2wi, Object obj) {
        InterfaceC59242nQ interfaceC59242nQ = (InterfaceC59242nQ) obj;
        C2Y5 c2y5 = c2xe.A05;
        c2y5.getClass();
        C1W1 c1w1 = ((C28941Cpp) c2y5.A05).A00;
        C1W1 c1w12 = ((C28937Cpl) c2wi).A01;
        C14360o3.A0B(interfaceC59242nQ, 1);
        C59232nO.A02();
        C59232nO.A00().EE1(interfaceC59242nQ);
        if (c1w1 != null) {
            c1w1.A04();
        }
        if (c1w12 != null) {
            c1w12.A04();
        }
    }

    @Override // X.AbstractC50792Va
    public final void A0y(C2WI c2wi, C2WI c2wi2) {
        C28937Cpl c28937Cpl = (C28937Cpl) c2wi;
        C28937Cpl c28937Cpl2 = (C28937Cpl) c2wi2;
        c28937Cpl.A01 = c28937Cpl2.A01;
        c28937Cpl.A02 = c28937Cpl2.A02;
        c28937Cpl.A00 = c28937Cpl2.A00;
    }

    @Override // X.AbstractC50792Va
    public final void A0z(InterfaceC115915Mh interfaceC115915Mh, InterfaceC115915Mh interfaceC115915Mh2) {
        C28941Cpp c28941Cpp = (C28941Cpp) interfaceC115915Mh;
        C28941Cpp c28941Cpp2 = (C28941Cpp) interfaceC115915Mh2;
        c28941Cpp.A01 = c28941Cpp2.A01;
        c28941Cpp.A00 = c28941Cpp2.A00;
    }

    private C2nP A03(C2XE c2xe) {
        InterfaceC59172nI interfaceC59172nI;
        String A08 = c2xe.A08();
        Object c27965CUl = new C27965CUl(this.A00, this.A01, this.A03, A08, this.A04);
        C2nP c2nP = (C2nP) c2xe.A07(c27965CUl, A08, 0);
        if (c2nP == null) {
            String str = this.A04;
            android.net.Uri uri = this.A00;
            C27771Wf c27771Wf = this.A01;
            if (c27771Wf == null) {
                C59232nO.A02();
            }
            C59232nO.A02();
            C27651Vs A01 = C59232nO.A01();
            Resources A0M = AbstractC166997dE.A0M(c2xe.A0C);
            if (uri != null) {
                interfaceC59172nI = C6BY.A00(uri, null);
            } else if (str != null) {
                interfaceC59172nI = C6BY.A01(str);
            } else {
                interfaceC59172nI = C135586Bj.A00;
            }
            C2nP A02 = A01.A02(A0M, c27771Wf, interfaceC59172nI, false);
            c2xe.A0D(c27965CUl, A02, A08, 0);
            return A02;
        }
        return c2nP;
    }

    @Override // X.AbstractC50812Vc
    public final /* bridge */ /* synthetic */ AbstractC50812Vc A0P() {
        return super.A0P();
    }

    @Override // X.AbstractC50812Vc
    public final Integer A0Q() {
        return C05F.A01;
    }

    @Override // X.AbstractC50812Vc
    public final Object A0R(Context context) {
        return C59232nO.A00().AM5();
    }
}
