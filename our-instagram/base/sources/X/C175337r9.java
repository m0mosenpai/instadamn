package X;

/* renamed from: X.7r9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175337r9 implements InterfaceC175347rA {
    public final C175327r8 A00;
    public final C175087qi A01;
    public final InterfaceC175367rC A02;
    public volatile int A03;
    public volatile InterfaceC177197uF A04;
    public volatile Boolean A05;

    @Override // X.InterfaceC175347rA
    public final void AE4() {
        this.A01.A00();
    }

    @Override // X.InterfaceC175347rA
    public final /* bridge */ /* synthetic */ Object Bos() {
        if (this.A05 != null) {
            if (this.A05.booleanValue()) {
                return this.A04;
            }
            throw new RuntimeException("Failed to configure preview.");
        }
        throw new IllegalStateException("Configure Preview operation hasn't completed yet.");
    }

    public C175337r9(C175327r8 c175327r8) {
        this.A03 = 0;
        InterfaceC175367rC interfaceC175367rC = new InterfaceC175367rC() { // from class: X.7rB
            @Override // X.InterfaceC175367rC
            public final void DtK() {
                C175337r9 c175337r9 = C175337r9.this;
                c175337r9.A03 = 0;
                c175337r9.A05 = false;
            }
        };
        this.A02 = interfaceC175367rC;
        this.A00 = c175327r8;
        C175087qi c175087qi = new C175087qi();
        this.A01 = c175087qi;
        c175087qi.A00 = interfaceC175367rC;
    }

    public C175337r9() {
        this(null);
    }
}
