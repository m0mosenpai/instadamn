package X;

/* loaded from: classes7.dex */
public final class HL7 extends AbstractC154286wd {
    public final /* synthetic */ C38J A00;

    public HL7(C38J c38j) {
        this.A00 = c38j;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1679853141);
        C38J c38j = this.A00;
        C9GR.A0F(c38j.requireActivity(), "could_not_refresh_feed", 2131956848);
        C38977HEf c38977HEf = c38j.A09;
        if (c38977HEf == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        c38977HEf.notifyDataSetChanged();
        C38J.A05(c38j);
        C0f9.A0A(453719940, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1637789891);
        InterfaceC70513Em interfaceC70513Em = this.A00.A07;
        if (interfaceC70513Em != null) {
            interfaceC70513Em.setIsLoading(false);
        }
        C0f9.A0A(-1571404697, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(54629756);
        C38J.A05(this.A00);
        C0f9.A0A(-1566645048, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1949427257);
        C74293Vk c74293Vk = (C74293Vk) obj;
        int A0N = AbstractC167017dG.A0N(c74293Vk, 820932932);
        this.A00.A0b(c74293Vk);
        C0f9.A0A(-617455513, A0N);
        C0f9.A0A(-485980150, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-801407585);
        C0f9.A0A(102244441, C0f9.A03(-1144628958));
        C0f9.A0A(-728770339, A03);
    }
}
