package X;

import android.R;
import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import android.view.WindowManager;

/* renamed from: X.12B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C12B extends AbstractC211911v {
    public final Context A00;
    public final Context A01;

    public C12B(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A01 = context;
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "DevToolInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        C19700xy c19700xy = C17280tP.A4E;
        C17280tP A00 = c19700xy.A00();
        InterfaceC16530ry interfaceC16530ry = A00.A2p;
        C0YR[] c0yrArr = C17280tP.A4G;
        boolean booleanValue = ((Boolean) interfaceC16530ry.CES(A00, c0yrArr[65])).booleanValue();
        C17280tP A002 = c19700xy.A00();
        boolean booleanValue2 = ((Boolean) A002.A2r.CES(A002, c0yrArr[66])).booleanValue();
        if (booleanValue || booleanValue2) {
            C50044M7h c50044M7h = AbstractC47144Ksd.A00;
            Context context = this.A01;
            c50044M7h.A01 = (WindowManager) context.getSystemService("window");
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1000);
            c50044M7h.A00 = layoutParams;
            ((ViewGroup.LayoutParams) layoutParams).width = -1;
            ((ViewGroup.LayoutParams) layoutParams).height = -1;
            layoutParams.type = 2038;
            layoutParams.format = 1;
            layoutParams.flags = R.attr.numColumns;
            layoutParams.alpha = 0.7f;
            c50044M7h.A03 = new C44411Jjr(context);
            if (booleanValue) {
                C3NG c3ng = new C3NG();
                C3NG.A02 = c3ng;
                c50044M7h.A02 = c3ng;
                c3ng.addObserver(c50044M7h);
            }
            if (booleanValue2) {
                C1QR c1qr = new C1QR();
                C1QR.A02 = c1qr;
                c50044M7h.A04 = c1qr;
                c1qr.addObserver(c50044M7h);
            }
        }
        if (c19700xy.A00().A0Y()) {
            Context context2 = this.A01;
            C14360o3.A0B(context2, 0);
            C70162WEb.A00 = context2;
            ((Application) context2).registerActivityLifecycleCallbacks(C70162WEb.A03);
        }
        C17280tP A003 = c19700xy.A00();
        if (((Boolean) A003.A2z.CES(A003, c0yrArr[91])).booleanValue()) {
            W2u w2u = W2u.A07;
            Context context3 = this.A01;
            w2u.A00 = context3;
            Application application = (Application) context3;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(w2u.A05);
            }
        }
    }
}
