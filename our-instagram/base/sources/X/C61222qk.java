package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.2qk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61222qk {
    public C61792rg A00;
    public C684936m A01;
    public C685336q A02;
    public C18920wW A03;
    public C57112jm A04;
    public C69433Ad A05;
    public C64312vq A06;
    public C65102x8 A07;
    public C63902vB A08;
    public C63672uo A09;
    public C63652um A0A;
    public C63712us A0B;
    public C63922vD A0C;
    public C33F A0D;
    public C33F A0E;
    public C33F A0F;
    public C909743p A0G;
    public C63872v8 A0H;
    public C63242u1 A0I;
    public C3CV A0J;
    public C63372uK A0K;
    public C65122xA A0L;
    public C61762rd A0M;
    public C3BS A0N;
    public C63252u3 A0O;
    public C64462w5 A0P;
    public C71733Jw A0Q;
    public C684836l A0R;
    public C61562rJ A0S;
    public C61472rA A0T;
    public C71763Jz A0U;
    public G9S A0V;
    public A8R A0W;
    public C3CU A0X;
    public C71743Jx A0Y;
    public C61742rb A0Z;
    public C685136o A0a;
    public C64862wk A0b;
    public C64992wx A0c;
    public C26361Pr A0d;
    public C3CW A0e;
    public C63232u0 A0f;
    public C69663Ba A0g;
    public C69673Bb A0h;
    public C69683Bc A0i;
    public C64602wJ A0j;
    public C3CN A0k;
    public C64622wL A0l;
    public C685636t A0m;
    public C61392r2 A0n;
    public C3H1 A0o;
    public C3CC A0p;
    public C65082x6 A0q;
    public C3Cj A0r;
    public C3K2 A0s;
    public C3I2 A0t;
    public C71373Hy A0u;
    public C3CZ A0v;
    public ViewOnTouchListenerC60632pm A0w;
    public C3I9 A0x;
    public C57112jm A0y;
    public C36Y A0z;
    public C64482w7 A10;
    public C63352uI A11;
    public C63752uw A12;
    public C63672uo A13;
    public C63382uL A14;
    public C3K0 A15;
    public C33F A16;
    public C3BC A17;
    public C33P A18;
    public C64052vQ A19;
    public C63832v4 A1A;
    public C3BV A1B;
    public C61512rE A1C;
    public C65192xH A1D;
    public C65092x7 A1E;
    public C62812tK A1F;
    public C62662t5 A1G;
    public C69453Af A1H;
    public C61602rN A1I;
    public C61442r7 A1J;
    public C61552rI A1K;
    public C61682rV A1L;
    public C63322uF A1M;
    public C63332uG A1N;
    public C3I3 A1O;
    public C3BE A1P;
    public C3MD A1Q;
    public C3FV A1R;
    public C64042vP A1S;
    public C64062vR A1T;
    public C63762ux A1U;
    public C3BT A1V;
    public C3CF A1W;
    public ViewOnKeyListenerC677333n A1X;
    public C61582rL A1Y;
    public C3AZ A1Z;
    public C684036d A1a;
    public C3BU A1b;
    public InterfaceC61432r6 A1c;
    public C64492w8 A1d;
    public C3LD A1e;
    public C64452w4 A1f;
    public C61842rl A1g;
    public C69703Be A1h;
    public C62622t1 A1i;
    public C69693Bd A1j;
    public C62592sy A1k;
    public C63272u5 A1l;
    public C64662wP A1m;
    public C3FX A1n;
    public C61832rk A1o;
    public C3CE A1p;
    public C3CX A1q;
    public C3BA A1r;
    public C63972vI A1s;
    public final Context A1t;
    public final UserSession A1u;
    public final C61142qc A1v;
    public final C60972qL A1w;
    public final InterfaceC60832q7 A1x;
    public final C61342qw A1y;
    public final C61382r1 A1z;
    public final C61252qn A20;
    public final C60862qA A21;
    public final C60662pp A22;
    public final InterfaceC09390do A23;

    public C61222qk(C61142qc c61142qc, C60972qL c60972qL, InterfaceC60832q7 interfaceC60832q7, C60862qA c60862qA, C60662pp c60662pp) {
        C14360o3.A0B(c61142qc, 2);
        C14360o3.A0B(c60862qA, 4);
        C14360o3.A0B(interfaceC60832q7, 5);
        this.A1w = c60972qL;
        this.A1v = c61142qc;
        this.A22 = c60662pp;
        this.A21 = c60862qA;
        this.A1x = interfaceC60832q7;
        this.A1t = c60972qL.A00;
        UserSession userSession = c60972qL.A01;
        this.A1u = userSession;
        this.A23 = C1XM.A00(new C9E5(this, 12));
        C61252qn A00 = AbstractC61242qm.A00(userSession);
        C14360o3.A07(A00);
        this.A20 = A00;
        this.A1y = new C61342qw();
        this.A1z = new C61382r1();
    }

    private final C63832v4 A00() {
        C63832v4 c63832v4 = this.A1A;
        if (c63832v4 == null) {
            C60662pp c60662pp = this.A22;
            FragmentActivity requireActivity = c60662pp.requireActivity();
            Context context = this.A1t;
            C08790ch A00 = AbstractC018607g.A00(c60662pp);
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            UserSession userSession = this.A1u;
            C63832v4 c63832v42 = new C63832v4(requireActivity, interfaceC60442pS, userSession, A0B(), new C63822v3(context, A00, interfaceC60442pS, userSession), C05F.A00);
            this.A1A = c63832v42;
            return c63832v42;
        }
        return c63832v4;
    }

    public final C71373Hy A01() {
        C71373Hy c71373Hy = this.A0u;
        if (c71373Hy == null) {
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            C60662pp c60662pp = this.A22;
            C71373Hy c71373Hy2 = new C71373Hy(new C65612xx(c60662pp, c60662pp.requireActivity()), 0);
            this.A0u = c71373Hy2;
            return c71373Hy2;
        }
        return c71373Hy;
    }

    public final C3CZ A02() {
        C3CZ c3cz = this.A0v;
        if (c3cz == null) {
            boolean z = C3CZ.A0G;
            UserSession userSession = this.A1u;
            C60662pp c60662pp = this.A22;
            AbstractC10360h2 abstractC10360h2 = c60662pp.mFragmentManager;
            if (abstractC10360h2 != null) {
                C3CZ c3cz2 = new C3CZ(c60662pp, abstractC10360h2, null, userSession, C17060sy.A01.A01(userSession), C05F.A0r, null);
                this.A0v = c3cz2;
                return c3cz2;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return c3cz;
    }

    public final ViewOnTouchListenerC60632pm A03() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0w;
        Float f = null;
        if (viewOnTouchListenerC60632pm == null) {
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            Context context = this.A1t;
            UserSession userSession = this.A1u;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36318969304652598L)) {
                f = Float.valueOf((float) (AbstractC13890nF.A00(context) * C18U.A00(c06090Tz, userSession, 37163394234974493L)));
            }
            ViewOnTouchListenerC60632pm A00 = AbstractC60622pl.A00(context, f, true);
            this.A0w = A00;
            return A00;
        }
        return viewOnTouchListenerC60632pm;
    }

    public final C3I9 A04() {
        C3I9 c3i9 = this.A0x;
        if (c3i9 == null) {
            C3I8 A01 = C3I7.A01(AbstractC60942qI.A00, false, false);
            this.A0x = A01;
            return A01;
        }
        return c3i9;
    }

    public final C57112jm A05() {
        C57112jm c57112jm = this.A0y;
        if (c57112jm == null) {
            C57112jm A01 = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
            this.A0y = A01;
            return A01;
        }
        return c57112jm;
    }

    public final C36Y A06() {
        C36Y c36y = this.A0z;
        if (c36y == null) {
            C60662pp c60662pp = this.A22;
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            C65192xH A0J = A0J();
            C64312vq c64312vq = this.A06;
            if (c64312vq == null) {
                c64312vq = new C64312vq(c60662pp.requireActivity(), this.A1u, interfaceC60442pS, A0K());
                this.A06 = c64312vq;
            }
            C36Y c36y2 = new C36Y(c60662pp, c64312vq, interfaceC60442pS, A0J, true);
            this.A0z = c36y2;
            return c36y2;
        }
        return c36y;
    }

    public final C64482w7 A07() {
        C64482w7 c64482w7 = this.A10;
        if (c64482w7 == null) {
            C64482w7 c64482w72 = new C64482w7(this.A1u, A0r(), A0n());
            this.A10 = c64482w72;
            return c64482w72;
        }
        return c64482w7;
    }

    public final C63352uI A08() {
        C63352uI c63352uI = this.A11;
        if (c63352uI == null) {
            C60662pp c60662pp = this.A22;
            C63352uI c63352uI2 = new C63352uI(c60662pp, this.A1u, AbstractC60942qI.A00, c60662pp);
            this.A11 = c63352uI2;
            return c63352uI2;
        }
        return c63352uI;
    }

    public final C63752uw A09() {
        C63752uw c63752uw = this.A12;
        if (c63752uw == null) {
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            String moduleName = interfaceC60442pS.getModuleName();
            FragmentActivity requireActivity = this.A22.requireActivity();
            UserSession userSession = this.A1u;
            C63752uw c63752uw2 = new C63752uw(requireActivity, interfaceC60442pS, userSession, new C63742uv(interfaceC60442pS, userSession), moduleName);
            this.A12 = c63752uw2;
            return c63752uw2;
        }
        return c63752uw;
    }

    public final C63672uo A0A() {
        C63672uo c63672uo = this.A13;
        if (c63672uo == null) {
            UserSession userSession = this.A1u;
            C60662pp c60662pp = this.A22;
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            FragmentActivity requireActivity = c60662pp.requireActivity();
            Integer num = C05F.A00;
            C63382uL A0B = A0B();
            C63652um c63652um = this.A0A;
            if (c63652um == null) {
                c63652um = new C63652um(interfaceC60442pS, userSession);
                this.A0A = c63652um;
            }
            C63672uo c63672uo2 = new C63672uo(c60662pp, requireActivity, interfaceC60442pS, userSession, c63652um, A0B, new C63662un(this), num);
            this.A13 = c63672uo2;
            return c63672uo2;
        }
        return c63672uo;
    }

    public final C63382uL A0B() {
        C63382uL c63382uL = this.A14;
        if (c63382uL == null) {
            UserSession userSession = this.A1u;
            C61382r1 c61382r1 = this.A1z;
            C63382uL c63382uL2 = new C63382uL(this.A1t, AbstractC60942qI.A00, userSession, A05(), c61382r1);
            this.A14 = c63382uL2;
            return c63382uL2;
        }
        return c63382uL;
    }

    public final C3K0 A0C() {
        C3K0 c3k0 = this.A15;
        if (c3k0 == null) {
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            C60662pp c60662pp = this.A22;
            FragmentActivity requireActivity = c60662pp.requireActivity();
            UserSession userSession = this.A1u;
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            C71763Jz c71763Jz = this.A0U;
            if (c71763Jz == null) {
                c71763Jz = new C71763Jz(c60662pp.A07);
                this.A0U = c71763Jz;
            }
            C3K0 c3k02 = new C3K0(requireActivity, userSession, this.A1y, interfaceC60442pS, c71763Jz);
            this.A15 = c3k02;
            return c3k02;
        }
        return c3k0;
    }

    public final C33F A0D() {
        C33F c33f = this.A16;
        if (c33f == null) {
            UserSession userSession = this.A1u;
            C33F c33f2 = new C33F(userSession, new C683736a(userSession));
            this.A16 = c33f2;
            return c33f2;
        }
        return c33f;
    }

    public final C3BC A0E() {
        C3BC c3bc = this.A17;
        if (c3bc == null) {
            Context context = this.A1t;
            C60882qC c60882qC = this.A22.A0l;
            final C3BA A0y = A0y();
            C3BC c3bc2 = new C3BC(context, new View.OnClickListener() { // from class: X.3BB
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int A05 = C0f9.A05(2139896349);
                    C60662pp A00 = C3BA.A00(C3BA.this);
                    if (A00 != null) {
                        A00.A0P(C1EN.A0I, null);
                        A00.A0A().A0E().A00.A05(null);
                    }
                    C0f9.A0C(-105958682, A05);
                }
            }, c60882qC, 2131971162);
            this.A17 = c3bc2;
            return c3bc2;
        }
        return c3bc;
    }

    public final C33P A0F() {
        C33P c33p = this.A18;
        if (c33p == null) {
            Context context = this.A1t;
            UserSession userSession = this.A1u;
            C65192xH A0J = A0J();
            String str = this.A1z.A01;
            C57112jm A05 = A05();
            C61762rd A0K = A0K();
            C61682rV A0S = A0S();
            C60662pp c60662pp = this.A22;
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            C33P c33p2 = new C33P(context, c60662pp, userSession, A05, AbstractC60942qI.A00, A0S, A0J, A0K, new C33N(new C33M(0.2f, 0.15f), null, false, true, true, true, true), C05F.A00, str, true);
            this.A18 = c33p2;
            return c33p2;
        }
        return c33p;
    }

    public final C64052vQ A0G() {
        C64052vQ c64052vQ = this.A19;
        if (c64052vQ == null) {
            FragmentActivity requireActivity = this.A22.requireActivity();
            UserSession userSession = this.A1u;
            C64052vQ c64052vQ2 = new C64052vQ(requireActivity, userSession, C18U.A01(C06090Tz.A05, userSession, 36594349736789701L));
            this.A19 = c64052vQ2;
            return c64052vQ2;
        }
        return c64052vQ;
    }

    public final C3BV A0H() {
        C3BV c3bv = this.A1B;
        if (c3bv == null) {
            UserSession userSession = this.A1u;
            C60662pp c60662pp = this.A22;
            C3BV c3bv2 = new C3BV(c60662pp.requireActivity(), c60662pp, A03(), userSession, AbstractC60942qI.A00, A0T(), c60662pp.Cen());
            this.A1B = c3bv2;
            return c3bv2;
        }
        return c3bv;
    }

    public final C61512rE A0I() {
        C61512rE c61512rE = this.A1C;
        if (c61512rE == null) {
            C57112jm c57112jm = this.A04;
            if (c57112jm == null) {
                c57112jm = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
                this.A04 = c57112jm;
            }
            C61512rE c61512rE2 = new C61512rE(c57112jm);
            this.A1C = c61512rE2;
            return c61512rE2;
        }
        return c61512rE;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [X.2w5] */
    public final C65192xH A0J() {
        C65192xH c65192xH = this.A1D;
        if (c65192xH == null) {
            C60662pp c60662pp = this.A22;
            UserSession userSession = this.A1u;
            C61342qw c61342qw = this.A1y;
            C61252qn c61252qn = this.A20;
            A0j();
            FragmentActivity requireActivity = c60662pp.requireActivity();
            C62592sy A0r = A0r();
            final InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            C62862tP A00 = A0p().A00();
            C61762rd A0K = A0K();
            C63232u0 c63232u0 = this.A0f;
            C63232u0 c63232u02 = c63232u0;
            if (c63232u0 == null) {
                c63232u02 = new C63232u0(this.A21);
                this.A0f = c63232u02;
            }
            C61512rE A0I = A0I();
            C63242u1 c63242u1 = new C63242u1(userSession, interfaceC60442pS);
            C63332uG A0U = A0U();
            C65122xA c65122xA = this.A0L;
            if (c65122xA == null) {
                FragmentActivity requireActivity2 = c60662pp.requireActivity();
                C60972qL c60972qL = this.A1w;
                C61142qc c61142qc = this.A1v;
                C57342k9 c57342k9 = C57332k8.A0m;
                Context context = this.A1t;
                C57332k8 A002 = c57342k9.A00(context, userSession);
                C61382r1 c61382r1 = this.A1z;
                C63352uI A08 = A08();
                C62862tP A003 = A0p().A00();
                C63372uK c63372uK = this.A0K;
                if (c63372uK == null) {
                    c63372uK = new C63372uK(C05F.A00, C05F.A0F);
                    this.A0K = c63372uK;
                }
                C63712us c63712us = this.A0B;
                if (c63712us == null) {
                    c63712us = new C63712us(userSession, A05(), A0A(), c61382r1);
                    this.A0B = c63712us;
                }
                C63672uo A0A = A0A();
                C63672uo c63672uo = this.A09;
                C63672uo c63672uo2 = c63672uo;
                if (c63672uo == null) {
                    C19270xB c19270xB = new C19270xB("empty_feed_timeline");
                    FragmentActivity requireActivity3 = c60662pp.requireActivity();
                    Integer num = C05F.A00;
                    C63382uL A0B = A0B();
                    C63652um c63652um = this.A0A;
                    if (c63652um == null) {
                        c63652um = new C63652um(interfaceC60442pS, userSession);
                        this.A0A = c63652um;
                    }
                    c63672uo2 = new C63672uo(c60662pp, requireActivity3, c19270xB, userSession, c63652um, A0B, null, num);
                    this.A09 = c63672uo2;
                }
                C63752uw A09 = A09();
                C63762ux A0b = A0b();
                C63872v8 c63872v8 = this.A0H;
                if (c63872v8 == null) {
                    c63872v8 = new C63872v8(userSession, A05(), A00(), c61382r1);
                    this.A0H = c63872v8;
                }
                C63832v4 A004 = A00();
                C63902vB c63902vB = this.A08;
                if (c63902vB == null) {
                    c63902vB = new C63902vB(c60662pp, interfaceC60442pS, userSession);
                    this.A08 = c63902vB;
                }
                C63922vD c63922vD = this.A0C;
                C63922vD c63922vD2 = c63922vD;
                if (c63922vD == null) {
                    c63922vD2 = new C63922vD(context, c60662pp, userSession, A05(), interfaceC60442pS);
                    this.A0C = c63922vD2;
                }
                C62812tK A0M = A0M();
                C62662t5 A0N = A0N();
                C61762rd A0K2 = A0K();
                C63972vI A0z = A0z();
                C64032vO c64032vO = new C64032vO(A05());
                C64062vR A0a = A0a();
                C61762rd A0K3 = A0K();
                C64312vq c64312vq = this.A06;
                if (c64312vq == null) {
                    c64312vq = new C64312vq(c60662pp.requireActivity(), userSession, interfaceC60442pS, A0K());
                    this.A06 = c64312vq;
                }
                C64372vw c64372vw = new C64372vw(userSession, A05());
                C64452w4 A0m = A0m();
                C64462w5 c64462w5 = this.A0P;
                C64462w5 c64462w52 = c64462w5;
                if (c64462w5 == null) {
                    final C63262u4 BP0 = this.A1x.BP0();
                    final C9E5 c9e5 = new C9E5(this, 9);
                    final C61842rl A0n = A0n();
                    ?? r9 = new InterfaceC64472w6(interfaceC60442pS, BP0, A0n, c9e5) { // from class: X.2w5
                        public final InterfaceC60442pS A00;
                        public final C63262u4 A01;
                        public final C61842rl A02;
                        public final InterfaceC16820sZ A03;

                        {
                            C14360o3.A0B(BP0, 1);
                            C14360o3.A0B(A0n, 3);
                            this.A01 = BP0;
                            this.A03 = c9e5;
                            this.A02 = A0n;
                            this.A00 = interfaceC60442pS;
                        }

                        @Override // X.InterfaceC64472w6
                        public final void DPp(String str) {
                        }

                        @Override // X.InterfaceC64472w6
                        public final void Dky() {
                            int intValue = ((Number) this.A03.invoke()).intValue();
                            C63262u4 c63262u4 = this.A01;
                            C61842rl c61842rl = this.A02;
                            C19280xC A005 = C19280xC.A00(this.A00, "main_feed_loading_more");
                            A005.A08(Integer.valueOf(intValue), "position");
                            Long A05 = c61842rl.A0e.A05();
                            if (A05 != null) {
                                A005.A0B("last_feed_update_time", A05);
                            }
                            AbstractC11060iN.A00(c63262u4.A00).EHW(A005);
                        }
                    };
                    this.A0P = r9;
                    c64462w52 = r9;
                }
                C64492w8 A0k = A0k();
                C64602wJ c64602wJ = this.A0j;
                if (c64602wJ == null) {
                    c64602wJ = new C64602wJ(userSession, c61382r1, new C64592wI(c60662pp, userSession), this.A21);
                    this.A0j = c64602wJ;
                }
                C64622wL c64622wL = this.A0l;
                if (c64622wL == null) {
                    c64622wL = new C64622wL(userSession, this.A21, this);
                    this.A0l = c64622wL;
                }
                C63332uG A0U2 = A0U();
                C64842wi c64842wi = A0t().A05;
                C64862wk c64862wk = this.A0b;
                if (c64862wk == null) {
                    c64862wk = new C64862wk(c60662pp, userSession, A05(), interfaceC60442pS, EnumC64852wj.A03, c60662pp.A0J, null, null, null, -1);
                    this.A0b = c64862wk;
                }
                C64992wx c64992wx = this.A0c;
                if (c64992wx == null) {
                    c64992wx = new C64992wx(c60662pp, userSession, A05(), interfaceC60442pS, null, C05F.A01, null, null, c60662pp.A0J, null, null, null, -1);
                    this.A0c = c64992wx;
                }
                C65082x6 c65082x6 = this.A0q;
                if (c65082x6 == null) {
                    c65082x6 = new C65082x6(A0Q());
                    this.A0q = c65082x6;
                }
                C65092x7 A0L = A0L();
                InterfaceC61432r6 A0j = A0j();
                C65102x8 c65102x8 = this.A07;
                if (c65102x8 == null) {
                    c65102x8 = new C65102x8(userSession, A05(), interfaceC60442pS);
                    this.A07 = c65102x8;
                }
                c65122xA = new C65122xA(c60662pp, requireActivity2, A003, c61142qc, A08, c64312vq, A09, c65102x8, c60972qL, c63902vB, A0A, c63672uo2, c63712us, c63922vD2, c64602wJ, A0K2, A002, A004, c63872v8, c63372uK, A0K3, c64372vw, A0L, A0M, A0N, A0a, A0b, A0U2, c64622wL, c64842wi, c61252qn, c64032vO, c64992wx, c64862wk, A0j, c64462w52, A0k, c61382r1, A0m, c60662pp, c65082x6, A0z);
                this.A0L = c65122xA;
            }
            C65192xH c65192xH2 = new C65192xH(requireActivity, c60662pp, A00, userSession, c61342qw, interfaceC60442pS, A0I, c63242u1, c65122xA, A0K, A0U, c60662pp, A0r, c63232u02);
            this.A1D = c65192xH2;
            return c65192xH2;
        }
        return c65192xH;
    }

    public final C61762rd A0K() {
        C61762rd c61762rd = this.A0M;
        if (c61762rd == null) {
            C61762rd c61762rd2 = new C61762rd(this.A1t, this.A1u);
            this.A0M = c61762rd2;
            return c61762rd2;
        }
        return c61762rd;
    }

    public final C65092x7 A0L() {
        C65092x7 c65092x7 = this.A1E;
        if (c65092x7 == null) {
            C60662pp c60662pp = this.A22;
            C65092x7 c65092x72 = new C65092x7(c60662pp.requireActivity(), c60662pp, this.A1u);
            this.A1E = c65092x72;
            return c65092x72;
        }
        return c65092x7;
    }

    public final C62812tK A0M() {
        C62812tK c62812tK = this.A1F;
        if (c62812tK == null) {
            C62812tK c62812tK2 = new C62812tK(this.A1u, this.A1t);
            this.A1F = c62812tK2;
            return c62812tK2;
        }
        return c62812tK;
    }

    public final C62662t5 A0N() {
        C62662t5 c62662t5 = this.A1G;
        if (c62662t5 == null) {
            C62662t5 c62662t52 = new C62662t5(AbstractC60942qI.A00, this.A1u, A05());
            this.A1G = c62662t52;
            return c62662t52;
        }
        return c62662t5;
    }

    public final C69453Af A0O() {
        C69453Af c69453Af = this.A1H;
        if (c69453Af == null) {
            Context context = this.A1t;
            C60662pp c60662pp = this.A22;
            FragmentActivity requireActivity = c60662pp.requireActivity();
            C61342qw c61342qw = this.A1y;
            C65192xH A0J = A0J();
            UserSession userSession = this.A1u;
            InterfaceC53892dT A07 = c60662pp.A07();
            C61442r7 A0Q = A0Q();
            C57112jm A05 = A05();
            C3AZ A0g = A0g();
            C61602rN A0P = A0P();
            C69433Ad c69433Ad = this.A05;
            if (c69433Ad == null) {
                c69433Ad = new C69433Ad();
                this.A05 = c69433Ad;
            }
            C69453Af c69453Af2 = new C69453Af(requireActivity, context, c60662pp, AbstractC60942qI.A00, userSession, A05, c69433Ad, c61342qw, A0J, A0P, A0Q, A0R(), A0g, A07);
            this.A1H = c69453Af2;
            return c69453Af2;
        }
        return c69453Af;
    }

    public final C61602rN A0P() {
        C61602rN c61602rN = this.A1I;
        if (c61602rN == null) {
            C60662pp c60662pp = this.A22;
            UserSession userSession = this.A1u;
            C08790ch A00 = AbstractC018607g.A00(c60662pp);
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            C61602rN c61602rN2 = new C61602rN(A00, c60662pp, interfaceC60442pS, userSession, interfaceC60442pS);
            this.A1I = c61602rN2;
            return c61602rN2;
        }
        return c61602rN;
    }

    public final C61442r7 A0Q() {
        C61442r7 c61442r7 = this.A1J;
        if (c61442r7 == null) {
            C226618u c226618u = C61442r7.A0V;
            Context applicationContext = this.A1t.getApplicationContext();
            C14360o3.A07(applicationContext);
            UserSession userSession = this.A1u;
            C226418s A01 = C226218q.A01(AbstractC12960li.A00);
            String moduleName = AbstractC60942qI.A00.getModuleName();
            C61342qw c61342qw = this.A1y;
            MessageQueue myQueue = Looper.myQueue();
            C14360o3.A07(myQueue);
            C61472rA c61472rA = this.A0T;
            if (c61472rA == null) {
                c61472rA = new C61472rA(userSession, this.A22.A0C, new C9E6(this, 6));
                this.A0T = c61472rA;
            }
            C61442r7 c61442r72 = new C61442r7(applicationContext, myQueue, userSession, c61342qw, c61472rA, A01, moduleName);
            this.A1J = c61442r72;
            return c61442r72;
        }
        return c61442r7;
    }

    public final C61552rI A0R() {
        C61552rI c61552rI = this.A1K;
        if (c61552rI == null) {
            long j = C61552rI.A0B;
            C61552rI c61552rI2 = new C61552rI(this.A1u, A0Q());
            this.A1K = c61552rI2;
            return c61552rI2;
        }
        return c61552rI;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2rW, X.2rV] */
    public final C61682rV A0S() {
        C61682rV c61682rV = this.A1L;
        if (c61682rV == null) {
            String moduleName = AbstractC60942qI.A00.getModuleName();
            UserSession userSession = this.A1u;
            C14360o3.A0B(moduleName, 1);
            ?? abstractC61692rW = new AbstractC61692rW(moduleName, userSession, null);
            this.A1L = abstractC61692rW;
            return abstractC61692rW;
        }
        return c61682rV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C63322uF A0T() {
        Integer num;
        C63322uF c63322uF = this.A1M;
        if (c63322uF == null) {
            C61392r2 c61392r2 = this.A0n;
            if (c61392r2 == null) {
                c61392r2 = new C61392r2(this.A1t, this.A1u);
                this.A0n = c61392r2;
            }
            C63272u5 A0s = A0s();
            if (c61392r2.A00 == null) {
                C01L A1I = C0eM.A1I();
                UserSession userSession = c61392r2.A03;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36318969304521525L)) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                A1I.add(new C63282u6(num));
                if (C17060sy.A01.A01(userSession).A1m() || AbstractC63292u7.A00(userSession)) {
                    A1I.add(new C63282u6(C05F.A0j));
                }
                if (C18U.A06(c06090Tz, userSession, 36313875474811162L)) {
                    A1I.add(new C63282u6(C05F.A0C));
                }
                if (C18U.A06(c06090Tz, userSession, 36313875474680088L)) {
                    A1I.add(new C63282u6(C05F.A0N));
                }
                if (C18U.A06(c06090Tz, userSession, 36329101132316691L)) {
                    A1I.add(new C63282u6(C05F.A0u));
                }
                if (C2TN.A00(userSession) && C2TN.A00(userSession)) {
                    A1I.add(new C63282u6(C05F.A15));
                }
                C01L A1J = C0eM.A1J(A1I);
                C63322uF c63322uF2 = new C63322uF(c61392r2.A02, userSession, (C63282u6) A1J.get(0), A1J);
                c61392r2.A00 = c63322uF2;
                c63322uF2.A05.add(A0s);
                c61392r2.A01 = A0s;
            }
            c63322uF = c61392r2.A00;
            if (c63322uF == null) {
                C14360o3.A0F("feedPickerStateManager");
                throw C00O.createAndThrow();
            }
            this.A1M = c63322uF;
        }
        return c63322uF;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2uG] */
    public final C63332uG A0U() {
        C63332uG c63332uG = this.A1N;
        if (c63332uG == null) {
            final C63252u3 c63252u3 = this.A0O;
            if (c63252u3 == null) {
                c63252u3 = new C63252u3(this.A22, this.A1u);
                this.A0O = c63252u3;
            }
            final C63322uF A0T = A0T();
            final C60662pp c60662pp = this.A22;
            final C9E2 c9e2 = new C9E2(this, 32);
            final InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            final C63262u4 BP0 = this.A1x.BP0();
            final Resources resources = c60662pp.requireContext().getResources();
            C14360o3.A07(resources);
            final UserSession userSession = this.A1u;
            final C61382r1 c61382r1 = this.A1z;
            ?? r0 = new InterfaceC63342uH(resources, c60662pp, userSession, interfaceC60442pS, BP0, A0T, c63252u3, c61382r1, c60662pp, c9e2) { // from class: X.2uG
                public final Resources A00;
                public final Fragment A01;
                public final UserSession A02;
                public final InterfaceC60442pS A03;
                public final C63262u4 A04;
                public final C63322uF A05;
                public final C63252u3 A06;
                public final C61382r1 A07;
                public final InterfaceC60682pr A08;
                public final InterfaceC16660sJ A09;

                {
                    C14360o3.A0B(BP0, 6);
                    C14360o3.A0B(c61382r1, 10);
                    this.A06 = c63252u3;
                    this.A05 = A0T;
                    this.A01 = c60662pp;
                    this.A09 = c9e2;
                    this.A03 = interfaceC60442pS;
                    this.A04 = BP0;
                    this.A00 = resources;
                    this.A08 = c60662pp;
                    this.A02 = userSession;
                    this.A07 = c61382r1;
                }

                @Override // X.InterfaceC63342uH
                public final void E2r(C3CL c3cl, C110434yF c110434yF, C110464yI c110464yI, Integer num) {
                    String str;
                    String str2;
                    Long l;
                    C1XV c1xv;
                    C14360o3.A0B(num, 1);
                    ConcurrentMap concurrentMap = C41577IaQ.A01.A00(this.A02).A00;
                    String str3 = c110434yF.A03;
                    concurrentMap.put(str3, c110434yF);
                    if (C14360o3.A0K(str3, C3ZF.A04.A00)) {
                        str = "feed_timeline_favorites_older";
                        List list = c110434yF.A06;
                        C3XG c3xg = (C3XG) AbstractC001800i.A0J(AbstractC001800i.A0a(list));
                        if (c3xg != null && (c1xv = c3xg.A06) != null && c1xv != C1XV.A0j) {
                            String obj = UUID.randomUUID().toString();
                            C14360o3.A07(obj);
                            String string = this.A00.getString(2131962467);
                            C14360o3.A07(string);
                            E87 e87 = new E87(obj, string);
                            String str4 = e87.A00;
                            G7N g7n = new G7N(e87);
                            list.add(0, new C3XG(g7n, g7n.B5n(), str4));
                        }
                    } else {
                        str = "feed_timeline_older";
                    }
                    C63252u3 c63252u32 = this.A06;
                    String str5 = c110434yF.A05;
                    if (str5 == null) {
                        str5 = "";
                    }
                    C61382r1 c61382r12 = this.A07;
                    c63252u32.A00("Older_Feed", str5, str, c61382r12.A01, c110434yF.A01, c110434yF.A00, str3);
                    C127085om A00 = AbstractC127075ol.A00(this.A04.A00);
                    String str6 = c61382r12.A01;
                    String A002 = AbstractC110744ym.A00(num);
                    C18920wW A01 = AbstractC12220kQ.A01(new C19270xB(str), A00.A00);
                    InterfaceC02590Ai A003 = A01.A00(A01.A00, "instagram_feed_older_posts_tap");
                    if (A003.isSampled()) {
                        A003.AAP("module", str);
                        A003.A9K("ig_media_id", Long.MIN_VALUE);
                        if (c3cl != null) {
                            str2 = c3cl.A07.toString();
                        } else {
                            str2 = "";
                        }
                        A003.AAP("inventory_source", str2);
                        if (c110464yI != null) {
                            l = Long.valueOf(c110464yI.getPosition());
                        } else {
                            l = null;
                        }
                        A003.A9K("m_ix", l);
                        A003.AAP("ranking_session_id", str6);
                        A003.AAP("event_source", A002);
                        A003.Cht();
                    }
                }

                @Override // X.InterfaceC63342uH
                public final void ANj(C3CL c3cl) {
                    final int[] iArr;
                    try {
                        final C3FQ scrollingViewProxy = this.A08.getScrollingViewProxy();
                        if (scrollingViewProxy != null && (iArr = (int[]) this.A09.invoke(c3cl)) != null && iArr.length != 0) {
                            scrollingViewProxy.Eog();
                            new Handler(this.A01.requireContext().getMainLooper()).postDelayed(new Runnable() { // from class: X.4yr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i;
                                    C3FQ c3fq = C3FQ.this;
                                    int i2 = iArr[0];
                                    View AnW = c3fq.AnW(i2);
                                    int i3 = Resources.getSystem().getDisplayMetrics().heightPixels;
                                    if (AnW != null) {
                                        i = AnW.getHeight();
                                    } else {
                                        i = 0;
                                    }
                                    c3fq.EmE(i2, (i3 - i) / 2);
                                }
                            }, 10L);
                        }
                    } catch (IllegalStateException unused) {
                        C0w9.A03("MainFeedEndOfFeedDemarcatorDelegate", "decelerateToEOF called after fragment is destroyed");
                    }
                }

                @Override // X.InterfaceC63342uH
                public final void E2c(String str) {
                    String A00 = AbstractC111324zv.A00(869);
                    UserSession userSession2 = this.A02;
                    C61382r1 c61382r12 = this.A07;
                    String moduleName = this.A03.getModuleName();
                    FragmentActivity activity = this.A01.getActivity();
                    if (activity != null) {
                        new C684436h(activity, userSession2).A04(moduleName, c61382r12.getSessionId(), A00);
                    }
                }

                @Override // X.InterfaceC63342uH
                public final void Epi() {
                    this.A05.A00(C05F.A00);
                }
            };
            this.A1N = r0;
            return r0;
        }
        return c63332uG;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.3I3] */
    public final C3I3 A0V() {
        C3I3 c3i3 = this.A1O;
        if (c3i3 == null) {
            C3I2 c3i2 = this.A0t;
            if (c3i2 == null) {
                c3i2 = new C3I2(this.A1u, A0t());
                this.A0t = c3i2;
            }
            final C9E2 c9e2 = new C9E2(c3i2, 33);
            final C207199Ey c207199Ey = new C207199Ey(2, c3i2, this);
            ?? r1 = new InterfaceC53852dP(c9e2, c207199Ey) { // from class: X.3I3
                public final InterfaceC16660sJ A00;
                public final InterfaceC16660sJ A01;

                @Override // X.InterfaceC53852dP
                public final void DHI(C47Z c47z) {
                    C14360o3.A0B(c47z, 0);
                    this.A00.invoke(c47z);
                }

                @Override // X.InterfaceC53852dP
                public final void DSR(C47Z c47z) {
                    C14360o3.A0B(c47z, 0);
                    this.A01.invoke(c47z);
                }

                {
                    this.A01 = c9e2;
                    this.A00 = c207199Ey;
                }
            };
            this.A1O = r1;
            return r1;
        }
        return c3i3;
    }

    public final C3BE A0W() {
        C3BE c3be = this.A1P;
        if (c3be == null) {
            C3BC A0E = A0E();
            C60862qA c60862qA = this.A21;
            C3BE c3be2 = new C3BE(A03(), this.A1u, A0E, A0O(), c60862qA);
            this.A1P = c3be2;
            return c3be2;
        }
        return c3be;
    }

    public final C3MD A0X() {
        C3MD c3md = this.A1Q;
        if (c3md == null) {
            C3MD c3md2 = new C3MD(this.A1u, this.A22.A07, (C61572rK) this.A23.getValue(), new C9E5(this, 13), new C9E5(this, 14), new C9E5(this, 15));
            this.A1Q = c3md2;
            return c3md2;
        }
        return c3md;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0JO, java.lang.Object] */
    public final C3FV A0Y() {
        C3FV c3fv = this.A1R;
        if (c3fv == null) {
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            UserSession userSession = this.A1u;
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            C3FV c3fv2 = new C3FV(new Object(), AbstractC12220kQ.A01(interfaceC60442pS, userSession), interfaceC60442pS, A0r());
            this.A1R = c3fv2;
            return c3fv2;
        }
        return c3fv;
    }

    public final C64042vP A0Z() {
        C64042vP c64042vP = this.A1S;
        if (c64042vP == null) {
            UserSession userSession = this.A1u;
            C61382r1 c61382r1 = this.A1z;
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            C64042vP c64042vP2 = new C64042vP(interfaceC60442pS, userSession, interfaceC60442pS, c61382r1);
            this.A1S = c64042vP2;
            return c64042vP2;
        }
        return c64042vP;
    }

    public final C64062vR A0a() {
        C64062vR c64062vR = this.A1T;
        if (c64062vR == null) {
            UserSession userSession = this.A1u;
            C61382r1 c61382r1 = this.A1z;
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            C64042vP A0Z = A0Z();
            C64062vR c64062vR2 = new C64062vR(userSession, A05(), interfaceC60442pS, A0G(), A0Z, c61382r1);
            this.A1T = c64062vR2;
            return c64062vR2;
        }
        return c64062vR;
    }

    public final C63762ux A0b() {
        C63762ux c63762ux = this.A1U;
        if (c63762ux == null) {
            UserSession userSession = this.A1u;
            C61382r1 c61382r1 = this.A1z;
            C63762ux c63762ux2 = new C63762ux(this.A1t, AbstractC60942qI.A00, userSession, A05(), c61382r1);
            this.A1U = c63762ux2;
            return c63762ux2;
        }
        return c63762ux;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0JO, java.lang.Object] */
    public final C3BT A0c() {
        C3BT c3bt = this.A1V;
        if (c3bt == null) {
            C60662pp c60662pp = this.A22;
            UserSession userSession = this.A1u;
            C18920wW c18920wW = this.A03;
            if (c18920wW == null) {
                c18920wW = AbstractC12220kQ.A01(AbstractC60942qI.A00, userSession);
                this.A03 = c18920wW;
            }
            C65192xH A0J = A0J();
            C63332uG A0U = A0U();
            C61382r1 c61382r1 = this.A1z;
            C3BT c3bt2 = new C3BT(new Object(), c60662pp, AbstractC60942qI.A00, c18920wW, userSession, A0J, A0U, c61382r1);
            this.A1V = c3bt2;
            return c3bt2;
        }
        return c3bt;
    }

    public final C3CF A0d() {
        C3CF c3cf = this.A1W;
        if (c3cf == null) {
            C3CF c3cf2 = new C3CF(this.A22, A06(), A0J(), A0c());
            this.A1W = c3cf2;
            return c3cf2;
        }
        return c3cf;
    }

    public final ViewOnKeyListenerC677333n A0e() {
        ViewOnKeyListenerC677333n viewOnKeyListenerC677333n = this.A1X;
        if (viewOnKeyListenerC677333n == null) {
            ViewOnKeyListenerC677333n viewOnKeyListenerC677333n2 = new ViewOnKeyListenerC677333n(this.A1t, this.A1u, AbstractC60942qI.A00, new C33M(0.2f, 0.15f));
            this.A1X = viewOnKeyListenerC677333n2;
            return viewOnKeyListenerC677333n2;
        }
        return viewOnKeyListenerC677333n;
    }

    public final C61582rL A0f() {
        C61582rL c61582rL = this.A1Y;
        if (c61582rL == null) {
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            Context context = this.A1t;
            String moduleName = AbstractC60942qI.A00.getModuleName();
            UserSession userSession = this.A1u;
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            C61582rL c61582rL2 = new C61582rL(context, c006802i, userSession, moduleName, 498994024);
            this.A1Y = c61582rL2;
            return c61582rL2;
        }
        return c61582rL;
    }

    public final C3AZ A0g() {
        C3AZ c3az = this.A1Z;
        if (c3az == null) {
            C3AZ c3az2 = new C3AZ(AbstractC60942qI.A00, this.A1u);
            this.A1Z = c3az2;
            return c3az2;
        }
        return c3az;
    }

    public final C684036d A0h() {
        C684036d c684036d = this.A1a;
        if (c684036d == null) {
            C60662pp c60662pp = this.A22;
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            final Activity rootActivity = c60662pp.getRootActivity();
            C684036d c684036d2 = new C684036d(c60662pp, interfaceC60442pS, new InterfaceC53832dN(rootActivity) { // from class: X.36c
                public final Activity A00;

                @Override // X.InterfaceC53832dN
                public final void DZb(int i) {
                    ComponentCallbacks2 componentCallbacks2 = this.A00;
                    if (componentCallbacks2 instanceof InterfaceC53832dN) {
                        ((InterfaceC53832dN) componentCallbacks2).DZb(i);
                    }
                }

                {
                    this.A00 = rootActivity;
                }
            });
            this.A1a = c684036d2;
            return c684036d2;
        }
        return c684036d;
    }

    public final C3BU A0i() {
        C3BU c3bu = this.A1b;
        if (c3bu == null) {
            C3BU A0F = C1XJ.A00.A0F(this.A1u);
            C60662pp c60662pp = this.A22;
            A0F.A04 = new WeakReference(c60662pp.requireActivity());
            A0F.A03 = new WeakReference(c60662pp);
            this.A1b = A0F;
            return A0F;
        }
        return c3bu;
    }

    public final InterfaceC61432r6 A0j() {
        InterfaceC61432r6 interfaceC61432r6 = this.A1c;
        if (interfaceC61432r6 == null) {
            C61422r5 A00 = AbstractC61402r3.A00(this.A1u, AbstractC60942qI.A00, this.A1z);
            this.A1c = A00;
            return A00;
        }
        return interfaceC61432r6;
    }

    public final C64492w8 A0k() {
        C64492w8 c64492w8 = this.A1d;
        if (c64492w8 == null) {
            UserSession userSession = this.A1u;
            C57112jm A05 = A05();
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            C64492w8 c64492w82 = new C64492w8(AbstractC12220kQ.A01(interfaceC60442pS, userSession), userSession, A05, A07(), interfaceC60442pS, A0S(), A0f());
            this.A1d = c64492w82;
            return c64492w82;
        }
        return c64492w8;
    }

    public final C3LD A0l() {
        C3LD c3ld = this.A1e;
        if (c3ld == null) {
            UserSession userSession = this.A1u;
            C65192xH A0J = A0J();
            C60862qA c60862qA = this.A21;
            C71373Hy A01 = A01();
            C3BA A0y = A0y();
            C3BV A0H = A0H();
            C3BE A0W = A0W();
            C18920wW c18920wW = this.A03;
            if (c18920wW == null) {
                c18920wW = AbstractC12220kQ.A01(AbstractC60942qI.A00, userSession);
                this.A03 = c18920wW;
            }
            C61342qw c61342qw = this.A1y;
            ViewOnTouchListenerC60632pm A03 = A03();
            C64662wP A0t = A0t();
            C63322uF A0T = A0T();
            C60662pp c60662pp = this.A22;
            C3LD c3ld2 = new C3LD(c60662pp, A01, A03, c18920wW, userSession, A0H, A0J, A0T, A0W, c61342qw, c60662pp, c60862qA, A0t, A0y);
            this.A1e = c3ld2;
            return c3ld2;
        }
        return c3ld;
    }

    public final C64452w4 A0m() {
        C64452w4 c64452w4 = this.A1f;
        if (c64452w4 == null) {
            C64452w4 c64452w42 = new C64452w4(this.A1u, this.A1z, this.A22);
            this.A1f = c64452w42;
            return c64452w42;
        }
        return c64452w4;
    }

    public final C61842rl A0n() {
        C61842rl c61842rl = this.A1g;
        if (c61842rl == null) {
            Context context = this.A1t;
            UserSession userSession = this.A1u;
            C60662pp c60662pp = this.A22;
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            C61442r7 A0Q = A0Q();
            C61382r1 c61382r1 = this.A1z;
            C61552rI A0R = A0R();
            C61212qj BIs = this.A1x.BIs();
            C61512rE A0I = A0I();
            C61562rJ c61562rJ = this.A0S;
            if (c61562rJ == null) {
                c61562rJ = new C61562rJ(userSession);
                this.A0S = c61562rJ;
            }
            C61572rK c61572rK = (C61572rK) this.A23.getValue();
            C08790ch A00 = AbstractC018607g.A00(c60662pp);
            C61582rL A0f = A0f();
            C61602rN A0P = A0P();
            InterfaceC61432r6 A0j = A0j();
            C61682rV A0S = A0S();
            C61742rb c61742rb = this.A0Z;
            if (c61742rb == null) {
                c61742rb = new C61742rb(context, interfaceC60442pS, userSession, new C61722rZ());
                this.A0Z = c61742rb;
            }
            C61842rl c61842rl2 = new C61842rl(context, A00, userSession, interfaceC60442pS, A0S, A0I, A0K(), A0P, A0Q, A0R, BIs, c61562rJ, c61572rK, A0f, c61742rb, A0j, c61382r1, c60662pp, A0v());
            this.A1g = c61842rl2;
            return c61842rl2;
        }
        return c61842rl;
    }

    public final C69703Be A0o() {
        C69703Be c69703Be = this.A1h;
        if (c69703Be == null) {
            C60662pp c60662pp = this.A22;
            C64842wi c64842wi = A0t().A05;
            C69693Bd A0q = A0q();
            C69703Be c69703Be2 = new C69703Be(this.A1u, A08(), AbstractC60942qI.A00, c64842wi, this.A1z, c60662pp, A0q);
            this.A1h = c69703Be2;
            return c69703Be2;
        }
        return c69703Be;
    }

    public final C62622t1 A0p() {
        C62622t1 c62622t1 = this.A1i;
        if (c62622t1 == null) {
            C62622t1 c62622t12 = new C62622t1(this.A1u, this.A22, this);
            this.A1i = c62622t12;
            return c62622t12;
        }
        return c62622t1;
    }

    public final C69693Bd A0q() {
        C69693Bd c69693Bd = this.A1j;
        if (c69693Bd == null) {
            C69693Bd c69693Bd2 = new C69693Bd(this.A1u);
            this.A1j = c69693Bd2;
            return c69693Bd2;
        }
        return c69693Bd;
    }

    public final C62592sy A0r() {
        C62592sy c62592sy = this.A1k;
        if (c62592sy == null) {
            C62592sy c62592sy2 = new C62592sy(this.A1u, A0n(), A0n());
            this.A1k = c62592sy2;
            return c62592sy2;
        }
        return c62592sy;
    }

    public final C63272u5 A0s() {
        C63272u5 c63272u5 = this.A1l;
        if (c63272u5 == null) {
            C60662pp c60662pp = this.A22;
            FragmentActivity requireActivity = c60662pp.requireActivity();
            C63252u3 c63252u3 = this.A0O;
            if (c63252u3 == null) {
                c63252u3 = new C63252u3(c60662pp, this.A1u);
                this.A0O = c63252u3;
            }
            C18920wW c18920wW = this.A03;
            if (c18920wW == null) {
                c18920wW = AbstractC12220kQ.A01(AbstractC60942qI.A00, this.A1u);
                this.A03 = c18920wW;
            }
            C63272u5 c63272u52 = new C63272u5(requireActivity, c18920wW, this.A1u, this.A1x.BP0(), c63252u3, AbstractC60942qI.A00.getModuleName());
            this.A1l = c63272u52;
            return c63272u52;
        }
        return c63272u5;
    }

    public final C64662wP A0t() {
        C64662wP c64662wP = this.A1m;
        if (c64662wP == null) {
            C60662pp c60662pp = this.A22;
            C60862qA c60862qA = this.A21;
            C64662wP c64662wP2 = new C64662wP(A0p().A00(), AbstractC60942qI.A00, this.A1u, c60862qA, c60662pp);
            this.A1m = c64662wP2;
            return c64662wP2;
        }
        return c64662wP;
    }

    public final C3FX A0u() {
        C3FX c3fx = this.A1n;
        if (c3fx == null) {
            UserSession userSession = this.A1u;
            Object value = A0q().A00.getValue();
            C14360o3.A07(value);
            C69453Af A0O = A0O();
            C3CX A0x = A0x();
            C60662pp c60662pp = this.A22;
            C3FV A0Y = A0Y();
            C61842rl A0n = A0n();
            C62592sy A0r = A0r();
            C3FX c3fx2 = new C3FX(userSession, (C70013Cl) value, A0O, A0R(), A0Y, A0f(), A0n, c60662pp, A0r, A0x);
            this.A1n = c3fx2;
            return c3fx2;
        }
        return c3fx;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2rg, X.2rh] */
    public final C61832rk A0v() {
        C61832rk c61832rk = this.A1o;
        if (c61832rk == null) {
            C60662pp c60662pp = this.A22;
            UserSession userSession = this.A1u;
            C61792rg c61792rg = this.A00;
            C61792rg c61792rg2 = c61792rg;
            if (c61792rg == null) {
                ?? abstractC61802rh = new AbstractC61802rh();
                this.A00 = abstractC61802rh;
                c61792rg2 = abstractC61802rh;
            }
            C61832rk c61832rk2 = new C61832rk(c61792rg2, userSession, c60662pp);
            this.A1o = c61832rk2;
            return c61832rk2;
        }
        return c61832rk;
    }

    public final C3CE A0w() {
        C3CE c3ce = this.A1p;
        if (c3ce == null) {
            C3CE c3ce2 = new C3CE(this.A1u, this.A1y, this.A22);
            this.A1p = c3ce2;
            return c3ce2;
        }
        return c3ce;
    }

    public final C3CX A0x() {
        C3CX c3cx = this.A1q;
        if (c3cx == null) {
            C3CX c3cx2 = new C3CX(this.A22, AbstractC60942qI.A00, this.A1u, this.A1y);
            this.A1q = c3cx2;
            return c3cx2;
        }
        return c3cx;
    }

    public final C3BA A0y() {
        C3BA c3ba = this.A1r;
        if (c3ba == null) {
            C3BA c3ba2 = new C3BA(this.A1u, AbstractC60942qI.A00, this.A22, this);
            this.A1r = c3ba2;
            return c3ba2;
        }
        return c3ba;
    }

    public final C63972vI A0z() {
        C63972vI c63972vI = this.A1s;
        if (c63972vI == null) {
            UserSession userSession = this.A1u;
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            C61252qn A00 = AbstractC61242qm.A00(userSession);
            C60662pp c60662pp = this.A22;
            C61342qw c61342qw = this.A1y;
            C61382r1 c61382r1 = this.A1z;
            C61842rl c61842rl = this.A1g;
            if (c61842rl == null) {
                C14360o3.A0F("_mainFeedDeliveryController");
                throw C00O.createAndThrow();
            }
            C14360o3.A0B(A00, 2);
            C14360o3.A0B(c61342qw, 4);
            C14360o3.A0B(c61382r1, 5);
            C63972vI c63972vI2 = new C63972vI(c60662pp, userSession, c61342qw, interfaceC60442pS, A00, c61382r1, c61842rl);
            this.A1s = c63972vI2;
            return c63972vI2;
        }
        return c63972vI;
    }
}
