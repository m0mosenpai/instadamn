package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import java.util.List;

/* renamed from: X.CGd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27607CGd {
    public static final C26738BrJ A00(UserSession userSession, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        int i;
        AbstractC167027dH.A12(userSession, str, str2);
        AbstractC25233BEq.A0y(5, str4, str6, list);
        C09530e4 A1L = AbstractC166987dD.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        C09530e4 A1L2 = AbstractC166987dD.A1L(AbstractC111324zv.A00(3796), str);
        C09530e4 A1L3 = AbstractC166987dD.A1L("PROFILE_PIC_URL_ARGUMENT", imageUrl);
        C09530e4 A1L4 = AbstractC166987dD.A1L("TEXT_ARGUMENT", str2);
        C09530e4 A1L5 = AbstractC166987dD.A1L("NOTE_ID_ARGUMENT", str3);
        C09530e4 A1L6 = AbstractC166987dD.A1L("MEDIA_ID_ARGUMENT", str4);
        C09530e4 A1L7 = AbstractC166987dD.A1L("MEDIA_CODE_ARGUMENT", str5);
        if (num != null) {
            i = num.intValue();
        } else {
            i = NoteAudience.A08.A00;
        }
        Bundle A00 = AbstractC61636Rr0.A00(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, AbstractC166987dD.A1L("AUDIENCE_ARGUMENT", Integer.valueOf(i)), AbstractC166987dD.A1L("MODULE_NAME_ARGUMENT", str6), AbstractC166987dD.A1L("INVENTORY_SOURCE_ARGUMENT", str7), AbstractC166987dD.A1L("RANKING_INFO_TOKEN_ARGUMENT", str8), AbstractC166987dD.A1L("MEDIA_POSITION_ARGUMENT", num2), AbstractC166987dD.A1L("CAROUSEL_CHILD_ID_ARGUMENT", str9), AbstractC166987dD.A1L("CAROUSEL_CHILD_INDEX_ARGUMENT", num3), AbstractC166987dD.A1L("PREVIEW_URL_ARGUMENT", imageUrl2));
        A00.putParcelableArrayList("LIKERS_LIST_ARGUMENT", AbstractC166987dD.A1F(list));
        C26738BrJ c26738BrJ = new C26738BrJ();
        c26738BrJ.setArguments(A00);
        return c26738BrJ;
    }
}
