package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;

/* loaded from: classes9.dex */
public final class OwO implements XCU {
    public final /* synthetic */ MusicOverlayStickerModel A00;
    public final /* synthetic */ C54603OAe A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public OwO(MusicOverlayStickerModel musicOverlayStickerModel, C54603OAe c54603OAe, String str, String str2) {
        this.A01 = c54603OAe;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = musicOverlayStickerModel;
    }

    @Override // X.XCU
    public final void onFailure(Exception exc) {
        C9GR.A0C(this.A01.A00, "createBackgroundInputFile_unknown_error_occured");
    }

    @Override // X.XCU
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        C14360o3.A0B(file, 0);
        C54603OAe c54603OAe = this.A01;
        UserSession userSession = c54603OAe.A02;
        AbstractC73317Y7a.A0K(c54603OAe.A01, userSession, userSession.userId, "profile_card", "add_to_your_story", "");
        String canonicalPath = file.getCanonicalPath();
        String str = this.A02;
        String str2 = this.A03;
        MusicOverlayStickerModel musicOverlayStickerModel = this.A00;
        Bundle A0E = AbstractC31174DnI.A0E(canonicalPath, 0);
        A0E.putString("ReelShareProfileCardStickerFragment.ARGUMENTS_KEY_BACKGROUND_FILE_PATH", canonicalPath);
        A0E.putString("ReelShareProfileCardStickerFragment.ARGUMENTS_KEY_PROFILECARD_CACHE", str);
        A0E.putString("ReelShareProfileCardStickerFragment.ARGUMENTS_KEY_PROFILECARD_URL", str2);
        A0E.putParcelable("ReelShareProfileCardStickerFragment.ARGUMENTS_KEY_PROFILECARD_MUSIC_MODEL", musicOverlayStickerModel);
        FragmentActivity fragmentActivity = c54603OAe.A00;
        C6XJ.A02(fragmentActivity, A0E, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(5185)).A0C(fragmentActivity);
    }
}
