package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ShoppingBrandWithProducts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66742zr extends AbstractC65632xz {
    public final InterfaceC65002wy A00;
    public final Context A01;
    public final InterfaceC11380iw A02;

    public C66742zr(Context context, InterfaceC11380iw interfaceC11380iw, InterfaceC65002wy interfaceC65002wy) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(interfaceC65002wy, 3);
        this.A01 = context;
        this.A02 = interfaceC11380iw;
        this.A00 = interfaceC65002wy;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(obj, 2);
        bindView(i, view, obj, obj2);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        C14360o3.A0B(view, 0);
        this.A00.F9d(view);
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        ImmutableList copyOf;
        C99134ca c99134ca;
        EnumC39580Hdq enumC39580Hdq;
        int A03 = C0f9.A03(-21808127);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        String str = null;
        if ((obj instanceof C99134ca) && (c99134ca = (C99134ca) obj) != null && (enumC39580Hdq = c99134ca.A02) != null) {
            str = enumC39580Hdq.toString();
        }
        InterfaceC65002wy interfaceC65002wy = this.A00;
        interfaceC65002wy.EDU(view, str);
        Context context = this.A01;
        Object tag = view.getTag();
        C14360o3.A0C(tag, AbstractC111324zv.A00(2796));
        C38503GwO c38503GwO = (C38503GwO) tag;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C99134ca c99134ca2 = (C99134ca) obj;
        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.shopping.widget.merchanthscroll.MerchantHscrollState");
        C41047IFq c41047IFq = (C41047IFq) obj2;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c38503GwO, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        C14360o3.A0B(c99134ca2, 4);
        C14360o3.A0B(c41047IFq, 5);
        List list = c99134ca2.A0B;
        if (list != null && (copyOf = ImmutableList.copyOf((Collection) list)) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = copyOf.iterator();
            while (it.hasNext()) {
                ShoppingBrandWithProducts shoppingBrandWithProducts = ((H5A) ((IEZ) it.next()).A01).A01;
                if (shoppingBrandWithProducts != null) {
                    arrayList.add(shoppingBrandWithProducts);
                }
            }
            AbstractC41365ISs.A01(context, new ViewOnClickListenerC41953Iik(c99134ca2, c41047IFq, interfaceC65002wy), interfaceC11380iw, c41047IFq, interfaceC65002wy, c38503GwO, c99134ca2.A01(), c99134ca2.A09, arrayList);
            C0f9.A0A(730832533, A03);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.IDT] */
    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        ImmutableList copyOf;
        ImmutableList copyOf2;
        C99134ca c99134ca = (C99134ca) obj;
        C41047IFq c41047IFq = (C41047IFq) obj2;
        C14360o3.A0B(anonymousClass306, 0);
        C14360o3.A0B(c99134ca, 1);
        C14360o3.A0B(c41047IFq, 2);
        List list = c99134ca.A0B;
        if (list != null && (copyOf = ImmutableList.copyOf((Collection) list)) != null && !copyOf.isEmpty()) {
            InterfaceC65002wy interfaceC65002wy = this.A00;
            ?? obj3 = new Object();
            obj3.A00 = c99134ca;
            interfaceC65002wy.A9Q(obj3, c41047IFq.A01);
            List list2 = c99134ca.A0B;
            if (list2 != null && (copyOf2 = ImmutableList.copyOf((Collection) list2)) != null) {
                Iterator<E> it = copyOf2.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    ShoppingBrandWithProducts shoppingBrandWithProducts = ((H5A) ((IEZ) next).A01).A01;
                    if (shoppingBrandWithProducts != null) {
                        interfaceC65002wy.A9P(shoppingBrandWithProducts.CDj(), i);
                        i = i2;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            anonymousClass306.A7a(0);
        }
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-350647471);
        C14360o3.A0B(viewGroup, 1);
        View A00 = AbstractC41365ISs.A00(this.A01, viewGroup);
        C0f9.A0A(1791470128, A03);
        return A00;
    }
}
