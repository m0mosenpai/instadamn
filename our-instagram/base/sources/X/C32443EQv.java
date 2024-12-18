package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.EQv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32443EQv extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32443EQv(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 1655120038);
        E18 e18 = (E18) view.getTag();
        if (e18 != null) {
            e18.A00.setVisibility(8);
            throw AbstractC166987dD.A15("getOnClickListener");
        }
        C0f9.A0A(-1932112815, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1409949549);
        View view = AbstractC34328FBw.A00(this.A00, viewGroup).itemView;
        C14360o3.A07(view);
        C0f9.A0A(-1226573545, A0G);
        return view;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
