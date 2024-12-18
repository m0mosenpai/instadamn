package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* loaded from: classes8.dex */
public final class LnP implements InterfaceC165227aB {
    public final /* synthetic */ C45518KDj A00;

    public LnP(C45518KDj c45518KDj) {
        this.A00 = c45518KDj;
    }

    @Override // X.InterfaceC165227aB
    public final void DTM(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        C45518KDj c45518KDj = this.A00;
        InterfaceC165227aB interfaceC165227aB = c45518KDj.A05;
        if (interfaceC165227aB != null) {
            interfaceC165227aB.DTM(c2ey, messageIdentifier, str, str2, j);
        }
        C2UU c2uu = c45518KDj.getRecyclerView().A0A;
        if (c2uu != null) {
            c2uu.notifyDataSetChanged();
        }
    }
}
