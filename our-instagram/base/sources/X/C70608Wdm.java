package X;

import com.instagram.business.promote.model.PromoteState;

/* renamed from: X.Wdm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70608Wdm implements MOA {
    public final /* synthetic */ C69655Vsw A00;

    public C70608Wdm(C69655Vsw c69655Vsw) {
        this.A00 = c69655Vsw;
    }

    @Override // X.MOA
    public final void Cxn(String str) {
        C69655Vsw c69655Vsw = this.A00;
        PromoteState promoteState = c69655Vsw.A06;
        promoteState.A0C(false);
        promoteState.A09(c69655Vsw.A05, str);
    }
}
