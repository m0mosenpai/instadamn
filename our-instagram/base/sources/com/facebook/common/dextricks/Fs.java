package com.facebook.common.dextricks;

import X.AnonymousClass001;
import android.content.Context;
import android.net.LocalSocket;
import android.os.Process;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class Fs {
    public static boolean isKernelPageCacheFlushIsBroken;
    public static File sDalvikCacheDirectory;

    public static void deleteRecursiveNoThrow(File file) {
        if (file != null) {
            try {
                deleteRecursive(file);
            } catch (Exception e) {
                Mlog.w(e, "error deleting %s", file);
            }
        }
    }

    public static String extensions(String str) {
        int indexOf = str.indexOf(46);
        if (indexOf == -1) {
            return null;
        }
        return str.substring(indexOf);
    }

    public static File findSystemDalvikCache() {
        File file = sDalvikCacheDirectory;
        if (file == null) {
            String lowerCase = System.getProperty("os.arch").toLowerCase();
            String str = "arm";
            if (!lowerCase.startsWith("arm")) {
                if (lowerCase.startsWith("x86") || (lowerCase.startsWith("i") && lowerCase.endsWith("86"))) {
                    str = "x86";
                } else {
                    throw new RuntimeException(AnonymousClass001.A0R("unknown arch: ", lowerCase));
                }
            }
            String str2 = System.getenv("ANDROID_DATA");
            if (str2 == null) {
                str2 = "/data";
            }
            String format = String.format("%s/dalvik-cache/%s", str2, str);
            if (!new File(format).isDirectory()) {
                format = String.format("%s/dalvik-cache", str2);
            }
            File file2 = new File(format);
            sDalvikCacheDirectory = file2;
            return file2;
        }
        return file;
    }

    public static String lastExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(lastIndexOf);
    }

    public static String readProgramOutputFile(RandomAccessFile randomAccessFile) {
        randomAccessFile.seek(0L);
        byte[] bArr = new byte[(int) Math.min(randomAccessFile.length(), 131072L)];
        randomAccessFile.read(bArr);
        String obj = Charset.forName(ReactWebViewManager.HTML_ENCODING).newDecoder().onMalformedInput(CodingErrorAction.REPLACE).replaceWith("?").decode(ByteBuffer.wrap(bArr)).toString();
        if (obj.startsWith("WARNING: linker: ")) {
            int indexOf = obj.indexOf(10);
            if (indexOf == -1) {
                indexOf = obj.length() - 1;
            }
            return obj.substring(indexOf + 1);
        }
        return obj;
    }

    public static RuntimeException runtimeExFrom(Throwable th) {
        if (th == null) {
            return new RuntimeException("missing exception object");
        }
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        return new RuntimeException(th);
    }

    public static void safeClose(LocalSocket localSocket) {
        if (localSocket != null) {
            try {
                localSocket.close();
            } catch (Exception e) {
                Mlog.w(e, "error closing %s", localSocket);
            }
        }
    }

    public static String stripExtensions(String str) {
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    public static String stripLastExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        return str;
    }

    public static void tryDiscardPageCache(int i) {
        if (!isKernelPageCacheFlushIsBroken) {
            try {
                DalvikInternals.fadvise(i, 0L, 2147483647L, 4);
            } catch (Exception e) {
                Mlog.w(e, "failed to fadvise", new Object[0]);
                isKernelPageCacheFlushIsBroken = true;
            }
        }
    }

    public static void deleteRecursive(File file) {
        DalvikInternals.deleteRecursive(file.getAbsolutePath());
    }

    public static File dexOptGenerateCacheFileName(File file, File file2, String str) {
        String absolutePath = file2.getAbsolutePath();
        if (str != null) {
            absolutePath = AnonymousClass001.A0g(absolutePath, "@", str);
        }
        return new File(file, absolutePath.substring(1).replace("/", "@"));
    }

    public static long discardFromInputStream(InputStream inputStream, long j) {
        int read;
        byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
        long j2 = 0;
        while (j2 < j && (read = inputStream.read(bArr, 0, (int) Math.min(OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED, j - j2))) != -1) {
            j2 += read;
        }
        return j2;
    }

    public static void fsyncRecursive(File file, Prio prio) {
        if (!file.getPath().endsWith("_lock")) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    fsyncRecursive(file2, prio);
                }
            }
            if (file.exists()) {
                DalvikInternals.fsyncNamed(file.getAbsolutePath(), prio.ioPriority);
            }
        }
    }

    public static void link(File file, File file2) {
        DalvikInternals.link(file.getAbsolutePath(), file2.getAbsolutePath(), 0);
    }

    public static void linkAtomic(File file, File file2) {
        DalvikInternals.link(file.getAbsolutePath(), file2.getAbsolutePath(), 2);
    }

    public static File makeDataFile(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir, str);
    }

    public static void mkdirOrThrow(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("cannot mkdir: ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    public static RandomAccessFile openDataSyncedFile(File file) {
        int openUnixSyncReadWriteFd = DalvikInternals.openUnixSyncReadWriteFd(file.getAbsolutePath());
        try {
            return new RandomAccessFile(AnonymousClass001.A02(Process.myTid(), openUnixSyncReadWriteFd, "/proc/self/task/", "/fd/"), "rw");
        } finally {
            DalvikInternals.closeUnixFd(openUnixSyncReadWriteFd);
        }
    }

    public static RandomAccessFile openUnlinkedTemporaryFile(File file) {
        File createTempFile = File.createTempFile("dextricks", ".tmp", file);
        RandomAccessFile randomAccessFile = new RandomAccessFile(createTempFile, "rw");
        if (createTempFile.delete()) {
            return randomAccessFile;
        }
        randomAccessFile.close();
        StringBuilder sb = new StringBuilder();
        sb.append("could not unlink ");
        sb.append(createTempFile);
        throw new IOException(sb.toString());
    }

    public static void renameOrThrow(File file, File file2) {
        if (file.exists()) {
            if (file.renameTo(file2)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("rename of ");
            sb.append(file);
            sb.append(" to ");
            sb.append(file2);
            sb.append(" failed");
            throw new IOException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot rename ");
        sb2.append(file);
        sb2.append(" because it doesn't exist");
        throw new IOException(sb2.toString());
    }

    public static void symlink(File file, File file2) {
        DalvikInternals.link(file.getAbsolutePath(), file2.getAbsolutePath(), 1);
    }

    public static void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                Mlog.w(e, "error closing %s", closeable);
            }
        }
    }

    public static void safeClose(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (Exception e) {
                Mlog.w(e, "error closing %s", zipFile);
            }
        }
    }
}
