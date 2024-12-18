package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6iX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146346iX implements InterfaceC61522rF {
    public C146786jG A00;
    public final UserSession A01;
    public final C57112jm A02;
    public final C63622uj A03;
    public final InterfaceC60442pS A04;
    public final C146786jG A05;
    public final C146796jH A06;
    public final C146756jD A07;
    public final List A08;
    public final java.util.Set A09;

    public C146346iX(final Context context, final FragmentActivity fragmentActivity, final C141526aV c141526aV, UserSession userSession, C57112jm c57112jm, final InterfaceC146336iW interfaceC146336iW, final C145796hc c145796hc, final C145826hf c145826hf, final C146306iT c146306iT, final C146316iU c146316iU) {
        C14360o3.A0B(c57112jm, 3);
        C14360o3.A0B(c145796hc, 4);
        C14360o3.A0B(c145826hf, 7);
        C14360o3.A0B(userSession, 8);
        C14360o3.A0B(interfaceC146336iW, 9);
        C41661wG A00 = C41661wG.A00(c146306iT.A01);
        C14360o3.A07(A00);
        ArrayList A01 = AbstractC92144Au.A01(new InterfaceC146366iZ(context, c146306iT) { // from class: X.6iY
            public final InterfaceC60442pS A00;
            public final C146406id A01;
            public final C146406id A02;
            public final boolean A03;
            public final boolean A04;

            @Override // X.InterfaceC146366iZ
            public final void ABi(C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
            }

            @Override // X.InterfaceC146366iZ
            public final void ABk(C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(c59072n8, 2);
                if (this.A03) {
                    c59072n8.A00(this.A01);
                }
            }

            @Override // X.InterfaceC146366iZ
            public final void ABn(View view, C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
                C146406id c146406id;
                C14360o3.A0B(c41181vS, 1);
                C14360o3.A0B(c59072n8, 3);
                if (this.A04 && AbstractC75423a9.A02(c41181vS, this.A00)) {
                    c146406id = this.A02;
                } else if (!this.A03) {
                    return;
                } else {
                    c146406id = this.A01;
                }
                c59072n8.A00(c146406id);
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x004b, code lost:
            
                if (r1 != false) goto L6;
             */
            /* JADX WARN: Type inference failed for: r0v10, types: [X.6id] */
            /* JADX WARN: Type inference failed for: r0v11, types: [X.6id] */
            {
                /*
                    r18 = this;
                    r2 = r18
                    r2.<init>()
                    r3 = r20
                    com.instagram.common.session.UserSession r10 = r3.A01
                    int r1 = X.AbstractC28081Xm.A00(r10)
                    java.lang.String r0 = "stories_impression_store"
                    X.6bT r5 = new X.6bT
                    r4 = r19
                    r5.<init>(r4, r10, r0, r1)
                    java.lang.Class<X.6bT> r4 = X.C142106bT.class
                    r1 = 47
                    X.9EO r0 = new X.9EO
                    r0.<init>(r5, r1)
                    java.lang.Object r14 = r10.A01(r4, r0)
                    X.1Xn r14 = (X.C28091Xn) r14
                    X.0xH r0 = X.AbstractC11060iN.A00(r10)
                    r5 = 0
                    X.2vU r4 = new X.2vU
                    r4.<init>(r0, r5)
                    X.0Tz r8 = X.C06090Tz.A05
                    r0 = 36313424502130662(0x8102de000707e6, double:3.028094105346717E-306)
                    boolean r9 = X.C18U.A06(r8, r10, r0)
                    X.0Tz r7 = X.C06090Tz.A06
                    r0 = 36313424501737440(0x8102de000107e0, double:3.028094105098042E-306)
                    boolean r0 = X.C18U.A06(r7, r10, r0)
                    r6 = 1
                    r1 = r0 ^ 1
                    if (r9 != 0) goto L4d
                    r0 = 0
                    if (r1 == 0) goto L4e
                L4d:
                    r0 = 1
                L4e:
                    r2.A03 = r0
                    r0 = 36313424502458347(0x8102de000c07eb, double:3.028094105553946E-306)
                    boolean r0 = X.C18U.A06(r8, r10, r0)
                    if (r0 != 0) goto L67
                    r0 = 36313424502327273(0x8102de000a07e9, double:3.0280941054710545E-306)
                    boolean r0 = X.C18U.A06(r7, r10, r0)
                    if (r0 == 0) goto L67
                    r6 = 0
                L67:
                    r2.A04 = r6
                    X.2pS r11 = r3.A02
                    X.3G2 r12 = r3.A03
                    X.C14360o3.A0B(r14, r5)
                    X.1M1 r13 = r3.A06
                    java.lang.String r15 = r3.A08
                    java.lang.String r3 = r3.A07
                    r2.A00 = r11
                    java.lang.String r16 = "instagram_organic_vpvd_imp"
                    X.6ib r9 = new X.6ib
                    r17 = r3
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                    X.6bU r1 = new X.6bU
                    r1.<init>(r9)
                    X.6id r0 = new X.6id
                    r0.<init>(r1, r4)
                    r2.A01 = r0
                    java.lang.String r16 = "instagram_ad_vpvd_imp"
                    X.6ib r9 = new X.6ib
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                    X.6bU r1 = new X.6bU
                    r1.<init>(r9)
                    X.6id r0 = new X.6id
                    r0.<init>(r1, r4)
                    r2.A02 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C146356iY.<init>(android.content.Context, X.6iT):void");
            }
        }, new InterfaceC146366iZ(context, fragmentActivity, c141526aV, c145796hc, c145826hf, c146306iT) { // from class: X.6ie
            public C39168HLw A00;
            public C146586iv A01;
            public C146576iu A02;
            public final UserSession A03;
            public final InterfaceC60442pS A04;
            public final boolean A05;
            public final C146536iq A06;
            public final C146306iT A07;
            public final C146436ig A08;
            public final C146426if A09;
            public final C146496im A0A;
            public final C146456ii A0B;
            public final C146476ik A0C;
            public final C146556is A0D;
            public final C146516io A0E;
            public final C146546ir A0F;
            public final C146446ih A0G;
            public final boolean A0H;
            public final boolean A0I;

            @Override // X.InterfaceC146366iZ
            public final void ABi(C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(c59072n8, 2);
                c59072n8.A00(this.A09);
                c59072n8.A00(this.A0A);
                if (c59072n82 != null) {
                    c59072n82.A00(this.A08);
                }
                C146586iv c146586iv = this.A01;
                if (c146586iv != null && this.A0I) {
                    c59072n8.A00(c146586iv);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x0024, code lost:
            
                if (X.AbstractC75423a9.A01(r8, r5.A04) == false) goto L7;
             */
            @Override // X.InterfaceC146366iZ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ABk(X.C59072n8 r6, X.C59072n8 r7, X.C41181vS r8, X.C41551w4 r9) {
                /*
                    r5 = this;
                    r0 = 0
                    X.C14360o3.A0B(r8, r0)
                    r0 = 2
                    X.C14360o3.A0B(r6, r0)
                    com.instagram.common.session.UserSession r3 = r5.A03
                    X.0Tz r4 = X.C06090Tz.A05
                    r0 = 36313424502065125(0x8102de000607e5, double:3.028094105305271E-306)
                    boolean r1 = X.C18U.A06(r4, r3, r0)
                    boolean r2 = r5.A05
                    r0 = r2 ^ 1
                    if (r1 != 0) goto L1d
                    if (r0 == 0) goto L26
                L1d:
                    X.2pS r0 = r5.A04
                    boolean r0 = X.AbstractC75423a9.A01(r8, r0)
                    r1 = 1
                    if (r0 != 0) goto L27
                L26:
                    r1 = 0
                L27:
                    boolean r0 = r8.A18()
                    if (r0 == 0) goto L5b
                    if (r1 == 0) goto L3f
                    r0 = 36312793141478659(0x81024b00000503, double:3.027694830328105E-306)
                    boolean r0 = X.C18U.A06(r4, r3, r0)
                    if (r0 == 0) goto L3f
                L3a:
                    X.6ii r0 = r5.A0B
                    r6.A00(r0)
                L3f:
                    X.3Fw r0 = X.AbstractC70833Fv.A00(r3)
                    boolean r0 = r0.A02(r8)
                    if (r0 != 0) goto L5a
                    X.2pS r0 = r5.A04
                    boolean r0 = X.AbstractC75423a9.A01(r8, r0)
                    if (r0 == 0) goto L5a
                    X.6iu r0 = r5.A02
                    if (r0 == 0) goto L5a
                    if (r2 == 0) goto L5a
                    r6.A00(r0)
                L5a:
                    return
                L5b:
                    if (r1 == 0) goto L3f
                    goto L3a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C146416ie.ABk(X.2n8, X.2n8, X.1vS, X.1w4):void");
            }

            @Override // X.InterfaceC146366iZ
            public final void ABn(View view, C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
                InterfaceC39271s5 interfaceC39271s5;
                InterfaceC39541sb injected;
                int i;
                InterfaceC43071ya interfaceC43071ya;
                C14360o3.A0B(view, 0);
                C14360o3.A0B(c41181vS, 1);
                C14360o3.A0B(c41551w4, 2);
                C14360o3.A0B(c59072n8, 3);
                UserSession userSession2 = this.A03;
                boolean A06 = C18U.A06(C06090Tz.A05, userSession2, 36313424502392810L);
                boolean z = this.A0H;
                boolean z2 = true;
                boolean z3 = !z;
                if ((!A06 && !z3) || !AbstractC75423a9.A02(c41181vS, this.A04)) {
                    z2 = false;
                }
                c59072n8.A00(this.A09);
                if (z2) {
                    c59072n8.A00(this.A0C);
                }
                InterfaceC60442pS interfaceC60442pS = this.A04;
                if (AbstractC75423a9.A02(c41181vS, interfaceC60442pS) && (interfaceC43071ya = this.A00) != null && z) {
                    c59072n8.A00(interfaceC43071ya);
                }
                C146546ir c146546ir = this.A0F;
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    if (c38321qM.A6E()) {
                        i = R.id.sponsored_reel_showreel_native_view;
                    } else if (c38321qM.A6D()) {
                        i = R.id.sponsored_reel_showreel_composition_view;
                    }
                    View findViewById = view.findViewById(i);
                    if (findViewById != null) {
                        Map map = c146546ir.A01;
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            if (findViewById.equals(entry.getValue())) {
                                map.remove(key);
                            }
                        }
                        map.put(c41181vS, findViewById);
                    }
                }
                c59072n8.A00(c146546ir);
                if (c59072n82 != null) {
                    c59072n82.A00(this.A08);
                    if (AbstractC75423a9.A02(c41551w4.A0H, interfaceC60442pS) && this.A07.A03 != C3G2.A1P) {
                        c59072n82.A00(this.A0E);
                        if (AbstractC130925vf.A0n(c41551w4)) {
                            c59072n82.A00(this.A06);
                        }
                    }
                    if (c38321qM != null && (injected = c38321qM.A0C.getInjected()) != null) {
                        interfaceC39271s5 = injected.AaR();
                    } else {
                        interfaceC39271s5 = null;
                    }
                    if (AbstractC129385t0.A02(interfaceC39271s5, userSession2, false)) {
                        c59072n82.A00(this.A0G);
                    }
                }
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.6if] */
            /* JADX WARN: Type inference failed for: r0v1, types: [X.6ig] */
            /* JADX WARN: Type inference failed for: r0v10, types: [X.6ii] */
            /* JADX WARN: Type inference failed for: r0v11, types: [X.6ik] */
            /* JADX WARN: Type inference failed for: r0v12, types: [X.6im] */
            /* JADX WARN: Type inference failed for: r0v13, types: [X.6io] */
            /* JADX WARN: Type inference failed for: r0v14, types: [X.6iq] */
            /* JADX WARN: Type inference failed for: r0v16, types: [X.6is] */
            /* JADX WARN: Type inference failed for: r0v21, types: [X.6iu] */
            /* JADX WARN: Type inference failed for: r0v5, types: [X.6ih] */
            /* JADX WARN: Type inference failed for: r14v1, types: [X.2uS, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r21v2, types: [X.2uS, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v1, types: [X.6iv] */
            {
                this.A07 = c146306iT;
                this.A09 = new InterfaceC43071ya(c145796hc) { // from class: X.6if
                    public final C145796hc A00;

                    @Override // X.InterfaceC43071ya
                    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                        C14360o3.A0B(c59062n7, 0);
                        C14360o3.A0B(interfaceC57162jr, 1);
                        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
                            C145796hc c145796hc2 = this.A00;
                            Object obj = c59062n7.A03;
                            C14360o3.A06(obj);
                            c145796hc2.A02((C41181vS) obj, ((C149716oO) c59062n7.A04).A02.A0I);
                        }
                    }

                    {
                        this.A00 = c145796hc;
                    }
                };
                final UserSession userSession2 = c146306iT.A01;
                this.A08 = new InterfaceC43071ya(userSession2, c145796hc) { // from class: X.6ig
                    public final UserSession A00;
                    public final C145796hc A01;

                    @Override // X.InterfaceC43071ya
                    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                        C14360o3.A0B(c59062n7, 0);
                        C14360o3.A0B(interfaceC57162jr, 1);
                        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
                            C145796hc c145796hc2 = this.A01;
                            UserSession userSession3 = this.A00;
                            C149726oP c149726oP = (C149726oP) c59062n7.A04;
                            c145796hc2.A01(userSession3, ((C41551w4) c59062n7.A03).A0H, c149726oP.A01, c149726oP.A00);
                        }
                    }

                    {
                        this.A00 = userSession2;
                        this.A01 = c145796hc;
                    }
                };
                this.A03 = userSession2;
                boolean A06 = C18U.A06(C06090Tz.A06, userSession2, 36313424502327273L);
                this.A0H = A06;
                C06090Tz c06090Tz = C06090Tz.A05;
                boolean A062 = C18U.A06(c06090Tz, userSession2, 36313424501737440L);
                this.A05 = A062;
                boolean A063 = C18U.A06(c06090Tz, userSession2, 36318883405110005L);
                this.A0I = A063;
                this.A0G = new InterfaceC43071ya(context, c141526aV, userSession2) { // from class: X.6ih
                    public final C25671My A00;
                    public final Context A01;
                    public final C141526aV A02;
                    public final UserSession A03;

                    @Override // X.InterfaceC43071ya
                    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                        InterfaceC39271s5 interfaceC39271s5;
                        C40971v4 c40971v4;
                        String str;
                        Integer num;
                        InterfaceC39541sb injected;
                        C14360o3.A0B(c59062n7, 0);
                        C14360o3.A0B(interfaceC57162jr, 1);
                        C149726oP c149726oP = (C149726oP) c59062n7.A04;
                        C38321qM c38321qM = c149726oP.A01.A0b;
                        if (c38321qM != null && (injected = c38321qM.A0C.getInjected()) != null) {
                            interfaceC39271s5 = injected.AaR();
                        } else {
                            interfaceC39271s5 = null;
                        }
                        Object obj = c59062n7.A03;
                        C41551w4 c41551w4 = (C41551w4) obj;
                        UserSession userSession3 = this.A03;
                        C41181vS A08 = c41551w4.A08(userSession3);
                        C141526aV c141526aV2 = this.A02;
                        if (c141526aV2 != null) {
                            AtomicBoolean atomicBoolean = c141526aV2.A08;
                            if (atomicBoolean.get() && c141526aV2.A02 == null) {
                                return;
                            }
                            Context context2 = this.A01;
                            C14360o3.A06(obj);
                            if (!AbstractC130925vf.A09(context2, userSession3, A08, c41551w4)) {
                                return;
                            }
                            UserSession userSession4 = c141526aV2.A06;
                            if (!AbstractC129385t0.A02(interfaceC39271s5, userSession4, true) || (c40971v4 = A08.A0g) == null || (str = c40971v4.A0S) == null) {
                                return;
                            }
                            long j = c149726oP.A00;
                            if (!atomicBoolean.get()) {
                                C141596ac c141596ac = c149726oP.A03;
                                if (c141596ac.A0R == null) {
                                    c141596ac.A0R = new OIq(C05F.A00, str);
                                    c141526aV2.A02 = c141596ac;
                                }
                            }
                            OIq oIq = c149726oP.A03.A0R;
                            if (oIq == null) {
                                return;
                            }
                            int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                            if (intValue != 0) {
                                if (intValue != 1) {
                                    C141526aV.A00(c141526aV2);
                                    oIq.A00 = 0L;
                                    InterfaceC41501vz interfaceC41501vz = c141526aV2.A01;
                                    if (interfaceC41501vz != null) {
                                        AbstractC25651Mw.A00(userSession4).A02(interfaceC41501vz, C42237InN.class);
                                    }
                                    c141526aV2.A01 = null;
                                    return;
                                }
                                boolean z = atomicBoolean.get();
                                long uptimeMillis = SystemClock.uptimeMillis();
                                long j2 = oIq.A00;
                                long j3 = 0;
                                if (j2 != 0) {
                                    j3 = uptimeMillis - j2;
                                }
                                oIq.A00 = uptimeMillis;
                                long j4 = oIq.A01 + j3;
                                oIq.A01 = j4;
                                long j5 = c141526aV2.A04;
                                if (oIq.A02.intValue() == 0 && j4 >= j5 && atomicBoolean.compareAndSet(false, true)) {
                                    oIq.A02 = C05F.A01;
                                }
                                if (!z && atomicBoolean.get()) {
                                    H8N h8n = new H8N(c141526aV2.A05, userSession4, A08, c141526aV2.A07, j);
                                    c141526aV2.A00 = h8n;
                                    h8n.Ck6();
                                }
                                num = oIq.A02;
                            } else {
                                oIq.A01 = 0L;
                                num = oIq.A02;
                                c141526aV2.A03 = num;
                                long uptimeMillis2 = SystemClock.uptimeMillis();
                                long j6 = oIq.A00;
                                long j7 = 0;
                                if (j6 != 0) {
                                    j7 = uptimeMillis2 - j6;
                                }
                                oIq.A00 = uptimeMillis2;
                                oIq.A01 = j7;
                            }
                            if (num.intValue() != 1) {
                                return;
                            }
                            this.A00.E4s(new C42237InN(str));
                        }
                    }

                    {
                        this.A02 = c141526aV;
                        this.A03 = userSession2;
                        this.A01 = context;
                        this.A00 = AbstractC25651Mw.A00(userSession2);
                    }
                };
                final C1BX c1bx = AbstractC62712tA.A00(userSession2).A00.A00;
                C14360o3.A07(c1bx);
                final C1BX c1bx2 = AbstractC62712tA.A00(userSession2).A00.A01;
                C14360o3.A07(c1bx2);
                final C34E A002 = C34C.A00(userSession2);
                this.A0B = new AbstractC64162vb(c1bx, c146306iT) { // from class: X.6ii
                    public final C18920wW A00;
                    public final UserSession A01;
                    public final InterfaceC60442pS A02;
                    public final C146306iT A03;

                    {
                        InterfaceC62702t9 interfaceC62702t9 = new InterfaceC62702t9() { // from class: X.6ij
                            @Override // X.InterfaceC62702t9
                            public final String BKe(C59062n7 c59062n7) {
                                C14360o3.A0B(c59062n7, 0);
                                String str = ((C41181vS) c59062n7.A03).A0j;
                                C14360o3.A07(str);
                                return str;
                            }
                        };
                        InterfaceC60442pS interfaceC60442pS = c146306iT.A02;
                        this.A02 = interfaceC60442pS;
                        UserSession userSession3 = c146306iT.A01;
                        this.A01 = userSession3;
                        this.A03 = c146306iT;
                        this.A00 = AbstractC12220kQ.A00(interfaceC60442pS, C12180kM.A03, userSession3);
                    }

                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
                        JML Bns;
                        String Bnr;
                        C41181vS c41181vS = (C41181vS) obj;
                        C149716oO c149716oO = (C149716oO) obj2;
                        C14360o3.A0B(c41181vS, 0);
                        C14360o3.A0B(c149716oO, 1);
                        UserSession userSession3 = this.A01;
                        Boolean valueOf = Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession3, 36311985687757652L));
                        InterfaceC60442pS interfaceC60442pS = this.A02;
                        C146306iT c146306iT2 = this.A03;
                        C138356Or A003 = AbstractC138346Oq.A00(interfaceC60442pS, c149716oO.A00.A0H, c146306iT2.A03);
                        C18920wW c18920wW = this.A00;
                        InterfaceC02590Ai A004 = c18920wW.A00(c18920wW.A00, "instagram_organic_impression");
                        if (A004.isSampled()) {
                            C82713mZ A02 = AbstractC37955Gmx.A02(userSession3, A003, c41181vS, "impression");
                            A02.A02();
                            A02.A1g = Boolean.valueOf(C18U.A06(C06090Tz.A06, userSession3, 36313424501737440L));
                            A02.A1w = valueOf;
                            C3R6.A08(A02, c41181vS, c149716oO, c146306iT2);
                            C11520jB A012 = A02.A01();
                            A004.A7v("is_from_merlin_infra", false);
                            A004.AAP("reel_id", (String) A012.A01(C5I8.A7W));
                            A004.A9K("session_reel_counter", (Long) A012.A01(C5I8.A84));
                            A004.A9K("reel_size", (Long) A012.A01(C5I8.A7Y));
                            A004.A9K("reel_start_position", (Long) A012.A01(C5I8.A7Z));
                            A004.A9K("reel_position", (Long) A012.A01(C5I8.A7X));
                            A004.AAP("reel_type", (String) A012.A01(C5I8.A7b));
                            A004.A9K("reel_viewer_position", (Long) A012.A01(C5I8.A7e));
                            A004.A9K("carousel_opt_in_position", (Long) A012.A01(C5I8.A14));
                            A004.A7v("is_video_to_carousel", (Boolean) A012.A01(C5I8.A51));
                            A004.A9K("tray_position", (Long) A012.A01(C5I8.A9V));
                            A004.AAP("tray_session_id", (String) A012.A01(C5I8.A7a));
                            A004.AAP("viewer_session_id", (String) A012.A01(C5I8.A9o));
                            A004.AAP("story_ranking_token", (String) A012.A01(C5I8.A8U));
                            A004.A9K("is_dark_mode", (Long) A012.A01(C5I8.A4C));
                            A004.AAP("shopping_session_id", (String) A012.A01(C5I8.A86));
                            A004.A9K("a_pk", (Long) A012.A01(C5I8.A0Z));
                            A004.AAP("m_pk", c41181vS.A0j);
                            A004.A9K("m_t", (Long) A012.A01(C5I8.A5c));
                            A004.A8I("time_elapsed", (Double) A012.A01(C5I8.A95));
                            A004.A7v("has_stories_reshare_view_shop_cta", (Boolean) A012.A01(C5I8.A3T));
                            if (((Number) A012.A01(C5I8.A20)) != null) {
                                A004.A9K("dark_mode_state", Long.valueOf(r0.intValue()));
                            }
                            Long l = (Long) A012.A01(C5I8.A2P);
                            if (l != null) {
                                A004.A9K("effect_id", l);
                            }
                            if (valueOf != null) {
                                A004.A7v("is_second_channel_enabled", valueOf);
                            }
                            C38321qM c38321qM = c41181vS.A0b;
                            if (c38321qM != null && (Bns = c38321qM.A0C.Bns()) != null && (Bnr = Bns.Bnr()) != null) {
                                A004.A9K("repost_id", AbstractC003100w.A0k(10, Bnr));
                            }
                            String str = (String) A012.A01(C5I8.A7m);
                            if (str != null && str.length() > 0) {
                                A004.A9K("merchant_id", Long.valueOf(Long.parseLong(str)));
                            }
                            A004.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                            A004.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                            A004.AAP("device_fold_orientation", AbstractC82673mV.A00);
                            A004.AAP("device_fold_state", AbstractC82683mW.A00);
                            A004.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                            A004.Cht();
                        }
                    }

                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
                        JML Bns;
                        String Bnr;
                        C41181vS c41181vS = (C41181vS) obj;
                        C149716oO c149716oO = (C149716oO) obj2;
                        C14360o3.A0B(c41181vS, 0);
                        C14360o3.A0B(c149716oO, 1);
                        InterfaceC60442pS interfaceC60442pS = this.A02;
                        C146306iT c146306iT2 = this.A03;
                        C138356Or A003 = AbstractC138346Oq.A00(interfaceC60442pS, c149716oO.A00.A0H, c146306iT2.A03);
                        C18920wW c18920wW = this.A00;
                        InterfaceC02590Ai A004 = c18920wW.A00(c18920wW.A00, "instagram_organic_sub_impression");
                        if (A004.isSampled()) {
                            UserSession userSession3 = this.A01;
                            C82713mZ A02 = AbstractC37955Gmx.A02(userSession3, A003, c41181vS, "sub_impression");
                            A02.A02();
                            A02.A1g = Boolean.valueOf(C18U.A06(C06090Tz.A06, userSession3, 36313424501737440L));
                            A02.A1w = null;
                            C3R6.A08(A02, c41181vS, c149716oO, c146306iT2);
                            C11520jB A012 = A02.A01();
                            A004.AAP("reel_id", (String) A012.A01(C5I8.A7W));
                            A004.A9K("session_reel_counter", (Long) A012.A01(C5I8.A84));
                            A004.A9K("reel_size", (Long) A012.A01(C5I8.A7Y));
                            A004.A9K("reel_start_position", (Long) A012.A01(C5I8.A7Z));
                            A004.A9K("reel_position", (Long) A012.A01(C5I8.A7X));
                            A004.AAP("reel_type", (String) A012.A01(C5I8.A7b));
                            A004.A9K("reel_viewer_position", (Long) A012.A01(C5I8.A7e));
                            A004.A9K("carousel_opt_in_position", (Long) A012.A01(C5I8.A14));
                            A004.A7v("is_video_to_carousel", (Boolean) A012.A01(C5I8.A51));
                            A004.A9K("tray_position", (Long) A012.A01(C5I8.A9V));
                            A004.AAP("tray_session_id", (String) A012.A01(C5I8.A7a));
                            A004.AAP("viewer_session_id", (String) A012.A01(C5I8.A9o));
                            A004.AAP("story_ranking_token", (String) A012.A01(C5I8.A8U));
                            A004.A9K("is_dark_mode", (Long) A012.A01(C5I8.A4C));
                            A004.AAP("shopping_session_id", (String) A012.A01(C5I8.A86));
                            A004.A9K("a_pk", (Long) A012.A01(C5I8.A0Z));
                            A004.AAP("m_pk", c41181vS.A0j);
                            A004.A9K("m_t", (Long) A012.A01(C5I8.A5c));
                            A004.A8I("time_elapsed", (Double) A012.A01(C5I8.A95));
                            A004.A7v("has_stories_reshare_view_shop_cta", (Boolean) A012.A01(C5I8.A3T));
                            if (((Number) A012.A01(C5I8.A20)) != null) {
                                A004.A9K("dark_mode_state", Long.valueOf(r0.intValue()));
                            }
                            Long l = (Long) A012.A01(C5I8.A2P);
                            if (l != null) {
                                A004.A9K("effect_id", l);
                            }
                            C38321qM c38321qM = c41181vS.A0b;
                            if (c38321qM != null && (Bns = c38321qM.A0C.Bns()) != null && (Bnr = Bns.Bnr()) != null) {
                                A004.A9K("repost_id", AbstractC003100w.A0k(10, Bnr));
                            }
                            String str = (String) A012.A01(C5I8.A7m);
                            if (str != null && str.length() > 0) {
                                A004.AAK(C4SX.A00(str), "merchant_id");
                            }
                            A004.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                            A004.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                            A004.AAP("device_fold_orientation", AbstractC82673mV.A00);
                            A004.AAP("device_fold_state", AbstractC82683mW.A00);
                            A004.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                            A004.Cht();
                        }
                    }
                };
                final C145816he c145816he = c145826hf.A01;
                this.A0C = new AbstractC64162vb(context, c1bx2, c145816he, c145796hc, c146306iT, A002) { // from class: X.6ik
                    public final Context A00;
                    public final UserSession A01;
                    public final C145816he A02;
                    public final InterfaceC60442pS A03;
                    public final C145796hc A04;
                    public final C146306iT A05;
                    public final C34E A06;

                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        /*
                            r3 = this;
                            X.6bS r2 = r8.A04
                            com.instagram.common.session.UserSession r1 = r8.A01
                            X.6il r0 = new X.6il
                            r0.<init>()
                            r3.<init>(r5, r0)
                            r3.A00 = r4
                            r3.A05 = r8
                            r3.A04 = r7
                            r3.A06 = r9
                            r3.A02 = r6
                            X.2pS r0 = r8.A02
                            r3.A03 = r0
                            r3.A01 = r1
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C146476ik.<init>(android.content.Context, X.1BX, X.6he, X.6hc, X.6iT, X.34E):void");
                    }

                    private final void A00(C41181vS c41181vS, C149716oO c149716oO, Boolean bool, String str) {
                        UserSession userSession3 = this.A01;
                        String A0V = c41181vS.A0V(userSession3);
                        if (A0V != null) {
                            this.A06.EI6(EnumC64262vl.A05, AnonymousClass317.A0M, EnumC64222vh.A09, A0V);
                        }
                        InterfaceC60442pS interfaceC60442pS = this.A03;
                        C146306iT c146306iT2 = this.A05;
                        C3G2 c3g2 = c146306iT2.A03;
                        C41551w4 c41551w4 = c149716oO.A00;
                        C138356Or A003 = AbstractC138346Oq.A00(interfaceC60442pS, c41551w4.A0H, c3g2);
                        C82713mZ A02 = AbstractC37955Gmx.A02(userSession3, A003, c41181vS, str);
                        A02.A02();
                        A02.A1w = bool;
                        String str2 = C1QM.A00.A02.A00;
                        if (str2 != null) {
                            A02.A6C = str2;
                        }
                        C38321qM c38321qM = c41181vS.A0b;
                        if (c38321qM != null) {
                            A02.A8J = AbstractC41071vF.A0R(userSession3, c38321qM);
                        }
                        A02.A1g = Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession3, 36313424502327273L));
                        C3R6.A08(A02, c41181vS, c149716oO, c146306iT2);
                        C3R6 c3r6 = C3R6.A00;
                        C145796hc c145796hc2 = this.A04;
                        String str3 = c41181vS.A0k;
                        C14360o3.A07(str3);
                        c3r6.A0B(this.A00, A02, c41181vS, (C6YY) c145796hc2.A05.get(str3), c149716oO, c146306iT2);
                        A02.A7b = AbstractC139736Uc.A00(userSession3, c41181vS, c41551w4, c3g2, c149716oO.A02);
                        C32U.A0A(userSession3, A02, c41181vS.A09());
                        if (AbstractC61652rS.A02(userSession3)) {
                            A02.A4d = AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession3)).toString();
                            A02.A4e = AbstractC61652rS.A00(userSession3).toString();
                        }
                        C674732m c674732m = new C674732m(userSession3);
                        if (c674732m.A04()) {
                            A02.A1P = Boolean.valueOf(c674732m.A05(c38321qM));
                            A02.A1t = Boolean.valueOf(c674732m.A07(c38321qM));
                        }
                        C32U.A0I(userSession3, A02, A003, C05F.A01);
                    }

                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
                        EnumC906041v enumC906041v;
                        C145816he c145816he2;
                        Long l;
                        long j;
                        String str;
                        Long l2;
                        Integer num;
                        Long l3;
                        String str2;
                        String str3;
                        String str4;
                        Integer num2;
                        String str5;
                        C41181vS c41181vS = (C41181vS) obj;
                        C149716oO c149716oO = (C149716oO) obj2;
                        C14360o3.A0B(c41181vS, 0);
                        C14360o3.A0B(c149716oO, 1);
                        UserSession userSession3 = this.A01;
                        Boolean valueOf = Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession3, 36311985687888726L));
                        C38321qM c38321qM = c41181vS.A0b;
                        AndroidLink A02 = AbstractC905941u.A02(this.A00, userSession3, c38321qM, 0, false);
                        if (A02 != null) {
                            enumC906041v = AbstractC114965Hm.A01(A02);
                        } else {
                            enumC906041v = null;
                        }
                        if (enumC906041v == EnumC906041v.AD_DESTINATION_DIRECT_MESSAGE) {
                            C5M8.A06("STORIES_AD_IMPRESSION", userSession3, c38321qM);
                        }
                        A00(c41181vS, c149716oO, valueOf, "impression");
                        if (c38321qM != null) {
                            C5MH.A00(userSession3).A03(c38321qM, c41181vS.A0V(userSession3));
                            String A07 = AbstractC41071vF.A07(userSession3, c38321qM);
                            C5MJ A003 = C5MJ.A03.A00(userSession3, c38321qM, A07);
                            if (A003 != null) {
                                A003.A00(c38321qM, A07);
                            }
                        }
                        C41551w4 c41551w4 = c149716oO.A00;
                        if (AbstractC130925vf.A0n(c41551w4) && (c145816he2 = this.A02) != null) {
                            UserSession userSession4 = c145816he2.A03;
                            InterfaceC11380iw interfaceC11380iw = c145816he2.A01;
                            C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession4);
                            InterfaceC02590Ai A004 = A012.A00(A012.A00, "instagram_ad_pivots_carousel_impression");
                            c38321qM.getClass();
                            String A072 = AbstractC41071vF.A07(userSession4, c38321qM);
                            Boolean bool = null;
                            if (A072 != null) {
                                l = AbstractC003100w.A0k(10, A072);
                            } else {
                                l = null;
                            }
                            if (A004.isSampled() && l != null) {
                                A004.A9K("ad_id", l);
                                InterfaceC101944i9 interfaceC101944i9 = c145816he2.A00;
                                if (interfaceC101944i9 != null) {
                                    j = interfaceC101944i9.CNR(c41551w4);
                                } else {
                                    j = 0;
                                }
                                A004.A9K("chaining_position", Long.valueOf(j));
                                C1M1 c1m1 = c145816he2.A04;
                                A004.AAP("chaining_session_id", c1m1.getSessionId());
                                A004.AAP("client_session_id", c1m1.getSessionId());
                                A004.AAP("contextual_ads_category", "");
                                A004.AAk("position", AbstractC16960so.A1N(0L, Long.valueOf(c41551w4.A01)));
                                Reel reel = c41551w4.A0H;
                                IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
                                if (intentAwareAdsInfo != null) {
                                    str = intentAwareAdsInfo.A09;
                                } else {
                                    str = null;
                                }
                                A004.AAP("trigger_type", str);
                                IntentAwareAdsInfo intentAwareAdsInfo2 = reel.A0B;
                                if (intentAwareAdsInfo2 != null && (str5 = intentAwareAdsInfo2.A07) != null) {
                                    l2 = AbstractC003100w.A0k(10, str5);
                                } else {
                                    l2 = null;
                                }
                                A004.A9K("hscroll_seed_ad_id", l2);
                                A004.AAP("container_module", interfaceC11380iw.getModuleName());
                                IntentAwareAdsInfo intentAwareAdsInfo3 = reel.A0B;
                                if (intentAwareAdsInfo3 != null) {
                                    num = intentAwareAdsInfo3.A02;
                                } else {
                                    num = null;
                                }
                                A004.AAP("multi_ads_type", String.valueOf(num));
                                IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
                                if (intentAwareAdsInfo4 != null && (num2 = intentAwareAdsInfo4.A02) != null) {
                                    l3 = Long.valueOf(num2.intValue());
                                } else {
                                    l3 = null;
                                }
                                A004.A9K("multi_ads_type_number", l3);
                                IntentAwareAdsInfo intentAwareAdsInfo5 = reel.A0B;
                                if (intentAwareAdsInfo5 != null) {
                                    str2 = intentAwareAdsInfo5.A06;
                                } else {
                                    str2 = null;
                                }
                                A004.AAP("multi_ads_id", str2);
                                IntentAwareAdsInfo intentAwareAdsInfo6 = reel.A0B;
                                if (intentAwareAdsInfo6 != null) {
                                    str3 = intentAwareAdsInfo6.A06;
                                } else {
                                    str3 = null;
                                }
                                A004.AAP("multi_ads_unit_id", str3);
                                IntentAwareAdsInfo intentAwareAdsInfo7 = reel.A0B;
                                if (intentAwareAdsInfo7 != null) {
                                    str4 = intentAwareAdsInfo7.A04;
                                } else {
                                    str4 = null;
                                }
                                A004.AAP("insertion_mechanism", str4);
                                IntentAwareAdsInfo intentAwareAdsInfo8 = reel.A0B;
                                if (intentAwareAdsInfo8 != null) {
                                    bool = intentAwareAdsInfo8.A01;
                                }
                                A004.A7v("is_seed_ad_multi_ads_eligible", bool);
                                A004.AAP("tracking_token", c41181vS.BzL(userSession4));
                                A004.Cht();
                            }
                        }
                    }

                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
                        C41181vS c41181vS = (C41181vS) obj;
                        C149716oO c149716oO = (C149716oO) obj2;
                        C14360o3.A0B(c41181vS, 0);
                        C14360o3.A0B(c149716oO, 1);
                        A00(c41181vS, c149716oO, null, "sub_impression");
                    }
                };
                this.A0A = new AbstractC64162vb(c1bx2, c145796hc, c146306iT, A002) { // from class: X.6im
                    public final UserSession A00;
                    public final InterfaceC60442pS A01;
                    public final C145796hc A02;
                    public final C146306iT A03;
                    public final C34E A04;

                    {
                        InterfaceC62702t9 interfaceC62702t9 = new InterfaceC62702t9() { // from class: X.6in
                            @Override // X.InterfaceC62702t9
                            public final String BKe(C59062n7 c59062n7) {
                                C14360o3.A0B(c59062n7, 0);
                                String str = ((C41181vS) c59062n7.A03).A0j;
                                C14360o3.A07(str);
                                return str;
                            }
                        };
                        this.A03 = c146306iT;
                        this.A02 = c145796hc;
                        this.A04 = A002;
                        this.A01 = c146306iT.A02;
                        this.A00 = c146306iT.A01;
                    }

                    private final void A00(C41181vS c41181vS, C149716oO c149716oO, String str) {
                        C34E c34e = this.A04;
                        EnumC64262vl enumC64262vl = EnumC64262vl.A03;
                        AnonymousClass317 anonymousClass317 = AnonymousClass317.A0M;
                        EnumC64222vh enumC64222vh = EnumC64222vh.A09;
                        String str2 = c41181vS.A0j;
                        C14360o3.A07(str2);
                        c34e.EI6(enumC64262vl, anonymousClass317, enumC64222vh, str2);
                        InterfaceC60442pS interfaceC60442pS = this.A01;
                        C146306iT c146306iT2 = this.A03;
                        C3G2 c3g2 = c146306iT2.A03;
                        Reel reel = c149716oO.A00.A0H;
                        C138356Or A003 = AbstractC138346Oq.A00(interfaceC60442pS, reel, c3g2);
                        C82713mZ c82713mZ = new C82713mZ(null, A003, str);
                        c82713mZ.A02();
                        c82713mZ.A09(c149716oO.A02.A0I);
                        c82713mZ.A70 = c146306iT2.A06.getSessionId();
                        C3R6.A08(c82713mZ, c41181vS, c149716oO, c146306iT2);
                        C3R6.A06(c82713mZ, reel);
                        C145796hc c145796hc2 = this.A02;
                        String id = reel.getId();
                        C14360o3.A07(id);
                        C6YY c6yy = (C6YY) c145796hc2.A05.get(id);
                        if (c6yy != null) {
                            c82713mZ.A48 = Long.valueOf(c6yy.A05);
                            c82713mZ.A06(c6yy.A00);
                            c82713mZ.A49 = Long.valueOf(c6yy.A06);
                            c82713mZ.A0A(c6yy.A02);
                            c82713mZ.A4D = Long.valueOf(c6yy.A0P);
                            c82713mZ.A0O(c6yy.A08);
                            c82713mZ.A45 = Long.valueOf(c6yy.A03);
                        }
                        C32U.A0I(this.A00, c82713mZ, A003, C05F.A01);
                    }

                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
                        C41181vS c41181vS = (C41181vS) obj;
                        C149716oO c149716oO = (C149716oO) obj2;
                        C14360o3.A0B(c41181vS, 0);
                        C14360o3.A0B(c149716oO, 1);
                        A00(c41181vS, c149716oO, "instagram_netego_impression");
                    }

                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
                        C41181vS c41181vS = (C41181vS) obj;
                        C149716oO c149716oO = (C149716oO) obj2;
                        C14360o3.A0B(c41181vS, 0);
                        C14360o3.A0B(c149716oO, 1);
                        A00(c41181vS, c149716oO, "instagram_netego_sub_impression");
                    }
                };
                this.A0E = new AbstractC64162vb(context, fragmentActivity, c1bx2, c145796hc, c145826hf, c146306iT) { // from class: X.6io
                    public static final InterfaceC08100bW A0A;
                    public static final String A0B;
                    public C120435cm A00;
                    public final Context A01;
                    public final FragmentActivity A02;
                    public final UserSession A03;
                    public final InterfaceC60442pS A04;
                    public final C145796hc A05;
                    public final C145826hf A06;
                    public final C146306iT A07;
                    public final boolean A08;
                    public final boolean A09;

                    static {
                        String name = C146516io.class.getName();
                        C14360o3.A07(name);
                        A0B = name;
                        A0A = new C1QF(name).A00;
                    }

                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        /*
                            r4 = this;
                            com.instagram.common.session.UserSession r3 = r10.A01
                            X.6ip r0 = new X.6ip
                            r0.<init>()
                            r4.<init>(r7, r0)
                            r4.A01 = r5
                            r4.A02 = r6
                            r4.A07 = r10
                            r4.A05 = r8
                            r4.A06 = r9
                            X.2pS r0 = r10.A02
                            r4.A04 = r0
                            r4.A03 = r3
                            X.0Tz r2 = X.C06090Tz.A05
                            r0 = 36312127421940653(0x8101b0000603ad, double:3.0272738266116325E-306)
                            boolean r0 = X.C18U.A06(r2, r3, r0)
                            r4.A08 = r0
                            r0 = 36312127422006190(0x8101b0000703ae, double:3.0272738266530784E-306)
                            boolean r0 = X.C18U.A06(r2, r3, r0)
                            r4.A09 = r0
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C146516io.<init>(android.content.Context, androidx.fragment.app.FragmentActivity, X.1BX, X.6hc, X.6hf, X.6iT):void");
                    }

                    private final void A00(C41551w4 c41551w4, C149726oP c149726oP, String str) {
                        InterfaceC60442pS interfaceC60442pS = this.A04;
                        C146306iT c146306iT2 = this.A07;
                        C3G2 c3g2 = c146306iT2.A03;
                        Reel reel = c41551w4.A0H;
                        C138356Or A003 = AbstractC138346Oq.A00(interfaceC60442pS, reel, c3g2);
                        UserSession userSession3 = this.A03;
                        C82713mZ A012 = AbstractC37955Gmx.A01(userSession3, A003, reel, str);
                        A012.A02();
                        C41181vS c41181vS = c149726oP.A01;
                        C38321qM c38321qM = c41181vS.A0b;
                        if (c38321qM != null) {
                            A012.A8J = AbstractC41071vF.A0R(userSession3, c38321qM);
                        }
                        A012.A4E = Long.valueOf(c149726oP.A00);
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = c41551w4.A0F;
                        if (j != 0) {
                            A012.A4K = Long.valueOf(currentTimeMillis - j);
                            Integer num = c41551w4.A03;
                            if (num != null) {
                                A012.A2x = num;
                            }
                            C3R6 c3r6 = C3R6.A00;
                            C141596ac c141596ac = c149726oP.A03;
                            C146796jH c146796jH = c149726oP.A02;
                            int A004 = c146796jH.A00(c41181vS);
                            boolean z = c149726oP.A04;
                            C3R6.A07(A012, c41181vS, c41551w4, c146306iT2, c141596ac, A004, z);
                            C145796hc c145796hc2 = this.A05;
                            String id = reel.getId();
                            C14360o3.A07(id);
                            C6YY c6yy = (C6YY) c145796hc2.A05.get(id);
                            A012.A4Y = C32V.A00(userSession3);
                            if (AbstractC61652rS.A02(userSession3)) {
                                A012.A4d = AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession3)).toString();
                                A012.A4e = AbstractC61652rS.A00(userSession3).toString();
                            }
                            if (c38321qM != null) {
                                C674732m c674732m = new C674732m(userSession3);
                                if (c674732m.A04()) {
                                    A012.A1P = Boolean.valueOf(c674732m.A05(c38321qM));
                                    A012.A1t = Boolean.valueOf(c674732m.A07(c38321qM));
                                }
                            }
                            Context context2 = this.A01;
                            UserSession userSession4 = c146306iT2.A01;
                            c3r6.A0A(context2, userSession4, A012, reel, c3g2, new C37948Gmq(userSession4, reel, c41181vS, c41551w4, c141596ac, c146796jH.A00(c41181vS), z), c6yy);
                            A012.A7b = AbstractC139736Uc.A00(userSession3, c41181vS, c41551w4, c3g2, c141596ac);
                            C32U.A0I(userSession3, A012, A003, C05F.A01);
                            return;
                        }
                        throw new IllegalStateException("Creation time has not been configured correctly for this ReelViewModel");
                    }

                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
                        String str;
                        EnumC906041v enumC906041v;
                        AndroidLink A003;
                        String Aw8;
                        android.net.Uri A004;
                        EnumC906041v enumC906041v2;
                        String Aw82;
                        int i;
                        Map map;
                        Double d;
                        Double d2;
                        Double d3;
                        Double d4;
                        Double d5;
                        Double d6;
                        Double d7;
                        Double d8;
                        Boolean bool;
                        String str2;
                        String str3;
                        String str4;
                        String str5;
                        Long l;
                        Long l2;
                        Long l3;
                        Long l4;
                        Long l5;
                        String str6;
                        String str7;
                        long j;
                        Long l6;
                        Long l7;
                        Long l8;
                        Long l9;
                        Long l10;
                        Long l11;
                        Long l12;
                        Long l13;
                        Long l14;
                        Long l15;
                        Long l16;
                        Long l17;
                        Long l18;
                        Long l19;
                        Long l20;
                        Long l21;
                        Long l22;
                        Long l23;
                        Double d9;
                        Long l24;
                        Long l25;
                        String str8;
                        Long l26;
                        Long l27;
                        Long l28;
                        Long l29;
                        Long l30;
                        Long l31;
                        Long l32;
                        Long l33;
                        Long l34;
                        Long l35;
                        Long l36;
                        Long l37;
                        Long l38;
                        Long l39;
                        Integer num;
                        Integer num2;
                        Integer num3;
                        Integer num4;
                        Integer num5;
                        Integer num6;
                        Integer num7;
                        Integer num8;
                        C37881pR c37881pR;
                        C37881pR c37881pR2;
                        C40861ut c40861ut;
                        C40861ut c40861ut2;
                        C40861ut c40861ut3;
                        C40861ut c40861ut4;
                        C40861ut c40861ut5;
                        C40861ut c40861ut6;
                        C40861ut c40861ut7;
                        C40861ut c40861ut8;
                        Long A0k;
                        String str9;
                        String str10;
                        String str11;
                        String str12;
                        String str13;
                        String str14;
                        String str15;
                        String str16;
                        String str17;
                        String str18;
                        String str19;
                        String str20;
                        String str21;
                        String str22;
                        C41551w4 c41551w4 = (C41551w4) obj;
                        C149726oP c149726oP = (C149726oP) obj2;
                        C14360o3.A0B(c41551w4, 0);
                        C14360o3.A0B(c149726oP, 1);
                        UserSession userSession3 = this.A03;
                        C12210kP c12210kP = new C12210kP(userSession3);
                        InterfaceC60442pS interfaceC60442pS = this.A04;
                        c12210kP.A00 = interfaceC60442pS;
                        C18920wW A005 = c12210kP.A00();
                        InterfaceC02590Ai A006 = A005.A00(A005.A00, "instagram_ad_reel_impression");
                        C146306iT c146306iT2 = this.A07;
                        C3G2 c3g2 = c146306iT2.A03;
                        Reel reel = c41551w4.A0H;
                        C138356Or A007 = AbstractC138346Oq.A00(interfaceC60442pS, reel, c3g2);
                        C11520jB A012 = AbstractC37955Gmx.A01(userSession3, A007, reel, "impression").A01();
                        C41181vS A08 = c41551w4.A08(userSession3);
                        C38321qM c38321qM = A08.A0b;
                        if (this.A08 && A006.isSampled()) {
                            UserSession userSession4 = c146306iT2.A01;
                            C41181vS c41181vS = c149726oP.A01;
                            C37948Gmq c37948Gmq = new C37948Gmq(userSession4, reel, c41181vS, c41551w4, c149726oP.A03, c149726oP.A02.A00(c41181vS), c149726oP.A04);
                            C141596ac c141596ac = c37948Gmq.A05;
                            C145796hc c145796hc2 = this.A05;
                            String id = reel.getId();
                            C14360o3.A07(id);
                            C6YY c6yy = (C6YY) c145796hc2.A05.get(id);
                            if (c38321qM != null) {
                                Reel reel2 = c37948Gmq.A02;
                                String id2 = reel2.getId();
                                C14360o3.A07(id2);
                                A006.AAP("reel_id", id2);
                                A006.A9K("session_reel_counter", Long.valueOf(c37948Gmq.A00));
                                A006.AAP("tray_session_id", c146306iT2.A08);
                                C145826hf c145826hf2 = this.A06;
                                A006.AAP("viewer_session_id", c145826hf2.A0E.getSessionId());
                                A006.AAP("m_pk", AbstractC128985sJ.A09(c38321qM));
                                A006.A9K("m_t", Long.valueOf(c38321qM.BRp().A00));
                                A006.A9K("ad_id", AbstractC128985sJ.A01(userSession3, c38321qM));
                                A006.AAP("tracking_token", AbstractC128985sJ.A07(userSession3, c38321qM, A007));
                                A006.AAP("action", AbstractC128985sJ.A08(c38321qM));
                                A006.A9K("ad_inserted_position", Long.valueOf(c141596ac.A0I));
                                A006.AAP("follow_status", AbstractC128985sJ.A06(userSession3, c38321qM));
                                UserSession userSession5 = c37948Gmq.A01;
                                A006.A9K("reel_size", Long.valueOf(reel2.A0O(userSession5).size()));
                                A006.A9K("reel_position", Long.valueOf(c37948Gmq.A00()));
                                A006.A9K("a_pk", Long.valueOf(AbstractC128985sJ.A00(userSession3, c38321qM)));
                                A006.A9K("m_ts", Long.valueOf(c38321qM.A1B()));
                                C14360o3.A0B(A007, 0);
                                A006.AAP("source_of_action", A007.getModuleName());
                                A006.A8I("time_elapsed", Double.valueOf((c141596ac.A0A * c141596ac.A0B) / 1000.0d));
                                A006.A9K("reel_viewer_position", Long.valueOf(c141596ac.A0I));
                                A006.AAP("reel_type", reel2.A0H(userSession5));
                                if (reel2.A17(userSession5)) {
                                    i = reel2.A00;
                                } else {
                                    i = -1;
                                }
                                A006.A9K("carousel_opt_in_position", Long.valueOf(i));
                                A006.A7v("is_video_to_carousel", Boolean.valueOf(c37948Gmq.A07));
                                Context context2 = this.A01;
                                C0Zx c0Zx = new C0Zx();
                                InterfaceC138906Qw interfaceC138906Qw = c141596ac.A0S;
                                if (interfaceC138906Qw != null) {
                                    map = interfaceC138906Qw.BMV();
                                } else {
                                    map = null;
                                }
                                c0Zx.A03("is_showreel_native", Boolean.valueOf(AbstractC130925vf.A0f(A08)));
                                if (map != null && (str22 = (String) map.get("media_height")) != null) {
                                    d = Double.valueOf(Double.parseDouble(str22));
                                } else {
                                    d = null;
                                }
                                c0Zx.A04("media_height", d);
                                if (map != null && (str21 = (String) map.get("media_width")) != null) {
                                    d2 = Double.valueOf(Double.parseDouble(str21));
                                } else {
                                    d2 = null;
                                }
                                c0Zx.A04("media_width", d2);
                                if (map != null && (str20 = (String) map.get("caption_font_size")) != null) {
                                    d3 = Double.valueOf(Double.parseDouble(str20));
                                } else {
                                    d3 = null;
                                }
                                c0Zx.A04("caption_font_size", d3);
                                if (map != null && (str19 = (String) map.get("caption_position_start_x")) != null) {
                                    d4 = Double.valueOf(Double.parseDouble(str19));
                                } else {
                                    d4 = null;
                                }
                                c0Zx.A04("caption_position_start_x", d4);
                                if (map != null && (str18 = (String) map.get("caption_position_start_y")) != null) {
                                    d5 = Double.valueOf(Double.parseDouble(str18));
                                } else {
                                    d5 = null;
                                }
                                c0Zx.A04("caption_position_start_y", d5);
                                if (map != null && (str17 = (String) map.get("caption_line_height")) != null) {
                                    d6 = Double.valueOf(Double.parseDouble(str17));
                                } else {
                                    d6 = null;
                                }
                                c0Zx.A04("caption_line_height", d6);
                                if (map != null && (str16 = (String) map.get("caption_height")) != null) {
                                    d7 = Double.valueOf(Double.parseDouble(str16));
                                } else {
                                    d7 = null;
                                }
                                c0Zx.A04("caption_height", d7);
                                if (map != null && (str15 = (String) map.get("caption_width")) != null) {
                                    d8 = Double.valueOf(Double.parseDouble(str15));
                                } else {
                                    d8 = null;
                                }
                                c0Zx.A04("caption_width", d8);
                                if (map != null && (str14 = (String) map.get("is_caption_fully_displayed")) != null) {
                                    bool = Boolean.valueOf(Boolean.parseBoolean(str14));
                                } else {
                                    bool = null;
                                }
                                c0Zx.A03("is_caption_fully_displayed", bool);
                                if (map != null) {
                                    str2 = (String) map.get("background_color_bottom");
                                } else {
                                    str2 = null;
                                }
                                c0Zx.A06("background_color_bottom", str2);
                                if (map != null) {
                                    str3 = (String) map.get("background_color_caption");
                                } else {
                                    str3 = null;
                                }
                                c0Zx.A06("background_color_caption", str3);
                                if (map != null) {
                                    str4 = (String) map.get("background_color_top");
                                } else {
                                    str4 = null;
                                }
                                c0Zx.A06("background_color_top", str4);
                                if (map != null) {
                                    str5 = (String) map.get("caption_background_color_alpha");
                                } else {
                                    str5 = null;
                                }
                                c0Zx.A06("caption_background_color_alpha", str5);
                                if (map != null && (str13 = (String) map.get("caption_num_char_showed")) != null) {
                                    l = Long.valueOf(Long.parseLong(str13));
                                } else {
                                    l = null;
                                }
                                c0Zx.A05("caption_num_char_showed", l);
                                if (map != null && (str12 = (String) map.get("caption_num_hashtags_showed")) != null) {
                                    l2 = Long.valueOf(Long.parseLong(str12));
                                } else {
                                    l2 = null;
                                }
                                c0Zx.A05("caption_num_hashtags_showed", l2);
                                if (map != null && (str11 = (String) map.get("caption_num_lines_showed")) != null) {
                                    l3 = Long.valueOf(Long.parseLong(str11));
                                } else {
                                    l3 = null;
                                }
                                c0Zx.A05("caption_num_lines_showed", l3);
                                if (map != null && (str10 = (String) map.get("caption_num_lines_total")) != null) {
                                    l4 = Long.valueOf(Long.parseLong(str10));
                                } else {
                                    l4 = null;
                                }
                                c0Zx.A05("caption_num_lines_total", l4);
                                if (map != null && (str9 = (String) map.get("caption_num_mentions_showed")) != null) {
                                    l5 = Long.valueOf(Long.parseLong(str9));
                                } else {
                                    l5 = null;
                                }
                                c0Zx.A05("caption_num_mentions_showed", l5);
                                if (map != null) {
                                    str6 = (String) map.get("caption_text_color");
                                } else {
                                    str6 = null;
                                }
                                c0Zx.A06("caption_text_color", str6);
                                c0Zx.A06("cta_color", c38321qM.A0C.getDominantColor());
                                if (map != null) {
                                    str7 = (String) map.get("headline_text_showed");
                                } else {
                                    str7 = null;
                                }
                                c0Zx.A06("headline_text_showed", str7);
                                c0Zx.A04("screen_density", Double.valueOf(AbstractC13880nE.A0I(context2).density));
                                c0Zx.A04("screen_height", Double.valueOf(AbstractC13880nE.A01(context2, AbstractC13880nE.A09(context2))));
                                c0Zx.A04("screen_width", Double.valueOf(AbstractC13880nE.A01(context2, AbstractC13880nE.A0A(context2))));
                                A006.AAQ(c0Zx, "media_layout");
                                boolean z = false;
                                if (c6yy != null) {
                                    z = true;
                                }
                                A006.A7v("is_acp_delivered", Boolean.valueOf(z));
                                A006.A7v("is_eof", c38321qM.A0C.CTu());
                                A006.AAP("inventory_source", c38321qM.A0C.BJN());
                                A006.AAP("story_ranking_token", c145826hf2.A0G);
                                A006.AAP("sponsored_label_text", AnonymousClass001.A0B(A08.A0a(userSession3)));
                                C41551w4 c41551w42 = c37948Gmq.A04;
                                A006.A9K("ad_position_from_server", Long.valueOf(c41551w42.A0E));
                                A006.A9K("reel_start_position", Long.valueOf(c37948Gmq.A00()));
                                A006.A9K("top_liker_count", AbstractC128985sJ.A02(userSession3, c38321qM));
                                A006.A8I("elapsed_time_since_last_item", Double.valueOf(-1.0d));
                                A006.A9K("dark_mode_state", Long.valueOf(AbstractC19730y1.A00(AbstractC12960li.A00).A00()));
                                if (C1H6.A03()) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                A006.A9K("is_dark_mode", Long.valueOf(j));
                                if (c38321qM.A58()) {
                                    l6 = Long.valueOf(c38321qM.A6p().length);
                                } else {
                                    l6 = null;
                                }
                                A006.A9K("sponsor_tag_count", l6);
                                String[] A6p = c38321qM.A6p();
                                ArrayList arrayList = new ArrayList();
                                for (String str23 : A6p) {
                                    if (str23 != null && (A0k = AbstractC003100w.A0k(10, str23)) != null) {
                                        arrayList.add(A0k);
                                    }
                                }
                                A006.AAk("sponsor_tag_ids", arrayList);
                                A006.A7v("production_build", true);
                                if (c6yy != null) {
                                    l7 = Long.valueOf(c6yy.A04);
                                } else {
                                    l7 = null;
                                }
                                A006.A9K("reel_gap", l7);
                                if (c6yy != null) {
                                    l8 = Long.valueOf(c6yy.A0O);
                                } else {
                                    l8 = null;
                                }
                                A006.A9K("ad_request_position", l8);
                                if (c6yy != null) {
                                    l9 = Long.valueOf(c6yy.A0P);
                                } else {
                                    l9 = null;
                                }
                                A006.A9K("reel_viewer_entry_position", l9);
                                if (c6yy != null) {
                                    l10 = Long.valueOf(c6yy.A0N);
                                } else {
                                    l10 = null;
                                }
                                A006.A9K("ad_received_position", l10);
                                if (c6yy != null) {
                                    l11 = Long.valueOf(c6yy.A01);
                                } else {
                                    l11 = null;
                                }
                                A006.A9K("consumed_media_gap", l11);
                                if (c6yy != null) {
                                    l12 = Long.valueOf(c6yy.A00);
                                } else {
                                    l12 = null;
                                }
                                A006.A9K("ad_consumed_media_gap", l12);
                                if (c6yy != null) {
                                    l13 = Long.valueOf(c6yy.A02);
                                } else {
                                    l13 = null;
                                }
                                A006.A9K("netego_consumed_media_gap", l13);
                                if (c6yy != null) {
                                    l14 = Long.valueOf(c6yy.A05);
                                } else {
                                    l14 = null;
                                }
                                A006.A9K("reel_gap_to_last_ad", l14);
                                if (c6yy != null) {
                                    l15 = Long.valueOf(c6yy.A06);
                                } else {
                                    l15 = null;
                                }
                                A006.A9K("reel_gap_to_last_netego", l15);
                                if (c6yy != null && (c40861ut8 = c6yy.A08) != null) {
                                    l16 = Long.valueOf(c40861ut8.A07());
                                } else {
                                    l16 = null;
                                }
                                A006.A9K("min_consumed_reel_gap_to_previous_ad", l16);
                                if (c6yy != null && (c40861ut7 = c6yy.A08) != null) {
                                    l17 = Long.valueOf(c40861ut7.A08());
                                } else {
                                    l17 = null;
                                }
                                A006.A9K("min_consumed_reel_gap_to_previous_netego", l17);
                                if (c6yy != null && (c40861ut6 = c6yy.A08) != null) {
                                    l18 = Long.valueOf(c40861ut6.A01());
                                } else {
                                    l18 = null;
                                }
                                A006.A9K("min_consumed_media_gap_to_previous_ad", l18);
                                if (c6yy != null && (c40861ut5 = c6yy.A08) != null) {
                                    l19 = Long.valueOf(c40861ut5.A02());
                                } else {
                                    l19 = null;
                                }
                                A006.A9K("min_consumed_media_gap_to_previous_netego", l19);
                                if (c6yy != null && (c40861ut4 = c6yy.A08) != null) {
                                    l20 = Long.valueOf(c40861ut4.A03());
                                } else {
                                    l20 = null;
                                }
                                A006.A9K("highest_position_rule", l20);
                                if (c6yy != null && (c40861ut3 = c6yy.A08) != null) {
                                    l21 = Long.valueOf(c40861ut3.A04());
                                } else {
                                    l21 = null;
                                }
                                A006.A9K("max_reel_gap_to_previous_item", l21);
                                if (c6yy != null) {
                                    l22 = Long.valueOf(c6yy.A03);
                                } else {
                                    l22 = null;
                                }
                                A006.A9K("priority_index", l22);
                                if (c6yy != null && (c40861ut2 = c6yy.A08) != null) {
                                    l23 = Long.valueOf(c40861ut2.A06());
                                } else {
                                    l23 = null;
                                }
                                A006.A9K("min_media_gap_to_previous_item", l23);
                                if (c6yy != null && (c40861ut = c6yy.A08) != null) {
                                    d9 = Double.valueOf(c40861ut.A00());
                                } else {
                                    d9 = null;
                                }
                                A006.A8I("time_gap_to_previous_item_in_sec", d9);
                                if (c6yy != null) {
                                    l24 = Long.valueOf(c6yy.A04);
                                } else {
                                    l24 = null;
                                }
                                A006.A9K("reel_gap_highest_position", l24);
                                if (c6yy != null) {
                                    l25 = Long.valueOf(c6yy.A01);
                                } else {
                                    l25 = null;
                                }
                                A006.A9K("consumed_media_gap_highest_position", l25);
                                if (c6yy != null && (c37881pR2 = c6yy.A07) != null) {
                                    str8 = c37881pR2.A02;
                                } else {
                                    str8 = null;
                                }
                                A006.AAP("ad_pod_id", str8);
                                if (c6yy != null && (c37881pR = c6yy.A07) != null) {
                                    l26 = Long.valueOf(c37881pR.A00);
                                } else {
                                    l26 = null;
                                }
                                A006.A9K("index_in_ad_pod", l26);
                                if (c6yy != null && (num8 = c6yy.A0A) != null) {
                                    l27 = Long.valueOf(num8.intValue());
                                } else {
                                    l27 = null;
                                }
                                A006.A9K("adpod_media_hp", l27);
                                if (c6yy != null && (num7 = c6yy.A0B) != null) {
                                    l28 = Long.valueOf(num7.intValue());
                                } else {
                                    l28 = null;
                                }
                                A006.A9K("adpod_reel_hp", l28);
                                if (c6yy != null && (num6 = c6yy.A09) != null) {
                                    l29 = Long.valueOf(num6.intValue());
                                } else {
                                    l29 = null;
                                }
                                A006.A9K("adpod_media_gap", l29);
                                if (c6yy != null && (num5 = c6yy.A0F) != null) {
                                    l30 = Long.valueOf(num5.intValue());
                                } else {
                                    l30 = null;
                                }
                                A006.A9K("adpod_reel_gap", l30);
                                if (c6yy != null) {
                                    l31 = c6yy.A0H;
                                } else {
                                    l31 = null;
                                }
                                A006.A9K("num_ads_or_netegos_before_first_ad_pod", l31);
                                if (c6yy != null) {
                                    l32 = c6yy.A0J;
                                } else {
                                    l32 = null;
                                }
                                A006.A9K("num_ads_or_netegos_since_previous_ad_pod", l32);
                                A006.AAk("client_ad_creative_optimization_output", Collections.unmodifiableList(AbstractC139736Uc.A00(userSession5, c37948Gmq.A03, c41551w42, c3g2, c141596ac)));
                                A006.AAP("nav_chain", (String) A012.A01(C5I8.A62));
                                String str24 = (String) A012.A01(C5I8.A3c);
                                if (str24 != null) {
                                    l33 = AbstractC003100w.A0k(10, str24);
                                } else {
                                    l33 = null;
                                }
                                A006.A9K("hscroll_seed_ad_id", l33);
                                A006.AAP("intent_aware_ads_trigger_type", (String) A012.A01(C5I8.A3q));
                                A006.A7v("is_multi_ads", (Boolean) A012.A01(C5I8.A4W));
                                A006.A9K("multi_ads_type", (Long) A012.A01(C5I8.A5y));
                                A006.AAP("multi_ads_unit_id", (String) A012.A01(C5I8.A60));
                                A006.A7v("is_seed_ad_multi_ads_eligible", (Boolean) A012.A01(C5I8.A4o));
                                A006.AAP("multi_ads_insertion_mechanism", (String) A012.A01(C5I8.A5x));
                                A006.A9K("num_ads_in_multi_ads_unit", (Long) A012.A01(C5I8.A6B));
                                A006.AAP("afs_enablement_status", C32V.A00(userSession3));
                                if (c6yy != null && (num4 = c6yy.A0D) != null) {
                                    l34 = Long.valueOf(num4.intValue());
                                } else {
                                    l34 = null;
                                }
                                A006.A9K("multi_ad_carousel_media_hp", l34);
                                if (c6yy != null && (num3 = c6yy.A0E) != null) {
                                    l35 = Long.valueOf(num3.intValue());
                                } else {
                                    l35 = null;
                                }
                                A006.A9K("multi_ad_carousel_reel_hp", l35);
                                if (c6yy != null && (num2 = c6yy.A0C) != null) {
                                    l36 = Long.valueOf(num2.intValue());
                                } else {
                                    l36 = null;
                                }
                                A006.A9K("multi_ad_carousel_media_gap", l36);
                                if (c6yy != null && (num = c6yy.A0G) != null) {
                                    l37 = Long.valueOf(num.intValue());
                                } else {
                                    l37 = null;
                                }
                                A006.A9K("multi_ad_carousel_reel_gap", l37);
                                if (c6yy != null) {
                                    l38 = c6yy.A0I;
                                } else {
                                    l38 = null;
                                }
                                A006.A9K("num_ads_or_netegoes_before_first_multi_ad_carousel", l38);
                                if (c6yy != null) {
                                    l39 = c6yy.A0K;
                                } else {
                                    l39 = null;
                                }
                                A006.A9K("num_ads_or_netegoes_since_previous_multi_ad_carousel", l39);
                                if (AbstractC61652rS.A02(userSession3)) {
                                    A006.AAP("basic_ads_graphql_tier", AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession3)).toString());
                                    A006.AAP("basic_ads_launcher_tier", AbstractC61652rS.A00(userSession3).toString());
                                }
                                A006.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                                A006.Cht();
                            } else {
                                return;
                            }
                        } else {
                            A00(c41551w4, c149726oP, "impression");
                            if (c38321qM == null) {
                                return;
                            }
                        }
                        Context context3 = this.A01;
                        AndroidLink A008 = AbstractC905941u.A00(context3, userSession3, c38321qM, null, false);
                        C1XJ c1xj = C1XJ.A00;
                        C14360o3.A07(c1xj);
                        if (A008 != null) {
                            str = A008.Aw8();
                            enumC906041v = AbstractC114965Hm.A01(A008);
                        } else {
                            str = null;
                            enumC906041v = null;
                        }
                        if (enumC906041v == EnumC906041v.AD_DESTINATION_ORGANIC_COLLECTION && str != null) {
                            InterfaceC08100bW interfaceC08100bW = A0A;
                            android.net.Uri A009 = AbstractC08820cl.A00(interfaceC08100bW, str);
                            String A0Z = c1xj.A0Z(A009, interfaceC08100bW, A0B);
                            if (A009 != null && A0Z != null && A0Z.equals("com.bloks.www.minishop.collections") && C18U.A06(C06090Tz.A05, userSession3, 36316765986361991L)) {
                                String queryParameter = A009.getQueryParameter("encoded_collection_id");
                                if (queryParameter == null) {
                                    queryParameter = "";
                                }
                                INB A0S = c1xj.A0S(this.A02, userSession3, queryParameter);
                                A0S.A00 = A009.getQueryParameter("ad_id");
                                A0S.A01 = A009.getQueryParameter("first_entry_point");
                                A0S.A02 = c38321qM.getId();
                                A0S.A01(A009.getQueryParameter("pinned_product_ids"));
                                A0S.A03 = interfaceC60442pS.getModuleName();
                                A0S.A04 = A009.getQueryParameter("shopping_session_id");
                                A0S.A05 = A009.getQueryParameter(DialogModule.KEY_TITLE);
                                A0S.A06 = A009.getQueryParameter("tracking_token");
                                A0S.A00();
                            }
                        }
                        C06090Tz c06090Tz2 = C06090Tz.A05;
                        if (C18U.A06(c06090Tz2, userSession3, 36316031546953609L)) {
                            AndroidLink A0010 = AbstractC905941u.A00(context3, userSession3, c38321qM, null, false);
                            C1XJ c1xj2 = C1XJ.A00;
                            C14360o3.A07(c1xj2);
                            if (A0010 != null && (Aw82 = A0010.Aw8()) != null && AbstractC114965Hm.A01(A0010) == EnumC906041v.IG_DESTINATION_BLOKS) {
                                InterfaceC08100bW interfaceC08100bW2 = A0A;
                                android.net.Uri A0011 = AbstractC08820cl.A00(interfaceC08100bW2, Aw82);
                                String A0Z2 = c1xj2.A0Z(A0011, interfaceC08100bW2, A0B);
                                if (A0011 != null && A0Z2 != null && A0Z2.equals("com.bloks.www.minishops.ad.storefront")) {
                                    c1xj2.A0M(A0011, this.A02, userSession3, c38321qM, interfaceC60442pS, true).A04();
                                }
                            }
                        }
                        if (C18U.A06(c06090Tz2, userSession3, 2342155183881389013L)) {
                            AndroidLink A0012 = AbstractC905941u.A00(context3, userSession3, c38321qM, null, false);
                            if (A0012 != null) {
                                enumC906041v2 = AbstractC114965Hm.A01(A0012);
                            } else {
                                enumC906041v2 = null;
                            }
                            if (enumC906041v2 == EnumC906041v.AD_DESTINATION_SHOPPING_PDP) {
                                C120435cm c120435cm = this.A00;
                                if (c120435cm == null) {
                                    c120435cm = new C120435cm(userSession3);
                                    this.A00 = c120435cm;
                                }
                                c120435cm.A00(null);
                            }
                        }
                        if (C18U.A06(c06090Tz2, userSession3, 36330741809890308L) && (A003 = AbstractC905941u.A00(context3, userSession3, c38321qM, null, false)) != null && (Aw8 = A003.Aw8()) != null && (A004 = AbstractC08820cl.A00(A0A, Aw8)) != null && A004.isHierarchical()) {
                            String queryParameter2 = A004.getQueryParameter("app_id");
                            String queryParameter3 = A004.getQueryParameter("merchant_id");
                            if (C14360o3.A0K(queryParameter2, "com.bloks.www.bloks.commerce.cart.singlemerchantcart") && queryParameter3 != null) {
                                C1XJ.A00.A0d(context3, this.A02, userSession3, queryParameter3, String.valueOf(AbstractC128985sJ.A01(userSession3, c38321qM)), AbstractC128985sJ.A07(userSession3, c38321qM, interfaceC60442pS), interfaceC60442pS.getModuleName());
                            }
                        }
                    }

                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
                        int i;
                        Map map;
                        Double d;
                        Double d2;
                        Double d3;
                        Double d4;
                        Double d5;
                        Double d6;
                        Double d7;
                        Double d8;
                        Boolean bool;
                        String str;
                        String str2;
                        String str3;
                        String str4;
                        Long l;
                        Long l2;
                        Long l3;
                        Long l4;
                        Long l5;
                        String str5;
                        String str6;
                        long j;
                        Long l6;
                        Long l7;
                        Long l8;
                        Long l9;
                        Long l10;
                        Long l11;
                        Long l12;
                        Long l13;
                        Long l14;
                        Long l15;
                        Long l16;
                        Long l17;
                        Long l18;
                        Long l19;
                        Long l20;
                        Long l21;
                        Long l22;
                        Long l23;
                        Double d9;
                        Long l24;
                        Long l25;
                        String str7;
                        Long l26;
                        Long l27;
                        Long l28;
                        Long l29;
                        Long l30;
                        Long l31;
                        Long l32;
                        Long l33;
                        Integer num;
                        Integer num2;
                        Integer num3;
                        Integer num4;
                        C37881pR c37881pR;
                        C37881pR c37881pR2;
                        C40861ut c40861ut;
                        C40861ut c40861ut2;
                        C40861ut c40861ut3;
                        C40861ut c40861ut4;
                        C40861ut c40861ut5;
                        C40861ut c40861ut6;
                        Long A0k;
                        C40861ut c40861ut7;
                        C40861ut c40861ut8;
                        String str8;
                        String str9;
                        String str10;
                        String str11;
                        String str12;
                        String str13;
                        String str14;
                        String str15;
                        String str16;
                        String str17;
                        String str18;
                        String str19;
                        String str20;
                        String str21;
                        C41551w4 c41551w4 = (C41551w4) obj;
                        C149726oP c149726oP = (C149726oP) obj2;
                        C14360o3.A0B(c41551w4, 0);
                        C14360o3.A0B(c149726oP, 1);
                        UserSession userSession3 = this.A03;
                        C12210kP c12210kP = new C12210kP(userSession3);
                        InterfaceC60442pS interfaceC60442pS = this.A04;
                        c12210kP.A00 = interfaceC60442pS;
                        C18920wW A003 = c12210kP.A00();
                        InterfaceC02590Ai A004 = A003.A00(A003.A00, "instagram_ad_reel_sub_impression");
                        C146306iT c146306iT2 = this.A07;
                        C3G2 c3g2 = c146306iT2.A03;
                        Reel reel = c41551w4.A0H;
                        C11520jB A012 = AbstractC37955Gmx.A01(userSession3, AbstractC138346Oq.A00(interfaceC60442pS, reel, c3g2), reel, "sub_impression").A01();
                        if (this.A09 && A004.isSampled()) {
                            C41181vS A08 = c41551w4.A08(userSession3);
                            C38321qM c38321qM = A08.A0b;
                            UserSession userSession4 = c146306iT2.A01;
                            C41181vS c41181vS = c149726oP.A01;
                            C37948Gmq c37948Gmq = new C37948Gmq(userSession4, reel, c41181vS, c41551w4, c149726oP.A03, c149726oP.A02.A00(c41181vS), c149726oP.A04);
                            C141596ac c141596ac = c37948Gmq.A05;
                            C145796hc c145796hc2 = this.A05;
                            String id = reel.getId();
                            C14360o3.A07(id);
                            C6YY c6yy = (C6YY) c145796hc2.A05.get(id);
                            if (c38321qM != null) {
                                Reel reel2 = c37948Gmq.A02;
                                String id2 = reel2.getId();
                                C14360o3.A07(id2);
                                A004.AAP("reel_id", id2);
                                A004.A9K("session_reel_counter", Long.valueOf(c37948Gmq.A00));
                                A004.AAP("tray_session_id", c146306iT2.A08);
                                C145826hf c145826hf2 = this.A06;
                                A004.AAP("viewer_session_id", c145826hf2.A0E.getSessionId());
                                A004.AAP("m_pk", AbstractC128985sJ.A09(c38321qM));
                                A004.A9K("m_t", Long.valueOf(c38321qM.BRp().A00));
                                A004.A9K("ad_id", AbstractC128985sJ.A01(userSession3, c38321qM));
                                A004.AAP("tracking_token", AbstractC128985sJ.A07(userSession3, c38321qM, interfaceC60442pS));
                                A004.AAP("action", AbstractC128985sJ.A08(c38321qM));
                                A004.A9K("ad_inserted_position", Long.valueOf(c141596ac.A0I));
                                A004.AAP("follow_status", AbstractC128985sJ.A06(userSession3, c38321qM));
                                UserSession userSession5 = c37948Gmq.A01;
                                A004.A9K("reel_size", Long.valueOf(reel2.A0O(userSession5).size()));
                                A004.A9K("reel_position", Long.valueOf(c37948Gmq.A00()));
                                A004.A9K("a_pk", Long.valueOf(AbstractC128985sJ.A00(userSession3, c38321qM)));
                                A004.A9K("m_ts", Long.valueOf(c38321qM.A1B()));
                                A004.AAP("source_of_action", interfaceC60442pS.getModuleName());
                                A004.A8I("time_elapsed", Double.valueOf((c141596ac.A0A * c141596ac.A0B) / 1000.0d));
                                A004.A9K("reel_viewer_position", Long.valueOf(c141596ac.A0I));
                                A004.AAP("reel_type", reel2.A0H(userSession5));
                                if (reel2.A17(userSession5)) {
                                    i = reel2.A00;
                                } else {
                                    i = -1;
                                }
                                A004.A9K("carousel_opt_in_position", Long.valueOf(i));
                                A004.A7v("is_video_to_carousel", Boolean.valueOf(c37948Gmq.A07));
                                Context context2 = this.A01;
                                C0Zx c0Zx = new C0Zx();
                                InterfaceC138906Qw interfaceC138906Qw = c141596ac.A0S;
                                if (interfaceC138906Qw != null) {
                                    map = interfaceC138906Qw.BMV();
                                } else {
                                    map = null;
                                }
                                c0Zx.A03("is_showreel_native", Boolean.valueOf(AbstractC130925vf.A0f(A08)));
                                if (map != null && (str21 = (String) map.get("media_height")) != null) {
                                    d = Double.valueOf(Double.parseDouble(str21));
                                } else {
                                    d = null;
                                }
                                c0Zx.A04("media_height", d);
                                if (map != null && (str20 = (String) map.get("media_width")) != null) {
                                    d2 = Double.valueOf(Double.parseDouble(str20));
                                } else {
                                    d2 = null;
                                }
                                c0Zx.A04("media_width", d2);
                                if (map != null && (str19 = (String) map.get("caption_font_size")) != null) {
                                    d3 = Double.valueOf(Double.parseDouble(str19));
                                } else {
                                    d3 = null;
                                }
                                c0Zx.A04("caption_font_size", d3);
                                if (map != null && (str18 = (String) map.get("caption_position_start_x")) != null) {
                                    d4 = Double.valueOf(Double.parseDouble(str18));
                                } else {
                                    d4 = null;
                                }
                                c0Zx.A04("caption_position_start_x", d4);
                                if (map != null && (str17 = (String) map.get("caption_position_start_y")) != null) {
                                    d5 = Double.valueOf(Double.parseDouble(str17));
                                } else {
                                    d5 = null;
                                }
                                c0Zx.A04("caption_position_start_y", d5);
                                if (map != null && (str16 = (String) map.get("caption_line_height")) != null) {
                                    d6 = Double.valueOf(Double.parseDouble(str16));
                                } else {
                                    d6 = null;
                                }
                                c0Zx.A04("caption_line_height", d6);
                                if (map != null && (str15 = (String) map.get("caption_height")) != null) {
                                    d7 = Double.valueOf(Double.parseDouble(str15));
                                } else {
                                    d7 = null;
                                }
                                c0Zx.A04("caption_height", d7);
                                if (map != null && (str14 = (String) map.get("caption_width")) != null) {
                                    d8 = Double.valueOf(Double.parseDouble(str14));
                                } else {
                                    d8 = null;
                                }
                                c0Zx.A04("caption_width", d8);
                                if (map != null && (str13 = (String) map.get("is_caption_fully_displayed")) != null) {
                                    bool = Boolean.valueOf(Boolean.parseBoolean(str13));
                                } else {
                                    bool = null;
                                }
                                c0Zx.A03("is_caption_fully_displayed", bool);
                                if (map != null) {
                                    str = (String) map.get("background_color_bottom");
                                } else {
                                    str = null;
                                }
                                c0Zx.A06("background_color_bottom", str);
                                if (map != null) {
                                    str2 = (String) map.get("background_color_caption");
                                } else {
                                    str2 = null;
                                }
                                c0Zx.A06("background_color_caption", str2);
                                if (map != null) {
                                    str3 = (String) map.get("background_color_top");
                                } else {
                                    str3 = null;
                                }
                                c0Zx.A06("background_color_top", str3);
                                if (map != null) {
                                    str4 = (String) map.get("caption_background_color_alpha");
                                } else {
                                    str4 = null;
                                }
                                c0Zx.A06("caption_background_color_alpha", str4);
                                if (map != null && (str12 = (String) map.get("caption_num_char_showed")) != null) {
                                    l = Long.valueOf(Long.parseLong(str12));
                                } else {
                                    l = null;
                                }
                                c0Zx.A05("caption_num_char_showed", l);
                                if (map != null && (str11 = (String) map.get("caption_num_hashtags_showed")) != null) {
                                    l2 = Long.valueOf(Long.parseLong(str11));
                                } else {
                                    l2 = null;
                                }
                                c0Zx.A05("caption_num_hashtags_showed", l2);
                                if (map != null && (str10 = (String) map.get("caption_num_lines_showed")) != null) {
                                    l3 = Long.valueOf(Long.parseLong(str10));
                                } else {
                                    l3 = null;
                                }
                                c0Zx.A05("caption_num_lines_showed", l3);
                                if (map != null && (str9 = (String) map.get("caption_num_lines_total")) != null) {
                                    l4 = Long.valueOf(Long.parseLong(str9));
                                } else {
                                    l4 = null;
                                }
                                c0Zx.A05("caption_num_lines_total", l4);
                                if (map != null && (str8 = (String) map.get("caption_num_mentions_showed")) != null) {
                                    l5 = Long.valueOf(Long.parseLong(str8));
                                } else {
                                    l5 = null;
                                }
                                c0Zx.A05("caption_num_mentions_showed", l5);
                                if (map != null) {
                                    str5 = (String) map.get("caption_text_color");
                                } else {
                                    str5 = null;
                                }
                                c0Zx.A06("caption_text_color", str5);
                                if (map != null) {
                                    str6 = (String) map.get("headline_text_showed");
                                } else {
                                    str6 = null;
                                }
                                c0Zx.A06("headline_text_showed", str6);
                                c0Zx.A06("cta_color", c38321qM.A0C.getDominantColor());
                                c0Zx.A04("screen_density", Double.valueOf(AbstractC13880nE.A0I(context2).density));
                                c0Zx.A04("screen_height", Double.valueOf(AbstractC13880nE.A01(context2, AbstractC13880nE.A09(context2))));
                                c0Zx.A04("screen_width", Double.valueOf(AbstractC13880nE.A01(context2, AbstractC13880nE.A0A(context2))));
                                A004.AAQ(c0Zx, "media_layout");
                                boolean z = false;
                                if (c6yy != null) {
                                    z = true;
                                }
                                A004.A7v("is_acp_delivered", Boolean.valueOf(z));
                                A004.A7v("is_eof", c38321qM.A0C.CTu());
                                A004.AAP("inventory_source", c38321qM.A0C.BJN());
                                A004.AAP("story_ranking_token", c145826hf2.A0G);
                                A004.AAP("sponsored_label_text", AnonymousClass001.A0B(A08.A0a(userSession3)));
                                A004.A9K("ad_position_from_server", Long.valueOf(c37948Gmq.A04.A0E));
                                A004.A9K("reel_start_position", Long.valueOf(c37948Gmq.A00()));
                                A004.A9K("top_liker_count", AbstractC128985sJ.A02(userSession3, c38321qM));
                                A004.A8I("elapsed_time_since_last_item", Double.valueOf(-1.0d));
                                A004.A9K("dark_mode_state", Long.valueOf(AbstractC19730y1.A00(AbstractC12960li.A00).A00()));
                                if (C1H6.A03()) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                A004.A9K("is_dark_mode", Long.valueOf(j));
                                if (c38321qM.A58()) {
                                    l6 = Long.valueOf(c38321qM.A6p().length);
                                } else {
                                    l6 = null;
                                }
                                A004.A9K("sponsor_tag_count", l6);
                                A004.A7v("production_build", true);
                                if (c6yy != null) {
                                    l7 = Long.valueOf(c6yy.A04);
                                } else {
                                    l7 = null;
                                }
                                A004.A9K("reel_gap", l7);
                                if (c6yy != null) {
                                    l8 = Long.valueOf(c6yy.A0O);
                                } else {
                                    l8 = null;
                                }
                                A004.A9K("ad_request_position", l8);
                                if (c6yy != null) {
                                    l9 = Long.valueOf(c6yy.A0P);
                                } else {
                                    l9 = null;
                                }
                                A004.A9K("reel_viewer_entry_position", l9);
                                if (c6yy != null) {
                                    l10 = Long.valueOf(c6yy.A0N);
                                } else {
                                    l10 = null;
                                }
                                A004.A9K("ad_received_position", l10);
                                if (c6yy != null) {
                                    l11 = Long.valueOf(c6yy.A00);
                                } else {
                                    l11 = null;
                                }
                                A004.A9K("ad_consumed_media_gap", l11);
                                if (c6yy != null) {
                                    l12 = Long.valueOf(c6yy.A02);
                                } else {
                                    l12 = null;
                                }
                                A004.A9K("netego_consumed_media_gap", l12);
                                if (c6yy != null) {
                                    l13 = Long.valueOf(c6yy.A05);
                                } else {
                                    l13 = null;
                                }
                                A004.A9K("reel_gap_to_last_ad", l13);
                                if (c6yy != null) {
                                    l14 = Long.valueOf(c6yy.A06);
                                } else {
                                    l14 = null;
                                }
                                A004.A9K("reel_gap_to_last_netego", l14);
                                if (c6yy != null && (c40861ut8 = c6yy.A08) != null) {
                                    l15 = Long.valueOf(c40861ut8.A07());
                                } else {
                                    l15 = null;
                                }
                                A004.A9K("min_consumed_reel_gap_to_previous_ad", l15);
                                if (c6yy != null && (c40861ut7 = c6yy.A08) != null) {
                                    l16 = Long.valueOf(c40861ut7.A08());
                                } else {
                                    l16 = null;
                                }
                                A004.A9K("min_consumed_reel_gap_to_previous_netego", l16);
                                String[] A6p = c38321qM.A6p();
                                ArrayList arrayList = new ArrayList();
                                for (String str22 : A6p) {
                                    if (str22 != null && (A0k = AbstractC003100w.A0k(10, str22)) != null) {
                                        arrayList.add(A0k);
                                    }
                                }
                                A004.AAk("sponsor_tag_ids", arrayList);
                                if (c6yy != null) {
                                    l17 = Long.valueOf(c6yy.A01);
                                } else {
                                    l17 = null;
                                }
                                A004.A9K("consumed_media_gap", l17);
                                if (c6yy != null && (c40861ut6 = c6yy.A08) != null) {
                                    l18 = Long.valueOf(c40861ut6.A01());
                                } else {
                                    l18 = null;
                                }
                                A004.A9K("min_consumed_media_gap_to_previous_ad", l18);
                                if (c6yy != null && (c40861ut5 = c6yy.A08) != null) {
                                    l19 = Long.valueOf(c40861ut5.A02());
                                } else {
                                    l19 = null;
                                }
                                A004.A9K("min_consumed_media_gap_to_previous_netego", l19);
                                if (c6yy != null && (c40861ut4 = c6yy.A08) != null) {
                                    l20 = Long.valueOf(c40861ut4.A03());
                                } else {
                                    l20 = null;
                                }
                                A004.A9K("highest_position_rule", l20);
                                if (c6yy != null && (c40861ut3 = c6yy.A08) != null) {
                                    l21 = Long.valueOf(c40861ut3.A04());
                                } else {
                                    l21 = null;
                                }
                                A004.A9K("max_reel_gap_to_previous_item", l21);
                                if (c6yy != null) {
                                    l22 = Long.valueOf(c6yy.A03);
                                } else {
                                    l22 = null;
                                }
                                A004.A9K("priority_index", l22);
                                if (c6yy != null && (c40861ut2 = c6yy.A08) != null) {
                                    l23 = Long.valueOf(c40861ut2.A06());
                                } else {
                                    l23 = null;
                                }
                                A004.A9K("min_media_gap_to_previous_item", l23);
                                if (c6yy != null && (c40861ut = c6yy.A08) != null) {
                                    d9 = Double.valueOf(c40861ut.A00());
                                } else {
                                    d9 = null;
                                }
                                A004.A8I("time_gap_to_previous_item_in_sec", d9);
                                if (c6yy != null) {
                                    l24 = Long.valueOf(c6yy.A04);
                                } else {
                                    l24 = null;
                                }
                                A004.A9K("reel_gap_highest_position", l24);
                                if (c6yy != null) {
                                    l25 = Long.valueOf(c6yy.A01);
                                } else {
                                    l25 = null;
                                }
                                A004.A9K("consumed_media_gap_highest_position", l25);
                                if (c6yy != null && (c37881pR2 = c6yy.A07) != null) {
                                    str7 = c37881pR2.A02;
                                } else {
                                    str7 = null;
                                }
                                A004.AAP("ad_pod_id", str7);
                                if (c6yy != null && (c37881pR = c6yy.A07) != null) {
                                    l26 = Long.valueOf(c37881pR.A00);
                                } else {
                                    l26 = null;
                                }
                                A004.A9K("index_in_ad_pod", l26);
                                if (c6yy != null && (num4 = c6yy.A0A) != null) {
                                    l27 = Long.valueOf(num4.intValue());
                                } else {
                                    l27 = null;
                                }
                                A004.A9K("adpod_media_hp", l27);
                                if (c6yy != null && (num3 = c6yy.A0B) != null) {
                                    l28 = Long.valueOf(num3.intValue());
                                } else {
                                    l28 = null;
                                }
                                A004.A9K("adpod_reel_hp", l28);
                                if (c6yy != null && (num2 = c6yy.A09) != null) {
                                    l29 = Long.valueOf(num2.intValue());
                                } else {
                                    l29 = null;
                                }
                                A004.A9K("adpod_media_gap", l29);
                                if (c6yy != null && (num = c6yy.A0F) != null) {
                                    l30 = Long.valueOf(num.intValue());
                                } else {
                                    l30 = null;
                                }
                                A004.A9K("adpod_reel_gap", l30);
                                if (c6yy != null) {
                                    l31 = c6yy.A0H;
                                } else {
                                    l31 = null;
                                }
                                A004.A9K("num_ads_or_netegos_before_first_ad_pod", l31);
                                if (c6yy != null) {
                                    l32 = c6yy.A0J;
                                } else {
                                    l32 = null;
                                }
                                A004.A9K("num_ads_or_netegos_since_previous_ad_pod", l32);
                                A004.AAP("nav_chain", (String) A012.A01(C5I8.A62));
                                String str23 = (String) A012.A01(C5I8.A3c);
                                if (str23 != null) {
                                    l33 = AbstractC003100w.A0k(10, str23);
                                } else {
                                    l33 = null;
                                }
                                A004.A9K("hscroll_seed_ad_id", l33);
                                A004.AAP("intent_aware_ads_trigger_type", (String) A012.A01(C5I8.A3q));
                                A004.A7v("is_multi_ads", (Boolean) A012.A01(C5I8.A4W));
                                A004.A9K("multi_ads_type", (Long) A012.A01(C5I8.A5y));
                                A004.AAP("multi_ads_unit_id", (String) A012.A01(C5I8.A60));
                                if (AbstractC61652rS.A02(userSession3)) {
                                    A004.AAP("basic_ads_graphql_tier", AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession3)).toString());
                                    A004.AAP("basic_ads_launcher_tier", AbstractC61652rS.A00(userSession3).toString());
                                }
                                A004.Cht();
                                return;
                            }
                            return;
                        }
                        A00(c41551w4, c149726oP, "sub_impression");
                    }
                };
                this.A06 = new AbstractC64162vb(c1bx2, c145816he) { // from class: X.6iq
                    public final C145816he A00;

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.2t9] */
                    {
                        ?? obj = new Object();
                        this.A00 = c145816he;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Ai] */
                    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
                        long j;
                        String str;
                        Long l;
                        String str2;
                        ?? A1O;
                        C40971v4 c40971v4;
                        String str3;
                        Long l2;
                        Boolean bool;
                        String str4;
                        Integer num;
                        String str5;
                        Integer num2;
                        C41551w4 c41551w4 = (C41551w4) obj;
                        C14360o3.A0B(c41551w4, 0);
                        C145816he c145816he2 = this.A00;
                        if (c145816he2 != null) {
                            C18920wW c18920wW = c145816he2.A02;
                            ?? A003 = c18920wW.A00(c18920wW.A00, "instagram_ad_pivots_impression");
                            if (A003.isSampled()) {
                                InterfaceC101944i9 interfaceC101944i9 = c145816he2.A00;
                                if (interfaceC101944i9 != null) {
                                    j = interfaceC101944i9.CNR(c41551w4);
                                } else {
                                    j = 0;
                                }
                                A003.A9K("chaining_position", Long.valueOf(j));
                                C1M1 c1m1 = c145816he2.A04;
                                A003.AAP("chaining_session_id", c1m1.getSessionId());
                                A003.AAP("client_session_id", c1m1.getSessionId());
                                A003.AAP("contextual_ads_category", "");
                                A003.AAk("ad_ids", C145816he.A00(c41551w4));
                                A003.A9K("first_hscroll_item_ad_id", (Long) C145816he.A00(c41551w4).get(0));
                                A003.AAP("container_module", c145816he2.A01.getModuleName());
                                Reel reel = c41551w4.A0H;
                                IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
                                Long l3 = null;
                                if (intentAwareAdsInfo != null) {
                                    str = intentAwareAdsInfo.A09;
                                } else {
                                    str = null;
                                }
                                A003.AAP("trigger_type", str);
                                IntentAwareAdsInfo intentAwareAdsInfo2 = reel.A0B;
                                if (intentAwareAdsInfo2 != null && (num2 = intentAwareAdsInfo2.A02) != null) {
                                    l = Long.valueOf(num2.intValue());
                                } else {
                                    l = null;
                                }
                                A003.A9K("multi_ads_type_number", l);
                                IntentAwareAdsInfo intentAwareAdsInfo3 = reel.A0B;
                                if (intentAwareAdsInfo3 != null) {
                                    str2 = intentAwareAdsInfo3.A06;
                                } else {
                                    str2 = null;
                                }
                                A003.AAP("multi_ads_unit_id", str2);
                                List A0J = reel.A0J();
                                C14360o3.A07(A0J);
                                if (AbstractC130925vf.A0n(c41551w4)) {
                                    A1O = new ArrayList(AbstractC06950Ym.A1E(A0J, 10));
                                    Iterator it = A0J.iterator();
                                    while (it.hasNext()) {
                                        A1O.add(((C40971v4) it.next()).A0j);
                                    }
                                } else {
                                    String str6 = null;
                                    if ((!A0J.isEmpty()) && (c40971v4 = (C40971v4) AbstractC001800i.A0J(A0J)) != null) {
                                        str6 = c40971v4.A0j;
                                    }
                                    A1O = AbstractC16960so.A1O(str6);
                                }
                                A003.AAk("tracking_tokens", A1O);
                                IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
                                if (intentAwareAdsInfo4 != null) {
                                    str3 = intentAwareAdsInfo4.A04;
                                } else {
                                    str3 = null;
                                }
                                A003.AAP("insertion_mechanism", str3);
                                IntentAwareAdsInfo intentAwareAdsInfo5 = reel.A0B;
                                if (intentAwareAdsInfo5 != null && (str5 = intentAwareAdsInfo5.A07) != null) {
                                    l2 = AbstractC003100w.A0k(10, str5);
                                } else {
                                    l2 = null;
                                }
                                A003.A9K("hscroll_seed_ad_id", l2);
                                IntentAwareAdsInfo intentAwareAdsInfo6 = reel.A0B;
                                if (intentAwareAdsInfo6 != null) {
                                    bool = intentAwareAdsInfo6.A01;
                                } else {
                                    bool = null;
                                }
                                A003.A7v("is_seed_ad_multi_ads_eligible", bool);
                                IntentAwareAdsInfo intentAwareAdsInfo7 = reel.A0B;
                                if (intentAwareAdsInfo7 != null) {
                                    str4 = intentAwareAdsInfo7.A08;
                                } else {
                                    str4 = null;
                                }
                                A003.AAP("hscroll_seed_ad_tracking_token", str4);
                                IntentAwareAdsInfo intentAwareAdsInfo8 = reel.A0B;
                                if (intentAwareAdsInfo8 != null && (num = intentAwareAdsInfo8.A03) != null) {
                                    l3 = Long.valueOf(num.intValue());
                                }
                                A003.A9K("hscroll_seed_ad_position", l3);
                                A003.Cht();
                            }
                        }
                    }

                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
                    }
                };
                this.A0F = new C146546ir();
                this.A0D = new AbstractC64162vb(context, c1bx2, c146306iT) { // from class: X.6is
                    public final Context A00;

                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        /*
                            r3 = this;
                            X.6bS r2 = r6.A04
                            com.instagram.common.session.UserSession r1 = r6.A01
                            X.6it r0 = new X.6it
                            r0.<init>()
                            r3.<init>(r5, r0)
                            r3.A00 = r4
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C146556is.<init>(android.content.Context, X.1BX, X.6iT):void");
                    }

                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
                    }

                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
                    }
                };
                final InterfaceC60442pS interfaceC60442pS = c146306iT.A02;
                this.A04 = interfaceC60442pS;
                if (A062 && !C18U.A06(c06090Tz, userSession2, 36313424503375864L)) {
                    final C1BX c1bx3 = AbstractC62712tA.A00(userSession2).A00.A00;
                    C14360o3.A07(c1bx3);
                    final ?? obj = new Object();
                    final InterfaceC63482uV A003 = AbstractC63462uT.A00(userSession2);
                    this.A02 = new AbstractC63592ug(c1bx3, userSession2, interfaceC60442pS, A003, obj, c146306iT) { // from class: X.6iu
                        public final C146306iT A00;
                        public final C1BX A01;
                        public final C63452uS A02;

                        /* JADX WARN: Illegal instructions before constructor call */
                        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.2t9] */
                        {
                            /*
                                r11 = this;
                                r0 = 6
                                r6 = r15
                                X.C14360o3.A0B(r15, r0)
                                X.6bW r4 = new X.6bW
                                r4.<init>()
                                X.0Tz r2 = X.C06090Tz.A05
                                r0 = 36317444591588520(0x810686000814a8, double:3.030636426107467E-306)
                                r3 = r13
                                boolean r0 = X.C18U.A06(r2, r13, r0)
                                if (r0 == 0) goto L34
                                boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
                                if (r0 == 0) goto L34
                                r8 = 0
                            L20:
                                r10 = 0
                                r7 = 912(0x390, float:1.278E-42)
                                r1 = r11
                                r2 = r12
                                r5 = r14
                                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10)
                                r11.A01 = r12
                                r0 = r17
                                r11.A00 = r0
                                r0 = r16
                                r11.A02 = r0
                                return
                            L34:
                                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
                                r0 = 1
                                long r8 = r2.toMillis(r0)
                                goto L20
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C146576iu.<init>(X.1BX, com.instagram.common.session.UserSession, X.2pS, X.2uV, X.2uS, X.6iT):void");
                        }

                        @Override // X.AbstractC63592ug
                        public final String A03() {
                            return "";
                        }

                        @Override // X.AbstractC63592ug
                        public final /* bridge */ /* synthetic */ C82713mZ A01(Object obj2, Object obj3) {
                            Long l;
                            List C1L;
                            List A004;
                            C38491qd c38491qd;
                            String str;
                            C41181vS c41181vS = (C41181vS) obj2;
                            C149716oO c149716oO = (C149716oO) obj3;
                            C14360o3.A0B(c41181vS, 0);
                            InterfaceC60442pS interfaceC60442pS2 = this.A07;
                            C82713mZ A02 = AbstractC37955Gmx.A02(this.A04, interfaceC60442pS2, c41181vS, "impression");
                            A02.A02();
                            boolean z = true;
                            A02.A1w = true;
                            if (c149716oO != null) {
                                C3R6.A08(A02, c41181vS, c149716oO, this.A00);
                                C41551w4 c41551w4 = c149716oO.A00;
                                if (!c41551w4.A06 && c149716oO.A02.A00 >= 0.25d) {
                                    c41551w4.A06 = true;
                                } else {
                                    z = false;
                                }
                                A02.A1m = Boolean.valueOf(z);
                            }
                            A02.A1B = Boolean.valueOf(c41181vS.A11());
                            String str2 = C1QM.A00.A02.A00;
                            if (str2 != null) {
                                A02.A6C = str2;
                            }
                            A02.A1Y = Boolean.valueOf(c41181vS.A1K());
                            if (c149716oO != null && (c38491qd = c149716oO.A00.A0H.A0M) != null && (str = c38491qd.A0X) != null) {
                                A02.A6g = str;
                            }
                            A02.A2J = Double.valueOf(TimeUnit.MILLISECONDS.toSeconds(AbstractC23021Ah.A00(r1).A01.getLong("last_stories_tray_request_timestamp", -1L)));
                            if (c149716oO != null) {
                                C141596ac c141596ac = c149716oO.A02;
                                A02.A1e = Boolean.valueOf(c141596ac.A0l);
                                A02.A2b = Double.valueOf(c141596ac.A03);
                                A02.A2c = Double.valueOf((c141596ac.A0A / 1000.0d) - ((c141596ac.A0B * r1) / 1000.0d));
                            }
                            A02.A03();
                            C38321qM c38321qM = c41181vS.A0b;
                            if (c38321qM != null && (C1L = c38321qM.A0C.C1L()) != null && (A004 = AbstractC50567MTy.A00(C1L)) != null) {
                                l = Long.valueOf(A004.size());
                            } else {
                                l = null;
                            }
                            A02.A42 = l;
                            return A02;
                        }

                        @Override // X.AbstractC63592ug
                        public final String A02() {
                            return null;
                        }

                        @Override // X.AbstractC63592ug
                        public final String A04() {
                            return "story";
                        }
                    };
                }
                if (A06) {
                    this.A00 = new C39168HLw(context, c1bx2, userSession2, interfaceC60442pS, AbstractC63462uT.A00(userSession2), c145796hc, c146306iT);
                }
                if (A063) {
                    final ?? obj2 = new Object();
                    final InterfaceC63482uV A004 = AbstractC63462uT.A00(userSession2);
                    this.A01 = new AbstractC63592ug(context, c1bx2, userSession2, interfaceC60442pS, A004, obj2) { // from class: X.6iv
                        public final Context A00;
                        public final boolean A01;
                        public final C63452uS A02;

                        /* JADX WARN: Illegal instructions before constructor call */
                        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.2t9] */
                        {
                            /*
                                r13 = this;
                                r12 = 1
                                r0 = 7
                                r8 = r18
                                X.C14360o3.A0B(r8, r0)
                                X.6bX r6 = new X.6bX
                                r6.<init>()
                                r10 = 0
                                r9 = 432(0x1b0, float:6.05E-43)
                                r3 = r13
                                r4 = r15
                                r5 = r16
                                r7 = r17
                                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12)
                                r0 = r19
                                r13.A02 = r0
                                r13.A00 = r14
                                X.0Tz r2 = X.C06090Tz.A05
                                r0 = 36318883405568761(0x8107d500071af9, double:3.0315463378622105E-306)
                                boolean r0 = X.C18U.A06(r2, r5, r0)
                                r13.A01 = r0
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C146586iv.<init>(android.content.Context, X.1BX, com.instagram.common.session.UserSession, X.2pS, X.2uV, X.2uS):void");
                        }

                        @Override // X.AbstractC63592ug
                        public final String A03() {
                            return "";
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.AbstractC63592ug
                        public final /* bridge */ /* synthetic */ C82713mZ A01(Object obj3, Object obj4) {
                            Boolean bool;
                            String str;
                            C41181vS c41181vS = (C41181vS) obj3;
                            C14360o3.A0B(c41181vS, 0);
                            if (this.A01) {
                                C28091Xn A005 = C28071Xl.A00(this.A00, this.A04);
                                String str2 = c41181vS.A0j;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                bool = Boolean.valueOf(A005.A03(AnonymousClass001.A0R("NETEGO_VPV_KEY_PREFIX", str2)));
                            } else {
                                bool = null;
                            }
                            String str3 = c41181vS.A0j;
                            C14360o3.A07(str3);
                            String A0T = c41181vS.A0T();
                            InterfaceC60442pS interfaceC60442pS2 = this.A07;
                            C125225lT c125225lT = new C125225lT(null, str3, null == true ? 1 : 0, null == true ? 1 : 0, A0T, interfaceC60442pS2.getModuleName(), 64478);
                            EnumC41231vY enumC41231vY = c41181vS.A0e;
                            if (enumC41231vY == EnumC41231vY.A0A) {
                                str = "NETEGO_BAKEOFF";
                            } else {
                                C105844pv c105844pv = c41181vS.A0f;
                                if (c105844pv != null) {
                                    c125225lT.A03 = "NETEGO_AD4AD_IN_STORY";
                                    InterfaceC37861pP interfaceC37861pP = c105844pv.A00;
                                    String AYe = interfaceC37861pP.AYe();
                                    if (AYe == null) {
                                        AYe = "";
                                    }
                                    c125225lT.A01 = AYe;
                                    String CAR = interfaceC37861pP.CAR();
                                    if (CAR == null) {
                                        CAR = "";
                                    }
                                    c125225lT.A02 = CAR;
                                } else if (c41181vS.A1V()) {
                                    c125225lT.A03 = "NETEGO_SUGGESTED_USERS";
                                    C104294ms c104294ms = c41181vS.A09;
                                    if (c104294ms != null) {
                                        C38661qx c38661qx = c104294ms.A00;
                                        c125225lT.A02 = c38661qx.A06;
                                        c125225lT.A04 = c38661qx.A04;
                                        c125225lT.A01 = c38661qx.A03;
                                    }
                                } else if (c41181vS.A1T()) {
                                    str = "NETEGO_SUGGESTED_CLIPS";
                                } else if (c41181vS.A1U()) {
                                    str = "NETEGO_RECON_PRODUCTS_FOR_YOU";
                                } else if (enumC41231vY == EnumC41231vY.A0O) {
                                    str = "NETEGO_RECON_CONTINUE_SHOPPING";
                                } else if (enumC41231vY == EnumC41231vY.A0B) {
                                    str = "NETEGO_BLOKS";
                                } else if (c41181vS.A1R()) {
                                    str = "NETEGO_TRENDING_PROMPTS_IN_STORY";
                                } else if (enumC41231vY == EnumC41231vY.A0J) {
                                    str = "NETEGO_STORY_CREATION_UPSELL";
                                } else if (enumC41231vY == EnumC41231vY.A0F) {
                                    str = "NETEGO_QUALITY_SURVEY";
                                } else if (enumC41231vY == EnumC41231vY.A0D) {
                                    str = "NETEGO_INSIGHTS_GROWTH";
                                } else if (enumC41231vY == EnumC41231vY.A0C) {
                                    str = "NETEGO_IG_ADS_CONSENT_GROWTH";
                                }
                                C82713mZ A02 = AbstractC37955Gmx.A02(this.A04, interfaceC60442pS2, c41181vS, "impression");
                                A02.A02();
                                A02.A1w = true;
                                A02.A0w = c125225lT;
                                A02.A14 = bool;
                                return A02;
                            }
                            c125225lT.A03 = str;
                            C82713mZ A022 = AbstractC37955Gmx.A02(this.A04, interfaceC60442pS2, c41181vS, "impression");
                            A022.A02();
                            A022.A1w = true;
                            A022.A0w = c125225lT;
                            A022.A14 = bool;
                            return A022;
                        }

                        @Override // X.AbstractC63592ug
                        public final String A02() {
                            return null;
                        }

                        @Override // X.AbstractC63592ug
                        public final String A04() {
                            return "story_netego";
                        }

                        @Override // X.AbstractC63592ug
                        public final /* bridge */ /* synthetic */ void A05(Context context2, InterfaceC82553mJ interfaceC82553mJ, Object obj3, String str) {
                            C41181vS c41181vS = (C41181vS) obj3;
                            if (this.A01 && c41181vS != null) {
                                Context context3 = this.A00;
                                String str2 = c41181vS.A0j;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                super.A05(context3, interfaceC82553mJ, c41181vS, str2);
                            }
                        }
                    };
                }
            }
        }, new InterfaceC146366iZ(c146306iT) { // from class: X.6iw
            public final InterfaceC60442pS A00;
            public final C146606ix A01;

            @Override // X.InterfaceC146366iZ
            public final void ABi(C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
            }

            @Override // X.InterfaceC146366iZ
            public final void ABk(C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
            }

            @Override // X.InterfaceC146366iZ
            public final void ABn(View view, C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(c41181vS, 1);
                C14360o3.A0B(c59072n8, 3);
                if (AbstractC75423a9.A02(c41181vS, this.A00)) {
                    c59072n8.A00(this.A01);
                }
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.6ix] */
            {
                this.A01 = new InterfaceC43071ya(c146306iT) { // from class: X.6ix
                    public final UserSession A00;
                    public final InterfaceC60442pS A01;
                    public final C146306iT A02;
                    public final Map A03 = new HashMap();

                    @Override // X.InterfaceC43071ya
                    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                        C14360o3.A0B(c59062n7, 0);
                        C14360o3.A0B(interfaceC57162jr, 1);
                        float CGk = interfaceC57162jr.CGk(c59062n7);
                        long BmE = interfaceC57162jr.BmE();
                        C41181vS c41181vS = (C41181vS) c59062n7.A03;
                        Object obj = c59062n7.A04;
                        C149716oO c149716oO = (C149716oO) obj;
                        boolean z = c149716oO.A02.A18;
                        C14360o3.A0A(c41181vS);
                        C14360o3.A06(obj);
                        UserSession userSession2 = this.A00;
                        String A0g = AnonymousClass001.A0g(c41181vS.BzL(userSession2), c41181vS.A0j, "viewport");
                        boolean z2 = false;
                        if (Float.compare(CGk, 0.99f) > 0) {
                            z2 = true;
                        }
                        Map map = this.A03;
                        boolean containsKey = map.containsKey(A0g);
                        if (!z2) {
                            if (containsKey) {
                                Object obj2 = map.get(A0g);
                                if (obj2 != null) {
                                    long j = BmE - ((C138226Od) obj2).A00;
                                    InterfaceC60442pS interfaceC60442pS = this.A01;
                                    C146306iT c146306iT2 = this.A02;
                                    C138356Or A002 = AbstractC138346Oq.A00(interfaceC60442pS, c149716oO.A00.A0H, c146306iT2.A03);
                                    C82713mZ A02 = AbstractC37955Gmx.A02(userSession2, A002, c41181vS, "viewability");
                                    C3R6.A08(A02, c41181vS, c149716oO, c146306iT2);
                                    A02.A02();
                                    A02.A01 = ((float) j) / 1000.0f;
                                    A02.A0U = 100;
                                    A02.A7Y = "viewport";
                                    A02.A1Z = Boolean.valueOf(z);
                                    C32U.A0I(userSession2, A02, A002, C05F.A01);
                                    map.remove(A0g);
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            return;
                        }
                        if (containsKey) {
                            return;
                        }
                        map.put(A0g, new C138226Od(c41181vS, "viewport", BmE, z));
                    }

                    {
                        this.A02 = c146306iT;
                        this.A01 = c146306iT.A02;
                        this.A00 = c146306iT.A01;
                    }
                };
                this.A00 = c146306iT.A02;
            }
        }, new InterfaceC146366iZ(c146306iT) { // from class: X.6iy
            public final C146636j0 A00;
            public final C146646j1 A01;

            @Override // X.InterfaceC146366iZ
            public final void ABi(C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(c59072n8, 2);
                c59072n8.A00(this.A00);
                if (c59072n82 != null) {
                    c59072n82.A00(this.A01);
                }
            }

            @Override // X.InterfaceC146366iZ
            public final void ABk(C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(c59072n8, 2);
                c59072n8.A00(this.A00);
                if (c59072n82 != null) {
                    c59072n82.A00(this.A01);
                }
            }

            @Override // X.InterfaceC146366iZ
            public final void ABn(View view, C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(c59072n8, 3);
                c59072n8.A00(this.A00);
                if (c59072n82 != null) {
                    c59072n82.A00(this.A01);
                }
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.6j0] */
            /* JADX WARN: Type inference failed for: r0v1, types: [X.6j1] */
            {
                final C146626iz c146626iz = new C146626iz();
                this.A00 = new InterfaceC43071ya(c146626iz) { // from class: X.6j0
                    public final C146626iz A00;

                    @Override // X.InterfaceC43071ya
                    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                        String str;
                        C14360o3.A0B(c59062n7, 0);
                        C14360o3.A0B(interfaceC57162jr, 1);
                        Integer CFq = interfaceC57162jr.CFq(c59062n7);
                        C14360o3.A07(CFq);
                        if (CFq == C05F.A00) {
                            C146626iz c146626iz2 = this.A00;
                            Object obj = c59062n7.A03;
                            C14360o3.A06(obj);
                            C41181vS c41181vS = (C41181vS) obj;
                            C41551w4 c41551w4 = ((C149716oO) c59062n7.A04).A00;
                            C14360o3.A0B(c41181vS, 0);
                            c146626iz2.A00.A00(c41181vS, c41551w4);
                            return;
                        }
                        if (CFq != C05F.A0C) {
                            return;
                        }
                        C146626iz c146626iz3 = this.A00;
                        Object obj2 = c59062n7.A03;
                        C41181vS c41181vS2 = (C41181vS) obj2;
                        if (c41181vS2.A0P) {
                            User user = c41181vS2.A0i;
                            if (user != null) {
                                str = user.getId();
                            } else {
                                str = null;
                            }
                            c146626iz3.A01.put(AnonymousClass001.A0R("highlightRewind:", str), c59062n7);
                        } else {
                            c146626iz3.A01.put(c41181vS2.A0k, c59062n7);
                        }
                        C145856hi c145856hi = c146626iz3.A00;
                        C14360o3.A06(obj2);
                        c145856hi.A01(c41181vS2, ((C149716oO) c59062n7.A04).A02);
                    }

                    {
                        this.A00 = c146626iz;
                    }
                };
                this.A01 = new InterfaceC43071ya(c146306iT, c146626iz) { // from class: X.6j1
                    public final UserSession A00;
                    public final C146306iT A01;
                    public final C146626iz A02;

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0124  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x016e  */
                    @Override // X.InterfaceC43071ya
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void ATP(X.C59062n7 r46, X.InterfaceC57162jr r47) {
                        /*
                            Method dump skipped, instructions count: 937
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C146646j1.ATP(X.2n7, X.2jr):void");
                    }

                    {
                        this.A01 = c146306iT;
                        this.A02 = c146626iz;
                        this.A00 = c146306iT.A01;
                    }
                };
            }
        }, new InterfaceC146366iZ(c146306iT) { // from class: X.6j2
            public final UserSession A00;
            public final C146306iT A01;
            public final C146666j3 A02;
            public final C146686j6 A03;

            @Override // X.InterfaceC146366iZ
            public final void ABi(C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
            }

            @Override // X.InterfaceC146366iZ
            public final void ABk(C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
            
                if (r9.mBrandResearchSurvey == null) goto L13;
             */
            @Override // X.InterfaceC146366iZ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ABn(android.view.View r6, X.C59072n8 r7, X.C59072n8 r8, X.C41181vS r9, X.C41551w4 r10) {
                /*
                    r5 = this;
                    r0 = 0
                    X.C14360o3.A0B(r6, r0)
                    r0 = 1
                    X.C14360o3.A0B(r9, r0)
                    r0 = 3
                    X.C14360o3.A0B(r7, r0)
                    X.6iT r0 = r5.A01
                    X.2pS r0 = r0.A02
                    boolean r0 = X.AbstractC75423a9.A02(r9, r0)
                    if (r0 == 0) goto L5d
                    com.instagram.common.session.UserSession r3 = r5.A00
                    X.0Tz r2 = X.C06090Tz.A05
                    r0 = 36310804571619634(0x81007c00000132, double:3.0264372507419294E-306)
                    boolean r0 = X.C18U.A06(r2, r3, r0)
                    if (r0 == 0) goto L48
                    X.6j3 r4 = r5.A02
                    X.1vY r1 = r9.A0e
                    X.1vY r0 = X.EnumC41231vY.A09
                    if (r1 != r0) goto L40
                    X.1qM r0 = r9.A0b
                    r0.getClass()
                    com.instagram.model.reels.sponsored.AutoGeneratedCardType r1 = com.instagram.model.reels.sponsored.AutoGeneratedCardType.A0F
                    X.1rF r0 = r0.A0C
                    com.instagram.model.reels.sponsored.AutoGeneratedCardType r0 = r0.AeF()
                    if (r1 == r0) goto L40
                    X.1qi r0 = r9.mBrandResearchSurvey
                    if (r0 == 0) goto L45
                L40:
                    java.util.Map r0 = r4.A04
                    r0.put(r9, r6)
                L45:
                    r7.A00(r4)
                L48:
                    r0 = 36315133898787879(0x81046c00020c27, double:3.029175134675929E-306)
                    boolean r0 = X.C18U.A06(r2, r3, r0)
                    if (r0 == 0) goto L5d
                    X.6j6 r1 = r5.A03
                    java.util.Map r0 = r1.A00
                    r0.put(r9, r6)
                    r7.A00(r1)
                L5d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C146656j2.ABn(android.view.View, X.2n8, X.2n8, X.1vS, X.1w4):void");
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.6j6] */
            {
                this.A01 = c146306iT;
                final UserSession userSession2 = c146306iT.A01;
                this.A00 = userSession2;
                final InterfaceC60442pS interfaceC60442pS = c146306iT.A02;
                this.A02 = new C146666j3(userSession2, interfaceC60442pS);
                this.A03 = new AbstractC64292vo(userSession2, interfaceC60442pS) { // from class: X.6j6
                    public final C18920wW A00;
                    public final UserSession A01;
                    public final InterfaceC60442pS A02;

                    @Override // X.InterfaceC43071ya
                    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                        String str;
                        C0Zx c0Zx;
                        String str2;
                        Object obj;
                        Object obj2;
                        Object obj3;
                        Object obj4;
                        Object obj5;
                        C14360o3.A0B(c59062n7, 0);
                        C14360o3.A0B(interfaceC57162jr, 1);
                        Object obj6 = c59062n7.A03;
                        C41181vS c41181vS = (C41181vS) obj6;
                        String str3 = c41181vS.A0j;
                        C14360o3.A07(str3);
                        C115785Lr c115785Lr = (C115785Lr) C115775Lq.A02.get(str3);
                        if (interfaceC57162jr.CFq(c59062n7) == C05F.A0C) {
                            if (c115785Lr != null && (!c115785Lr.A01.isEmpty())) {
                                C141596ac c141596ac = ((C149716oO) c59062n7.A04).A02;
                                double d = c141596ac.A00 - c141596ac.A03;
                                Map map = C115775Lq.A01;
                                if (!map.containsKey(str3)) {
                                    map.put(str3, new HashMap());
                                }
                                AbstractMap abstractMap = (AbstractMap) map.get(str3);
                                if (abstractMap != null) {
                                    abstractMap.put("dwell_time", Double.valueOf(d));
                                }
                                float f = c141596ac.A0A;
                                if (!map.containsKey(str3)) {
                                    map.put(str3, new HashMap());
                                }
                                AbstractMap abstractMap2 = (AbstractMap) map.get(str3);
                                if (abstractMap2 != null) {
                                    abstractMap2.put("end_scene_start_time_in_seconds", Double.valueOf(f / 1000.0d));
                                }
                                C14360o3.A06(obj6);
                                Map A02 = AbstractC77703du.A02(str3);
                                if (!A02.isEmpty()) {
                                    C18920wW c18920wW = this.A00;
                                    InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_rendering_validation_automatic");
                                    if (A002.isSampled()) {
                                        C38321qM c38321qM = c41181vS.A0b;
                                        String str4 = null;
                                        if (c38321qM != null) {
                                            str = AbstractC41071vF.A07(this.A01, c38321qM);
                                        } else {
                                            str = null;
                                        }
                                        C115775Lq c115775Lq = C115775Lq.A00;
                                        List A022 = C115775Lq.A02(str3);
                                        ArrayList A07 = c115775Lq.A07(str3);
                                        C0Zx c0Zx2 = new C0Zx();
                                        if (A07 != null && !A07.isEmpty()) {
                                            c0Zx2.A07("client_cop_options", A022);
                                            c0Zx2.A07("server_cop_options", A07);
                                            c0Zx2.A04("dwell_time", C115775Lq.A01(str3));
                                            AbstractMap abstractMap3 = (AbstractMap) map.get(str3);
                                            Object obj7 = null;
                                            if (abstractMap3 != null) {
                                                obj = abstractMap3.get("is_end_scene_in_server_options");
                                            } else {
                                                obj = null;
                                            }
                                            if (obj instanceof Boolean) {
                                                obj7 = obj;
                                            }
                                            if (C14360o3.A0K(obj7, true)) {
                                                Double d2 = null;
                                                Object obj8 = null;
                                                d2 = null;
                                                if (map.containsKey(str3)) {
                                                    AbstractMap abstractMap4 = (AbstractMap) map.get(str3);
                                                    if (abstractMap4 != null) {
                                                        obj5 = abstractMap4.get("end_scene_duration");
                                                    } else {
                                                        obj5 = null;
                                                    }
                                                    if (obj5 instanceof Double) {
                                                        AbstractMap abstractMap5 = (AbstractMap) map.get(str3);
                                                        if (abstractMap5 != null) {
                                                            obj8 = abstractMap5.get("end_scene_duration");
                                                        }
                                                        C14360o3.A0C(obj8, "null cannot be cast to non-null type kotlin.Double");
                                                        d2 = (Double) obj8;
                                                    }
                                                }
                                                c0Zx2.A04("end_scene_duration", d2);
                                                Double d3 = null;
                                                Object obj9 = null;
                                                d3 = null;
                                                if (map.containsKey(str3)) {
                                                    AbstractMap abstractMap6 = (AbstractMap) map.get(str3);
                                                    if (abstractMap6 != null) {
                                                        obj4 = abstractMap6.get("end_scene_start_time_in_seconds");
                                                    } else {
                                                        obj4 = null;
                                                    }
                                                    if (obj4 instanceof Double) {
                                                        AbstractMap abstractMap7 = (AbstractMap) map.get(str3);
                                                        if (abstractMap7 != null) {
                                                            obj9 = abstractMap7.get("end_scene_start_time_in_seconds");
                                                        }
                                                        C14360o3.A0C(obj9, "null cannot be cast to non-null type kotlin.Double");
                                                        d3 = (Double) obj9;
                                                    }
                                                }
                                                c0Zx2.A04("end_scene_start_time", d3);
                                            }
                                            AbstractMap abstractMap8 = (AbstractMap) map.get(str3);
                                            Object obj10 = null;
                                            if (abstractMap8 != null) {
                                                obj2 = abstractMap8.get("is_v2c_in_server_options");
                                            } else {
                                                obj2 = null;
                                            }
                                            if (obj2 instanceof Boolean) {
                                                obj10 = obj2;
                                            }
                                            if (C14360o3.A0K(obj10, true)) {
                                                ArrayList arrayList = null;
                                                if (map.containsKey(str3)) {
                                                    AbstractMap abstractMap9 = (AbstractMap) map.get(str3);
                                                    if (abstractMap9 != null) {
                                                        obj3 = abstractMap9.get("video_to_carousel_start_times");
                                                    } else {
                                                        obj3 = null;
                                                    }
                                                    if ((obj3 instanceof ArrayList) && (!((Collection) obj3).isEmpty())) {
                                                        Iterable iterable = (Iterable) obj3;
                                                        ArrayList arrayList2 = new ArrayList();
                                                        for (Object obj11 : iterable) {
                                                            if (obj11 instanceof Double) {
                                                                arrayList2.add(obj11);
                                                            }
                                                        }
                                                        if (arrayList2.size() == ((AbstractCollection) obj3).size()) {
                                                            arrayList = new ArrayList();
                                                            for (Object obj12 : iterable) {
                                                                if (obj12 instanceof Double) {
                                                                    arrayList.add(obj12);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                c0Zx2.A07("video_to_carousel_card_start_times", arrayList);
                                            }
                                        }
                                        C0Zx A003 = C115775Lq.A00(str3);
                                        C0Zx c0Zx3 = (C0Zx) C115775Lq.A07.get(str3);
                                        if (c0Zx3 == null) {
                                            c0Zx3 = new C0Zx();
                                        }
                                        UserSession userSession3 = this.A01;
                                        if (C18U.A06(C06090Tz.A05, userSession3, 36315133899443249L)) {
                                            c0Zx = (C0Zx) C115775Lq.A04.get(str3);
                                        } else {
                                            c0Zx = null;
                                        }
                                        String str5 = "";
                                        if (str == null) {
                                            str = "";
                                        }
                                        A002.AAP("ad_id", str);
                                        User user = c41181vS.A0i;
                                        if (user == null) {
                                            str2 = "";
                                        } else {
                                            str2 = user.getId();
                                        }
                                        A002.AAP("a_pk", str2);
                                        A002.AAP("m_pk", str3);
                                        String BzL = c41181vS.BzL(userSession3);
                                        if (BzL == null) {
                                            BzL = "";
                                        }
                                        A002.AAP("tracking_token", BzL);
                                        String moduleName = this.A02.getModuleName();
                                        if (moduleName != null) {
                                            str5 = moduleName;
                                        }
                                        A002.AAP("source_of_action", str5);
                                        A002.AAP("fb_locale", C1Q2.A00());
                                        A002.AAP("country", C1Q2.A02().getCountry());
                                        EnumC40111tc A0C = c41181vS.A0C();
                                        if (A0C != null) {
                                            str4 = A0C.name();
                                        }
                                        A002.AAP("media_type", str4);
                                        A002.A9M("pc_component_dict_new", A02);
                                        A002.A7v("is_dark_mode", Boolean.valueOf(C1H6.A03()));
                                        A002.AAQ(c0Zx2, "creative_optimizations");
                                        A002.AAQ(A003, "layout_info");
                                        A002.AAQ(c0Zx3, "showreel_template_info");
                                        if (c0Zx != null) {
                                            A002.AAQ(c0Zx, "lead_gen_info");
                                        }
                                        A002.Cht();
                                    }
                                }
                            }
                            C115775Lq.A03(str3);
                            return;
                        }
                        A02(c59062n7, interfaceC57162jr, str3, false);
                    }

                    {
                        super(userSession2);
                        this.A01 = userSession2;
                        this.A02 = interfaceC60442pS;
                        this.A00 = AbstractC12220kQ.A00(interfaceC60442pS, C12180kM.A05, userSession2);
                    }
                };
            }
        }, new InterfaceC146366iZ(c146306iT) { // from class: X.6j7
            public final C142186bb A00;
            public final C142176ba A01;
            public final C142166bZ A02;

            @Override // X.InterfaceC146366iZ
            public final void ABi(C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(c59072n8, 2);
                c59072n8.A00(this.A00);
            }

            @Override // X.InterfaceC146366iZ
            public final void ABk(C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(c59072n8, 2);
                c59072n8.A00(this.A01);
            }

            @Override // X.InterfaceC146366iZ
            public final void ABn(View view, C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(c41551w4, 2);
                C14360o3.A0B(c59072n8, 3);
                if (!AbstractC141736aq.A02(c41551w4)) {
                    c59072n8.A00(this.A02);
                }
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.6j8, X.6bZ] */
            /* JADX WARN: Type inference failed for: r0v1, types: [X.6ba, X.6j8] */
            /* JADX WARN: Type inference failed for: r0v2, types: [X.6j8, X.6bb] */
            {
                this.A02 = new AbstractC146716j9(c146306iT) { // from class: X.6j8
                    public final C146306iT A00;

                    {
                        super(c146306iT);
                        this.A00 = c146306iT;
                    }
                };
                this.A01 = new AbstractC146716j9(c146306iT) { // from class: X.6j8
                    public final C146306iT A00;

                    {
                        super(c146306iT);
                        this.A00 = c146306iT;
                    }
                };
                this.A00 = new AbstractC146716j9(c146306iT) { // from class: X.6j8
                    public final C146306iT A00;

                    {
                        super(c146306iT);
                        this.A00 = c146306iT;
                    }
                };
            }
        }, new InterfaceC146366iZ(interfaceC146336iW, c146306iT) { // from class: X.6jA
            public final InterfaceC43071ya A00;
            public final InterfaceC43071ya A01;

            @Override // X.InterfaceC146366iZ
            public final void ABi(C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
            }

            @Override // X.InterfaceC146366iZ
            public final void ABk(C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(c59072n8, 2);
                c59072n8.A00(this.A00);
            }

            @Override // X.InterfaceC146366iZ
            public final void ABn(View view, C59072n8 c59072n8, C59072n8 c59072n82, C41181vS c41181vS, C41551w4 c41551w4) {
                C14360o3.A0B(c59072n8, 3);
                c59072n8.A00(this.A01);
            }

            {
                C146736jB c146736jB = C142196bc.A08;
                UserSession userSession2 = c146306iT.A01;
                this.A01 = c146736jB.A00(userSession2, interfaceC146336iW, C05F.A00);
                this.A00 = c146736jB.A00(userSession2, interfaceC146336iW, C05F.A01);
            }
        });
        InterfaceC60442pS interfaceC60442pS = c146306iT.A02;
        this.A02 = c57112jm;
        this.A01 = userSession;
        this.A04 = interfaceC60442pS;
        this.A03 = new C63622uj();
        this.A07 = new C146756jD(A00);
        this.A05 = new C146786jG(new InterfaceC146776jF() { // from class: X.6jE
            @Override // X.InterfaceC146776jF
            public final void DNe(InterfaceC43071ya interfaceC43071ya, C41181vS c41181vS, C149716oO c149716oO) {
                C14360o3.A0B(c41181vS, 1);
                C14360o3.A0B(c149716oO, 2);
                C146316iU.this.A00(interfaceC43071ya, c41181vS, c149716oO.A02);
            }

            @Override // X.InterfaceC146776jF
            public final void DNw(InterfaceC43071ya interfaceC43071ya, C41181vS c41181vS, C149716oO c149716oO) {
                java.util.Set set;
                C14360o3.A0B(c149716oO, 2);
                C146316iU c146316iU2 = C146316iU.this;
                C141596ac c141596ac = c149716oO.A02;
                Map map = c146316iU2.A00;
                if (!map.containsKey(c141596ac)) {
                    set = new HashSet();
                    map.put(c141596ac, set);
                } else {
                    set = (java.util.Set) map.get(c141596ac);
                }
                set.add(interfaceC43071ya);
            }
        });
        this.A06 = new C146796jH(userSession);
        this.A08 = A01;
        this.A09 = new HashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (r25.A0g == null) goto L9;
     */
    /* JADX WARN: Type inference failed for: r15v5, types: [X.36W, X.2n8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.view.View r23, X.InterfaceC43071ya r24, X.C41181vS r25, X.C41551w4 r26, X.C141596ac r27, java.lang.Integer r28, int r29) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146346iX.A00(android.view.View, X.1ya, X.1vS, X.1w4, X.6ac, java.lang.Integer, int):void");
    }

    @Override // X.InterfaceC61522rF
    public final void A8m(InterfaceC673231x interfaceC673231x) {
        C14360o3.A0B(interfaceC673231x, 0);
        this.A09.add(interfaceC673231x);
    }

    @Override // X.InterfaceC61522rF
    public final void EFQ(InterfaceC673231x interfaceC673231x) {
        C14360o3.A0B(interfaceC673231x, 0);
        this.A09.remove(interfaceC673231x);
    }
}
