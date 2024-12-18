package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EUf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32529EUf extends C1P1 {
    public final Fragment A00;
    public final InterfaceC114785Gl A01;
    public final UserSession A02;
    public final User A03;
    public final AbstractC10360h2 A04;
    public final InterfaceC16660sJ A05;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        if (X.C18U.A06(r7, r9, 36312939170367025L) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        X.C3CZ.A0G = true;
        r11 = r6.requireActivity();
        r10 = "9";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b5, code lost:
    
        if (r8.A01(r10) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e7, code lost:
    
        if (r8.A1k() != true) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ef, code lost:
    
        if (r8 != null) goto L13;
     */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.Ef2, X.Fby] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32529EUf.onSuccess(java.lang.Object):void");
    }

    public C32529EUf(Fragment fragment, AbstractC10360h2 abstractC10360h2, InterfaceC114785Gl interfaceC114785Gl, UserSession userSession, User user, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = userSession;
        this.A03 = user;
        this.A00 = fragment;
        this.A04 = abstractC10360h2;
        this.A01 = interfaceC114785Gl;
        this.A05 = interfaceC16660sJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r6 == null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r12) {
        /*
            r11 = this;
            r0 = 1108465884(0x4211d8dc, float:36.461777)
            int r3 = X.C0f9.A03(r0)
            r5 = 0
            X.C14360o3.A0B(r12, r5)
            androidx.fragment.app.Fragment r1 = r11.A00
            boolean r0 = r1.isResumed()
            r2 = 18297178(0x117315a, float:2.7769728E-38)
            if (r0 == 0) goto La7
            android.content.Context r4 = r1.requireContext()
            java.lang.Object r10 = r12.A00()
            X.1ul r10 = (X.C40781ul) r10
            if (r10 == 0) goto L8a
            java.util.List r1 = r10.mErrorStrings
            if (r1 == 0) goto L84
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L84
            java.lang.String r6 = X.AbstractC31175DnJ.A0c(r1, r5)
            X.8hC r0 = X.AbstractC35254Fgn.A00(r4)
            r0.A0r(r6)
            X.AbstractC166987dD.A1W(r0)
            com.instagram.common.session.UserSession r7 = r11.A02
            X.FRl r4 = X.FA7.A00(r7)
            X.Ept r1 = X.EnumC33422Ept.A07
            java.lang.String r0 = r10.toString()
            r4.A04(r1, r0)
        L49:
            X.6yf r5 = X.AbstractC155496ye.A00(r7)
            long r0 = r5.A01
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L64
            X.C155506yf.A01(r10, r5, r0)
            r0 = 1
            r5.A05 = r0
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r1 = r5.A0A
            long r4 = r5.A01
            java.lang.String r0 = "profile_picture_change_error"
            r1.flowMarkPoint(r4, r0)
        L64:
            X.6yf r1 = X.AbstractC155496ye.A00(r7)
            java.lang.String r0 = "edit_profile_picture"
            r1.A04(r0)
            android.os.Handler r1 = X.C3CZ.A0H
            X.GNO r0 = new X.GNO
            r0.<init>(r11, r6)
            r1.post(r0)
            X.02i r1 = X.C006802i.A0p
            r0 = 3
        L7a:
            r1.markerEnd(r2, r0)
            r0 = 677653660(0x28642c9c, float:1.2666216E-14)
            X.C0f9.A0A(r0, r3)
            return
        L84:
            java.lang.String r6 = r10.getErrorMessage()
            if (r6 != 0) goto L91
        L8a:
            r0 = 2131956849(0x7f131471, float:1.9550265E38)
            java.lang.String r6 = X.AbstractC166997dE.A0p(r4, r0)
        L91:
            X.8hC r0 = X.AbstractC35254Fgn.A00(r4)
            r0.A0r(r6)
            X.AbstractC166987dD.A1W(r0)
            com.instagram.common.session.UserSession r7 = r11.A02
            X.FRl r1 = X.FA7.A00(r7)
            X.Ept r0 = X.EnumC33422Ept.A07
            r1.A04(r0, r6)
            goto L49
        La7:
            X.02i r1 = X.C006802i.A0p
            r0 = 4
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32529EUf.onFail(X.5If):void");
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1642530851);
        InterfaceC16660sJ interfaceC16660sJ = this.A05;
        if (interfaceC16660sJ != null) {
            AbstractC25227BEk.A1Q(interfaceC16660sJ, false);
        }
        if (C3CZ.A09) {
            C69923Cb.A01(this.A00, this.A04);
        }
        C0f9.A0A(-1844983327, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(640364563);
        if (C3CZ.A09) {
            C69923Cb.A02(this.A00, this.A04);
        }
        C0f9.A0A(19953916, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        Icon icon;
        int A03 = C0f9.A03(-1418940736);
        int A032 = C0f9.A03(1402074663);
        boolean z = C3CZ.A0G;
        User user = this.A03;
        Bitmap A0H = C25821No.A00().A0H(user.Bhu(), null);
        String id = user.getId();
        if (A0H != null) {
            icon = Icon.createWithAdaptiveBitmap(A0H);
        } else {
            icon = null;
        }
        C93J.A01(icon, id, null);
        C0f9.A0A(-2033945477, A032);
        C0f9.A0A(337487938, A03);
    }
}
