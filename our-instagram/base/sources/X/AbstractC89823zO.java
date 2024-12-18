package X;

import java.util.ArrayList;

/* renamed from: X.3zO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC89823zO extends AbstractC51432Xq {
    public C89833zP A00;
    public C89843zQ A01;
    public InterfaceC89863zS A03;
    public InterfaceC89863zS A04;
    public C2VA A05;
    public ArrayList A06 = new ArrayList();
    public InterfaceC89793zL A02 = AbstractC51432Xq.A01;

    public final void A00() {
        C89843zQ c89843zQ = this.A01;
        if (c89843zQ != null) {
            this.A06.add(new C89883zU(new C89873zT(this.A00, c89843zQ), this.A02, this.A03, this.A04, this.A05));
            this.A01 = null;
            this.A02 = AbstractC51432Xq.A01;
            this.A03 = null;
            this.A04 = null;
            this.A05 = null;
        }
    }
}
