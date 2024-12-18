package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EUv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32545EUv extends C1P1 {
    public boolean A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C32545EUv(C69613Av c69613Av, C32353ENa c32353ENa) {
        this.A01 = 5;
        this.A02 = c69613Av;
        this.A03 = c32353ENa;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        String str;
        String str2;
        int i;
        Integer num;
        int A0N;
        int i2;
        switch (this.A01) {
            case 1:
                A03 = C0f9.A03(54270014);
                C14360o3.A0B(abstractC115105If, 0);
                InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
                if (A0L == null || ((str = A0L.getClientFacingErrorMessage()) == null && (str = A0L.getErrorMessage()) == null)) {
                    str = "";
                }
                if (this.A00) {
                    str2 = "Failed to toggle TTLC";
                } else {
                    str2 = "Cannot cutover this thread";
                }
                C193328hC A0a = AbstractC31176DnK.A0a((Context) this.A02, str, str2);
                A0a.A0S(DialogInterfaceOnClickListenerC35396FjF.A00, EnumC193348hE.A02, 2131968948);
                AbstractC166987dD.A1W(A0a);
                AbstractC25227BEk.A1Q((InterfaceC16660sJ) this.A03, false);
                i = 1183957346;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 236690471);
                super.onFail(abstractC115105If);
                InterfaceC37166GZd interfaceC37166GZd = ((JUI) this.A03).A00;
                if (interfaceC37166GZd != null) {
                    interfaceC37166GZd.Cue();
                }
                i = 1930357095;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = C0f9.A03(-1244626110);
                C6WQ c6wq = ((C49040LmS) this.A03).A01;
                if (c6wq != null) {
                    c6wq.dismiss();
                }
                i = -258849049;
                C0f9.A0A(i, A03);
                return;
            case 4:
                A03 = C0f9.A03(1200853865);
                C006802i.A0p.markerEnd(190461770, (short) 3);
                C9GR.A0E((Context) this.A02, "request_error");
                i = 814535819;
                C0f9.A0A(i, A03);
                return;
            case 5:
                A03 = C0f9.A03(-1906365276);
                this.A00 = true;
                i = -1288259342;
                C0f9.A0A(i, A03);
                return;
            case 6:
                A03 = C0f9.A03(954327426);
                C38333GtS c38333GtS = (C38333GtS) this.A03;
                ArrayList A0U = AbstractC001800i.A0U((Collection) ((C37838Gks) c38333GtS.A04.getValue()).A03);
                List list = (List) this.A02;
                A0U.removeAll(list);
                boolean z = this.A00;
                if (z) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A0C;
                }
                C38333GtS.A03(c38333GtS, num, A0U, list.size(), z);
                i = 1494075119;
                C0f9.A0A(i, A03);
                return;
            case 7:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 885157683);
                ((C69141ViW) this.A02).A00 = !this.A00;
                II4 ii4 = (II4) this.A03;
                WeakReference weakReference = ii4.A00;
                C14360o3.A0A(weakReference);
                ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) weakReference.get();
                if (reelDashboardFragment != null) {
                    C0fA.A00(reelDashboardFragment.mListAdapter, 1852789563);
                }
                Context context = ii4.A01;
                if (context != null) {
                    AbstractC35254Fgn.A02(context, abstractC115105If);
                    i2 = 1566155305;
                    C0f9.A0A(i2, A0N);
                    return;
                } else {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A0A(1443750832, A0N);
                    throw A0g;
                }
            case 8:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -2075943775);
                super.onFail(abstractC115105If);
                C141466aP.A05((IgSimpleImageView) this.A03, (AttributedAREffect) this.A02, !this.A00);
                i2 = 1953463723;
                C0f9.A0A(i2, A0N);
                return;
            case 9:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -2118909328);
                super.onFail(abstractC115105If);
                C36731GHa c36731GHa = ((C33226ElG) this.A03).A06;
                if (c36731GHa != null) {
                    c36731GHa.A0D = !this.A00;
                }
                ((User) this.A02).A03.Ebl(Boolean.valueOf(!this.A00));
                i2 = 1609518422;
                C0f9.A0A(i2, A0N);
                return;
            case 10:
                A0N = C0f9.A03(279581482);
                Fragment fragment = ((C54620OAv) ((C55519OlD) this.A02).A01).A00;
                if (fragment.isAdded()) {
                    C9GR.A0D(fragment.getContext(), "allow_resharing_to_stories_settings_failed");
                    ((CompoundButton) this.A03).setChecked(!this.A00);
                }
                i2 = -1808808698;
                C0f9.A0A(i2, A0N);
                return;
            case 11:
                A0N = C0f9.A03(-1483569956);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                Fragment fragment2 = ((C35042FcF) this.A03).A02;
                C9GR.A03(fragment2.requireContext(), AbstractC166997dE.A0N(fragment2).getString(2131972429), "spam_followers_setting_update_failed", 0);
                i2 = -1308613310;
                C0f9.A0A(i2, A0N);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1285877516);
                super.onFail(abstractC115105If);
                C56142Ow4 c56142Ow4 = (C56142Ow4) this.A03;
                Toast toast = c56142Ow4.A00;
                if (toast != null) {
                    toast.cancel();
                }
                c56142Ow4.A00 = null;
                NAF naf = c56142Ow4.A04;
                if (naf != null) {
                    naf.A02 = true;
                    naf.A0E.A00();
                    OQ3.A00(naf.A05);
                }
                C34997FbU c34997FbU = (C34997FbU) this.A02;
                boolean z2 = this.A00;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34997FbU.A00, "instagram_waverly_ig_event");
                A0f.A7v("attempted_toggle_value", C34997FbU.A00(A0f, c34997FbU, "submit_error", z2));
                A0f.AAP("message_controls_settings_version", "v2");
                A0f.AAP("error_message", AbstractC151876sX.A02(abstractC115105If));
                A0f.AAP("error_identifier", AbstractC151876sX.A01(abstractC115105If));
                A0f.Cht();
                i = 399371452;
                C0f9.A0A(i, A03);
                return;
            default:
                super.onFail(abstractC115105If);
                return;
        }
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A01) {
            case 5:
                A03 = C0f9.A03(629205798);
                EQJ eqj = ((C32353ENa) this.A03).A01;
                if (eqj == null) {
                    C14360o3.A0F("explorePeopleAdapter");
                    throw C00O.createAndThrow();
                }
                EQJ.A01(eqj);
                boolean z = this.A00;
                C69613Av c69613Av = (C69613Av) this.A02;
                if (z) {
                    c69613Av.A01();
                } else {
                    c69613Av.A05();
                }
                i = 1423840032;
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            default:
                super.onFinish();
                return;
            case 7:
                A03 = C0f9.A03(730649724);
                i = -145423907;
                break;
            case 11:
                A03 = C0f9.A03(-368204069);
                ((View) this.A02).setEnabled(true);
                i = 1804934665;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(1547834074);
                super.onFinish();
                ((C56142Ow4) this.A03).A02 = null;
                i = 87219974;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        Object value;
        C37838Gks c37838Gks;
        ArrayList A0T;
        C16930sl c16930sl;
        C16920sk c16920sk;
        switch (this.A01) {
            case 5:
                A03 = C0f9.A03(916870229);
                ((C69613Av) this.A02).A04();
                i = 671536682;
                break;
            case 6:
                A03 = C0f9.A03(-1038926764);
                boolean z = this.A00;
                if (z) {
                    C38333GtS c38333GtS = (C38333GtS) this.A03;
                    c38333GtS.A00 = AbstractC31172DnG.A02((List) this.A02, c38333GtS.A00);
                }
                C05A c05a = ((C38333GtS) this.A03).A04;
                ArrayList A0U = AbstractC001800i.A0U((Collection) ((C37838Gks) c05a.getValue()).A03);
                List list = (List) this.A02;
                A0U.addAll(list);
                do {
                    value = c05a.getValue();
                    c37838Gks = (C37838Gks) value;
                    A0T = AbstractC001800i.A0T(new C49381LsF(list, z), (Collection) c37838Gks.A02);
                    c16930sl = C16930sl.A00;
                    c16920sk = C16920sk.A00;
                    C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                } while (!c05a.AIi(value, C37838Gks.A00(c37838Gks, null, null, null, A0T, c16930sl, A0U, c16920sk, 49)));
                i = -876610158;
                break;
            case 7:
                A03 = C0f9.A03(-1695426652);
                i = -1819328107;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        int A032;
        int i2;
        Object value;
        C37838Gks c37838Gks;
        Integer num;
        switch (this.A01) {
            case 0:
                A032 = C0f9.A03(666553452);
                int A033 = C0f9.A03(269234018);
                if (((C32033E5l) ((C3DC) obj).F7f()).A00) {
                    UserSession userSession = ((FQ8) this.A02).A04;
                    boolean z = this.A00;
                    Bundle A05 = AbstractC31178DnM.A05(userSession);
                    A05.putBoolean("is_parent_account", z);
                    AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
                    abstractC59962oe.setArguments(A05);
                    C140966Yy A0O = AbstractC31174DnI.A0O(abstractC59962oe, (FragmentActivity) this.A03, userSession);
                    A0O.A0E = true;
                    A0O.A04();
                }
                C0f9.A0A(226124419, A033);
                i2 = -572705085;
                C0f9.A0A(i2, A032);
                return;
            case 1:
            case 5:
            case 9:
            default:
                super.onSuccess(obj);
                return;
            case 2:
                int A034 = C0f9.A03(1519478780);
                C44148JfD c44148JfD = (C44148JfD) obj;
                int A0N = AbstractC167017dG.A0N(c44148JfD, 1046879298);
                super.onSuccess(c44148JfD);
                JUI jui = (JUI) this.A03;
                jui.A01 = c44148JfD.A00;
                if (this.A00) {
                    C15500q5.A04(jui.A07).remove(((C44178Jfh) this.A02).A00());
                } else {
                    C44178Jfh c44178Jfh = (C44178Jfh) this.A02;
                    String A00 = c44178Jfh.A00();
                    if (A00 != null) {
                        jui.A07.put(A00, c44178Jfh);
                    }
                }
                JUI.A00(jui);
                InterfaceC37166GZd interfaceC37166GZd = jui.A00;
                if (interfaceC37166GZd != null) {
                    interfaceC37166GZd.Cuo();
                }
                jui.A04.E4s(new C44192Jfv());
                C0f9.A0A(-1434902979, A0N);
                C0f9.A0A(1724621875, A034);
                return;
            case 3:
                A03 = C0f9.A03(769035659);
                C32155EBc c32155EBc = (C32155EBc) obj;
                int A0N2 = AbstractC167017dG.A0N(c32155EBc, 1729043701);
                C38321qM c38321qM = c32155EBc.A00;
                C49040LmS c49040LmS = (C49040LmS) this.A03;
                if (c38321qM == null) {
                    C6WQ c6wq = c49040LmS.A01;
                    if (c6wq != null) {
                        c6wq.dismiss();
                    }
                } else {
                    C1DW.A00(c49040LmS.A08).A03(c38321qM);
                    String id = c38321qM.getId();
                    if (id != null) {
                        C49040LmS.A00(c49040LmS, (C83693oE) this.A02, id, this.A00);
                    } else {
                        IllegalStateException A0g = AbstractC166997dE.A0g();
                        C0f9.A0A(1943764063, A0N2);
                        throw A0g;
                    }
                }
                C0f9.A0A(1308078570, A0N2);
                i = -1840460050;
                C0f9.A0A(i, A03);
                return;
            case 4:
                A03 = C0f9.A03(429321911);
                int A035 = C0f9.A03(-993557327);
                Context context = (Context) this.A02;
                UserSession userSession2 = (UserSession) this.A03;
                FVD.A00(context, userSession2);
                User A10 = AbstractC166987dD.A10(userSession2);
                A10.A03.EZS(AbstractC166997dE.A0b());
                if (this.A00) {
                    AbstractC23043ADz.A00(userSession2);
                }
                A10.A0c(userSession2);
                C006802i.A0p.markerEnd(190461770, (short) 2);
                C0f9.A0A(595493390, A035);
                i = -683483325;
                C0f9.A0A(i, A03);
                return;
            case 6:
                A03 = C0f9.A03(1506364329);
                H9I h9i = (H9I) obj;
                int A0N3 = AbstractC167017dG.A0N(h9i, 1978366023);
                C38610GyD c38610GyD = h9i.A00;
                if (c38610GyD != null) {
                    String str = c38610GyD.A01;
                    int i3 = 0;
                    if (str != null && !AbstractC001900j.A0T(str)) {
                        C38333GtS c38333GtS = (C38333GtS) this.A03;
                        ArrayList A0U = AbstractC001800i.A0U((Collection) ((C37838Gks) c38333GtS.A04.getValue()).A03);
                        C38610GyD c38610GyD2 = h9i.A00;
                        if (c38610GyD2 != null) {
                            List list = c38610GyD2.A02;
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    AnonymousClass016.A1A(A0U, new C50361MLn(AbstractC166987dD.A1B(it), 32));
                                }
                            }
                            if (str.equals("delete pending media fails")) {
                                num = C05F.A01;
                            } else if (str.equals("Cannot accept more than max number of subposts.")) {
                                num = C05F.A00;
                            } else {
                                num = C05F.A0N;
                            }
                            boolean z2 = this.A00;
                            if (list != null) {
                                i3 = list.size();
                            }
                            C38333GtS.A03(c38333GtS, num, A0U, i3, z2);
                        }
                    } else {
                        C05A c05a = ((C38333GtS) this.A03).A04;
                        List list2 = (List) this.A02;
                        boolean z3 = this.A00;
                        do {
                            value = c05a.getValue();
                            c37838Gks = (C37838Gks) value;
                        } while (!c05a.AIi(value, C37838Gks.A00(c37838Gks, null, null, null, AbstractC001800i.A0T(new C49380LsE(list2, z3), (Collection) c37838Gks.A02), null, null, null, 125)));
                    }
                    C0f9.A0A(-966286175, A0N3);
                    i = 939864989;
                    C0f9.A0A(i, A03);
                    return;
                }
                AbstractC31171DnF.A0w();
                throw C00O.createAndThrow();
            case 7:
                A03 = C0f9.A03(1622515912);
                C0f9.A0A(-244561376, C0f9.A03(1921703709));
                i = 2089277958;
                C0f9.A0A(i, A03);
                return;
            case 8:
                A03 = C0f9.A03(2033041103);
                int A0N4 = AbstractC167017dG.A0N(obj, 1245193692);
                super.onSuccess(obj);
                C0f9.A0A(-1244614237, A0N4);
                i = -863909763;
                C0f9.A0A(i, A03);
                return;
            case 10:
                A03 = C0f9.A03(-150648725);
                int A036 = C0f9.A03(-1080496248);
                AbstractC166987dD.A10(((C54620OAv) ((C55519OlD) this.A02).A01).A01).A03.EUO(Boolean.valueOf(!this.A00));
                C0f9.A0A(-1923315830, A036);
                i = 605637532;
                C0f9.A0A(i, A03);
                return;
            case 11:
                A03 = C0f9.A03(-1661419197);
                int A037 = C0f9.A03(-410907119);
                UserSession userSession3 = ((C35042FcF) this.A03).A04;
                boolean z4 = this.A00;
                User A102 = AbstractC166987dD.A10(userSession3);
                Boolean valueOf = Boolean.valueOf(z4);
                if (!C14360o3.A0K(valueOf, A102.A03.Byy())) {
                    A102.A03.Eed(valueOf);
                }
                C0f9.A0A(1623629080, A037);
                i = -42236524;
                C0f9.A0A(i, A03);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A032 = C0f9.A03(2114369809);
                C32184ECf c32184ECf = (C32184ECf) obj;
                int A0N5 = AbstractC167017dG.A0N(c32184ECf, 906428603);
                super.onSuccess(c32184ECf);
                boolean z5 = c32184ECf.A01;
                if (z5 && c32184ECf.A00 == null) {
                    ((C34997FbU) this.A02).A01("submit_error", Boolean.valueOf(this.A00));
                    z5 = false;
                } else {
                    C34997FbU c34997FbU = (C34997FbU) this.A02;
                    Boolean bool = c32184ECf.A00;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34997FbU.A00, "instagram_waverly_ig_event");
                    A0f.A7v(MSV.A00(1145), C34997FbU.A00(A0f, c34997FbU, "submit", z5));
                    A0f.A7v(MSV.A00(581), bool);
                    A0f.AAP("message_controls_settings_version", "v2");
                    A0f.Cht();
                    if (z5) {
                        C23031Ai c23031Ai = ((C56142Ow4) this.A03).A06;
                        Boolean bool2 = c32184ECf.A00;
                        if (bool2 != null) {
                            AbstractC31171DnF.A1S(c23031Ai, bool2, c23031Ai.A6K, C23031Ai.A8c, 263);
                        } else {
                            IllegalStateException A0g2 = AbstractC166997dE.A0g();
                            C0f9.A0A(907798829, A0N5);
                            throw A0g2;
                        }
                    }
                }
                C56142Ow4 c56142Ow4 = (C56142Ow4) this.A03;
                Toast toast = c56142Ow4.A00;
                if (toast != null) {
                    toast.cancel();
                }
                c56142Ow4.A00 = null;
                NAF naf = c56142Ow4.A04;
                if (naf != null) {
                    naf.A02 = true;
                    naf.A04 = z5;
                    if (!z5) {
                        OQ3.A00(naf.A05);
                    }
                    naf.A0E.A00();
                }
                C0f9.A0A(-1510345583, A0N5);
                i2 = 1303959280;
                C0f9.A0A(i2, A032);
                return;
        }
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        if (1 - this.A01 != 0) {
            super.onSuccessInBackground(obj);
            return;
        }
        int A03 = C0f9.A03(-166723021);
        int A032 = C0f9.A03(337731385);
        AbstractC167007dF.A0J().postDelayed(new GL3((InterfaceC16660sJ) this.A03), 500L);
        C0f9.A0A(-1662275730, A032);
        C0f9.A0A(1902511658, A03);
    }

    public C32545EUv(int i, Object obj, Object obj2, boolean z) {
        this.A01 = i;
        this.A03 = obj2;
        this.A00 = z;
        this.A02 = obj;
    }
}
