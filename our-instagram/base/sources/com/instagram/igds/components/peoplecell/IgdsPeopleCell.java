package com.instagram.igds.components.peoplecell;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31173DnH;
import X.AbstractC31178DnM;
import X.AbstractC55922hc;
import X.AbstractC56372iV;
import X.AbstractC56952jT;
import X.C14360o3;
import X.C1OU;
import X.C34556FKq;
import X.C38C;
import X.C38E;
import X.C3PP;
import X.C6XI;
import X.C75653aW;
import X.C85963sQ;
import X.C8FY;
import X.InterfaceC11380iw;
import X.InterfaceC56392iX;
import X.InterfaceC85983sV;
import X.ViewOnClickListenerC35610Fo1;
import X.ViewOnClickListenerC35684FpJ;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class IgdsPeopleCell extends LinearLayout implements InterfaceC11380iw {
    public C38E A00;
    public String A01;
    public int A02;
    public int A03;
    public final View A04;
    public final TextView A05;
    public final TextView A06;
    public final IgLinearLayout A07;
    public final IgSimpleImageView A08;
    public final InterfaceC56392iX A09;
    public final GradientSpinnerAvatarView A0A;
    public final StackedAvatarView A0B;
    public final boolean A0C;
    public final LinearLayout A0D;
    public final TextView A0E;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCell(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false);
        C14360o3.A0B(context, 1);
    }

    public static final void A00(Bitmap bitmap, Drawable drawable, View.OnClickListener onClickListener, UserSession userSession, ImageUrl imageUrl, IgdsPeopleCell igdsPeopleCell, C34556FKq c34556FKq, User user, boolean z, boolean z2) {
        Context context;
        int i;
        igdsPeopleCell.A0B.setVisibility(8);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = igdsPeopleCell.A0A;
        gradientSpinnerAvatarView.setVisibility(0);
        AbstractC56952jT.A01(gradientSpinnerAvatarView);
        Resources resources = gradientSpinnerAvatarView.getResources();
        int i2 = R.dimen.action_button_settings_height;
        if (z) {
            i2 = R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        int i3 = R.dimen.abc_list_item_height_material;
        if (z) {
            i3 = R.dimen.alert_dialog_button_cell_height;
        }
        gradientSpinnerAvatarView.A0B(dimensionPixelSize, resources.getDimensionPixelSize(i3));
        if (c34556FKq != null && userSession != null) {
            gradientSpinnerAvatarView.A0F(null, igdsPeopleCell, c34556FKq.A02.Bhu());
            View.OnClickListener onClickListener2 = c34556FKq.A00;
            if (onClickListener2 != null) {
                gradientSpinnerAvatarView.setOnClickListener(onClickListener2);
            } else if (user != null) {
                C1OU c1ou = C1OU.$redex_init_class;
                Reel A02 = C75653aW.A02(userSession, user);
                if (A02 != null) {
                    gradientSpinnerAvatarView.setGradientColor(C3PP.A00(userSession, A02));
                    gradientSpinnerAvatarView.setOnClickListener(new ViewOnClickListenerC35610Fo1(12, gradientSpinnerAvatarView, A02, igdsPeopleCell, AbstractC166987dD.A1J(A02)));
                    gradientSpinnerAvatarView.setGradientSpinnerVisible(true);
                    context = gradientSpinnerAvatarView.getContext();
                    i = 2131973207;
                } else {
                    gradientSpinnerAvatarView.setOnClickListener(new ViewOnClickListenerC35684FpJ(35, user, igdsPeopleCell, userSession));
                    gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
                    context = gradientSpinnerAvatarView.getContext();
                    i = 2131963268;
                }
                gradientSpinnerAvatarView.setContentDescription(AbstractC31178DnM.A0c(context, user, i));
            }
        } else {
            if (imageUrl != null) {
                gradientSpinnerAvatarView.A0F(null, igdsPeopleCell, imageUrl);
            } else if (drawable != null) {
                gradientSpinnerAvatarView.A0D(drawable);
            } else if (bitmap != null) {
                C8FY c8fy = new C8FY(resources, bitmap);
                c8fy.A02(bitmap.getHeight() / 2);
                c8fy.A08.setAntiAlias(true);
                c8fy.invalidateSelf();
                gradientSpinnerAvatarView.setGradientSpinnerVisible(!z2);
                gradientSpinnerAvatarView.A0D(c8fy);
            }
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            gradientSpinnerAvatarView.setOnClickListener(onClickListener);
        }
        gradientSpinnerAvatarView.A07();
    }

    public final void A03(UserSession userSession, C34556FKq c34556FKq, User user) {
        C14360o3.A0B(userSession, 0);
        this.A00 = new C38E(this, userSession, new C38C(c34556FKq.A01));
        this.A01 = AbstractC166997dE.A0n();
        A00(null, null, null, userSession, null, this, c34556FKq, user, this.A0C, false);
    }

    public final void A04(ImageUrl imageUrl, View.OnClickListener onClickListener) {
        C14360o3.A0B(imageUrl, 0);
        A00(null, null, onClickListener, null, imageUrl, this, null, null, this.A0C, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A05(InterfaceC85983sV interfaceC85983sV, InterfaceC85983sV interfaceC85983sV2) {
        View view;
        View view2;
        C14360o3.A0B(interfaceC85983sV, 0);
        if ((interfaceC85983sV instanceof View) && (view = (View) interfaceC85983sV) != null) {
            int generateViewId = View.generateViewId();
            this.A02 = generateViewId;
            view.setId(generateViewId);
            LinearLayout linearLayout = this.A0D;
            linearLayout.removeAllViews();
            linearLayout.addView(view);
            linearLayout.setVisibility(0);
            if (interfaceC85983sV2 != 0 && (interfaceC85983sV2 instanceof View) && (view2 = (View) interfaceC85983sV2) != null) {
                this.A03 = R.id.secondary_right_add_on_button;
                view2.setId(R.id.secondary_right_add_on_button);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = AbstractC166987dD.A0C(AbstractC166997dE.A0L(this), 12);
                linearLayout.addView(view2, layoutParams);
            }
        }
    }

    public final void A06(CharSequence charSequence) {
        View view;
        int i = 0;
        if (charSequence != null && charSequence.length() != 0) {
            TextView textView = this.A0E;
            textView.setText(charSequence);
            textView.setVisibility(0);
            view = this.A07;
        } else {
            view = this.A0E;
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void A07(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            TextView textView = this.A06;
            textView.setText(charSequence);
            textView.setVisibility(0);
            return;
        }
        this.A06.setVisibility(8);
    }

    public final void A08(CharSequence charSequence, boolean z) {
        C14360o3.A0B(charSequence, 0);
        if (charSequence.length() > 0) {
            TextView textView = this.A05;
            textView.setText(charSequence);
            C85963sQ.A0B(textView, z);
            return;
        }
        throw AbstractC166987dD.A12("You must specify non-empty primary text.");
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "igds_people_cell_component";
    }

    public static /* synthetic */ void setImageViewInternal$default(IgdsPeopleCell igdsPeopleCell, boolean z, UserSession userSession, C34556FKq c34556FKq, ImageUrl imageUrl, Drawable drawable, View.OnClickListener onClickListener, Bitmap bitmap, boolean z2, User user, int i, Object obj) {
        boolean z3 = z2;
        Bitmap bitmap2 = bitmap;
        View.OnClickListener onClickListener2 = onClickListener;
        Drawable drawable2 = drawable;
        ImageUrl imageUrl2 = imageUrl;
        C34556FKq c34556FKq2 = c34556FKq;
        UserSession userSession2 = userSession;
        User user2 = null;
        if ((i & 2) != 0) {
            userSession2 = null;
        }
        if ((i & 4) != 0) {
            c34556FKq2 = null;
        }
        if ((i & 8) != 0) {
            imageUrl2 = null;
        }
        if ((i & 16) != 0) {
            drawable2 = null;
        }
        if ((i & 32) != 0) {
            onClickListener2 = null;
        }
        if ((i & 64) != 0) {
            bitmap2 = null;
        }
        if ((i & 128) != 0) {
            z3 = false;
        }
        if ((i & 256) == 0) {
            user2 = user;
        }
        A00(bitmap2, drawable2, onClickListener2, userSession2, imageUrl2, igdsPeopleCell, c34556FKq2, user2, z, z3);
    }

    public final void A01() {
        View view = this.A04;
        view.setBackgroundResource(0);
        this.A06.setVisibility(8);
        this.A08.setVisibility(8);
        this.A0E.setVisibility(8);
        this.A07.setVisibility(8);
        LinearLayout linearLayout = this.A0D;
        linearLayout.setVisibility(8);
        int i = this.A02;
        if (i != -1) {
            linearLayout.removeView(view.findViewById(i));
        }
        int i2 = this.A03;
        if (i2 != -1) {
            linearLayout.removeView(view.findViewById(i2));
        }
        this.A0A.setVisibility(8);
        this.A0B.setVisibility(8);
    }

    public final void A02(View.OnClickListener onClickListener, User user) {
        A08(user.getUsername(), user.isVerified());
        A07(user.getFullName());
        this.A09.setVisibility(AbstractC167007dF.A05(C6XI.A02(user) ? 1 : 0));
        A04(user.Bhu(), onClickListener);
    }

    public final IgLinearLayout getAdditionalLineContainer() {
        return this.A07;
    }

    public final IgSimpleImageView getAdditionalTextFacepiles() {
        return this.A08;
    }

    public final GradientSpinnerAvatarView getImageView() {
        return this.A0A;
    }

    public final TextView getPrimaryTextView() {
        return this.A05;
    }

    public final TextView getSecondaryTextView() {
        return this.A06;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener != null) {
            AbstractC31173DnH.A0z(getContext(), this.A04, R.drawable.menu_row_pressed_state);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        if (onLongClickListener != null) {
            AbstractC31173DnH.A0z(getContext(), this.A04, R.drawable.menu_row_pressed_state);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCell(Context context, boolean z) {
        this(context, null, 0, z);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCell(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A02 = -1;
        this.A03 = -1;
        View inflate = View.inflate(getContext(), R.layout.people_cell, this);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        if (inflate.getId() == -1) {
            inflate.setId(View.generateViewId());
        }
        AbstractC13880nE.A0m(inflate, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.abc_button_padding_horizontal_material, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.abc_button_padding_horizontal_material);
        this.A04 = inflate;
        this.A05 = AbstractC166987dD.A0e(inflate, R.id.primary_text);
        this.A0D = (LinearLayout) inflate.findViewById(R.id.add_on_container);
        this.A06 = AbstractC166987dD.A0e(inflate, R.id.secondary_text);
        this.A0E = AbstractC166987dD.A0e(inflate, R.id.additional_supporting_text);
        this.A0A = (GradientSpinnerAvatarView) inflate.findViewById(R.id.imageview);
        this.A08 = (IgSimpleImageView) inflate.findViewById(R.id.additional_text_facepiles);
        this.A07 = (IgLinearLayout) inflate.findViewById(R.id.additional_line_container);
        this.A0B = (StackedAvatarView) inflate.findViewById(R.id.stacked_avatar);
        this.A09 = AbstractC56372iV.A01(inflate.findViewById(R.id.internal_badge), false, false);
        inflate.findViewById(R.id.text_container).setImportantForAccessibility(1);
        inflate.setImportantForAccessibility(2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1Z, i, 0);
        C14360o3.A07(obtainStyledAttributes);
        try {
            this.A0C = obtainStyledAttributes.getBoolean(0, z);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ IgdsPeopleCell(Context context, AttributeSet attributeSet, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCell(Context context) {
        this(context, null, 0, false);
        C14360o3.A0B(context, 1);
    }
}
