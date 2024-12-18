package X;

import android.content.Context;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.FPn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34678FPn {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C189478aR A02;

    public C34678FPn(Context context, InterfaceC11380iw interfaceC11380iw, C189478aR c189478aR) {
        this.A01 = interfaceC11380iw;
        this.A02 = c189478aR;
        this.A00 = context;
    }

    public final void A00(boolean z) {
        if (!C14360o3.A0K(this.A01.getModuleName(), "profile")) {
            C189478aR c189478aR = this.A02;
            Context context = this.A00;
            int i = 2131968535;
            if (z) {
                i = 2131953362;
            }
            String A0p = AbstractC166997dE.A0p(context, i);
            BottomSheetFragment bottomSheetFragment = c189478aR.A03;
            BottomSheetFragment.A00(bottomSheetFragment).A0g = A0p;
            bottomSheetFragment.A0Q();
            bottomSheetFragment.A0Q();
        }
    }
}
