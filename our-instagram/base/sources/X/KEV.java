package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KEV extends AbstractC65632xz {
    public final UserSession A00;
    public final C24042Ale A01;
    public final C8DP A02;
    public final C195918ld A03;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public KEV(UserSession userSession, C24042Ale c24042Ale, C8DP c8dp, C195918ld c195918ld) {
        this.A00 = userSession;
        this.A03 = c195918ld;
        this.A02 = c8dp;
        this.A01 = c24042Ale;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        View.OnClickListener viewOnClickListenerC55457OkB;
        int A0G = AbstractC25231BEo.A0G(view, -2005509291);
        C14360o3.A0B(obj, 2);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.CloseFriendsStoryRowViewBinder.Holder");
        L3G l3g = (L3G) tag;
        UserSession userSession = this.A00;
        LZR lzr = (LZR) obj;
        this.A02.A00();
        C24042Ale c24042Ale = this.A01;
        AbstractC167017dG.A1N(l3g, userSession);
        AbstractC167007dF.A1F(lzr, 2, c24042Ale);
        boolean z = lzr.A01;
        View view2 = l3g.A00;
        if (z) {
            viewOnClickListenerC55457OkB = new ViewOnClickListenerC48066LPr(36, c24042Ale, lzr);
        } else {
            viewOnClickListenerC55457OkB = new ViewOnClickListenerC55457OkB(c24042Ale, 18);
        }
        C0fQ.A00(viewOnClickListenerC55457OkB, view2);
        l3g.A02.setChecked(z);
        int A00 = AbstractC34041F0u.A00(userSession);
        TextView textView = l3g.A01;
        if (A00 > 0) {
            textView.setText(AbstractC167017dG.A0k(view2.getResources(), A00, R.plurals.recipient_picker_close_friends_count));
        } else {
            textView.setText(2131969959);
        }
        ViewOnClickListenerC48066LPr.A00(textView, 37, c24042Ale, lzr);
        C0f9.A0A(721609867, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1697673870);
        Context context = viewGroup.getContext();
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_add_to_favorites_story, false);
        C14360o3.A07(context);
        A0C.setTag(new L3G(A0C, context));
        C0f9.A0A(1490891376, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
