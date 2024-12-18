package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes8.dex */
public final class MIZ extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ android.net.Uri A01;
    public final /* synthetic */ L19 A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ byte[] A05;
    public final /* synthetic */ byte[] A06;
    public final /* synthetic */ byte[] A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIZ(android.net.Uri uri, L19 l19, Integer num, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, long j) {
        super(1);
        this.A03 = num;
        this.A06 = bArr;
        this.A05 = bArr2;
        this.A07 = bArr3;
        this.A00 = j;
        this.A04 = str;
        this.A01 = uri;
        this.A02 = l19;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        K3X k3x = (K3X) obj;
        C14360o3.A0B(k3x, 0);
        int A00 = AbstractC46713KlW.A00(this.A03);
        byte[] bArr = this.A06;
        byte[] bArr2 = this.A05;
        byte[] bArr3 = this.A07;
        long j = this.A00;
        String str = this.A04;
        android.net.Uri uri = this.A01;
        JRS A002 = JRS.A00(this.A02, 26);
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3x);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, A002);
        AbstractC25231BEo.A1C(A0H, new C48201LUz(uri, k3x, A0I, str, bArr, bArr2, bArr3, A00, j), A0I);
        return C0eB.A00;
    }
}
