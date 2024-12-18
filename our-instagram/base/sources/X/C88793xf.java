package X;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.3xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88793xf implements Iterator {
    public C88953xw A00;
    public boolean A01;
    public final ArrayDeque A02 = new ArrayDeque();
    public static final FileFilter A03 = new FileFilter() { // from class: X.3xg
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return file.isDirectory();
        }
    };
    public static final Comparator A05 = new Comparator() { // from class: X.3xh
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            File file = (File) obj;
            File file2 = (File) obj2;
            if (file.lastModified() == file2.lastModified()) {
                String name = file.getName();
                String name2 = file2.getName();
                int length = name.length();
                int length2 = name2.length();
                if (length <= length2) {
                    if (length2 > length) {
                        return 1;
                    }
                    return name2.compareTo(name);
                }
            } else if (file.lastModified() <= file2.lastModified()) {
                return 1;
            }
            return -1;
        }
    };
    public static final Comparator A04 = new Comparator() { // from class: X.3xi
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            File file = (File) obj;
            File file2 = (File) obj2;
            if (file.lastModified() == file2.lastModified()) {
                String name = file.getName();
                String name2 = file2.getName();
                int length = name.length();
                int length2 = name2.length();
                if (length >= length2) {
                    if (length2 < length) {
                        return 1;
                    }
                    return name.compareTo(name2);
                }
            } else if (file.lastModified() >= file2.lastModified()) {
                return 1;
            }
            return -1;
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        r0 = new X.C88953xw(r2, r1);
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            r6 = this;
            boolean r0 = r6.A01
            r4 = 1
            if (r0 != 0) goto L52
            r6.A01 = r4
        L7:
            java.util.ArrayDeque r5 = r6.A02
            boolean r1 = r5.isEmpty()
            r0 = 0
            if (r1 != 0) goto L50
            java.lang.Object r3 = r5.getFirst()
            X.3xp r3 = (X.C88893xp) r3
            X.3xl r2 = r3.A02
            java.util.Iterator r0 = r3.A01
            if (r0 != 0) goto L22
            java.util.Iterator r0 = r2.A00()
            r3.A01 = r0
        L22:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L58
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            java.util.Iterator r0 = r3.A01
            if (r0 != 0) goto L38
            java.util.Iterator r0 = r2.A00()
            r3.A01 = r0
        L38:
            java.lang.Object r1 = r0.next()
            X.3xl r1 = (X.AbstractC88853xl) r1
            X.3xp r0 = new X.3xp
            r0.<init>(r1)
            r5.addFirst(r0)
            int r0 = r3.A00
            if (r0 != r4) goto L7
            r1 = 1
        L4b:
            X.3xw r0 = new X.3xw
            r0.<init>(r2, r1)
        L50:
            r6.A00 = r0
        L52:
            X.3xw r0 = r6.A00
            if (r0 != 0) goto L57
            r4 = 0
        L57:
            return r4
        L58:
            r5.removeFirst()
            boolean r0 = r2 instanceof X.AbstractC88843xk
            r1 = 3
            if (r0 == 0) goto L4b
            r1 = 2
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88793xf.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public C88793xf(File file, boolean z) {
        AbstractC88843xk abstractC88843xk = new AbstractC88843xk(file, z);
        abstractC88843xk.A00 = A03;
        Iterator A00 = abstractC88843xk.A00();
        while (A00.hasNext()) {
            this.A02.addLast(new C88893xp((AbstractC88853xl) A00.next()));
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            C88953xw c88953xw = this.A00;
            this.A00 = null;
            this.A01 = false;
            return c88953xw;
        }
        throw new IllegalStateException();
    }
}
