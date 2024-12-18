package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ml.smarttracking.videoanalyzer.SmartTrackingVideoAnalyzer$predictVideo$2;
import com.instagram.util.creation.ShaderBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8MX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MX {
    public final UserSession A00;
    public final C185828Mc A01;
    public final C8MY A02;
    public final Context A03;

    public final void A00(String str, long j) {
        C14360o3.A0B(str, 0);
        final C8MY c8my = this.A02;
        C11T.A02(new Runnable() { // from class: X.9OK
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        ArrayList arrayList = c8my.A00;
        Iterator it = arrayList.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            ((InterfaceC185838Md) next).Duq();
        }
        if (AbstractC185878Mh.A00(c8my.A02).A00(str) != null) {
            Iterator it2 = arrayList.iterator();
            C14360o3.A07(it2);
            while (it2.hasNext()) {
                Object next2 = it2.next();
                C14360o3.A07(next2);
                ((InterfaceC185838Md) next2).Duo();
            }
            return;
        }
        C19K A02 = AnonymousClass194.A02(C12L.A00.AOT(497892810, 3));
        SmartTrackingVideoAnalyzer$predictVideo$2 smartTrackingVideoAnalyzer$predictVideo$2 = new SmartTrackingVideoAnalyzer$predictVideo$2(c8my, str, null, j);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, smartTrackingVideoAnalyzer$predictVideo$2, A02);
    }

    public C8MX(Context context, UserSession userSession) {
        this.A03 = context;
        this.A00 = userSession;
        C8MY c8my = new C8MY(context, userSession);
        this.A02 = c8my;
        C185828Mc c185828Mc = new C185828Mc(userSession);
        this.A01 = c185828Mc;
        c8my.A00.add(c185828Mc);
        ShaderBridge.loadLibraries(new InterfaceC185858Mf() { // from class: X.8Me
            @Override // X.InterfaceC185858Mf
            public final void DH5(boolean z) {
            }
        });
        InterfaceC19610xo ARD = AbstractC185878Mh.A00(userSession).A00.ARD();
        ARD.AHW();
        ARD.apply();
    }
}
