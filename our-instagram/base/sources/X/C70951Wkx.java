package X;

import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.business.promote.model.PromoteData;

/* renamed from: X.Wkx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70951Wkx implements InterfaceC190658cN {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70951Wkx(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC190658cN
    public final boolean onToggle(boolean z) {
        String str;
        EnumC68198VFq enumC68198VFq;
        String str2;
        VG4 vg4;
        String str3;
        if (this.A00 != 0) {
            V0U v0u = (V0U) this.A02;
            PromoteData promoteData = v0u.A03;
            if (promoteData == null) {
                str2 = "promoteData";
            } else {
                InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations = (InstagramProfileCallToActionDestinations) this.A01;
                C14360o3.A0A(instagramProfileCallToActionDestinations);
                if (z && WGQ.A00(instagramProfileCallToActionDestinations, promoteData)) {
                    promoteData.A24.add(instagramProfileCallToActionDestinations);
                } else {
                    promoteData.A24.remove(instagramProfileCallToActionDestinations);
                }
                V0U.A00(v0u, z);
                v0u.A08 = z;
                str2 = "promoteLogger";
                C70399WUb c70399WUb = v0u.A01;
                if (z) {
                    if (c70399WUb != null) {
                        vg4 = VG4.A1C;
                        str3 = "secondary_cta_toggle_opt_in";
                        c70399WUb.A0G(vg4, str3);
                        return true;
                    }
                } else if (c70399WUb != null) {
                    vg4 = VG4.A1C;
                    str3 = "secondary_cta_toggle_opt_out";
                    c70399WUb.A0G(vg4, str3);
                    return true;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        C70399WUb c70399WUb2 = (C70399WUb) this.A01;
        String obj = VG4.A08.toString();
        if (z) {
            str = "automatic_creative_optimization_toggle_button_opt_in";
        } else {
            str = "automatic_creative_optimization_toggle_button_opt_out";
        }
        c70399WUb2.A0S(obj, str);
        PromoteData promoteData2 = (PromoteData) this.A02;
        if (z) {
            enumC68198VFq = EnumC68198VFq.OPT_IN;
        } else {
            enumC68198VFq = EnumC68198VFq.OPT_OUT;
        }
        promoteData2.A14 = enumC68198VFq;
        return true;
    }
}
