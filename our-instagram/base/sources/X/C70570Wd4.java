package X;

/* renamed from: X.Wd4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70570Wd4 implements YOy {
    public final /* synthetic */ C106724rU A00;
    public final /* synthetic */ C106744rW A01;
    public final /* synthetic */ String A02;

    public C70570Wd4(C106724rU c106724rU, C106744rW c106744rW, String str) {
        this.A01 = c106744rW;
        this.A02 = str;
        this.A00 = c106724rU;
    }

    @Override // X.YOy
    public final void DNH(C69479Vo2 c69479Vo2) {
        C106744rW c106744rW = this.A01;
        c106744rW.A05.put(this.A02, c69479Vo2);
        c106744rW.A08.add(c69479Vo2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.Vo2] */
    @Override // X.YOy
    public final void DNg() {
        long j;
        EnumC46372Az enumC46372Az = EnumC46372Az.UNKNOWN;
        try {
            String str = this.A00.A0D;
            if (str != null) {
                enumC46372Az = EnumC46372Az.valueOf(str);
            }
        } catch (IllegalArgumentException | NullPointerException unused) {
        }
        C106724rU c106724rU = this.A00;
        long j2 = c106724rU.A08;
        String str2 = c106724rU.A0B;
        String str3 = c106724rU.A0E;
        String obj = enumC46372Az.toString();
        long j3 = c106724rU.A05;
        long j4 = j3 + c106724rU.A02;
        boolean A1X = AbstractC167007dF.A1X(enumC46372Az, EnumC46372Az.PREFETCH);
        long j5 = j4 - j3;
        EnumC68203VFv enumC68203VFv = EnumC68203VFv.A07;
        if (!A1X) {
            j = j2;
        } else {
            j = -1;
        }
        boolean z = !A1X;
        ?? obj2 = new Object();
        obj2.A04 = j2;
        obj2.A0B = str2;
        obj2.A0C = null;
        obj2.A03 = j;
        obj2.A05 = j;
        obj2.A0D = str3;
        obj2.A0A = obj;
        obj2.A08 = enumC68203VFv;
        obj2.A06 = j3;
        obj2.A01 = j4;
        obj2.A00 = z ? 1 : 0;
        obj2.A07 = j5;
        obj2.A09 = null;
        obj2.A0G = z;
        obj2.A0E = null;
        C106744rW.A01(this.A01, obj2, this.A02);
    }
}
