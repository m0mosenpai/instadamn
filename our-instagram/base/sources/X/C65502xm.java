package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2xm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65502xm {
    public final float A00;
    public final C2V6 A01;
    public final UserSession A02;
    public final EnumC65592xv A03;
    public final C65532xp A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final C57462kL A0X;
    public final Map A0Y;
    public final Map A0Z;
    public final Map A0a;

    public final EnumC65592xv A00(C38321qM c38321qM, EnumC65542xq enumC65542xq, String str) {
        EnumC65592xv enumC65592xv;
        C14360o3.A0B(str, 1);
        if (A03(c38321qM, enumC65542xq, str)) {
            enumC65592xv = (EnumC65592xv) this.A0Z.get(enumC65542xq);
            if (enumC65592xv == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Row type: ");
                sb.append(enumC65542xq);
                sb.append(" has no associated litho item type");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            enumC65592xv = (EnumC65592xv) this.A0a.get(enumC65542xq);
            if (enumC65592xv == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Row type: ");
                sb2.append(enumC65542xq);
                sb2.append(" has no associated non-litho item type");
                throw new IllegalStateException(sb2.toString());
            }
        }
        return enumC65592xv;
    }

    public final EnumC65592xv A01(C38321qM c38321qM, String str) {
        C14360o3.A0B(str, 1);
        if (A03(c38321qM, EnumC65542xq.A07, str)) {
            return EnumC65592xv.A0j;
        }
        if (!this.A0X.A04() && A03(c38321qM, EnumC65542xq.A08, str)) {
            return EnumC65592xv.A0l;
        }
        return EnumC65592xv.A0S;
    }

    public final Integer A02(EnumC65542xq enumC65542xq, String str) {
        Boolean valueOf;
        boolean A02;
        C14360o3.A0B(str, 1);
        C65532xp c65532xp = this.A04;
        if (enumC65542xq != EnumC65542xq.A09) {
            if (c65532xp.A04.contains(enumC65542xq)) {
                valueOf = Boolean.valueOf(C65532xp.A00((AbstractC65572xt) c65532xp.A02.get(enumC65542xq), str));
                A02 = C65532xp.A00((AbstractC65572xt) c65532xp.A03.get(enumC65542xq), str);
            }
            return C05F.A0C;
        }
        valueOf = Boolean.valueOf(C65532xp.A01(c65532xp, str));
        A02 = C65532xp.A02(c65532xp, str);
        Boolean valueOf2 = Boolean.valueOf(A02);
        boolean booleanValue = valueOf.booleanValue();
        boolean booleanValue2 = valueOf2.booleanValue();
        if (booleanValue) {
            if (booleanValue2) {
                return C05F.A00;
            }
            return C05F.A01;
        }
        return C05F.A0C;
    }

    public final boolean A03(C38321qM c38321qM, EnumC65542xq enumC65542xq, String str) {
        Enum r7;
        AbstractC65572xt abstractC65572xt;
        Enum r72;
        Map map;
        C14360o3.A0B(str, 1);
        C65532xp c65532xp = this.A04;
        if (enumC65542xq != EnumC65542xq.A09 && !c65532xp.A04.contains(enumC65542xq)) {
            Integer A02 = A02(enumC65542xq, str);
            if (A02 == C05F.A0C) {
                return false;
            }
            if (c38321qM.CdW() && A02 != C05F.A00) {
                return false;
            }
            return true;
        }
        int ordinal = enumC65542xq.ordinal();
        if (ordinal != 8) {
            boolean CdW = c38321qM.CdW();
            if (ordinal != 2) {
                if (!CdW) {
                    map = c65532xp.A02;
                    r72 = enumC65542xq;
                }
            } else if (!CdW) {
                abstractC65572xt = null;
                return C65532xp.A00(abstractC65572xt, str);
            }
            map = c65532xp.A03;
            r72 = enumC65542xq;
        } else {
            if (!c38321qM.Cff() && !c38321qM.A5g()) {
                if (c38321qM.A4z()) {
                    r7 = EnumC65552xr.A03;
                } else {
                    r7 = EnumC65552xr.A02;
                }
            } else {
                r7 = EnumC65552xr.A04;
            }
            if (c38321qM.CdW()) {
                map = c65532xp.A01;
                r72 = r7;
            } else {
                map = c65532xp.A00;
                r72 = r7;
            }
        }
        abstractC65572xt = (AbstractC65572xt) map.get(r72);
        return C65532xp.A00(abstractC65572xt, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x019a, code lost:
    
        if (java.lang.Boolean.valueOf(X.C18U.A06(r4, r30.A02, 36323328698166443L)).booleanValue() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01c8, code lost:
    
        if (java.lang.Boolean.valueOf(X.C18U.A06(r4, r30.A02, 36323328696855712L)).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0236, code lost:
    
        if (java.lang.Boolean.valueOf(X.C18U.A06(r4, r30.A02, 36323328696921249L)).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x032f, code lost:
    
        if (java.lang.Boolean.valueOf(X.C18U.A06(r4, r30.A02, 36323328697314468L)).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x035d, code lost:
    
        if (java.lang.Boolean.valueOf(X.C18U.A06(r4, r30.A02, 36326176259585765L)).booleanValue() != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C65502xm(com.instagram.common.session.UserSession r31) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65502xm.<init>(com.instagram.common.session.UserSession):void");
    }
}
