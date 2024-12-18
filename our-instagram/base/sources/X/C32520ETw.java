package X;

/* renamed from: X.ETw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32520ETw extends C1P1 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C32520ETw(Object obj, Object obj2, String str, int i, int i2) {
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = str;
        this.A01 = i;
        this.A02 = obj2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        if (this.A00 != 0) {
            super.onFail(abstractC115105If);
            return;
        }
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1717759804);
        super.onFail(abstractC115105If);
        TEf tEf = (TEf) this.A03;
        synchronized (tEf) {
            try {
                if (!tEf.A00) {
                    tEf.A00 = true;
                    ((SO9) this.A02).A00();
                }
            } catch (Throwable th) {
                C0f9.A0A(-714977307, A0N);
                throw th;
            }
        }
        C0f9.A0A(790771583, A0N);
    }

    @Override // X.C1P1
    public final void onStart() {
        if (1 - this.A00 != 0) {
            super.onStart();
            return;
        }
        int A03 = C0f9.A03(-1512526093);
        super.onStart();
        C0f9.A0A(-492261780, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
    
        if (r0.length() == 0) goto L23;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32520ETw.onSuccess(java.lang.Object):void");
    }
}
