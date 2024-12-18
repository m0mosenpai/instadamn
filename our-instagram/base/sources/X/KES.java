package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KES extends AbstractC65632xz {
    public final UserSession A00;
    public final C24042Ale A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public KES(UserSession userSession, C24042Ale c24042Ale) {
        this.A00 = userSession;
        this.A01 = c24042Ale;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        View.OnClickListener viewOnClickListenerC55457OkB;
        int i2;
        Integer C3U;
        int A03 = C0f9.A03(905925249);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.ExclusiveStoryRowViewBinder.Holder");
        L2W l2w = (L2W) tag;
        UserSession userSession = this.A00;
        boolean A1a = AbstractC166987dD.A1a(obj);
        C24042Ale c24042Ale = this.A01;
        AbstractC167017dG.A1N(l2w, userSession);
        C14360o3.A0B(c24042Ale, 3);
        View view2 = l2w.A00;
        if (A1a) {
            viewOnClickListenerC55457OkB = new ViewOnClickListenerC48063LPo(c24042Ale, 29);
        } else {
            viewOnClickListenerC55457OkB = new ViewOnClickListenerC55457OkB(c24042Ale, 19);
        }
        C0fQ.A00(viewOnClickListenerC55457OkB, view2);
        l2w.A02.setChecked(A1a);
        FanClubInfoDict B4O = AbstractC166997dE.A0Y(userSession).A03.B4O();
        if (B4O != null && (C3U = B4O.C3U()) != null) {
            i2 = C3U.intValue();
        } else {
            i2 = 0;
        }
        TextView textView = l2w.A01;
        textView.setText(AbstractC167017dG.A0k(view2.getResources(), i2, R.plurals.recipient_picker_close_friends_count));
        ViewOnClickListenerC48063LPo.A00(textView, 30, c24042Ale);
        C0f9.A0A(2084004665, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -663297013);
        Context context = viewGroup.getContext();
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_add_to_exclusive_story, false);
        C14360o3.A07(context);
        A0C.setTag(new L2W(A0C, context));
        C0f9.A0A(-9977307, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
