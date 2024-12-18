package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.api.schemas.ShoppingBrandWithProductsImpl;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class HFM extends AbstractC65632xz {
    public final InterfaceC65002wy A00;
    public final Context A01;
    public final InterfaceC11380iw A02;

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        int A03 = C0f9.A03(-82548485);
        AbstractC167027dH.A13(view, obj, obj2);
        if (obj instanceof C99134ca) {
            str = ((C99134ca) obj).A02.toString();
        } else {
            str = null;
        }
        InterfaceC65002wy interfaceC65002wy = this.A00;
        interfaceC65002wy.EDU(view, str);
        C38901HAy c38901HAy = (C38901HAy) obj;
        Context context = this.A01;
        Object tag = view.getTag();
        C14360o3.A0C(tag, AbstractC111324zv.A00(2796));
        C41047IFq c41047IFq = (C41047IFq) obj2;
        AbstractC41365ISs.A01(context, null, this.A02, c41047IFq, interfaceC65002wy, (C38503GwO) tag, null, c38901HAy.A00, AbstractC31172DnG.A19(c38901HAy.A01));
        C0f9.A0A(237713747, A03);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        C14360o3.A0B(view, 0);
        this.A00.F9d(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.IDT] */
    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C38901HAy c38901HAy = (C38901HAy) obj;
        C41047IFq c41047IFq = (C41047IFq) obj2;
        C14360o3.A0B(anonymousClass306, 0);
        AbstractC167017dG.A1P(c38901HAy, c41047IFq);
        InterfaceC65002wy interfaceC65002wy = this.A00;
        interfaceC65002wy.A9Q(new Object(), c41047IFq.A01);
        Iterator A0i = AbstractC31177DnL.A0i(c38901HAy.A01);
        int i = 0;
        while (A0i.hasNext()) {
            Object next = A0i.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            interfaceC65002wy.A9P(((ShoppingBrandWithProductsImpl) next).A00, i);
            i = i2;
        }
        anonymousClass306.A7a(0);
    }

    public HFM(Context context, InterfaceC11380iw interfaceC11380iw, InterfaceC65002wy interfaceC65002wy) {
        this.A01 = context;
        this.A02 = interfaceC11380iw;
        this.A00 = interfaceC65002wy;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1483291556);
        View A00 = AbstractC41365ISs.A00(this.A01, viewGroup);
        C0f9.A0A(640420358, A0G);
        return A00;
    }
}
