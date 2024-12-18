package X;

import android.content.Context;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.LEw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47927LEw {
    public final InterfaceC11380iw A00;
    public final IgSimpleImageView A01;
    public final C45510KCz A02;
    public final int A03;
    public final UserSession A04;
    public final QuickSnapReactionEmitterView A05;
    public final C19L A06;

    public static final void A00(LZV lzv, C44761Jri c44761Jri, C47927LEw c47927LEw, int i) {
        ImageView.ScaleType scaleType;
        List list = lzv.A01;
        if (i < list.size()) {
            Context context = c44761Jri.A00;
            UserSession userSession = c47927LEw.A04;
            IgSimpleImageView igSimpleImageView = c47927LEw.A01;
            QuickSnapReactionEmitterView quickSnapReactionEmitterView = c47927LEw.A05;
            C19L c19l = c47927LEw.A06;
            int i2 = c47927LEw.A03;
            C45696KKz c45696KKz = new C45696KKz(context, userSession, igSimpleImageView, quickSnapReactionEmitterView, c47927LEw.A02, new C57519Pft(c47927LEw, 45), c19l, i2);
            AbstractC43593JPy.A1B(c45696KKz, i2);
            if (c45696KKz.A0C) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            } else {
                scaleType = ImageView.ScaleType.MATRIX;
            }
            c45696KKz.setScaleType(scaleType);
            AMo.A06(c45696KKz, c45696KKz.A06);
            Context context2 = c45696KKz.getContext();
            int A0E = AbstractC167017dG.A0E(context2);
            AbstractC13880nE.A0k(c45696KKz, A0E, A0E, A0E, A0E);
            AbstractC31172DnG.A1B(context2, c45696KKz, R.color.context_line_color);
            C26086BgF c26086BgF = (C26086BgF) list.get(i);
            c44761Jri.A01.addView(c45696KKz, 0);
            c45696KKz.setQuickSnapMedia((C26086BgF) AbstractC001800i.A0O(list, i), c47927LEw.A00);
            float f = -4.0f;
            if (i % 2 == 0) {
                f = 4.0f;
            }
            c45696KKz.setRotation(f);
            c45696KKz.A02 = new C49562LvG(c26086BgF, lzv, c44761Jri, c47927LEw, c45696KKz, i);
            return;
        }
        if (i != list.size()) {
            return;
        }
        C44424JkK c44424JkK = new C44424JkK(c44761Jri.A00, c47927LEw.A03);
        c44761Jri.A01.addView(c44424JkK, 0);
        User user = lzv.A00;
        String moduleName = c47927LEw.A00.getModuleName();
        C14360o3.A0B(moduleName, 1);
        c44424JkK.A00.setImageDrawable(new C89533yt(user.Bhu(), moduleName, AbstractC25228BEl.A0M(c44424JkK).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height), 0, 0, 0));
        AbstractC31173DnH.A1F(c44424JkK.A01, user);
        ViewOnClickListenerC48073LPy.A00(c44424JkK, 26, c47927LEw);
    }

    public C47927LEw(InterfaceC11380iw interfaceC11380iw, UserSession userSession, IgSimpleImageView igSimpleImageView, C45510KCz c45510KCz, QuickSnapReactionEmitterView quickSnapReactionEmitterView, C19L c19l, int i) {
        this.A00 = interfaceC11380iw;
        this.A04 = userSession;
        this.A01 = igSimpleImageView;
        this.A05 = quickSnapReactionEmitterView;
        this.A06 = c19l;
        this.A03 = i;
        this.A02 = c45510KCz;
    }
}
