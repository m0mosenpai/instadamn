package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDict;
import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDict;
import java.io.IOException;

/* renamed from: X.8wX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC201988wX {
    public static StoryTemplateGiphyStickerDict parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            StoryTemplateGiphyStickerImageDict storyTemplateGiphyStickerImageDict = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("gif_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("image".equals(A0q)) {
                    storyTemplateGiphyStickerImageDict = AbstractC201998wY.parseFromJson(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC50531MSk.A02(42, 8, 43).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new StoryTemplateGiphyStickerDict(storyTemplateGiphyStickerImageDict, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
