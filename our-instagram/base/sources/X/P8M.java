package X;

import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.archive.fragment.ArchiveReelRecycleBinFragment;

/* loaded from: classes9.dex */
public final class P8M implements InterfaceC114885Gz {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public P8M(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC114885Gz
    public final void onFinish() {
        if (this.A00 != 0) {
            ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment = (ArchiveReelRecycleBinFragment) this.A02;
            archiveReelRecycleBinFragment.A07.removeAll(AbstractC001800i.A0k((Iterable) this.A01));
            archiveReelRecycleBinFragment.A08.remove(this);
            return;
        }
        Iterable iterable = (Iterable) this.A02;
        ArchiveReelFragment archiveReelFragment = (ArchiveReelFragment) this.A01;
        java.util.Set set = archiveReelFragment.A0S;
        set.getClass();
        iterable.forEach(new M8M(set, 0));
        archiveReelFragment.A0T.remove(this);
        ArchiveReelFragment.A04(archiveReelFragment);
    }
}
