package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* renamed from: X.AaE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23441AaE implements InterfaceC174807qG, YRH {
    public Integer A00;
    public final /* synthetic */ C184748Hp A01;

    public C23441AaE(C184748Hp c184748Hp) {
        this.A01 = c184748Hp;
    }

    @Override // X.YPG
    public final void D2J(AbstractC223559ty abstractC223559ty) {
        Integer num = this.A00;
        C184748Hp c184748Hp = this.A01;
        AbstractC226409yx.A00(c184748Hp.A07, C1810981l.A02(c184748Hp.A09), abstractC223559ty, num);
    }

    @Override // X.YPG
    public final void D2M() {
        this.A01.A0C.A06();
    }

    @Override // X.YRH
    public final void D2Q(Bitmap bitmap, String str) {
        C184748Hp.A00(bitmap, this, this.A01, this.A00);
    }

    @Override // X.YPG
    public final void D2R() {
        int A02 = AbstractC178387wC.A02(17);
        C184748Hp c184748Hp = this.A01;
        UserSession userSession = c184748Hp.A07;
        AbstractC189688an.A02(userSession, C1810981l.A02(c184748Hp.A09), AbstractC166997dE.A0t(userSession), null, A02);
        Integer num = null;
        try {
            C174757qB c174757qB = c184748Hp.A0B.A06;
            if (c174757qB != null) {
                num = Integer.valueOf(c174757qB.A07());
            }
        } catch (C6M2 unused) {
        }
        this.A00 = num;
    }

    @Override // X.InterfaceC174807qG
    public final void Dal() {
        C174757qB c174757qB = this.A01.A0B.A06;
        if (c174757qB != null) {
            c174757qB.A0H(this);
        }
    }
}
