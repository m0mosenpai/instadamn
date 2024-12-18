package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class G1Y implements InterfaceC37153GYq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C34723FRm A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    @Override // X.InterfaceC37153GYq
    public final void D8P(String str) {
        C14360o3.A0B(str, 0);
        if (this.A04 != null) {
            UserSession userSession = this.A02.A01;
            if (userSession != null) {
                FU2.A00(userSession, EnumC33330EoP.A03);
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        String str2 = this.A05;
        List list = this.A06;
        int size = list.size();
        Integer valueOf = Integer.valueOf(size);
        Boolean bool = this.A03;
        int i = this.A00;
        Integer valueOf2 = Integer.valueOf(i);
        C34723FRm c34723FRm = this.A02;
        UserSession userSession2 = c34723FRm.A01;
        if (userSession2 != null) {
            C36299Fzu A00 = AbstractC34060F1n.A00(userSession2);
            C25531Mh A002 = C36299Fzu.A00(A00);
            if (AbstractC25226BEj.A1Z(A002)) {
                C36299Fzu.A04(A002, A00);
                AbstractC31174DnI.A1J(A002, "thread_create_successful");
                A002.A0o("create_public_chat");
                C36299Fzu.A05(A002, A00, "invite_people");
                A002.A0r(str);
                A002.A0h(AbstractC166997dE.A0j(str));
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("chat_type", "public");
                if (str2 != null) {
                    A1G.put("chat_creation_source", str2);
                }
                A1G.put("has_thread_photo", "False");
                String str3 = "True";
                A1G.put("limited_to_subscribers", "True");
                if (bool != null) {
                    if (!bool.booleanValue()) {
                        str3 = "False";
                    }
                    A1G.put("show_on_profile", str3);
                }
                if (valueOf != null) {
                    A1G.put("number_invited", String.valueOf(size));
                }
                if (C18U.A06(C06090Tz.A05, A00.A03, 36327520584612494L) && valueOf2 != null) {
                    A1G.put("chat_duration_seconds", String.valueOf(i));
                }
                A002.A0v(A1G);
                A002.Cht();
            }
            UserSession userSession3 = c34723FRm.A01;
            if (userSession3 != null) {
                if (C18U.A06(C06090Tz.A05, userSession3, 36320274974646504L)) {
                    UserSession userSession4 = c34723FRm.A01;
                    if (userSession4 != null) {
                        if (!C18U.A06(C06090Tz.A06, userSession4, 36320274974777578L)) {
                            UserSession userSession5 = c34723FRm.A01;
                            if (userSession5 != null) {
                                C1ON A0E = DirectThreadApi.A0E(userSession5, str, list, C16930sl.A00);
                                UserSession userSession6 = c34723FRm.A01;
                                if (userSession6 != null) {
                                    FPW fpw = (FPW) userSession6.A01(FPW.class, new C37055GUl(userSession6, 42));
                                    Fragment fragment = this.A01;
                                    fpw.A00(A0E, new MI7(c34723FRm, fragment, str, 24), new MI7(c34723FRm, fragment, str, 25));
                                    return;
                                }
                            }
                        }
                    }
                }
                c34723FRm.A05(this.A01, str);
                return;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    public G1Y(Fragment fragment, C34723FRm c34723FRm, Boolean bool, Integer num, String str, List list, int i) {
        this.A04 = num;
        this.A02 = c34723FRm;
        this.A05 = str;
        this.A06 = list;
        this.A03 = bool;
        this.A00 = i;
        this.A01 = fragment;
    }

    @Override // X.InterfaceC37153GYq
    public final void D8O(Throwable th) {
        String str;
        String str2;
        C34723FRm c34723FRm = this.A02;
        C36296Fzq A0b = AbstractC31172DnG.A0b(c34723FRm.A0A);
        if (th == null || (str = th.toString()) == null) {
            str = "";
        }
        C36296Fzq.A02(EnumC33514Ern.A07, EnumC33512Erl.CREATE_SUBSCRIBER_CHAT, A0b, "thread_create_error", "view", AbstractC167007dF.A0n("error_message", str));
        Context context = c34723FRm.A00;
        if (context == null) {
            str2 = "context";
        } else {
            UserSession userSession = c34723FRm.A01;
            if (userSession == null) {
                str2 = "userSession";
            } else {
                AbstractC46744Km1.A00(userSession, context, true);
                InterfaceC37206GaH interfaceC37206GaH = c34723FRm.A02;
                if (interfaceC37206GaH == null) {
                    str2 = "delegate";
                } else {
                    interfaceC37206GaH.D2o();
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
