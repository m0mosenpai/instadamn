package X;

import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2rI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61552rI extends C1I7 {
    public static final long A0B;
    public static final long A0C;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C5GO A08;
    public final UserSession A09;
    public final C61442r7 A0A;
    public String A02 = "";
    public int A01 = 0;
    public int A00 = 0;
    public final EvictingQueue A06 = new EvictingQueue(200);
    public final C006802i A07 = C006802i.A0p;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A0C = timeUnit.toMillis(10L);
        A0B = timeUnit.toMillis(10L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r4.equals(r0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0104, code lost:
    
        if (r4.equals(r0) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012b, code lost:
    
        if (r0 != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61552rI.A00(java.lang.String):void");
    }

    public final void A01(String str) {
        String upperCase = str.toUpperCase(Locale.US);
        if (!this.A02.equals(upperCase)) {
            A00(upperCase);
        }
    }

    public C61552rI(UserSession userSession, C61442r7 c61442r7) {
        this.A08 = AbstractC451025p.A00(userSession);
        this.A0A = c61442r7;
        this.A09 = userSession;
    }

    public final void A02(String str) {
        A00(str);
        C006802i c006802i = this.A07;
        if (c006802i.isMarkerOn(974462634, 0)) {
            c006802i.markerPoint(974462634, str);
            c006802i.markerEnd(974462634, (short) 2);
        }
        C61442r7 c61442r7 = this.A0A;
        c61442r7.A0I.A0O(c61442r7.A00, c61442r7, "SHIMMER_END", str);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        String str;
        int A03 = C0f9.A03(-1067362993);
        if (i == 0) {
            if (c3fq.CQ6()) {
                str = "MANUAL_SCROLL_TO_TOP";
                A01(str);
            }
        } else if (i == 1) {
            A01("MANUAL_SCROLL_FEED");
            str = "SCROLL_FEED";
            A01(str);
        }
        C0f9.A0A(1722668555, A03);
    }
}
