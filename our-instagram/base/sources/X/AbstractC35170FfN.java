package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.FfN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35170FfN {
    public static void A00(InterfaceC02530Ab interfaceC02530Ab, C0Zx c0Zx, String str) {
        c0Zx.A06(AbstractC31190DnZ.A01(21, 10, 31), str);
        c0Zx.A01(interfaceC02530Ab, "event_step");
        c0Zx.A01(EnumC31716DwL.CHALLENGE, "event_source");
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, C0Zx c0Zx2, String str, String str2) {
        c0Zx.A06("render_type", str);
        c0Zx.A06(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        interfaceC02590Ai.AAQ(c0Zx2, "core");
        interfaceC02590Ai.AAQ(c0Zx, PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE);
    }

    public static void A02(XPI xpi, AbstractC12990ll abstractC12990ll, Integer num, String str, String str2) {
        C18920wW c18920wW;
        String str3;
        String A02;
        G06 A00 = FTX.A00(abstractC12990ll);
        if (A00.A01 != null && (c18920wW = A00.A00) != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "challenge_start_flow");
            if (A0f.isSampled()) {
                C0Zx c0Zx = new C0Zx();
                A00(xpi, c0Zx, A00.A01);
                long j = 0;
                try {
                    if ((abstractC12990ll instanceof UserSession) && (A02 = AbstractC03270Dk.A02(abstractC12990ll)) != null) {
                        j = Long.parseLong(A02);
                    }
                } catch (NumberFormatException unused) {
                }
                c0Zx.A05("target_user_id", Long.valueOf(j));
                C0Zx c0Zx2 = new C0Zx();
                c0Zx2.A06("challenge_type", str);
                switch (num.intValue()) {
                    case 1:
                        str3 = "native";
                        break;
                    case 2:
                        str3 = "react_native";
                        break;
                    default:
                        str3 = "bloks";
                        break;
                }
                A01(A0f, c0Zx2, c0Zx, str3, str2);
                A0f.Cht();
            }
        }
    }

    public static void A03(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Integer num;
        C18920wW c18920wW;
        InterfaceC02590Ai A0f;
        String A02;
        C18920wW c18920wW2;
        String A022;
        C18920wW c18920wW3;
        String A023;
        String str8;
        for (EnumC72378XcE enumC72378XcE : EnumC72378XcE.values()) {
            if (C14360o3.A0K(enumC72378XcE.A01, str4)) {
                XPI xpi = enumC72378XcE.A00;
                if (xpi != null) {
                    Integer[] A00 = C05F.A00(10);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str8 = "ig_challenge_dismiss";
                                    break;
                                case 2:
                                    str8 = "ig_challenge_primary_button";
                                    break;
                                case 3:
                                    str8 = "ig_challenge_secondary_button";
                                    break;
                                case 4:
                                    str8 = "ig_challenge_url";
                                    break;
                                case 5:
                                    str8 = "ig_challenge_resend";
                                    break;
                                case 6:
                                    str8 = "ig_challenge_navigation";
                                    break;
                                case 7:
                                    str8 = "ig_challenge_button";
                                    break;
                                case 8:
                                    str8 = "ig_challenge_end_flow";
                                    break;
                                case 9:
                                    str8 = NetInfoModule.CONNECTION_TYPE_NONE;
                                    break;
                                default:
                                    str8 = "ig_challenge_start_flow";
                                    break;
                            }
                            if (!str8.equals(str)) {
                                i++;
                            }
                        } else {
                            num = C05F.A1I;
                        }
                    }
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        if (intValue != 8) {
                            if (intValue != 6) {
                                if (intValue == 7) {
                                    G06 A002 = FTX.A00(abstractC12990ll);
                                    if (A002.A01 != null && (c18920wW3 = A002.A00) != null) {
                                        A0f = AbstractC166987dD.A0f(c18920wW3, "challenge_button");
                                        if (A0f.isSampled()) {
                                            C0Zx c0Zx = new C0Zx();
                                            A00(xpi, c0Zx, A002.A01);
                                            long j = 0;
                                            try {
                                                if ((abstractC12990ll instanceof UserSession) && (A023 = AbstractC03270Dk.A02(abstractC12990ll)) != null) {
                                                    j = Long.parseLong(A023);
                                                }
                                            } catch (NumberFormatException unused) {
                                            }
                                            c0Zx.A05("target_user_id", Long.valueOf(j));
                                            C0Zx c0Zx2 = new C0Zx();
                                            c0Zx2.A06("challenge_type", str2);
                                            A01(A0f, c0Zx2, c0Zx, "bloks", str3);
                                            AbstractC31171DnF.A1C(A0f, str5);
                                            A0f.AAP("reason", str6);
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                G06 A003 = FTX.A00(abstractC12990ll);
                                if (A003.A01 != null && (c18920wW2 = A003.A00) != null) {
                                    A0f = AbstractC166987dD.A0f(c18920wW2, "challenge_navigation");
                                    if (A0f.isSampled()) {
                                        C0Zx c0Zx3 = new C0Zx();
                                        A00(xpi, c0Zx3, A003.A01);
                                        long j2 = 0;
                                        try {
                                            if ((abstractC12990ll instanceof UserSession) && (A022 = AbstractC03270Dk.A02(abstractC12990ll)) != null) {
                                                j2 = Long.parseLong(A022);
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                        c0Zx3.A05("target_user_id", Long.valueOf(j2));
                                        C0Zx c0Zx4 = new C0Zx();
                                        c0Zx4.A06("challenge_type", str2);
                                        A01(A0f, c0Zx4, c0Zx3, "bloks", str3);
                                        AbstractC31171DnF.A1C(A0f, str5);
                                        A0f.AAP("reason", str6);
                                        A0f.AAP("additional_user_input", str7);
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            G06 A004 = FTX.A00(abstractC12990ll);
                            if (A004.A01 != null && (c18920wW = A004.A00) != null) {
                                A0f = AbstractC166987dD.A0f(c18920wW, "challenge_end_flow");
                                if (A0f.isSampled()) {
                                    C0Zx c0Zx5 = new C0Zx();
                                    A00(xpi, c0Zx5, A004.A01);
                                    long j3 = 0;
                                    try {
                                        if ((abstractC12990ll instanceof UserSession) && (A02 = AbstractC03270Dk.A02(abstractC12990ll)) != null) {
                                            j3 = Long.parseLong(A02);
                                        }
                                    } catch (NumberFormatException unused3) {
                                    }
                                    c0Zx5.A05("target_user_id", Long.valueOf(j3));
                                    C0Zx c0Zx6 = new C0Zx();
                                    c0Zx6.A06("challenge_type", str2);
                                    A01(A0f, c0Zx6, c0Zx5, "bloks", str3);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        A0f.Cht();
                        return;
                    }
                    A02(xpi, abstractC12990ll, C05F.A0N, str2, str3);
                    return;
                }
                return;
            }
        }
    }
}
