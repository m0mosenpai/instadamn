package X;

import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class W4U {
    public static final EnumC68134VCs A05 = EnumC68134VCs.A02;
    public EnumC68134VCs A00;
    public String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public W4U(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = new ArrayList();
        this.A00 = A05;
    }

    public final void A00() {
        boolean z;
        for (C67885V0r c67885V0r : this.A04) {
            IgdsBottomButtonLayout igdsBottomButtonLayout = c67885V0r.A00;
            if (igdsBottomButtonLayout == null) {
                C14360o3.A0F("bottomButtonLayout");
                throw C00O.createAndThrow();
            }
            if (c67885V0r.A00().A01 != null) {
                c67885V0r.A00();
                z = true;
            } else {
                z = false;
            }
            igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
        }
    }
}
