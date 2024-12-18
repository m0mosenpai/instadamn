package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.R;
import com.instagram.common.ui.base.IgCheckBox;

/* loaded from: classes6.dex */
public final class EV6 extends AbstractC65806TuP {
    public final /* synthetic */ C6FG A00;

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        IgCheckBox igCheckBox = new IgCheckBox(context);
        AbstractC31173DnH.A0z(this.A00.A00, igCheckBox, R.drawable.bridged_checkbox_selector);
        igCheckBox.setButtonDrawable((Drawable) null);
        igCheckBox.setGravity(17);
        igCheckBox.setClickable(false);
        igCheckBox.setFocusable(false);
        igCheckBox.setFocusableInTouchMode(false);
        return igCheckBox;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EV6(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
        this.A00 = c6fg;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        CompoundButton compoundButton = (CompoundButton) view;
        AbstractC167007dF.A1D(compoundButton, 0, c102884kP);
        boolean A0S = c102884kP.A0S(36, false);
        boolean A0S2 = c102884kP.A0S(35, false);
        compoundButton.setEnabled(!A0S);
        compoundButton.setChecked(A0S2);
        if (!A0S2) {
            compoundButton.setAlpha(AbstractC31175DnJ.A00(A0S ? 1 : 0));
            Drawable background = compoundButton.getBackground();
            int i = 255;
            if (A0S) {
                i = 77;
            }
            background.setAlpha(i);
            return null;
        }
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
    }
}
