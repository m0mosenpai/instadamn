package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.EQu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32442EQu extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32442EQu(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 1617188504);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.user.userlist.adapter.CloseFriendsDisclaimerViewBinder.Holder");
        C34479FHr c34479FHr = (C34479FHr) tag;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.user.userlist.adapter.CloseFriendsDisclaimerBinderGroup.CloseFriendsDisclaimerModel");
        Context context = this.A00;
        AbstractC167007dF.A1D(c34479FHr, 0, context);
        TextView textView = c34479FHr.A00;
        textView.setVisibility(0);
        AbstractC31177DnL.A0r(context, textView, null, 2131955649);
        C0f9.A0A(-1004056315, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -384868780);
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.close_friends_disclaimer_row, false);
        A0C.setTag(new C34479FHr(A0C));
        C0f9.A0A(856033914, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
