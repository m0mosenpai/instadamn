package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.7Hr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160577Hr {
    public L7B A00;
    public IgProgressImageView A01;
    public final View A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C160567Hq A05;
    public final InterfaceC09390do A06;
    public final C7ZZ A07;

    public C160577Hr(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7ZZ c7zz, C160567Hq c160567Hq) {
        C14360o3.A0B(view, 4);
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A07 = c7zz;
        this.A02 = view;
        this.A05 = c160567Hq;
        this.A06 = AbstractC09440dt.A01(new C206819Dm(this, 19));
    }

    public static final void A00(ImageUrl imageUrl, C160577Hr c160577Hr) {
        IgProgressImageView igProgressImageView = c160577Hr.A01;
        if (igProgressImageView != null) {
            String url = imageUrl.getUrl();
            C14360o3.A07(url);
            C14360o3.A0B("content://com.instagram.android.tam-attachment", 1);
            if (!url.startsWith("content://com.instagram.android.tam-attachment")) {
                igProgressImageView.setUrl(c160577Hr.A04, imageUrl, c160577Hr.A03);
                return;
            }
            InterfaceC09390do interfaceC09390do = c160577Hr.A06;
            String A00 = ((C137096In) interfaceC09390do.getValue()).A00(url);
            if (A00 != null) {
                igProgressImageView.setUrl(new SimpleImageUrl(A00), c160577Hr.A03);
                return;
            }
            if (((C137096In) interfaceC09390do.getValue()).A02(url)) {
                return;
            }
            ((C137096In) interfaceC09390do.getValue()).A01(url);
            L7B l7b = c160577Hr.A00;
            if (l7b != null) {
                l7b.A00();
            }
            c160577Hr.A00 = null;
            c160577Hr.A00 = c160577Hr.A07.ChZ(new C49063Lmp(c160577Hr, igProgressImageView), url);
        }
    }

    public final void A01(ImageUrl imageUrl, long j) {
        IgProgressImageView igProgressImageView;
        if (imageUrl != null && (igProgressImageView = this.A01) != null) {
            Resources resources = igProgressImageView.getResources();
            C14360o3.A07(resources);
            try {
                float dimension = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
                if (Float.valueOf(dimension) != null) {
                    C74843Xy c74843Xy = new C74843Xy();
                    c74843Xy.A06(dimension);
                    C162817Qs c162817Qs = new C162817Qs();
                    C14360o3.A0B(c74843Xy, 0);
                    c162817Qs.A02(c74843Xy, C05F.A00);
                    igProgressImageView.setPostProcessor(new AnonymousClass791(c162817Qs, AnonymousClass790.A00));
                    igProgressImageView.setVisibility(0);
                    igProgressImageView.setExpiration(j);
                    A00(imageUrl, this);
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
    }
}
