package X;

import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes6.dex */
public final class ESS extends C1P1 {
    public final WeakReference A00;

    public ESS(FQZ fqz) {
        this.A00 = AbstractC25225BEi.A16(fqz);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(936838107);
        EAG eag = (EAG) obj;
        int A032 = C0f9.A03(-1416747864);
        C14360o3.A0B(eag, 0);
        super.onSuccess(eag);
        FQZ fqz = (FQZ) this.A00.get();
        if (fqz != null) {
            FQO fqo = fqz.A06;
            C32040E5s c32040E5s = eag.A00;
            if (c32040E5s == null) {
                AbstractC31171DnF.A0w();
                throw C00O.createAndThrow();
            }
            List list = c32040E5s.A00;
            C14360o3.A0B(list, 0);
            fqo.A01 = list;
            fqz.A08.A00(fqo.A00(fqz.A04, AbstractC31173DnH.A0L(fqz.A07.A00)));
        }
        C0f9.A0A(1506871135, A032);
        C0f9.A0A(405569851, A03);
    }
}
