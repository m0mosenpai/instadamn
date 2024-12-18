package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.368, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass368 extends AnonymousClass346 {
    public final InterfaceC43071ya A00;
    public final C33P A01;

    public AnonymousClass368(final C33P c33p) {
        this.A01 = c33p;
        this.A00 = new InterfaceC43071ya(c33p) { // from class: X.369
            public final C33P A01;
            public final WeakReference A02 = new WeakReference(null);
            public final Rect A00 = new Rect();

            {
                this.A01 = c33p;
            }

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                C38321qM c38321qM = (C38321qM) obj;
                float CGk = interfaceC57162jr.CGk(c59062n7);
                Rect rect = this.A00;
                interfaceC57162jr.BA6(rect, c59062n7);
                int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                if (intValue != 1) {
                    if (intValue != 0) {
                        if (intValue == 2) {
                            this.A01.A06(c38321qM);
                            return;
                        }
                        return;
                    } else {
                        C33P c33p2 = this.A01;
                        int i = rect.top;
                        int i2 = rect.left;
                        View view = (View) this.A02.get();
                        int i3 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                        c33p2.A04(view, c38321qM, c38321qM, CGk, i, i2, false, false, false);
                        return;
                    }
                }
                this.A01.A03((View) this.A02.get(), c38321qM, c38321qM, CGk, rect.top, rect.left);
            }
        };
    }
}
