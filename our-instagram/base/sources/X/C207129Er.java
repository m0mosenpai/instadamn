package X;

/* renamed from: X.9Er, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207129Er extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207129Er(int i, Object obj, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r8.equals(r7.A01) == false) goto L16;
     */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L17;
                case 1: goto L44;
                case 2: goto L5b;
                case 3: goto La7;
                default: goto L5;
            }
        L5:
            X.5mc r8 = (X.C125875mc) r8
            java.lang.Object r2 = r7.A01
            X.5zo r2 = (X.C133225zo) r2
            boolean r1 = r7.A02
            X.8w5 r0 = new X.8w5
            r0.<init>()
            X.1xC r0 = X.C42221xC.A06(r0)
            return r0
        L17:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r4 = r8.booleanValue()
            boolean r0 = r7.A02
            if (r0 == 0) goto L41
            com.instagram.api.schemas.IGUserHighlightsTrayType r3 = com.instagram.api.schemas.IGUserHighlightsTrayType.A04
        L23:
            X.0cb r2 = X.C17060sy.A01
            java.lang.Object r1 = r7.A01
            com.instagram.archive.data.HighlightsSettingsRepository r1 = (com.instagram.archive.data.HighlightsSettingsRepository) r1
            com.instagram.common.session.UserSession r0 = r1.A01
            com.instagram.user.model.User r0 = r2.A01(r0)
            X.17P r0 = r0.A03
            r0.EVo(r3)
            X.9BA r0 = r1.A01()
            boolean r2 = r0.A02
            r1 = 1
            X.9BA r0 = new X.9BA
            r0.<init>(r4, r2, r1)
            return r0
        L41:
            com.instagram.api.schemas.IGUserHighlightsTrayType r3 = com.instagram.api.schemas.IGUserHighlightsTrayType.A06
            goto L23
        L44:
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            boolean r0 = r7.A02
            if (r0 == 0) goto L55
            java.lang.Object r0 = r7.A01
            boolean r1 = r8.equals(r0)
            r0 = 1
            if (r1 != 0) goto L56
        L55:
            r0 = 0
        L56:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L5b:
            X.52C r8 = (X.C52C) r8
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            java.lang.Object r0 = r7.A01
            com.instagram.casper.IgSignalsCasper r0 = (com.instagram.casper.IgSignalsCasper) r0
            X.0sZ r0 = r0.A07
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            long r0 = r8.A03
            long r2 = r2 - r0
            double r0 = (double) r2
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            r2 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r0 = r0 / r2
            boolean r2 = r7.A02
            if (r2 == 0) goto La4
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L84:
            java.lang.String r6 = "minutes_to_next_target_event"
            r4 = 7000000(0x6acfc0, float:9.809089E-39)
            com.instagram.igsignals.core.IgSignalsFeature r5 = new com.instagram.igsignals.core.IgSignalsFeature
            r5.<init>(r4, r6, r0)
            java.lang.String r4 = "target_app_start_type"
            r1 = 7000040(0x6acfe8, float:9.809145E-39)
            com.instagram.igsignals.core.IgSignalsFeature r0 = new com.instagram.igsignals.core.IgSignalsFeature
            r0.<init>(r1, r4, r2)
            com.instagram.igsignals.core.IgSignalsFeature[] r0 = new com.instagram.igsignals.core.IgSignalsFeature[]{r5, r0}
            java.util.List r0 = X.AbstractC16960so.A1Q(r0)
            r8.A02(r0)
            goto Lbe
        La4:
            r2 = 0
            goto L84
        La7:
            X.8lW r8 = (X.C195868lW) r8
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            java.lang.Object r3 = r7.A01
            X.8YY r3 = (X.C8YY) r3
            X.8Wy r2 = r3.A0P
            boolean r1 = r7.A02
            X.8pg r0 = X.C198318pg.A00
            r2.A01(r0, r8, r1)
            r0 = 1
            r3.A0L(r0)
        Lbe:
            X.0eB r0 = X.C0eB.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207129Er.invoke(java.lang.Object):java.lang.Object");
    }
}
