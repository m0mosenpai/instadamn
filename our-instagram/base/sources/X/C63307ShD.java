package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import java.util.Map;

/* renamed from: X.ShD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63307ShD {
    public QuickPerformanceLogger A00;
    public SCQ A01;
    public C62876SVa A02;
    public C63630Sqc A03;
    public C62272S4r A04;
    public C2GC A05;
    public C62877SVb A06;
    public SNQ A07;
    public final Context A08;
    public final UserSession A09;
    public final InterfaceC08830cm A0A;
    public final InterfaceC08830cm A0B;

    public final Fragment A03(Bundle bundle, String str) {
        Fragment A00 = ((SNK) this.A0B.get()).A00(bundle, str);
        A00.getClass();
        return A00;
    }

    public final Fragment A04(Bundle bundle, String str) {
        Fragment A01 = ((SNK) this.A0B.get()).A01(bundle, str);
        A01.getClass();
        return A01;
    }

    public final C2GC A05() {
        C2GC c2gc = this.A05;
        if (c2gc == null) {
            T2R t2r = new T2R(new SNL(AbstractC12220kQ.A00(new C64463TEz(this), C12180kM.A05, this.A09)));
            this.A05 = t2r;
            return t2r;
        }
        return c2gc;
    }

    public final C62877SVb A06() {
        C62877SVb c62877SVb = this.A06;
        if (c62877SVb == null) {
            C62877SVb c62877SVb2 = new C62877SVb(this.A09);
            this.A06 = c62877SVb2;
            return c62877SVb2;
        }
        return c62877SVb;
    }

    public final SNQ A07() {
        SNQ snq = this.A07;
        if (snq == null) {
            SNQ snq2 = new SNQ(this.A09);
            this.A07 = snq2;
            return snq2;
        }
        return snq;
    }

    public C63307ShD(Context context, UserSession userSession, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        this.A08 = context;
        this.A0B = interfaceC08830cm;
        this.A0A = interfaceC08830cm2;
        this.A09 = userSession;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.Rp0, java.lang.Object] */
    public static C52942bb A00(InterfaceC018407e interfaceC018407e) {
        C63307ShD A0E = C2FP.A0E();
        C63630Sqc c63630Sqc = A0E.A03;
        if (c63630Sqc == null) {
            UserSession userSession = A0E.A09;
            IGPaymentMethodsAPI iGPaymentMethodsAPI = new IGPaymentMethodsAPI(userSession, "FBPAY_HUB");
            InterfaceC08830cm interfaceC08830cm = A0E.A0A;
            SMF smf = new SMF((C58443PvM) interfaceC08830cm.get(), iGPaymentMethodsAPI);
            C62580SHf c62580SHf = new C62580SHf((C58443PvM) interfaceC08830cm.get(), new C62655SKo(userSession));
            C58443PvM c58443PvM = (C58443PvM) interfaceC08830cm.get();
            SCQ scq = A0E.A01;
            if (scq == null) {
                scq = new SCQ(userSession);
                A0E.A01 = scq;
            }
            SE5 se5 = new SE5(c58443PvM, scq);
            SE7 se7 = new SE7((C58443PvM) interfaceC08830cm.get(), new C62521SEx(A0E.A08, userSession));
            SE9 se9 = new SE9((C58443PvM) interfaceC08830cm.get(), new SCS(userSession));
            SE6 se6 = new SE6((C58443PvM) interfaceC08830cm.get(), new SCR(userSession));
            SGD sgd = new SGD((C58443PvM) interfaceC08830cm.get(), new Object());
            SMH smh = new SMH((C58443PvM) interfaceC08830cm.get(), new C62523SEz(userSession));
            SW8 sw8 = new SW8(userSession);
            C2GC A05 = A0E.A05();
            QuickPerformanceLogger quickPerformanceLogger = A0E.A00;
            if (quickPerformanceLogger == null) {
                quickPerformanceLogger = C006802i.A0p;
                A0E.A00 = quickPerformanceLogger;
            }
            c63630Sqc = new C63630Sqc(quickPerformanceLogger, A05, sgd, c62580SHf, se5, se6, se7, smf, se9, smh, userSession, sw8);
            A0E.A03 = c63630Sqc;
        }
        return new C52942bb(c63630Sqc, interfaceC018407e);
    }

    public static QuickPerformanceLogger A01() {
        C63307ShD A0E = C2FP.A0E();
        QuickPerformanceLogger quickPerformanceLogger = A0E.A00;
        if (quickPerformanceLogger == null) {
            C006802i c006802i = C006802i.A0p;
            A0E.A00 = c006802i;
            return c006802i;
        }
        return quickPerformanceLogger;
    }

    public static C2GC A02(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return C2FP.A0E().A05();
    }
}
