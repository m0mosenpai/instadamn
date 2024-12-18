package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Collection;

/* renamed from: X.Goq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38062Goq implements InterfaceC43459JHx {
    public final FileStash A00;

    @Override // X.InterfaceC43459JHx
    public final long CgL(String str) {
        return 0L;
    }

    @Override // X.InterfaceC43459JHx
    public final long[] getItemInformation(String str) {
        FileStash fileStash = this.A00;
        return new long[]{0, fileStash.lastAccessTime(str), fileStash.getItemSizeBytes(str)};
    }

    @Override // X.InterfaceC43459JHx
    public final Collection Ab5() {
        return this.A00.getAllKeys();
    }

    @Override // X.InterfaceC43459JHx
    public final boolean CfA(String str) {
        File filePath = this.A00.getFilePath(str);
        if (filePath.exists() && !filePath.canExecute()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC43459JHx
    public final boolean remove(String str) {
        return this.A00.remove(str);
    }

    public C38062Goq(FileStash fileStash) {
        this.A00 = fileStash;
    }
}
