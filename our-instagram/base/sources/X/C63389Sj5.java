package X;

import android.util.SparseBooleanArray;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import java.util.ArrayList;

/* renamed from: X.Sj5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63389Sj5 {
    public final SparseBooleanArray A00 = new SparseBooleanArray();
    public final C62668SLf A01;
    public final SZN A02;

    public static void A00(C63389Sj5 c63389Sj5, ReactShadowNode reactShadowNode) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        int i = reactShadowNodeImpl.A00;
        SparseBooleanArray sparseBooleanArray = c63389Sj5.A00;
        if (!sparseBooleanArray.get(i)) {
            sparseBooleanArray.put(i, true);
            int i2 = reactShadowNodeImpl.A04;
            int i3 = reactShadowNodeImpl.A05;
            for (ReactShadowNodeImpl reactShadowNodeImpl2 = reactShadowNodeImpl.A09; reactShadowNodeImpl2 != null && reactShadowNodeImpl2.BWB() != C05F.A00; reactShadowNodeImpl2 = reactShadowNodeImpl2.A09) {
                if (!reactShadowNodeImpl2.Cfz()) {
                    i2 += Math.round(reactShadowNodeImpl2.BMd());
                    i3 += Math.round(reactShadowNodeImpl2.BMe());
                }
            }
            c63389Sj5.A04(reactShadowNode, i2, i3);
        }
    }

    public static void A01(C63389Sj5 c63389Sj5, ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        int BWC = reactShadowNode.BWC(((ReactShadowNodeImpl) reactShadowNode).A06(i));
        Integer BWB = reactShadowNode.BWB();
        Integer num = C05F.A00;
        if (BWB != num) {
            while (reactShadowNode.BWB() != num) {
                ReactShadowNodeImpl reactShadowNodeImpl = ((ReactShadowNodeImpl) reactShadowNode).A09;
                if (reactShadowNodeImpl != null) {
                    BWC = BWC + (AbstractC167007dF.A1X(reactShadowNode.BWB(), C05F.A01) ? 1 : 0) + reactShadowNodeImpl.BWC(reactShadowNode);
                    reactShadowNode = reactShadowNodeImpl;
                } else {
                    return;
                }
            }
        }
        if (reactShadowNode2.BWB() != C05F.A0C) {
            c63389Sj5.A06(reactShadowNode, reactShadowNode2, BWC);
        } else {
            c63389Sj5.A05(reactShadowNode, reactShadowNode2, BWC);
        }
    }

    public static void A02(C63389Sj5 c63389Sj5, ReactShadowNode reactShadowNode, SKS sks) {
        int indexOf;
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        ReactShadowNodeImpl reactShadowNodeImpl2 = reactShadowNodeImpl.A09;
        if (reactShadowNodeImpl2 == null) {
            reactShadowNode.EWX(false);
            return;
        }
        ArrayList arrayList = reactShadowNodeImpl2.A0F;
        if (arrayList == null) {
            indexOf = -1;
        } else {
            indexOf = arrayList.indexOf(reactShadowNodeImpl);
        }
        reactShadowNodeImpl2.EF7(indexOf);
        A03(c63389Sj5, reactShadowNode, false);
        reactShadowNode.EWX(false);
        SZN szn = c63389Sj5.A02;
        R3N r3n = reactShadowNodeImpl.A0A;
        AbstractC05810Sj.A00(r3n);
        int i = reactShadowNodeImpl.A00;
        String str = reactShadowNodeImpl.A0E;
        AbstractC05810Sj.A00(str);
        szn.A01(sks, r3n, str, i);
        reactShadowNodeImpl2.A88(reactShadowNode, indexOf);
        A01(c63389Sj5, reactShadowNodeImpl2, reactShadowNode, indexOf);
        for (int i2 = 0; i2 < reactShadowNode.AnZ(); i2++) {
            A01(c63389Sj5, reactShadowNode, reactShadowNodeImpl.A06(i2), i2);
        }
        AbstractC05810Sj.A02(AbstractC167007dF.A1M(reactShadowNodeImpl.A01));
        boolean z = true;
        SparseBooleanArray sparseBooleanArray = c63389Sj5.A00;
        sparseBooleanArray.size();
        if (sparseBooleanArray.size() != 0) {
            z = false;
        }
        AbstractC05810Sj.A02(z);
        A00(c63389Sj5, reactShadowNode);
        for (int i3 = 0; i3 < reactShadowNode.AnZ(); i3++) {
            A00(c63389Sj5, reactShadowNodeImpl.A06(i3));
        }
        sparseBooleanArray.clear();
    }

    private void A06(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        ReactShadowNodeImpl reactShadowNodeImpl2 = (ReactShadowNodeImpl) reactShadowNode2;
        Integer BWB = reactShadowNodeImpl.BWB();
        Integer num = C05F.A00;
        boolean z = true;
        AbstractC05810Sj.A02(AbstractC167007dF.A1X(BWB, num));
        if (reactShadowNodeImpl2.BWB() == C05F.A0C) {
            z = false;
        }
        AbstractC05810Sj.A02(z);
        ArrayList arrayList = reactShadowNodeImpl.A0G;
        if (arrayList == null) {
            arrayList = AbstractC25225BEi.A17(4);
            reactShadowNodeImpl.A0G = arrayList;
        }
        arrayList.add(i, reactShadowNodeImpl2);
        reactShadowNodeImpl2.A08 = reactShadowNodeImpl;
        SZN szn = this.A02;
        int i2 = reactShadowNodeImpl.A00;
        szn.A0F.add(new C60532R5f(szn, null, null, new C62959SZc[]{new C62959SZc(reactShadowNodeImpl2.A00, i)}, i2));
        if (reactShadowNode2.BWB() != num) {
            A05(reactShadowNode, reactShadowNode2, i + 1);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0059. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:115:0x001a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x001f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x001a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x001f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x001a A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x001a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A07(X.SKS r9) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63389Sj5.A07(X.SKS):boolean");
    }

    public C63389Sj5(C62668SLf c62668SLf, SZN szn) {
        this.A02 = szn;
        this.A01 = c62668SLf;
    }

    public static void A03(C63389Sj5 c63389Sj5, ReactShadowNode reactShadowNode, boolean z) {
        int[] iArr;
        if (reactShadowNode.BWB() != C05F.A00) {
            for (int AnZ = reactShadowNode.AnZ() - 1; AnZ >= 0; AnZ--) {
                A03(c63389Sj5, ((ReactShadowNodeImpl) reactShadowNode).A06(AnZ), z);
            }
        }
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        ReactShadowNodeImpl reactShadowNodeImpl2 = reactShadowNodeImpl.A08;
        if (reactShadowNodeImpl2 != null) {
            AbstractC05810Sj.A00(reactShadowNodeImpl2.A0G);
            int indexOf = reactShadowNodeImpl2.A0G.indexOf(reactShadowNodeImpl);
            AbstractC05810Sj.A00(reactShadowNodeImpl2.A0G);
            ((ReactShadowNodeImpl) reactShadowNodeImpl2.A0G.remove(indexOf)).A08 = null;
            SZN szn = c63389Sj5.A02;
            int i = reactShadowNodeImpl2.A00;
            int[] iArr2 = {indexOf};
            if (z) {
                iArr = new int[]{reactShadowNodeImpl.A00};
            } else {
                iArr = null;
            }
            szn.A0F.add(new C60532R5f(szn, iArr2, iArr, null, i));
        }
    }

    private void A04(ReactShadowNode reactShadowNode, int i, int i2) {
        ReactShadowNodeImpl reactShadowNodeImpl;
        ReactShadowNodeImpl reactShadowNodeImpl2;
        if (reactShadowNode.BWB() != C05F.A0C && (reactShadowNodeImpl2 = (reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode).A08) != null) {
            int i3 = reactShadowNodeImpl.A00;
            SZN szn = this.A02;
            ReactShadowNodeImpl reactShadowNodeImpl3 = reactShadowNodeImpl.A07;
            if (reactShadowNodeImpl3 == null) {
                reactShadowNodeImpl3 = reactShadowNodeImpl2;
            }
            szn.A0F.add(new C60533R5g(szn, reactShadowNodeImpl.A0B.getLayoutDirection(), reactShadowNodeImpl3.A00, i3, i, i2, reactShadowNodeImpl.A03, reactShadowNodeImpl.A02));
            return;
        }
        for (int i4 = 0; i4 < reactShadowNode.AnZ(); i4++) {
            ReactShadowNodeImpl A06 = ((ReactShadowNodeImpl) reactShadowNode).A06(i4);
            int i5 = A06.A00;
            SparseBooleanArray sparseBooleanArray = this.A00;
            if (!sparseBooleanArray.get(i5)) {
                sparseBooleanArray.put(i5, true);
                A04(A06, A06.A04 + i, A06.A05 + i2);
            }
        }
    }

    private void A05(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        int size;
        int size2;
        AbstractC05810Sj.A02(AbstractC25229BEm.A1a(reactShadowNode2.BWB(), C05F.A00));
        for (int i2 = 0; i2 < reactShadowNode2.AnZ(); i2++) {
            ReactShadowNodeImpl A06 = ((ReactShadowNodeImpl) reactShadowNode2).A06(i2);
            AbstractC05810Sj.A02(AbstractC25229BEm.A1Z(A06.A08));
            ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
            ArrayList arrayList = reactShadowNodeImpl.A0G;
            if (arrayList == null) {
                size = 0;
            } else {
                size = arrayList.size();
            }
            if (A06.BWB() == C05F.A0C) {
                A05(reactShadowNode, A06, i);
            } else {
                A06(reactShadowNode, A06, i);
            }
            ArrayList arrayList2 = reactShadowNodeImpl.A0G;
            if (arrayList2 == null) {
                size2 = 0;
            } else {
                size2 = arrayList2.size();
            }
            i += size2 - size;
        }
    }
}
