package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImagesImpl;
import com.instagram.api.schemas.CommentGiphyMediaImages;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.mediasize.GifUrlImpl;

/* loaded from: classes8.dex */
public abstract class LBJ {
    public static final CommentGiphyMediaInfo A00(C45026JwH c45026JwH) {
        String str;
        C14360o3.A0B(c45026JwH, 0);
        DirectAnimatedMedia directAnimatedMedia = c45026JwH.A01;
        CommentGiphyMediaImages commentGiphyMediaImages = null;
        CommentGiphyMediaImages commentGiphyMediaImages2 = new CommentGiphyMediaInfo(null, null, null, null, null, null).A00;
        String str2 = directAnimatedMedia.A05;
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        CommentGiphyMediaImages commentGiphyMediaImages3 = new CommentGiphyMediaImages(new CommentGiphyMediaFixedHeightImagesImpl(Integer.valueOf((int) gifUrlImpl.A02.floatValue()), null, null, null, Integer.valueOf((int) gifUrlImpl.A03.floatValue()), null, gifUrlImpl.A09, gifUrlImpl.A0A));
        Boolean valueOf = Boolean.valueOf(directAnimatedMedia.A06);
        DirectAnimatedMediaUser directAnimatedMediaUser = directAnimatedMedia.A01;
        if (directAnimatedMediaUser != null) {
            str = directAnimatedMediaUser.A00;
        } else {
            str = null;
        }
        if (commentGiphyMediaImages2 != null) {
            commentGiphyMediaImages = commentGiphyMediaImages2.EsO();
        }
        return new CommentGiphyMediaInfo(commentGiphyMediaImages, commentGiphyMediaImages3, valueOf, str2, null, str);
    }

    public static final void A01(Context context, UserSession userSession, EnumC46186KcO enumC46186KcO, String str, InterfaceC16660sJ interfaceC16660sJ) {
        C3DN A01;
        C14360o3.A0B(userSession, 1);
        AbstractC43594JPz.A1P(str, interfaceC16660sJ);
        if (context != null && (A01 = C3DN.A00.A01(context)) != null) {
            C189478aR A00 = F86.A00(A01);
            C48782Lhp c48782Lhp = new C48782Lhp(A00, A01, interfaceC16660sJ);
            boolean A1W = AbstractC167007dF.A1W(A00);
            C16930sl c16930sl = C16930sl.A00;
            C14360o3.A0B(c16930sl, 23);
            KCW A012 = AbstractC47845LBn.A01(userSession, c48782Lhp, enumC46186KcO, str, c16930sl, A1W);
            if (A00 != null) {
                Fragment A09 = A01.A09();
                if (A09 != null) {
                    ((BottomSheetFragment) A09).A0T(0);
                }
                C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                A0y.A11 = true;
                A0y.A0d = context.getString(2131963218);
                AbstractC25225BEi.A1Q(A0y, true);
                A0y.A03 = 0.7f;
                C14360o3.A0A(A012);
                A00.A0F(A012, A0y);
                return;
            }
            C14360o3.A0A(A012);
            A01.A0K(A012);
        }
    }
}
