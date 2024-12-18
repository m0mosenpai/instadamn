package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* loaded from: classes6.dex */
public final class G4C implements InterfaceC164877Za {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC164877Za
    public final void DBP() {
    }

    @Override // X.InterfaceC164877Za
    public final void DKW() {
    }

    @Override // X.InterfaceC164877Za
    public final void DKX() {
    }

    public G4C(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC164877Za
    public final void DTC(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        String str5;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C45518KDj c45518KDj = (C45518KDj) obj;
            InterfaceC164877Za interfaceC164877Za = c45518KDj.A02;
            if (interfaceC164877Za != null) {
                interfaceC164877Za.DTC(c2ey, messageIdentifier, str, str2, str3, str4, j, z, z2);
            }
            int i2 = 0;
            for (Object obj2 : AbstractC31171DnF.A0n(c45518KDj.A0F)) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C83403nh c83403nh = ((KQ8) obj2).A00;
                String A0i = c83403nh.A0i();
                if (messageIdentifier != null) {
                    str5 = messageIdentifier.A01;
                } else {
                    str5 = null;
                }
                if (C14360o3.A0K(A0i, str5)) {
                    InterfaceC09390do interfaceC09390do = c45518KDj.A0I;
                    c83403nh.A0z(AbstractC166987dD.A0r(interfaceC09390do), new AnonymousClass441(null, Long.valueOf(1000 * j), AbstractC31173DnH.A0t(interfaceC09390do), str, null), AbstractC31173DnH.A0t(interfaceC09390do), null);
                    C2UU c2uu = c45518KDj.getRecyclerView().A0A;
                    if (c2uu != null) {
                        c2uu.notifyItemChanged(i2);
                    }
                }
                i2 = i3;
            }
            return;
        }
        FOg fOg = (FOg) obj;
        if (C14360o3.A0K(fOg.A0K, "roll_call")) {
            fOg.A0A.A02(EnumC33511Erk.REACT, fOg.A0D.A0B, fOg.A0J.A00);
        }
        EOJ eoj = fOg.A0B;
        String str6 = fOg.A0D.A0D;
        if (messageIdentifier != null) {
            eoj.AEG(str6, "CREATED", messageIdentifier.A01, str, messageIdentifier.A00());
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC164877Za
    public final void Dd3(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        String str3;
        if (this.A00 != 0) {
            C45518KDj c45518KDj = (C45518KDj) this.A01;
            InterfaceC164877Za interfaceC164877Za = c45518KDj.A02;
            if (interfaceC164877Za != null) {
                interfaceC164877Za.Dd3(c2ey, messageIdentifier, str, str2, j);
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
                    str3 = messageIdentifier.A01;
                } else {
                    str3 = null;
                }
                if (C14360o3.A0K(A0i, str3)) {
                    InterfaceC09390do interfaceC09390do = c45518KDj.A0I;
                    c83403nh.A10(AbstractC166987dD.A0r(interfaceC09390do), new AnonymousClass441(null, Long.valueOf(1000 * j), AbstractC31173DnH.A0t(interfaceC09390do), str, null), AbstractC31173DnH.A0t(interfaceC09390do), null);
                    C2UU c2uu = c45518KDj.getRecyclerView().A0A;
                    if (c2uu != null) {
                        c2uu.notifyItemChanged(i);
                    }
                }
                i = i2;
            }
            return;
        }
        FOg fOg = (FOg) this.A01;
        EOJ eoj = fOg.A0B;
        String str4 = fOg.A0D.A0D;
        if (messageIdentifier != null) {
            eoj.AEG(str4, "DELETED", messageIdentifier.A01, null, messageIdentifier.A00());
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
