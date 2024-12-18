package X;

import android.os.Bundle;

/* renamed from: X.Kkw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46679Kkw {
    public static final KC9 A00(Integer num, boolean z) {
        KC9 kc9 = new KC9();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("args_entry_point", AbstractC46682Kkz.A00(num));
        A0b.putBoolean("args_from_create_btn", z);
        kc9.setArguments(A0b);
        return kc9;
    }
}
