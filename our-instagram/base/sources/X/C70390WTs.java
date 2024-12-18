package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WTs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70390WTs implements X90 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C68977VfF A01;
    public final /* synthetic */ C132815z4 A02;
    public final /* synthetic */ C68813VcU A03;

    public C70390WTs(UserSession userSession, C68977VfF c68977VfF, C132815z4 c132815z4, C68813VcU c68813VcU) {
        this.A02 = c132815z4;
        this.A00 = userSession;
        this.A01 = c68977VfF;
        this.A03 = c68813VcU;
    }

    @Override // X.X90
    public final void DR2(C70394WTw c70394WTw) {
        C14360o3.A0B(c70394WTw, 0);
        C132815z4 c132815z4 = this.A02;
        ArrayList arrayList = c132815z4.A01;
        UserSession userSession = this.A00;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediaMapPin mediaMapPin = (MediaMapPin) it.next();
            if (mediaMapPin.A00() != null) {
                arrayList2.add(mediaMapPin);
            }
        }
        C68977VfF c68977VfF = this.A01;
        if (!arrayList2.equals(c68977VfF.A00)) {
            WlN wlN = new WlN();
            Context context = c70394WTw.A0G;
            C14360o3.A07(context);
            int A01 = C1H4.A01(AbstractC13880nE.A04(context, 44));
            c70394WTw.A0A(new ULY(new C70375WTd(c70394WTw, userSession, wlN, arrayList2, A01, Math.round(C46014KYc.A00(context, A01))), c70394WTw));
            C66356UBx c66356UBx = c68977VfF.A01;
            AbstractC70135W6m.A01(c70394WTw, arrayList2, c66356UBx.getHeight(), c66356UBx.getWidth());
            c70394WTw.A06 = new C70381WTj(1, c132815z4, this.A03);
            c68977VfF.A00 = arrayList2;
        }
    }
}
