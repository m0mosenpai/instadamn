package X;

import android.content.Context;
import android.transition.Scene;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.fragment.ProfileDisplayOptionsFragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.sharelater.ShareLaterMedia;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* loaded from: classes9.dex */
public final class P3U implements InterfaceC190658cN {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public P3U(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, X.F7k] */
    @Override // X.InterfaceC190658cN
    public final boolean onToggle(boolean z) {
        String str;
        Integer num;
        Map map;
        String str2;
        ViewGroup viewGroup;
        Scene scene;
        TransitionSet transitionSet;
        int[] iArr;
        int i;
        boolean z2;
        MU0 mu0;
        String str3;
        ShareLaterMedia shareLaterMedia;
        UserSession userSession;
        EnumC72435Xdf enumC72435Xdf;
        String str4;
        C54966OSw c54966OSw;
        switch (this.A00) {
            case 0:
                C44550Jmu c44550Jmu = (C44550Jmu) this.A03;
                LLN lln = c44550Jmu.A00;
                Integer num2 = C05F.A01;
                if (z) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A0N;
                }
                C51733MtG c51733MtG = (C51733MtG) this.A02;
                boolean z3 = c51733MtG.A05;
                Boolean valueOf = Boolean.valueOf(z3);
                boolean z4 = c51733MtG.A02;
                Boolean valueOf2 = Boolean.valueOf(z4);
                JWd jWd = (JWd) this.A01;
                Map map2 = null;
                if (jWd != null) {
                    map = (Map) jWd.A00;
                } else {
                    map = null;
                }
                boolean z5 = c51733MtG.A03;
                Boolean valueOf3 = Boolean.valueOf(z5);
                boolean z6 = c51733MtG.A04;
                lln.A07(valueOf, valueOf2, valueOf3, Boolean.valueOf(z6), num2, num, map, null, AbstractC06930Yk.A0E());
                if (z) {
                    if (jWd != null) {
                        map2 = (Map) jWd.A00;
                    }
                    c44550Jmu.A04(map2, true, z3, z4, z5, z6);
                    return true;
                }
                AbstractC166987dD.A1Z(new MCQ(c51733MtG, jWd, c44550Jmu, null, 9), AbstractC141776au.A00(c44550Jmu));
                return false;
            case 1:
                ProfileDisplayOptionsFragment.A02((ProfileDisplayOptionsFragment) this.A03, (IgdsSwitch) this.A02, (Integer) this.A01, z);
                return true;
            case 2:
                C36572GAw c36572GAw = (C36572GAw) this.A03;
                ViewGroup viewGroup2 = c36572GAw.A07;
                if (viewGroup2 == null) {
                    str2 = "rootView";
                } else {
                    viewGroup2.setLayoutTransition(null);
                    String str5 = "viewSwitcher";
                    C34968Fas c34968Fas = c36572GAw.A0E;
                    if (z) {
                        if (c34968Fas != null) {
                            Scene scene2 = c34968Fas.A02;
                            String str6 = "postPicturePreviewScene";
                            if (scene2 != null) {
                                scene2.setEnterAction(c34968Fas.A07);
                                str2 = "sceneRoot";
                                viewGroup = c34968Fas.A05;
                                if (viewGroup != null) {
                                    scene = c34968Fas.A02;
                                    if (scene != null) {
                                        transitionSet = c34968Fas.A04;
                                        if (transitionSet == null) {
                                            str6 = "animatedTransition";
                                        } else {
                                            iArr = new int[]{R.id.user_id};
                                            i = R.id.user_name;
                                            iArr[1] = i;
                                            C34968Fas.A00(scene, transitionSet, viewGroup, iArr);
                                            return true;
                                        }
                                    }
                                }
                            }
                            C14360o3.A0F(str6);
                        }
                        C14360o3.A0F(str5);
                    } else {
                        if (c34968Fas != null) {
                            Scene scene3 = c34968Fas.A01;
                            str5 = "avatarBoxScene";
                            if (scene3 != null) {
                                scene3.setEnterAction(c34968Fas.A06);
                                str2 = "sceneRoot";
                                viewGroup = c34968Fas.A05;
                                if (viewGroup != null) {
                                    scene = c34968Fas.A01;
                                    if (scene != null) {
                                        transitionSet = c34968Fas.A04;
                                        if (transitionSet == null) {
                                            str5 = "animatedTransition";
                                        } else {
                                            iArr = new int[]{R.id.header_container};
                                            i = R.id.footer_container;
                                            iArr[1] = i;
                                            C34968Fas.A00(scene, transitionSet, viewGroup, iArr);
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                        C14360o3.A0F(str5);
                    }
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 3:
                Object obj = this.A02;
                EnumC53382NjX enumC53382NjX = EnumC53382NjX.A05;
                if (obj == enumC53382NjX) {
                    C50808McV c50808McV = (C50808McV) this.A03;
                    UserSession userSession2 = c50808McV.A0J;
                    if (C196218mC.A00(userSession2) || ((shareLaterMedia = c50808McV.A0K) != null && enumC53382NjX.A0A(shareLaterMedia))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 != z && c50808McV.A0A) {
                        if (c50808McV.A08) {
                            str3 = "tooltip_shown_only";
                        } else {
                            str3 = null;
                        }
                        AbstractC54208Nxm.A00(userSession2, "click", str3, z);
                        if (!AbstractC49092Nc.A00(userSession2).A00(CallerContext.A00(C50808McV.class), "ig_android_linking_cache_feed_composer")) {
                            AbstractC35174FfR.A00(EnumC72435Xdf.A0E, userSession2, "upsell_primary_click");
                        }
                        c50808McV.A0A = false;
                    }
                    if (z) {
                        mu0 = MU0.ONE_TIME_ON;
                    } else {
                        mu0 = MU0.ONE_TIME_OFF;
                    }
                    C50808McV.A02(mu0, c50808McV, z);
                }
                ((View) this.A01).performClick();
                return false;
            case 4:
                C50808McV c50808McV2 = (C50808McV) this.A03;
                if (c50808McV2.A0D && (c54966OSw = c50808McV2.A03) != null) {
                    EnumEntries enumEntries = EnumC53382NjX.A03;
                    C54966OSw.A00(c54966OSw, 2131961966, 2131961941);
                    return false;
                }
                ((View) this.A01).performClick();
                if (z) {
                    OAC oac = (OAC) this.A02;
                    if (oac.A01) {
                        userSession = c50808McV2.A0J;
                        C56137Ovx A00 = AbstractC53982Ntt.A00(userSession);
                        String str7 = oac.A00;
                        C05A c05a = A00.A02;
                        c05a.Egh(AnonymousClass090.A01(str7, (java.util.Set) c05a.getValue()));
                        enumC72435Xdf = EnumC72435Xdf.A0F;
                        str4 = "upsells_ig_ig_feed_cross_posting_toggle_turned_on";
                    } else {
                        C56137Ovx A002 = AbstractC53982Ntt.A00(c50808McV2.A0J);
                        AbstractC59962oe abstractC59962oe = c50808McV2.A0I;
                        String str8 = oac.A00;
                        C14360o3.A0B(abstractC59962oe, 0);
                        C28301Yr A003 = AbstractC34213F7l.A00();
                        if (A003.A00 == null) {
                            A003.A00 = new Object();
                        }
                        new Ef5().A01(abstractC59962oe, A002.A03, "ig_ig_feed_cross_posting", str8, 51738);
                        return false;
                    }
                } else {
                    userSession = c50808McV2.A0J;
                    C56137Ovx A004 = AbstractC53982Ntt.A00(userSession);
                    String str9 = ((OAC) this.A02).A00;
                    C05A c05a2 = A004.A02;
                    c05a2.Egh(AnonymousClass090.A03(str9, (java.util.Set) c05a2.getValue()));
                    enumC72435Xdf = EnumC72435Xdf.A0F;
                    str4 = "upsells_ig_ig_feed_cross_posting_toggle_turned_off";
                }
                AbstractC35174FfR.A00(enumC72435Xdf, userSession, str4);
                return true;
            case 5:
                UserSession userSession3 = (UserSession) this.A03;
                Context context = (Context) this.A01;
                MWM mwm = new MWM(21, context, this.A02);
                if (z) {
                    str = "everyone";
                } else {
                    str = "off";
                }
                C1ON A01 = FXB.A01(userSession3, "live_broadcast", str);
                A01.A00 = mwm;
                C1GJ.A03(A01);
                C2OJ.A00().A03(context, userSession3, "live_broadcast");
                return AbstractC31177DnL.A1b(C2OJ.A00().A01(context, userSession3, "live_broadcast"));
            default:
                return false;
        }
    }
}
