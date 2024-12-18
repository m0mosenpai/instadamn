package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Ac, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135276Ac {
    public static final C135266Ab A00(C78473fD c78473fD, C2W5 c2w5, C2W2 c2w2, Object obj, long j) {
        ArrayList arrayList;
        int length;
        C14360o3.A0B(c2w5, 2);
        Context context = c78473fD.A04;
        AbstractC79173gO[] abstractC79173gOArr = c78473fD.A07;
        C2WC c2wc = C6KO.A00;
        C1LN.A01("Reducer.reduceTree");
        int i = 0;
        if (abstractC79173gOArr != null && (length = abstractC79173gOArr.length) != 0) {
            arrayList = new ArrayList(length);
            do {
                arrayList.add(new Pair(abstractC79173gOArr[i], null));
                i++;
            } while (i < length);
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList();
        Rect rect = new Rect(0, 0, c2w5.getWidth(), c2w5.getHeight());
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        RenderTreeNode A00 = C6KO.A00(rect, c2w5, null, C6KO.A00);
        arrayList2.add(A00);
        C6KO.A01(context, c2w5, A00, arrayList2, arrayList, 0, 0);
        RenderTreeNode[] renderTreeNodeArr = (RenderTreeNode[]) arrayList2.toArray(new RenderTreeNode[0]);
        C1LN.A00();
        return new C135266Ab(c2w2, new C79243gV(null, A00, arrayList, renderTreeNodeArr, -1, j), obj, ((C78463fC) c78473fD.A06.getValue()).A00);
    }

    public final C135266Ab A03(C78473fD c78473fD, C2W2 c2w2, Object obj, long j) {
        C14360o3.A0B(c78473fD, 0);
        C14360o3.A0B(c2w2, 1);
        C1LN.A01("RC Layout");
        C2W5 AF9 = c2w2.AF9(c78473fD, j);
        C1LN.A00();
        C1LN.A01("RC Reduce");
        C135266Ab A00 = A00(c78473fD, AF9, c2w2, obj, j);
        C1LN.A00();
        c78473fD.A01 = null;
        return A00;
    }

    public final C78473fD A01(Context context, C135266Ab c135266Ab, Object obj, AbstractC79173gO[] abstractC79173gOArr, int i) {
        Map map;
        if (c135266Ab != null) {
            map = c135266Ab.A03;
        } else {
            map = null;
        }
        return new C78473fD(context, new C78463fC(map), obj, abstractC79173gOArr, i);
    }

    public final C135266Ab A02(Context context, C135266Ab c135266Ab, C6AY c6ay, Object obj, AbstractC79173gO[] abstractC79173gOArr, int i, long j) {
        C135266Ab A03;
        C1LN.A01("RC Create Tree");
        if (c135266Ab != null) {
            C2W2 c2w2 = c6ay.A00;
            C14360o3.A0B(c2w2, 0);
            C79243gV c79243gV = c135266Ab.A01;
            if (c2w2 == c135266Ab.A00 && AbstractC78603fS.A02(j, c79243gV.A01, AbstractC78673fZ.A00(c79243gV.A01(), c79243gV.A00()))) {
                A03 = new C135266Ab(c2w2, c79243gV, c6ay.A01, c135266Ab.A03);
                C1LN.A00();
                return A03;
            }
        }
        A03 = A03(A01(context, c135266Ab, obj, abstractC79173gOArr, i), c6ay.A00, c6ay.A01, j);
        C1LN.A00();
        return A03;
    }
}
