package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.Collections;

/* renamed from: X.2zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66732zq extends AbstractC65632xz {
    public final InterfaceC64872wl A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final Integer A04;
    public final boolean A05;

    public C66732zq(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC64872wl interfaceC64872wl, Integer num, boolean z) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(interfaceC64872wl, 4);
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A00 = interfaceC64872wl;
        this.A04 = num;
        this.A05 = z;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-632907130);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        InterfaceC64872wl interfaceC64872wl = this.A00;
        InterfaceC99144cb interfaceC99144cb = (InterfaceC99144cb) obj;
        interfaceC64872wl.EDe(view, interfaceC99144cb);
        Context context = this.A01;
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        Object tag = view.getTag();
        C14360o3.A0C(tag, AbstractC111324zv.A00(1144));
        Integer num = this.A04;
        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.model.shopping.productfeed.ProductHscrollState");
        AbstractC41667Ibz.A01(context, interfaceC11380iw, userSession, interfaceC99144cb, (IJ0) obj2, interfaceC64872wl, (C38486Gw7) tag, num);
        C0f9.A0A(-14299394, A03);
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
        this.A00.F9g(view);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        InterfaceC99144cb interfaceC99144cb = (InterfaceC99144cb) obj;
        IJ0 ij0 = (IJ0) obj2;
        C14360o3.A0B(anonymousClass306, 0);
        C14360o3.A0B(interfaceC99144cb, 1);
        C14360o3.A0B(ij0, 2);
        anonymousClass306.A7a(0);
        InterfaceC64872wl interfaceC64872wl = this.A00;
        interfaceC64872wl.AA0(interfaceC99144cb, ij0.A01);
        for (ProductFeedItem productFeedItem : Collections.unmodifiableList(interfaceC99144cb.Bgy().A03)) {
            JPn Bh2 = interfaceC64872wl.Bh2();
            C14360o3.A0A(productFeedItem);
            Bh2.A9z(productFeedItem, interfaceC99144cb, ij0);
        }
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(2012063375);
        C14360o3.A0B(viewGroup, 1);
        View A00 = AbstractC41667Ibz.A00(this.A01, viewGroup, this.A05);
        C0f9.A0A(1694744703, A03);
        return A00;
    }
}
