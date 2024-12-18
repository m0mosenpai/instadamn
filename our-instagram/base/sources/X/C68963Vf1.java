package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vf1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68963Vf1 {
    public final String A00;
    public final List A01 = new ArrayList();

    public C68963Vf1(C69233Vk1 c69233Vk1) {
        this.A00 = c69233Vk1.A02;
        List<C69120ViA> list = c69233Vk1.A03;
        if (list != null) {
            for (C69120ViA c69120ViA : list) {
                if (c69120ViA != null) {
                    List list2 = this.A01;
                    EnumC72402Xcp enumC72402Xcp = c69120ViA.A02;
                    if (enumC72402Xcp != null) {
                        list2.add(new C69098Vho((EnumC72372Xc8) EnumC72372Xc8.A01.get(AbstractC166987dD.A19(enumC72402Xcp)), c69120ViA.A00, c69120ViA.A01));
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
        }
    }
}
