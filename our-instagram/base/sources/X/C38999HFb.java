package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.HFb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38999HFb extends AbstractC65632xz implements InterfaceC65652y1 {
    public InterfaceC686036x A00;
    public final C65672y3 A01;
    public final UserSession A02;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        boolean z = obj instanceof C40971v4;
        C65672y3 c65672y3 = this.A01;
        if (z) {
            obj = C3XH.A01(((C40971v4) obj).A0K);
        }
        return c65672y3.getIdentifier(i, obj, obj2);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        boolean z = obj instanceof C40971v4;
        C65672y3 c65672y3 = this.A01;
        if (z) {
            obj = C3XH.A01(((C40971v4) obj).A0K);
        }
        return c65672y3.getViewModelHash(i, obj, obj2);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C40971v4 c40971v4 = (C40971v4) obj;
        C75113Zb c75113Zb = (C75113Zb) obj2;
        AbstractC167027dH.A12(anonymousClass306, c40971v4, c75113Zb);
        InterfaceC686036x interfaceC686036x = this.A00;
        if (interfaceC686036x == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        interfaceC686036x.BS6().E5o(c75113Zb, c40971v4);
        this.A01.buildRowViewTypes(anonymousClass306, C3XH.A01(c40971v4.A0K), c75113Zb);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return C65672y3.A0b;
    }

    public C38999HFb(UserSession userSession, C65672y3 c65672y3) {
        this.A02 = userSession;
        this.A01 = c65672y3;
    }

    @Override // X.InterfaceC65652y1
    public final void AHY(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1P(c38321qM, c75113Zb);
        this.A01.AHY(c38321qM, c75113Zb, i);
    }

    @Override // X.InterfaceC65652y1
    public final void E5V(C38321qM c38321qM, C75113Zb c75113Zb, Integer num, int i) {
        AbstractC167027dH.A13(c38321qM, c75113Zb, num);
        this.A01.E5V(c38321qM, c75113Zb, num, i);
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C65672y3 c65672y3;
        int A03 = C0f9.A03(-776065386);
        AbstractC167027dH.A13(view, obj, obj2);
        if (obj instanceof C40971v4) {
            C40971v4 c40971v4 = (C40971v4) obj;
            AbstractC41561w6.A00(this.A02).A01(c40971v4);
            c65672y3 = this.A01;
            obj = C3XH.A01(c40971v4.A0K);
        } else {
            c65672y3 = this.A01;
        }
        c65672y3.bindView(i, view, obj, obj2);
        C0f9.A0A(-369051828, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1158352407);
        View createView = this.A01.createView(i, viewGroup);
        C0f9.A0A(964187140, A0G);
        return createView;
    }

    public C38999HFb() {
    }
}
