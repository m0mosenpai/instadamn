package X;

import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.UsL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67600UsL extends AbstractC53642Nnn {
    public final /* synthetic */ C7CH A00;
    public final /* synthetic */ DirectShareTarget A01;
    public final /* synthetic */ String A02;

    public C67600UsL(C7CH c7ch, DirectShareTarget directShareTarget, String str) {
        this.A00 = c7ch;
        this.A02 = str;
        this.A01 = directShareTarget;
    }

    @Override // X.AbstractC53642Nnn
    public final void A00() {
        C7CH c7ch = this.A00;
        C23031Ai c23031Ai = c7ch.A04;
        AbstractC167007dF.A1L(c23031Ai, c23031Ai.A3n, C23031Ai.A8c, 206, true);
        C7CH.A00(c7ch, this.A01, this.A02);
    }
}
