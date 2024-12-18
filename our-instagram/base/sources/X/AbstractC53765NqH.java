package X;

import android.content.Context;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.NqH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53765NqH {
    public static final void A00(Context context, C62862tP c62862tP, boolean z) {
        boolean A1Y = AbstractC25229BEm.A1Y(c62862tP);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        new BitSet(A1Y ? 1 : 0);
        A1G.put("is_onboarded", Boolean.valueOf(z));
        C36026FvO c36026FvO = new C36026FvO(2);
        C69618VsL A01 = FTe.A01("com.bloks.www.bloks.genai.mifu.update_onboarded_state");
        A01.A04 = AbstractC191768eY.A01(A1G);
        A01.A03 = A1G2;
        A01.A02 = c36026FvO;
        A01.A00(context, c62862tP);
    }
}
