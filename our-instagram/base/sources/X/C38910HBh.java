package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.HBh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38910HBh extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ShareToBroadcastChannelFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final String A05;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC33514Ern enumC33514Ern;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C36296Fzq A0b = AbstractC31172DnG.A0b(this.A00);
        String A15 = AbstractC25225BEi.A15(this.A01);
        C14360o3.A0B(A15, 0);
        A0b.A00 = AbstractC166997dE.A0n();
        if (A15.equals(AbstractC111324zv.A00(1005))) {
            enumC33514Ern = EnumC33514Ern.A0F;
        } else if (A15.equals("prodash_next_step")) {
            enumC33514Ern = EnumC33514Ern.A0M;
        } else {
            enumC33514Ern = EnumC33514Ern.A08;
        }
        C36296Fzq.A02(enumC33514Ern, EnumC33512Erl.THREAD_VIEW, A0b, "creator_share_ssc_to_bc_sheet_rendered", "view", null);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C38910HBh() {
        J7K j7k = new J7K(this, 30);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J7K(new J7K(this, 26), 27));
        this.A04 = AbstractC25225BEi.A0a(new J7K(A00, 28), j7k, new C50171MDy(45, null, A00), AbstractC25225BEi.A1D(C44481Jln.class));
        this.A03 = C1XM.A00(new J7K(this, 29));
        this.A01 = C1XM.A00(new J7K(this, 23));
        this.A00 = C1XM.A00(new J7K(this, 22));
        this.A02 = AbstractC60492pY.A02(this);
        this.A05 = __redex_internal_original_name;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1703513547);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30495Dbe(this, 38), 112471782);
        C0f9.A09(1943352129, A02);
        return A00;
    }
}
