package X;

/* renamed from: X.8ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC192018ex {
    public volatile C8f2 A00;

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00f8, code lost:
    
        if (r16 > (r3 + r6.toMillis(r9.A01))) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0208, code lost:
    
        if (r17 > (r3 + r9.toMillis(r12.A01))) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(int r27) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC192018ex.A00(int):void");
    }

    public final void A01(final Object obj) {
        final C8f2 c8f2 = this.A00;
        C1LV.A02("Emitter_emitResult");
        try {
            InterfaceC192058f1 interfaceC192058f1 = c8f2.A02;
            if (interfaceC192058f1.CZZ()) {
                C8f2.A02(c8f2, obj);
            } else {
                interfaceC192058f1.E4t(new Runnable() { // from class: X.8gk
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8f2.A02(C8f2.this, obj);
                    }
                }, "Emitter_emitResult");
            }
        } finally {
            C1LV.A01();
        }
    }
}
