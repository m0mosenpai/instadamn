package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WVG implements InterfaceC58100PpP {
    public final C68668Va4 A00;
    public final Map A01 = new HashMap();

    @Override // X.InterfaceC58100PpP
    public final void AGL(InterfaceC57793PkK interfaceC57793PkK) {
        C14360o3.A0B(interfaceC57793PkK, 0);
        WG6 wg6 = ((WVF) interfaceC57793PkK).A03;
        if (wg6.A09 == null) {
            wg6.A09 = null;
            wg6.A0A = null;
            wg6.A0B = null;
            wg6.A02.D1z();
            return;
        }
        OVd oVd = wg6.A07;
        C53680NoV c53680NoV = wg6.A09;
        if (c53680NoV != null) {
            InterfaceC27201Tu interfaceC27201Tu = (InterfaceC27201Tu) oVd.A01.get(c53680NoV);
            if (interfaceC27201Tu != null) {
                interfaceC27201Tu.cancel();
            }
            Object obj = wg6.A08;
            synchronized (obj) {
                obj.notifyAll();
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC58100PpP
    public final InterfaceC57793PkK En2(C54993OUc c54993OUc, C55191Odx c55191Odx, XE6 xe6) {
        String str;
        AbstractC167007dF.A1K(c55191Odx, c54993OUc);
        String str2 = c55191Odx.A03;
        if ((str2 == null || str2.length() == 0) && ((str = c54993OUc.A08) == null || str.length() == 0)) {
            throw new VIA(null, "Empty file key", Collections.emptyMap(), 0, 0L, false);
        }
        WVH wvh = new WVH(this);
        ArrayList A0z = AbstractC31174DnI.A0z(wvh);
        if (xe6 != null) {
            A0z.add(xe6);
        }
        WVF wvf = new WVF(new WG6(c54993OUc, c55191Odx, new WVI(A0z), this.A00.A00));
        this.A01.put(wvh, wvf);
        WG6 wg6 = wvf.A03;
        wg6.A02.onStart();
        C54993OUc c54993OUc2 = wg6.A04;
        C69056Vgx c69056Vgx = c54993OUc2.A07;
        c69056Vgx.A01 = 0;
        c69056Vgx.A00 = c69056Vgx.A02.A02;
        if (c54993OUc2.A0C) {
            WG6.A01(wg6);
            return wvf;
        }
        WG6.A02(wg6, c54993OUc2.A01, false);
        return wvf;
    }

    @Override // X.InterfaceC58100PpP
    public final W63 FDr(InterfaceC57793PkK interfaceC57793PkK) {
        WVF wvf;
        C14360o3.A0B(interfaceC57793PkK, 0);
        while (true) {
            wvf = (WVF) interfaceC57793PkK;
            if (wvf.A02) {
                break;
            }
            synchronized (interfaceC57793PkK) {
                try {
                    interfaceC57793PkK.wait();
                } catch (InterruptedException unused) {
                    AbstractC58318PtA.A18();
                }
            }
        }
        VIA via = wvf.A00;
        if (via == null) {
            W63 w63 = wvf.A01;
            if (w63 != null) {
                return w63;
            }
            throw AbstractC166997dE.A0g();
        }
        throw via;
    }

    public WVG(OVd oVd) {
        this.A00 = new C68668Va4(oVd);
    }

    public static final void A00(WVH wvh, WVG wvg, VIA via) {
        Map map = wvg.A01;
        WVF wvf = (WVF) map.get(wvh);
        if (wvf != null) {
            wvf.A01 = null;
            wvf.A00 = via;
            wvf.A02 = true;
            synchronized (wvf) {
                wvf.notify();
            }
            map.remove(wvh);
        }
    }
}
