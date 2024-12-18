package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.fbwebrtc.multiway.RtcMessageBody;
import com.facebook.fbwebrtc.multiway.RtcMessageHeader;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator;
import com.instagram.user.model.User;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Mti, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51759Mti extends C0T6 {
    public Object A00;
    public Object A01;
    public final int A02;

    public static C51759Mti A01(String str) {
        return new C51759Mti(new C51919Mx1(str));
    }

    public static NVA A02(int i) {
        return new NVA(new C51759Mti(new C51918Mx0(i)));
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof C51759Mti) && ((C51759Mti) obj).A02 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51759Mti.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0175 A[PHI: r2 r3
      0x0175: PHI (r2v2 int) = (r2v1 int), (r2v3 int) binds: [B:87:0x0172, B:82:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0175: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:87:0x0172, B:82:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51759Mti.hashCode():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String str;
        String str2;
        String str3;
        Object obj;
        String str4;
        switch (this.A02) {
            case 1:
                A1C = AbstractC166987dD.A1C();
                A1C.append("State(model=");
                A1C.append(this.A00);
                A1C.append(", source=");
                Number number = (Number) this.A01;
                if (number != null) {
                    switch (number.intValue()) {
                        case 1:
                            str = "RSYS";
                            break;
                        case 2:
                            str = "INITIAL";
                            break;
                        default:
                            str = "ENTRY";
                            break;
                    }
                    A1C.append(str);
                    return AbstractC167017dG.A0p(A1C);
                }
                str = "null";
                A1C.append(str);
                return AbstractC167017dG.A0p(A1C);
            case 3:
                A1C = AbstractC166987dD.A1C();
                A1C.append("RtcEngineModel(engineModel=");
                A1C.append(this.A00);
                str2 = ", stateModel=";
                A1C.append(str2);
                obj = this.A01;
                A1C.append(obj);
                return AbstractC167017dG.A0p(A1C);
            case 9:
                A1C = AbstractC166987dD.A1C();
                A1C.append("NoticeEligibilityServerResult(noticeEligibility=");
                A1C.append(this.A00);
                str2 = ", noticeEligibilityMap=";
                A1C.append(str2);
                obj = this.A01;
                A1C.append(obj);
                return AbstractC167017dG.A0p(A1C);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A1C = AbstractC166987dD.A1C();
                A1C.append("CommerceItem(product=");
                A1C.append(this.A01);
                str3 = ", collection=";
                A1C.append(str3);
                obj = this.A00;
                A1C.append(obj);
                return AbstractC167017dG.A0p(A1C);
            case 16:
                A1C = AbstractC166987dD.A1C();
                A1C.append("Data(fullWidthProductTileHeaderViewModel=");
                A1C.append(this.A00);
                str2 = ", productThumbnails=";
                A1C.append(str2);
                obj = this.A01;
                A1C.append(obj);
                return AbstractC167017dG.A0p(A1C);
            case 21:
                A1C = AbstractC166987dD.A1C();
                A1C.append("DownloadState(status=");
                Number number2 = (Number) this.A01;
                if (number2 != null) {
                    switch (number2.intValue()) {
                        case 1:
                            str4 = "DOWNLOADING";
                            break;
                        case 2:
                            str4 = "FAIL";
                            break;
                        default:
                            str4 = "SUCCESS";
                            break;
                    }
                } else {
                    str4 = "null";
                }
                A1C.append(str4);
                str3 = ", file=";
                A1C.append(str3);
                obj = this.A00;
                A1C.append(obj);
                return AbstractC167017dG.A0p(A1C);
            case 24:
                A1C = AbstractC166987dD.A1C();
                A1C.append("CtaPositionUiState(ctaPosition=");
                A1C.append(this.A00);
                A1C.append(", ctaWidthConfig=");
                Number number3 = (Number) this.A01;
                if (number3 != null) {
                    if (1 - number3.intValue() != 0) {
                        str = "FULL_WIDTH";
                    } else {
                        str = "MIDDLE_WIDTH";
                    }
                    A1C.append(str);
                    return AbstractC167017dG.A0p(A1C);
                }
                str = "null";
                A1C.append(str);
                return AbstractC167017dG.A0p(A1C);
            default:
                return super.toString();
        }
    }

    public static final C51759Mti A00(C26075Bg4 c26075Bg4, Integer num) {
        AbstractC167017dG.A1N(c26075Bg4, num);
        return new C51759Mti(c26075Bg4, num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51759Mti(InterfaceC16820sZ interfaceC16820sZ, int i) {
        this(MSX.A0G(i), interfaceC16820sZ);
        this.A02 = 27;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51759Mti(String str, InterfaceC16820sZ interfaceC16820sZ) {
        this(new BQO(str), interfaceC16820sZ);
        this.A02 = 27;
        C14360o3.A0B(str, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51759Mti(C26014Bf2 c26014Bf2, Integer num, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((C26014Bf2) null, C05F.A00);
        this.A02 = 5;
    }

    public C51759Mti(HB1 hb1, Integer num) {
        this.A02 = 12;
        AbstractC167017dG.A1P(num, hb1);
        this.A01 = num;
        this.A00 = hb1;
    }

    public C51759Mti(C51759Mti c51759Mti, O5W o5w) {
        this.A02 = 8;
        AbstractC167017dG.A1P(c51759Mti, o5w);
        this.A01 = c51759Mti;
        this.A00 = o5w;
    }

    public C51759Mti(C38321qM c38321qM, Integer num) {
        this.A02 = 19;
        C14360o3.A0B(c38321qM, 2);
        this.A01 = num;
        this.A00 = c38321qM;
    }

    public C51759Mti(C26075Bg4 c26075Bg4, Integer num) {
        this.A02 = 6;
        C14360o3.A0B(c26075Bg4, 1);
        this.A00 = c26075Bg4;
        this.A01 = num;
    }

    public C51759Mti(C51881MwP c51881MwP, Integer num) {
        this.A02 = 1;
        C14360o3.A0B(c51881MwP, 1);
        this.A00 = c51881MwP;
        this.A01 = num;
    }

    public C51759Mti(C38685GzQ c38685GzQ, List list) {
        this.A02 = 10;
        C14360o3.A0B(list, 2);
        this.A00 = c38685GzQ;
        this.A01 = list;
    }

    public C51759Mti(C42323Iol c42323Iol, List list) {
        this.A02 = 16;
        C14360o3.A0B(list, 2);
        this.A00 = c42323Iol;
        this.A01 = list;
    }

    public C51759Mti(EngineModel engineModel, C51881MwP c51881MwP) {
        this.A02 = 3;
        C14360o3.A0B(c51881MwP, 2);
        this.A00 = engineModel;
        this.A01 = c51881MwP;
    }

    public C51759Mti(C120985dq c120985dq, Integer num) {
        this.A02 = 22;
        this.A00 = num;
        this.A01 = c120985dq;
    }

    public C51759Mti(EnumC168447fe enumC168447fe, Integer num) {
        this.A02 = 18;
        this.A00 = num;
        this.A01 = enumC168447fe;
    }

    public C51759Mti(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A02 = 26;
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
    }

    public C51759Mti(C5QE c5qe, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = 27;
        this.A00 = c5qe;
        this.A01 = interfaceC16820sZ;
    }

    public C51759Mti(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        this.A02 = 25;
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
    }

    public C51759Mti(C6G c6g, Integer num) {
        this.A02 = 24;
        this.A00 = c6g;
        this.A01 = num;
    }

    public C51759Mti(User user, EnumC53205Ng3 enumC53205Ng3) {
        this.A02 = 20;
        this.A00 = user;
        this.A01 = enumC53205Ng3;
    }

    public C51759Mti(C26014Bf2 c26014Bf2, Integer num) {
        this.A02 = 5;
        this.A01 = c26014Bf2;
        this.A00 = num;
    }

    public C51759Mti(User user, Integer num) {
        this.A02 = 17;
        this.A01 = user;
        this.A00 = num;
    }

    public C51759Mti(Integer num, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = 0;
        this.A01 = num;
        this.A00 = interfaceC16820sZ;
    }

    public C51759Mti(C54739OFq c54739OFq, IGRTCSignalingCoordinator iGRTCSignalingCoordinator) {
        this.A02 = 2;
        this.A01 = iGRTCSignalingCoordinator;
        this.A00 = c54739OFq;
    }

    public C51759Mti(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        this.A02 = 23;
        this.A01 = userSession;
        this.A00 = interfaceC16660sJ;
    }

    public C51759Mti(File file, Integer num) {
        this.A02 = 21;
        this.A01 = num;
        this.A00 = file;
    }

    public C51759Mti(RtcMessageBody rtcMessageBody, RtcMessageHeader rtcMessageHeader) {
        this.A02 = 4;
        AbstractC167017dG.A1P(rtcMessageHeader, rtcMessageBody);
        this.A01 = rtcMessageHeader;
        this.A00 = rtcMessageBody;
    }

    public C51759Mti() {
        this.A02 = 14;
        EnumC39577Hdn enumC39577Hdn = EnumC39577Hdn.A09;
        C38687GzS c38687GzS = new C38687GzS();
        this.A02 = 14;
        this.A01 = enumC39577Hdn;
        this.A00 = c38687GzS;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51759Mti(Integer num) {
        this((File) null, num);
        this.A02 = 21;
    }

    public C51759Mti(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51759Mti(InterfaceC57865PlV interfaceC57865PlV) {
        this(7, interfaceC57865PlV, null);
        this.A02 = 7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51759Mti(Integer num, InterfaceC16820sZ interfaceC16820sZ, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(num, (InterfaceC16820sZ) null);
        this.A02 = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51759Mti(C26075Bg4 c26075Bg4) {
        this(c26075Bg4, C05F.A00);
        this.A02 = 6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51759Mti(int i) {
        this();
        this.A02 = i;
        switch (i) {
            case 11:
                this.A02 = 11;
                EnumC39567Hdd enumC39567Hdd = EnumC39567Hdd.A06;
                this.A02 = 11;
                this.A00 = null;
                this.A01 = enumC39567Hdd;
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            default:
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                this.A02 = 13;
                this(13, null, null);
                return;
        }
    }
}
