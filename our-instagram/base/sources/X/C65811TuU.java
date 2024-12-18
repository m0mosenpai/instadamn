package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.TuU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65811TuU implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C65822Tuf c65822Tuf = (C65822Tuf) obj2;
        if (c65822Tuf.A01 > 0) {
            if (c65822Tuf.A0C.A00 == 1) {
                view.setVerticalFadingEdgeEnabled(true);
            } else {
                view.setHorizontalFadingEdgeEnabled(true);
            }
            view.setFadingEdgeLength(c65822Tuf.A01);
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return MSY.A1S(((C65822Tuf) obj).A01, ((C65822Tuf) obj2).A01);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        view.setVerticalFadingEdgeEnabled(false);
        view.setHorizontalFadingEdgeEnabled(false);
        view.setFadingEdgeLength(0);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC75733ae.A00(getClass());
    }
}
