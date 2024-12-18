package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.39m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C692639m implements InterfaceC692739n, InterfaceC692939p {
    public final Fragment A00;
    public final AbstractC10360h2 A01;
    public final UserSession A02;
    public final InterfaceC686136y A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC65282xQ A05;
    public final C692539l A06;
    public final C33A A07;
    public final C1M1 A08;

    @Override // X.InterfaceC692739n
    public final void Dm3(C38321qM c38321qM, C75113Zb c75113Zb, String str, boolean z, boolean z2) {
        C14360o3.A0B(c75113Zb, 1);
        C33A c33a = this.A07;
        if (c33a != null) {
            c33a.A06.remove(c38321qM);
        }
        EnumC75193Zm enumC75193Zm = EnumC75193Zm.A0F;
        C14360o3.A0B(enumC75193Zm, 0);
        c75113Zb.A0m = enumC75193Zm;
        UserSession userSession = this.A02;
        C3YS.A00(userSession).A02(c38321qM, false);
        C3YS.A00(userSession).A01(c38321qM, 22);
        AbstractC25651Mw.A00(userSession).E4s(new C23612Ad7(c38321qM));
        this.A05.CtR(c38321qM);
    }

    @Override // X.InterfaceC692739n
    public final void E2W(Integer num) {
        C14360o3.A0B(num, 0);
        IQb.A01(this.A00.requireActivity(), this.A02, num);
    }

    @Override // X.InterfaceC692739n
    public final void Ekg(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c75113Zb, 1);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            UserSession userSession = this.A02;
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                InterfaceC60442pS interfaceC60442pS = this.A04;
                CKQ.A00(interfaceC60442pS, userSession, A2E);
                if (A2E.A0M() == C05F.A0C) {
                    C18920wW A02 = AbstractC12220kQ.A02(userSession);
                    C25531Mh c25531Mh = new C25531Mh(A02.A00(A02.A00, "unfollow_dialog_impresssion"), 384);
                    c25531Mh.A0R("target_id", A2E.getId());
                    c25531Mh.A0m(C26771Rh.A00().A00);
                    c25531Mh.Cht();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(activity.getString(2131976077, A2E.getUsername()));
                    C193328hC c193328hC = new C193328hC((Activity) activity);
                    c193328hC.A0o(A2E.Bhu(), interfaceC60442pS);
                    AbstractC35271Fh6.A0B(spannableStringBuilder);
                    c193328hC.A0r(spannableStringBuilder);
                    c193328hC.A0J(new DialogInterfaceOnClickListenerC28542Cia(activity, this, c38321qM, c75113Zb, A2E), 2131976069);
                    c193328hC.A0D(new DialogInterfaceOnClickListenerC28538CiW(this, A2E));
                    c193328hC.A0C(new DialogInterfaceOnCancelListenerC28533CiR(this, A2E));
                    C0fJ.A00(c193328hC.A02());
                    return;
                }
                A00(activity, this, c38321qM, c75113Zb);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC692739n
    public final void ElV(C38321qM c38321qM, C75113Zb c75113Zb, VG2 vg2, String str) {
        C14360o3.A0B(vg2, 3);
        C692539l c692539l = this.A06;
        c692539l.A02(c38321qM, vg2, new C39454Hbg(c692539l, c38321qM, null, null, c75113Zb), str, null);
    }

    @Override // X.InterfaceC692739n
    public final void ElX(C38321qM c38321qM, C38525Gwl c38525Gwl, C75113Zb c75113Zb, VG2 vg2, String str) {
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(vg2, 3);
        C692539l c692539l = this.A06;
        c692539l.A02(c38321qM, vg2, new C39454Hbg(c692539l, c38321qM, c38525Gwl, null, c75113Zb), str, "feed_hide");
    }

    @Override // X.InterfaceC692739n
    public final void F96(C42521Is0 c42521Is0, C42662IuJ c42662IuJ) {
        C14360o3.A0B(c42662IuJ, 1);
        UserSession userSession = this.A02;
        I0S.A00(C42094Il2.A00, new Il7(this, c42662IuJ), userSession, true);
    }

    @Override // X.InterfaceC692739n
    public final void F97(C4dV c4dV, C119835bh c119835bh) {
        InterfaceC132105xl c44226JgW;
        String str;
        String str2;
        Integer valueOf;
        C14360o3.A0B(c4dV, 0);
        C14360o3.A0B(c119835bh, 1);
        List list = c4dV.A09;
        int size = list.size();
        int i = c119835bh.A01;
        C38321qM c38321qM = (C38321qM) AbstractC001800i.A0O(list, i);
        C1XV B5n = c4dV.B5n();
        C1XV c1xv = C1XV.A0z;
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        if (B5n == c1xv) {
            c44226JgW = new C132095xk(interfaceC60442pS, userSession);
        } else {
            c44226JgW = new C44226JgW(interfaceC60442pS, userSession, AbstractC14490oL.A0A(this.A00.requireContext()));
        }
        InterfaceC132105xl interfaceC132105xl = c44226JgW;
        if (c38321qM != null) {
            str = c38321qM.getId();
        } else {
            str = null;
        }
        String str3 = c4dV.A06;
        if (c38321qM != null) {
            str2 = c38321qM.A0C.getLoggingInfoToken();
        } else {
            str2 = null;
        }
        String str4 = c4dV.A07;
        if (i >= size) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i);
        }
        interfaceC132105xl.CmI(valueOf, str, str3, str2, str4, AbstractC123875j1.A00(c4dV.A04), size);
        c119835bh.EVm(EnumC114405Eh.A04);
        this.A05.CtR(null);
    }

    public C692639m(Fragment fragment, AbstractC10360h2 abstractC10360h2, UserSession userSession, InterfaceC686136y interfaceC686136y, C692539l c692539l, InterfaceC60442pS interfaceC60442pS, C33A c33a, InterfaceC65282xQ interfaceC65282xQ, C1M1 c1m1) {
        C14360o3.A0B(c692539l, 8);
        C14360o3.A0B(c1m1, 9);
        this.A03 = interfaceC686136y;
        this.A02 = userSession;
        this.A04 = interfaceC60442pS;
        this.A00 = fragment;
        this.A01 = abstractC10360h2;
        this.A07 = c33a;
        this.A05 = interfaceC65282xQ;
        this.A06 = c692539l;
        this.A08 = c1m1;
    }

    public static final void A00(Activity activity, C692639m c692639m, C38321qM c38321qM, C75113Zb c75113Zb) {
        UserSession userSession = c692639m.A02;
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("feed/hide_feed_post/");
        c25621Ms.A9s("m_pk", c38321qM.getId());
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            c25621Ms.A9s("a_pk", A2E.getId());
            c25621Ms.A0R(C40781ul.class, C55702hA.class);
            C1GJ.A03(c25621Ms.A0N());
            C26962Bv3 c26962Bv3 = new C26962Bv3(c692639m, c38321qM, c75113Zb);
            C19260xA A00 = WE1.A00(c38321qM.A0C.B7K());
            int i = c75113Zb.A0W;
            if (i >= 0) {
                C19260xA.A00(A00, Integer.valueOf(i), "recs_ix");
            }
            User A2E2 = c38321qM.A2E(userSession);
            if (A2E2 != null) {
                AbstractC35271Fh6.A00(activity, A00, c26962Bv3, userSession, c38321qM, c75113Zb, A2E2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC692739n
    public final void Cgq(C38321qM c38321qM, String str) {
        IQb.A00(this.A00.requireActivity(), this.A02, c38321qM, str, "feed");
    }

    @Override // X.InterfaceC692939p
    public final void DAr(C38321qM c38321qM) {
        if (c38321qM != null) {
            InterfaceC65282xQ interfaceC65282xQ = this.A05;
            interfaceC65282xQ.BRZ(c38321qM).A3C = false;
            interfaceC65282xQ.BRZ(c38321qM).A3B = false;
            interfaceC65282xQ.BRZ(c38321qM).A39 = false;
            interfaceC65282xQ.AVK();
        }
    }

    @Override // X.InterfaceC692739n
    public final void DB5(C38321qM c38321qM) {
        C33A c33a = this.A07;
        if (c33a != null) {
            c33a.A06.remove(c38321qM);
        }
        C3YS.A00(this.A02).A02(c38321qM, true);
    }

    @Override // X.InterfaceC692939p
    public final void DOf(C38321qM c38321qM, C75113Zb c75113Zb) {
        UserSession userSession = this.A02;
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        Context requireContext = this.A00.requireContext();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        new BitSet(0);
        C66277U6x A02 = C66277U6x.A02(AbstractC111324zv.A00(810), AbstractC191768eY.A01(hashMap), hashMap2);
        A02.A00 = -1;
        A02.A05 = null;
        A02.A01 = 0L;
        A02.A06 = null;
        A02.A03 = null;
        A02.A02 = null;
        A02.A04 = null;
        A02.A08(hashMap3);
        A02.A05(requireContext, igBloksScreenConfig);
        new C674832n(userSession).A00();
    }

    @Override // X.InterfaceC692739n
    public final void Dth(C1XV c1xv, C38321qM c38321qM, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z, boolean z2, boolean z3) {
        String str7 = str3;
        C14360o3.A0B(str, 1);
        if (!(!C06P.A01(this.A01))) {
            int ordinal = c1xv.ordinal();
            String A00 = AbstractC111324zv.A00(2531);
            if (ordinal != 1) {
                if (ordinal == 16) {
                    if (str3 == null) {
                        C140966Yy c140966Yy = new C140966Yy(this.A00.requireActivity(), this.A02);
                        c140966Yy.A08();
                        IgFragmentFactoryImpl.A00();
                        Bundle bundle = new Bundle();
                        bundle.putString(AbstractC58317Pt9.A00(158), str);
                        bundle.putString(AbstractC58317Pt9.A00(159), str2);
                        bundle.putBoolean(AbstractC58317Pt9.A00(451), true);
                        Rb3 rb3 = new Rb3();
                        rb3.setArguments(bundle);
                        c140966Yy.A0D(rb3);
                        c140966Yy.A04();
                    }
                    UserSession userSession = this.A02;
                    if (str3 == null) {
                        str7 = A00;
                    }
                    IQX.A01(userSession, this.A04, str, str7, str2);
                    return;
                }
                return;
            }
            if (str3 == null) {
                C140966Yy c140966Yy2 = new C140966Yy(this.A00.requireActivity(), this.A02);
                IgFragmentFactoryImpl.A00();
                String A002 = MSV.A00(209);
                Bundle bundle2 = new Bundle();
                bundle2.putString(AbstractC58317Pt9.A00(450), str5);
                bundle2.putString(AbstractC58317Pt9.A00(158), str);
                bundle2.putString(AbstractC58317Pt9.A00(159), str2);
                bundle2.putString(AbstractC58317Pt9.A00(453), A002);
                bundle2.putInt(AbstractC58317Pt9.A00(452), i);
                Rb3 rb32 = new Rb3();
                rb32.setArguments(bundle2);
                c140966Yy2.A0D(rb32);
                c140966Yy2.A04();
            }
            if (c38321qM != null && c38321qM.CdW()) {
                UserSession userSession2 = this.A02;
                InterfaceC60442pS interfaceC60442pS = this.A04;
                if (str3 != null) {
                    C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession2);
                    InterfaceC02590Ai A003 = A01.A00(A01.A00, AbstractC111324zv.A00(716));
                    if (A003.isSampled()) {
                        A003.A8R(C8a.WHY_HIDE_AD_SURVEY_SUBMIT, "event_type");
                        String CAR = c38321qM.CAR();
                        if (CAR == null) {
                            CAR = "";
                        }
                        A003.AAP("ad_client_token", CAR);
                        A003.AAP("reason", str7);
                        A003.Cht();
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            UserSession userSession3 = this.A02;
            InterfaceC60442pS interfaceC60442pS2 = this.A04;
            if (str3 == null) {
                str7 = A00;
            }
            C32U.A0T(userSession3, interfaceC60442pS2, Boolean.valueOf(z2), str, str2, str7, MSV.A00(209), i);
        }
    }

    @Override // X.InterfaceC692739n
    public final void E2f(C38321qM c38321qM, C38525Gwl c38525Gwl, C75113Zb c75113Zb) {
        this.A06.A01(c38321qM, null, c75113Zb);
    }

    @Override // X.InterfaceC692739n
    public final void Eke(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A06.A00(c38321qM, null);
    }

    @Override // X.InterfaceC692739n
    public final void El8(C38321qM c38321qM, C75113Zb c75113Zb, String str) {
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A02;
        String moduleName = this.A04.getModuleName();
        HashMap hashMap = new HashMap();
        hashMap.put("event_source", str);
        String id = c38321qM.getId();
        if (id != null) {
            hashMap.put("media_id", C3YV.A02(id));
            String id2 = c38321qM.getId();
            if (id2 != null) {
                hashMap.put("author_id", C3YV.A03(id2));
                hashMap.put("inventory_source", c38321qM.A0C.BJN());
                hashMap.put("ranking_session_id", c38321qM.A0C.getLoggingInfoToken());
                hashMap.put("client_position", String.valueOf(c75113Zb.getPosition()));
                hashMap.put(AbstractC111324zv.A00(937), String.valueOf(c75113Zb.A0W));
                if (moduleName != null) {
                    hashMap.put("container_module", moduleName);
                }
                C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(2148), hashMap);
                IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
                igBloksScreenConfig.A0U = requireActivity.getString(2131966009);
                igBloksScreenConfig.A0l = true;
                A01.A04(requireActivity, igBloksScreenConfig);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
