package X;

import java.util.Iterator;

/* renamed from: X.Gpo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38121Gpo implements InterfaceC43404JFu {
    public final /* synthetic */ C38086GpF A00;
    public final /* synthetic */ MTQ A01;

    public C38121Gpo(C38086GpF c38086GpF, MTQ mtq) {
        this.A01 = mtq;
        this.A00 = c38086GpF;
    }

    @Override // X.InterfaceC43404JFu
    public final void Dwz() {
        MTQ mtq = this.A01;
        C38086GpF c38086GpF = this.A00;
        Iterator A04 = c38086GpF.A04();
        C14360o3.A07(A04);
        mtq.A02(c38086GpF, C38157GqO.A00, A04);
    }
}
