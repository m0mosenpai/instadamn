package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FvB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36013FvB implements InterfaceC11380iw, InterfaceC37185GZw {
    public static final String __redex_internal_original_name = "VideoCallArEffectUrlHandler";

    @Override // X.InterfaceC37185GZw
    public final boolean EJT() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.InterfaceC37185GZw
    public final void CJ9(Bundle bundle, FragmentActivity fragmentActivity, AbstractC18680vv abstractC18680vv) {
        AbstractC167027dH.A12(bundle, fragmentActivity, abstractC18680vv);
        UserSession A00 = AbstractC03270Dk.A00(abstractC18680vv);
        AbstractC35047FcK.A00(AbstractC25225BEi.A0F(A00), this, A00, bundle.getString("effect_id_key"), bundle.getString("ch_key"), bundle.getString("revisionID_key"));
        fragmentActivity.finish();
    }

    @Override // X.InterfaceC37185GZw
    public final /* bridge */ /* synthetic */ Bundle AFg(AbstractC18680vv abstractC18680vv, String str) {
        return null;
    }
}
