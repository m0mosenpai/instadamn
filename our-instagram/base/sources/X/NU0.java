package X;

import android.content.Context;
import com.facebook.rsys.mediasync.gen.MediaSyncState;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* loaded from: classes9.dex */
public final class NU0 extends AbstractC54988OTw {
    public MediaSyncState A00;
    public InterfaceC58104PpT A01;
    public OUG A02;
    public String A03;
    public boolean A04;
    public final Context A05;
    public final UserSession A06;
    public final C56124Ovk A07;
    public final OE0 A08;
    public final O4X A09;
    public final C55221Oek A0A;
    public final OWf A0B;
    public final C54454O4i A0C;
    public final C54455O4j A0D;
    public final InterfaceC16820sZ A0E;
    public final C05A A0F;

    public static final C51628MrL A00(RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, String str) {
        String str2 = str;
        String str3 = rtcStartCoWatchPlaybackArguments.A04;
        int intValue = rtcStartCoWatchPlaybackArguments.A01.intValue();
        int i = 2;
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    i = 4;
                } else {
                    throw B4Z.A00();
                }
            }
        } else {
            i = 1;
        }
        Long A0d = AbstractC167007dF.A0d();
        if (str == null) {
            str2 = IR8.A00(rtcStartCoWatchPlaybackArguments.A03);
        }
        return new C51628MrL(null, rtcStartCoWatchPlaybackArguments.A00, A0d, str3, str2, 0, i, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C51628MrL A01(X.InterfaceC58294Psm r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NU0.A01(X.Psm):X.MrL");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NU0(Context context, UserSession userSession, C54446O4a c54446O4a, OWf oWf, C54454O4i c54454O4i, C54455O4j c54455O4j, InterfaceC16820sZ interfaceC16820sZ) {
        super(c54446O4a);
        C55221Oek c55221Oek = new C55221Oek(context, userSession);
        if (C37051o3.A00 == null) {
            C14360o3.A0F("plugin");
            throw C00O.createAndThrow();
        }
        C56124Ovk c56124Ovk = (C56124Ovk) userSession.A01(C56124Ovk.class, C57333Pct.A00);
        C14360o3.A0B(c56124Ovk, 9);
        this.A05 = context;
        this.A06 = userSession;
        this.A0B = oWf;
        this.A0C = c54454O4i;
        this.A0D = c54455O4j;
        this.A0E = interfaceC16820sZ;
        this.A0A = c55221Oek;
        this.A07 = c56124Ovk;
        this.A08 = new OE0(userSession, oWf);
        this.A0F = AbstractC25225BEi.A1H(new C26087BgG((MediaSyncState) null, (RtcStartCoWatchPlaybackArguments) null, (String) null, 15));
        this.A09 = new O4X(this);
        this.A03 = "";
    }
}
