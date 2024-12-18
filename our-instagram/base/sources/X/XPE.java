package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.OpacityData;
import com.facebook.forker.Process;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes12.dex */
public final class XPE implements InterfaceC31072DlE {
    public static final XPE A00 = new Object();

    @Override // X.InterfaceC31072DlE
    public final C25547BRj AEB(Integer num) {
        int A03 = AbstractC43592JPx.A03(num, 0);
        if (A03 != 4 && A03 != 5) {
            return YAQ.A00.AEB(num);
        }
        return new C25547BRj(EnumC72394Xcg.A0Z, 1.0f, 0);
    }

    @Override // X.InterfaceC31072DlE
    public final boolean AVw(Integer num) {
        int A03 = AbstractC43592JPx.A03(num, 0);
        if (A03 != 0) {
            if (A03 == 4) {
                return true;
            }
            return XPD.A00.AVw(num);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x002e. Please report as an issue. */
    @Override // X.InterfaceC31072DlE
    public final ColorData AIU(EnumC72394Xcg enumC72394Xcg) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = -8088413;
        int i6 = -11818498;
        int i7 = -2235672;
        switch (AbstractC72046XLm.A00(enumC72394Xcg)) {
            case 0:
            case 53:
            case 105:
            case 110:
            case 113:
            case 123:
            case StringTreeSet.MAX_SYMBOL_COUNT /* 127 */:
            case 142:
            case 189:
                return AbstractC72046XLm.A02(-16116969, -920329);
            case 1:
                i = 2131366679;
                i7 = 1727132919;
                return AbstractC72046XLm.A02(i, i7);
            case 2:
                i6 = -16777216;
                return new ColorData(i6, i6);
            case 3:
            case 111:
            case 114:
            case 146:
            case 147:
            case 152:
            case 153:
            case 196:
            case 197:
                return new ColorData(-1, -1);
            case 4:
            case 31:
            case 84:
                i = 420090647;
                i7 = 436207615;
                return AbstractC72046XLm.A02(i, i7);
            case 5:
            case 71:
            case 81:
                i = -13285291;
                return AbstractC72046XLm.A02(i, i7);
            case 6:
                i2 = -13943482;
                return AbstractC72046XLm.A02(-920329, i2);
            case 7:
            case 20:
            case 33:
            case 56:
            case 93:
            case 141:
                return AbstractC72046XLm.A02(-2235672, -12759204);
            case 8:
            case 16:
            case 24:
            case 74:
            case 106:
            case 107:
            case 190:
            case 191:
                return AbstractC72046XLm.A02(-920329, -16116969);
            case 9:
            case 117:
                return AbstractC72046XLm.A02(-1, -16116969);
            case 10:
                i = -201595;
                i7 = -10670588;
                return AbstractC72046XLm.A02(i, i7);
            case 11:
                i = -72474;
                i7 = -8715760;
                return AbstractC72046XLm.A02(i, i7);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = -2364161;
                i7 = -16502889;
                return AbstractC72046XLm.A02(i, i7);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = -1643537;
                i7 = -13943482;
                return AbstractC72046XLm.A02(i, i7);
            case 14:
                i = -3868487;
                i7 = -16169953;
                return AbstractC72046XLm.A02(i, i7);
            case Process.SIGTERM /* 15 */:
                return AbstractC72046XLm.A02(-16116969, -1);
            case 17:
            case 118:
            case 136:
            case 138:
            case 145:
            case 149:
            case 193:
                return AbstractC72046XLm.A02(-16751392, -16743685);
            case 18:
            case 155:
                return AbstractC72046XLm.A02(-16751392, -11818498);
            case Process.SIGSTOP /* 19 */:
            case 76:
                i3 = -5984068;
                return AbstractC72046XLm.A02(-10654597, i3);
            case 21:
            case 95:
            case 134:
                i6 = -3353637;
                return new ColorData(i6, i6);
            case 22:
                return AbstractC72046XLm.A02(-1, -14338497);
            case 23:
                return AbstractC72046XLm.A02(-14338497, -920329);
            case 25:
            case 26:
            case 96:
            case 144:
                return AbstractC72046XLm.A02(-1, -15392473);
            case 27:
            case 156:
                return AbstractC72046XLm.A02(872415231, 857022759);
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
            case 44:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 47:
            case 48:
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            case 51:
            case 52:
            case 59:
            case 60:
            case 61:
            case 73:
            case 75:
            case 79:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case AbstractC62862SUj.MAX_FACTORIAL /* 170 */:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 186:
            case 188:
            default:
                return XPD.A00.AIU(enumC72394Xcg);
            case 30:
            case 70:
            case 80:
            case 102:
            case 112:
            case HucClient.BODY_UPLOAD_TIMEOUT_SECONDS /* 120 */:
            case 121:
            case 125:
                i6 = 16777215;
                return new ColorData(i6, i6);
            case 32:
                i4 = -12298652;
                return AbstractC72046XLm.A02(i7, i4);
            case 54:
            case 55:
            case 137:
            case 139:
                i5 = -6904140;
                return AbstractC72046XLm.A02(i5, -10654597);
            case 57:
                i6 = 503976727;
                return new ColorData(i6, i6);
            case 58:
            case 82:
            case 87:
                i = -2944720;
                i7 = -295545;
                return AbstractC72046XLm.A02(i, i7);
            case 62:
            case 68:
                i4 = -4208688;
                i7 = -13943482;
                return AbstractC72046XLm.A02(i7, i4);
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                i = 1067757756;
                i7 = 436207615;
                return AbstractC72046XLm.A02(i, i7);
            case 64:
                i = 866431164;
                i7 = 352321535;
                return AbstractC72046XLm.A02(i, i7);
            case 65:
                i = 648327356;
                i7 = 268435455;
                return AbstractC72046XLm.A02(i, i7);
            case 66:
                i = 430223548;
                i7 = 184549375;
                return AbstractC72046XLm.A02(i, i7);
            case 67:
                i = 212119740;
                i7 = 100663295;
                return AbstractC72046XLm.A02(i, i7);
            case 69:
            case 88:
                i = 1929379839;
                i7 = 1913262871;
                return AbstractC72046XLm.A02(i, i7);
            case 72:
                i = 201326592;
                i7 = 436207615;
                return AbstractC72046XLm.A02(i, i7);
            case 77:
                i4 = 435287287;
                i7 = 420090647;
                return AbstractC72046XLm.A02(i7, i4);
            case 78:
                i = 1275728663;
                i7 = 1291845631;
                return AbstractC72046XLm.A02(i, i7);
            case 83:
                i = -10021;
                i7 = 1727757703;
                return AbstractC72046XLm.A02(i, i7);
            case 85:
                return AbstractC72046XLm.A02(638194455, 872415231);
            case 86:
                i6 = 1291845631;
                return new ColorData(i6, i6);
            case 89:
                i6 = -1308622848;
                return new ColorData(i6, i6);
            case 90:
                i6 = -1728053248;
                return new ColorData(i6, i6);
            case 91:
                i6 = 671748887;
                return new ColorData(i6, i6);
            case 92:
            case 94:
            case 132:
            case 133:
                i3 = -6904140;
                return AbstractC72046XLm.A02(-10654597, i3);
            case 97:
                i = -15434967;
                i7 = -12796894;
                return AbstractC72046XLm.A02(i, i7);
            case 98:
                return new ColorData(-16751392, -16751392);
            case 99:
            case 100:
            case 103:
            case 124:
            case 128:
                return new ColorData(-920329, -920329);
            case 101:
            case 104:
            case 122:
            case 195:
                return new ColorData(-16116969, -16116969);
            case 108:
                i = 1275728663;
                i7 = 1290925303;
                return AbstractC72046XLm.A02(i, i7);
            case 109:
                return AbstractC72046XLm.A02(-1510869769, -16116969);
            case 115:
                return AbstractC72046XLm.A02(-1, 856298263);
            case 116:
                return new ColorData(872415231, 872415231);
            case 119:
                i2 = -14931149;
                return AbstractC72046XLm.A02(-920329, i2);
            case 126:
            case 129:
            case 131:
                i = -3353637;
                i7 = -12298652;
                return AbstractC72046XLm.A02(i, i7);
            case 130:
                i = 2144130011;
                i7 = 2135184996;
                return AbstractC72046XLm.A02(i, i7);
            case 135:
                i6 = 1912602624;
                return new ColorData(i6, i6);
            case 140:
            case 143:
            case 151:
                return AbstractC72046XLm.A02(i5, -10654597);
            case 148:
            case 150:
                return new ColorData(-5253121, -5253121);
            case 154:
                i6 = -1643537;
                return new ColorData(i6, i6);
            case 185:
            case 194:
                return new ColorData(-14338497, -14338497);
            case 187:
                return new ColorData(i6, i6);
            case 192:
                return AbstractC72046XLm.A02(-8088413, -9140587);
            case 198:
                i6 = 1728053247;
                return new ColorData(i6, i6);
            case 199:
                i = -6922749;
                i7 = -2713596;
                return AbstractC72046XLm.A02(i, i7);
        }
    }

    @Override // X.InterfaceC31072DlE
    public final int AKz(Integer num) {
        return AbstractC72046XLm.A03(num).AKz(num);
    }

    @Override // X.InterfaceC31072DlE
    public final OpacityData E2H(EnumC27390C6t enumC27390C6t) {
        int A002 = AbstractC72046XLm.A00(enumC27390C6t);
        float f = 0.12f;
        if (A002 != 1) {
            if (A002 != 2) {
                if (A002 != 3) {
                    if (A002 != 4) {
                        if (A002 != 5) {
                            return YAQ.A00.E2H(enumC27390C6t);
                        }
                        f = 0.0f;
                    }
                }
            }
            return new OpacityData(0.03f, 0.03f);
        }
        return new OpacityData(f, f);
    }

    @Override // X.InterfaceC31072DlE
    public final float Em4(Integer num) {
        return AbstractC72046XLm.A03(num).Em4(num);
    }

    @Override // X.InterfaceC31072DlE
    public final float Ema(Integer num) {
        return AbstractC72046XLm.A03(num).Ema(num);
    }

    @Override // X.InterfaceC31072DlE
    public final CSN F8x(Integer num) {
        return AbstractC72046XLm.A03(num).F8x(num);
    }
}
