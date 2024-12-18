package X;

import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0Ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04120Ke extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C211211o A05;
    public final /* synthetic */ InstagramApplicationForMainProcess A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04120Ke(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess, long j, long j2, long j3, long j4, long j5) {
        super(0);
        this.A06 = instagramApplicationForMainProcess;
        this.A04 = j;
        this.A02 = j2;
        this.A03 = j3;
        this.A01 = j4;
        this.A00 = j5;
        this.A05 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new C13N(this.A06.appContext, this.A05, this.A04, this.A02, this.A03, this.A01, this.A00);
    }
}
