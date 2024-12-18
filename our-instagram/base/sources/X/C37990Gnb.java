package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gnb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37990Gnb {
    public static final void A00(Context context, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C37991Gnc c37991Gnc) {
        IgImageView igImageView;
        ImageUrl A1o;
        C14360o3.A0B(c38321qM, 1);
        if (c38321qM.A4w()) {
            android.net.Uri uri = c38321qM.A05;
            if (uri != null) {
                igImageView = c37991Gnc.A08;
                A1o = AbstractC81033jX.A00(uri, -1, -1);
            } else {
                return;
            }
        } else {
            igImageView = c37991Gnc.A08;
            A1o = c38321qM.A1o(AbstractC167017dG.A09(context));
            if (A1o == null) {
                throw AbstractC166997dE.A0g();
            }
        }
        igImageView.setUrl(A1o, interfaceC60442pS);
    }

    public final View A01(Context context, ViewGroup viewGroup, UserSession userSession) {
        int i;
        AbstractC167017dG.A1P(userSession, viewGroup);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36329917176103497L)) {
            i = R.layout.layout_prism_cta_button;
        } else {
            boolean A06 = C18U.A06(c06090Tz, userSession, 36329655183098342L);
            i = R.layout.layout_cta_button;
            if (A06) {
                i = R.layout.layout_cta_button_v2;
            }
        }
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), viewGroup, i, false);
        A0C.setTag(new C37991Gnc(A0C));
        return A0C;
    }
}
