package X;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.JaD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43849JaD extends AbstractC43842Ja5 {
    public static final String __redex_internal_original_name = "FolderPickerFragment";
    public InterfaceC16620sF A00;
    public final Map A02 = AbstractC166987dD.A1I();
    public final C2GS A01 = new C2GS();
    public final C43850JaE A04 = new C43850JaE(this);
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "gallery_folder_picker_bottomsheet_fragment";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        List list = (List) this.A01.A02();
        if (list == null) {
            list = C16930sl.A00;
        }
        A0B(list);
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new C50260MHp(this, 36));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new C45633KHw(requireContext(), this.A04));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1795069118);
        super.onCreate(bundle);
        AbstractC43593JPy.A1E(this, this.A01, new C50260MHp(this, 37), 15);
        C0f9.A09(-464491545, A02);
    }
}
