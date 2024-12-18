package X;

import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.7IR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7IR {
    public final C41761wQ A00;
    public final UserSession A01;
    public final C7IP A02;
    public final C7TH A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;
    public final C47747L6q A09;

    public C7IR(UserSession userSession, C7IP c7ip, C47747L6q c47747L6q, C7TH c7th, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c7th, 2);
        C14360o3.A0B(interfaceC16820sZ2, 5);
        C14360o3.A0B(interfaceC16820sZ3, 6);
        C14360o3.A0B(interfaceC16820sZ4, 7);
        C14360o3.A0B(interfaceC16820sZ5, 8);
        this.A01 = userSession;
        this.A03 = c7th;
        this.A02 = c7ip;
        this.A08 = interfaceC16820sZ;
        this.A07 = interfaceC16820sZ2;
        this.A05 = interfaceC16820sZ3;
        this.A04 = interfaceC16820sZ4;
        this.A06 = interfaceC16820sZ5;
        this.A09 = c47747L6q;
        this.A00 = new C41761wQ(AbstractC142856cl.A01);
    }

    public final void A01(Context context, MessageIdentifier messageIdentifier, List list) {
        C47588Kzy c47588Kzy;
        C14360o3.A0B(list, 0);
        C14360o3.A0B(messageIdentifier, 1);
        C14360o3.A0B(context, 2);
        C3o9 c3o9 = (C3o9) this.A07.invoke();
        if (c3o9 != null) {
            C7TH c7th = this.A03;
            boolean booleanValue = ((Boolean) this.A04.invoke()).booleanValue();
            String A00 = this.A02.A00();
            C47747L6q c47747L6q = this.A09;
            if (c47747L6q != null) {
                c47588Kzy = c47747L6q.A00();
            } else {
                c47588Kzy = null;
            }
            this.A00.A02(c7th.ENg(c47588Kzy, messageIdentifier, c3o9, A00, list, booleanValue), new GJq(context, this));
        }
    }

    public final void A02(C50679MYx c50679MYx, L7G l7g, AnonymousClass442 anonymousClass442, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, boolean z) {
        C14360o3.A0B(str, 0);
        this.A00.A02(A00(c50679MYx, l7g, anonymousClass442, num, num2, num3, l, str, str2, str3, this.A02.A00(), str4, z), new C36790GJn(this));
    }

    public final void A05(C26086BgF c26086BgF, String str, String str2, List list) {
        C47588Kzy c47588Kzy;
        C14360o3.A0B(list, 0);
        C14360o3.A0B(str, 1);
        C3o9 c3o9 = (C3o9) this.A07.invoke();
        if (c3o9 != null) {
            C7TH c7th = this.A03;
            boolean booleanValue = ((Boolean) this.A04.invoke()).booleanValue();
            String A00 = this.A02.A00();
            C47747L6q c47747L6q = this.A09;
            if (c47747L6q != null) {
                c47588Kzy = c47747L6q.A00();
            } else {
                c47588Kzy = null;
            }
            this.A00.A02(c7th.ENn(c26086BgF, c47588Kzy, c3o9, A00, str, str2, list, booleanValue), new C36789GJm(this));
        }
    }

    public final C42221xC A00(C50679MYx c50679MYx, L7G l7g, AnonymousClass442 anonymousClass442, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, boolean z) {
        C47588Kzy c47588Kzy;
        String str6 = str4;
        C7TH c7th = this.A03;
        InterfaceC83713oG interfaceC83713oG = (InterfaceC83713oG) this.A08.invoke();
        List list = (List) this.A05.invoke();
        boolean booleanValue = ((Boolean) this.A04.invoke()).booleanValue();
        if (C14360o3.A0K(str2, "ai_bot_quick_reply_payload")) {
            str6 = "ai_suggested_prompt_tray";
        } else if (C14360o3.A0K(str2, "ai_bot_icebreaker")) {
            str6 = "ai_suggested_prompt_icebreaker";
        }
        C47747L6q c47747L6q = this.A09;
        if (c47747L6q != null) {
            c47588Kzy = c47747L6q.A00();
        } else {
            c47588Kzy = null;
        }
        return c7th.EOa(c50679MYx, l7g, anonymousClass442, c47588Kzy, null, C2EY.A1i, interfaceC83713oG, null, null, num, num2, num3, l, str, NetInfoModule.CONNECTION_TYPE_NONE, str6, str2, null, str3, str5, list, booleanValue, false, false, z);
    }

    public final void A03(C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, ClipInfo clipInfo, C47Z c47z, String str, String str2, String str3, String str4, boolean z) {
        String str5 = str3;
        C14360o3.A0B(clipInfo, 0);
        C3o9 c3o9 = (C3o9) this.A07.invoke();
        if (c3o9 != null) {
            C47588Kzy c47588Kzy = null;
            if (C18U.A06(C06090Tz.A05, this.A01, 36323968646917873L)) {
                try {
                    C7TH c7th = this.A03;
                    List list = (List) this.A05.invoke();
                    if (str3 == null) {
                        str5 = this.A02.A00();
                    }
                    C47747L6q c47747L6q = this.A09;
                    if (c47747L6q != null) {
                        c47588Kzy = c47747L6q.A00();
                    }
                    c7th.EOj(null, c26086BgF, anonymousClass442, c47588Kzy, c3o9, clipInfo, c47z, str, str5, null, str2, str4, list, z);
                    return;
                } catch (Exception e) {
                    C0w9.A07("DirectSendController_sendVideoSync", e);
                    this.A06.invoke();
                    return;
                }
            }
            C7TH c7th2 = this.A03;
            List list2 = (List) this.A05.invoke();
            if (str3 == null) {
                str5 = this.A02.A00();
            }
            C47747L6q c47747L6q2 = this.A09;
            if (c47747L6q2 != null) {
                c47588Kzy = c47747L6q2.A00();
            }
            AbstractRunnableC45364K5x.A01(new LWE(new C50359MLl(this, 18)), c7th2.EOh(null, c26086BgF, anonymousClass442, c47588Kzy, c3o9, clipInfo, c47z, str, str5, null, str2, str4, list2, z), new Executor() { // from class: X.B1g
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    C14360o3.A0B(runnable, 0);
                    C11T.A02(runnable);
                }
            });
        }
    }

    public final void A04(C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3) {
        String str4 = str2;
        C3o9 c3o9 = (C3o9) this.A07.invoke();
        if (c3o9 != null) {
            C47588Kzy c47588Kzy = null;
            if (C18U.A06(C06090Tz.A05, this.A01, 36323968646917873L)) {
                try {
                    C7TH c7th = this.A03;
                    List list = (List) this.A05.invoke();
                    boolean booleanValue = ((Boolean) this.A04.invoke()).booleanValue();
                    if (str2 == null) {
                        str4 = this.A02.A00();
                    }
                    C47747L6q c47747L6q = this.A09;
                    if (c47747L6q != null) {
                        c47588Kzy = c47747L6q.A00();
                    }
                    c7th.EO1(null, c26086BgF, anonymousClass442, c47588Kzy, c3o9, c47z, c183978Ee, str4, null, str, str3, list, booleanValue);
                    return;
                } catch (Exception e) {
                    C0w9.A07("DirectSendController_sendPhotoSync", e);
                    this.A06.invoke();
                    return;
                }
            }
            C7TH c7th2 = this.A03;
            List list2 = (List) this.A05.invoke();
            boolean booleanValue2 = ((Boolean) this.A04.invoke()).booleanValue();
            if (str2 == null) {
                str4 = this.A02.A00();
            }
            C47747L6q c47747L6q2 = this.A09;
            if (c47747L6q2 != null) {
                c47588Kzy = c47747L6q2.A00();
            }
            AbstractRunnableC45364K5x.A01(new LWE(new C50359MLl(this, 17)), c7th2.ENz(null, c26086BgF, anonymousClass442, c47588Kzy, c3o9, c47z, c183978Ee, str4, null, str, str3, list2, booleanValue2), new Executor() { // from class: X.B1f
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    C14360o3.A0B(runnable, 0);
                    C11T.A02(runnable);
                }
            });
        }
    }
}
