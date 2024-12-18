package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.V2u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67930V2u extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C67930V2u(Context context, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1861433085);
        AbstractC167017dG.A1P(view, obj);
        Context context = this.A00;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.adtools.binder.HighlightsHubImageTextArrowViewBinder.Holder");
        AbstractC69894VxL.A01(context, (UJO) tag, (WeH) obj, this.A01);
        C0f9.A0A(-180251906, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -332907975);
        ViewGroup A00 = AbstractC69894VxL.A00(this.A00, viewGroup);
        C0f9.A0A(2136086873, A0G);
        return A00;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
