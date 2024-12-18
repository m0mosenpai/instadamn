package X;

import android.os.Bundle;

/* renamed from: X.Hcr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39525Hcr extends HDB {
    public static final String __redex_internal_original_name = "ReelPollVotersListFragment";
    public int A00;

    @Override // X.InterfaceC37188GZz
    public final void Dit() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_poll_voters_list";
    }

    @Override // X.HDB, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(626231827);
        super.onCreate(bundle);
        this.A00 = requireArguments().getInt("ReelUserListFragment.POLL_OPTION_INDEX", -1);
        C0f9.A09(-1935099047, A02);
    }
}
