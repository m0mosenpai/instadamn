package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes4.dex */
public final class B62 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ C65502xm A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B62(ImageUrl imageUrl, C65502xm c65502xm, String str, String str2) {
        super(0);
        this.A01 = c65502xm;
        this.A02 = str;
        this.A00 = imageUrl;
        this.A03 = str2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A01.A0H) {
            return new C80463ib(this.A00, this.A02, this.A03);
        }
        return null;
    }
}
