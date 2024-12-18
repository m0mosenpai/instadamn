package X;

import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0Cn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03120Cn extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;
    public final /* synthetic */ InterfaceC09390do A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03120Cn(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess, InterfaceC09390do interfaceC09390do) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
        this.A02 = interfaceC09390do;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new AnonymousClass129(this.A01.appContext, this.A00, this.A02);
    }
}
