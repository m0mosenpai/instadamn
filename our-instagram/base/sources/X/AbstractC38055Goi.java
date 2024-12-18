package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.OriginalPartsAttributionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Goi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38055Goi {
    public static final void A00(ImageView imageView, ImageUrl imageUrl, JFY jfy) {
        C14360o3.A0B(imageView, 0);
        Drawable drawable = imageView.getDrawable();
        C14360o3.A0C(drawable, "null cannot be cast to non-null type com.instagram.music.common.ui.AlbumArtDrawable");
        BOM bom = (BOM) drawable;
        C14360o3.A0B(bom, 0);
        bom.A04(imageUrl, jfy);
    }

    public static final void A03(BOM bom, List list) {
        C14360o3.A0B(bom, 0);
        if (list.size() == 1) {
            bom.A04((ImageUrl) list.get(0), null);
        } else {
            bom.A05(list);
        }
    }

    public static final void A04(BOM bom, List list) {
        C14360o3.A0B(bom, 0);
        ArrayList A0U = AbstractC001800i.A0U(AbstractC001800i.A0X(list));
        if (!A0U.isEmpty()) {
            int size = A0U.size();
            if (size != 2) {
                if (size == 3) {
                    A0U.add(A0U.get(0));
                }
            } else {
                A0U.addAll(AbstractC001800i.A0Y(A0U));
            }
            A03(bom, A0U);
        }
    }

    public static final void A01(UserSession userSession, MusicAssetModel musicAssetModel, BOM bom) {
        AbstractC167017dG.A1O(bom, userSession);
        if (musicAssetModel != null) {
            if (musicAssetModel.A01 != OriginalAudioSubtype.A06) {
                bom.A04(musicAssetModel.A03, null);
                return;
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = musicAssetModel.A0K.iterator();
            while (it.hasNext()) {
                A1E.add(((OriginalPartsAttributionModel) it.next()).A00);
            }
            if (C18U.A06(C06090Tz.A06, userSession, 36321353011504468L)) {
                A04(bom, A1E);
            } else {
                A03(bom, A1E);
            }
        }
    }

    public static final void A02(ImageUrl imageUrl, IgImageView igImageView, InterfaceC11380iw interfaceC11380iw) {
        BitmapDrawable bitmapDrawable;
        AbstractC167017dG.A1O(igImageView, interfaceC11380iw);
        boolean A03 = AbstractC81033jX.A03(imageUrl);
        Context context = igImageView.getContext();
        if (A03) {
            Drawable drawable = context.getDrawable(R.drawable.default_album_art_icon);
            Bitmap bitmap = null;
            if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
                bitmap = bitmapDrawable.getBitmap();
            }
            igImageView.setImageBitmap(bitmap);
            return;
        }
        igImageView.setPlaceHolderColor(context.getColor(R.color.cds_white_a20));
        igImageView.A0E = new C42355IpH(igImageView, 0);
        if (imageUrl == null) {
            return;
        }
        igImageView.setUrl(imageUrl, interfaceC11380iw);
    }
}
