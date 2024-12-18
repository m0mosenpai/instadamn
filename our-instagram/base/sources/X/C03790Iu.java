package X;

import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0Iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03790Iu extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03790Iu(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new C12E(this.A01.appContext, this.A00);
    }
}
