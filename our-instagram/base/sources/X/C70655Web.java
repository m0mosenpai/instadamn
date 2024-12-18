package X;

import android.content.Context;

/* renamed from: X.Web, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70655Web implements XDI {
    public final /* synthetic */ C67871V0c A00;

    @Override // X.XDI
    public final void DFk(String str, String str2) {
        C67871V0c c67871V0c;
        Context context;
        C14360o3.A0B(str2, 1);
        if (str != null && (context = (c67871V0c = this.A00).getContext()) != null) {
            if (str.length() == 0) {
                str = c67871V0c.getString(2131970423);
            }
            C9GR.A09(context, str);
        }
        C67871V0c c67871V0c2 = this.A00;
        ((W6I) c67871V0c2.A0E.getValue()).A0B("campaign_controls_budget_duration", "edit_budget_duration", C67871V0c.A00(c67871V0c2).A1S, C67871V0c.A00(c67871V0c2).A1K, str2);
        FRW frw = c67871V0c2.A06;
        if (frw != null) {
            frw.A01.setIsLoading(false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C70655Web(C67871V0c c67871V0c) {
        this.A00 = c67871V0c;
    }

    @Override // X.XDI
    public final void onStart() {
        FRW frw = this.A00.A06;
        if (frw != null) {
            frw.A01.setIsLoading(true);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XDI
    public final void onSuccess() {
        C67871V0c c67871V0c = this.A00;
        ((W6I) c67871V0c.A0E.getValue()).A08("campaign_controls_budget_duration", "edit_budget_duration", C67871V0c.A00(c67871V0c).A1S, C67871V0c.A00(c67871V0c).A1K);
        FRW frw = c67871V0c.A06;
        if (frw != null) {
            frw.A01.setIsLoading(false);
            AbstractC25226BEj.A1Q(c67871V0c);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
