package X;

/* renamed from: X.314, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass314 implements AnonymousClass315 {
    public int A00 = 0;
    public int A05 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A06 = 0;
    public int A07 = 0;
    public int A01 = 0;
    public int A02 = 0;

    @Override // X.AnonymousClass315
    public final C3ZA By3() {
        return new C3ZA(this.A00, this.A05, this.A03, this.A04);
    }

    @Override // X.AnonymousClass315
    public final void CNC(int i, Integer num) {
        if (num == C05F.A0C) {
            this.A00 += i;
        } else {
            if (num != C05F.A0N) {
                return;
            }
            this.A05 += i;
        }
    }

    @Override // X.AnonymousClass315
    public final void CND(Integer num) {
        if (num == C05F.A0C) {
            this.A01++;
        } else if (num == C05F.A0N) {
            this.A02++;
        }
        CNC(1, num);
    }

    @Override // X.AnonymousClass315
    public final void CNE(Integer num) {
        if (num == C05F.A0C) {
            this.A03++;
        } else {
            if (num != C05F.A0N) {
                return;
            }
            this.A04++;
        }
    }

    @Override // X.AnonymousClass315
    public final void Dgp() {
        this.A00 = this.A06;
        this.A05 = this.A07;
        this.A01 = 0;
        this.A02 = 0;
    }

    @Override // X.AnonymousClass315
    public final void Dr4(boolean z) {
        this.A06 = this.A00;
        this.A07 = this.A05;
        this.A00 = 0;
        this.A05 = 0;
        this.A03 = 0;
        this.A04 = 0;
    }
}
