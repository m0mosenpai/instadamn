package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.OdM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55158OdM {
    public static final C51374MmZ A00(Context context, ViewGroup viewGroup) {
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.layout_highlight_card, false);
        C51374MmZ c51374MmZ = new C51374MmZ(A0D);
        A0D.setTag(c51374MmZ);
        return c51374MmZ;
    }

    public static final void A01(Context context, C51374MmZ c51374MmZ, InterfaceC156156zj interfaceC156156zj, boolean z, boolean z2) {
        AbstractC25233BEq.A0v(0, context, c51374MmZ, interfaceC156156zj);
        A04(c51374MmZ);
        c51374MmZ.A00(z, z2);
        InterfaceC09390do interfaceC09390do = c51374MmZ.A08;
        C44376JjF c44376JjF = (C44376JjF) interfaceC09390do.getValue();
        c44376JjF.A0V.setColor(AbstractC167007dF.A09(context, R.attr.igds_color_highlight_background));
        c44376JjF.invalidateSelf();
        C44376JjF c44376JjF2 = (C44376JjF) interfaceC09390do.getValue();
        c44376JjF2.A0U.setColor(AbstractC167007dF.A09(AbstractC31172DnG.A05(c51374MmZ), R.attr.igds_color_primary_background));
        c44376JjF2.invalidateSelf();
        IgSimpleImageView igSimpleImageView = c51374MmZ.A04;
        igSimpleImageView.setVisibility(0);
        AbstractC166997dE.A19(context, igSimpleImageView, R.drawable.instagram_add_pano_outline_24);
        AbstractC31177DnL.A0p(context, igSimpleImageView, AbstractC53242c7.A08(context));
        c51374MmZ.A00 = new C48540Ldd(interfaceC156156zj, 4);
        IgTextView igTextView = c51374MmZ.A05;
        AbstractC166987dD.A1P(context, igTextView, 2131956543);
        igTextView.setVisibility(0);
        AbstractC31177DnL.A0q(AbstractC31172DnG.A05(c51374MmZ), igTextView, R.attr.igds_color_secondary_text);
    }

    public static final void A02(InterfaceC156146zi interfaceC156146zi, C51374MmZ c51374MmZ, boolean z, boolean z2) {
        AbstractC167007dF.A1K(c51374MmZ, interfaceC156146zi);
        A04(c51374MmZ);
        c51374MmZ.A00(z, z2);
        Context A05 = AbstractC31172DnG.A05(c51374MmZ);
        InterfaceC09390do interfaceC09390do = c51374MmZ.A08;
        C44376JjF c44376JjF = (C44376JjF) interfaceC09390do.getValue();
        c44376JjF.A0V.setColor(AbstractC167007dF.A09(A05, R.attr.igds_color_highlight_background));
        c44376JjF.invalidateSelf();
        C44376JjF c44376JjF2 = (C44376JjF) interfaceC09390do.getValue();
        c44376JjF2.A0U.setColor(AbstractC167007dF.A09(A05, R.attr.igds_color_primary_background));
        c44376JjF2.invalidateSelf();
        IgSimpleImageView igSimpleImageView = c51374MmZ.A04;
        igSimpleImageView.setVisibility(0);
        AbstractC166997dE.A19(A05, igSimpleImageView, R.drawable.instagram_my_week_story_pano_outline_24);
        IgTextView igTextView = c51374MmZ.A05;
        AbstractC31173DnH.A19(c51374MmZ.itemView.getResources(), igTextView, 2131963604);
        igTextView.setVisibility(0);
        AbstractC31177DnL.A0q(A05, igTextView, R.attr.igds_color_secondary_text);
        c51374MmZ.A00 = new C48540Ldd(interfaceC156146zi, 5);
    }

    public static final void A03(UserSession userSession, C3G4 c3g4, C51374MmZ c51374MmZ, InterfaceC64002vL interfaceC64002vL, String str, List list, int i, boolean z, boolean z2) {
        AbstractC167017dG.A1P(userSession, c51374MmZ);
        AbstractC25234BEr.A0k(3, c3g4, list, interfaceC64002vL, str);
        A04(c51374MmZ);
        c51374MmZ.A00(z, z2);
        Reel reel = c3g4.A03;
        ImageUrl A08 = reel.A08();
        if (A08 == null) {
            A08 = reel.A07();
        }
        Bitmap bitmap = c3g4.A00;
        if (reel.A0l() && bitmap != null) {
            C44376JjF c44376JjF = (C44376JjF) c51374MmZ.A08.getValue();
            if (bitmap != c44376JjF.A01) {
                c44376JjF.A00 = System.currentTimeMillis();
                c44376JjF.A01();
                C44376JjF.A00(bitmap, c44376JjF);
            }
        } else {
            ((C44376JjF) c51374MmZ.A08.getValue()).A02(A08, str);
        }
        boolean A04 = c3g4.A04(userSession);
        IgImageView igImageView = c51374MmZ.A06;
        if (!A04) {
            igImageView.setVisibility(0);
        } else {
            igImageView.setVisibility(8);
        }
        IgTextView igTextView = c51374MmZ.A05;
        igTextView.setText(reel.A0r);
        igTextView.setVisibility(0);
        c51374MmZ.A00 = new C56158OwQ(c51374MmZ, interfaceC64002vL, AbstractC37301Gc2.A0i(reel), list, i);
    }

    public static final void A04(C51374MmZ c51374MmZ) {
        C14360o3.A0B(c51374MmZ, 0);
        Context A05 = AbstractC31172DnG.A05(c51374MmZ);
        InterfaceC09390do interfaceC09390do = c51374MmZ.A08;
        ((C44376JjF) interfaceC09390do.getValue()).A01();
        C44376JjF c44376JjF = (C44376JjF) interfaceC09390do.getValue();
        c44376JjF.A0V.setColor(0);
        c44376JjF.invalidateSelf();
        C44376JjF c44376JjF2 = (C44376JjF) interfaceC09390do.getValue();
        c44376JjF2.A0U.setColor(AbstractC167007dF.A09(A05, R.attr.igds_color_highlight_background));
        c44376JjF2.invalidateSelf();
        IgSimpleImageView igSimpleImageView = c51374MmZ.A04;
        igSimpleImageView.setVisibility(8);
        igSimpleImageView.setImageDrawable(null);
        IgTextView igTextView = c51374MmZ.A05;
        igTextView.setText("");
        igTextView.setVisibility(8);
        AbstractC31177DnL.A0q(A05, igTextView, R.attr.igds_color_primary_text_on_media);
        igSimpleImageView.setImageTintList(null);
        C44376JjF c44376JjF3 = (C44376JjF) interfaceC09390do.getValue();
        c44376JjF3.A04 = false;
        c44376JjF3.invalidateSelf();
        IgSimpleImageView igSimpleImageView2 = c51374MmZ.A02;
        igSimpleImageView2.setSelected(false);
        igSimpleImageView2.setImageDrawable(AbstractC166987dD.A0a(interfaceC09390do));
        c51374MmZ.A00(false, false);
    }
}
