package X;

import android.graphics.Rect;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.G0b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36306G0b implements InterfaceC43071ya {
    public final java.util.Set A00 = AbstractC166987dD.A1H();

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        C38321qM c38321qM = (C38321qM) c59062n7.A03;
        C75113Zb c75113Zb = (C75113Zb) c59062n7.A04;
        if (interfaceC57162jr.CGk(c59062n7) >= 0.5f) {
            Rect rect = new Rect();
            interfaceC57162jr.BA8(rect, c59062n7);
            int i = rect.bottom;
            Rect rect2 = new Rect();
            interfaceC57162jr.BA6(rect2, c59062n7);
            if (i == rect2.bottom) {
                java.util.Set set = this.A00;
                if (!set.contains(c38321qM.getId())) {
                    set.add(c38321qM.getId());
                    C14360o3.A0A(c75113Zb);
                    if (!c75113Zb.A3E) {
                        C36712GGh c36712GGh = new C36712GGh(c38321qM, c75113Zb, set);
                        C87353ut c87353ut = c75113Zb.A0r;
                        if (c87353ut == null) {
                            c87353ut = new C87353ut();
                            c75113Zb.A0r = c87353ut;
                        }
                        c87353ut.A00 = c36712GGh;
                        List list = c87353ut.A02.A04;
                        list.clear();
                        list.add(AbstractC25225BEi.A16(c87353ut.A00));
                        WeakReference weakReference = c87353ut.A01;
                        if (weakReference != null) {
                            list.add(weakReference);
                        }
                        if (!c75113Zb.A3E) {
                            C87353ut c87353ut2 = c75113Zb.A0r;
                            if (c87353ut2 == null) {
                                c75113Zb.A0r = new C87353ut();
                            } else {
                                c87353ut2.A00();
                            }
                            C87353ut c87353ut3 = c75113Zb.A0r;
                            if (c87353ut3 != null) {
                                c87353ut3.A01(3000L, 300L);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.A00.remove(c38321qM.getId());
    }
}
