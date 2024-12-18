package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;

/* renamed from: X.AeH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23682AeH implements XCU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ RectF A02;
    public final /* synthetic */ RectF A03;
    public final /* synthetic */ C22P A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ ReelsVisualRepliesModel A06;
    public final /* synthetic */ ClipsCelebrationReshareViewModel A07;
    public final /* synthetic */ MusicOverlayStickerModel A08;
    public final /* synthetic */ File A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ boolean A0D;

    public C23682AeH(Activity activity, RectF rectF, RectF rectF2, C22P c22p, UserSession userSession, ReelsVisualRepliesModel reelsVisualRepliesModel, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, MusicOverlayStickerModel musicOverlayStickerModel, File file, String str, String str2, String str3, int i, boolean z) {
        this.A05 = userSession;
        this.A01 = activity;
        this.A04 = c22p;
        this.A02 = rectF;
        this.A03 = rectF2;
        this.A0B = str;
        this.A00 = i;
        this.A0D = z;
        this.A0C = str2;
        this.A07 = clipsCelebrationReshareViewModel;
        this.A06 = reelsVisualRepliesModel;
        this.A0A = str3;
        this.A08 = musicOverlayStickerModel;
        this.A09 = file;
    }

    @Override // X.XCU
    public final void onFailure(Exception exc) {
        C9GR.A0C(this.A01, MSV.A00(88));
    }

    @Override // X.XCU
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File A0Z = AbstractC166997dE.A0Z(obj);
        Bundle A0b = AbstractC166987dD.A0b();
        C22P c22p = this.A04;
        RectF rectF = this.A02;
        RectF rectF2 = this.A03;
        String str = this.A0B;
        int i = this.A00;
        boolean z = this.A0D;
        String str2 = this.A0C;
        ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel = this.A07;
        ReelsVisualRepliesModel reelsVisualRepliesModel = this.A06;
        String str3 = this.A0A;
        MusicOverlayStickerModel musicOverlayStickerModel = this.A08;
        File file = this.A09;
        A0b.putSerializable("ReelFeedPostShareFragment.ARGUMENTS_KEY_ENTRY_POINT", c22p);
        A0b.putParcelable(AbstractC111324zv.A00(327), rectF);
        A0b.putParcelable(AbstractC111324zv.A00(328), rectF2);
        A0b.putString("ReelFeedPostShareFragment.ARGUMENTS_KEY_MEDIA_ID", str);
        A0b.putInt("ReelFeedPostShareFragment.ARGUMENTS_CAROUSEL_INDEX", i);
        A0b.putString("ReelFeedPostShareFragment.ARGUMENTS_KEY_FILE_PATH", A0Z.getAbsolutePath());
        A0b.putBoolean("ARGUMENTS_MEDIA_SHARED_TO_FEED", z);
        A0b.putString(AbstractC111324zv.A00(329), str2);
        A0b.putParcelable("celebration_reshare_view_model", clipsCelebrationReshareViewModel);
        A0b.putParcelable("ReelFeedPostShareFragment.ARGUMENTS_TARGET_GROUP_PROFILE", null);
        A0b.putParcelable("ReelFeedPostShareFragment.ARGUMENTS_COMMENT_SHARE_MODEL", reelsVisualRepliesModel);
        A0b.putString("ReelFeedPostShareFragment.ARGUMENTS_ACHIEVEMENT_STICKER_URL", str3);
        A0b.putParcelable("ReelFeedPostShareFragment.ARGUMENTS_MUSIC_METADATA", musicOverlayStickerModel);
        if (file != null) {
            A0b.putString("feed_post_share_media_file_path", file.getAbsolutePath());
        }
        UserSession userSession = this.A05;
        Activity activity = this.A01;
        C6XJ.A02(activity, A0b, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(5167)).A0C(activity);
    }
}
