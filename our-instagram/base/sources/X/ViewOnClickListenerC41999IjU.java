package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.RIXUCtaType;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* renamed from: X.IjU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41999IjU implements View.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C65722yA A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C76403bk A03;
    public final /* synthetic */ C60R A04;
    public final /* synthetic */ C62812tK A05;

    public ViewOnClickListenerC41999IjU(Fragment fragment, C65722yA c65722yA, UserSession userSession, C76403bk c76403bk, C60R c60r, C62812tK c62812tK) {
        this.A02 = userSession;
        this.A05 = c62812tK;
        this.A03 = c76403bk;
        this.A04 = c60r;
        this.A01 = c65722yA;
        this.A00 = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-952855689);
        UserSession userSession = this.A02;
        C62812tK c62812tK = this.A05;
        C76403bk c76403bk = this.A03;
        C60R c60r = this.A04;
        C65722yA c65722yA = this.A01;
        Fragment fragment = this.A00;
        RIXUCtaType rIXUCtaType = c76403bk.A08;
        if (rIXUCtaType == null) {
            rIXUCtaType = RIXUCtaType.A07;
        }
        if (rIXUCtaType == RIXUCtaType.A06) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, C24H.TEMPLATE_NETEGO);
            Context context = c62812tK.A01;
            AbstractC31171DnF.A1P(context);
            AbstractC40914IAm.A00((Activity) context, context, A0b, userSession);
        } else if (AbstractC166987dD.A1b(c76403bk.A0M)) {
            ClipsViewerSource A01 = c76403bk.A01();
            String id = ((C111034zF) c76403bk.A0M.get(0)).A00.getId();
            if (id != null) {
                List A07 = AbstractC128065qa.A07(c76403bk.A0M);
                String id2 = c76403bk.getId();
                C111074zO c111074zO = c76403bk.A04;
                String str = c76403bk.A0S;
                Integer valueOf = Integer.valueOf(c60r.A00);
                boolean z = c76403bk.A0N;
                boolean z2 = c76403bk.A0Q;
                c62812tK.A00(fragment, c76403bk.A00(), c111074zO, A01, null, null, null, valueOf, c76403bk.A0D, id, id2, str, null, null, A07, z, z2, false);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        if (c76403bk.A0P) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c65722yA.A01, AbstractC111324zv.A00(2563));
            if (A0f.isSampled() && c65722yA.A04.add(c76403bk.getId())) {
                A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c76403bk.A03.toString());
                AbstractC31171DnF.A1C(A0f, AbstractC111324zv.A00(2221));
                AbstractC37301Gc2.A15(A0f, c65722yA.A00);
                A0f.A9K("ig_userid", AbstractC25228BEl.A13(c65722yA.A02.userId));
                A0f.AAP("netego_id", c76403bk.getId());
                AbstractC37300Gc1.A0o(A0f, c76403bk.A0F);
                A0f.Cht();
            }
        }
        C0f9.A0C(-1394398785, A05);
    }
}
