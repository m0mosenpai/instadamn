package X;

import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;

/* loaded from: classes4.dex */
public final class B2P implements InterfaceC08830cm {
    public Object A00;
    public final int A01;
    public final Object A02;

    public B2P(IgLiteCameraProxy igLiteCameraProxy) {
        this.A01 = 2;
        this.A02 = igLiteCameraProxy;
    }

    public static C22910A8g A00(IgLiteCameraProxy igLiteCameraProxy) {
        return (C22910A8g) igLiteCameraProxy.A04.get();
    }

    @Override // X.InterfaceC08830cm
    public final Object get() {
        Object obj;
        switch (this.A01) {
            case 0:
                C9RK c9rk = (C9RK) this.A00;
                return c9rk.A0N.A05(A0R.A00((FilterGroupModel) this.A02, "OneCameraImageRenderController"), false);
            case 1:
                return new C23104AGq((AbstractC59962oe) this.A00, ((C23984AkJ) this.A02).A05);
            default:
                synchronized (this) {
                    obj = this.A00;
                    if (obj == null) {
                        IgLiteCameraProxy igLiteCameraProxy = (IgLiteCameraProxy) this.A02;
                        igLiteCameraProxy.A0M = false;
                        obj = new C22910A8g(new C23409AZi(igLiteCameraProxy), Boolean.valueOf(igLiteCameraProxy.A0I), igLiteCameraProxy.A0E);
                        this.A00 = obj;
                    }
                }
                return obj;
        }
    }

    public B2P(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj2;
        this.A00 = obj;
    }
}
