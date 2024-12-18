package com.instagram.igds.components.megaphone;

import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC31172DnG;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.AnonymousClass773;
import X.C14360o3;
import X.C46067KaO;
import X.C57369PdT;
import X.C6R6;
import X.EnumC53118NeV;
import X.EnumC53136Nep;
import X.InterfaceC11380iw;
import X.InterfaceC16820sZ;
import X.JQ0;
import X.ViewOnClickListenerC48074LPz;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class IgdsPrismMegaphone extends LinearLayout implements InterfaceC11380iw {
    public View A00;
    public IgdsButton A01;
    public InterfaceC16820sZ A02;
    public InterfaceC11380iw A03;
    public IgSimpleImageView A04;
    public IgSimpleImageView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public CircularImageView A09;
    public CircularImageView A0A;
    public IgImageView A0B;
    public IgImageView A0C;
    public IgdsButton A0D;
    public IgdsMediaButton A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsPrismMegaphone(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        C14360o3.A0B(context, 1);
        this.A02 = C57369PdT.A00;
        View inflate = View.inflate(context, R.layout.igds_megaphone_layout, this);
        this.A00 = inflate;
        IgImageView A0a = AbstractC31172DnG.A0a(inflate, R.id.cancel_button);
        this.A0C = A0a;
        A0a.setOnClickListener(new ViewOnClickListenerC48074LPz(this, 63));
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) this.A00.findViewById(R.id.cancel_button_full_bleed);
        this.A0E = igdsMediaButton;
        igdsMediaButton.setOnClickListener(new ViewOnClickListenerC48074LPz(this, 64));
        CircularImageView circularImageView = (CircularImageView) this.A00.findViewById(R.id.igds_megaphone_profile_image);
        this.A09 = circularImageView;
        circularImageView.setVisibility(8);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) this.A00.findViewById(R.id.igds_megaphone_simple_image);
        this.A04 = igSimpleImageView;
        igSimpleImageView.setVisibility(8);
        IgImageView A0a2 = AbstractC31172DnG.A0a(this.A00, R.id.igds_megaphone_full_bleed_image);
        this.A0B = A0a2;
        A0a2.setVisibility(8);
        this.A0A = (CircularImageView) this.A00.findViewById(R.id.igds_megaphone_profile_image_right);
        this.A09.setVisibility(8);
        this.A05 = (IgSimpleImageView) this.A00.findViewById(R.id.igds_megaphone_simple_image_right);
        this.A04.setVisibility(8);
        this.A07 = AbstractC31172DnG.A0Y(this.A00, R.id.igds_megaphone_headline);
        IgTextView A0Y = AbstractC31172DnG.A0Y(this.A00, R.id.igds_megaphone_body);
        this.A06 = A0Y;
        A0Y.setVisibility(8);
        IgTextView A0Y2 = AbstractC31172DnG.A0Y(this.A00, R.id.igds_megaphone_supporting_text);
        this.A08 = A0Y2;
        A0Y2.setVisibility(8);
        this.A01 = (IgdsButton) this.A00.findViewById(R.id.igds_megaphone_primary_button);
        IgdsButton igdsButton = (IgdsButton) this.A00.findViewById(R.id.igds_megaphone_secondary_button);
        this.A0D = igdsButton;
        igdsButton.setVisibility(8);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1Y, i, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                String A00 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 4);
                String A002 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 0);
                EnumC53118NeV enumC53118NeV = EnumC53118NeV.values()[obtainStyledAttributes.getInt(2, 0)];
                EnumC53136Nep enumC53136Nep = EnumC53136Nep.values()[obtainStyledAttributes.getInt(3, 0)];
                if (A00 != null) {
                    setHeadline(A00);
                }
                if (A002 != null) {
                    setBody(A002);
                }
                if (resourceId != 0 && (drawable = context.getDrawable(resourceId)) != null) {
                    setIllustrationDrawable(drawable, enumC53118NeV, enumC53136Nep);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "IgdsPrismMegaphone";
    }

    public final void setBody(String str) {
        C14360o3.A0B(str, 0);
        IgTextView igTextView = this.A06;
        igTextView.setText(str);
        igTextView.setVisibility(0);
    }

    public final void setDismissListener(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        this.A02 = interfaceC16820sZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.6cX, java.lang.Object] */
    public final void setFullBleedImage(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        IgImageView igImageView = this.A0B;
        igImageView.setVisibility(0);
        igImageView.setImageDrawable(drawable);
        this.A0C.setVisibility(8);
        IgdsMediaButton igdsMediaButton = this.A0E;
        igdsMediaButton.setVisibility(0);
        ?? obj = new Object();
        obj.A00 = R.drawable.instagram_x_pano_outline_12;
        igdsMediaButton.setStartAddOn(obj, getContext().getString(2131966157));
    }

    public final void setHeadline(String str) {
        C14360o3.A0B(str, 0);
        this.A07.setText(str);
    }

    public final void setIllustrationDrawable(Drawable drawable, EnumC53118NeV enumC53118NeV, EnumC53136Nep enumC53136Nep) {
        IgSimpleImageView igSimpleImageView;
        Resources resources;
        int i;
        int dimensionPixelSize;
        C14360o3.A0B(drawable, 0);
        if (enumC53118NeV == EnumC53118NeV.A02) {
            igSimpleImageView = this.A05;
        } else {
            igSimpleImageView = this.A04;
        }
        igSimpleImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        igSimpleImageView.setImageDrawable(drawable);
        igSimpleImageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        if (layoutParams != null && enumC53136Nep != null) {
            int ordinal = enumC53136Nep.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        Resources resources2 = getResources();
                        layoutParams.width = resources2.getDimensionPixelSize(R.dimen.avatar_size_coin_flip_expanded_view);
                        dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.achievements_achievement_image_size);
                        layoutParams.height = dimensionPixelSize;
                        igSimpleImageView.setLayoutParams(layoutParams);
                    }
                } else {
                    resources = getResources();
                    i = R.dimen.achievements_achievement_image_size;
                }
            } else {
                resources = getResources();
                i = R.dimen.container_height;
            }
            dimensionPixelSize = resources.getDimensionPixelSize(i);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            igSimpleImageView.setLayoutParams(layoutParams);
        }
        igSimpleImageView.setAdjustViewBounds(true);
    }

    public final void setPrimaryButton(String str, View.OnClickListener onClickListener) {
        C14360o3.A0B(str, 0);
        IgdsButton igdsButton = this.A01;
        igdsButton.setText(str);
        igdsButton.setOnClickListener(onClickListener);
    }

    public final void setProfileImage(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw, EnumC53118NeV enumC53118NeV) {
        CircularImageView circularImageView;
        C14360o3.A0B(imageUrl, 0);
        if (enumC53118NeV == EnumC53118NeV.A02) {
            circularImageView = this.A0A;
        } else {
            circularImageView = this.A09;
        }
        circularImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        circularImageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = circularImageView.getLayoutParams();
        if (layoutParams != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            circularImageView.setLayoutParams(layoutParams);
        }
        if (interfaceC11380iw == null) {
            interfaceC11380iw = this;
        }
        circularImageView.setUrl(imageUrl, interfaceC11380iw);
        circularImageView.setAdjustViewBounds(true);
    }

    public final void setSecondaryButton(String str, View.OnClickListener onClickListener) {
        C14360o3.A0B(str, 0);
        IgdsButton igdsButton = this.A0D;
        igdsButton.setText(str);
        igdsButton.setOnClickListener(onClickListener);
        igdsButton.setVisibility(0);
    }

    public final void setSupportingText(String str, String str2, View.OnClickListener onClickListener) {
        IgTextView igTextView;
        C14360o3.A0B(str, 0);
        if (str2 != null && onClickListener != null) {
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
            AnonymousClass773.A05(A0H, new C46067KaO(onClickListener, AbstractC167007dF.A09(getContext(), R.attr.igds_color_link)), str2);
            igTextView = this.A08;
            igTextView.setText(A0H, TextView.BufferType.SPANNABLE);
            igTextView.setMovementMethod(C6R6.A00);
        } else {
            igTextView = this.A08;
            igTextView.setText(str);
        }
        igTextView.setVisibility(0);
    }

    public static /* synthetic */ void setIllustrationDrawable$default(IgdsPrismMegaphone igdsPrismMegaphone, Drawable drawable, EnumC53118NeV enumC53118NeV, EnumC53136Nep enumC53136Nep, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC53118NeV = EnumC53118NeV.A03;
        }
        if ((i & 4) != 0) {
            enumC53136Nep = EnumC53136Nep.A04;
        }
        igdsPrismMegaphone.setIllustrationDrawable(drawable, enumC53118NeV, enumC53136Nep);
    }

    public static /* synthetic */ void setProfileImage$default(IgdsPrismMegaphone igdsPrismMegaphone, ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw, EnumC53118NeV enumC53118NeV, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC11380iw = null;
        }
        if ((i & 4) != 0) {
            enumC53118NeV = EnumC53118NeV.A03;
        }
        igdsPrismMegaphone.setProfileImage(imageUrl, interfaceC11380iw, enumC53118NeV);
    }

    public static /* synthetic */ void setSupportingText$default(IgdsPrismMegaphone igdsPrismMegaphone, String str, String str2, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            onClickListener = null;
        }
        igdsPrismMegaphone.setSupportingText(str, str2, onClickListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsPrismMegaphone(Context context, InterfaceC11380iw interfaceC11380iw) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
        this.A03 = interfaceC11380iw;
    }

    public final void setProfileImage(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(imageUrl, 0);
        setProfileImage(imageUrl, interfaceC11380iw, EnumC53118NeV.A03);
    }

    public /* synthetic */ IgdsPrismMegaphone(Context context, InterfaceC11380iw interfaceC11380iw, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : interfaceC11380iw);
    }

    public final void setProfileImage(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        setProfileImage(imageUrl, null, EnumC53118NeV.A03);
    }

    public /* synthetic */ IgdsPrismMegaphone(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsPrismMegaphone(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsPrismMegaphone(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
