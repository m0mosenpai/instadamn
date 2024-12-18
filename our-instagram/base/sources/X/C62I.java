package X;

/* renamed from: X.62I, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62I implements C62J {
    public final float A00;
    public final C62K A01;

    @Override // X.C62J
    public final float B2D(float f, float f2, float f3) {
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016b A[EDGE_INSN: B:90:0x016b->B:50:0x016b BREAK  A[LOOP:2: B:84:0x01f2->B:89:?], SYNTHETIC] */
    @Override // X.C62J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Azp(float r31, float r32, float r33) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62I.Azp(float, float, float):long");
    }

    @Override // X.C5Y6
    public final /* bridge */ /* synthetic */ C62F FDZ(InterfaceC118485Xk interfaceC118485Xk) {
        return new C62L(new C72068XMm(this));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.62K, java.lang.Object] */
    public C62I(float f, float f2, float f3) {
        this.A00 = f3;
        ?? obj = new Object();
        obj.A05 = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        obj.A03 = sqrt;
        obj.A04 = 1.0f;
        if (f >= 0.0f) {
            obj.A04 = f;
            obj.A06 = false;
            if (((float) (sqrt * sqrt)) > 0.0f) {
                obj.A03 = Math.sqrt(f2);
                obj.A06 = false;
                this.A01 = obj;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    @Override // X.C62J
    public final float CEX(float f, float f2, float f3, long j) {
        C62K c62k = this.A01;
        c62k.A05 = f2;
        return Float.intBitsToFloat((int) (c62k.A00(f, f3, j / 1000000) >> 32));
    }

    @Override // X.C62J
    public final float CEi(float f, float f2, float f3, long j) {
        C62K c62k = this.A01;
        c62k.A05 = f2;
        return Float.intBitsToFloat((int) (c62k.A00(f, f3, j / 1000000) & 4294967295L));
    }

    public C62I() {
        this(1.0f, 1500.0f, 0.01f);
    }
}
