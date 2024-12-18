package X;

import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class WD7 {
    public static final HashBiMap A08;
    public static final HashBiMap A09;
    public C51751Mta A00;
    public AbstractC69781VvI A01;
    public int A03;
    public final C68314VMa A06;
    public final String A07;
    public final Object A04 = new Object();
    public C66624UPm A02 = new C66624UPm(0.0d, 10, 0);
    public final HashMap A05 = new HashMap();

    public static final void A00(WD7 wd7, double d, int i, int i2) {
        ImmutableList copyOf;
        synchronized (wd7.A04) {
            C66624UPm c66624UPm = wd7.A02;
            int i3 = c66624UPm.A02;
            if ((i3 == 12 || i3 == 32) && AbstractC009903n.A0P(new int[]{20, 21, 22, 23, 24, 25, 30, 31, 32}, i)) {
                C0K8.A0D(AbstractC31173DnH.A0q(wd7), AnonymousClass001.A02(c66624UPm.A02, i, "Skipping invalid state transition. Current state: ", ". New state: "));
            } else if (i != c66624UPm.A02 || d != c66624UPm.A00) {
                wd7.A02 = new C66624UPm(d, i, i2);
                HashMap hashMap = wd7.A05;
                synchronized (hashMap) {
                    copyOf = ImmutableList.copyOf(hashMap.values());
                }
                C1LC A0I = AbstractC43592JPx.A0I(copyOf);
                while (A0I.hasNext()) {
                    ((X9I) A0I.next()).Dx3(i, i2, wd7.A07, d);
                }
                if (i == 32) {
                    A00(wd7, d, 12, i2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[Catch: all -> 0x008d, TryCatch #1 {, blocks: (B:6:0x0016, B:22:0x001b, B:28:0x0031, B:30:0x0039, B:31:0x0079, B:33:0x007f, B:34:0x0086, B:36:0x0058, B:37:0x0065, B:39:0x006d, B:40:0x0046, B:42:0x004e), top: B:5:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(X.X9I r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WD7.A01(X.X9I):int");
    }

    static {
        HashBiMap A00 = HashBiMap.A00();
        A09 = A00;
        HashBiMap A002 = HashBiMap.A00();
        A08 = A002;
        A00.putAll(AbstractC06930Yk.A06(AbstractC167007dF.A0o(VDE.A08, 20), AbstractC167007dF.A0o(VDE.A0D, 21), AbstractC167007dF.A0o(VDE.A07, 22), AbstractC167007dF.A0o(VDE.A03, 23), AbstractC167007dF.A0o(VDE.A0B, 24), AbstractC167007dF.A0o(VDE.A04, 25), AbstractC167007dF.A0o(VDE.A0A, 30), AbstractC167007dF.A0o(VDE.A06, 31), AbstractC167007dF.A0o(VDE.A0C, 32), AbstractC167007dF.A0o(VDE.A0E, 26)));
        A002.putAll(AbstractC25232BEp.A1F(EnumC68128VCm.A03, 3, AbstractC167007dF.A0o(EnumC68128VCm.A04, 1), AbstractC167007dF.A0o(EnumC68128VCm.A02, 2)));
    }

    public WD7(C68314VMa c68314VMa, String str) {
        this.A07 = str;
        this.A06 = c68314VMa;
    }
}
