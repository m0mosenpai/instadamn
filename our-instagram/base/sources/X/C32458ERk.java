package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.ERk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32458ERk extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C31535DtK A03;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32458ERk(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C31535DtK c31535DtK) {
        this.A02 = userSession;
        this.A00 = context;
        this.A03 = c31535DtK;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 1139975939);
        if (view.getTag() != null) {
            throw AbstractC166987dD.A15("getFollowUpsellDataType");
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-404988558, A0G);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -876291201);
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.row_follow_upsell, false);
        A0C.setTag(new FLS(A0C));
        C0f9.A0A(-403980384, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
