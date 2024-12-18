package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.EjU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33125EjU extends AbstractC32533EUj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33125EjU(AbstractC10360h2 abstractC10360h2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        super(abstractC10360h2);
        this.A00 = i;
        this.A09 = str;
        this.A08 = str2;
        this.A0B = z;
        this.A01 = obj;
        this.A06 = str3;
        this.A07 = str4;
        this.A02 = obj3;
        this.A05 = obj4;
        this.A03 = obj5;
        this.A0A = str5;
        this.A04 = obj2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(1866769942);
            ((Runnable) this.A03).run();
            AbstractC73317Y7a.A0H((InterfaceC11380iw) this.A02, (AbstractC12990ll) this.A05, this.A06, this.A07, this.A0A, abstractC115105If.A01());
            C9GR.A0E((Context) this.A04, "share_audio_via_app_failed");
            i = -1079741982;
        } else {
            A03 = C0f9.A03(-1733737449);
            User user = (User) this.A04;
            Activity activity = (Activity) this.A01;
            UserSession userSession = (UserSession) this.A05;
            boolean z = this.A0B;
            String str = this.A06;
            InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
            String str2 = this.A07;
            String str3 = this.A08;
            Runnable runnable = (Runnable) this.A03;
            String str4 = this.A09;
            Throwable A01 = abstractC115105If.A01();
            AbstractC31510Dsu.A0L(activity, interfaceC11380iw, userSession, user, runnable, AbstractC31178DnM.A0e(user), str, str2, str3, z);
            AbstractC73317Y7a.A0H(interfaceC11380iw, userSession, user.getId(), str, str4, A01);
            i = 1434106108;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(2000973272);
            int A032 = C0f9.A03(816839587);
            String str = ((C32173EBu) obj).A00;
            Bundle A033 = AbstractC31180DnO.A03(str);
            String str2 = this.A09;
            String str3 = this.A08;
            boolean z = this.A0B;
            Context context = (Context) this.A01;
            String str4 = this.A06;
            String str5 = this.A07;
            InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
            UserSession userSession = (UserSession) this.A05;
            HashMap A0o = AbstractC31180DnO.A0o(str);
            A0o.put("audio_id", str4);
            A0o.put("share_surface", str5);
            AbstractC31510Dsu.A0N(context, null, A033, interfaceC11380iw, userSession, str2, str3, A0o, false, z);
            ((Runnable) this.A03).run();
            AbstractC73317Y7a.A0J(interfaceC11380iw, userSession, str4, str5, this.A0A, str);
            C0f9.A0A(116378040, A032);
            i = -1141626351;
        } else {
            A03 = C0f9.A03(-365372267);
            int A034 = C0f9.A03(-1534954569);
            String str6 = ((EC1) obj).A00;
            Activity activity = (Activity) this.A01;
            User user = (User) this.A04;
            UserSession userSession2 = (UserSession) this.A05;
            boolean z2 = this.A0B;
            String str7 = this.A06;
            InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A02;
            AbstractC31510Dsu.A0L(activity, interfaceC11380iw2, userSession2, user, (Runnable) this.A03, str6, str7, this.A07, this.A08, z2);
            String id = user.getId();
            String str8 = this.A09;
            String str9 = this.A0A;
            AbstractC167017dG.A1N(userSession2, interfaceC11380iw2);
            C14360o3.A0B(str8, 4);
            AbstractC73317Y7a.A0I(interfaceC11380iw2, userSession2, null, id, str7, str8, str6, null, null, str9, null);
            C0f9.A0A(-1164898466, A034);
            i = -536166559;
        }
        C0f9.A0A(i, A03);
    }
}
