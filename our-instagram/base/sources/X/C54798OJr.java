package X;

import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.OJr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54798OJr {
    public double A00;
    public double A01;
    public C53416Nk5 A02;
    public C47Z A03;
    public File A04;
    public File A05;
    public AtomicBoolean A06;
    public final C38321qM A07;
    public final File A08;
    public final java.util.Set A09;
    public final C54309NzT A0A;

    public final void A00(double d) {
        C53416Nk5 c53416Nk5 = this.A02;
        if (C53416Nk5.A00(c53416Nk5) < d) {
            c53416Nk5.A00.set(Double.doubleToRawLongBits(d));
            Iterator it = this.A09.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("onDownloadingProgressChanged");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Number, X.Nk5] */
    public C54798OJr(C38321qM c38321qM, C54309NzT c54309NzT, File file) {
        MSZ.A1O(c38321qM, c54309NzT);
        this.A07 = c38321qM;
        this.A08 = file;
        this.A0A = c54309NzT;
        this.A00 = 100.0d;
        this.A01 = 75.0d;
        this.A00 = 25.0d;
        this.A06 = AbstractC166997dE.A17();
        ?? number = new Number();
        number.A00 = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.A02 = number;
        java.util.Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C14360o3.A07(newSetFromMap);
        this.A09 = newSetFromMap;
    }
}
