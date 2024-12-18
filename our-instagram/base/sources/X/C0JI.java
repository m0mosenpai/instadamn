package X;

import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0JI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0JI extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JI(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess, boolean z) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
        this.A02 = z;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new C13R(this.A01.appContext, this.A00, this.A02);
    }
}
