package X;

/* renamed from: X.6nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149396nq {
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public final C0JM A06;
    public final C149386np A07;

    public C149396nq(C0JM c0jm, C149386np c149386np) {
        C14360o3.A0B(c0jm, 1);
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A06 = c0jm;
        this.A07 = c149386np;
    }

    public final void A00(float f, float f2) {
        if (this.A05) {
            this.A05 = false;
            VBo vBo = this.A07.A00.A04;
            if (vBo != null) {
                vBo.A05(new C69253VkM(C05F.A0C, 1.0f, f / r1.A01, f2 / r1.A00));
            }
        }
    }
}
