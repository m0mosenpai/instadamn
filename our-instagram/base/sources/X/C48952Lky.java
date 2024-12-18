package X;

/* renamed from: X.Lky, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48952Lky implements InterfaceC1584679g {
    public final int A00;

    public C48952Lky(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC1584679g
    public final InterfaceC66482zP AMY(final C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, final String str) {
        switch (this.A00) {
            case 0:
                return new C45934KUl(c1585879t, (C7QY) interfaceC129555tK2, (AnonymousClass781) interfaceC129555tK, str);
            case 1:
                return new K1P(c1585879t, (KTE) interfaceC129555tK2, (AnonymousClass781) interfaceC129555tK, str);
            case 2:
                return new K28((KT7) interfaceC129555tK, c1585879t, (C129535tI) interfaceC129555tK2, str);
            case 3:
                final AnonymousClass781 anonymousClass781 = (AnonymousClass781) interfaceC129555tK;
                final C129535tI c129535tI = (C129535tI) interfaceC129555tK2;
                return new C76P(c1585879t, c129535tI, anonymousClass781, str) { // from class: X.76O
                    public final C1585879t A00;
                    public final C129535tI A01;
                    public final AnonymousClass781 A02;
                    public final String A03;
                    public final String A04;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c1585879t, c129535tI, anonymousClass781);
                        C14360o3.A0B(str, 1);
                        C14360o3.A0B(anonymousClass781, 2);
                        C14360o3.A0B(c1585879t, 4);
                        this.A03 = str;
                        this.A02 = anonymousClass781;
                        this.A01 = c129535tI;
                        this.A00 = c1585879t;
                        this.A04 = anonymousClass781.A05;
                    }

                    public final boolean equals(Object obj) {
                        if (this != obj) {
                            if (obj instanceof C76O) {
                                C76O c76o = (C76O) obj;
                                if (!C14360o3.A0K(this.A03, c76o.A03) || !C14360o3.A0K(this.A02, c76o.A02) || !C14360o3.A0K(this.A01, c76o.A01) || !C14360o3.A0K(this.A00, c76o.A00)) {
                                }
                            }
                            return false;
                        }
                        return true;
                    }

                    public final int hashCode() {
                        int hashCode = ((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31;
                        C129535tI c129535tI2 = this.A01;
                        return ((hashCode + (c129535tI2 == null ? 0 : c129535tI2.hashCode())) * 31) + this.A00.hashCode();
                    }

                    @Override // X.InterfaceC1584279c
                    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArH() {
                        return this.A01;
                    }

                    @Override // X.InterfaceC1584279c
                    public final /* bridge */ /* synthetic */ InterfaceC162787Qp ArQ() {
                        return this.A00;
                    }

                    @Override // X.AnonymousClass782
                    public final String Arl() {
                        return this.A04;
                    }

                    @Override // X.InterfaceC1584279c
                    public final /* bridge */ /* synthetic */ InterfaceC129555tK Bn9() {
                        return this.A02;
                    }

                    @Override // X.InterfaceC66482zP
                    public final /* bridge */ /* synthetic */ Object getKey() {
                        return this.A03;
                    }

                    @Override // X.InterfaceC66492zQ
                    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
                        return equals(obj);
                    }
                };
            case 4:
                return new C45230K0k(c1585879t, (JVH) interfaceC129555tK2, (C7SX) interfaceC129555tK, str);
            case 5:
                return new C45228K0i(c1585879t, (JVH) interfaceC129555tK2, (KT5) interfaceC129555tK, str);
            case 6:
                return new C45225K0f(c1585879t, (JVH) interfaceC129555tK2, (C163167Sb) interfaceC129555tK, str);
            case 7:
                return new C45229K0j(c1585879t, (JVH) interfaceC129555tK2, (AnonymousClass781) interfaceC129555tK, str);
            case 8:
                return new C45224K0e(c1585879t, (JVH) interfaceC129555tK2, (C7QY) interfaceC129555tK, str);
            default:
                return new C45223K0d((KT7) interfaceC129555tK, c1585879t, (JVH) interfaceC129555tK2, str);
        }
    }
}
