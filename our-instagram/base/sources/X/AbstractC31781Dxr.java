package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dxr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31781Dxr extends PopupWindow implements InterfaceC55932he {
    public static final C55942hf A0U = C55942hf.A01();
    public float A00;
    public C55982hj A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final int A0D;
    public final int A0E;
    public final long A0F;
    public final Activity A0G;
    public final Rect A0H;
    public final ViewParent A0I;
    public final LinearLayout A0J;
    public final ConstraintLayout A0K;
    public final InterfaceC11380iw A0L;
    public final UserSession A0M;
    public final C38321qM A0N;
    public final User A0O;
    public final Integer A0P;
    public final String A0Q;
    public final boolean A0S;
    public final View A0T;
    public final List A0R = AbstractC166987dD.A1E();
    public int A04 = 255;
    public int A02 = 255;
    public int A03 = 255;
    public int A01 = 255;

    public final void A01(int i) {
        if (i > 4) {
            i = 4;
        }
        ViewGroup.LayoutParams layoutParams = this.A0J.getLayoutParams();
        Activity activity = this.A0G;
        layoutParams.width = ((int) (i * activity.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size))) + ((int) ((i - 1) * activity.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding))) + ((int) (activity.getResources().getDimension(R.dimen.account_discovery_bottom_gap) * 2.0f));
    }

    public final void A03(Rect rect, ViewParent viewParent) {
        List list;
        ConstraintLayout constraintLayout;
        float f;
        float f2;
        boolean A1R = AbstractC167007dF.A1R(0, rect, viewParent);
        if (!this.A07) {
            if (this instanceof C32880EdM) {
                list = ((C32880EdM) this).A01;
            } else {
                list = ((C32881EdN) this).A01;
            }
            if (list.size() != 0) {
                Activity activity = this.A0G;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    C55982hj A02 = AbstractC13560mi.A00().A02();
                    this.A05 = A02;
                    C55942hf c55942hf = A0U;
                    A02.A06 = A1R;
                    A02.A09(c55942hf);
                    A02.A05(0.0d);
                    viewParent.requestDisallowInterceptTouchEvent(A1R);
                    int i = rect.top;
                    int height = rect.height();
                    Integer num = this.A0P;
                    if (num != C05F.A0C && num != C05F.A0N) {
                        constraintLayout = this.A0K;
                        f = i - this.A0E;
                        f2 = activity.getResources().getDimension(R.dimen.asset_picker_static_sticker_last_row_padding);
                    } else {
                        constraintLayout = this.A0K;
                        f = i - this.A0E;
                        f2 = height;
                    }
                    constraintLayout.setY(f - f2);
                    this.A00 = constraintLayout.getY() - activity.getResources().getDimension(R.dimen.asset_picker_static_sticker_last_row_padding);
                    int color = activity.getColor(R.color.black_50_transparent);
                    this.A04 = AbstractC56402iY.A00(activity);
                    this.A02 = color;
                    int color2 = activity.getColor(R.color.black_50_transparent);
                    this.A03 = C30D.A00(activity);
                    this.A01 = color2;
                    C2UY.A01.A03();
                    showAtLocation(activity.findViewById(android.R.id.content), 0, 0, 0);
                    C55982hj c55982hj = this.A05;
                    if (c55982hj != null) {
                        c55982hj.A0A(this);
                        C55982hj c55982hj2 = this.A05;
                        if (c55982hj2 != null) {
                            c55982hj2.A05(0.0d);
                            C55982hj c55982hj3 = this.A05;
                            if (c55982hj3 != null) {
                                c55982hj3.A03();
                                constraintLayout.setPivotX(rect.left);
                                constraintLayout.setPivotY(constraintLayout.getLayoutParams().height / 2.0f);
                                return;
                            }
                        }
                    }
                    C14360o3.A0F("spring");
                    throw C00O.createAndThrow();
                }
            }
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj.A01 == 0.0d) {
            dismiss();
            return;
        }
        Iterator it = this.A0R.iterator();
        while (it.hasNext()) {
            AbstractC35127FeU abstractC35127FeU = ((FQC) it.next()).A02;
            if (AbstractC167007dF.A1N((abstractC35127FeU.A00 > 0.0f ? 1 : (abstractC35127FeU.A00 == 0.0f ? 0 : -1))) && abstractC35127FeU.A01 == 0.0f) {
                abstractC35127FeU.A07.getLocationInWindow(new int[2]);
                abstractC35127FeU.A00 = r1[0];
                abstractC35127FeU.A01 = r1[1];
            }
            if (abstractC35127FeU.A02 == 0.0f && abstractC35127FeU.A03 == 0.0f) {
                abstractC35127FeU.A09.getLocationInWindow(new int[2]);
                abstractC35127FeU.A02 = r1[0];
                abstractC35127FeU.A03 = r1[1];
            }
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.7hA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.7hA, java.lang.Object] */
    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        int i;
        int i2;
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        double d = c55982hj.A01;
        if (d == 0.0d || d == 1.0d) {
            Integer num = this.A0P;
            if (num == C05F.A00 || num == C05F.A01 || num == C05F.A0C) {
                int i3 = this.A04;
                if (i3 != 255 && (i2 = this.A02) != 255) {
                    AbstractC56402iY.A02(this.A0G, AbstractC25230BEn.A0D(new Object().evaluate(f, Integer.valueOf(i3), Integer.valueOf(i2)), "null cannot be cast to non-null type kotlin.Int"));
                }
                int i4 = this.A03;
                if (i4 != 255 && (i = this.A01) != 255) {
                    C30D.A04(this.A0G, AbstractC25230BEn.A0D(new Object().evaluate(f, Integer.valueOf(i4), Integer.valueOf(i)), "null cannot be cast to non-null type kotlin.Int"));
                }
            }
            this.A0T.setAlpha(f);
            if (num != C05F.A0C && num != C05F.A0N) {
                float dimension = this.A0G.getResources().getDimension(R.dimen.abc_list_item_height_material);
                float f2 = this.A00;
                this.A0K.setY(f2 - ((f2 - (f2 - dimension)) * f));
            }
            ConstraintLayout constraintLayout = this.A0K;
            constraintLayout.setAlpha(f);
            constraintLayout.setScaleX(f);
            constraintLayout.setScaleY(f);
        }
    }

    public final void A00() {
        if (this instanceof C32880EdM) {
            C1GJ.A06(AbstractC121115e3.A01(this.A0M, new EZ9(this, 11)), 1967622104, 2, false, false);
            return;
        }
        C32881EdN c32881EdN = (C32881EdN) this;
        List list = c32881EdN.A01;
        list.clear();
        List A02 = c32881EdN.A00.A02();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A02) {
            if (!C14360o3.A0K(((AbstractC35044FcH) obj).A08, "add_content_note")) {
                A1E.add(obj);
            }
        }
        list.addAll(AbstractC001800i.A0d(A1E, 4));
        c32881EdN.A01(list.size());
        c32881EdN.A03(c32881EdN.A0H, c32881EdN.A0I);
    }

    public final void A02(long j) {
        Object obj;
        Object obj2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l;
        String str6;
        String str7;
        C38321qM c38321qM;
        SocialContextType socialContextType;
        String str8;
        String moduleName;
        C38321qM A1e;
        String str9;
        String str10;
        String str11;
        C38321qM A1e2;
        String id;
        if (this instanceof C32880EdM) {
            C32880EdM c32880EdM = (C32880EdM) this;
            Iterator it = c32880EdM.A0R.iterator();
            do {
                obj2 = null;
                if (!it.hasNext()) {
                    break;
                } else {
                    obj2 = it.next();
                }
            } while (!((FQC) obj2).A00);
            FQC fqc = (FQC) obj2;
            if (fqc != null) {
                AbstractC35127FeU abstractC35127FeU = fqc.A02;
                if (abstractC35127FeU instanceof C32879EdL) {
                    str6 = ((C32879EdL) abstractC35127FeU).A02.A0A();
                } else {
                    str6 = ((C32878EdK) abstractC35127FeU).A01.A08;
                    C14360o3.A07(str6);
                }
                User user = fqc.A04.A0O;
                if (user != null) {
                    str7 = user.getUsername();
                } else {
                    str7 = null;
                }
                if (C14360o3.A0K(str6, str7)) {
                    UserSession userSession = c32880EdM.A0M;
                    if (AbstractC31177DnL.A1U(C06090Tz.A06, userSession, 36315825388457574L)) {
                        C34726FRp A07 = C28531Zo.A04.A02.A07(c32880EdM.A0L, userSession, C2EY.A1F);
                        C38321qM c38321qM2 = c32880EdM.A0N;
                        if (c38321qM2 != null && (id = c38321qM2.getId()) != null) {
                            A07.A06(id);
                            C3DN A00 = C3DN.A00.A00(c32880EdM.A0G);
                            if (A00 != null) {
                                A00.A0K(A07.A00());
                            }
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
                Object A002 = fqc.A00();
                String A003 = AbstractC43591JPw.A00(45);
                C14360o3.A0C(A002, A003);
                DirectShareTarget directShareTarget = (DirectShareTarget) A002;
                C35143Fek c35143Fek = C35143Fek.A00;
                UserSession userSession2 = c32880EdM.A0M;
                boolean A01 = c35143Fek.A01(userSession2, directShareTarget);
                C7TM A012 = c32880EdM.A02.A01(directShareTarget);
                int intValue = c32880EdM.A0P.intValue();
                if (intValue != 1 && intValue != 0 && intValue != 2) {
                    if (intValue == 3) {
                        c38321qM = c32880EdM.A0N;
                        if (c38321qM != null) {
                            if (!c38321qM.A5P() && !c38321qM.CdW()) {
                                str8 = null;
                                if (C18U.A06(C06090Tz.A05, userSession2, 36327507699448447L) && (A1e2 = c38321qM.A1e(c32880EdM.A0D)) != null) {
                                    str8 = A1e2.getId();
                                }
                                moduleName = c32880EdM.A0L.getModuleName();
                                socialContextType = null;
                                A012.ENj(socialContextType, socialContextType, new C32068E6u(moduleName, "", A01, false), c38321qM, directShareTarget, socialContextType, socialContextType, str8, socialContextType);
                                C9GR.A07(c32880EdM.A0G, 2131973315);
                            }
                            A012.END(null, null, c38321qM, directShareTarget, null, c32880EdM.A0L.getModuleName(), "quick_send_pop_up", null, null, A01);
                            C9GR.A07(c32880EdM.A0G, 2131973315);
                        }
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    c38321qM = c32880EdM.A0N;
                    if (c38321qM != null) {
                        AbstractC167017dG.A1N(userSession2, directShareTarget);
                        if (!C6X6.A0M(userSession2, C35143Fek.A00(userSession2, directShareTarget)) || !c38321qM.A5P()) {
                            socialContextType = null;
                            str8 = null;
                            if (C18U.A06(C06090Tz.A05, userSession2, 36327507699448447L) && (A1e = c38321qM.A1e(c32880EdM.A0D)) != null) {
                                str8 = A1e.getId();
                            }
                            moduleName = c32880EdM.A0L.getModuleName();
                            A012.ENj(socialContextType, socialContextType, new C32068E6u(moduleName, "", A01, false), c38321qM, directShareTarget, socialContextType, socialContextType, str8, socialContextType);
                            C9GR.A07(c32880EdM.A0G, 2131973315);
                        }
                        A012.END(null, null, c38321qM, directShareTarget, null, c32880EdM.A0L.getModuleName(), "quick_send_pop_up", null, null, A01);
                        C9GR.A07(c32880EdM.A0G, 2131973315);
                    }
                }
                Object A004 = fqc.A00();
                C14360o3.A0C(A004, A003);
                DirectShareTarget directShareTarget2 = (DirectShareTarget) A004;
                int i = fqc.A01;
                int i2 = -1;
                if (Integer.valueOf(i) != null) {
                    i2 = i - 1;
                }
                if (intValue != 3) {
                    str9 = "feed_start";
                } else {
                    str9 = "clips_viewer";
                }
                boolean z = c32880EdM.A08;
                C41951wl A005 = C41951wl.A00(userSession2);
                C41891wf A013 = C41891wf.A01(userSession2);
                C14360o3.A07(A013);
                boolean A0A = A013.A0A(directShareTarget2, A005);
                InterfaceC11380iw interfaceC11380iw = c32880EdM.A0L;
                boolean A006 = F3G.A00(userSession2, AbstractC31171DnF.A0O(directShareTarget2));
                String A007 = AbstractC111324zv.A00(2942);
                C14360o3.A0B(userSession2, 0);
                C14360o3.A0B(interfaceC11380iw, 11);
                String str12 = null;
                if (c38321qM != null && c38321qM.CdW()) {
                    directShareTarget2.A0Q();
                    if (directShareTarget2.A0Q()) {
                        str11 = "ig_content_deep_dive:prompt_send";
                    } else {
                        str11 = null;
                    }
                    C162337Ov.A0G(interfaceC11380iw, null, userSession2, c38321qM, directShareTarget2, null, null, null, null, A007, null, null, null, null, null, null, A007, null, str11, false, A006);
                } else {
                    C19280xC A008 = C19280xC.A00(interfaceC11380iw, AbstractC111324zv.A00(2268));
                    A008.A08(Integer.valueOf((int) j), "press_duration");
                    A008.A0C("action", "sent");
                    A008.A0C(CacheBehaviorLogger.SOURCE, A007);
                    A008.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str9);
                    if (c38321qM != null) {
                        str10 = c38321qM.Biv();
                        str12 = c38321qM.A2u();
                        Integer valueOf = Integer.valueOf(c38321qM.BRp().A00);
                        if (valueOf != null) {
                            A008.A08(valueOf, "m_t");
                        }
                        Integer valueOf2 = Integer.valueOf(c38321qM.BRp().A00);
                        if (valueOf2 != null) {
                            A008.A08(valueOf2, "media_type");
                        }
                        String BJN = c38321qM.A0C.BJN();
                        if (BJN != null) {
                            A008.A0C("inventory_source", BJN);
                        }
                    } else {
                        str10 = null;
                    }
                    if (!A006) {
                        A008.A0C("media_id", str12);
                    }
                    A008.A0C("author_id", str10);
                    A008.A0D("recipient_ids", directShareTarget2.A0B());
                    InterfaceC83713oG A0O = AbstractC31171DnF.A0O(directShareTarget2);
                    if (A0O instanceof C83693oE) {
                        A008.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, ((C83693oE) A0O).A00);
                    }
                    if (i2 != -1) {
                        A008.A08(Integer.valueOf(i2), "position");
                    }
                    if (z) {
                        A008.A09("is_active_recipient", Boolean.valueOf(A0A));
                    }
                    AbstractC31173DnH.A1S(A008, userSession2);
                }
            }
            UserSession userSession3 = c32880EdM.A0M;
            C18920wW A014 = AbstractC12220kQ.A01(c32880EdM.A0L, userSession3);
            double d = j / 1000.0d;
            C38321qM c38321qM3 = c32880EdM.A0N;
            if (c38321qM3 != null) {
                str = c38321qM3.A2u();
            } else {
                str = null;
            }
            C14360o3.A0B(userSession3, 0);
            userSession3.A01(C33E.class, C33D.A00);
            String str13 = c32880EdM.A0Q;
            if (str == null) {
                str = "";
            }
            User user2 = c32880EdM.A0O;
            if (user2 != null) {
                str2 = user2.getId();
            } else {
                str2 = null;
            }
            if (c38321qM3 != null) {
                str3 = AbstractC25226BEj.A1G(c38321qM3);
                str4 = c38321qM3.BRp().name();
                str5 = c38321qM3.A0C.BJN();
            } else {
                str3 = null;
                str4 = null;
                str5 = null;
            }
            String str14 = c32880EdM.A06;
            if (c32880EdM.A08) {
                l = Long.valueOf(c32880EdM.A00);
            } else {
                l = null;
            }
            double round = Math.round(d * 100.0d) / 100.0d;
            C14360o3.A0B(str13, 0);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A014, "direct_reshare_quick_send_impression");
            if (A0f.isSampled()) {
                AbstractC31171DnF.A1G(A0f, str13);
                A0f.A9K("quick_send_version", 2L);
                A0f.AAP("media_id", str);
                A0f.AAP("author_id", str2);
                A0f.AAP("ranking_info_token", str3);
                A0f.A9K("num_active_now", l);
                A0f.A9K("num_groups", null);
                A0f.AAP("inventory_source", str5);
                A0f.AAP("media_type", str4);
                A0f.A8I("dwell_time_s", Double.valueOf(round));
                A0f.AAP("ranking_request_id", str14);
                A0f.AAP("message_id", null);
                AbstractC31171DnF.A1H(A0f, null);
                AbstractC25232BEp.A1L(A0f, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, null);
                return;
            }
            return;
        }
        Iterator it2 = this.A0R.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((FQC) obj).A00) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        FQC fqc2 = (FQC) obj;
        if (fqc2 == null) {
            return;
        }
        Object A009 = fqc2.A00();
        C14360o3.A0C(A009, "null cannot be cast to non-null type com.instagram.direct.model.sharesheetactions.DirectShareSheetAction");
        ((AbstractC35044FcH) A009).A06(null);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        List list;
        C17v c17u;
        if (!this.A07) {
            if (this instanceof C32880EdM) {
                list = ((C32880EdM) this).A01;
            } else {
                list = ((C32881EdN) this).A01;
            }
            int i = new int[]{list.size(), 4}[0];
            if (4 < i) {
                i = 4;
            }
            if (AbstractC34190F6o.A00(this.A0P)) {
                c17u = new C17v(i, 1, -1);
            } else {
                c17u = new C17u(1, i);
            }
            int i2 = c17u.A00;
            int i3 = c17u.A01;
            int i4 = c17u.A02;
            if (i4 > 0) {
                if (i2 > i3) {
                    return;
                }
            } else if (i4 >= 0 || i3 > i2) {
                return;
            }
            while (true) {
                this.A0R.add(new FQC(this, i2));
                if (i2 == i3) {
                    return;
                } else {
                    i2 += i4;
                }
            }
        }
    }

    public AbstractC31781Dxr(Activity activity, Rect rect, ViewParent viewParent, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Integer num, int i, long j) {
        User user;
        String str;
        int A01;
        this.A0G = activity;
        this.A0M = userSession;
        this.A0N = c38321qM;
        this.A0P = num;
        this.A0F = j;
        this.A0L = interfaceC11380iw;
        this.A0H = rect;
        this.A0I = viewParent;
        this.A0D = i;
        this.A0A = activity.getResources().getDimension(R.dimen.abc_edit_text_inset_top_material);
        this.A0B = activity.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A0C = AbstractC31173DnH.A00(activity, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A09 = AbstractC31173DnH.A00(activity, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        if (c38321qM != null) {
            user = c38321qM.A2E(userSession);
        } else {
            user = null;
        }
        this.A0O = user;
        this.A0S = C2E7.A00(user);
        if (num.intValue() != 3) {
            str = "feed_start";
        } else {
            str = "clips_viewer";
        }
        this.A0Q = str;
        setContentView(LayoutInflater.from(activity).inflate(C18U.A06(C06090Tz.A05, userSession, 36326756080171120L) ? R.layout.quick_send_external : R.layout.quick_send_v2, (ViewGroup) null));
        setHeight(-1);
        setWidth(-1);
        this.A0J = (LinearLayout) getContentView().findViewById(R.id.quick_send_popup_window);
        this.A0K = (ConstraintLayout) getContentView().findViewById(R.id.quick_send_popup_container);
        this.A0T = getContentView().findViewById(R.id.background_dimmer);
        if (C57992lC.A03()) {
            A01 = C57992lC.A01();
        } else {
            A01 = AbstractC56402iY.A01(activity);
        }
        this.A0E = A01;
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.A0R.clear();
        this.A0I.requestDisallowInterceptTouchEvent(false);
        C55982hj c55982hj = this.A05;
        if (c55982hj == null) {
            C14360o3.A0F("spring");
            throw C00O.createAndThrow();
        }
        c55982hj.A00();
    }
}
