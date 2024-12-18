package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

/* renamed from: X.6Z9, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6Z9 {
    public static final void A00(UserSession userSession, C41181vS c41181vS, C144356fH c144356fH) {
        C84823qW c84823qW;
        List BlY = c41181vS.BlY(EnumC75383a5.A0s);
        if (BlY != null && (c84823qW = (C84823qW) AbstractC001800i.A0J(BlY)) != null && C14360o3.A0K(c84823qW.A1h, EnumC138556Pl.A0G.A02) && C18U.A06(C06090Tz.A05, userSession, 36325132583187216L)) {
            MusicOverlayStickerModel musicOverlayStickerModel = c84823qW.A0v;
            if (musicOverlayStickerModel != null) {
                float A00 = c41181vS.A00();
                if (c144356fH.A00 == null) {
                    View inflate = c144356fH.A01.inflate();
                    C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgSimpleImageView");
                    c144356fH.A00 = (IgSimpleImageView) inflate;
                }
                Context context = c144356fH.A01.getContext();
                C14360o3.A07(context);
                C9SH c9sh = new C9SH(context, userSession, musicOverlayStickerModel.A04, C05F.A00, "", "", 0.0f, -1, false, true);
                IgSimpleImageView igSimpleImageView = c144356fH.A00;
                if (igSimpleImageView != null) {
                    igSimpleImageView.setImageDrawable(c9sh);
                }
                IgSimpleImageView igSimpleImageView2 = c144356fH.A00;
                if (igSimpleImageView2 != null) {
                    igSimpleImageView2.setVisibility(0);
                }
                IgSimpleImageView igSimpleImageView3 = c144356fH.A00;
                if (igSimpleImageView3 != null) {
                    AbstractC13880nE.A0r(igSimpleImageView3, new RunnableC24809AyV(c84823qW, c144356fH, A00));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        IgSimpleImageView igSimpleImageView4 = c144356fH.A00;
        if (igSimpleImageView4 == null) {
            return;
        }
        igSimpleImageView4.setVisibility(8);
    }
}
