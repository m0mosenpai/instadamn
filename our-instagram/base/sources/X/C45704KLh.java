package X;

import java.io.File;

/* renamed from: X.KLh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45704KLh extends AbstractRunnableC14200nk {
    public final /* synthetic */ File A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45704KLh(File file) {
        super(202);
        this.A00 = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles = this.A00.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.getName().contains("-stitched")) {
                    file.delete();
                }
            }
        }
    }
}
