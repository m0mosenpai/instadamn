package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.api.schemas.OpenCarouselSubmissionState;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.N9j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52220N9j extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public C52220N9j(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A02 = obj3;
        this.A04 = z;
        this.A01 = obj;
        this.A03 = obj2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1595597602);
                C9GR.A0E((Context) this.A01, "network_request_fail");
                i = -1082090683;
                break;
            case 1:
                A03 = C0f9.A03(-1285355150);
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A03;
                AbstractC166987dD.A1Z(new PZO(this.A02, abstractC52922bZ, null, 30, this.A04), AbstractC141776au.A00(abstractC52922bZ));
                i = -944256414;
                break;
            case 2:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -771558092);
                super.onFail(abstractC115105If);
                User user = (User) this.A02;
                user.A1G(!this.A04);
                C9GR.A0D((Context) this.A01, "third_party_downloads_account_level_setting_failed");
                user.A0c((AbstractC12990ll) this.A03);
                i = 1925997429;
                break;
            case 3:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1420549030);
                super.onFail(abstractC115105If);
                C38321qM c38321qM = (C38321qM) this.A02;
                c38321qM.A0C.Efg(Boolean.valueOf(!this.A04));
                C9GR.A0D((Context) this.A01, "third_party_downloads_media_level_setting_failed");
                c38321qM.AEH((AbstractC12990ll) this.A03);
                i = 1800057158;
                break;
            case 4:
                A03 = C0f9.A03(-979569043);
                C9GR.A0D((Context) this.A01, "addMentionsTask_network_error");
                i = 237232161;
                break;
            default:
                super.onFail(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-415637092);
                int A032 = C0f9.A03(1931122250);
                C9GR.A07((Context) this.A01, 2131961124);
                C38321qM c38321qM = (C38321qM) this.A02;
                boolean z = this.A04;
                UserSession userSession = ((C41627IbI) this.A03).A00;
                InterfaceC38831rF interfaceC38831rF = c38321qM.A0C;
                if (z) {
                    interfaceC38831rF.Ea8(OpenCarouselSubmissionState.A07);
                    c38321qM.A0C.Ea7(c38321qM.A1l(userSession));
                } else {
                    interfaceC38831rF.Ea8(OpenCarouselSubmissionState.A06);
                }
                c38321qM.AEH(userSession);
                C0f9.A0A(518903818, A032);
                i = -310388982;
                break;
            case 1:
                A03 = C0f9.A03(419108078);
                EDR edr = (EDR) obj;
                int A0N = AbstractC167017dG.A0N(edr, 107801326);
                boolean z2 = edr.A00().A0E;
                C147776l2 c147776l2 = ((C52863NaK) this.A03).A08;
                if (z2) {
                    if (c147776l2 != null) {
                        c147776l2.A00(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, C51709Mse.A00((C51709Mse) this.A01), ((C56802PIt) this.A02).A06);
                    }
                } else if (c147776l2 != null) {
                    String A00 = C51709Mse.A00((C51709Mse) this.A01);
                    String str2 = ((C56802PIt) this.A02).A06;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c147776l2.A08, "live_unfollow_generated");
                    MSY.A16(A0f, c147776l2.A03);
                    MSY.A12(A0f, Long.parseLong(c147776l2.A02));
                    AbstractC37300Gc1.A0l(A0f, c147776l2.A04);
                    AbstractC37301Gc2.A15(A0f, c147776l2.A07);
                    A0f.AAP("method", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                    AbstractC31178DnM.A18(A0f, A00);
                    MSW.A1T(A0f, "viewer");
                    A0f.A9K("c_pk", AbstractC25233BEq.A0n(str2));
                    MSY.A17(A0f, AbstractC001800i.A0a(c147776l2.A06));
                }
                C0f9.A0A(1102443806, A0N);
                i = 1625262811;
                break;
            case 2:
            case 3:
            default:
                super.onSuccess(obj);
                return;
            case 4:
                int A033 = C0f9.A03(-976978520);
                N2S n2s = (N2S) obj;
                int A0N2 = AbstractC167017dG.A0N(n2s, -1933512522);
                Context context = (Context) this.A01;
                Resources resources = context.getResources();
                InterfaceC58236Prg interfaceC58236Prg = n2s.A00;
                if (interfaceC58236Prg != null) {
                    C9GR.A09(context, resources.getQuantityString(R.plurals.add_mentioned_users_success_message, ((C51791Muv) interfaceC58236Prg).A02.size()));
                    C145176gc c145176gc = (C145176gc) this.A03;
                    InterfaceC58236Prg interfaceC58236Prg2 = n2s.A00;
                    if (interfaceC58236Prg2 != null) {
                        String valueOf = String.valueOf(((C51791Muv) interfaceC58236Prg2).A00);
                        InterfaceC58236Prg interfaceC58236Prg3 = n2s.A00;
                        if (interfaceC58236Prg3 != null) {
                            List<User> list = ((C51791Muv) interfaceC58236Prg3).A01;
                            C38321qM c38321qM2 = (C38321qM) this.A02;
                            if (valueOf != null) {
                                UserSession userSession2 = c145176gc.A09;
                                str = "userSession";
                                if (userSession2 != null) {
                                    List A002 = AbstractC186788Pv.A00(userSession2).A00(valueOf);
                                    if (A002 == null) {
                                        A002 = C16930sl.A00;
                                    }
                                    C28531Zo c28531Zo = C28531Zo.A04;
                                    UserSession userSession3 = c145176gc.A09;
                                    if (userSession3 != null) {
                                        c28531Zo.A0G(userSession3, "STORY", list, A002);
                                        if (list != null) {
                                            for (User user : list) {
                                                UserSession userSession4 = c145176gc.A09;
                                                if (userSession4 != null) {
                                                    if (AbstractC186788Pv.A01(userSession4) || AbstractC31175DnJ.A1X(user, A002)) {
                                                        C28531Zo c28531Zo2 = C28531Zo.A04;
                                                        UserSession userSession5 = c145176gc.A09;
                                                        if (userSession5 != null) {
                                                            c28531Zo2.A0C(userSession5, c38321qM2, user);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C14360o3.A0F(str);
                                throw C00O.createAndThrow();
                            }
                            C0f9.A0A(-1227357593, A0N2);
                            C0f9.A0A(-984428327, A033);
                            return;
                        }
                    }
                }
                str = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
        C0f9.A0A(i, A03);
    }
}
