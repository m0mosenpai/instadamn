package X;

import com.instagram.music.search.MusicOverlayResultsListController;

/* renamed from: X.MYg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50663MYg extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC58055Pog {
    public static final String __redex_internal_original_name = "MusicOverlaySearchFragment";
    public Runnable A00;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void A02(String str) {
        String str2;
        if (this instanceof NQI) {
            NQI nqi = (NQI) this;
            C24U A0V = MSZ.A0V(nqi.A0A);
            EnumC1810381f enumC1810381f = nqi.A05;
            if (enumC1810381f != null) {
                A0V.A0E(str, enumC1810381f.toString());
                P64 p64 = nqi.A02;
                if (p64 == null) {
                    str2 = "musicSearchResultsView";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                MusicOverlayResultsListController musicOverlayResultsListController = p64.A02;
                musicOverlayResultsListController.A0E.A03(false);
                musicOverlayResultsListController.A0F.A04 = str;
                p64.A00 = false;
                NQI.A01(nqi, str, false, false);
                return;
            }
        } else {
            NQJ nqj = (NQJ) this;
            C24U A0V2 = MSZ.A0V(nqj.A0F);
            EnumC1810381f enumC1810381f2 = nqj.A05;
            if (enumC1810381f2 != null) {
                A0V2.A0E(str, enumC1810381f2.toString());
                NQJ.A01(nqj, str, false, false);
                return;
            }
        }
        str2 = "captureState";
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public final void A03(String str, boolean z) {
        C25671My A0Q;
        C55994OtR c55994OtR;
        String str2;
        if (this instanceof NQJ) {
            NQJ nqj = (NQJ) this;
            InterfaceC09390do interfaceC09390do = nqj.A0F;
            C24U A0V = MSZ.A0V(interfaceC09390do);
            EnumC1810381f enumC1810381f = nqj.A05;
            if (enumC1810381f != null) {
                A0V.A0E(str, enumC1810381f.toString());
                P64 p64 = nqj.A02;
                if (p64 != null) {
                    if (!NQJ.A01(nqj, str, z, !z)) {
                        p64.A00();
                    }
                    MusicOverlayResultsListController musicOverlayResultsListController = p64.A02;
                    musicOverlayResultsListController.A06();
                    musicOverlayResultsListController.A0F.A04 = str;
                    A0Q = AbstractC31176DnK.A0Q(interfaceC09390do);
                    c55994OtR = new C55994OtR(NQJ.A00(nqj).A01);
                    A0Q.A05(c55994OtR);
                    return;
                }
                str2 = "musicSearchResultsView";
            }
            str2 = "captureState";
        } else {
            NQI nqi = (NQI) this;
            InterfaceC09390do interfaceC09390do2 = nqi.A0A;
            C24U A0V2 = MSZ.A0V(interfaceC09390do2);
            EnumC1810381f enumC1810381f2 = nqi.A05;
            if (enumC1810381f2 != null) {
                A0V2.A0E(str, enumC1810381f2.toString());
                P64 p642 = nqi.A02;
                if (p642 != null) {
                    if (!NQI.A01(nqi, str, z, !z)) {
                        p642.A00();
                    }
                    MusicOverlayResultsListController musicOverlayResultsListController2 = p642.A02;
                    musicOverlayResultsListController2.A06();
                    musicOverlayResultsListController2.A0F.A04 = str;
                    A0Q = AbstractC31176DnK.A0Q(interfaceC09390do2);
                    c55994OtR = new C55994OtR(str);
                    A0Q.A05(c55994OtR);
                    return;
                }
                str2 = "musicSearchResultsView";
            }
            str2 = "captureState";
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(356683307);
        super.onResume();
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
        this.A00 = null;
        C0f9.A09(-1403182846, A02);
    }
}
