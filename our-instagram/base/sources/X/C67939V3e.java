package X;

/* renamed from: X.V3e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67939V3e extends C1P1 {
    public final /* synthetic */ InterfaceC1116050z A00;
    public final /* synthetic */ AnonymousClass504 A01;

    public C67939V3e(InterfaceC1116050z interfaceC1116050z, AnonymousClass504 anonymousClass504) {
        this.A01 = anonymousClass504;
        this.A00 = interfaceC1116050z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67939V3e.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 720008060);
        AnonymousClass503 anonymousClass503 = this.A01.A04;
        Throwable A01 = abstractC115105If.A01();
        if (AnonymousClass503.A00(anonymousClass503)) {
            C1QT c1qt = anonymousClass503.A01;
            long j = anonymousClass503.A00;
            if (A01 == null || (str = A01.getMessage()) == null) {
                str = "empty";
            }
            c1qt.flowEndFail(j, "DATA_FETCH_FAILURE", str);
        }
        this.A00.AVi(AbstractC111324zv.A00(394));
        C0f9.A0A(-1497289797, A0N);
    }
}
