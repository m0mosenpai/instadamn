package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.UIManagerHelper;
import java.lang.ref.WeakReference;

/* renamed from: X.WWy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70461WWy implements InterfaceC65355Tij {
    public C68915VeF A01;
    public final ViewGroup A04;
    public final boolean A05;
    public WeakReference A02 = null;
    public Rect A00 = null;
    public boolean A03 = false;

    public final void A00() {
        if (!this.A03) {
            this.A03 = true;
            ViewGroup viewGroup = this.A04;
            Q21 q21 = (Q21) viewGroup.getContext();
            int id = viewGroup.getId();
            int i = 2;
            if (id % 2 != 0) {
                i = 1;
            }
            InterfaceC65589TnT A03 = UIManagerHelper.A03(q21, i, true);
            AbstractC05810Sj.A00(A03);
            A03.addUIManagerEventListener(this);
        }
    }

    public final void A01() {
        if (this.A03) {
            this.A03 = false;
            ViewGroup viewGroup = this.A04;
            Q21 q21 = (Q21) viewGroup.getContext();
            int i = 2;
            if (viewGroup.getId() % 2 != 0) {
                i = 1;
            }
            InterfaceC65589TnT A03 = UIManagerHelper.A03(q21, i, true);
            AbstractC05810Sj.A00(A03);
            A03.removeUIManagerEventListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02() {
        WeakReference weakReference;
        View view;
        ViewGroup viewGroup = this.A04;
        if (viewGroup.getId() % 2 != 0 && this.A01 != null && (weakReference = this.A02) != null && this.A00 != null && (view = (View) weakReference.get()) != null) {
            Rect rect = new Rect();
            view.getHitRect(rect);
            if (this.A05) {
                int i = rect.left - this.A00.left;
                if (i != 0) {
                    int scrollX = viewGroup.getScrollX();
                    XC6 xc6 = (XC6) viewGroup;
                    xc6.EMR(i + scrollX, viewGroup.getScrollY());
                    this.A00 = rect;
                    Integer num = this.A01.A01;
                    if (num != null && scrollX <= num.intValue()) {
                        xc6.E7j(0, viewGroup.getScrollY());
                        return;
                    }
                    return;
                }
                return;
            }
            int i2 = rect.top - this.A00.top;
            if (i2 == 0) {
                return;
            }
            int scrollY = viewGroup.getScrollY();
            XC6 xc62 = (XC6) viewGroup;
            xc62.EMR(viewGroup.getScrollX(), i2 + scrollY);
            this.A00 = rect;
            Integer num2 = this.A01.A01;
            if (num2 == null || scrollY > num2.intValue()) {
                return;
            }
            xc62.E7j(viewGroup.getScrollX(), 0);
        }
    }

    @Override // X.InterfaceC65355Tij
    public final void willDispatchViewUpdates(InterfaceC65589TnT interfaceC65589TnT) {
        C63255SgD.A01(new RunnableC71258Wqn(this));
    }

    public C70461WWy(ViewGroup viewGroup, boolean z) {
        this.A04 = viewGroup;
        this.A05 = z;
    }
}
