package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.TransactionTooLargeException;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IdY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41704IdY {
    public InterfaceC16660sJ A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public C41704IdY(Context context, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 4);
        this.A01 = context;
        this.A02 = fragmentActivity;
        this.A03 = abstractC59962oe;
        this.A04 = userSession;
        this.A00 = JEV.A00;
        this.A05 = C1XM.A00(new C29891DGf(this, 6));
        this.A07 = C1XM.A00(new C29891DGf(this, 8));
        this.A06 = C1XM.A00(new C29891DGf(this, 7));
    }

    public static final void A00(Bundle bundle, C22P c22p, C41704IdY c41704IdY, boolean z) {
        C6XJ A02;
        AbstractC59962oe abstractC59962oe;
        if (z) {
            C8JX.A00(c41704IdY.A04).A00(c22p, null);
        }
        try {
            UserSession userSession = c41704IdY.A04;
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36315786733686325L);
            String A00 = AbstractC111324zv.A00(29);
            if (!A06) {
                A02 = C6XJ.A02(c41704IdY.A02, bundle, userSession, TransparentModalActivity.class, "clips_camera");
                A02.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
                abstractC59962oe = c41704IdY.A03;
                C14360o3.A0C(abstractC59962oe, A00);
            } else {
                A02 = C6XJ.A02(c41704IdY.A02, bundle, userSession, ModalActivity.class, "clips_camera");
                A02.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
                abstractC59962oe = c41704IdY.A03;
                C14360o3.A0C(abstractC59962oe, A00);
            }
            A02.A0D(abstractC59962oe, 9587);
        } catch (TransactionTooLargeException unused) {
            if (z) {
                C8JX.A00(c41704IdY.A04).A02(AbstractC111324zv.A00(5505));
            }
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("ClipsMidcardViewBinderDelegate:navigateToCamera: Failed to pass the media list into camera due to TransactionTooLarge for %s", c22p.name());
            C14360o3.A07(formatStrLocaleSafe);
            AbstractC12120kG.A0I(formatStrLocaleSafe, null, AbstractC06930Yk.A0E());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.6ab] */
    public final void A06(C38321qM c38321qM, String str) {
        UserSession userSession = this.A04;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            Reel A0J = C1OU.A04(userSession).A0J(new C1N9(A2E), str, AbstractC166987dD.A1J(c38321qM), C14360o3.A0K(A2E.getId(), userSession.userId));
            ReelViewerConfig A00 = ReelViewerConfig.A00();
            ?? obj = new Object();
            obj.A02(userSession, A0J.getId(), AbstractC166987dD.A1J(A0J));
            obj.A0A(AbstractC16960so.A1M(A0J.getId()));
            obj.A03 = A00;
            obj.A03(C3G2.A0P);
            AbstractC31177DnL.A1P(obj);
            obj.A01(userSession);
            obj.A04(0);
            Bundle A002 = obj.A00();
            Context context = this.A01;
            C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
            C6XJ.A01((Activity) context, A002, userSession).A0C(context);
        }
    }

    public final void A02(C22P c22p, ClipsCameraCommandAction clipsCameraCommandAction, InterfaceC88553xD interfaceC88553xD) {
        UserSession userSession = this.A04;
        Integer num = null;
        ClipsCameraCommandAction clipsCameraCommandAction2 = null;
        EnumC185548Kw enumC185548Kw = EnumC185548Kw.A05;
        C5JK c5jk = C5JK.A05;
        java.util.Set A0n = AbstractC37304Gc5.A0n(c22p);
        MusicAttributionConfig Cq1 = interfaceC88553xD.Cq1(this.A01);
        String audioAssetId = interfaceC88553xD.getAudioAssetId();
        if (clipsCameraCommandAction != null) {
            clipsCameraCommandAction2 = clipsCameraCommandAction;
            if (clipsCameraCommandAction == ClipsCameraCommandAction.A0D) {
                num = C05F.A00;
            }
        }
        AbstractC41671Ic3.A01(this.A02, ALh.A00(c22p, null, null, clipsCameraCommandAction2, null, enumC185548Kw, null, null, null, null, null, c5jk, null, null, Cq1, null, null, null, null, null, null, num, null, null, null, null, null, null, null, null, audioAssetId, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, A0n, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true), this.A03, c22p, userSession, true, false);
    }

    public final void A03(C22P c22p, C38321qM c38321qM) {
        AbstractC40927IAz.A00(this.A02, this.A03, c22p, null, this.A04, c38321qM, null, false);
    }

    public final void A04(C8JW c8jw, InterfaceC88553xD interfaceC88553xD, String str, String str2, List list) {
        UserSession userSession = this.A04;
        C62832tM A00 = AbstractC62822tL.A00(userSession);
        C14360o3.A07(A00);
        String A0j = AbstractC167017dG.A0j();
        A00.A02(A0j).A04 = list;
        AbstractC25228BEl.A1G(this.A02, AbstractC86593tX.A02(null, c8jw, AbstractC41763Iee.A00(this.A01, null, interfaceC88553xD, null, null, null, null, null, null, A0j, str, AbstractC166987dD.A1a(this.A00.invoke(list)), true), str2), userSession, ModalActivity.class, "audio_page");
    }

    public final void A05(C116875Qr c116875Qr, String str, String str2, boolean z) {
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A04;
        c116875Qr.A1D = str;
        c116875Qr.A1C = str2;
        if (z) {
            AbstractC41751IeQ.A01(fragmentActivity, c116875Qr, userSession, false);
        } else {
            C77453dV.A07(fragmentActivity, c116875Qr.A00(), userSession, false, false);
        }
    }

    public static final void A01(C22P c22p, AudioOverlayTrack audioOverlayTrack, C41704IdY c41704IdY, String str, List list) {
        if (!list.isEmpty()) {
            UserSession userSession = c41704IdY.A04;
            INH A0C = AbstractC86593tX.A0C(c22p);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC37301Gc2.A1O(userSession, (C38321qM) it.next());
            }
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String A0g = AbstractC37302Gc3.A0g(it2);
                if (A0g != null) {
                    A0q.add(A0g);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            A0C.A0g = A0q;
            A0C.A0y = true;
            if (audioOverlayTrack != null) {
                A0C.A09 = audioOverlayTrack;
            }
            if (c22p == C22P.A1W) {
                C38321qM A0x = AbstractC25225BEi.A0x(list, 0);
                C14360o3.A0B(A0x, 0);
                MusicOverlayStickerModel A03 = AbstractC101614hW.A03(null, A0x, null);
                if (A03 != null) {
                    A0C.A08 = new MusicAttributionConfig(A03);
                    A0C.A0G = A03.A0S;
                }
            }
            Bundle A00 = A0C.A00();
            if (str != null) {
                A00.putString(AbstractC111324zv.A00(80), str);
            }
            A00(A00, c22p, c41704IdY, true);
        }
    }
}
