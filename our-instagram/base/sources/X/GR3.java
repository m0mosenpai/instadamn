package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.registration.model.RegFlowExtras;
import java.util.List;

/* loaded from: classes6.dex */
public final class GR3 implements Runnable {
    public final /* synthetic */ EVQ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public GR3(EVQ evq, String str, String str2, List list, List list2, boolean z, boolean z2) {
        this.A00 = evq;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = str;
        this.A01 = str2;
        this.A06 = z;
        this.A05 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle A0b;
        Fragment ekh;
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        List list = this.A03;
        regFlowExtras.A0e = list;
        regFlowExtras.A0f = this.A04;
        String str = this.A02;
        regFlowExtras.A0X = str;
        regFlowExtras.A0h = true;
        EVQ evq = this.A00;
        CallerContext callerContext = EVQ.A0B;
        regFlowExtras.A04 = evq.A02;
        regFlowExtras.A09 = this.A01;
        regFlowExtras.A0r = this.A06;
        regFlowExtras.A0m = this.A05;
        if (str.equals("kr")) {
            AbstractC31172DnG.A1A();
            A0b = AbstractC166987dD.A0b();
            A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            AbstractC31173DnH.A1B(A0b);
            ekh = new AbstractC59962oe();
        } else if (list != null && !list.isEmpty()) {
            AbstractC31172DnG.A1A();
            A0b = AbstractC166987dD.A0b();
            A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            AbstractC31173DnH.A1B(A0b);
            ekh = new EKD();
        } else {
            AbstractC31172DnG.A1A();
            A0b = AbstractC166987dD.A0b();
            A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            AbstractC31173DnH.A1B(A0b);
            ekh = new EKH();
        }
        ekh.setArguments(A0b);
        C140966Yy A0r = AbstractC25225BEi.A0r(evq.A06.getActivity(), evq.A08);
        A0r.A0B(null, ekh);
        A0r.A04();
    }
}
