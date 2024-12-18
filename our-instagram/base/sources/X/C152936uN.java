package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.ProfileMediaTabFragment;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6uN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152936uN extends AbstractC152946uO implements InterfaceC65232xL, InterfaceC152956uP {
    public final Context A00;
    public final InterfaceC53792dI A01;
    public final C65662y2 A02;
    public final C65662y2 A03;
    public final UserSession A04;
    public final C152976uR A05;
    public final C153016uV A06;
    public final C66722zp A07;
    public final C153056uZ A08;
    public final C153026uW A09;
    public final C33616EtS A0A;
    public final EnumC125765mR A0B;
    public final ProfileMediaTabFragment A0C;
    public final C155786z8 A0D;
    public final InterfaceC1571373s A0E;
    public final C152996uT A0F;
    public final InterfaceC62602sz A0G;
    public final C65842yM A0H;
    public final Map A0I;
    public final C153006uU A0J;
    public final H8P A0K;
    public final Map A0L;
    public final Map A0M;
    public final AtomicBoolean A0N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009e, code lost:
    
        if (X.AbstractC154746xP.A00(r25) == false) goto L11;
     */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, X.6uV, X.2y0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.2y2, java.lang.Object, X.2y0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.2y2, java.lang.Object, X.2y0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C152936uN(android.content.Context r22, X.InterfaceC53792dI r23, X.InterfaceC11380iw r24, com.instagram.common.session.UserSession r25, X.C53Q r26, X.C38N r27, X.InterfaceC152866uG r28, X.C5GV r29, X.C155896zJ r30, X.C33616EtS r31, final X.EnumC125765mR r32, com.instagram.profile.fragment.ProfileMediaTabFragment r33, X.H8P r34, X.C155786z8 r35, X.InterfaceC1571373s r36, X.C38U r37, X.InterfaceC62602sz r38, X.C53N r39, java.lang.Boolean r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152936uN.<init>(android.content.Context, X.2dI, X.0iw, com.instagram.common.session.UserSession, X.53Q, X.38N, X.6uG, X.5GV, X.6zJ, X.EtS, X.5mR, com.instagram.profile.fragment.ProfileMediaTabFragment, X.H8P, X.6z8, X.73s, X.38U, X.2sz, X.53N, java.lang.Boolean, java.lang.String):void");
    }

    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A0L;
        C153336v2 c153336v2 = (C153336v2) map.get(str);
        if (c153336v2 == null) {
            C153336v2 c153336v22 = new C153336v2();
            map.put(str, c153336v22);
            return c153336v22;
        }
        return c153336v2;
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A0M;
        C75113Zb c75113Zb = (C75113Zb) map.get(c38321qM);
        if (c75113Zb == null) {
            C75113Zb c75113Zb2 = new C75113Zb(c38321qM.A0p(), c38321qM.A4w());
            map.put(c38321qM, c75113Zb2);
            return c75113Zb2;
        }
        return c75113Zb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0.length() == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r12 = this;
            X.0cb r0 = X.C17060sy.A01
            com.instagram.common.session.UserSession r10 = r12.A04
            com.instagram.user.model.User r1 = r0.A01(r10)
            java.lang.String r0 = r1.getFullName()
            r11 = 1
            if (r0 == 0) goto L1c
            java.lang.String r0 = r1.getFullName()
            if (r0 == 0) goto L1c
            int r0 = r0.length()
            r9 = 1
            if (r0 != 0) goto L1d
        L1c:
            r9 = 0
        L1d:
            java.lang.String r0 = r1.A0N()
            if (r0 == 0) goto L30
            java.lang.String r0 = r1.A0N()
            if (r0 == 0) goto L30
            int r0 = r0.length()
            r8 = 1
            if (r0 != 0) goto L31
        L30:
            r8 = 0
        L31:
            X.0Tz r7 = X.C06090Tz.A05
            r3 = 36599585288687209(0x820721000f0e69, double:3.209063339042076E-306)
            long r5 = X.C18U.A01(r7, r10, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1 = 2
            if (r0 == 0) goto L48
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L58
        L48:
            long r3 = X.C18U.A01(r7, r10, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1 = 1
            if (r0 == 0) goto L5f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L5f
        L58:
            if (r9 == 0) goto L5c
            if (r8 != 0) goto L61
        L5c:
            if (r11 == 0) goto L61
            return
        L5f:
            r11 = 0
            goto L58
        L61:
            X.6uZ r2 = r12.A08
            X.2dI r0 = r12.A01
            X.Dt6 r1 = r2.A00(r0)
            X.6ua r0 = r2.A03
            r12.addModel(r1, r0)
            r1 = 0
            X.2y2 r0 = r2.A01
            r12.addModel(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152936uN.A00():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x026e, code lost:
    
        if (r1.A02 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012f, code lost:
    
        if (r1.A02 == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0290 A[Catch: all -> 0x02a2, TryCatch #1 {all -> 0x02a2, blocks: (B:85:0x019e, B:88:0x01ac, B:90:0x01c5, B:92:0x01cc, B:94:0x01d3, B:96:0x01e2, B:97:0x01e6, B:99:0x01ec, B:102:0x01f8, B:105:0x020f, B:106:0x0213, B:107:0x0222, B:110:0x022e, B:112:0x0234, B:116:0x0249, B:117:0x0250, B:121:0x023e, B:126:0x0251, B:128:0x0266, B:130:0x026c, B:132:0x0296, B:134:0x027d, B:136:0x0290, B:138:0x029c, B:139:0x0270, B:141:0x027a), top: B:84:0x019e, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029c A[Catch: all -> 0x02a2, TRY_LEAVE, TryCatch #1 {all -> 0x02a2, blocks: (B:85:0x019e, B:88:0x01ac, B:90:0x01c5, B:92:0x01cc, B:94:0x01d3, B:96:0x01e2, B:97:0x01e6, B:99:0x01ec, B:102:0x01f8, B:105:0x020f, B:106:0x0213, B:107:0x0222, B:110:0x022e, B:112:0x0234, B:116:0x0249, B:117:0x0250, B:121:0x023e, B:126:0x0251, B:128:0x0266, B:130:0x026c, B:132:0x0296, B:134:0x027d, B:136:0x0290, B:138:0x029c, B:139:0x0270, B:141:0x027a), top: B:84:0x019e, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:40:0x00a8, B:46:0x010e, B:48:0x0115, B:50:0x0119, B:52:0x0127, B:54:0x012d, B:56:0x0131, B:58:0x013b, B:59:0x0146, B:60:0x014b, B:62:0x015c, B:64:0x0166, B:66:0x0183, B:70:0x010c, B:71:0x00c4, B:73:0x00d2, B:74:0x00f4, B:75:0x00ff), top: B:39:0x00a8, outer: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152936uN.A01():void");
    }

    @Override // X.C2US, X.C2UT, X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int hashCode;
        int A03 = C0f9.A03(-705030999);
        Object item = getItem(i);
        InterfaceC65642y0 binderGroup = getBinderGroup(i);
        if (binderGroup == this.A05) {
            C14360o3.A0C(item, "null cannot be cast to non-null type com.instagram.util.ListSlice<*>");
            hashCode = String.valueOf(item.hashCode()).hashCode();
        } else {
            hashCode = Arrays.hashCode(new Object[]{binderGroup, Integer.valueOf(getBinderGroupViewType(i))});
        }
        long j = hashCode;
        C0f9.A0A(-1758365325, A03);
        return j;
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        A01();
    }
}
