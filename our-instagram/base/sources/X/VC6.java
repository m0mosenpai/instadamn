package X;

import android.os.Bundle;
import com.instagram.direct.sharetostory.data.JoinChatStickerData;
import java.io.File;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class VC6 extends AbstractC67881V0m {
    public static final String __redex_internal_original_name = "ReelJoinChatShareFragment";
    public C22P A00;
    public JoinChatStickerData A01;
    public File A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reels_join_chat_share_fragment";
    }

    @Override // X.AbstractC67881V0m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        File file;
        int A02 = C0f9.A02(1069475831);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("ReelJoinChatShareConstants.ARGUMENTS_KEY_JOIN_CHAT_BACKGROUND_FILE_PATH");
        if (serializable instanceof File) {
            file = (File) serializable;
        } else {
            file = null;
        }
        this.A02 = file;
        Object obj = requireArguments.get(AbstractC111324zv.A00(676));
        C14360o3.A0C(obj, MSV.A00(237));
        this.A00 = (C22P) obj;
        this.A01 = (JoinChatStickerData) AbstractC153636vY.A00(requireArguments, JoinChatStickerData.class, AbstractC111324zv.A00(677));
        C0f9.A09(1218977838, A02);
    }
}
