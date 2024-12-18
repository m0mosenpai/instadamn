package X;

import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4w0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109334w0 {
    public static StoryTemplateFillableStickersDictImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            StoryTemplateFillableMusicStickerDictImpl storyTemplateFillableMusicStickerDictImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("fillable_gallery_stickers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            StoryTemplateFillableGalleryStickerDictImpl parseFromJson = C9xT.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("fillable_music_sticker".equals(A0q)) {
                    storyTemplateFillableMusicStickerDictImpl = AbstractC109344w1.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new StoryTemplateFillableStickersDictImpl(storyTemplateFillableMusicStickerDictImpl, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
