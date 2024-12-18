package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes5.dex */
public final class BX2 implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setAlpha(AbstractC166987dD.A09(obj2));
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setAlpha(1.0f);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return !C6AO.A00(obj, obj2);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC25228BEl.A1B(this);
    }
}
