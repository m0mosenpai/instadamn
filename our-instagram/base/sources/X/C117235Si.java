package X;

import android.content.Context;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.model.OriginalPartsAttributionModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117235Si implements InterfaceC88553xD {
    public final int A00;
    public final OriginalAudioSubtype A01;
    public final OriginalSoundConsumptionInfoIntf A02;
    public final ImageUrl A03;
    public final User A04;
    public final User A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final long A0O;
    public final OriginalSoundDataIntf A0P;
    public final AudioType A0Q;
    public final MusicDataSource A0R;
    public final Integer A0S;
    public final List A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;

    public C117235Si(OriginalSoundDataIntf originalSoundDataIntf) {
        int i;
        this.A0P = originalSoundDataIntf;
        this.A0E = originalSoundDataIntf.getOriginalMediaId();
        this.A05 = originalSoundDataIntf.BFU();
        String progressiveDownloadUrl = originalSoundDataIntf.getProgressiveDownloadUrl();
        this.A0F = progressiveDownloadUrl;
        String dashManifest = originalSoundDataIntf.getDashManifest();
        this.A0A = dashManifest;
        Integer Azi = originalSoundDataIntf.Azi();
        if (Azi != null) {
            i = Azi.intValue();
        } else {
            i = 0;
        }
        this.A00 = i;
        this.A0V = originalSoundDataIntf.getHideRemixing();
        this.A0H = C14360o3.A0K(originalSoundDataIntf.Akf(), true);
        this.A0I = C14360o3.A0K(originalSoundDataIntf.Akg(), true);
        this.A0N = originalSoundDataIntf.getShouldMuteAudio();
        this.A0D = originalSoundDataIntf.getOriginalAudioTitle();
        this.A0U = originalSoundDataIntf.getAllowCreatorToRename();
        this.A0G = originalSoundDataIntf.Adv();
        List Adw = originalSoundDataIntf.Adw();
        this.A0T = Adw == null ? C16930sl.A00 : Adw;
        this.A01 = originalSoundDataIntf.BZj();
        this.A02 = originalSoundDataIntf.AqX();
        this.A0L = originalSoundDataIntf.isAudioAutomaticallyAttributed();
        C14360o3.A0K(originalSoundDataIntf.Cc7(), true);
        this.A09 = originalSoundDataIntf.getAudioAssetId();
        this.A04 = originalSoundDataIntf.BFU();
        this.A06 = originalSoundDataIntf.BFU().getId();
        this.A07 = originalSoundDataIntf.BFU().getUsername();
        this.A0W = originalSoundDataIntf.BFU().isVerified();
        this.A08 = originalSoundDataIntf.getAudioAssetId();
        this.A0O = Long.parseLong(originalSoundDataIntf.getAudioAssetId());
        this.A0C = originalSoundDataIntf.getOriginalMediaId();
        this.A03 = originalSoundDataIntf.BFU().Bhu();
        this.A0X = originalSoundDataIntf.AqX().isBookmarked();
        this.A0J = originalSoundDataIntf.isExplicit();
        Boolean CT1 = originalSoundDataIntf.CT1();
        this.A0K = CT1 != null ? CT1.booleanValue() : false;
        this.A0M = originalSoundDataIntf.AqX().isTrendingInClips();
        this.A0S = originalSoundDataIntf.CAx();
        this.A0B = originalSoundDataIntf.getFormattedClipsMediaCount();
        String str = this.A08;
        String str2 = this.A06;
        AudioType audioType = AudioType.A04;
        this.A0R = new MusicDataSource(null, audioType, progressiveDownloadUrl, dashManifest, str, str2);
        Iterator it = this.A0G.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                C0w9.A03("ClipsOriginalSoundModel", AnonymousClass001.A0v("Null audio part received for original audio_asset_id: {", this.A08, "} and original_media_id: {", this.A0E, '}'));
            }
        }
        this.A0Q = audioType;
    }

    @Override // X.InterfaceC88553xD
    public final boolean Cat(String str) {
        C14360o3.A0B(str, 0);
        User user = this.A04;
        if (user.A0M() != C05F.A01 && !C14360o3.A0K(user.getId(), str)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC88553xD
    public final MusicAttributionConfig Cq1(Context context) {
        String str = this.A08;
        String str2 = this.A0F;
        String str3 = this.A0A;
        String str4 = this.A07;
        String str5 = this.A0D;
        ImageUrl A0C = this.A04.A0C();
        ImageUrl imageUrl = this.A03;
        int i = this.A00;
        boolean z = this.A0J;
        String str6 = this.A0C;
        boolean z2 = this.A0H;
        boolean z3 = this.A0I;
        OriginalAudioSubtype originalAudioSubtype = this.A01;
        ArrayList arrayList = new ArrayList();
        for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf : AbstractC001800i.A0X(this.A0G)) {
            arrayList.add(new OriginalPartsAttributionModel(originalAudioPartMetadataIntf.C88(), originalAudioPartMetadataIntf.getDisplayArtist(), originalAudioPartMetadataIntf.getDisplayTitle(), originalAudioPartMetadataIntf.isExplicit()));
        }
        Boolean valueOf = Boolean.valueOf(this.A0L);
        boolean z4 = this.A0K;
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        musicAssetModel.A0E = str;
        musicAssetModel.A0B = null;
        musicAssetModel.A0H = str2;
        musicAssetModel.A0C = str3;
        musicAssetModel.A0J = null;
        musicAssetModel.A0I = str5;
        musicAssetModel.A0D = str4;
        musicAssetModel.A0A = null;
        musicAssetModel.A02 = A0C;
        musicAssetModel.A03 = imageUrl;
        musicAssetModel.A00 = i;
        musicAssetModel.A0S = z;
        musicAssetModel.A0Q = z4;
        musicAssetModel.A0R = false;
        musicAssetModel.A0O = false;
        musicAssetModel.A0U = true;
        musicAssetModel.A0G = str6;
        musicAssetModel.A09 = null;
        musicAssetModel.A0M = z2;
        musicAssetModel.A0N = z3;
        musicAssetModel.A0T = false;
        musicAssetModel.A0F = null;
        musicAssetModel.A01 = originalAudioSubtype;
        musicAssetModel.A0K = arrayList;
        musicAssetModel.A07 = valueOf;
        MusicAssetModel.A04(musicAssetModel);
        return new MusicAttributionConfig(null, musicAssetModel, null, this.A02.getShouldMuteAudioReason(), 0, this.A0N, true);
    }

    @Override // X.InterfaceC88553xD
    public final String Ach() {
        return this.A07;
    }

    @Override // X.InterfaceC88553xD
    public final User Ade() {
        return this.A04;
    }

    @Override // X.InterfaceC88553xD
    public final long Adf() {
        return this.A0O;
    }

    @Override // X.InterfaceC88553xD
    public final ImageUrl Adk() {
        return this.A03;
    }

    @Override // X.InterfaceC88553xD
    public final List Adv() {
        return AbstractC001800i.A0X(this.A0G);
    }

    @Override // X.InterfaceC88553xD
    public final List Adw() {
        return AbstractC001800i.A0X(this.A0T);
    }

    @Override // X.InterfaceC88553xD
    public final OriginalAudioSubtype Ae4() {
        return this.A01;
    }

    @Override // X.InterfaceC88553xD
    public final AudioType Ae7() {
        return this.A0Q;
    }

    @Override // X.InterfaceC88553xD
    public final /* synthetic */ List AyW() {
        return null;
    }

    @Override // X.InterfaceC88573xF
    public final MusicDataSource BVb() {
        return this.A0R;
    }

    @Override // X.InterfaceC88553xD
    public final String BZi() {
        return this.A0C;
    }

    @Override // X.InterfaceC88553xD
    public final MusicMuteAudioReason BvC() {
        return this.A02.BvC();
    }

    @Override // X.InterfaceC88553xD
    public final Integer CAx() {
        return this.A0S;
    }

    @Override // X.InterfaceC88553xD
    public final boolean CQ8() {
        return this.A0W;
    }

    @Override // X.InterfaceC88553xD
    public final boolean CQ9() {
        return this.A0X;
    }

    @Override // X.InterfaceC88553xD
    public final boolean CQA() {
        return this.A0J;
    }

    @Override // X.InterfaceC88553xD
    public final boolean CS2() {
        return this.A0U;
    }

    @Override // X.InterfaceC88553xD
    public final boolean Ceq() {
        return this.A0M;
    }

    @Override // X.InterfaceC88553xD
    public final boolean CfD() {
        if (!this.A0N && !this.A0V) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC88563xE
    public final boolean Ej0() {
        return this.A0N;
    }

    @Override // X.InterfaceC88553xD
    public final String getArtistId() {
        return this.A06;
    }

    @Override // X.InterfaceC88553xD
    public final String getAssetId() {
        return this.A08;
    }

    @Override // X.InterfaceC88553xD
    public final String getAudioAssetId() {
        return this.A09;
    }

    @Override // X.InterfaceC88563xE
    public final String getShouldMuteAudioReason() {
        return this.A02.getShouldMuteAudioReason();
    }

    @Override // X.InterfaceC88553xD
    public final boolean isEligibleForAudioEffects() {
        return this.A0K;
    }

    @Override // X.InterfaceC88553xD
    public final String AD3(Context context) {
        return this.A0D;
    }
}
