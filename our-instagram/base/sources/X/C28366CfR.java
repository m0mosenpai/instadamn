package X;

/* renamed from: X.CfR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28366CfR {
    public static final C28366CfR A00 = new Object();

    public static /* synthetic */ void A00(BXF bxf) {
        if (bxf != null) {
            CWQ cwq = bxf.A03;
            if (cwq != null) {
                AbstractC25235BEs.A1G(cwq.A08, C5C2.A01);
            }
            CWQ cwq2 = bxf.A03;
            if (cwq2 != null) {
                AbstractC25235BEs.A1G(cwq2.A0E, C5C2.A01);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x020e, code lost:
    
        if (X.AbstractC28472ChQ.A06(r0.A02, r5) == true) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0255, code lost:
    
        if (r9 == (-1)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018c, code lost:
    
        if (X.AbstractC28472ChQ.A06(r0.A02, r5) == true) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0316  */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0pQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0pQ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(android.view.inputmethod.HandwritingGesture r14, X.CWQ r15, X.BXF r16, X.C59J r17, X.InterfaceC16660sJ r18) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28366CfR.A01(android.view.inputmethod.HandwritingGesture, X.CWQ, X.BXF, X.59J, X.0sJ):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(android.os.CancellationSignal r8, android.view.inputmethod.PreviewableHandwritingGesture r9, X.CWQ r10, final X.BXF r11) {
        /*
            r7 = this;
            X.5C8 r1 = r10.A03
            r4 = 0
            if (r1 == 0) goto L63
            X.Cd7 r0 = r10.A00()
            if (r0 == 0) goto Le6
            X.5oj r0 = r0.A02
            X.5oc r0 = r0.A04
            X.5C8 r0 = r0.A03
        L11:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L63
            boolean r0 = r9 instanceof android.view.inputmethod.SelectGesture
            if (r0 == 0) goto L64
            android.view.inputmethod.SelectGesture r9 = (android.view.inputmethod.SelectGesture) r9
            if (r11 == 0) goto L58
            android.graphics.RectF r0 = r9.getSelectionArea()
            X.5Dh r2 = X.AbstractC28289Cdb.A02(r0)
            int r1 = r9.getGranularity()
            r0 = 1
            boolean r1 = X.AbstractC25235BEs.A1U(r1, r0)
            X.Dli r0 = X.C28156Cb3.A01
            long r1 = X.AbstractC28472ChQ.A03(r10, r2, r0, r1)
        L36:
            X.CWQ r0 = r11.A03
            if (r0 == 0) goto L3f
            X.3Yl r0 = r0.A0E
            X.AbstractC25235BEs.A1G(r0, r1)
        L3f:
            X.CWQ r0 = r11.A03
            if (r0 == 0) goto L4a
            long r5 = X.C5C2.A01
            X.3Yl r0 = r0.A08
        L47:
            X.AbstractC25235BEs.A1G(r0, r5)
        L4a:
            boolean r0 = X.C5C2.A03(r1)
            if (r0 != 0) goto L58
            X.BXF.A05(r11, r4)
            X.C5m r0 = X.EnumC27357C5m.None
            X.BXF.A01(r0, r11)
        L58:
            if (r8 == 0) goto L62
            X.Cj8 r0 = new X.Cj8
            r0.<init>()
            r8.setOnCancelListener(r0)
        L62:
            r4 = 1
        L63:
            return r4
        L64:
            boolean r0 = r9 instanceof android.view.inputmethod.DeleteGesture
            if (r0 == 0) goto L95
            android.view.inputmethod.DeleteGesture r9 = (android.view.inputmethod.DeleteGesture) r9
            if (r11 == 0) goto L58
            android.graphics.RectF r0 = r9.getDeletionArea()
            X.5Dh r2 = X.AbstractC28289Cdb.A02(r0)
            int r1 = r9.getGranularity()
            r0 = 1
            boolean r1 = X.AbstractC25235BEs.A1U(r1, r0)
            X.Dli r0 = X.C28156Cb3.A01
            long r1 = X.AbstractC28472ChQ.A03(r10, r2, r0, r1)
        L83:
            X.CWQ r0 = r11.A03
            if (r0 == 0) goto L8c
            X.3Yl r0 = r0.A08
            X.AbstractC25235BEs.A1G(r0, r1)
        L8c:
            X.CWQ r0 = r11.A03
            if (r0 == 0) goto L4a
            long r5 = X.C5C2.A01
            X.3Yl r0 = r0.A0E
            goto L47
        L95:
            boolean r0 = r9 instanceof android.view.inputmethod.SelectRangeGesture
            if (r0 == 0) goto Lbe
            android.view.inputmethod.SelectRangeGesture r9 = (android.view.inputmethod.SelectRangeGesture) r9
            if (r11 == 0) goto L58
            android.graphics.RectF r0 = r9.getSelectionStartArea()
            X.5Dh r3 = X.AbstractC28289Cdb.A02(r0)
            android.graphics.RectF r0 = r9.getSelectionEndArea()
            X.5Dh r2 = X.AbstractC28289Cdb.A02(r0)
            int r1 = r9.getGranularity()
            r0 = 1
            boolean r1 = X.AbstractC25235BEs.A1U(r1, r0)
            X.Dli r0 = X.C28156Cb3.A01
            long r1 = X.AbstractC28472ChQ.A02(r10, r3, r2, r0, r1)
            goto L36
        Lbe:
            boolean r0 = r9 instanceof android.view.inputmethod.DeleteRangeGesture
            if (r0 == 0) goto L63
            android.view.inputmethod.DeleteRangeGesture r9 = (android.view.inputmethod.DeleteRangeGesture) r9
            if (r11 == 0) goto L58
            android.graphics.RectF r0 = r9.getDeletionStartArea()
            X.5Dh r3 = X.AbstractC28289Cdb.A02(r0)
            android.graphics.RectF r0 = r9.getDeletionEndArea()
            X.5Dh r2 = X.AbstractC28289Cdb.A02(r0)
            int r1 = r9.getGranularity()
            r0 = 1
            boolean r1 = X.AbstractC25235BEs.A1U(r1, r0)
            X.Dli r0 = X.C28156Cb3.A01
            long r1 = X.AbstractC28472ChQ.A02(r10, r3, r2, r0, r1)
            goto L83
        Le6:
            r0 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28366CfR.A02(android.os.CancellationSignal, android.view.inputmethod.PreviewableHandwritingGesture, X.CWQ, X.BXF):boolean");
    }
}
