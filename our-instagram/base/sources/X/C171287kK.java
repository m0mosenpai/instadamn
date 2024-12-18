package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive;
import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7kK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171287kK implements InterfaceC60602pj, InterfaceC171217kD {
    public C81W A00;
    public C52172N7c A02;
    public FundraiserDisplayInfoModel A03;
    public NewFundraiserInfo A04;
    public String A06;
    public String A07;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public Map A0E;
    public final Context A0F;
    public final AbstractC59962oe A0G;
    public final InterfaceC11380iw A0H;
    public final InterfaceC41501vz A0I;
    public final InterfaceC41501vz A0J;
    public final UserSession A0K;
    public final C1810981l A0L;
    public final C8GG A0M;
    public final C8JI A0N;
    public final C64842wi A0O;
    public final C64742wY A0P;
    public final C171497kf A0Q;
    public final String A0R;
    public final C171447ka A0S;
    public List A0D = C16930sl.A00;
    public EnumC171297kL A01 = EnumC171297kL.A03;
    public ArrayList A08 = new ArrayList();
    public C3PO A05 = C3PO.A08;
    public Map A09 = new EnumMap(EnumC171297kL.class);

    /* JADX WARN: Type inference failed for: r0v21, types: [X.7kb] */
    public C171287kK(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, C8GG c8gg, C8JI c8ji, FundraiserSharedToLive fundraiserSharedToLive, C64842wi c64842wi, C64742wY c64742wY, String str) {
        String str2;
        this.A0G = abstractC59962oe;
        this.A0K = userSession;
        this.A0L = c1810981l;
        this.A0M = c8gg;
        this.A0N = c8ji;
        this.A0P = c64742wY;
        this.A0O = c64842wi;
        this.A0H = interfaceC11380iw;
        this.A0R = str;
        this.A0F = abstractC59962oe.requireContext();
        EnumC171297kL enumC171297kL = EnumC171297kL.A02;
        C81W c81w = C81W.A0Y;
        this.A0E = AbstractC06930Yk.A06(new C09530e4(enumC171297kL, c81w), new C09530e4(EnumC171297kL.A0A, C81W.A0W), new C09530e4(EnumC171297kL.A06, C81W.A0c), new C09530e4(EnumC171297kL.A04, C81W.A0a));
        this.A00 = C81W.A0d;
        this.A0C = AbstractC172137li.A04(userSession);
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.7kW
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(653059200);
                C171427kY c171427kY = (C171427kY) obj;
                int A032 = C0f9.A03(875346056);
                C14360o3.A0B(c171427kY, 0);
                C171287kK c171287kK = C171287kK.this;
                C171287kK.A01(EnumC171297kL.A02, c171287kK);
                NewFundraiserInfo newFundraiserInfo = c171427kY.A01;
                FundraiserDisplayInfoModel fundraiserDisplayInfoModel = c171427kY.A00;
                c171287kK.A04 = newFundraiserInfo;
                c171287kK.A03 = fundraiserDisplayInfoModel;
                C171287kK.A00(C81W.A0Y, c171287kK, true);
                String str3 = fundraiserDisplayInfoModel.A00;
                if (str3 == null) {
                    str3 = fundraiserDisplayInfoModel.A01;
                }
                Context context = c171287kK.A0F;
                C193328hC c193328hC = new C193328hC(context);
                c193328hC.A05 = context.getResources().getString(2131964058);
                String format = String.format("%s\n\n%s", Arrays.copyOf(new Object[]{context.getResources().getString(2131964056, str3), context.getResources().getString(2131964057)}, 2));
                C14360o3.A07(format);
                c193328hC.A0r(format);
                String string = context.getResources().getString(2131968948);
                C14360o3.A07(string);
                c193328hC.A0b(null, string);
                C0fJ.A00(c193328hC.A02());
                C0f9.A0A(1203821380, A032);
                C0f9.A0A(1423857074, A03);
            }
        };
        this.A0J = interfaceC41501vz;
        InterfaceC41501vz interfaceC41501vz2 = new InterfaceC41501vz() { // from class: X.7kX
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(462652300);
                C171437kZ c171437kZ = (C171437kZ) obj;
                int A032 = C0f9.A03(-1107778316);
                C14360o3.A0B(c171437kZ, 0);
                C171287kK c171287kK = C171287kK.this;
                C171287kK.A01(EnumC171297kL.A02, c171287kK);
                String str3 = c171437kZ.A01;
                FundraiserDisplayInfoModel fundraiserDisplayInfoModel = c171437kZ.A00;
                c171287kK.A06 = str3;
                c171287kK.A03 = fundraiserDisplayInfoModel;
                C171287kK.A00(C81W.A0Y, c171287kK, true);
                AbstractC55215Oed.A02(c171287kK.A0H, c171287kK.A0K, str3);
                String str4 = fundraiserDisplayInfoModel.A00;
                if (str4 == null) {
                    str4 = fundraiserDisplayInfoModel.A01;
                }
                C171287kK.A08(c171287kK, str4);
                C0f9.A0A(356559317, A032);
                C0f9.A0A(-645661522, A03);
            }
        };
        this.A0I = interfaceC41501vz2;
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        A00.A01(interfaceC41501vz, C171427kY.class);
        A00.A01(interfaceC41501vz2, C171437kZ.class);
        if (fundraiserSharedToLive != null) {
            A01(enumC171297kL, this);
            String str3 = fundraiserSharedToLive.A01;
            String str4 = fundraiserSharedToLive.A02;
            User user = fundraiserSharedToLive.A00;
            if (user != null) {
                str2 = user.B8y();
            } else {
                str2 = null;
            }
            String str5 = (user == null || (str5 = user.getShortName()) == null) ? "" : str5;
            String str6 = fundraiserSharedToLive.A04;
            str6 = str6 == null ? "" : str6;
            String str7 = fundraiserSharedToLive.A03;
            FundraiserDisplayInfoModel fundraiserDisplayInfoModel = new FundraiserDisplayInfoModel(str4, str2, str5, str6, str7 == null ? "" : str7);
            this.A06 = str3;
            this.A03 = fundraiserDisplayInfoModel;
            A00(c81w, this, true);
            AbstractC55215Oed.A02(this.A0H, this.A0K, str3);
            A08(this, user != null ? user.B8y() : null);
        }
        C171447ka c171447ka = new C171447ka();
        this.A0S = c171447ka;
        c171447ka.A02 = new Object() { // from class: X.7kb
        };
        if (this.A0C) {
            this.A00 = C81W.A0X;
        }
        c1810981l.A0H(new AnonymousClass822() { // from class: X.7kc
            @Override // X.AnonymousClass822
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                C14360o3.A0B(obj, 0);
                if (!obj.equals(C81S.A00)) {
                    C171287kK c171287kK = C171287kK.this;
                    C171287kK.A01(EnumC171297kL.A03, c171287kK);
                    C171287kK.A09(c171287kK, null, new ArrayList(), false);
                    C171287kK.A02(c171287kK);
                }
            }
        });
        InterfaceC171487ke interfaceC171487ke = new InterfaceC171487ke() { // from class: X.7kd
            @Override // X.InterfaceC171487ke
            public final void Dpe() {
                C171287kK c171287kK = C171287kK.this;
                AbstractC99684dl.A00(c171287kK.A0K).A03(c171287kK.A0H.getModuleName());
                c171287kK.A0B = true;
                Context context = c171287kK.A0F;
                C9GR.A09(context, context.getString(2131964124));
                C171287kK.A00(C81W.A0c, c171287kK, true);
            }
        };
        C171497kf c171497kf = new C171497kf();
        Bundle bundle = new Bundle();
        AbstractC60492pY.A04(bundle, userSession);
        c171497kf.setArguments(bundle);
        c171497kf.A00 = interfaceC171487ke;
        this.A0Q = c171497kf;
    }

    public static final void A02(C171287kK c171287kK) {
        c171287kK.A06 = null;
        c171287kK.A04 = null;
        A00(C81W.A0Y, c171287kK, false);
    }

    public final void A0A(View view) {
        C14360o3.A0B(view, 0);
        C1810981l c1810981l = this.A0L;
        C81S c81s = C81S.A00;
        C81W c81w = C81W.A0X;
        boolean z = this.A0C;
        c1810981l.A0K(c81s, c81w, z);
        if (z) {
            c1810981l.A0K(c81s, C81W.A0d, false);
        }
        UserSession userSession = this.A0K;
        this.A0A = C18U.A06(C06090Tz.A05, userSession, 36311246953447900L);
        c1810981l.A0K(c81s, C81W.A0c, true);
        InterfaceC171827lD interfaceC171827lD = AbstractC171517kh.A00(userSession).A00;
        boolean z2 = false;
        if (interfaceC171827lD != null) {
            z2 = true;
        }
        c1810981l.A0K(c81s, C81W.A0a, z2);
        if (this.A0A) {
            if (!((Boolean) this.A09.getOrDefault(EnumC171297kL.A02, false)).booleanValue()) {
                A03(this);
            }
        }
        EnumC171297kL enumC171297kL = EnumC171297kL.A06;
        Map map = this.A09;
        if (!((Boolean) map.getOrDefault(enumC171297kL, false)).booleanValue()) {
            A05(this);
        }
        if (z2 && !((Boolean) map.getOrDefault(EnumC171297kL.A04, false)).booleanValue()) {
            A04(this);
        }
        C19700xy c19700xy = C17280tP.A4E;
        C17280tP A00 = c19700xy.A00();
        InterfaceC16530ry interfaceC16530ry = A00.A1M;
        C0YR[] c0yrArr = C17280tP.A4G;
        interfaceC16530ry.Egi(A00, false, c0yrArr[96]);
        C17280tP A002 = c19700xy.A00();
        A002.A1N.Egi(A002, false, c0yrArr[97]);
        A06(this);
    }

    public final void A0B(View view, InterfaceC171217kD interfaceC171217kD, String str, boolean z) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(interfaceC171217kD, 3);
        C214749fC c214749fC = new C214749fC();
        Bundle bundle = new Bundle();
        bundle.putBoolean(MSV.A00(311), z);
        bundle.putString(MSV.A00(310), str);
        c214749fC.setArguments(bundle);
        c214749fC.A0A = interfaceC171217kD;
        UserSession userSession = this.A0K;
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0U = new C24102Amn(view);
        Context context = view.getContext();
        int i = 2131964031;
        if (C18U.A06(C06090Tz.A05, userSession, 36318196210538505L)) {
            i = 2131964032;
        }
        c189448aO.A0d = context.getString(i);
        c189448aO.A0a = false;
        c189448aO.A03 = 0.33f;
        C189478aR A00 = c189448aO.A00();
        A00.A03(this.A0G.requireContext(), c214749fC);
        c214749fC.A0D = A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(android.view.View r3, X.C3PO r4) {
        /*
            r2 = this;
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            r2.A05 = r4
            com.instagram.common.session.UserSession r1 = r2.A0K
            boolean r0 = X.AbstractC109224vo.A02(r1)
            if (r0 == 0) goto L17
            com.instagram.monetization.repository.MonetizationRepository r0 = X.AbstractC63302u8.A00(r1)
            boolean r0 = r0.A06
            r1 = 1
            if (r0 != 0) goto L18
        L17:
            r1 = 0
        L18:
            java.lang.String r0 = r4.A01
            r2.A0B(r3, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C171287kK.A0C(android.view.View, X.3PO):void");
    }

    public final void A0D(C3PO c3po, boolean z) {
        Context context;
        int i;
        C14360o3.A0B(c3po, 0);
        if (this.A05 != c3po) {
            this.A05 = c3po;
            int[] iArr = AbstractC22783A3b.A00;
            Drawable drawable = null;
            switch (c3po.ordinal()) {
                case 0:
                    C81W c81w = C81W.A0V;
                    A00(c81w, this, false);
                    C8GH A00 = this.A0M.A00();
                    C81S c81s = C81S.A00;
                    context = this.A0F;
                    A00.A09(context.getDrawable(R.drawable.instagram_users_outline_44), c81s, c81w);
                    i = 2131964030;
                    break;
                case 1:
                    C81W c81w2 = C81W.A0V;
                    A00(c81w2, this, true);
                    C8GH A002 = this.A0M.A00();
                    C81S c81s2 = C81S.A00;
                    context = this.A0F;
                    A002.A09(context.getDrawable(R.drawable.instagram_eye_off_outline_44), c81s2, c81w2);
                    i = 2131964027;
                    break;
                case 2:
                    C81W c81w3 = C81W.A0V;
                    A00(c81w3, this, true);
                    context = this.A0F;
                    Drawable drawable2 = context.getDrawable(R.drawable.instagram_crown_badge_pano_outline_24);
                    if (drawable2 != null) {
                        drawable2.mutate();
                        drawable2.setTint(context.getColor(R.color.audio_bar_action_color_enabled));
                        drawable = drawable2;
                    }
                    this.A0M.A00().A09(drawable, C81S.A00, c81w3);
                    i = 2131964035;
                    break;
                case 3:
                    C81W c81w4 = C81W.A0V;
                    A00(c81w4, this, true);
                    context = this.A0F;
                    Drawable drawable3 = context.getDrawable(R.drawable.instagram_circle_star_pano_filled_24);
                    if (drawable3 != null) {
                        drawable3.mutate();
                        drawable3.setTint(context.getColor(R.color.audio_bar_action_color_enabled));
                        drawable = drawable3;
                    }
                    this.A0M.A00().A09(drawable, C81S.A00, c81w4);
                    i = 2131964018;
                    break;
                case 4:
                    C81W c81w5 = C81W.A0V;
                    A00(c81w5, this, true);
                    context = this.A0F;
                    Drawable drawable4 = context.getDrawable(R.drawable.instagram_user_requested_pano_filled_24);
                    if (drawable4 != null) {
                        drawable4.mutate();
                        drawable4.setTint(context.getColor(R.color.audio_bar_action_color_enabled));
                        drawable = drawable4;
                    }
                    this.A0M.A00().A09(drawable, C81S.A00, c81w5);
                    i = 2131964020;
                    break;
                case 5:
                    A00(C81W.A0V, this, true);
                    context = this.A0F;
                    i = 2131964013;
                    break;
                case 6:
                    C81W c81w6 = C81W.A0V;
                    A00(c81w6, this, true);
                    C8GH A003 = this.A0M.A00();
                    C81S c81s3 = C81S.A00;
                    context = this.A0F;
                    A003.A09(context.getDrawable(R.drawable.instagram_app_instagram_outline_44), c81s3, c81w6);
                    i = 2131964023;
                    break;
                default:
                    throw new UnsupportedOperationException("You've selected a visibility option that is not supported by the broadcaster tools entrypoint.");
            }
            String string = context.getString(i);
            if (this.A05 == C3PO.A04) {
                this.A0A = false;
                this.A01 = EnumC171297kL.A03;
                A00(C81W.A0W, this, false);
                A02(this);
                A00(C81W.A0Y, this, false);
            } else {
                this.A0A = C18U.A06(C06090Tz.A05, this.A0K, 36311246953447900L);
            }
            this.A0L.A0K(C81S.A00, C81W.A0Y, this.A0A);
            if (z && string != null) {
                C9GR.A09(context, string);
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC171217kD
    public final void Cxk(C3PO c3po) {
        A0D(c3po, true);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(C81W c81w, C171287kK c171287kK, boolean z) {
        C1810981l c1810981l = c171287kK.A0L;
        if (c1810981l.A0W(c81w) != z) {
            c1810981l.A0M(c81w);
        }
    }

    public static final void A01(EnumC171297kL enumC171297kL, C171287kK c171287kK) {
        EnumC171297kL enumC171297kL2 = c171287kK.A01;
        if (enumC171297kL2 != enumC171297kL) {
            Map map = c171287kK.A0E;
            C81W c81w = (C81W) map.get(enumC171297kL2);
            if (c81w != null) {
                A00(c81w, c171287kK, false);
            }
            C81W c81w2 = (C81W) map.get(enumC171297kL);
            if (c81w2 != null) {
                c171287kK.A0L.A0L(c81w2);
            }
            c171287kK.A01 = enumC171297kL;
            A02(c171287kK);
        }
    }

    public static final void A03(C171287kK c171287kK) {
        if (C18U.A06(C06090Tz.A05, c171287kK.A0K, 36311246953447900L)) {
            c171287kK.A09.put(EnumC171297kL.A02, true);
            C8GG c8gg = c171287kK.A0M;
            C8GH A00 = c8gg.A00();
            C81W c81w = C81W.A0Y;
            A00.A08(c81w, new C206899Du(c171287kK, 4));
            C8GH A002 = c8gg.A00();
            C64742wY c64742wY = c171287kK.A0P;
            A002.A07(c81w, QPTooltipAnchor.A0h, c171287kK.A0O, c64742wY);
        }
    }

    public static final void A04(C171287kK c171287kK) {
        QPTooltipAnchor qPTooltipAnchor;
        UserSession userSession = c171287kK.A0K;
        if (AbstractC171517kh.A00(userSession).A00 != null) {
            c171287kK.A09.put(EnumC171297kL.A04, true);
            C8GG c8gg = c171287kK.A0M;
            C8GH A00 = c8gg.A00();
            C81W c81w = C81W.A0a;
            A00.A08(c81w, new C206899Du(c171287kK, 6));
            if (AbstractC171517kh.A00(userSession).A01.isEmpty()) {
                qPTooltipAnchor = QPTooltipAnchor.A0l;
            } else {
                qPTooltipAnchor = QPTooltipAnchor.A0m;
            }
            c8gg.A00().A07(c81w, qPTooltipAnchor, c171287kK.A0O, c171287kK.A0P);
            A06(c171287kK);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.C14360o3.A0K(r4.A0L.A08.A00, X.C81S.A00) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C171287kK r4) {
        /*
            com.instagram.common.session.UserSession r0 = r4.A0K
            com.instagram.monetization.repository.MonetizationRepository r0 = X.AbstractC63302u8.A00(r0)
            boolean r0 = r0.A06
            if (r0 == 0) goto L19
            X.81l r0 = r4.A0L
            X.81v r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.81S r0 = X.C81S.A00
            boolean r1 = X.C14360o3.A0K(r1, r0)
            r0 = 1
            if (r1 != 0) goto L1a
        L19:
            r0 = 0
        L1a:
            java.util.Map r2 = r4.A09
            X.7kL r1 = X.EnumC171297kL.A06
            if (r0 == 0) goto L3f
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r1, r0)
            X.81W r3 = X.C81W.A0c
            boolean r0 = r4.A0B
            A00(r3, r4, r0)
            X.8GG r0 = r4.A0M
            X.8GH r2 = r0.A00()
            r1 = 7
            X.9Du r0 = new X.9Du
            r0.<init>(r4, r1)
            r2.A08(r3, r0)
            return
        L3f:
            r3 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.put(r1, r0)
            X.81l r2 = r4.A0L
            X.81S r1 = X.C81S.A00
            X.81W r0 = X.C81W.A0c
            r2.A0K(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C171287kK.A05(X.7kK):void");
    }

    public static final void A06(C171287kK c171287kK) {
        String str;
        if (C14360o3.A0K(c171287kK.A0L.A08.A00, C81S.A00)) {
            UserSession userSession = c171287kK.A0K;
            UpcomingEvent A00 = AbstractC171517kh.A00(userSession).A00(userSession);
            EnumC171297kL enumC171297kL = c171287kK.A01;
            EnumC171297kL enumC171297kL2 = EnumC171297kL.A04;
            if (enumC171297kL != enumC171297kL2) {
                if (A00 != null) {
                    A01(enumC171297kL2, c171287kK);
                    str = A00.getTitle();
                } else {
                    return;
                }
            } else {
                if (A00 != null) {
                    return;
                }
                A01(EnumC171297kL.A03, c171287kK);
                str = null;
            }
            c171287kK.A07 = str;
        }
    }

    public static final void A07(C171287kK c171287kK) {
        C1810981l c1810981l = c171287kK.A0L;
        C81W c81w = C81W.A0Z;
        if (c1810981l.A0V(c81w)) {
            A00(c81w, c171287kK, C171547kk.A03.A00(c171287kK.A0K).A01.getBoolean("ig_live_employee_only_mode", false));
        }
    }

    public static final void A08(C171287kK c171287kK, String str) {
        Context context = c171287kK.A0F;
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A05 = context.getResources().getString(2131964055);
        String format = String.format("%s\n\n%s", Arrays.copyOf(new Object[]{context.getResources().getString(2131964053, str), context.getResources().getString(2131964054)}, 2));
        C14360o3.A07(format);
        c193328hC.A0r(format);
        String string = context.getResources().getString(2131968948);
        C14360o3.A07(string);
        c193328hC.A0b(null, string);
        C0fJ.A00(c193328hC.A02());
    }

    public static final void A09(C171287kK c171287kK, String str, ArrayList arrayList, boolean z) {
        Context context;
        int i;
        boolean z2 = false;
        if (c171287kK.A0C) {
            if (TextUtils.isEmpty(str) && arrayList.isEmpty()) {
                if (z) {
                    context = c171287kK.A0F;
                    i = 2131964052;
                    C9GR.A09(context, context.getString(i));
                }
            } else if (z) {
                context = c171287kK.A0F;
                i = 2131964051;
                C9GR.A09(context, context.getString(i));
            }
        } else if (str != null && !TextUtils.isEmpty(str)) {
            if (z) {
                String str2 = c171287kK.A07;
                context = c171287kK.A0F;
                if (str2 == null) {
                    i = 2131964142;
                } else {
                    i = 2131964144;
                }
                C9GR.A09(context, context.getString(i));
            }
        } else if (z) {
            context = c171287kK.A0F;
            i = 2131964143;
            C9GR.A09(context, context.getString(i));
        }
        c171287kK.A07 = str;
        c171287kK.A08 = arrayList;
        C81W c81w = c171287kK.A00;
        if (str != null || (!arrayList.isEmpty())) {
            z2 = true;
        }
        A00(c81w, c171287kK, z2);
    }
}
