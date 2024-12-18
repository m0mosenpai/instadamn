package X;

import android.os.Bundle;

/* renamed from: X.F3g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34104F3g {
    public static final EnumC33330EoP A00(Bundle bundle) {
        String string = bundle.getString("InterestBasedChannelType");
        if (string != null) {
            return EnumC33330EoP.valueOf(string);
        }
        throw AbstractC166997dE.A0g();
    }
}
