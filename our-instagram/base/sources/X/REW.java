package X;

import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.ptt.impl.javacpp.ServerCertsVerifierImpl;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public final class REW extends AbstractC63144Sdq implements InterfaceC65510Tlf {
    public C63001SaP A00;
    public final C2GC A01;
    public final ServerCertsVerifierImpl A02;
    public final C62522SEy A03;
    public final boolean A04;

    @Override // X.InterfaceC65510Tlf
    public final void AWQ(C63001SaP c63001SaP) {
        this.A00 = c63001SaP;
        AbstractC63144Sdq.A01(super.A03.A00, this);
    }

    public REW(C2GC c2gc, C63001SaP c63001SaP, ServerCertsVerifierImpl serverCertsVerifierImpl, C58443PvM c58443PvM, C62522SEy c62522SEy, boolean z) {
        super(c58443PvM);
        this.A03 = c62522SEy;
        this.A02 = serverCertsVerifierImpl;
        this.A00 = c63001SaP;
        this.A04 = z;
        this.A01 = c2gc;
    }

    @Override // X.InterfaceC65510Tlf
    public final C2GT BtY(SJ1 sj1) {
        String str;
        AbstractC63144Sdq.A02(this);
        Q8J q8j = super.A03;
        C63406Sjd A0S = AbstractC58318PtA.A0S(q8j);
        HashMap A1G = AbstractC166987dD.A1G();
        C2GC c2gc = this.A01;
        if (c2gc != null) {
            A1G.put(AbstractC63083Sc6.A00(), AbstractC58442PvL.A02());
            A1G.put("flow_name", C2O5.A0K.toString());
            A1G.put("logger_data", new FBPayLoggerData(new C62697SMl()));
            c2gc.Chz("client_load_paysec_init", A1G);
        }
        if (C63406Sjd.A0J(A0S)) {
            A0S.getClass();
            SEB seb = (SEB) C63406Sjd.A08(A0S);
            X509Certificate x509Certificate = seb.A00;
            if (x509Certificate != null) {
                if (new Date(System.currentTimeMillis() + 3600000).after(x509Certificate.getNotAfter())) {
                    AWQ(this.A00);
                }
            } else {
                List list = seb.A01;
                synchronized (this) {
                    str = "";
                    if (!this.A04) {
                        str = this.A02.verifyCerts(list);
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    if (c2gc != null) {
                        A1G.put("error_message", "FBPay Certificate Error: ".concat(str));
                        A1G.put(TraceFieldType.ErrorCode, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                        A1G.put("error_stacktrace", android.util.Log.getStackTraceString(AbstractC166987dD.A18("certificate error")));
                        c2gc.Chz("client_load_paysec_fail", A1G);
                    }
                    AWQ(this.A00);
                    AbstractC63144Sdq.A02(this);
                    return C75M.A01(q8j, new TW1(7, sj1, this));
                }
            }
        }
        if (c2gc != null) {
            c2gc.Chz("client_load_paysec_success", A1G);
        }
        AbstractC63144Sdq.A02(this);
        return C75M.A01(q8j, new TW1(7, sj1, this));
    }
}
