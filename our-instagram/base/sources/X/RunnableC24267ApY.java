package X;

import java.io.File;

/* renamed from: X.ApY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24267ApY implements Runnable {
    public final /* synthetic */ String A00;

    public RunnableC24267ApY(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File A11 = AbstractC166987dD.A11(this.A00);
        if (A11.exists() && A11.getParent() != null) {
            File A112 = AbstractC166987dD.A11(A11.getParent());
            if (A112.exists() && A112.isDirectory()) {
                File[] listFiles = A112.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        file.delete();
                    }
                }
                A112.delete();
            }
        }
    }
}
