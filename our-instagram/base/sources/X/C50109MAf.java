package X;

/* renamed from: X.MAf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50109MAf extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50109MAf(Object obj, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A00;
        Object obj2 = this.A01;
        String str = this.A03;
        String str2 = this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new C50109MAf(obj2, str, str2, interfaceC23621Ds, i);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A00;
        AbstractC09560e7.A00(obj);
        if (i != 0) {
            ((InterfaceC65576TnA) this.A01).CKO(AnonymousClass001.A0u("Credential manager fetch failed: errorType:", this.A03, ", errorMessage:", this.A02));
        } else {
            ((C47642L2b) this.A01).A00.A0M(this.A03, this.A02);
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50109MAf) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
