package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.realtimeclient.RealtimeSubscription;

/* loaded from: classes11.dex */
public abstract class WE3 {
    public static final void A00(Context context) {
        C14360o3.A0B(context, 0);
        C9GR.A03(context, context.getString(2131962702), "follow_hashtag_error", 0);
    }

    public static final void A01(Context context) {
        C14360o3.A0B(context, 0);
        C9GR.A03(context, context.getString(2131976075), "unfollow_hashtag_error", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(TextView textView, String str) {
        String str2;
        int length;
        C14360o3.A0B(textView, 0);
        if (str != null && (length = str.length()) != 0) {
            boolean equals = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(str);
            Context context = textView.getContext();
            Resources resources = context.getResources();
            int i = 100;
            if (equals) {
                i = 1;
            }
            String A0W = AbstractC31175DnJ.A0W(resources, str, R.plurals.number_of_posts, i);
            C14360o3.A07(A0W);
            int A08 = AbstractC001900j.A08(A0W, str, 0, false);
            SpannableString spannableString = new SpannableString(A0W);
            int i2 = length + A08;
            spannableString.setSpan(new ForegroundColorSpan(context.getColor(AbstractC53242c7.A07(context))), A08, i2, 33);
            spannableString.setSpan(new StyleSpan(1), A08, i2, 33);
            str2 = spannableString;
        } else {
            str2 = "";
        }
        textView.setText(str2);
    }

    public static final void A03(InterfaceC11380iw interfaceC11380iw, IgImageView igImageView, Hashtag hashtag) {
        AbstractC167007dF.A1K(igImageView, hashtag);
        if (AbstractC81033jX.A03(hashtag.Bhu())) {
            Context A0L = AbstractC166997dE.A0L(igImageView);
            AbstractC166997dE.A19(A0L, igImageView, R.drawable.instagram_hashtag_pano_outline_24);
            int A06 = AbstractC167017dG.A06(A0L);
            igImageView.setPadding(A06, A06, A06, A06);
            return;
        }
        ImageUrl Bhu = hashtag.Bhu();
        if (Bhu != null) {
            igImageView.setUrl(Bhu, interfaceC11380iw);
            igImageView.setPadding(0, 0, 0, 0);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
