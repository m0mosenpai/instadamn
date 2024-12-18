package X;

import android.text.TextUtils;

/* loaded from: classes10.dex */
public final class T16 implements InterfaceC65366Tiy {
    public final /* synthetic */ String A00;

    public T16(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC65366Tiy
    public final /* bridge */ /* synthetic */ Object get() {
        String str = this.A00;
        if (TextUtils.isEmpty(str)) {
            return "unset";
        }
        return str;
    }
}
