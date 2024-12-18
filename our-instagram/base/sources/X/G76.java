package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class G76 implements InterfaceC37121GXg {
    public final /* synthetic */ C31446Drq A00;
    public final /* synthetic */ JR2 A01;
    public final /* synthetic */ DirectShareTarget A02;
    public final /* synthetic */ DirectThreadKey A03;
    public final /* synthetic */ String A04;

    public G76(C31446Drq c31446Drq, JR2 jr2, DirectShareTarget directShareTarget, DirectThreadKey directThreadKey, String str) {
        this.A01 = jr2;
        this.A03 = directThreadKey;
        this.A02 = directShareTarget;
        this.A04 = str;
        this.A00 = c31446Drq;
    }

    @Override // X.InterfaceC37121GXg
    public final void D7j() {
        JR2 jr2 = this.A01;
        DirectThreadKey directThreadKey = this.A03;
        JR2.A0G(this.A00, jr2, this.A02, directThreadKey, this.A04);
    }
}
