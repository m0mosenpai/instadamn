package X;

import android.content.Context;
import android.util.Base64;
import java.util.Map;

/* renamed from: X.5iI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123435iI {
    public static C123435iI A01;
    public final InterfaceC19630xq A00;

    public final C123445iJ A00() {
        InterfaceC19630xq interfaceC19630xq = this.A00;
        int i = interfaceC19630xq.getInt("pw_enc_key_id", -1);
        String string = interfaceC19630xq.getString("pw_enc_public_key", null);
        interfaceC19630xq.getLong("pw_enc_key_expiry_timestamp_ms", -1L);
        String string2 = interfaceC19630xq.getString("pw_enc_key_state", null);
        if (i == -1 || string == null || string2 == null) {
            return null;
        }
        return new C123445iJ(i, string, string2);
    }

    public C123435iI(Context context) {
        Map map = C1FE.A09;
        this.A00 = new C1FF(context, "PasswordEncryptionKeyStorePrefs").A00();
    }

    public final void A01(String str, String str2) {
        String str3 = "ENCRYPTION_WITH_TAGGING";
        C123445iJ c123445iJ = new C123445iJ(Integer.parseInt(str2), new String(Base64.decode(str, 2)), "ENCRYPTION_WITH_TAGGING");
        int i = c123445iJ.A00;
        String str4 = c123445iJ.A02;
        if (1 - c123445iJ.A01.intValue() == 0) {
            str3 = "PLAINTEXT_WITH_TAGGING";
        }
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7D("pw_enc_key_id", i);
        ARD.E7K("pw_enc_public_key", str4);
        ARD.E7G("pw_enc_key_expiry_timestamp_ms", -1L);
        ARD.E7K("pw_enc_key_state", str3);
        ARD.apply();
    }
}
