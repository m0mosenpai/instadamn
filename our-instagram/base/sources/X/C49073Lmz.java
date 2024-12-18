package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lmz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49073Lmz implements InterfaceC165437aW, InterfaceC165477aa {
    public final UserSession A00;
    public final Context A01;
    public final Fragment A02;
    public final FragmentActivity A03;
    public final LEK A04;
    public final InterfaceC1119353f A05;
    public final InterfaceC16820sZ A06;

    public C49073Lmz(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, LEK lek, InterfaceC1119353f interfaceC1119353f, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(fragment, 3);
        AbstractC167017dG.A1T(interfaceC1119353f, lek);
        this.A00 = userSession;
        this.A03 = fragmentActivity;
        this.A02 = fragment;
        this.A06 = interfaceC16820sZ;
        this.A05 = interfaceC1119353f;
        this.A04 = lek;
        this.A01 = fragmentActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r1 == 29) goto L10;
     */
    @Override // X.InterfaceC165477aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DfY(android.graphics.RectF r19, X.C22P r20, com.instagram.creation.cameraconfiguration.CameraConfiguration r21, java.lang.String r22, java.lang.String r23) {
        /*
            r18 = this;
            r5 = 0
            r13 = r20
            r3 = r22
            boolean r2 = X.AbstractC167017dG.A1a(r3, r13)
            r11 = r18
            X.LEK r1 = r11.A04
            java.lang.String r0 = "onReplyWithExpiringMediaCamera"
            X.3nh r2 = X.LEK.A00(r1, r3, r0, r2)
            if (r2 == 0) goto L64
            X.0sZ r0 = r11.A06
            java.lang.Object r0 = r0.invoke()
            X.7U0 r0 = (X.C7U0) r0
            if (r0 == 0) goto L64
            X.7TT r0 = X.AbstractC31174DnI.A0V(r0)
            int r1 = r0.A08
            boolean r0 = X.C4GR.A01(r1)
            if (r0 != 0) goto L31
            r0 = 29
            r17 = 0
            if (r1 != r0) goto L33
        L31:
            r17 = 1
        L33:
            java.lang.String r4 = r2.A0h()
            java.lang.String r6 = r2.A0g()
            if (r4 == 0) goto L67
            if (r6 == 0) goto L67
            X.2EY r1 = r2.A10
            X.2EY r0 = X.C2EY.A0q
            if (r1 != r0) goto L65
            X.4hT r3 = r2.A0e
        L47:
            java.lang.String r7 = r2.A1u
            java.lang.String r8 = "thread_view_camera_reply_shortcut"
            boolean r10 = r2.A1S()
            X.2EY r2 = r2.A0z
            X.LF6 r0 = new X.LF6
            r9 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.442 r15 = new X.442
            r15.<init>(r0)
            r12 = r19
            r14 = r5
            r16 = r5
            r11.Cqu(r12, r13, r14, r15, r16, r17)
        L64:
            return
        L65:
            r3 = 0
            goto L47
        L67:
            java.lang.String r0 = "Message ID and client context cannot be null"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49073Lmz.DfY(android.graphics.RectF, X.22P, com.instagram.creation.cameraconfiguration.CameraConfiguration, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r17.A00, 36325669453837559L) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r17.A00, 36325669453968633L) == false) goto L17;
     */
    @Override // X.InterfaceC165437aW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cqu(android.graphics.RectF r18, X.C22P r19, com.instagram.creation.cameraconfiguration.CameraConfiguration r20, X.AnonymousClass442 r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49073Lmz.Cqu(android.graphics.RectF, X.22P, com.instagram.creation.cameraconfiguration.CameraConfiguration, X.442, java.lang.String, boolean):void");
    }
}
