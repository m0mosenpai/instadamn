package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.ERv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32469ERv extends AbstractC65632xz {
    public final Context A00;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "Simple_Banner";
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32469ERv(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1765681892);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.unconnectedcontent.SimpleBannerViewBinder.Holder");
        C34559FKt c34559FKt = (C34559FKt) tag;
        G7N g7n = (G7N) obj;
        AbstractC167017dG.A1N(c34559FKt, g7n);
        c34559FKt.A02.setText(((E87) g7n.A00).A01);
        C0f9.A0A(-1873947700, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -527792744);
        int A03 = C0f9.A03(1769806548);
        View inflate = AbstractC31172DnG.A09(this.A00).inflate(R.layout.layout_simple_banner, viewGroup, false);
        inflate.setTag(new C34559FKt(AbstractC166987dD.A0c(inflate, R.id.top_divider), AbstractC166987dD.A0c(inflate, R.id.bottom_divider), AbstractC25230BEn.A0Q(inflate, R.id.title)));
        C0f9.A0A(1577885613, A03);
        C0f9.A0A(617309008, A0G);
        return inflate;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
