package X;

import java.util.List;

/* renamed from: X.LdT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48530LdT implements InterfaceC25601Mq {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C48518LdG A01;
    public final /* synthetic */ String A02;

    public C48530LdT(C48518LdG c48518LdG, String str, long j) {
        this.A01 = c48518LdG;
        this.A00 = j;
        this.A02 = str;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        AbstractC24481Hr abstractC24481Hr = (AbstractC24481Hr) obj;
        C14360o3.A0B(abstractC24481Hr, 0);
        if (!abstractC24481Hr.A0B() && !abstractC24481Hr.A0D()) {
            Object A07 = abstractC24481Hr.A07();
            if (A07 != null) {
                C48518LdG c48518LdG = this.A01;
                long j = this.A00;
                C48518LdG.A02(c48518LdG, this.A02, (List) A07, j);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return C0eB.A00;
    }
}
