package X;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class S55 {
    public static final boolean A00(Context context) {
        String A03;
        C19740y2 A00 = AbstractC19730y1.A00(AbstractC12960li.A00);
        C74103Uo A02 = ((C74123Uq) C3UY.A00).A02();
        C14360o3.A07(A02);
        Sh7 sh7 = new Sh7(context, A02, C4N2.A00, C3UV.A00(context));
        if (A00.A00.getInt("latest_push_token_registration_status", 0) != 2 && (A03 = sh7.A03("com.instagram.android")) != null && A03.length() != 0) {
            return false;
        }
        return true;
    }
}
