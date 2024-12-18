package X;

import android.content.Context;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Ahe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23885Ahe implements C8BK {
    public C189478aR A00;
    public AudioOverlayTrack A01;
    public boolean A02;
    public boolean A03;
    public final AbstractC59962oe A04;
    public final UserSession A05;
    public final C8BP A06;
    public final InterfaceC09390do A07;
    public final C8BK A08;
    public final AnonymousClass844 A09;
    public final String A0A;

    public C23885Ahe(AbstractC59962oe abstractC59962oe, UserSession userSession, C8BK c8bk, AnonymousClass844 anonymousClass844) {
        this.A05 = userSession;
        this.A04 = abstractC59962oe;
        this.A09 = anonymousClass844;
        this.A08 = c8bk;
        this.A0A = anonymousClass844.BVY();
        this.A07 = new C60842q8(new C57521Pfv(abstractC59962oe, 34), new C57521Pfv(this, 33), new C57256Pbe(26, null, abstractC59962oe), new C0YZ(C8BE.class));
        Context requireContext = abstractC59962oe.requireContext();
        EnumC1810381f enumC1810381f = EnumC1810381f.A03;
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        this.A06 = new C8BP(requireContext, C8BN.GALLERY_DESTINATION_BAR, of, MusicProduct.A06, abstractC59962oe, userSession, null, null, null, new C23882Ahb(this, 1), this, null, C8BO.A06, enumC1810381f, null, false, true, false, false, false);
    }

    public static final void A00(C23885Ahe c23885Ahe, AudioOverlayTrack audioOverlayTrack, boolean z) {
        c23885Ahe.A02 = false;
        UserSession userSession = c23885Ahe.A05;
        C45506KCv A00 = Kl8.A00(userSession, new C23881Aha(c23885Ahe, audioOverlayTrack), audioOverlayTrack, z);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0T = A00;
        c189448aO.A0U = new C24116An1(c23885Ahe, 3);
        AbstractC59962oe abstractC59962oe = c23885Ahe.A04;
        c189448aO.A06 = abstractC59962oe.requireContext().getColor(R.color.grey_10);
        C189478aR A002 = c189448aO.A00();
        c23885Ahe.A00 = A002;
        A002.A02(abstractC59962oe.requireActivity(), A00);
    }

    @Override // X.C8BK
    public final /* synthetic */ void DUX(boolean z) {
    }

    @Override // X.C8BK
    public final /* synthetic */ void DuZ(AudioOverlayTrack audioOverlayTrack) {
    }

    @Override // X.C8BK
    public final /* synthetic */ void Duc(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2) {
    }

    @Override // X.C8BK
    public final void Due(AudioOverlayTrack audioOverlayTrack) {
        C14360o3.A0B(audioOverlayTrack, 0);
        if (this.A02) {
            this.A01 = audioOverlayTrack;
        } else {
            this.A08.Due(audioOverlayTrack);
        }
    }

    @Override // X.C8BK
    public final /* synthetic */ void Dui(AudioOverlayTrack audioOverlayTrack, Integer num) {
        AbstractC226899zl.A00(this, audioOverlayTrack);
    }

    public final void A01() {
        InterfaceC09390do interfaceC09390do = this.A07;
        if (((C8BE) interfaceC09390do.getValue()).A01() != null && !this.A03) {
            AudioOverlayTrack A01 = ((C8BE) interfaceC09390do.getValue()).A01();
            if (A01 != null) {
                A00(this, A01, true);
                return;
            }
            return;
        }
        this.A02 = true;
        this.A03 = false;
        this.A01 = null;
        this.A06.A0A(null, null, false, false);
    }

    @Override // X.AnonymousClass844
    public final String BVY() {
        return this.A0A;
    }

    @Override // X.C8BK
    public final void Dub(AudioOverlayTrack audioOverlayTrack, boolean z) {
        ((C8BE) this.A07.getValue()).A05(null, "gallery", z);
    }
}
