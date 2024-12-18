package X;

import android.content.Context;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.externalcall.gen.ExternalCallProxy;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.rsys.proxies.IGRTCFeatureProviderProxy;
import com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder;

/* loaded from: classes9.dex */
public final class NUC extends IGRTCFeatureProviderProxy {
    public final Context A00;
    public final C52020MzZ A01;
    public final AudioModule A02;
    public final ExternalCallProxy A03;
    public final UserSession A04;
    public final C52021Mzb A05;
    public final C51998Myn A06;
    public final C45344K4y A07;
    public final C52019MzX A08;
    public final C52022Mzd A09;
    public final XX0 A0A;
    public final C52023Mzj A0B;
    public final C52024Mzm A0C;
    public final C52025Mzo A0D;
    public final N04 A0E;
    public final C26672Bq7 A0F;
    public final C214069e5 A0G;
    public final C52008Mz7 A0H;
    public final O5J A0I;
    public final IGRTCSyncedClockHolder A0J;
    public final C55074OaU A0K;
    public final boolean A0L;
    public final boolean A0M;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r11 != 1) goto L22;
     */
    @Override // com.instagram.rtc.rsys.proxies.IGRTCFeatureProviderProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList createFeatureHolders() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NUC.createFeatureHolders():java.util.ArrayList");
    }

    public NUC(Context context, UserSession userSession, C54996OUf c54996OUf) {
        this.A04 = userSession;
        this.A00 = context;
        this.A0I = c54996OUf.A0a;
        this.A08 = c54996OUf.A0M;
        this.A0J = c54996OUf.A0b;
        this.A07 = c54996OUf.A0K;
        this.A05 = c54996OUf.A0I;
        this.A03 = c54996OUf.A0C;
        this.A09 = c54996OUf.A0N;
        this.A0E = c54996OUf.A0S;
        this.A0K = c54996OUf.A0c;
        this.A0A = c54996OUf.A0O;
        this.A0B = c54996OUf.A0P;
        this.A0C = c54996OUf.A0Q;
        this.A0H = c54996OUf.A0Y;
        this.A0D = c54996OUf.A0R;
        this.A06 = c54996OUf.A0J;
        this.A02 = c54996OUf.A0A;
        this.A0F = c54996OUf.A0U;
        this.A0G = c54996OUf.A0V;
        this.A0M = c54996OUf.A0l;
        this.A0L = c54996OUf.A0k;
        this.A01 = c54996OUf.A08;
    }
}
