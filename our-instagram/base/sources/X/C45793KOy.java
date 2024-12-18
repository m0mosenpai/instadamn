package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.KOy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45793KOy extends AbstractC45802KPh {
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveRestoreFlowFragment";
    public IgdsBottomButtonLayout A00;
    public InterfaceC16820sZ A01 = C50247MHc.A01(this, 28);
    public boolean A02;
    public boolean A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "encrypted_backups_gdrive_restore_flow";
    }

    @Override // X.AbstractC45802KPh, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C44462JlU c44462JlU = (C44462JlU) this.A05.getValue();
        boolean A1Z = AbstractC167007dF.A1Z(this.A06);
        Integer A01 = LLQ.A01(this);
        KPU kpu = c44462JlU.A03;
        if (A1Z) {
            str = "DB_DROP";
        } else {
            str = "NORMAL_RESTORE";
        }
        KPU.A00(kpu, str);
        kpu.A05("RESTORE_LANDING_NUX_IMPRESSION");
        kpu.A06("INTERVAL", AbstractC167017dG.A0K(A01));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 46), C07Y.A00(viewLifecycleOwner));
    }

    public C45793KOy() {
        C50247MHc A01 = C50247MHc.A01(this, 27);
        C50247MHc A012 = C50247MHc.A01(this, 24);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C50247MHc.A00(A012, enumC09460dv, 25);
        this.A05 = AbstractC25225BEi.A0a(C50247MHc.A01(A00, 26), A01, new C50172MDz(3, null, A00), AbstractC25225BEi.A1D(C44462JlU.class));
        this.A06 = C1XM.A00(C50247MHc.A01(this, 29));
        this.A04 = C50247MHc.A00(this, enumC09460dv, 19);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-282853501);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_eb_gdrive_restore_flow_layout, viewGroup, false);
        IgdsHeadline A0g = AbstractC43594JPz.A0g(inflate);
        A0g.setHeadline(2131961239);
        A0g.setBody(2131961243);
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(inflate, R.id.bottom_buttons);
        this.A00 = A0j;
        if (A0j != null) {
            KCM.A07(A0j, this, 31);
        }
        C0f9.A09(303039783, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1854039167);
        this.A00 = null;
        super.onDestroyView();
        C0f9.A09(-323504165, A02);
    }
}
