package X;

import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0Im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03710Im extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211411q A00;
    public final /* synthetic */ C211211o A01;
    public final /* synthetic */ InstagramApplicationForMainProcess A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03710Im(C211411q c211411q, C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A02 = instagramApplicationForMainProcess;
        this.A01 = c211211o;
        this.A00 = c211411q;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new C13Q(this.A02.appContext, this.A00, this.A01);
    }
}
