package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GDK implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r8.equals("enable_status") != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    @Override // X.GYB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CJ8(android.net.Uri r10, android.os.Bundle r11) {
        /*
            r9 = this;
            r5 = 0
            X.C14360o3.A0B(r10, r5)
            com.instagram.common.session.UserSession r6 = r9.A01
            java.lang.Class<X.Fzm> r1 = X.C36292Fzm.class
            r0 = 4
            java.lang.Object r1 = X.C31651DvH.A00(r6, r1, r0)
            X.Fzm r1 = (X.C36292Fzm) r1
            X.C14360o3.A07(r1)
            monitor-enter(r1)
            r0 = 0
            r1.A05 = r0     // Catch: java.lang.Throwable -> La8
            monitor-exit(r1)
            r1.A03()
            r0 = 2935(0xb77, float:4.113E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r8 = r10.getQueryParameter(r0)
            java.lang.String r7 = "enable_status"
            r4 = r7
            java.lang.String r3 = "auto_response"
            java.lang.String r2 = "import"
            if (r8 == 0) goto L46
            int r1 = r8.hashCode()
            r0 = -1184795739(0xffffffffb96173a5, float:-2.1500753E-4)
            if (r1 == r0) goto L9c
            r0 = 946560209(0x386b5cd1, float:5.6114808E-5)
            if (r1 == r0) goto L94
            r0 = 1270808110(0x4bbefe2e, float:2.503382E7)
            if (r1 != r0) goto L46
            boolean r0 = r8.equals(r7)
            if (r0 != 0) goto L48
        L46:
            java.lang.String r7 = "default"
        L48:
            int r0 = r7.hashCode()
            switch(r0) {
                case -1184795739: goto L6e;
                case 946560209: goto L65;
                case 1270808110: goto L5c;
                case 1544803905: goto L50;
                default: goto L4f;
            }
        L4f:
            return
        L50:
            java.lang.String r0 = "default"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L4f
            r5 = 1
            java.lang.String r0 = "inbox_qp_creation_flow"
            goto L76
        L5c:
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L4f
            java.lang.String r0 = "inbox_qp_enable_status_flow"
            goto L76
        L65:
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L4f
            java.lang.String r0 = "inbox_qp_auto_response"
            goto L76
        L6e:
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = "inbox_qp_import"
        L76:
            android.os.Bundle r4 = X.AbstractC31176DnK.A08(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.Fragment r2 = r9.A00
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            r0 = 878(0x36e, float:1.23E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.6XJ r1 = X.AbstractC31173DnH.A0Z(r1, r4, r6, r3, r0)
            if (r5 == 0) goto La4
            r0 = 14167(0x3757, float:1.9852E-41)
            r1.A0D(r2, r0)
            return
        L94:
            boolean r0 = r8.equals(r3)
            if (r0 == 0) goto L46
            r7 = r3
            goto L48
        L9c:
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L46
            r7 = r2
            goto L48
        La4:
            X.AbstractC31172DnG.A1M(r2, r1)
            return
        La8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GDK.CJ8(android.net.Uri, android.os.Bundle):void");
    }

    public GDK(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
