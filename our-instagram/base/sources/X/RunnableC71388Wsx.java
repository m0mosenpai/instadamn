package X;

/* renamed from: X.Wsx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71388Wsx implements Runnable {
    public final /* synthetic */ C69663Vt4 A00;

    public RunnableC71388Wsx(C69663Vt4 c69663Vt4) {
        this.A00 = c69663Vt4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f6, code lost:
    
        r4.CqO(0, r9.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0193, code lost:
    
        r9.A04 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e0, code lost:
    
        r4 = r9.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e2, code lost:
    
        if (r4 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e4, code lost:
    
        X.C14360o3.A0F("audioMerger");
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ee, code lost:
    
        r4.CqO(0, r9.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01fe, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ff, code lost:
    
        X.AbstractC167007dF.A15(X.C18950wb.A01.AEp(X.C69663Vt4.class.getSimpleName(), 817892340), com.facebook.react.modules.dialog.DialogModule.KEY_MESSAGE, "muxAudio failure", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021e, code lost:
    
        X.C14360o3.A0F("videoEncoder");
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0225, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021d, code lost:
    
        throw X.AbstractC166997dE.A0g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
    
        X.C14360o3.A0F(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0161, code lost:
    
        r0 = r9.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0163, code lost:
    
        if (r0 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0165, code lost:
    
        r1 = r0.getOutputBuffer(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0169, code lost:
    
        if (r1 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016b, code lost:
    
        X.AbstractC50522MSa.A0v(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016e, code lost:
    
        r2.presentationTimeUs = r4;
        r0 = r9.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0172, code lost:
    
        if (r1 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0174, code lost:
    
        r0.A01(r2, r1);
        r1 = r9.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0179, code lost:
    
        if (r1 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017b, code lost:
    
        r1.releaseOutputBuffer(r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0191, code lost:
    
        if (java.lang.Math.ceil(r4 / 1000.0d) < r9.A0A.A06) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0196, code lost:
    
        if (r17 != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0198, code lost:
    
        r0 = r9.A00;
        r6 = r9.A06;
        r9.A00 = r0 + r6;
        r11 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a7, code lost:
    
        if (r11.hasNext() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a9, code lost:
    
        r10 = (X.C69428VnD) r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c0, code lost:
    
        if (((r10.A00 + r10.A03) - r10.A01) >= (r9.A00 + (r6 * 0.1d))) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c2, code lost:
    
        r10.A07.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d4, code lost:
    
        r9.A04 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d6, code lost:
    
        r4 = r9.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d8, code lost:
    
        if (r4 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01da, code lost:
    
        X.C14360o3.A0F("audioMerger");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ed, code lost:
    
        throw X.C00O.createAndThrow();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC71388Wsx.run():void");
    }
}
