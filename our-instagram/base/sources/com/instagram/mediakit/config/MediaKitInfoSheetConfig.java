package com.instagram.mediakit.config;

import X.AbstractC166987dD;
import X.AbstractC31181DnP;
import X.AnonymousClass016;
import X.C14360o3;
import X.C55343Oh9;
import X.InterfaceC16820sZ;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.R;
import com.instagram.mediakit.ui.model.MediaKitInfoSheetItemModel;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class MediaKitInfoSheetConfig implements Parcelable {
    public static final MediaKitInfoSheetConfig A0D;
    public static final MediaKitInfoSheetConfig A0E;
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(44);
    public View.OnClickListener A00;
    public Float A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public InterfaceC16820sZ A09;
    public boolean A0A;
    public final Integer A0B;
    public final ArrayList A0C;

    static {
        MediaKitInfoSheetConfig mediaKitInfoSheetConfig = new MediaKitInfoSheetConfig(2131966768);
        mediaKitInfoSheetConfig.A06 = 2131966765;
        Integer valueOf = Integer.valueOf(R.drawable.ig_illustrations_illo_add_photos_videos_refresh);
        mediaKitInfoSheetConfig.A04 = valueOf;
        mediaKitInfoSheetConfig.A0A = true;
        mediaKitInfoSheetConfig.A07 = 2131968948;
        AnonymousClass016.A18(mediaKitInfoSheetConfig.A0C, new MediaKitInfoSheetItemModel[]{new MediaKitInfoSheetItemModel(2131966764, 2131966763, Integer.valueOf(R.drawable.instagram_media_account_pano_outline_24)), new MediaKitInfoSheetItemModel(2131966767, 2131966766, Integer.valueOf(R.drawable.instagram_media_pano_outline_24)), new MediaKitInfoSheetItemModel(2131966760, 2131966759, Integer.valueOf(R.drawable.instagram_search_pano_outline_24)), new MediaKitInfoSheetItemModel(2131966762, 2131966761, Integer.valueOf(R.drawable.instagram_comment_pano_outline_24))});
        A0E = mediaKitInfoSheetConfig;
        MediaKitInfoSheetConfig mediaKitInfoSheetConfig2 = new MediaKitInfoSheetConfig(null);
        mediaKitInfoSheetConfig2.A07 = 2131966821;
        mediaKitInfoSheetConfig2.A08 = 2131968687;
        mediaKitInfoSheetConfig2.A04 = valueOf;
        mediaKitInfoSheetConfig2.A05 = 2131966742;
        mediaKitInfoSheetConfig2.A06 = 2131966743;
        mediaKitInfoSheetConfig2.A03 = 2131966741;
        A0D = mediaKitInfoSheetConfig2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A0B));
    }

    public MediaKitInfoSheetConfig(Integer num) {
        this.A0B = num;
        this.A0C = AbstractC166987dD.A1E();
    }

    public MediaKitInfoSheetConfig() {
        this(null);
    }
}
