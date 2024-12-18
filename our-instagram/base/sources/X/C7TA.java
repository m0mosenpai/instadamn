package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.feed.widget.IgProgressImageViewProgressBar;
import java.io.File;
import java.util.Map;

/* renamed from: X.7TA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7TA {
    public static final void A02(JV2 jv2, C129565tL c129565tL, boolean z) {
        C3X1 c3x1;
        IgProgressImageView igProgressImageView = jv2.A0A;
        igProgressImageView.setBackgroundColor(0);
        jv2.A08.setVisibility(8);
        IgImageView igImageView = igProgressImageView.getIgImageView();
        igImageView.setImageRendererAndReset(AbstractC1580577p.A05(igImageView, c129565tL.A02));
        ImageView imageView = jv2.A05;
        if (z) {
            imageView.setVisibility(0);
            c3x1 = C3X1.A02;
        } else {
            imageView.setVisibility(8);
            c3x1 = C3X1.A04;
        }
        igProgressImageView.A03 = c3x1;
    }

    public final void A03(C9BR c9br, InterfaceC11380iw interfaceC11380iw, JV2 jv2, String str, String str2, int i, boolean z) {
        C14360o3.A0B(c9br, 1);
        boolean z2 = true;
        if (2 - ((Number) c9br.A01).intValue() == 0 && c9br.A02) {
            z2 = false;
        }
        IgProgressImageView igProgressImageView = jv2.A0A;
        igProgressImageView.setEnableProgressBar(false);
        View view = jv2.A03;
        int i2 = 8;
        if (z2) {
            i2 = 0;
        }
        view.setVisibility(i2);
        IgProgressImageViewProgressBar igProgressImageViewProgressBar = jv2.A0B;
        igProgressImageViewProgressBar.setVisibility(0);
        SimpleImageUrl simpleImageUrl = null;
        if (!z) {
            if (!z2) {
                str = null;
            }
            igProgressImageViewProgressBar.setIndeterminate(true);
        } else {
            if (z2) {
                if (str2 != null) {
                    str = str2;
                }
            } else {
                str = null;
            }
            igProgressImageViewProgressBar.setIndeterminate(false);
            igProgressImageViewProgressBar.setProgress(i);
        }
        if (str != null) {
            simpleImageUrl = AbstractC81033jX.A02(new File(str), -1, -1);
        }
        if (AbstractC81033jX.A03(simpleImageUrl)) {
            igProgressImageView.A04();
        } else {
            if (simpleImageUrl == null) {
                return;
            }
            igProgressImageView.setUrl(simpleImageUrl, interfaceC11380iw);
        }
    }

    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, JV2 jv2, String str) {
        jv2.A03.setVisibility(8);
        jv2.A0B.setVisibility(8);
        SimpleImageUrl simpleImageUrl = new SimpleImageUrl(str);
        ImageUrlBase.A00(simpleImageUrl);
        AbstractC05810Sj.A00(((ImageUrlBase) simpleImageUrl).A00);
        String str2 = ((ImageUrlBase) simpleImageUrl).A00.A03;
        C14360o3.A07(str2);
        MRJ mrj = jv2.A01;
        if (mrj != null) {
            mrj.DSH(new JUO(str2));
        }
        jv2.A0A.setUrl(userSession, new SimpleImageUrl(str), interfaceC11380iw);
    }

    public static final void A01(UserSession userSession, JV2 jv2, Map map) {
        C47Z A03;
        C3AY c3ay = (C3AY) map.get(jv2);
        if (c3ay != null) {
            InterfaceC65982ya interfaceC65982ya = (InterfaceC65982ya) c3ay.A01;
            String str = (String) c3ay.A00;
            if (str != null && interfaceC65982ya != null && (A03 = C25A.A00(userSession).A03(str)) != null) {
                A03.A0X(interfaceC65982ya);
            }
        }
    }
}
