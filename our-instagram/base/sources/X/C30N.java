package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.30N, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30N extends C30O {
    public final UserSession A00;
    public final InterfaceC08830cm A01;
    public final InterfaceC08830cm A02;
    public final InterfaceC08830cm A03;
    public final InterfaceC08830cm A04;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.4Sf] */
    @Override // X.C30P
    public final void A0A(C19280xC c19280xC, C4SW c4sw) {
        boolean z;
        boolean z2;
        C14360o3.A0B(c19280xC, 0);
        ?? obj = new Object();
        if ("video_should_start".equals(c19280xC.A04)) {
            String str = (String) this.A04.get();
            obj.A0b = str;
            if (str != null) {
                c19280xC.A0C("trigger", str);
            }
        }
        C46h c46h = (C46h) this.A02.get();
        C46h c46h2 = (C46h) this.A03.get();
        C46h c46h3 = (C46h) this.A01.get();
        if (c46h instanceof C4JL) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = true;
        if (z) {
            Integer valueOf = Integer.valueOf(((C116375Os) c46h.A03()).A00);
            obj.A07 = valueOf;
            if (valueOf != null) {
                c19280xC.A08(valueOf, "carousel_index");
            }
            Integer valueOf2 = Integer.valueOf(((C116375Os) c46h.A03()).A02);
            obj.A09 = valueOf2;
            if (valueOf2 != null) {
                c19280xC.A08(valueOf2, "carousel_size");
            }
            Integer valueOf3 = Integer.valueOf(((C116375Os) c46h.A03()).A01);
            obj.A08 = valueOf3;
            if (valueOf3 != null) {
                c19280xC.A08(valueOf3, "carousel_m_t");
            }
            String str2 = ((C116375Os) c46h.A03()).A04;
            obj.A0S = str2;
            c19280xC.A0C("carousel_media_id", str2);
            String str3 = ((C116375Os) c46h.A03()).A03;
            obj.A0R = str3;
            c19280xC.A0C("carousel_cover_media_id", str3);
            if (((C116375Os) c46h.A03()).A05) {
                obj.A0B = 1;
                c19280xC.A08(1, "is_dash_eligible");
                obj.A0U = "dash";
                c19280xC.A0C("playback_format", "dash");
            }
            if (c46h2 instanceof C4JL) {
                String mezqlToken = ((C38321qM) c46h2.A03()).A0C.getMezqlToken();
                if (mezqlToken != null) {
                    c19280xC.A0C("mezql_token", mezqlToken);
                }
                String loggingInfoToken = ((C38321qM) c46h2.A03()).A0C.getLoggingInfoToken();
                if (loggingInfoToken != null) {
                    c19280xC.A0C("ranking_info_token", loggingInfoToken);
                }
            }
        }
        if (c46h2 instanceof C4JL) {
            z2 = true;
            boolean A5A = ((C38321qM) c46h2.A03()).A5A();
            if (!A5A || !AbstractC75343a1.A07(this.A00)) {
                z3 = false;
            }
            Boolean valueOf4 = Boolean.valueOf(A5A);
            obj.A04 = valueOf4;
            if (valueOf4 != null) {
                c19280xC.A09("video_subtitles_available", valueOf4);
            }
            Boolean valueOf5 = Boolean.valueOf(z3);
            obj.A05 = valueOf5;
            if (valueOf5 != null) {
                c19280xC.A09("video_subtitles_displayed", valueOf5);
            }
            C19260xA c19260xA = obj.A01;
            if (c19260xA != null) {
                c19280xC.A05(c19260xA, "adhoc_data");
            }
        } else {
            z2 = false;
        }
        if ((c46h3 instanceof C4JL) && ((C75113Zb) c46h3.A03()).A2p && z2 && ((C38321qM) c46h2.A03()).A5P()) {
            obj.A0Z = "clips_netego";
            c19280xC.A0C("subtype", "clips_netego");
        }
        if (c4sw != null) {
            c4sw.A07 = obj;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cd, code lost:
    
        if (X.AbstractC75343a1.A07(r4.A00) == false) goto L22;
     */
    @Override // X.C30O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4T2 A0D(X.C4T2 r5, X.C38321qM r6) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            super.A0D(r5, r6)
            X.0cm r0 = r4.A02
            java.lang.Object r2 = r0.get()
            X.46h r2 = (X.C46h) r2
            X.0cm r0 = r4.A03
            java.lang.Object r3 = r0.get()
            X.46h r3 = (X.C46h) r3
            boolean r0 = r2 instanceof X.C4JL
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r2.A03()
            X.5Os r0 = (X.C116375Os) r0
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "feed_carousel_index"
            r5.A05(r0, r1)
            java.lang.Object r0 = r2.A03()
            X.5Os r0 = (X.C116375Os) r0
            int r0 = r0.A02
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "feed_carousel_size"
            r5.A05(r0, r1)
            java.lang.Object r0 = r2.A03()
            X.5Os r0 = (X.C116375Os) r0
            int r0 = r0.A01
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "feed_carousel_media_type"
            r5.A05(r0, r1)
            java.lang.Object r0 = r2.A03()
            X.5Os r0 = (X.C116375Os) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "feed_carousel_media_id"
            r5.A06(r0, r1)
            java.lang.Object r0 = r2.A03()
            X.5Os r0 = (X.C116375Os) r0
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "feed_carousel_cover_media_id"
            r5.A06(r0, r1)
            java.lang.Object r0 = r2.A03()
            X.5Os r0 = (X.C116375Os) r0
            boolean r0 = r0.A05
            if (r0 == 0) goto L80
            java.lang.String r1 = "dash"
            java.lang.String r0 = "video_format"
            r5.A06(r0, r1)
        L80:
            boolean r0 = r3 instanceof X.C4JL
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r3.A03()
            X.1qM r0 = (X.C38321qM) r0
            X.1rF r0 = r0.A0C
            java.lang.String r2 = r0.getMezqlToken()
            java.lang.Object r0 = r3.A03()
            X.1qM r0 = (X.C38321qM) r0
            X.1rF r0 = r0.A0C
            java.lang.String r1 = r0.getLoggingInfoToken()
            if (r2 == 0) goto La3
            java.lang.String r0 = "mezql_token"
            r5.A06(r0, r2)
        La3:
            if (r1 == 0) goto Laa
            java.lang.String r0 = "ranking_info_token"
            r5.A06(r0, r1)
        Laa:
            boolean r0 = r3 instanceof X.C4JL
            if (r0 == 0) goto Le2
            java.lang.Object r0 = r3.A03()
            X.1qM r0 = (X.C38321qM) r0
            boolean r1 = r0.A5A()
            if (r1 == 0) goto Lcf
            java.lang.Object r0 = r3.A03()
            X.1qM r0 = (X.C38321qM) r0
            boolean r0 = r0.A5g()
            if (r0 == 0) goto Lcf
            com.instagram.common.session.UserSession r0 = r4.A00
            boolean r0 = X.AbstractC75343a1.A07(r0)
            r2 = 1
            if (r0 != 0) goto Ld0
        Lcf:
            r2 = 0
        Ld0:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "captions_available"
            r5.A03(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "captions_displayed"
            r5.A03(r0, r1)
        Le2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30N.A0D(X.4T2, X.1qM):X.4T2");
    }

    public C30N(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4) {
        super(userSession, interfaceC60442pS, str, C18U.A06(C06090Tz.A05, userSession, 36319974326869884L));
        this.A00 = userSession;
        this.A02 = interfaceC08830cm;
        this.A04 = interfaceC08830cm2;
        this.A03 = interfaceC08830cm3;
        this.A01 = interfaceC08830cm4;
    }

    @Override // X.C30P
    public final String A03(C38321qM c38321qM) {
        C46h c46h = (C46h) this.A02.get();
        if (c46h instanceof C4JL) {
            return ((C116375Os) c46h.A03()).A04;
        }
        String id = c38321qM.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
