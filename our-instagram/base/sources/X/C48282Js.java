package X;

import android.content.Context;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Js, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48282Js implements C2Ju {
    public final C1HT A00;
    public final C2Ju A01;
    public final AtomicInteger A02 = new AtomicInteger();

    @Override // X.C2Ju
    public final java.util.Set BIV() {
        A02(this, "getInstalledModules", new Object[0]);
        java.util.Set BIV = this.A01.BIV();
        StringBuilder sb = new StringBuilder();
        Iterator it = BIV.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        A02(this, "getInstalledModules result: %s", sb.toString());
        return BIV;
    }

    @Override // X.C2Ju
    public final C5KS Btp() {
        A02(this, "getSessionStates", new Object[0]);
        C5KS Btp = this.A01.Btp();
        Btp.A03(new C73439YDi(this));
        return Btp;
    }

    public static String A01(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            String str2 = (String) it.next();
            sb.append(str);
            sb.append(str2);
            str = InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1;
        }
        return sb.toString();
    }

    public static void A02(C48282Js c48282Js, String str, Object... objArr) {
        try {
            c48282Js.A00.A03(String.format("%d: %s", Long.valueOf(System.currentTimeMillis()), String.format(str, objArr)));
        } catch (IllegalFormatException unused) {
            c48282Js.A00.A03("caught exception when enqueueing");
        }
    }

    @Override // X.C2Ju
    public final C5KS EnT(C58640PzD c58640PzD) {
        int andIncrement = this.A02.getAndIncrement();
        A02(this, "startInstall internal_id: %d modules:{%s}", Integer.valueOf(andIncrement), A01(c58640PzD.A00));
        C5KS EnT = this.A01.EnT(c58640PzD);
        if (EnT != null) {
            EnT.A03(new XOZ(this, andIncrement));
            return EnT;
        }
        throw new RuntimeException("returnTask is null");
    }

    public C48282Js(Context context) {
        C2Ju A00 = AbstractC48302Jv.A00(context.getApplicationContext());
        this.A01 = A00;
        this.A00 = new C1HT(30);
        try {
            A00.EDP(new C2KM() { // from class: X.2KK
                @Override // X.C2KN
                public final /* bridge */ /* synthetic */ void DoW(Object obj) {
                    RP1 rp1 = (RP1) ((AbstractC62642SJz) obj);
                    C48282Js.A02(C48282Js.this, "State updated id: %d status: %d errorCode: %d", Integer.valueOf(rp1.A00), Integer.valueOf(rp1.A01), Integer.valueOf(rp1.A02));
                }
            });
        } catch (RuntimeException e) {
            this.A00.A03(e.toString());
        }
    }

    public static String A00(C5KS c5ks) {
        if (c5ks.A0F()) {
            return "task was successful";
        }
        Exception A05 = c5ks.A05();
        if (A05 != null) {
            return A05.toString();
        }
        return "Task was not successful but there was no exception?";
    }

    @Override // X.C2Ju
    public final C5KS AGW(int i) {
        A02(this, "cancelInstall: %d", Integer.valueOf(i));
        C5KS AGW = this.A01.AGW(i);
        AGW.A03(new C73440YDj(this, i));
        return AGW;
    }

    @Override // X.C2Ju
    public final C5KS AOV(List list) {
        String A01 = A01(list);
        A02(this, "deferredInstall: %s", A01);
        C5KS AOV = this.A01.AOV(list);
        AOV.A03(new XOH(this, A01));
        return AOV;
    }

    @Override // X.C2Ju
    public final C5KS AOW(List list) {
        String A01 = A01(list);
        A02(this, "deferredUninstall: %s", A01);
        C5KS AOW = this.A01.AOW(list);
        AOW.A03(new C73441YDk(this, A01));
        return AOW;
    }

    @Override // X.C2Ju
    public final void EDP(C2KM c2km) {
        A02(this, "registerListener %s", c2km.toString());
        this.A01.EDP(c2km);
    }
}
