package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.GeP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37445GeP extends AbstractC61692rW implements InterfaceC60602pj {
    @Override // X.AbstractC61692rW
    public final boolean A0A(String str) {
        C14360o3.A0B(str, 0);
        if (!"feed_contextual_profile".equals(str) && !"feed_contextual_self_profile".equals(str) && !A00() && !"feed_contextual_ads_chain".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    private final boolean A00() {
        String str = this.A05;
        if (!"shopping_consumer_bau_ad_click_and_interaction_reminder".equals(str) && !"shopping_consumer_bau_ad_click_reminder".equals(str) && !"shopping_consumer_bau_ad_like_reminder".equals(str) && !"shopping_consumer_bau_ad_save_reminder".equals(str) && !"shopping_consumer_bau_ad_caption_expand_reminder".equals(str) && !"shopping_consumer_bau_ad_click_percentage_off".equals(str) && !"shopping_consumer_bau_ad_click_free_shipping".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC61692rW
    public final boolean A09(AnonymousClass341 anonymousClass341) {
        if (anonymousClass341 != AnonymousClass341.A0I && anonymousClass341 != AnonymousClass341.A02 && anonymousClass341 != AnonymousClass341.A0E) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
        if (!A00() && !"feed_contextual_ads_chain".equals(this.A05)) {
            A08(this.A00, true);
        }
    }
}
