package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioType;
import instagram.features.clips.audio.ui.SegmentsMusicPlayerView;

/* renamed from: X.Io2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42278Io2 implements InterfaceC60602pj, InterfaceC101554hQ, InterfaceC43498JJk {
    public SegmentsMusicPlayerView A00;
    public boolean A01;
    public C677733r A02;
    public InterfaceC19630xq A03;
    public final AbstractC59962oe A04;
    public final long A05;
    public final N8L A06;
    public final C153756vk A07;
    public final UserSession A08;
    public final InterfaceC60442pS A09;
    public final C38335GtV A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public C42278Io2(AbstractC59962oe abstractC59962oe, N8L n8l, C153756vk c153756vk, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C38335GtV c38335GtV, String str, String str2, String str3, long j, boolean z) {
        C14360o3.A0B(userSession, 3);
        this.A0A = c38335GtV;
        this.A04 = abstractC59962oe;
        this.A08 = userSession;
        this.A09 = interfaceC60442pS;
        this.A05 = j;
        this.A0C = str;
        this.A0B = str2;
        this.A0D = str3;
        this.A0E = z;
        this.A07 = c153756vk;
        this.A06 = n8l;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC43498JJk
    public final void DUP() {
        InterfaceC88553xD interfaceC88553xD;
        AudioType audioType;
        OriginalAudioSubtype Ae4;
        this.A01 = true;
        N8L.A00(this.A06, "play_pause");
        C38653Gyu A00 = C38335GtV.A00(this.A0A);
        String str = null;
        if (A00 != null) {
            interfaceC88553xD = A00.A03;
        } else {
            interfaceC88553xD = null;
        }
        AbstractC59962oe abstractC59962oe = this.A04;
        UserSession userSession = this.A08;
        Long valueOf = Long.valueOf(this.A05);
        String str2 = this.A0D;
        String str3 = this.A0B;
        if (interfaceC88553xD != null) {
            audioType = interfaceC88553xD.Ae7();
        } else {
            audioType = null;
        }
        EnumC39636HiR A002 = I4Y.A00(audioType);
        if (interfaceC88553xD != null && (Ae4 = interfaceC88553xD.Ae4()) != null) {
            str = AbstractC40748I4c.A00(Ae4);
        }
        AbstractC37670Gi3.A0G(A002, null, this.A07, abstractC59962oe, userSession, valueOf, str2, str3, str, null);
    }

    @Override // X.InterfaceC43498JJk
    public final void DUS() {
        InterfaceC88553xD interfaceC88553xD;
        AudioType audioType;
        OriginalAudioSubtype Ae4;
        this.A01 = false;
        N8L.A00(this.A06, "play_pause");
        C38653Gyu A00 = C38335GtV.A00(this.A0A);
        String str = null;
        if (A00 != null) {
            interfaceC88553xD = A00.A03;
        } else {
            interfaceC88553xD = null;
        }
        UserSession userSession = this.A08;
        Long valueOf = Long.valueOf(this.A05);
        String str2 = this.A0C;
        String str3 = this.A0B;
        String str4 = this.A0D;
        AbstractC59962oe abstractC59962oe = this.A04;
        if (interfaceC88553xD != null) {
            audioType = interfaceC88553xD.Ae7();
        } else {
            audioType = null;
        }
        EnumC39636HiR A002 = I4Y.A00(audioType);
        if (interfaceC88553xD != null && (Ae4 = interfaceC88553xD.Ae4()) != null) {
            str = AbstractC40748I4c.A00(Ae4);
        }
        AbstractC37670Gi3.A0H(A002, null, this.A07, abstractC59962oe, userSession, valueOf, str2, str3, str4, str, null);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
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
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        Context requireContext = this.A04.requireContext();
        UserSession userSession = this.A08;
        this.A02 = new C677733r(requireContext, userSession);
        View A0U = AbstractC167017dG.A0U(view, R.id.segments_music_player);
        C14360o3.A0C(A0U, "null cannot be cast to non-null type instagram.features.clips.audio.ui.SegmentsMusicPlayerView");
        SegmentsMusicPlayerView segmentsMusicPlayerView = (SegmentsMusicPlayerView) A0U;
        this.A00 = segmentsMusicPlayerView;
        if (segmentsMusicPlayerView == null) {
            str = "musicPlayerView";
        } else {
            InterfaceC60442pS interfaceC60442pS = this.A09;
            C677733r c677733r = this.A02;
            if (c677733r == null) {
                str = "musicAudioFocusController";
            } else {
                segmentsMusicPlayerView.A05 = C18U.A06(C06090Tz.A05, userSession, 36327365965527585L);
                segmentsMusicPlayerView.A02 = AbstractC677833s.A00(AbstractC166997dE.A0L(segmentsMusicPlayerView), userSession, interfaceC60442pS, c677733r, "SegmentsMusicPlayerView", AbstractC677833s.A02(userSession));
                segmentsMusicPlayerView.A01 = 60000;
                segmentsMusicPlayerView.A03 = this;
                this.A03 = C1AT.A01(userSession).A03(C1AV.A0J);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(C42278Io2 c42278Io2) {
        if (!c42278Io2.A0E && !c42278Io2.A01 && c42278Io2.A04.mLifecycleRegistry.A07().A00(C07S.RESUMED)) {
            SegmentsMusicPlayerView segmentsMusicPlayerView = c42278Io2.A00;
            if (segmentsMusicPlayerView == null) {
                C14360o3.A0F("musicPlayerView");
                throw C00O.createAndThrow();
            }
            segmentsMusicPlayerView.A0D();
        }
    }

    @Override // X.InterfaceC101554hQ
    public final void DXz() {
        String str;
        SegmentsMusicPlayerView segmentsMusicPlayerView = this.A00;
        if (segmentsMusicPlayerView == null) {
            str = "musicPlayerView";
        } else {
            InterfaceC678133v interfaceC678133v = segmentsMusicPlayerView.A02;
            str = "musicPlayer";
            if (interfaceC678133v != null) {
                if (interfaceC678133v.isPlaying()) {
                    InterfaceC678133v interfaceC678133v2 = segmentsMusicPlayerView.A02;
                    if (interfaceC678133v2 != null) {
                        interfaceC678133v2.pause();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        String str;
        SegmentsMusicPlayerView segmentsMusicPlayerView = this.A00;
        if (segmentsMusicPlayerView == null) {
            str = "musicPlayerView";
        } else {
            InterfaceC678133v interfaceC678133v = segmentsMusicPlayerView.A02;
            if (interfaceC678133v == null) {
                str = "musicPlayer";
            } else {
                interfaceC678133v.release();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        String str;
        SegmentsMusicPlayerView segmentsMusicPlayerView = this.A00;
        if (segmentsMusicPlayerView == null) {
            str = "musicPlayerView";
        } else {
            InterfaceC678133v interfaceC678133v = segmentsMusicPlayerView.A02;
            if (interfaceC678133v == null) {
                str = "musicPlayer";
            } else {
                interfaceC678133v.EJa(false);
                C677733r c677733r = this.A02;
                if (c677733r == null) {
                    str = "musicAudioFocusController";
                } else {
                    c677733r.A00();
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC101554hQ
    public final void DY1() {
        A00(this);
    }
}
