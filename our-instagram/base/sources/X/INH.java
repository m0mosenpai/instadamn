package X;

import android.os.Bundle;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import java.util.List;

/* loaded from: classes7.dex */
public final class INH {
    public C8JW A00;
    public ImageUrl A02;
    public C55U A03;
    public SharePlatformStickerClientModel A04;
    public ReelsVisualRepliesModel A05;
    public EnumC189548aZ A07;
    public MusicAttributionConfig A08;
    public AudioOverlayTrack A09;
    public InstagramAudioApplySource A0A;
    public PendingRecipient A0B;
    public PromptStickerModel A0C;
    public QuestionResponseReshareModel A0D;
    public Boolean A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public List A0g;
    public List A0h;
    public List A0i;
    public List A0j;
    public java.util.Set A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public final C22P A10;
    public EnumC185548Kw A01 = EnumC185548Kw.A05;
    public C5JK A06 = C5JK.A05;
    public boolean A0v = true;

    public INH(C22P c22p) {
        this.A10 = c22p;
    }

    public final void A01(C55U c55u) {
        C14360o3.A0B(c55u, 0);
        java.util.Set set = this.A0k;
        if (set != null) {
            set.add(c55u);
        } else {
            this.A0k = AbstractC16830sb.A06(c55u);
        }
    }

    public final Bundle A00() {
        String str = this.A0M;
        MusicAttributionConfig musicAttributionConfig = this.A08;
        String str2 = this.A0Q;
        String str3 = this.A0O;
        Boolean bool = this.A0E;
        String str4 = this.A0R;
        String str5 = this.A0P;
        ImageUrl imageUrl = this.A02;
        String str6 = this.A0L;
        String str7 = this.A0K;
        String str8 = this.A0G;
        String str9 = this.A0c;
        String str10 = this.A0J;
        InstagramAudioApplySource instagramAudioApplySource = this.A0A;
        String str11 = this.A0H;
        String str12 = this.A0I;
        String str13 = this.A0f;
        EnumC189548aZ enumC189548aZ = this.A07;
        ReelsVisualRepliesModel reelsVisualRepliesModel = this.A05;
        List list = this.A0h;
        List list2 = this.A0i;
        List list3 = this.A0g;
        String str14 = this.A0e;
        String str15 = this.A0d;
        String str16 = this.A0X;
        String str17 = this.A0b;
        String str18 = this.A0V;
        String str19 = this.A0W;
        String str20 = this.A0Z;
        C8JW c8jw = this.A00;
        PendingRecipient pendingRecipient = this.A0B;
        java.util.Set set = this.A0k;
        C55U c55u = this.A03;
        PromptStickerModel promptStickerModel = this.A0C;
        SharePlatformStickerClientModel sharePlatformStickerClientModel = this.A04;
        QuestionResponseReshareModel questionResponseReshareModel = this.A0D;
        EnumC185548Kw enumC185548Kw = this.A01;
        C22P c22p = this.A10;
        C5JK c5jk = this.A06;
        boolean z = this.A0m;
        boolean z2 = this.A0q;
        boolean z3 = this.A0l;
        boolean z4 = this.A0r;
        boolean z5 = this.A0t;
        boolean z6 = this.A0u;
        boolean z7 = this.A0s;
        boolean z8 = this.A0x;
        String str21 = this.A0F;
        boolean z9 = this.A0w;
        boolean z10 = this.A0y;
        List list4 = this.A0j;
        AudioOverlayTrack audioOverlayTrack = this.A09;
        String str22 = this.A0N;
        boolean z11 = this.A0v;
        boolean z12 = this.A0n;
        return ALh.A00(c22p, null, c8jw, null, null, enumC185548Kw, null, imageUrl, c55u, sharePlatformStickerClientModel, reelsVisualRepliesModel, c5jk, enumC189548aZ, null, musicAttributionConfig, audioOverlayTrack, instagramAudioApplySource, pendingRecipient, promptStickerModel, questionResponseReshareModel, bool, null, str, null, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, null, null, str14, str15, str16, str17, str18, str19, str20, str21, str22, this.A0T, this.A0S, this.A0U, this.A0a, this.A0Y, list, list2, list3, list4, null, set, z, z2, z3, z4, z5, z6, z7, z8, false, z9, z10, z11, z12, this.A0p, this.A0o, this.A0z, true);
    }
}
