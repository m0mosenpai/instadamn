package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7H0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7H0 {
    public C7H2 A00;
    public final C9BW A01;
    public final UserSession A02;
    public final C7H2 A03;
    public final C7H2 A04;
    public final C7H2 A05;
    public final C7H2 A06;
    public final C7H2 A07;
    public final C7H2 A08;
    public final C7H2 A09;
    public final C7H2 A0A;
    public final C7H2 A0B;
    public final C7H2 A0C;
    public final C7H2 A0D;
    public final C7H2 A0E;
    public final C7H2 A0F;
    public final InterfaceC83713oG A0G;
    public final List A0H;
    public final InterfaceC16820sZ A0I;
    public final InterfaceC16820sZ A0J;
    public final InterfaceC16820sZ A0K;
    public final boolean A0L;
    public final C7F3 A0M;
    public final C160397Gz A0N;
    public final C7H2 A0O;
    public final C7H2 A0P;
    public final C7H2 A0Q;
    public final C7H2 A0R;
    public final C7H2 A0S;
    public final C7H2 A0T;
    public final C7H2 A0U;
    public final C7H2 A0V;
    public final C7H2 A0W;
    public final C7H2 A0X;
    public final C7H2 A0Y;
    public final C7H2 A0Z;
    public final C7H2 A0a;
    public final C7H2 A0b;
    public final C7H2 A0c;
    public final C7HN A0d;
    public final List A0e;
    public final List A0f;
    public final Map A0g;
    public final InterfaceC16820sZ A0h;

    public final void A00(C7VF c7vf, C2EY c2ey, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(c7vf, 0);
        C14360o3.A0B(str, 6);
        List<C7H2> list = this.A0f;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C7H2 c7h2 : list) {
                InterfaceC83713oG interfaceC83713oG = this.A0G;
                C2EE c2ee = (C2EE) this.A0K.invoke();
                boolean z5 = false;
                if (c2ee != null) {
                    C7DG c7dg = C7DF.A00;
                    UserSession userSession = this.A02;
                    if (c7dg.A02(userSession, c2ee) || c7dg.A03(userSession, c2ee)) {
                        z5 = true;
                    }
                }
                if (c7h2.Cp3(str, c7h2.A03(c7vf, c2ey, interfaceC83713oG, this.A0I, z, z5), z3, z2, z4)) {
                    this.A00 = c7h2;
                    C159287Co c159287Co = this.A0N.A00.A0q;
                    if (c159287Co != null) {
                        c159287Co.A00(EnumC159327Cs.A02);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public C7H0(Activity activity, Context context, C9BW c9bw, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7F3 c7f3, C7FR c7fr, C163997Vo c163997Vo, C160397Gz c160397Gz, final C160007Fm c160007Fm, C7FM c7fm, C7FO c7fo, C159947Fg c159947Fg, InterfaceC83713oG interfaceC83713oG, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16820sZ interfaceC16820sZ8, InterfaceC16820sZ interfaceC16820sZ9, InterfaceC16820sZ interfaceC16820sZ10, final InterfaceC16820sZ interfaceC16820sZ11, InterfaceC16820sZ interfaceC16820sZ12, InterfaceC16820sZ interfaceC16820sZ13, InterfaceC16820sZ interfaceC16820sZ14, InterfaceC16820sZ interfaceC16820sZ15, InterfaceC16820sZ interfaceC16820sZ16, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        AbstractC160207Gg abstractC160207Gg;
        C7H2 c7h2;
        List A1Q;
        C7H2 c7h22;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 4);
        C14360o3.A0B(c7fr, 9);
        C14360o3.A0B(c7fo, 10);
        C14360o3.A0B(interfaceC83713oG, 16);
        C14360o3.A0B(interfaceC11380iw, 18);
        C14360o3.A0B(c160007Fm, 19);
        C14360o3.A0B(c7fm, 27);
        C14360o3.A0B(c7f3, 29);
        this.A02 = userSession;
        this.A0K = interfaceC16820sZ;
        this.A0L = z;
        this.A0G = interfaceC83713oG;
        this.A0I = interfaceC16820sZ13;
        this.A0M = c7f3;
        this.A0h = interfaceC16820sZ15;
        this.A0J = interfaceC16820sZ16;
        this.A01 = c9bw;
        this.A0N = c160397Gz;
        String obj = C0HM.A00().toString();
        C14360o3.A07(obj);
        C7GY c7gy = C7GY.A05;
        C7H1 c7h1 = new C7H1(userSession, c7gy, c160007Fm, c159947Fg, interfaceC16820sZ, z2);
        this.A0Q = c7h1;
        C7GY c7gy2 = C7GY.A07;
        this.A06 = new C7H1(userSession, c7gy2, c160007Fm, c159947Fg, interfaceC16820sZ, z2);
        this.A0E = new C7H6(userSession, c160007Fm, interfaceC16820sZ);
        C7H7 c7h7 = new C7H7(activity, userSession, interfaceC16820sZ);
        this.A0R = c7h7;
        C7H8 c7h8 = new C7H8(activity, userSession, c160007Fm, interfaceC16820sZ, interfaceC16820sZ5);
        this.A0A = c7h8;
        C7HA c7ha = new C7HA(activity, userSession, interfaceC16820sZ);
        this.A0Z = c7ha;
        C7HB c7hb = new C7HB(interfaceC16820sZ, userSession, interfaceC16820sZ6);
        this.A0O = c7hb;
        C7HC c7hc = new C7HC(interfaceC16820sZ, userSession, interfaceC16820sZ6);
        this.A0P = c7hc;
        C7HE c7he = new C7HE(interfaceC16820sZ, userSession, interfaceC16820sZ6);
        this.A0Y = c7he;
        C7HF c7hf = new C7HF(activity, context, interfaceC11380iw, userSession, interfaceC83713oG, obj, interfaceC16820sZ, interfaceC16820sZ2);
        this.A07 = c7hf;
        C7HG c7hg = new C7HG(interfaceC16820sZ, userSession, interfaceC16820sZ4);
        this.A0W = c7hg;
        C7HH c7hh = new C7HH(activity, context, userSession, c7fr, c163997Vo, interfaceC16820sZ);
        this.A0S = c7hh;
        C7HI c7hi = new C7HI(userSession, c7fr, c7gy, c160007Fm, interfaceC83713oG, interfaceC16820sZ, interfaceC16820sZ3, interfaceC16820sZ9, z2);
        this.A0C = c7hi;
        this.A0D = new C7HI(userSession, c7fr, c7gy2, c160007Fm, interfaceC83713oG, interfaceC16820sZ, interfaceC16820sZ3, interfaceC16820sZ9, z2);
        C7HJ c7hj = new C7HJ(context, interfaceC11380iw, userSession, interfaceC16820sZ);
        this.A0T = c7hj;
        C7HK c7hk = new C7HK(activity, interfaceC11380iw, userSession, interfaceC16820sZ, interfaceC16820sZ7);
        this.A0X = c7hk;
        this.A0b = new C7HL(userSession, c160007Fm, interfaceC16820sZ, interfaceC16660sJ);
        C160217Gh c160217Gh = (C160217Gh) c9bw.A01;
        if (c160217Gh != null) {
            abstractC160207Gg = c160217Gh.A01;
        } else {
            abstractC160207Gg = null;
        }
        this.A0d = new C7HN(userSession, c160007Fm, abstractC160207Gg, interfaceC16820sZ, new C206819Dm(this, 30));
        this.A0F = new C7HP(userSession, c7f3, c160007Fm, c160007Fm, (C160217Gh) c9bw.A00, interfaceC16820sZ, interfaceC16820sZ14);
        this.A05 = new C7HR(userSession, c160007Fm, c160007Fm, interfaceC16820sZ);
        this.A0a = new C7H2(userSession, C7GY.A04, C7GX.A0E, new C7H3() { // from class: X.7HT
            @Override // X.C7H3
            public final boolean Cp3(String str, boolean z3, boolean z4, boolean z5, boolean z6) {
                InterfaceC160017Fn.this.Cnr(C05F.A0N, true);
                return true;
            }
        }, null, interfaceC16820sZ, -1, -1, -1, 64);
        this.A0c = new C7HV(userSession, c160007Fm, interfaceC16820sZ, interfaceC16820sZ8, interfaceC16660sJ);
        this.A0B = new C7H2(userSession, c7gy2, C7GX.A0N, new C7H3() { // from class: X.7HX
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
            
                if (X.C14360o3.A0K(r0, r5) == false) goto L11;
             */
            @Override // X.C7H3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean Cp3(java.lang.String r5, boolean r6, boolean r7, boolean r8, boolean r9) {
                /*
                    r4 = this;
                    r0 = 4
                    X.C14360o3.A0B(r5, r0)
                    X.7Fq r3 = X.InterfaceC160047Fq.this
                    r3.Edd(r7)
                    r3.Edc(r7)
                    r2 = 0
                    r1 = 1
                    if (r8 != 0) goto L12
                    if (r9 == 0) goto L36
                L12:
                    if (r7 == 0) goto L26
                    X.0sZ r0 = r2
                    java.lang.Object r0 = r0.invoke()
                    X.L8B r0 = (X.L8B) r0
                    if (r0 == 0) goto L34
                    java.lang.String r0 = r0.A03
                L20:
                    boolean r0 = X.C14360o3.A0K(r0, r5)
                    if (r0 != 0) goto L36
                L26:
                    r0 = 1
                L27:
                    if (r6 != 0) goto L2f
                    if (r8 != 0) goto L2f
                    if (r7 != 0) goto L2f
                    if (r9 == 0) goto L30
                L2f:
                    r2 = 1
                L30:
                    r3.FC6(r2, r0)
                    return r1
                L34:
                    r0 = 0
                    goto L20
                L36:
                    r0 = 0
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C7HX.Cp3(java.lang.String, boolean, boolean, boolean, boolean):boolean");
            }
        }, null, interfaceC16820sZ, 2131973280, R.drawable.instagram_direct_pano_filled_24, 2131973280, 64);
        this.A03 = new C7HZ(userSession, c160007Fm, interfaceC16820sZ);
        this.A04 = new C160407Ha(userSession, c160007Fm, interfaceC16820sZ);
        C160417Hb c160417Hb = new C160417Hb(userSession, c7f3, c160007Fm, interfaceC16820sZ15, interfaceC16820sZ);
        this.A08 = c160417Hb;
        C7G5 c7g5 = C7G5.A00;
        C7H2 c7h23 = null;
        if (c7g5.A00(this.A02).intValue() == 0 ? this.A0L : !(this.A0A.A03 != c7gy2 && this.A08.A03 != c7gy2)) {
            c7h23 = this.A0C;
        }
        this.A0V = c7h23;
        C7H2 c7h24 = (c7g5.A00(this.A02).intValue() == 0 || this.A0A.A03 == c7gy2 || this.A08.A03 == c7gy2) ? this.A0D : null;
        this.A0U = c7h24;
        C7GX c7gx = C7GX.A08;
        C09530e4 c09530e4 = new C09530e4(c7gx, c7h7);
        C7GX c7gx2 = C7GX.A04;
        C09530e4 c09530e42 = new C09530e4(c7gx2, c7hb);
        C7GX c7gx3 = C7GX.A05;
        C09530e4 c09530e43 = new C09530e4(c7gx3, c7hc);
        C7GX c7gx4 = C7GX.A0K;
        C09530e4 c09530e44 = new C09530e4(c7gx4, c7he);
        C7GX c7gx5 = C7GX.A0L;
        C09530e4 c09530e45 = new C09530e4(c7gx5, c7h8);
        C7GX c7gx6 = C7GX.A0O;
        C09530e4 c09530e46 = new C09530e4(c7gx6, c7ha);
        C7GX c7gx7 = C7GX.A0F;
        C09530e4 c09530e47 = new C09530e4(c7gx7, c7hj);
        C7GX c7gx8 = C7GX.A0J;
        C09530e4 c09530e48 = new C09530e4(c7gx8, c7hk);
        C7GX c7gx9 = C7GX.A07;
        C09530e4 c09530e49 = new C09530e4(c7gx9, c7hf);
        C7GX c7gx10 = C7GX.A09;
        C09530e4 c09530e410 = new C09530e4(c7gx10, c7hh);
        C7GX c7gx11 = C7GX.A0I;
        C09530e4 c09530e411 = new C09530e4(c7gx11, c7hg);
        C09530e4 c09530e412 = new C09530e4(C7GX.A0P, c7hi);
        C09530e4 c09530e413 = new C09530e4(C7GX.A06, c7h1);
        C7GX c7gx12 = C7GX.A0B;
        this.A0g = AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, c09530e46, c09530e47, c09530e48, c09530e49, c09530e410, c09530e411, c09530e412, c09530e413, new C09530e4(c7gx12, c160417Hb));
        List A1Q2 = AbstractC16960so.A1Q(c7gx6, c7gx7, c7gx8, c7gx, c7gx2, c7gx3, c7gx4, c7gx10, c7gx11, c7gx5, c7gx9, c7gx12);
        this.A0e = A1Q2;
        ArrayList arrayList = new ArrayList();
        Iterator it = A1Q2.iterator();
        while (it.hasNext()) {
            Object obj2 = this.A0g.get(it.next());
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        C7H2 c160427Hc = new C160427Hc(interfaceC11380iw, userSession, c7h24, c7h23, c160007Fm, c160007Fm, c7fm, this.A0G, arrayList, interfaceC16820sZ, interfaceC16820sZ9, interfaceC16820sZ10, interfaceC16820sZ12, this.A0I);
        this.A09 = c160427Hc;
        this.A0f = AbstractC16960so.A1Q(this.A0d, this.A0F, this.A0c, this.A0b, c7g5.A00(this.A02).intValue() != 2 ? this.A05 : c160427Hc, this.A0a);
        int intValue = c7g5.A00(this.A02).intValue();
        if (intValue != 0) {
            C7H2[] c7h2Arr = new C7H2[8];
            C7H2 c7h25 = this.A0A;
            c7h2Arr[0] = c7h25;
            if (intValue != 1) {
                c7h2Arr[1] = this.A03;
                c7h2Arr[2] = this.A04;
                c7h2Arr[3] = this.A0E;
                c7h2Arr[4] = this.A06;
                c7h2Arr[5] = c7h25.A03 != c7gy2 ? this.A0D : null;
                c7h22 = this.A05;
            } else {
                c7h2Arr[1] = this.A03;
                c7h2Arr[2] = this.A04;
                c7h2Arr[3] = this.A0E;
                c7h2Arr[4] = this.A06;
                c7h2Arr[5] = c7h25.A03 != c7gy2 ? this.A0D : null;
                c7h22 = this.A09;
            }
            c7h2Arr[6] = c7h22;
            c7h2Arr[7] = this.A08;
            A1Q = AbstractC16960so.A1R(c7h2Arr);
        } else {
            C7H2 c7h26 = this.A0A;
            C7H2 c7h27 = this.A03;
            C7H2 c7h28 = this.A04;
            C7H2 c7h29 = this.A0E;
            C7H2 c7h210 = this.A06;
            if (this.A0L) {
                c7h2 = this.A09;
            } else {
                c7h2 = this.A0D;
            }
            A1Q = AbstractC16960so.A1Q(c7h26, c7h27, c7h28, c7h29, c7h210, c7h2, this.A08, this.A0F);
        }
        this.A0H = A1Q;
    }
}
