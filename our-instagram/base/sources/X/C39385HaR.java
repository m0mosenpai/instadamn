package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.model.fbusertag.FBUserTag;

/* renamed from: X.HaR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39385HaR extends AbstractC50789Mc6 {
    public ViewGroup A00;
    public ImageView A01;
    public ImageView A02;
    public TextView A03;
    public InterfaceC43423JGn A04;
    public final UserSession A05;
    public final C38321qM A06;
    public final boolean A07;
    public final C25671My A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39385HaR(Context context, PointF pointF, UserSession userSession, C38321qM c38321qM, boolean z) {
        super(context);
        AbstractC25234BEr.A1P(context, userSession, pointF);
        this.A05 = userSession;
        this.A06 = c38321qM;
        this.A07 = z;
        this.A08 = AbstractC25651Mw.A00(userSession);
        Context context2 = getContext();
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A00 = frameLayout;
        AbstractC41736Ie8.A00(frameLayout, this.A05, this.A06, Boolean.valueOf(this.A07));
        TightTextView tightTextView = new TightTextView(context2);
        this.A03 = tightTextView;
        tightTextView.setMinimumWidth(getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
        TextView textView = this.A03;
        String str = "bubbleText";
        if (textView != null) {
            AbstractC41736Ie8.A02(textView);
            ImageView imageView = new ImageView(context2);
            this.A02 = imageView;
            AbstractC41736Ie8.A01(imageView, true);
            ImageView imageView2 = new ImageView(context2);
            this.A01 = imageView2;
            AbstractC41736Ie8.A01(imageView2, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            ViewGroup viewGroup = this.A00;
            if (viewGroup == null) {
                str = "bubble";
            } else {
                TextView textView2 = this.A03;
                if (textView2 != null) {
                    viewGroup.addView(textView2, layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                    ViewGroup viewGroup2 = this.A00;
                    if (viewGroup2 != null) {
                        addView(viewGroup2, layoutParams2);
                        ImageView imageView3 = this.A02;
                        if (imageView3 != null) {
                            addView(imageView3, layoutParams2);
                            ImageView imageView4 = this.A01;
                            String str2 = "downArrow";
                            if (imageView4 != null) {
                                addView(imageView4, layoutParams2);
                                ViewGroup viewGroup3 = this.A00;
                                if (viewGroup3 != null) {
                                    TextView textView3 = this.A03;
                                    if (textView3 == null) {
                                        str2 = "bubbleText";
                                    } else {
                                        ImageView imageView5 = this.A02;
                                        if (imageView5 != null) {
                                            ImageView imageView6 = this.A01;
                                            if (imageView6 != null) {
                                                super.A02 = new OXO(pointF, viewGroup3, imageView5, imageView6, textView3, userSession, c38321qM, this, 0, 0, false);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                        C14360o3.A0F("upArrow");
                        throw C00O.createAndThrow();
                    }
                    C14360o3.A0F("bubble");
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC50789Mc6
    public C57482kN getTextLayoutParams() {
        return null;
    }

    @Override // X.AbstractC50789Mc6
    public void setText(CharSequence charSequence) {
        Drawable drawable;
        C14360o3.A0B(charSequence, 0);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(charSequence);
        Context context = getContext();
        if (context != null && (drawable = context.getDrawable(R.drawable.instagram_facebook_circle_pano_outline_24)) != null) {
            int dimension = (int) context.getResources().getDimension(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            int i = 2;
            drawable.setBounds(0, 2, dimension, dimension + 2);
            drawable.mutate().setTint(context.getColor(R.color.design_dark_default_color_on_background));
            if (Build.VERSION.SDK_INT < 29) {
                i = 1;
            }
            ImageSpan imageSpan = new ImageSpan(drawable, i);
            A0H = AbstractC37300Gc1.A01();
            A0H.append((CharSequence) AbstractC167017dG.A0n(charSequence, "# ", AbstractC166987dD.A1C()));
            A0H.setSpan(imageSpan, 0, "❏".length(), 33);
        }
        super.setText(A0H);
        TextView textView = this.A03;
        if (textView == null) {
            C14360o3.A0F("bubbleText");
            throw C00O.createAndThrow();
        }
        textView.setContentDescription(AbstractC166997dE.A0r(getResources(), charSequence, 2131975175));
    }

    public final InterfaceC43423JGn getListener() {
        return this.A04;
    }

    @Override // X.AbstractC50789Mc6
    public CharSequence getText() {
        TextView textView = this.A03;
        if (textView == null) {
            C14360o3.A0F("bubbleText");
            throw C00O.createAndThrow();
        }
        CharSequence text = textView.getText();
        C14360o3.A07(text);
        return text;
    }

    @Override // X.AbstractC50789Mc6
    public int getTextLineHeight() {
        TextView textView = this.A03;
        if (textView == null) {
            C14360o3.A0F("bubbleText");
            throw C00O.createAndThrow();
        }
        return textView.getLineHeight();
    }

    private final String getTagName() {
        Object tag = getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.tagging.model.Tag<*>");
        String A04 = ((com.instagram.tagging.model.Tag) tag).A04();
        C14360o3.A07(A04);
        return A04;
    }

    @Override // X.AbstractC50789Mc6
    public String getTaggedId() {
        Object tag = getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.tagging.model.Tag<*>");
        String id = ((com.instagram.tagging.model.Tag) tag).getId();
        C14360o3.A07(id);
        return id;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-66262881);
        if (motionEvent != null && motionEvent.getAction() == 1) {
            C75113Zb c75113Zb = super.A01;
            if (c75113Zb != null) {
                c75113Zb.A07(super.A00, -1).A04 = true;
            }
            C38321qM c38321qM = this.A06;
            if (c38321qM != null && (getTag() instanceof FBUserTag)) {
                C25671My c25671My = this.A08;
                String taggedId = getTaggedId();
                String tagName = getTagName();
                Object tag = getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.model.fbusertag.FBUserTag");
                c25671My.E4s(new C72323Mf(new C37484Gf2(19, c38321qM, this), c38321qM, (FBUserTag) tag, taggedId, tagName));
            }
        }
        C0f9.A0C(-1097572946, A05);
        return true;
    }

    public final void setListener(InterfaceC43423JGn interfaceC43423JGn) {
        this.A04 = interfaceC43423JGn;
    }
}
