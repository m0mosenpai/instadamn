package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.facebook.R;

/* renamed from: X.Kme, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46783Kme {
    public static final void A00(ViewGroup viewGroup, C57012jc c57012jc, InterfaceC50464MPs interfaceC50464MPs, C31228DoB c31228DoB, boolean z) {
        AbstractC167017dG.A1Q(c57012jc, c31228DoB);
        c57012jc.A03(0);
        View A01 = c57012jc.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type android.widget.CheckBox");
        CompoundButton compoundButton = (CompoundButton) A01;
        C0fQ.A00(new LPL(2, compoundButton, interfaceC50464MPs, c31228DoB, z), viewGroup);
        Context context = viewGroup.getContext();
        Drawable drawable = context.getDrawable(R.drawable.checkbox);
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
        if (drawable2 != null) {
            Drawable mutate = drawable2.mutate();
            C14360o3.A07(mutate);
            AbstractC25231BEo.A0x(context, mutate, R.color.badge_color);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_checked}, mutate);
            stateListDrawable.addState(new int[0], drawable);
            compoundButton.setBackground(stateListDrawable);
            compoundButton.setChecked(interfaceC50464MPs.Cch(c31228DoB.A04));
            compoundButton.setVisibility(0);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
