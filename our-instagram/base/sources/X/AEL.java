package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AEL {
    public static final C180547zi A00(Context context, String str, List list, int i) {
        C14360o3.A0B(list, 2);
        PromptStickerModel promptStickerModel = new PromptStickerModel(null, StoryPromptType.A05, null, C05F.A00, "", "", null, null, null, list, i, 0, false, false, false);
        Integer num = C05F.A01;
        int i2 = 3;
        if (i > 100) {
            i2 = 2;
        }
        C180547zi c180547zi = new C180547zi(context, promptStickerModel, num, str, AbstractC167017dG.A0A(context), -1, i2, AbstractC167017dG.A0D(context));
        c180547zi.A09(0.4f);
        return c180547zi;
    }

    public static final C6RB A01(Context context, String str, int i, int i2, int i3) {
        Spannable spannable = C6RB.A0d;
        C6RB A0z = AbstractC166987dD.A0z(context, AbstractC166997dE.A04(context, i));
        Typeface A0R = AbstractC167017dG.A0R(context);
        if (A0R != null) {
            float A04 = AbstractC166997dE.A04(context, i3);
            A0z.A0I(A0R);
            AbstractC167007dF.A19(A0z, A04, 0.0f);
            AbstractC166997dE.A1A(context, A0z, i2);
            A0z.A0G(2, "...");
            A0z.A0M(str);
            return A0z;
        }
        throw AbstractC166997dE.A0g();
    }
}
