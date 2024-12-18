package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.user.model.User;
import java.util.HashSet;

/* renamed from: X.KHv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45632KHv extends AbstractC66412zI {
    public final C47513Kyg A00;
    public final HashSet A01 = AbstractC166987dD.A1H();

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C44710Jqt c44710Jqt = new C44710Jqt(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.new_release_notification_item, false));
        Context context = viewGroup.getContext();
        IgSimpleImageView igSimpleImageView = c44710Jqt.A03;
        C14360o3.A0A(context);
        Resources resources = viewGroup.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
        int A07 = AbstractC166997dE.A07(resources);
        int A06 = AbstractC166997dE.A06(resources);
        int i = -1;
        if (AbstractC53242c7.A0L(context, R.attr.musicCreationShadowEnabled, false)) {
            i = 1;
        }
        igSimpleImageView.setImageDrawable(new BOM(context, null, dimensionPixelSize, A07, 0, 0, A06, i, false));
        return c44710Jqt;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        ImageUrl AsF;
        String str;
        String audioAssetId;
        User user;
        User user2;
        C48317LZq c48317LZq = (C48317LZq) interfaceC66482zP;
        C44710Jqt c44710Jqt = (C44710Jqt) c3oo;
        AbstractC167017dG.A1N(c48317LZq, c44710Jqt);
        TrackOrOriginalSoundSchema trackOrOriginalSoundSchema = c48317LZq.A00;
        OriginalSoundData originalSoundData = trackOrOriginalSoundSchema.A00;
        TrackData trackData = trackOrOriginalSoundSchema.A01;
        IgSimpleImageView igSimpleImageView = c44710Jqt.A03;
        String str2 = null;
        if (originalSoundData != null && (user2 = originalSoundData.A03) != null) {
            AsF = user2.Bhu();
        } else if (trackData == null || (AsF = trackData.AsF()) == null) {
            throw AbstractC166997dE.A0g();
        }
        AbstractC38055Goi.A00(igSimpleImageView, AsF, null);
        TextView textView = c44710Jqt.A02;
        if (originalSoundData == null || (str = originalSoundData.A0M) == null) {
            if (trackData != null) {
                str = trackData.getTitle();
            } else {
                str = null;
            }
        }
        textView.setText(str);
        TextView textView2 = c44710Jqt.A01;
        if (originalSoundData != null && (user = originalSoundData.A03) != null) {
            str2 = user.getUsername();
        } else if (trackData != null) {
            str2 = trackData.getDisplayArtist();
        }
        textView2.setText(str2);
        ViewOnClickListenerC48066LPr.A00(c44710Jqt.itemView, 7, c48317LZq, this);
        ViewOnClickListenerC48066LPr.A00(c44710Jqt.A00, 8, c48317LZq, this);
        String key = c48317LZq.getKey();
        HashSet hashSet = this.A01;
        if (!hashSet.contains(key)) {
            C47513Kyg c47513Kyg = this.A00;
            C2UU c2uu = c47513Kyg.A00.A0A;
            C14360o3.A0C(c2uu, MSV.A00(60));
            int A02 = ((C66362zD) c2uu).A02(c48317LZq.getKey());
            C47514Kyh c47514Kyh = ((C44506JmC) c47513Kyg.A01.A01.getValue()).A01;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c47514Kyh.A00, c47514Kyh.A01), MSV.A00(1257));
            if ((originalSoundData != null && (audioAssetId = originalSoundData.A0I) != null) || (trackData != null && (audioAssetId = trackData.getAudioAssetId()) != null)) {
                A0f.A9K("audio_asset_id", AbstractC25228BEl.A13(audioAssetId));
                A0f.A8R(EnumC114925Hg.CLIPS, "camera_destination");
                A0f.A9K("audio_index", AbstractC31171DnF.A0V(A02));
                A0f.Cht();
                hashSet.add(key);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48317LZq.class;
    }

    public C45632KHv(C47513Kyg c47513Kyg) {
        this.A00 = c47513Kyg;
    }
}
