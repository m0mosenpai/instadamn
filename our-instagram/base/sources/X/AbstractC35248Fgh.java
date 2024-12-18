package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;

/* renamed from: X.Fgh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35248Fgh {
    public static String A04(InterfaceC02590Ai interfaceC02590Ai, EnumC92794Ds enumC92794Ds, DirectShareTarget directShareTarget) {
        C83693oE A02;
        interfaceC02590Ai.A8R(A02(enumC92794Ds), TraceFieldType.TransportType);
        InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
        interfaceC83713oG.getClass();
        InterfaceC83733oI A05 = AbstractC140946Yw.A05(interfaceC83713oG);
        if (A05 == null || (A02 = AbstractC1345466e.A02(A05)) == null) {
            return null;
        }
        return A02.A00;
    }

    public static final String A05(String str) {
        return AbstractC25226BEj.A1I(AbstractC167007dF.A0m(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0), 0);
    }

    public static final EnumC33484ErJ A02(EnumC92794Ds enumC92794Ds) {
        if (enumC92794Ds != null) {
            int ordinal = enumC92794Ds.ordinal();
            if (ordinal != 2) {
                if (ordinal != 1) {
                    if (ordinal == 0) {
                        return EnumC33484ErJ.IG_DJANGO;
                    }
                    return null;
                }
                return EnumC33484ErJ.IG_MESSENGER_INFRA;
            }
            return EnumC33484ErJ.IG_ADVANCED_CRYPTO_TRANSPORT;
        }
        return null;
    }

    public static final List A06(DirectShareTargetLoggingInfo directShareTargetLoggingInfo) {
        EnumC33482ErH enumC33482ErH;
        if (directShareTargetLoggingInfo != null) {
            if (AbstractC31177DnL.A1b(directShareTargetLoggingInfo.A00)) {
                enumC33482ErH = EnumC33482ErH.SERVER_ENTITIES_NAMED_DSQ1;
            } else {
                enumC33482ErH = EnumC33482ErH.LOCAL_BLENDED;
            }
            return AbstractC166987dD.A1J(enumC33482ErH);
        }
        return C16930sl.A00;
    }

    public static final EnumC33501Era A00(int i) {
        switch (i) {
            case 1:
                return EnumC33501Era.PAPER_AIRPLANE_SEND;
            case 2:
                return EnumC33501Era.KEYBOARD_SEND;
            case 3:
                return EnumC33501Era.META_AI_RING;
            case 4:
                return EnumC33501Era.CLEAR_SEARCH;
            case 5:
                return EnumC33501Era.SEARCH;
            case 6:
                return EnumC33501Era.THUMB_UP;
            case 7:
                return EnumC33501Era.THUMB_DOWN;
            default:
                return EnumC33501Era.SEE_MORE_WITH_SNIPPET;
        }
    }

    public static final EnumC33521Eru A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return EnumC33521Eru.A03;
            case 1:
            case 2:
                return EnumC33521Eru.A0G;
            case 3:
                return EnumC33521Eru.A07;
            case 4:
                return EnumC33521Eru.A0O;
            case 5:
                return EnumC33521Eru.A0Q;
            case 6:
                return EnumC33521Eru.A06;
            case 7:
                return EnumC33521Eru.A0P;
            case 8:
                return EnumC33521Eru.A0I;
            case 9:
                return EnumC33521Eru.A0L;
            case 10:
                return EnumC33521Eru.A09;
            case 11:
                return EnumC33521Eru.A0K;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return EnumC33521Eru.A08;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return EnumC33521Eru.A0N;
            case 14:
                return EnumC33521Eru.A0B;
            case Process.SIGTERM /* 15 */:
                return EnumC33521Eru.A0M;
            case 16:
                return EnumC33521Eru.A0A;
            case 17:
            case 18:
            default:
                return EnumC33521Eru.A0H;
            case Process.SIGSTOP /* 19 */:
                return EnumC33521Eru.A02;
            case 20:
                return EnumC33521Eru.A0J;
            case 21:
                return EnumC33521Eru.A04;
        }
    }

    public static final EnumC33520Ert A03(int i, boolean z) {
        switch (i) {
            case 6:
                if (z) {
                    return EnumC33520Ert.A0J;
                }
                return EnumC33520Ert.A0B;
            case 7:
                return EnumC33520Ert.A09;
            case 11:
            case Process.SIGTERM /* 15 */:
                if (z) {
                    return EnumC33520Ert.A0L;
                }
                return EnumC33520Ert.A0D;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 16:
                if (z) {
                    return EnumC33520Ert.A0I;
                }
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 17:
                if (z) {
                    return EnumC33520Ert.A0M;
                }
                break;
            case 18:
                return EnumC33520Ert.A0A;
            case 21:
            case 22:
                if (z) {
                    return EnumC33520Ert.A0F;
                }
                break;
            case 23:
            case 24:
                if (z) {
                    return EnumC33520Ert.A0H;
                }
                break;
            case 25:
                return EnumC33520Ert.A0G;
            case 28:
                return EnumC33520Ert.A0N;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return EnumC33520Ert.A07;
            case 30:
                return EnumC33520Ert.A04;
            case 35:
                return EnumC33520Ert.A02;
            case 36:
                return EnumC33520Ert.A03;
            case 37:
                return EnumC33520Ert.A05;
            case 40:
                return EnumC33520Ert.A0C;
            case Seq.NULL_REFNUM /* 41 */:
                return EnumC33520Ert.A0K;
            case 43:
                return EnumC33520Ert.A06;
            case 44:
                return EnumC33520Ert.A08;
        }
        return EnumC33520Ert.A0E;
    }
}
