package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.facebook.papaya.client.engine.impl.EngineFactory;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.fb.instagram.papaya.PapayaExecutionJobService;
import com.facebook.papaya.log.LogSink;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OII {
    public final Context A00;
    public final UserSession A01;
    public volatile C54660OCm A02;

    public final synchronized C54660OCm A00() {
        C54660OCm c54660OCm;
        Context context;
        C54714OEr c54714OEr;
        HashMap A1G;
        ImmutableMap.Builder builder;
        Bundle A0b;
        Iterator it;
        if (this.A02 != null) {
            c54660OCm = this.A02;
        } else {
            try {
                context = this.A00;
                UserSession userSession = this.A01;
                AbstractC167017dG.A1N(context, userSession);
                c54714OEr = (C54714OEr) userSession.A01(C54714OEr.class, new C57533Pg7(4, context, userSession));
                C14360o3.A0B(context, 0);
                ArrayList A0S = AbstractC001800i.A0S(c54714OEr.A06, c54714OEr.A05);
                A1G = AbstractC166987dD.A1G();
                builder = new ImmutableMap.Builder();
                A0b = AbstractC166987dD.A0b();
                it = A0S.iterator();
            } catch (Exception e) {
                C0K8.A0F("IgPapayaManager", "Failed to create papaya", e);
            }
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("getName");
            }
            ImmutableMap buildOrThrow = builder.buildOrThrow();
            C14360o3.A07(buildOrThrow);
            C1RF c1rf = new C1RF();
            String A04 = C18U.A04(C06090Tz.A05, c54714OEr.A02, 36878509056065729L);
            if (A04.length() != 0) {
                c1rf.A04(A04);
            }
            ImmutableSet build = c1rf.build();
            C14360o3.A07(build);
            ImmutableMap of = ImmutableMap.of((Object) "federated", (Object) new EngineFactory(context, A1G, A0b, buildOrThrow, C16930sl.A00, c54714OEr.A00, null));
            C54674ODa c54674ODa = c54714OEr.A01;
            HashMap A1G2 = AbstractC166987dD.A1G();
            MSX.A1N(EnumC53241Nge.A05, A1G2, c54674ODa.A00);
            MSX.A1N(EnumC53241Nge.A06, A1G2, c54674ODa.A01);
            MSX.A1N(EnumC53241Nge.A07, A1G2, c54674ODa.A02 * 1048576);
            MSX.A1N(EnumC53241Nge.A03, A1G2, AbstractC37302Gc3.A03(c54674ODa.A03 ? 1 : 0));
            MSX.A1N(EnumC53241Nge.A0B, A1G2, AbstractC37302Gc3.A03(c54674ODa.A04 ? 1 : 0));
            MSX.A1N(EnumC53241Nge.A04, A1G2, AbstractC37302Gc3.A03(c54674ODa.A05 ? 1 : 0));
            PapayaRestrictions papayaRestrictions = new PapayaRestrictions();
            papayaRestrictions.A00.putAll(A1G2);
            this.A02 = new C54660OCm(context, new OED(new ComponentName(context, (Class<?>) PapayaExecutionJobService.class), papayaRestrictions, EnumC53219NgH.INFO, of, build, c54714OEr.A03, c54714OEr.A04));
            ImmutableMap buildOrThrow2 = new ImmutableMap.Builder().buildOrThrow();
            C14360o3.A07(buildOrThrow2);
            Iterator it2 = buildOrThrow2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(it2);
                String A17 = AbstractC31172DnG.A17(A1K);
                LogSink logSink = (LogSink) A1K.getValue();
                C54660OCm c54660OCm2 = this.A02;
                if (c54660OCm2 != null) {
                    MyA myA = c54660OCm2.A02;
                    synchronized (myA) {
                        try {
                            myA.A00.put(A17, logSink);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            C54660OCm c54660OCm3 = this.A02;
            if (c54660OCm3 != null) {
                C55725Oor c55725Oor = new C55725Oor(c54714OEr, this);
                C55724Ooq c55724Ooq = c54660OCm3.A01;
                synchronized (c55724Ooq) {
                    try {
                        c55724Ooq.A00 = c55725Oor;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            c54660OCm = this.A02;
        }
        return c54660OCm;
    }

    public OII(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
