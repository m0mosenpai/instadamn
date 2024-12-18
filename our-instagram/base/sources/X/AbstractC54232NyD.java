package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import java.util.Map;

/* renamed from: X.NyD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54232NyD {
    public static void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, NX7 nx7, MediaTaggingInfo mediaTaggingInfo, EnumC53319Nhv enumC53319Nhv, InterfaceC58084Pp9 interfaceC58084Pp9, InterfaceC58159PqO interfaceC58159PqO, Map map, boolean z, boolean z2, boolean z3) {
        ImageUrl imageUrl = mediaTaggingInfo.A02;
        if (imageUrl != null) {
            nx7.A00.setUrl(imageUrl, interfaceC11380iw);
        }
        if (mediaTaggingInfo.A0H || imageUrl != null) {
            nx7.A02.A00 = AbstractC55229Oez.A00(mediaTaggingInfo);
        }
        TagsInteractiveLayout tagsInteractiveLayout = nx7.A01;
        tagsInteractiveLayout.A0H = z;
        tagsInteractiveLayout.removeAllViews();
        nx7.A01.setTags(mediaTaggingInfo, false, userSession);
        TagsInteractiveLayout tagsInteractiveLayout2 = nx7.A01;
        tagsInteractiveLayout2.A08 = interfaceC58159PqO;
        tagsInteractiveLayout2.A06 = interfaceC58084Pp9;
        tagsInteractiveLayout2.A0E = z2;
        tagsInteractiveLayout2.A0D = z3;
        tagsInteractiveLayout2.setEditingTagType(enumC53319Nhv);
        nx7.A00(AbstractC55229Oez.A02(mediaTaggingInfo, OWJ.A00.A01(userSession, mediaTaggingInfo.A07, false)));
        map.put(mediaTaggingInfo.A06, nx7.A01);
    }
}
