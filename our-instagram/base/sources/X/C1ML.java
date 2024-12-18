package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1ML, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ML extends C1MM {
    public static final long A03;
    public static final long A04;
    public final C0JO A00;
    public final java.util.Set A01;
    public volatile long A02;

    @Override // X.C1MM, com.facebook.stash.core.FileStash
    public final File getFile(String str) {
        C14360o3.A0B(str, 0);
        if (this.A02 != A03 && !this.A01.contains(str)) {
            return null;
        }
        return super.A00.getFile(str);
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final boolean hasKey(String str) {
        C14360o3.A0B(str, 0);
        if (this.A02 == A03) {
            java.util.Set set = this.A01;
            if (!set.contains(str)) {
                if (!super.A00.hasKey(str)) {
                    return false;
                }
                set.add(str);
                return true;
            }
        }
        return this.A01.contains(str);
    }

    @Override // X.C1MM, com.facebook.stash.core.FileStash
    public final File insertFile(String str) {
        C14360o3.A0B(str, 0);
        this.A01.add(str);
        File insertFile = super.A00.insertFile(str);
        C14360o3.A07(insertFile);
        return insertFile;
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final boolean remove(String str) {
        C14360o3.A0B(str, 0);
        this.A01.remove(str);
        return super.A00.remove(str);
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final OutputStream write(final String str) {
        C14360o3.A0B(str, 0);
        this.A01.add(str);
        final OutputStream write = super.A00.write(str);
        C14360o3.A07(write);
        return new AbstractC85873sG(write, str) { // from class: X.3sF
            public final String A00;

            {
                this.A00 = str;
            }

            @Override // X.AbstractC85873sG, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                super.A00.close();
                String str2 = this.A00;
                if (str2 != null) {
                    C1ML.this.A01.add(str2);
                }
            }
        };
    }

    static {
        long millis = TimeUnit.HOURS.toMillis(4L);
        A04 = millis;
        A03 = (-2) * millis;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ML(FileStash fileStash) {
        super(fileStash);
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        C14360o3.A0B(realtimeSinceBootClock, 2);
        this.A00 = realtimeSinceBootClock;
        this.A01 = Collections.synchronizedSet(new HashSet());
        this.A02 = A03;
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final java.util.Set getAllKeys() {
        LinkedHashSet linkedHashSet;
        C0JO c0jo = this.A00;
        long now = c0jo.now();
        long now2 = c0jo.now() - this.A02;
        long j = A04;
        if (now2 > j) {
            java.util.Set set = this.A01;
            C14360o3.A06(set);
            synchronized (set) {
                if (c0jo.now() - this.A02 > j) {
                    set.clear();
                    java.util.Set allKeys = super.A00.getAllKeys();
                    C14360o3.A07(allKeys);
                    set.addAll(allKeys);
                    this.A02 = now;
                }
            }
        }
        java.util.Set set2 = this.A01;
        C14360o3.A06(set2);
        synchronized (set2) {
            linkedHashSet = new LinkedHashSet(set2);
        }
        return linkedHashSet;
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final int getItemCount() {
        java.util.Set allKeys;
        if (this.A02 != A03) {
            allKeys = this.A01;
        } else {
            allKeys = getAllKeys();
        }
        return allKeys.size();
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final boolean removeAll() {
        this.A01.clear();
        return super.A00.removeAll();
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final boolean remove(String str, int i) {
        C14360o3.A0B(str, 0);
        this.A01.remove(str);
        return super.A00.remove(str, i);
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final void write(String str, byte[] bArr) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(bArr, 1);
        super.A00.write(str, bArr);
        this.A01.add(str);
    }
}
