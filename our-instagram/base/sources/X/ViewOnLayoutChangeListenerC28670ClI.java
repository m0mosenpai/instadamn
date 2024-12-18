package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;

/* renamed from: X.ClI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnLayoutChangeListenerC28670ClI implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;

    public ViewOnLayoutChangeListenerC28670ClI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Resources resources;
        Configuration configuration;
        int i9;
        switch (this.A00) {
            case 0:
                BZF bzf = (BZF) this.A01;
                View view2 = bzf.A01;
                if (view2 == null || (resources = view2.getResources()) == null || (configuration = resources.getConfiguration()) == null || (i9 = configuration.orientation) == bzf.A00) {
                    return;
                }
                bzf.A00 = i9;
                InterfaceC16820sZ interfaceC16820sZ = bzf.A03;
                if (interfaceC16820sZ == null) {
                    return;
                }
                interfaceC16820sZ.invoke();
                return;
            case 1:
                C28584CjP c28584CjP = (C28584CjP) this.A01;
                c28584CjP.A01.removeOnLayoutChangeListener(this);
                C28584CjP.A00(c28584CjP);
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                ((C27343C4y) this.A01).A00();
                return;
        }
    }
}
