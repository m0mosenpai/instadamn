package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class ESX extends C1P1 {
    public final /* synthetic */ C34351jZ A00;
    public final /* synthetic */ C34331jX A01;

    public ESX(C34351jZ c34351jZ, C34331jX c34331jX) {
        this.A00 = c34351jZ;
        this.A01 = c34331jX;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-218145453);
        int A0N = AbstractC167017dG.A0N(obj, -773365003);
        super.onSuccess(obj);
        C25671My A00 = AbstractC25651Mw.A00(this.A00.A00);
        List list = this.A01.A00;
        if (list != null) {
            A00.E4s(new C1571073p(list.size()));
            C0f9.A0A(29225112, A0N);
            C0f9.A0A(-619880279, A03);
            return;
        }
        C14360o3.A0F("recommendedUserIds");
        throw C00O.createAndThrow();
    }
}
