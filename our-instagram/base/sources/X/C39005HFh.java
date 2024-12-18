package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerDirectData;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.HFh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39005HFh extends C1P1 {
    public final /* synthetic */ IG6 A00;

    public C39005HFh(IG6 ig6) {
        this.A00 = ig6;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        C2JS optionalTreeField;
        C2JS requiredTreeField;
        C2JS reinterpretRequired;
        String str;
        int A03 = C0f9.A03(-1108070192);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A032 = C0f9.A03(-1513344480);
        C14360o3.A0B(anonymousClass435, 0);
        IG6 ig6 = this.A00;
        C2JS c2js = (C2JS) anonymousClass435.A01;
        if (c2js != null && (optionalTreeField = c2js.getOptionalTreeField(0, AbstractC58317Pt9.A00(1058), QYH.class, -711053695)) != null && (requiredTreeField = optionalTreeField.getRequiredTreeField(0, "sender", QYG.class, 1362168056)) != null && (reinterpretRequired = requiredTreeField.reinterpretRequired(0, QYF.class, 719220713)) != null) {
            UserSession userSession = ig6.A00;
            C1DU A00 = C1DS.A00(userSession);
            Parcelable.Creator creator = User.CREATOR;
            User A01 = AbstractC38851rI.A01(new C1DY((C1DV) A00, (java.util.Set) AbstractC166987dD.A1H(), false), (ImmutablePandoUserDict) reinterpretRequired.reinterpret(ImmutablePandoUserDict.class));
            if (A01 != null) {
                C9CG c9cg = new C9CG(new C9BN(-1L, A01, 1));
                C43754JWs A002 = AbstractC37837Gkr.A00(userSession);
                List A1J = AbstractC166987dD.A1J(c9cg);
                List list = A002.A01;
                if (list == null) {
                    list = AbstractC166987dD.A1E();
                    A002.A01 = list;
                }
                list.clear();
                List list2 = A002.A01;
                if (list2 != null) {
                    list2.addAll(A1J);
                }
                FriendshipStatus B8n = A01.A03.B8n();
                if (B8n != null && AbstractC166997dE.A1Z(B8n.B7V(), true)) {
                    C41194ILi c41194ILi = ig6.A01;
                    C59952od c59952od = c41194ILi.A02;
                    C37628GhN c37628GhN = c59952od.A0A;
                    if (c37628GhN != null) {
                        c37628GhN.A0A();
                    }
                    DirectShareTarget directShareTarget = new DirectShareTarget(A01);
                    C37540Gfw c37540Gfw = c59952od.A09;
                    if (c37540Gfw != null) {
                        View view = c41194ILi.A00;
                        ClipsViewerConfig clipsViewerConfig = c37540Gfw.A0W;
                        boolean z = false;
                        ClipsReplyBarData clipsReplyBarData = new ClipsReplyBarData(directShareTarget, null, null, null, null, null, "clips_viewer_external_send", null, null, null, clipsViewerConfig.A0n, 0, 0, false, false, false, true, false, false, false, false, false, false);
                        C37546Gg2 c37546Gg2 = (C37546Gg2) c37540Gfw.A20.invoke();
                        UserSession userSession2 = c37540Gfw.A0Y;
                        C37522Gfe c37522Gfe = c37540Gfw.A19;
                        FragmentActivity fragmentActivity = c37540Gfw.A0R;
                        AbstractC39459Hbl abstractC39459Hbl = c37540Gfw.A0q;
                        C43756JWu c43756JWu = c37540Gfw.A0D;
                        C37851Gl5 c37851Gl5 = c37540Gfw.A0B;
                        ClipsViewerDirectData clipsViewerDirectData = clipsViewerConfig.A0I;
                        if (clipsViewerDirectData != null) {
                            z = clipsViewerDirectData.A09;
                        }
                        C43755JWt c43755JWt = new C43755JWt(fragmentActivity, clipsViewerConfig.A0J, clipsReplyBarData, userSession2, c37522Gfe, abstractC39459Hbl, c37546Gg2, c37540Gfw.A09, c37851Gl5, c43756JWu, z);
                        c37540Gfw.A0z.A00(c43755JWt);
                        c43755JWt.onViewCreated(view, null);
                        c37540Gfw.A0H = c43755JWt;
                        C37540Gfw c37540Gfw2 = c59952od.A09;
                        if (c37540Gfw2 != null) {
                            AbstractC43757JWv abstractC43757JWv = c37540Gfw2.A0H;
                            if (abstractC43757JWv != null) {
                                SwipeRefreshLayout swipeRefreshLayout = c41194ILi.A01;
                                C37556GgC c37556GgC = c59952od.A0N;
                                str = "clipsViewerViewPager";
                                if (c37556GgC != null) {
                                    c37556GgC.A0G(abstractC43757JWv);
                                    C37556GgC c37556GgC2 = c59952od.A0N;
                                    if (c37556GgC2 != null) {
                                        IN9 in9 = c59952od.A0J;
                                        if (in9 != null) {
                                            C37540Gfw c37540Gfw3 = c59952od.A09;
                                            if (c37540Gfw3 != null) {
                                                abstractC43757JWv.A08(swipeRefreshLayout, c37540Gfw3.A13, in9, c37556GgC2);
                                            }
                                        }
                                        str = "overlayFragmentController";
                                    }
                                }
                                C14360o3.A0F(str);
                                throw C00O.createAndThrow();
                            }
                            if (C18U.A06(C06090Tz.A05, C59952od.A01(c59952od), 36324664431227227L)) {
                                C37840Gku c37840Gku = c59952od.A05;
                                if (c37840Gku != null) {
                                    c37840Gku.A02 = new DirectShareTarget(A01);
                                    c37840Gku.A03 = true;
                                    C37841Gkv c37841Gkv = c37840Gku.A0D;
                                    ImageUrl Bhu = A01.Bhu();
                                    GradientSpinnerAvatarView gradientSpinnerAvatarView = c37841Gkv.A08;
                                    if (gradientSpinnerAvatarView != null) {
                                        gradientSpinnerAvatarView.A0F(null, c37841Gkv.A0H, Bhu);
                                    }
                                    GradientSpinnerAvatarView gradientSpinnerAvatarView2 = c37841Gkv.A08;
                                    if (gradientSpinnerAvatarView2 != null) {
                                        gradientSpinnerAvatarView2.A05();
                                    }
                                }
                            } else {
                                c41194ILi.A00();
                                C37540Gfw c37540Gfw4 = c59952od.A09;
                                if (c37540Gfw4 != null) {
                                    C37851Gl5 c37851Gl52 = c37540Gfw4.A0B;
                                    if (c37851Gl52 != null) {
                                        AbstractC167007dF.A0x(c37851Gl52.A02);
                                    }
                                    C37540Gfw c37540Gfw5 = c59952od.A09;
                                    if (c37540Gfw5 != null) {
                                        C37851Gl5 c37851Gl53 = c37540Gfw5.A0B;
                                        if (c37851Gl53 != null) {
                                            c37851Gl53.A05 = true;
                                        }
                                    }
                                }
                            }
                            i = 825163874;
                            C0f9.A0A(i, A032);
                            C0f9.A0A(-485496146, A03);
                        }
                    }
                    C14360o3.A0F("clipsViewerFragmentViewModel");
                    throw C00O.createAndThrow();
                }
                FriendshipStatus B8n2 = A01.A03.B8n();
                if (B8n2 != null && AbstractC166997dE.A1Z(B8n2.B7V(), false)) {
                    C41194ILi c41194ILi2 = ig6.A01;
                    C59952od c59952od2 = c41194ILi2.A02;
                    C120985dq A003 = C37624GhJ.A00(c59952od2);
                    if (A003 != null && A003.A02 != null) {
                        C37540Gfw c37540Gfw6 = c59952od2.A09;
                        if (c37540Gfw6 != null) {
                            c37540Gfw6.A0P = true;
                            c41194ILi2.A00();
                            C37540Gfw c37540Gfw7 = c59952od2.A09;
                            if (c37540Gfw7 != null) {
                                C37851Gl5 c37851Gl54 = c37540Gfw7.A0B;
                                if (c37851Gl54 != null) {
                                    AbstractC167007dF.A0x(c37851Gl54.A02);
                                }
                                C37540Gfw c37540Gfw8 = c59952od2.A09;
                                if (c37540Gfw8 != null) {
                                    View view2 = c41194ILi2.A00;
                                    Context context = c37540Gfw8.A0Q;
                                    UserSession userSession3 = c37540Gfw8.A0Y;
                                    C37624GhJ c37624GhJ = c37540Gfw8.A1L;
                                    C37675GiC c37675GiC = c37540Gfw8.A06;
                                    if (c37675GiC != null) {
                                        C39467Hbt c39467Hbt = new C39467Hbt(context, c37540Gfw8.A19, userSession3, A01, c37675GiC, c37624GhJ);
                                        c37540Gfw8.A0z.A00(c39467Hbt);
                                        c39467Hbt.onViewCreated(view2, null);
                                        c37540Gfw8.A0F = c39467Hbt;
                                        C37540Gfw c37540Gfw9 = c59952od2.A09;
                                        if (c37540Gfw9 != null) {
                                            C39467Hbt c39467Hbt2 = c37540Gfw9.A0F;
                                            if (c39467Hbt2 != null) {
                                                SwipeRefreshLayout swipeRefreshLayout2 = c41194ILi2.A01;
                                                C37556GgC c37556GgC3 = c59952od2.A0N;
                                                str = "clipsViewerViewPager";
                                                if (c37556GgC3 != null) {
                                                    c37556GgC3.A0G(c39467Hbt2);
                                                    C37556GgC c37556GgC4 = c59952od2.A0N;
                                                    if (c37556GgC4 != null) {
                                                        IN9 in92 = c59952od2.A0J;
                                                        if (in92 != null) {
                                                            C37540Gfw c37540Gfw10 = c59952od2.A09;
                                                            if (c37540Gfw10 != null) {
                                                                c39467Hbt2.A08(swipeRefreshLayout2, c37540Gfw10.A13, in92, c37556GgC4);
                                                            }
                                                        }
                                                        str = "overlayFragmentController";
                                                    }
                                                }
                                                C14360o3.A0F(str);
                                                throw C00O.createAndThrow();
                                            }
                                        }
                                    } else {
                                        throw AbstractC166997dE.A0g();
                                    }
                                }
                            }
                        }
                        C14360o3.A0F("clipsViewerFragmentViewModel");
                        throw C00O.createAndThrow();
                    }
                    i = 261124004;
                    C0f9.A0A(i, A032);
                    C0f9.A0A(-485496146, A03);
                }
            }
        }
        ig6.A01.A00();
        i = -1586935577;
        C0f9.A0A(i, A032);
        C0f9.A0A(-485496146, A03);
    }
}
