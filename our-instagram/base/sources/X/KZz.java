package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.arlink.fragment.NametagController;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class KZz extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "DownloadOptionsBottomSheetFragment";
    public NametagController A00;
    public boolean A01;
    public final InterfaceC09390do A02 = C1XM.A00(new C50162MDp(this, 24));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "NametagDownloadOptionsBottomSheetFragment";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC31172DnG.A1B(view.getContext(), view, AbstractC53242c7.A02(getContext()));
        InterfaceC09390do interfaceC09390do = this.A02;
        C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
        this.A01 = AbstractC167017dG.A1b(A0l, A0l.A1z, C23031Ai.A8c, 100);
        ArrayList A1E = AbstractC166987dD.A1E();
        C35246Fgf c35246Fgf = new C35246Fgf(2131961149);
        c35246Fgf.A06 = true;
        c35246Fgf.A01 = R.style.igds_emphasized_title;
        A1E.add(c35246Fgf);
        A1E.add(new C35119FeM(true));
        AbstractC25235BEs.A1C(AbstractC31173DnH.A07(this, new C36731GHa(new LRE(this, 2), 2131961145, this.A01), A1E), LQ0.A01(this, 49), A1E, 2131961148);
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36314837548862301L)) {
            AbstractC25235BEs.A1C(requireContext(), LQ0.A01(this, 50), A1E, 2131961144);
        }
        setBottomSheetMenuItems(A1E);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(861535965);
        super.onCreate(bundle);
        C0f9.A09(2058053916, A02);
    }
}
