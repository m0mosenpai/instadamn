package com.instagram.igds.components.headline;

import X.AbstractC13880nE;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AbstractC56862jK;
import X.AbstractC56932jR;
import X.AbstractC56952jT;
import X.C05F;
import X.C14360o3;
import X.C14640oc;
import X.C153256uu;
import X.C57012jc;
import X.EnumC153266uv;
import X.EnumC99704do;
import X.InterfaceC11380iw;
import X.InterfaceC73023Pd;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.facepile.IgdsFacepile;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public class IgdsHeadline extends ConstraintLayout implements InterfaceC11380iw {
    public C57012jc A00;
    public EnumC153266uv A01;
    public boolean A02;
    public Integer[] A03;
    public C57012jc A04;
    public C57012jc A05;
    public C57012jc A06;
    public C57012jc A07;
    public C57012jc A08;
    public final boolean A09;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsHeadline(Context context) {
        this(context, null, 0, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "igds_headline_component";
    }

    public final void setBody(int i) {
        A08(R.id.igds_headline_body, i);
        View requireViewById = requireViewById(R.id.igds_headline_body);
        C14360o3.A07(requireViewById);
        requireViewById.setOnClickListener(null);
    }

    public final void setCircularImageBitmap(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        A01(this, null).setImageBitmap(bitmap);
    }

    public final void setCircularImageDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        A01(this, null).setImageDrawable(drawable);
    }

    public final void setCircularImageUrl(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        A01(this, null).setUrl(imageUrl, this);
    }

    public final void setFacepile(List list) {
        setFacepile(list, null);
    }

    public final void setImageBitmap(Bitmap bitmap, InterfaceC73023Pd interfaceC73023Pd) {
        C14360o3.A0B(bitmap, 0);
        A02(interfaceC73023Pd).setImageBitmap(bitmap);
    }

    public final void setImageResource(int i) {
        EW2(i, false);
    }

    public final void setImageURL(ImageUrl imageUrl) {
        setImageURL(imageUrl, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r7.A02 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setRoundedCornerImageUrl(com.instagram.common.typedurl.ImageUrl r8, X.InterfaceC11380iw r9) {
        /*
            r7 = this;
            r5 = 0
            X.C14360o3.A0B(r8, r5)
            X.2jc r2 = r7.A00
            android.view.View r0 = r2.A00
            if (r0 != 0) goto L14
            android.view.ViewStub r1 = r2.A01
            if (r1 == 0) goto L14
            r0 = 2131626075(0x7f0e085b, float:1.8879376E38)
            r1.setLayoutResource(r0)
        L14:
            android.view.View r3 = r2.A01()
            X.C14360o3.A07(r3)
            r3.setVisibility(r5)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            if (r4 == 0) goto L73
            boolean r0 = r7 instanceof X.C153256uu
            if (r0 != 0) goto L31
            boolean r0 = r7.A09
            if (r0 == 0) goto L31
            boolean r0 = r7.A02
            r2 = 1
            if (r0 == 0) goto L32
        L31:
            r2 = 0
        L32:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165281(0x7f070061, float:1.7944775E38)
            if (r2 == 0) goto L3e
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
        L3e:
            int r0 = r1.getDimensionPixelSize(r0)
            r4.width = r0
            r4.height = r0
            r3.setLayoutParams(r4)
            java.lang.Integer[] r6 = r7.A03
            if (r6 == 0) goto L73
            boolean r0 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L73
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            if (r4 == 0) goto L73
            r0 = r6[r5]
            int r5 = r0.intValue()
            r0 = 1
            r0 = r6[r0]
            int r2 = r0.intValue()
            r0 = 2
            r0 = r6[r0]
            int r1 = r0.intValue()
            r0 = 3
            r0 = r6[r0]
            int r0 = r0.intValue()
            r4.setMargins(r5, r2, r1, r0)
        L73:
            r7.A03()
            r7.A07()
            r7.A04()
            r7.A06()
            r0 = 2131434275(0x7f0b1b23, float:1.849036E38)
            android.view.View r0 = r3.requireViewById(r0)
            X.C14360o3.A07(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            if (r9 != 0) goto L8e
            r9 = r7
        L8e:
            r0.setUrl(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.headline.IgdsHeadline.setRoundedCornerImageUrl(com.instagram.common.typedurl.ImageUrl, X.0iw):void");
    }

    public final void setType(EnumC153266uv enumC153266uv) {
        C14360o3.A0B(enumC153266uv, 0);
        this.A01 = enumC153266uv;
        if (enumC153266uv.A00 == 1) {
            Context context = getContext();
            A09(R.id.igds_headline_headline, AbstractC53242c7.A0A(context));
            A09(R.id.igds_headline_emphasized_headline, AbstractC53242c7.A0A(context));
            A09(R.id.igds_headline_body, AbstractC53242c7.A0A(context));
            A09(R.id.igds_headline_detail_text, AbstractC53242c7.A0A(context));
            if (!(this instanceof C153256uu) && this.A09) {
                View requireViewById = requireViewById(R.id.igds_headline_primary_action_button);
                C14360o3.A07(requireViewById);
                ((IgdsButton) requireViewById).setStyle(EnumC99704do.A05);
                View requireViewById2 = requireViewById(R.id.igds_headline_secondary_action_text_button);
                C14360o3.A07(requireViewById2);
                ((IgdsButton) requireViewById2).setTextColor(context.getColor(AbstractC53242c7.A0A(context)));
                return;
            }
            A09(R.id.igds_headline_link, AbstractC53242c7.A0A(context));
        }
    }

    public static final ImageView A00(IgdsHeadline igdsHeadline) {
        ViewStub viewStub;
        C57012jc c57012jc = igdsHeadline.A07;
        if (c57012jc.A00 == null && (viewStub = c57012jc.A01) != null) {
            viewStub.setLayoutResource(R.layout.igds_headline_image);
        }
        ImageView imageView = (ImageView) c57012jc.A01();
        imageView.setVisibility(0);
        if (!(igdsHeadline instanceof C153256uu) && igdsHeadline.A09 && !igdsHeadline.A02 && igdsHeadline.A01 != EnumC153266uv.A05) {
            Resources resources = igdsHeadline.getResources();
            imageView.setMaxHeight(resources.getDimensionPixelSize(R.dimen.action_button_settings_height));
            imageView.setMaxWidth(resources.getDimensionPixelSize(R.dimen.action_button_settings_height));
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Integer[] numArr = igdsHeadline.A03;
            if (numArr != null) {
                marginLayoutParams.setMargins(numArr[0].intValue(), numArr[1].intValue(), numArr[2].intValue(), numArr[3].intValue());
            }
            imageView.setLayoutParams(marginLayoutParams);
            igdsHeadline.A05();
            igdsHeadline.A03();
            igdsHeadline.A04();
            igdsHeadline.A07();
            return imageView;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final CircularImageView A01(IgdsHeadline igdsHeadline, Integer num) {
        Resources resources;
        int intValue;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewStub viewStub;
        C57012jc c57012jc = igdsHeadline.A05;
        if (c57012jc.A00 == null && (viewStub = c57012jc.A01) != null) {
            viewStub.setLayoutResource(R.layout.igds_headline_circular_image);
        }
        View A01 = c57012jc.A01();
        C14360o3.A07(A01);
        CircularImageView circularImageView = (CircularImageView) A01;
        circularImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        circularImageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = circularImageView.getLayoutParams();
        if (layoutParams != null) {
            if (!(igdsHeadline instanceof C153256uu) && igdsHeadline.A09 && !igdsHeadline.A02 && igdsHeadline.A01 != EnumC153266uv.A05) {
                resources = igdsHeadline.getResources();
                intValue = R.dimen.action_button_settings_height;
            } else {
                resources = igdsHeadline.getResources();
                if (num == null) {
                    intValue = R.dimen.appreciation_reels_grid_item_width;
                } else {
                    intValue = num.intValue();
                }
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(intValue);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            Integer[] numArr = igdsHeadline.A03;
            if (numArr != null && (layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMargins(numArr[0].intValue(), numArr[1].intValue(), numArr[2].intValue(), numArr[3].intValue());
            }
            circularImageView.setLayoutParams(layoutParams);
        }
        igdsHeadline.A05();
        igdsHeadline.A07();
        igdsHeadline.A04();
        igdsHeadline.A06();
        return circularImageView;
    }

    private final IgImageView A02(InterfaceC73023Pd interfaceC73023Pd) {
        ViewStub viewStub;
        C57012jc c57012jc = this.A08;
        if (c57012jc.A00 == null && (viewStub = c57012jc.A01) != null) {
            viewStub.setLayoutResource(R.layout.igds_headline_url_image);
        }
        View A01 = c57012jc.A01();
        C14360o3.A07(A01);
        IgImageView igImageView = (IgImageView) A01;
        igImageView.setId(R.id.igds_headline_url_image);
        igImageView.setVisibility(0);
        if (interfaceC73023Pd != null) {
            igImageView.A0E = interfaceC73023Pd;
        }
        if (!(this instanceof C153256uu) && this.A09 && !this.A02) {
            Resources resources = getResources();
            igImageView.setMaxHeight(resources.getDimensionPixelSize(R.dimen.action_button_settings_height));
            igImageView.setMaxWidth(resources.getDimensionPixelSize(R.dimen.action_button_settings_height));
        }
        ViewGroup.LayoutParams layoutParams = igImageView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Integer[] numArr = this.A03;
            if (numArr != null) {
                marginLayoutParams.setMargins(numArr[0].intValue(), numArr[1].intValue(), numArr[2].intValue(), numArr[3].intValue());
            }
            igImageView.setLayoutParams(marginLayoutParams);
            A05();
            A03();
            A04();
            A06();
            return igImageView;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    private final void A03() {
        C57012jc c57012jc = this.A05;
        if (c57012jc.A00 != null) {
            c57012jc.A01().setVisibility(8);
        }
    }

    private final void A04() {
        C57012jc c57012jc = this.A06;
        if (c57012jc.A00 != null) {
            c57012jc.A01().setVisibility(8);
        }
    }

    private final void A05() {
        C57012jc c57012jc = this.A00;
        if (c57012jc.A00 != null) {
            c57012jc.A01().setVisibility(8);
        }
    }

    private final void A06() {
        if (this.A07.A00 != null) {
            this.A06.A01().setVisibility(8);
        }
    }

    private final void A07() {
        C57012jc c57012jc = this.A08;
        if (c57012jc.A00 != null) {
            c57012jc.A01().setVisibility(8);
        }
    }

    public static /* synthetic */ void setCircularImageUrl$default(IgdsHeadline igdsHeadline, ImageUrl imageUrl, String str, InterfaceC11380iw interfaceC11380iw, Integer num, View.OnClickListener onClickListener, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                interfaceC11380iw = null;
            }
            if ((i & 8) != 0) {
                num = null;
            }
            if ((i & 16) != 0) {
                onClickListener = null;
            }
            igdsHeadline.setCircularImageUrl(imageUrl, str, interfaceC11380iw, num, onClickListener);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCircularImageUrl");
    }

    public static /* synthetic */ void setCustomImageMargin$default(IgdsHeadline igdsHeadline, int i, int i2, int i3, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                i = 0;
            }
            if ((i5 & 2) != 0) {
                i2 = 0;
            }
            if ((i5 & 4) != 0) {
                i3 = 0;
            }
            if ((i5 & 8) != 0) {
                i4 = 0;
            }
            igdsHeadline.A0E(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCustomImageMargin");
    }

    public static /* synthetic */ void setFacepile$default(IgdsHeadline igdsHeadline, List list, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = null;
            }
            igdsHeadline.setFacepile(list, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFacepile");
    }

    public static /* synthetic */ void setHeadline$default(IgdsHeadline igdsHeadline, CharSequence charSequence, View.OnClickListener onClickListener, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                onClickListener = null;
            }
            igdsHeadline.setHeadline(charSequence, onClickListener);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeadline");
    }

    public static /* synthetic */ void setImageURL$default(IgdsHeadline igdsHeadline, ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw, InterfaceC73023Pd interfaceC73023Pd, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                interfaceC11380iw = null;
            }
            if ((i & 4) != 0) {
                interfaceC73023Pd = null;
            }
            igdsHeadline.setImageURL(imageUrl, interfaceC11380iw, interfaceC73023Pd);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setImageURL");
    }

    public static /* synthetic */ void setRoundedCornerImageUrl$default(IgdsHeadline igdsHeadline, ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                interfaceC11380iw = null;
            }
            igdsHeadline.setRoundedCornerImageUrl(imageUrl, interfaceC11380iw);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRoundedCornerImageUrl");
    }

    public final void CMY() {
        C57012jc c57012jc = this.A07;
        if (c57012jc.A00 != null) {
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            A01.setVisibility(8);
        }
    }

    public final void EPC(View.OnClickListener onClickListener, int i) {
        if (!(this instanceof C153256uu) && this.A09) {
            setPrimaryActionButton(getContext().getString(i), true, onClickListener);
            return;
        }
        A08(R.id.igds_headline_link, i);
        View requireViewById = requireViewById(R.id.igds_headline_link);
        C14360o3.A07(requireViewById);
        requireViewById.setOnClickListener(onClickListener);
    }

    public final int getHeadlineId() {
        if (!this.A02) {
            return R.id.igds_headline_headline;
        }
        return R.id.igds_headline_emphasized_headline;
    }

    public final void setAction(String str, View.OnClickListener onClickListener) {
        if (!(this instanceof C153256uu) && this.A09) {
            setPrimaryActionButton(str, true, onClickListener);
            return;
        }
        A0A(R.id.igds_headline_link, str);
        View requireViewById = requireViewById(R.id.igds_headline_link);
        C14360o3.A07(requireViewById);
        requireViewById.setOnClickListener(onClickListener);
    }

    public final void setBulletList(List list) {
        View A01 = this.A04.A01();
        C14360o3.A07(A01);
        ViewGroup viewGroup = (ViewGroup) A01;
        viewGroup.removeAllViews();
        if (list != null && !list.isEmpty()) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
            if (list == null) {
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView((View) it.next());
        }
    }

    public final void setSecondaryActionTextButton(String str, View.OnClickListener onClickListener) {
        if (!(this instanceof C153256uu) && this.A09) {
            View requireViewById = requireViewById(R.id.igds_headline_secondary_action_text_button);
            C14360o3.A07(requireViewById);
            IgdsButton igdsButton = (IgdsButton) requireViewById;
            igdsButton.setVisibility(0);
            igdsButton.setOnClickListener(onClickListener);
            igdsButton.setText(str);
        }
    }

    private final void A08(int i, int i2) {
        int i3;
        View requireViewById = requireViewById(i);
        C14360o3.A07(requireViewById);
        TextView textView = (TextView) requireViewById;
        if (i2 != 0) {
            A0B(textView, i);
            textView.setText(i2);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(textView.getContext().getColor(R.color.fds_transparent));
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    private final void A09(int i, int i2) {
        View requireViewById = requireViewById(i);
        C14360o3.A07(requireViewById);
        Context context = getContext();
        ((TextView) requireViewById).setTextColor(context.getColor(i2));
        View requireViewById2 = requireViewById(i);
        C14360o3.A07(requireViewById2);
        ((TextView) requireViewById2).setShadowLayer(getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right), 0.0f, 0.0f, context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_shadow_on_media)));
    }

    private final void A0A(int i, CharSequence charSequence) {
        View requireViewById = requireViewById(i);
        C14360o3.A07(requireViewById);
        TextView textView = (TextView) requireViewById;
        if (charSequence != null && charSequence.length() != 0) {
            A0B(textView, i);
            textView.setText(charSequence);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(textView.getContext().getColor(R.color.fds_transparent));
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public static final void A0B(TextView textView, int i) {
        if (i != R.id.igds_headline_headline && i != R.id.igds_headline_emphasized_headline && i != R.id.igds_headline_body) {
            if (i == R.id.igds_headline_link) {
                AbstractC56952jT.A04(textView, C05F.A01);
                return;
            }
            return;
        }
        textView.setImportantForAccessibility(1);
    }

    public final void A0D() {
        if (AbstractC56862jK.A00(getContext())) {
            boolean z = this.A02;
            int i = R.id.igds_headline_headline;
            if (z) {
                i = R.id.igds_headline_emphasized_headline;
            }
            View requireViewById = requireViewById(i);
            C14360o3.A0A(requireViewById);
            requireViewById.setImportantForAccessibility(1);
            AbstractC56932jR.A03(requireViewById);
            View requireViewById2 = requireViewById(R.id.igds_headline_body);
            C14360o3.A07(requireViewById2);
            requireViewById2.setImportantForAccessibility(1);
        }
    }

    public final void A0E(int i, int i2, int i3, int i4) {
        this.A03 = new Integer[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
    }

    public final void EW2(int i, boolean z) {
        int i2;
        ImageView A00 = A00(this);
        A00.setImageResource(i);
        int i3 = this.A01.A00;
        Context context = getContext();
        if (i3 == 1) {
            i2 = R.color.audio_bar_action_color_enabled;
        } else if (z) {
            i2 = AbstractC53242c7.A0H(context, R.attr.igdsPrimaryIcon);
        } else {
            i2 = R.color.fds_transparent;
        }
        A00.setColorFilter(context.getColor(i2));
    }

    public final void setDetailText(int i) {
        A08(R.id.igds_headline_detail_text, i);
    }

    public final void setHeadline(int i) {
        A08(getHeadlineId(), i);
    }

    public final void setImageDrawable(Drawable drawable) {
        A00(this).setImageDrawable(drawable);
    }

    public final void setPrimaryActionButton(String str, boolean z, View.OnClickListener onClickListener) {
        EnumC99704do enumC99704do;
        View requireViewById = requireViewById(R.id.igds_headline_primary_action_button);
        C14360o3.A07(requireViewById);
        IgdsButton igdsButton = (IgdsButton) requireViewById;
        if (str != null && str.length() != 0) {
            igdsButton.setVisibility(0);
            igdsButton.setOnClickListener(onClickListener);
            igdsButton.setText(str);
            if (z) {
                enumC99704do = EnumC99704do.A03;
            } else {
                enumC99704do = EnumC99704do.A06;
            }
            igdsButton.setStyle(enumC99704do);
            return;
        }
        igdsButton.setVisibility(8);
    }

    public final void setIsEmphasized(boolean z) {
        this.A02 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsHeadline(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setBody(CharSequence charSequence) {
        setBody(charSequence, null);
    }

    public final void setCircularImageUrl(ImageUrl imageUrl, String str, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(imageUrl, 0);
        setCircularImageUrl(imageUrl, str, interfaceC11380iw, null, null);
    }

    public final void setDetailText(CharSequence charSequence) {
        A0A(R.id.igds_headline_detail_text, charSequence);
    }

    public final void setFacepile(List list, String str) {
        ViewStub viewStub;
        C57012jc c57012jc = this.A06;
        if (c57012jc.A00 == null && (viewStub = c57012jc.A01) != null) {
            viewStub.setLayoutResource(R.layout.dialog_facepile);
        }
        View A01 = c57012jc.A01();
        C14360o3.A07(A01);
        IgdsFacepile igdsFacepile = (IgdsFacepile) A01;
        if (list != null) {
            if (str == null) {
                str = "igds_headline_component";
            }
            igdsFacepile.setImageUris(list, str);
        }
        igdsFacepile.setVisibility(0);
        A05();
        A03();
        A06();
        A07();
    }

    public final void setHeadline(CharSequence charSequence) {
        setHeadline(charSequence, null);
    }

    public final void setImageURL(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw, InterfaceC73023Pd interfaceC73023Pd) {
        if (imageUrl != null) {
            IgImageView A02 = A02(interfaceC73023Pd);
            if (interfaceC11380iw == null) {
                interfaceC11380iw = this;
            }
            A02.setUrl(imageUrl, interfaceC11380iw);
        }
    }

    public final void setBody(CharSequence charSequence, View.OnClickListener onClickListener) {
        A0A(R.id.igds_headline_body, charSequence);
        View requireViewById = requireViewById(R.id.igds_headline_body);
        C14360o3.A07(requireViewById);
        requireViewById.setOnClickListener(onClickListener);
    }

    public final void setCircularImageUrl(ImageUrl imageUrl, String str, InterfaceC11380iw interfaceC11380iw, Integer num) {
        C14360o3.A0B(imageUrl, 0);
        setCircularImageUrl(imageUrl, str, interfaceC11380iw, num, null);
    }

    public final void setHeadline(CharSequence charSequence, View.OnClickListener onClickListener) {
        A0A(getHeadlineId(), charSequence);
        if (onClickListener != null) {
            View requireViewById = requireViewById(getHeadlineId());
            C14360o3.A07(requireViewById);
            requireViewById.setOnClickListener(onClickListener);
        }
    }

    public final void setImageURL(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        setImageURL(imageUrl, interfaceC11380iw, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsHeadline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        EnumC153266uv enumC153266uv = EnumC153266uv.A03;
        this.A01 = enumC153266uv;
        boolean A0A = C14640oc.A0A();
        this.A09 = A0A;
        View inflate = View.inflate(context, this instanceof C153256uu ? false : A0A ? R.layout.igds_promotional_headline_layout : R.layout.igds_headline_layout, this);
        View findViewById = inflate.findViewById(R.id.igds_headline_url_image_viewstub);
        this.A08 = new C57012jc(findViewById instanceof ViewStub ? (ViewStub) findViewById : null);
        View findViewById2 = inflate.findViewById(R.id.igds_headline_circular_image_viewstub);
        this.A05 = new C57012jc(findViewById2 instanceof ViewStub ? (ViewStub) findViewById2 : null);
        View findViewById3 = inflate.findViewById(R.id.igds_headline_rounded_corner_image_container_viewstub);
        this.A00 = new C57012jc(findViewById3 instanceof ViewStub ? (ViewStub) findViewById3 : null);
        View findViewById4 = inflate.findViewById(R.id.igds_headline_simple_image_viewstub);
        this.A07 = new C57012jc(findViewById4 instanceof ViewStub ? (ViewStub) findViewById4 : null);
        View findViewById5 = inflate.findViewById(R.id.igds_headline_facepile_viewstub);
        this.A06 = new C57012jc(findViewById5 instanceof ViewStub ? (ViewStub) findViewById5 : null);
        View findViewById6 = inflate.findViewById(R.id.igds_headline_bullet_list_container_stub);
        this.A04 = new C57012jc(findViewById6 instanceof ViewStub ? (ViewStub) findViewById6 : null);
        int A04 = (int) AbstractC13880nE.A04(context, 32);
        setPadding(A04, A04, A04, A04);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1S);
            C14360o3.A07(obtainStyledAttributes);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                EW2(resourceId, false);
            }
            this.A02 = obtainStyledAttributes.getBoolean(5, false);
            int i3 = obtainStyledAttributes.getInt(6, 0);
            if (i3 != 0) {
                if (i3 == 1) {
                    enumC153266uv = EnumC153266uv.A04;
                } else if (i3 == 2) {
                    enumC153266uv = EnumC153266uv.A05;
                }
            }
            setHeadline(obtainStyledAttributes.getResourceId(2, 0));
            A08(R.id.igds_headline_body, obtainStyledAttributes.getResourceId(0, 0));
            A08(R.id.igds_headline_detail_text, obtainStyledAttributes.getResourceId(1, 0));
            obtainStyledAttributes.recycle();
            setType(enumC153266uv);
        }
    }

    public /* synthetic */ IgdsHeadline(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public final void setCircularImageUrl(ImageUrl imageUrl, String str, InterfaceC11380iw interfaceC11380iw, Integer num, View.OnClickListener onClickListener) {
        C14360o3.A0B(imageUrl, 0);
        CircularImageView A01 = A01(this, num);
        if (interfaceC11380iw == null) {
            interfaceC11380iw = this;
        }
        A01.setUrl(imageUrl, interfaceC11380iw);
        if (str != null) {
            A01.setContentDescription(getContext().getString(2131963473, str));
        }
        if (onClickListener != null) {
            A01.setOnClickListener(onClickListener);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsHeadline(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setCircularImageUrl(ImageUrl imageUrl, String str) {
        C14360o3.A0B(imageUrl, 0);
        setCircularImageUrl(imageUrl, str, null, null, null);
    }
}
