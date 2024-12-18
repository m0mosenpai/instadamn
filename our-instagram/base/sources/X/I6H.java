package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;

/* loaded from: classes7.dex */
public abstract class I6H {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.CharSequence] */
    public static final void A00(C38628GyV c38628GyV, C38052Gof c38052Gof, InterfaceC11380iw interfaceC11380iw, InterfaceC43387JFc interfaceC43387JFc, C38506GwR c38506GwR, ID7 id7, C41643IbZ c41643IbZ, String str, boolean z, boolean z2) {
        boolean z3;
        ?? r14;
        ?? r1;
        TextView textView;
        Integer num;
        C14360o3.A0B(c38506GwR, 0);
        AbstractC167027dH.A0a(1, c41643IbZ, interfaceC11380iw, interfaceC43387JFc, str);
        C41037IFg c41037IFg = c41643IbZ.A01().A02;
        if (c41037IFg != null) {
            ProductDetailsProductItemDict productDetailsProductItemDict = c41037IFg.A01;
            if (productDetailsProductItemDict != null) {
                Product A01 = AbstractC38048Gob.A01(productDetailsProductItemDict);
                ImageInfo imageInfo = A01.A07;
                String str2 = "";
                if (imageInfo != null) {
                    RoundedCornerImageView roundedCornerImageView = c38506GwR.A05;
                    ImageUrl A012 = AbstractC40161tk.A01(AbstractC166997dE.A0L(roundedCornerImageView), imageInfo);
                    if (A012 == null) {
                        A012 = AbstractC25225BEi.A0t("");
                    }
                    roundedCornerImageView.setUrl(A012, interfaceC11380iw);
                }
                View view = c38506GwR.A00;
                Context context = view.getContext();
                C41038IFh c41038IFh = c41037IFg.A00;
                if (c41038IFh != null) {
                    z3 = AbstractC166997dE.A1Z(c41038IFh.A00, true);
                } else {
                    z3 = false;
                }
                C41626IbH c41626IbH = C41626IbH.A01;
                RoundedCornerImageView roundedCornerImageView2 = c38506GwR.A05;
                c41626IbH.A01(roundedCornerImageView2, A01);
                TextView textView2 = c38506GwR.A03;
                String str3 = A01.A0J;
                textView2.setText(str3);
                if (z3 && z2) {
                    TextView textView3 = c38506GwR.A02;
                    textView3.setText(2131973958);
                    textView = textView3;
                } else {
                    if (!A01.A0Q) {
                        SpannableString spannableString = new SpannableString(context.getString(2131965052));
                        spannableString.setSpan(new ForegroundColorSpan(AbstractC31174DnI.A02(context)), 0, spannableString.length(), 33);
                        r1 = AbstractC31175DnJ.A05(context, 2131971160);
                        r1.append(" ").append((CharSequence) spannableString);
                        r14 = c38506GwR.A02;
                    } else {
                        r14 = c38506GwR.A02;
                        C14360o3.A0A(context);
                        C14360o3.A0B(context, 1);
                        ProductReviewStatus productReviewStatus = A01.A05;
                        ProductReviewStatus productReviewStatus2 = ProductReviewStatus.A04;
                        if (productReviewStatus != productReviewStatus2 && productReviewStatus != ProductReviewStatus.A07) {
                            r1 = AbstractC1566271k.A01(context, A01, R.style.PendingReviewSubtitleStyle, R.style.AuthErrorTextAppearance);
                        } else {
                            r1 = AbstractC1566271k.A08(context, A01, null, null);
                        }
                        if (productReviewStatus == productReviewStatus2 && A01.A04() && !A01.A0P) {
                            r1 = AbstractC31175DnJ.A05(context, 2131970008).append((CharSequence) " ").append((CharSequence) "·").append((CharSequence) " ").append(r1);
                        }
                    }
                    r14.setText(r1);
                    textView = r14;
                }
                String str4 = str2;
                if (c41038IFh != null) {
                    String str5 = c41038IFh.A01;
                    str4 = str2;
                    if (str5 != null) {
                        ?? spannableString2 = new SpannableString(AbstractC31177DnL.A0b(context, str5, 2131974010));
                        C13680mu.A02(spannableString2, str5, context.getColor(R.color.grey_2));
                        C13680mu.A02(spannableString2, str, context.getColor(R.color.grey_5));
                        str4 = spannableString2;
                    }
                }
                ((TextView) c38506GwR.A07.getView()).setText(str4);
                if (!A01.A0Q) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                int A03 = AbstractC31174DnI.A03(context);
                int A013 = AbstractC31174DnI.A01(context);
                int intValue = num.intValue();
                View view2 = c38506GwR.A01;
                if (intValue != 1) {
                    view2.setVisibility(8);
                    roundedCornerImageView2.setImageAlpha(255);
                    textView2.setTextColor(A013);
                    textView.setTextColor(A013);
                } else {
                    if (z) {
                        view2.setVisibility(0);
                    } else {
                        view2.setVisibility(8);
                    }
                    roundedCornerImageView2.setImageAlpha(125);
                    textView2.setTextColor(A03);
                    textView.setTextColor(A03);
                    c38506GwR.A06.setVisibility(8);
                }
                c38506GwR.A06.setVisibility(8);
                ViewOnClickListenerC42009Ije viewOnClickListenerC42009Ije = new ViewOnClickListenerC42009Ije(3, c38052Gof, c38628GyV, c41643IbZ, A01, interfaceC43387JFc, context, c38506GwR);
                if (c38628GyV != null && c38052Gof != null) {
                    AutoWidthToggleButton autoWidthToggleButton = c38506GwR.A08;
                    AbstractC56952jT.A01(autoWidthToggleButton);
                    C14360o3.A0A(context);
                    I6G.A00(context, c38628GyV, autoWidthToggleButton, str3);
                    autoWidthToggleButton.setToggled(c38052Gof.A02);
                    autoWidthToggleButton.setVisibility(0);
                    c38506GwR.itemView.setBackground(null);
                    if (!c38052Gof.A01) {
                        autoWidthToggleButton.setEnabled(false);
                        autoWidthToggleButton.setOnClickListener(null);
                        view.setClickable(true);
                        C0fQ.A00(viewOnClickListenerC42009Ije, view);
                    } else {
                        autoWidthToggleButton.setEnabled(true);
                        C0fQ.A00(viewOnClickListenerC42009Ije, autoWidthToggleButton);
                        view.setOnClickListener(null);
                        view.setClickable(false);
                    }
                } else {
                    AutoWidthToggleButton autoWidthToggleButton2 = c38506GwR.A08;
                    autoWidthToggleButton2.setVisibility(8);
                    C0fQ.A00(viewOnClickListenerC42009Ije, view);
                    autoWidthToggleButton2.setOnClickListener(null);
                    View view3 = c38506GwR.itemView;
                    view3.setBackgroundResource(AbstractC53242c7.A0H(view3.getContext(), R.attr.backgroundDrawable));
                }
                IgSimpleImageView igSimpleImageView = c38506GwR.A04;
                if (id7 != null) {
                    igSimpleImageView.setVisibility(0);
                    ViewOnClickListenerC38053Gog.A03(igSimpleImageView, 6, id7, A01);
                    return;
                } else {
                    igSimpleImageView.setVisibility(8);
                    igSimpleImageView.setOnClickListener(null);
                    return;
                }
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }
}
