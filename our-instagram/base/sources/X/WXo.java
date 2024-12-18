package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes11.dex */
public final class WXo implements InterfaceC77833eB {
    public boolean A00;
    public final InterfaceC16820sZ A01;

    public WXo(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 1);
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C14360o3.A0B(view, 1);
        if (this.A00) {
            return null;
        }
        WOC woc = new WOC(view, this, this.A01);
        view.getViewTreeObserver().addOnDrawListener(woc);
        return woc;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        ViewTreeObserver.OnDrawListener onDrawListener = (ViewTreeObserver.OnDrawListener) obj4;
        C14360o3.A0B(view, 1);
        if (onDrawListener != null) {
            AbstractC65702TsY.A13(view, onDrawListener);
        }
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC75733ae.A00(getClass());
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
