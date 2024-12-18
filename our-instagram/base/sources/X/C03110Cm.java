package X;

import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0Cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03110Cm extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ C211211o A01;
    public final /* synthetic */ C211211o A02;
    public final /* synthetic */ InstagramApplicationForMainProcess A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03110Cm(C211211o c211211o, C211211o c211211o2, C211211o c211211o3, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A03 = instagramApplicationForMainProcess;
        this.A02 = c211211o;
        this.A00 = c211211o2;
        this.A01 = c211211o3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new C12H(this.A03.appContext, this.A02, this.A00, this.A01, true);
    }
}
