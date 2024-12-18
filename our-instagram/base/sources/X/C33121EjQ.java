package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;

/* renamed from: X.EjQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33121EjQ extends AbstractC32533EUj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33121EjQ(AbstractC10360h2 abstractC10360h2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        super(abstractC10360h2);
        this.A00 = i;
        this.A04 = obj5;
        this.A07 = str;
        this.A01 = obj;
        this.A06 = obj2;
        this.A02 = obj3;
        this.A05 = obj4;
        this.A03 = obj6;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(573526928);
                C9GR.A0E((Context) this.A01, "fetch_hashtag_permalink_failed");
                Hashtag hashtag = (Hashtag) this.A05;
                if (hashtag.getId() != null) {
                    AbstractC73317Y7a.A0H((InterfaceC11380iw) this.A02, (AbstractC12990ll) this.A03, hashtag.getId(), "hashtag_page_overflow_menu", this.A07, abstractC115105If.A01());
                }
                i = 508009100;
                break;
            case 1:
                A03 = C0f9.A03(-1832450537);
                Runnable runnable = (Runnable) this.A03;
                if (runnable != null) {
                    runnable.run();
                }
                i = -396465814;
                break;
            default:
                A03 = C0f9.A03(-709511283);
                Runnable runnable2 = (Runnable) this.A02;
                if (runnable2 != null) {
                    runnable2.run();
                }
                UserSession userSession = (UserSession) this.A06;
                InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) this.A03;
                String str = ((C41181vS) this.A04).A0j;
                String str2 = this.A07;
                AbstractC73317Y7a.A0H(interfaceC60442pS, userSession, str, str2, "system_share_sheet", abstractC115105If.A01());
                AbstractC31510Dsu.A0X(userSession, interfaceC60442pS, str, str2, "system_share_sheet", AbstractC31171DnF.A0g(this.A05), null);
                i = 962459576;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1875975527);
                C32175EBw c32175EBw = (C32175EBw) obj;
                int A032 = C0f9.A03(1908513259);
                C2n2 c2n2 = (C2n2) this.A04;
                String str = c32175EBw.A00;
                if (str != null) {
                    c2n2.apply(str);
                    Hashtag hashtag = (Hashtag) this.A05;
                    if (hashtag.getId() != null && AbstractC166987dD.A1a(this.A06)) {
                        UserSession userSession = (UserSession) this.A03;
                        InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
                        String id = hashtag.getId();
                        String str2 = this.A07;
                        String str3 = c32175EBw.A00;
                        if (str3 != null) {
                            AbstractC73317Y7a.A0J(interfaceC11380iw, userSession, id, "hashtag_page_overflow_menu", str2, str3);
                        }
                    }
                    C0f9.A0A(1656901086, A032);
                    i = 1910296184;
                    C0f9.A0A(i, A03);
                    return;
                }
                C14360o3.A0F("hashtagUrl");
                throw C00O.createAndThrow();
            case 1:
                A03 = C0f9.A03(-1622668168);
                C32183ECe c32183ECe = (C32183ECe) obj;
                int A033 = C0f9.A03(1767286332);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("android.intent.extra.TEXT", c32183ECe.A00);
                EnumC33425Epw enumC33425Epw = (EnumC33425Epw) this.A04;
                switch (enumC33425Epw.ordinal()) {
                    case 1:
                    case 4:
                    case 7:
                    case 10:
                    case 11:
                    case 14:
                        String str4 = enumC33425Epw.A04;
                        String str5 = enumC33425Epw.A03;
                        boolean z = enumC33425Epw.A06;
                        AbstractC31510Dsu.A0N((Context) this.A01, null, A0b, (InterfaceC11380iw) this.A02, (AbstractC12990ll) this.A05, str4, str5, new GS6(this, c32183ECe, 5), false, z);
                        break;
                    case 2:
                        Context context = (Context) this.A01;
                        String str6 = c32183ECe.A00;
                        View view = (View) this.A06;
                        AbstractC13900nG.A00(context, str6);
                        AbstractC34301FAv.A00(context, view, null, true);
                        break;
                    case 9:
                        AbstractC31510Dsu.A0Q((Context) this.A01, A0b, (InterfaceC11380iw) this.A02, (AbstractC12990ll) this.A05, "share_to_system_sheet", new GS6(this, c32183ECe, 4));
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        AbstractC35101FdC.A02((Context) this.A01, this.A07, c32183ECe.A00);
                        break;
                }
                Runnable runnable = (Runnable) this.A03;
                if (runnable != null) {
                    runnable.run();
                }
                C0f9.A0A(-1411075258, A033);
                i = 1248436470;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = C0f9.A03(851837239);
                EC2 ec2 = (EC2) obj;
                int A034 = C0f9.A03(-1675724820);
                Runnable runnable2 = (Runnable) this.A02;
                if (runnable2 != null) {
                    runnable2.run();
                }
                String str7 = ec2.A00;
                C41181vS c41181vS = (C41181vS) this.A04;
                String str8 = c41181vS.A0j;
                String str9 = this.A07;
                User user = (User) this.A05;
                String id2 = user.getId();
                InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) this.A03;
                UserSession userSession2 = (UserSession) this.A06;
                AbstractC31510Dsu.A0X(userSession2, interfaceC60442pS, str8, str9, "system_share_sheet", id2, str7);
                AbstractC31510Dsu.A03((Activity) this.A01, AbstractC31180DnO.A03(str7), userSession2, interfaceC60442pS, user, null, "share_to_system_sheet", str7, c41181vS.A0k, str8, str9, true, false);
                if (!AbstractC166997dE.A0c(C06090Tz.A05, userSession2, 36323878452080296L).booleanValue()) {
                    AbstractC73317Y7a.A0J(interfaceC60442pS, userSession2, str8, str9, "system_share_sheet", str7);
                }
                C0f9.A0A(889679319, A034);
                i = -1072322573;
                C0f9.A0A(i, A03);
                return;
        }
    }
}
