package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1FA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FA {
    public final InterfaceC19630xq A00;
    public final C1GU A01;
    public final String A02;
    public final AbstractC12990ll A03;
    public volatile String A04;

    public C1FA(AbstractC12990ll abstractC12990ll, InterfaceC19630xq interfaceC19630xq, C1GU c1gu) {
        String str;
        C14360o3.A0B(c1gu, 2);
        this.A00 = interfaceC19630xq;
        this.A01 = c1gu;
        this.A03 = abstractC12990ll;
        String A02 = AbstractC03270Dk.A02(abstractC12990ll);
        this.A02 = A02;
        if (A02 != null) {
            str = interfaceC19630xq.getString(A02, "");
        } else {
            str = null;
        }
        this.A04 = str;
    }

    public final String A00() {
        List<String> arrayList;
        String str;
        AbstractC12990ll abstractC12990ll = this.A03;
        if (abstractC12990ll instanceof UserSession) {
            arrayList = C0BQ.A00(abstractC12990ll).BOc(this.A02);
        } else {
            arrayList = new ArrayList(C0BQ.A00(abstractC12990ll).BOd());
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        for (String str2 : arrayList) {
            if (str2 != null) {
                str = this.A00.getString(str2, "");
            } else {
                str = null;
            }
            arrayList2.add(str);
        }
        String join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, arrayList2);
        C14360o3.A07(join);
        return join;
    }

    public final List A01(List list) {
        String str;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 != null) {
                str = this.A00.getString(str2, "");
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public final void A02() {
        this.A04 = "";
        if (this.A03 instanceof UserSession) {
            InterfaceC19610xo ARD = this.A00.ARD();
            ARD.EEj(this.A02);
            ARD.apply();
        }
    }

    public final void A03(String str) {
        C1GU c1gu = this.A01;
        if (!str.equals(c1gu.A00)) {
            c1gu.A00 = str;
            InterfaceC19610xo ARD = c1gu.A01.ARD();
            ARD.E7K("DEVICE_HEADER_ID", c1gu.A00);
            ARD.apply();
        }
    }

    public final void A04(String str) {
        if (!str.equals(this.A04)) {
            this.A04 = str;
            if (this.A03 instanceof UserSession) {
                InterfaceC19610xo ARD = this.A00.ARD();
                ARD.E7K(this.A02, str);
                ARD.apply();
            }
        }
    }
}
