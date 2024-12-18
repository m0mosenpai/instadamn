package X;

import android.util.Pair;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class TR2 implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ C63367SiS A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;

    public TR2(Pair pair, C63367SiS c63367SiS, Boolean bool, Integer num, boolean z) {
        this.A01 = c63367SiS;
        this.A00 = pair;
        this.A04 = z;
        this.A02 = bool;
        this.A03 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        String A03;
        try {
            Pair pair = this.A00;
            Boolean bool = null;
            if (pair != null) {
                list = (List) pair.first;
                list2 = (List) pair.second;
            } else {
                list = null;
                list2 = null;
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    A1E.add(((SubscribeTopic) it.next()).A01);
                }
            }
            C63367SiS c63367SiS = this.A01;
            C4ME c4me = c63367SiS.A0U;
            if (this.A04) {
                A03 = null;
            } else {
                bool = this.A02;
                A03 = C4PM.A00().A03(bool);
            }
            byte[] convertForegroundStateWithSubscriptionToThriftPayload = c4me.convertForegroundStateWithSubscriptionToThriftPayload(A03, bool, this.A03, list, A1E);
            if (convertForegroundStateWithSubscriptionToThriftPayload != null) {
                c63367SiS.A04(new T1T(this, list, list2), C05F.A01, XplatNativeClientWrapper.UPDATE_FOREGROUND_TOPIC, convertForegroundStateWithSubscriptionToThriftPayload);
            }
        } catch (C42Y unused) {
        }
    }
}
