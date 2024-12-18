package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.5E6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5E6 extends C5AY implements InterfaceC1129358c, InterfaceC1129458d {
    public AbstractC166097bd A00;
    public C166047bW A01;
    public UserSession A02;
    public InterfaceC60442pS A03;
    public List A04;
    public final BZn A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC43457JHv A08;

    public C5E6(AbstractC166097bd abstractC166097bd, C166047bW c166047bW, List list) {
        C14360o3.A0B(abstractC166097bd, 1);
        C14360o3.A0B(list, 3);
        this.A00 = abstractC166097bd;
        this.A01 = c166047bW;
        this.A04 = list;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C206879Ds(this, 40));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C206879Ds(this, 38));
        C29449CyP c29449CyP = new C29449CyP(this);
        this.A08 = c29449CyP;
        String A0R = AnonymousClass001.A0R("comment_list_prefix", this.A00.A00);
        BZn bZn = new BZn(c29449CyP, CMJ.A00, C05F.A0j, A0R, null);
        A0F(bZn);
        this.A05 = bZn;
    }

    @Override // X.InterfaceC1129358c
    public final void DWO() {
        AbstractC137676Lo.A00(this, new C206879Ds(this, 39));
    }
}
