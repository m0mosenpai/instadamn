package X;

import java.util.List;

/* renamed from: X.Ftd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35919Ftd implements C97X {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C35791FrT A02;
    public final /* synthetic */ List A03;

    @Override // X.C97X
    public final void onError(Throwable th) {
    }

    public C35919Ftd(InterfaceC11380iw interfaceC11380iw, C35791FrT c35791FrT, List list, int i) {
        this.A02 = c35791FrT;
        this.A01 = interfaceC11380iw;
        this.A00 = i;
        this.A03 = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        r1.add(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r5.A06.setItems(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        r1.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r2 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r1.A2H() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        r4 = 2131956620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1.A2H() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        r4 = 2131955175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r3 = X.GHY.A00(X.AbstractC31171DnF.A03(r5), new X.ViewOnClickListenerC35687FpM(39, r6.A01, r5), r4);
        r3.A09 = X.AbstractC1565371b.A00(r5.A02);
        r2 = r6.A00;
        r1 = r6.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if (r2 >= r1.size()) goto L14;
     */
    @Override // X.C97X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r7) {
        /*
            r6 = this;
            X.DuI r7 = (X.C31590DuI) r7
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.FrT r5 = r6.A02
            java.lang.String r0 = X.C35791FrT.A09
            X.9Im r2 = r7.A00
            if (r2 != 0) goto L52
            com.instagram.user.model.User r1 = r5.A07
            boolean r0 = r1.A2H()
            if (r0 == 0) goto L52
        L16:
            boolean r0 = r1.A2H()
            r4 = 2131956620(0x7f13138c, float:1.95498E38)
            if (r0 != 0) goto L22
        L1f:
            r4 = 2131955175(0x7f130de7, float:1.954687E38)
        L22:
            X.0iw r3 = r6.A01
            android.content.Context r2 = X.AbstractC31171DnF.A03(r5)
            r1 = 39
            X.FpM r0 = new X.FpM
            r0.<init>(r1, r3, r5)
            X.GHY r3 = X.GHY.A00(r2, r0, r4)
            com.instagram.common.session.UserSession r0 = r5.A02
            boolean r0 = X.AbstractC1565371b.A00(r0)
            r3.A09 = r0
            int r2 = r6.A00
            java.util.List r1 = r6.A03
            int r0 = r1.size()
            if (r2 >= r0) goto L4e
            r1.add(r2, r3)
        L48:
            X.ElR r0 = r5.A06
            r0.setItems(r1)
        L4d:
            return
        L4e:
            r1.add(r3)
            goto L48
        L52:
            com.instagram.user.model.User r1 = r5.A07
            boolean r0 = r1.A1K()
            if (r0 == 0) goto L4d
            if (r2 != 0) goto L1f
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35919Ftd.onSuccess(java.lang.Object):void");
    }
}
