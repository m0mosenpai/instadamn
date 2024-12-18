package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.Fpx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnScrollChangedListenerC35723Fpx implements ViewTreeObserver.OnScrollChangedListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewTreeObserverOnScrollChangedListenerC35723Fpx(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        String str;
        AbstractC12990ll abstractC12990ll;
        String str2;
        String str3;
        switch (this.A00) {
            case 2:
                EL2 el2 = (EL2) this.A01;
                ViewGroup viewGroup = (ViewGroup) this.A02;
                Toast toast = el2.A01;
                if (toast != null) {
                    toast.cancel();
                }
                Toast toast2 = el2.A00;
                if (toast2 != null) {
                    toast2.cancel();
                }
                if (!((C34564FKy) el2.A04.A00.get(0)).A00 && viewGroup.getScrollY() > 0) {
                    ((C34564FKy) el2.A04.A00.get(0)).A00 = true;
                    AbstractC34680FPp abstractC34680FPp = el2.A03;
                    if (abstractC34680FPp instanceof Egd) {
                        abstractC12990ll = abstractC34680FPp.A00;
                        str2 = abstractC34680FPp.A02;
                        AbstractC167017dG.A1N(abstractC12990ll, str2);
                        str3 = "disclosures_v2_screen_pt1_screen_scrolled";
                    } else {
                        boolean z = abstractC34680FPp instanceof Egb;
                        abstractC12990ll = abstractC34680FPp.A00;
                        str2 = abstractC34680FPp.A02;
                        AbstractC167017dG.A1N(abstractC12990ll, str2);
                        str3 = "disclosures_v2_screen_scrolled";
                        if (z) {
                        }
                    }
                    C35191Ffj.A00(abstractC12990ll, str3, str2);
                }
                int bottom = viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom() - (viewGroup.getHeight() + viewGroup.getScrollY());
                if (viewGroup.getVisibility() != 0 || bottom > 0) {
                    return;
                }
                if (viewGroup.getParent() != null) {
                    AbstractC34680FPp abstractC34680FPp2 = el2.A03;
                    if (abstractC34680FPp2 instanceof Egd) {
                        List list = abstractC34680FPp2.A01.A00;
                        if (!((C34564FKy) list.get(0)).A01) {
                            boolean z2 = true;
                            if (0 != list.size() - 1) {
                                z2 = false;
                            }
                            AbstractC12990ll abstractC12990ll2 = abstractC34680FPp2.A00;
                            String str4 = abstractC34680FPp2.A02;
                            if (z2) {
                                AbstractC167007dF.A1K(abstractC12990ll2, str4);
                                str = "disclosures_v2_screen_pt2_scrolled_to_bottom";
                            } else {
                                AbstractC167007dF.A1K(abstractC12990ll2, str4);
                                str = "disclosures_v2_screen_pt1_scrolled_to_bottom";
                            }
                            C35191Ffj.A00(abstractC12990ll2, str, str4);
                        }
                    } else {
                        boolean z3 = abstractC34680FPp2 instanceof Egb;
                        boolean z4 = ((C34564FKy) abstractC34680FPp2.A01.A00.get(0)).A01;
                        if (z3) {
                            if (!z4) {
                                AbstractC12990ll abstractC12990ll3 = abstractC34680FPp2.A00;
                                String str5 = abstractC34680FPp2.A02;
                                AbstractC167007dF.A1K(abstractC12990ll3, str5);
                                C35191Ffj.A00(abstractC12990ll3, "disclosures_v2_screen_scrolled_to_bottom", str5);
                            }
                        } else if (!z4) {
                            AbstractC12990ll abstractC12990ll4 = abstractC34680FPp2.A00;
                            String str6 = abstractC34680FPp2.A02;
                            AbstractC167007dF.A1K(abstractC12990ll4, str6);
                            C35191Ffj.A00(abstractC12990ll4, "disclosures_v2_screen_scrolled_to_bottom", str6);
                        }
                    }
                }
                ((C34564FKy) el2.A04.A00.get(0)).A01 = true;
                return;
            case 3:
                C153156uj.A01((RecyclerView) this.A02, (C153156uj) this.A01, 0, true);
                return;
            default:
                View view = (View) this.A01;
                if (view.isShown() && view.getGlobalVisibleRect(new Rect())) {
                    ((C5SW) this.A02).A06();
                    if (view.getViewTreeObserver().isAlive()) {
                        view.getViewTreeObserver().removeOnScrollChangedListener(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
