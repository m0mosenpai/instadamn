package X;

import android.content.Context;
import android.graphics.PointF;
import android.text.Layout;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;

/* renamed from: X.HaP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39383HaP extends AbstractC50789Mc6 {
    public ViewGroup A00;
    public ImageView A01;
    public ImageView A02;
    public TextView A03;
    public final Context A04;
    public final UserSession A05;
    public final C38321qM A06;
    public final boolean A07;
    public final boolean A08;
    public final C25671My A09;
    public final Integer A0A;

    @Override // X.AbstractC50789Mc6
    public void setText(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        super.setText(charSequence);
        TextView textView = this.A03;
        if (textView == null) {
            C14360o3.A0F("bubbleText");
            throw C00O.createAndThrow();
        }
        textView.setContentDescription(AbstractC166997dE.A0r(getResources(), charSequence, 2131954439));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39383HaP(Context context, PointF pointF, UserSession userSession, C38321qM c38321qM, Integer num, boolean z, boolean z2) {
        super(context);
        String str;
        AbstractC167017dG.A1P(context, userSession);
        this.A04 = context;
        this.A05 = userSession;
        this.A06 = c38321qM;
        this.A07 = z;
        this.A0A = num;
        this.A08 = z2;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36318612822366561L);
        Context context2 = this.A04;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A00 = frameLayout;
        AbstractC41736Ie8.A00(frameLayout, this.A05, this.A06, Boolean.valueOf(this.A08));
        TightTextView tightTextView = new TightTextView(context2);
        this.A03 = tightTextView;
        if (this.A07) {
            tightTextView.setTextAppearance(R.style.igds_emphasized_body_2);
        }
        AbstractC41736Ie8.A02(tightTextView);
        Context context3 = tightTextView.getContext();
        tightTextView.setMinimumWidth(context3.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
        tightTextView.setMaxWidth(context3.getResources().getDimensionPixelSize(R.dimen.ad_tag_max_width));
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
            TextView textView = this.A03;
            if (textView != null) {
                viewGroup.addView(textView, layoutParams);
                this.A09 = AbstractC25651Mw.A00(userSession);
                ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                ViewGroup viewGroup2 = this.A00;
                if (viewGroup2 != null) {
                    addView(viewGroup2, layoutParams2);
                    ImageView imageView3 = this.A02;
                    if (imageView3 != null) {
                        addView(imageView3, layoutParams2);
                        ImageView imageView4 = this.A01;
                        str = "downArrow";
                        if (imageView4 != null) {
                            addView(imageView4, layoutParams2);
                            ViewGroup viewGroup3 = this.A00;
                            if (viewGroup3 != null) {
                                TextView textView2 = this.A03;
                                if (textView2 != null) {
                                    ImageView imageView5 = this.A02;
                                    if (imageView5 != null) {
                                        ImageView imageView6 = this.A01;
                                        if (imageView6 != null) {
                                            super.A02 = new OXO(pointF, viewGroup3, imageView5, imageView6, textView2, userSession, c38321qM, this, 0, 0, A06);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F("upArrow");
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F("bubble");
                throw C00O.createAndThrow();
            }
            str = "bubbleText";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
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
    public C57482kN getTextLayoutParams() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TextView textView = this.A03;
        if (textView == null) {
            C14360o3.A0F("bubbleText");
            throw C00O.createAndThrow();
        }
        return AbstractC37303Gc4.A0C(alignment, textView.getPaint(), textView, textView.getMaxWidth());
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

    @Override // X.AbstractC50789Mc6
    public String getTaggedId() {
        Object tag = getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.tagging.model.Tag<*>");
        String id = ((com.instagram.tagging.model.Tag) tag).getId();
        C14360o3.A07(id);
        return id;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r9.getY() > getHeight()) goto L21;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r0 = 1023533095(0x3d01e027, float:0.03170791)
            int r5 = X.C0f9.A05(r0)
            r4 = 1
            if (r9 == 0) goto La4
            int r0 = r9.getAction()
            if (r0 != r4) goto La4
            X.3Zb r6 = r8.A01
            if (r6 == 0) goto La4
            int r1 = r8.A00
            r0 = -1
            X.3tC r0 = r6.A07(r1, r0)
            r0.A04 = r4
            java.lang.Integer r0 = r8.A0A
            r6.A19 = r0
            X.Gm2 r3 = r6.A0k
            if (r3 == 0) goto L61
            android.content.Context r7 = r8.A04
            float r0 = r9.getX()
            float r2 = X.AbstractC13880nE.A01(r7, r0)
            float r0 = r9.getY()
            float r1 = X.AbstractC13880nE.A01(r7, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r3.A01 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r3.A02 = r0
            int r0 = r8.getWidth()
            float r0 = (float) r0
            float r2 = X.AbstractC13880nE.A01(r7, r0)
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r1 = X.AbstractC13880nE.A01(r7, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r3.A03 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r3.A00 = r0
        L61:
            X.1qM r1 = r8.getMedia()
            if (r1 == 0) goto La4
            com.instagram.common.session.UserSession r0 = r8.A05
            X.1qM r3 = r1.A1g(r0)
            X.1My r2 = r8.A09
            float r0 = r9.getX()
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L9b
            float r1 = r9.getX()
            int r0 = r8.getWidth()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L9b
            float r0 = r9.getY()
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L9b
            float r1 = r9.getY()
            int r0 = r8.getHeight()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L9c
        L9b:
            r1 = 0
        L9c:
            X.3Mp r0 = new X.3Mp
            r0.<init>(r8, r3, r6, r1)
            r2.E4s(r0)
        La4:
            r0 = -377434389(0xffffffffe980ceeb, float:-1.9464956E25)
            X.C0f9.A0C(r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39383HaP.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
