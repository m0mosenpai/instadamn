package X;

/* renamed from: X.Szl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64123Szl implements InterfaceC65541TmF {
    public final C25531Mh A00;

    @Override // X.InterfaceC65541TmF
    public final String Be9() {
        return "client_received_logging";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r0.intValue() >= 0) goto L10;
     */
    @Override // X.InterfaceC65541TmF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E6A(X.QIm r8) {
        /*
            r7 = this;
            r1 = 0
            X.C14360o3.A0B(r8, r1)
            X.TlE r0 = r8.A06
            boolean r0 = r0 instanceof X.QJV
            if (r0 == 0) goto L19
            java.lang.String r0 = "logging ByteArray not supported"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            X.C14360o3.A0B(r0, r1)
            X.0e5 r8 = new X.0e5
            r8.<init>(r0)
            return r8
        L19:
            com.facebook.pushlite.model.PushInfraMetaData r4 = r8.A04
            java.lang.Integer r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L27
            int r0 = r0.intValue()
            r1 = 1
            if (r0 < 0) goto L28
        L27:
            r1 = 0
        L28:
            java.lang.String r0 = r4.A03
            boolean r2 = X.AbstractC167007dF.A1W(r0)
            java.lang.String r0 = r4.A02
            boolean r6 = X.AbstractC167007dF.A1W(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "priority_lowered"
            X.0e4 r5 = X.AbstractC166987dD.A1L(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "push_lite_logger"
            X.0e4 r3 = X.AbstractC166987dD.A1L(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "isHPKEEncrypted"
            X.0e4 r2 = X.AbstractC166987dD.A1L(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "isZSTDCompressed"
            java.util.LinkedHashMap r5 = X.AbstractC167017dG.A0u(r0, r1, r5, r3, r2)
            X.3Sh r3 = X.AbstractC73763Sg.A03
            X.3RD r2 = X.C3RD.A01
            X.3SL r1 = X.C3SL.A00
            X.3RL r0 = new X.3RL
            r0.<init>(r2, r1)
            java.lang.String r3 = r3.A02(r5, r0)
            java.lang.Long r2 = r4.A01
            if (r2 == 0) goto L76
            X.1Mh r1 = r7.A00
            java.lang.String r0 = "push_usecase_id"
            r1.A0Q(r0, r2)
        L76:
            java.lang.String r2 = r4.A08
            if (r2 == 0) goto L81
            X.1Mh r1 = r7.A00
            java.lang.String r0 = "pi_nid"
            r1.A0R(r0, r2)
        L81:
            java.lang.String r2 = r4.A07
            if (r2 == 0) goto L8c
            X.1Mh r1 = r7.A00
            java.lang.String r0 = "notif_id"
            r1.A0R(r0, r2)
        L8c:
            X.1Mh r2 = r7.A00
            java.lang.String r1 = "notif_received_push"
            java.lang.String r0 = "notif_event"
            r2.A0R(r0, r1)
            java.lang.String r1 = r8.A07
            java.lang.String r0 = "channel"
            r2.A0R(r0, r1)
            java.lang.String r1 = r4.A06
            java.lang.String r0 = "notif_event_log_flag"
            r2.A0R(r0, r1)
            java.lang.String r0 = "extra_info"
            r2.A0R(r0, r3)
            r2.Cht()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64123Szl.E6A(X.QIm):java.lang.Object");
    }

    @Override // X.InterfaceC65541TmF
    public final boolean EjA(QIm qIm) {
        String str;
        C14360o3.A0B(qIm, 0);
        if (AbstractC25226BEj.A1Z(this.A00) && (str = qIm.A04.A06) != null && !str.equals("0")) {
            return true;
        }
        return false;
    }

    public C64123Szl(InterfaceC02550Ad interfaceC02550Ad) {
        this.A00 = C25531Mh.A0K(interfaceC02550Ad);
    }
}
