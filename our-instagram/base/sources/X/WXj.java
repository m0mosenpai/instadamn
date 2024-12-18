package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class WXj implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C14360o3.A0B(recyclerView, 1);
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if ((abstractC70663Fe instanceof GridLayoutManager) && (obj3 instanceof Ut5)) {
            ((GridLayoutManager) abstractC70663Fe).A01 = new JnN(AbstractC001800i.A0a(((Ut5) obj3).A00), 0);
        }
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj3 != null) {
            Ut5 ut5 = (Ut5) obj3;
            if (obj4 != null) {
                return !C14360o3.A0K(ut5.A00, ((Ut5) obj4).A00);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
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
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
