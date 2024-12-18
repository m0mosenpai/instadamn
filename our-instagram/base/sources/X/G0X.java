package X;

import android.graphics.Rect;
import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes6.dex */
public final class G0X implements InterfaceC43071ya {
    public final InterfaceC37151GYo A00;

    public G0X(InterfaceC37151GYo interfaceC37151GYo) {
        C14360o3.A0B(interfaceC37151GYo, 1);
        this.A00 = interfaceC37151GYo;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        DirectShareTarget directShareTarget;
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        Integer CFq = interfaceC57162jr.CFq(c59062n7);
        C14360o3.A07(CFq);
        if ((CFq == C05F.A00 || CFq == C05F.A01) && interfaceC57162jr.CGk(c59062n7) > 0.25f) {
            DirectShareTarget directShareTarget2 = (DirectShareTarget) c59062n7.A03;
            if (directShareTarget2 != null) {
                Rect rect = new Rect();
                interfaceC57162jr.BA6(rect, c59062n7);
                int i = rect.bottom;
                int i2 = rect.top;
                int i3 = i - i2;
                FKH fkh = (FKH) c59062n7.A04;
                if (fkh != null) {
                    this.A00.DdJ(fkh, directShareTarget2, i2 - (i3 * 0.25f));
                    return;
                }
                return;
            }
            return;
        }
        if ((CFq != C05F.A0C && (CFq != C05F.A01 || interfaceC57162jr.CGk(c59062n7) >= 0.25f)) || (directShareTarget = (DirectShareTarget) c59062n7.A03) == null) {
            return;
        }
        this.A00.DdI(directShareTarget);
    }
}
