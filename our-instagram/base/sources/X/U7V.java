package X;

/* loaded from: classes11.dex */
public final class U7V extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public U7V(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj2;
        this.A01 = obj3;
        this.A03 = obj;
        this.A02 = obj4;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        switch (this.A00) {
            case 0:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 649122615);
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null) {
                    C70614Wds c70614Wds = (C70614Wds) this.A04;
                    C97K c97k = (C97K) this.A01;
                    C97X c97x = (C97X) this.A02;
                    c70614Wds.A02.A01(c97k, A01.getMessage());
                    c97x.onError(A01);
                }
                i = 908216994;
                break;
            case 1:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1499310245);
                Throwable A012 = abstractC115105If.A01();
                if (A012 != null) {
                    C70615Wdt c70615Wdt = (C70615Wdt) this.A04;
                    C97K c97k2 = (C97K) this.A01;
                    C97X c97x2 = (C97X) this.A02;
                    c70615Wdt.A02.A01(c97k2, A012.getMessage());
                    c97x2.onError(A012);
                }
                i = 1484144389;
                break;
            case 2:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 220363170);
                Throwable A013 = abstractC115105If.A01();
                if (A013 != null) {
                    C66009Ty4 c66009Ty4 = (C66009Ty4) this.A04;
                    C97K c97k3 = (C97K) this.A01;
                    C97X c97x3 = (C97X) this.A02;
                    c66009Ty4.A02.A01(c97k3, A013.getMessage());
                    c97x3.onError(A013);
                }
                i = -1497225894;
                break;
            case 3:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 87904811);
                Throwable A014 = abstractC115105If.A01();
                if (A014 != null) {
                    C69284Vks c69284Vks = (C69284Vks) this.A04;
                    C97K c97k4 = (C97K) this.A01;
                    C97X c97x4 = (C97X) this.A02;
                    c69284Vks.A01.A02(c97k4, C05F.A00, A014.getMessage());
                    c97x4.onError(A014);
                }
                i = -1047113546;
                break;
            default:
                super.onFail(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A0N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        if (r10 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        r6.onSuccess(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        if (r18 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        r18 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
    
        if (r10 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0104, code lost:
    
        r16 = r10.A08(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
    
        if (r16 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0110, code lost:
    
        r17 = r10.getOptionalStringField(0, "strong_id__");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:
    
        if (r17 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0118, code lost:
    
        r17 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011a, code lost:
    
        r8 = r9.A03(X.C66762UaN.class, "xfb_one_link_monoschema(input:$input)", 2065835488);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0121, code lost:
    
        if (r8 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0123, code lost:
    
        r7 = r8.A03(X.C66761UaM.class, "page_info", 12626092);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012e, code lost:
    
        if (r7 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0130, code lost:
    
        r19 = r7.getCoercedBooleanField(3, "is_bpl_and_ads_page_consistent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0137, code lost:
    
        r13 = new com.instagram.business.onelink.cache.FBPageCacheInfo(r14, r15, r16, r17, r18, r19);
        r8 = r4.A00;
        X.AbstractC19590xm.A09(r8.A00, new X.C50369MLw(19, r8, r13));
        r4.A03.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010c, code lost:
    
        r16 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010e, code lost:
    
        if (r10 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
    
        if (r12 != null) goto L42;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7V.onSuccess(java.lang.Object):void");
    }
}
