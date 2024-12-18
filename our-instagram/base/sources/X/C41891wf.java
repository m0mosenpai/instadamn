package X;

import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1wf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41891wf {
    public final UserSession A00;
    public static final long A01 = TimeUnit.SECONDS.toMillis(390);
    public static final ThreadLocal A03 = new ThreadLocal() { // from class: X.1wg
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return Calendar.getInstance();
        }
    };
    public static final ThreadLocal A02 = new ThreadLocal() { // from class: X.1wh
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return Calendar.getInstance();
        }
    };

    public static int A00(long j) {
        Object obj = A02.get();
        obj.getClass();
        Calendar calendar = (Calendar) obj;
        calendar.setTimeInMillis(j);
        Object obj2 = A03.get();
        obj2.getClass();
        Calendar calendar2 = (Calendar) obj2;
        calendar2.setTimeInMillis(System.currentTimeMillis());
        int i = calendar.get(6);
        int i2 = calendar2.get(6);
        if (i2 < i) {
            i2 += calendar.getActualMaximum(6);
        }
        return i2 - i;
    }

    public static C41891wf A01(final UserSession userSession) {
        return (C41891wf) userSession.A01(C41891wf.class, new InterfaceC16820sZ() { // from class: X.1wk
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C41891wf(UserSession.this);
            }
        });
    }

    public static List A03(C41951wl c41951wl, List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42321xM A022 = c41951wl.A02((String) it.next());
            if (A022 != null) {
                arrayList.add(A022);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Map A04(C41951wl c41951wl, Collection collection) {
        if (collection == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C17D c17d = (C17D) it.next();
            C42321xM A022 = c41951wl.A02(c17d.getId());
            if (A022 != null) {
                hashMap.put(A022, c17d);
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static final boolean A06(C42321xM c42321xM, long j) {
        long j2 = j - c42321xM.A01;
        if (!c42321xM.A05 && j2 > A01) {
            return false;
        }
        return true;
    }

    public final String A09(Resources resources, Map map) {
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList(map.keySet());
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            long currentTimeMillis = System.currentTimeMillis();
            long millis = TimeUnit.MINUTES.toMillis(10L);
            long millis2 = TimeUnit.HOURS.toMillis(1L);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C42321xM c42321xM = (C42321xM) it.next();
                if (A06(c42321xM, System.currentTimeMillis())) {
                    arrayList2.add(c42321xM);
                } else {
                    long j = c42321xM.A01;
                    long j2 = currentTimeMillis - j;
                    if (j2 < millis) {
                        arrayList3.add(c42321xM);
                    } else if (j2 < millis2) {
                        arrayList4.add(c42321xM);
                    } else if (A00(j) == 0) {
                        arrayList5.add(c42321xM);
                    }
                }
            }
            String A022 = A02(resources, arrayList2, map, 2131959526, 2131959527);
            if (A022 == null) {
                String A023 = A02(resources, arrayList3, map, 2131959530, 2131959531);
                if (A023 == null) {
                    String A024 = A02(resources, arrayList4, map, 2131959528, 2131959529);
                    if (A024 == null) {
                        return A02(resources, arrayList5, map, 2131959532, 2131959533);
                    }
                    return A024;
                }
                return A023;
            }
            return A022;
        }
        return null;
    }

    public final boolean A0E(Collection collection) {
        if (!C18U.A06(C06090Tz.A05, this.A00, 36315980007608164L) || collection.isEmpty() || collection.size() > 1 || (((C42321xM) new ArrayList(collection).get(0)).A00 & 2251799813685248L) == 0) {
            return false;
        }
        return true;
    }

    public C41891wf(UserSession userSession) {
        this.A00 = userSession;
    }

    public static String A02(Resources resources, List list, Map map, int i, int i2) {
        String username;
        int size = list.size();
        if (size == 1) {
            C17D c17d = (C17D) map.get(list.get(0));
            if (c17d != null) {
                if (((C17G) c17d).BJ8() == 1) {
                    username = ((C17B) c17d).getShortName();
                } else {
                    username = ((C17E) c17d).getUsername();
                }
                return resources.getString(i, username);
            }
            return null;
        }
        if (size > 1) {
            return resources.getString(i2, Integer.valueOf(size));
        }
        return null;
    }

    public static final boolean A05(C41951wl c41951wl, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((User) it.next()).getId());
        }
        Iterator it2 = A03(c41951wl, arrayList).iterator();
        while (it2.hasNext()) {
            if ((((C42321xM) it2.next()).A00 & 2251799813685248L) != 0) {
                return true;
            }
        }
        return false;
    }

    public final int A07(DirectShareTarget directShareTarget, C41951wl c41951wl, int i) {
        List A032;
        ArrayList A0B = directShareTarget.A0B();
        if (A0B.isEmpty()) {
            A032 = Collections.emptyList();
        } else {
            A032 = A03(c41951wl, A0B);
        }
        if (!A032.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis() - ((C42321xM) A032.get(0)).A01;
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis);
            if (currentTimeMillis > A01 && minutes < i) {
                return minutes;
            }
            return -1;
        }
        return -1;
    }

    public final String A08(Resources resources, List list) {
        int i;
        int i2;
        if (list.isEmpty()) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C42321xM c42321xM = (C42321xM) list.get(0);
        long j = c42321xM.A01;
        if (j <= 0) {
            return null;
        }
        if (!A06(c42321xM, currentTimeMillis)) {
            long currentTimeMillis2 = System.currentTimeMillis() - j;
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis2);
            if (currentTimeMillis2 > A01) {
                long j2 = minutes;
                if (j2 <= 59) {
                    i2 = R.plurals.direct_digest_is_active_x_mins_ago;
                } else if (j2 <= 480) {
                    minutes = (int) TimeUnit.MINUTES.toHours(j2);
                    i2 = R.plurals.direct_digest_is_active_x_hours_ago;
                } else {
                    if (j2 <= 10080) {
                        int A00 = A00(j);
                        if (A00 == 0) {
                            i = 2131959167;
                        } else if (A00 == 1) {
                            i = 2131959168;
                        } else {
                            return null;
                        }
                        return resources.getString(i);
                    }
                    return null;
                }
                return resources.getQuantityString(i2, minutes, Integer.valueOf(minutes));
            }
        }
        i = 2131959177;
        return resources.getString(i);
    }

    public final boolean A0A(DirectShareTarget directShareTarget, C41951wl c41951wl) {
        List A032;
        ArrayList A0B = directShareTarget.A0B();
        if (A0B.isEmpty()) {
            A032 = Collections.emptyList();
        } else {
            A032 = A03(c41951wl, A0B);
        }
        return A0D(A032);
    }

    public final boolean A0B(DirectShareTarget directShareTarget, C41951wl c41951wl) {
        List A032;
        ArrayList A0B = directShareTarget.A0B();
        if (A0B.isEmpty()) {
            A032 = Collections.emptyList();
        } else {
            A032 = A03(c41951wl, A0B);
        }
        return A0E(A032);
    }

    public final boolean A0C(C41951wl c41951wl, C17D c17d) {
        return A0D(A03(c41951wl, Collections.singletonList(c17d.getId())));
    }

    public final boolean A0D(Collection collection) {
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C42321xM c42321xM = (C42321xM) it.next();
                if (c42321xM.A01 > 0 && A06(c42321xM, System.currentTimeMillis())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
