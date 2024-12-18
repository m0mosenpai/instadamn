package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.VQk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68428VQk {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        long j;
        Number number;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Object A01 = c6fw.A01();
            if ((A01 instanceof Number) && (number = (Number) A01) != null) {
                j = number.longValue();
            } else {
                j = 0;
            }
            InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A02()).A00;
            AbstractC12990ll A0A = C6BQ.A0A(C6BQ.A09(c6fq));
            if ((A0A instanceof UserSession) && A0A != null) {
                if (C1Z1.A01 == null) {
                    C14360o3.A0F("plugin");
                    throw C00O.createAndThrow();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("LimitedSettingsFragment.REMINDER_DATE", j);
                V02 v02 = new V02();
                v02.setArguments(bundle);
                Context context = c6fg.A00;
                v02.A02 = new C69091Vhh(context, c6fq, interfaceC103384lE);
                new C189448aO(A0A).A00().A03(context, v02);
            }
        }
        return null;
    }
}
