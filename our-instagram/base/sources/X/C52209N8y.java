package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.N8y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52209N8y extends AbstractC65632xz {
    public final UserSession A00;
    public final C24042Ale A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C52209N8y(UserSession userSession, C24042Ale c24042Ale) {
        this.A00 = userSession;
        this.A01 = c24042Ale;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1280613626);
        C14360o3.A0B(view, 1);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.ShareToMyWeekRowViewBinder.Holder");
        C54669OCv c54669OCv = (C54669OCv) tag;
        C24042Ale c24042Ale = this.A01;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.ShareToMyWeekRowViewModel");
        Ov9 ov9 = (Ov9) obj;
        AbstractC25233BEq.A0v(1, c54669OCv, c24042Ale, ov9);
        View view2 = c54669OCv.A00;
        Context context = view2.getContext();
        ViewOnClickListenerC55464OkJ.A01(view2, 34, ov9, c24042Ale);
        IgSimpleImageView igSimpleImageView = c54669OCv.A01;
        igSimpleImageView.setImageResource(R.drawable.instagram_my_week_story_pano_outline_24);
        AbstractC31173DnH.A11(context, igSimpleImageView, R.color.audio_bar_action_color_enabled);
        igSimpleImageView.setBackground(new C50741Mav(context, 0.0f, true, true));
        AbstractC166987dD.A1P(context, c54669OCv.A03, 2131971577);
        IgTextView igTextView = c54669OCv.A02;
        igTextView.setVisibility(0);
        int i2 = 2131971576;
        if (ov9.A01) {
            i2 = 2131971578;
        }
        AbstractC166987dD.A1P(context, igTextView, i2);
        c54669OCv.A04.setChecked(ov9.A00);
        C0f9.A0A(601010418, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1079250667);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.recipient_picker_radio_selection, false);
        A0C.setTag(new C54669OCv(A0C));
        C0f9.A0A(826350503, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
