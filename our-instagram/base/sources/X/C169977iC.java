package X;

/* renamed from: X.7iC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169977iC extends AbstractRunnableC51502Xx {
    public int A00 = -1;
    public String A01;
    public boolean A02;
    public final C2VY A03;
    public final /* synthetic */ C169917i6 A04;

    @Override // X.AbstractRunnableC51502Xx
    public final void A00() {
        synchronized (this) {
            if (!this.A02) {
                return;
            }
            int i = this.A00;
            String str = this.A01;
            this.A00 = -1;
            this.A01 = null;
            this.A02 = false;
            try {
                C169917i6.A0G(this.A04, str, i);
            } catch (IndexOutOfBoundsException e) {
                C169917i6 c169917i6 = this.A04;
                throw C169917i6.A03(c169917i6.A02, c169917i6, e);
            }
        }
    }

    public final synchronized void A01() {
        if (this.A02) {
            this.A02 = false;
            this.A00 = -1;
            this.A01 = null;
            ((C2VX) this.A03).removeCallbacks(this);
        }
    }

    public final synchronized void A02(String str, int i) {
        if (!this.A02) {
            this.A02 = true;
            Throwable th = super.A00;
            if (th != null) {
                th.fillInStackTrace();
            }
            ((C2VX) this.A03).post(this);
            this.A00 = i;
            this.A01 = str;
        }
    }

    public C169977iC(C169917i6 c169917i6, C2VY c2vy) {
        this.A04 = c169917i6;
        this.A03 = c2vy;
    }
}
