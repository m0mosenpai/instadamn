package X;

import android.os.Bundle;

/* renamed from: X.Hcs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39526Hcs extends HDB {
    public static final String __redex_internal_original_name = "ReelQuickReactorsListFragment";
    public String A00;
    public String A01;

    @Override // X.InterfaceC37188GZz
    public final void Dit() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_aggregated_quick_reactors_list";
    }

    @Override // X.HDB, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1247167018);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        ((HDB) this).A01 = AbstractC31176DnK.A0S(this);
        this.A00 = bundle2.getString("ReelQuickReactorsListFragment.ARGUMENTS_REACTION");
        this.A01 = bundle2.getString("ReelQuickReactorsListFragment.ARGUMENTS_REACTION_LABEL");
        this.A00.getClass();
        this.A01.getClass();
        C0f9.A09(590029502, A02);
    }
}
