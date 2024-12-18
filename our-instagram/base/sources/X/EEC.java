package X;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class EEC extends AbstractC32247EIg {
    public static final String __redex_internal_original_name = "AvatarQuickCaptureUpsellBottomSheetFragment";
    public C53O A00 = new C35909FtT(this, 2);
    public String A01;
    public String A02;
    public String A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("moduleName");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC32247EIg, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(2001237360);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_editor_logging_surface");
        if (string != null) {
            this.A02 = string;
            String string2 = requireArguments.getString("args_editor_logging_mechanism");
            if (string2 != null) {
                this.A01 = string2;
                String string3 = requireArguments.getString("args_previous_module_name");
                if (string3 != null) {
                    this.A03 = string3;
                    C0f9.A09(964652120, A02);
                    return;
                } else {
                    A14 = AbstractC166987dD.A14("module name required");
                    i = -2101357153;
                }
            } else {
                A14 = AbstractC166987dD.A14("editor logging mechanism required");
                i = 1693641293;
            }
        } else {
            A14 = AbstractC166987dD.A14("editor logging surface required");
            i = 1220605993;
        }
        C0f9.A09(i, A02);
        throw A14;
    }
}
