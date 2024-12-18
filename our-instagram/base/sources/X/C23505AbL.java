package X;

import android.opengl.EGLContext;
import android.os.Handler;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.List;
import java.util.Map;

/* renamed from: X.AbL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23505AbL implements InterfaceC25204BDc {
    public final /* synthetic */ AGP A00;

    @Override // X.InterfaceC25204BDc
    public final /* synthetic */ void CiT() {
    }

    public C23505AbL(AGP agp) {
        this.A00 = agp;
    }

    @Override // X.InterfaceC25204BDc
    public final boolean AJF(WDI wdi, MediaComposition mediaComposition, InterfaceC25205BDd interfaceC25205BDd, U7W u7w, Map map, int i, int i2, int i3, int i4) {
        InterfaceC179117xN interfaceC179117xN;
        AGP agp = this.A00;
        InterfaceC179077xJ BQr = AGP.A00(agp).A01.BQr();
        List list = (List) mediaComposition.A00.get(EnumC1125356h.VIDEO);
        if (list != null && !list.isEmpty()) {
            if (BQr instanceof InterfaceC179117xN) {
                interfaceC179117xN = (InterfaceC179117xN) BQr;
            } else {
                interfaceC179117xN = null;
            }
            agp.A01 = interfaceC179117xN;
        }
        return true;
    }

    @Override // X.InterfaceC25204BDc
    public final InterfaceC25205BDd AMx(EGLContext eGLContext, Handler handler, InterfaceC178837wv interfaceC178837wv, InterfaceC178897x1 interfaceC178897x1, WDI wdi, U7W u7w, Object obj) {
        AGP agp = this.A00;
        agp.A00 = interfaceC178837wv;
        return agp.A04;
    }

    @Override // X.InterfaceC25204BDc
    public final InterfaceC179117xN Bmn() {
        return this.A00.A01;
    }
}
