package X;

import android.graphics.Rect;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class MW5 {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r15 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C9J0 A00(X.MWL r30) {
        /*
            r4 = r30
            java.lang.String r8 = r4.A06
            X.5JK r14 = r4.A03
            long r2 = r4.A01
            java.lang.String r11 = r4.A09
            java.lang.String r10 = r4.A04
            java.lang.String r9 = r4.A05
            java.lang.String r7 = r4.A07
            java.util.List r5 = r4.A0A
            X.9JS r13 = r4.A02
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L61
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error: draft video segment is empty, session id "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", clips creation type "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ClipsDraftLocalDataSource"
            X.C0w9.A03(r0, r1)
            r15 = 0
        L39:
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r5, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L48:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r5.next()
            X.5Kh r0 = (X.C115475Kh) r0
            int r1 = r0.A08
            int r0 = r0.A09
            int r1 = r1 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.add(r0)
            goto L48
        L61:
            r6 = 0
            if (r13 == 0) goto L7d
            X.8aZ r12 = r13.A06
            if (r12 == 0) goto L7d
            X.8aZ r0 = X.EnumC189548aZ.A07
            r1 = 1
            if (r12 != r0) goto L86
            int r0 = r5.size()
            if (r0 <= r1) goto L86
        L73:
            java.lang.Object r0 = r5.get(r1)
            X.5Kh r0 = (X.C115475Kh) r0
            X.5Km r15 = r0.A0G
            if (r15 != 0) goto L39
        L7d:
            java.lang.Object r0 = r5.get(r6)
            X.5Kh r0 = (X.C115475Kh) r0
            X.5Km r15 = r0.A0G
            goto L39
        L86:
            r1 = 0
            goto L73
        L88:
            int r23 = X.AbstractC001800i.A02(r6)
            boolean r6 = r4.A0B
            long r0 = r4.A00
            java.lang.String r5 = r4.A08
            r16 = 0
            boolean r4 = r4.A0C
            r30 = 0
            X.9J0 r12 = new X.9J0
            r24 = r2
            r26 = r0
            r28 = r6
            r29 = r4
            r21 = r7
            r22 = r5
            r20 = r9
            r19 = r10
            r18 = r11
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r29, r30)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MW5.A00(X.MWL):X.9J0");
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.5Ks, X.9nQ] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, X.8ym] */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.8ys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [X.8yk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.OA3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, X.8yh] */
    public static final C128175qm A01(UserSession userSession, C50602MVn c50602MVn) {
        EnumC50651MXr enumC50651MXr;
        MediaCroppingCoordinates mediaCroppingCoordinates;
        LocationDict locationDict;
        UpcomingEventImpl upcomingEventImpl;
        CropInfo cropInfo;
        List list = c50602MVn.A0m;
        C203248yh c203248yh = c50602MVn.A0C;
        List list2 = c50602MVn.A0j;
        C50603MVo c50603MVo = c50602MVn.A0J;
        List list3 = c50603MVo.A02;
        List list4 = c50603MVo.A03;
        JUM jum = (JUM) AbstractC001800i.A0J(list4);
        C203248yh c203248yh2 = c203248yh;
        if (jum != null) {
            c203248yh2 = c203248yh;
            if (C18U.A06(C06090Tz.A05, userSession, 36330797644399644L)) {
                list = (List) jum.A06;
                ?? obj = new Object();
                ?? obj2 = new Object();
                ?? obj3 = new Object();
                obj3.A04 = obj2;
                obj3.A03 = new Object();
                obj.A02 = obj3;
                obj.A01 = (C8r2) jum.A05;
                list2 = (List) jum.A02;
                list3 = (List) jum.A04;
                c203248yh2 = obj;
            }
        }
        String str = c50602MVn.A0W;
        EnumC50656MXw enumC50656MXw = c50603MVo.A01;
        if (c50602MVn.A0z) {
            enumC50651MXr = EnumC50651MXr.A03;
        } else {
            enumC50651MXr = EnumC50651MXr.A02;
        }
        C5JK c5jk = c50602MVn.A0G;
        AudioOverlayTrack audioOverlayTrack = c50602MVn.A0N;
        String str2 = c50602MVn.A0e;
        ShareMediaLoggingInfo shareMediaLoggingInfo = c50602MVn.A0B;
        C9JS c9js = c50602MVn.A0E;
        String str3 = c50602MVn.A0Q;
        String str4 = c50602MVn.A0S;
        C9ZU c9zu = c50602MVn.A05;
        if (c9zu != null) {
            mediaCroppingCoordinates = new MediaCroppingCoordinates(c9zu.A00, c9zu.A01, c9zu.A02, c9zu.A03);
        } else {
            mediaCroppingCoordinates = null;
        }
        boolean z = c50602MVn.A0w;
        String str5 = c50602MVn.A0U;
        List list5 = c50602MVn.A0k;
        C101394gx c101394gx = c50602MVn.A0O;
        EnumC76383bi enumC76383bi = c50602MVn.A0L;
        String str6 = c50602MVn.A0R;
        List list6 = c50602MVn.A0g;
        String str7 = c50602MVn.A0T;
        Venue venue = c50602MVn.A0M;
        if (venue != null) {
            locationDict = venue.A00.F6g();
        } else {
            locationDict = null;
        }
        String str8 = c50602MVn.A0d;
        List list7 = c50602MVn.A0f;
        C110204xp c110204xp = c50602MVn.A0A;
        boolean z2 = c50602MVn.A0x;
        List list8 = c50602MVn.A0i;
        C01L A1I = C0eM.A1I();
        EnumC192868gS enumC192868gS = c50602MVn.A0F;
        Integer num = C05F.A00;
        ?? obj4 = new Object();
        obj4.A00 = num;
        obj4.A00 = enumC192868gS;
        A1I.add(obj4);
        C219779nP c219779nP = c50602MVn.A0H;
        if (c219779nP != null) {
            A1I.add(c219779nP);
        }
        C01L A1J = C0eM.A1J(A1I);
        UpcomingEvent upcomingEvent = c50602MVn.A0P;
        if (upcomingEvent != null) {
            upcomingEventImpl = upcomingEvent.F7b(null);
        } else {
            upcomingEventImpl = null;
        }
        String str9 = c50602MVn.A0X;
        String str10 = c50602MVn.A0V;
        String str11 = c50602MVn.A0Y;
        long j = c50602MVn.A03;
        long j2 = c50602MVn.A04;
        long j3 = c50602MVn.A02;
        ?? obj5 = new Object();
        obj5.A01 = j;
        obj5.A02 = j2;
        obj5.A00 = j3;
        C54632OBh c54632OBh = c50602MVn.A0D;
        C38686GzR c38686GzR = c50602MVn.A07;
        C51662Mrt c51662Mrt = c50602MVn.A0K;
        if (c51662Mrt != null) {
            int i = c51662Mrt.A01;
            int i2 = c51662Mrt.A00;
            Rect A0U = AbstractC166987dD.A0U();
            c51662Mrt.A02.roundOut(A0U);
            cropInfo = new CropInfo(A0U, i, i2);
        } else {
            cropInfo = null;
        }
        boolean z3 = c50602MVn.A0o;
        boolean z4 = c50602MVn.A0r;
        boolean z5 = c50602MVn.A0q;
        boolean z6 = c50602MVn.A0t;
        boolean z7 = c50602MVn.A0v;
        boolean z8 = c50602MVn.A0s;
        List list9 = c50602MVn.A0h;
        List list10 = c50602MVn.A0l;
        String str12 = c50602MVn.A0c;
        int i3 = c50602MVn.A00;
        long j4 = c50602MVn.A01;
        boolean z9 = c50602MVn.A0p;
        String str13 = c50602MVn.A0a;
        String str14 = c50602MVn.A0Z;
        String str15 = c50602MVn.A0b;
        C51685MsG c51685MsG = c50602MVn.A0I;
        return new C128175qm(c50602MVn.A06, null, c38686GzR, c50602MVn.A08, mediaCroppingCoordinates, c50602MVn.A09, c110204xp, null, cropInfo, shareMediaLoggingInfo, c203248yh2, c54632OBh, c9js, obj5, enumC50651MXr, c5jk, c51685MsG, null, enumC76383bi, locationDict, audioOverlayTrack, null, c101394gx, enumC50656MXw, upcomingEventImpl, null, str, str3, str2, null, str4, str5, str6, str7, str8, str11, str9, str10, null, str12, str13, str14, str15, list, list3, list4, list5, list9, list6, list2, list7, list8, A1J, null, list10, null, i3, j4, z, z2, z3, false, z4, z5, z6, z7, z8, z9, false, c50602MVn.A0n, c50602MVn.A0u, true, c50602MVn.A0y);
    }
}
