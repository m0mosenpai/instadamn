package X;

import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.StoryPollColorType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FAc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34282FAc {
    public static C101394gx A00(PollType pollType, InterfaceC87503vI interfaceC87503vI, StoryPollColorType storyPollColorType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, Integer num3, String str, String str2, String str3, List list, List list2) {
        ArrayList arrayList;
        C87493vH c87493vH;
        ArrayList arrayList2 = null;
        C1DY A0b = AbstractC25235BEs.A0b(new C37761pD(null));
        if (list != null) {
            arrayList = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC31180DnO.A1V(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        if (interfaceC87503vI != null) {
            c87493vH = interfaceC87503vI.Ezd(A0b);
        } else {
            c87493vH = null;
        }
        if (list2 != null) {
            arrayList2 = AbstractC167007dF.A0i(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                AbstractC31180DnO.A1V(arrayList2, it2);
            }
        }
        return new C101394gx(pollType, c87493vH, storyPollColorType, bool, bool2, bool3, bool4, bool5, num, num2, num3, str, str2, str3, arrayList, arrayList2);
    }
}
