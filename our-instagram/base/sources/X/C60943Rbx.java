package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Rbx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60943Rbx extends AbstractRunnableC14200nk {
    public final /* synthetic */ AnonymousClass965 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60943Rbx(AnonymousClass965 anonymousClass965) {
        super(4, 4, false, false);
        this.A00 = anonymousClass965;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AnonymousClass965 anonymousClass965 = this.A00;
            AnonymousClass968 anonymousClass968 = anonymousClass965.A00;
            UserSession userSession = anonymousClass968.A02;
            if (C18U.A06(C06090Tz.A05, userSession, 36310765916913935L)) {
                HashMap A1G = AbstractC166987dD.A1G();
                ArrayList A1E = AbstractC166987dD.A1E();
                Context context = anonymousClass968.A00;
                A1E.add(new T21(new SMW(context, userSession)));
                A1E.add(new C64169T1y(context));
                A1E.add(new T20(context, T20.A02));
                A1E.add(new C64170T1z(context));
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    InterfaceC65502TlR interfaceC65502TlR = (InterfaceC65502TlR) it.next();
                    String CgW = interfaceC65502TlR.CgW();
                    if (A1G.containsKey(CgW)) {
                        String A0R = AnonymousClass001.A0R("Provider keys must be unique. Conflict on key: ", CgW);
                        C0I3 c0i3 = C0I2.A00;
                        if (c0i3.isLoggable(6)) {
                            c0i3.wtf("BigFootReporter", A0R);
                        }
                    } else {
                        HashMap E6N = interfaceC65502TlR.E6N();
                        if (E6N != null && !E6N.isEmpty()) {
                            A1G.put(CgW, E6N);
                        }
                    }
                }
                if (!A1G.isEmpty()) {
                    try {
                        InterfaceC02590Ai A0H = MSY.A0H(anonymousClass968.A01, "big_foot_reporter_event");
                        if (A0H.isSampled()) {
                            JSONObject A0q = AbstractC31171DnF.A0q();
                            Iterator A14 = AbstractC166997dE.A14(A1G);
                            while (A14.hasNext()) {
                                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                                String A17 = AbstractC31172DnG.A17(A1K);
                                Map map = (Map) A1K.getValue();
                                JSONObject A0q2 = AbstractC31171DnF.A0q();
                                Iterator A15 = AbstractC166997dE.A15(map);
                                while (A15.hasNext()) {
                                    Map.Entry A1K2 = AbstractC166987dD.A1K(A15);
                                    A0q2.put(AbstractC31172DnG.A17(A1K2), ((InterfaceC65375Tj7) A1K2.getValue()).EqM());
                                }
                                A0q.put(A17, A0q2);
                            }
                            A0H.AAP("provider_data", AbstractC166987dD.A19(A0q));
                            A0H.A7v(TraceFieldType.IsForeground, false);
                            A0H.Cht();
                        }
                    } catch (JSONException e) {
                        C0K8.A0J("IG4ABigFootReporter", "Json parsing failed for the big foot event", e);
                    }
                }
            }
            anonymousClass965.A01.A00();
        } catch (Throwable th) {
            this.A00.A01.A00();
            throw th;
        }
    }
}
