package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes11.dex */
public final class WXl implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Ut4 ut4 = (Ut4) obj2;
        AbstractC167017dG.A1P(viewGroup, ut4);
        Object A06 = AnonymousClass634.A06(ut4.A01, ut4.A02);
        A06.getClass();
        View childAt = viewGroup.getChildAt(0);
        C14360o3.A0C(childAt, AbstractC111324zv.A00(241));
        ((IgdsInlineSearchBox) childAt).A0E.setText(((C70692WfE) A06).A03);
        return null;
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

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
