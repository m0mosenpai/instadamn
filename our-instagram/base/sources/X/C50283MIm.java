package X;

import com.facebook.instagrammem.mca.MailboxInstagramMem$BytesAvailableHandlerCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.MIm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50283MIm extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ android.net.Uri A03;
    public final /* synthetic */ MailboxInstagramMem$BytesAvailableHandlerCallback A04;
    public final /* synthetic */ C44992Jvi A05;
    public final /* synthetic */ C44991Jvh A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ byte[] A0A;
    public final /* synthetic */ byte[] A0B;
    public final /* synthetic */ byte[] A0C;
    public final /* synthetic */ byte[] A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50283MIm(android.net.Uri uri, MailboxInstagramMem$BytesAvailableHandlerCallback mailboxInstagramMem$BytesAvailableHandlerCallback, C44992Jvi c44992Jvi, C44991Jvh c44991Jvh, Integer num, String str, List list, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, int i2, long j) {
        super(1);
        this.A07 = num;
        this.A0B = bArr;
        this.A0A = bArr2;
        this.A0C = bArr3;
        this.A02 = j;
        this.A08 = str;
        this.A03 = uri;
        this.A0D = bArr4;
        this.A09 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = mailboxInstagramMem$BytesAvailableHandlerCallback;
        this.A05 = c44992Jvi;
        this.A06 = c44991Jvh;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        K3X k3x = (K3X) obj;
        C14360o3.A0B(k3x, 0);
        int A00 = AbstractC46713KlW.A00(this.A07);
        byte[] bArr = this.A0B;
        byte[] bArr2 = this.A0A;
        byte[] bArr3 = this.A0C;
        long j = this.A02;
        String str = this.A08;
        android.net.Uri uri = this.A03;
        byte[] bArr4 = this.A0D;
        List list = this.A09;
        int i = this.A01;
        int i2 = this.A00;
        if (i2 < 0) {
            i2 = 0;
        }
        MailboxInstagramMem$BytesAvailableHandlerCallback mailboxInstagramMem$BytesAvailableHandlerCallback = this.A04;
        C44992Jvi c44992Jvi = this.A05;
        JRS A002 = JRS.A00(this.A06, 31);
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3x);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, A002);
        AbstractC25231BEo.A1C(A0H, new LV5(uri, mailboxInstagramMem$BytesAvailableHandlerCallback, c44992Jvi, k3x, A0I, str, list, bArr, bArr2, bArr3, bArr4, A00, i, i2, j), A0I);
        return C0eB.A00;
    }
}
