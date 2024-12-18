package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TuZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65816TuZ implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((C65822Tuf) obj2).A08;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                recyclerView.A10((AbstractC70653Fc) it.next());
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return !C2I7.A00(((C65822Tuf) obj).A08, ((C65822Tuf) obj2).A08);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((C65822Tuf) obj2).A08;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                recyclerView.A11((AbstractC70653Fc) it.next());
            }
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
}
