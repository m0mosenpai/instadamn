package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BrB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26730BrB extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PotatoReplyBottomSheetFragment";
    public final String A00;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A03 = C1XM.A00(new DGZ(this, 46));
    public final InterfaceC09390do A01 = C1XM.A00(new DGZ(this, 37));

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object value;
        C26060Bfn c26060Bfn;
        String A3D;
        long A1B;
        boolean A1T;
        String str;
        String str2;
        Integer num;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 12), C07Y.A00(viewLifecycleOwner));
        C25850Bc5 c25850Bc5 = (C25850Bc5) this.A04.getValue();
        Context requireContext = requireContext();
        HYF hyf = c25850Bc5.A01;
        String str3 = c25850Bc5.A02;
        C14360o3.A0B(str3, 0);
        C38321qM A0h = AbstractC25229BEm.A0h(hyf.A01, str3);
        if (A0h != null) {
            EnumC77173d3 A0L = C57532kS.A00(c25850Bc5.A00).A0L(A0h);
            C05A c05a = c25850Bc5.A06;
            do {
                value = c05a.getValue();
                c26060Bfn = (C26060Bfn) value;
                A3D = A0h.A3D(requireContext);
                if (A3D == null) {
                    A3D = "";
                }
                A1B = A0h.A1B();
                A1T = AbstractC167007dF.A1T(A0h.A0C.Aki());
                str = c26060Bfn.A05;
                str2 = c26060Bfn.A06;
                num = c26060Bfn.A03;
            } while (!c05a.AIi(value, C26060Bfn.A00(c26060Bfn.A01, A0L, num, str, str2, A3D, c26060Bfn.A07, A1B, c26060Bfn.A08, A1T)));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C26730BrB() {
        DGZ dgz = new DGZ(this, 47);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGZ(new DGZ(this, 43), 44));
        this.A04 = AbstractC25225BEi.A0a(new DGZ(A00, 45), dgz, new C57255Pbd(39, null, A00), AbstractC25225BEi.A1D(C25850Bc5.class));
        this.A02 = AbstractC60492pY.A02(this);
        this.A00 = "potato_reply_bottom_sheet_fragment";
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1656141477);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 11), -2098047050);
        C0f9.A09(195199876, A02);
        return A00;
    }
}
