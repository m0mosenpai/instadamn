package X;

import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes11.dex */
public final class X37 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C32021E4z A01;
    public final /* synthetic */ C66151U1s A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X37(C32021E4z c32021E4z, C66151U1s c66151U1s, String str, String str2, long j, boolean z) {
        super(0);
        this.A02 = c66151U1s;
        this.A03 = str;
        this.A00 = j;
        this.A04 = str2;
        this.A05 = z;
        this.A01 = c32021E4z;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        DirectShareTarget directShareTarget;
        C66151U1s c66151U1s = this.A02;
        C65911TwI c65911TwI = c66151U1s.A00;
        C32021E4z c32021E4z = null;
        if (c65911TwI != null) {
            directShareTarget = c65911TwI.A00();
        } else {
            directShareTarget = null;
        }
        String str = this.A03;
        long j = this.A00;
        String str2 = this.A04;
        boolean z = this.A05;
        String str3 = null;
        if (z) {
            str3 = str2;
        }
        if (z) {
            c32021E4z = this.A01;
        }
        C66151U1s.A00(c32021E4z, directShareTarget, c66151U1s, str, str2, str3, null, j, true);
        return C0eB.A00;
    }
}
