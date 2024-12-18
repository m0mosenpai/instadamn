package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Cq9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28958Cq9 implements InterfaceC77833eB {
    public static final C28958Cq9 A00 = new Object();

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        CSG csg = (CSG) obj2;
        AbstractC167017dG.A1P(view, csg);
        csg.A00.EDq(view, csg.A01.ordinal(), csg.A02.A01, csg.A03);
        return C0eB.A00;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        CSG csg = (CSG) obj;
        CSG csg2 = (CSG) obj2;
        AbstractC167017dG.A1N(csg, csg2);
        return AbstractC25225BEi.A1a(csg.A03.A01.A0G, csg2.A03.A01.A0G);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        CSG csg = (CSG) obj2;
        AbstractC167017dG.A1P(view, csg);
        csg.A00.F9l(view);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC25228BEl.A1B(this);
    }
}
