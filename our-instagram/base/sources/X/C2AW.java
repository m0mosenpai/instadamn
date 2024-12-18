package X;

import android.content.Context;
import com.instagram.bugreporter.rageshakehelper.RageShakeSensorHelper$scheduleLogRageShakeStatus$1;

/* renamed from: X.2AW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AW {
    public final void A00(Context context, C2AY c2ay, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(c2ay, 2);
        if (abstractC12990ll.A00(C2AU.class) != null) {
            C0w9.A03("RageShakeSensorHelper2_duplicateAccountSwitch", "Should only call initInstance once per session");
            return;
        }
        C2AU c2au = new C2AU(context, abstractC12990ll);
        abstractC12990ll.A04(C2AU.class, c2au);
        C0K8.A0P("RageShakeSensorHelper", "initInstance Initialized | rageShakeEnabled=%b | shakeForceThreshold=%f", Boolean.valueOf(!AbstractC46222Ag.A00()), Float.valueOf(18.042845f));
        c2au.A04.A01(c2au.A05, C46252Al.class);
        AbstractC12860lY.A07(c2au);
        C1GJ.A07(C12L.A00.AOT(1039401295, 5), new RageShakeSensorHelper$scheduleLogRageShakeStatus$1(c2au, null));
    }
}
