package X;

/* renamed from: X.8rC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC199098rC {
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1ON A00(android.location.Location r8, X.C22P r9, com.instagram.common.session.UserSession r10, X.C55U r11, java.lang.Boolean r12, java.lang.Integer r13, long r14) {
        /*
            r5 = 0
            X.C14360o3.A0B(r10, r5)
            r0 = 5
            X.C14360o3.A0B(r9, r0)
            boolean r3 = r11 instanceof X.C81V
            if (r3 == 0) goto Lc6
            java.lang.String r1 = r11.A02
            java.lang.String r0 = "_sticker_tray_v1"
            java.lang.String r7 = X.AnonymousClass001.A0R(r1, r0)
        L14:
            r4 = 0
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r10, r0)
            java.lang.Integer r0 = X.C05F.A01
            r2.A09(r0)
            java.lang.String r0 = "creatives/sticker_tray/"
            r2.A0B(r0)
            X.5NH r0 = X.C5NH.A06
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "type"
            r2.A9s(r0, r1)
            long r0 = r9.A00
            java.lang.String r6 = "camera_entry_point"
            r2.A0E(r6, r0)
            r2.A0A = r7
            r2.A07 = r13
            java.lang.Class<X.8rD> r1 = X.C199108rD.class
            java.lang.Class<X.8rE> r0 = X.C199118rE.class
            r2.A0P(r4, r1, r0, r5)
            r0 = 1
            r2.A0R = r0
            java.lang.Integer r0 = X.C05F.A0N
            if (r13 != r0) goto L49
            r2.A01 = r14
        L49:
            java.lang.String r1 = "sticker_tray_surface"
            if (r3 == 0) goto Lb8
            java.lang.String r0 = "CLIPS"
        L4f:
            r2.A9s(r1, r0)
        L52:
            int r0 = r9.ordinal()
            switch(r0) {
                case 2: goto Lb2;
                case 7: goto Lb2;
                case 9: goto Lb2;
                case 95: goto Laf;
                case 96: goto Laf;
                case 97: goto Laf;
                case 345: goto Lac;
                case 523: goto Lb2;
                case 560: goto Lb2;
                default: goto L59;
            }
        L59:
            if (r8 == 0) goto L9c
            double r0 = r8.getLatitude()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "lat"
            r2.A9s(r0, r1)
            double r0 = r8.getLongitude()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "lng"
            r2.A9s(r0, r1)
            float r0 = r8.getAccuracy()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "horizontalAccuracy"
            r2.A9s(r0, r1)
            double r0 = r8.getAltitude()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "alt"
            r2.A9s(r0, r1)
            float r0 = r8.getSpeed()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "speed"
            r2.A9s(r0, r1)
        L9c:
            if (r12 == 0) goto La7
            boolean r1 = r12.booleanValue()
            java.lang.String r0 = "is_ads_mode"
            r2.A0I(r0, r1)
        La7:
            X.1ON r0 = r2.A0N()
            return r0
        Lac:
            java.lang.String r0 = "STORY_QUESTION_RESPONSE"
            goto Lb4
        Laf:
            java.lang.String r0 = "GROUP_STORIES"
            goto Lb4
        Lb2:
            java.lang.String r0 = "DIRECT"
        Lb4:
            r2.A9s(r1, r0)
            goto L59
        Lb8:
            boolean r0 = r11 instanceof X.C208509Kk
            if (r0 == 0) goto Lbf
            java.lang.String r0 = "STORIES"
            goto L4f
        Lbf:
            boolean r0 = r11 instanceof X.C128535rM
            if (r0 == 0) goto L52
            java.lang.String r0 = "FEED"
            goto L4f
        Lc6:
            java.lang.String r7 = "creatives/sticker_tray/sticker_tray_v1"
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC199098rC.A00(android.location.Location, X.22P, com.instagram.common.session.UserSession, X.55U, java.lang.Boolean, java.lang.Integer, long):X.1ON");
    }
}
