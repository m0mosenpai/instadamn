package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.clips.model.ClipSegment;
import com.instagram.common.clips.model.LayoutTransform;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5Kl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115515Kl {
    public static final C115525Km A00;

    public static final ImmutableList A00(C198548q3 c198548q3, C199518rz c199518rz, Collection collection) {
        String str;
        C115475Kh c115475Kh;
        C115475Kh c115475Kh2;
        C14360o3.A0B(collection, 0);
        C23097AGh c23097AGh = C23097AGh.A00;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
        Iterator it = collection.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) it.next();
            if ((abstractC115485Ki instanceof C115475Kh) && (c115475Kh2 = (C115475Kh) abstractC115485Ki) != null) {
                str2 = c115475Kh2.A0M;
            }
            arrayList.add(str2);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            AbstractC115485Ki abstractC115485Ki2 = (AbstractC115485Ki) it2.next();
            if ((abstractC115485Ki2 instanceof C115475Kh) && (c115475Kh = (C115475Kh) abstractC115485Ki2) != null) {
                str = c115475Kh.A0N;
            } else {
                str = null;
            }
            arrayList2.add(str);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
        Iterator it3 = collection.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf(((AbstractC115485Ki) it3.next()).BsL()));
        }
        ArrayList arrayList4 = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
        Iterator it4 = collection.iterator();
        while (it4.hasNext()) {
            it4.next();
            arrayList4.add(Integer.valueOf(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION));
        }
        ArrayList arrayList5 = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
        Iterator it5 = collection.iterator();
        while (it5.hasNext()) {
            it5.next();
            arrayList5.add(Integer.valueOf(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION));
        }
        boolean A0b = C17280tP.A4E.A00().A0b();
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (arrayList.size() == arrayList2.size() && arrayList2.size() == arrayList3.size()) {
            int size = arrayList.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                C23001ACa A002 = c23097AGh.A00(c198548q3, c199518rz, null, null, C05F.A00, (String) arrayList.get(i), ((Number) arrayList4.get(i)).intValue(), ((Number) arrayList5.get(i)).intValue(), j, j + ((Number) arrayList3.get(i)).longValue(), A0b);
                if (A002 != null) {
                    builder.add((Object) A002);
                }
                C23001ACa A003 = c23097AGh.A00(c198548q3, c199518rz, null, null, C05F.A01, (String) arrayList2.get(i), ((Number) arrayList4.get(i)).intValue(), ((Number) arrayList5.get(i)).intValue(), j, j + ((Number) arrayList3.get(i)).longValue(), A0b);
                if (A003 != null) {
                    builder.add((Object) A003);
                }
                j += ((Number) arrayList3.get(i)).longValue();
            }
        }
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }

    public static final ImmutableList A02(Collection collection, boolean z) {
        ClipSegment A0C;
        C14360o3.A0B(collection, 0);
        if (z) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) it.next();
                if (abstractC115485Ki instanceof C52435NIf) {
                    A0C = ((C52435NIf) abstractC115485Ki).A0B();
                } else if (abstractC115485Ki instanceof C115475Kh) {
                    C115475Kh c115475Kh = (C115475Kh) abstractC115485Ki;
                    if (A05(c115475Kh)) {
                        A0C = c115475Kh.A0D();
                    } else {
                        A0C = c115475Kh.A0C();
                    }
                } else {
                    throw new RuntimeException();
                }
                arrayList.add(A0C);
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
            C14360o3.A0A(copyOf);
            return copyOf;
        }
        return A01(collection);
    }

    public static final ClipSegment A03(AbstractC115485Ki abstractC115485Ki) {
        C14360o3.A0B(abstractC115485Ki, 0);
        if (abstractC115485Ki instanceof C52435NIf) {
            return ((C52435NIf) abstractC115485Ki).A0B();
        }
        if (abstractC115485Ki instanceof C115475Kh) {
            C115475Kh c115475Kh = (C115475Kh) abstractC115485Ki;
            if (A05(c115475Kh)) {
                return c115475Kh.A0D();
            }
            return c115475Kh.A0C();
        }
        throw new RuntimeException();
    }

    public static final boolean A05(C115475Kh c115475Kh) {
        String str;
        C14360o3.A0B(c115475Kh, 0);
        C115525Km c115525Km = c115475Kh.A0G;
        if (c115525Km.A0K && (str = c115525Km.A0I) != null && !AbstractC001900j.A0T(str)) {
            return true;
        }
        return false;
    }

    static {
        C115525Km c115525Km = new C115525Km();
        c115525Km.A0F = "";
        A00 = c115525Km;
    }

    public static final ImmutableList A01(Collection collection) {
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(A03((AbstractC115485Ki) it.next()));
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
        C14360o3.A07(copyOf);
        return copyOf;
    }

    public static final LayoutTransform A04(AbstractC115485Ki abstractC115485Ki) {
        Integer num;
        C206169Az A04 = abstractC115485Ki.A04();
        if (A04 != null) {
            return new LayoutTransform(C05F.A0N, A04.A02, A04.A00, A04.A03, A04.A01, 0, 0, false);
        }
        if (abstractC115485Ki.A09()) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        return new LayoutTransform(num, 1.0f, 0.0f, 0.0f, 0.0f, 0, 0, false);
    }
}
