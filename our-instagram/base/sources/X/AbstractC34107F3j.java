package X;

import android.os.Bundle;

/* renamed from: X.F3j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34107F3j {
    public static final EHQ A00(String str, String str2) {
        EHQ ehq = new EHQ();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("key_thread_id", str2);
        A0b.putString("key_entry_point", str);
        ehq.setArguments(A0b);
        return ehq;
    }
}
