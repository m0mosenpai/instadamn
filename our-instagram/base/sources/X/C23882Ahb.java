package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;

/* renamed from: X.Ahb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23882Ahb implements C8BM {
    public final int A00;
    public final Object A01;

    public C23882Ahb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C8BM
    public final /* synthetic */ void CzF() {
    }

    @Override // X.C8BM
    public final /* synthetic */ void DUY() {
    }

    @Override // X.C8BM
    public final /* synthetic */ void DUZ() {
    }

    @Override // X.C8BM
    public final void DUa() {
        ImageUrl imageUrl;
        String str;
        if (this.A00 != 0) {
            C23885Ahe c23885Ahe = (C23885Ahe) this.A01;
            AudioOverlayTrack audioOverlayTrack = c23885Ahe.A01;
            if (audioOverlayTrack != null) {
                C23885Ahe.A00(c23885Ahe, audioOverlayTrack, false);
                return;
            }
            return;
        }
        C23854Ah6 c23854Ah6 = (C23854Ah6) this.A01;
        MusicAssetModel musicAssetModel = c23854Ah6.A00;
        if (musicAssetModel == null) {
            return;
        }
        AnonymousClass879 A02 = c23854Ah6.A08.A02();
        MusicDataSource musicDataSource = musicAssetModel.A05;
        if (musicDataSource != null) {
            if (!musicDataSource.equals(A02.BVb())) {
                A02.EZL(musicDataSource, false);
                A02.EZP(musicAssetModel.A05());
                A02.EZO(15000);
            }
            if (!A02.isPlaying()) {
                A02.E4S();
            }
        }
        AbstractC167017dG.A0V(c23854Ah6.A0L).requireViewById(R.id.music_pick_album_selector).setVisibility(8);
        View A0L = AbstractC167007dF.A0L(c23854Ah6.A0D);
        boolean z = false;
        A0L.setVisibility(0);
        Context A0L2 = AbstractC166997dE.A0L(A0L);
        MusicAssetModel musicAssetModel2 = c23854Ah6.A00;
        String str2 = null;
        if (musicAssetModel2 != null) {
            imageUrl = musicAssetModel2.A02;
        } else {
            imageUrl = null;
        }
        if (musicAssetModel2 != null && musicAssetModel2.A0U && C36A.A0C(c23854Ah6.A07)) {
            z = true;
        }
        A0L.setBackground(new C0B(A0L2, imageUrl, z));
        ImageView imageView = (ImageView) AbstractC166987dD.A17(c23854Ah6.A0Q);
        C138586Po c138586Po = c23854Ah6.A0A;
        c138586Po.A05 = true;
        c138586Po.invalidateSelf();
        imageView.setImageDrawable(c138586Po);
        ImageView imageView2 = (ImageView) AbstractC166987dD.A17(c23854Ah6.A0R);
        Context A0L3 = AbstractC166997dE.A0L(imageView2);
        MusicAssetModel musicAssetModel3 = c23854Ah6.A00;
        if (musicAssetModel3 != null) {
            str = musicAssetModel3.A0I;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        imageView2.setImageDrawable(AEL.A01(A0L3, str, R.dimen.music_pick_author_container_size, R.color.igds_icon_on_color, R.dimen.account_discovery_bottom_gap));
        ImageView imageView3 = (ImageView) AbstractC166987dD.A17(c23854Ah6.A0H);
        Context A0L4 = AbstractC166997dE.A0L(imageView3);
        MusicAssetModel musicAssetModel4 = c23854Ah6.A00;
        if (musicAssetModel4 != null) {
            str2 = musicAssetModel4.A0D;
        }
        if (str2 == null) {
            str2 = "";
        }
        imageView3.setImageDrawable(AEL.A01(A0L4, str2, R.dimen.music_pick_author_container_size, R.color.bright_foreground_disabled_material_dark, R.dimen.account_discovery_bottom_gap));
        ImageView imageView4 = (ImageView) AbstractC166987dD.A17(c23854Ah6.A0O);
        Object parent = imageView4.getParent();
        C14360o3.A0C(parent, AbstractC111324zv.A00(2));
        AbstractC13880nE.A0o(imageView4, (View) parent, R.dimen.abc_button_padding_horizontal_material);
        Context A0L5 = AbstractC166997dE.A0L(imageView4);
        Drawable drawable = A0L5.getDrawable(R.drawable.instagram_x_pano_outline_24);
        if (drawable != null) {
            drawable.setTint(AbstractC167007dF.A09(A0L5, R.attr.igds_color_text_on_white));
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        AbstractC166987dD.A1N(A0L5, paint, AbstractC53242c7.A05(A0L5));
        AbstractC166987dD.A1R(paint);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawable});
        int A01 = C1H4.A01(AbstractC13880nE.A04(A0L5, 8));
        layerDrawable.setLayerInset(1, A01, A01, A01, A01);
        imageView4.setImageDrawable(layerDrawable);
        ViewOnClickListenerC23249ASk.A00(imageView4, 27, c23854Ah6);
        MusicPickStickerModel musicPickStickerModel = c23854Ah6.A02;
        if (musicPickStickerModel == null) {
            C14360o3.A0F("model");
            throw C00O.createAndThrow();
        }
        String str3 = musicPickStickerModel.A02;
        if (str3 != null && str3.length() != 0) {
            c23854Ah6.A09.DBH();
        }
        C23854Ah6.A01(c23854Ah6, null);
    }

    @Override // X.C8BM
    public final /* synthetic */ void DlU() {
    }

    @Override // X.C8BM
    public final /* synthetic */ void DUb(JIN jin) {
    }
}
