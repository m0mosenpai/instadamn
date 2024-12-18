package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.NEp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52351NEp extends AbstractC66412zI {
    public final Context A00;
    public final UserSession A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View A0D = AbstractC25227BEk.A0D(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.row_iglive_post_live_action, false);
        Object A0Q = AbstractC37303Gc4.A0Q(A0D, new C51343Mm4(A0D));
        if (A0Q instanceof C51343Mm4) {
            return (C3OO) A0Q;
        }
        return null;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        CircularImageView circularImageView;
        int A08;
        C56117Ovc c56117Ovc = (C56117Ovc) interfaceC66482zP;
        C51343Mm4 c51343Mm4 = (C51343Mm4) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c56117Ovc, c51343Mm4);
        Context context = this.A00;
        UserSession userSession = this.A01;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, A1R ? 1 : 0);
        IgTextView igTextView = c51343Mm4.A03;
        String str = c56117Ovc.A06;
        Object obj = str;
        if (str == null) {
            obj = c56117Ovc.A00;
        }
        AbstractC31171DnF.A15(igTextView, obj);
        Typeface typeface = c56117Ovc.A01;
        if (typeface != null) {
            igTextView.setTypeface(typeface);
        }
        View view = c51343Mm4.A00;
        view.setContentDescription(str);
        if (c56117Ovc.A09) {
            circularImageView = c51343Mm4.A04;
            Drawable mutate = c56117Ovc.A03.mutate();
            if (c56117Ovc.A08) {
                A08 = R.color.igds_error_or_destructive;
            } else {
                A08 = AbstractC53242c7.A08(context);
            }
            AbstractC25231BEo.A0x(context, mutate, A08);
            circularImageView.setImageDrawable(mutate);
            circularImageView.A0H(A1R ? 1 : 0, AbstractC53242c7.A08(context));
        } else {
            circularImageView = c51343Mm4.A04;
            circularImageView.setImageDrawable(c56117Ovc.A03);
        }
        Drawable drawable = c56117Ovc.A02;
        if (drawable != null) {
            ImageView imageView = c51343Mm4.A01;
            Drawable mutate2 = drawable.mutate();
            AbstractC25231BEo.A0x(context, mutate2, AbstractC53242c7.A0B(context));
            imageView.setImageDrawable(mutate2);
            imageView.setVisibility(0);
        }
        igTextView.setAlpha(1.0f);
        circularImageView.setAlpha(1.0f);
        IgTextView igTextView2 = c51343Mm4.A02;
        if (igTextView2.isEnabled()) {
            CharSequence charSequence = c56117Ovc.A05;
            if (charSequence != null) {
                igTextView2.setVisibility(0);
            } else {
                charSequence = null;
            }
            igTextView2.setText(charSequence);
        } else {
            AbstractC31173DnH.A12(context, igTextView2, 2131969816);
            igTextView2.setVisibility(0);
        }
        if (c56117Ovc.A07) {
            IgdsSwitch igdsSwitch = c51343Mm4.A05;
            igdsSwitch.setVisibility(0);
            igdsSwitch.A07 = new P3U(5, context, userSession, c51343Mm4);
        }
        C0fQ.A00(c56117Ovc.A04, view);
        AbstractC56952jT.A01(view);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56117Ovc.class;
    }

    public C52351NEp(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public static C66392zG A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new C52351NEp(context, userSession));
        A00.A01(new NEZ(context, userSession));
        A00.A01(new C52337NEb(context, interfaceC11380iw));
        A00.A01(new EXQ(context, interfaceC11380iw));
        return A00;
    }
}
