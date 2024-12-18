package X;

import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes6.dex */
public final class EZW extends AbstractRunnableC14200nk {
    public final /* synthetic */ C36303Fzy A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZW(C36303Fzy c36303Fzy) {
        super(660);
        this.A00 = c36303Fzy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC83713oG interfaceC83713oG;
        String str;
        C36303Fzy c36303Fzy = this.A00;
        if (c36303Fzy.A06 != null && c36303Fzy.A03 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c36303Fzy.A0C, "direct_inbox_search_dwell_30s");
            if (A0f.isSampled()) {
                AbstractC31173DnH.A1L(A0f, c36303Fzy.A06);
                AbstractC31175DnJ.A13(A0f, c36303Fzy.A00);
                A0f.AAk("recipient_ids", C36303Fzy.A02(c36303Fzy));
                AbstractC31171DnF.A1F(A0f, C36303Fzy.A01(c36303Fzy));
                if (c36303Fzy.A0G && !c36303Fzy.A08 && !c36303Fzy.A0A && (interfaceC83713oG = c36303Fzy.A04) != null) {
                    EnumC92794Ds A00 = AbstractC140946Yw.A00(interfaceC83713oG);
                    if (A00 != null) {
                        str = A00.A00;
                    } else {
                        str = null;
                    }
                    A0f.AAP(TraceFieldType.TransportType, str);
                }
                A0f.Cht();
            }
        }
    }
}
