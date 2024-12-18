package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fz0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36247Fz0 implements C6D2 {
    public static final C36247Fz0 A00 = new C36247Fz0();

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        List list = (List) obj;
        C14360o3.A0A(list);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(new C35169FfL((C32057E6j) it.next()));
        }
        return A0q;
    }
}
