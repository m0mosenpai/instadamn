package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.URr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66653URr extends C0T6 implements XLW {
    public int A00;
    public int A01;
    public UQL A02;
    public C66630UPs A03;
    public C66629UPr A04;
    public C66619UPg A05;
    public VE9 A06;
    public VEH A07;
    public String A08;
    public List A09;
    public final String A0A;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66653URr() {
        /*
            r13 = this;
            r1 = 0
            r10 = 0
            r12 = 1023(0x3ff, float:1.434E-42)
            r0 = r13
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r11 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66653URr.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66653URr) {
                C66653URr c66653URr = (C66653URr) obj;
                if (!C14360o3.A0K(this.A08, c66653URr.A08) || this.A07 != c66653URr.A07 || !C14360o3.A0K(this.A04, c66653URr.A04) || !C14360o3.A0K(this.A03, c66653URr.A03) || !C14360o3.A0K(this.A02, c66653URr.A02) || this.A00 != c66653URr.A00 || this.A06 != c66653URr.A06 || !C14360o3.A0K(this.A05, c66653URr.A05) || !C14360o3.A0K(this.A09, c66653URr.A09) || this.A01 != c66653URr.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XLW
    public final C66630UPs AzN() {
        return this.A03;
    }

    @Override // X.XLW
    public final C66629UPr AzV() {
        return this.A04;
    }

    @Override // X.XLW
    public final int Bss() {
        return this.A00;
    }

    @Override // X.XLW
    public final VEH C0n() {
        return this.A07;
    }

    @Override // X.XLW
    public final UQL C8W() {
        return this.A02;
    }

    @Override // X.XLW
    public final String CEI() {
        return this.A08;
    }

    @Override // X.XBS
    public final String getTypeName() {
        return this.A0A;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((AbstractC166997dE.A0J(this.A07, this.A08.hashCode() * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31;
        UQL uql = this.A02;
        if (uql != null) {
            i = uql.hashCode();
        }
        return AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A06, (((A0J + i) * 31) + this.A00) * 31))) + this.A01;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.UPg, java.lang.Object] */
    public /* synthetic */ C66653URr(UQL uql, C66630UPs c66630UPs, C66629UPr c66629UPr, C66619UPg c66619UPg, VE9 ve9, VEH veh, String str, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3) {
        String A0j = AbstractC167017dG.A0j();
        VEH veh2 = VEH.A1d;
        VE9 ve92 = VE9.A0F;
        ?? obj = new Object();
        obj.A0M = null;
        obj.A04 = null;
        obj.A0p = false;
        obj.A0N = null;
        obj.A0O = null;
        obj.A0G = null;
        obj.A0H = null;
        obj.A0P = null;
        obj.A0m = null;
        obj.A00 = null;
        obj.A0Q = null;
        obj.A0R = null;
        obj.A0S = "";
        obj.A0T = null;
        obj.A0U = null;
        obj.A0V = null;
        obj.A0I = null;
        obj.A0W = null;
        obj.A0n = null;
        obj.A0J = null;
        obj.A0X = null;
        obj.A0Y = null;
        obj.A05 = null;
        obj.A06 = null;
        obj.A0o = null;
        obj.A0Z = "";
        obj.A01 = null;
        obj.A0a = null;
        obj.A07 = null;
        obj.A08 = null;
        obj.A09 = null;
        obj.A0q = false;
        obj.A0A = null;
        obj.A0B = null;
        obj.A0C = null;
        obj.A0b = null;
        obj.A03 = null;
        obj.A0c = null;
        obj.A0K = null;
        obj.A0D = null;
        obj.A0d = "";
        obj.A0e = null;
        obj.A0f = null;
        obj.A0g = null;
        obj.A0E = null;
        obj.A0r = false;
        obj.A0h = "";
        obj.A02 = null;
        obj.A0F = null;
        obj.A0i = null;
        obj.A0j = null;
        obj.A0k = null;
        obj.A0L = null;
        obj.A0l = null;
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 9);
        this.A08 = A0j;
        this.A07 = veh2;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A06 = ve92;
        this.A05 = obj;
        this.A09 = c16930sl;
        this.A01 = 0;
        this.A0A = "media_lyrics_sticker";
    }

    @Override // X.XLW
    public final void ETS(C66630UPs c66630UPs) {
        this.A03 = c66630UPs;
    }

    @Override // X.XLW
    public final void ETU(C66629UPr c66629UPr) {
        this.A04 = c66629UPr;
    }

    @Override // X.XLW
    public final void EdX(int i) {
        this.A00 = i;
    }

    @Override // X.XLW
    public final void Efq(UQL uql) {
        this.A02 = uql;
    }
}