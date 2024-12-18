package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class ER9 extends AbstractC65632xz {
    public final UserSession A00;
    public final C24042Ale A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ER9(UserSession userSession, C24042Ale c24042Ale) {
        this.A00 = userSession;
        this.A01 = c24042Ale;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1428157294);
        C14360o3.A0B(view, 1);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.HallPassRowViewBinder.Holder");
        C34581FLq c34581FLq = (C34581FLq) tag;
        C24042Ale c24042Ale = this.A01;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.HallPassRowViewModel");
        C36182Fxw c36182Fxw = (C36182Fxw) obj;
        AbstractC25233BEq.A0v(1, c34581FLq, c24042Ale, c36182Fxw);
        View view2 = c34581FLq.A00;
        Context context = view2.getContext();
        ViewOnClickListenerC35679FpE.A01(view2, 43, c24042Ale);
        IgSimpleImageView igSimpleImageView = c34581FLq.A01;
        igSimpleImageView.setImageResource(R.drawable.instagram_group_pano_filled_24);
        C14360o3.A0A(context);
        C14360o3.A0B(context, 0);
        int[] iArr = new int[5];
        C50L.A03(context, null, iArr, R.style.GradientPatternStyle);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColors(iArr);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        igSimpleImageView.setBackground(gradientDrawable);
        AbstractC31173DnH.A11(context, igSimpleImageView, R.color.audio_bar_action_color_enabled);
        c34581FLq.A02.setText(2131963443);
        IgTextView igTextView = c34581FLq.A03;
        igTextView.setVisibility(0);
        igTextView.setText(AbstractC167017dG.A0k(context.getResources(), c36182Fxw.A00, R.plurals.hall_pass_count));
        C0f9.A0A(43488393, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1602202917);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.recipient_picker_hall_pass, false);
        A0C.setTag(new C34581FLq(A0C));
        C0f9.A0A(715147379, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
