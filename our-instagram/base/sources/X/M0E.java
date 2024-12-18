package X;

/* loaded from: classes8.dex */
public final class M0E implements Runnable {
    public final /* synthetic */ C45490KCf A00;

    public M0E(C45490KCf c45490KCf) {
        this.A00 = c45490KCf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C45490KCf c45490KCf = this.A00;
        C18240vB c18240vB = C45490KCf.A0O;
        android.net.Uri uri = c45490KCf.A03;
        if (uri != null) {
            C45490KCf.A00(uri, null, c45490KCf);
        }
    }
}
