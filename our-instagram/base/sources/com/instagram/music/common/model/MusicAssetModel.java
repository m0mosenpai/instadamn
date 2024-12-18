package com.instagram.music.common.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25230BEn;
import X.AbstractC31176DnK;
import X.C41856IgA;
import X.C42733IvT;
import X.InterfaceC88573xF;
import X.JIN;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class MusicAssetModel implements Parcelable, InterfaceC88573xF {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(78);
    public int A00;
    public ImageUrl A02;
    public ImageUrl A03;
    public ClipsPreloadedSettingItem A04;
    public MusicDataSource A05;
    public User A06;
    public Boolean A07;
    public Boolean A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public OriginalAudioSubtype A01 = OriginalAudioSubtype.A05;
    public List A0K = AbstractC166987dD.A1E();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static MusicAssetModel A00(OriginalSoundDataIntf originalSoundDataIntf, boolean z) {
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        musicAssetModel.A0E = originalSoundDataIntf.getAudioAssetId();
        musicAssetModel.A0H = originalSoundDataIntf.getProgressiveDownloadUrl();
        musicAssetModel.A0C = originalSoundDataIntf.getDashManifest();
        musicAssetModel.A0I = originalSoundDataIntf.getOriginalAudioTitle();
        musicAssetModel.A06 = originalSoundDataIntf.BFU();
        musicAssetModel.A0D = originalSoundDataIntf.BFU().getUsername();
        musicAssetModel.A02 = new SimpleImageUrl(originalSoundDataIntf.BFU().Bhu());
        musicAssetModel.A03 = new SimpleImageUrl(originalSoundDataIntf.BFU().Bhu());
        musicAssetModel.A00 = originalSoundDataIntf.Azi().intValue();
        musicAssetModel.A0S = originalSoundDataIntf.isExplicit();
        Boolean bool = Boolean.TRUE;
        musicAssetModel.A0Q = bool.equals(originalSoundDataIntf.CT1());
        musicAssetModel.A0P = z;
        musicAssetModel.A0U = true;
        musicAssetModel.A0G = originalSoundDataIntf.getOriginalMediaId();
        musicAssetModel.A01 = originalSoundDataIntf.BZj();
        musicAssetModel.A0R = bool.equals(originalSoundDataIntf.CTb());
        A04(musicAssetModel);
        return musicAssetModel;
    }

    public static MusicAssetModel A01(TrackData trackData, boolean z) {
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        musicAssetModel.A0E = trackData.getId();
        musicAssetModel.A0B = trackData.getAudioClusterId();
        musicAssetModel.A0H = trackData.getProgressiveDownloadUrl();
        musicAssetModel.A0C = trackData.getDashManifest();
        musicAssetModel.A0J = trackData.BE6();
        musicAssetModel.A0I = trackData.getTitle();
        musicAssetModel.A0D = trackData.getDisplayArtist();
        musicAssetModel.A02 = new SimpleImageUrl(trackData.AsF());
        musicAssetModel.A03 = new SimpleImageUrl(trackData.AsE());
        musicAssetModel.A00 = trackData.Azi().intValue();
        musicAssetModel.A0S = trackData.isExplicit();
        Boolean bool = Boolean.TRUE;
        musicAssetModel.A0Q = bool.equals(trackData.CT1());
        musicAssetModel.A0R = bool.equals(trackData.CTb());
        musicAssetModel.A0O = trackData.BC4().booleanValue();
        musicAssetModel.A09 = null;
        musicAssetModel.A0P = z;
        musicAssetModel.A0L = trackData.getAllowsSaving();
        A04(musicAssetModel);
        return musicAssetModel;
    }

    public static MusicAssetModel A02(JIN jin) {
        Boolean valueOf;
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        musicAssetModel.A0E = jin.getId();
        musicAssetModel.A0B = jin.getAudioClusterId();
        musicAssetModel.A0H = jin.CAL();
        musicAssetModel.A0C = jin.CAA();
        musicAssetModel.A0J = jin.BE6();
        musicAssetModel.A0I = jin.getTitle();
        musicAssetModel.A0D = jin.getDisplayArtist();
        musicAssetModel.A0A = jin.getArtistId();
        musicAssetModel.A02 = jin.AsR();
        musicAssetModel.A03 = jin.AsT();
        musicAssetModel.A00 = jin.CAB();
        musicAssetModel.A0S = jin.isExplicit();
        Boolean bool = Boolean.TRUE;
        musicAssetModel.A0Q = bool.equals(Boolean.valueOf(jin.isEligibleForAudioEffects()));
        musicAssetModel.A0O = jin.CLE();
        musicAssetModel.A09 = jin.Aal();
        musicAssetModel.A0P = jin.isBookmarked();
        musicAssetModel.A0L = jin.ABI();
        musicAssetModel.A08 = Boolean.valueOf(jin.Ceq());
        if (AudioType.A04.equals(jin.CBi())) {
            musicAssetModel.A0U = true;
            OriginalSoundDataIntf originalSoundDataIntf = ((C42733IvT) jin).A02;
            musicAssetModel.A06 = originalSoundDataIntf.BFU();
            musicAssetModel.A0G = originalSoundDataIntf.getOriginalMediaId();
            musicAssetModel.A0M = AbstractC167007dF.A1T(originalSoundDataIntf.Akf());
            musicAssetModel.A0N = AbstractC167007dF.A1T(originalSoundDataIntf.Akg());
            musicAssetModel.A01 = originalSoundDataIntf.BZj();
            List<OriginalAudioPartMetadataIntf> Adv = originalSoundDataIntf.Adv();
            ArrayList A0q = AbstractC25230BEn.A0q(Adv);
            for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf : Adv) {
                A0q.add(new OriginalPartsAttributionModel(originalAudioPartMetadataIntf.C88(), originalAudioPartMetadataIntf.getDisplayArtist(), originalAudioPartMetadataIntf.getDisplayTitle(), originalAudioPartMetadataIntf.isExplicit()));
            }
            musicAssetModel.A0K = A0q;
            valueOf = originalSoundDataIntf.CTb();
        } else {
            valueOf = Boolean.valueOf(jin.CTc());
        }
        musicAssetModel.A0R = bool.equals(valueOf);
        A04(musicAssetModel);
        return musicAssetModel;
    }

    public static MusicAssetModel A03(MusicOverlayStickerModel musicOverlayStickerModel) {
        ImageUrl imageUrl;
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        musicAssetModel.A0E = musicOverlayStickerModel.A0S;
        musicAssetModel.A0B = musicOverlayStickerModel.A0T;
        musicAssetModel.A0H = musicOverlayStickerModel.A0g;
        musicAssetModel.A0C = musicOverlayStickerModel.A0W;
        musicAssetModel.A0J = musicOverlayStickerModel.A0q;
        musicAssetModel.A0S = musicOverlayStickerModel.A0s;
        Boolean bool = Boolean.TRUE;
        musicAssetModel.A0Q = bool.equals(musicOverlayStickerModel.A0B);
        musicAssetModel.A0R = bool.equals(musicOverlayStickerModel.A0C);
        musicAssetModel.A0O = musicOverlayStickerModel.A08.booleanValue();
        musicAssetModel.A00 = musicOverlayStickerModel.A0N.intValue();
        musicAssetModel.A09 = musicOverlayStickerModel.A0Q;
        musicAssetModel.A0L = musicOverlayStickerModel.A0r;
        musicAssetModel.A0P = musicOverlayStickerModel.A0A.booleanValue();
        Boolean bool2 = musicOverlayStickerModel.A0E;
        if (bool2 != null && bool2.booleanValue()) {
            musicAssetModel.A0I = musicOverlayStickerModel.A0m;
            musicAssetModel.A0U = true;
            musicAssetModel.A0G = musicOverlayStickerModel.A0e;
            User user = musicOverlayStickerModel.A05;
            if (user != null) {
                musicAssetModel.A0D = user.getUsername();
                musicAssetModel.A0A = user.getId();
                musicAssetModel.A02 = user.A0C();
                imageUrl = user.Bhu();
            } else {
                musicAssetModel.A0D = musicOverlayStickerModel.A0Y;
                musicAssetModel.A0A = musicOverlayStickerModel.A0R;
                musicAssetModel.A02 = musicOverlayStickerModel.A04;
                imageUrl = musicOverlayStickerModel.A03;
            }
            musicAssetModel.A03 = imageUrl;
        } else {
            musicAssetModel.A0I = musicOverlayStickerModel.A0m;
            musicAssetModel.A0D = musicOverlayStickerModel.A0Y;
            musicAssetModel.A0A = musicOverlayStickerModel.A0R;
            musicAssetModel.A02 = musicOverlayStickerModel.A04;
            musicAssetModel.A03 = musicOverlayStickerModel.A03;
            musicAssetModel.A0U = false;
        }
        A04(musicAssetModel);
        return musicAssetModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(com.instagram.music.common.model.MusicAssetModel r9) {
        /*
            java.lang.String r5 = r9.A0H
            java.lang.String r1 = "MusicAssetModel"
            if (r5 != 0) goto L5d
            java.lang.String r0 = r9.A0C
            if (r0 != 0) goto L5d
            boolean r0 = r9.A0T
            if (r0 == 0) goto L49
            java.lang.String r2 = r9.A0F
            if (r2 == 0) goto L49
            r5 = 0
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            android.net.Uri r3 = android.net.Uri.fromFile(r0)
            java.lang.String r7 = r9.A0E
            java.lang.String r8 = r9.A0A
            boolean r0 = r9.A0U
            if (r0 == 0) goto L46
            com.instagram.music.common.model.AudioType r4 = com.instagram.music.common.model.AudioType.A04
        L26:
            com.instagram.music.common.model.MusicDataSource r2 = new com.instagram.music.common.model.MusicDataSource
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8)
        L2c:
            r9.A05 = r2
        L2e:
            int r0 = r9.A00
            if (r0 > 0) goto L45
            r0 = 15000(0x3a98, float:2.102E-41)
            r9.A00 = r0
            java.lang.String r0 = r9.A0E
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r0 = "MusicAssetModel has invalid mTrackDurationInMs for music asset id: %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            X.C0w9.A03(r1, r0)
        L45:
            return
        L46:
            com.instagram.music.common.model.AudioType r4 = com.instagram.music.common.model.AudioType.A03
            goto L26
        L49:
            java.lang.String r0 = r9.A0E
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            r0 = 667(0x29b, float:9.35E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r0 = java.lang.String.format(r0, r2)
            X.C0w9.A03(r1, r0)
            goto L2e
        L5d:
            java.lang.String r6 = r9.A0C
            r3 = 0
            java.lang.String r7 = r9.A0E
            java.lang.String r8 = r9.A0A
            boolean r0 = r9.A0U
            if (r0 == 0) goto L70
            com.instagram.music.common.model.AudioType r4 = com.instagram.music.common.model.AudioType.A04
        L6a:
            com.instagram.music.common.model.MusicDataSource r2 = new com.instagram.music.common.model.MusicDataSource
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L2c
        L70:
            com.instagram.music.common.model.AudioType r4 = com.instagram.music.common.model.AudioType.A03
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.common.model.MusicAssetModel.A04(com.instagram.music.common.model.MusicAssetModel):void");
    }

    public final int A05() {
        List list = this.A0J;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return AbstractC31176DnK.A01(this.A0J, 0);
    }

    @Override // X.InterfaceC88573xF
    public final MusicDataSource BVb() {
        return this.A05;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0C);
        parcel.writeList(this.A0J);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        AbstractC166997dE.A1I(parcel, this.A01);
        parcel.writeList(this.A0K);
        parcel.writeInt(this.A07.booleanValue() ? 1 : 0);
        parcel.writeInt(this.A08.booleanValue() ? 1 : 0);
    }

    public MusicAssetModel() {
        Boolean A0a = AbstractC166997dE.A0a();
        this.A07 = A0a;
        this.A04 = null;
        this.A08 = A0a;
    }
}
