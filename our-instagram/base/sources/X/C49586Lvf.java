package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.notifications.armadillo.retry.ArmadilloPushNotificationRetryWorker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Lvf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49586Lvf implements C0JG {
    public final int A00;
    public final Object A01;

    public C49586Lvf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C0JG
    public final void ATM(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        if (this.A00 != 0) {
            AbstractC167017dG.A1N(userSession, interfaceC03960Jm);
            ArmadilloPushNotificationRetryWorker armadilloPushNotificationRetryWorker = (ArmadilloPushNotificationRetryWorker) this.A01;
            int i = armadilloPushNotificationRetryWorker.mWorkerParams.A01;
            int i2 = armadilloPushNotificationRetryWorker.A00;
            if (i == i2) {
                ArmadilloPushNotificationRetryWorker.A00(userSession, armadilloPushNotificationRetryWorker);
            }
            C132515ya A00 = C60J.A00(userSession);
            A00.A02(i2 - armadilloPushNotificationRetryWorker.mWorkerParams.A01, C50367MLu.A01(userSession, 43));
            Map unmodifiableMap = Collections.unmodifiableMap(armadilloPushNotificationRetryWorker.A01.A02.A00);
            C14360o3.A07(unmodifiableMap);
            HashMap A1G = AbstractC166987dD.A1G();
            Iterator A15 = AbstractC166997dE.A15(unmodifiableMap);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                A1G.put(A1K.getKey(), A1K.getValue().toString());
            }
            C91Y.A0A.A01().A03(new JVL(userSession, 22), A00, userSession.userId, A1G);
            interfaceC03960Jm.AIn(null);
            return;
        }
        AbstractC167017dG.A1N(userSession, interfaceC03960Jm);
        C006802i c006802i = C006802i.A0p;
        C50367MLu A01 = C50367MLu.A01(interfaceC03960Jm, 37);
        InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A01;
        C14360o3.A0A(c006802i);
        interfaceC16620sF.invoke(c006802i, new C47576Kzm(new JVL(20, A01), userSession));
    }
}
