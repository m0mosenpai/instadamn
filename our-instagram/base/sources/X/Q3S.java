package X;

import android.os.FileObserver;

/* loaded from: classes10.dex */
public final class Q3S extends FileObserver {
    public final /* synthetic */ String A00;

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        String str2;
        if (str != null && AbstractC001900j.A0a(str, this.A00, false)) {
            if (i != 8) {
                if (i != 16) {
                    if (i != 32) {
                        if (i != 256) {
                            if (i != 512) {
                                str2 = "UNKNOWN";
                            } else {
                                str2 = "DELETE";
                            }
                        } else {
                            str2 = "CREATE";
                        }
                    } else {
                        str2 = "OPEN";
                    }
                } else {
                    str2 = "CLOSE_NOWRITE";
                }
            } else {
                str2 = "CLOSE_WRITE";
            }
            C0K8.A0O(AbstractC111324zv.A00(3649), "%s: %s", str2, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3S(String str, String str2) {
        super(str2, 824);
        this.A00 = str;
    }
}
