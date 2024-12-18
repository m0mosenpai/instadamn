package X;

import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;

/* renamed from: X.3xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88843xk extends AbstractC88853xl {
    public FileFilter A00;
    public Comparator A01;
    public final boolean A02;

    public AbstractC88843xk(File file, boolean z) {
        super(file);
        Comparator comparator;
        this.A02 = z;
        if (z) {
            comparator = C88793xf.A04;
        } else {
            comparator = C88793xf.A05;
        }
        this.A01 = comparator;
    }
}
