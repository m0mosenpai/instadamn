package X;

import android.app.Activity;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView;

/* renamed from: X.8r5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199028r5 {
    public C8DO A00;
    public C199078rA A01;
    public EphemeralMediaToggleView A02;
    public final Context A03;
    public final ImmutableList A04;
    public final UserSession A05;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x016d, code lost:
    
        if (r1 != 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C199028r5(android.content.Context r15, com.google.common.collect.ImmutableList r16, com.instagram.common.session.UserSession r17, X.C8DO r18, com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView r19) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199028r5.<init>(android.content.Context, com.google.common.collect.ImmutableList, com.instagram.common.session.UserSession, X.8DO, com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView):void");
    }

    private final void A00(C8DO c8do) {
        Activity activity;
        if (AbstractC16960so.A1Q("once", "replayable").contains(c8do.A00)) {
            Context context = this.A03;
            if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                UserSession userSession = this.A05;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36327374555658789L)) {
                    C22970AAo c22970AAo = AG2.A01;
                    if (c22970AAo.A00(userSession).A00.getBoolean("KEY_SHOULD_SHOW_SCREENSHOT_BLOCKING_NUX", true)) {
                        C189478aR A00 = new C189448aO(userSession).A00();
                        String A04 = C18U.A04(c06090Tz, userSession, 36890324509131643L);
                        C26846Bt8 c26846Bt8 = new C26846Bt8();
                        c26846Bt8.A01 = new C50160MDn(A00, 1);
                        C57262Pbk c57262Pbk = null;
                        if (AbstractC002300n.A0h(A04, "http", false)) {
                            c57262Pbk = new C57262Pbk(activity, c26846Bt8, A04, 12);
                        }
                        c26846Bt8.A00 = c57262Pbk;
                        A00.A02(activity, c26846Bt8);
                        InterfaceC19610xo ARD = c22970AAo.A00(userSession).A00.ARD();
                        ARD.E77("KEY_SHOULD_SHOW_SCREENSHOT_BLOCKING_NUX", false);
                        ARD.apply();
                        String A002 = AbstractC43591JPw.A00(1062);
                        C18920wW A01 = AbstractC12220kQ.A01(new C19270xB(A002), userSession);
                        InterfaceC02590Ai A003 = A01.A00(A01.A00, A002);
                        if (A003.isSampled()) {
                            A003.AAP("identifier", "direct-view-once-screenshot-prevention-nux-key");
                            A003.Cht();
                        }
                    }
                }
            }
        }
    }

    public static final boolean A01(C8DO c8do, C199028r5 c199028r5, Integer num) {
        ImmutableList immutableList = c199028r5.A04;
        if (immutableList.contains(c8do)) {
            C199078rA c199078rA = c199028r5.A01;
            if (c199078rA == null) {
                C14360o3.A0F("ephemeralMediaTogglePresenter");
                throw C00O.createAndThrow();
            }
            c199078rA.A00(num);
            if (immutableList.contains(c8do) && c199028r5.A00 != c8do) {
                c199028r5.A00 = c8do;
            }
            c199028r5.A00(c8do);
            return true;
        }
        return false;
    }
}
