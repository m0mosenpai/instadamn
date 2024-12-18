package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.SZn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62970SZn {
    public final C63306ShC A00;
    public final C63363SiM A01;
    public final Map A02 = AbstractC166987dD.A1G();
    public final RealtimeSinceBootClock A03;
    public final InterfaceExecutorServiceC65698TsK A04;
    public final ExecutorServiceC64921TZw A05;

    public static void A00(SPL spl, C62970SZn c62970SZn) {
        boolean z;
        EnumC61139Rft enumC61139Rft;
        EnumC61172RgY enumC61172RgY = spl.A04;
        int i = spl.A01;
        C63364SiN c63364SiN = spl.A03;
        String name = enumC61172RgY.name();
        Integer valueOf = Integer.valueOf(i);
        Map map = c62970SZn.A02;
        synchronized (map) {
            if (map.get(valueOf) == spl) {
                map.remove(valueOf);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            c62970SZn.A00.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, spl.A05, null, 1, i, i, c63364SiN.A0V);
        } else {
            C0K8.A0P("MqttOperationManager", "operation/timeout/duplicate; id=%d, operation=%s, client=%s", valueOf, name, c63364SiN);
        }
        spl.A00();
        boolean equals = enumC61172RgY.equals(EnumC61172RgY.PINGRESP);
        if (equals || enumC61172RgY.equals(EnumC61172RgY.PUBACK)) {
            TimeoutException timeoutException = new TimeoutException();
            if (equals) {
                enumC61139Rft = EnumC61139Rft.PING;
            } else {
                enumC61139Rft = EnumC61139Rft.PUBLISH;
            }
            synchronized (c63364SiN) {
                RhR rhR = RhR.A09;
                EnumSet enumSet = C63364SiN.A0c;
                if (c63364SiN.A04()) {
                    c63364SiN.A0J.submit(new RunnableC64701TQh(c63364SiN, enumC61139Rft, rhR, timeoutException));
                }
            }
        }
    }

    public C62970SZn(RealtimeSinceBootClock realtimeSinceBootClock, C63306ShC c63306ShC, C63363SiM c63363SiM, InterfaceExecutorServiceC65698TsK interfaceExecutorServiceC65698TsK, ExecutorServiceC64921TZw executorServiceC64921TZw) {
        this.A04 = interfaceExecutorServiceC65698TsK;
        this.A05 = executorServiceC64921TZw;
        this.A00 = c63306ShC;
        this.A01 = c63363SiM;
        this.A03 = realtimeSinceBootClock;
    }

    public final SPL A01(C63364SiN c63364SiN, InterfaceC65545TmK interfaceC65545TmK, EnumC61172RgY enumC61172RgY, String str, int i, int i2) {
        SPL spl;
        SPL spl2 = new SPL(c63364SiN, enumC61172RgY, str, i, SystemClock.elapsedRealtime());
        Map map = this.A02;
        synchronized (map) {
            spl = (SPL) map.put(Integer.valueOf(spl2.A01), spl2);
        }
        if (spl != null) {
            spl.A00();
            C0K8.A0O("MqttOperationManager", "operation/add/duplicate; id=%d, name=%s", Integer.valueOf(spl.A01), spl.A04.name());
        }
        ExecutorServiceC64921TZw executorServiceC64921TZw = this.A05;
        TO6 to6 = new TO6(spl2, this);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        R6v r6v = new R6v(executorServiceC64921TZw, null, to6);
        AbstractC58320PtC.A1I(r6v, executorServiceC64921TZw, timeUnit, i2);
        AbstractC62803SRx.A01(AbstractC25229BEm.A1Z(spl2.A06));
        spl2.A06 = r6v;
        interfaceC65545TmK.getClass();
        AbstractC62803SRx.A01(AbstractC25229BEm.A1Z(spl2.A07));
        spl2.A07 = interfaceC65545TmK;
        return spl2;
    }

    public final SPL A02(C63364SiN c63364SiN, EnumC61172RgY enumC61172RgY, String str, int i, int i2) {
        SPL spl;
        SPL spl2 = new SPL(c63364SiN, enumC61172RgY, str, i, SystemClock.elapsedRealtime());
        Map map = this.A02;
        synchronized (map) {
            spl = (SPL) map.put(Integer.valueOf(spl2.A01), spl2);
        }
        if (spl != null) {
            spl.A00();
            C0K8.A0O("MqttOperationManager", "operation/add/duplicate; id=%d, name=%s", Integer.valueOf(spl.A01), spl.A04.name());
        }
        ExecutorServiceC64921TZw executorServiceC64921TZw = this.A05;
        TO5 to5 = new TO5(spl2, this);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        R6v r6v = new R6v(executorServiceC64921TZw, null, to5);
        AbstractC58320PtC.A1I(r6v, executorServiceC64921TZw, timeUnit, i2);
        AbstractC62803SRx.A01(AbstractC25229BEm.A1Z(spl2.A06));
        spl2.A06 = r6v;
        return spl2;
    }
}
