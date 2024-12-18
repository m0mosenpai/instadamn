package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public abstract class FAW {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, C31991E3t c31991E3t, Long l, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, int i, boolean z, boolean z2, boolean z3) {
        String valueOf;
        C14360o3.A0B(interfaceC11380iw, 9);
        Context A05 = AbstractC31172DnG.A05(c31991E3t);
        if (imageUrl != null) {
            c31991E3t.A08.setUrl(imageUrl, interfaceC11380iw);
        }
        c31991E3t.A07.setText(str);
        IgTextView igTextView = c31991E3t.A06;
        String str3 = null;
        if (l != null) {
            str3 = AbstractC167007dF.A0f(A05, C23831Eq.A09(AbstractC166997dE.A0M(A05), l.longValue()), 2131974602);
        }
        igTextView.setText(str3);
        c31991E3t.A03.setText(str2);
        IgTextView igTextView2 = c31991E3t.A05;
        ViewOnClickListenerC31723DwS.A01(igTextView2, 64, interfaceC16820sZ);
        C1QI.A0H(igTextView2, igTextView2);
        View view = c31991E3t.A02;
        ViewOnClickListenerC31723DwS.A01(view, 65, interfaceC16820sZ3);
        ViewOnClickListenerC31723DwS.A01(c31991E3t.A00, 66, interfaceC16820sZ4);
        if (z) {
            View view2 = c31991E3t.A01;
            Resources resources = view2.getResources();
            AbstractC13880nE.A0V(view2, resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
            AbstractC13880nE.A0V(view, 0);
            view2.setVisibility(0);
            ViewOnClickListenerC31723DwS.A01(view2, 67, interfaceC16820sZ2);
            view2.setSelected(z2);
            if (z3) {
                AbstractC13880nE.A0U(view2, 0);
                if (i > 99) {
                    valueOf = A05.getString(2131974594);
                } else {
                    valueOf = String.valueOf(i);
                }
                C14360o3.A0A(valueOf);
                IgTextView igTextView3 = c31991E3t.A04;
                igTextView3.setVisibility(0);
                igTextView3.setText(valueOf);
                ViewOnClickListenerC31723DwS.A01(igTextView3, 68, interfaceC16820sZ2);
                return;
            }
            AbstractC13880nE.A0U(view2, resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
            c31991E3t.A04.setVisibility(8);
        }
    }
}
