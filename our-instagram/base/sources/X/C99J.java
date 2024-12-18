package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.common.session.UserSession;

/* renamed from: X.99J, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C99J extends AbstractC1344165n {
    public final UserSession A00;
    public final AbstractC46972Dl A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final long A05;
    public final C4I3 A06;
    public final /* synthetic */ C4KR A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C99J(UserSession userSession, AbstractC46972Dl abstractC46972Dl, C4KR c4kr, C4I3 c4i3, String str, String str2, long j, long j2) {
        super(c4kr, Long.valueOf(j));
        this.A07 = c4kr;
        this.A00 = userSession;
        this.A05 = j2;
        this.A06 = c4i3;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = abstractC46972Dl;
        this.A04 = str == null;
    }

    @Override // X.AbstractC1344165n
    public final int A00() {
        long A01 = C18U.A01(C06090Tz.A05, this.A00, 36592309613560248L);
        if (A01 >= 0) {
            return (int) A01;
        }
        return -1;
    }

    @Override // X.AbstractC1344165n
    public final void A01() {
        Integer num;
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        Integer num2;
        AnonymousClass776 anonymousClass776;
        Integer num3;
        String str;
        C4KR c4kr = this.A07;
        int i = c4kr.A00;
        if (i != 0) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        boolean z = this.A04;
        if (!z && c4kr.A0E) {
            userSession = this.A00;
            c06090Tz = C06090Tz.A05;
            j = 36592309613298101L;
        } else {
            userSession = this.A00;
            if (!z) {
                c06090Tz = C06090Tz.A05;
                j = 36592309613429174L;
            } else {
                c06090Tz = C06090Tz.A06;
                j = 36592309613167028L;
            }
        }
        int A01 = (int) C18U.A01(c06090Tz, userSession, j);
        if (A01 != 0) {
            num2 = Integer.valueOf(A01);
        } else {
            num2 = null;
        }
        C4I3 c4i3 = this.A06;
        AbstractC46972Dl abstractC46972Dl = this.A01;
        String A012 = C99P.A01(userSession, abstractC46972Dl.A01, c4i3);
        C4KN c4kn = c4kr.A07;
        if (c4kn != null) {
            long j2 = this.A05;
            boolean A00 = c4kr.A05.A00();
            boolean A02 = AbstractC453326q.A02(userSession);
            Integer num4 = abstractC46972Dl.A03;
            int i2 = abstractC46972Dl.A00;
            if (z) {
                str = "snapshot";
            } else {
                str = "paging_new";
            }
            String str2 = this.A02;
            int i3 = super.A00;
            String str3 = super.A05;
            Long valueOf = Long.valueOf(j2);
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(num4, 4);
            C14360o3.A0B(str3, 11);
            anonymousClass776 = c4kn.A01(userSession, null, null, valueOf, 20119555, A00, A02, true);
            C006802i c006802i = c4kn.A00;
            MarkerEditor withMarker = c006802i.withMarker(anonymousClass776.A01, anonymousClass776.A00);
            withMarker.annotate("inbox_type", C99U.A00(num4));
            withMarker.annotate("thread_folder_type", i2);
            withMarker.annotate("thread_filter", A012);
            withMarker.annotate("fetch_type", str);
            withMarker.annotate("is_feed_to_inbox_v2_on_when_start", c006802i.isMarkerOn(1060769838));
            withMarker.annotate("is_feed_to_inbox_v1_on_when_start", c006802i.isMarkerOn(31784971));
            withMarker.annotate("uuid", str3);
            withMarker.annotate(TraceFieldType.RetryCount, i3);
            if (num != null) {
                withMarker.annotate("thread_limit", num.intValue());
            }
            if (num2 != null) {
                withMarker.annotate("thread_message_limit", num2.intValue());
            }
            if (str2 != null) {
                withMarker.annotate("fetch_reason", str2);
            }
            withMarker.markerEditingCompleted();
        } else {
            anonymousClass776 = null;
        }
        super.A03 = anonymousClass776;
        String str4 = this.A03;
        if (str4 != null) {
            num3 = C05F.A01;
        } else {
            num3 = null;
        }
        Long l = super.A04;
        if (l != null) {
            AnonymousClass777 A002 = C99W.A00(userSession, abstractC46972Dl, anonymousClass776, false, num3, num, num2, str4, null, A012, null, this.A02, super.A05, null, l.longValue());
            A002.A00(this);
            super.A02 = A002;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AbstractC1344165n
    public final void A02() {
        Long l;
        C99Z c99z;
        C4KR c4kr = this.A07;
        C4KN c4kn = c4kr.A07;
        if (c4kn != null) {
            AnonymousClass776 anonymousClass776 = super.A03;
            AbstractC115105If abstractC115105If = super.A01;
            if (abstractC115105If != null && (c99z = (C99Z) abstractC115105If.A00()) != null) {
                l = Long.valueOf(c99z.A01);
            } else {
                l = null;
            }
            if (anonymousClass776 != null) {
                C4KN.A00(anonymousClass776, c4kn, l);
                c4kn.A0D(anonymousClass776, null, false);
                c4kn.A00.markerEnd(20132917, (short) 3);
            }
        }
        A03();
        c4kr.A0E(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x011b, code lost:
    
        if (r2 != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea A[LOOP:4: B:50:0x00e4->B:52:0x00ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    @Override // X.AbstractC1344165n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04() {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99J.A04():void");
    }

    @Override // X.AbstractC1344165n
    public final void A08(boolean z) {
        Long l;
        C99Z c99z;
        C4KR c4kr = this.A07;
        C4KN c4kn = c4kr.A07;
        if (c4kn != null) {
            AnonymousClass776 anonymousClass776 = super.A03;
            Boolean valueOf = Boolean.valueOf(z);
            AbstractC115105If abstractC115105If = super.A01;
            if (abstractC115105If != null && (c99z = (C99Z) abstractC115105If.A00()) != null) {
                l = Long.valueOf(c99z.A01);
            } else {
                l = null;
            }
            if (anonymousClass776 != null) {
                C4KN.A00(anonymousClass776, c4kn, l);
                c4kn.A0D(anonymousClass776, valueOf, true);
                c4kn.A00.markerEnd(20132917, (short) 3);
            }
        }
        if (z) {
            A03();
        }
        c4kr.A0E(true);
    }

    @Override // X.AbstractC1344165n
    public final boolean A09() {
        if (super.A06.isEmpty() && !this.A04) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1344165n, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(817186757);
        C14360o3.A0B(abstractC115105If, 0);
        C4KN c4kn = this.A07.A07;
        if (c4kn != null) {
            c4kn.A02(abstractC115105If, super.A03);
        }
        super.onFail(abstractC115105If);
        C0f9.A0A(1620242136, A03);
    }

    @Override // X.AbstractC1344165n, X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(52476900);
        super.onStart();
        C4KN c4kn = this.A07.A07;
        if (c4kn != null) {
            c4kn.A05(super.A03);
        }
        C0f9.A0A(-1164704159, A03);
    }

    public final String toString() {
        JSR A00 = JSS.A00(this);
        A00.A01(this.A03, "oldestCursor");
        String obj = A00.toString();
        C14360o3.A07(obj);
        return obj;
    }
}
