package X;

import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0E5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0E5 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E5(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new AnonymousClass142(this.A01.appContext, this.A00);
    }
}
