package X;

import android.app.Activity;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.Iec, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41761Iec {
    public static final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        J24 j24;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, interfaceC11380iw);
        if (!C37548Gg4.A08) {
            AbstractC40921IAt.A00(interfaceC11380iw, userSession).A01.clear();
            INO ino = C37548Gg4.A05;
            if (ino != null) {
                ino.A00();
            }
            INO ino2 = C37548Gg4.A05;
            if (ino2 != null) {
                ino2.A04.clear();
                ino2.A02 = null;
                ino2.A01 = -1;
                C41711wL.A01(ino2.A03).A0C(ino2.A00);
            }
            C37548Gg4.A05 = null;
            C37548Gg4.A03 = 0;
            IHZ ihz = C37548Gg4.A04;
            if (ihz != null) {
                ihz.A02.clear();
                ihz.A00 = 0;
            }
            C37548Gg4.A04 = null;
            C37548Gg4.A09 = false;
            C37548Gg4.A0A = false;
            return;
        }
        INO ino3 = C37548Gg4.A05;
        if (ino3 == null || (j24 = ino3.A02) == null) {
            return;
        }
        C5TA c5ta = j24.A01;
        if (c5ta != null) {
            c5ta.A09("user_paused_video");
        }
        J24.A01(j24, A1R);
    }

    private final void A05(InterfaceC11380iw interfaceC11380iw, UserSession userSession, LinkedHashMap linkedHashMap, boolean z) {
        C41112IId A00 = AbstractC40921IAt.A00(interfaceC11380iw, userSession);
        JSONArray jSONArray = new JSONArray();
        Iterator A0l = AbstractC167007dF.A0l(linkedHashMap);
        while (A0l.hasNext()) {
            Object A0l2 = AbstractC166997dE.A0l(A0l);
            if (!A00.A01.containsKey(A0l2)) {
                jSONArray.put(A0l2);
            }
        }
        if (z) {
            INO ino = C37548Gg4.A05;
            if (ino == null) {
                C37548Gg4.A05 = new INO(userSession);
            } else {
                ino.A04.clear();
                ino.A02 = null;
                ino.A01 = -1;
            }
        }
        if (jSONArray.length() == 0 && z) {
            A04(interfaceC11380iw, userSession, linkedHashMap);
            return;
        }
        C1OK c1ok = new C1OK();
        C1ON A03 = AbstractC37797GkC.A03(c1ok.A00, userSession, jSONArray.toString());
        A03.A00 = new EU0(4, A00, interfaceC11380iw, linkedHashMap, userSession, z);
        C37548Gg4.A0C.add(c1ok);
        C1GJ.A06(A03, 1368380687, 2, true, false);
    }

    public final void A06(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C39463Hbp c39463Hbp, List list) {
        IG1 ig1;
        ExtendedImageUrl extendedImageUrl;
        User CDj;
        boolean A1V = AbstractC167007dF.A1V(userSession);
        int A08 = AbstractC25230BEn.A08(3, interfaceC11380iw, activity);
        if (C37548Gg4.A08) {
            int i = C37548Gg4.A03 - A08;
            if (i < 0) {
                i = 0;
            }
            C37548Gg4.A03 = i;
            INO ino = C37548Gg4.A05;
            if (ino != null) {
                ino.A04.clear();
                ino.A02 = null;
            }
            int i2 = 0;
            do {
                LinkedList linkedList = c39463Hbp.A01;
                C43057J1x c43057J1x = (C43057J1x) linkedList.removeFirst();
                linkedList.add(c43057J1x);
                C14360o3.A0A(c43057J1x);
                if (c43057J1x.A01.getText().toString().length() == 0 && (CDj = ((C47N) list.get(C37548Gg4.A03)).CDj()) != null) {
                    A01(activity, interfaceC11380iw, userSession, CDj, c43057J1x, i2, C37548Gg4.A03, false, false);
                }
                C47N c47n = (C47N) list.get(C37548Gg4.A03);
                C41112IId A00 = AbstractC40921IAt.A00(interfaceC11380iw, userSession);
                String Blg = c47n.Blg();
                if (Blg != null) {
                    IgImageView igImageView = c43057J1x.A06;
                    if (igImageView.A0C == null && (ig1 = (IG1) A00.A01.get(Blg)) != null && (extendedImageUrl = ig1.A00) != null) {
                        igImageView.setUrl(extendedImageUrl, interfaceC11380iw);
                    }
                    IG1 ig12 = (IG1) A00.A01.get(Blg);
                    if (ig12 != null) {
                        J24 j24 = new J24(interfaceC11380iw, userSession, ig12.A01, c43057J1x);
                        j24.A04(false);
                        INO ino2 = C37548Gg4.A05;
                        if (ino2 != null) {
                            j24.A03 = ino2;
                            ino2.A04.add(j24);
                        }
                    }
                }
                C37548Gg4.A03++;
                i2++;
            } while (i2 < A08);
            INO ino3 = C37548Gg4.A05;
            if (ino3 != null) {
                int i3 = ino3.A01;
                for (int i4 = -1; i4 < i3; i4++) {
                    LinkedList linkedList2 = ino3.A04;
                    J24 j242 = (J24) linkedList2.removeFirst();
                    ino3.A02 = j242;
                    if (j242 != null) {
                        linkedList2.add(j242);
                    }
                }
                ino3.A01();
            }
            C37548Gg4.A08 = false;
        } else {
            A02(activity, interfaceC11380iw, userSession, this, c39463Hbp, list, A1V);
        }
        View view = c39463Hbp.A00.A04;
        if (view != null) {
            C0fQ.A00(new ViewOnClickListenerC41994IjP(3, activity, interfaceC11380iw, userSession, c39463Hbp, list), view);
        }
    }

    public static final void A00() {
        if (C37548Gg4.A07 && C37548Gg4.A06) {
            INO ino = C37548Gg4.A05;
            if (ino != null) {
                ino.A02();
            }
            C37548Gg4.A07 = false;
            C37548Gg4.A06 = false;
            C37548Gg4.A0A = true;
        }
    }

    public static final void A01(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, C43057J1x c43057J1x, int i, int i2, boolean z, boolean z2) {
        if (C37548Gg4.A04 == null) {
            C37548Gg4.A04 = new IHZ(interfaceC11380iw, userSession);
        }
        int i3 = 8;
        c43057J1x.A03.setVisibility(AbstractC167007dF.A05(user.isVerified() ? 1 : 0));
        AbstractC31173DnH.A1F(c43057J1x.A01, user);
        AbstractC31173DnH.A1T(interfaceC11380iw, c43057J1x.A05, user);
        IgView igView = c43057J1x.A04;
        igView.setAlpha(51.0f);
        if (C18U.A06(C06090Tz.A06, userSession, 36319450340924870L)) {
            i3 = 0;
        }
        igView.setVisibility(i3);
        ViewOnClickListenerC41993IjO viewOnClickListenerC41993IjO = new ViewOnClickListenerC41993IjO(activity, interfaceC11380iw, userSession, user, i2, 6);
        View view = c43057J1x.A00;
        C0fQ.A00(viewOnClickListenerC41993IjO, view);
        if (user.B7L() == FollowStatus.A08) {
            user.A0k(FollowStatus.A06);
        }
        FollowButton followButton = c43057J1x.A08;
        AbstractC31173DnH.A0z(followButton.getContext(), followButton, R.color.grey_7_75_transparent);
        ((FollowButtonBase) followButton).A07 = true;
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
        viewOnAttachStateChangeListenerC110564yT.A08(new C39431HbJ(i2));
        viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, userSession, user);
        IgImageView igImageView = c43057J1x.A06;
        C84743qO c84743qO = new C84743qO();
        c84743qO.A03(new C84773qR().A01());
        igImageView.setImageDrawable(c84743qO);
        c84743qO.A02();
        if (z2) {
            view.setVisibility(4);
            new C139266Sh(view, null, new C139276Si(userSession, i), (i * 100) + 150).A00();
        } else {
            view.setVisibility(0);
            if (z) {
                AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
                A01.A0G();
                AbstractC125325le A0E = A01.A0E(C55942hf.A03(0.5d, 0.5d));
                A0E.A0U(0.95f, 1.0f, -1.0f);
                A0E.A0V(0.95f, 1.0f, -1.0f);
                A0E.A05 = new J0J(i, 2, userSession);
                A0E.A0H();
            }
        }
        IHZ ihz = C37548Gg4.A04;
        if (ihz != null) {
            String id = user.getId();
            if (ihz.A02.add(id)) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(ihz.A01, "suggested_creator_impression");
                A0f.AAP("target_id", id);
                A0f.A8p("position", Integer.valueOf(i2));
                A0f.Cht();
            }
        }
    }

    public static final void A02(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41761Iec c41761Iec, C39463Hbp c39463Hbp, List list, boolean z) {
        int i;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        LinkedHashMap A1I2 = AbstractC166987dD.A1I();
        int size = (C37548Gg4.A03 + 4) % (list.size() - 1);
        while (A1I.size() < 4) {
            LinkedList linkedList = c39463Hbp.A01;
            C43057J1x c43057J1x = (C43057J1x) linkedList.removeFirst();
            linkedList.add(c43057J1x);
            C14360o3.A0A(c43057J1x);
            C47N c47n = (C47N) list.get(C37548Gg4.A03);
            User CDj = c47n.CDj();
            if (CDj != null) {
                A01(activity, interfaceC11380iw, userSession, CDj, c43057J1x, A1I.size(), C37548Gg4.A03, !z, z);
            }
            String Blg = c47n.Blg();
            if (Blg != null) {
                A1I.put(Blg, c43057J1x);
            }
            String Blg2 = ((C47N) list.get(size)).Blg();
            if (Blg2 != null) {
                A1I2.put(Blg2, c43057J1x);
            }
            if (C37548Gg4.A03 == AbstractC31172DnG.A03(list, 1)) {
                i = 0;
            } else {
                i = C37548Gg4.A03 + 1;
            }
            C37548Gg4.A03 = i;
            int i2 = size;
            size++;
            if (i2 == AbstractC31172DnG.A03(list, 1)) {
                size = 0;
            }
        }
        c41761Iec.A05(interfaceC11380iw, userSession, A1I, true);
        c41761Iec.A05(interfaceC11380iw, userSession, A1I2, false);
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, LinkedHashMap linkedHashMap) {
        ExtendedImageUrl extendedImageUrl;
        C41112IId A00 = AbstractC40921IAt.A00(interfaceC11380iw, userSession);
        Iterator A0l = AbstractC167007dF.A0l(linkedHashMap);
        while (A0l.hasNext()) {
            Object A0l2 = AbstractC166997dE.A0l(A0l);
            C43057J1x c43057J1x = (C43057J1x) linkedHashMap.get(A0l2);
            if (c43057J1x != null) {
                HashMap hashMap = A00.A01;
                IG1 ig1 = (IG1) hashMap.get(A0l2);
                if (ig1 != null && (extendedImageUrl = ig1.A00) != null) {
                    c43057J1x.A06.setUrl(extendedImageUrl, interfaceC11380iw);
                }
                IG1 ig12 = (IG1) hashMap.get(A0l2);
                if (ig12 != null) {
                    C39439HbR c39439HbR = ig12.A01;
                    c43057J1x.A07.setVideoSource(c39439HbR.A00, interfaceC11380iw);
                    J24 j24 = new J24(interfaceC11380iw, userSession, c39439HbR, c43057J1x);
                    j24.A04(false);
                    INO ino = C37548Gg4.A05;
                    if (ino != null) {
                        j24.A03 = ino;
                        ino.A04.add(j24);
                    }
                }
            }
        }
        if (AbstractC40922IAu.A00(userSession).booleanValue()) {
            C37548Gg4.A06 = true;
            A00();
        } else {
            INO ino2 = C37548Gg4.A05;
            if (ino2 != null) {
                ino2.A02();
            }
            C37548Gg4.A0A = true;
        }
    }
}
