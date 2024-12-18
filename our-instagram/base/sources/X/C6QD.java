package X;

import java.util.List;

/* renamed from: X.6QD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QD extends AbstractC146396ic {
    public final C146386ib A00;

    @Override // X.AbstractC146396ic
    public final /* bridge */ /* synthetic */ C19280xC A00(C146386ib c146386ib, C82383m1 c82383m1, Object obj, Object obj2, String str) {
        List list;
        C41551w4 c41551w4 = (C41551w4) obj;
        C6Q6 c6q6 = (C6Q6) obj2;
        C14360o3.A0B(c146386ib, 0);
        C14360o3.A0B(c41551w4, 1);
        C14360o3.A0B(c6q6, 2);
        C19280xC A00 = super.A00(c146386ib, c82383m1, c41551w4, c6q6, str);
        A00.A08(Integer.valueOf(c6q6.A00), "segment_index");
        if (c6q6.A03 && (list = c41551w4.A0H.A17) != null) {
            A00.A08(Integer.valueOf(list.size()), "segment_count");
        }
        return A00;
    }

    public C6QD(C146386ib c146386ib) {
        super(c146386ib);
        this.A00 = c146386ib;
    }
}
