package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class SFN {
    public final List A00;
    public final List A01;
    public final List A02;

    public SFN(List list) {
        this.A01 = list;
        this.A00 = AbstractC25230BEn.A0q(list);
        this.A02 = AbstractC25230BEn.A0q(list);
        for (int i = 0; i < list.size(); i++) {
            this.A00.add(new QAT(((SHB) list.get(i)).A01.A00));
            this.A02.add(new AbstractC63308ShE(((SHB) list.get(i)).A00.A00));
        }
    }
}
