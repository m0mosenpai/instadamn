package X;

import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0Bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03010Bz extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InstagramApplicationForMainProcess A00;
    public final /* synthetic */ C17090t4 A01;
    public final /* synthetic */ InterfaceC09390do A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03010Bz(InstagramApplicationForMainProcess instagramApplicationForMainProcess, C17090t4 c17090t4, InterfaceC09390do interfaceC09390do) {
        super(0);
        this.A00 = instagramApplicationForMainProcess;
        this.A01 = c17090t4;
        this.A02 = interfaceC09390do;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new C12A(this.A00.appContext, this.A01, this.A02);
    }
}
