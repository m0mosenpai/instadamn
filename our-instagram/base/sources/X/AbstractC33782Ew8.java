package X;

import android.os.Bundle;

/* renamed from: X.Ew8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33782Ew8 {
    public static final EEO A00(String str, String str2) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("args_editor_logging_surface", str);
        A0b.putString("args_editor_logging_mechanism", str2);
        EEO eeo = new EEO();
        eeo.setArguments(A0b);
        return eeo;
    }
}
