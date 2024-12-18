package X;

import com.instagram.creation.capture.quickcapture.sundial.store.ClipsVideoStore$special$$inlined$map$1$2;
import java.util.List;

/* renamed from: X.84G, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84G {
    public final C2GT A00;
    public final InterfaceC19390xP A01;
    public final C05A A02;
    public final C0UO A03;

    public final void A01(AbstractC115485Ki abstractC115485Ki, int i) {
        String str;
        C115475Kh c115475Kh;
        C14360o3.A0B(abstractC115485Ki, 1);
        C05A c05a = this.A02;
        InterfaceC115495Kj A04 = ((C84B) c05a.getValue()).A04(i);
        String str2 = null;
        if ((A04 instanceof C115475Kh) && (c115475Kh = (C115475Kh) A04) != null) {
            str = c115475Kh.A0M;
            str2 = c115475Kh.A0N;
        } else {
            str = null;
        }
        c05a.Egh(AHU.A01(AHU.A01(AbstractC55154OdI.A02(abstractC115485Ki, (C84B) c05a.getValue(), i), str, i - 1), str2, i));
    }

    public final void A02(List list) {
        C14360o3.A0B(list, 0);
        C05A c05a = this.A02;
        c05a.Egh(new C84B(list, ((C84B) c05a.getValue()).A03));
    }

    public final String A00(int i) {
        C115475Kh c115475Kh;
        C115475Kh c115475Kh2;
        String str;
        C05A c05a = this.A02;
        InterfaceC115495Kj A04 = ((C84B) c05a.getValue()).A04(i + 1);
        if (A04 instanceof C115475Kh) {
            c115475Kh = (C115475Kh) A04;
        } else {
            c115475Kh = null;
        }
        InterfaceC115495Kj A042 = ((C84B) c05a.getValue()).A04(i);
        if ((A042 instanceof C115475Kh) && (c115475Kh2 = (C115475Kh) A042) != null && (str = c115475Kh2.A0N) != null) {
            return str;
        }
        if (c115475Kh == null) {
            return null;
        }
        return c115475Kh.A0M;
    }

    public C84G() {
        final C008002u c008002u = new C008002u(new C84B(C16930sl.A00, false));
        this.A02 = c008002u;
        AnonymousClass059 A02 = AbstractC208910l.A02(c008002u);
        this.A03 = A02;
        this.A01 = new InterfaceC19390xP(this) { // from class: X.84H
            public final /* synthetic */ C84G A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = c008002u.collect(new ClipsVideoStore$special$$inlined$map$1$2(this.A00, interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        };
        this.A00 = AbstractC58232lf.A00(AnonymousClass191.A00, A02);
    }
}
