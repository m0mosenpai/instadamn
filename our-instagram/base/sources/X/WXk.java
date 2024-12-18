package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class WXk implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Ut4 ut4 = (Ut4) obj2;
        AbstractC167017dG.A1P(viewGroup, ut4);
        View childAt = viewGroup.getChildAt(1);
        C14360o3.A0C(childAt, AbstractC111324zv.A00(9));
        RecyclerView recyclerView = (RecyclerView) childAt;
        recyclerView.setAdapter(ut4.A00);
        Object A06 = AnonymousClass634.A06(ut4.A01, ut4.A02);
        A06.getClass();
        Parcelable parcelable = ((C70692WfE) A06).A00;
        if (parcelable != null) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if (abstractC70663Fe != null) {
                abstractC70663Fe.A1P(parcelable);
                return null;
            }
            throw new IllegalStateException("LayoutManager for the RecyclerView was null by the time the SaveInstanceState binder was invoked");
        }
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC167017dG.A1N((Ut4) obj, (Ut4) obj2);
        return !C14360o3.A0K(r3.A00, r4.A00);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Ut4 ut4 = (Ut4) obj2;
        AbstractC167017dG.A1P(viewGroup, ut4);
        View childAt = viewGroup.getChildAt(1);
        C14360o3.A0C(childAt, AbstractC111324zv.A00(9));
        RecyclerView recyclerView = (RecyclerView) childAt;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe != null) {
            Object A06 = AnonymousClass634.A06(ut4.A01, ut4.A02);
            A06.getClass();
            ((C70692WfE) A06).A00 = abstractC70663Fe.A1M();
            recyclerView.setAdapter(null);
            return;
        }
        throw new IllegalStateException("LayoutManager for the RecyclerView was null by the time the SaveInstanceState binder was invoked");
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
