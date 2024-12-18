package X;

import android.graphics.Rect;
import com.instagram.creation.base.CropInfo;

/* loaded from: classes9.dex */
public final class MW9 implements InterfaceC08830cm {
    public final int A00;
    public final Object A01;

    public MW9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        float height;
        int width;
        int width2;
        int i;
        switch (this.A00) {
            case 0:
                Object value = ((OK0) this.A01).A0C.getValue();
                C14360o3.A07(value);
                return value;
            case 1:
            case 3:
                P09 p09 = (P09) this.A01;
                InterfaceC197718oi interfaceC197718oi = p09.A03;
                if (interfaceC197718oi == null) {
                    interfaceC197718oi = p09.A0H.A05(A0R.A00(p09.A0P, "ImageRenderController"), false);
                    p09.A03 = interfaceC197718oi;
                }
                interfaceC197718oi.getClass();
                YRL yrl = p09.A04;
                if (yrl != null) {
                    CropInfo cropInfo = p09.A0H.A01;
                    cropInfo.getClass();
                    InterfaceC197718oi interfaceC197718oi2 = p09.A03;
                    Rect A00 = A0S.A00(cropInfo.A02, interfaceC197718oi2.getWidth(), interfaceC197718oi2.getHeight(), cropInfo.A01, cropInfo.A00);
                    if (p09.A0C % 180 == 0) {
                        height = A00.width();
                        width = A00.height();
                    } else {
                        height = A00.height();
                        width = A00.width();
                    }
                    float f = height / width;
                    if (f < 1.0f) {
                        i = yrl.getHeight();
                        width2 = (int) ((i * f) + 0.5f);
                    } else {
                        width2 = yrl.getWidth();
                        i = (int) ((width2 / f) + 0.5f);
                    }
                    yrl.EcX(width2, i);
                    OJK ojk = p09.A01;
                    if (ojk != null) {
                        ojk.A00(width2, i);
                    }
                }
                return p09.A03;
            case 2:
                return ((P09) this.A01).A04;
            case 4:
                return C4JK.A00;
            case 5:
                MZB mzb = ((MZA) this.A01).A04;
                if (mzb != null) {
                    obj = mzb.A08;
                    return C46h.A00(obj);
                }
                obj = null;
                return C46h.A00(obj);
            case 6:
                MZB mzb2 = ((MZA) this.A01).A04;
                if (mzb2 != null) {
                    obj = ((C4S7) mzb2).A03;
                    return C46h.A00(obj);
                }
                obj = null;
                return C46h.A00(obj);
            case 7:
            case 8:
            default:
                return ((InterfaceC09390do) this.A01).getValue();
            case 9:
                return ((C53021Nct) this.A01).A0F;
            case 10:
                return ((C53020Ncs) this.A01).A07;
        }
    }
}
