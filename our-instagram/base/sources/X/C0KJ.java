package X;

import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0KJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0KJ extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ C211211o A01;
    public final /* synthetic */ InstagramApplicationForMainProcess A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KJ(C211211o c211211o, C211211o c211211o2, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A02 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
        this.A01 = c211211o2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new C14R(this.A02.appContext, this.A00, this.A01);
    }
}
