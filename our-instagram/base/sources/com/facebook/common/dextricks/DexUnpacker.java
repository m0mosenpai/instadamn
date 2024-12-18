package com.facebook.common.dextricks;

import android.content.Context;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DexUnpacker {
    public final Context mAppContext;
    public final DexIteratorFactory mDexIteratorFactory;
    public final ResProvider mResProvider;

    /* loaded from: classes.dex */
    public final class CopiedDexInfo {
        public final DexManifest.Dex dex;
        public final File dexFile;

        public CopiedDexInfo renamedTo(File file) {
            File file2 = this.dexFile;
            File file3 = new File(file, this.dex.makeDexName());
            if (file3.equals(file2)) {
                return this;
            }
            Mlog.safeFmt("Copying unpacked dex file %s to final dest %s", file2.getAbsolutePath(), file3.getAbsolutePath());
            Fs.renameOrThrow(file2, file3);
            return new CopiedDexInfo(this.dex, file3);
        }

        public CopiedDexInfo(DexManifest.Dex dex, File file) {
            this.dex = dex;
            this.dexFile = file;
        }
    }

    /* loaded from: classes.dex */
    public class CopyDexIterator implements Iterator, Closeable {
        public final File mDestDir;
        public final InputDexIterator mInputDexIterator;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mInputDexIterator.close();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mInputDexIterator.hasNext();
        }

        @Override // java.util.Iterator
        public CopiedDexInfo next() {
            CopiedDexInfo copiedDexInfo;
            InputDex next = this.mInputDexIterator.next();
            try {
                try {
                    copiedDexInfo = DexUnpacker.copyDex(next, this.mDestDir);
                } catch (IOException e) {
                    Mlog.w(e, "Error unpacking dex%s", next);
                    copiedDexInfo = null;
                }
                return copiedDexInfo;
            } finally {
                next.close();
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public CopyDexIterator(InputDexIterator inputDexIterator, File file) {
            this.mInputDexIterator = inputDexIterator;
            this.mDestDir = file;
        }
    }

    public List copySecondaryDexes(File file) {
        CopyDexIterator copySecondaryDexIterator = getCopySecondaryDexIterator(file, null);
        try {
            List copyAllDexes = copyAllDexes(copySecondaryDexIterator);
            if (copySecondaryDexIterator != null) {
                copySecondaryDexIterator.close();
            }
            return copyAllDexes;
        } catch (Throwable th) {
            if (copySecondaryDexIterator != null) {
                try {
                    copySecondaryDexIterator.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public CopyDexIterator getCopyDexIterator(DexManifest dexManifest, File file, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        if (dexManifest == null) {
            Mlog.w("Cannot unpack dexes with a null manifest", new Object[0]);
            return null;
        }
        try {
            return new CopyDexIterator(this.mDexIteratorFactory.openDexIterator(dexManifest.id, dexManifest, lightweightQuickPerformanceLogger, this.mAppContext), file);
        } catch (IOException e) {
            Mlog.w(e, "Could not create copy dex iterator", new Object[0]);
            return null;
        }
    }

    public CopyDexIterator getCopySecondaryDexIterator(File file) {
        return getCopySecondaryDexIterator(file, null);
    }

    public static List copyAllDexes(CopyDexIterator copyDexIterator) {
        if (copyDexIterator != null) {
            ArrayList arrayList = new ArrayList();
            while (copyDexIterator.hasNext()) {
                CopiedDexInfo next = copyDexIterator.next();
                if (next != null) {
                    arrayList.add(next);
                } else {
                    throw new IOException("Could not unpack dex");
                }
            }
            return arrayList;
        }
        throw new IOException("Could not unpack dex since it could not find dexes");
    }

    public static List copyAllDexesAndMove(File file, CopyDexIterator copyDexIterator) {
        if (copyDexIterator != null) {
            ArrayList arrayList = new ArrayList();
            while (copyDexIterator.hasNext()) {
                CopiedDexInfo next = copyDexIterator.next();
                if (next != null) {
                    arrayList.add(next.renamedTo(file));
                } else {
                    throw new IOException("Could not unpack dex");
                }
            }
            return arrayList;
        }
        throw new IOException("Could not unpack dex since it could not find dexes");
    }

    public DexUnpacker(Context context, ResProvider resProvider) {
        this.mAppContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.mResProvider = resProvider;
        this.mDexIteratorFactory = new DexIteratorFactory(resProvider);
    }

    public static CopiedDexInfo copyDex(InputDex inputDex, File file) {
        Mlog.safeFmt("Unpacking %s", inputDex);
        File file2 = new File(file, inputDex.dex.makeDexName());
        inputDex.extract(file2);
        Mlog.safeFmt("Unpacked dex file to %s", file2.getAbsolutePath());
        return new CopiedDexInfo(inputDex.dex, file2);
    }

    public List copyDexes(DexManifest dexManifest, File file, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        CopyDexIterator copyDexIterator = getCopyDexIterator(dexManifest, file, lightweightQuickPerformanceLogger);
        try {
            List copyAllDexes = copyAllDexes(copyDexIterator);
            if (copyDexIterator != null) {
                copyDexIterator.close();
            }
            return copyAllDexes;
        } catch (Throwable th) {
            if (copyDexIterator != null) {
                try {
                    copyDexIterator.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public List copySecondaryDexes(File file, File file2) {
        CopyDexIterator copySecondaryDexIterator = getCopySecondaryDexIterator(file, null);
        try {
            List copyAllDexesAndMove = copyAllDexesAndMove(file2, copySecondaryDexIterator);
            if (copySecondaryDexIterator != null) {
                copySecondaryDexIterator.close();
            }
            return copyAllDexesAndMove;
        } catch (Throwable th) {
            if (copySecondaryDexIterator != null) {
                try {
                    copySecondaryDexIterator.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public CopyDexIterator getCopySecondaryDexIterator(File file, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        try {
            return getCopyDexIterator(DexManifest.loadManifestFrom(this.mResProvider, DexStoreUtils.SECONDARY_DEX_MANIFEST, false), file, lightweightQuickPerformanceLogger);
        } catch (IOException e) {
            Mlog.w(e, "Cannot unpack secondary dexes", new Object[0]);
            return null;
        }
    }

    public List copySecondaryDexes(File file, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        CopyDexIterator copySecondaryDexIterator = getCopySecondaryDexIterator(file, lightweightQuickPerformanceLogger);
        try {
            List copyAllDexes = copyAllDexes(copySecondaryDexIterator);
            if (copySecondaryDexIterator != null) {
                copySecondaryDexIterator.close();
            }
            return copyAllDexes;
        } catch (Throwable th) {
            if (copySecondaryDexIterator != null) {
                try {
                    copySecondaryDexIterator.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }
}
