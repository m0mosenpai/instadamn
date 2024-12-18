package X;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.forker.Process;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class MWM extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public MWM(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(C1ON c1on, Object obj, Object obj2, int i) {
        c1on.A00 = new MWM(i, obj, obj2);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        String str;
        int i2;
        String str2;
        String str3;
        String str4;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-207274949);
                ((InterfaceC58140Pq5) this.A01).Dey();
                i = -2095235032;
                break;
            case 1:
                A03 = C0f9.A03(-1971237025);
                APo aPo = (APo) this.A02;
                if (aPo.A09 != this.A01) {
                    i = -1580673333;
                    break;
                } else {
                    aPo.A0B = new C38687GzS[3];
                    aPo.A0M.E4u(new C187988Up(APo.A00(aPo)));
                    i = 631676100;
                    break;
                }
            case 2:
                A03 = C0f9.A03(536761556);
                Fragment fragment = (Fragment) this.A02;
                InterfaceC56362iU interfaceC56362iU = (InterfaceC56362iU) this.A01;
                interfaceC56362iU.ARc(false);
                interfaceC56362iU.setIsLoading(false);
                interfaceC56362iU.ARk(0, true);
                FragmentActivity requireActivity = fragment.requireActivity();
                Resources resources = fragment.requireActivity().getResources();
                if (resources != null) {
                    str = resources.getString(2131961661);
                } else {
                    str = null;
                }
                C9GR.A03(requireActivity, str, "save_edits_failed", 0);
                i = 183055832;
                break;
            case 3:
                A03 = C0f9.A03(-1870385708);
                ((C1346766r) this.A02).A00();
                i = -305245634;
                break;
            case 4:
            case 7:
            case 8:
            case 9:
            case 22:
            default:
                super.onFail(abstractC115105If);
                return;
            case 5:
                A03 = C0f9.A03(19881590);
                AbstractC166987dD.A1Y(this.A01);
                i = -1991777785;
                break;
            case 6:
                A03 = C0f9.A03(-568486483);
                ViewGroup viewGroup = ((C189988bH) this.A01).A08;
                if (viewGroup != null) {
                    C9GR.A04(viewGroup.getContext());
                }
                i = 2026162688;
                break;
            case 10:
                A03 = C0f9.A03(1766120907);
                C111364zz c111364zz = (C111364zz) this.A02;
                c111364zz.A05.remove(EnumC2045493n.A0C);
                C111364zz.A02((InterfaceC1116050z) this.A01, c111364zz);
                i = 699530195;
                break;
            case 11:
                A03 = C0f9.A03(-1107211117);
                C111364zz c111364zz2 = (C111364zz) this.A02;
                c111364zz2.A05.remove(EnumC2045493n.A0B);
                C111364zz.A02((InterfaceC1116050z) this.A01, c111364zz2);
                i = 709139148;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1678311536);
                OIy oIy = (OIy) this.A02;
                Context context = oIy.A00;
                boolean z = oIy instanceof NS1;
                boolean Cff = oIy.A03.Cff();
                if (z) {
                    i2 = 2131971624;
                    if (Cff) {
                        i2 = 2131971626;
                    }
                } else {
                    i2 = 2131963447;
                    if (Cff) {
                        i2 = 2131963449;
                    }
                }
                AbstractC53862Nrq.A00(context, abstractC115105If, i2);
                i = -552929778;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(-1434155206);
                C14360o3.A0B(abstractC115105If, 0);
                C55084Oag c55084Oag = (C55084Oag) this.A02;
                UserSession userSession = c55084Oag.A02;
                AbstractC54126NwO.A00(userSession).A03(TraceFieldType.FailureReason, "network_failure");
                OMa A00 = AbstractC54126NwO.A00(userSession);
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null) {
                    str2 = A01.getMessage();
                } else {
                    str2 = "Network error";
                }
                A00.A04("network_failure", str2);
                C55084Oag.A01(null, c55084Oag, false, false, false);
                C9GR.A01(((O45) this.A01).A00, "music_pick_template_delete_failed", 2131968023, 0);
                i = -1327840333;
                break;
            case 14:
                A03 = C0f9.A03(-895166526);
                C14360o3.A0B(abstractC115105If, 0);
                C55084Oag c55084Oag2 = (C55084Oag) this.A02;
                UserSession userSession2 = c55084Oag2.A02;
                AbstractC54126NwO.A00(userSession2).A03(TraceFieldType.FailureReason, "network_failure");
                OMa A002 = AbstractC54126NwO.A00(userSession2);
                Throwable A012 = abstractC115105If.A01();
                if (A012 != null) {
                    str3 = A012.getMessage();
                } else {
                    str3 = "Network error";
                }
                A002.A04("network_failure", str3);
                C55084Oag.A01(null, c55084Oag2, false, false, true);
                i = -563374480;
                break;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-1343175998);
                MWR.A00((MWR) this.A01, false);
                MWN mwn = (MWN) this.A02;
                C54621OAw c54621OAw = mwn.A04;
                c54621OAw.A02 = true;
                c54621OAw.A01 = true;
                MWN.A01(mwn);
                i = -537616887;
                break;
            case 16:
                A03 = C0f9.A03(1921863556);
                MWQ.A00((MWQ) this.A01, false);
                MWN mwn2 = (MWN) this.A02;
                C54621OAw c54621OAw2 = mwn2.A05;
                c54621OAw2.A02 = true;
                c54621OAw2.A01 = true;
                MWN.A01(mwn2);
                i = 99410254;
                break;
            case 17:
                A03 = C0f9.A03(1021390866);
                C006802i.A0p.markerEnd(39059457, (short) 3);
                C54561O8n.A00((C54561O8n) this.A01, false);
                MWN mwn3 = (MWN) this.A02;
                C54621OAw c54621OAw3 = mwn3.A06;
                c54621OAw3.A02 = true;
                c54621OAw3.A01 = true;
                MWN.A01(mwn3);
                i = 516542737;
                break;
            case 18:
                A03 = C0f9.A03(1038201912);
                C54562O8o.A00((C54562O8o) this.A01, false);
                MWN mwn4 = (MWN) this.A02;
                C54621OAw c54621OAw4 = mwn4.A07;
                c54621OAw4.A02 = true;
                c54621OAw4.A01 = true;
                MWN.A01(mwn4);
                i = -132870323;
                break;
            case Process.SIGSTOP /* 19 */:
                A03 = C0f9.A03(-1621173548);
                OQF.A01((Context) this.A01, (User) this.A02);
                i = 1924229824;
                break;
            case 20:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 663654459);
                super.onFail(abstractC115105If);
                C66485UJn c66485UJn = (C66485UJn) this.A02;
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                TextView textView = c66485UJn.A04;
                textView.setClickable(true);
                textView.setAlpha(1.0f);
                i = -144059039;
                break;
            case 21:
                A03 = C0f9.A03(38796479);
                C9GR.A0C((Context) this.A01, "change_push_notification_settings_failed");
                ((C51343Mm4) this.A02).A05.setChecked(false);
                i = 1262642355;
                break;
            case 23:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 207420924);
                super.onFail(abstractC115105If);
                N7U n7u = ((O6I) this.A01).A00;
                if (n7u.getContext() != null && n7u.isResumed()) {
                    AbstractC35254Fgn.A01(n7u.getContext());
                }
                i = 599934419;
                break;
            case 24:
                A03 = C0f9.A03(-2042808236);
                AbstractC166987dD.A1Y(this.A01);
                i = -2074782235;
                break;
            case 25:
                A03 = C0f9.A03(-270380269);
                C9GR.A0F((Context) this.A01, "clips_third_party_download_eligibility_failed", 2131974297);
                i = -1944967047;
                break;
            case 26:
                A03 = C0f9.A03(-1141800706);
                C56255Oy2 c56255Oy2 = (C56255Oy2) ((C55525OlJ) this.A01).A01;
                C23031Ai A003 = AbstractC23021Ah.A00(c56255Oy2.A0C);
                switch (AbstractC166987dD.A0H(this.A02)) {
                    case 0:
                        str4 = "off";
                        break;
                    case 1:
                        str4 = "anyone";
                        break;
                    default:
                        str4 = "following";
                        break;
                }
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(A003);
                A0w.E7K("reel_message_prefs", str4);
                A0w.apply();
                C9GR.A0A(c56255Oy2.A09, "setReelMessagePrefs_error");
                C56255Oy2.A04(c56255Oy2);
                i = -736282470;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(-687976711);
                i = -670750340;
                break;
            case 6:
                A03 = C0f9.A03(2135511281);
                ((Dialog) this.A02).dismiss();
                i = -129958232;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(1818274774);
                ((C54809OKh) this.A01).A00();
                i = 938764492;
                break;
            case 14:
                A03 = C0f9.A03(2043419514);
                ((C54809OKh) this.A01).A00();
                i = 1557219307;
                break;
            default:
                super.onFinish();
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(-761939302);
                final APo aPo = (APo) this.A02;
                if (aPo.A02 != null) {
                    AbstractC167007dF.A0y(aPo.A00, false);
                    AbstractC125325le.A05(new View[]{aPo.A02, aPo.A08, aPo.A03}, false);
                }
                aPo.A06 = new AbstractRunnableC14200nk(this) { // from class: X.9ir
                    public final /* synthetic */ MWM A00;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(602, 3, false, false);
                        this.A00 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        APo aPo2 = aPo;
                        UserSession userSession = aPo2.A0K;
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(aPo2.A0J, userSession), "instagram_smb_partner_flow_producer");
                        String str = userSession.userId;
                        C14360o3.A0B(str, 0);
                        A0f.A9K("igid", Long.valueOf(AbstractC167027dH.A03(str)));
                        A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "share_business_sticker_fetch_ranked_media");
                        A0f.AAP("action", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
                        A0f.AAP(AbstractC50637MWy.A00(0, 10, 43), AbstractC167017dG.A0j());
                        AbstractC167007dF.A12(A0f, false);
                        A0f.AAP("sticker_type", C148276lx.A1Z.A0Z);
                        A0f.Cht();
                        this.A00.onFail(C7J2.A00());
                    }
                };
                C14270nr A00 = C14270nr.A00();
                AbstractRunnableC14200nk abstractRunnableC14200nk = aPo.A06;
                if (abstractRunnableC14200nk != null) {
                    A00.A01(abstractRunnableC14200nk, 8000L);
                    i = -1014458939;
                    break;
                } else {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A0A(-1859371167, A03);
                    throw A0g;
                }
            case 6:
                A03 = C0f9.A03(899329780);
                C0fJ.A00((Dialog) this.A02);
                i = 1908066527;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(1747941960);
                ((C54809OKh) this.A01).A01();
                i = -1146545412;
                break;
            case 14:
                A03 = C0f9.A03(-972409909);
                ((C54809OKh) this.A01).A01();
                i = 1080662071;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0390, code lost:
    
        if (r11.A00(X.C152306tG.class, "me").A00(X.C152316tH.class, "pay_consumer_payment_account").A06("payments_disabled") != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e3, code lost:
    
        if (r4.A00(X.C51556Mpg.class, "gen_ig_user_risk_appeal_case").A05("job_id") != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02c2, code lost:
    
        if (X.C51562Mpm.class.getConstructor(org.json.JSONObject.class).newInstance(r2) != null) goto L71;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 2198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MWM.onSuccess(java.lang.Object):void");
    }
}
