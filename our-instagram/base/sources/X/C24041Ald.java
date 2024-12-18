package X;

import java.util.List;

/* renamed from: X.Ald, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24041Ald implements InterfaceC03960Jm {
    public final /* synthetic */ String A00;
    public final /* synthetic */ List A01;

    public C24041Ald(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }

    @Override // X.InterfaceC03960Jm
    public final /* bridge */ /* synthetic */ void AIn(Object obj) {
        C22854A5x c22854A5x = (C22854A5x) obj;
        if (c22854A5x != null && !AbstractC13670mt.A0B(c22854A5x.A00)) {
            List list = this.A01;
            String str = this.A00;
            String str2 = c22854A5x.A00;
            if (str2 != null) {
                list.add(C23132AMt.A04(str, str2, "Instagram", "Instagram", "inactive_logged_in_accounts"));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
