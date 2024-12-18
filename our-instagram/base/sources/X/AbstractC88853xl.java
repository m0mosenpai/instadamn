package X;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.3xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88853xl {
    public static final Iterator A01 = new ArrayList(0).iterator();
    public final File A00;

    public final Iterator A00() {
        final Object[] listFiles;
        if (this instanceof AbstractC88843xk) {
            final AbstractC88843xk abstractC88843xk = (AbstractC88843xk) this;
            File file = ((AbstractC88853xl) abstractC88843xk).A00;
            FileFilter fileFilter = abstractC88843xk.A00;
            Comparator comparator = abstractC88843xk.A01;
            if (fileFilter != null) {
                listFiles = file.listFiles(fileFilter);
            } else {
                listFiles = file.listFiles();
            }
            if (listFiles != null) {
                Object[] copyOf = Arrays.copyOf(listFiles, listFiles.length);
                try {
                    Arrays.sort(copyOf, comparator);
                    listFiles = copyOf;
                } catch (IllegalArgumentException unused) {
                }
            } else {
                listFiles = new File[0];
            }
            final Iterator it = new Iterator(listFiles) { // from class: X.3xm
                public int A00;
                public int A01;
                public final Object[] A02;

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    if (this.A01 >= this.A00) {
                        return false;
                    }
                    return true;
                }

                @Override // java.util.Iterator
                public final Object next() {
                    Object[] objArr = this.A02;
                    int i = this.A01;
                    this.A01 = i + 1;
                    return objArr[i];
                }

                @Override // java.util.Iterator
                public final void remove() {
                    throw new UnsupportedOperationException();
                }

                {
                    this.A02 = listFiles;
                    this.A00 = listFiles.length;
                }
            };
            return new Iterator() { // from class: X.3xn
                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final /* bridge */ /* synthetic */ Object next() {
                    AbstractC88843xk abstractC88843xk2 = AbstractC88843xk.this;
                    File file2 = (File) it.next();
                    if (abstractC88843xk2 instanceof C88983xz) {
                        return new AbstractC88853xl(file2);
                    }
                    if (abstractC88843xk2 instanceof C88963xx) {
                        AbstractC88843xk abstractC88843xk3 = new AbstractC88843xk(file2, abstractC88843xk2.A02);
                        abstractC88843xk3.A00 = C3y0.A00;
                        return abstractC88843xk3;
                    }
                    if (abstractC88843xk2 instanceof C88943xv) {
                        AbstractC88843xk abstractC88843xk4 = new AbstractC88843xk(file2, abstractC88843xk2.A02);
                        abstractC88843xk4.A00 = C88793xf.A03;
                        return abstractC88843xk4;
                    }
                    boolean z = abstractC88843xk2 instanceof C88883xo;
                    boolean z2 = abstractC88843xk2.A02;
                    if (z) {
                        AbstractC88843xk abstractC88843xk5 = new AbstractC88843xk(file2, z2);
                        abstractC88843xk5.A00 = C88793xf.A03;
                        return abstractC88843xk5;
                    }
                    AbstractC88843xk abstractC88843xk6 = new AbstractC88843xk(file2, z2);
                    abstractC88843xk6.A00 = C88793xf.A03;
                    return abstractC88843xk6;
                }

                @Override // java.util.Iterator
                public final void remove() {
                    it.remove();
                    throw null;
                }
            };
        }
        return A01;
    }

    public AbstractC88853xl(File file) {
        this.A00 = file;
    }
}
