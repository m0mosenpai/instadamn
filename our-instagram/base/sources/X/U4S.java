package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class U4S implements Runnable {
    public final /* synthetic */ C72743Nv A00;

    public U4S(C72743Nv c72743Nv) {
        this.A00 = c72743Nv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        C72743Nv c72743Nv = this.A00;
        C57012jc c57012jc = c72743Nv.A0F;
        if (c57012jc == null) {
            InterfaceC72008XEw interfaceC72008XEw = c72743Nv.A06;
            if (interfaceC72008XEw != null) {
                interfaceC72008XEw.Cna("component_missing");
            }
        } else if (c57012jc.A00 != null) {
            c57012jc.A01().setVisibility(8);
        }
        C57012jc c57012jc2 = c72743Nv.A0E;
        if (c57012jc2 != null && c57012jc2.A00 != null) {
            c57012jc2.A01().setVisibility(8);
        }
        View view = c72743Nv.A00;
        if (view != null && (viewGroup = (ViewGroup) c72743Nv.mView) != null) {
            viewGroup.removeView(view);
        }
        AbstractC167007dF.A0w(c72743Nv.A01);
    }
}
