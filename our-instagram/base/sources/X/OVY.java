package X;

import java.io.File;

/* loaded from: classes9.dex */
public final class OVY {
    public static final C53853Nrh A01 = new Object();
    public static final File A02 = AbstractC23881Ey.A00().AXd(null, 1647725639);
    public final String A00;

    public OVY(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final File A00() {
        File A0w = MSW.A0w(A02, AbstractC002300n.A0d(this.A00, "/", "_", false));
        A0w.mkdirs();
        return A0w;
    }
}
