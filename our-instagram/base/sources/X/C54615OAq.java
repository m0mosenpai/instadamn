package X;

import android.content.Context;
import com.facebook.rsys.tslog.gen.TslogEngineApi;
import com.facebook.rsys.tslog.gen.TslogStreamApi;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.rsys.tslog.IgRadioTsLoggerEngine;
import java.util.Timer;

/* renamed from: X.OAq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54615OAq {
    public IgRadioTsLoggerEngine A00;
    public final Timer A01;
    public final TslogStreamApi A02;

    public C54615OAq(Context context, TslogEngineApi tslogEngineApi, UserSession userSession) {
        AbstractC167017dG.A1P(context, userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36323285746592907L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36323285746658444L);
        long A01 = C18U.A01(c06090Tz, userSession, 36604760723494009L);
        long A012 = C18U.A01(c06090Tz, userSession, 36604760723559546L);
        TslogStreamApi createStream = tslogEngineApi.createStream("radio_signals", 10);
        C14360o3.A07(createStream);
        this.A02 = createStream;
        Timer timer = new Timer();
        this.A01 = timer;
        if (A06 || A062) {
            this.A00 = new IgRadioTsLoggerEngine(context, userSession, createStream, A06, A062);
            timer.scheduleAtFixedRate(new YKT(this), A01, A012);
        }
    }
}
