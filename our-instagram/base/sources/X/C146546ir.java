package X;

import android.view.KeyEvent;
import android.view.View;
import com.google.common.collect.MapMakerInternalMap;
import java.util.Map;

/* renamed from: X.6ir, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146546ir implements InterfaceC43071ya {
    public float A00;
    public final Map A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        KeyEvent.Callback callback = (View) this.A01.get(c59062n7.A03);
        if (callback instanceof InterfaceC115845Ly) {
            float CGk = interfaceC57162jr.CGk(c59062n7);
            float f = this.A00;
            boolean z = false;
            if (f == 0.0f) {
                z = true;
            }
            if ((z || f == 1.0f) && 0.0f < CGk && CGk < 1.0f) {
                ((InterfaceC115845Ly) callback).E0o();
            } else if (f < 1.0f && CGk == 1.0f) {
                ((InterfaceC115845Ly) callback).E0c();
            } else if (f > 0.0f && CGk == 0.0f) {
                ((InterfaceC115845Ly) callback).E0l();
            }
            this.A00 = CGk;
        }
    }

    public C146546ir() {
        C18B c18b = new C18B();
        c18b.A04(MapMakerInternalMap.Strength.A01);
        c18b.A01();
        this.A01 = c18b.A00();
    }
}
