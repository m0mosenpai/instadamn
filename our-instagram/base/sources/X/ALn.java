package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ALn {
    public static final ALn A00 = new Object();

    public static final C23004ACd A00(C23009ACj c23009ACj, EnumC173517o3 enumC173517o3, List list, List list2) {
        EnumC173547o6 enumC173547o6;
        EnumC173547o6 enumC173547o62 = EnumC173547o6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        List list3 = C16930sl.A00;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C173567o8 c173567o8 = (C173567o8) it.next();
            if (c173567o8.A00 == c23009ACj.A00 && c173567o8.A04.containsAll(c23009ACj.A03) && c173567o8.A03.containsAll(c23009ACj.A02) && (enumC173547o6 = c173567o8.A01) != null && enumC173547o6 != enumC173547o62) {
                enumC173547o62 = enumC173547o6;
                break;
            }
        }
        if (enumC173547o62 == EnumC173547o6.ALLOW || enumC173547o62 == EnumC173547o6.IGNORE) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw AbstractC166987dD.A15("getRuleName");
            }
            list3 = builder.build();
            C14360o3.A07(list3);
        }
        return new C23004ACd(enumC173517o3, enumC173547o62, list3);
    }

    public static final List A01(C23009ACj c23009ACj, C23009ACj c23009ACj2, C173617oD c173617oD, java.util.Set set) {
        C23004ACd A002;
        ArrayList A0q = AbstractC167017dG.A0q(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C23003ACc c23003ACc = (C23003ACc) it.next();
            Map map = c173617oD.A01;
            EnumC173517o3 enumC173517o3 = c23003ACc.A00;
            C173577o9 c173577o9 = (C173577o9) map.get(enumC173517o3);
            if (c173577o9 == null) {
                A002 = new C23004ACd(enumC173517o3, EnumC173547o6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, C16930sl.A00);
            } else {
                A002 = A00(c23009ACj, enumC173517o3, c23003ACc.A02, c173577o9.A01);
                if (A002.A00 == EnumC173547o6.ALLOW) {
                    List list = A002.A01;
                    if (!AbstractC166987dD.A1b(list)) {
                        C23004ACd A003 = A00(c23009ACj2, enumC173517o3, c23003ACc.A01, c173577o9.A00);
                        A002 = new C23004ACd(enumC173517o3, A003.A00, AbstractC001800i.A0S(A003.A01, list));
                    }
                }
            }
            A0q.add(A002);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0q) {
            if (c23009ACj.A01.contains(((C23004ACd) obj).A00)) {
                A1E.add(obj);
            }
        }
        return A1E;
    }
}
