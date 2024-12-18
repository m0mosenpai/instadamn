package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.R;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.33n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnKeyListenerC677333n implements InterfaceC60602pj, C33S, InterfaceC677433o, View.OnKeyListener {
    public static final C30R A0C = new C30R(C30Q.SLIDE_OUT, 0, -1, true);
    public C38321qM A00;
    public C3A4 A01;
    public final Context A02;
    public final AudioManager A03;
    public final C18950wb A04;
    public final InterfaceC60022ok A05;
    public final UserSession A06;
    public final C33M A07;
    public final InterfaceC678133v A08;
    public final Map A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    public ViewOnKeyListenerC677333n(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C33M c33m) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c33m, 4);
        this.A02 = context;
        this.A06 = userSession;
        this.A07 = c33m;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (systemService != null) {
            this.A03 = (AudioManager) systemService;
            this.A04 = C18950wb.A01;
            this.A0A = AbstractC09440dt.A01(C677533p.A00);
            this.A0B = AbstractC09440dt.A01(C677633q.A00);
            this.A09 = new LinkedHashMap();
            this.A08 = AbstractC677833s.A01(context, userSession, interfaceC60442pS, new C677733r(context, userSession), "FeedMusicController", false, true, true, true);
            this.A05 = new InterfaceC60022ok() { // from class: X.340
                @Override // X.InterfaceC60022ok
                public final boolean onVolumeKeyPressed(EnumC37329GcX enumC37329GcX, KeyEvent keyEvent) {
                    C14360o3.A0B(enumC37329GcX, 0);
                    C14360o3.A0B(keyEvent, 1);
                    ViewOnKeyListenerC677333n viewOnKeyListenerC677333n = ViewOnKeyListenerC677333n.this;
                    View view = new View(viewOnKeyListenerC677333n.A02);
                    int i = 25;
                    if (enumC37329GcX == EnumC37329GcX.A03) {
                        i = 24;
                    }
                    return viewOnKeyListenerC677333n.onKey(view, i, keyEvent);
                }
            };
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.C33S
    public final void Eoq() {
    }

    @Override // X.InterfaceC677433o
    public final void F7r(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C4TE c4te = (C4TE) this.A09.get(c38321qM);
        if (c4te == null) {
            C0f5 AEp = this.A04.AEp("FeedMusicController", 817905066);
            AEp.ABW("toggleAudio", "media was not in musicMediaMap");
            AEp.report();
            return;
        }
        int intValue = c4te.A01.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    C9GR.A00(this.A02, AbstractC76643c9.A08(this.A06, c38321qM), "FeedMusicController song muted", 0);
                    return;
                }
                throw new RuntimeException();
            }
            A05(c38321qM, this);
            return;
        }
        A04(c38321qM, this);
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
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final C38321qM A00(ViewOnKeyListenerC677333n viewOnKeyListenerC677333n) {
        C38321qM c38321qM = null;
        float f = 0.0f;
        for (Map.Entry entry : viewOnKeyListenerC677333n.A09.entrySet()) {
            C38321qM c38321qM2 = (C38321qM) entry.getKey();
            float f2 = ((C4TE) entry.getValue()).A00;
            if (f2 > viewOnKeyListenerC677333n.A07.A00 && f2 > f) {
                f = f2;
                c38321qM = c38321qM2;
            }
        }
        return c38321qM;
    }

    public static final void A01(C38321qM c38321qM, C75113Zb c75113Zb, ViewOnKeyListenerC677333n viewOnKeyListenerC677333n) {
        SlideInAndOutIconView slideInAndOutIconView;
        Map map = viewOnKeyListenerC677333n.A09;
        C4TE c4te = (C4TE) map.get(c38321qM);
        if (c4te != null && !c4te.A02) {
            return;
        }
        C4TE c4te2 = (C4TE) map.get(c38321qM);
        if (c4te2 != null) {
            c4te2.A02 = false;
        }
        if (c75113Zb == null || (slideInAndOutIconView = c75113Zb.A0v) == null) {
            return;
        }
        slideInAndOutIconView.A01();
    }

    private final void A03(C38321qM c38321qM, C75113Zb c75113Zb, Integer num, boolean z) {
        int i;
        Map map = this.A09;
        C4TE c4te = (C4TE) map.get(c38321qM);
        if (c4te == null || !c4te.A02 || z) {
            C4TE c4te2 = (C4TE) map.get(c38321qM);
            if (c4te2 != null) {
                c4te2.A02 = true;
            }
            if (c75113Zb != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    i = R.drawable.instagram_volume_off_pano_filled_24;
                    if (intValue != 1) {
                        i = R.drawable.instagram_volume_none_pano_filled_24;
                    }
                } else {
                    i = R.drawable.instagram_volume_pano_filled_24;
                }
                C30R c30r = A0C;
                C14360o3.A0B(c30r, 1);
                SlideInAndOutIconView slideInAndOutIconView = c75113Zb.A0v;
                if (slideInAndOutIconView != null) {
                    Context context = slideInAndOutIconView.getContext();
                    int lineHeight = slideInAndOutIconView.A0C.getLineHeight() + (context.getResources().getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2);
                    int lineHeight2 = (slideInAndOutIconView.A0C.getLineHeight() - context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
                    slideInAndOutIconView.A03(context.getDrawable(i), lineHeight, lineHeight);
                    slideInAndOutIconView.A0B.setPadding(lineHeight2, lineHeight2, lineHeight2, lineHeight2);
                    slideInAndOutIconView.setIconColor(context.getColor(R.color.design_dark_default_color_on_background));
                    slideInAndOutIconView.setIconScale(0.5f);
                    c75113Zb.A0H(null, c30r, i);
                }
            }
        }
    }

    public static final void A04(C38321qM c38321qM, ViewOnKeyListenerC677333n viewOnKeyListenerC677333n) {
        C75113Zb c75113Zb;
        Map map = viewOnKeyListenerC677333n.A09;
        C4TE c4te = (C4TE) map.get(c38321qM);
        if (c4te != null) {
            c4te.A01 = C05F.A01;
        }
        AbstractC24321Hb.A00(viewOnKeyListenerC677333n.A06).A00(false);
        C4TE c4te2 = (C4TE) map.get(c38321qM);
        if (c4te2 != null) {
            c75113Zb = c4te2.A03;
        } else {
            c75113Zb = null;
        }
        viewOnKeyListenerC677333n.A03(c38321qM, c75113Zb, C05F.A01, true);
        if (c38321qM.equals(viewOnKeyListenerC677333n.A00)) {
            InterfaceC678133v interfaceC678133v = viewOnKeyListenerC677333n.A08;
            if (interfaceC678133v.isPlaying()) {
                interfaceC678133v.pause();
            }
        }
        C3A4 c3a4 = viewOnKeyListenerC677333n.A01;
        if (c3a4 != null) {
            c3a4.A02 = false;
            c3a4.A00 = null;
        }
    }

    public static final void A05(C38321qM c38321qM, ViewOnKeyListenerC677333n viewOnKeyListenerC677333n) {
        C75113Zb c75113Zb;
        MusicDataSource musicDataSource;
        Map map = viewOnKeyListenerC677333n.A09;
        C4TE c4te = (C4TE) map.get(c38321qM);
        if (c4te != null) {
            c4te.A01 = C05F.A00;
        }
        UserSession userSession = viewOnKeyListenerC677333n.A06;
        AbstractC24321Hb.A00(userSession).A00(true);
        C4TE c4te2 = (C4TE) map.get(c38321qM);
        if (c4te2 != null) {
            c75113Zb = c4te2.A03;
        } else {
            c75113Zb = null;
        }
        viewOnKeyListenerC677333n.A03(c38321qM, c75113Zb, C05F.A00, true);
        if (c38321qM.equals(viewOnKeyListenerC677333n.A00) && viewOnKeyListenerC677333n.A08.isPlaying()) {
            return;
        }
        InterfaceC678133v interfaceC678133v = viewOnKeyListenerC677333n.A08;
        if (interfaceC678133v.isPlaying()) {
            interfaceC678133v.EJa(false);
        }
        if (!c38321qM.equals(viewOnKeyListenerC677333n.A00)) {
            C88543xC A1Q = c38321qM.A1Q();
            OriginalSoundDataIntf A1K = c38321qM.A1K();
            if (A1Q != null) {
                musicDataSource = A1Q.BVb();
            } else if (A1K != null && C36A.A0G(userSession)) {
                musicDataSource = new MusicDataSource(null, AudioType.A04, A1K.getProgressiveDownloadUrl(), A1K.getDashManifest(), A1K.getAudioAssetId(), A1K.BFU().getId());
            } else {
                C0f5 AEp = viewOnKeyListenerC677333n.A04.AEp("FeedMusicController", 817905066);
                AEp.ABW("play", "musicDataSource was null for media");
                AEp.report();
                return;
            }
            interfaceC678133v.ESz(musicDataSource, new C42738IvY(), null, 0, c38321qM.CFR().A01, c38321qM.CFR().A00, true, false);
            viewOnKeyListenerC677333n.A00 = c38321qM;
        }
        interfaceC678133v.E4S();
        C3A4 c3a4 = viewOnKeyListenerC677333n.A01;
        if (c3a4 == null) {
            return;
        }
        c3a4.A02 = true;
        c3a4.A00 = c38321qM;
        if (c38321qM.equals(c3a4.A01)) {
            return;
        }
        Iterator it = c3a4.A07.iterator();
        while (it.hasNext()) {
            ((C33S) it.next()).Eoq();
        }
    }

    public static final void A06(ViewOnKeyListenerC677333n viewOnKeyListenerC677333n) {
        C75113Zb c75113Zb;
        Map map = viewOnKeyListenerC677333n.A09;
        C4TE c4te = (C4TE) map.get(viewOnKeyListenerC677333n.A00);
        if (c4te != null) {
            c4te.A01 = C05F.A01;
        }
        C38321qM c38321qM = viewOnKeyListenerC677333n.A00;
        if (c38321qM != null) {
            C4TE c4te2 = (C4TE) map.get(c38321qM);
            if (c4te2 != null) {
                c75113Zb = c4te2.A03;
            } else {
                c75113Zb = null;
            }
            A01(c38321qM, c75113Zb, viewOnKeyListenerC677333n);
        }
        C3A4 c3a4 = viewOnKeyListenerC677333n.A01;
        if (c3a4 != null) {
            c3a4.A02 = false;
            c3a4.A00 = null;
        }
        viewOnKeyListenerC677333n.A08.EJa(false);
        viewOnKeyListenerC677333n.A00 = null;
    }

    public static final boolean A07(ViewOnKeyListenerC677333n viewOnKeyListenerC677333n, float f) {
        C3A4 c3a4;
        if (!viewOnKeyListenerC677333n.A08.isPlaying() && (((c3a4 = viewOnKeyListenerC677333n.A01) == null || (!c3a4.A05 && (!c3a4.A03 || !c3a4.A04))) && f > viewOnKeyListenerC677333n.A07.A00)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        InterfaceC678133v interfaceC678133v = this.A08;
        interfaceC678133v.release();
        interfaceC678133v.EJa(false);
        this.A00 = null;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if ((i == 25 || i == 24) && A00(this) != null) {
            ((Handler) this.A0A.getValue()).post(new RunnableC43121J4k(this, i));
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        this.A08.EJa(false);
        this.A00 = null;
    }

    public static final void A02(C38321qM c38321qM, C75113Zb c75113Zb, ViewOnKeyListenerC677333n viewOnKeyListenerC677333n, float f) {
        Integer num;
        Boolean bool;
        if (A07(viewOnKeyListenerC677333n, f)) {
            UserSession userSession = viewOnKeyListenerC677333n.A06;
            if (!AbstractC76643c9.A0H(userSession, c38321qM) && (bool = AbstractC24321Hb.A00(userSession).A01) != null && bool.booleanValue()) {
                A05(c38321qM, viewOnKeyListenerC677333n);
                return;
            }
            if (AbstractC76643c9.A0H(userSession, c38321qM)) {
                num = C05F.A0C;
            } else if (c38321qM.equals(viewOnKeyListenerC677333n.A00) && viewOnKeyListenerC677333n.A08.isPlaying()) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            viewOnKeyListenerC677333n.A03(c38321qM, c75113Zb, num, false);
        }
    }

    @Override // X.C33S
    public final void Eob() {
        A06(this);
    }
}
