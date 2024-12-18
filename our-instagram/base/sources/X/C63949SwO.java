package X;

/* renamed from: X.SwO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63949SwO implements InterfaceC65562Tmi {
    public final C18920wW A00;

    @Override // X.InterfaceC65562Tmi
    public final void CmV(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "mwb_safe_browsing_warning_events");
        if (A0f.isSampled()) {
            AbstractC58321PtD.A1F(A0f, "warning_card_shown", str);
        }
    }

    @Override // X.InterfaceC65562Tmi
    public final void CmW(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "mwb_safe_browsing_warning_events");
        if (A0f.isSampled()) {
            AbstractC58321PtD.A1F(A0f, "warning_go_back_selected", str);
        }
    }

    @Override // X.InterfaceC65562Tmi
    public final void CmX(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "mwb_safe_browsing_warning_events");
        if (A0f.isSampled()) {
            AbstractC58321PtD.A1F(A0f, MSV.A00(1719), str);
        }
    }

    @Override // X.InterfaceC65562Tmi
    public final void CmY(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "mwb_safe_browsing_warning_events");
        if (A0f.isSampled()) {
            AbstractC58321PtD.A1F(A0f, "warning_proceed_selected", str);
        }
    }

    public C63949SwO(C18920wW c18920wW) {
        this.A00 = c18920wW;
    }
}
