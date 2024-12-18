package X;

/* loaded from: classes6.dex */
public final class EUA extends C1P1 {
    public final /* synthetic */ EVZ A00;

    public EUA(EVZ evz) {
        this.A00 = evz;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(22635944);
        EVZ evz = this.A00;
        C1570473j c1570473j = evz.A00;
        if (c1570473j != null) {
            c1570473j.A0E("fetch_request_fail");
            C1570473j c1570473j2 = evz.A00;
            if (c1570473j2 != null) {
                ((MTJ) c1570473j2).A00.A01();
                AbstractC31179DnN.A1U(evz, 16919357);
                evz.A02 = false;
                C9GR.A01(evz.A06.requireContext(), "tabbed_explore_people_fail", 2131975131, 0);
                C0f9.A0A(-991865754, A03);
                return;
            }
        }
        C14360o3.A0F("perfLogger");
        throw C00O.createAndThrow();
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-594656781);
        EVZ evz = this.A00;
        evz.A03 = false;
        if (!evz.A04) {
            AbstractC31557Dth.A01(evz.A06, false);
        }
        InterfaceC70513Em interfaceC70513Em = evz.A01;
        if (interfaceC70513Em == null) {
            C14360o3.A0F("pullToRefresh");
            throw C00O.createAndThrow();
        }
        interfaceC70513Em.setIsLoading(false);
        evz.A04 = false;
        C0f9.A0A(-1770450846, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-777418519);
        EVZ evz = this.A00;
        evz.A03 = true;
        if (!evz.A04) {
            AbstractC31557Dth.A01(evz.A06, true);
        }
        C0f9.A0A(-152877945, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-173332821);
        InterfaceC40801un interfaceC40801un = (InterfaceC40801un) obj;
        int A032 = C0f9.A03(-783258769);
        C14360o3.A0B(interfaceC40801un, 0);
        EVZ evz = this.A00;
        C1570473j c1570473j = evz.A00;
        if (c1570473j != null) {
            c1570473j.A0E("fetch_request_end");
            C1570473j c1570473j2 = evz.A00;
            if (c1570473j2 != null) {
                ((MTJ) c1570473j2).A00.A05();
                AbstractC31179DnN.A1U(evz, 16911974);
                evz.A02 = false;
                evz.A07.DGq(interfaceC40801un);
                C0f9.A0A(2058128094, A032);
                C0f9.A0A(2115520126, A03);
                return;
            }
        }
        C14360o3.A0F("perfLogger");
        throw C00O.createAndThrow();
    }
}
