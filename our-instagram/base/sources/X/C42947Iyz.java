package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Iyz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42947Iyz implements InterfaceC670130s {
    public final /* synthetic */ C42952Iz4 A00;
    public final /* synthetic */ IMU A01;

    @Override // X.InterfaceC670130s
    public final void CtX(int i) {
    }

    @Override // X.InterfaceC670130s
    public final void D7Y() {
    }

    public C42947Iyz(C42952Iz4 c42952Iz4, IMU imu) {
        this.A00 = c42952Iz4;
        this.A01 = imu;
    }

    @Override // X.InterfaceC670130s
    public final /* synthetic */ C101484hA DnY(Integer num, Integer num2, List list) {
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(24));
    }

    @Override // X.InterfaceC670130s
    public final Map Bkt() {
        return AbstractC06930Yk.A0E();
    }

    @Override // X.InterfaceC670130s
    public final C101484hA DnX(Integer num, List list) {
        AbstractC167017dG.A1N(list, num);
        InterfaceC670130s interfaceC670130s = this.A00.A02;
        if (interfaceC670130s == null) {
            C14360o3.A0F("responseCallback");
            throw C00O.createAndThrow();
        }
        C101484hA DnX = interfaceC670130s.DnX(num, list);
        if (DnX == null) {
            C16930sl c16930sl = C16930sl.A00;
            return new C101484hA(c16930sl, c16930sl);
        }
        return DnX;
    }
}
