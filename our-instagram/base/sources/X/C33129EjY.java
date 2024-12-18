package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.EjY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33129EjY extends AbstractC32533EUj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33129EjY(Fragment fragment, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Runnable runnable, String str, String str2, int i) {
        super(abstractC10360h2);
        this.A00 = i;
        if (1 - i != 0) {
            this.A04 = userSession;
            this.A01 = interfaceC11380iw;
            this.A06 = str;
            this.A05 = str2;
            this.A03 = fragment;
        } else {
            this.A03 = fragment;
            this.A05 = str;
            this.A06 = str2;
            this.A01 = interfaceC11380iw;
            this.A04 = userSession;
        }
        this.A02 = runnable;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1244395315);
                C9GR.A0E((Context) this.A01, "fetch_audio_permalink_failed");
                AbstractC73317Y7a.A0H((InterfaceC11380iw) this.A02, (AbstractC12990ll) this.A04, this.A05, this.A06, "copy_link", abstractC115105If.A01());
                i = 483341680;
                break;
            case 1:
                A03 = C0f9.A03(-25309798);
                ((Runnable) this.A02).run();
                AbstractC73317Y7a.A0H((InterfaceC11380iw) this.A01, (AbstractC12990ll) this.A04, this.A05, this.A06, "system_share_sheet", abstractC115105If.A01());
                C9GR.A0E(AbstractC31172DnG.A07(this.A03), "share_audio_failed");
                i = -704915296;
                break;
            case 2:
                A03 = C0f9.A03(-1014532926);
                AbstractC73317Y7a.A0H((InterfaceC11380iw) this.A01, (AbstractC12990ll) this.A04, this.A06, this.A05, "system_share_sheet", abstractC115105If.A01());
                C9GR.A0E(AbstractC31172DnG.A07(this.A03), "share_location_failed");
                i = 1365603075;
                break;
            default:
                A03 = C0f9.A03(-775630613);
                UserSession userSession = (UserSession) this.A04;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
                String str = this.A06;
                AbstractC73317Y7a.A0H(interfaceC11380iw, userSession, str, "live_action_sheet", "system_share_sheet", abstractC115105If.A01());
                AbstractC31510Dsu.A0W(interfaceC11380iw, userSession, str, "live_action_sheet", "system_share_sheet", AbstractC31171DnF.A0g(this.A03), null);
                i = -29192741;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1991185389);
                C32173EBu c32173EBu = (C32173EBu) obj;
                int A032 = C0f9.A03(759820474);
                AbstractC73317Y7a.A0J((InterfaceC11380iw) this.A02, (UserSession) this.A04, this.A05, this.A06, "copy_link", c32173EBu.A00);
                Context context = (Context) this.A01;
                String str = c32173EBu.A00;
                View view = (View) this.A03;
                AbstractC13900nG.A00(context, str);
                AbstractC34301FAv.A00(context, view, null, true);
                C0f9.A0A(-642093502, A032);
                i = 209298543;
                break;
            case 1:
                A03 = C0f9.A03(798481295);
                int A033 = C0f9.A03(1815145838);
                Bundle A0b = AbstractC166987dD.A0b();
                String str2 = ((C32173EBu) obj).A00;
                A0b.putString("android.intent.extra.TEXT", str2);
                FragmentActivity A09 = AbstractC31171DnF.A09(this.A03);
                String str3 = this.A05;
                String str4 = this.A06;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                UserSession userSession = (UserSession) this.A04;
                HashMap A0o = AbstractC31180DnO.A0o(str2);
                A0o.put("audio_id", str3);
                A0o.put("share_surface", str4);
                AbstractC31510Dsu.A0Q(A09, A0b, interfaceC11380iw, userSession, "share_to_system_sheet", A0o);
                if (!AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36323878452080296L).booleanValue()) {
                    AbstractC73317Y7a.A0J(interfaceC11380iw, userSession, str3, str4, "system_share_sheet", str2);
                }
                ((Runnable) this.A02).run();
                C0f9.A0A(1579579407, A033);
                i = 789832377;
                break;
            case 2:
                A03 = C0f9.A03(-354754076);
                C32178EBz c32178EBz = (C32178EBz) obj;
                int A034 = C0f9.A03(62571055);
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putString("android.intent.extra.TEXT", c32178EBz.A00);
                String str5 = c32178EBz.A00;
                FragmentActivity A092 = AbstractC31171DnF.A09(this.A03);
                String str6 = this.A06;
                String str7 = this.A05;
                InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A01;
                UserSession userSession2 = (UserSession) this.A04;
                HashMap A0o2 = AbstractC31180DnO.A0o(str5);
                A0o2.put("media_id", str6);
                A0o2.put("share_surface", str7);
                AbstractC31510Dsu.A0Q(A092, A0b2, interfaceC11380iw2, userSession2, "share_to_system_sheet", A0o2);
                AbstractC73317Y7a.A0J(interfaceC11380iw2, userSession2, str6, str7, "system_share_sheet", str5);
                Runnable runnable = (Runnable) this.A02;
                if (runnable != null) {
                    runnable.run();
                }
                C0f9.A0A(-1566380505, A034);
                i = -996092644;
                break;
            default:
                A03 = C0f9.A03(-815528938);
                int A035 = C0f9.A03(-963799030);
                String str8 = ((C32177EBy) obj).A00;
                String str9 = this.A06;
                User user = (User) this.A03;
                String id = user.getId();
                InterfaceC11380iw interfaceC11380iw3 = (InterfaceC11380iw) this.A02;
                UserSession userSession3 = (UserSession) this.A04;
                AbstractC31510Dsu.A0W(interfaceC11380iw3, userSession3, str9, "live_action_sheet", "system_share_sheet", id, str8);
                AbstractC31510Dsu.A02((Activity) this.A01, AbstractC31180DnO.A03(str8), interfaceC11380iw3, userSession3, user, null, "share_to_system_sheet", str8, this.A05, "live_action_sheet", true, false);
                AbstractC73317Y7a.A0J(interfaceC11380iw3, userSession3, str9, "live_action_sheet", "system_share_sheet", str8);
                C0f9.A0A(-186195835, A035);
                i = -66452076;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33129EjY(AbstractC10360h2 abstractC10360h2, Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        super(abstractC10360h2);
        this.A00 = i;
        this.A04 = obj4;
        this.A02 = obj3;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = obj;
        this.A03 = obj2;
    }
}
