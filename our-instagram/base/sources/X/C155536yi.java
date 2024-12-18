package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.EnumMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6yi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155536yi implements InterfaceC60602pj {
    public View A00;
    public View A01;
    public C5SW A02;
    public EnumC155546yj A03;
    public Runnable A04;
    public boolean A05;
    public final Activity A06;
    public final UserSession A07;
    public final Map A08;
    public final boolean A09;

    public C155536yi(Activity activity, UserSession userSession, final String str, final boolean z) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(str, 4);
        this.A06 = activity;
        this.A07 = userSession;
        this.A09 = z;
        EnumMap enumMap = new EnumMap(EnumC155546yj.class);
        this.A08 = enumMap;
        EnumC155546yj enumC155546yj = EnumC155546yj.A0G;
        final boolean A27 = C08730cb.A00(userSession).A00().A27();
        enumMap.put((EnumMap) enumC155546yj, (EnumC155546yj) new InterfaceC155566yl(z, A27, str) { // from class: X.6yk
            public final String A00;
            public final boolean A01;
            public final boolean A02;

            @Override // X.InterfaceC155566yl
            public final /* synthetic */ String BSd(Activity activity2, UserSession userSession2) {
                return AbstractC68566VVt.A00(activity2, userSession2, this);
            }

            @Override // X.InterfaceC155566yl
            public final int CId(Context context, boolean z2) {
                C14360o3.A0B(context, 0);
                return context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            }

            @Override // X.InterfaceC155566yl
            public final void Dts(UserSession userSession2) {
                EnumC1571773w enumC1571773w;
                String str2;
                C14360o3.A0B(userSession2, 0);
                boolean z2 = this.A02;
                boolean z3 = this.A01;
                String str3 = this.A00;
                C1571673v c1571673v = C1571673v.A00;
                if (z2) {
                    enumC1571773w = EnumC1571773w.A05;
                } else if (z3) {
                    enumC1571773w = EnumC1571773w.A03;
                } else {
                    enumC1571773w = EnumC1571773w.A04;
                }
                c1571673v.A0E(userSession2, enumC1571773w, "profile_highlights_subtab_tooltip", "impression_highlights_subtab_tooltip", str3, null);
                InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession2).A01.ARD();
                if (z2) {
                    str2 = "preference_has_seen_self_highlights_subtab_tooltip";
                } else {
                    str2 = "preference_has_seen_other_highlights_subtab_tooltip";
                }
                ARD.E77(str2, true);
                ARD.apply();
            }

            @Override // X.InterfaceC155566yl
            public final long EM4() {
                return 1000L;
            }

            @Override // X.InterfaceC155566yl
            public final boolean Ejp(UserSession userSession2, boolean z2) {
                InterfaceC19630xq interfaceC19630xq;
                String str2;
                C14360o3.A0B(userSession2, 1);
                boolean z3 = this.A02;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, userSession2, 36328925039705976L)) {
                    return false;
                }
                C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
                if (z3) {
                    interfaceC19630xq = A00.A01;
                    str2 = "preference_has_seen_self_highlights_subtab_tooltip";
                } else {
                    if (C18U.A06(c06090Tz, userSession2, 36328925039640439L)) {
                        return false;
                    }
                    interfaceC19630xq = A00.A01;
                    str2 = "preference_has_seen_other_highlights_subtab_tooltip";
                }
                if (interfaceC19630xq.getBoolean(str2, false)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC155566yl
            public final boolean Ejw() {
                return false;
            }

            @Override // X.InterfaceC155566yl
            public final EnumC155546yj BeX() {
                return EnumC155546yj.A0G;
            }

            {
                this.A02 = z;
                this.A01 = A27;
                this.A00 = str;
            }

            @Override // X.InterfaceC155566yl
            public final int BT3(UserSession userSession2) {
                return 2131963620;
            }
        });
        enumMap.put((EnumMap) EnumC155546yj.A0R, (EnumC155546yj) new Object());
        enumMap.put((EnumMap) EnumC155546yj.A0S, (EnumC155546yj) new Object());
        enumMap.put((EnumMap) EnumC155546yj.A09, (EnumC155546yj) new InterfaceC155566yl(str) { // from class: X.6yo
            public final String A00;

            @Override // X.InterfaceC155566yl
            public final String BSd(Activity activity2, UserSession userSession2) {
                String str2;
                C14360o3.A0B(activity2, 0);
                C14360o3.A0B(userSession2, 1);
                User A02 = AnonymousClass189.A00(userSession2).A02(this.A00);
                if (A02 != null) {
                    str2 = A02.getUsername();
                } else {
                    str2 = null;
                }
                String string = activity2.getString(2131970145, str2);
                C14360o3.A07(string);
                return string;
            }

            @Override // X.InterfaceC155566yl
            public final int CId(Context context, boolean z2) {
                C14360o3.A0B(context, 0);
                return context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            }

            @Override // X.InterfaceC155566yl
            public final void Dts(UserSession userSession2) {
                C14360o3.A0B(userSession2, 0);
                InterfaceC19630xq interfaceC19630xq = AbstractC149676oK.A00(userSession2).A01;
                long j = interfaceC19630xq.getLong("profile_exclusives_tab_header_tooltip_count", 0L) + 1;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7G("profile_exclusives_tab_header_tooltip_count", j);
                ARD.apply();
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7G("profile_exclusives_tab_tooltip_timestamp", currentTimeMillis);
                ARD2.apply();
                C16910sj c16910sj = C16910sj.A00;
                java.util.Set stringSet = interfaceC19630xq.getStringSet("profile_exclusives_tab_tooltip_creator_set", c16910sj);
                if (stringSet == null) {
                    stringSet = c16910sj;
                }
                LinkedHashSet A01 = AnonymousClass090.A01(this.A00, stringSet);
                InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
                ARD3.E7L("profile_exclusives_tab_tooltip_creator_set", A01);
                ARD3.apply();
            }

            @Override // X.InterfaceC155566yl
            public final long EM4() {
                return 1000L;
            }

            @Override // X.InterfaceC155566yl
            public final boolean Ejp(UserSession userSession2, boolean z2) {
                C17Q c17q;
                C14360o3.A0B(userSession2, 1);
                C143436di A00 = AbstractC149676oK.A00(userSession2);
                C18A A002 = AnonymousClass189.A00(userSession2);
                String str2 = this.A00;
                User A02 = A002.A02(str2);
                if (A02 != null) {
                    c17q = A02.A02;
                } else {
                    c17q = null;
                }
                if (c17q != C17Q.A03) {
                    return false;
                }
                InterfaceC19630xq interfaceC19630xq = A00.A01;
                C16910sj c16910sj = C16910sj.A00;
                java.util.Set stringSet = interfaceC19630xq.getStringSet("profile_exclusives_tab_tooltip_creator_set", c16910sj);
                if (stringSet == null) {
                    stringSet = c16910sj;
                }
                if (stringSet.contains(str2) || interfaceC19630xq.getLong("profile_exclusives_tab_header_tooltip_count", 0L) >= 10 || System.currentTimeMillis() - interfaceC19630xq.getLong("profile_exclusives_tab_tooltip_timestamp", 0L) <= TimeUnit.DAYS.toMillis(1L)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC155566yl
            public final EnumC155546yj BeX() {
                return EnumC155546yj.A09;
            }

            @Override // X.InterfaceC155566yl
            public final /* synthetic */ boolean Ejw() {
                return true;
            }

            {
                this.A00 = str;
            }

            @Override // X.InterfaceC155566yl
            public final /* synthetic */ int BT3(UserSession userSession2) {
                return 0;
            }
        });
        enumMap.put((EnumMap) EnumC155546yj.A0f, (EnumC155546yj) new InterfaceC155566yl(str) { // from class: X.6yp
            public final String A00;

            @Override // X.InterfaceC155566yl
            public final /* synthetic */ String BSd(Activity activity2, UserSession userSession2) {
                return AbstractC68566VVt.A00(activity2, userSession2, this);
            }

            @Override // X.InterfaceC155566yl
            public final int CId(Context context, boolean z2) {
                C14360o3.A0B(context, 0);
                return -context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            }

            @Override // X.InterfaceC155566yl
            public final void Dts(UserSession userSession2) {
                C14360o3.A0B(userSession2, 0);
                C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
                A00.A5R.Egi(A00, true, C23031Ai.A8c[445]);
            }

            @Override // X.InterfaceC155566yl
            public final long EM4() {
                return 1000L;
            }

            @Override // X.InterfaceC155566yl
            public final boolean Ejp(UserSession userSession2, boolean z2) {
                C14360o3.A0B(userSession2, 1);
                if (!z2) {
                    User A02 = AnonymousClass189.A00(userSession2).A02(this.A00);
                    if (A02 != null) {
                        List CD7 = A02.A03.CD7();
                        if (CD7 == null) {
                            CD7 = C16930sl.A00;
                        }
                        if (!CD7.isEmpty()) {
                            C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
                            if (!((Boolean) A00.A5R.CES(A00, C23031Ai.A8c[445])).booleanValue() && C18U.A06(C06090Tz.A05, userSession2, 36318690131909025L)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }

            @Override // X.InterfaceC155566yl
            public final EnumC155546yj BeX() {
                return EnumC155546yj.A0f;
            }

            @Override // X.InterfaceC155566yl
            public final /* synthetic */ boolean Ejw() {
                return true;
            }

            {
                this.A00 = str;
            }

            @Override // X.InterfaceC155566yl
            public final int BT3(UserSession userSession2) {
                return 2131976233;
            }
        });
        enumMap.put((EnumMap) EnumC155546yj.A08, (EnumC155546yj) new Object());
        enumMap.put((EnumMap) EnumC155546yj.A0h, (EnumC155546yj) new InterfaceC155566yl(z) { // from class: X.6yr
            public final boolean A00;

            @Override // X.InterfaceC155566yl
            public final /* synthetic */ String BSd(Activity activity2, UserSession userSession2) {
                return AbstractC68566VVt.A00(activity2, userSession2, this);
            }

            @Override // X.InterfaceC155566yl
            public final int CId(Context context, boolean z2) {
                C14360o3.A0B(context, 0);
                return context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            }

            @Override // X.InterfaceC155566yl
            public final void Dts(UserSession userSession2) {
                C0YR[] c0yrArr;
                long currentTimeMillis;
                InterfaceC16530ry interfaceC16530ry;
                char c;
                C14360o3.A0B(userSession2, 0);
                C28411Zc.A00();
                boolean z2 = this.A00;
                C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
                if (z2) {
                    InterfaceC16530ry interfaceC16530ry2 = A00.A8X;
                    c0yrArr = C23031Ai.A8c;
                    int intValue = ((Number) interfaceC16530ry2.CES(A00, c0yrArr[493])).intValue() + 1;
                    interfaceC16530ry2.Egi(A00, Integer.valueOf(intValue), c0yrArr[493]);
                    currentTimeMillis = System.currentTimeMillis();
                    interfaceC16530ry = A00.A8Y;
                    c = 491;
                } else {
                    InterfaceC16530ry interfaceC16530ry3 = A00.A8V;
                    c0yrArr = C23031Ai.A8c;
                    int intValue2 = ((Number) interfaceC16530ry3.CES(A00, c0yrArr[494])).intValue() + 1;
                    interfaceC16530ry3.Egi(A00, Integer.valueOf(intValue2), c0yrArr[494]);
                    currentTimeMillis = System.currentTimeMillis();
                    interfaceC16530ry = A00.A8W;
                    c = 492;
                }
                interfaceC16530ry.Egi(A00, Long.valueOf(currentTimeMillis), c0yrArr[c]);
            }

            @Override // X.InterfaceC155566yl
            public final long EM4() {
                return 1000L;
            }

            @Override // X.InterfaceC155566yl
            public final boolean Ejp(UserSession userSession2, boolean z2) {
                int intValue;
                String str2;
                C14360o3.A0B(userSession2, 1);
                C28411Zc.A00();
                boolean z3 = this.A00;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, userSession2, 36322297904113774L) || !C18U.A06(c06090Tz, userSession2, 36322297904900217L)) {
                    return false;
                }
                C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
                if (z3) {
                    intValue = ((Number) A00.A8X.CES(A00, C23031Ai.A8c[493])).intValue();
                    str2 = "wall_self_profile_tooltip_last_shown_ts";
                } else {
                    intValue = ((Number) A00.A8V.CES(A00, C23031Ai.A8c[494])).intValue();
                    str2 = "wall_other_profile_tooltip_last_shown_ts";
                }
                if (!C23031Ai.A07(A00, str2, 3L) || intValue >= ((int) C18U.A01(c06090Tz, userSession2, 36603772881671138L))) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC155566yl
            public final boolean Ejw() {
                return false;
            }

            @Override // X.InterfaceC155566yl
            public final int BT3(UserSession userSession2) {
                if (!this.A00) {
                    return 2131977000;
                }
                return 2131976976;
            }

            @Override // X.InterfaceC155566yl
            public final EnumC155546yj BeX() {
                return EnumC155546yj.A0h;
            }

            {
                this.A00 = z;
            }
        });
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
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
    public final void onDestroyView() {
        this.A03 = null;
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
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

    public static final void A00(View view, View view2, final InterfaceC155566yl interfaceC155566yl, final C155536yi c155536yi) {
        c155536yi.A01 = view;
        if (view != null && view2 != null && view2.isAttachedToWindow() && c155536yi.A04 == null) {
            c155536yi.A00 = view2;
            c155536yi.A03 = interfaceC155566yl.BeX();
            Runnable runnable = new Runnable() { // from class: X.9Jb
                @Override // java.lang.Runnable
                public final void run() {
                    C155536yi c155536yi2 = c155536yi;
                    View view3 = c155536yi2.A00;
                    if (c155536yi2.A01 != null && view3 != null) {
                        try {
                            Activity activity = c155536yi2.A06;
                            InterfaceC155566yl interfaceC155566yl2 = interfaceC155566yl;
                            UserSession userSession = c155536yi2.A07;
                            C5SU c5su = new C5SU(activity, new C149686oL(interfaceC155566yl2.BSd(activity, userSession)));
                            c5su.A05 = EnumC58132lV.A03;
                            c5su.A04(view3, 0, interfaceC155566yl2.CId(activity, true), true);
                            c5su.A0A = interfaceC155566yl2.Ejw();
                            c5su.A04 = new C220479oX(5, interfaceC155566yl2, c155536yi2);
                            C5SW A00 = c5su.A00();
                            c155536yi2.A02 = A00;
                            A00.A07(userSession);
                        } catch (Resources.NotFoundException unused) {
                            c155536yi2.A05 = false;
                            C0w9.A03("Missing tooltip string resource.", AnonymousClass001.A0R("Tooltip delegate: ", interfaceC155566yl.getClass().getSimpleName()));
                        }
                    }
                }
            };
            c155536yi.A04 = runnable;
            c155536yi.A05 = true;
            View view3 = c155536yi.A01;
            if (view3 != null) {
                view3.postDelayed(runnable, interfaceC155566yl.EM4());
            }
        }
    }

    public final void A01(View view, View view2, EnumC155546yj enumC155546yj) {
        if (this.A05) {
            if (enumC155546yj == this.A03) {
                this.A01 = view;
                this.A00 = view2;
                return;
            }
            return;
        }
        EnumC155546yj[] enumC155546yjArr = AbstractC154186wT.A00;
        int i = 0;
        do {
            EnumC155546yj enumC155546yj2 = enumC155546yjArr[i];
            InterfaceC155566yl interfaceC155566yl = (InterfaceC155566yl) this.A08.get(enumC155546yj2);
            if (interfaceC155566yl != null) {
                if (enumC155546yj2 == enumC155546yj) {
                    if (!interfaceC155566yl.Ejp(this.A07, this.A09)) {
                        return;
                    }
                    A00(view, view2, interfaceC155566yl, this);
                    return;
                }
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("No tooltip delegate for ");
                sb.append(enumC155546yj2);
                throw new IllegalStateException(sb.toString());
            }
        } while (i < 7);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        View view;
        Runnable runnable = this.A04;
        if (runnable != null && (view = this.A01) != null) {
            view.removeCallbacks(runnable);
        }
        this.A04 = null;
    }
}
