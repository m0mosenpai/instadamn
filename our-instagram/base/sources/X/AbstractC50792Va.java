package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.litho.ComponentsSystrace;
import java.util.HashMap;

/* renamed from: X.2Va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50792Va extends AbstractC50812Vc implements InterfaceC50822Vd, C2VC, C2VD, InterfaceC50832Ve, InterfaceC50852Vg {
    public static final C2XI[] A03 = new C2XI[0];
    public C50932Vp A00;
    public String A01;
    public final String A02;

    @Override // X.AbstractC50812Vc
    public final boolean A0M(AbstractC50812Vc abstractC50812Vc) {
        return A19(abstractC50812Vc, false);
    }

    public int A0Y(C2XE c2xe, C2WI c2wi) {
        return 0;
    }

    public int A0Z(C2XE c2xe, C2WI c2wi, int i, int i2) {
        return Integer.MIN_VALUE;
    }

    public AbstractC50812Vc A0b() {
        return null;
    }

    public C2WI A0e() {
        return null;
    }

    public InterfaceC115915Mh A0f() {
        return null;
    }

    public void A0j(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C2XE c2xe, C2WI c2wi) {
    }

    public void A0k(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C2XE c2xe, C2WI c2wi, int i, boolean z) {
    }

    public void A0l(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C2XE c2xe, C2WI c2wi, int i, int i2, int i3) {
    }

    public void A0m(C2XE c2xe) {
    }

    public void A0n(C2XE c2xe) {
    }

    public void A0o(C2XE c2xe) {
    }

    public void A0p(C2XE c2xe) {
    }

    public void A0q(C2XE c2xe, C2XM c2xm) {
    }

    public void A0s(C2XE c2xe, C2WI c2wi, C2W6 c2w6) {
    }

    public void A0t(C2XE c2xe, C2WI c2wi, Object obj) {
    }

    public void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
    }

    public void A0v(C2XE c2xe, C2WI c2wi, Object obj) {
    }

    public void A0w(C2XE c2xe, C2WI c2wi, Object obj) {
    }

    public void A0x(C2XE c2xe, AbstractC50922Vo abstractC50922Vo) {
    }

    public void A0y(C2WI c2wi, C2WI c2wi2) {
    }

    public void A0z(InterfaceC115915Mh interfaceC115915Mh, InterfaceC115915Mh interfaceC115915Mh2) {
    }

    public boolean A10() {
        return false;
    }

    public boolean A11() {
        return false;
    }

    public boolean A12() {
        return false;
    }

    public boolean A13() {
        return false;
    }

    public boolean A14() {
        return false;
    }

    public boolean A15() {
        return false;
    }

    public boolean A16() {
        return false;
    }

    public boolean A17() {
        return false;
    }

    public boolean A18(Bundle bundle, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C2XE c2xe, C2WI c2wi, int i, int i2) {
        return false;
    }

    @Override // X.InterfaceC50822Vd
    public boolean AFr() {
        return false;
    }

    @Override // X.C2VD
    @Deprecated
    public final C2VC B2i() {
        return this;
    }

    @Override // X.InterfaceC50822Vd
    public int E4c() {
        return 3;
    }

    @Override // X.AbstractC50812Vc
    public C78063eY A0F(BB3 bb3, C76133bI c76133bI, C2Y5 c2y5, int i, int i2) {
        C2W1 c2w1;
        AbstractC50812Vc A0c;
        Integer A01 = AbstractC50692Uq.A01("Litho.Resolve.ComponentRendered");
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        C2XE c2xe = c2y5.A04;
        Integer A0Q = A0Q();
        Integer num = C05F.A00;
        boolean z = false;
        if (A0Q != num) {
            z = true;
        }
        try {
            if (z) {
                c2w1 = new C2W1();
                c2w1.A0U = EnumC77003cm.COLUMN;
                if (A01 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("component", A0H());
                    hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0H());
                    AbstractC50692Uq.A05("Litho.Resolve.ComponentRendered", String.valueOf(c76133bI.A06), hashMap, A01.intValue());
                }
                if (isTracing) {
                    ComponentsSystrace.A02(AnonymousClass001.A0R("render:", A0H()));
                }
                A0p(c2xe);
            } else if (A0Q == num) {
                if (A01 != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("component", A0H());
                    hashMap2.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0H());
                    AbstractC50692Uq.A05("Litho.Resolve.ComponentRendered", String.valueOf(c76133bI.A06), hashMap2, A01.intValue());
                }
                if (isTracing) {
                    ComponentsSystrace.A02(AnonymousClass001.A0R("render:", A0H()));
                }
                if (AbstractC50812Vc.A02(this)) {
                    A0c = A0d(c2xe, i, i2);
                } else {
                    A0c = A0c(c2xe);
                }
                if (isTracing) {
                    ComponentsSystrace.A01();
                }
                if (A01 != null) {
                    AbstractC50692Uq.A02(A01.intValue());
                }
                if (A0c != null) {
                    c2w1 = C76163bL.A02(A0c, c2xe, c76133bI);
                } else {
                    c2w1 = new C78073eZ();
                }
                if (c2w1 != null) {
                    C76163bL.A0A(c2w1, null, null);
                }
            } else {
                c2w1 = null;
            }
            return new C78063eY(this.A00, c2w1);
        } finally {
            if (isTracing) {
                ComponentsSystrace.A01();
            }
            if (A01 != null) {
                AbstractC50692Uq.A02(A01.intValue());
            }
        }
    }

    @Override // X.AbstractC50812Vc
    /* renamed from: A0L */
    public final boolean CTz(AbstractC50812Vc abstractC50812Vc) {
        return A0O(abstractC50812Vc, C2V3.shouldCompareCommonPropsInIsEquivalentTo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0080, code lost:
    
        if (r2 != null) goto L45;
     */
    @Override // X.AbstractC50812Vc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0O(X.AbstractC50812Vc r9, boolean r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L1b
            boolean r0 = r9 instanceof X.AbstractC50792Va
            if (r0 == 0) goto L1b
            r0 = r9
            X.2Va r0 = (X.AbstractC50792Va) r0
            if (r0 == 0) goto L13
            X.2Vp r1 = r8.A00
            X.2Vp r0 = r0.A00
            if (r1 != 0) goto L15
            if (r0 == 0) goto L1b
        L13:
            r0 = 0
            return r0
        L15:
            boolean r0 = r1.CTz(r0)
            if (r0 == 0) goto L13
        L1b:
            X.2V3 r0 = X.C2V3.defaultInstance
            java.lang.Integer r0 = r0.A04
            int r1 = r0.intValue()
            r2 = 1
            r0 = 2
            if (r1 == r0) goto L31
            if (r1 != r2) goto L87
            java.lang.Integer r1 = r8.A0Q()
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L87
        L31:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            if (r8 == r9) goto L82
            r7 = 0
            if (r9 == 0) goto L7c
            java.lang.Class r1 = r8.getClass()
            java.lang.Class r0 = r9.getClass()
            if (r1 != r0) goto L7c
            int r1 = r8.A00
            int r0 = r9.A00
            if (r1 == r0) goto L82
            java.lang.Object[] r6 = r8.A0X()
            java.lang.Object[] r5 = r9.A0X()
            if (r6 == 0) goto L87
            if (r5 == 0) goto L87
            int r4 = r6.length
            int r0 = r5.length
            if (r4 != r0) goto L7c
            r3 = 0
        L5b:
            if (r3 >= r4) goto L7b
            r2 = r6[r3]
            r1 = r5[r3]
            boolean r0 = r2 instanceof X.AbstractC50812Vc
            if (r0 == 0) goto L76
            boolean r0 = r1 instanceof X.AbstractC50812Vc
            if (r0 == 0) goto L76
            X.2Vc r2 = (X.AbstractC50812Vc) r2
            X.2Vc r1 = (X.AbstractC50812Vc) r1
            boolean r0 = X.C51372Xk.A04(r2, r1, r10)
        L71:
            if (r0 == 0) goto L7c
            int r3 = r3 + 1
            goto L5b
        L76:
            boolean r0 = X.AbstractC78713fd.A02(r2, r1)
            goto L71
        L7b:
            r7 = 1
        L7c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            if (r2 == 0) goto L87
        L82:
            boolean r0 = r2.booleanValue()
            return r0
        L87:
            boolean r0 = r8.A19(r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC50792Va.A0O(X.2Vc, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.2Vp] */
    public final C50932Vp A0a() {
        C50932Vp c50932Vp = this.A00;
        if (c50932Vp == null) {
            ?? obj = new Object();
            this.A00 = obj;
            return obj;
        }
        return c50932Vp;
    }

    public Object A0h(C2V9 c2v9, Object obj) {
        if (c2v9.A01 == -1048037474) {
            C2XE c2xe = c2v9.A00.A00;
            c2xe.getClass();
            C2Y5 c2y5 = c2xe.A05;
            c2y5.getClass();
            C2V9 c2v92 = c2y5.A01;
            c2v92.getClass();
            c2v92.A00(obj);
            return null;
        }
        return null;
    }

    public void A0i(int i, Object obj, Object obj2) {
        throw new RuntimeException("Components that have dynamic Props must override this method");
    }

    public void A0r(C2XE c2xe, C2WI c2wi, C2Vj c2Vj, C2W6 c2w6, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("You must override onMeasure() if you return true in canMeasure(), Component is: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public C2XI[] A1A() {
        return A03;
    }

    @Override // X.C2VC
    public final Object APq(C2V9 c2v9, Object obj) {
        Object obj2;
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        try {
            if (c2v9.A01 == -1048037474) {
                if (isTracing) {
                    ComponentsSystrace.A02(AnonymousClass001.A11("onError:", A0H(), "(", AbstractC75733ae.A00(obj.getClass()), ")"));
                }
                obj2 = A0h(c2v9, obj);
            } else {
                if (isTracing) {
                    ComponentsSystrace.A02(AnonymousClass001.A11("onEvent:", A0H(), "(", AbstractC75733ae.A00(obj.getClass()), ")"));
                }
                try {
                    obj2 = A0h(c2v9, obj);
                } catch (Exception e) {
                    C2XE c2xe = c2v9.A00.A00;
                    if (c2xe != null) {
                        C51372Xk.A03(c2xe, e);
                        obj2 = null;
                    } else {
                        throw e;
                    }
                }
            }
            return obj2;
        } finally {
            if (isTracing) {
                ComponentsSystrace.A01();
            }
        }
    }

    @Override // X.InterfaceC50822Vd
    public /* synthetic */ C2V6 BeU() {
        return C77603dk.A00;
    }

    @Override // X.AbstractC50812Vc, X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return A0O((AbstractC50812Vc) obj, C2V3.shouldCompareCommonPropsInIsEquivalentTo);
    }

    public AbstractC50792Va(String str) {
        this.A02 = str;
    }

    @Override // X.AbstractC50812Vc
    public final String A0H() {
        AbstractC50812Vc A0b = A0b();
        if (A0b == null) {
            return this.A02;
        }
        String str = this.A02;
        while (A0b instanceof AbstractC50792Va) {
            AbstractC50792Va abstractC50792Va = (AbstractC50792Va) A0b;
            if (abstractC50792Va.A0b() == null) {
                break;
            }
            A0b = abstractC50792Va.A0b();
        }
        return AnonymousClass001.A0u(str, "(", A0b.A0H(), ")");
    }

    public AbstractC50812Vc A0c(C2XE c2xe) {
        return AbstractC25559BRw.A00(c2xe).A00;
    }

    public AbstractC50812Vc A0d(C2XE c2xe, int i, int i2) {
        return AbstractC25559BRw.A00(c2xe).A00;
    }

    public AbstractC50922Vo A0g() {
        throw new RuntimeException("createStateContainer has not been implemented!");
    }

    public boolean A19(AbstractC50812Vc abstractC50812Vc, boolean z) {
        return super.A0M(abstractC50812Vc);
    }

    @Override // X.InterfaceC50822Vd
    public final Object ALq(Context context) {
        Object A0G = A0G(context);
        if (A0G != null) {
            return A0G;
        }
        throw new RuntimeException(AnonymousClass001.A0R("Component created null mount content, but mount content must never be null! Component: ", A0H()));
    }

    @Override // X.InterfaceC50822Vd
    public final Object BeR() {
        return getClass();
    }

    @Override // X.InterfaceC50822Vd
    public final Integer Bmh() {
        Integer A0Q = A0Q();
        Integer num = C05F.A01;
        if (A0Q == num) {
            return C05F.A00;
        }
        return num;
    }

    @Override // X.InterfaceC50822Vd
    public C2Wm D8D(int i) {
        return new C51152Wl(getClass(), i);
    }
}
