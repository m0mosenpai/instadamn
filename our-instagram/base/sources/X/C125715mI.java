package X;

import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;

/* renamed from: X.5mI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125715mI extends C4NJ implements C4NL {
    public QPTooltipAnchor A00;
    public Integer A01;
    public String A02;

    public C125715mI(QuickPromotionSurface quickPromotionSurface, C4NM c4nm, C117045Rn c117045Rn, C4NQ c4nq, String str, int i, long j, long j2, long j3, boolean z, boolean z2) {
        super(quickPromotionSurface, c4nm, c117045Rn, c4nq, str, i, j, j2, j3, z, z2);
        QPTooltipAnchor qPTooltipAnchor;
        String str2;
        C4NP c4np = c117045Rn.A01;
        C94514Ne A00 = c4np.A00("tooltip_anchor");
        Integer num = null;
        if (A00 != null) {
            String str3 = A00.A03;
            QPTooltipAnchor[] values = QPTooltipAnchor.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    qPTooltipAnchor = values[i2];
                    if (C14360o3.A0K(qPTooltipAnchor.A00, str3)) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    qPTooltipAnchor = null;
                    break;
                }
            }
        } else {
            qPTooltipAnchor = null;
        }
        this.A00 = qPTooltipAnchor;
        C94514Ne A002 = c4np.A00("tooltip_direction");
        if (A002 != null) {
            String str4 = A002.A03;
            Integer[] A003 = C05F.A00(2);
            int length2 = A003.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    num = A003[i3];
                    if (1 - num.intValue() != 0) {
                        str2 = "UP";
                    } else {
                        str2 = "DOWN";
                    }
                    if (str2.equals(str4)) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    num = null;
                    break;
                }
            }
        }
        this.A01 = num;
        String str5 = c4nm.A09.A00;
        this.A02 = str5 == null ? "" : str5;
    }

    public C125715mI() {
    }
}
