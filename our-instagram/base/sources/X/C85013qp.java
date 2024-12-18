package X;

import com.instagram.api.schemas.MediaNoteMimicryTrigger;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3qp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85013qp {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final UserSession A05;
    public final C84993qn A06;
    public final EnumC85043qs A07;

    public final void A03(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C84993qn c84993qn = this.A06;
        c84993qn.A02 = true;
        BSo.A02(this.A05, str, str2);
        InterfaceC09390do interfaceC09390do = c84993qn.A07;
        if (((C23031Ai) interfaceC09390do.getValue()).A01.getInt("content_note_feed_nux_shown_count", 0) < this.A01) {
            C23031Ai c23031Ai = (C23031Ai) interfaceC09390do.getValue();
            int i = ((C23031Ai) interfaceC09390do.getValue()).A01.getInt("content_note_feed_nux_shown_count", 0) + 1;
            InterfaceC19610xo ARD = c23031Ai.A01.ARD();
            ARD.E7D("content_note_feed_nux_shown_count", i);
            ARD.apply();
        }
    }

    public final void A04(String str, String str2) {
        C14360o3.A0B(str, 0);
        C84993qn c84993qn = this.A06;
        c84993qn.A03 = true;
        BSo.A02(this.A05, str, str2);
        InterfaceC09390do interfaceC09390do = c84993qn.A07;
        if (((C23031Ai) interfaceC09390do.getValue()).A01.getInt("content_note_reels_nux_shown_count", 0) < this.A03) {
            C23031Ai c23031Ai = (C23031Ai) interfaceC09390do.getValue();
            int i = ((C23031Ai) interfaceC09390do.getValue()).A01.getInt("content_note_reels_nux_shown_count", 0) + 1;
            InterfaceC19610xo ARD = c23031Ai.A01.ARD();
            ARD.E7D("content_note_reels_nux_shown_count", i);
            ARD.apply();
        }
    }

    public final EnumC85043qs A00(MediaNoteMimicryTrigger mediaNoteMimicryTrigger, C38321qM c38321qM, Integer num, String str, boolean z) {
        C84993qn c84993qn = this.A06;
        if (c84993qn.A00()) {
            if (!c84993qn.A03 && ((C23031Ai) c84993qn.A07.getValue()).A01.getInt("content_note_reels_nux_shown_count", 0) < this.A03) {
                EnumC85043qs enumC85043qs = this.A07;
                if (enumC85043qs == EnumC85043qs.A03) {
                    return EnumC85043qs.A05;
                }
                return enumC85043qs;
            }
            if (z && AbstractC27604CGa.A00(this.A05).A01(mediaNoteMimicryTrigger, c38321qM, num, str)) {
                return EnumC85043qs.A06;
            }
        }
        return EnumC85043qs.A03;
    }

    public final EnumC85043qs A01(boolean z) {
        C84993qn c84993qn = this.A06;
        if (c84993qn.A00()) {
            if (!c84993qn.A02 && ((C23031Ai) c84993qn.A07.getValue()).A01.getInt("content_note_feed_nux_shown_count", 0) < this.A01) {
                EnumC85043qs enumC85043qs = this.A07;
                if (enumC85043qs == EnumC85043qs.A03) {
                    return EnumC85043qs.A05;
                }
                return enumC85043qs;
            }
            if (z) {
                return EnumC85043qs.A06;
            }
        }
        return EnumC85043qs.A03;
    }

    public final void A02() {
        C84993qn c84993qn = this.A06;
        InterfaceC09390do interfaceC09390do = c84993qn.A07;
        InterfaceC19630xq interfaceC19630xq = ((C23031Ai) interfaceC09390do.getValue()).A01;
        String A00 = AbstractC111324zv.A00(842);
        int i = interfaceC19630xq.getInt(A00, 0) + 1;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D(A00, i);
        ARD.apply();
        C23031Ai c23031Ai = (C23031Ai) interfaceC09390do.getValue();
        c84993qn.A06.getValue();
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD2 = c23031Ai.A01.ARD();
        ARD2.E7G("content_note_share_tooltip_nux_last_shown_timestamp", currentTimeMillis);
        ARD2.apply();
        c84993qn.A04 = true;
    }

    public final boolean A05() {
        C84993qn c84993qn = this.A06;
        InterfaceC09390do interfaceC09390do = c84993qn.A07;
        if (((C23031Ai) interfaceC09390do.getValue()).A01.getInt(AbstractC111324zv.A00(842), 0) < this.A04) {
            c84993qn.A06.getValue();
            long currentTimeMillis = System.currentTimeMillis() - ((C23031Ai) interfaceC09390do.getValue()).A01.getLong("content_note_share_tooltip_nux_last_shown_timestamp", 0L);
            TimeUnit timeUnit = TimeUnit.MINUTES;
            UserSession userSession = c84993qn.A05;
            C14360o3.A0B(userSession, 0);
            if (currentTimeMillis >= timeUnit.toMillis(C18U.A01(C06090Tz.A05, userSession, 36602093554307672L))) {
                return true;
            }
        }
        return false;
    }

    public final boolean A06() {
        return ((C23031Ai) this.A06.A07.getValue()).A01.getBoolean(AbstractC111324zv.A00(973), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A07(boolean r4) {
        /*
            r3 = this;
            X.3qn r1 = r3.A06
            if (r4 == 0) goto L20
            boolean r0 = r1.A03
            if (r0 != 0) goto L1e
            X.0do r0 = r1.A07
            java.lang.Object r0 = r0.getValue()
            X.1Ai r0 = (X.C23031Ai) r0
            X.0xq r2 = r0.A01
            java.lang.String r1 = "content_note_reels_nux_shown_count"
            r0 = 0
            int r2 = r2.getInt(r1, r0)
            int r1 = r3.A03
        L1b:
            r0 = 1
            if (r2 < r1) goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
        L20:
            boolean r0 = r1.A02
            if (r0 != 0) goto L1e
            X.0do r0 = r1.A07
            java.lang.Object r0 = r0.getValue()
            X.1Ai r0 = (X.C23031Ai) r0
            X.0xq r2 = r0.A01
            java.lang.String r1 = "content_note_feed_nux_shown_count"
            r0 = 0
            int r2 = r2.getInt(r1, r0)
            int r1 = r3.A01
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85013qp.A07(boolean):boolean");
    }

    public C85013qp(UserSession userSession, C84993qn c84993qn) {
        EnumC85043qs enumC85043qs;
        this.A05 = userSession;
        this.A06 = c84993qn;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A01 = (int) C18U.A01(c06090Tz, userSession, 36602093550375495L);
        this.A03 = (int) C18U.A01(c06090Tz, userSession, 36602093550506569L);
        this.A02 = (int) C18U.A01(c06090Tz, userSession, 36602093554504282L);
        this.A00 = (int) C18U.A01(c06090Tz, userSession, 36602093553914454L);
        this.A04 = (int) C18U.A01(c06090Tz, userSession, 36602093554176599L);
        int A01 = (int) C18U.A01(c06090Tz, userSession, 36602093552407120L);
        if (A01 != 1) {
            if (A01 != 2) {
                if (A01 != 3) {
                    enumC85043qs = EnumC85043qs.A03;
                } else {
                    enumC85043qs = EnumC85043qs.A04;
                }
            } else {
                enumC85043qs = EnumC85043qs.A02;
            }
        } else {
            enumC85043qs = EnumC85043qs.A05;
        }
        this.A07 = enumC85043qs;
    }
}
