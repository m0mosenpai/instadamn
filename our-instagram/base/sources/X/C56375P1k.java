package X;

import android.content.Context;
import com.instagram.debug.devoptions.plugins.DeveloperOptionsPlugin;

/* renamed from: X.P1k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56375P1k implements DeveloperOptionsPlugin.OnPinnedDevOptionInteraction {
    public final /* synthetic */ C52776NXh A00;
    public final /* synthetic */ AbstractC33235ElU A01;

    public C56375P1k(C52776NXh c52776NXh, AbstractC33235ElU abstractC33235ElU) {
        this.A01 = abstractC33235ElU;
        this.A00 = c52776NXh;
    }

    @Override // com.instagram.debug.devoptions.plugins.DeveloperOptionsPlugin.OnPinnedDevOptionInteraction
    public final void onPinnedDevOptionRemoved() {
        Context context = this.A01.getContext();
        if (context != null) {
            C52776NXh.A00(context, this.A00);
        }
    }

    @Override // com.instagram.debug.devoptions.plugins.DeveloperOptionsPlugin.OnPinnedDevOptionInteraction
    public final void onPinnedDevOptionSelected() {
        C52776NXh.A01(this.A00);
    }
}
