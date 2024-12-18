package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C09170dP;
import X.C0H1;
import android.text.TextUtils;
import com.facebook.forker.Fd;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class DexOptRunner {
    public final ProcessBuilder mTemplate;
    public final File mTmpDir;
    public File mTmpFbDexOpt;

    public void addDexOptOptions(ProcessBuilder processBuilder) {
    }

    public boolean attemptAllocate(int i, long j) {
        return DalvikInternals.attemptAllocate(i, j, -1);
    }

    /* loaded from: classes.dex */
    public class DexOptException extends RuntimeException {
        public final String errout;
        public final int status;

        public DexOptException(int i, String str) {
            super(AnonymousClass001.A11("dexopt failed with status ", Process.describeStatus(i), ": [", str, "]"));
            this.status = i;
            this.errout = str;
        }
    }

    public void cleanup() {
        if (this.mTmpFbDexOpt != null) {
            try {
                Mlog.safeFmt("Cleaning up temporary fbdexopt", new Object[0]);
                Fs.deleteRecursive(this.mTmpFbDexOpt);
            } catch (IOException unused) {
                Mlog.w("Unable to delete temporary fbdexopt", new Object[0]);
            }
        }
    }

    public final void run(InputStream inputStream, int i, String str, RandomAccessFile randomAccessFile, String str2, String[] strArr) {
        String join;
        Object[] objArr;
        String str3;
        boolean z = false;
        if (randomAccessFile.getFilePointer() == 0) {
            z = true;
        }
        Mlog.assertThat(z, "odex fpos must be 0", new Object[0]);
        boolean z2 = false;
        if (randomAccessFile.length() == 0) {
            z2 = true;
        }
        Mlog.assertThat(z2, "odex must be empty", new Object[0]);
        int fileno = Fd.fileno(randomAccessFile.getFD());
        DalvikInternals.dexOptCreateEmptyHeader(fileno);
        int filePointer = (int) randomAccessFile.getFilePointer();
        if (i > 1) {
            if (DalvikInternals.attemptAllocate(fileno, randomAccessFile.getFilePointer() + i, -1)) {
                objArr = new Object[]{Integer.valueOf(i)};
                str3 = "allocated more %s bytes for dex content";
            } else {
                objArr = new Object[0];
                str3 = "unable to preallocate on this system";
            }
            Mlog.safeFmt(str3, objArr);
        }
        int copyDexToOdex = copyDexToOdex(inputStream, i, randomAccessFile);
        if (copyDexToOdex != Integer.MAX_VALUE) {
            Mlog.safeFmt("wrote %s bytes to dex %s", Integer.valueOf(copyDexToOdex), str);
            RandomAccessFile openUnlinkedTemporaryFile = Fs.openUnlinkedTemporaryFile(this.mTmpDir);
            try {
                ProcessBuilder m59clone = this.mTemplate.m59clone();
                int fileno2 = Fd.fileno(openUnlinkedTemporaryFile.getFD());
                int[] iArr = m59clone.mStreamDispositions;
                iArr[1] = fileno2;
                iArr[2] = -5;
                m59clone.mKeepFds.set(fileno);
                addDexOptOptions(m59clone);
                String num = Integer.toString(fileno);
                String num2 = Integer.toString(0);
                String str4 = System.getenv("BOOTCLASSPATH");
                if (strArr == null) {
                    join = "";
                } else {
                    join = TextUtils.join(":", strArr);
                }
                m59clone.addArguments("--", num, str, num2, num2, str4, join, Long.toString(filePointer), Long.toString(copyDexToOdex), str2);
                Process startSubprocess = startSubprocess(m59clone);
                try {
                    waitForDexOpt(startSubprocess, fileno);
                    int exitValueEx = startSubprocess.exitValueEx();
                    startSubprocess.destroy();
                    if (exitValueEx == 0) {
                        openUnlinkedTemporaryFile.close();
                        return;
                    }
                    throw new DexOptException(exitValueEx, Fs.readProgramOutputFile(openUnlinkedTemporaryFile));
                } catch (Throwable th) {
                    startSubprocess.destroy();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    openUnlinkedTemporaryFile.close();
                    throw th2;
                } catch (Throwable th3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R("refusing to deal with impossibly huge dex file ", str));
    }

    public DexOptRunner(File file) {
        this.mTmpFbDexOpt = null;
        this.mTmpDir = file;
        File A01 = C09170dP.A01("fbdexopt");
        if (!A01.canExecute()) {
            File createTempFile = File.createTempFile("fbdexopt", null, file);
            this.mTmpFbDexOpt = createTempFile;
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                FileInputStream fileInputStream = new FileInputStream(A01);
                try {
                    C0H1.A00(fileInputStream, fileOutputStream, Integer.MAX_VALUE);
                    fileOutputStream.flush();
                    fileInputStream.close();
                    fileOutputStream.close();
                    createTempFile.setExecutable(true, true);
                    A01 = createTempFile;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                    throw th;
                } finally {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                }
            }
        }
        ProcessBuilder processBuilder = new ProcessBuilder(A01.getAbsolutePath(), new String[0]);
        processBuilder.setenv("LD_LIBRARY_PATH", C09170dP.A02());
        processBuilder.mTmpDir = file;
        this.mTemplate = processBuilder;
    }

    public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
        int i2 = 0;
        do {
            int A02 = C0H1.A02(inputStream, bArr, Integer.MAX_VALUE - i2);
            if (A02 == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, A02);
            i2 += A02;
        } while (i2 < Integer.MAX_VALUE);
        return i2;
    }

    public Process startSubprocess(ProcessBuilder processBuilder) {
        return processBuilder.create();
    }

    public void waitForDexOpt(Process process, int i) {
        process.waitForUninterruptibly();
    }
}
