package X;

import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.MiK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51115MiK extends AbstractC155316yK {
    public static final C51090Mhp A02 = new C51090Mhp(1);
    public final InterfaceC11380iw A00;
    public final OH6 A01;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        switch (AbstractC25227BEk.A05(EnumC53172NfT.values()[i], 1)) {
            case 0:
                return new NOH(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_creatives_header, false));
            case 1:
                return new NOE(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_creatives_collapsable_section, false));
            case 2:
                return new NOD(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_creatives_incentives, false));
            case 3:
                return new NOC(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_creatives_collapsable_section, false));
            case 4:
                return new NOF(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_creatives_collapsable_section, false));
            case 5:
                return new NOG(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_creatives_collapsable_section, false));
            default:
                throw B4Z.A00();
        }
    }

    public C51115MiK(InterfaceC11380iw interfaceC11380iw, OH6 oh6) {
        super(A02);
        this.A00 = interfaceC11380iw;
        this.A01 = oh6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (((java.util.List) r9.A01).size() <= 2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        if (((java.util.List) r9.A01).size() <= 2) goto L39;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r12, int r13) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51115MiK.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(1886588025);
        int ordinal = ((InterfaceC57956Pn2) ((C51748MtX) getItem(i)).A01).CBf().ordinal();
        C0f9.A0A(816382675, A03);
        return ordinal;
    }
}
