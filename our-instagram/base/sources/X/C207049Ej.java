package X;

import java.util.Locale;

/* renamed from: X.9Ej, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207049Ej extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207049Ej(long j, Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            C3NZ c3nz = (C3NZ) obj;
            C14360o3.A0B(c3nz, 0);
            boolean z = false;
            if (this.A01 - c3nz.A00 >= ((C3NV) this.A02).A03) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        EnumC222799sK enumC222799sK = (EnumC222799sK) obj;
        C14360o3.A0B(enumC222799sK, 0);
        C1818084p c1818084p = ((C1817984o) this.A02).A03;
        long j = this.A01;
        String lowerCase = enumC222799sK.name().toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        c1818084p.A03(j, lowerCase);
        return C0eB.A00;
    }
}
