package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "Deprecated interactivity API", replaceWith = @ReplaceWith(expression = "ShowreelInteractivityListener", imports = {"com.facebook.showreel.core.interactivity"}))
/* renamed from: X.5u2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129975u2 {
    public final Map A00 = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        if (r2 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(android.graphics.PointF r14, android.graphics.RectF r15, android.view.View r16, X.InterfaceC30928Dii r17, X.C66190U3f r18, java.lang.Object r19) {
        /*
            r13 = this;
            r9 = r19
            r6 = 0
            r5 = 1
            java.util.Map r3 = r13.A00
            java.lang.Object r2 = r3.get(r15)
            boolean r0 = r2 instanceof X.C84823qW
            r8 = 0
            if (r0 == 0) goto L22
            X.3qW r2 = (X.C84823qW) r2
        L11:
            r4 = r18
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "hashtag"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L49
            if (r2 != 0) goto Lc7
            java.lang.String r1 = r4.A01
            goto L24
        L22:
            r2 = r8
            goto L11
        L24:
            java.nio.charset.Charset r0 = X.C15W.A05     // Catch: java.io.UnsupportedEncodingException -> L40
            java.lang.String r0 = r0.name()     // Catch: java.io.UnsupportedEncodingException -> L40
            java.lang.String r0 = java.net.URLDecoder.decode(r1, r0)     // Catch: java.io.UnsupportedEncodingException -> L40
            java.lang.String r0 = r0.toLowerCase()
            X.C14360o3.A07(r0)
            com.instagram.model.hashtag.HashtagImpl r0 = X.AbstractC1120253r.A01(r0, r0)
            X.3qW r2 = new X.3qW
            r2.<init>(r0)
            goto Lc4
        L40:
            r2 = move-exception
            java.lang.String r1 = "Bad encoding type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        L49:
            java.lang.String r0 = "mention"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L69
            if (r2 != 0) goto Lc7
            java.lang.String r1 = r4.A01
            java.nio.charset.Charset r0 = X.C15W.A05     // Catch: java.io.UnsupportedEncodingException -> L60
            java.lang.String r0 = r0.name()     // Catch: java.io.UnsupportedEncodingException -> L60
            java.lang.String r2 = java.net.URLDecoder.decode(r1, r0)     // Catch: java.io.UnsupportedEncodingException -> L60
            goto Lac
        L60:
            r2 = move-exception
            java.lang.String r1 = "Bad encoding type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        L69:
            java.lang.String r0 = "media"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto La9
            if (r2 != 0) goto La2
            X.3qW r2 = new X.3qW
            r2.<init>()
            X.3a5 r0 = X.EnumC75383a5.A0T
            r2.A12 = r0
            java.lang.String r0 = r4.A01
            r2.A1b = r0
            boolean r0 = r9 instanceof X.C41181vS
            if (r0 == 0) goto Lab
            X.1vS r9 = (X.C41181vS) r9
            if (r9 == 0) goto Lab
            android.content.Context r7 = r16.getContext()
            X.C14360o3.A07(r7)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            r11 = r8
            r12 = r8
            java.lang.CharSequence r0 = X.AbstractC84863qa.A05(r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = r0.toString()
            r2.A1S = r0
            r3.put(r15, r2)
        La2:
            float r0 = r14.x
            r2.A03 = r0
            float r0 = r14.y
            goto Ld1
        La9:
            if (r2 != 0) goto Ld3
        Lab:
            return r6
        Lac:
            boolean r0 = r9 instanceof X.C41181vS
            if (r0 == 0) goto Lab
            r1 = 0
            X.1vS r9 = (X.C41181vS) r9
            if (r9 == 0) goto Lbf
            X.6QX r0 = r9.A0G()
            if (r0 == 0) goto Lbf
            com.instagram.user.model.User r1 = X.C6RX.A02(r0, r2)
        Lbf:
            X.3qW r2 = new X.3qW
            r2.<init>(r1)
        Lc4:
            r3.put(r15, r2)
        Lc7:
            float r0 = r15.centerX()
            r2.A03 = r0
            float r0 = r15.centerY()
        Ld1:
            r2.A04 = r0
        Ld3:
            float r0 = r15.height()
            r2.A00 = r0
            r0 = r17
            if (r17 == 0) goto Lab
            r0.DmB(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129975u2.A00(android.graphics.PointF, android.graphics.RectF, android.view.View, X.Dii, X.U3f, java.lang.Object):boolean");
    }
}
