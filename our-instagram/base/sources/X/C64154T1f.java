package X;

/* renamed from: X.T1f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64154T1f implements InterfaceC08100bW {
    public final int A00;
    public final Object A01;

    public C64154T1f(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC08100bW
    public final void EH9(String str) {
        String str2;
        if (this.A00 != 0) {
            str2 = "SecurePendingIntent";
        } else {
            str2 = "KeepaliveManager-SecurePendingIntent";
        }
        C0K8.A0E(str2, str);
    }

    @Override // X.InterfaceC08100bW
    public final void EHA(String str, String str2, Throwable th) {
        Object[] objArr;
        if (this.A00 != 0) {
            C0K8.A0J(String.format("tag: %s, file: %s, category: %s", "SecurePendingIntent", "FbnsRegistrarRetry", str), str2, th);
            return;
        }
        if (th == null) {
            objArr = new Object[]{str, str2};
        } else {
            objArr = new Object[]{str, str2, th};
        }
        C0K8.A0Q("%s-%s", "KeepaliveManager-SecurePendingIntent", objArr);
    }
}
