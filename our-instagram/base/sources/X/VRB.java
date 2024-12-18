package X;

import android.app.Activity;

/* loaded from: classes11.dex */
public abstract class VRB {
    public static final C189448aO A00(Activity activity, WTT wtt, AbstractC12990ll abstractC12990ll, C51D c51d) {
        C14360o3.A0B(abstractC12990ll, 1);
        InterfaceC65469Tkm interfaceC65469Tkm = wtt.A01;
        C14360o3.A0C(interfaceC65469Tkm, AbstractC111324zv.A00(1137));
        WTZ wtz = (WTZ) interfaceC65469Tkm;
        C189448aO c189448aO = new C189448aO(abstractC12990ll);
        c189448aO.A0T = c51d;
        c189448aO.A0f = wtt.A06;
        c189448aO.A03 = wtz.A00;
        c189448aO.A0a = wtz.A02;
        c189448aO.A0x = wtz.A07;
        c189448aO.A0y = !wtz.A06;
        c189448aO.A0k = !wtz.A05;
        c189448aO.A13 = wtz.A08;
        Integer num = wtz.A04;
        if (num != null && num.intValue() == 16 && AbstractC13880nE.A0y(activity)) {
            c189448aO.A0Z = true;
        }
        return c189448aO;
    }
}
