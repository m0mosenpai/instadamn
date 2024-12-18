package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.opal.impl.data.OpalProfileData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Mtj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51760Mtj extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public static boolean A04(Object obj, int i) {
        if ((obj instanceof C51760Mtj) && ((C51760Mtj) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51760Mtj.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:94:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51760Mtj.hashCode():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String str;
        String str2;
        Object obj;
        String str3;
        switch (this.A03) {
            case 5:
                A1C = AbstractC166987dD.A1C();
                A1C.append("FloatingGridViewModel(items=");
                A1C.append(this.A02);
                str3 = ", gridLayoutStrategy=";
                A1C.append(str3);
                obj = this.A00;
                return AbstractC167017dG.A0o(obj, A1C);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A1C = AbstractC166987dD.A1C();
                A1C.append("Triplet(first=");
                A1C.append(this.A00);
                A1C.append(AbstractC43591JPw.A00(102));
                A1C.append(this.A01);
                str = ", third=";
                A1C.append(str);
                obj = this.A02;
                return AbstractC167017dG.A0o(obj, A1C);
            case Process.SIGTERM /* 15 */:
                A1C = AbstractC166987dD.A1C();
                A1C.append("ClipsVoiceoverSegmentUpdates(snippetStartTimeMs=");
                A1C.append(this.A01);
                A1C.append(", startTimeInVideoMs=");
                A1C.append(this.A02);
                str3 = ", endTimeMsInVideoMs=";
                A1C.append(str3);
                obj = this.A00;
                return AbstractC167017dG.A0o(obj, A1C);
            case 20:
                A1C = AbstractC166987dD.A1C();
                A1C.append("ReelXpostContentEligibilityState(xpostContentFeatureState=");
                A1C.append(this.A02);
                A1C.append(", xarContentEligibilityState=");
                A1C.append(this.A01);
                str3 = ", ccpContentEligibilityState=";
                A1C.append(str3);
                obj = this.A00;
                return AbstractC167017dG.A0o(obj, A1C);
            case 24:
                A1C = AbstractC166987dD.A1C();
                A1C.append("ContentFields(contentImageUrl=");
                A1C.append(this.A00);
                A1C.append(", title=");
                A1C.append(this.A02);
                str2 = ", subtitle=";
                A1C.append(str2);
                obj = this.A01;
                return AbstractC167017dG.A0o(obj, A1C);
            case 35:
                A1C = AbstractC166987dD.A1C();
                A1C.append("BoostUpsellBannerUiAction(shouldHideBanner=");
                A1C.append(this.A02);
                A1C.append(", getBannerPayload=");
                A1C.append(this.A00);
                str2 = ", getMediaId=";
                A1C.append(str2);
                obj = this.A01;
                return AbstractC167017dG.A0o(obj, A1C);
            case 47:
                A1C = AbstractC166987dD.A1C();
                A1C.append("SearchSectionDescriptionModel(description=");
                A1C.append(this.A00);
                A1C.append(", linkText=");
                A1C.append(this.A01);
                str = ", linkUrl=";
                A1C.append(str);
                obj = this.A02;
                return AbstractC167017dG.A0o(obj, A1C);
            default:
                return super.toString();
        }
    }

    public static final C51760Mtj A00(C51748MtX c51748MtX, Integer num, List list) {
        AbstractC167017dG.A1O(num, list);
        return new C51760Mtj(c51748MtX, num, list);
    }

    public static final C51760Mtj A01(QJ0 qj0, List list, List list2) {
        AbstractC167017dG.A1P(list, list2);
        return new C51760Mtj(qj0, list, list2);
    }

    public static final C51760Mtj A02(OpalProfileData opalProfileData, OpalProfileData opalProfileData2, C74 c74) {
        AbstractC167017dG.A1P(opalProfileData2, c74);
        return new C51760Mtj(opalProfileData, opalProfileData2, c74);
    }

    public static final C51760Mtj A03(Integer num, Integer num2, List list) {
        AbstractC167027dH.A12(list, num, num2);
        return new C51760Mtj(list, num, num2, 30);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51760Mtj(com.instagram.opal.impl.data.OpalProfileData r15, com.instagram.opal.impl.data.OpalProfileData r16, X.C74 r17, kotlin.jvm.internal.DefaultConstructorMarker r18, int r19, int r20) {
        /*
            r14 = this;
            r0 = 45
            r14.A03 = r0
            r6 = 0
            r10 = 1
            java.lang.String r2 = ""
            r9 = 0
            X.C74 r1 = X.C74.A07
            X.0sl r8 = X.C16930sl.A00
            com.instagram.opal.impl.data.OpalProfileData r0 = new com.instagram.opal.impl.data.OpalProfileData
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r2
            r11 = r9
            r12 = r9
            r13 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.<init>(r6, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51760Mtj.<init>(com.instagram.opal.impl.data.OpalProfileData, com.instagram.opal.impl.data.OpalProfileData, X.C74, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51760Mtj(InterfaceC30815Dgq interfaceC30815Dgq, Integer num, Integer num2, int i) {
        this((i & 2) != 0 ? C29232Cub.A00 : interfaceC30815Dgq, (i & 1) != 0 ? C05F.A0C : num, (i & 4) != 0 ? C05F.A0N : num2);
        this.A03 = 18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51760Mtj(C5QE c5qe, C5QE c5qe2, Integer num, int i) {
        this(23, (i & 4) != 0 ? null : num, (i & 2) != 0 ? null : c5qe2, c5qe);
        this.A03 = 23;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51760Mtj(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        this((i & 1) != 0 ? C57349Pd9.A00 : interfaceC16820sZ, (i & 2) != 0 ? C57350PdA.A00 : interfaceC16820sZ2, (i & 4) != 0 ? C57351PdB.A00 : null, 16);
        this.A03 = 16;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51760Mtj(Integer num, List list, int i) {
        this((i & 1) != 0 ? C05F.A0N : num, (i & 2) != 0 ? C05F.A01 : null, (i & 4) != 0 ? C16930sl.A00 : list, 31);
        this.A03 = 31;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51760Mtj(java.lang.Integer r3, java.util.List r4, java.util.List r5, kotlin.jvm.internal.DefaultConstructorMarker r6, int r7, int r8) {
        /*
            r2 = this;
            r0 = 32
            r2.A03 = r0
            java.lang.Integer r1 = X.C05F.A00
            X.0sl r0 = X.C16930sl.A00
            r2.<init>(r1, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51760Mtj.<init>(java.lang.Integer, java.util.List, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51760Mtj(List list, List list2, Map map, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(list, C16930sl.A00, AbstractC06930Yk.A0E());
        this.A03 = 22;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51760Mtj(Integer num, Integer num2, String str) {
        this(new BQO(str), num, num2);
        this.A03 = 48;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51760Mtj(X.QJ0 r3, java.util.List r4, java.util.List r5, kotlin.jvm.internal.DefaultConstructorMarker r6, int r7, int r8) {
        /*
            r2 = this;
            r0 = 25
            r2.A03 = r0
            r1 = 0
            X.0sl r0 = X.C16930sl.A00
            r2.<init>(r1, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51760Mtj.<init>(X.QJ0, java.util.List, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51760Mtj(InterfaceC71973XDg interfaceC71973XDg) {
        this(interfaceC71973XDg, (InterfaceC71973XDg) null, C16930sl.A00);
        this.A03 = 8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51760Mtj(C51748MtX c51748MtX, Integer num, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((C51748MtX) null, C05F.A00, C16930sl.A00);
        this.A03 = 33;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51760Mtj(java.lang.Integer r4, java.lang.Integer r5, java.lang.Integer r6, kotlin.jvm.internal.DefaultConstructorMarker r7, int r8, int r9) {
        /*
            r3 = this;
            r2 = 1
            r3.A03 = r2
            java.lang.Integer r1 = X.C05F.A01
            java.lang.Integer r0 = X.C05F.A00
            r3.<init>(r1, r0, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51760Mtj.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    public C51760Mtj(E7g e7g, List list, List list2) {
        this.A03 = 9;
        AbstractC167017dG.A1P(list, list2);
        this.A00 = list;
        this.A01 = list2;
        this.A02 = e7g;
    }

    public C51760Mtj(C50679MYx c50679MYx, C45116Jxl c45116Jxl, List list) {
        this.A03 = 21;
        C14360o3.A0B(list, 3);
        this.A00 = c45116Jxl;
        this.A01 = c50679MYx;
        this.A02 = list;
    }

    public C51760Mtj(C4IB c4ib, Integer num, List list) {
        this.A03 = 6;
        AbstractC167017dG.A1Q(c4ib, num);
        this.A00 = c4ib;
        this.A02 = list;
        this.A01 = num;
    }

    public C51760Mtj(EnumC53156NfB enumC53156NfB, Integer num, Long l) {
        this.A03 = 49;
        C14360o3.A0B(enumC53156NfB, 1);
        this.A02 = enumC53156NfB;
        this.A00 = l;
        this.A01 = num;
    }

    public C51760Mtj(InterfaceC57827Pkt interfaceC57827Pkt, InterfaceC57827Pkt interfaceC57827Pkt2, Object obj) {
        this.A03 = 44;
        C14360o3.A0B(interfaceC57827Pkt, 1);
        this.A01 = interfaceC57827Pkt;
        this.A02 = interfaceC57827Pkt2;
        this.A00 = obj;
    }

    public C51760Mtj(InterfaceC71973XDg interfaceC71973XDg, InterfaceC71973XDg interfaceC71973XDg2, List list) {
        this.A03 = 8;
        C14360o3.A0B(interfaceC71973XDg, 1);
        this.A00 = interfaceC71973XDg;
        this.A02 = interfaceC71973XDg2;
        this.A01 = list;
    }

    public C51760Mtj(C28224CcU c28224CcU, C27866CQd c27866CQd, InterfaceC65696TsI interfaceC65696TsI) {
        this.A03 = 19;
        AbstractC167027dH.A13(c28224CcU, c27866CQd, interfaceC65696TsI);
        this.A00 = c28224CcU;
        this.A01 = c27866CQd;
        this.A02 = interfaceC65696TsI;
    }

    public C51760Mtj(InterfaceC30815Dgq interfaceC30815Dgq, Integer num, Integer num2) {
        this.A03 = 18;
        AbstractC167027dH.A13(num, interfaceC30815Dgq, num2);
        this.A01 = num;
        this.A00 = interfaceC30815Dgq;
        this.A02 = num2;
    }

    public C51760Mtj(java.util.Set set, java.util.Set set2, java.util.Set set3) {
        this.A03 = 11;
        AbstractC167027dH.A13(set, set2, set3);
        this.A01 = set;
        this.A02 = set2;
        this.A00 = set3;
    }

    public C51760Mtj(QJ0 qj0, List list, List list2) {
        this.A03 = 25;
        this.A00 = qj0;
        this.A02 = list;
        this.A01 = list2;
    }

    public C51760Mtj(ImageUrl imageUrl, CharSequence charSequence, CharSequence charSequence2) {
        this.A03 = 24;
        this.A00 = imageUrl;
        this.A02 = charSequence;
        this.A01 = charSequence2;
    }

    public C51760Mtj(Integer num, List list, List list2) {
        this.A03 = 32;
        this.A02 = num;
        this.A00 = list;
        this.A01 = list2;
    }

    public C51760Mtj(List list, List list2, Map map) {
        this.A03 = 22;
        this.A00 = list;
        this.A01 = map;
        this.A02 = list2;
    }

    public C51760Mtj(List list, Integer num, Integer num2, int i) {
        this.A03 = 30;
        this.A02 = list;
        this.A01 = num;
        this.A00 = num2;
    }

    public C51760Mtj(C51748MtX c51748MtX, Integer num, List list) {
        this.A03 = 33;
        this.A02 = num;
        this.A00 = c51748MtX;
        this.A01 = list;
    }

    public C51760Mtj(C51752Mtb c51752Mtb, C211739Zk c211739Zk, List list) {
        this.A03 = 42;
        this.A02 = c211739Zk;
        this.A01 = c51752Mtb;
        this.A00 = list;
    }

    public C51760Mtj(C51761Mtk c51761Mtk, C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A03 = 34;
        this.A01 = c38321qM;
        this.A02 = c75113Zb;
        this.A00 = c51761Mtk;
    }

    public C51760Mtj(OpalProfileData opalProfileData, OpalProfileData opalProfileData2, C74 c74) {
        this.A03 = 45;
        this.A02 = opalProfileData;
        this.A01 = opalProfileData2;
        this.A00 = c74;
    }

    public C51760Mtj(C5QE c5qe, Integer num, Integer num2) {
        this.A03 = 48;
        this.A01 = c5qe;
        this.A00 = num;
        this.A02 = num2;
    }

    public C51760Mtj(BE5 be5, C148276lx c148276lx) {
        this.A03 = 10;
        C14360o3.A0B(c148276lx, 2);
        this.A02 = be5;
        this.A01 = c148276lx;
        this.A00 = null;
    }

    public C51760Mtj(UserSession userSession, Capabilities capabilities) {
        this.A03 = 26;
        AbstractC167017dG.A1P(userSession, capabilities);
        this.A02 = userSession;
        this.A00 = capabilities;
        this.A01 = AbstractC09440dt.A01(new C50246MHb(this, 13));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51760Mtj(Integer num) {
        this(C16930sl.A00, num, C05F.A01, 30);
        this.A03 = 30;
    }

    public C51760Mtj(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        this.A03 = i;
        if (27 - i != 0) {
            this.A00 = charSequence;
            this.A01 = charSequence2;
            this.A02 = charSequence3;
        } else {
            this.A02 = charSequence;
            this.A00 = charSequence2;
            this.A01 = charSequence3;
        }
    }

    public C51760Mtj(Integer num, Integer num2, Integer num3, int i) {
        this.A03 = i;
        switch (i) {
            case 1:
                AbstractC167027dH.A13(num, num2, num3);
                this.A01 = num;
                this.A00 = num2;
                break;
            case 2:
            default:
                this.A01 = num;
                this.A02 = num2;
                this.A00 = num3;
                return;
            case 3:
                AbstractC167027dH.A13(num, num2, num3);
                this.A00 = num;
                this.A01 = num2;
                break;
        }
        this.A02 = num3;
    }

    public C51760Mtj(Integer num, Integer num2, List list, int i) {
        this.A03 = i;
        if (31 - i != 0) {
            this.A00 = num;
            this.A02 = num2;
            this.A01 = list;
        } else {
            AbstractC167027dH.A13(num, num2, list);
            this.A02 = num;
            this.A01 = num2;
            this.A00 = list;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public C51760Mtj(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i) {
        this.A03 = i;
        switch (i) {
            case 16:
                AbstractC167027dH.A13(interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3);
                this.A02 = interfaceC16820sZ;
                this.A01 = interfaceC16820sZ2;
                this.A00 = interfaceC16820sZ3;
                return;
            case 35:
                this.A02 = interfaceC16820sZ;
                this.A00 = interfaceC16820sZ2;
                this.A01 = interfaceC16820sZ3;
                return;
            default:
                this.A02 = interfaceC16820sZ;
                this.A01 = interfaceC16820sZ2;
                this.A00 = interfaceC16820sZ3;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51760Mtj(C45126Jxv c45126Jxv, C45126Jxv c45126Jxv2, C45126Jxv c45126Jxv3, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(2, (Object) null, (Object) null, (Object) null);
        this.A03 = 2;
    }

    public C51760Mtj(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51760Mtj() {
        this(46, (Object) null, (Object) null, (Object) null);
        this.A03 = 46;
        this.A03 = 46;
    }

    public C51760Mtj(Long l, Map map, Map map2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A03 = 0;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        LinkedHashMap A1I2 = AbstractC166987dD.A1I();
        this.A03 = 0;
        this.A01 = A1I;
        this.A02 = A1I2;
        this.A00 = null;
    }

    public C51760Mtj(QIq qIq, List list, Map map, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A03 = 4;
        C16930sl c16930sl = C16930sl.A00;
        QIq qIq2 = new QIq(c16930sl, false);
        C16920sk A0E = AbstractC06930Yk.A0E();
        this.A03 = 4;
        AbstractC167017dG.A1Q(c16930sl, A0E);
        this.A02 = c16930sl;
        this.A01 = qIq2;
        this.A00 = A0E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C51760Mtj(List list) {
        this.A03 = 5;
        boolean z = false;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        C50627MWo c50627MWo = new C50627MWo(new C51744MtT((GridSelfViewLocation) null, (AbstractC53632Nnd) objArr, (AbstractC53632Nnd) objArr2, (AbstractC53632Nnd) objArr3, (AbstractC53632Nnd) objArr4, (AbstractC53632Nnd) objArr5, (AbstractC53632Nnd) objArr6, (AbstractC53632Nnd) objArr7, (AbstractC53632Nnd) objArr8, (Object) objArr9, 32511, true, z, z, z), C57223Pb7.A00);
        this.A03 = 5;
        C14360o3.A0B(list, 1);
        this.A02 = list;
        this.A00 = c50627MWo;
        this.A01 = C57549PgN.A01(this, 27);
    }
}
