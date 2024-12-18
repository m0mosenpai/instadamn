package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.6jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147046jg {
    public final UserSession A00;
    public final C145826hf A01;
    public final InterfaceC1118853a A02;
    public final InterfaceC114805Gn A03;

    public C147046jg(UserSession userSession, C145826hf c145826hf, InterfaceC1118853a interfaceC1118853a, InterfaceC114805Gn interfaceC114805Gn) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC114805Gn, 2);
        C14360o3.A0B(c145826hf, 3);
        this.A00 = userSession;
        this.A03 = interfaceC114805Gn;
        this.A01 = c145826hf;
        this.A02 = interfaceC1118853a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (r24.A00() != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C41181vS r22, X.C41551w4 r23, X.LG8 r24, java.lang.String r25, boolean r26) {
        /*
            r21 = this;
            r14 = 1
            r6 = r24
            java.lang.String r13 = r6.A04
            int r0 = r13.length()
            r7 = r21
            if (r0 != 0) goto L17
            java.lang.String r0 = r6.A01
            if (r0 != 0) goto L17
        L11:
            X.53a r0 = r7.A02
            r0.CMc()
            return
        L17:
            r8 = r22
            com.instagram.user.model.User r4 = r8.A0i
            r3 = r4
            r10 = r23
            if (r4 != 0) goto L26
            com.instagram.model.reels.Reel r0 = r10.A0H
            com.instagram.user.model.User r3 = r0.A0D()
        L26:
            if (r3 != 0) goto L32
            X.0w9 r2 = X.C0w9.A01
            java.lang.String r1 = "ReelMessageHelper"
            java.lang.String r0 = "Message failed to send.  Potential cause: no valid recipient found in ReelItem or ReelViewModel object."
            r2.EmN(r1, r0)
            goto L11
        L32:
            X.6hf r15 = r7.A01
            X.5Gn r1 = r7.A03
            com.instagram.common.session.UserSession r2 = r7.A00
            X.1vS r0 = r10.A08(r2)
            X.6ac r0 = r1.C00(r0)
            float r5 = r0.A0B
            X.1vS r0 = r10.A08(r2)
            X.6ac r0 = r1.C00(r0)
            float r1 = r0.A0A
            java.lang.String r0 = r6.A05
            if (r0 == 0) goto Lbb
            int r0 = r0.length()
            if (r0 == 0) goto Lbb
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L60
            int r0 = r0.length()
            if (r0 != 0) goto Lbb
        L60:
            r19 = 1
        L62:
            boolean r20 = r6.A00()
            r16 = r10
            r17 = r5
            r18 = r1
            r15.A0D(r16, r17, r18, r19, r20)
            r1 = 766842320(0x2db515d0, float:2.0587004E-11)
            java.lang.String r0 = ""
            if (r4 == 0) goto L7a
            java.lang.String r0 = r4.getId()
        L7a:
            X.C5M8.A01(r2, r0, r1)
            r0 = r26
            com.instagram.model.direct.DirectShareTarget r5 = X.AbstractC140386Ws.A00(r3, r0)
            X.3oG r0 = r5.A09
            r0.getClass()
            boolean r0 = r0 instanceof X.InterfaceC83703oF
            if (r0 == 0) goto Lc4
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 2342156051466094224(0x20810285002b0690, double:4.0596863004819785E-152)
            boolean r0 = X.C18U.A06(r4, r2, r0)
            if (r0 == 0) goto Lc4
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r0.<init>(r3)
            java.util.List r9 = java.util.Collections.singletonList(r0)
            X.C14360o3.A07(r9)
            java.lang.String r11 = r0.A0C
            X.7YG r1 = X.C7YF.A00(r2)
            X.5g6 r0 = new X.5g6
            r0.<init>(r9)
            X.MIk r5 = new X.MIk
            r12 = r25
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A02(r0, r9, r5, r14)
            return
        Lbb:
            boolean r0 = r6.A00()
            r19 = 0
            if (r0 == 0) goto L62
            goto L60
        Lc4:
            r0 = r5
            r1 = r8
            r2 = r10
            r3 = r6
            r4 = r7
            r5 = r13
            A00(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147046jg.A01(X.1vS, X.1w4, X.LG8, java.lang.String, boolean):void");
    }

    public static final void A00(DirectShareTarget directShareTarget, C41181vS c41181vS, C41551w4 c41551w4, LG8 lg8, C147046jg c147046jg, String str) {
        C38321qM c38321qM;
        ExtendedImageUrl extendedImageUrl;
        String str2;
        User user = c41181vS.A0i;
        if (user == null) {
            user = c41551w4.A0H.A0D();
        }
        C28531Zo c28531Zo = C28531Zo.A04;
        C14360o3.A07(c28531Zo);
        if (user != null && (c38321qM = c41181vS.A0b) != null) {
            String id = user.getId();
            String str3 = c41181vS.A0k;
            C14360o3.A07(str3);
            C45092JxM c45092JxM = new C45092JxM(c38321qM, directShareTarget, id, str3, str, "reel", c41551w4.A0B);
            String str4 = lg8.A05;
            if (str4 != null && str4.length() != 0 && ((str2 = lg8.A01) == null || str2.length() == 0)) {
                c45092JxM.A0D = str4;
            } else if (lg8.A00()) {
                ExtendedImageUrl extendedImageUrl2 = lg8.A00;
                if (extendedImageUrl2 == null) {
                    extendedImageUrl = null;
                } else {
                    extendedImageUrl = new ExtendedImageUrl(extendedImageUrl2);
                }
                c45092JxM.A05 = lg8.A01;
                c45092JxM.A07 = lg8.A03;
                c45092JxM.A06 = lg8.A02;
                c45092JxM.A01 = extendedImageUrl;
            }
            if (user.BTC() != null) {
                c45092JxM.A04 = user.BTC();
            }
            c45092JxM.A02 = Boolean.valueOf(c41181vS.A0Q);
            c28531Zo.A0D(c147046jg.A00, c45092JxM.A00(), "reel", "");
        } else {
            C0w9.A01.EmN("ReelMessageHelper", "Message failed to send.  Potential cause: no valid recipient found in ReelItem or ReelViewModel object.");
        }
        c147046jg.A02.CMc();
    }
}
