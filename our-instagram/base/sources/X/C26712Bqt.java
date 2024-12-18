package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Bqt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26712Bqt extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FactsFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final String A04 = "creator_ai_settings_facts_fragment";

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C26712Bqt() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = DH6.A01(this, "creator_ai_add_fact_content_type", enumC09460dv, 41);
        this.A00 = DH6.A01(this, "creator_ai_creator_fbid", enumC09460dv, 42);
        this.A01 = DH6.A01(this, "creator_ai_entry_point_extra", enumC09460dv, 43);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1289698627);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 46), -1569354502);
        C0f9.A09(1368611822, A02);
        return A00;
    }
}
