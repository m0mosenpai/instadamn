package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.Wxd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71631Wxd implements Runnable {
    public final /* synthetic */ C7UR A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public RunnableC71631Wxd(C7UR c7ur, File file, Runnable runnable, String str, String str2, boolean z, boolean z2) {
        this.A01 = file;
        this.A04 = str;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = c7ur;
        this.A03 = str2;
        this.A02 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String path = this.A01.getPath();
            AnonymousClass750 anonymousClass750 = AnonymousClass750.A00;
            String str = this.A04;
            C14360o3.A0A(path);
            boolean z = this.A06;
            boolean z2 = this.A05;
            C7UR c7ur = this.A00;
            C7UR c7ur2 = C7UR.A0A;
            C1573774t c1573774t = new C1573774t(anonymousClass750.A00(c7ur.A00, str, path, z, z2), path);
            C7UX c7ux = c7ur.A02;
            String str2 = this.A03;
            c7ux.put(str2, c1573774t);
            c7ur.A07.execute(new RunnableC71630Wxc(c1573774t, c7ur, str2, str, C7UR.A04(c7ur, str2), z2, z));
        } catch (IOException unused) {
            this.A02.run();
        }
    }
}
