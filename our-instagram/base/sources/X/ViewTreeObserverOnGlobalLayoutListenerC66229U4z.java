package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.facebookpay.widget.listcell.ListCell;
import com.instagram.common.ui.text.ExpandableTextView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.U4z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC66229U4z implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ViewTreeObserverOnGlobalLayoutListenerC66229U4z(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        int i2;
        int A01;
        int i3;
        View A0e;
        int i4;
        ConstraintLayout constraintLayout;
        switch (this.A00) {
            case 0:
                try {
                    ((Runnable) this.A01).run();
                    ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.A02;
                    if ((viewTreeObserver.isAlive() || (viewTreeObserver = ((View) this.A03).getViewTreeObserver()) != null) && viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                        return;
                    }
                    throw new IllegalArgumentException("Given null or dead view tree observer.");
                } catch (Throwable th) {
                    ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.A02;
                    if ((viewTreeObserver2.isAlive() || (viewTreeObserver2 = ((View) this.A03).getViewTreeObserver()) != null) && viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeOnGlobalLayoutListener(this);
                        throw th;
                    }
                    throw new IllegalArgumentException("Given null or dead view tree observer.");
                }
            case 1:
                TextView textView = (TextView) this.A03;
                AbstractC166997dE.A1K(textView, this);
                ListCell listCell = (ListCell) this.A01;
                int lineCount = textView.getLineCount();
                Number number = (Number) this.A02;
                if (number != null) {
                    i4 = number.intValue();
                } else {
                    i4 = R.id.image;
                }
                View view = listCell.A01;
                if (view == null) {
                    C14360o3.A0F("containerView");
                    throw C00O.createAndThrow();
                }
                if (!(view instanceof ConstraintLayout) || (constraintLayout = (ConstraintLayout) view) == null) {
                    return;
                }
                C110964z8 c110964z8 = new C110964z8();
                c110964z8.A0I(constraintLayout);
                if (lineCount <= 1 && listCell.getSecondaryText() == null && listCell.getTertiaryText() == null && listCell.getQuaternaryText() == null && listCell.getTertiaryLinkableText() == null && listCell.getQuaternaryLinkableText() == null && listCell.getSecondarySpannableText() == null && listCell.getTertiarySpannableText() == null) {
                    c110964z8.A0D(R.id.primary_text, 3, R.id.image, 4);
                    c110964z8.A0D(R.id.primary_text, 4, R.id.image, 3);
                    C152726u0 c152726u0 = (C152726u0) AbstractC58319PtB.A0n(c110964z8.A00, R.id.primary_text);
                    if (c152726u0 != null) {
                        c152726u0.A03.A05 = 0.5f;
                    }
                } else {
                    c110964z8.A0C(R.id.primary_text, 3, i4, 3);
                }
                c110964z8.A0G(constraintLayout);
                return;
            case 2:
                View view2 = (View) this.A03;
                ((AtomicBoolean) this.A01).set(AbstractC167007dF.A1O(((view2.getRootView().getHeight() - view2.getHeight()) > (view2.getRootView().getHeight() * 0.15d) ? 1 : ((view2.getRootView().getHeight() - view2.getHeight()) == (view2.getRootView().getHeight() * 0.15d) ? 0 : -1))));
                ((SLy) this.A02).A00();
                return;
            case 3:
                C66289U7k c66289U7k = (C66289U7k) this.A03;
                ViewTreeObserver viewTreeObserver3 = c66289U7k.A03.getViewTreeObserver();
                C14360o3.A07(viewTreeObserver3);
                AbstractC13880nE.A0x(this, viewTreeObserver3);
                ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = (ViewOnTouchListenerC60632pm) this.A02;
                XDm xDm = c66289U7k.A04;
                List AZY = xDm.AZY();
                AbstractC70663Fe abstractC70663Fe = c66289U7k.A02;
                int A012 = AbstractC72193Ls.A01(abstractC70663Fe);
                int A02 = AbstractC72193Ls.A02(abstractC70663Fe);
                int size = AZY.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int intValue = ((Number) AZY.get(i5)).intValue();
                    if (intValue > A02) {
                        i2 = i5 - 1;
                    } else if (A012 <= intValue && intValue <= A02) {
                        c66289U7k.A00 = i5;
                        int A013 = AbstractC72193Ls.A01(abstractC70663Fe);
                        if (intValue >= A013 && (i3 = intValue - A013) <= abstractC70663Fe.A0T() && (A0e = abstractC70663Fe.A0e(i3)) != null && AbstractC110854yx.A00(A0e, abstractC70663Fe) > viewOnTouchListenerC60632pm.A00 - viewOnTouchListenerC60632pm.A01) {
                            c66289U7k.A00 = i5 - 1;
                        }
                        i2 = c66289U7k.A00;
                    }
                    if (xDm.AZY().isEmpty()) {
                        A01 = 0;
                    } else {
                        A01 = AbstractC31176DnK.A01(xDm.AZY(), 0);
                    }
                    c66289U7k.A00 = Math.max(i2, Math.max(0, A01 - 1));
                    C66290U7l.A00((C66290U7l) this.A01);
                    return;
                }
                C66290U7l.A00((C66290U7l) this.A01);
                return;
            case 4:
                View view3 = ((C66483UJj) this.A02).A01;
                AbstractC166997dE.A1K(view3, this);
                ExpandableTextView expandableTextView = (ExpandableTextView) this.A01;
                int width = view3.getWidth();
                ViewGroup.LayoutParams layoutParams = expandableTextView.getLayoutParams();
                int i6 = 0;
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    i = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                } else {
                    i = 0;
                }
                ViewGroup.LayoutParams layoutParams2 = expandableTextView.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    i6 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                }
                expandableTextView.setText(expandableTextView.A00(((UPQ) this.A03).A03, AbstractC166997dE.A0q(AbstractC25228BEl.A0M(expandableTextView), 2131973023), width - (i + i6)));
                return;
            case 5:
                View view4 = (View) this.A02;
                if (view4.getLayoutParams().height != -2) {
                    MSY.A10(view4, -1, -2);
                    return;
                }
                int height = view4.getHeight();
                AbstractC166997dE.A1K(view4, this);
                V4U v4u = (V4U) this.A03;
                V4U.A00(v4u, height);
                AbstractC43593JPy.A1B(view4, -1);
                View findViewById = ((View) this.A01).findViewById(R.id.row_feed_comment_textview_layout);
                if (findViewById == null) {
                    return;
                }
                findViewById.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC70241WNe(height, 1, v4u, findViewById));
                return;
            default:
                return;
        }
    }
}
