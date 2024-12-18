package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.39b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C691539b {
    public final Context A00;
    public final C62862tP A01;
    public final UserSession A02;
    public final InterfaceC686036x A03;
    public final C691739d A04;
    public final C691639c A05;
    public final C691439a A06;
    public final C61142qc A07;
    public final InterfaceC63362uJ A08;
    public final InterfaceC60442pS A09;
    public final C57332k8 A0A;
    public final C65502xm A0B;
    public final C57462kL A0C;
    public final C1M1 A0D;
    public final Boolean A0E;
    public final String A0F;
    public final String A0G;
    public final ConcurrentMap A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final SearchContext A0P;
    public final Integer A0Q;

    public C691539b(Context context, C62862tP c62862tP, UserSession userSession, InterfaceC686036x interfaceC686036x, C691439a c691439a, C61142qc c61142qc, InterfaceC63362uJ interfaceC63362uJ, InterfaceC60442pS interfaceC60442pS, C57332k8 c57332k8, C65502xm c65502xm, C57462kL c57462kL, SearchContext searchContext, C1M1 c1m1, Boolean bool, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c61142qc, 2);
        C14360o3.A0B(c57332k8, 5);
        C14360o3.A0B(userSession, 6);
        C14360o3.A0B(interfaceC60442pS, 7);
        C14360o3.A0B(c65502xm, 12);
        C14360o3.A0B(c57462kL, 13);
        C14360o3.A0B(c691439a, 21);
        this.A00 = context;
        this.A07 = c61142qc;
        this.A01 = c62862tP;
        this.A03 = interfaceC686036x;
        this.A0A = c57332k8;
        this.A02 = userSession;
        this.A09 = interfaceC60442pS;
        this.A08 = interfaceC63362uJ;
        this.A0D = c1m1;
        this.A0M = z;
        this.A0N = z2;
        this.A0B = c65502xm;
        this.A0C = c57462kL;
        this.A0F = str;
        this.A0O = z3;
        this.A0Q = num;
        this.A0E = bool;
        this.A0P = searchContext;
        this.A0G = str2;
        this.A06 = c691439a;
        this.A0L = AbstractC56862jK.A00(context);
        C18B c18b = new C18B();
        c18b.A03(64);
        c18b.A01();
        this.A0H = c18b.A00();
        this.A05 = new C691639c(userSession, interfaceC686036x, interfaceC60442pS, c65502xm, c57462kL);
        this.A0I = AbstractC09440dt.A01(new C206939Dy(this, 48));
        this.A04 = (C691739d) userSession.A01(C691739d.class, new DGY(userSession, 28));
        this.A0K = AbstractC09440dt.A01(new C206909Dv(this, 0));
        this.A0J = AbstractC09440dt.A00(EnumC09460dv.A04, new C206939Dy(this, 49));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (X.AbstractC76243bU.A02(r2, r13, r14) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (X.C903540u.A00.A01(r11.A02, r13) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76293bZ A02(com.instagram.common.typedurl.ImageUrl r12, X.C38321qM r13, X.C75113Zb r14, java.lang.String r15) {
        /*
            r11 = this;
            r8 = 0
            r1 = 1
            X.C14360o3.A0B(r14, r1)
            boolean r0 = r11.A0O
            if (r0 != 0) goto L2a
            com.instagram.common.session.UserSession r2 = r11.A02
            boolean r0 = X.AbstractC76243bU.A01(r2, r13, r14)
            if (r0 != 0) goto L2a
            boolean r0 = X.AbstractC76243bU.A00(r2, r13)
            if (r0 != 0) goto L2a
            boolean r0 = X.AbstractC76243bU.A03(r2, r13, r14)
            if (r0 != 0) goto L2a
            boolean r0 = X.AbstractC76243bU.A04(r2, r13, r14)
            if (r0 != 0) goto L2a
            boolean r0 = X.AbstractC76243bU.A02(r2, r13, r14)
            r6 = 0
            if (r0 == 0) goto L2b
        L2a:
            r6 = 1
        L2b:
            boolean r0 = r13.A5M()
            if (r0 == 0) goto L3c
            X.40u r2 = X.C903540u.A00
            com.instagram.common.session.UserSession r0 = r11.A02
            boolean r0 = r2.A01(r0, r13)
            r7 = 1
            if (r0 != 0) goto L3d
        L3c:
            r7 = 0
        L3d:
            r2 = 0
            java.lang.Integer r4 = X.C05F.A00
            java.lang.String r5 = ""
            com.instagram.search.common.analytics.SearchContext r3 = r11.A0P
            X.5Ft r0 = r13.A0b
            r10 = 0
            if (r0 == 0) goto L4a
            r10 = 1
        L4a:
            java.lang.Integer r0 = r11.A0Q
            if (r0 != 0) goto L5e
            com.instagram.common.session.UserSession r0 = r11.A02
            com.instagram.user.model.User r0 = r13.A2E(r0)
            if (r0 == 0) goto L5f
            boolean r0 = r0.isVerified()
            if (r0 != r1) goto L5f
            java.lang.Integer r0 = X.C05F.A01
        L5e:
            r4 = r0
        L5f:
            if (r15 == 0) goto L62
            r5 = r15
        L62:
            X.3bZ r0 = new X.3bZ
            r1 = r12
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C691539b.A02(com.instagram.common.typedurl.ImageUrl, X.1qM, X.3Zb, java.lang.String):X.3bZ");
    }

    public final void A03(View view, EnumC65592xv enumC65592xv, Object obj, Object obj2) {
        C14360o3.A0B(enumC65592xv, 1);
        C14360o3.A0B(obj, 2);
        C14360o3.A0B(obj2, 3);
        if (!enumC65592xv.A01 || !this.A0B.A0V) {
            this.A03.BS6().EDq(view, enumC65592xv.ordinal(), obj, obj2);
        }
        if (enumC65592xv == EnumC65592xv.A0S || enumC65592xv == EnumC65592xv.A0l) {
            InterfaceC75403a7 BS6 = this.A03.BS6();
            View requireViewById = view.requireViewById(R.id.media_content_location);
            C14360o3.A07(requireViewById);
            BS6.EDq(requireViewById, EnumC65592xv.A0w.ordinal(), obj, obj2);
        }
    }

    public static final C78983g4 A00(C691539b c691539b, C38321qM c38321qM, C75113Zb c75113Zb) {
        Object value = c691539b.A0K.getValue();
        C9FY c9fy = new C9FY(18, value, c691539b, c75113Zb, c38321qM);
        C9F4 c9f4 = new C9F4(7, c38321qM, c75113Zb);
        C206939Dy c206939Dy = new C206939Dy(c38321qM, 46);
        C9FY c9fy2 = new C9FY(25, value, c691539b, c75113Zb, c38321qM);
        C9FX c9fx = new C9FX(8, c38321qM, c691539b, value, c75113Zb);
        C206939Dy c206939Dy2 = new C206939Dy(c691539b, 47);
        C9FO c9fo = new C9FO(20, c691539b, c38321qM, c75113Zb);
        C9FQ c9fq = new C9FQ(6, c38321qM, c691539b, value);
        C207219Fa c207219Fa = new C207219Fa(7, c691539b, c75113Zb, c38321qM, value);
        C9F4 c9f42 = new C9F4(3, c38321qM, value);
        C9FJ c9fj = new C9FJ(47, c75113Zb, value, c38321qM);
        C9FJ c9fj2 = new C9FJ(48, c75113Zb, value, c38321qM);
        C9FX c9fx2 = new C9FX(4, c38321qM, c691539b, value, c75113Zb);
        C9F4 c9f43 = new C9F4(4, c38321qM, value);
        C207169Ev c207169Ev = new C207169Ev(10, c38321qM, c691539b);
        C9FY c9fy3 = new C9FY(17, value, c691539b, c75113Zb, c38321qM);
        C207189Ex c207189Ex = new C207189Ex(49, c691539b, c38321qM);
        C9FX c9fx3 = new C9FX(5, c38321qM, c691539b, value, c75113Zb);
        C9FJ c9fj3 = new C9FJ(49, c75113Zb, value, c38321qM);
        C9FY c9fy4 = new C9FY(19, value, c691539b, c75113Zb, c38321qM);
        C9FY c9fy5 = new C9FY(20, value, c691539b, c75113Zb, c38321qM);
        C9F4 c9f44 = new C9F4(5, c38321qM, value);
        C206939Dy c206939Dy3 = new C206939Dy(c691539b, 42);
        C9FX c9fx4 = new C9FX(6, c38321qM, c691539b, value, c75113Zb);
        C9FX c9fx5 = new C9FX(7, c38321qM, c691539b, value, c75113Zb);
        C206939Dy c206939Dy4 = new C206939Dy(c38321qM, 43);
        C9FQ c9fq2 = new C9FQ(0, c38321qM, c691539b, c75113Zb);
        C9FQ c9fq3 = new C9FQ(1, c38321qM, c691539b, value);
        C9F4 c9f45 = new C9F4(6, c38321qM, value);
        C206939Dy c206939Dy5 = new C206939Dy(c691539b, 44);
        C9FY c9fy6 = new C9FY(21, value, c691539b, c75113Zb, c38321qM);
        C9FY c9fy7 = new C9FY(22, value, c691539b, c75113Zb, c38321qM);
        C207219Fa c207219Fa2 = new C207219Fa(6, c691539b, c75113Zb, c38321qM, value);
        return new C78983g4(c9fy, c9f4, c206939Dy, c9fy2, c206939Dy2, c9fq, c9f42, c9fj, c9fj2, c9f43, c9fy3, c9fj3, c9fy4, c9fy5, c9f44, c206939Dy3, c206939Dy4, c9fq2, c9fq3, c9f45, c206939Dy5, c9fy6, c9fy7, new C206939Dy(c38321qM, 45), new C9FY(23, value, c691539b, c75113Zb, c38321qM), new C9F4(8, c38321qM, c691539b), new C9F4(9, c38321qM, c691539b), new C9FQ(2, c38321qM, c691539b, value), new C9FY(24, value, c691539b, c75113Zb, c38321qM), new C9FQ(3, c38321qM, value, c75113Zb), new C9F4(10, c38321qM, c691539b), new C9FQ(4, c38321qM, value, c75113Zb), new C9FQ(5, c38321qM, value, c75113Zb), c9fx, c9fo, c9fx2, c207189Ex, c9fx3, c9fx4, c9fx5, new C207179Ew(0, c75113Zb, value), c207219Fa, c207169Ev, c207219Fa2, new C207169Ev(11, c38321qM, c75113Zb), new C9FN(6, c75113Zb, c691539b, c38321qM));
    }

    public static final C76873cZ A01(C691539b c691539b, C38321qM c38321qM, C75113Zb c75113Zb) {
        return new C76873cZ(c691539b.A00, c691539b.A02, c38321qM, c75113Zb, c691539b.A09.getModuleName(), true);
    }
}
