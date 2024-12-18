package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.cal.model.FxAccountInfo;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class FWJ {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.EtQ, java.lang.Object] */
    public static final ViewGroup A00(Context context, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(AbstractC31172DnG.A09(context), viewGroup, R.layout.account_row, false);
        C14360o3.A0B(viewGroup2, 1);
        ?? obj = new Object();
        View requireViewById = viewGroup2.requireViewById(R.id.avatar_container);
        C14360o3.A0C(requireViewById, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.CircularImageView");
        obj.A02 = (CircularImageView) requireViewById;
        View requireViewById2 = viewGroup2.requireViewById(R.id.badge_container);
        C14360o3.A0C(requireViewById2, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.CircularImageView");
        obj.A03 = (CircularImageView) requireViewById2;
        View requireViewById3 = viewGroup2.requireViewById(R.id.accountTitle);
        String A00 = AbstractC43591JPw.A00(3);
        C14360o3.A0C(requireViewById3, A00);
        obj.A01 = (IgTextView) requireViewById3;
        View requireViewById4 = viewGroup2.requireViewById(R.id.accountSubtitle);
        C14360o3.A0C(requireViewById4, A00);
        obj.A00 = (IgTextView) requireViewById4;
        viewGroup2.setTag(obj);
        return viewGroup2;
    }

    public static final void A01(Context context, InterfaceC11380iw interfaceC11380iw, C33614EtQ c33614EtQ, FxAccountInfo fxAccountInfo) {
        int i;
        int i2;
        AbstractC167027dH.A12(context, c33614EtQ, fxAccountInfo);
        ImageUrl imageUrl = fxAccountInfo.A00;
        if (AbstractC81033jX.A03(imageUrl)) {
            AbstractC166997dE.A19(context, c33614EtQ.A02, R.drawable.profile_anonymous_user);
        } else if (imageUrl != null && interfaceC11380iw != null) {
            c33614EtQ.A02.setUrl(imageUrl, interfaceC11380iw);
        }
        IgTextView igTextView = c33614EtQ.A01;
        String str = fxAccountInfo.A02;
        if (str != null) {
            igTextView.setText(str);
            String str2 = fxAccountInfo.A01;
            if (str2 != null) {
                FxcalAccountType fxcalAccountType = FxcalAccountType.A04;
                String valueOf = String.valueOf(str2);
                String obj = fxcalAccountType.toString();
                Locale locale = Locale.ROOT;
                if (AbstractC31180DnO.A1Z(valueOf, AbstractC31172DnG.A16(locale, obj), locale)) {
                    i = R.drawable.fb_badge_color_logo;
                    i2 = 2131962025;
                } else {
                    if (!AbstractC31180DnO.A1Z(String.valueOf(fxAccountInfo.A01), AbstractC31172DnG.A16(locale, FxcalAccountType.A05.toString()), locale)) {
                        return;
                    }
                    i = R.drawable.ig_badge_color_logo;
                    i2 = R.string.res_0x7f130072_name_removed;
                }
                AbstractC166997dE.A19(context, c33614EtQ.A03, i);
                c33614EtQ.A00.setText(i2);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
