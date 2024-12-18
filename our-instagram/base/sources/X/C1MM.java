package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.1MM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1MM implements FileStash {
    public final FileStash A00;

    @Override // com.facebook.stash.core.Stash
    public java.util.Set getAllKeys() {
        return this.A00.getAllKeys();
    }

    @Override // com.facebook.stash.core.Stash
    public final File getBaseStoragePath_ForInternalUse() {
        return this.A00.getBaseStoragePath_ForInternalUse();
    }

    @Override // com.facebook.stash.core.FileStash
    public File getFile(String str) {
        return this.A00.getFile(str);
    }

    @Override // com.facebook.stash.core.FileStash
    public final File getFilePath(String str) {
        return this.A00.getFilePath(str);
    }

    @Override // com.facebook.stash.core.Stash
    public int getItemCount() {
        return this.A00.getItemCount();
    }

    @Override // com.facebook.stash.core.FileStash
    public final long[] getItemInformation(String str) {
        return this.A00.getItemInformation(str);
    }

    @Override // com.facebook.stash.core.Stash
    public final long getItemSizeBytes(String str) {
        return this.A00.getItemSizeBytes(str);
    }

    @Override // com.facebook.stash.core.Stash
    public long getSizeBytes() {
        return this.A00.getSizeBytes();
    }

    @Override // com.facebook.stash.core.Stash
    public boolean hasKey(String str) {
        return this.A00.hasKey(str);
    }

    @Override // com.facebook.stash.core.FileStash
    public File insertFile(String str) {
        return this.A00.insertFile(str);
    }

    @Override // com.facebook.stash.core.Stash
    public final long lastAccessTime(String str) {
        return this.A00.lastAccessTime(str);
    }

    @Override // com.facebook.stash.core.Stash
    public InputStream read(String str) {
        return this.A00.read(str);
    }

    @Override // com.facebook.stash.core.Stash
    public byte[] readResourceToMemory(String str) {
        return this.A00.readResourceToMemory(str);
    }

    @Override // com.facebook.stash.core.Stash
    public boolean remove(String str) {
        return this.A00.remove(str);
    }

    @Override // com.facebook.stash.core.Stash
    public boolean removeAll() {
        return this.A00.removeAll();
    }

    @Override // com.facebook.stash.core.Stash
    public boolean touch(String str) {
        return this.A00.touch(str);
    }

    @Override // com.facebook.stash.core.Stash
    public OutputStream write(String str) {
        return this.A00.write(str);
    }

    public C1MM(FileStash fileStash) {
        this.A00 = fileStash;
    }

    @Override // com.facebook.stash.core.Stash
    public boolean remove(String str, int i) {
        return this.A00.remove(str, i);
    }

    @Override // com.facebook.stash.core.Stash
    public void write(String str, byte[] bArr) {
        this.A00.write(str, bArr);
    }
}
