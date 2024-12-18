package X;

import android.content.Context;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.LGp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47954LGp {
    public static final C51u A05 = new C51u("", null, null);
    public static final byte[] A06 = {0};
    public final LruCache A00;
    public final C2ES A01;
    public final UserSession A02;
    public final Map A03;
    public final InterfaceC09390do A04;

    public final C44999Jvp A00(String str) {
        String A01;
        C14360o3.A0B(str, 0);
        this.A04.getValue();
        C0HM.A00();
        SWY swy = C47916LEk.A04;
        String A00 = LHs.A00(str);
        if (A00 != null && (A01 = LHs.A01(A00, LHs.A02)) != null) {
            return (C44999Jvp) this.A00.get(A01);
        }
        return null;
    }

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        C14120nc.A00().ATO(new C45720KLx(this, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r1 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            X.0do r0 = r2.A04
            r0.getValue()
            X.C0HM.A00()
            X.SWY r0 = X.C47916LEk.A04
            java.lang.String r1 = X.LHs.A00(r3)
            if (r1 == 0) goto L23
            java.lang.String[] r0 = X.LHs.A02
            java.lang.String r0 = X.LHs.A01(r1, r0)
            if (r0 == 0) goto L23
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L24
        L23:
            r0 = 1
        L24:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47954LGp.A02(java.lang.String):boolean");
    }

    public C47954LGp(Context context, UserSession userSession) {
        AbstractC167017dG.A1P(context, userSession);
        this.A02 = userSession;
        this.A04 = MHU.A00(context, this, 48);
        this.A00 = new LruCache(16);
        this.A01 = C2EP.A00();
        this.A03 = AbstractC166987dD.A1I();
    }
}
