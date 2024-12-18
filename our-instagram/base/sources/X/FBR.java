package X;

import android.os.Bundle;

/* loaded from: classes6.dex */
public abstract class FBR {
    public static final C50685MZd A00(EnumC72365Xc1 enumC72365Xc1, String str) {
        Bundle A0C = AbstractC31177DnL.A0C(enumC72365Xc1);
        A0C.putSerializable("screen_id", enumC72365Xc1);
        A0C.putSerializable(AbstractC111324zv.A00(1125), AbstractC166997dE.A0b());
        AbstractC31171DnF.A13(A0C, str);
        C50685MZd c50685MZd = new C50685MZd();
        c50685MZd.setArguments(A0C);
        return c50685MZd;
    }
}
