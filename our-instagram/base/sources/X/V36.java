package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.text.DecimalFormat;

/* loaded from: classes11.dex */
public final class V36 extends AbstractC65632xz {
    public Context A00;
    public C70930WkZ A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public V36(Context context, C70930WkZ c70930WkZ, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = context;
        this.A02 = interfaceC11380iw;
        this.A01 = c70930WkZ;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        int intValue;
        int A03 = C0f9.A03(-1946988018);
        Context context = this.A00;
        C69301Vl9 c69301Vl9 = (C69301Vl9) view.getTag();
        Hashtag hashtag = (Hashtag) obj;
        C70930WkZ c70930WkZ = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        UserSession userSession = this.A03;
        C14360o3.A0B(userSession, 0);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36323350171102393L);
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A0a(1, c69301Vl9, hashtag, c70930WkZ, interfaceC11380iw);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = c69301Vl9.A04;
        C14360o3.A0B(gradientSpinnerAvatarView, 0);
        if (AbstractC81033jX.A03(hashtag.Bhu())) {
            Context A0L = AbstractC166997dE.A0L(gradientSpinnerAvatarView);
            Drawable drawable = A0L.getDrawable(R.drawable.instagram_hashtag_pano_outline_24);
            if (drawable != null) {
                gradientSpinnerAvatarView.A0D(drawable);
                int A032 = AbstractC167017dG.A03(A0L);
                gradientSpinnerAvatarView.setPadding(A032, A032, A032, A032);
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            ImageUrl Bhu = hashtag.Bhu();
            if (Bhu != null) {
                gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, Bhu);
                gradientSpinnerAvatarView.setPadding(0, 0, 0, 0);
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        c69301Vl9.A01.setText(AbstractC13670mt.A06("#%s", hashtag.getName()));
        if (A06) {
            c69301Vl9.A02.setVisibility(8);
        } else {
            TextView textView = c69301Vl9.A02;
            String BrA = hashtag.BrA();
            if (BrA != null && BrA.length() != 0) {
                str = hashtag.BrA();
            } else {
                Resources resources = context.getResources();
                C14360o3.A07(resources);
                Integer BQb = hashtag.BQb();
                if (BQb != null && (intValue = BQb.intValue()) > 0) {
                    DecimalFormat decimalFormat = new DecimalFormat();
                    decimalFormat.setGroupingUsed(true);
                    decimalFormat.setMaximumFractionDigits(0);
                    str = AbstractC31175DnJ.A0W(resources, decimalFormat.format(intValue), R.plurals.number_of_posts, intValue);
                    C14360o3.A0A(str);
                } else {
                    str = "";
                }
            }
            textView.setText(str);
        }
        c69301Vl9.A03.A01(interfaceC11380iw, c70930WkZ, hashtag);
        WNP.A00(c69301Vl9.A00, 47, c70930WkZ, hashtag);
        C0f9.A0A(1551263516, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1938701344);
        Context context = this.A00;
        AbstractC167007dF.A1K(context, viewGroup);
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), viewGroup, R.layout.follow_list_row, false);
        A0C.setTag(new C69301Vl9(A0C, (int) context.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding)));
        C0f9.A0A(-1671576838, A03);
        return A0C;
    }
}
