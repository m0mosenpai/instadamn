package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JXb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43762JXb {
    public static final void A00(ViewGroup viewGroup, UserSession userSession, List list, int i, int i2) {
        TextView textView;
        Drawable drawable;
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        AbstractC23021Ah.A00(userSession);
        int i3 = 0;
        for (Object obj : AbstractC001800i.A0d(list, i2)) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C206419By c206419By = (C206419By) obj;
            if (i3 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i3);
                C14360o3.A0C(childAt, "null cannot be cast to non-null type android.widget.TextView");
                textView = (TextView) childAt;
            } else {
                Object obj2 = c206419By.A01;
                if (obj2 != C05F.A0Y && obj2 != C05F.A1F && obj2 != C05F.A0j && obj2 != C05F.A0u && obj2 != C05F.A15 && obj2 != C05F.A02 && obj2 != C05F.A03 && obj2 != C05F.A04 && obj2 != C05F.A05 && obj2 != C05F.A06) {
                    View inflate = from.inflate(i, viewGroup, false);
                    C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
                    textView = (TextView) inflate;
                } else {
                    View inflate2 = from.inflate(R.layout.direct_thread_tas_label, viewGroup, false);
                    C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.TextView");
                    textView = (TextView) inflate2;
                    Integer A00 = AbstractC46785Kmg.A00((Integer) c206419By.A01);
                    if (A00 != null) {
                        AbstractC31177DnL.A0q(context, textView, A00.intValue());
                    }
                    Object obj3 = c206419By.A01;
                    if ((obj3 == C05F.A05 || obj3 == C05F.A06) && (drawable = context.getDrawable(R.drawable.instagram_atom_pano_outline_12)) != null) {
                        Integer A002 = AbstractC46785Kmg.A00((Integer) c206419By.A01);
                        if (A002 != null) {
                            int intValue = A002.intValue();
                            AbstractC25231BEo.A0x(context, drawable, AbstractC53242c7.A0H(context, intValue));
                            ColorStateList valueOf = ColorStateList.valueOf(intValue);
                            textView.getClass();
                            textView.setCompoundDrawableTintList(valueOf);
                        }
                        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelOffset(R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
                    }
                }
                viewGroup.addView(textView);
            }
            textView.setText(c206419By.A02);
            i3 = i4;
        }
        if (viewGroup.getChildCount() > i2) {
            viewGroup.removeViews(i2, viewGroup.getChildCount() - i2);
        }
    }

    public static final void A01(UserSession userSession, InterfaceC56392iX interfaceC56392iX, List list) {
        boolean z;
        boolean A1Y = AbstractC25229BEm.A1Y(interfaceC56392iX);
        if (!interfaceC56392iX.CWW() && C18U.A06(AbstractC25225BEi.A0j(userSession, A1Y ? 1 : 0), userSession, 36328332333235667L)) {
            z = true;
            if (list == null || list.isEmpty()) {
                return;
            }
        } else {
            z = false;
        }
        ViewGroup viewGroup = (ViewGroup) interfaceC56392iX.getView();
        if (viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
        if (!z && (list == null || list.isEmpty())) {
            return;
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        interfaceC56392iX.setVisibility(A1Y ? 1 : 0);
        if (list != null) {
            A00(viewGroup, userSession, list, R.layout.direct_thread_label, 2);
            int size = list.size() - viewGroup.getChildCount();
            if (size <= 0) {
                return;
            }
            TextView textView = (TextView) viewGroup.findViewWithTag("tag_extra_label_view");
            if (textView == null) {
                View inflate = from.inflate(R.layout.direct_thread_label, viewGroup, A1Y);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
                textView = (TextView) inflate;
                textView.setTag("tag_extra_label_view");
                viewGroup.addView(textView);
            }
            String A0t = AbstractC43594JPz.A0t(context.getResources(), size, 2131959634);
            C14360o3.A07(A0t);
            textView.setText(A0t);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
