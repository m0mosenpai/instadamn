package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.TuX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65814TuX implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        AbstractC61802rh abstractC61802rh = ((C65822Tuf) obj2).A06;
        if (abstractC61802rh != null) {
            abstractC61802rh.A07(recyclerView);
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return !C2I7.A00(((C65822Tuf) obj).A06, ((C65822Tuf) obj2).A06);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC61802rh abstractC61802rh = ((C65822Tuf) obj2).A06;
        if (abstractC61802rh != null) {
            abstractC61802rh.A07(null);
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
