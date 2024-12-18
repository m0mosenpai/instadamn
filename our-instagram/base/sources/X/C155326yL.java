package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.6yL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155326yL extends AbstractC65412xd {
    public static final boolean A00(InterfaceC152636tq interfaceC152636tq, InterfaceC152636tq interfaceC152636tq2) {
        C14360o3.A0B(interfaceC152636tq, 0);
        C14360o3.A0B(interfaceC152636tq2, 1);
        if ((interfaceC152636tq instanceof C152676tu) && (interfaceC152636tq2 instanceof C152676tu)) {
            return C14360o3.A0K(((C152676tu) interfaceC152636tq).A00.A03.getId(), ((C152676tu) interfaceC152636tq2).A00.A03.getId());
        }
        if (interfaceC152636tq.getClass() != interfaceC152636tq2.getClass()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        Reel reel;
        boolean A0K;
        InterfaceC152636tq interfaceC152636tq = (InterfaceC152636tq) obj;
        InterfaceC152636tq interfaceC152636tq2 = (InterfaceC152636tq) obj2;
        C14360o3.A0B(interfaceC152636tq, 0);
        C14360o3.A0B(interfaceC152636tq2, 1);
        if ((interfaceC152636tq instanceof C152676tu) && (interfaceC152636tq2 instanceof C152676tu)) {
            C152676tu c152676tu = (C152676tu) interfaceC152636tq;
            C152676tu c152676tu2 = (C152676tu) interfaceC152636tq2;
            if (C14360o3.A0K(c152676tu.A05, c152676tu2.A05) && C14360o3.A0K(c152676tu.A06, c152676tu2.A06) && C14360o3.A0K(c152676tu.A03, c152676tu2.A03) && C14360o3.A0K(c152676tu.A04, c152676tu2.A04) && c152676tu.A08 == c152676tu2.A08 && C14360o3.A0K(c152676tu.A01, c152676tu2.A01) && c152676tu.A07 == c152676tu2.A07) {
                A0K = C14360o3.A0K(c152676tu.A02, c152676tu2.A02);
            } else {
                return false;
            }
        } else if ((interfaceC152636tq instanceof C152786u6) && (interfaceC152636tq2 instanceof C152786u6)) {
            C152786u6 c152786u6 = (C152786u6) interfaceC152636tq;
            C152786u6 c152786u62 = (C152786u6) interfaceC152636tq2;
            if (c152786u6.A01 == c152786u62.A01) {
                C3G4 c3g4 = c152786u6.A00;
                Reel reel2 = null;
                if (c3g4 != null) {
                    reel = c3g4.A03;
                } else {
                    reel = null;
                }
                C3G4 c3g42 = c152786u62.A00;
                if (c3g42 != null) {
                    reel2 = c3g42.A03;
                }
                A0K = C14360o3.A0K(reel, reel2);
            } else {
                return false;
            }
        } else {
            if ((interfaceC152636tq instanceof C152796u7) && (interfaceC152636tq2 instanceof C152796u7)) {
                z = ((C152796u7) interfaceC152636tq).A01;
                z2 = ((C152796u7) interfaceC152636tq2).A01;
            } else if ((interfaceC152636tq instanceof C152806u8) && (interfaceC152636tq2 instanceof C152806u8)) {
                z = ((C152806u8) interfaceC152636tq).A00;
                z2 = ((C152806u8) interfaceC152636tq2).A00;
            } else if ((interfaceC152636tq instanceof C152626tp) && (interfaceC152636tq2 instanceof C152626tp)) {
                z = ((C152626tp) interfaceC152636tq).A00;
                z2 = ((C152626tp) interfaceC152636tq2).A00;
            } else {
                return A00(interfaceC152636tq, interfaceC152636tq2);
            }
            if (z == z2) {
                return true;
            }
            return false;
        }
        if (A0K) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        return A00((InterfaceC152636tq) obj, (InterfaceC152636tq) obj2);
    }
}
