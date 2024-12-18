package X;

import android.os.Bundle;

/* renamed from: X.Kkx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46680Kkx {
    public static final KCA A00(Integer num, String str, boolean z) {
        KCA kca = new KCA();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("args_file_path", str);
        A0b.putString("args_entry_point", AbstractC46682Kkz.A00(num));
        A0b.putBoolean("from_create_btn", z);
        kca.setArguments(A0b);
        return kca;
    }
}
