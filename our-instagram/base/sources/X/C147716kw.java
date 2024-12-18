package X;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.6kw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147716kw implements InterfaceC145136gY, InterfaceC147726kx {
    public C105824pt A00;
    public C138376Ot A01;
    public C55852Or2 A02;
    public C147776l2 A03;
    public C55012OVx A04;
    public C54707OEj A05;
    public OMc A06;
    public OUD A07;
    public C54801OJv A08;
    public String A09;
    public AnonymousClass195 A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public String A0G;
    public String A0H;
    public final FragmentActivity A0J;
    public final AbstractC59962oe A0K;
    public final InterfaceC11380iw A0L;
    public final UserSession A0N;
    public final C142846ck A0O;
    public final InterfaceC60442pS A0P;
    public final C3G2 A0Q;
    public final C147696ku A0R;
    public final C1M1 A0S;
    public final InterfaceC147626kn A0T;
    public final InterfaceC147636ko A0U;
    public final C147796l4 A0V;
    public final C147896lL A0W;
    public final String A0X;
    public final String A0Y;
    public final InterfaceC16820sZ A0Z;
    public final C41761wQ A0M = new C41761wQ(AbstractC142856cl.A01);
    public final Handler A0I = new Handler(Looper.getMainLooper());

    @Override // X.InterfaceC147726kx
    public final boolean CPP() {
        return false;
    }

    @Override // X.InterfaceC147726kx
    public final boolean CPQ() {
        return false;
    }

    @Override // X.InterfaceC147726kx
    public final void Ch6() {
    }

    @Override // X.InterfaceC145136gY
    public final void DNK(Reel reel) {
        C55012OVx c55012OVx;
        C105824pt c105824pt;
        C14360o3.A0B(reel, 0);
        if (A04(this) && (c55012OVx = this.A04) != null && !c55012OVx.A01() && (c105824pt = reel.A0H) != null) {
            A00(c105824pt, this);
        }
    }

    @Override // X.InterfaceC145136gY
    public final void DXv(String str) {
        C56161OwT c56161OwT;
        C55064OaK c55064OaK;
        C52819NZc c52819NZc;
        C52841NZy c52841NZy;
        C56162OwU c56162OwU;
        OMQ omq;
        C56044OuG c56044OuG;
        C56162OwU c56162OwU2;
        this.A0D = true;
        C138376Ot c138376Ot = this.A01;
        if (c138376Ot != null && (c56162OwU2 = c138376Ot.A09) != null) {
            c56162OwU2.A0A.onStop();
        }
        this.A0I.removeCallbacksAndMessages(null);
        if (this.A0F) {
            this.A0F = false;
            OMc oMc = this.A06;
            if (oMc != null) {
                oMc.A01();
            }
            AnonymousClass195 anonymousClass195 = this.A0A;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            this.A0A = null;
            C138376Ot c138376Ot2 = this.A01;
            if (c138376Ot2 != null && (c56044OuG = c138376Ot2.A0I) != null) {
                C51041Mgr c51041Mgr = (C51041Mgr) c56044OuG.A08.getValue();
                AnonymousClass195 anonymousClass1952 = c51041Mgr.A01;
                if (anonymousClass1952 != null) {
                    anonymousClass1952.AGH(null);
                }
                c51041Mgr.A01 = null;
                C51041Mgr.A01(c51041Mgr, true);
            }
            C138376Ot c138376Ot3 = this.A01;
            if (c138376Ot3 != null && (omq = c138376Ot3.A0E) != null) {
                omq.A03();
            }
            C138376Ot c138376Ot4 = this.A01;
            if (c138376Ot4 != null && (c56162OwU = c138376Ot4.A09) != null) {
                c56162OwU.A0A.onStop();
            }
            C138376Ot c138376Ot5 = this.A01;
            if (c138376Ot5 != null && (c52841NZy = c138376Ot5.A0J) != null) {
                c52841NZy.A05.onStop();
            }
            C138376Ot c138376Ot6 = this.A01;
            if (c138376Ot6 != null && (c52819NZc = c138376Ot6.A06) != null) {
                c52819NZc.A07();
            }
            C138376Ot c138376Ot7 = this.A01;
            if (c138376Ot7 != null && (c55064OaK = c138376Ot7.A0H) != null) {
                AnonymousClass195 anonymousClass1953 = c55064OaK.A00;
                if (anonymousClass1953 != null) {
                    anonymousClass1953.AGH(null);
                }
                c55064OaK.A00 = null;
            }
            C138376Ot c138376Ot8 = this.A01;
            if (c138376Ot8 != null && (c56161OwT = c138376Ot8.A0L) != null) {
                C50947MfG c50947MfG = c56161OwT.A00;
                if (c50947MfG == null) {
                    C14360o3.A0F("viewModel");
                    throw C00O.createAndThrow();
                }
                AbstractC23641Du.A05(AnonymousClass191.A00, new PYu(c50947MfG, null, 2), AbstractC141776au.A00(c50947MfG));
                AnonymousClass195 anonymousClass1954 = c56161OwT.A01;
                if (anonymousClass1954 != null) {
                    anonymousClass1954.AGH(null);
                }
                c56161OwT.A01 = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0oO, java.lang.Object] */
    @Override // X.InterfaceC145136gY
    public final void DhB() {
        C56161OwT c56161OwT;
        C55064OaK c55064OaK;
        C52819NZc c52819NZc;
        OMQ omq;
        C56178Owl c56178Owl;
        C56180Own c56180Own;
        C52841NZy c52841NZy;
        C56162OwU c56162OwU;
        C56044OuG c56044OuG;
        String str;
        this.A0D = false;
        ?? obj = new Object();
        obj.A00 = true;
        AnonymousClass195 anonymousClass195 = this.A0A;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        C15340po c15340po = new C15340po(new C9DD(this, obj, null, 5), AbstractC147816l6.A00(this.A0N).A03().A00);
        AbstractC59962oe abstractC59962oe = this.A0K;
        this.A0A = AbstractC18560vj.A03(C07Y.A00(abstractC59962oe.getViewLifecycleOwner()), c15340po);
        C138376Ot c138376Ot = this.A01;
        if (c138376Ot != null && (c56044OuG = c138376Ot.A0I) != null) {
            C105824pt c105824pt = this.A00;
            if (c105824pt != null) {
                str = c105824pt.A0X;
                str.getClass();
            } else {
                str = null;
            }
            String str2 = this.A09;
            InterfaceC147636ko interfaceC147636ko = this.A0U;
            C14360o3.A0B(interfaceC147636ko, 2);
            c56044OuG.A00 = str;
            C51041Mgr.A00(interfaceC147636ko, (C51041Mgr) c56044OuG.A08.getValue(), null, str, str2, null, false);
        }
        C138376Ot c138376Ot2 = this.A01;
        if (c138376Ot2 != null && (c56162OwU = c138376Ot2.A09) != null) {
            c56162OwU.A0A.Dnr(c56162OwU.A08.getActivity());
        }
        C138376Ot c138376Ot3 = this.A01;
        if (c138376Ot3 != null && (c52841NZy = c138376Ot3.A0J) != null) {
            c52841NZy.A05.Dnr(c52841NZy.A03.getActivity());
        }
        C138376Ot c138376Ot4 = this.A01;
        if (c138376Ot4 != null && (c56180Own = c138376Ot4.A0D) != null) {
            c56180Own.A03.Dnr(c56180Own.A01.getActivity());
        }
        C138376Ot c138376Ot5 = this.A01;
        if (c138376Ot5 != null && (c56178Owl = c138376Ot5.A0A) != null) {
            c56178Owl.A01.Dnr(c56178Owl.A00.requireActivity());
        }
        C138376Ot c138376Ot6 = this.A01;
        if (c138376Ot6 != null && (omq = c138376Ot6.A0E) != null) {
            omq.A02().A06();
        }
        C138376Ot c138376Ot7 = this.A01;
        if (c138376Ot7 != null && (c52819NZc = c138376Ot7.A06) != null) {
            c52819NZc.A08();
        }
        C138376Ot c138376Ot8 = this.A01;
        if (c138376Ot8 != null && (c55064OaK = c138376Ot8.A0H) != null) {
            c55064OaK.A02();
        }
        C138376Ot c138376Ot9 = this.A01;
        if (c138376Ot9 != null && (c56161OwT = c138376Ot9.A0L) != null) {
            if (c56161OwT.A01 == null) {
                C50947MfG c50947MfG = c56161OwT.A00;
                if (c50947MfG != null) {
                    c56161OwT.A01 = AbstractC18560vj.A03(C07Y.A00(abstractC59962oe.getViewLifecycleOwner()), new C15340po(new C57167PZl(c56161OwT, null, 35), c50947MfG.A05));
                }
                C14360o3.A0F("viewModel");
                throw C00O.createAndThrow();
            }
            C50947MfG c50947MfG2 = c56161OwT.A00;
            if (c50947MfG2 != null) {
                if (!((Boolean) c50947MfG2.A01.A02.getValue()).booleanValue()) {
                    AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new PYu(c50947MfG2, null, 6), AbstractC141776au.A00(c50947MfG2));
                }
            }
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        if (this.A09 != null) {
            this.A09 = null;
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djr(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djs(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dju(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djv() {
    }

    @Override // X.InterfaceC145136gY
    public final void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
        C105824pt c105824pt;
        String str;
        C14360o3.A0B(c41181vS, 0);
        C14360o3.A0B(interfaceC143586dx, 1);
        if (A04(this) && (c105824pt = this.A00) != null) {
            if (C14360o3.A0K(c41181vS.A0c, c105824pt)) {
                if (interfaceC143586dx.equals(this.A01)) {
                    if (this.A04 != null) {
                        if (!this.A0F) {
                            this.A0F = true;
                            OMc oMc = this.A06;
                            if (oMc == null) {
                                AbstractC59962oe abstractC59962oe = this.A0K;
                                UserSession userSession = this.A0N;
                                User A03 = c105824pt.A03();
                                InterfaceC147636ko interfaceC147636ko = this.A0U;
                                EnumC142806cg enumC142806cg = EnumC142806cg.A05;
                                oMc = AbstractC54269Nyp.A00(abstractC59962oe, userSession, A03, interfaceC147636ko, enumC142806cg, AbstractC147826l7.A0K.A00(userSession, enumC142806cg));
                                this.A06 = oMc;
                            }
                            String str2 = c105824pt.A0X;
                            str2.getClass();
                            c105824pt.A0e.getClass();
                            oMc.A03(str2);
                            String str3 = this.A0G;
                            if (str3 != null && str3.length() != 0 && (str = this.A0H) != null && !AbstractC001900j.A0T(str)) {
                                HashMap hashMap = new HashMap();
                                JSONObject jSONObject = new JSONObject(str);
                                Iterator<String> keys = jSONObject.keys();
                                C14360o3.A07(keys);
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    hashMap.put(next, jSONObject.optString(next));
                                }
                                new C688938a(this.A0N).A00(this.A0K, null, null, str3, hashMap);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC145136gY
    public final void onDestroyView() {
        C56178Owl c56178Owl;
        C56180Own c56180Own;
        C52841NZy c52841NZy;
        C56162OwU c56162OwU;
        this.A03 = null;
        A01(this);
        C138376Ot c138376Ot = this.A01;
        if (c138376Ot != null && (c56162OwU = c138376Ot.A09) != null) {
            c56162OwU.A0A.onStop();
        }
        C138376Ot c138376Ot2 = this.A01;
        if (c138376Ot2 != null && (c52841NZy = c138376Ot2.A0J) != null) {
            c52841NZy.A05.onStop();
        }
        C138376Ot c138376Ot3 = this.A01;
        if (c138376Ot3 != null && (c56180Own = c138376Ot3.A0D) != null) {
            c56180Own.A03.onStop();
        }
        C138376Ot c138376Ot4 = this.A01;
        if (c138376Ot4 != null && (c56178Owl = c138376Ot4.A0A) != null) {
            c56178Owl.A01.onStop();
        }
        A02(this);
        UserSession userSession = this.A0N;
        AbstractC59962oe abstractC59962oe = this.A0K;
        int hashCode = abstractC59962oe.hashCode();
        java.util.Set set = ((C143216dL) userSession.A01(C143216dL.class, C143206dK.A00)).A00;
        set.remove(Integer.valueOf(hashCode));
        if (set.isEmpty()) {
            AbstractC147826l7.A0K.A01(userSession, EnumC142806cg.A05);
        }
        int hashCode2 = abstractC59962oe.hashCode();
        java.util.Set set2 = ((C143236dN) userSession.A01(C143236dN.class, C143226dM.A00)).A00;
        set2.remove(Integer.valueOf(hashCode2));
        if (set2.isEmpty()) {
            AbstractC147746kz.A0A.A01(userSession, EnumC142806cg.A05);
        }
    }

    public static final void A00(C105824pt c105824pt, C147716kw c147716kw) {
        Reel A0L;
        InterfaceC1118853a interfaceC1118853a;
        C41181vS AuU;
        C55012OVx c55012OVx = c147716kw.A04;
        if ((c55012OVx != null && c55012OVx.A01()) || (A0L = C1OU.A04(c147716kw.A0N).A0L(c105824pt.A03().getId())) == null) {
            return;
        }
        C147696ku c147696ku = c147716kw.A0R;
        if (A0L.A0H == c105824pt || (AuU = (interfaceC1118853a = c147696ku.A02).AuU()) == null) {
            return;
        }
        UserSession userSession = c147696ku.A01;
        C41551w4 c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a;
        String str = null;
        if (c41551w4 != null) {
            C41181vS A08 = c41551w4.A08(userSession);
            C38321qM c38321qM = A08.A0b;
            if (A08.CY4() && c38321qM != null) {
                str = c38321qM.getId();
            }
        }
        if (str != null) {
            User user = AuU.A0i;
            if (user != null) {
                user.getId();
                C14360o3.A07(AuU.A0j);
                C14360o3.A07(A0L.getId());
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        InterfaceC16620sF interfaceC16620sF = c147696ku.A04;
        String str2 = AuU.A0j;
        C14360o3.A07(str2);
        String id = A0L.getId();
        C14360o3.A07(id);
        interfaceC16620sF.invoke(str2, id);
    }

    public static final void A01(C147716kw c147716kw) {
        C3DN A00;
        FragmentActivity activity = c147716kw.A0K.getActivity();
        if (activity != null && (A00 = C3DN.A00.A00(activity)) != null) {
            C3DP c3dp = (C3DP) A00;
            if (c3dp.A0h && !c3dp.A0b) {
                A00.A0B();
            }
        }
    }

    public static final void A02(C147716kw c147716kw) {
        C56044OuG c56044OuG;
        String str;
        if (c147716kw.A0B) {
            c147716kw.A0B = false;
            c147716kw.A0F = false;
            C138376Ot c138376Ot = c147716kw.A01;
            if (c138376Ot != null && (c56044OuG = c138376Ot.A0I) != null) {
                C105824pt c105824pt = c147716kw.A00;
                if (c105824pt != null) {
                    str = c105824pt.A0X;
                    str.getClass();
                } else {
                    str = null;
                }
                ((C51041Mgr) c56044OuG.A08.getValue()).A03(str);
                C56161OwT c56161OwT = c56044OuG.A06.A0L;
                if (c56161OwT != null) {
                    C50947MfG c50947MfG = c56161OwT.A00;
                    if (c50947MfG == null) {
                        C14360o3.A0F("viewModel");
                        throw C00O.createAndThrow();
                    }
                    AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new PYu(c50947MfG, null, 8), AbstractC141776au.A00(c50947MfG));
                    AnonymousClass195 anonymousClass195 = c56161OwT.A02;
                    if (anonymousClass195 != null) {
                        anonymousClass195.AGH(null);
                    }
                    c56161OwT.A02 = null;
                    AnonymousClass195 anonymousClass1952 = c56161OwT.A01;
                    if (anonymousClass1952 != null) {
                        anonymousClass1952.AGH(null);
                    }
                    c56161OwT.A01 = null;
                    ValueAnimator valueAnimator = c56161OwT.A03;
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.cancel();
                }
            }
            c147716kw.A01 = null;
            c147716kw.A00 = null;
            c147716kw.A04 = null;
            OMc oMc = c147716kw.A06;
            if (oMc != null) {
                oMc.A01();
            }
            OMc oMc2 = c147716kw.A06;
            if (oMc2 != null) {
                oMc2.A01 = null;
                oMc2.A02 = true;
            }
            c147716kw.A06 = null;
            UserSession userSession = c147716kw.A0N;
            if (C18U.A06(C06090Tz.A05, userSession, 36326442547558272L)) {
                C3KW.A01(c147716kw.A0K.requireActivity(), userSession).A02 = null;
            }
            c147716kw.A0I.removeCallbacksAndMessages(null);
            C55852Or2 c55852Or2 = c147716kw.A02;
            if (c55852Or2 != null) {
                c55852Or2.destroy();
            }
            c147716kw.A02 = null;
            C54801OJv c54801OJv = c147716kw.A08;
            if (c54801OJv != null) {
                NRG A00 = AbstractC54273Nyt.A00(userSession);
                C18920wW c18920wW = A00.A00;
                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_user_pay_viewer_exited_live");
                OCW ocw = A00.A01;
                A002.AAP("media_id", ocw.A02);
                A002.AAP("container_module", ocw.A01);
                A002.AAP("product_type", ocw.A03);
                A002.Cht();
                c54801OJv.A09.unregisterLifecycleListener(c54801OJv.A02);
            }
            c147716kw.A08 = null;
            OUD oud = c147716kw.A07;
            if (oud != null) {
                ((C56138Ovy) oud.A04.getValue()).A01();
                OUD.A05 = null;
            }
            c147716kw.A07 = null;
            C138376Ot c138376Ot2 = c147716kw.A01;
            if (c138376Ot2 != null) {
                c138376Ot2.A0B = null;
            }
            c147716kw.A0M.A01();
            C147776l2 c147776l2 = c147716kw.A03;
            if (c147776l2 != null) {
                c147776l2.A02 = "0";
                c147776l2.A03 = "0";
                c147776l2.A04 = "0";
            }
            c147716kw.A0W.A02();
            NRG.A02 = null;
            if (AbstractC109224vo.A05(userSession)) {
                ((ReelViewerFragment) c147716kw.A0R.A02).A1C.notifyDataSetChanged();
            }
        }
    }

    public static final boolean A04(C147716kw c147716kw) {
        if (c147716kw.A0B && c147716kw.A04 != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ int Bs6() {
        return 0;
    }

    @Override // X.InterfaceC145136gY
    public final boolean Cc5() {
        Integer num;
        C55012OVx c55012OVx = this.A04;
        if (c55012OVx != null) {
            num = c55012OVx.A03;
        } else {
            num = null;
        }
        if (num != C05F.A0j) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (X.C14360o3.A0K(r21.A01, r24) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x00ca, code lost:
    
        if (r4 != null) goto L13;
     */
    /* JADX WARN: Type inference failed for: r10v12, types: [X.NZl, X.OwS] */
    @Override // X.InterfaceC145136gY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D8t(X.C41181vS r22, X.C41551w4 r23, X.InterfaceC143576dw r24, X.C141596ac r25) {
        /*
            Method dump skipped, instructions count: 1245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147716kw.D8t(X.1vS, X.1w4, X.6dw, X.6ac):void");
    }

    @Override // X.InterfaceC145136gY
    public final void DPQ() {
        C147776l2 c147776l2 = this.A03;
        if (c147776l2 != null) {
            C18920wW c18920wW = c147776l2.A08;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_live_tap_copy_link_button");
            A00.AAP("view_mode", "viewer");
            A00.A9K("a_pk", AbstractC003100w.A0k(10, c147776l2.A03));
            A00.AAP("m_pk", c147776l2.A04);
            A00.A9K(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(c147776l2.A02)));
            A00.AAP("container_module", c147776l2.A07.getModuleName());
            A00.AAk("current_guest_ids", AbstractC001800i.A0a(c147776l2.A06));
            A00.Cht();
        }
    }

    @Override // X.InterfaceC145136gY
    public final void DPR() {
        C147776l2 c147776l2 = this.A03;
        if (c147776l2 != null) {
            C18920wW c18920wW = c147776l2.A08;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_live_tap_share_link_button");
            A00.AAP("view_mode", "viewer");
            A00.A9K("a_pk", AbstractC003100w.A0k(10, c147776l2.A03));
            A00.AAP("m_pk", c147776l2.A04);
            A00.A9K(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(c147776l2.A02)));
            A00.AAP("container_module", c147776l2.A07.getModuleName());
            A00.AAk("current_guest_ids", AbstractC001800i.A0a(c147776l2.A06));
            A00.Cht();
        }
    }

    @Override // X.InterfaceC145136gY
    public final void DWn() {
        C147776l2 c147776l2 = this.A03;
        if (c147776l2 != null) {
            C18920wW c18920wW = c147776l2.A08;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, MSV.A00(1265));
            A00.AAK(new C4SX(Long.valueOf(Long.parseLong(c147776l2.A03))), "a_pk");
            A00.A9K(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(c147776l2.A02)));
            A00.AAP("container_module", c147776l2.A07.getModuleName());
            A00.AAP("m_pk", c147776l2.A04);
            A00.AAP("view_mode", "viewer");
            A00.AAk("current_guest_ids", AbstractC001800i.A0a(c147776l2.A06));
            A00.Cht();
        }
    }

    @Override // X.InterfaceC147726kx
    public final boolean Ejd(String str) {
        C105824pt c105824pt = this.A00;
        if (c105824pt != null) {
            c105824pt.A0X.getClass();
            return !r0.equals(str);
        }
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        if (i == 5151 && i2 == 0 && intent != null && (stringExtra = intent.getStringExtra(MSV.A00(348))) != null) {
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A05();
            c146106i8.A0H = StringFormatUtil.formatStrLocaleSafe("reel_viewer_request_error_with_code_%d", Integer.valueOf(i));
            c146106i8.A0D = stringExtra;
            C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
        }
        C55012OVx c55012OVx = this.A04;
        if (c55012OVx != null) {
            c55012OVx.A05 = true;
            C55012OVx.A00(c55012OVx);
        } else {
            this.A0E = true;
        }
        this.A0C = true;
    }

    public C147716kw(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, C147696ku c147696ku, C1M1 c1m1, InterfaceC147636ko interfaceC147636ko, InterfaceC147636ko interfaceC147636ko2, String str, String str2, String str3, String str4, String str5, InterfaceC16820sZ interfaceC16820sZ) {
        this.A0N = userSession;
        this.A0J = fragmentActivity;
        this.A0K = abstractC59962oe;
        this.A0Z = interfaceC16820sZ;
        this.A0R = c147696ku;
        this.A0U = interfaceC147636ko;
        this.A09 = str;
        this.A0X = str2;
        this.A0G = str3;
        this.A0H = str4;
        this.A0S = c1m1;
        this.A0Y = str5;
        this.A0L = interfaceC11380iw;
        this.A0Q = c3g2;
        this.A0P = interfaceC60442pS;
        this.A03 = (C147776l2) AbstractC147736ky.A00(interfaceC11380iw, userSession).A05.getValue();
        this.A0V = new C147796l4(interfaceC11380iw, userSession);
        this.A0O = AbstractC147806l5.A00(userSession);
        EnumC142806cg enumC142806cg = EnumC142806cg.A05;
        IgLiveBroadcastInfoManager A01 = AbstractC147816l6.A00(userSession).A01();
        IgLiveQuestionsRepository igLiveQuestionsRepository = (IgLiveQuestionsRepository) AbstractC147816l6.A00(userSession).A0D.getValue();
        IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository = (IgLiveQuestionSubmissionsRepository) AbstractC147816l6.A00(userSession).A0C.getValue();
        this.A0W = new C147896lL(userSession, enumC142806cg, (InterfaceC147786l3) AbstractC147746kz.A0A.A00(abstractC59962oe, userSession, enumC142806cg).A06.getValue(), (C147886lK) AbstractC147816l6.A00(userSession).A0B.getValue(), igLiveQuestionSubmissionsRepository, igLiveQuestionsRepository, A01);
        C14360o3.A0B(interfaceC147636ko2, 0);
        this.A0T = new C147906lM(interfaceC147636ko2);
        ((C143216dL) userSession.A01(C143216dL.class, C143206dK.A00)).A00.add(Integer.valueOf(abstractC59962oe.hashCode()));
        ((C143236dN) userSession.A01(C143236dN.class, C143226dM.A00)).A00.add(Integer.valueOf(abstractC59962oe.hashCode()));
        AbstractC147826l7.A0K.A00(userSession, enumC142806cg).A03.A00 = interfaceC147636ko;
    }

    private final boolean A03() {
        C138376Ot c138376Ot;
        View view;
        if (A04(this) && this.A0F && (c138376Ot = this.A01) != null && (view = c138376Ot.A0T) != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final boolean BWM() {
        C41181vS c41181vS;
        if (A04(this) && this.A0C) {
            EnumC40111tc enumC40111tc = EnumC40111tc.A0L;
            C138376Ot c138376Ot = this.A01;
            if (c138376Ot != null && (c41181vS = c138376Ot.A02) != null && enumC40111tc == c41181vS.A0C()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC147726kx
    public final Integer BeW(String str) {
        if (Ejd(str)) {
            return C05F.A0C;
        }
        return null;
    }

    @Override // X.InterfaceC145136gY
    public final boolean Buz() {
        C55012OVx c55012OVx;
        if (A04(this) && ((c55012OVx = this.A04) == null || c55012OVx.A01())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final void DOJ(int i) {
        OMc oMc;
        if (A04(this) && (oMc = this.A06) != null) {
            oMc.A02(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[RETURN] */
    @Override // X.InterfaceC145136gY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DrR() {
        /*
            r4 = this;
            boolean r0 = r4.A03()
            if (r0 == 0) goto L33
            X.6Ot r0 = r4.A01
            if (r0 == 0) goto L22
            X.NZc r0 = r0.A06
            if (r0 == 0) goto L22
            boolean r0 = r0.A04()
        L12:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L16:
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 == 0) goto L33
            return r1
        L22:
            X.OMc r1 = r4.A06
            if (r1 == 0) goto L31
            boolean r0 = r1.A03
            if (r0 == 0) goto L2f
            r1.A00()
            r0 = 1
            goto L12
        L2f:
            r0 = 0
            goto L12
        L31:
            r2 = 0
            goto L16
        L33:
            boolean r0 = A04(r4)
            if (r0 == 0) goto L54
            X.1VN r0 = X.C1VN.A00
            if (r0 == 0) goto L54
            boolean r0 = r4.BWM()
            if (r0 == 0) goto L54
            X.1VN r3 = X.AbstractC31282Dp4.A00()
            X.2oe r0 = r4.A0K
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = r4.A0N
            java.lang.String r0 = "350250235394743"
            r3.A02(r1, r2, r0)
        L54:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147716kw.DrR():boolean");
    }

    @Override // X.InterfaceC145136gY
    public final boolean Dra() {
        OMc oMc;
        if (!A03() || (oMc = this.A06) == null || oMc.A03) {
            return false;
        }
        EditText editText = oMc.A09;
        editText.requestFocus();
        AbstractC13880nE.A0R(editText);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[RETURN] */
    @Override // X.InterfaceC145136gY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DsD() {
        /*
            r4 = this;
            boolean r0 = A04(r4)
            r3 = 0
            if (r0 == 0) goto L32
            boolean r0 = r4.A03()
            if (r0 == 0) goto L32
            X.6Ot r0 = r4.A01
            if (r0 == 0) goto L29
            X.NZc r0 = r0.A06
            if (r0 == 0) goto L29
            boolean r0 = r0.A05()
        L19:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L1d:
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 == 0) goto L32
            return r1
        L29:
            X.OMc r0 = r4.A06
            if (r0 == 0) goto L30
            boolean r0 = r0.A03
            goto L19
        L30:
            r2 = 0
            goto L1d
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147716kw.DsD():boolean");
    }

    @Override // X.InterfaceC145136gY
    public final void Dyy() {
        if (A04(this)) {
            C55012OVx c55012OVx = this.A04;
            if (c55012OVx != null) {
                c55012OVx.A06 = true;
                C55012OVx.A00(c55012OVx);
            }
            OMc oMc = this.A06;
            if (oMc != null) {
                oMc.A01();
            }
        }
    }

    @Override // X.InterfaceC145136gY
    public final void Dz0() {
        C55012OVx c55012OVx;
        if (A04(this) && (c55012OVx = this.A04) != null) {
            c55012OVx.A04 = true;
            C55012OVx.A00(c55012OVx);
            if (c55012OVx.A00 < 5) {
                C147716kw c147716kw = c55012OVx.A07;
                Handler handler = c147716kw.A0I;
                handler.removeCallbacksAndMessages(null);
                handler.postDelayed(new RunnableC56938POf(c147716kw), 3000L);
                c55012OVx.A00++;
            }
        }
    }

    @Override // X.InterfaceC145136gY
    public final void Dz7() {
        IgImageView igImageView;
        if (A04(this)) {
            C55012OVx c55012OVx = this.A04;
            if (c55012OVx != null) {
                c55012OVx.A01 = SystemClock.elapsedRealtime();
                c55012OVx.A04 = false;
                c55012OVx.A00 = 0;
                C55012OVx.A00(c55012OVx);
            }
            C138376Ot c138376Ot = this.A01;
            if (c138376Ot != null && (igImageView = c138376Ot.A0X) != null) {
                igImageView.setVisibility(8);
            }
        }
    }
}
