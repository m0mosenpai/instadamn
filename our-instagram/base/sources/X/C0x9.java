package X;

import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0x9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0x9 implements InterfaceC11310in {
    public ArrayList A00 = new ArrayList(16);

    public final void A03(C0CW c0cw) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A00;
            if (i < arrayList.size()) {
                Object obj = arrayList.get(i);
                if (!(obj instanceof Number) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                    if (obj instanceof C19260xA) {
                        C0CA A02 = c0cw.A01.A02();
                        c0cw.A0B(A02);
                        ((C19260xA) obj).A07(A02);
                    } else if (obj instanceof C0x9) {
                        C0CW A01 = c0cw.A01.A01();
                        c0cw.A0B(A01);
                        ((C0x9) obj).A03(A01);
                    }
                    i++;
                }
                C0CW.A00(c0cw, obj);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC11310in
    public final AnalyticsEventDebugInfo EqF() {
        AnalyticsEventDebugInfo analyticsEventDebugInfo = new AnalyticsEventDebugInfo(3);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A00;
            if (i < arrayList.size()) {
                AbstractC11490j8.A05(analyticsEventDebugInfo, arrayList.get(i), null);
                i++;
            } else {
                return analyticsEventDebugInfo;
            }
        }
    }

    public final void A00(double d) {
        this.A00.add(Double.valueOf(d));
    }

    public final void A01(int i) {
        this.A00.add(Integer.valueOf(i));
    }

    public final void A02(long j) {
        this.A00.add(Long.valueOf(j));
    }

    public final void A04(String str) {
        this.A00.add(str);
    }

    public final void A05(boolean z) {
        this.A00.add(Boolean.valueOf(z));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0x9)) {
            return false;
        }
        return C02O.A00(this.A00, ((C0x9) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str;
        StringWriter stringWriter = new StringWriter();
        stringWriter.append((CharSequence) "[");
        List list = (List) this.A00.clone();
        for (int i = 0; i < list.size(); i++) {
            try {
                Object obj = list.get(i);
                if (obj == null) {
                    str = "";
                } else {
                    str = obj.toString();
                }
                if (str.isEmpty()) {
                    str = "null";
                }
                stringWriter.append((CharSequence) str);
                if (i < list.size() - 1) {
                    stringWriter.append((CharSequence) ", ");
                }
            } catch (IndexOutOfBoundsException e) {
                C0K8.A0I(getClass().getSimpleName(), "The List has no items even though its size is greater than 0.", e);
            }
        }
        stringWriter.append((CharSequence) "]");
        return stringWriter.toString();
    }
}
