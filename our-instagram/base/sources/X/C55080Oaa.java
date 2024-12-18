package X;

import android.app.Activity;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.Oaa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55080Oaa {
    public static final C55080Oaa A01 = new Object();
    public static final C006802i A00 = AbstractC43592JPx.A0N();

    public static final void A00(String str, WeakReference weakReference) {
        Activity activity;
        short s;
        if (weakReference != null) {
            activity = (Activity) weakReference.get();
        } else {
            activity = null;
        }
        C006802i c006802i = A00;
        if (activity != null) {
            c006802i.markerAnnotate(728440635, "AppEntryActionRestart", str);
            Intent A08 = MSW.A08(activity, activity.getClass());
            A08.addFlags(268533760);
            C12260kU.A0C(activity, A08);
            activity.finish();
            C226418s A012 = C226218q.A01(AbstractC12960li.A00);
            A012.A0P(A012.A02, "RESET_TO_MAIN_FEED");
            s = 2;
        } else {
            c006802i.markerAnnotate(728440635, "AppEntryfailedOnRedetToFeed", str);
            s = 3;
        }
        c006802i.markerEnd(728440635, s);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        if (X.C18U.A06(r4, r20, 36320489724650045L) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.AbstractC10360h2 r19, com.instagram.common.session.UserSession r20, X.InterfaceC53842dO r21, java.lang.String r22, java.lang.ref.WeakReference r23, long r24) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55080Oaa.A01(X.0h2, com.instagram.common.session.UserSession, X.2dO, java.lang.String, java.lang.ref.WeakReference, long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (X.AbstractC50539MSs.A00.A02(r8, r9, r11) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        if (r11 <= X.AbstractC25225BEi.A07(r2, r8, 36601964702011820L)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        if (r9.equals(r4) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
        if (r9.equals("clips_viewer_clips_tab") != false) goto L42;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0076. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(X.AbstractC10360h2 r7, com.instagram.common.session.UserSession r8, java.lang.String r9, java.lang.ref.WeakReference r10, long r11) {
        /*
            r6 = this;
            boolean r3 = X.AbstractC43593JPy.A1b(r8)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36601964703584695(0x82094b003d11b7, double:3.210568090604381E-306)
            int r0 = X.AbstractC25225BEi.A07(r2, r8, r0)
            long r0 = (long) r0
            r5 = 1
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 <= 0) goto L38
            r0 = 36883439680356882(0x83094b003e0212, double:3.38857399932387E-306)
            java.lang.String r1 = X.C18U.A04(r2, r8, r0)
            java.lang.String r0 = ","
            java.util.List r0 = X.AbstractC167007dF.A0m(r1, r0, r3)
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L38
            X.02i r2 = X.C55080Oaa.A00
            r1 = 728440635(0x2b6b1f3b, float:8.353211E-13)
            java.lang.String r0 = "AppEntryCustomSurfaceAppReset"
            r2.markerAnnotate(r1, r0, r9)
        L34:
            A00(r9, r10)
            return r5
        L38:
            int r4 = r9.hashCode()
            r0 = -975990334(0xffffffffc5d391c2, float:-6770.2197)
            if (r4 == r0) goto L7d
            r0 = -633730979(0xffffffffda3a085d, float:-1.3090885E16)
            if (r4 == r0) goto L6b
            r0 = 136678739(0x8258d53, float:4.9819007E-34)
            if (r4 != r0) goto L76
            r0 = 393(0x189, float:5.51E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Laa
            r0 = 36320489725239877(0x81094b00242245, double:3.0325621808903544E-306)
            boolean r0 = X.C18U.A06(r2, r8, r0)
        L60:
            if (r0 == 0) goto L76
            X.Dnd r0 = X.AbstractC50539MSs.A00
            boolean r0 = r0.A02(r8, r9, r11)
            if (r0 == 0) goto L76
            goto L34
        L6b:
            r0 = 513(0x201, float:7.19E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r9.equals(r0)
            goto L60
        L76:
            switch(r4) {
                case -815402058: goto L7a;
                case -32305112: goto Lba;
                case 935219501: goto L9e;
                default: goto L79;
            }
        L79:
            goto Laa
        L7a:
            java.lang.String r4 = "self_profile"
            goto La4
        L7d:
            java.lang.String r4 = "feed_timeline"
            boolean r0 = r9.equals(r4)
            if (r0 == 0) goto La4
            r0 = 36320489724322361(0x81094b00162239, double:3.0325621803101136E-306)
            boolean r0 = X.C18U.A06(r2, r8, r0)
            if (r0 == 0) goto La4
            X.Dnd r0 = X.AbstractC50539MSs.A00
            boolean r0 = r0.A02(r8, r9, r11)
            if (r0 == 0) goto La4
            X.02i r0 = X.C55080Oaa.A00
            X.IB6.A00(r7, r0, r9)
            return r5
        L9e:
            r0 = 2333(0x91d, float:3.269E-42)
            java.lang.String r4 = X.AbstractC111324zv.A00(r0)
        La4:
            boolean r0 = r9.equals(r4)
            if (r0 != 0) goto Lc2
        Laa:
            r0 = 36601964702011820(0x82094b002511ac, double:3.2105680896096887E-306)
            int r0 = X.AbstractC25225BEi.A07(r2, r8, r0)
            long r1 = (long) r0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lc2
            goto L34
        Lba:
            java.lang.String r0 = "clips_viewer_clips_tab"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Laa
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55080Oaa.A02(X.0h2, com.instagram.common.session.UserSession, java.lang.String, java.lang.ref.WeakReference, long):boolean");
    }
}
