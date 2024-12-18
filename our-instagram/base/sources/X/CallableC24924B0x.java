package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import java.util.concurrent.Callable;

/* renamed from: X.B0x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC24924B0x implements Callable {
    public final int A00;
    public final Object A01;

    public CallableC24924B0x(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        switch (this.A00) {
            case 0:
                C23453AaQ.A00((C23453AaQ) this.A01);
                return null;
            case 1:
                C23454AaR.A01((C23454AaR) this.A01);
                return null;
            case 2:
                C1823987e c1823987e = (C1823987e) this.A01;
                AbstractC29601bb abstractC29601bb = c1823987e.A02;
                InterfaceC37561ot acquire = abstractC29601bb.acquire();
                try {
                    C1YP c1yp = c1823987e.A01;
                    c1yp.beginTransaction();
                    try {
                        acquire.ATb();
                        c1yp.setTransactionSuccessful();
                        return C0eB.A00;
                    } finally {
                        c1yp.endTransaction();
                    }
                } finally {
                    abstractC29601bb.release(acquire);
                }
            case 3:
            case 5:
            default:
                ((C8J9) this.A01).A01.A08(0);
                z = true;
                return Boolean.valueOf(z);
            case 4:
                C8PR c8pr = (C8PR) this.A01;
                View view = c8pr.A03;
                view.getClass();
                Object parent = view.getParent();
                parent.getClass();
                int width = ((View) parent).getWidth();
                View view2 = c8pr.A03;
                view2.getClass();
                int width2 = (width - view2.getWidth()) / 2;
                c8pr.A00 = width2;
                FittingTextView fittingTextView = c8pr.A0L;
                if (fittingTextView != null) {
                    fittingTextView.setMaxWidth(width2);
                }
                FittingTextView fittingTextView2 = c8pr.A0K;
                if (fittingTextView2 != null) {
                    fittingTextView2.setMaxWidth(width2);
                }
                z = false;
                return Boolean.valueOf(z);
            case 6:
                ViewGroup viewGroup = ((ViewOnFocusChangeListenerC23254ASp) this.A01).A00;
                viewGroup.getClass();
                viewGroup.setTranslationY((r3.A08.getHeight() - r3.A00.getHeight()) / 2);
                z = true;
                return Boolean.valueOf(z);
            case 7:
                C8LD.A0D(((ViewOnFocusChangeListenerC23252ASn) this.A01).A00);
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
