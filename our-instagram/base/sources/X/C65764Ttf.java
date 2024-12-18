package X;

/* renamed from: X.Ttf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65764Ttf extends C1P1 {
    public final /* synthetic */ C65762Ttd A00;

    public C65764Ttf(C65762Ttd c65762Ttd) {
        this.A00 = c65762Ttd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x013e, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0138, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0132, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x012c, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0126, code lost:
    
        if (r1 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0120, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x011b, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0049, code lost:
    
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65764Ttf.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 906844007);
        super.onFail(abstractC115105If);
        C65762Ttd c65762Ttd = this.A00;
        c65762Ttd.A0A = C05F.A0C;
        C65763Tte c65763Tte = c65762Ttd.A07;
        String str2 = c65762Ttd.A0D;
        if (str2 == null) {
            str = "threadIdV2";
        } else {
            String str3 = c65762Ttd.A0C;
            if (str3 == null) {
                str = "participantId";
            } else {
                String str4 = c65762Ttd.A0B;
                if (str4 == null) {
                    str = "adMediaId";
                } else {
                    C65763Tte.A00(c65763Tte, "direct_in_thread_ctd_banner_ad_context_fetch_failed", str2, str3, AbstractC167007dF.A0n("media_id", str4));
                    C0f9.A0A(-1797353689, A0N);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(556154822);
        super.onStart();
        this.A00.A0A = C05F.A00;
        C0f9.A0A(-148403341, A03);
    }
}
