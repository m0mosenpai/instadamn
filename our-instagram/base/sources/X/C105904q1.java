package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.4q1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105904q1 {
    public final ArrayList A01(Context context, UserSession userSession) {
        String A00;
        String A002;
        String A003;
        C14360o3.A0B(userSession, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = A02(context, userSession).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            A00 = AbstractC111324zv.A00(1483);
            A002 = AbstractC111324zv.A00(582);
            A003 = AbstractC111324zv.A00(664);
            if (!hasNext) {
                break;
            }
            Map map = (Map) it.next();
            HashMap hashMap = new HashMap();
            hashMap.put("USER_ID", map.get("company_switcher_row_userid"));
            hashMap.put(A003, map.get("company_switcher_row_profile_pic"));
            hashMap.put(A002, "INSTAGRAM");
            hashMap.put("USERNAME", map.get("company_switcher_row_username"));
            hashMap.put(A00, map.get("company_switcher_row_user_type"));
            hashMap.put(AbstractC111324zv.A00(1502), map.get("company_switcher_row_user_badge_text"));
            hashMap.put(AbstractC111324zv.A00(591), map.get("company_switcher_row_user_badge_count"));
            arrayList.add(hashMap);
        }
        if (AbstractC1565471c.A00(userSession).A00() == null && AbstractC1565371b.A01(userSession)) {
            for (C45116Jxl c45116Jxl : AbstractC62276S4v.A00(userSession).A00) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (C14360o3.A0K(((Map) it2.next()).get("USERNAME"), c45116Jxl.A02)) {
                            break;
                        }
                    } else {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("USER_ID", c45116Jxl.A00);
                        hashMap2.put(A002, "INSTAGRAM");
                        hashMap2.put("USERNAME", c45116Jxl.A02);
                        hashMap2.put(A003, c45116Jxl.A01);
                        hashMap2.put(A00, AbstractC111324zv.A00(650));
                        arrayList.add(hashMap2);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [X.0Jk, java.lang.Object] */
    public final ArrayList A02(Context context, UserSession userSession) {
        String str;
        String str2;
        String str3;
        int i;
        String A02;
        C14360o3.A0B(userSession, 0);
        InterfaceC02900Bo A00 = C0BQ.A00(userSession);
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<User> BOe = A00.BOe();
        String str4 = userSession.userId;
        java.util.Set keySet = ((C17110t6) A00).A02.A03.keySet();
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36329951535841875L);
        for (User user : BOe) {
            ImmutableMap copyOf = ImmutableMap.copyOf(user.A05);
            C14360o3.A07(copyOf);
            LinkedHashMap linkedHashMap = new LinkedHashMap(copyOf);
            if (A06) {
                C023409i.A0A.A0A(new Object(), null, new JQP(linkedHashMap), user.getId());
            }
            int A022 = user.A02();
            if (A06) {
                A022 = 0;
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    A022 += ((Number) ((Map.Entry) it.next()).getValue()).intValue();
                }
            }
            if (A022 > 0 && (A02 = AnonymousClass537.A02(context, AnonymousClass537.A01(linkedHashMap), linkedHashMap, A022)) != null) {
                str2 = A02.toString();
            } else {
                str2 = "";
            }
            String id = user.getId();
            String username = user.getUsername();
            boolean contains = keySet.contains(id);
            if (C14360o3.A0K(id, str4)) {
                if (contains) {
                    i = 3522;
                    str3 = AbstractC111324zv.A00(i);
                    linkedHashSet.add(username);
                    arrayList.add(A00(id, str3, username, user.Bhu().getUrl(), str2, String.valueOf(user.A02())));
                } else {
                    str3 = "CURRENT";
                    linkedHashSet.add(username);
                    arrayList.add(A00(id, str3, username, user.Bhu().getUrl(), str2, String.valueOf(user.A02())));
                }
            } else if (contains) {
                i = 318;
                str3 = AbstractC111324zv.A00(i);
                linkedHashSet.add(username);
                arrayList.add(A00(id, str3, username, user.Bhu().getUrl(), str2, String.valueOf(user.A02())));
            } else {
                str3 = "LOGGED_IN";
                linkedHashSet.add(username);
                arrayList.add(A00(id, str3, username, user.Bhu().getUrl(), str2, String.valueOf(user.A02())));
            }
        }
        if (!AbstractC54472f1.A04(18310618109457047L, true)) {
            ImmutableList copyOf2 = ImmutableList.copyOf(C84613qA.A00(userSession).A01.values());
            C14360o3.A07(copyOf2);
            Iterator<E> it2 = copyOf2.iterator();
            while (it2.hasNext()) {
                FK7 fk7 = (FK7) it2.next();
                String username2 = fk7.A00.A01.getUsername();
                if (!linkedHashSet.contains(username2)) {
                    linkedHashSet.add(username2);
                    arrayList.add(A00(fk7.A00.A01.getId(), "DEFERRED_CHILD", username2, fk7.A00.A01.Bhu().getUrl(), null, null));
                }
            }
            ImmutableList copyOf3 = ImmutableList.copyOf(C84613qA.A00(userSession).A02.values());
            C14360o3.A07(copyOf3);
            Iterator<E> it3 = copyOf3.iterator();
            while (it3.hasNext()) {
                C34561FKv c34561FKv = (C34561FKv) it3.next();
                String username3 = c34561FKv.A00.getUsername();
                if (!linkedHashSet.contains(username3)) {
                    linkedHashSet.add(username3);
                    arrayList.add(A00(c34561FKv.A00.getId(), "DEFERRED_RECOVERED", username3, c34561FKv.A00.Bhu().getUrl(), null, null));
                }
            }
        }
        C83743oJ A01 = C83743oJ.A01(userSession);
        C14360o3.A07(A01);
        if ((!A01.A06(userSession).isEmpty()) && AbstractC54472f1.A04(18310618109325974L, true)) {
            Iterator it4 = A01.A05().iterator();
            while (it4.hasNext()) {
                C83803oP c83803oP = (C83803oP) it4.next();
                String str5 = c83803oP.A07;
                if (!AbstractC001800i.A0u(linkedHashSet, str5) && str5 != null) {
                    linkedHashSet.add(str5);
                    String str6 = c83803oP.A06;
                    if (str6 != null) {
                        ImageUrl imageUrl = c83803oP.A02;
                        if (imageUrl != null) {
                            str = imageUrl.getUrl();
                        } else {
                            str = null;
                        }
                        arrayList.add(A00(str6, "LOGGED_OUT", str5, str, null, null));
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
        List<FxCalAccountWithSwitcherInfo> A023 = AbstractC49092Nc.A00(userSession).A00.A02(C105894q0.A00, "INSTAGRAM");
        boolean z = false;
        if (A023.size() > 1) {
            z = true;
        }
        if (AbstractC54472f1.A07(userSession, z)) {
            for (FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo : A023) {
                String str7 = fxCalAccountWithSwitcherInfo.A0B;
                if (str7 != null && str7.length() != 0 && !linkedHashSet.contains(str7)) {
                    linkedHashSet.add(str7);
                    arrayList.add(A00("", "MANI", str7, fxCalAccountWithSwitcherInfo.A08, null, null));
                }
            }
        }
        return arrayList;
    }

    public static final LinkedHashMap A00(String str, String str2, String str3, String str4, String str5, String str6) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("company_switcher_row_userid", str);
        linkedHashMap.put("company_switcher_row_user_type", str2);
        linkedHashMap.put("company_switcher_row_username", str3);
        if (str4 != null) {
            linkedHashMap.put("company_switcher_row_profile_pic", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("company_switcher_row_user_badge_text", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("company_switcher_row_user_badge_count", str6);
        }
        return linkedHashMap;
    }
}
