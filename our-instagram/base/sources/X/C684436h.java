package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.36h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C684436h implements InterfaceC684536i {
    public static boolean A02;
    public final Activity A00;
    public final UserSession A01;

    public C684436h(Activity activity, UserSession userSession) {
        C14360o3.A0B(activity, 1);
        C14360o3.A0B(userSession, 2);
        this.A00 = activity;
        this.A01 = userSession;
    }

    public final void A00(AbstractC59962oe abstractC59962oe, EnumC33409Epg enumC33409Epg, int i, boolean z) {
        C14360o3.A0B(abstractC59962oe, 0);
        Bundle bundle = new Bundle();
        bundle.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC33409Epg);
        bundle.putString(AbstractC111324zv.A00(258), "not_eligible");
        bundle.putBoolean(AbstractC111324zv.A00(2907), z);
        C6XJ c6xj = new C6XJ(abstractC59962oe.getRootActivity(), bundle, this.A01, ModalActivity.class, AbstractC111324zv.A00(39));
        c6xj.A07();
        c6xj.A0D(abstractC59962oe, i);
    }

    public final void A01(InterfaceC11380iw interfaceC11380iw, C1GL c1gl, FL3 fl3, User user, boolean z) {
        List list;
        C14360o3.A0B(interfaceC11380iw, 3);
        List A1N = AbstractC16960so.A1N(user.getId());
        UserSession userSession = this.A01;
        if (z) {
            list = A1N;
            A1N = C16930sl.A00;
        } else {
            list = C16930sl.A00;
        }
        C1ON A00 = AbstractC34038F0r.A00(interfaceC11380iw, userSession, list, A1N);
        A00.A00 = new ETI(this, fl3, user, z);
        c1gl.schedule(A00);
    }

    public final void A02(InterfaceC11380iw interfaceC11380iw, C1GL c1gl, C34670FPf c34670FPf, User user, Integer num) {
        C14360o3.A0B(interfaceC11380iw, 2);
        C1ON A01 = AbstractC34375FDr.A00.A01(interfaceC11380iw, this.A01, num, AbstractC16960so.A1N(user.getId()), new ArrayList());
        A01.A00 = new ETB(this, c34670FPf, user);
        c1gl.schedule(A01);
    }

    public final void A03(InterfaceC11380iw interfaceC11380iw, C1GL c1gl, User user, Integer num) {
        C14360o3.A0B(user, 1);
        A02(interfaceC11380iw, c1gl, null, user, num);
    }

    @Override // X.InterfaceC684536i
    public final void Cgk(EnumC33409Epg enumC33409Epg, boolean z, boolean z2) {
        C14360o3.A0B(enumC33409Epg, 0);
        AbstractC35049FcM.A01(this.A00, enumC33409Epg, this.A01, z, z2);
    }

    @Override // X.InterfaceC684536i
    public final void FD8(C1GL c1gl, String str) {
        C25621Ms c25621Ms = new C25621Ms(this.A01, -2);
        c25621Ms.A05();
        c25621Ms.A0B(AbstractC13670mt.A06(MSV.A00(56), str));
        c25621Ms.A9s("audience", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        c25621Ms.A0R(N3N.class, C41349IRu.class);
        c25621Ms.A0R = true;
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C32488ESo(this);
        c1gl.schedule(A0N);
    }

    public final void A04(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("event_source", str3);
        bundle.putString(AbstractC111324zv.A00(2315), str);
        bundle.putString("ranking_session_id", str2);
        UserSession userSession = this.A01;
        Activity activity = this.A00;
        C6XJ c6xj = new C6XJ(activity, bundle, userSession, ModalActivity.class, "feed_favorites");
        c6xj.A08();
        c6xj.A0C(activity);
    }

    @Override // X.InterfaceC684536i
    public final void Cgi() {
        AbstractC35049FcM.A00(this.A00, null, this.A01);
    }

    @Override // X.InterfaceC684536i
    public final void D85(String str) {
        UserSession userSession = this.A01;
        Bundle A00 = AbstractC86593tX.A0C(C22P.A1x).A00();
        Activity activity = this.A00;
        C6XJ A022 = C6XJ.A02(activity, A00, userSession, TransparentModalActivity.class, "clips_camera");
        A022.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
        A022.A0C(activity);
    }
}
