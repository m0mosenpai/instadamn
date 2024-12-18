package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes11.dex */
public final class WXq implements InterfaceC77833eB {
    public static final void A00(U44 u44, Ut4 ut4, String str) {
        C6FG c6fg = ut4.A01;
        C102884kP c102884kP = ut4.A02;
        Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
        A06.getClass();
        ((C70692WfE) A06).A03 = str;
        Ut4.A06.A00(u44, ut4);
        InterfaceC103384lE interfaceC103384lE = ut4.A03;
        if (interfaceC103384lE != null) {
            AbstractC58322PtE.A1M(c6fg, c102884kP, AbstractC31179DnN.A0I(ut4), interfaceC103384lE, str);
        }
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj;
        AbstractC167017dG.A1P(viewGroup, obj2);
        View childAt = viewGroup.getChildAt(0);
        C14360o3.A0C(childAt, AbstractC111324zv.A00(241));
        ((IgdsInlineSearchBox) childAt).A02 = new C70944Wkq(1, this, obj3, obj2);
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ViewGroup viewGroup = (ViewGroup) obj;
        C14360o3.A0B(viewGroup, 1);
        View childAt = viewGroup.getChildAt(0);
        C14360o3.A0C(childAt, AbstractC111324zv.A00(241));
        ((IgdsInlineSearchBox) childAt).A02 = null;
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
        return true;
    }
}
