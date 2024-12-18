package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.primer.PrimerBottomSheetConfig;

/* renamed from: X.LGc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47947LGc {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public C189478aR A02;
    public CharSequence A03;
    public final UserSession A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final PrimerBottomSheetConfig A08;

    public C47947LGc(UserSession userSession, PrimerBottomSheetConfig primerBottomSheetConfig, CharSequence charSequence, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A08 = primerBottomSheetConfig;
        this.A00 = null;
        this.A01 = null;
        this.A03 = charSequence;
        this.A05 = z;
        this.A07 = z2;
        this.A06 = z3;
    }

    public final void A02(Context context) {
        C14360o3.A0B(context, 0);
        C189448aO A0y = AbstractC25225BEi.A0y(this.A04);
        A0y.A0k = this.A05;
        A0y.A0q = false;
        A0y.A11 = this.A06;
        A0y.A0y = this.A07;
        C189478aR A00 = A0y.A00();
        this.A02 = A00;
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.igds.components.bottomsheet.BottomSheet");
        this.A02 = A00.A03(context, A00(this));
    }

    public static final KC3 A00(C47947LGc c47947LGc) {
        UserSession userSession = c47947LGc.A04;
        PrimerBottomSheetConfig primerBottomSheetConfig = c47947LGc.A08;
        C14360o3.A0B(primerBottomSheetConfig, 1);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putParcelable("arg_config", primerBottomSheetConfig);
        KC3 kc3 = new KC3();
        kc3.setArguments(A05);
        kc3.A00 = c47947LGc.A00;
        kc3.A01 = c47947LGc.A01;
        kc3.A03 = c47947LGc.A03;
        return kc3;
    }

    public final void A01() {
        C189478aR c189478aR = this.A02;
        if (c189478aR != null) {
            c189478aR.A07();
        }
    }
}
