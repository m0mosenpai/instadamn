package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* loaded from: classes9.dex */
public final class NAY extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new IgdsMediaButton(context, null, 0);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        EnumC151036r4 enumC151036r4;
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view;
        C14360o3.A0B(igdsMediaButton, 0);
        AbstractC167017dG.A1P(c6fg, c102884kP);
        String A0L = c102884kP.A0L(44);
        if (A0L != null) {
            int hashCode = A0L.hashCode();
            if (hashCode != -1407516662) {
                if (hashCode != -817598092) {
                    if (hashCode == -314765822 && A0L.equals("primary")) {
                        enumC151036r4 = EnumC151036r4.A0D;
                        igdsMediaButton.setButtonStyle(enumC151036r4);
                    }
                } else if (A0L.equals("secondary")) {
                    enumC151036r4 = EnumC151036r4.A0F;
                    igdsMediaButton.setButtonStyle(enumC151036r4);
                }
            } else if (A0L.equals("secondary_on_black")) {
                enumC151036r4 = EnumC151036r4.A0G;
                igdsMediaButton.setButtonStyle(enumC151036r4);
            }
        }
        if (c102884kP.A0S(35, false)) {
            igdsMediaButton.setButtonStyle(EnumC151036r4.A0E);
        }
        igdsMediaButton.setEnabled(!c102884kP.A0S(36, false));
        AbstractC53657No4.A00(c6fg.A00, c102884kP, igdsMediaButton);
        igdsMediaButton.setLabel(c102884kP.A0K());
        InterfaceC103384lE A0B = c102884kP.A0B(41);
        if (A0B != null) {
            ViewOnClickListenerC55459OkE.A01(igdsMediaButton, c6fg, c102884kP, A0B, 0);
            return null;
        }
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view;
        C14360o3.A0B(igdsMediaButton, 0);
        igdsMediaButton.setOnClickListener(null);
        igdsMediaButton.setLabel(null);
        TextView textView = igdsMediaButton.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getCompoundDrawablesRelative()[0], (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setGravity(17);
        IgdsMediaButton.A01(igdsMediaButton);
        igdsMediaButton.A05();
        igdsMediaButton.setButtonStyle(EnumC151036r4.A0D);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public NAY(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
