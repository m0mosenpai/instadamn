package X;

import com.facebook.stash.core.FileStash;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: X.1MH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1MH implements FileStash {
    public int A00;
    public boolean A01;
    public final C0JM A02;
    public final C23111Aq A03;
    public final File A04;

    @Override // com.facebook.stash.core.Stash
    public final InputStream read(String str) {
        try {
            File file = getFile(str);
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            if (this.A01) {
                int i = this.A00;
                if (i > 0) {
                    return new BufferedInputStream(fileInputStream, i);
                }
                return new BufferedInputStream(fileInputStream);
            }
            return fileInputStream;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public C1MH(C23111Aq c23111Aq, File file) {
        C03250Di c03250Di = C03250Di.A00;
        this.A01 = false;
        this.A00 = -1;
        this.A04 = file;
        this.A03 = c23111Aq;
        this.A02 = c03250Di;
    }

    @Override // com.facebook.stash.core.Stash
    public final java.util.Set getAllKeys() {
        int length;
        String[] list = this.A04.list();
        if (list != null && (length = list.length) != 0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(length);
            for (String str : list) {
                java.util.Set set = AbstractC59982og.A00;
                char[] charArray = str.toCharArray();
                StringBuilder sb = new StringBuilder();
                int i = 0;
                while (i < charArray.length) {
                    char c = charArray[i];
                    if (c == '%') {
                        try {
                            sb.append((char) Integer.parseInt(new String(charArray, i + 1, 2), 16));
                            i += 2;
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        sb.append(c);
                    }
                    i++;
                }
                str = sb.toString();
                linkedHashSet.add(str);
            }
            return linkedHashSet;
        }
        return Collections.emptySet();
    }

    @Override // com.facebook.stash.core.Stash
    public final File getBaseStoragePath_ForInternalUse() {
        return this.A04;
    }

    @Override // com.facebook.stash.core.FileStash
    public final File getFilePath(String str) {
        File file = this.A04;
        java.util.Set set = AbstractC59982og.A00;
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (c != '%' && !AbstractC59982og.A00.contains(Character.valueOf(c))) {
                sb.append(c);
            } else {
                sb.append('%');
                sb.append(Integer.toHexString(c));
            }
        }
        return new File(file, sb.toString());
    }

    @Override // com.facebook.stash.core.Stash
    public final int getItemCount() {
        String[] list = this.A04.list();
        if (list != null) {
            return list.length;
        }
        return 0;
    }

    @Override // com.facebook.stash.core.Stash
    public final long getSizeBytes() {
        return AbstractC73583Rk.A00(this.A04);
    }

    @Override // com.facebook.stash.core.FileStash
    public final File insertFile(String str) {
        this.A04.mkdirs();
        File filePath = getFilePath(str);
        filePath.setLastModified(this.A02.now());
        return filePath;
    }

    @Override // com.facebook.stash.core.Stash
    public final boolean remove(String str) {
        C23111Aq c23111Aq = this.A03;
        return c23111Aq.A08.A00(getFilePath(str));
    }

    @Override // com.facebook.stash.core.Stash
    public final boolean removeAll() {
        C23111Aq c23111Aq = this.A03;
        File file = this.A04;
        if (c23111Aq.A08.A00(file)) {
            file.mkdirs();
            return true;
        }
        return false;
    }

    @Override // com.facebook.stash.core.FileStash
    public final File getFile(String str) {
        File filePath = getFilePath(str);
        if (!filePath.exists()) {
            return null;
        }
        filePath.setLastModified(this.A02.now());
        return filePath;
    }

    @Override // com.facebook.stash.core.FileStash
    public final long[] getItemInformation(String str) {
        File filePath = getFilePath(str);
        return new long[]{filePath.lastModified(), AbstractC73583Rk.A00(filePath)};
    }

    @Override // com.facebook.stash.core.Stash
    public final long getItemSizeBytes(String str) {
        return AbstractC73583Rk.A00(getFilePath(str));
    }

    @Override // com.facebook.stash.core.Stash
    public final boolean hasKey(String str) {
        return getFilePath(str).exists();
    }

    @Override // com.facebook.stash.core.Stash
    public final long lastAccessTime(String str) {
        return getFilePath(str).lastModified();
    }

    @Override // com.facebook.stash.core.Stash
    public final byte[] readResourceToMemory(String str) {
        InputStream read = read(str);
        if (read == null) {
            return null;
        }
        try {
            long length = getFilePath(str).length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                for (int i2 = 0; i2 < length; i2 += read.read(bArr, i2, i)) {
                }
                read.close();
                return bArr;
            }
            throw new IllegalArgumentException(AnonymousClass001.A0Q("Trying to read too big resource, size (b): ", length));
        } catch (Throwable th) {
            try {
                read.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // com.facebook.stash.core.Stash
    public final boolean touch(String str) {
        return getFilePath(str).setLastModified(this.A02.now());
    }

    @Override // com.facebook.stash.core.Stash
    public final OutputStream write(String str) {
        FileOutputStream fileOutputStream;
        File filePath = getFilePath(str);
        filePath.setLastModified(this.A02.now());
        try {
            fileOutputStream = new FileOutputStream(filePath);
        } catch (FileNotFoundException unused) {
            this.A04.mkdirs();
            fileOutputStream = new FileOutputStream(filePath);
        }
        if (this.A01) {
            return new BufferedOutputStream(fileOutputStream);
        }
        return fileOutputStream;
    }

    @Override // com.facebook.stash.core.Stash
    public final boolean remove(String str, int i) {
        return remove(str);
    }

    @Override // com.facebook.stash.core.Stash
    public final void write(String str, byte[] bArr) {
        OutputStream write = write(str);
        try {
            write.write(bArr);
            write.close();
        } catch (Throwable th) {
            try {
                write.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }
}
