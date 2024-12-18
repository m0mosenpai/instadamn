package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6mo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148796mo {
    public C5SW A00;
    public InterfaceC145156ga A01;
    public Runnable A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final ReelViewerConfig A05;
    public final Map A06;

    public C148796mo(final Context context, InterfaceC11380iw interfaceC11380iw, final UserSession userSession, ReelViewerConfig reelViewerConfig, final C3G2 c3g2) {
        HashMap hashMap = new HashMap();
        this.A06 = hashMap;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A05 = reelViewerConfig;
        hashMap.put(EnumC148806mp.A0B, new Object());
        hashMap.put(EnumC148806mp.A0F, new Object());
        hashMap.put(EnumC148806mp.A0D, new Object());
        hashMap.put(EnumC148806mp.A0T, new Object());
        hashMap.put(EnumC148806mp.A0K, new Object());
        hashMap.put(EnumC148806mp.A0L, new Object());
        hashMap.put(EnumC148806mp.A0N, new Object());
        hashMap.put(EnumC148806mp.A0M, new Object());
        hashMap.put(EnumC148806mp.A0A, new Object());
        hashMap.put(EnumC148806mp.A0S, new Object());
        hashMap.put(EnumC148806mp.A0G, new Object());
        hashMap.put(EnumC148806mp.A09, new InterfaceC148826mr(userSession) { // from class: X.6n2
            public final UserSession A00;

            @Override // X.InterfaceC148826mr
            public final C207559Gj C9L(UserSession userSession2, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                return null;
            }

            @Override // X.InterfaceC148826mr
            public final void Dtu(Context context2, InterfaceC11380iw interfaceC11380iw2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(userSession2, 0);
                InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession2).A01;
                int i = interfaceC19630xq.getInt("favorites_badge_nux_impression_count", 0) + 1;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7D("favorites_badge_nux_impression_count", i);
                ARD.apply();
                C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD2 = A00.A01.ARD();
                ARD2.E7G("favorites_badge_nux_last_timestamp", currentTimeMillis);
                ARD2.apply();
            }

            @Override // X.InterfaceC148826mr
            public final boolean Ejo(UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
                C14360o3.A0B(userSession2, 0);
                if (System.currentTimeMillis() - AbstractC23021Ah.A00(userSession2).A01.getLong("favorites_badge_nux_last_timestamp", 0L) > 86400000 && !AbstractC23021Ah.A00(userSession2).A01.getBoolean("has_tapped_on_favorites_badge", false) && AbstractC23021Ah.A00(userSession2).A01.getInt("favorites_badge_nux_impression_count", 0) < 5) {
                    C38321qM c38321qM = c41181vS.A0b;
                    if (c38321qM.A69() && interfaceC143576dw.Aoi() != null && !AbstractC50102Ry.A00(c38321qM.A2E(userSession2), C08730cb.A00(userSession2).A00())) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC148826mr
            public final EnumC58132lV C9M() {
                return EnumC58132lV.A03;
            }

            {
                this.A00 = userSession;
            }

            @Override // X.InterfaceC148826mr
            public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                return interfaceC143576dw.Aoi();
            }

            @Override // X.InterfaceC148826mr
            public final C5ST C9O(Context context2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                return new C149686oL(context2.getString(2131975695, c41181vS.A0b.A2E(this.A00).getUsername()));
            }
        });
        hashMap.put(EnumC148806mp.A0C, new InterfaceC148826mr(userSession) { // from class: X.6n3
            public final C143436di A00;

            @Override // X.InterfaceC148826mr
            public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                C14360o3.A0B(interfaceC143576dw, 0);
                return interfaceC143576dw.B2s();
            }

            @Override // X.InterfaceC148826mr
            public final C207559Gj C9L(UserSession userSession2, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                return null;
            }

            @Override // X.InterfaceC148826mr
            public final C5ST C9O(Context context2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(context2, 1);
                CharSequence text = context2.getText(2131962140);
                C14360o3.A07(text);
                return new C149686oL(text);
            }

            @Override // X.InterfaceC148826mr
            public final boolean Ejo(UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
                String str;
                User A2E;
                C14360o3.A0B(userSession2, 0);
                C14360o3.A0B(c41181vS, 1);
                C14360o3.A0B(interfaceC143576dw, 3);
                if (interfaceC143576dw.B2s() != null) {
                    InterfaceC19630xq interfaceC19630xq = this.A00.A01;
                    if (interfaceC19630xq.getInt("exclusive_story_badge_tooltip_count", 0) < 3 && System.currentTimeMillis() - interfaceC19630xq.getLong("exclusive_story_badge_tooltip_timestamp", 0L) > TimeUnit.DAYS.toMillis(1L)) {
                        String id = C08730cb.A00(userSession2).A00().getId();
                        C38321qM c38321qM = c41181vS.A0b;
                        if (c38321qM != null && (A2E = c38321qM.A2E(userSession2)) != null) {
                            str = A2E.getId();
                        } else {
                            str = null;
                        }
                        if (!C14360o3.A0K(id, str)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // X.InterfaceC148826mr
            public final EnumC58132lV C9M() {
                return EnumC58132lV.A03;
            }

            @Override // X.InterfaceC148826mr
            public final void Dtu(Context context2, InterfaceC11380iw interfaceC11380iw2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                InterfaceC19630xq interfaceC19630xq = this.A00.A01;
                int i = interfaceC19630xq.getInt("exclusive_story_badge_tooltip_count", 0) + 1;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7D("exclusive_story_badge_tooltip_count", i);
                ARD.apply();
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7G("exclusive_story_badge_tooltip_timestamp", currentTimeMillis);
                ARD2.apply();
            }

            {
                this.A00 = AbstractC149676oK.A00(userSession);
            }
        });
        hashMap.put(EnumC148806mp.A0H, new Object());
        hashMap.put(EnumC148806mp.A0E, new Object());
        hashMap.put(EnumC148806mp.A0I, new Object());
        hashMap.put(EnumC148806mp.A0J, new Object());
        hashMap.put(EnumC148806mp.A0P, new InterfaceC148826mr(context, userSession) { // from class: X.6n8
            public final Context A00;
            public final UserSession A01;

            @Override // X.InterfaceC148826mr
            public final C207559Gj C9L(UserSession userSession2, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                return null;
            }

            @Override // X.InterfaceC148826mr
            public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                return ((C143556du) interfaceC143576dw).A1e.A1g.getView();
            }

            @Override // X.InterfaceC148826mr
            public final EnumC58132lV C9M() {
                return EnumC58132lV.A02;
            }

            @Override // X.InterfaceC148826mr
            public final void Dtu(Context context2, InterfaceC11380iw interfaceC11380iw2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                Context context3 = this.A00;
                UserSession userSession3 = this.A01;
                C35115FeH.A00 = true;
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%sSaveEffectNuxCount", userSession3.userId);
                C14360o3.A07(formatStrLocaleSafe);
                SharedPreferences sharedPreferences = context3.getApplicationContext().getSharedPreferences("SavedEffectPreferences", 0);
                C14360o3.A07(sharedPreferences);
                C35115FeH.A00(context3, userSession3, new C17320tT(sharedPreferences, "SavedEffectPreferences").getInt(formatStrLocaleSafe, 0) + 1);
            }

            {
                this.A00 = context;
                this.A01 = userSession;
            }

            @Override // X.InterfaceC148826mr
            public final C5ST C9O(Context context2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                final String string = context2.getString(2131972776);
                final int A0A = AbstractC13880nE.A0A(context2) / 2;
                return new AbstractC149696oM(string, A0A) { // from class: X.9oc
                    public final int A00;
                    public final CharSequence A01;

                    @Override // X.C5ST
                    public final /* bridge */ /* synthetic */ void ADz(C5SV c5sv, AbstractC117215Sg abstractC117215Sg) {
                        TextView textView = ((C201248v6) abstractC117215Sg).A00;
                        textView.setWidth(this.A00);
                        textView.setLines(2);
                        textView.setText(this.A01);
                    }

                    {
                        this.A01 = string;
                        this.A00 = A0A;
                    }
                };
            }

            @Override // X.InterfaceC148826mr
            public final boolean Ejo(UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
                if (c41181vS.A13() && (interfaceC143576dw instanceof C143556du)) {
                    Context context2 = this.A00;
                    UserSession userSession3 = this.A01;
                    if (!C35115FeH.A00) {
                        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%sSaveEffectNuxCount", userSession3.userId);
                        C14360o3.A07(formatStrLocaleSafe);
                        SharedPreferences sharedPreferences = context2.getApplicationContext().getSharedPreferences("SavedEffectPreferences", 0);
                        C14360o3.A07(sharedPreferences);
                        if (new C17320tT(sharedPreferences, "SavedEffectPreferences").getInt(formatStrLocaleSafe, 0) < 3) {
                            return true;
                        }
                    }
                }
                return false;
            }
        });
        hashMap.put(EnumC148806mp.A06, new InterfaceC148826mr(userSession) { // from class: X.6n9
            public static final Rect A01 = new Rect();
            public final UserSession A00;

            @Override // X.InterfaceC148826mr
            public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                return null;
            }

            @Override // X.InterfaceC148826mr
            public final void Dtu(Context context2, InterfaceC11380iw interfaceC11380iw2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                InterfaceC19630xq interfaceC19630xq;
                String str;
                EnumC75383a5 enumC75383a5;
                C41743IeH A02;
                C84823qW A00 = A00(userSession2, c41181vS);
                if (A00 != null) {
                    int ordinal = A00.A12.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 51) {
                                if (ordinal == 4 && (A02 = A02(A00)) != null && A02.A09 != null) {
                                    C23031Ai A002 = AbstractC23021Ah.A00(userSession2);
                                    String str2 = A02.A09;
                                    C14360o3.A0B(str2, 0);
                                    A002.A10(str2, A002.A01.getInt(AnonymousClass001.A0R("bloks_shown_count_", str2), 0) + 1);
                                }
                                enumC75383a5 = A00.A12;
                                if (enumC75383a5 != EnumC75383a5.A06 || enumC75383a5 == EnumC75383a5.A07 || enumC75383a5 == EnumC75383a5.A1L || (enumC75383a5 == EnumC75383a5.A0E && !A00.A0N())) {
                                    C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw2, userSession2);
                                    C14360o3.A0B(c41181vS, 1);
                                    ALm.A00(A012, EnumC53340Niq.IMPRESSION, EnumC223329tP.CONSUMER_STICKER_TOOLTIP, c41181vS, A00, c41181vS.BlY(A00.A12));
                                }
                                return;
                            }
                            interfaceC19630xq = AbstractC23021Ah.A00(userSession2).A01;
                            str = "voter_registration_tooltip_shown_count";
                        } else {
                            interfaceC19630xq = AbstractC23021Ah.A00(userSession2).A01;
                            str = "anti_bully_global_tooltip_shown_count";
                        }
                    } else {
                        interfaceC19630xq = AbstractC23021Ah.A00(userSession2).A01;
                        str = "anti_bully_tooltip_shown_count";
                    }
                    int i = interfaceC19630xq.getInt(str, 0) + 1;
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.E7D(str, i);
                    ARD.apply();
                    enumC75383a5 = A00.A12;
                    if (enumC75383a5 != EnumC75383a5.A06) {
                    }
                    C18920wW A0122 = AbstractC12220kQ.A01(interfaceC11380iw2, userSession2);
                    C14360o3.A0B(c41181vS, 1);
                    ALm.A00(A0122, EnumC53340Niq.IMPRESSION, EnumC223329tP.CONSUMER_STICKER_TOOLTIP, c41181vS, A00, c41181vS.BlY(A00.A12));
                }
            }

            public static C84823qW A00(UserSession userSession2, C41181vS c41181vS) {
                C84823qW A012 = A01(userSession2, c41181vS.BlY(EnumC75383a5.A06));
                if (A012 == null) {
                    C84823qW A013 = A01(userSession2, c41181vS.BlY(EnumC75383a5.A07));
                    if (A013 == null) {
                        C84823qW A014 = A01(userSession2, c41181vS.BlY(EnumC75383a5.A1L));
                        if (A014 == null) {
                            return A01(userSession2, c41181vS.BlY(EnumC75383a5.A0E));
                        }
                        return A014;
                    }
                    return A013;
                }
                return A012;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static X.C84823qW A01(com.instagram.common.session.UserSession r6, java.util.List r7) {
                /*
                    if (r7 == 0) goto L62
                    boolean r0 = r7.isEmpty()
                    if (r0 != 0) goto L62
                    r5 = 0
                    java.lang.Object r4 = r7.get(r5)
                    X.3qW r4 = (X.C84823qW) r4
                    X.IeH r3 = A02(r4)
                    if (r3 == 0) goto L62
                    X.3a5 r0 = r4.A12
                    int r1 = r0.ordinal()
                    if (r1 == r5) goto L59
                    r0 = 1
                    if (r1 == r0) goto L50
                    r0 = 51
                    if (r1 == r0) goto L47
                    r0 = 4
                    if (r1 != r0) goto L62
                    java.lang.String r0 = r3.A09
                    if (r0 == 0) goto L45
                    X.1Ai r0 = X.AbstractC23021Ah.A00(r6)
                    java.lang.String r2 = r3.A09
                    X.C14360o3.A0B(r2, r5)
                    X.0xq r1 = r0.A01
                    java.lang.String r0 = "bloks_shown_count_"
                    java.lang.String r0 = X.AnonymousClass001.A0R(r0, r2)
                L3c:
                    int r1 = r1.getInt(r0, r5)
                L40:
                    int r0 = r3.A00
                    if (r1 >= r0) goto L62
                    return r4
                L45:
                    r1 = 0
                    goto L40
                L47:
                    X.1Ai r0 = X.AbstractC23021Ah.A00(r6)
                    X.0xq r1 = r0.A01
                    java.lang.String r0 = "voter_registration_tooltip_shown_count"
                    goto L3c
                L50:
                    X.1Ai r0 = X.AbstractC23021Ah.A00(r6)
                    X.0xq r1 = r0.A01
                    java.lang.String r0 = "anti_bully_global_tooltip_shown_count"
                    goto L3c
                L59:
                    X.1Ai r0 = X.AbstractC23021Ah.A00(r6)
                    X.0xq r1 = r0.A01
                    java.lang.String r0 = "anti_bully_tooltip_shown_count"
                    goto L3c
                L62:
                    r4 = 0
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C6n9.A01(com.instagram.common.session.UserSession, java.util.List):X.3qW");
            }

            public static C41743IeH A02(C84823qW c84823qW) {
                int ordinal = c84823qW.A12.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 51) {
                            if (ordinal != 4) {
                                return null;
                            }
                            return c84823qW.A1G;
                        }
                        return c84823qW.A1H;
                    }
                    return c84823qW.A1E;
                }
                return c84823qW.A1D;
            }

            @Override // X.InterfaceC148826mr
            public final EnumC58132lV C9M() {
                return EnumC58132lV.A02;
            }

            @Override // X.InterfaceC148826mr
            public final C5ST C9O(Context context2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                C41743IeH A02;
                String str;
                C84823qW A00 = A00(this.A00, c41181vS);
                if (A00 != null && (A02 = A02(A00)) != null && (str = A02.A08) != null) {
                    return new C149686oL(str);
                }
                return new C149686oL(2131975216);
            }

            {
                this.A00 = userSession;
            }

            @Override // X.InterfaceC148826mr
            public final C207559Gj C9L(UserSession userSession2, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                C84823qW A00 = A00(userSession2, c41181vS);
                FrameLayout Blf = interfaceC143576dw.Blf();
                if (A00 != null && Blf != null) {
                    int width = Blf.getWidth();
                    int height = Blf.getHeight();
                    float A002 = c41181vS.A00();
                    Rect rect = A01;
                    AbstractC138846Qp.A00(rect, A00, A002, width, height);
                    return new C207559Gj(Blf, rect.centerX(), rect.top, false);
                }
                return null;
            }

            @Override // X.InterfaceC148826mr
            public final boolean Ejo(UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
                if (A00(userSession2, c41181vS) == null) {
                    return false;
                }
                return true;
            }
        });
        hashMap.put(EnumC148806mp.A0R, new Object());
        hashMap.put(EnumC148806mp.A0W, new InterfaceC148826mr(userSession) { // from class: X.6nB
            public final InterfaceC09390do A00;

            @Override // X.InterfaceC148826mr
            public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                C14360o3.A0B(interfaceC143576dw, 0);
                return interfaceC143576dw.CGQ();
            }

            @Override // X.InterfaceC148826mr
            public final C207559Gj C9L(UserSession userSession2, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                return null;
            }

            @Override // X.InterfaceC148826mr
            public final C5ST C9O(Context context2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(context2, 1);
                String string = context2.getResources().getString(2131974645);
                C14360o3.A07(string);
                return new C149686oL(string);
            }

            @Override // X.InterfaceC148826mr
            public final boolean Ejo(UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
                C14360o3.A0B(userSession2, 0);
                C14360o3.A0B(c41181vS, 1);
                C14360o3.A0B(c41551w4, 2);
                if (!C141446aN.A02(userSession2, c41181vS, c41551w4) || !c41181vS.CY4()) {
                    return false;
                }
                C38321qM c38321qM = c41181vS.A0b;
                c38321qM.getClass();
                if (!c38321qM.A4f() || ((InterfaceC19630xq) this.A00.getValue()).getBoolean("PREFERENCE_HAS_SEEN_STORY_LIKES_FACEPILE_NUX", false)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC148826mr
            public final EnumC58132lV C9M() {
                return EnumC58132lV.A02;
            }

            @Override // X.InterfaceC148826mr
            public final void Dtu(Context context2, InterfaceC11380iw interfaceC11380iw2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                InterfaceC19610xo ARD = ((InterfaceC19630xq) this.A00.getValue()).ARD();
                ARD.E77("PREFERENCE_HAS_SEEN_STORY_LIKES_FACEPILE_NUX", true);
                ARD.apply();
            }

            {
                this.A00 = AbstractC09440dt.A01(new C9E7(userSession, 33));
            }
        });
        hashMap.put(EnumC148806mp.A03, new Object());
        hashMap.put(EnumC148806mp.A05, new InterfaceC148826mr() { // from class: X.6nD
            public final Rect A00 = new Rect();

            @Override // X.InterfaceC148826mr
            public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                return null;
            }

            @Override // X.InterfaceC148826mr
            public final C207559Gj C9L(UserSession userSession2, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                C14360o3.A0B(c41181vS, 1);
                C14360o3.A0B(interfaceC143576dw, 2);
                C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A09, c41181vS.A0c());
                FrameLayout Blf = interfaceC143576dw.Blf();
                if (A00 != null && Blf != null) {
                    int width = Blf.getWidth();
                    int height = Blf.getHeight();
                    float A002 = c41181vS.A00();
                    Rect rect = this.A00;
                    AbstractC138846Qp.A00(rect, A00, A002, width, height);
                    return new C207559Gj(Blf, rect.centerX(), rect.top, false);
                }
                return null;
            }

            @Override // X.InterfaceC148826mr
            public final C5ST C9O(Context context2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                String str;
                int intValue;
                String str2;
                int i;
                C102134ij c102134ij;
                C14360o3.A0B(userSession2, 0);
                C14360o3.A0B(context2, 1);
                C14360o3.A0B(c41181vS, 2);
                C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A09, c41181vS.A0c());
                Integer num = null;
                if (A00 != null && (c102134ij = A00.A0C) != null) {
                    str = c102134ij.A05;
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str, EnumC61206Rh6.STYLE_2.toString())) {
                    AbstractC439521d abstractC439521d = C20Y.A00(userSession2).A01;
                    if (abstractC439521d instanceof C126475ni) {
                        Integer num2 = ((C126475ni) abstractC439521d).A00.A00;
                        if (num2 == C05F.A01) {
                            i = 2131956826;
                        } else if (num2 == C05F.A0C) {
                            i = 2131956813;
                        }
                        num = Integer.valueOf(i);
                    }
                    if (abstractC439521d instanceof C125545m0) {
                        i = 2131975216;
                        num = Integer.valueOf(i);
                    }
                }
                if ((A01(userSession2, c41181vS) || A00(userSession2, c41181vS)) && num != null) {
                    intValue = num.intValue();
                } else if (A02(userSession2, c41181vS)) {
                    intValue = 2131953499;
                } else {
                    User user = c41181vS.A0i;
                    if (user != null) {
                        str2 = user.getId();
                    } else {
                        str2 = null;
                    }
                    if (C2TN.A05(userSession2, str2)) {
                        intValue = 2131953524;
                    } else {
                        intValue = 2131975216;
                        if (C14360o3.A0K(C20Y.A00(userSession2).A01.A00, C125535lz.A00)) {
                            intValue = 2131953506;
                        }
                    }
                }
                String string = context2.getString(intValue);
                C14360o3.A07(string);
                return new C149686oL(string);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
            @Override // X.InterfaceC148826mr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Dtu(android.content.Context r7, X.InterfaceC11380iw r8, com.instagram.common.session.UserSession r9, X.C41181vS r10, X.C41551w4 r11) {
                /*
                    r6 = this;
                    r0 = 0
                    X.C14360o3.A0B(r9, r0)
                    r0 = 3
                    X.C14360o3.A0B(r10, r0)
                    X.21C r4 = X.C21B.A00(r9)
                    boolean r0 = A01(r9, r10)
                    if (r0 == 0) goto L56
                    X.0xq r0 = r4.A00
                    X.0xo r2 = r0.ARD()
                    java.lang.String r1 = "key_has_seen_avatar_convergence_stories_mimicry_tooltip"
                    r0 = 1
                    r2.E77(r1, r0)
                    r2.apply()
                    java.lang.Integer r5 = X.C05F.A00
                L23:
                    X.6mf r3 = new X.6mf
                    r3.<init>(r9)
                    com.instagram.avatars.store.AvatarStore r0 = X.C20Y.A00(r9)
                    X.21d r0 = r0.A01
                    boolean r2 = r0 instanceof X.C126475ni
                    r0 = 39
                    java.lang.String r1 = X.AbstractC43591JPw.A00(r0)
                    java.lang.String r0 = "mux_tooltip"
                    r3.A01(r5, r1, r0, r2)
                L3b:
                    boolean r0 = A02(r9, r10)
                    if (r0 == 0) goto L6e
                    X.0xq r0 = r4.A00
                    X.0xo r2 = r0.ARD()
                    java.lang.String r1 = "key_has_seen_avatar_mention_sticker_tooltip_v4"
                    r0 = 1
                    r2.E77(r1, r0)
                    r2.apply()
                    java.lang.String r0 = "Tap to see avatars in this story."
                    X.AbstractC34759FSy.A00(r9, r0)
                    return
                L56:
                    boolean r0 = A00(r9, r10)
                    if (r0 == 0) goto L3b
                    X.0xq r0 = r4.A00
                    X.0xo r2 = r0.ARD()
                    java.lang.String r1 = "key_has_seen_avatar_convergence_auto_migration_stories_mimicry_tooltip"
                    r0 = 1
                    r2.E77(r1, r0)
                    r2.apply()
                    java.lang.Integer r5 = X.C05F.A01
                    goto L23
                L6e:
                    X.0xq r3 = r4.A00
                    X.0xo r2 = r3.ARD()
                    java.lang.String r1 = "story_viewer_avatar_sticker_tooltip_view_count_v2"
                    r0 = 0
                    int r0 = r3.getInt(r1, r0)
                    int r0 = r0 + 1
                    r2.E7D(r1, r0)
                    r2.apply()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C149036nD.Dtu(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.1vS, X.1w4):void");
            }

            @Override // X.InterfaceC148826mr
            public final boolean Ejo(UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
                String str;
                C14360o3.A0B(userSession2, 0);
                C14360o3.A0B(c41181vS, 1);
                if (!C18U.A06(C06090Tz.A05, userSession2, 36319828297981636L)) {
                    if (A01(userSession2, c41181vS) || A00(userSession2, c41181vS) || A02(userSession2, c41181vS)) {
                        return true;
                    }
                    User user = c41181vS.A0i;
                    if (user != null) {
                        str = user.getId();
                    } else {
                        str = null;
                    }
                    if ((!C2TN.A05(userSession2, str) || !C14360o3.A0K(C20Y.A00(userSession2).A01.A00, C125525ly.A00)) && C21B.A00(userSession2).A00.getInt("story_viewer_avatar_sticker_tooltip_view_count_v2", 0) < 3) {
                        if (AbstractC120715dH.A00(EnumC75383a5.A09, c41181vS.A0c()) == null) {
                            return false;
                        }
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC148826mr
            public final EnumC58132lV C9M() {
                return EnumC58132lV.A02;
            }

            public static final boolean A00(UserSession userSession2, C41181vS c41181vS) {
                C102134ij c102134ij;
                C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A09, c41181vS.A0c());
                if (A00 != null && (c102134ij = A00.A0C) != null) {
                    C149656oI c149656oI = new C149656oI(userSession2);
                    AvatarStore avatarStore = c149656oI.A01;
                    if (C149656oI.A02(avatarStore) && C149656oI.A01(avatarStore) && AbstractC148716mg.A00(c149656oI.A02) && C14360o3.A0K(c102134ij.A05, EnumC61206Rh6.STYLE_2.toString()) && !c149656oI.A00.A00.A00.getBoolean("key_has_seen_avatar_convergence_auto_migration_stories_mimicry_tooltip", false)) {
                        return true;
                    }
                }
                return false;
            }

            public static final boolean A01(UserSession userSession2, C41181vS c41181vS) {
                C102134ij c102134ij;
                C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A09, c41181vS.A0c());
                if (A00 != null && (c102134ij = A00.A0C) != null) {
                    C149656oI c149656oI = new C149656oI(userSession2);
                    AvatarStore avatarStore = c149656oI.A01;
                    if (!C149656oI.A02(avatarStore)) {
                        UserSession userSession3 = c149656oI.A02;
                        if (!AbstractC148716mg.A00(userSession3) && C14360o3.A0K(c102134ij.A05, EnumC61206Rh6.STYLE_2.toString()) && !c149656oI.A00.A00.A00.getBoolean("key_has_seen_avatar_convergence_stories_mimicry_tooltip", false) && !C149656oI.A00(c149656oI)) {
                            if (avatarStore.A01 instanceof C126475ni) {
                                C14360o3.A0B(userSession3, 0);
                                if (C18U.A06(C06090Tz.A05, userSession3, 36325278612009947L)) {
                                    return true;
                                }
                            }
                            if (!(avatarStore.A01 instanceof C126475ni)) {
                                C14360o3.A0B(userSession3, 0);
                                if (C18U.A06(C06090Tz.A05, userSession3, 36325278612337632L)) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }

            public static final boolean A02(UserSession userSession2, C41181vS c41181vS) {
                if (C6Wk.A00(userSession2, c41181vS) && !C21B.A00(userSession2).A00.getBoolean("key_has_seen_avatar_mention_sticker_tooltip_v4", false)) {
                    return true;
                }
                return false;
            }
        });
        hashMap.put(EnumC148806mp.A0Y, new Object());
        hashMap.put(EnumC148806mp.A0O, new Object());
        hashMap.put(EnumC148806mp.A0Q, new Object());
        hashMap.put(EnumC148806mp.A0U, new Object());
        hashMap.put(EnumC148806mp.A08, new InterfaceC148826mr(c3g2) { // from class: X.6nI
            public final C3G2 A00;

            @Override // X.InterfaceC148826mr
            public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                C140436Wx c140436Wx;
                C139566Tl c139566Tl;
                C14360o3.A0B(interfaceC143576dw, 0);
                if (!(interfaceC143576dw instanceof C140436Wx) || (c140436Wx = (C140436Wx) interfaceC143576dw) == null || (c139566Tl = c140436Wx.A0Y) == null) {
                    return null;
                }
                return c139566Tl.A05;
            }

            @Override // X.InterfaceC148826mr
            public final C207559Gj C9L(UserSession userSession2, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                return null;
            }

            @Override // X.InterfaceC148826mr
            public final C5ST C9O(Context context2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(context2, 1);
                String string = context2.getString(2131966010);
                C14360o3.A07(string);
                return new C149686oL(string);
            }

            @Override // X.InterfaceC148826mr
            public final void Dtu(Context context2, InterfaceC11380iw interfaceC11380iw2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(userSession2, 0);
                InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession2).A01;
                int i = interfaceC19630xq.getInt("boosted_story_mention_settings_tooltip_impression_count", 0) + 1;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7D("boosted_story_mention_settings_tooltip_impression_count", i);
                ARD.apply();
            }

            @Override // X.InterfaceC148826mr
            public final boolean Ejo(UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
                C140436Wx c140436Wx;
                C139566Tl c139566Tl;
                C14360o3.A0B(userSession2, 0);
                C14360o3.A0B(c41181vS, 1);
                C14360o3.A0B(interfaceC143576dw, 3);
                View view = null;
                if ((interfaceC143576dw instanceof C140436Wx) && (c140436Wx = (C140436Wx) interfaceC143576dw) != null && (c139566Tl = c140436Wx.A0Y) != null) {
                    view = c139566Tl.A05;
                }
                if (AbstractC23021Ah.A00(userSession2).A01.getInt("boosted_story_mention_settings_tooltip_impression_count", 0) < 100 && view != null) {
                    C38321qM c38321qM = c41181vS.A0b;
                    boolean z = false;
                    if (this.A00 == C3G2.A05) {
                        z = true;
                    }
                    if (C6PZ.A04(userSession2, c38321qM, z)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC148826mr
            public final EnumC58132lV C9M() {
                return EnumC58132lV.A03;
            }

            {
                this.A00 = c3g2;
            }
        });
        hashMap.put(EnumC148806mp.A0V, new Object());
        hashMap.put(EnumC148806mp.A07, new InterfaceC148826mr(c3g2) { // from class: X.6nK
            public final C3G2 A00;

            @Override // X.InterfaceC148826mr
            public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                C140436Wx c140436Wx;
                C139566Tl c139566Tl;
                C14360o3.A0B(interfaceC143576dw, 0);
                if (!(interfaceC143576dw instanceof C140436Wx) || (c140436Wx = (C140436Wx) interfaceC143576dw) == null || (c139566Tl = c140436Wx.A0Y) == null) {
                    return null;
                }
                return c139566Tl.A05;
            }

            @Override // X.InterfaceC148826mr
            public final C207559Gj C9L(UserSession userSession2, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
                return null;
            }

            @Override // X.InterfaceC148826mr
            public final C5ST C9O(Context context2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(context2, 1);
                String string = context2.getString(2131966024);
                C14360o3.A07(string);
                return new C149686oL(string);
            }

            @Override // X.InterfaceC148826mr
            public final void Dtu(Context context2, InterfaceC11380iw interfaceC11380iw2, UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4) {
            }

            @Override // X.InterfaceC148826mr
            public final boolean Ejo(UserSession userSession2, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
                C140436Wx c140436Wx;
                C14360o3.A0B(userSession2, 0);
                C14360o3.A0B(c41181vS, 1);
                C14360o3.A0B(interfaceC143576dw, 3);
                if ((interfaceC143576dw instanceof C140436Wx) && (c140436Wx = (C140436Wx) interfaceC143576dw) != null && c140436Wx.A0Y != null) {
                    C38321qM c38321qM = c41181vS.A0b;
                    boolean z = false;
                    if (this.A00 == C3G2.A04) {
                        z = true;
                    }
                    if (c38321qM != null && c38321qM.CdW() && z && C18U.A06(C06090Tz.A05, userSession2, 36323882747113130L)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC148826mr
            public final EnumC58132lV C9M() {
                return EnumC58132lV.A03;
            }

            {
                this.A00 = c3g2;
            }
        });
        hashMap.put(EnumC148806mp.A02, new Object());
    }

    public static void A00(ViewGroup viewGroup, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, InterfaceC148826mr interfaceC148826mr, C148796mo c148796mo) {
        View C9K = interfaceC148826mr.C9K(c41181vS, interfaceC143576dw);
        if (C9K == null) {
            C207559Gj C9L = interfaceC148826mr.C9L(c148796mo.A04, c41181vS, interfaceC143576dw);
            if (C9L != null) {
                C9K = C9L.A01;
            } else {
                return;
            }
        }
        M7G m7g = new M7G(C9K.getContext(), C9K, viewGroup, c41181vS, c41551w4, interfaceC143576dw, interfaceC148826mr, c148796mo);
        c148796mo.A02 = m7g;
        C9K.post(m7g);
    }
}
