package X;

import com.facebook.forker.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7iK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170057iK {
    public int A00;
    public C170067iL A01;
    public AbstractC169857hz A02;
    public final List A03 = new ArrayList();

    public static C170057iK A00(C170057iK c170057iK, C170057iK c170057iK2) {
        int i;
        C170067iL c170067iL;
        int i2 = 0;
        C170057iK c170057iK3 = new C170057iK();
        c170057iK3.A00 = 0;
        c170057iK3.A02 = null;
        c170057iK3.A01 = null;
        if (c170057iK != null) {
            i = c170057iK.A00;
        } else {
            i = 0;
        }
        if (c170057iK2 != null) {
            i2 = c170057iK2.A00;
        }
        List list = c170057iK3.A03;
        if (c170057iK != null) {
            c170067iL = c170057iK.A01;
        } else {
            c170067iL = null;
        }
        C170067iL c170067iL2 = c170057iK2 != null ? c170057iK2.A01 : null;
        if (c170057iK != null) {
            Iterator it = c170057iK.A03.iterator();
            while (it.hasNext()) {
                list.add(it.next());
            }
        }
        if (c170057iK2 != null) {
            for (C170167iV c170167iV : c170057iK2.A03) {
                int i3 = c170167iV.A02;
                int i4 = -1;
                if (i3 >= 0) {
                    i4 = i3 + i;
                }
                list.add(new C170167iV(c170167iV.A04, c170167iV.A07, c170167iV.A06, c170167iV.A05, c170167iV.A03, c170167iV.A01 + i, i4, c170167iV.A00));
            }
        }
        c170057iK3.A00 = i + i2;
        if (c170067iL != null) {
            if (c170067iL2 != null) {
                c170067iL = c170067iL.A00(c170067iL2);
            }
            c170067iL2 = c170067iL;
        }
        c170057iK3.A01 = c170067iL2;
        return c170057iK3;
    }

    public final void A01(C170167iV c170167iV) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        this.A03.add(c170167iV);
        int i8 = c170167iV.A03;
        int i9 = 1;
        if (i8 != -3) {
            if (i8 != -1) {
                if (i8 != 1) {
                    i9 = -1;
                    if (i8 != 3) {
                        i9 = 0;
                    }
                }
            } else {
                i9 = c170167iV.A00;
            }
        } else {
            i9 = -c170167iV.A00;
        }
        this.A00 += i9;
        C170067iL c170067iL = this.A01;
        if (c170067iL == null) {
            return;
        }
        switch (i8) {
            case Process.SD_BLACK_HOLE /* -3 */:
                i4 = c170167iV.A00;
                i = 0;
                i2 = 0;
                i3 = 0;
                i5 = 0;
                i7 = 0;
                i6 = 0;
                break;
            case -2:
                i7 = c170167iV.A00;
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                break;
            case -1:
                i2 = c170167iV.A00;
                i = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i7 = 0;
                i6 = 0;
                break;
            case 0:
                i6 = c170167iV.A00;
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i7 = 0;
                break;
            case 1:
                i = 1;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i7 = 0;
                i6 = 0;
                break;
            case 2:
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 1;
                i7 = 0;
                i6 = 0;
                break;
            case 3:
                i = 0;
                i2 = 0;
                i3 = 1;
                i4 = 0;
                i5 = 0;
                i7 = 0;
                i6 = 0;
                break;
            default:
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i7 = 0;
                i6 = 0;
                break;
        }
        this.A01 = c170067iL.A00(new C170067iL(i9, i, i2, i3, i4, i5, i7, i6));
    }
}
