package X;

import android.content.Context;

/* renamed from: X.Vgr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69050Vgr {
    public VZv A00;
    public final Context A01;
    public final InterfaceC71946XBv A02;

    public C69050Vgr(Context context) {
        InterfaceC71946XBv wu0;
        this.A01 = context;
        try {
            VY0.A00(context);
            wu0 = VY0.A00.AKE();
        } catch (X1i e) {
            C42961yO.A09.A04(e);
            wu0 = new WU0(this);
        }
        this.A02 = wu0;
    }
}
