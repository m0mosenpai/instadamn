package X;

import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0Ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03660Ie extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ C211211o A01;
    public final /* synthetic */ InstagramApplicationForMainProcess A02;
    public final /* synthetic */ InterfaceC09390do A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03660Ie(C211211o c211211o, C211211o c211211o2, InstagramApplicationForMainProcess instagramApplicationForMainProcess, InterfaceC09390do interfaceC09390do) {
        super(0);
        this.A02 = instagramApplicationForMainProcess;
        this.A01 = c211211o;
        this.A00 = c211211o2;
        this.A03 = interfaceC09390do;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new C12D(this.A02.appContext, this.A01, this.A00, this.A03);
    }
}
