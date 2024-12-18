package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class G4V implements InterfaceC165047Zt, InterfaceC165057Zu {
    public final Activity A00;
    public final Context A01;
    public final Fragment A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final InterfaceC1119353f A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;

    public G4V(Activity activity, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC1119353f interfaceC1119353f, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        C14360o3.A0B(fragment, 3);
        this.A04 = userSession;
        this.A00 = activity;
        this.A02 = fragment;
        this.A03 = interfaceC11380iw;
        this.A05 = interfaceC1119353f;
        this.A06 = interfaceC16820sZ;
        this.A08 = interfaceC16820sZ2;
        this.A07 = interfaceC16820sZ3;
        this.A01 = activity;
    }

    @Override // X.InterfaceC165047Zt
    public final void Cr0(String str) {
        C14360o3.A0B(str, 0);
        Context context = this.A01;
        float A0A = AbstractC13880nE.A0A(context);
        float A09 = AbstractC13880nE.A09(context);
        RectF rectF = new RectF(0.0f, 0.0f, A0A, A09);
        rectF.offsetTo(0.0f, A09);
        AbstractC35183Ffa.A03(this.A00, rectF, this.A04, str, this.A03.getModuleName());
    }

    @Override // X.InterfaceC165047Zt
    public final void Crn(C47777L8c c47777L8c, C1NB c1nb, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 0);
        C7U0 c7u0 = (C7U0) this.A06.invoke();
        if (c7u0 != null) {
            InterfaceC83713oG C7i = c7u0.C7r().C7i();
            C14360o3.A07(C7i);
            boolean z4 = C7i instanceof InterfaceC2056098k;
            ((C7KE) this.A08.invoke()).A00(c47777L8c, c1nb, new GK1(this, str, str2, str3, z, z2, z3), str, str2, z4, z4);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.GYE, java.lang.Object] */
    @Override // X.InterfaceC165047Zt
    public final void Crm(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        boolean A1a = AbstractC167017dG.A1a(str, str2);
        UserSession userSession = this.A04;
        C8J0 A00 = AbstractC185088Iz.A00(userSession, null);
        C24Q c24q = A00.A03;
        long A03 = c24q.A03(17315248, 12000L);
        A00.A02 = A03;
        c24q.A09(A03, AbstractC111324zv.A00(4381), RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        Activity activity = this.A00;
        InterfaceC1119353f interfaceC1119353f = this.A05;
        Fragment fragment = this.A02;
        String A002 = AbstractC111324zv.A00(3574);
        ?? obj = new Object();
        C22P c22p = C22P.A2V;
        AbstractC208269Jl.A00(userSession).A07(c22p, A1a);
        GF8 gf8 = new GF8(activity, fragment, c22p, userSession, null, interfaceC1119353f, obj, A002, str3, str, str2, z);
        if (!z2) {
            F9E.A00(activity, new DialogInterfaceOnClickListenerC35312Fhn(gf8), z3);
        } else {
            gf8.DlA(Collections.singletonList(Boolean.valueOf(A1a)));
        }
    }

    @Override // X.InterfaceC165057Zu
    public final void Cro(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        C006802i.A0p.markerStart(18941461);
        ((C31226Do9) this.A07.invoke()).A02(reel, C3G2.A0j, gradientSpinnerAvatarView);
    }

    @Override // X.InterfaceC165057Zu
    public final void Crp(RectF rectF, C47777L8c c47777L8c, MessageIdentifier messageIdentifier, C1NB c1nb, String str, String str2, String str3, String str4, String str5) {
        AbstractC167027dH.A12(str, str2, c1nb);
        AbstractC167007dF.A1I(messageIdentifier, 7, str5);
        C7U0 c7u0 = (C7U0) this.A06.invoke();
        if (c7u0 != null) {
            InterfaceC163837Ux C7r = c7u0.C7r();
            InterfaceC83713oG C7i = C7r.C7i();
            C14360o3.A07(C7i);
            boolean z = C7i instanceof InterfaceC2056098k;
            C3o9 B90 = C7r.B90();
            C14360o3.A07(B90);
            if (JRE.A02(B90) != null) {
                JRE.A01(B90);
            } else if (B90 instanceof MsysThreadId) {
                String.valueOf(((MsysThreadId) B90).A02);
            }
            C7r.C7f(this.A01);
            UserSession userSession = this.A04;
            C006802i.A0p.markerStart(18941461);
            C7KE c7ke = (C7KE) this.A08.invoke();
            InterfaceC11380iw interfaceC11380iw = this.A03;
            C16930sl c16930sl = C16930sl.A00;
            C14360o3.A0B(c16930sl, 10);
            c7ke.A00(c47777L8c, c1nb, new GK2(rectF, interfaceC11380iw, c7ke, str, str3, str4, c16930sl), str, str2, z, z);
            C162337Ov.A0I(interfaceC11380iw, userSession, C2EY.A1V.A00);
        }
    }
}
