package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.CameraTool;
import com.instagram.feed.media.CameraToolInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ADr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23035ADr {
    public static final ArrayList A01(C195868lW c195868lW, int i, int i2, int i3) {
        int i4;
        ArrayList A1E = AbstractC166987dD.A1E();
        C44059Jdk A00 = C44059Jdk.A00(c195868lW.A0k, 0);
        C14360o3.A07(A00);
        int i5 = (int) A00.A03;
        int i6 = 0;
        while (i5 > 0 && A1E.size() < i) {
            if (i5 >= i2 + i3) {
                i4 = i2;
            } else {
                i4 = i5;
                if (i5 > i2) {
                    i4 = i5 - i3;
                }
            }
            C195868lW A03 = c195868lW.A03();
            A03.A0H = i6;
            i6 += i4;
            A03.A06 = i6;
            A1E.add(A03);
            i5 -= i4;
        }
        String A0j = AbstractC167017dG.A0j();
        int size = A1E.size();
        for (int i7 = 0; i7 < size; i7++) {
            C195868lW c195868lW2 = (C195868lW) A1E.get(i7);
            c195868lW2.A0p = A0j;
            c195868lW2.A0D = i7;
            c195868lW2.A0C = A1E.size();
        }
        return A1E;
    }

    public static final C115475Kh A00(C195868lW c195868lW, int i, int i2) {
        ArrayList arrayList;
        ImmutableList copyOf;
        int i3 = c195868lW.A07;
        C115525Km A01 = AbstractC23036ADs.A01(c195868lW, c195868lW.A06(), i2, i3, 0, i3, i3);
        List list = c195868lW.A0u;
        List list2 = c195868lW.A0y;
        if (list2 != null && (copyOf = ImmutableList.copyOf((Collection) list2)) != null) {
            arrayList = AbstractC167017dG.A0q(copyOf);
            Iterator<E> it = copyOf.iterator();
            while (it.hasNext()) {
                CameraTool cameraTool = ((C5JB) it.next()).A01;
                Float valueOf = Float.valueOf(0.0f);
                arrayList.add(new CameraToolInfo(cameraTool, valueOf, valueOf, valueOf));
            }
        } else {
            arrayList = null;
        }
        C115475Kh c115475Kh = new C115475Kh(null, null, new C115545Ko(list, arrayList, null, 1.0f, -1, false), A01, null, null, null, null, null, 0.0f, 0, 0, 0, 0, 0, 0, 2147483644, false, false, false, false);
        if (i3 > i) {
            i3 = i;
        }
        c115475Kh.A08 = i3;
        return c115475Kh;
    }
}
