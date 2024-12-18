package X;

/* loaded from: classes6.dex */
public abstract class F9C {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r6.equals(r0) != false) goto L34;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0035. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(androidx.fragment.app.Fragment r7, X.C51043Mgu r8) {
        /*
            r5 = 1
            java.lang.String r6 = r8.A05()
            com.instagram.api.schemas.UserMonetizationProductType r4 = r8.A04()
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            boolean r0 = r3 instanceof com.instagram.urlhandlers.creatoronboarding.CreatorOnboardingUrlHandlerActivity
            if (r0 != 0) goto L6a
            X.0h2 r2 = r7.getParentFragmentManager()
            boolean r0 = r2.A11()
            if (r0 != 0) goto L30
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.A0C
            java.lang.String r1 = "NOTIFICATION"
            if (r4 != r0) goto L31
            boolean r0 = X.C14360o3.A0K(r6, r1)
            if (r0 != 0) goto L38
            boolean r0 = r3 instanceof com.instagram.modal.ModalActivity
            if (r0 == 0) goto L31
            com.instagram.modal.ModalActivity r3 = (com.instagram.modal.ModalActivity) r3
            r3.finish()
        L30:
            return
        L31:
            int r0 = r6.hashCode()
            switch(r0) {
                case -2077709277: goto L3c;
                case -1382453013: goto L4a;
                case -602962448: goto L4f;
                case 2591: goto L52;
                case 523908395: goto L5e;
                case 1915236889: goto L61;
                default: goto L38;
            }
        L38:
            r2.A0b()
            return
        L3c:
            java.lang.String r0 = "SETTINGS"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L38
            java.lang.String r0 = X.C35791FrT.A09
            r2.A0x(r0, r5)
            return
        L4a:
            boolean r0 = r6.equals(r1)
            goto L58
        L4f:
            java.lang.String r0 = "MONETIZATION_INBOX"
            goto L54
        L52:
            java.lang.String r0 = "QP"
        L54:
            boolean r0 = r6.equals(r0)
        L58:
            if (r0 == 0) goto L38
            r2.A0x(r6, r5)
            return
        L5e:
            java.lang.String r0 = "POST_LIVE"
            goto L63
        L61:
            java.lang.String r0 = "LIVE_SCHEDULE_AUDIENCE"
        L63:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L6a
            goto L38
        L6a:
            r3.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F9C.A00(androidx.fragment.app.Fragment, X.Mgu):void");
    }
}
