package X;

import com.facebook.quicklog.MarkerEditor;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7jo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170977jo {
    public static final AtomicInteger A07 = new AtomicInteger(1);
    public int A00;
    public final C51232Ww A02;
    public final C170967jn A03;
    public final C919249w A04;
    public final C138996Rg A05;
    public final C006802i A01 = C006802i.A0p;
    public final boolean A06 = C2LR.A03;

    public static final void A00(MarkerEditor markerEditor, AbstractC139056Rm abstractC139056Rm, String str) {
        StringBuilder sb;
        String str2;
        Long l = abstractC139056Rm.A02;
        if (l != null) {
            markerEditor.point(AnonymousClass001.A0R(str, "_start"), l.longValue());
        }
        C9BN c9bn = abstractC139056Rm.A01;
        if (c9bn != null) {
            int intValue = ((Number) c9bn.A02).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        sb = new StringBuilder();
                        sb.append(str);
                        str2 = "_cancel";
                    } else {
                        return;
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    str2 = "_fail";
                }
            } else {
                sb = new StringBuilder();
                sb.append(str);
                str2 = "_success";
            }
            sb.append(str2);
            markerEditor.point(sb.toString(), c9bn.A01);
        }
    }

    public C170977jo(C51232Ww c51232Ww, C170967jn c170967jn, C919249w c919249w, C138996Rg c138996Rg) {
        this.A04 = c919249w;
        this.A05 = c138996Rg;
        this.A02 = c51232Ww;
        this.A03 = c170967jn;
    }

    public static final void A01(MarkerEditor markerEditor, String str, String str2, List list) {
        Number number;
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C9BN c9bn = ((AbstractC139056Rm) it.next()).A01;
            if (c9bn != null && (number = (Number) c9bn.A02) != null) {
                int intValue = number.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            i3++;
                        }
                    } else {
                        i2++;
                    }
                } else {
                    i++;
                }
            }
        }
        markerEditor.annotate(AnonymousClass001.A0R(str, "_total"), list.size());
        markerEditor.annotate(AnonymousClass001.A0R(str, "_success"), i);
        markerEditor.annotate(AnonymousClass001.A0R(str, "_fail"), i2);
        markerEditor.annotate(AnonymousClass001.A0R(str, "_cancel"), i3);
        markerEditor.annotate(str2, i + i3);
    }
}
