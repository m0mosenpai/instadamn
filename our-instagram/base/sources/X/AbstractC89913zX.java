package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3zX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC89913zX {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Drawable drawable, int i, int i2) {
        C14360o3.A0B(drawable, 0);
        Rect bounds = drawable.getBounds();
        C14360o3.A07(bounds);
        int i3 = bounds.left;
        int i4 = bounds.top;
        drawable.setBounds(i3, i4, i3 + i, i4 + i2);
        if (drawable instanceof InterfaceC51212Wu) {
            ((C51202Wt) ((InterfaceC51212Wu) drawable)).A02(i, i2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0036. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C79443gr r9, X.AbstractC51432Xq r10, X.C51272Xa r11, X.InterfaceC79483gv r12) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC89913zX.A01(X.3gr, X.2Xq, X.2Xa, X.3gv):void");
    }

    public static final void A02(AbstractC51432Xq abstractC51432Xq, String str) {
        C14360o3.A0B(abstractC51432Xq, 0);
        if (abstractC51432Xq instanceof C89883zU) {
            ((C89883zU) abstractC51432Xq).A01 = str;
            return;
        }
        if (abstractC51432Xq instanceof AbstractC51462Xt) {
            ArrayList arrayList = ((AbstractC51462Xt) abstractC51432Xq).A00;
            C14360o3.A07(arrayList);
            int size = arrayList.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i = size - 1;
                Object obj = arrayList.get(size);
                C14360o3.A07(obj);
                A02((AbstractC51432Xq) obj, str);
                if (i < 0) {
                    return;
                } else {
                    size = i;
                }
            }
        } else if (abstractC51432Xq instanceof AbstractC89823zO) {
            AbstractC89823zO abstractC89823zO = (AbstractC89823zO) abstractC51432Xq;
            abstractC89823zO.A00();
            ArrayList arrayList2 = abstractC89823zO.A06;
            int size2 = arrayList2.size() - 1;
            if (size2 < 0) {
                return;
            }
            while (true) {
                int i2 = size2 - 1;
                ((C89883zU) arrayList2.get(size2)).A01 = str;
                if (i2 < 0) {
                    return;
                } else {
                    size2 = i2;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unhandled transition type: ");
            sb.append(abstractC51432Xq);
            throw new RuntimeException(sb.toString());
        }
    }

    public static final void A03(AbstractC51432Xq abstractC51432Xq, List list) {
        C14360o3.A0B(abstractC51432Xq, 0);
        if (abstractC51432Xq instanceof AbstractC89823zO) {
            AbstractC89823zO abstractC89823zO = (AbstractC89823zO) abstractC51432Xq;
            abstractC89823zO.A00();
            ArrayList arrayList = abstractC89823zO.A06;
            C14360o3.A07(arrayList);
            list.addAll(arrayList);
            return;
        }
        list.add(abstractC51432Xq);
    }
}
