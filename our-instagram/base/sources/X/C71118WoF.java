package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* renamed from: X.WoF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71118WoF implements InterfaceC72015XFd {
    public C69427VnC A01;
    public Object A02;
    public final Stack A04 = new Stack();
    public List A03 = new ArrayList();
    public int A00 = -1;

    @Override // X.InterfaceC72015XFd
    public final VBX AAy(Object obj) {
        C69427VnC c69427VnC;
        C69427VnC c69427VnC2;
        C69427VnC c69427VnC3 = this.A01;
        if (c69427VnC3 != null) {
            obj = c69427VnC3.A03.DV9(c69427VnC3, c69427VnC3.A05.F8H(c69427VnC3, obj), 1);
        }
        C69427VnC c69427VnC4 = null;
        if (!AbstractC43593JPy.A1Z(this.A00, this.A03.size())) {
            int i = this.A00;
            while (true) {
                i++;
                if (i < this.A03.size()) {
                    c69427VnC2 = (C69427VnC) this.A03.get(i);
                } else {
                    c69427VnC2 = null;
                }
                if (i >= this.A03.size() || (c69427VnC2 != null && c69427VnC2.A01.D2q(c69427VnC2, obj))) {
                    break;
                }
            }
            c69427VnC4 = c69427VnC2;
        }
        int i2 = this.A00;
        if (i2 != -1 && (c69427VnC = this.A01) != null && !c69427VnC.A06) {
            this.A04.push(Integer.valueOf(i2));
        }
        this.A01 = c69427VnC4;
        this.A00 = this.A03.indexOf(c69427VnC4);
        C69427VnC c69427VnC5 = this.A01;
        if (c69427VnC5 != null) {
            if (c69427VnC3 != null && !c69427VnC3.A06) {
                c69427VnC5.A04 = c69427VnC3;
            }
            this.A02 = c69427VnC5.A02.DV9(c69427VnC5, obj, 1);
        }
        return new VBX(this, c69427VnC3, c69427VnC4, 0);
    }
}
