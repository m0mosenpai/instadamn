package X;

import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0ID, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ID extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ID(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AbstractC215513h.A01();
        return new AnonymousClass140(this.A00, AbstractC215513h.A00(this.A01.appContext));
    }
}
