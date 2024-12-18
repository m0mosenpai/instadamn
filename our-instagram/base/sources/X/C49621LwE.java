package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LwE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49621LwE implements InterfaceC1119153d {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ C7O6 A01;

    @Override // X.InterfaceC1119153d
    public final void Czx() {
    }

    public C49621LwE(AbstractC59962oe abstractC59962oe, C7O6 c7o6) {
        this.A01 = c7o6;
        this.A00 = abstractC59962oe;
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        C7O6 c7o6 = this.A01;
        UserSession userSession = c7o6.A01;
        AbstractC59962oe abstractC59962oe = this.A00;
        C46512KiB c46512KiB = c7o6.A02;
        String str = c46512KiB.A01;
        C14360o3.A07(str);
        String str2 = c46512KiB.A02;
        C14360o3.A07(str2);
        C14360o3.A0B(abstractC59962oe, 1);
        AbstractC31173DnH.A1S(C162337Ov.A01(abstractC59962oe, "list_dismiss", str, str2), userSession);
    }
}
