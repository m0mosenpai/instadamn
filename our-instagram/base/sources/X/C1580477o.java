package X;

import com.instagram.common.session.UserSession;
import com.meta.cal.AudioSession;
import com.meta.cal.AudioSessionFactory;
import com.meta.cal.CaptionCallback;
import com.meta.cal.IoConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.77o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1580477o implements InterfaceC13050lr {
    public AudioSessionFactory A00;
    public final UserSession A01;
    public final C129805tk A02;
    public final Map A03;
    public final InterfaceC09390do A04;
    public final C19L A05;
    public final C12L A06;

    public static final /* synthetic */ C46102Kb2 A00(C1580477o c1580477o, L7E l7e, int i) {
        return new C46102Kb2(c1580477o, l7e, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AudioSession A02(CaptionCallback captionCallback, byte b, int i, int i2) {
        AudioSession audioSession;
        C129805tk c129805tk = this.A02;
        if (c129805tk != null) {
            c129805tk.A00.markerPoint(331815788, i2, "CREATE_AUDIO_SESSION_START");
        }
        AudioSessionFactory audioSessionFactory = this.A00;
        if (audioSessionFactory != null) {
            audioSessionFactory.registerCaptionCallback(captionCallback);
        }
        AudioSessionFactory audioSessionFactory2 = this.A00;
        if (audioSessionFactory2 != null) {
            audioSession = audioSessionFactory2.createSession(new IoConfig(i, b));
        } else {
            audioSession = null;
        }
        if (c129805tk != null) {
            c129805tk.A00.markerPoint(331815788, i2, "CREATE_AUDIO_SESSION_END");
        }
        return audioSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1.A00, 36325454705603668L) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1.A00, 36325454705275984L) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        if (X.C18U.A06(r2, r3, 36325454705865814L) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C1580477o r9) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1580477o.A04(X.77o):void");
    }

    public static final boolean A06() {
        C17280tP A00 = C17280tP.A4E.A00();
        if (A00.A38.CES(A00, C17280tP.A4G[249]) != null && AbstractC53603NnA.A00) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A03.clear();
        this.A00 = null;
    }

    public C1580477o(UserSession userSession, C129805tk c129805tk) {
        this.A01 = userSession;
        this.A02 = c129805tk;
        C12L c12l = C12L.A00;
        this.A06 = c12l;
        this.A05 = AnonymousClass194.A02(c12l.CPG(467813965, 3));
        this.A04 = AbstractC09440dt.A00(EnumC09460dv.A02, B72.A00);
        this.A03 = new LinkedHashMap();
    }
}
