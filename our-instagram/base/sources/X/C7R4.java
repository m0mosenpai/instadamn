package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7R4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7R4 {
    public static final C7R4 A00 = new Object();

    public static final TextView A00(TextView textView, Integer num, String str, boolean z) {
        C14360o3.A0B(str, 1);
        if (str.length() == 0) {
            if (textView != null) {
                textView.setVisibility(8);
                return null;
            }
            return null;
        }
        if (textView == null) {
            return null;
        }
        if (textView.getVisibility() == 0) {
            CharSequence text = textView.getText();
            C14360o3.A07(text);
            if (str.contentEquals(text)) {
                return null;
            }
        }
        if (z) {
            textView.post(new M6T(textView, num, str, textView.getMeasuredHeight() * 0.5f));
            return textView;
        }
        textView.setText(str);
        textView.setVisibility(0);
        return null;
    }

    public static final List A02(LayoutInflater layoutInflater, LinearLayout linearLayout, LinearLayout linearLayout2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ImageUrl imageUrl, String str, List list, boolean z, boolean z2, boolean z3) {
        Object[] objArr;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(linearLayout, 1);
        C14360o3.A0B(linearLayout2, 2);
        C14360o3.A0B(layoutInflater, 3);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new SimpleImageUrl((String) list.get(i)));
        }
        if (str != null && z3) {
            int i2 = R.layout.emoji_reaction_consumption_view;
            if (z) {
                i2 = R.layout.multi_react_emoji_consumption_view;
            }
            A01(layoutInflater, linearLayout, linearLayout2, interfaceC11380iw, userSession, imageUrl, arrayList, i2);
            if (z2) {
                int childCount = linearLayout2.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = linearLayout2.getChildAt(i3);
                    C14360o3.A0C(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                    if (str.equals(childAt.getTag(R.id.direct_reaction_emoji))) {
                        View requireViewById = childAt.requireViewById(R.id.emoji_image);
                        C14360o3.A07(requireViewById);
                        IgImageView igImageView = (IgImageView) requireViewById;
                        View requireViewById2 = childAt.requireViewById(R.id.overlay_image);
                        C14360o3.A07(requireViewById2);
                        IgImageView igImageView2 = (IgImageView) requireViewById2;
                        View requireViewById3 = childAt.requireViewById(R.id.emoji_placeholder);
                        C14360o3.A07(requireViewById3);
                        Context context = childAt.getContext();
                        C14360o3.A07(context);
                        Drawable A01 = AbstractC43679JTn.A01(context, userSession, imageUrl);
                        if (A01 != null) {
                            C47985LJk.A00.A03(A01, requireViewById3, igImageView, igImageView2);
                            objArr = new IgImageView[2];
                            objArr[0] = igImageView2;
                        } else {
                            C14360o3.A0B(igImageView, 0);
                            igImageView.setVisibility(0);
                            requireViewById3.setVisibility(0);
                            requireViewById3.setScaleX(0.0f);
                            requireViewById3.setScaleY(0.0f);
                            AnimatorSet animatorSet = new AnimatorSet();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(igImageView, "translationY", -120.0f).setDuration(280L);
                            C14360o3.A07(duration);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(igImageView, "scaleY", 1.0f, 3.0f);
                            ofFloat.setDuration(280L);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(igImageView, "scaleX", 1.0f, 3.0f);
                            ofFloat2.setDuration(280L);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(requireViewById3, "scaleY", 0.0f, 1.0f);
                            ofFloat3.setDuration(280L);
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(requireViewById3, "scaleX", 0.0f, 1.0f);
                            ofFloat4.setDuration(280L);
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(igImageView, "scaleY", 3.0f, 0.85f);
                            ofFloat5.setDuration(210L);
                            ofFloat5.setStartDelay(480L);
                            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(igImageView, "scaleX", 3.0f, 0.85f);
                            ofFloat6.setDuration(210L);
                            ofFloat6.setStartDelay(480L);
                            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(igImageView, "translationY", 12.0f);
                            ofFloat7.setDuration(280L);
                            ofFloat7.setStartDelay(480L);
                            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(requireViewById3, "scaleY", 1.0f, 0.0f);
                            ofFloat8.setDuration(280L);
                            ofFloat8.setStartDelay(480L);
                            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(requireViewById3, "scaleX", 1.0f, 0.0f);
                            ofFloat9.setDuration(280L);
                            ofFloat9.setStartDelay(480L);
                            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(igImageView, "scaleY", 0.85f, 1.0f);
                            ofFloat10.setDuration(210L);
                            ofFloat10.setStartDelay(760L);
                            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(igImageView, "scaleX", 0.85f, 1.0f);
                            ofFloat11.setDuration(210L);
                            ofFloat11.setStartDelay(760L);
                            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(igImageView, "translationY", 0.0f);
                            ofFloat12.setDuration(210L);
                            ofFloat12.setStartDelay(760L);
                            animatorSet.setInterpolator(new DecelerateInterpolator());
                            animatorSet.playTogether(duration, ofFloat2, ofFloat, ofFloat4, ofFloat3);
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            animatorSet2.playTogether(ofFloat7, ofFloat6, ofFloat5, ofFloat12, ofFloat11, ofFloat10, ofFloat9, ofFloat8);
                            animatorSet.start();
                            animatorSet2.start();
                            igImageView.post(new RunnableC24458Asd(igImageView));
                            objArr = new IgImageView[2];
                            objArr[0] = igImageView;
                        }
                        objArr[1] = requireViewById3;
                        return AbstractC16960so.A1Q(objArr);
                    }
                }
                return null;
            }
            return null;
        }
        C7R4 c7r4 = A00;
        int i4 = R.layout.emoji_reaction_consumption_view;
        if (z) {
            i4 = R.layout.multi_react_emoji_consumption_view;
        }
        ArrayList A012 = A01(layoutInflater, linearLayout, linearLayout2, interfaceC11380iw, userSession, imageUrl, arrayList, i4);
        if (!z2 || A012 == null) {
            return A012;
        }
        c7r4.A05(A012);
        return A012;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(android.view.LayoutInflater r15, android.widget.LinearLayout r16, android.widget.LinearLayout r17, X.InterfaceC11380iw r18, java.util.List r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7R4.A03(android.view.LayoutInflater, android.widget.LinearLayout, android.widget.LinearLayout, X.0iw, java.util.List, boolean):void");
    }

    public static final void A04(View view, C7IH c7ih, boolean z) {
        int i;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(c7ih, 2);
        GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
        if (gradientDrawable != null) {
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
            if (z) {
                i = c7ih.A0D;
                gradientDrawable.setColor(ColorStateList.valueOf(i));
            } else {
                gradientDrawable.setColor(ColorStateList.valueOf(c7ih.A0E));
                i = c7ih.A0F;
            }
            gradientDrawable.setStroke(dimensionPixelSize, i);
        }
    }

    public static final boolean A06(UserSession userSession, C2EY c2ey, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int intValue;
        C14360o3.A0B(c2ey, 3);
        if (z && !z3 && z2 && ((c2ey == C2EY.A0W || c2ey == C2EY.A1r || c2ey == C2EY.A19 || c2ey == C2EY.A1u || c2ey == C2EY.A1y || c2ey == C2EY.A1Q || c2ey == C2EY.A1U || c2ey == C2EY.A1b || c2ey == C2EY.A1c || c2ey == C2EY.A21 || c2ey == C2EY.A1a || c2ey == C2EY.A1w || c2ey == C2EY.A1G || c2ey == C2EY.A0Q || c2ey == C2EY.A22 || c2ey == C2EY.A1g || c2ey == C2EY.A20 || c2ey == C2EY.A1V || c2ey == C2EY.A1B || c2ey == C2EY.A1v || c2ey == C2EY.A1t || c2ey == C2EY.A0t || c2ey == C2EY.A1q || c2ey == C2EY.A0M || c2ey == C2EY.A1x || c2ey == C2EY.A1F || c2ey == C2EY.A0w || c2ey == C2EY.A1z || c2ey == C2EY.A11 || c2ey == C2EY.A14 || c2ey == C2EY.A13 || z4) && !z5 && num != null && (((intValue = num.intValue()) == 1003 || intValue == 47) && !C18U.A06(C06090Tz.A06, userSession, 36320232025104536L) && C18U.A06(C06090Tz.A05, userSession, 36325798302463365L)))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A01(android.view.LayoutInflater r16, android.widget.LinearLayout r17, android.widget.LinearLayout r18, X.InterfaceC11380iw r19, com.instagram.common.session.UserSession r20, com.instagram.common.typedurl.ImageUrl r21, java.util.List r22, int r23) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7R4.A01(android.view.LayoutInflater, android.widget.LinearLayout, android.widget.LinearLayout, X.0iw, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, java.util.List, int):java.util.ArrayList");
    }

    private final void A05(List list) {
        Drawable drawable;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.setVisibility(4);
            Object tag = view.getTag(R.id.direct_reaction_avatar_drawable);
            if ((tag instanceof Drawable) && (drawable = (Drawable) tag) != null && (view instanceof ViewGroup)) {
                view.setVisibility(0);
                View requireViewById = view.requireViewById(R.id.emoji_image);
                C14360o3.A07(requireViewById);
                View requireViewById2 = view.requireViewById(R.id.overlay_image);
                C14360o3.A07(requireViewById2);
                View requireViewById3 = view.requireViewById(R.id.emoji_placeholder);
                C14360o3.A07(requireViewById3);
                C47985LJk.A00.A03(drawable, requireViewById3, (IgImageView) requireViewById, (IgImageView) requireViewById2);
            } else {
                view.post(new M1R(view));
            }
        }
    }
}
