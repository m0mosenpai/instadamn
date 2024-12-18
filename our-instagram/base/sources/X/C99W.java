package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.99W, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C99W {
    public static AnonymousClass777 A00(final UserSession userSession, AbstractC46972Dl abstractC46972Dl, final AnonymousClass776 anonymousClass776, Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, final String str6, List list, long j) {
        String A00;
        String str7;
        String str8;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0S(C99Z.class, C2057899d.class);
        int i = abstractC46972Dl.A00;
        Integer num4 = abstractC46972Dl.A03;
        if (i == 2) {
            c25621Ms.A0L("direct_v2/%s/", "top_threads/inbox");
        } else {
            switch (num4.intValue()) {
                case 0:
                    A00 = "inbox";
                    break;
                case 1:
                    A00 = "pending_inbox";
                    break;
                case 2:
                    A00 = "top_threads/inbox";
                    break;
                case 3:
                    A00 = "spam_inbox";
                    break;
                case 4:
                    A00 = AbstractC111324zv.A00(351);
                    break;
                default:
                    A00 = "locked_inbox";
                    break;
            }
            c25621Ms.A0L("direct_v2/%s/", A00);
            if (num4 == C05F.A00 && i != -1 && i != 1000) {
                c25621Ms.A9s("folder", Long.toString(i));
                if (i == 7) {
                    c25621Ms.A9s(AbstractC111324zv.A00(865), ((C2E6) abstractC46972Dl).A00);
                }
            }
        }
        if (C2E8.A00(userSession) || C2E9.A02(userSession)) {
            if (num4 == C05F.A00) {
                HashSet hashSet = new HashSet();
                hashSet.add(1000);
                hashSet.add(-1);
                if (C2E9.A02(userSession)) {
                    hashSet.add(1);
                }
                if (hashSet.contains(Integer.valueOf(i))) {
                    c25621Ms.A0D(DatePickerDialogModule.ARG_MODE, 2);
                }
            }
            if (num4 == C05F.A01 && C2E9.A02(userSession)) {
                c25621Ms.A9s(AbstractC43591JPw.A00(1112), "true");
            }
        }
        if (str != null && num != null) {
            c25621Ms.A9s("cursor", str);
            if (1 - num.intValue() != 0) {
                str8 = "newer";
            } else {
                str8 = "older";
            }
            c25621Ms.A9s("direction", str8);
        } else if (Boolean.FALSE.equals(Boolean.valueOf(AbstractC14480oK.A01(AbstractC12290kX.A00)))) {
            c25621Ms.A9s("push_disabled", "true");
        }
        c25621Ms.A9s("persistentBadging", "true");
        if (j != -1) {
            c25621Ms.A9s("seq_id", Long.toString(j));
        }
        c25621Ms.A0H("request_session_id", str2);
        if (num2 != null) {
            c25621Ms.A9s("limit", Long.toString(num2.intValue()));
        }
        if (num3 != null) {
            c25621Ms.A9s("thread_message_limit", Long.toString(num3.intValue()));
        }
        c25621Ms.A0H("selected_filter", str3);
        c25621Ms.A0H("sort_order", str4);
        c25621Ms.A0H("fetch_reason", str5);
        c25621Ms.A0F("is_prefetching", bool);
        c25621Ms.A9s("no_pending_badge", "true");
        if (list != null && !list.isEmpty()) {
            str7 = AnonymousClass001.A0g("[", C71473Il.A00(',').A02(list), "]");
        } else {
            str7 = null;
        }
        c25621Ms.A0H("message_request_selected_filters", str7);
        c25621Ms.A9s("visual_message_return_type", "unseen");
        c25621Ms.A0H("eb_device_id", C6CC.A03.A02(userSession));
        c25621Ms.A0H("igd_request_log_tracking_id", str6);
        return new AnonymousClass777(new C1P1(userSession, anonymousClass776, str6) { // from class: X.99s
            public final UserSession A00;
            public final AnonymousClass776 A01;
            public final String A02;

            {
                C14360o3.A0B(userSession, 1);
                C14360o3.A0B(str6, 2);
                this.A00 = userSession;
                this.A02 = str6;
                this.A01 = anonymousClass776;
            }

            @Override // X.C1P1
            public final void onFailInBackground(AbstractC115105If abstractC115105If) {
                C0f9.A0A(623287613, C0f9.A03(-1617247969));
            }

            @Override // X.C1P1
            public final void onStart() {
                C0f9.A0A(-1750671202, C0f9.A03(937305433));
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                int A03 = C0f9.A03(-694250526);
                C99Z c99z = (C99Z) obj;
                int A032 = C0f9.A03(452874802);
                C14360o3.A0B(c99z, 0);
                String str9 = this.A02;
                C28891aS A002 = AbstractC207749He.A00();
                UserSession userSession2 = this.A00;
                A002.A00(userSession2).A01(userSession2, this.A01, c99z, str9);
                C0f9.A0A(1405059807, A032);
                C0f9.A0A(-100078602, A03);
            }
        }, c25621Ms.A0N());
    }
}
