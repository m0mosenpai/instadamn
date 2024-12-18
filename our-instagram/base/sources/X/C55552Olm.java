package X;

import android.os.Bundle;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;

/* renamed from: X.Olm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55552Olm implements C06Z {
    public final int A00;
    public final Object A01;

    public C55552Olm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C06Z
    public final void DIA(String str, Bundle bundle) {
        C46080Kac c46080Kac;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(bundle, 1);
                if (!bundle.getBoolean(AbstractC43591JPw.A00(459)) || (c46080Kac = ((C48625Lf1) this.A01).A04) == null) {
                    return;
                }
                c46080Kac.A06(EnumC46136Kba.A02);
                return;
            case 1:
                C14360o3.A0B(bundle, 1);
                BrandedContentGatingInfo brandedContentGatingInfo = (BrandedContentGatingInfo) bundle.getParcelable("bundle_key_gating_info");
                N5M n5m = (N5M) this.A01;
                ClipsAdvancedSettingsConfig clipsAdvancedSettingsConfig = n5m.A01;
                if (clipsAdvancedSettingsConfig != null) {
                    clipsAdvancedSettingsConfig.A00 = brandedContentGatingInfo;
                    C50882MeD c50882MeD = (C50882MeD) n5m.A03.getValue();
                    ClipsAdvancedSettingsConfig clipsAdvancedSettingsConfig2 = n5m.A01;
                    if (clipsAdvancedSettingsConfig2 != null) {
                        c50882MeD.A01.A01("clipsAdvancedSettingsConfig", clipsAdvancedSettingsConfig2);
                        return;
                    }
                }
                C14360o3.A0F("clipsAdvancedSettingsConfig");
                throw C00O.createAndThrow();
            case 2:
                ((MUI) this.A01).A04(true);
                return;
            case 3:
                AbstractC167017dG.A1N(str, bundle);
                if (!str.equals("BLOCKLIST_FRAGMENT_REQUEST_KEY") || !bundle.getBoolean("ARGUMENT_BLOCKLIST_CHANGED_KEY")) {
                    return;
                }
                C50934Mf3 c50934Mf3 = (C50934Mf3) ((N5L) this.A01).A02.getValue();
                C05A c05a = c50934Mf3.A05;
                do {
                } while (!c05a.AIi(c05a.getValue(), NRF.A00));
                PZG.A01(c50934Mf3, AbstractC141776au.A00(c50934Mf3), 49);
                return;
            default:
                ReelMoreOptionsFragment reelMoreOptionsFragment = (ReelMoreOptionsFragment) this.A01;
                BrandedContentGatingInfo brandedContentGatingInfo2 = (BrandedContentGatingInfo) bundle.getParcelable("bundle_key_gating_info");
                C183938Du c183938Du = new C183938Du(reelMoreOptionsFragment.A03);
                c183938Du.A00 = brandedContentGatingInfo2;
                reelMoreOptionsFragment.A03 = c183938Du.A01();
                ReelMoreOptionsFragment.A0A(reelMoreOptionsFragment);
                return;
        }
    }
}
