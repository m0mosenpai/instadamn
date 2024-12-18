package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class SV2 {
    public static final S6Y A00 = new Object();
    public static final List A01 = Arrays.asList(20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101);
    public static final List A02;
    public static final Map A03;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r2 < 20140701) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A00(android.content.Intent r6, android.os.Bundle r7, X.C62406SAf r8) {
        /*
            r5 = 0
            if (r6 == 0) goto L42
            java.lang.String r1 = "com.facebook.platform.protocol.PROTOCOL_VERSION"
            r0 = 0
            int r2 = r6.getIntExtra(r1, r0)
            java.util.List r1 = X.SV2.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L1c
            r1 = 20140701(0x133529d, float:3.293638E-38)
            r0 = 1
            if (r2 >= r1) goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L32
            java.lang.String r0 = "com.facebook.platform.protocol.BRIDGE_ARGS"
            android.os.Bundle r1 = r6.getBundleExtra(r0)
            if (r1 == 0) goto L30
            java.lang.String r0 = "action_id"
            java.lang.String r0 = r1.getString(r0)
        L2d:
            if (r0 == 0) goto L42
            goto L39
        L30:
            r0 = r5
            goto L2d
        L32:
            java.lang.String r0 = "com.facebook.platform.protocol.CALL_ID"
            java.lang.String r0 = r6.getStringExtra(r0)
            goto L2d
        L39:
            java.util.UUID r5 = java.util.UUID.fromString(r0)     // Catch: java.lang.IllegalArgumentException -> L3e
            goto L42
        L3e:
            r0 = move-exception
            r0.toString()
        L42:
            if (r5 != 0) goto L46
            r3 = 0
        L45:
            return r3
        L46:
            android.content.Intent r3 = X.AbstractC31171DnF.A04()
            java.lang.String r1 = "com.facebook.platform.protocol.PROTOCOL_VERSION"
            r0 = 0
            int r0 = r6.getIntExtra(r1, r0)
            r3.putExtra(r1, r0)
            android.os.Bundle r4 = X.AbstractC166987dD.A0b()
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = "action_id"
            r4.putString(r0, r1)
            if (r8 == 0) goto L82
            android.os.Bundle r2 = X.AbstractC166987dD.A0b()
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "error_description"
            r2.putString(r0, r1)
            java.lang.Integer r1 = r8.A00
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L7d
            java.lang.String r1 = "error_type"
            java.lang.String r0 = "UserCanceled"
            r2.putString(r1, r0)
        L7d:
            java.lang.String r0 = "error"
            r4.putBundle(r0, r2)
        L82:
            java.lang.String r0 = "com.facebook.platform.protocol.BRIDGE_ARGS"
            r3.putExtra(r0, r4)
            if (r7 == 0) goto L45
            java.lang.String r0 = "com.facebook.platform.protocol.RESULT_ARGS"
            r3.putExtra(r0, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SV2.A00(android.content.Intent, android.os.Bundle, X.SAf):android.content.Intent");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.S6Y] */
    static {
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(A00);
        A1E.add(new Object());
        A02 = A1E;
        HashMap A1G = AbstractC166987dD.A1G();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        A1E2.add(new Object());
        A1G.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", A1E);
        A1G.put("com.facebook.platform.action.request.FEED_DIALOG", A1E);
        A1G.put("com.facebook.platform.action.request.LIKE_DIALOG", A1E);
        A1G.put("com.facebook.platform.action.request.APPINVITES_DIALOG", A1E);
        A1G.put("com.facebook.platform.action.request.MESSAGE_DIALOG", A1E2);
        A1G.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", A1E2);
        A03 = A1G;
    }
}
