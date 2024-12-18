package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.OzP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56304OzP implements C8BK {
    public C189478aR A00;
    public AudioOverlayTrack A01;
    public boolean A02;
    public boolean A03;
    public final AbstractC59962oe A04;
    public final UserSession A05;
    public final C8BP A06;
    public final ClipsCreationViewModel A07;
    public final InterfaceC09390do A08;
    public final InterfaceC11380iw A09;
    public final C8BK A0A;
    public final AnonymousClass844 A0B;
    public final Gt5 A0C;
    public final String A0D;

    public C56304OzP(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C8BK c8bk, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass844 anonymousClass844) {
        C14360o3.A0B(c8bk, 4);
        this.A05 = userSession;
        this.A04 = abstractC59962oe;
        this.A0B = anonymousClass844;
        this.A0A = c8bk;
        this.A07 = clipsCreationViewModel;
        this.A09 = interfaceC11380iw;
        this.A0D = anonymousClass844.BVY();
        this.A08 = AbstractC25225BEi.A0a(new C57521Pfv(abstractC59962oe, 36), new C57521Pfv(this, 35), new C57256Pbe(27, null, abstractC59962oe), AbstractC25225BEi.A1D(C8BE.class));
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        Application application = abstractC59962oe.requireActivity().getApplication();
        C14360o3.A0B(application, 1);
        Gt5 gt5 = (Gt5) MSW.A0F(new C52316NDf(application, null, userSession, null, "galleryTrendingAudio", null), requireActivity).A00(Gt5.class);
        C14360o3.A07(gt5);
        this.A0C = gt5;
        Context requireContext = abstractC59962oe.requireContext();
        EnumC1810381f enumC1810381f = EnumC1810381f.A03;
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        this.A06 = new C8BP(requireContext, null, of, MusicProduct.A06, abstractC59962oe, userSession, null, null, null, new C48626Lf2(0), this, null, C8BO.A06, enumC1810381f, null, false, true, false, false, false);
    }

    public static final void A00(C56304OzP c56304OzP, AudioOverlayTrack audioOverlayTrack, boolean z) {
        c56304OzP.A03 = false;
        UserSession userSession = c56304OzP.A05;
        C45506KCv A00 = Kl8.A00(userSession, new C56302OzN(c56304OzP), audioOverlayTrack, z);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0T = A00;
        C56766PHj.A00(A0y, c56304OzP, 2);
        AbstractC59962oe abstractC59962oe = c56304OzP.A04;
        A0y.A06 = abstractC59962oe.requireContext().getColor(R.color.barcelona_story_share_dark_mode);
        C189478aR A002 = A0y.A00();
        c56304OzP.A00 = A002;
        AbstractC31173DnH.A1G(abstractC59962oe, A00, A002);
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
        if (this.A03) {
            this.A01 = audioOverlayTrack;
        } else {
            this.A0A.Due(audioOverlayTrack);
        }
    }

    @Override // X.C8BK
    public final /* synthetic */ void Dui(AudioOverlayTrack audioOverlayTrack, Integer num) {
        AbstractC226899zl.A00(this, audioOverlayTrack);
    }

    public final void A01() {
        InterfaceC09390do interfaceC09390do = this.A08;
        if (((C8BE) interfaceC09390do.getValue()).A01() != null && !this.A02) {
            AudioOverlayTrack A01 = ((C8BE) interfaceC09390do.getValue()).A01();
            if (A01 != null) {
                A00(this, A01, true);
                return;
            }
            return;
        }
        this.A03 = true;
        this.A02 = false;
        this.A01 = null;
        C8BO c8bo = C8BO.A06;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("referrer_audio_id", "galleryTrendingAudio");
        A0b.putSerializable(AbstractC43591JPw.A00(41), c8bo);
        UserSession userSession = this.A05;
        C45507KCw c45507KCw = new C45507KCw();
        c45507KCw.setArguments(A0b);
        AbstractC31178DnM.A11(c45507KCw, PZJ.A01(this, null, 37), this.A0C.A09);
        C189448aO A0X = AbstractC31177DnL.A0X(userSession, true);
        A0X.A03 = 1.0f;
        AbstractC59962oe abstractC59962oe = this.A04;
        A0X.A06 = abstractC59962oe.requireContext().getColor(R.color.barcelona_story_share_dark_mode);
        A0X.A0T = c45507KCw;
        C56766PHj.A00(A0X, this, 1);
        C189478aR A00 = A0X.A00();
        this.A00 = A00;
        AbstractC31173DnH.A1G(abstractC59962oe, c45507KCw, A00);
        AbstractC37670Gi3.A0P(EnumC39652Hih.A0W, this.A09, userSession, null, null, null, 1L);
        AnonymousClass229.A01(userSession).A1R(EnumC50631MWs.A0J, "DESTINATION_TOOLBAR_TRENDING_AUDIO");
    }

    @Override // X.AnonymousClass844
    public final String BVY() {
        return this.A0D;
    }

    @Override // X.C8BK
    public final void Dub(AudioOverlayTrack audioOverlayTrack, boolean z) {
        ((C8BE) this.A08.getValue()).A05(audioOverlayTrack, "trending", z);
    }
}
