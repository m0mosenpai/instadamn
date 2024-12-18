package X;

import android.view.View;

/* renamed from: X.4EN, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4EN extends C03E implements InterfaceC16570sA {
    public C4EN(Object obj) {
        super(6, obj, C4EM.class, "createViewTarget", "createViewTarget(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;Lcom/meta/analytics/gnv/vista/intf/VistaCallback;Lcom/meta/analytics/gnv/vista/core/VistaViewContext;Landroidx/lifecycle/LifecycleOwner;)Lcom/meta/analytics/gnv/vista/core/VistaViewTarget;", 0);
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        View view = (View) obj;
        String str = (String) obj2;
        InterfaceC58009Pnt interfaceC58009Pnt = (InterfaceC58009Pnt) obj4;
        C27904CRp c27904CRp = (C27904CRp) obj5;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(interfaceC58009Pnt, 3);
        C14360o3.A0B(c27904CRp, 4);
        return new C28187Cba(view, (C07X) obj6, c27904CRp, interfaceC58009Pnt, obj3, str);
    }
}
