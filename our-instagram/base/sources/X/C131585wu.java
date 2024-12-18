package X;

import com.facebook.rendercore.RenderTreeNode;
import java.util.LinkedHashSet;

/* renamed from: X.5wu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131585wu extends C51092Wf {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.6Vr, java.lang.Object] */
    @Override // X.C51092Wf
    public final void A0E(C3h4 c3h4, C2WC c2wc, C2WC c2wc2, Object obj, Object obj2, Object obj3) {
        long[] jArr;
        long A0H = (((int) c2wc.A0H()) << 27) | Long.MIN_VALUE;
        C103054kg A00 = AbstractC103044kf.A00();
        if (A00 == null) {
            super.A0E(c3h4, c2wc, c2wc2, obj, obj2, obj3);
            return;
        }
        ?? obj4 = new Object();
        Object obj5 = C103054kg.A00()[1];
        C103054kg.A00()[1] = obj4;
        try {
            Object obj6 = obj5;
            if (!(obj5 instanceof C140136Vr)) {
                obj6 = null;
            }
            C140136Vr c140136Vr = (C140136Vr) obj6;
            super.A0E(c3h4, c2wc, c2wc2, obj, obj2, obj3);
            if (!obj4.A01() && c140136Vr != null) {
                c140136Vr.A00(A0H);
            }
            C103054kg.A00()[1] = obj5;
            if (obj4.A01()) {
                return;
            }
            C140056Vj c140056Vj = A00.A03;
            LinkedHashSet linkedHashSet = obj4.A00;
            if (linkedHashSet != null) {
                jArr = AbstractC001800i.A0y(linkedHashSet);
            } else {
                jArr = null;
            }
            c140056Vj.A01(new C140126Vq(null, null, jArr), A0H, false);
        } catch (Throwable th) {
            C103054kg.A00()[1] = obj5;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.6Vr, java.lang.Object] */
    @Override // X.C51092Wf
    public final void A0G(RenderTreeNode renderTreeNode) {
        long[] jArr;
        C14360o3.A0B(renderTreeNode, 0);
        if (AbstractC103044kf.A00() != null) {
            long A0H = (((int) renderTreeNode.A06.A0H()) << 27) | Long.MIN_VALUE;
            C103054kg A00 = AbstractC103044kf.A00();
            if (A00 != null) {
                ?? obj = new Object();
                Object obj2 = C103054kg.A00()[1];
                C103054kg.A00()[1] = obj;
                try {
                    Object obj3 = obj2;
                    if (!(obj2 instanceof C140136Vr)) {
                        obj3 = null;
                    }
                    C140136Vr c140136Vr = (C140136Vr) obj3;
                    super.A0G(renderTreeNode);
                    if (!obj.A01() && c140136Vr != null) {
                        c140136Vr.A00(A0H);
                    }
                    C103054kg.A00()[1] = obj2;
                    if (!obj.A01()) {
                        C140056Vj c140056Vj = A00.A03;
                        LinkedHashSet linkedHashSet = obj.A00;
                        if (linkedHashSet != null) {
                            jArr = AbstractC001800i.A0y(linkedHashSet);
                        } else {
                            jArr = null;
                        }
                        c140056Vj.A01(new C140126Vq(null, null, jArr), A0H, false);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    C103054kg.A00()[1] = obj2;
                    throw th;
                }
            }
        }
        super.A0G(renderTreeNode);
    }

    @Override // X.C51092Wf
    public final boolean A0I(C2WC c2wc, C2WC c2wc2, Object obj, Object obj2) {
        boolean A0I = super.A0I(c2wc, c2wc2, obj, obj2);
        C103054kg A00 = AbstractC103044kf.A00();
        if (A00 != null && !A0I) {
            long A0H = (((int) c2wc2.A0H()) << 27) | Long.MIN_VALUE;
            C140056Vj c140056Vj = A00.A04;
            if (c140056Vj != null && c140056Vj.A00(A0H) != null && VSG.A00(A0H)) {
                return true;
            }
            return false;
        }
        return A0I;
    }
}
