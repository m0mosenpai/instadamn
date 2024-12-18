package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.G1z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36347G1z implements C7EL {
    public final /* synthetic */ C32246EIf A00;

    @Override // X.C7EL
    public final void D1L() {
    }

    @Override // X.C7EL
    public final void DOL(int i) {
    }

    @Override // X.C7EL
    public final boolean DkX(String str) {
        C00M onBackPressedDispatcher;
        C14360o3.A0B(str, 0);
        C32246EIf c32246EIf = this.A00;
        C31816Dya c31816Dya = (C31816Dya) c32246EIf.A0B.getValue();
        ((C7TG) c31816Dya.A03.getValue()).EO6(null, c31816Dya.A01, "daily_prompt", null, c31816Dya.A02, str, null);
        C2EC c2ec = c32246EIf.A04;
        if (c2ec != null) {
            C36297Fzr c36297Fzr = (C36297Fzr) c32246EIf.A09.getValue();
            String C7I = c2ec.C7I();
            String C7q = c2ec.C7q();
            String str2 = c32246EIf.A06;
            if (str2 == null) {
                C14360o3.A0F("itemId");
                throw C00O.createAndThrow();
            }
            C36297Fzr.A02(c36297Fzr, C7I, C7q, "daily_prompt_response_replied", "tap", "send_button", "daily_prompt_response_reply_sheet", AbstractC167007dF.A0n(AbstractC43591JPw.A00(332), str2), c2ec.AdZ());
        }
        FragmentActivity activity = c32246EIf.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.A04();
            return true;
        }
        return true;
    }

    public C36347G1z(C32246EIf c32246EIf) {
        this.A00 = c32246EIf;
    }
}
