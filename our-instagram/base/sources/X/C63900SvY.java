package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.SvY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63900SvY implements InterfaceC65333TiE {
    public final /* synthetic */ C62898SWe A00;
    public final /* synthetic */ SettableFuture A01;

    public C63900SvY(C62898SWe c62898SWe, SettableFuture settableFuture) {
        this.A00 = c62898SWe;
        this.A01 = settableFuture;
    }

    @Override // X.InterfaceC65333TiE
    public final void CyN(List list, List list2, List list3, List list4) {
        HashMap A1G = AbstractC166987dD.A1G();
        C62898SWe c62898SWe = this.A00;
        A1G.put("name-autofill-data", C62898SWe.A00(c62898SWe, "name-autofill-data", list));
        A1G.put("telephone-autofill-data", C62898SWe.A00(c62898SWe, "telephone-autofill-data", list2));
        A1G.put("address-autofill-data", C62898SWe.A00(c62898SWe, "address-autofill-data", list3));
        A1G.put("email-autofill-data", C62898SWe.A00(c62898SWe, "email-autofill-data", list4));
        this.A01.set(A1G);
    }
}
