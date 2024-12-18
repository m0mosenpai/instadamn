package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JVS implements InterfaceC162527Pp {
    public final C47649L2i A00;
    public final C31227DoA A01;
    public final JVU A02;
    public final JVR A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public JVS(C47649L2i c47649L2i) {
        this.A00 = c47649L2i;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C50252MHh(this, 27));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C50252MHh(this, 26));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C50252MHh(this, 25));
        UserSession userSession = c47649L2i.A01;
        Context context = c47649L2i.A00;
        this.A01 = AbstractC31273Dov.A00(context, userSession);
        this.A03 = new JVR(context, true, C18U.A05(C06090Tz.A05, userSession), true);
        this.A02 = new JVU(context);
        this.A07 = C50252MHh.A01(this, 28);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        if (r1.equals(r10) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        if (r3.A00(java.lang.Boolean.valueOf(r14)) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
    
        if (r1 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ae, code lost:
    
        if (X.AbstractC25226BEj.A10(r112.A07).A01.getInt("direct_thread_video_call_xma_start_call_confirmation_count", 0) >= 3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0232  */
    @Override // X.InterfaceC162527Pp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.InterfaceC66482zP AWm(android.content.Context r113, com.instagram.common.session.UserSession r114, X.AnonymousClass988 r115, X.C7VC r116, X.C7IM r117, X.C18A r118, boolean r119) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVS.AWm(android.content.Context, com.instagram.common.session.UserSession, X.988, X.7VC, X.7IM, X.18A, boolean):X.2zP");
    }
}
