package X;

import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0DK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0DK extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;
    public final /* synthetic */ C17090t4 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DK(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess, C17090t4 c17090t4) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
        this.A02 = c17090t4;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new C217914f(this.A01.appContext, this.A00, this.A02);
    }
}
