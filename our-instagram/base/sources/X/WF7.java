package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes11.dex */
public abstract class WF7 {
    public static final void A01(TextView textView, int i, int i2) {
        int i3;
        Context context = textView.getContext();
        C2FP.A0A();
        switch (i) {
            case 0:
            case 36:
                i3 = R.style.FBPayUIPrimaryTextStyle;
                break;
            case 1:
                i3 = R.style.FBPayUIPrimaryTextStyle_Medium;
                break;
            case 2:
            case 20:
            case 27:
                i3 = R.style.FBPayUIPrimaryTextStyle_Deemphasized;
                break;
            case 3:
            case 9:
            case 11:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 16:
            case 17:
                i3 = R.style.FBPayUISecondaryTexStyle;
                break;
            case 4:
                i3 = R.style.FBPayUIButtonTexStyle;
                break;
            case 5:
                i3 = R.style.FBPayUIPrimaryTitleStyle;
                break;
            case 6:
                i3 = R.style.FBPayUIPrimaryTitleStyle_Deemphasized;
                break;
            case 7:
                i3 = R.style.FBPayUIPrimaryTitleStyle_Enlarged;
                break;
            case 8:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case Process.SIGSTOP /* 19 */:
            default:
                i3 = R.style.FBPayUISecondaryTexStyle_Medium;
                break;
            case 18:
                i3 = R.style.FBPayUIPrimaryTitleStyle_EnlargedHeader;
                break;
            case 21:
            case 22:
            case 25:
            case 34:
                throw AbstractC25230BEn.A0n("Invalid typography type: ", i);
            case 23:
            case 24:
                i3 = R.style.FBPayUISelectionButtonTextStyle;
                break;
            case 26:
                i3 = R.style.igds_emphasized_body_2;
                break;
            case 28:
                i3 = R.style.igds_headline_2_emphasized;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                i3 = R.style.igds_emphasized_label;
                break;
            case 30:
            case 33:
                i3 = R.style.PrivacyTextStyle;
                break;
            case 31:
                i3 = R.style.control_option_title_text;
                break;
            case 32:
                i3 = R.style.FBPayUIButtonTextEmphasizedStyle;
                break;
            case 35:
                i3 = R.style.FBPayUIFooterTexTStyle;
                break;
            case 37:
                i3 = R.style.FBPayUIPrimaryTextStyle_Enlarged;
                break;
            case 38:
                i3 = R.style.FBPayUIPrimaryTitleStyle_Enlarged_Elevated;
                break;
            case 39:
                i3 = R.style.FBPayUIBadgeIconTextStyle;
                break;
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case 44:
                i3 = R.style.FBPayUISecondaryTexStyle_Emphasized;
                break;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                i3 = R.style.FBPayUIOrderSummaryOrginalPriceStyle;
                break;
            case 43:
                i3 = R.style.FBPayUISecondaryTexStyle_Enlarged;
                break;
            case 45:
                i3 = R.style.FBPayUICheckoutOptionalityTextStyle;
                break;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC55922hc.A0i);
        textView.setTypeface(Typeface.create(obtainStyledAttributes.getString(4), obtainStyledAttributes.getInt(1, 0)));
        int i4 = obtainStyledAttributes.getInt(5, -1);
        if (i4 != -1) {
            textView.setTypeface(Typeface.create(textView.getTypeface(), i4, false));
        }
        textView.setTextSize(0, obtainStyledAttributes.getDimension(0, 0.0f));
        textView.setTextColor(C2FP.A0A().A02(context, i2));
        C2FP.A0A();
        textView.setLinkTextColor(context.getColor(R.color.igds_link));
        textView.setLineSpacing(obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getFloat(3, 1.0f));
        obtainStyledAttributes.recycle();
    }

    public static final void A03(TextView textView, CharSequence charSequence) {
        if (charSequence != null && !AbstractC001900j.A0T(charSequence)) {
            textView.setText(charSequence);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(4);
        }
    }

    public static final void A04(TextView textView, CharSequence charSequence) {
        if (charSequence != null && !AbstractC001900j.A0T(charSequence)) {
            textView.setText(charSequence);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    public static final void A00(TextView textView) {
        Context context = textView.getContext();
        C2FP.A0A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.FBPayUITextButtonBackground, AbstractC55922hc.A0d);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {android.R.attr.state_pressed};
        C2FP.A0A();
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            C2FP.A0A();
            AbstractC31173DnH.A0y(context, drawable, R.color.context_line_color);
            stateListDrawable.addState(iArr, drawable);
            stateListDrawable.addState(new int[]{-16842919}, null);
            int[] iArr2 = {android.R.attr.state_focused};
            C2FP.A0A();
            Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            if (drawable2 != null) {
                C2FP.A0A();
                AbstractC31173DnH.A0y(context, drawable2, R.color.context_line_color);
                stateListDrawable.addState(iArr2, drawable2);
                stateListDrawable.addState(new int[]{-16842908}, null);
                textView.setBackground(stateListDrawable);
                obtainStyledAttributes.recycle();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A02(TextView textView, VEP vep) {
        AbstractC167017dG.A1N(textView, vep);
        A01(textView, vep.A01, vep.A00);
    }
}
