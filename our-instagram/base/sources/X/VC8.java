package X;

import android.os.Bundle;

/* loaded from: classes11.dex */
public final class VC8 extends AbstractC67881V0m {
    public static final String __redex_internal_original_name = "ReelShoutOutShareFragment";
    public C22P A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_shout_out_share_fragment";
    }

    @Override // X.AbstractC67881V0m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A02 = C0f9.A02(-465504342);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("ReelShoutOutConstants.ARG_SHOUTOUT_USERNAME");
        if (string != null) {
            this.A03 = string;
            String string2 = requireArguments.getString("ReelShoutOutConstants.ARG_SHOUTOUT_HEADER_TITLE");
            if (string2 == null) {
                string2 = "";
            }
            this.A02 = string2;
            String string3 = requireArguments.getString("ReelShoutOutConstants.ARG_SHOUTOUT_BACKGROUND_FILE");
            if (string3 != null) {
                this.A01 = string3;
                this.A04 = requireArguments.getBoolean("ReelShoutOutConstants.ARG_SHOW_TOOL_TIP", false);
                this.A00 = AbstractC167027dH.A0D(requireArguments, "ReelShoutOutConstants.ARG_ENTRY_POINT");
                C0f9.A09(-1219981783, A02);
                return;
            }
            illegalStateException = new IllegalStateException("Required value was null.");
            i = 1680873172;
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -1801564352;
        }
        C0f9.A09(i, A02);
        throw illegalStateException;
    }
}
