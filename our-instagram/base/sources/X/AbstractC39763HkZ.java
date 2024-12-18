package X;

import com.instagram.api.schemas.AvatarNoteResponseInfo;
import com.instagram.api.schemas.MediaType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HkZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39763HkZ {
    public static Map A00(AvatarNoteResponseInfo avatarNoteResponseInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (avatarNoteResponseInfo.Aef() != null) {
            MediaType Aef = avatarNoteResponseInfo.Aef();
            C14360o3.A0B(Aef, 0);
            A1I.put("avatar_sticker_media_type", Aef.A00);
        }
        if (avatarNoteResponseInfo.Aeg() != null) {
            A1I.put("avatar_sticker_template_id", avatarNoteResponseInfo.Aeg());
        }
        if (avatarNoteResponseInfo.Amg() != null) {
            A1I.put("cdn_url", avatarNoteResponseInfo.Amg());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
