package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* renamed from: X.Fff, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35187Fff {
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0152, code lost:
    
        if (X.C18U.A06(r15, r2, 36328538491600499L) != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(com.instagram.user.model.User r16, X.FOZ r17, X.FOT r18, java.lang.Integer r19) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35187Fff.A03(com.instagram.user.model.User, X.FOZ, X.FOT, java.lang.Integer):void");
    }

    public static void A04(FOZ foz) {
        foz.A0E.setAlpha(1.0f);
        foz.A06.setAlpha(1.0f);
        foz.A07.setAlpha(1.0f);
        foz.A05.setAlpha(1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.FOZ, java.lang.Object] */
    public static ViewGroup A01(Context context, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.row_user);
        ?? obj = new Object();
        obj.A01 = viewGroup2;
        obj.A03 = AbstractC31173DnH.A0F(viewGroup2, R.id.row_user_container_base);
        obj.A02 = AbstractC31173DnH.A0F(viewGroup2, R.id.text_container);
        obj.A0E = (GradientSpinnerAvatarView) viewGroup2.requireViewById(R.id.row_user_imageview);
        obj.A06 = AbstractC166997dE.A0T(viewGroup2, R.id.row_user_primary_name);
        obj.A07 = AbstractC166997dE.A0T(viewGroup2, R.id.row_user_secondary_name);
        obj.A05 = AbstractC166997dE.A0T(viewGroup2, R.id.row_user_label);
        obj.A00 = viewGroup2.requireViewById(R.id.bottom_row_divider);
        obj.A0B = AbstractC31177DnL.A0U(viewGroup2, R.id.overflow_button_stub);
        obj.A0C = AbstractC31177DnL.A0U(viewGroup2, R.id.remove_tag_button_stub);
        obj.A09 = AbstractC31177DnL.A0U(viewGroup2, R.id.follow_button_stub);
        obj.A0D = AbstractC31177DnL.A0U(viewGroup2, R.id.view_profile_button_stub);
        obj.A04 = AbstractC166997dE.A0T(viewGroup2, R.id.row_user_branded_content_brand_tagging_approval_request_pending_label);
        obj.A0A = AbstractC31177DnL.A0U(viewGroup2, R.id.user_message_button);
        obj.A08 = AbstractC31177DnL.A0U(viewGroup2, R.id.user_email_button);
        viewGroup2.setTag(obj);
        return viewGroup2;
    }

    public static void A02(Context context, User user, FOZ foz, String str, boolean z) {
        StringBuilder A11;
        String fullName = user.getFullName();
        String str2 = "";
        boolean isEmpty = TextUtils.isEmpty(fullName);
        boolean isEmpty2 = TextUtils.isEmpty("");
        if (isEmpty) {
            if (isEmpty2 && z) {
                str2 = context.getResources().getString(2131969275);
            }
        } else {
            if (isEmpty2 && z) {
                A11 = AbstractC166987dD.A1C();
                A11.append(context.getResources().getString(2131969275));
                A11.append(" • ");
                A11.append(fullName);
            } else if (TextUtils.isEmpty("")) {
                str2 = fullName;
            } else {
                A11 = AbstractC166997dE.A11(fullName);
                A11.append(" • ");
                A11.append("");
            }
            str2 = A11.toString();
        }
        boolean isEmpty3 = TextUtils.isEmpty(str2);
        TextView textView = foz.A07;
        if (isEmpty3) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str2);
        }
        TextView textView2 = foz.A06;
        if (str == null) {
            str = user.getUsername();
        }
        textView2.setText(str);
        Context context2 = textView2.getContext();
        textView2.setTextAppearance(context2, R.style.igds_emphasized_body_1);
        textView2.setTypeface(AbstractC14710oj.A03(context, Typeface.DEFAULT_BOLD, C05F.A0C));
        AbstractC31177DnL.A0z(textView2, context2);
        textView.setTextAppearance(textView.getContext(), R.style.igds_body_1);
        textView.setTypeface(AbstractC14710oj.A03(context, Typeface.DEFAULT, C05F.A00));
        C85963sQ.A0B(textView2, user.isVerified());
    }
}
