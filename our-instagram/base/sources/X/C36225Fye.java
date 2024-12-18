package X;

import java.util.List;

/* renamed from: X.Fye, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36225Fye implements C6D2 {
    public final /* synthetic */ int A00;

    public C36225Fye(int i) {
        this.A00 = i;
    }

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        List list = (List) obj;
        C14360o3.A0A(list);
        return new FJ5(list, AbstractC167007dF.A1P(list.size(), this.A00));
    }
}
