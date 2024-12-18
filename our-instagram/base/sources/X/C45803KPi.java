package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.KPi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45803KPi extends KCM {
    public static final /* synthetic */ C0YR[] A05 = {new AnonymousClass019(C45803KPi.class, "actionBar", "getActionBar()Lcom/instagram/actionbar/ActionBarService;", 0), new AnonymousClass019(C45803KPi.class, "bottomButtons", "getBottomButtons()Lcom/instagram/igds/components/bottombutton/IgdsBottomButtonLayout;", 0), new AnonymousClass019(C45803KPi.class, "codeText", "getCodeText()Landroid/widget/TextView;", 0)};
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeDisplayCodeFragment";
    public final KFH A02;
    public final KFH A03;
    public final InterfaceC09390do A04;
    public final KFH A01 = KCM.A03(this, 47);
    public InterfaceC16820sZ A00 = new MHP(this, 4);

    @Override // X.KCM, X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        super.configureActionBar(interfaceC56362iU);
        interfaceC56362iU.ARc(true);
        interfaceC56362iU.setIsLoading(false);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        KCM.A07((C64P) AbstractC31469DsD.A00(this.A02), this, 49);
        InterfaceC09390do interfaceC09390do = this.A04;
        AbstractC43593JPy.A1E(this, ((C44525JmV) interfaceC09390do.getValue()).A01, new MM0(this, 35), 27);
        ((C44525JmV) interfaceC09390do.getValue()).A00();
        C44525JmV c44525JmV = (C44525JmV) interfaceC09390do.getValue();
        Integer A02 = LLQ.A02(this);
        C14360o3.A0B(A02, 0);
        KPC kpc = c44525JmV.A03;
        kpc.A05("OTC_DISPLAY_CODE_IMPRESSION");
        kpc.A07("ENTRY_POINT", AbstractC46735Kls.A00(A02));
        JQ0.A11(this, new PYw(this, null, 28), ((C44525JmV) interfaceC09390do.getValue()).A05);
    }

    public C45803KPi() {
        MHP mhp = new MHP(this, 3);
        InterfaceC09390do A00 = MHP.A00(new MHP(this, 0), EnumC09460dv.A02, 1);
        this.A04 = AbstractC25225BEi.A0a(new MHP(A00, 2), mhp, new C50172MDz(8, null, A00), AbstractC25225BEi.A1D(C44525JmV.class));
        this.A02 = KCM.A03(this, 48);
        this.A03 = KCM.A03(this, 49);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-251783473);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_display_code_fragment, viewGroup, false);
        C0f9.A09(-1813504545, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-408880972);
        super.onDestroy();
        ((C44525JmV) this.A04.getValue()).A03.A02();
        C0f9.A09(725724661, A02);
    }
}
