package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer;
import com.instagram.common.session.UserSession;
import com.instagram.direct.voice.view.VoiceMessageTrimFrame;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class KBY extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "VoiceMessagePreviewFragment";
    public int A00;
    public UserSession A01;
    public C7GT A02;
    public C125055lB A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final InterfaceC09390do A0F = JQ0.A0p(this, 37);
    public final InterfaceC09390do A0E = JQ0.A0p(this, 35);
    public final InterfaceC09390do A09 = JQ0.A0p(this, 31);
    public final InterfaceC09390do A0A = JQ0.A0p(this, 32);
    public final InterfaceC09390do A0C = JQ0.A0p(this, 34);
    public final InterfaceC09390do A08 = JQ0.A0p(this, 30);
    public final InterfaceC09390do A0B = JQ0.A0p(this, 33);
    public final InterfaceC09390do A0D = JQ0.A0p(this, 36);

    public final void A06() {
        String str;
        this.A04 = false;
        A00(this).A0E.clear();
        C7GT c7gt = this.A02;
        if (c7gt == null) {
            str = "delegate";
        } else {
            L33 l33 = c7gt.A05;
            if (l33 != null) {
                A00(this).A04(AbstractC001800i.A0a(l33.A03), 1.0f);
            }
            A05(this, false);
            A03(this);
            AbstractC167007dF.A0L(this.A0B).setEnabled(true);
            AbstractC167007dF.A0L(this.A08).setEnabled(true);
            AbstractC167007dF.A0L(this.A0C).setEnabled(true);
            C125055lB c125055lB = this.A03;
            if (c125055lB == null) {
                str = "voiceMessagingGatingUtil";
            } else {
                if (C18U.A06(C06090Tz.A05, c125055lB.A00, 36323577804500354L)) {
                    A01(this).setVisibility(0);
                    VoiceMessageTrimFrame A01 = A01(this);
                    InterfaceC09390do interfaceC09390do = this.A0D;
                    float A09 = AbstractC166987dD.A09(interfaceC09390do.getValue());
                    float A07 = AbstractC166987dD.A07(A01(this)) - AbstractC166987dD.A09(interfaceC09390do.getValue());
                    RectF rectF = A01.A01;
                    rectF.left = A09;
                    rectF.right = A07;
                    A01.postInvalidateOnAnimation();
                    A00(this).setActiveWindowEnabled(true);
                    A00(this).A03(0.0f, AbstractC166987dD.A07(A00(this)));
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A03(this);
        InterfaceC09390do interfaceC09390do = this.A0C;
        ((IgdsMediaButton) AbstractC166987dD.A17(interfaceC09390do)).setButtonStyle(EnumC151036r4.A04);
        ViewOnClickListenerC48062LPn.A00(AbstractC167007dF.A0L(interfaceC09390do), 67, this);
        ViewOnClickListenerC48062LPn.A00(AbstractC167007dF.A0L(this.A0A), 68, this);
        ViewOnClickListenerC48062LPn.A00(AbstractC167007dF.A0L(this.A08), 69, this);
        C125055lB c125055lB = this.A03;
        if (c125055lB != null) {
            UserSession userSession = c125055lB.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A06 = C18U.A06(c06090Tz, userSession, 36323577804959110L);
            View A0L = AbstractC167007dF.A0L(this.A0B);
            if (A06) {
                ViewOnClickListenerC48062LPn.A00(A0L, 70, this);
            } else {
                A0L.setVisibility(8);
            }
            A00(this).A07 = true;
            A00(this).A09 = false;
            C7GT c7gt = this.A02;
            if (c7gt != null) {
                L33 l33 = c7gt.A05;
                if (l33 != null) {
                    A00(this).A04(AbstractC001800i.A0a(l33.A03), 1.0f);
                }
                C125055lB c125055lB2 = this.A03;
                if (c125055lB2 != null) {
                    if (C18U.A06(c06090Tz, c125055lB2.A00, 36323577804500354L)) {
                        A00(this).setActiveWindowEnabled(true);
                        A01(this).setVisibility(0);
                        ViewOnTouchListenerC48084LQj.A01(A01(this), 19, this);
                    }
                    C7GT c7gt2 = this.A02;
                    if (c7gt2 != null) {
                        if (c7gt2.A05 != null) {
                            A04(this, r0.A00);
                            return;
                        }
                        return;
                    }
                }
            }
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("voiceMessagingGatingUtil");
        throw C00O.createAndThrow();
    }

    public static final VoiceVisualizer A00(KBY kby) {
        return (VoiceVisualizer) AbstractC166987dD.A17(kby.A0F);
    }

    public static final VoiceMessageTrimFrame A01(KBY kby) {
        return (VoiceMessageTrimFrame) AbstractC166987dD.A17(kby.A0E);
    }

    public static final C09530e4 A02(KBY kby) {
        int i;
        int i2;
        Integer valueOf;
        String str;
        C7GT c7gt = kby.A02;
        if (c7gt == null) {
            str = "delegate";
        } else {
            L33 l33 = c7gt.A05;
            if (l33 != null) {
                i = l33.A00;
            } else {
                i = 0;
            }
            C125055lB c125055lB = kby.A03;
            if (c125055lB == null) {
                str = "voiceMessagingGatingUtil";
            } else {
                if (C18U.A06(C06090Tz.A05, c125055lB.A00, 36323577804500354L)) {
                    C09530e4 selectionBoundsPercent = A01(kby).getSelectionBoundsPercent();
                    float A09 = AbstractC166987dD.A09(selectionBoundsPercent.A00);
                    float A092 = AbstractC166987dD.A09(selectionBoundsPercent.A01);
                    float f = i;
                    i2 = Integer.valueOf((int) (A09 * f));
                    valueOf = Integer.valueOf((int) (f * A092));
                } else {
                    i2 = 0;
                    valueOf = Integer.valueOf(i);
                }
                return AbstractC166987dD.A1L(i2, valueOf);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A03(KBY kby) {
        C7IM A07;
        Drawable A00;
        UserSession userSession = kby.A01;
        if (userSession != null) {
            View requireView = kby.requireView();
            AnonymousClass988 A0a = AbstractC43594JPz.A0a(userSession, AnonymousClass988.A1Z);
            boolean z = kby.A04;
            Context context = requireView.getContext();
            if (z) {
                C7ID c7id = C7ID.A00;
                C14360o3.A0B(context, 1);
                A07 = c7id.A01(context, A0a, AbstractC125795mU.A00(), C05F.A0C);
            } else {
                A07 = AbstractC86593tX.A07(context, A0a, false);
            }
            C14360o3.A0A(A07);
            if (kby.A04) {
                A00 = AbstractC166987dD.A0a(((C161507Ll) A07.A07.A0I.getValue()).A0A);
                if (A00 != null) {
                    C7MU.A00(A00, kby.A00);
                } else {
                    A00 = null;
                }
            } else {
                C7R2 c7r2 = C7R2.A05;
                A00 = AbstractC162807Qr.A00();
                AbstractC162737Qk.A06(A00, null, c7r2, A07, false, false, false, false, false);
            }
            requireView.requireViewById(R.id.direct_voice_message_preview_message_background).setBackground(A00);
            ImageView imageView = (ImageView) AbstractC166987dD.A17(kby.A0A);
            int i = A07.A06.A04;
            imageView.setImageTintList(ColorStateList.valueOf(i));
            AbstractC37302Gc3.A06(kby.A09).setTextColor(i);
            A00(kby).setSegmentColor(i);
        }
    }

    public static final void A04(KBY kby, long j) {
        AbstractC37302Gc3.A06(kby.A09).setText(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_voice_message_preview_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A01;
    }

    public static final void A05(KBY kby, boolean z) {
        View A0L;
        int i;
        Context context = kby.getContext();
        if (context != null) {
            boolean z2 = kby.A04;
            InterfaceC09390do interfaceC09390do = kby.A0A;
            ImageView imageView = (ImageView) AbstractC166987dD.A17(interfaceC09390do);
            if (z2) {
                imageView.setImageResource(R.drawable.instagram_pause_pano_filled_24);
                A0L = AbstractC167007dF.A0L(interfaceC09390do);
                i = 2131960853;
            } else if (z) {
                imageView.setImageResource(R.drawable.instagram_pause_pano_filled_24);
                A0L = AbstractC167007dF.A0L(interfaceC09390do);
                i = 2131960852;
            } else {
                imageView.setImageResource(R.drawable.instagram_play_pano_filled_24);
                A0L = AbstractC167007dF.A0L(interfaceC09390do);
                i = 2131960849;
            }
            AbstractC166997dE.A18(context, A0L, i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1735021025);
        View A0A = AbstractC31176DnK.A0A(AbstractC31175DnJ.A06(this), viewGroup, R.layout.direct_voice_message_preview);
        C0f9.A09(-1191476954, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1307590815);
        super.onPause();
        C7GT c7gt = this.A02;
        if (c7gt == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        c7gt.A00();
        C0f9.A09(1342636045, A02);
    }
}
