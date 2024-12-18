package X;

import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.Fpq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC35716Fpq implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewTreeObserverOnGlobalLayoutListenerC35716Fpq(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        AbstractC12990ll abstractC12990ll;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                View view = (View) this.A02;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams = null;
                    }
                    int height = ((View) this.A01).getHeight();
                    if (marginLayoutParams != null) {
                        i = marginLayoutParams.bottomMargin;
                    } else {
                        i = 0;
                    }
                    view.setPadding(0, 0, 0, height - i);
                }
                AbstractC166997dE.A1K((View) this.A01, this);
                return;
            case 1:
                View view2 = (View) this.A01;
                view2.postDelayed(new GPO(view2, this, (C32328ELw) this.A02), 200L);
                return;
            case 2:
                IgTextView igTextView = ((C31964E2s) this.A01).A02;
                boolean A0U = ((DirectShareTarget) this.A02).A0U();
                Layout layout = igTextView.getLayout();
                if (layout == null) {
                    return;
                }
                CharSequence text = layout.getText();
                C14360o3.A07(text);
                List A0R = AbstractC001900j.A0R(text, new String[]{" "}, 0);
                if (A0R.size() <= 1 || ((CharSequence) A0R.get(AbstractC31172DnG.A03(A0R, 1))).length() <= 0 || AbstractC25226BEj.A1I(A0R, AbstractC31172DnG.A03(A0R, 1)).charAt(0) != 8230) {
                    return;
                }
                StringBuilder A1C = AbstractC166987dD.A1C();
                int A03 = AbstractC31172DnG.A03(A0R, 1);
                for (int i2 = 0; i2 < A03; i2++) {
                    A1C.append(AbstractC25226BEj.A1I(A0R, i2));
                }
                AbstractC31326Dpo.A00(igTextView, null, AbstractC166987dD.A19(A1C), A0U);
                return;
            case 3:
                EL2 el2 = (EL2) this.A01;
                ViewGroup viewGroup = (ViewGroup) AbstractC31173DnH.A0D((View) this.A02, R.id.page1);
                boolean z = true;
                int bottom = viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom() - (viewGroup.getHeight() + viewGroup.getScrollY());
                if (viewGroup.getVisibility() != 0 || bottom > 0) {
                    z = false;
                }
                AbstractC34680FPp abstractC34680FPp = el2.A03;
                boolean z2 = el2.A0B;
                if (abstractC34680FPp instanceof Egd) {
                    if (0 == abstractC34680FPp.A01.A00.size() - 1 && abstractC34680FPp.A00(z, z2)) {
                        AbstractC12990ll abstractC12990ll2 = abstractC34680FPp.A00;
                        String str3 = abstractC34680FPp.A02;
                        C14360o3.A0B(abstractC12990ll2, 0);
                        C14360o3.A0B(str3, 1);
                        C35191Ffj.A00(abstractC12990ll2, "disclosures_v2_screen_pt2_all_content_fits", str3);
                    }
                    if (!abstractC34680FPp.A00(z, z2)) {
                        return;
                    }
                    abstractC12990ll = abstractC34680FPp.A00;
                    str = abstractC34680FPp.A02;
                    C14360o3.A0B(abstractC12990ll, 0);
                    C14360o3.A0B(str, 1);
                    str2 = "disclosures_v2_screen_pt1_all_content_fits";
                } else {
                    boolean z3 = abstractC34680FPp instanceof Egb;
                    boolean A00 = abstractC34680FPp.A00(z, z2);
                    if (z3) {
                        if (!A00) {
                            return;
                        }
                        abstractC12990ll = abstractC34680FPp.A00;
                        str = abstractC34680FPp.A02;
                        AbstractC167017dG.A1N(abstractC12990ll, str);
                    } else {
                        if (!A00 || ((C34564FKy) abstractC34680FPp.A01.A00.get(0)).A00) {
                            return;
                        }
                        abstractC12990ll = abstractC34680FPp.A00;
                        str = abstractC34680FPp.A02;
                        AbstractC167007dF.A1K(abstractC12990ll, str);
                    }
                    str2 = "disclosures_v2_screen_all_content_fits";
                }
                C35191Ffj.A00(abstractC12990ll, str2, str);
                return;
            default:
                TextView textView = (TextView) this.A01;
                if (textView.getLayout() != null) {
                    if (textView.getLayout().getEllipsisCount(textView.getLayout().getLineCount() - 1) > 0) {
                        C0fQ.A00(new ViewOnClickListenerC42035Ik4(this.A02, 60), textView);
                    } else {
                        AbstractC25227BEk.A11(textView);
                    }
                    textView.getViewTreeObserver().removeOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC35714Fpo(textView, 2));
                    return;
                }
                return;
        }
    }
}
