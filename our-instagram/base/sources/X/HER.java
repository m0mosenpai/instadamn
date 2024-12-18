package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class HER extends C2US {
    public final HF2 A00;
    public final List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HER(ID3 id3, List list, boolean z) {
        super(false);
        AbstractC167017dG.A1Q(list, id3);
        HF2 hf2 = new HF2(id3, z);
        this.A00 = hf2;
        this.A01 = list;
        init(hf2);
    }
}
