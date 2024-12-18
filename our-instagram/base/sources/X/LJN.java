package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;

/* loaded from: classes8.dex */
public abstract class LJN {
    public static C74843Xy A00(C7QL c7ql, C49169Lom c49169Lom) {
        FrameLayout frameLayout = c49169Lom.A05;
        Drawable drawable = c49169Lom.A02;
        AbstractC1580577p.A06(drawable, frameLayout, c7ql, true);
        C162247Oj A0G = AbstractC43593JPy.A0G(drawable);
        if (A0G != null) {
            Shape shape = A0G.A03;
            if (shape instanceof C162817Qs) {
                C74843Xy c74843Xy = ((C162817Qs) shape).A09;
                if (c74843Xy.A00 == C05F.A0j) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Rounded Media Frame Layout doesn't currently support corner radius with different x/y values in each corner. (");
                    A1C.append(c74843Xy);
                    throw AbstractC166987dD.A12(AbstractC166997dE.A0x(")", A1C));
                }
                return c74843Xy;
            }
        }
        return null;
    }

    public static void A01(C206409Bx c206409Bx, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C49169Lom c49169Lom) {
        C158827Au c158827Au = c49169Lom.A00;
        if (c206409Bx != null) {
            if (c158827Au == null) {
                c158827Au = new C158827Au(AbstractC31173DnH.A0G(c49169Lom.A05, R.id.media_cover_view_stub));
                c49169Lom.A00 = c158827Au;
            }
            LH9.A02(c206409Bx, interfaceC11380iw, userSession, c158827Au);
            C158827Au c158827Au2 = c49169Lom.A00;
            if (c158827Au2 == null) {
                c158827Au2 = new C158827Au(AbstractC31173DnH.A0G(c49169Lom.A05, R.id.media_cover_view_stub));
                c49169Lom.A00 = c158827Au2;
            }
            AbstractC167007dF.A0x(c158827Au2.A00.A08);
            return;
        }
        if (c158827Au == null) {
            c158827Au = new C158827Au(AbstractC31173DnH.A0G(c49169Lom.A05, R.id.media_cover_view_stub));
            c49169Lom.A00 = c158827Au;
        }
        AbstractC86053sc.A03(c158827Au.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (r20.A02(r1.A02) == false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.Ki1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.Ki1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.InterfaceC11380iw r15, com.instagram.common.session.UserSession r16, X.C49169Lom r17, X.C49038LmQ r18, X.AbstractC46448Kh8 r19, com.instagram.model.direct.messageid.DirectMessageIdentifier r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJN.A02(X.0iw, com.instagram.common.session.UserSession, X.Lom, X.LmQ, X.Kh8, com.instagram.model.direct.messageid.DirectMessageIdentifier, boolean):void");
    }

    public static void A03(InterfaceC11380iw interfaceC11380iw, C49169Lom c49169Lom, C45944KUv c45944KUv, C46502Ki1 c46502Ki1, boolean z, boolean z2) {
        ImageUrl imageUrl;
        c49169Lom.A0K.setVisibility(0);
        if (!z && (imageUrl = c45944KUv.A01) != null) {
            IgProgressImageView igProgressImageView = c49169Lom.A0I;
            igProgressImageView.setExpiration(c45944KUv.A02.A18());
            igProgressImageView.setUrl(imageUrl, interfaceC11380iw);
        }
        Integer num = c45944KUv.A03;
        if (num != null) {
            c49169Lom.A0J.setVisibility(8);
            int intValue = num.intValue();
            C57012jc c57012jc = c49169Lom.A0E;
            ((ImageView) c57012jc.A01()).setImageResource(intValue);
            c57012jc.A03(0);
            return;
        }
        if (!c45944KUv.A04) {
            return;
        }
        MediaActionsView mediaActionsView = c49169Lom.A0J;
        mediaActionsView.setVisibility(0);
        c49169Lom.A0E.A03(8);
        if (!z && z2) {
            mediaActionsView.EcU((int) c45944KUv.A00, false);
        }
        mediaActionsView.setVideoIconState(c46502Ki1.A01);
    }
}
