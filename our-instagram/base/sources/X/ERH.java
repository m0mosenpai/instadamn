package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.nux.cal.model.FxAccountInfo;

/* loaded from: classes6.dex */
public final class ERH extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERH(Context context, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1784195350);
        AbstractC167017dG.A1P(view, obj);
        Context context = this.A00;
        Object tag = view.getTag();
        if (tag != null) {
            FWJ.A01(context, this.A01, (C33614EtQ) tag, (FxAccountInfo) obj);
            C0f9.A0A(1158173990, A03);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0A(1181593000, A03);
            throw A0g;
        }
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1700252621);
        ViewGroup A00 = FWJ.A00(this.A00, viewGroup);
        C0f9.A0A(1084354934, A0G);
        return A00;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31180DnO.A1S(anonymousClass306);
    }
}
