package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class D8f extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8f(Object obj, String str, String str2, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                return new HHX((UserSession) obj, this.A03, this.A02, this.A04);
            case 1:
                super/*X.1CN*/.AD0(this.A03, this.A02, this.A04);
                return C0eB.A00;
            case 2:
                super/*X.1CN*/.AD1(this.A03, this.A02, this.A04);
                return C0eB.A00;
            case 3:
                super/*X.1CN*/.CjM(this.A02, this.A04, this.A03);
                return C0eB.A00;
            case 4:
                super/*X.1CN*/.CjN(this.A02, this.A04, this.A03);
                return C0eB.A00;
            case 5:
                super/*X.1CN*/.CkB(this.A02, this.A04, this.A03);
                return C0eB.A00;
            case 6:
                super/*X.1CN*/.CkC(this.A02, this.A04, this.A03);
                return C0eB.A00;
            default:
                super/*X.1CN*/.A0x(this.A02, this.A04, this.A03);
                return C0eB.A00;
        }
    }
}
