package X;

import android.os.Bundle;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* loaded from: classes5.dex */
public abstract class CJ9 {
    public static final Bundle A00(C8JW c8jw, PromptStickerModel promptStickerModel, String str) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("media_id", str);
        A0b.putParcelable("prompt_sticker_model", C0B1.A00(promptStickerModel.A02()));
        A0b.putSerializable(AbstractC111324zv.A00(1194), c8jw);
        return A0b;
    }
}
