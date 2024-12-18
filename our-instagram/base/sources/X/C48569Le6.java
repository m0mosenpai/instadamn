package X;

import android.graphics.Rect;
import java.util.Map;

/* renamed from: X.Le6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48569Le6 implements InterfaceC43071ya {
    public final Rect A00 = AbstractC166987dD.A0U();
    public final C55123Obk A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        int i;
        int i2;
        Map map;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        float CGk = interfaceC57162jr.CGk(c59062n7);
        Object obj = c59062n7.A03;
        OKu oKu = (OKu) obj;
        float A02 = CGk + (1.0f - C17s.A02(oKu.A00(), 0.5f, 1.0f));
        Rect rect = this.A00;
        interfaceC57162jr.BA8(rect, c59062n7);
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        C55123Obk c55123Obk = this.A01;
        if (A01 != 0) {
            if (A01 != A1R) {
                C14360o3.A06(obj);
                c55123Obk.A06.remove(oKu);
            } else {
                C14360o3.A06(obj);
                i = rect.top;
                i2 = rect.left;
                map = c55123Obk.A06;
                L31 l31 = (L31) map.get(oKu);
                if (l31 != null) {
                    if (l31.A00 == A02 && l31.A02 == i && l31.A01 == i2) {
                        return;
                    }
                    l31.A00 = A02;
                    l31.A02 = i;
                    l31.A01 = i2;
                }
            }
            c55123Obk.A01.sendEmptyMessage(0);
        }
        C14360o3.A06(obj);
        i = rect.top;
        i2 = rect.left;
        map = c55123Obk.A06;
        map.put(oKu, new L31(c55123Obk, A02, i, i2));
        c55123Obk.A01.sendEmptyMessage(0);
    }

    public C48569Le6(C55123Obk c55123Obk) {
        this.A01 = c55123Obk;
    }
}
