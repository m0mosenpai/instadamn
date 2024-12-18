package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.FileLockInterruptionException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.OverlappingFileLockException;

/* renamed from: X.QCr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58856QCr extends AbstractC40721uf {
    public FileLock A00;
    public final FileChannel A01;
    public final File A02;
    public final /* synthetic */ C58857QCs A03;

    @Override // X.AbstractC40721uf
    public final String A01() {
        return "CrossProcessBatchLock";
    }

    @Override // X.AbstractC40721uf
    public final synchronized void A02() {
        try {
            this.A01.close();
        } catch (IOException e) {
            C0K8.A0N("CrossProcessBatchLock", "Failed to close the file channel associated with file: %s", e, super.A02);
        }
    }

    @Override // X.AbstractC40721uf
    public final synchronized void A04() {
        while (this.A00 == null) {
            try {
                try {
                    this.A00 = this.A01.lock();
                } catch (ClosedChannelException e) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("File channel is closed prematurely or opened non-writable for: ");
                    throw AbstractC58318PtA.A0e(AbstractC166997dE.A0v(super.A02, A1C), e);
                } catch (FileLockInterruptionException e2) {
                    C0K8.A0M("CrossProcessBatchLock", "Interrupted while waiting to lock the file: %s", e2, super.A02);
                } catch (IOException | NonWritableChannelException e3) {
                    throw AbstractC58318PtA.A0e("Failed to lock the file due to an IOException!", e3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // X.AbstractC40721uf
    public final synchronized void A05() {
        this.A02.delete();
    }

    @Override // X.AbstractC40721uf
    public final synchronized void A06() {
        try {
            FileLock fileLock = this.A00;
            if (fileLock != null) {
                try {
                    fileLock.release();
                    this.A00 = null;
                } catch (ClosedChannelException e) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("File Channel has been closed prematurely for: ");
                    throw AbstractC58318PtA.A0e(AbstractC166997dE.A0v(super.A02, A1C), e);
                } catch (IOException e2) {
                }
            } else {
                StringBuilder A1C2 = AbstractC166987dD.A1C();
                A1C2.append("File lock was never held for: ");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // X.AbstractC40721uf
    public final synchronized boolean A09() {
        return !this.A02.exists();
    }

    @Override // X.AbstractC40721uf
    public final synchronized boolean A0A() {
        try {
            if (this.A00 == null) {
                try {
                    this.A00 = this.A01.tryLock();
                } catch (ClosedChannelException e) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("File channel closed prematurely for: ");
                    throw AbstractC58318PtA.A0e(AbstractC166997dE.A0v(super.A02, A1C), e);
                } catch (IOException | OverlappingFileLockException e2) {
                    C0K8.A0I("CrossProcessBatchLock", "IOException happens when trying to lock the file.", e2);
                }
            }
        } finally {
        }
        return AbstractC167007dF.A1W(this.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58856QCr(C58857QCs c58857QCs, File file) {
        super(c58857QCs, file);
        this.A03 = c58857QCs;
        if (!file.getParentFile().isDirectory() && !file.getParentFile().mkdirs()) {
            throw MSW.A0y(AbstractC167017dG.A0n(file, "Unable to create parent directories for: ", AbstractC166987dD.A1C()));
        }
        File A0f = AbstractC58322PtE.A0f(file.getName(), ".lock", file.getParentFile());
        this.A02 = A0f;
        this.A01 = new RandomAccessFile(A0f, "rw").getChannel();
    }
}
