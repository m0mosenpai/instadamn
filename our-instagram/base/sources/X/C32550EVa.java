package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.EVa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32550EVa extends AbstractC31469DsD {
    public Object A00;
    public boolean A01;
    public final C07X A02;
    public final InterfaceC16820sZ A03;

    public C32550EVa(C07X c07x, InterfaceC16820sZ interfaceC16820sZ) {
        if (c07x instanceof Fragment) {
            C31470DsE.A01(c07x, ((Fragment) c07x).mViewLifecycleOwnerLiveData, this, 4);
        } else {
            c07x.getLifecycle().A09(new C152036sn(c07x.getLifecycle(), this));
        }
        this.A02 = c07x;
        this.A03 = interfaceC16820sZ;
        this.A01 = true;
    }
}
