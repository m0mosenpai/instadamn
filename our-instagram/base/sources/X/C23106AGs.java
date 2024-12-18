package X;

import java.io.File;
import java.io.FileDescriptor;

/* renamed from: X.AGs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23106AGs {
    public final int A00;
    public final C23106AGs A01;
    public final File A02;
    public final FileDescriptor A03;
    public final String A04;
    public final boolean A05;
    public static final C22826A4v A07 = new C22826A4v(0);
    public static final C22826A4v A08 = new C22826A4v(1);
    public static final C22826A4v A09 = new C22826A4v(2);
    public static final C22826A4v A0B = new C22826A4v(3);
    public static final C22826A4v A06 = new C22826A4v(4);
    public static final C22826A4v A0C = new C22826A4v(5);
    public static final C22826A4v A0A = new C22826A4v(6);

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final Object A00(C22826A4v c22826A4v) {
        boolean z;
        switch (c22826A4v.A00) {
            case 0:
                return this.A02;
            case 1:
                return this.A03;
            case 2:
                return this.A04;
            case 3:
                z = this.A05;
                return Boolean.valueOf(z);
            case 4:
                return this.A01;
            case 5:
                return Integer.valueOf(this.A00);
            default:
                z = false;
                return Boolean.valueOf(z);
        }
    }

    public C23106AGs(C22982ABh c22982ABh) {
        File file = c22982ABh.A02;
        if (file == null && c22982ABh.A04 == null && c22982ABh.A03 == null) {
            throw AbstractC166987dD.A12("A video output destination must be specified");
        }
        this.A02 = file;
        this.A03 = c22982ABh.A03;
        this.A04 = c22982ABh.A04;
        this.A05 = c22982ABh.A05;
        this.A01 = c22982ABh.A01;
        this.A00 = c22982ABh.A00;
    }
}
