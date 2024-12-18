package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VyW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69956VyW {
    public static C130455uq A00(List list) {
        if (list != null && !list.isEmpty()) {
            C130455uq c130455uq = (C130455uq) list.get(0);
            C14360o3.A0B(c130455uq, 0);
            if (c130455uq.A02 == EnumC130465ur.A0L) {
                C130485ut c130485ut = c130455uq.A01;
                C14360o3.A0A(c130485ut);
                if (c130485ut.A0H != null) {
                    return c130455uq;
                }
            }
        }
        return null;
    }

    public static C69445VnU A01(UserSession userSession, C67848UzT c67848UzT) {
        List emptyList;
        List emptyList2;
        EnumC68206VFy enumC68206VFy;
        ImageUrl imageUrl;
        List list;
        EnumC132745yx enumC132745yx;
        C69445VnU c69445VnU = new C69445VnU();
        List list2 = c67848UzT.A06;
        if (list2 != null) {
            C14360o3.A0B(userSession, 0);
            emptyList = C127895qI.A06(userSession, null, list2);
        } else {
            emptyList = Collections.emptyList();
        }
        c69445VnU.A08 = emptyList;
        List list3 = c67848UzT.A07;
        if (list3 != null) {
            C14360o3.A0B(userSession, 0);
            emptyList2 = C127895qI.A06(userSession, null, list3);
        } else {
            emptyList2 = Collections.emptyList();
        }
        c69445VnU.A07 = emptyList2;
        Iterator it = c69445VnU.A08.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C132735yw) {
                C132735yw c132735yw = (C132735yw) next;
                if (c132735yw != null) {
                    enumC68206VFy = c132735yw.A00;
                }
            }
        }
        enumC68206VFy = EnumC68206VFy.A0A;
        c69445VnU.A01 = enumC68206VFy;
        c69445VnU.A02 = c67848UzT.A00;
        c69445VnU.A04 = c67848UzT.A02;
        c69445VnU.A0A = !TextUtils.isEmpty(c67848UzT.A03);
        c69445VnU.A03 = c67848UzT.A01;
        List list4 = c67848UzT.A07;
        if (list4 != null && !list4.isEmpty()) {
            Iterator it2 = c67848UzT.A07.iterator();
            while (it2.hasNext()) {
                C38321qM A00 = AbstractC40623Hzh.A00((C130455uq) it2.next());
                if (A00 != null) {
                    imageUrl = A00.A1S();
                    break;
                }
            }
        }
        imageUrl = null;
        c69445VnU.A00 = imageUrl;
        String str = null;
        if (imageUrl != null && !c67848UzT.A07.isEmpty()) {
            Iterator it3 = c67848UzT.A07.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C38321qM A002 = AbstractC40623Hzh.A00((C130455uq) it3.next());
                if (A002 != null) {
                    User A2E = A002.A2E(userSession);
                    if (A2E != null) {
                        str = A2E.getUsername();
                    }
                }
            }
        }
        c69445VnU.A06 = str;
        C130455uq A003 = A00(c67848UzT.A06);
        if (A003 != null) {
            C130485ut c130485ut = A003.A01;
            C14360o3.A0A(c130485ut);
            list = c130485ut.A0H;
        } else {
            list = null;
        }
        c69445VnU.A09 = list;
        C130455uq A004 = A00(c67848UzT.A06);
        if (A004 != null) {
            C130485ut c130485ut2 = A004.A01;
            C14360o3.A0A(c130485ut2);
            enumC132745yx = c130485ut2.A0B;
        } else {
            enumC132745yx = null;
        }
        c69445VnU.A05 = enumC132745yx;
        return c69445VnU;
    }
}
