package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.quicklog.EventBuilder;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.DtK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31535DtK extends C38K implements InterfaceC11380iw, InterfaceC60442pS, InterfaceC60072op, C51D, AbsListView.OnScrollListener, GZS, InterfaceC37297Gby, C38M, InterfaceC60122ou, InterfaceC37188GZz, InterfaceC37139GYa, C53T, C38O, GYO, GYQ, GYX, GX4 {
    public static final String __redex_internal_original_name = "FollowListFragment";
    public int A00;
    public ViewGroup A02;
    public C18920wW A03;
    public InterfaceC38371qR A04;
    public C71L A05;
    public C40701ud A06;
    public C31727DwY A07;
    public C25805BbM A08;
    public C1570473j A09;
    public InterfaceC70513Em A0A;
    public TypeaheadHeader A0B;
    public User A0C;
    public FollowListData A0D;
    public C31542DtS A0E;
    public FNH A0F;
    public C34672FPh A0G;
    public C32123E9w A0I;
    public C31543DtT A0J;
    public Integer A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0a;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public TextView A0f;
    public C1ON A0g;
    public C38E A0h;
    public C161887My A0i;
    public C31538DtO A0j;
    public String A0k;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public String A0R = "";
    public boolean A0Z = true;
    public int A01 = 1;
    public final Handler A0v = AbstractC167007dF.A0J();
    public final C61372qz A0z = new C61372qz();
    public final Map A12 = AbstractC166987dD.A1I();
    public final java.util.Set A14 = AbstractC31171DnF.A0l();
    public final java.util.Set A13 = AbstractC31171DnF.A0l();
    public List A0l = C16930sl.A00;
    public final InterfaceC09390do A15 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0t = AbstractC09440dt.A01(new C37057GUn(this, 39));
    public EnumC33389EpM A0H = EnumC33389EpM.A05;
    public boolean A0b = true;
    public final InterfaceC09390do A0u = C37057GUn.A00(this, 41);
    public final InterfaceC09390do A0s = AbstractC09440dt.A01(new C37057GUn(this, 38));
    public final InterfaceC41501vz A0w = new C36155FxU(this, 27);
    public final InterfaceC41501vz A0y = C31728DwZ.A00(this, 29);
    public final InterfaceC41501vz A0x = C31728DwZ.A00(this, 28);
    public final C33297Ens A11 = new C33297Ens(this);
    public final C33296Enr A10 = new C33296Enr(this);

    public static final void A0B(User user, C31535DtK c31535DtK) {
        AbstractC129875tr.A00(A03(c31535DtK)).A08(c31535DtK.requireActivity(), new C32530EUg(5, user, c31535DtK), A03(c31535DtK), user);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r1 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ae, code lost:
    
        if (X.C14360o3.A0K(r11.A0M, "non_recip_followers") == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0L(X.C31535DtK r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31535DtK.A0L(X.DtK, java.util.List):void");
    }

    @Override // X.C38O
    public final C193328hC AM3(C193328hC c193328hC) {
        C14360o3.A0B(c193328hC, 0);
        c193328hC.A0n(this);
        return c193328hC;
    }

    @Override // X.C53T
    public final void D3g(IgImageView igImageView, InterfaceC38371qR interfaceC38371qR, int i, int i2, boolean z, boolean z2) {
        AbstractC167007dF.A1E(interfaceC38371qR, 0, igImageView);
        C5SE c5se = new C5SE(A03(this), interfaceC38371qR);
        c5se.A00 = i2;
        c5se.A01 = i;
        C37952Gmu c37952Gmu = new C37952Gmu(this, A03(this), c5se, this, C2Fb.A2E);
        AbstractC31177DnL.A1K(interfaceC38371qR, c37952Gmu, i2, i);
        c37952Gmu.A00(igImageView, c5se, interfaceC38371qR.BQN());
        if (interfaceC38371qR instanceof C40971v4) {
            c37952Gmu.A0O = (C40971v4) interfaceC38371qR;
        }
        new C37953Gmv(c37952Gmu).A04();
    }

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
        C14360o3.A0B(user, 0);
        FYD.A00(this, A03(this), user);
    }

    @Override // X.InterfaceC37297Gby
    public final void D4K(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        C14360o3.A0B(gradientSpinnerAvatarView, 1);
        List A1J = AbstractC166987dD.A1J(reel);
        C38E c38e = this.A0h;
        if (c38e == null) {
            C14360o3.A0F("reelViewerLauncher");
            throw C00O.createAndThrow();
        }
        c38e.A0C = this.A0k;
        C31559Dtj.A00(getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), c38e, this, 14);
        c38e.A0A(reel, C3G2.A0v, gradientSpinnerAvatarView, A1J, A1J, A1J);
    }

    @Override // X.C38M
    public final void D4P(SparseArray sparseArray, Integer num) {
    }

    @Override // X.C38M
    public final void D4Q() {
    }

    @Override // X.C38M
    public final void D4R() {
    }

    @Override // X.C38M
    public final void D4T(SparseArray sparseArray) {
        A0P(true);
    }

    @Override // X.InterfaceC77483dY
    public final void DHr(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHs(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHt(ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
    }

    @Override // X.InterfaceC37297Gby
    public final void DTn(View view, User user, boolean z) {
        C31727DwY c31727DwY;
        Context context = getContext();
        if (context != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A03, "follow_list_overflow_menu_tapped");
            A0f.AAP("target_id", user.getId());
            A0f.Cht();
            String str = this.A0M;
            if (str != null && str.equals("potential_spam")) {
                C50674MYs c50674MYs = new C50674MYs(context, A03(this));
                c50674MYs.A07(user.getUsername());
                c50674MYs.A06(user.Bhu());
                c50674MYs.A02(new ViewOnClickListenerC35670Fp5(16, user, this), 2131966038);
                c50674MYs.A03(ViewOnClickListenerC35663Fox.A00, 2131954754);
                c31727DwY = new C31727DwY(c50674MYs);
            } else {
                FollowListData followListData = this.A0D;
                if (followListData == null) {
                    C14360o3.A0F("followListData");
                    throw C00O.createAndThrow();
                }
                int ordinal = followListData.A00.ordinal();
                if (ordinal != 1 && ordinal != 8) {
                    if (view != null) {
                        UserSession A03 = A03(this);
                        if (C18U.A06(AbstractC25225BEi.A0j(A03, 0), A03, 36326605756315630L)) {
                            FragmentActivity requireActivity = requireActivity();
                            UserSession A032 = A03(this);
                            C57532Pg6 c57532Pg6 = new C57532Pg6(1, user, this);
                            C57532Pg6 c57532Pg62 = new C57532Pg6(2, user, this);
                            C57532Pg6 c57532Pg63 = new C57532Pg6(3, user, this);
                            C14360o3.A0B(A032, 2);
                            C8QJ c8qj = new C8QJ(context, A032, null, false);
                            c8qj.A02(AbstractC16960so.A1Q(new C199928sw(context.getDrawable(R.drawable.instagram_user_circle_pano_outline_24), null, null, new G8C(1, requireActivity, context, A032, user), null, AbstractC166997dE.A0q(context.getResources(), 2131951995), 0, 0, 0, false, false, false, true, false, false, false), new C199928sw(context.getDrawable(R.drawable.instagram_user_unfollow_pano_outline_24), null, null, new G8C(2, context, c57532Pg6, user, c57532Pg63), Integer.valueOf(AbstractC53242c7.A03(context)), AbstractC166997dE.A0q(context.getResources(), 2131972171), 0, 0, 0, false, false, false, true, false, false, false), new C199928sw(context.getDrawable(R.drawable.instagram_circle_block_off_pano_outline_24), null, null, new G8F(context, this, A032, user, c57532Pg62), Integer.valueOf(AbstractC53242c7.A03(context)), AbstractC166997dE.A0q(context.getResources(), 2131953938), 0, 0, 0, false, false, false, true, false, false, false)));
                            View contentView = c8qj.getContentView();
                            if (contentView != null) {
                                contentView.measure(0, 0);
                                int A06 = AbstractC167017dG.A06(context);
                                c8qj.showAsDropDown(view, -(contentView.getMeasuredWidth() - A06), A06, 8388613);
                                return;
                            }
                            c8qj.showAsDropDown(view);
                            return;
                        }
                    }
                    A0A(context, user);
                    return;
                }
                C50674MYs c50674MYs2 = new C50674MYs(context, A03(this));
                c50674MYs2.A07(user.getUsername());
                c50674MYs2.A06(user.Bhu());
                c50674MYs2.A0B(AbstractC166997dE.A0p(context, 2131966011), new ViewOnClickListenerC55459OkE(33, context, user, this));
                UserSession A033 = A03(this);
                C06090Tz A0j = AbstractC25225BEi.A0j(A033, 0);
                if (C18U.A06(A0j, A033, 36319063793736608L)) {
                    c50674MYs2.A0B(AbstractC166997dE.A0p(context, 2131974085), new ViewOnClickListenerC35584Fnb(0, context, user, this));
                }
                c50674MYs2.A0B(AbstractC166997dE.A0p(context, 2131968091), new ViewOnClickListenerC35584Fnb(1, context, user, this));
                if (AbstractC31174DnI.A0j(A03(this), user) == FollowStatus.A05 && z) {
                    c50674MYs2.A09(AbstractC166997dE.A0p(context, 2131976069), new ViewOnClickListenerC35670Fp5(17, user, this));
                }
                if (view != null) {
                    UserSession A034 = A03(this);
                    C14360o3.A0B(A034, 0);
                    if (C18U.A06(A0j, A034, 36327945786113000L)) {
                        C8QJ c8qj2 = new C8QJ(context, A03(this), null, false);
                        ArrayList A1E = AbstractC166987dD.A1E();
                        for (C50676MYu c50676MYu : c50674MYs2.A09) {
                            String str2 = c50676MYu.A04;
                            if (str2 == null) {
                                str2 = "";
                            }
                            A1E.add(new C199928sw(null, null, null, new G85(c50676MYu, 11), Integer.valueOf(c50676MYu.A08), str2, 0, 0, 0, false, false, false, true, false, false, false));
                        }
                        c8qj2.A02(A1E);
                        c8qj2.A01(view);
                        return;
                    }
                }
                c50674MYs2.A03 = new C56406P2t(4, user, this);
                c31727DwY = new C31727DwY(c50674MYs2);
                this.A07 = c31727DwY;
            }
            c31727DwY.A05(requireActivity());
        }
    }

    @Override // X.InterfaceC37188GZz
    public final void Dit() {
    }

    @Override // X.InterfaceC37139GYa
    public final void DnL(EnumC33389EpM enumC33389EpM) {
        if (this.A0H != enumC33389EpM) {
            A0Q(AbstractC167007dF.A1X(enumC33389EpM, EnumC33389EpM.A05));
            this.A0H = enumC33389EpM;
            C31542DtS c31542DtS = this.A0E;
            if (c31542DtS == null) {
                C14360o3.A0F("followListAdapter");
                throw C00O.createAndThrow();
            }
            c31542DtS.A09 = FCW.A00(c31542DtS.A0O, enumC33389EpM);
            c31542DtS.A0G(false, false);
            A03(this);
            C006802i.A0p.markEventBuilder(224332946, "sorting_option_selected").annotate("list_title", A05(this)).annotate("sorting_option", enumC33389EpM.toString()).report();
            A06();
        }
    }

    @Override // X.GYO
    public final void EHl(UserSession userSession, int i) {
        String id;
        String str;
        FollowListData followListData;
        String moduleName;
        ImmutableList A08;
        EnumC31556Dtg enumC31556Dtg;
        int i2 = i;
        C14360o3.A0B(userSession, 0);
        C31542DtS c31542DtS = this.A0E;
        String str2 = "followListAdapter";
        Integer num = null;
        if (c31542DtS != null) {
            List list = c31542DtS.A0B;
            if (list != null) {
                if (i < list.size()) {
                    InterfaceC37277GbU interfaceC37277GbU = (InterfaceC37277GbU) list.get(i);
                    String A00 = FCV.A00(interfaceC37277GbU.BAS(), interfaceC37277GbU.getCategory());
                    if (this.A13.add(A00)) {
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A03, "user_list_group_impression");
                        A0f.AAP("group_name", A00);
                        A0f.Cht();
                        return;
                    }
                    return;
                }
                i2 = i - list.size();
            }
            C31542DtS c31542DtS2 = this.A0E;
            if (c31542DtS2 != null) {
                if (i2 >= c31542DtS2.A0C.size()) {
                    return;
                }
                C31542DtS c31542DtS3 = this.A0E;
                if (c31542DtS3 != null) {
                    User user = (User) c31542DtS3.A0C.get(i2);
                    if (!this.A14.add(user.getId())) {
                        return;
                    }
                    FollowListData followListData2 = this.A0D;
                    str2 = "followListData";
                    if (followListData2 != null) {
                        if (C2TN.A07(userSession.userId, followListData2.A02)) {
                            EnumC31556Dtg enumC31556Dtg2 = followListData2.A00;
                            if (enumC31556Dtg2 == EnumC31556Dtg.A04) {
                                id = user.getId();
                                enumC31556Dtg = EnumC31556Dtg.A0F;
                            } else {
                                if (enumC31556Dtg2 == EnumC31556Dtg.A05 || enumC31556Dtg2 == EnumC31556Dtg.A06) {
                                    id = user.getId();
                                    enumC31556Dtg = EnumC31556Dtg.A0G;
                                }
                                this.A12.put(user.getId(), Integer.valueOf(i2));
                                return;
                            }
                            FollowListData followListData3 = this.A0D;
                            if (followListData3 != null) {
                                followListData = AbstractC31565Dtq.A00(enumC31556Dtg, followListData3.A02, null, false);
                                moduleName = getModuleName();
                                str = null;
                                FY4.A00(userSession, followListData, num, id, str, moduleName, i2);
                                this.A12.put(user.getId(), Integer.valueOf(i2));
                                return;
                            }
                        } else {
                            id = user.getId();
                            C31538DtO c31538DtO = this.A0j;
                            if (c31538DtO != null) {
                                if (c31538DtO.A01()) {
                                    str = AbstractC31171DnF.A0e(user);
                                } else {
                                    str = null;
                                }
                                C31538DtO c31538DtO2 = this.A0j;
                                if (c31538DtO2 != null) {
                                    if (c31538DtO2.A01() && (A08 = user.A08()) != null) {
                                        num = Integer.valueOf(A08.size());
                                    }
                                    followListData = this.A0D;
                                    if (followListData != null) {
                                        moduleName = getModuleName();
                                        FY4.A00(userSession, followListData, num, id, str, moduleName, i2);
                                        this.A12.put(user.getId(), Integer.valueOf(i2));
                                        return;
                                    }
                                }
                            }
                            C14360o3.A0F("followListParams");
                            throw C00O.createAndThrow();
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r5) {
        /*
            r4 = this;
            r3 = 0
            X.C14360o3.A0B(r5, r3)
            java.lang.Integer r0 = r4.A0K
            if (r0 == 0) goto L98
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L32;
                case 1: goto L3a;
                case 2: goto L2e;
                case 3: goto L2a;
                case 4: goto L17;
                case 5: goto L17;
                case 6: goto L17;
                default: goto Lf;
            }
        Lf:
            java.lang.String r0 = "Invalid entry type for FollowListFragment"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L17:
            java.lang.String r2 = r4.A0L
            if (r2 != 0) goto L4b
            java.lang.Integer r2 = r4.A0K
            if (r2 == 0) goto L98
            java.lang.Integer r1 = X.C05F.A0j
            r0 = 2131962780(0x7f132b9c, float:1.9562295E38)
            if (r2 != r1) goto L44
            r0 = 2131962754(0x7f132b82, float:1.9562242E38)
            goto L44
        L2a:
            r0 = 2131965068(0x7f13348c, float:1.9566935E38)
            goto L35
        L2e:
            r0 = 2131962779(0x7f132b9b, float:1.9562293E38)
            goto L35
        L32:
            r0 = 2131962780(0x7f132b9c, float:1.9562295E38)
        L35:
            java.lang.String r2 = X.AbstractC25227BEk.A0v(r4, r0)
            goto L4b
        L3a:
            boolean r1 = r4.A0U
            r0 = 2131962754(0x7f132b82, float:1.9562242E38)
            if (r1 == 0) goto L44
            r0 = 2131968105(0x7f134069, float:1.9573095E38)
        L44:
            java.lang.String r2 = r4.getString(r0)
            X.C14360o3.A0A(r2)
        L4b:
            r0 = 1
            r1 = r5
            X.2iT r1 = (X.C56352iT) r1
            r1.AHh()
            X.C56352iT.A0K(r1, r2, r3, r0)
            r5.EkS(r0)
            boolean r0 = r4.A0m
            if (r0 == 0) goto L97
            android.widget.FrameLayout r2 = r1.A0S
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.C14360o3.A0C(r2, r0)
            android.view.LayoutInflater r1 = X.AbstractC31175DnJ.A06(r4)
            r0 = 2131623989(0x7f0e0035, float:1.8875145E38)
            android.view.View r1 = r1.inflate(r0, r2, r3)
            r0 = 2131427521(0x7f0b00c1, float:1.847666E38)
            android.widget.TextView r2 = X.AbstractC166997dE.A0T(r1, r0)
            r0 = 2131965995(0x7f13382b, float:1.9568816E38)
            X.AbstractC25227BEk.A12(r2, r4, r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2130970280(0x7f0406a8, float:1.7549266E38)
            X.AbstractC31177DnL.A0q(r1, r2, r0)
            r0 = 41
            X.ViewOnClickListenerC35682FpH.A01(r2, r0, r4)
            r4.A0f = r2
            X.3LO r1 = X.AbstractC31171DnF.A0B()
            android.widget.TextView r0 = r4.A0f
            r1.A0I = r0
            X.AbstractC31175DnJ.A1G(r1, r5)
        L97:
            return
        L98:
            java.lang.String r0 = "type"
            X.C14360o3.A0F(r0)
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31535DtK.configureActionBar(X.2iU):void");
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.C51E
    public final boolean isScrolledToBottom() {
        return !getScrollingViewProxy().CFj().canScrollVertically(1);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return !getScrollingViewProxy().CFj().canScrollVertically(-1);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        C1ON A0U;
        int i3;
        ArrayList<String> stringArrayListExtra;
        if (i2 == -1 && intent != null) {
            if (i != 531) {
                if (i == 532 && (stringArrayListExtra = intent.getStringArrayListExtra("ARG_USER_IDS")) != null) {
                    C2JM A0b = AbstractC25225BEi.A0b();
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    C2JO c2jo = new C2JO();
                    c2jo.A05("user_ids", stringArrayListExtra);
                    A0b.A00(c2jo, "data");
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "BulkUnfollowAccountsMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C60402Qyq.class, true, null, 0, null, "xdt_api__v1__friendships__unfollow_all", AbstractC166987dD.A1E());
                    C40701ud c40701ud = this.A06;
                    if (c40701ud == null) {
                        C14360o3.A0F("graphQLQueryExecutor");
                        throw C00O.createAndThrow();
                    }
                    c40701ud.ATV(new C55656Onh(8, this, stringArrayListExtra), new C35830Fs6(6, stringArrayListExtra, this), pandoGraphQLRequest);
                }
            } else {
                ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("ARG_USER_IDS");
                if (stringArrayListExtra2 != null) {
                    if (intent.getBooleanExtra(AbstractC111324zv.A00(284), false)) {
                        A0U = AbstractC151506rw.A01(A03(this), AbstractC25226BEj.A1H(", ", stringArrayListExtra2, null));
                        i3 = 3;
                    } else {
                        UserSession A03 = A03(this);
                        C14360o3.A0B(A03, 0);
                        C25621Ms A0c = AbstractC167017dG.A0c(A03);
                        A0c.A0B("friendships/remove_all_followers/");
                        A0c.A9s("user_ids", AbstractC151506rw.A05(stringArrayListExtra2));
                        AbstractC31178DnM.A1J(A0c, new C36018FvG(A03, 1), A03);
                        A0U = AbstractC31172DnG.A0U(A0c, true);
                        i3 = 6;
                    }
                    A0U.A00 = new C32530EUg(i3, stringArrayListExtra2, this);
                    schedule(A0U);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0155  */
    @Override // X.InterfaceC37297Gby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUserRowClick(com.instagram.user.model.User r11) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31535DtK.onUserRowClick(com.instagram.user.model.User):void");
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewStub A07;
        String str;
        int i;
        C14360o3.A0B(view, 0);
        if (A0R(this)) {
            this.A0A = AbstractC1571573u.A00(view, A03(this), new GHu(this, 2));
        } else if (!this.A0U && (A07 = AbstractC31171DnF.A07(view, R.id.refreshablelistview_stub)) != null) {
            A07.inflate();
        }
        String str2 = this.A0R;
        if (str2.length() > 0) {
            TypeaheadHeader typeaheadHeader = this.A0B;
            if (typeaheadHeader != null) {
                typeaheadHeader.A04(str2);
            }
            TypeaheadHeader typeaheadHeader2 = this.A0B;
            if (typeaheadHeader2 != null) {
                typeaheadHeader2.A02();
            }
        }
        TypeaheadHeader typeaheadHeader3 = this.A0B;
        if (typeaheadHeader3 != null) {
            typeaheadHeader3.A01 = this;
            Integer num = this.A0K;
            if (num == null) {
                C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                throw C00O.createAndThrow();
            }
            switch (num.intValue()) {
                case 0:
                case 4:
                case 6:
                    i = 2131973008;
                    break;
                case 1:
                case 2:
                case 3:
                case 5:
                    i = 2131973007;
                    break;
                default:
                    throw new RuntimeException("Invalid entry type for FollowListFragment");
            }
            typeaheadHeader3.A03(AbstractC25227BEk.A0v(this, i));
        }
        C61372qz c61372qz = this.A0z;
        C31543DtT c31543DtT = this.A0J;
        if (c31543DtT == null) {
            str = "paginationHelper";
        } else {
            c61372qz.A03(c31543DtT);
            c61372qz.A03(new C31552Dtc(A03(this), this));
            TypeaheadHeader typeaheadHeader4 = this.A0B;
            if (typeaheadHeader4 != null) {
                c61372qz.A03(typeaheadHeader4.A04);
                AbstractC05560Rg.A00(this);
                ((AbstractC05560Rg) this).A04.setOnScrollListener(this);
                AbstractC05560Rg.A00(this);
                ((AbstractC05560Rg) this).A04.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
                if (this.A0Y) {
                    AbstractC05560Rg.A00(this);
                    ((AbstractC05560Rg) this).A04.setBackground(null);
                    TypeaheadHeader typeaheadHeader5 = this.A0B;
                    if (typeaheadHeader5 != null) {
                        typeaheadHeader5.setEditTextBackground(requireContext().getDrawable(R.drawable.searchbar_on_elevated_background));
                    }
                }
                Context requireContext = requireContext();
                if (this.A05 != null) {
                    ViewGroup viewGroup = this.A02;
                    if (viewGroup == null) {
                        C14360o3.A0F("followContainer");
                        throw C00O.createAndThrow();
                    }
                    C37993Gne c37993Gne = new C37993Gne(requireContext, A03(this), this);
                    View A01 = C37993Gne.A04.A01(requireContext, viewGroup, A03(this));
                    C25601BTo c25601BTo = new C25601BTo(A03(this), this, this);
                    C37994Gnf c37994Gnf = new C37994Gnf(-1, 0);
                    Object tag = A01.getTag();
                    if (tag != null) {
                        C37991Gnc c37991Gnc = (C37991Gnc) tag;
                        InterfaceC38371qR interfaceC38371qR = this.A04;
                        if (interfaceC38371qR != null) {
                            c37993Gne.A00(c25601BTo.A00(interfaceC38371qR, c37994Gnf), c37991Gnc);
                            viewGroup.addView(A01);
                            viewGroup.invalidate();
                            C71L c71l = this.A05;
                            if (c71l != null) {
                                c71l.A02(A01);
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                C31542DtS c31542DtS = this.A0E;
                if (c31542DtS == null) {
                    str = "followListAdapter";
                } else {
                    A0U(c31542DtS);
                    if (C54P.A01(requireContext(), A03(this))) {
                        if (C18U.A06(C06090Tz.A05, A03(this), 36329749672378891L)) {
                            Context applicationContext = requireContext().getApplicationContext();
                            C14360o3.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
                            C25805BbM c25805BbM = (C25805BbM) new C52942bb(new EWB((Application) applicationContext, A03(this)), this).A00(C25805BbM.class);
                            this.A08 = c25805BbM;
                            if (c25805BbM != null) {
                                c25805BbM.A0E(A01(this));
                            }
                        }
                    }
                    C25805BbM c25805BbM2 = this.A08;
                    if (c25805BbM2 != null) {
                        AbstractC18560vj.A03(AbstractC25235BEs.A0S(this), new C15340po(new PZE(this, null, 24), c25805BbM2.A06));
                    }
                    super.onViewCreated(view, bundle);
                    return;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.GZS
    public final void registerTextViewLogging(TextView textView) {
        C14360o3.A0B(textView, 0);
        textView.addTextChangedListener(C106904rr.A00(A03(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r4.A0H == X.EnumC33389EpM.A05) goto L11;
     */
    @Override // X.GZS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void searchTextChanged(java.lang.String r5) {
        /*
            r4 = this;
            r1 = 0
            X.C14360o3.A0B(r5, r1)
            java.lang.String r0 = r4.A0R
            boolean r0 = X.C14360o3.A0K(r0, r5)
            if (r0 != 0) goto L60
            r4.A0R = r5
            com.instagram.common.session.UserSession r3 = A03(r4)
            X.0Tz r2 = X.AbstractC25225BEi.A0j(r3, r1)
            r0 = 36324673022210405(0x810d1900123165, double:3.035207714739301E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L27
            java.lang.String r0 = X.AbstractC167007dF.A0h(r5)
            r4.A0R = r0
        L27:
            java.lang.String r0 = r4.A0R
            int r0 = r0.length()
            r3 = 1
            if (r0 > 0) goto L37
            X.EpM r1 = r4.A0H
            X.EpM r0 = X.EnumC33389EpM.A05
            r2 = 0
            if (r1 != r0) goto L38
        L37:
            r2 = 1
        L38:
            r4.A0Q(r2)
            X.BbM r1 = r4.A08
            if (r1 == 0) goto L44
            java.lang.String r0 = r4.A0R
            r1.A0F(r0)
        L44:
            X.DtS r1 = r4.A0E
            if (r1 != 0) goto L52
            java.lang.String r0 = "followListAdapter"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L52:
            java.lang.String r0 = r4.A0R
            int r0 = r0.length()
            if (r0 > 0) goto L5b
            r3 = 0
        L5b:
            r1.A0F = r3
            r4.A06()
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31535DtK.searchTextChanged(java.lang.String):void");
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final EnumC33510Erj A01(C31535DtK c31535DtK) {
        FollowListData followListData = c31535DtK.A0D;
        if (followListData == null) {
            C14360o3.A0F("followListData");
            throw C00O.createAndThrow();
        }
        int ordinal = followListData.A00.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return EnumC33510Erj.OTHER;
            }
            if (C2TN.A04(A03(c31535DtK), c31535DtK.A0C)) {
                return EnumC33510Erj.SELF_FOLLOWING_PAGE;
            }
            return EnumC33510Erj.OTHERS_FOLLOWING_PAGE;
        }
        if (C2TN.A04(A03(c31535DtK), c31535DtK.A0C)) {
            return EnumC33510Erj.SELF_FOLLOWER_PAGE;
        }
        return EnumC33510Erj.OTHERS_FOLLOWER_PAGE;
    }

    public static final C69613Av A02(C31535DtK c31535DtK) {
        Fragment fragment = c31535DtK.mParentFragment;
        if (fragment != null && (fragment instanceof UnifiedFollowFragment)) {
            C32123E9w c32123E9w = ((UnifiedFollowFragment) fragment).A0E;
            if (c32123E9w != null) {
                return ((MTJ) c32123E9w).A00;
            }
            C14360o3.A0F("followListPerfLogger2");
            throw C00O.createAndThrow();
        }
        return null;
    }

    public static final UserSession A03(C31535DtK c31535DtK) {
        return (UserSession) c31535DtK.A15.getValue();
    }

    public static final C34537FJx A04(C31535DtK c31535DtK, List list, int i) {
        FollowListData followListData = c31535DtK.A0D;
        if (followListData == null) {
            C14360o3.A0F("followListData");
            throw C00O.createAndThrow();
        }
        EnumC31556Dtg enumC31556Dtg = followListData.A00;
        if ((enumC31556Dtg == EnumC31556Dtg.A05 || enumC31556Dtg == EnumC31556Dtg.A09) && i != 0) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                A1C.append("#");
                A1C.append(AbstractC25226BEj.A1I(list, i2));
                if (i2 < AbstractC25226BEj.A05(list)) {
                    A1C.append(", ");
                }
            }
            if (list.size() < i) {
                A1C.append(c31535DtK.getString(2131961704));
            }
            return new C34537FJx(AbstractC25227BEk.A0v(c31535DtK, 2131963462), AbstractC166987dD.A19(A1C));
        }
        return null;
    }

    public static final String A05(C31535DtK c31535DtK) {
        Integer num = c31535DtK.A0K;
        if (num == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            throw C00O.createAndThrow();
        }
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                return "FollowList";
            }
            return "Following";
        }
        return "Followers";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (X.C18U.A06(X.AbstractC25225BEi.A0j(r3, 0), r3, 36324673022275942L) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A07() {
        /*
            r5 = this;
            X.DtT r0 = r5.A0J
            if (r0 != 0) goto Le
            java.lang.String r4 = "paginationHelper"
        L6:
            X.C14360o3.A0F(r4)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            r1 = 0
            r0.A02 = r1
            X.DtS r0 = r5.A0E
            java.lang.String r4 = "followListAdapter"
            if (r0 == 0) goto L6
            boolean r0 = r0.A12
            if (r0 != 0) goto L2e
            com.instagram.common.session.UserSession r3 = A03(r5)
            X.0Tz r2 = X.AbstractC25225BEi.A0j(r3, r1)
            r0 = 36324673022275942(0x810d1900133166, double:3.035207714780747E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L31
        L2e:
            r5.A09()
        L31:
            X.DtS r1 = r5.A0E
            if (r1 == 0) goto L6
            r0 = 1
            r1.A0M = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31535DtK.A07():void");
    }

    private final void A08() {
        C1ON c1on = this.A0g;
        if (c1on != null) {
            c1on.cancel();
        }
        UserSession A03 = A03(this);
        String moduleName = getModuleName();
        AbstractC167007dF.A1K(A03, moduleName);
        C1ON A00 = AbstractC31513Dsx.A00(A03, 10, moduleName, null, null, null, null, null, false, false);
        C31714DwJ.A00(A00, this, 17);
        this.A0g = A00;
        schedule(A00);
        C1570473j c1570473j = this.A09;
        String str = "latencyPerfLogger";
        if (c1570473j != null) {
            ((MTJ) c1570473j).A00.A04();
            C1570473j c1570473j2 = this.A09;
            if (c1570473j2 != null) {
                c1570473j2.A0E("fetch_request_start");
                C32123E9w c32123E9w = this.A0I;
                if (c32123E9w == null) {
                    str = "perfLogger";
                } else {
                    c32123E9w.A0E("fetch_su_request_start");
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (X.AbstractC167007dF.A1W(r1.A00) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A09() {
        /*
            r2 = this;
            X.DtT r1 = r2.A0J
            java.lang.String r0 = "paginationHelper"
            if (r1 != 0) goto Le
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            boolean r0 = r1.isLoading()
            if (r0 == 0) goto L1d
            java.lang.String r0 = r1.A00
            boolean r1 = X.AbstractC167007dF.A1W(r0)
            r0 = 1
            if (r1 == 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            X.AbstractC31557Dth.A01(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31535DtK.A09():void");
    }

    public static final void A0D(C31535DtK c31535DtK) {
        if (c31535DtK.A0q) {
            if (!c31535DtK.A0c) {
                c31535DtK.A08();
                c31535DtK.A0c = true;
                return;
            }
            return;
        }
        c31535DtK.A08();
    }

    public static final void A0E(C31535DtK c31535DtK) {
        String str;
        EnumC31556Dtg enumC31556Dtg = EnumC31556Dtg.A04;
        User user = c31535DtK.A0C;
        if (user != null) {
            str = user.getId();
        } else {
            str = "";
        }
        C31535DtK CsL = AbstractC31412DrH.A01().CsL(A03(c31535DtK), AbstractC31565Dtq.A00(enumC31556Dtg, str, null, false));
        C140966Yy A0r = AbstractC25225BEi.A0r(c31535DtK.requireActivity(), A03(c31535DtK));
        A0r.A0G(null, 1);
        A0r.A0B(null, CsL);
        A0r.A04();
    }

    public static final void A0F(C31535DtK c31535DtK) {
        String str;
        C31543DtT c31543DtT = c31535DtK.A0J;
        if (c31543DtT == null) {
            str = "paginationHelper";
        } else {
            c31543DtT.A02 = true;
            C31542DtS c31542DtS = c31535DtK.A0E;
            str = "followListAdapter";
            if (c31542DtS != null) {
                if (c31542DtS.A12) {
                    c31535DtK.A09();
                }
                C31542DtS c31542DtS2 = c31535DtK.A0E;
                if (c31542DtS2 != null) {
                    c31542DtS2.A0M = false;
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0123, code lost:
    
        if (r6.length() == 0) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0G(X.C31535DtK r8, X.YFT r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31535DtK.A0G(X.DtK, X.YFT, java.lang.String):void");
    }

    public static final void A0I(C31535DtK c31535DtK, String str, int i) {
        Integer B7X;
        User user;
        Integer B7S;
        FollowListData followListData = c31535DtK.A0D;
        if (followListData != null) {
            EnumC31556Dtg enumC31556Dtg = followListData.A00;
            EnumC31556Dtg enumC31556Dtg2 = EnumC31556Dtg.A04;
            if ((enumC31556Dtg == enumC31556Dtg2 || enumC31556Dtg == EnumC31556Dtg.A05 || enumC31556Dtg == EnumC31556Dtg.A06) && str == null && i == 0) {
                if (enumC31556Dtg != enumC31556Dtg2 || ((user = c31535DtK.A0C) != null && (B7S = user.A03.B7S()) != null && B7S.intValue() == 0)) {
                    FollowListData followListData2 = c31535DtK.A0D;
                    if (followListData2 != null) {
                        if (followListData2.A00 == EnumC31556Dtg.A05) {
                            User user2 = c31535DtK.A0C;
                            if (user2 != null && (B7X = user2.A03.B7X()) != null && B7X.intValue() == 0) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                A03(c31535DtK);
                EventBuilder markEventBuilder = C006802i.A0p.markEventBuilder(1001142197, "");
                FollowListData followListData3 = c31535DtK.A0D;
                if (followListData3 != null) {
                    markEventBuilder.annotate("list_type", followListData3.A00.name()).annotate("is_self", C2TN.A04(A03(c31535DtK), c31535DtK.A0C)).report();
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("followListData");
        throw C00O.createAndThrow();
    }

    public static final void A0J(C31535DtK c31535DtK, String str, String str2, ArrayList arrayList, int i) {
        C31538DtO c31538DtO = c31535DtK.A0j;
        if (c31538DtO != null) {
            C09530e4 A1L = AbstractC166987dD.A1L("ARG_IS_FACEPILE_ENABLED", Boolean.valueOf(c31538DtO.A02()));
            C31538DtO c31538DtO2 = c31535DtK.A0j;
            if (c31538DtO2 != null) {
                AbstractC31176DnK.A0d(c31535DtK.requireActivity(), AbstractC61636Rr0.A00(A1L, AbstractC166987dD.A1L(MSV.A00(312), Boolean.valueOf(c31538DtO2.A03())), AbstractC166987dD.A1L(MSV.A00(307), arrayList), AbstractC166987dD.A1L(MSV.A00(306), str), AbstractC166987dD.A1L("ARG_HEADER_TEXT", str2)), A03(c31535DtK), ModalActivity.class, AbstractC111324zv.A00(748)).A0D(c31535DtK, i);
                return;
            }
        }
        C14360o3.A0F("followListParams");
        throw C00O.createAndThrow();
    }

    public static final void A0M(C31535DtK c31535DtK, List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C25821No.A00().A0O(A03(c31535DtK), ((C47O) it.next()).A03.Bhu(), c31535DtK.getModuleName());
            }
            C1ON A03 = AbstractC151506rw.A03(A03(c31535DtK), list);
            C31714DwJ.A00(A03, c31535DtK, 16);
            c31535DtK.schedule(A03);
        }
    }

    public static final void A0O(C31535DtK c31535DtK, List list, boolean z) {
        String str;
        if (list != null && !list.isEmpty()) {
            UserSession A03 = A03(c31535DtK);
            FollowListData followListData = c31535DtK.A0D;
            if (followListData == null) {
                str = "followListData";
            } else if (C2TN.A05(A03, followListData.A02)) {
                Integer num = c31535DtK.A0K;
                str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
                if (num != null) {
                    if (num == C05F.A00 || num == C05F.A0Y || num == C05F.A01) {
                        C31542DtS c31542DtS = c31535DtK.A0E;
                        if (c31542DtS == null) {
                            str = "followListAdapter";
                        } else {
                            c31542DtS.A0B = list;
                            c31542DtS.A0I = z;
                            c31542DtS.A0G(false, false);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    private final void A0P(boolean z) {
        String str;
        C65974TxR c65974TxR;
        if (z) {
            this.A0Z = false;
            if (this.A0b) {
                str = this.A0R;
            } else {
                str = this.A0H.A00;
            }
            FNH fnh = this.A0F;
            if (fnh == null) {
                C14360o3.A0F("followListFragmentQueryManager");
                throw C00O.createAndThrow();
            }
            C14360o3.A0B(str, 0);
            if (fnh.A00) {
                c65974TxR = fnh.A01;
            } else {
                c65974TxR = fnh.A02;
            }
            c65974TxR.A03(str);
        }
    }

    private final void A0Q(boolean z) {
        String str;
        C65974TxR c65974TxR;
        this.A0b = z;
        FNH fnh = this.A0F;
        if (fnh == null) {
            str = "followListFragmentQueryManager";
        } else {
            if (fnh.A00 != z) {
                fnh.A00 = z;
                if (z) {
                    c65974TxR = fnh.A02;
                } else {
                    c65974TxR = fnh.A01;
                }
                c65974TxR.A02();
            }
            C31542DtS c31542DtS = this.A0E;
            str = "followListAdapter";
            if (c31542DtS != null) {
                c31542DtS.A0J = z;
                String str2 = this.A0R;
                C14360o3.A0B(str2, 0);
                c31542DtS.A08 = str2;
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final boolean A0R(C31535DtK c31535DtK) {
        FollowListData followListData = c31535DtK.A0D;
        if (followListData == null) {
            C14360o3.A0F("followListData");
            throw C00O.createAndThrow();
        }
        return followListData.A00.A01;
    }

    public static final boolean A0S(C31535DtK c31535DtK) {
        String str;
        if ((!c31535DtK.A0l.isEmpty()) && c31535DtK.A0R.length() == 0) {
            UserSession A03 = A03(c31535DtK);
            FollowListData followListData = c31535DtK.A0D;
            if (followListData == null) {
                str = "followListData";
            } else if (C2TN.A05(A03, followListData.A02)) {
                Integer num = c31535DtK.A0K;
                if (num == null) {
                    str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
                } else {
                    if (num == C05F.A01) {
                        return true;
                    }
                    return false;
                }
            } else {
                return false;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        return false;
    }

    public static final boolean A0T(C31535DtK c31535DtK, List list) {
        String str;
        if (c31535DtK.A0R.length() == 0) {
            UserSession A03 = A03(c31535DtK);
            FollowListData followListData = c31535DtK.A0D;
            if (followListData == null) {
                str = "followListData";
            } else if (C2TN.A05(A03, followListData.A02) || list.size() <= 1000000000) {
                Integer num = c31535DtK.A0K;
                str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
                if (num != null) {
                    if ((num == C05F.A00 || num == C05F.A01) && c31535DtK.A0l.isEmpty()) {
                        return true;
                    }
                    return false;
                }
            } else {
                return false;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        return false;
    }

    @Override // X.InterfaceC37188GZz
    public final boolean CL7() {
        if (this.A0E == null) {
            C14360o3.A0F("followListAdapter");
            throw C00O.createAndThrow();
        }
        return !r0.isEmpty();
    }

    @Override // X.InterfaceC37188GZz
    public final void Chd() {
        A0P(!this.A0T);
    }

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
        AbstractC31175DnJ.A1N(this.A03, "user_list_groups_see_all_tap");
        EnumC31556Dtg enumC31556Dtg = EnumC31556Dtg.A07;
        FollowListData followListData = this.A0D;
        if (followListData == null) {
            C14360o3.A0F("followListData");
            throw C00O.createAndThrow();
        }
        FollowListData A00 = AbstractC31565Dtq.A00(enumC31556Dtg, followListData.A02, null, false);
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC31173DnH.A1C(A0b, A03(this));
        A0b.putInt("FollowListFragment.EntryType", 4);
        A0b.putParcelable("FollowListFragment.FollowListData", A00);
        A0b.putBoolean("FollowListFragment.DisplayOnlyMutual", false);
        A0b.putString("FollowListFragment.GroupTitle", requireContext().getString(2131962707));
        A0b.putBoolean("FollowListFragment.ShowSearchBar", false);
        A0b.putString("FollowListFragment.GroupSubtitle", requireContext().getString(2131962709));
        C140966Yy A0P = AbstractC31173DnH.A0P(requireActivity(), A03(this));
        AbstractC31412DrH.A00();
        AbstractC31175DnJ.A0v(A0b, new C31535DtK(), A0P);
    }

    @Override // X.C38M
    public final void D4S() {
        String str;
        if (AbstractC167007dF.A1W(C37001nx.A02)) {
            C140966Yy A0P = AbstractC31173DnH.A0P(requireActivity(), A03(this));
            C33625Etb A00 = AbstractC35067Fce.A00().A00();
            FollowListData followListData = this.A0D;
            if (followListData == null) {
                C14360o3.A0F("followListData");
                throw C00O.createAndThrow();
            }
            if (followListData.A00 == EnumC31556Dtg.A04) {
                str = "empty_self_followers_list";
            } else {
                str = "empty_self_following_list";
            }
            A0P.A0B(null, A00.A01(str, getString(2131960982)));
            A0P.A04();
        }
    }

    @Override // X.GYX
    public final View getRowView() {
        TypeaheadHeader typeaheadHeader = this.A0B;
        if (typeaheadHeader == null) {
            if (C2U7.A00) {
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166987dD.A14(MSV.A00(26));
        }
        return typeaheadHeader;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        TypeaheadHeader typeaheadHeader = this.A0B;
        if (typeaheadHeader != null) {
            typeaheadHeader.A01();
        }
        if (!this.A0d) {
            return false;
        }
        this.A0d = false;
        A0E(this);
        return true;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (C2U7.A00) {
            return super.onCreateAnimation(i, z, i2);
        }
        boolean z2 = C2U8.A03;
        return null;
    }

    private final void A06() {
        String str;
        C169487hO c169487hO;
        String str2;
        boolean z;
        ArrayList A1E;
        UserSession A03 = A03(this);
        boolean A06 = C18U.A06(AbstractC25225BEi.A0j(A03, 0), A03, 36324673022275942L);
        if (this.A0b) {
            str = this.A0R;
        } else {
            str = this.A0H.A00;
        }
        FNH fnh = this.A0F;
        if (fnh == null) {
            str2 = "followListFragmentQueryManager";
        } else {
            C14360o3.A0B(str, 0);
            if (fnh.A00) {
                c169487hO = fnh.A03;
            } else {
                c169487hO = fnh.A04;
            }
            C9JQ BjP = c169487hO.BjP(str);
            Integer num = BjP.A01;
            List list = BjP.A06;
            String str3 = BjP.A03;
            str2 = "followListAdapter";
            if (num == C05F.A0C) {
                A07();
                C31543DtT c31543DtT = this.A0J;
                if (c31543DtT != null) {
                    c31543DtT.A00 = str3;
                    C31542DtS c31542DtS = this.A0E;
                    if (c31542DtS != null) {
                        if (list != null) {
                            c31542DtS.A0F(AbstractC166987dD.A1F(list));
                            return;
                        }
                        throw AbstractC166997dE.A0g();
                    }
                }
                C14360o3.A0F("paginationHelper");
            } else {
                C31543DtT c31543DtT2 = this.A0J;
                if (c31543DtT2 != null) {
                    c31543DtT2.A00 = null;
                    C31542DtS c31542DtS2 = this.A0E;
                    if (c31542DtS2 != null) {
                        if (A06) {
                            z = true;
                            if (this.A0b) {
                                String str4 = c31542DtS2.A08;
                                if (str4.length() == 0) {
                                    A1E = AbstractC166987dD.A1E();
                                } else {
                                    Locale locale = Locale.ROOT;
                                    String A16 = AbstractC31172DnG.A16(locale, str4);
                                    List list2 = c31542DtS2.A0C;
                                    A1E = AbstractC166987dD.A1E();
                                    Iterator it = list2.iterator();
                                    while (it.hasNext()) {
                                        User A15 = AbstractC25226BEj.A15(it);
                                        if (AbstractC001900j.A0a(AbstractC31172DnG.A16(locale, A15.getUsername()), A16, false) || AbstractC001900j.A0a(AbstractC31172DnG.A16(locale, A15.A0Q()), A16, false)) {
                                            A1E.add(A15);
                                        }
                                    }
                                }
                                c31542DtS2.A0F(A1E);
                                c31542DtS2.A01 = A1E.size();
                                c31542DtS2.A0H = false;
                                c31542DtS2.A0G(false, false);
                                c31542DtS2.A0K = z;
                                A0C(this);
                                return;
                            }
                        }
                        z = false;
                        c31542DtS2.A0C.clear();
                        c31542DtS2.A0z.clear();
                        c31542DtS2.A01 = 0;
                        c31542DtS2.A0H = false;
                        c31542DtS2.A0G(false, false);
                        c31542DtS2.A0K = z;
                        A0C(this);
                        return;
                    }
                }
                C14360o3.A0F("paginationHelper");
            }
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    private final void A0A(Context context, User user) {
        String A0p = AbstractC166997dE.A0p(context, 2131972218);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31178DnM.A0c(context, user, 2131972217));
        AbstractC31178DnM.A1L(this.A03, "remove_follower_dialog_impression", user.getId());
        C50674MYs c50674MYs = new C50674MYs(context, A03(this));
        c50674MYs.A0C(A0p, A0H.toString());
        c50674MYs.A06(user.Bhu());
        c50674MYs.A01(new ViewOnClickListenerC35670Fp5(18, user, this), 2131972214);
        C31727DwY.A02(this, c50674MYs);
    }

    public static final void A0C(C31535DtK c31535DtK) {
        String str;
        C65974TxR c65974TxR;
        String str2;
        A0F(c31535DtK);
        if (c31535DtK.A0b) {
            str = c31535DtK.A0R;
        } else {
            str = c31535DtK.A0H.A00;
        }
        User user = c31535DtK.A0C;
        if (user != null) {
            user.A03.B7S();
        }
        User user2 = c31535DtK.A0C;
        if (user2 != null) {
            user2.A03.BVy();
        }
        if (c31535DtK.A0r) {
            c31535DtK.A07();
            if (!c31535DtK.A0c) {
                c31535DtK.A08();
                c31535DtK.A0c = true;
            }
            C31542DtS c31542DtS = c31535DtK.A0E;
            if (c31542DtS == null) {
                str2 = "followListAdapter";
            } else {
                c31542DtS.A0F(AbstractC166987dD.A1E());
                return;
            }
        } else {
            FNH fnh = c31535DtK.A0F;
            if (fnh == null) {
                str2 = "followListFragmentQueryManager";
            } else {
                C14360o3.A0B(str, 0);
                if (fnh.A00) {
                    c65974TxR = fnh.A01;
                } else {
                    c65974TxR = fnh.A02;
                }
                c65974TxR.A06(str);
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public static final void A0H(C31535DtK c31535DtK, String str) {
        String str2;
        InterfaceC70513Em interfaceC70513Em;
        if (A0R(c31535DtK) && (interfaceC70513Em = c31535DtK.A0A) != null) {
            interfaceC70513Em.setIsLoading(false);
        }
        if (c31535DtK.A0b) {
            c31535DtK.A0V = true;
            str2 = c31535DtK.A0R;
        } else {
            str2 = c31535DtK.A0H.A00;
        }
        if (str.equals(str2)) {
            c31535DtK.A07();
        }
        C32123E9w c32123E9w = c31535DtK.A0I;
        if (c32123E9w == null) {
            C14360o3.A0F("perfLogger");
            throw C00O.createAndThrow();
        }
        ((MTJ) c32123E9w).A00.A05();
        C69613Av A02 = A02(c31535DtK);
        if (A02 != null) {
            A02.A05();
        }
    }

    public static final void A0K(C31535DtK c31535DtK, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (AbstractC31175DnJ.A1X((User) obj, c31535DtK.A0l)) {
                A1E.add(obj);
            }
        }
        List A0a = AbstractC001800i.A0a(A1E);
        if (!A0a.isEmpty()) {
            C31542DtS c31542DtS = c31535DtK.A0E;
            if (c31542DtS == null) {
                C14360o3.A0F("followListAdapter");
                throw C00O.createAndThrow();
            }
            List list2 = c31542DtS.A0w;
            list2.clear();
            list2.addAll(A0a);
            c31542DtS.A0G(false, false);
        }
    }

    public static final void A0N(C31535DtK c31535DtK, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            C47O c47o = new C47O(null);
            C14360o3.A0B(A15, 0);
            c47o.A03 = A15;
            String A0e = AbstractC31171DnF.A0e(A15);
            if (A0e != null) {
                c47o.A05 = A0e;
            }
            A1E.add(c47o);
        }
        C47K c47k = new C47K(null);
        c47k.A0M = A1E;
        C31542DtS c31542DtS = c31535DtK.A0E;
        if (c31542DtS == null) {
            C14360o3.A0F("followListAdapter");
            throw C00O.createAndThrow();
        }
        c31542DtS.A0C(c47k);
        A0M(c31535DtK, A1E);
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return A03(this);
    }

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        String str;
        AbstractC167017dG.A1N(user, followStatus);
        if (followStatus == FollowStatus.A06) {
            FA7.A00(A03(this)).A02(EnumC33422Ept.A09, null);
        }
        UserSession A03 = A03(this);
        Integer num = this.A0K;
        String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        if (num != null) {
            if (num != C05F.A00 && num != C05F.A0u) {
                str = "followers_list";
            } else {
                str = "following_list";
            }
            FYD.A01(this, A03, user, str);
            Number number = (Number) this.A12.get(user.getId());
            if (number != null) {
                int intValue = number.intValue();
                UserSession A032 = A03(this);
                FollowListData followListData = this.A0D;
                str2 = "followListData";
                if (followListData != null) {
                    String id = user.getId();
                    FollowListData followListData2 = this.A0D;
                    if (followListData2 != null) {
                        FY4.A01(A032, followListData, id, "follow_list_user_follow", followListData2.A02, getModuleName(), intValue);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.GYZ
    public final void Des(User user) {
        Context context = getContext();
        if (context != null) {
            A0A(context, user);
            AbstractC31178DnM.A1L(this.A03, MSV.A00(558), user.getId());
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (A0R(this)) {
            String str = this.A0M;
            if (str != null && str.length() != 0) {
                return FCV.A00(str, this.A0N);
            }
            return "user_list_groups_page";
        }
        FollowListData followListData = this.A0D;
        if (followListData != null) {
            String str2 = followListData.A00.A00;
            UserSession A03 = A03(this);
            FollowListData followListData2 = this.A0D;
            if (followListData2 != null) {
                if (!C2TN.A05(A03, followListData2.A02)) {
                    return str2;
                }
                return AnonymousClass001.A0R("self_", str2);
            }
        }
        C14360o3.A0F("followListData");
        throw C00O.createAndThrow();
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        if (r0.intValue() != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0287, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8, 36325600734164164L) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x009a, code lost:
    
        if (r5 == X.C05F.A00) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        if (r5 != X.C05F.A01) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009c, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c7, code lost:
    
        if (r7 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0297, code lost:
    
        if (r6.equals("potential_spam") == false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016f  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r55) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31535DtK.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(523129157);
        C14360o3.A0B(layoutInflater, 0);
        Context context = layoutInflater.getContext();
        C14360o3.A07(context);
        this.A0B = new TypeaheadHeader(context);
        boolean z = this.A0U;
        int i = R.layout.layout_refreshablelistview_with_progress;
        if (z) {
            i = R.layout.layout_listview_with_progress;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        if (inflate == null) {
            C14360o3.A0F("view");
            throw C00O.createAndThrow();
        }
        View requireViewById = inflate.requireViewById(R.id.layout_listview_parent_container);
        C14360o3.A0C(requireViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        this.A02 = (ViewGroup) requireViewById;
        C0f9.A09(497504517, A02);
        return inflate;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1222244794);
        FollowListData followListData = this.A0D;
        String str = "followListData";
        if (followListData != null) {
            C38687GzS c38687GzS = new C38687GzS(followListData.A00, followListData.A02);
            ConcurrentHashMap concurrentHashMap = ((FQ7) this.A0t.getValue()).A02;
            if (concurrentHashMap.containsKey(c38687GzS)) {
                concurrentHashMap.remove(c38687GzS);
            }
            FNH fnh = this.A0F;
            if (fnh == null) {
                str = "followListFragmentQueryManager";
            } else {
                fnh.A01.onDestroy();
                fnh.A02.onDestroy();
                C25671My A00 = AbstractC25651Mw.A00(A03(this));
                A00.A02(this.A0w, C3HV.class);
                C161887My c161887My = this.A0i;
                str = "followStatusUpdatedListener";
                if (c161887My != null) {
                    A00.A02(c161887My, C70073Cr.class);
                    A00.A02(this.A0y, C36093FwT.class);
                    A00.A02(this.A0x, AbstractC36056Fvs.class);
                    C161887My c161887My2 = this.A0i;
                    if (c161887My2 != null) {
                        c161887My2.A01();
                        C34672FPh c34672FPh = this.A0G;
                        if (c34672FPh == null) {
                            str = "tailLoadPerfLogger";
                        } else {
                            int i = c34672FPh.A00;
                            if (i != 0) {
                                C006802i c006802i = c34672FPh.A01;
                                c006802i.markerAnnotate(i, AbstractC111324zv.A00(785), "User Exited Follow List Fragment");
                                c006802i.markerEnd(c34672FPh.A00, (short) 4);
                                c34672FPh.A00 = 0;
                            }
                            super.onDestroy();
                            C0f9.A09(-1590272177, A02);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        C169487hO c169487hO;
        String str2;
        C169487hO c169487hO2;
        int A02 = C0f9.A02(-9297215);
        FNH fnh = this.A0F;
        if (fnh == null) {
            str2 = "followListFragmentQueryManager";
        } else {
            if (this.A0b) {
                str = this.A0R;
            } else {
                str = this.A0H.A00;
            }
            C14360o3.A0B(str, 0);
            if (fnh.A00) {
                c169487hO = fnh.A03;
            } else {
                c169487hO = fnh.A04;
            }
            C9JQ BjP = c169487hO.BjP(str);
            fnh.A01.onDestroyView();
            fnh.A02.onDestroyView();
            if (BjP.A01 != C05F.A00) {
                if (fnh.A00) {
                    c169487hO2 = fnh.A03;
                } else {
                    c169487hO2 = fnh.A04;
                }
                c169487hO2.AA4(BjP, str);
            }
            C61372qz c61372qz = this.A0z;
            C31543DtT c31543DtT = this.A0J;
            if (c31543DtT == null) {
                str2 = "paginationHelper";
            } else {
                ArrayList arrayList = c61372qz.A02;
                arrayList.remove(c31543DtT);
                TypeaheadHeader typeaheadHeader = this.A0B;
                if (typeaheadHeader != null) {
                    C31571Dtx c31571Dtx = typeaheadHeader.A04;
                    C14360o3.A0B(c31571Dtx, 0);
                    arrayList.remove(c31571Dtx);
                    typeaheadHeader.A01();
                }
                this.A0B = null;
                this.A0f = null;
                this.A0v.removeCallbacksAndMessages(null);
                super.onDestroyView();
                C0f9.A09(1779047731, A02);
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1451256472);
        super.onPause();
        AbstractC31171DnF.A16(this);
        C31727DwY c31727DwY = this.A07;
        if (c31727DwY != null) {
            c31727DwY.A04();
        }
        C34672FPh c34672FPh = this.A0G;
        if (c34672FPh == null) {
            C14360o3.A0F("tailLoadPerfLogger");
            throw C00O.createAndThrow();
        }
        int i = c34672FPh.A00;
        if (i != 0) {
            c34672FPh.A01.markerPoint(i, AbstractC111324zv.A00(2404));
        }
        TypeaheadHeader typeaheadHeader = this.A0B;
        if (typeaheadHeader != null) {
            typeaheadHeader.A03 = null;
        }
        C0f9.A09(-2047071548, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1276345286);
        super.onResume();
        if (!this.A0V && (!this.A0a || this.A0X)) {
            A0C(this);
        }
        C3M4 A05 = C1OU.A05(requireActivity());
        if (A05 != null && A05.A0a() && A05.A0G == C3G2.A0v) {
            A05.A0Y(this);
        }
        TypeaheadHeader typeaheadHeader = this.A0B;
        if (typeaheadHeader != null) {
            typeaheadHeader.A03 = this;
        }
        C34672FPh c34672FPh = this.A0G;
        if (c34672FPh == null) {
            C14360o3.A0F("tailLoadPerfLogger");
            throw C00O.createAndThrow();
        }
        int i = c34672FPh.A00;
        if (i != 0) {
            c34672FPh.A01.markerPoint(i, AbstractC111324zv.A00(4479));
        }
        C0f9.A09(1226099290, A02);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        String str;
        int A03 = C0f9.A03(-1091440234);
        C14360o3.A0B(absListView, 0);
        this.A0z.onScroll(absListView, i, i2, i3);
        if (!this.A0T) {
            C31543DtT c31543DtT = this.A0J;
            if (c31543DtT == null) {
                str = "paginationHelper";
            } else {
                String str2 = c31543DtT.A00;
                if ((str2 == null || str2.length() == 0) && !this.A0c) {
                    C31542DtS c31542DtS = this.A0E;
                    if (c31542DtS == null) {
                        str = "followListAdapter";
                    } else if (A0T(this, c31542DtS.A0C) && i + i2 == i3 - 5 && !this.A0c) {
                        A08();
                        this.A0c = true;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C0f9.A0A(513049017, A03);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, -1554540686);
        this.A0z.onScrollStateChanged(absListView, i);
        C0f9.A0A(169628704, A0N);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-782690242);
        super.onStart();
        A09();
        C0f9.A09(-738489409, A02);
    }
}
