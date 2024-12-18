package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3kd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81683kd {
    public static ArrayList A04(User user, List list) {
        ImageUrl Bhu;
        ArrayList arrayList = new ArrayList();
        if (list.size() < 2) {
            if (list.isEmpty()) {
                Bhu = user.Bhu();
            } else {
                Bhu = ((AnonymousClass173) list.get(0)).Bhu();
            }
            arrayList.add(Bhu);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AnonymousClass173) it.next()).Bhu());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r6.size() < 2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A06(com.instagram.user.model.User r5, java.util.List r6, boolean r7) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r6 == 0) goto L28
            java.util.Iterator r3 = r6.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r3.next()
            X.172 r0 = (X.AnonymousClass172) r0
            java.lang.String r2 = r0.getId()
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bhu()
            X.4GS r0 = new X.4GS
            r0.<init>(r1, r2)
            r4.add(r0)
            goto Lb
        L28:
            r3 = 0
            if (r6 == 0) goto L3e
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L3e
            if (r7 != 0) goto L3d
            int r1 = r6.size()
            r0 = 2
            if (r1 >= r0) goto L3d
        L3a:
            r4.add(r3)
        L3d:
            return r4
        L3e:
            com.instagram.common.typedurl.ImageUrl r2 = r5.Bhu()
            java.lang.String r1 = r5.getId()
            X.4GS r0 = new X.4GS
            r0.<init>(r2, r1)
            if (r7 == 0) goto L51
            r4.add(r0)
            return r4
        L51:
            r4.add(r0)
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC81683kd.A06(com.instagram.user.model.User, java.util.List, boolean):java.util.ArrayList");
    }

    public static C3AY A00(ImageUrl imageUrl, User user, String str, String str2, List list) {
        ImageUrl imageUrl2;
        C3AY A01 = A01(imageUrl, user, str, str2, list);
        Object obj = A01.A00;
        ImageUrl imageUrl3 = null;
        if (obj != null) {
            imageUrl2 = ((C4GS) obj).A00;
        } else {
            imageUrl2 = null;
        }
        Object obj2 = A01.A01;
        if (obj2 != null) {
            imageUrl3 = ((C4GS) obj2).A00;
        }
        return new C3AY(imageUrl2, imageUrl3);
    }

    public static C3AY A01(ImageUrl imageUrl, User user, String str, String str2, List list) {
        C4GS c4gs;
        String id;
        ImageUrl Bhu;
        C4GS c4gs2 = null;
        if (list.isEmpty()) {
            return new C3AY(new C4GS(user.Bhu(), user.getId()), null);
        }
        if (list.size() == 1) {
            AnonymousClass172 anonymousClass172 = (AnonymousClass172) list.get(0);
            if (anonymousClass172.getId().equals(str)) {
                c4gs2 = new C4GS(anonymousClass172.Bhu(), anonymousClass172.getId());
                id = user.getId();
                Bhu = user.Bhu();
            } else {
                c4gs2 = new C4GS(user.Bhu(), user.getId());
                id = anonymousClass172.getId();
                Bhu = anonymousClass172.Bhu();
            }
            c4gs = new C4GS(Bhu, id);
        } else {
            if (str2 != null && imageUrl != null && !str2.equals(str)) {
                c4gs = new C4GS(imageUrl, str2);
            } else {
                c4gs = null;
            }
            if (user.getId().equals(str)) {
                c4gs2 = new C4GS(user.Bhu(), user.getId());
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass172 anonymousClass1722 = (AnonymousClass172) it.next();
                if (anonymousClass1722.getId().equals(str)) {
                    c4gs2 = new C4GS(anonymousClass1722.Bhu(), anonymousClass1722.getId());
                    if (c4gs != null) {
                        break;
                    }
                } else {
                    if (c4gs == null) {
                        c4gs = new C4GS(anonymousClass1722.Bhu(), anonymousClass1722.getId());
                    }
                    if (c4gs2 != null) {
                        break;
                    }
                }
            }
        }
        return new C3AY(c4gs2, c4gs);
    }

    public static C3AY A02(ImageUrl imageUrl, User user, String str, List list) {
        ImageUrl imageUrl2;
        C3AY A03 = A03(imageUrl, user, str, list);
        Object obj = A03.A00;
        ImageUrl imageUrl3 = null;
        if (obj != null) {
            imageUrl2 = ((C4GS) obj).A00;
        } else {
            imageUrl2 = null;
        }
        Object obj2 = A03.A01;
        if (obj2 != null) {
            imageUrl3 = ((C4GS) obj2).A00;
        }
        return new C3AY(imageUrl2, imageUrl3);
    }

    public static C3AY A03(ImageUrl imageUrl, User user, String str, List list) {
        C4GS c4gs;
        C4GS c4gs2 = null;
        if (list.isEmpty()) {
            c4gs = new C4GS(user.Bhu(), user.getId());
        } else if (list.size() == 1) {
            c4gs = new C4GS(((AnonymousClass173) list.get(0)).Bhu(), ((C17D) list.get(0)).getId());
        } else {
            Iterator it = list.iterator();
            if (str != null && imageUrl != null && !str.equals(user.getId())) {
                c4gs = new C4GS(imageUrl, str);
            } else {
                AnonymousClass172 anonymousClass172 = (AnonymousClass172) it.next();
                c4gs = new C4GS(anonymousClass172.Bhu(), anonymousClass172.getId());
            }
            while (it.hasNext() && (c4gs2 == null || c4gs.A00.equals(c4gs2.A00))) {
                AnonymousClass172 anonymousClass1722 = (AnonymousClass172) it.next();
                c4gs2 = new C4GS(anonymousClass1722.Bhu(), anonymousClass1722.getId());
            }
        }
        return new C3AY(c4gs, c4gs2);
    }

    public static ArrayList A05(User user, List list, boolean z) {
        ImageUrl imageUrl;
        ArrayList A06 = A06(user, list, z);
        ArrayList arrayList = new ArrayList(A06.size());
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            C4GS c4gs = (C4GS) it.next();
            if (c4gs != null) {
                imageUrl = c4gs.A00;
            } else {
                imageUrl = null;
            }
            arrayList.add(imageUrl);
        }
        return arrayList;
    }

    public static List A07(UserSession userSession, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C17D c17d = (C17D) list.get(i);
            if (userSession.userId.equals(c17d.getId())) {
                if (list.size() > 1) {
                    C0w9.A04("DirectUserListUtil_filtered_current_user", AnonymousClass001.A0O("Filtered current user from list of size: ", list.size()), 1);
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.remove(c17d);
                return arrayList;
            }
        }
        return list;
    }
}
