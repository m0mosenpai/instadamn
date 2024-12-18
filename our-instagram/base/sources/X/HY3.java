package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.ProfileMediaTabFragment;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class HY3 extends AbstractC152946uO implements InterfaceC65232xL, InterfaceC152956uP {
    public final Context A00;
    public final InterfaceC53792dI A01;
    public final C65662y2 A02;
    public final C65662y2 A03;
    public final UserSession A04;
    public final HFU A05;
    public final C41062IGf A06;
    public final C153056uZ A07;
    public final C42749Ivn A08;
    public final C33616EtS A09;
    public final EnumC125765mR A0A;
    public final ProfileMediaTabFragment A0B;
    public final C155786z8 A0C;
    public final C152996uT A0D;
    public final InterfaceC62602sz A0E;
    public final C65842yM A0F;
    public final HashMap A0G;
    public final InterfaceC11380iw A0H;
    public final C53Q A0I;
    public final C38N A0J;
    public final InterfaceC152866uG A0K;
    public final C153016uV A0L;
    public final C153006uU A0M;
    public final InterfaceC152886uI A0N;
    public final C66722zp A0O;
    public final C5GV A0P;
    public final H8P A0Q;
    public final JHJ A0R;
    public final C38U A0S;
    public final C53N A0T;
    public final HashMap A0U;
    public final HashMap A0V;
    public final AtomicBoolean A0W;

    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        C14360o3.A0B(str, 0);
        HashMap hashMap = this.A0U;
        C153336v2 c153336v2 = (C153336v2) hashMap.get(str);
        if (c153336v2 == null) {
            C153336v2 c153336v22 = new C153336v2();
            hashMap.put(str, c153336v22);
            return c153336v22;
        }
        return c153336v2;
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        HashMap hashMap = this.A0V;
        C75113Zb c75113Zb = (C75113Zb) hashMap.get(c38321qM);
        if (c75113Zb == null) {
            C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
            hashMap.put(c38321qM, A0E);
            return A0E;
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
            X.6uZ r2 = r12.A07
            X.2dI r0 = r12.A01
            X.Dt6 r1 = r2.A00(r0)
            X.6ua r0 = r2.A03
            r12.addModel(r1, r0)
            r1 = 0
            X.2y2 r0 = r2.A01
            r12.addModel(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HY3.A00():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ba, code lost:
    
        if (r1.A02 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f1, code lost:
    
        if (r1.A02 == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e6 A[Catch: all -> 0x034b, TryCatch #1 {all -> 0x034b, blocks: (B:5:0x0010, B:7:0x0016, B:8:0x0019, B:10:0x0042, B:12:0x0048, B:43:0x01dd, B:45:0x01e3, B:47:0x02f2, B:49:0x030d, B:52:0x0319, B:54:0x031f, B:63:0x0333, B:66:0x0347, B:67:0x034a, B:98:0x01ed, B:102:0x01f8, B:104:0x01fe, B:157:0x02e0, B:159:0x02e6, B:160:0x02ec, B:167:0x033e, B:51:0x0313, B:14:0x0050, B:16:0x005a, B:17:0x005c, B:23:0x0097, B:24:0x00d7, B:26:0x00db, B:28:0x00e9, B:30:0x00ef, B:32:0x00f3, B:34:0x00fd, B:35:0x0108, B:36:0x010d, B:38:0x011e, B:40:0x0125, B:69:0x00a9, B:71:0x00b7, B:72:0x013b, B:74:0x0147, B:79:0x0160, B:80:0x01c2, B:81:0x01a9, B:82:0x01ae, B:84:0x017f, B:85:0x01a3, B:86:0x01cb, B:87:0x009a, B:88:0x0069, B:90:0x006f, B:92:0x007f, B:93:0x0082, B:95:0x008c, B:96:0x008f, B:106:0x0206, B:108:0x0213, B:110:0x022e, B:112:0x0235, B:114:0x023c, B:115:0x0240, B:117:0x0246, B:120:0x0250, B:123:0x0256, B:126:0x025c, B:130:0x026f, B:131:0x0273, B:133:0x027e, B:136:0x028a, B:144:0x0294, B:148:0x029d, B:150:0x02b2, B:152:0x02b8, B:154:0x02d4, B:156:0x02c9, B:162:0x02da, B:163:0x02bc, B:165:0x02c6), top: B:4:0x0010, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02da A[Catch: all -> 0x033d, TRY_LEAVE, TryCatch #3 {all -> 0x033d, blocks: (B:106:0x0206, B:108:0x0213, B:110:0x022e, B:112:0x0235, B:114:0x023c, B:115:0x0240, B:117:0x0246, B:120:0x0250, B:123:0x0256, B:126:0x025c, B:130:0x026f, B:131:0x0273, B:133:0x027e, B:136:0x028a, B:144:0x0294, B:148:0x029d, B:150:0x02b2, B:152:0x02b8, B:154:0x02d4, B:156:0x02c9, B:162:0x02da, B:163:0x02bc, B:165:0x02c6), top: B:105:0x0206, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e A[Catch: all -> 0x01ec, TryCatch #2 {all -> 0x01ec, blocks: (B:14:0x0050, B:16:0x005a, B:17:0x005c, B:23:0x0097, B:24:0x00d7, B:26:0x00db, B:28:0x00e9, B:30:0x00ef, B:32:0x00f3, B:34:0x00fd, B:35:0x0108, B:36:0x010d, B:38:0x011e, B:40:0x0125, B:69:0x00a9, B:71:0x00b7, B:72:0x013b, B:74:0x0147, B:79:0x0160, B:80:0x01c2, B:81:0x01a9, B:82:0x01ae, B:84:0x017f, B:85:0x01a3, B:86:0x01cb, B:87:0x009a, B:88:0x0069, B:90:0x006f, B:92:0x007f, B:93:0x0082, B:95:0x008c, B:96:0x008f), top: B:13:0x0050, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e3 A[Catch: all -> 0x034b, TryCatch #1 {all -> 0x034b, blocks: (B:5:0x0010, B:7:0x0016, B:8:0x0019, B:10:0x0042, B:12:0x0048, B:43:0x01dd, B:45:0x01e3, B:47:0x02f2, B:49:0x030d, B:52:0x0319, B:54:0x031f, B:63:0x0333, B:66:0x0347, B:67:0x034a, B:98:0x01ed, B:102:0x01f8, B:104:0x01fe, B:157:0x02e0, B:159:0x02e6, B:160:0x02ec, B:167:0x033e, B:51:0x0313, B:14:0x0050, B:16:0x005a, B:17:0x005c, B:23:0x0097, B:24:0x00d7, B:26:0x00db, B:28:0x00e9, B:30:0x00ef, B:32:0x00f3, B:34:0x00fd, B:35:0x0108, B:36:0x010d, B:38:0x011e, B:40:0x0125, B:69:0x00a9, B:71:0x00b7, B:72:0x013b, B:74:0x0147, B:79:0x0160, B:80:0x01c2, B:81:0x01a9, B:82:0x01ae, B:84:0x017f, B:85:0x01a3, B:86:0x01cb, B:87:0x009a, B:88:0x0069, B:90:0x006f, B:92:0x007f, B:93:0x0082, B:95:0x008c, B:96:0x008f, B:106:0x0206, B:108:0x0213, B:110:0x022e, B:112:0x0235, B:114:0x023c, B:115:0x0240, B:117:0x0246, B:120:0x0250, B:123:0x0256, B:126:0x025c, B:130:0x026f, B:131:0x0273, B:133:0x027e, B:136:0x028a, B:144:0x0294, B:148:0x029d, B:150:0x02b2, B:152:0x02b8, B:154:0x02d4, B:156:0x02c9, B:162:0x02da, B:163:0x02bc, B:165:0x02c6), top: B:4:0x0010, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x030d A[Catch: all -> 0x034b, TRY_LEAVE, TryCatch #1 {all -> 0x034b, blocks: (B:5:0x0010, B:7:0x0016, B:8:0x0019, B:10:0x0042, B:12:0x0048, B:43:0x01dd, B:45:0x01e3, B:47:0x02f2, B:49:0x030d, B:52:0x0319, B:54:0x031f, B:63:0x0333, B:66:0x0347, B:67:0x034a, B:98:0x01ed, B:102:0x01f8, B:104:0x01fe, B:157:0x02e0, B:159:0x02e6, B:160:0x02ec, B:167:0x033e, B:51:0x0313, B:14:0x0050, B:16:0x005a, B:17:0x005c, B:23:0x0097, B:24:0x00d7, B:26:0x00db, B:28:0x00e9, B:30:0x00ef, B:32:0x00f3, B:34:0x00fd, B:35:0x0108, B:36:0x010d, B:38:0x011e, B:40:0x0125, B:69:0x00a9, B:71:0x00b7, B:72:0x013b, B:74:0x0147, B:79:0x0160, B:80:0x01c2, B:81:0x01a9, B:82:0x01ae, B:84:0x017f, B:85:0x01a3, B:86:0x01cb, B:87:0x009a, B:88:0x0069, B:90:0x006f, B:92:0x007f, B:93:0x0082, B:95:0x008c, B:96:0x008f, B:106:0x0206, B:108:0x0213, B:110:0x022e, B:112:0x0235, B:114:0x023c, B:115:0x0240, B:117:0x0246, B:120:0x0250, B:123:0x0256, B:126:0x025c, B:130:0x026f, B:131:0x0273, B:133:0x027e, B:136:0x028a, B:144:0x0294, B:148:0x029d, B:150:0x02b2, B:152:0x02b8, B:154:0x02d4, B:156:0x02c9, B:162:0x02da, B:163:0x02bc, B:165:0x02c6), top: B:4:0x0010, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x031f A[Catch: all -> 0x034b, TRY_LEAVE, TryCatch #1 {all -> 0x034b, blocks: (B:5:0x0010, B:7:0x0016, B:8:0x0019, B:10:0x0042, B:12:0x0048, B:43:0x01dd, B:45:0x01e3, B:47:0x02f2, B:49:0x030d, B:52:0x0319, B:54:0x031f, B:63:0x0333, B:66:0x0347, B:67:0x034a, B:98:0x01ed, B:102:0x01f8, B:104:0x01fe, B:157:0x02e0, B:159:0x02e6, B:160:0x02ec, B:167:0x033e, B:51:0x0313, B:14:0x0050, B:16:0x005a, B:17:0x005c, B:23:0x0097, B:24:0x00d7, B:26:0x00db, B:28:0x00e9, B:30:0x00ef, B:32:0x00f3, B:34:0x00fd, B:35:0x0108, B:36:0x010d, B:38:0x011e, B:40:0x0125, B:69:0x00a9, B:71:0x00b7, B:72:0x013b, B:74:0x0147, B:79:0x0160, B:80:0x01c2, B:81:0x01a9, B:82:0x01ae, B:84:0x017f, B:85:0x01a3, B:86:0x01cb, B:87:0x009a, B:88:0x0069, B:90:0x006f, B:92:0x007f, B:93:0x0082, B:95:0x008c, B:96:0x008f, B:106:0x0206, B:108:0x0213, B:110:0x022e, B:112:0x0235, B:114:0x023c, B:115:0x0240, B:117:0x0246, B:120:0x0250, B:123:0x0256, B:126:0x025c, B:130:0x026f, B:131:0x0273, B:133:0x027e, B:136:0x028a, B:144:0x0294, B:148:0x029d, B:150:0x02b2, B:152:0x02b8, B:154:0x02d4, B:156:0x02c9, B:162:0x02da, B:163:0x02bc, B:165:0x02c6), top: B:4:0x0010, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HY3.A01():void");
    }

    @Override // X.C2US, X.C2UT, X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int hashCode;
        int A03 = C0f9.A03(-146655494);
        Object item = getItem(i);
        InterfaceC65642y0 binderGroup = getBinderGroup(i);
        if (binderGroup == this.A05) {
            C14360o3.A0C(item, AbstractC111324zv.A00(2803));
            hashCode = AbstractC166997dE.A0u(item).hashCode();
        } else {
            hashCode = Arrays.hashCode(AbstractC25228BEl.A1Z(binderGroup, getBinderGroupViewType(i)));
        }
        long j = hashCode;
        C0f9.A0A(-1251239645, A03);
        return j;
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        A01();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0123, code lost:
    
        if (X.AbstractC154746xP.A00(r36) == false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r16v0, types: [X.2y2, java.lang.Object, X.2y0] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, X.6uV, X.2y0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.2y2, java.lang.Object, X.2y0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HY3(android.content.Context r33, X.InterfaceC53792dI r34, X.InterfaceC11380iw r35, com.instagram.common.session.UserSession r36, X.C53Q r37, X.C38N r38, X.InterfaceC152866uG r39, X.InterfaceC152886uI r40, X.C5GV r41, X.C42749Ivn r42, X.C33616EtS r43, X.EnumC125765mR r44, com.instagram.profile.fragment.ProfileMediaTabFragment r45, X.H8P r46, X.C155786z8 r47, X.JHJ r48, X.C38U r49, X.InterfaceC62602sz r50, X.C53N r51, java.lang.String r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HY3.<init>(android.content.Context, X.2dI, X.0iw, com.instagram.common.session.UserSession, X.53Q, X.38N, X.6uG, X.6uI, X.5GV, X.Ivn, X.EtS, X.5mR, com.instagram.profile.fragment.ProfileMediaTabFragment, X.H8P, X.6z8, X.JHJ, X.38U, X.2sz, X.53N, java.lang.String, boolean):void");
    }
}
