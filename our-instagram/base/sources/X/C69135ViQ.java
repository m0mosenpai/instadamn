package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ViQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69135ViQ {
    public final ImmutableList A00;
    public final String A01;
    public final String A02;

    public C69135ViQ(C39033HGj c39033HGj) {
        String str;
        ImmutableList of;
        Object obj;
        List list;
        this.A02 = c39033HGj.A0G;
        C69434VnJ c69434VnJ = c39033HGj.A00;
        if (c69434VnJ != null && c69434VnJ.A02 != null) {
            str = c39033HGj.A0C;
        } else {
            str = c39033HGj.A0D;
        }
        this.A01 = str;
        if (c69434VnJ != null) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (C69483Vo6 c69483Vo6 : c69434VnJ.A08) {
                List list2 = c69434VnJ.A06;
                C14360o3.A07(list2);
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (C14360o3.A0K(((C68996VfY) obj).A00, c69483Vo6.A06)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C68996VfY c68996VfY = (C68996VfY) obj;
                if (c68996VfY == null || (list = c68996VfY.A01) == null) {
                    list = C16930sl.A00;
                }
                C14360o3.A0A(c69483Vo6);
                List list3 = c39033HGj.A0H;
                C14360o3.A07(list3);
                builder.add((Object) new C69484Vo7(c69483Vo6, list, list3));
            }
            of = builder.build();
        } else {
            of = ImmutableList.of();
        }
        this.A00 = of;
    }
}
