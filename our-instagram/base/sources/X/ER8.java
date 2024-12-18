package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class ER8 extends AbstractC65632xz {
    public final UserSession A00;
    public final C24042Ale A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ER8(UserSession userSession, C24042Ale c24042Ale) {
        this.A01 = c24042Ale;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-892578557);
        C14360o3.A0B(view, 1);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.CampfireRowViewBinder.Holder");
        C34580FLp c34580FLp = (C34580FLp) tag;
        C24042Ale c24042Ale = this.A01;
        UserSession userSession = this.A00;
        C14360o3.A0B(c34580FLp, 0);
        AbstractC167007dF.A1D(c24042Ale, 1, userSession);
        ViewOnClickListenerC35683FpI.A00(c34580FLp.A00, 26, c24042Ale, userSession);
        c34580FLp.A01.setImageResource(R.drawable.instagram_group_pano_filled_24);
        c34580FLp.A02.setText(2131954745);
        if (C3DL.A00(userSession) && AbstractC166987dD.A0x(userSession).getInt("group_stories_badging_seen_count", 0) < 1) {
            IgTextView igTextView = c34580FLp.A03;
            igTextView.setVisibility(0);
            Context A0L = AbstractC166997dE.A0L(igTextView);
            igTextView.setTypeface(AbstractC15960qq.A00(A0L).A02(EnumC15950qp.A0T));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(A0L.getResources().getDimensionPixelSize(R.dimen.button_text_size));
            gradientDrawable.setColor(AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_blue));
            igTextView.setBackground(gradientDrawable);
        }
        C0f9.A0A(1216041978, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -554025973);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.recipient_picker_share_to_destination_row, false);
        A0C.setTag(new C34580FLp(A0C));
        C0f9.A0A(-1152604204, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
