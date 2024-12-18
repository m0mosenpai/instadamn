package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;

/* renamed from: X.Eb1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32735Eb1 extends AbstractC32348EMv {
    public static final String __redex_internal_original_name = "DirectChallengePromptFragment";
    public final InterfaceC09390do A00 = C1XM.A00(new C50153MDg(this, 1));

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r2 == null) goto L14;
     */
    @Override // X.AbstractC32348EMv, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r1 = 0
            X.C14360o3.A0B(r13, r1)
            super.onViewCreated(r13, r14)
            X.0do r0 = r12.A00
            X.Fzs r3 = X.AbstractC31172DnG.A0e(r0)
            X.Eox r2 = r12.A05
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            if (r2 == 0) goto L33
            int r1 = r2.ordinal()
            r0 = 1
            if (r1 != r0) goto L33
            java.lang.String r9 = "get_started_button"
        L1e:
            int r1 = r2.ordinal()
            r0 = 1
            if (r1 != r0) goto L37
            java.lang.String r10 = "challenge_creator_nux_sheet"
        L27:
            r2 = 0
            java.lang.String r7 = "challenge_null_creation_sheet_rendered"
            java.lang.String r8 = "tap"
            r5 = r2
            r6 = r2
            r11 = r2
            X.C36298Fzs.A03(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L33:
            java.lang.String r9 = "challenge_button"
            if (r2 != 0) goto L1e
        L37:
            java.lang.String r10 = "thread_view"
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32735Eb1.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC32348EMv, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(828086563);
        super.onCreate(bundle);
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(16);
            C0f9.A09(2076604908, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-336445579, A02);
            throw A0g;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(816905011);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_challenges_sheet, viewGroup, false);
        C0f9.A09(-1537642329, A02);
        return inflate;
    }
}
