package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.intf.FanClubGuidedActivationProfileBannerParams;
import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.User;
import com.instagram.zero.cms.ZeroCmsTextView;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.6yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155666yv extends C2US {
    public int A00;
    public C9C7 A01;
    public AiStudioProfileBannerModel A02;
    public C6C9 A03;
    public AvatarCoinFlipConfig A04;
    public C1338462s A05;
    public FanClubGuidedActivationProfileBannerParams A06;
    public UserPayFanclubUpsellParams A07;
    public C38321qM A08;
    public EnumC155686yx A09;
    public EnumC155676yw A0A;
    public MWW A0B;
    public C155406yT A0C;
    public C33616EtS A0D;
    public C154536x3 A0E;
    public EnumC125765mR A0F;
    public C70N A0G;
    public C4NL A0H;
    public SourceModelInfoParams A0I;
    public User A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public String A0X;
    public final C155306yJ A0Y;
    public final C65662y2 A0Z;
    public final C65662y2 A0a;
    public final InterfaceC11380iw A0b;
    public final UserSession A0c;
    public final C31363DqS A0d;
    public final C155696yy A0e;
    public final C155726z1 A0f;
    public final C155706yz A0g;
    public final C66132yp A0h;
    public final C155716z0 A0i;
    public final boolean A0j;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.2y2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.2y2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.6z0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.6yy] */
    public C155666yv(C155306yJ c155306yJ, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, final UserSession userSession, C57112jm c57112jm, C31363DqS c31363DqS, InterfaceC678133v interfaceC678133v, C155406yT c155406yT, EnumC125765mR enumC125765mR, UserDetailEntryInfo userDetailEntryInfo, C31359DqO c31359DqO, C155536yi c155536yi, InterfaceC55362gb interfaceC55362gb, C64742wY c64742wY, String str, String str2, String str3, String str4, String str5, Map map, boolean z, boolean z2, boolean z3, boolean z4) {
        super(C18U.A06(C06090Tz.A05, userSession, 36322641501628795L));
        this.A0A = EnumC155676yw.A02;
        this.A09 = EnumC155686yx.A03;
        this.A0U = false;
        this.A0V = false;
        this.A0O = false;
        this.A0T = false;
        this.A04 = null;
        final Context requireContext = abstractC59962oe.requireContext();
        this.A0F = enumC125765mR;
        this.A0c = userSession;
        this.A0b = interfaceC11380iw;
        this.A0d = c31363DqS;
        this.A0Y = c155306yJ;
        this.A0j = z3;
        this.A0X = str5;
        ?? obj = new Object();
        this.A0e = obj;
        obj.A0A = interfaceC678133v;
        this.A0g = new C155706yz();
        this.A0a = new Object();
        this.A0Z = new Object();
        AbstractC54912fq.A00();
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC55362gb, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A0h = new C66132yp(userSession, interfaceC55362gb, new C66072yj(interfaceC11380iw, userSession), map);
        this.A0C = c155406yT;
        final Integer num = C05F.A01;
        this.A0i = new AbstractC65632xz(requireContext, userSession, num) { // from class: X.6z0
            public final Context A00;
            public final UserSession A01;
            public final Integer A02;

            @Override // X.InterfaceC65642y0
            public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj2, Object obj3) {
                anonymousClass306.A7a(0);
            }

            @Override // X.InterfaceC65642y0
            public final int getViewTypeCount() {
                return 1;
            }

            @Override // X.AbstractC65632xz, X.InterfaceC65642y0
            public final int getViewModelHash(int i, Object obj2, Object obj3) {
                UserSession userSession2 = this.A01;
                C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
                return Arrays.hashCode(new Object[]{Boolean.valueOf(C3FU.A02(userSession2, "ig_free_data_banner_tooltip")), Boolean.valueOf(C3FU.A01(userSession2, A00))});
            }

            {
                this.A00 = requireContext;
                this.A01 = userSession;
                this.A02 = num;
            }

            @Override // X.InterfaceC65642y0
            public final void bindView(int i, View view, Object obj2, Object obj3) {
                int A03 = C0f9.A03(-1272577310);
                UserSession userSession2 = this.A01;
                Object tag = view.getTag();
                C18C.A07(tag, "Tag set when creating view cannot be null");
                AbstractC34872FYh.A00(userSession2, (C114875Gx) tag);
                C0f9.A0A(1890372249, A03);
            }

            @Override // X.InterfaceC65642y0
            public final View createView(int i, ViewGroup viewGroup) {
                Context context;
                ImageView imageView;
                int i2;
                int A03 = C0f9.A03(871935179);
                Context context2 = this.A00;
                Integer num2 = this.A02;
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context2).inflate(R.layout.zero_rating_video_setting_banner, viewGroup, false);
                C114875Gx c114875Gx = new C114875Gx(linearLayout);
                int intValue = num2.intValue();
                if (intValue != 0) {
                    if (intValue == 2 || intValue == 1) {
                        LinearLayout linearLayout2 = c114875Gx.A03;
                        context = linearLayout2.getContext();
                        linearLayout2.setBackgroundDrawable(context.getDrawable(R.drawable.video_setting_banner_background_white));
                        ZeroCmsTextView zeroCmsTextView = c114875Gx.A06;
                        if (zeroCmsTextView != null) {
                            zeroCmsTextView.setTextColor(context.getColor(R.color.zero_rating_video_settings_drawer_cancel_button_color));
                        }
                        TextView textView = c114875Gx.A04;
                        if (textView != null) {
                            textView.setTextColor(context.getColor(R.color.zero_rating_video_settings_drawer_subtitle_color));
                        }
                        imageView = c114875Gx.A02;
                        if (imageView != null) {
                            i2 = R.color.baseline_neutral_80;
                            imageView.setColorFilter(context.getColor(i2));
                        }
                    }
                } else {
                    LinearLayout linearLayout3 = c114875Gx.A03;
                    context = linearLayout3.getContext();
                    linearLayout3.setBackgroundDrawable(context.getDrawable(R.drawable.video_setting_banner_background_blue));
                    ZeroCmsTextView zeroCmsTextView2 = c114875Gx.A06;
                    if (zeroCmsTextView2 != null) {
                        zeroCmsTextView2.setTextColor(context.getColor(R.color.design_dark_default_color_on_background));
                    }
                    TextView textView2 = c114875Gx.A04;
                    if (textView2 != null) {
                        textView2.setTextColor(context.getColor(R.color.fds_white_alpha60));
                    }
                    imageView = c114875Gx.A02;
                    if (imageView != null) {
                        i2 = R.color.design_dark_default_color_on_background;
                        imageView.setColorFilter(context.getColor(i2));
                    }
                }
                linearLayout.setTag(c114875Gx);
                C0f9.A0A(-127120286, A03);
                return linearLayout;
            }

            @Override // X.AbstractC65632xz, X.InterfaceC65642y0
            public final int getIdentifier(int i, Object obj2, Object obj3) {
                return Arrays.hashCode(new Object[]{Integer.valueOf(i)});
            }
        };
        C155726z1 c155726z1 = new C155726z1(abstractC59962oe, C62862tP.A02(abstractC59962oe, interfaceC11380iw, userSession, c57112jm), interfaceC11380iw, userSession, c57112jm, c31363DqS, userDetailEntryInfo, c31359DqO, c155536yi, interfaceC55362gb, c64742wY, this.A0J, str, str2, str3, str4, this.A0X, z, z2, z3);
        this.A0f = c155726z1;
        this.A0S = z4;
        init(this.A0a, this.A0Z, this.A0i, this.A0h, c155726z1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a0, code lost:
    
        if (X.AbstractC1566271k.A0A(r24.A0c, r1) != X.C05F.A0N) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00af, code lost:
    
        if (r0.A0A() == com.instagram.api.schemas.SellerShoppableFeedType.A06) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ed, code lost:
    
        if (X.AbstractC23021Ah.A00(r10).A01.getBoolean("has_seen_self_favorites_tab", false) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011c, code lost:
    
        if (X.C14360o3.A0K(X.C18U.A04(X.C06090Tz.A05, X.AbstractC1567572b.A00(r10).A00, 36875592771240009L), "3-up") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0121, code lost:
    
        if (r15 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0123, code lost:
    
        if (r13 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0125, code lost:
    
        if (r16 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0127, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013f, code lost:
    
        if (X.C14360o3.A0K(X.C18U.A04(X.C06090Tz.A05, X.AbstractC1567572b.A00(r10).A00, 36875592771240009L), "shop_row") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0142, code lost:
    
        r14 = X.C18U.A06(X.C06090Tz.A05, X.AbstractC1567572b.A00(r10).A00, 2342155652031579340L);
        r1 = r24.A04;
        r6.A04 = r0;
        r6.A03 = r5;
        r6.A05 = r0;
        r6.A06 = r4;
        r6.A0G = r11;
        r6.A0A = r3;
        r6.A08 = r2;
        r6.A0J = r12;
        r6.A0K = r13;
        r6.A0H = r14;
        r6.A02 = r1;
        r6.A0B = r24.A0Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0175, code lost:
    
        if (r24.A01 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0177, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0178, code lost:
    
        r6.A0E = r7;
        r6.A0I = r24.A0U;
        r6.A0F = r24.A0S;
        r3 = new java.util.ArrayList();
        r1 = r24.A0Z;
        r0 = new java.lang.Object();
        r0.A01 = null;
        r0.A02 = null;
        r0.A00 = r1;
        r3.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019e, code lost:
    
        if (X.C3FU.A02(r10, "ig_select_free_data_banner") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a0, code lost:
    
        r1 = r24.A0i;
        r0 = new java.lang.Object();
        r0.A01 = null;
        r0.A02 = null;
        r0.A00 = r1;
        r3.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b0, code lost:
    
        r0 = r24.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b2, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b8, code lost:
    
        if (r0.A2A() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ba, code lost:
    
        r1 = r24.A0a;
        r0 = new java.lang.Object();
        r0.A01 = null;
        r0.A02 = null;
        r0.A00 = r1;
        r3.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ca, code lost:
    
        r2 = r24.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01cc, code lost:
    
        if (r2 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ce, code lost:
    
        r1 = r24.A0h;
        r0 = new java.lang.Object();
        r0.A01 = r2;
        r0.A02 = null;
        r0.A00 = r1;
        r3.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01de, code lost:
    
        r1 = r24.A0f;
        r0 = new java.lang.Object();
        r0.A01 = r8;
        r0.A02 = r6;
        r0.A00 = r1;
        r3.add(r0);
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01f6, code lost:
    
        if (r3.hasNext() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f8, code lost:
    
        r0 = (X.C1567772d) r3.next();
        addModel(r0.A01, r0.A02, r0.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0230, code lost:
    
        notifyDataSetChangedSmart();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0233, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0141, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011f, code lost:
    
        if (r17 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x008e, code lost:
    
        if (X.AbstractC1567472a.A0A(r24.A0c, r14) == false) goto L8;
     */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, X.72d] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, X.72d] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, X.72d] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, X.72d] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, X.72d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155666yv.A00():void");
    }

    public final void A01(AvatarCoinFlipConfig avatarCoinFlipConfig) {
        if (this.A04 != avatarCoinFlipConfig) {
            this.A04 = avatarCoinFlipConfig;
            A00();
        }
    }

    public final void A02(Boolean bool, Boolean bool2) {
        boolean z;
        C155706yz c155706yz = this.A0g;
        if (bool.booleanValue() && bool2.booleanValue() && this.A0H == null && !this.A0j && this.A0J != null) {
            C23031Ai A00 = AbstractC23021Ah.A00(this.A0c);
            String id = this.A0J.getId();
            InterfaceC19630xq interfaceC19630xq = A00.A01;
            if (!interfaceC19630xq.contains("account_recs_from_friends_banner_dismissed") || !interfaceC19630xq.C2v("account_recs_from_friends_banner_dismissed").contains(id)) {
                z = true;
                c155706yz.A0D = z;
            }
        }
        z = false;
        c155706yz.A0D = z;
    }
}
