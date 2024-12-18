package X;

import java.util.Arrays;

/* renamed from: X.0lQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12780lQ extends AbstractC20480zP {
    public final C20530zV A00;
    public final C13010ln A01;
    public final C13010ln A02;
    public final C12790lR A03;
    public final C12740lL A04;

    public C12780lQ(C20530zV c20530zV, C12740lL c12740lL, int i, int i2, int i3) {
        super(i3);
        this.A01 = new C13010ln(this);
        this.A02 = new C13010ln(this);
        this.A00 = c20530zV;
        this.A04 = c12740lL;
        this.A03 = new C12790lR(this, i, i2);
        A01();
    }

    @Override // X.AbstractC20480zP
    public final void A01() {
        super.A01();
        C12790lR c12790lR = this.A03;
        int i = 0;
        while (true) {
            C12800lS[] c12800lSArr = c12790lR.A00;
            if (i < c12800lSArr.length) {
                Arrays.fill(((AbstractC20500zR) c12800lSArr[i]).A00, (short) 1024);
                i++;
            } else {
                this.A01.A00();
                this.A02.A00();
                return;
            }
        }
    }
}
