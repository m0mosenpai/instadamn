package X;

import com.instagram.business.promote.model.PromoteState;

/* renamed from: X.Wdn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70609Wdn implements MOA {
    public final /* synthetic */ V11 A00;

    public C70609Wdn(V11 v11) {
        this.A00 = v11;
    }

    @Override // X.MOA
    public final void Cxn(String str) {
        V11 v11 = this.A00;
        InterfaceC09390do interfaceC09390do = v11.A0L;
        ((PromoteState) interfaceC09390do.getValue()).A0C(false);
        ((PromoteState) interfaceC09390do.getValue()).A09(V11.A00(v11), str);
    }
}
