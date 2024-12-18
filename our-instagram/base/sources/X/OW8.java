package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.video.live.mvvm.view.postlive.IgLiveExploreLiveBaseFragment;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.List;

/* loaded from: classes9.dex */
public final class OW8 {
    public View A00;
    public View A01;
    public C142846ck A02;
    public OL4 A03;
    public C3PO A04;
    public IgLiveExploreLiveBaseFragment A05;
    public C56806PIx A06;
    public String A07;
    public String A08;
    public String A09;
    public IgdsMediaButton A0A;
    public IgdsMediaButton A0B;
    public final Context A0C;
    public final ViewStub A0E;
    public final UserSession A0G;
    public final C3DN A0H;
    public final ViewStub A0I;
    public final AbstractC59962oe A0J;
    public final DialogInterface.OnClickListener A0D = DialogInterfaceOnClickListenerC55320Ogi.A00(this, 54);
    public final InterfaceC41501vz A0F = C56034Ou6.A00(this, 35);

    public final void A01(PJC pjc) {
        View view = this.A00;
        if (view == null) {
            View inflate = this.A0I.inflate();
            this.A00 = inflate;
            this.A0B = (IgdsMediaButton) inflate.requireViewById(R.id.iglive_end_confirmation);
            this.A0A = (IgdsMediaButton) this.A00.requireViewById(R.id.iglive_end_cancel);
            AbstractC56952jT.A01(this.A0B);
            AbstractC56952jT.A01(this.A0A);
            ViewOnClickListenerC55468OkN.A00(this.A0B, 52, this, pjc);
            ViewOnClickListenerC55463OkI.A00(this.A0A, 0, this);
        } else {
            view.setVisibility(0);
        }
        this.A00.setImportantForAccessibility(2);
        TextView A0T = AbstractC166997dE.A0T(this.A00, R.id.iglive_end_live_video_ended_text_alternate);
        AbstractC56932jR.A06(A0T, 500L);
        AbstractC56932jR.A07(A0T, A0T.getText());
    }

    public OW8(View view, View view2, AbstractC59962oe abstractC59962oe, UserSession userSession, OL4 ol4, C3PO c3po, String str, String str2) {
        this.A0J = abstractC59962oe;
        this.A0G = userSession;
        Context context = abstractC59962oe.getContext();
        this.A0C = context;
        this.A0E = AbstractC31171DnF.A07(view, R.id.iglive_capture_rights_manager_end_screen_stub);
        this.A0I = AbstractC31171DnF.A07(view, R.id.iglive_capture_end_confirmation_stub);
        this.A01 = view2;
        this.A0H = C3DN.A00.A01(context);
        this.A04 = c3po;
        this.A08 = str;
        this.A09 = str2;
        this.A03 = ol4;
        this.A02 = AbstractC147806l5.A00(userSession);
    }

    public static void A00(OW8 ow8, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel, String str, String str2, String str3, String str4, List list, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        UserSession userSession;
        View view;
        boolean z6;
        AbstractC55106ObM A00;
        System.nanoTime();
        if (ow8.A05 == null) {
            C4M5.A00();
            userSession = ow8.A0G;
            Context context = ow8.A0C;
            view = ow8.A01;
            boolean A1b = AbstractC166987dD.A1b(list);
            C3PO c3po = ow8.A04;
            C190298bn A01 = C190298bn.A03.A01(ow8.A03.A06);
            if (A01 != null && (A00 = A01.A00()) != null) {
                z6 = A00.A0L();
            } else {
                z6 = true;
            }
            C14360o3.A0B(userSession, 0);
            AbstractC167027dH.A0a(1, context, view, str, str2);
            Bundle A0E = AbstractC31174DnI.A0E(c3po, 12);
            A0E.putBoolean("ARG_IS_POLICY_VIOLATION", z);
            A0E.putBoolean("ARG_IS_CONTNET_MONETIZATION_POLICY_VIOLATION", z2);
            A0E.putBoolean("ARG_HAS_BRAND_PARTNERS", A1b);
            A0E.putString("ARG_SOURCE_BROADCAST_ID", str);
            A0E.putString("ARG_SOURCE_MEDIA_ID", str2);
            A0E.putString("ARG_SOURCE_THREAD_ID", str3);
            A0E.putBoolean("ARG_IS_SSI_CHECKPOINTED", z3);
            A0E.putBoolean("ARG_IS_LIVE_BLOCKED", z4);
            A0E.putString("ARG_LIVE_VISIBILITY_MODE", c3po.A01);
            A0E.putLong("ARG_LIVE_DURATION_MS", j);
            A0E.putString("ARG_LIVE_TITLE", str4);
            A0E.putLong("ARG_LIVE_CREATION_DATE", j2);
            A0E.putBoolean("ARG_IS_MODERATED_SESSION", z5);
            A0E.putBoolean("ARG_ARE_GLASSES_IN_USE", !z6);
            if (existingStandaloneFundraiserForFeedModel != null) {
                A0E.putParcelable("ARG_FUNDRAISER_INFO", existingStandaloneFundraiserForFeedModel);
            }
            C4M5.A00();
            C52834NZr c52834NZr = new C52834NZr();
            c52834NZr.setArguments(A0E);
            C14360o3.A0C(c52834NZr, "null cannot be cast to non-null type com.instagram.video.live.mvvm.view.postlive.IgLivePostLiveBroadcasterFragment");
            C54770OIj c54770OIj = new C54770OIj(userSession);
            c54770OIj.A00(context, view, c52834NZr);
            c52834NZr.A04 = c54770OIj;
            ow8.A05 = c52834NZr;
            ((IgLiveExploreLiveBaseFragment) c52834NZr).A00 = new O67(ow8);
        } else {
            userSession = ow8.A0G;
            C54770OIj c54770OIj2 = new C54770OIj(userSession);
            IgLiveExploreLiveBaseFragment igLiveExploreLiveBaseFragment = ow8.A05;
            if (igLiveExploreLiveBaseFragment instanceof C52834NZr) {
                PIy pIy = ((C52834NZr) igLiveExploreLiveBaseFragment).A03;
                if (pIy != null) {
                    PIy.A04(pIy);
                }
                C52834NZr c52834NZr2 = (C52834NZr) ow8.A05;
                c52834NZr2.A04 = c54770OIj2;
                c52834NZr2.A0A = z5;
                PIy pIy2 = c52834NZr2.A03;
                if (pIy2 != null) {
                    pIy2.A05 = z5;
                    PIy.A04(pIy2);
                }
            }
            Context context2 = ow8.A0C;
            IgLiveExploreLiveBaseFragment igLiveExploreLiveBaseFragment2 = ow8.A05;
            view = ow8.A01;
            c54770OIj2.A00(context2, view, igLiveExploreLiveBaseFragment2);
        }
        AbstractC25651Mw.A00(userSession).A01(ow8.A0F, C56011Oti.class);
        view.setOnTouchListener(new ViewOnTouchListenerC48080LQf(ow8, existingStandaloneFundraiserForFeedModel, str2, str3, str4, list, j, j2, z, z2, z3, z4, z5));
    }
}
