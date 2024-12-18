package X;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6KO, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6KO {
    public static final C2WC A00 = new C6DK();

    public static final void A01(Context context, C2W5 c2w5, RenderTreeNode renderTreeNode, ArrayList arrayList, List list, int i, int i2) {
        int i3 = i2;
        int i4 = i;
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (c2w5 != null) {
            Rect rect = new Rect(i4, i3, c2w5.getWidth() + i, c2w5.getHeight() + i2);
            arrayList.size();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            C2WC Bmi = c2w5.Bmi();
            if (Bmi != null) {
                int Ang = c2w5.Ang();
                RenderTreeNode A002 = A00(rect, c2w5, renderTreeNode, Bmi);
                arrayList.add(A002);
                List list2 = (List) renderTreeNode.A08.getValue();
                if (Ang > 0) {
                    list2.add(A002);
                    renderTreeNode2 = A002;
                } else {
                    list2.add(A002);
                }
                i4 = 0;
                i3 = 0;
            }
            int Ang2 = c2w5.Ang();
            for (int i5 = 0; i5 < Ang2; i5++) {
                A01(context, c2w5.AnV(i5), renderTreeNode2, arrayList, list, c2w5.CI4(i5) + i4, c2w5.CIb(i5) + i3);
            }
        }
    }

    public static final RenderTreeNode A00(Rect rect, C2W5 c2w5, RenderTreeNode renderTreeNode, C2WC c2wc) {
        Rect rect2;
        int i;
        if (c2w5.Bau() == 0 && c2w5.Bax() == 0 && c2w5.Baw() == 0 && c2w5.Bat() == 0) {
            rect2 = null;
        } else {
            rect2 = new Rect(c2w5.Bau(), c2w5.Bax(), c2w5.Baw(), c2w5.Bat());
        }
        Object BMS = c2w5.BMS();
        if (renderTreeNode != null) {
            i = ((List) renderTreeNode.A08.getValue()).size();
        } else {
            i = 0;
        }
        return new RenderTreeNode(rect, rect2, renderTreeNode, c2wc, BMS, i);
    }
}
