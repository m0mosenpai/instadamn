package com.instagram.ui.widget.nametagresultcard.impl;

import X.AbstractC111324zv;
import X.AbstractC125325le;
import X.AbstractC13880nE;
import X.C0f9;
import X.C150956qv;
import X.C31501Dsl;
import X.C55942hf;
import X.InterfaceC77483dY;
import X.WNS;
import X.XBN;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.nametag.NametagCardView;
import com.instagram.ui.widget.nametag.UsernameTextView;
import com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView;
import com.instagram.ui.widget.textview.UpdatableButton;
import com.instagram.user.follow.FollowButton;
import java.util.Locale;

/* loaded from: classes11.dex */
public class NametagResultCardView extends FrameLayout {
    public int A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public CircularImageView A06;
    public UsernameTextView A07;
    public XBN A08;
    public UpdatableButton A09;
    public FollowButton A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public int A0F;
    public View A0G;
    public final InterfaceC77483dY A0H;

    public static void A01(final NametagResultCardView nametagResultCardView) {
        int i = (int) (nametagResultCardView.A00 * 0.05f);
        nametagResultCardView.setPadding(i, i, i, i);
        int i2 = nametagResultCardView.A00 - (i * 2);
        nametagResultCardView.A0F = i2;
        AbstractC13880nE.A0h(nametagResultCardView.A02, i2, i2);
        int i3 = (int) (nametagResultCardView.A00 * 0.25f);
        AbstractC13880nE.A0h(nametagResultCardView.A06, i3, i3);
        Paint.FontMetrics fontMetrics = nametagResultCardView.A07.getPaint().getFontMetrics();
        UsernameTextView usernameTextView = nametagResultCardView.A07;
        float f = nametagResultCardView.A00;
        float f2 = (f * 0.038f) - fontMetrics.ascent;
        int i4 = (int) (f * 0.83f);
        String str = usernameTextView.A00;
        if (str != null) {
            StringBuilder sb = new StringBuilder((str.length() + 3) - 1);
            String[] strArr = new String[3];
            UsernameTextView.A01(usernameTextView, str.toUpperCase(Locale.US), strArr, 3, i4);
            int i5 = 0;
            do {
                String str2 = strArr[i5];
                if (TextUtils.isEmpty(str2)) {
                    break;
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(str2);
                i5++;
            } while (i5 < 3);
            usernameTextView.setText(sb.toString());
        }
        usernameTextView.setLineSpacing(f2, 0.0f);
        usernameTextView.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        usernameTextView.layout(usernameTextView.getLeft(), usernameTextView.getTop(), usernameTextView.getLeft() + usernameTextView.getMeasuredWidth(), usernameTextView.getTop() + usernameTextView.getMeasuredHeight());
        UsernameTextView usernameTextView2 = nametagResultCardView.A07;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) usernameTextView2.getLayoutParams();
        marginLayoutParams.topMargin = (int) (nametagResultCardView.A00 * 0.057f);
        usernameTextView2.setLayoutParams(marginLayoutParams);
        nametagResultCardView.A04.measure(View.MeasureSpec.makeMeasureSpec((int) (nametagResultCardView.A00 * 0.83f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        Paint.FontMetrics fontMetrics2 = nametagResultCardView.A04.getPaint().getFontMetrics();
        TextView textView = nametagResultCardView.A04;
        int i6 = (int) ((((nametagResultCardView.A00 * 0.057f) - fontMetrics.bottom) + fontMetrics2.top) - fontMetrics2.ascent);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams2.topMargin = i6;
        textView.setLayoutParams(marginLayoutParams2);
        nametagResultCardView.A02.setVisibility(0);
        float measuredWidth = nametagResultCardView.A07.getMeasuredWidth();
        float measuredHeight = nametagResultCardView.A07.getMeasuredHeight();
        int[] iArr = NametagCardView.A0F[2];
        nametagResultCardView.A07.getPaint().setShader(new LinearGradient(measuredWidth, 0.0f, 0.0f, measuredHeight, iArr[0], iArr[1], Shader.TileMode.CLAMP));
        nametagResultCardView.post(new Runnable() { // from class: X.Wst
            @Override // java.lang.Runnable
            public final void run() {
                NametagResultCardView.this.requestLayout();
            }
        });
    }

    private XBN getDelegate() {
        XBN xbn = this.A08;
        xbn.getClass();
        return xbn;
    }

    public void setDelegate(XBN xbn) {
        this.A08 = xbn;
        this.A0G.setOnClickListener(new WNS(this, 20));
    }

    public NametagResultCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0H = new C31501Dsl(this, 1);
        A00();
    }

    private void A00() {
        View.inflate(getContext(), R.layout.nametag_result_card_view_layout, this);
        ((ViewGroup) requireViewById(R.id.nametag_card_container)).setLayoutTransition(new LayoutTransition());
        this.A0G = requireViewById(R.id.dismiss_button);
        this.A02 = requireViewById(R.id.user_container);
        this.A06 = (CircularImageView) requireViewById(R.id.profile_photo);
        this.A07 = (UsernameTextView) requireViewById(R.id.username_view);
        this.A04 = (TextView) requireViewById(R.id.full_name_view);
        this.A01 = requireViewById(R.id.button_container);
        FollowButton followButton = (FollowButton) requireViewById(R.id.follow_button);
        this.A0A = followButton;
        followButton.A0J.A0H = AbstractC111324zv.A00(2744);
        UpdatableButton updatableButton = (UpdatableButton) requireViewById(R.id.deeplink_button);
        this.A09 = updatableButton;
        updatableButton.setIsBlueButton(true);
        this.A03 = (TextView) requireViewById(R.id.follow_status_view);
        this.A05 = (TextView) requireViewById(R.id.view_profile_button);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r9.A27() == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.InterfaceC11380iw r7, com.instagram.common.session.UserSession r8, com.instagram.user.model.User r9) {
        /*
            r6 = this;
            X.2kX r0 = X.C57582kX.A00(r8)
            com.instagram.user.model.FollowStatus r5 = r0.A0N(r9)
            com.instagram.user.model.FollowStatus r4 = com.instagram.user.model.FollowStatus.A05
            r3 = 0
            if (r5 != r4) goto L14
            boolean r1 = r9.A27()
            r0 = 1
            if (r1 != 0) goto L15
        L14:
            r0 = 0
        L15:
            r6.A0D = r0
            boolean r0 = X.C2TN.A04(r8, r9)
            r2 = 8
            if (r0 == 0) goto L74
            com.instagram.user.follow.FollowButton r0 = r6.A0A
            r0.setVisibility(r2)
            android.widget.TextView r1 = r6.A03
            r0 = 2131962733(0x7f132b6d, float:1.95622E38)
            r1.setText(r0)
        L2c:
            android.widget.TextView r0 = r6.A03
            r0.setVisibility(r3)
        L31:
            boolean r0 = r6.A0B
            if (r0 == 0) goto L4f
            boolean r0 = r6.A0C
            if (r0 != 0) goto L6a
            boolean r0 = r6.A0D
            if (r0 == 0) goto L6a
            android.view.View r1 = r6.A02
            r0 = 0
            r1.setAlpha(r0)
            X.XBN r4 = r6.A08
            r4.getClass()
            int r1 = r6.A00
            int r0 = r6.A0E
            r4.DUv(r1, r0, r3)
        L4f:
            android.widget.TextView r4 = r6.A05
            r1 = 17
            X.WNW r0 = new X.WNW
            r0.<init>(r1, r6, r9)
            r4.setOnClickListener(r0)
            int r1 = r6.A0F
            if (r1 <= 0) goto Lcc
            android.view.View r0 = r6.A01
            X.AbstractC13880nE.A0g(r0, r1)
            android.view.View r0 = r6.A01
            r0.setVisibility(r3)
            return
        L6a:
            android.view.View r0 = r6.A02
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C150956qv.A09(r0, r3)
            goto L4f
        L74:
            if (r5 != r4) goto La3
            com.instagram.user.follow.FollowButton r0 = r6.A0A
            r0.setVisibility(r2)
            android.widget.TextView r5 = r6.A03
            android.content.res.Resources r4 = r6.getResources()
            boolean r0 = r6.A0C
            if (r0 == 0) goto L98
            r1 = 2131962731(0x7f132b6b, float:1.9562195E38)
        L88:
            java.lang.String r0 = r9.getUsername()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            android.text.Spanned r0 = X.AbstractC07900bA.A01(r4, r0, r1)
            r5.setText(r0)
            goto L2c
        L98:
            boolean r0 = r6.A0D
            r1 = 2131962729(0x7f132b69, float:1.9562191E38)
            if (r0 == 0) goto L88
            r1 = 2131962730(0x7f132b6a, float:1.9562193E38)
            goto L88
        La3:
            com.instagram.user.model.FollowStatus r1 = com.instagram.user.model.FollowStatus.A07
            com.instagram.user.follow.FollowButton r0 = r6.A0A
            if (r5 != r1) goto Lb6
            r0.setVisibility(r2)
            android.widget.TextView r5 = r6.A03
            android.content.res.Resources r4 = r6.getResources()
            r1 = 2131962732(0x7f132b6c, float:1.9562197E38)
            goto L88
        Lb6:
            r0.setVisibility(r3)
            com.instagram.user.follow.FollowButton r0 = r6.A0A
            X.4yT r1 = r0.A0J
            X.3dY r0 = r6.A0H
            r1.A08(r0)
            r1.A04(r7, r8, r9)
            android.widget.TextView r0 = r6.A03
            r0.setVisibility(r2)
            goto L31
        Lcc:
            android.view.View r0 = r6.A02
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView.A02(X.0iw, com.instagram.common.session.UserSession, com.instagram.user.model.User):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, Math.max(getMeasuredHeight(), measuredWidth));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1391801969);
        super.onSizeChanged(i, i2, i3, i4);
        this.A00 = i;
        this.A0E = i2;
        if (i != i3) {
            A01(this);
        } else if (i < i2 && i3 == i4 && !this.A0B) {
            if (this.A0D) {
                XBN xbn = this.A08;
                xbn.getClass();
                xbn.DUv(i, i2, true);
                View view = this.A02;
                C55942hf c55942hf = C150956qv.A02;
                AbstractC125325le A00 = AbstractC125325le.A00(view);
                A00.A0M(1.0f, 0.0f);
                A00.A0F(true).A0H();
            }
            this.A0B = true;
        }
        C0f9.A0D(-1913244077, A06);
    }

    public NametagResultCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0H = new C31501Dsl(this, 1);
        A00();
    }

    public NametagResultCardView(Context context) {
        super(context);
        this.A0H = new C31501Dsl(this, 1);
        A00();
    }
}
