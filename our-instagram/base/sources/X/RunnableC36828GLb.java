package X;

/* renamed from: X.GLb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36828GLb implements Runnable {
    public final /* synthetic */ EgI A00;

    public RunnableC36828GLb(EgI egI) {
        this.A00 = egI;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if (r0 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (r0 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        r7.A0x(r8, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r8.equals("MONETIZATION_INBOX") != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            X.EgI r3 = r13.A00
            com.instagram.common.session.UserSession r11 = r3.A06()
            r12 = 1
            java.lang.String r0 = r3.A09()
            java.lang.String r1 = X.AbstractC31178DnM.A0f(r0)
            java.lang.String r0 = "entry_point"
            X.0e4 r0 = X.AbstractC166987dD.A1L(r0, r1)
            r10 = 0
            X.0e4[] r0 = new X.C09530e4[]{r0}
            java.util.HashMap r1 = X.AbstractC06930Yk.A02(r0)
            java.lang.String r0 = "com.bloks.www.ig.bonus.bonus-settings"
            X.U6x r2 = X.C66277U6x.A01(r0, r1)
            com.instagram.common.session.UserSession r0 = r3.A06()
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.AbstractC31171DnF.A0C(r0)
            r0 = 2131964490(0x7f13324a, float:1.9565763E38)
            X.AbstractC31171DnF.A17(r3, r1, r0)
            X.3Nv r9 = X.W6d.A02(r1, r2)
            java.lang.String r8 = r3.A09()
            X.AbstractC167007dF.A1E(r11, r10, r8)
            X.0h2 r7 = r3.getParentFragmentManager()
            boolean r0 = r7.A11()
            if (r0 != 0) goto L82
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            int r5 = r8.hashCode()
            java.lang.String r4 = "QP"
            java.lang.String r3 = "MONETIZATION_INBOX"
            java.lang.String r2 = "NOTIFICATION"
            java.lang.String r1 = "SETTINGS"
            switch(r5) {
                case -2077709277: goto L92;
                case -1382453013: goto L9e;
                case -602962448: goto Laa;
                case 2591: goto La3;
                case 523908395: goto Lb4;
                case 1915236889: goto Lb7;
                default: goto L5a;
            }
        L5a:
            r7.A0b()
        L5d:
            X.6Yy r6 = X.AbstractC31173DnH.A0P(r6, r11)
            r6.A0D(r9)
            r0 = -2077709277(0xffffffff8428ac23, float:-1.9827346E-36)
            if (r5 == r0) goto L8d
            r0 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r5 == r0) goto L88
            r0 = -602962448(0xffffffffdc0f85f0, float:-1.6159275E17)
            if (r5 == r0) goto L83
            r0 = 2591(0xa1f, float:3.631E-42)
            if (r5 != r0) goto L7d
            boolean r0 = r8.equals(r4)
        L7b:
            if (r0 != 0) goto L7f
        L7d:
            r6.A0D = r10
        L7f:
            r6.A04()
        L82:
            return
        L83:
            boolean r0 = r8.equals(r3)
            goto L7b
        L88:
            boolean r0 = r8.equals(r2)
            goto L7b
        L8d:
            boolean r0 = r8.equals(r1)
            goto L7b
        L92:
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L5a
            java.lang.String r0 = X.C35791FrT.A09
            r7.A0x(r0, r12)
            goto L5d
        L9e:
            boolean r0 = r8.equals(r2)
            goto La7
        La3:
            boolean r0 = r8.equals(r4)
        La7:
            if (r0 != 0) goto Lb0
            goto L5a
        Laa:
            boolean r0 = r8.equals(r3)
            if (r0 == 0) goto L5a
        Lb0:
            r7.A0x(r8, r12)
            goto L5d
        Lb4:
            java.lang.String r0 = "POST_LIVE"
            goto Lb9
        Lb7:
            java.lang.String r0 = "LIVE_SCHEDULE_AUDIENCE"
        Lb9:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L5a
            r6.finish()
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC36828GLb.run():void");
    }
}
