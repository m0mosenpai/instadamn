package X;

import android.util.SparseArray;

/* renamed from: X.Twf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65934Twf {
    public final C68396VPe A02;
    public final C68397VPf A03;
    public final SparseArray A01 = new SparseArray();
    public final SparseArray A00 = new SparseArray();

    public C65934Twf(C68396VPe c68396VPe, C68397VPf c68397VPf) {
        this.A03 = c68397VPf;
        this.A02 = c68396VPe;
    }

    public static final C59062n7 A00(C65934Twf c65934Twf, C6FG c6fg, int i) {
        C59072n8 A00 = C59062n7.A00(null, null, String.valueOf(i));
        A00.A00(new C65906TwC(new C65935Twg(c65934Twf, i), new C65936Twh(AbstractC131665x2.A00(c6fg)), c6fg));
        return A00.A01();
    }
}
