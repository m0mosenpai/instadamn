package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Bql, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26704Bql extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "MEmuInFeedPrivacySettingsFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final String A01 = "memu_in_feed_privacy_settings";

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1257328478);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 15), -274570437);
        C0f9.A09(-361610759, A02);
        return A00;
    }
}
