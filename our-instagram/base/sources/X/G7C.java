package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class G7C implements InterfaceC37199GaA {
    public final /* synthetic */ C32354ENb A00;

    public G7C(C32354ENb c32354ENb) {
        this.A00 = c32354ENb;
    }

    @Override // X.InterfaceC37199GaA
    public final boolean AJn(String str) {
        EQK eqk = this.A00.A00;
        if (eqk == null) {
            C14360o3.A0F("accountDiscoveryAdapter");
            throw C00O.createAndThrow();
        }
        return eqk.A02.contains(str);
    }

    @Override // X.InterfaceC37199GaA
    public final C1ON BEN() {
        C32354ENb c32354ENb = this.A00;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(c32354ENb.A08);
        String str = c32354ENb.A02;
        C25621Ms A0D = AbstractC31179DnN.A0D(A0o);
        A0D.A0B("discover/account_discovery/");
        A0D.A0R(C32172EBt.class, C34841FWy.class);
        A0D.A0H(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        return A0D.A0N();
    }

    @Override // X.InterfaceC37199GaA
    public final /* bridge */ /* synthetic */ void DGq(InterfaceC40801un interfaceC40801un) {
        String str;
        C32172EBt c32172EBt = (C32172EBt) interfaceC40801un;
        C14360o3.A0B(c32172EBt, 0);
        EQK eqk = this.A00.A00;
        if (eqk == null) {
            str = "accountDiscoveryAdapter";
        } else {
            ArrayList arrayList = c32172EBt.A00;
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = eqk.A01;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    eqk.A00();
                    return;
                }
                return;
            }
            str = "categories";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37199GaA
    public final void FAg() {
        EQK eqk = this.A00.A00;
        if (eqk == null) {
            C14360o3.A0F("accountDiscoveryAdapter");
            throw C00O.createAndThrow();
        }
        eqk.A00();
    }
}
