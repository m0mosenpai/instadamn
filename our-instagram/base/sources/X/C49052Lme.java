package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Lme, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49052Lme implements InterfaceC165017Zq {
    public final /* synthetic */ C45518KDj A00;

    public C49052Lme(C45518KDj c45518KDj) {
        this.A00 = c45518KDj;
    }

    @Override // X.InterfaceC165017Zq
    public final void DT8(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, String str3, long j, boolean z) {
        String str4;
        C45518KDj c45518KDj = this.A00;
        InterfaceC165017Zq interfaceC165017Zq = c45518KDj.A03;
        if (interfaceC165017Zq != null) {
            interfaceC165017Zq.DT8(c2ey, messageIdentifier, str, str2, str3, j, z);
        }
        int i = 0;
        for (Object obj : AbstractC31171DnF.A0n(c45518KDj.A0F)) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C83403nh c83403nh = ((KQ8) obj).A00;
            String A0i = c83403nh.A0i();
            if (messageIdentifier != null) {
                str4 = messageIdentifier.A01;
            } else {
                str4 = null;
            }
            if (C14360o3.A0K(A0i, str4)) {
                InterfaceC09390do interfaceC09390do = c45518KDj.A0I;
                c83403nh.A0z(AbstractC166987dD.A0r(interfaceC09390do), new AnonymousClass441(null, Long.valueOf(1000 * j), AbstractC31173DnH.A0t(interfaceC09390do), "❤", null), AbstractC31173DnH.A0t(interfaceC09390do), null);
            }
            C2UU c2uu = c45518KDj.getRecyclerView().A0A;
            if (c2uu != null) {
                c2uu.notifyItemChanged(i);
            }
            i = i2;
        }
    }
}
