package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.mqtt.service.MqttSubscribeListener;
import com.instagram.api.schemas.ProductTileTextStyleType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Mtg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51757Mtg extends C0T6 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public static boolean A00(C51757Mtg c51757Mtg, C51757Mtg c51757Mtg2) {
        return C14360o3.A0K(c51757Mtg.A02, c51757Mtg2.A02);
    }

    public static boolean A01(C51757Mtg c51757Mtg, C51757Mtg c51757Mtg2) {
        return C14360o3.A0K(c51757Mtg.A01, c51757Mtg2.A01);
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof C51757Mtg) && ((C51757Mtg) obj).A03 == i) {
            return true;
        }
        return false;
    }

    public final C51757Mtg A03(E6N e6n) {
        String str = e6n.A03;
        String str2 = this.A02;
        if (C14360o3.A0K(str, str2)) {
            ArrayList A0T = AbstractC001800i.A0T(e6n, (Collection) this.A00);
            if (str2 == null) {
                str2 = str;
            }
            ImageUrl imageUrl = (ImageUrl) this.A01;
            if (imageUrl == null) {
                imageUrl = e6n.A00;
            }
            return new C51757Mtg(imageUrl, str2, A0T);
        }
        throw AbstractC166987dD.A14("Attempting to store an account which display name does not match this aggregate display name");
    }

    public final InterfaceC38371qR A04() {
        C33295Enq c33295Enq;
        AbstractC33573Esl abstractC33573Esl = (AbstractC33573Esl) this.A01;
        if (!(abstractC33573Esl instanceof C33295Enq) || (c33295Enq = (C33295Enq) abstractC33573Esl) == null) {
            return null;
        }
        return c33295Enq.A01;
    }

    public final String A05() {
        Object obj;
        Iterator A1J = AbstractC25226BEj.A1J(this.A00);
        while (true) {
            if (A1J.hasNext()) {
                obj = A1J.next();
                if (((E6N) obj).A04 != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        E6N e6n = (E6N) obj;
        if (e6n == null) {
            return null;
        }
        return e6n.A04;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51757Mtg.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d5, code lost:
    
        if (r1 == null) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51757Mtg.hashCode():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String str;
        String str2;
        switch (this.A03) {
            case 0:
                A1C = AbstractC166987dD.A1C();
                A1C.append("Subscription topic:");
                A1C.append(this.A02);
                A1C.append(" qos:");
                A1C.append(this.A01);
                return A1C.toString();
            case 11:
                A1C = AbstractC166987dD.A1C();
                A1C.append("SoundEffectTrack(name=");
                A1C.append(this.A02);
                A1C.append(", icon=");
                A1C.append(this.A01);
                str = ", audio=";
                A1C.append(str);
                A1C.append(this.A00);
                A1C.append(')');
                return A1C.toString();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A1C = AbstractC166987dD.A1C();
                A1C.append("UiState(challengeDuration=");
                A1C.append(this.A00);
                A1C.append(", challengePrizeType=");
                A1C.append(this.A01);
                A1C.append(", challengeCustomPrize=");
                A1C.append(this.A02);
                A1C.append(')');
                return A1C.toString();
            case 20:
                A1C = AbstractC166987dD.A1C();
                A1C.append("FilteringHeader(sectionHeader=");
                A1C.append(this.A02);
                A1C.append(", selectorType=");
                Number number = (Number) this.A01;
                if (number != null) {
                    switch (number.intValue()) {
                        case 1:
                            str2 = "CHECK";
                            break;
                        case 2:
                            str2 = "TOGGLE";
                            break;
                        default:
                            str2 = "RADIO";
                            break;
                    }
                } else {
                    str2 = "null";
                }
                A1C.append(str2);
                str = ", includedFilters=";
                A1C.append(str);
                A1C.append(this.A00);
                A1C.append(')');
                return A1C.toString();
            default:
                return super.toString();
        }
    }

    public C51757Mtg(InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = 8;
        this.A03 = 8;
        C14360o3.A0B(interfaceC16820sZ, 2);
        this.A02 = "Action";
        this.A01 = interfaceC16820sZ;
        this.A00 = null;
    }

    public C51757Mtg(C211729Zg c211729Zg, ImageUrl imageUrl, String str) {
        this.A03 = 11;
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = imageUrl;
        this.A00 = c211729Zg;
    }

    public C51757Mtg(MqttSubscribeListener mqttSubscribeListener, C4QA c4qa, String str) {
        this.A03 = 0;
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = c4qa;
        this.A00 = mqttSubscribeListener;
    }

    public C51757Mtg(EnumC33421Eps enumC33421Eps, EnumC33423Epu enumC33423Epu, String str) {
        this.A03 = 13;
        this.A00 = enumC33421Eps;
        this.A01 = enumC33423Epu;
        this.A02 = str;
    }

    public C51757Mtg(C37995Gng c37995Gng, C38321qM c38321qM, String str) {
        this.A03 = 16;
        this.A01 = c38321qM;
        this.A02 = str;
        this.A00 = c37995Gng;
    }

    public C51757Mtg(AbstractC46407KgT abstractC46407KgT, Integer num, String str) {
        this.A03 = 10;
        this.A01 = num;
        this.A02 = str;
        this.A00 = abstractC46407KgT;
    }

    public C51757Mtg(AbstractC53444NkX abstractC53444NkX, Integer num, String str) {
        this.A03 = 9;
        this.A01 = abstractC53444NkX;
        this.A02 = str;
        this.A00 = num;
    }

    public C51757Mtg(AbstractC72483Xel abstractC72483Xel, InterfaceC57866PlW interfaceC57866PlW, String str) {
        this.A03 = 24;
        this.A02 = str;
        this.A01 = interfaceC57866PlW;
        this.A00 = abstractC72483Xel;
    }

    public C51757Mtg(C1338462s c1338462s, String str, HashMap hashMap) {
        this.A03 = 28;
        this.A02 = str;
        this.A00 = hashMap;
        this.A01 = c1338462s;
    }

    public C51757Mtg(ImageUrl imageUrl, String str, List list) {
        this.A03 = 21;
        this.A02 = str;
        this.A01 = imageUrl;
        this.A00 = list;
    }

    public C51757Mtg(String str, List list, Map map) {
        this.A03 = 23;
        this.A01 = list;
        this.A02 = str;
        this.A00 = map;
    }

    public C51757Mtg(EnumC33423Epu enumC33423Epu, String str, List list) {
        this.A03 = 14;
        this.A01 = enumC33423Epu;
        this.A00 = list;
        this.A02 = str;
    }

    public C51757Mtg(C51758Mth c51758Mth, ProductTileTextStyleType productTileTextStyleType, String str) {
        this.A03 = 26;
        AbstractC167027dH.A13(str, productTileTextStyleType, c51758Mth);
        this.A02 = str;
        this.A00 = productTileTextStyleType;
        this.A01 = c51758Mth;
    }

    public C51757Mtg(List list, List list2, String str) {
        this.A03 = 18;
        AbstractC167027dH.A13(list, list2, str);
        this.A01 = list;
        this.A00 = list2;
        this.A02 = str;
    }

    public C51757Mtg(AbstractC46457KhH abstractC46457KhH, String str, List list) {
        this.A03 = 15;
        C14360o3.A0B(abstractC46457KhH, 3);
        this.A01 = list;
        this.A02 = str;
        this.A00 = abstractC46457KhH;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51757Mtg(AbstractC53444NkX abstractC53444NkX, Integer num) {
        this(abstractC53444NkX, num, (String) null);
        this.A03 = 9;
    }

    public C51757Mtg(Integer num, String str, List list, int i) {
        this.A03 = i;
        AbstractC167027dH.A13(str, num, list);
        this.A02 = str;
        if (19 - i != 0) {
            this.A01 = num;
            this.A00 = list;
        } else {
            this.A00 = num;
            this.A01 = list;
        }
    }

    public C51757Mtg(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51757Mtg(String str, Long l) {
        this(l, (Object) null, str, 6);
        this.A03 = 6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51757Mtg() {
        this((Object) null, (Object) null, "", 2);
        this.A03 = 2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.HAv, java.lang.Object, X.1um] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51757Mtg(int r5) {
        /*
            r4 = this;
            r4.A03 = r5
            switch(r5) {
                case 22: goto L4d;
                case 23: goto L3d;
                case 24: goto L5;
                case 25: goto Le;
                case 26: goto L5;
                case 27: goto L21;
                case 28: goto L12;
                default: goto L5;
            }
        L5:
            r1 = 0
            r0 = 29
        L8:
            r4.A03 = r0
            r4.<init>(r1, r1, r1, r0)
            return
        Le:
            r1 = 0
            r0 = 25
            goto L8
        L12:
            r2 = 0
            r0 = 28
            r4.A03 = r0
            java.lang.String r1 = ""
            java.util.HashMap r0 = X.AbstractC166987dD.A1G()
            r4.<init>(r2, r1, r0)
            return
        L21:
            r0 = 0
            r3 = 27
            r4.A03 = r3
            X.HdU r2 = X.EnumC39558HdU.A04
            X.HAv r1 = new X.HAv
            r1.<init>()
            r1.A00 = r0
            java.lang.String r0 = ""
            r4.A03 = r3
            r4.<init>()
            r4.A01 = r2
            r4.A00 = r1
            r4.A02 = r0
            return
        L3d:
            r0 = 23
            r4.A03 = r0
            X.0sl r2 = X.C16930sl.A00
            java.lang.String r1 = ""
            X.0sk r0 = X.AbstractC06930Yk.A0E()
            r4.<init>(r1, r2, r0)
            return
        L4d:
            r2 = 0
            r1 = 22
            r4.A03 = r1
            java.lang.Integer r0 = X.AbstractC25227BEk.A0p()
            r4.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51757Mtg.<init>(int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51757Mtg(String str, List list, Map map, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this("", C16930sl.A00, AbstractC06930Yk.A0E());
        this.A03 = 23;
    }

    public C51757Mtg(InterfaceC16660sJ interfaceC16660sJ, List list) {
        this.A03 = 1;
        String A0o = AbstractC166997dE.A0o();
        this.A03 = 1;
        C14360o3.A0B(A0o, 3);
        this.A00 = list;
        this.A01 = interfaceC16660sJ;
        this.A02 = A0o;
    }

    public C51757Mtg(Integer num, List list, int i) {
        this.A03 = 5;
        num = (i & 1) != 0 ? C05F.A00 : num;
        list = (i & 2) != 0 ? C16930sl.A00 : list;
        this.A03 = 5;
        AbstractC167017dG.A1P(num, list);
        this.A01 = num;
        this.A00 = list;
        this.A02 = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51757Mtg(E6N e6n) {
        this(e6n.A00, e6n.A03, AbstractC166987dD.A1J(e6n));
        this.A03 = 21;
    }
}
