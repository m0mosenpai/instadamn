package X;

import com.instagram.archive.fragment.ArchiveReelRecycleBinFragment;

/* loaded from: classes9.dex */
public final class PLK implements Runnable {
    public final /* synthetic */ ArchiveReelRecycleBinFragment A00;

    public PLK(ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment) {
        this.A00 = archiveReelRecycleBinFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArchiveReelRecycleBinFragment.A01(this.A00);
    }
}
