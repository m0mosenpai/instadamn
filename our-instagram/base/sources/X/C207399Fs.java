package X;

/* renamed from: X.9Fs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207399Fs extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207399Fs(String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC113515Ao interfaceC113515Ao;
        InterfaceC113515Ao interfaceC113515Ao2;
        Object A00;
        switch (this.A00) {
            case 0:
                interfaceC113515Ao = (InterfaceC113515Ao) obj;
                AbstractC113575Au.A03(interfaceC113515Ao, this.A01);
                AbstractC113575Au.A02(interfaceC113515Ao, 5);
                return C0eB.A00;
            case 1:
                interfaceC113515Ao2 = (InterfaceC113515Ao) obj;
                AbstractC113575Au.A03(interfaceC113515Ao2, this.A01);
                return C0eB.A00;
            case 2:
            case 3:
                interfaceC113515Ao2 = (InterfaceC113515Ao) obj;
                C14360o3.A0B(interfaceC113515Ao2, 0);
                AbstractC113575Au.A03(interfaceC113515Ao2, this.A01);
                return C0eB.A00;
            case 4:
                C138276Oi c138276Oi = (C138276Oi) obj;
                C14360o3.A0B(c138276Oi, 0);
                A00 = c138276Oi.A00();
                return Boolean.valueOf(C14360o3.A0K(A00, this.A01));
            case 5:
            case 6:
            default:
                C09530e4 c09530e4 = (C09530e4) obj;
                C14360o3.A0B(c09530e4, 0);
                A00 = c09530e4.A01;
                return Boolean.valueOf(C14360o3.A0K(A00, this.A01));
            case 7:
                interfaceC113515Ao = (InterfaceC113515Ao) obj;
                C14360o3.A0B(interfaceC113515Ao, 0);
                AbstractC113575Au.A03(interfaceC113515Ao, this.A01);
                AbstractC113575Au.A02(interfaceC113515Ao, 5);
                return C0eB.A00;
        }
    }
}
