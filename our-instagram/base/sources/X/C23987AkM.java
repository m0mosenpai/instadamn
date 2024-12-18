package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicBrowseCategory;

/* renamed from: X.AkM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23987AkM implements InterfaceC58052Pod, InterfaceC58154PqJ {
    public MYM A00;
    public View A01;
    public final int A02;
    public final ViewStub A03;
    public final AbstractC10360h2 A04;
    public final UserSession A05;
    public final InterfaceC189828b1 A06;
    public final AnonymousClass844 A07;
    public final MusicAttributionConfig A08;
    public final C677733r A09;

    public C23987AkM(View view, AbstractC10360h2 abstractC10360h2, UserSession userSession, InterfaceC189828b1 interfaceC189828b1, AnonymousClass844 anonymousClass844, MusicAttributionConfig musicAttributionConfig, C677733r c677733r, int i) {
        C14360o3.A0B(c677733r, 5);
        this.A04 = abstractC10360h2;
        this.A05 = userSession;
        this.A07 = anonymousClass844;
        this.A09 = c677733r;
        this.A08 = musicAttributionConfig;
        this.A02 = i;
        this.A06 = interfaceC189828b1;
        this.A03 = AbstractC167007dF.A0M(view, R.id.music_search_stub_background);
    }

    @Override // X.InterfaceC58052Pod
    public final String Aer(EnumC53139Nes enumC53139Nes) {
        C14360o3.A0B(enumC53139Nes, 0);
        return AbstractC167017dG.A0n(enumC53139Nes, "MusicPrecaptureSearchController", AbstractC166987dD.A1C());
    }

    @Override // X.InterfaceC58052Pod
    public final int B8Q(EnumC53139Nes enumC53139Nes) {
        C14360o3.A0B(enumC53139Nes, 0);
        int ordinal = enumC53139Nes.ordinal();
        if (ordinal != 1) {
            if (ordinal != 0) {
                if (ordinal == 2) {
                    return R.id.music_search_precapture_saved_container;
                }
                throw AbstractC166987dD.A12(MSV.A00(869));
            }
            return R.id.music_search_precapture_landing_page_container;
        }
        return R.id.music_search_precapture_search_results_container;
    }

    @Override // X.InterfaceC58154PqJ
    public final void DUT() {
    }

    @Override // X.InterfaceC58154PqJ
    public final void DUV() {
    }

    public final void A00(MusicProduct musicProduct) {
        if (this.A01 == null) {
            View inflate = this.A03.inflate();
            this.A01 = inflate;
            if (inflate != null) {
                Context context = inflate.getContext();
                if (context != null) {
                    inflate.setBackgroundColor(context.getColor(R.color.background));
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            ImmutableList of = ImmutableList.of();
            C14360o3.A07(of);
            View view = this.A01;
            if (view != null) {
                this.A00 = new MYM(view, this.A04, C8BN.PRE_CAPTURE, of, null, musicProduct, this.A05, this.A07, this.A08, this.A09, this, this, EnumC1810381f.A03, null, null, null, this.A02, false, false, false);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        MYM mym = this.A00;
        if (mym != null) {
            mym.A06();
            MYM mym2 = this.A00;
            if (mym2 != null) {
                mym2.A07(null, C05F.A01);
            }
        }
    }

    @Override // X.InterfaceC58154PqJ
    public final void DUU() {
        this.A06.DUU();
    }

    @Override // X.InterfaceC58154PqJ
    public final void DUj(JIN jin, MusicBrowseCategory musicBrowseCategory, String str, String str2) {
        this.A06.Duf(jin);
    }
}
