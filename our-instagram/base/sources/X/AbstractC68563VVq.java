package X;

import android.os.Bundle;

/* renamed from: X.VVq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68563VVq {
    public static C67880V0l A00(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        C67880V0l c67880V0l = new C67880V0l();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_TITLE_STRING_RES_ID", i6);
        bundle.putInt("EXTRA_SUBTITLE_STRING_RES_ID", i5);
        bundle.putInt("EXTRA_HINT_STRING_RES_ID", i);
        bundle.putString("EXTRA_CONTENT", str);
        if (i4 == -1) {
            i4 = 2131968535;
        }
        bundle.putInt("EXTRA_PROGRESS_BUTTON_LABEL_STRING_RES_ID", i4);
        bundle.putInt("EXTRA_INPUT_MAX_LINES", i3);
        bundle.putInt("EXTRA_INPUT_MAX_CHARACTERS", 150);
        bundle.putInt("EXTRA_INPUT_IME_ACTION", i2);
        c67880V0l.setArguments(bundle);
        return c67880V0l;
    }
}
