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
public final class YAQ implements InterfaceC31072DlE {
    public static final YAQ A00 = new Object();

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC31072DlE
    public final C25547BRj AEB(Integer num) {
        EnumC72394Xcg enumC72394Xcg;
        EnumC72394Xcg enumC72394Xcg2;
        switch (AbstractC43592JPx.A03(num, 0)) {
            case 0:
            case 1:
            case 3:
                enumC72394Xcg = EnumC72394Xcg.A20;
                return new C25547BRj(enumC72394Xcg, 0.0f, 0);
            case 2:
                enumC72394Xcg2 = EnumC72394Xcg.A24;
                return new C25547BRj(enumC72394Xcg2, 1.0f, 0);
            case 4:
                enumC72394Xcg2 = EnumC72394Xcg.A0Z;
                return new C25547BRj(enumC72394Xcg2, 1.0f, 0);
            case 5:
                enumC72394Xcg = EnumC72394Xcg.A1y;
                return new C25547BRj(enumC72394Xcg, 0.0f, 0);
            case 6:
                enumC72394Xcg2 = EnumC72394Xcg.A1H;
                return new C25547BRj(enumC72394Xcg2, 1.0f, 0);
            default:
                throw new RuntimeException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x002f. Please report as an issue. */
    @Override // X.InterfaceC31072DlE
    public final ColorData AIU(EnumC72394Xcg enumC72394Xcg) {
        int i;
        int i2 = -12166551;
        int i3 = -2169879;
        int i4 = -14931149;
        switch (AbstractC72046XLm.A00(enumC72394Xcg)) {
            case 0:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC72046XLm.A02(-14931149, -3419431);
            case 1:
                i = 2132552499;
                i4 = 1724633817;
                return AbstractC72046XLm.A02(i, i4);
            case 2:
                i4 = -16777216;
                return new ColorData(i4, i4);
            case 3:
            case 24:
            case 62:
            case 99:
            case 100:
            case 103:
            case 111:
            case 114:
            case 124:
            case 128:
            case 196:
            case 197:
                return new ColorData(-1, -1);
            case 4:
            case 31:
            case 77:
            case 84:
                i = 421276467;
                i4 = 436207615;
                return AbstractC72046XLm.A02(i, i4);
            case 5:
            case 71:
            case 81:
                return AbstractC72046XLm.A02(-13350828, -2169879);
            case 6:
                return AbstractC72046XLm.A02(-920329, -14141117);
            case 7:
            case 33:
            case 59:
                return AbstractC72046XLm.A02(-2169879, -13350828);
            case 8:
                return AbstractC72046XLm.A02(-920329, -14931149);
            case 9:
            case 16:
            case 74:
            case 106:
            case 107:
            case 117:
            case 190:
            case 191:
                return AbstractC72046XLm.A02(-1, -14931149);
            case 10:
                i = -3155;
                i4 = 2142198272;
                return AbstractC72046XLm.A02(i, i4);
            case 11:
                i = -20041;
                i4 = 2141850142;
                return AbstractC72046XLm.A02(i, i4);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = -5253121;
                i4 = 2130725817;
                return AbstractC72046XLm.A02(i, i4);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = -1643537;
                i4 = -13943482;
                return AbstractC72046XLm.A02(i, i4);
            case 14:
                i = -4590166;
                i4 = 2130738462;
                return AbstractC72046XLm.A02(i, i4);
            case Process.SIGTERM /* 15 */:
            case 53:
            case 105:
            case 110:
            case 113:
            case 123:
            case StringTreeSet.MAX_SYMBOL_COUNT /* 127 */:
            case 188:
                return AbstractC72046XLm.A02(-14931149, -1);
            case 17:
            case 18:
            case 118:
            case 145:
            case 146:
            case 193:
                return AbstractC72046XLm.A02(-16751392, -12215809);
            case Process.SIGSTOP /* 19 */:
                return AbstractC72046XLm.A02(-10258294, -5786689);
            case 20:
            case 54:
                return AbstractC72046XLm.A02(-3419431, -10258294);
            case 21:
            case 149:
                return new ColorData(-3419431, -3419431);
            case 22:
                return AbstractC72046XLm.A02(-1, -14141117);
            case 23:
                return AbstractC72046XLm.A02(-14931149, -12166551);
            case 25:
            case 26:
            case 27:
            case 96:
            case 144:
            case 156:
                return AbstractC72046XLm.A02(-1, -13350828);
            case 28:
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
            case 70:
            case 75:
            case 80:
            case 102:
            case HucClient.BODY_UPLOAD_TIMEOUT_SECONDS /* 120 */:
            case 121:
            case 125:
                return new ColorData(16777215, 16777215);
            case 30:
                i = 859064404;
                i4 = 1276914483;
                return AbstractC72046XLm.A02(i, i4);
            case 32:
            case 56:
            case 93:
            case 141:
                return AbstractC72046XLm.A02(-2169879, -12166551);
            case 55:
                i = 1058810675;
                i4 = 654311423;
                return AbstractC72046XLm.A02(i, i4);
            case 57:
                i = 859064404;
                i4 = -1726207181;
                return AbstractC72046XLm.A02(i, i4);
            case 58:
            case 82:
            case 87:
                i3 = -1024151;
                i4 = -2345156;
                return AbstractC72046XLm.A02(i4, i3);
            case 60:
                return AbstractC72046XLm.A02(-15173646, -1);
            case 61:
            case 132:
            case 133:
                return AbstractC72046XLm.A02(-12166551, -2169879);
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                i = 1073741823;
                i4 = 436207615;
                return AbstractC72046XLm.A02(i, i4);
            case 64:
                return AbstractC72046XLm.A02(872415231, 352321535);
            case 65:
                i = 654311423;
                i4 = 268435455;
                return AbstractC72046XLm.A02(i, i4);
            case 66:
                i3 = 184549375;
                i4 = 436207615;
                return AbstractC72046XLm.A02(i4, i3);
            case 67:
                i = 218103807;
                i4 = 100663295;
                return AbstractC72046XLm.A02(i, i4);
            case 68:
                return AbstractC72046XLm.A02(-14931149, -920329);
            case 69:
            case 88:
                i3 = 1914448691;
                i4 = 1929379839;
                return AbstractC72046XLm.A02(i4, i3);
            case 72:
                i = 201326592;
                i4 = 436207615;
                return AbstractC72046XLm.A02(i, i4);
            case 73:
                i4 = 419430400;
                return new ColorData(i4, i4);
            case 76:
                return AbstractC72046XLm.A02(-10258294, -3419431);
            case 78:
            case 108:
                i = 1276914483;
                i4 = 1291845631;
                return AbstractC72046XLm.A02(i, i4);
            case 79:
                i4 = -16089857;
                return new ColorData(i4, i4);
            case 83:
                i = -339766;
                i4 = 1727029097;
                return AbstractC72046XLm.A02(i, i4);
            case 85:
                return AbstractC72046XLm.A02(639380275, 872415231);
            case 86:
                i4 = 1291845631;
                return new ColorData(i4, i4);
            case 89:
            case 90:
                i4 = -1728053248;
                return new ColorData(i4, i4);
            case 91:
                i = 204752980;
                i4 = -1726207181;
                return AbstractC72046XLm.A02(i, i4);
            case 92:
            case 192:
                return AbstractC72046XLm.A02(-8022620, -5786689);
            case 94:
                i = 2132552499;
                i4 = 1291845631;
                return AbstractC72046XLm.A02(i, i4);
            case 95:
                i4 = 1929379839;
                return new ColorData(i4, i4);
            case 97:
                i = -16744871;
                i4 = -11160461;
                return AbstractC72046XLm.A02(i, i4);
            case 98:
                return new ColorData(-16751392, -16751392);
            case 101:
            case 104:
            case 122:
            case 195:
                return new ColorData(i4, i4);
            case 109:
                i = -1509949441;
                return AbstractC72046XLm.A02(i, i4);
            case 112:
                i = 204752980;
                i4 = 421276467;
                return AbstractC72046XLm.A02(i, i4);
            case 115:
                i2 = 857484083;
                return AbstractC72046XLm.A02(-1, i2);
            case 116:
                return new ColorData(872415231, 872415231);
            case 119:
                i = 167772160;
                i4 = 822083583;
                return AbstractC72046XLm.A02(i, i4);
            case 126:
                return AbstractC72046XLm.A02(-3419431, -5786689);
            case 129:
            case 131:
            case 140:
            case 151:
                return AbstractC72046XLm.A02(-3419431, -12166551);
            case 130:
                i = 2144064217;
                i4 = 2141696959;
                return AbstractC72046XLm.A02(i, i4);
            case 134:
                i4 = -1291845633;
                return new ColorData(i4, i4);
            case 135:
                i4 = 1913262871;
                return new ColorData(i4, i4);
            case 136:
            case 138:
                return AbstractC72046XLm.A02(-16751392, -12081670);
            case 137:
            case 139:
                return AbstractC72046XLm.A02(-5786689, -8022620);
            case 142:
                return AbstractC72046XLm.A02(-13350828, -3419431);
            case 143:
                i = 1714702420;
                i4 = 1724633817;
                return AbstractC72046XLm.A02(i, i4);
            case 147:
            case 148:
                i = -6700558;
                i4 = -12883816;
                return AbstractC72046XLm.A02(i, i4);
            case 150:
                i = -1380880;
                i4 = -9404535;
                return AbstractC72046XLm.A02(i, i4);
            case 152:
                return AbstractC72046XLm.A02(-920329, -10258294);
            case 153:
                i = -394244;
                i4 = -12100758;
                return AbstractC72046XLm.A02(i, i4);
            case 154:
                i = -1380880;
                i4 = -12890276;
                return AbstractC72046XLm.A02(i, i4);
            case 155:
                i = -16752224;
                i4 = -8209946;
                return AbstractC72046XLm.A02(i, i4);
            case 157:
                i = -1247745;
                i4 = -16775100;
                return AbstractC72046XLm.A02(i, i4);
            case 158:
                i = -2294570;
                i4 = -16771576;
                return AbstractC72046XLm.A02(i, i4);
            case 159:
                i = -3356;
                i4 = -14219519;
                return AbstractC72046XLm.A02(i, i4);
            case 160:
                i = -723969;
                i4 = -15203778;
                return AbstractC72046XLm.A02(i, i4);
            case 161:
                i = -3850;
                i4 = -13893364;
                return AbstractC72046XLm.A02(i, i4);
            case 162:
                i = -2622216;
                i4 = -16706532;
                return AbstractC72046XLm.A02(i, i4);
            case 163:
                i = -133446;
                i4 = -14546174;
                return AbstractC72046XLm.A02(i, i4);
            case 164:
            case 178:
                i = -16492597;
                i4 = -16743685;
                return AbstractC72046XLm.A02(i, i4);
            case 165:
                i = -3545601;
                i4 = -16769419;
                return AbstractC72046XLm.A02(i, i4);
            case 166:
                i = -5900656;
                i4 = -16437224;
                return AbstractC72046XLm.A02(i, i4);
            case 167:
                i = -9287;
                i4 = -11659768;
                return AbstractC72046XLm.A02(i, i4);
            case 168:
                i = -2105345;
                i4 = -13564293;
                return AbstractC72046XLm.A02(i, i4);
            case 169:
                i = -206363;
                i4 = -11009506;
                return AbstractC72046XLm.A02(i, i4);
            case AbstractC62862SUj.MAX_FACTORIAL /* 170 */:
                i = -6033178;
                i4 = -16372424;
                return AbstractC72046XLm.A02(i, i4);
            case 171:
                i = -7862;
                i4 = -12247549;
                return AbstractC72046XLm.A02(i, i4);
            case 172:
            case 179:
                i = -16290519;
                i4 = -16017121;
                return AbstractC72046XLm.A02(i, i4);
            case 173:
            case 180:
                i = -6209788;
                i4 = -2727680;
                return AbstractC72046XLm.A02(i, i4);
            case 174:
            case 181:
                i = -9756931;
                i4 = -8033025;
                return AbstractC72046XLm.A02(i, i4);
            case 175:
            case 182:
                i = -4519868;
                i4 = -642200;
                return AbstractC72046XLm.A02(i, i4);
            case 176:
            case 183:
                i = -15767441;
                i4 = -15953261;
                return AbstractC72046XLm.A02(i, i4);
            case 177:
            case 184:
                i = -7712767;
                i4 = -4950272;
                return AbstractC72046XLm.A02(i, i4);
            case 185:
                return AbstractC72046XLm.A02(-13350828, -12166551);
            case 186:
                return AbstractC72046XLm.A02(-1, i2);
            case 187:
                return new ColorData(-12215809, -12215809);
            case 189:
                return AbstractC72046XLm.A02(i4, i3);
            case 194:
                return new ColorData(-14141117, -14141117);
            case 198:
                i4 = 1728053247;
                return new ColorData(i4, i4);
            case 199:
                i = -2983931;
                i4 = -674816;
                return AbstractC72046XLm.A02(i, i4);
            default:
                throw new RuntimeException();
        }
    }

    @Override // X.InterfaceC31072DlE
    public final int AKz(Integer num) {
        switch (AbstractC72046XLm.A01(num)) {
            case 0:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case Process.SIGSTOP /* 19 */:
            case 22:
            case 24:
            case 25:
            case 26:
                return 4;
            case 1:
                return 1000;
            case 3:
            case 21:
                return 8;
            case 18:
                return 0;
            case 20:
            case 23:
                return 12;
            default:
                throw new RuntimeException();
        }
    }

    @Override // X.InterfaceC31072DlE
    public final boolean AVw(Integer num) {
        switch (AbstractC72046XLm.A01(num)) {
            case 0:
            case 1:
                return true;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC31072DlE
    public final OpacityData E2H(EnumC27390C6t enumC27390C6t) {
        float f;
        float f2;
        float f3;
        switch (AbstractC72046XLm.A00(enumC27390C6t)) {
            case 0:
                f = 0.4f;
                return new OpacityData(f, f);
            case 1:
                f2 = 0.5f;
                f3 = 0.11f;
                return new OpacityData(f2, f3);
            case 2:
                f2 = 0.3f;
                f3 = 0.066f;
                return new OpacityData(f2, f3);
            case 3:
                f = 0.1f;
                return new OpacityData(f, f);
            case 4:
                f2 = 0.03f;
                f3 = 0.05f;
                return new OpacityData(f2, f3);
            case 5:
                f = 1.0f;
                return new OpacityData(f, f);
            default:
                throw new RuntimeException();
        }
    }

    @Override // X.InterfaceC31072DlE
    public final float Em4(Integer num) {
        switch (AbstractC72046XLm.A01(num)) {
            case 0:
            case 4:
            case Process.SIGSTOP /* 19 */:
                return 28.0f;
            case 1:
            case 32:
                return 2.0f;
            case 2:
            case 7:
            case 25:
                return 52.0f;
            case 3:
            case 22:
                return 36.0f;
            case 5:
                return 70.0f;
            case 6:
                return 64.0f;
            case 8:
                return 14.0f;
            case 9:
            case 24:
                return 48.0f;
            case 10:
                return 0.0f;
            case 11:
                return 10.0f;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return 112.0f;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return 12.0f;
            case 14:
                return 132.0f;
            case Process.SIGTERM /* 15 */:
                return 16.0f;
            case 16:
                return 18.0f;
            case 17:
            case 31:
                return 20.0f;
            case 18:
            case 30:
            case 34:
                return 24.0f;
            case 20:
                return 30.0f;
            case 21:
            case 33:
                return 32.0f;
            case 23:
                return 40.0f;
            case 26:
                return 56.0f;
            case 27:
                return 60.0f;
            case 28:
                return 72.0f;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return 8.0f;
            case 35:
                return 22.0f;
            case 36:
                return 5.0f;
            default:
                throw new RuntimeException();
        }
    }

    @Override // X.InterfaceC31072DlE
    public final float Ema(Integer num) {
        switch (AbstractC72046XLm.A01(num)) {
            case 0:
            case 3:
            case 6:
            case 27:
            case 37:
            case Seq.NULL_REFNUM /* 41 */:
            case 48:
            case 49:
            case 53:
            case 67:
            case 79:
                return 12.0f;
            case 1:
            case 2:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case 16:
            case Process.SIGSTOP /* 19 */:
            case 21:
            case 22:
            case 26:
            case 28:
            case 30:
            case 32:
            case 33:
            case 35:
            case 36:
            case 39:
            case 43:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            case 54:
            case 59:
            case 60:
            case 62:
            case 65:
            case 66:
            case 71:
            case 73:
            case 75:
            case 76:
            case 77:
                return 16.0f;
            case 4:
            case 5:
            case 8:
            case 9:
            case 11:
            case 14:
            case 45:
            case 68:
            case 69:
            case 80:
                return 6.0f;
            case 7:
            case 70:
                return 4.0f;
            case 17:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 47:
            case 57:
            case 58:
            case 61:
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
            case 64:
            case 74:
                return 20.0f;
            case 18:
                return 75.0f;
            case 20:
            case 72:
                return 14.0f;
            case 23:
            case 34:
            case 40:
                return 0.0f;
            case 24:
                return 52.0f;
            case 25:
                return 36.0f;
            case 31:
                return 5.0f;
            case 38:
            case 44:
                return 8.0f;
            case 51:
            case 78:
                return 9.0f;
            case 52:
                return 24.0f;
            case 55:
                return 22.0f;
            case 56:
                return 64.0f;
            case 81:
            case 82:
                return 10.0f;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    @Override // X.InterfaceC31072DlE
    public final CSN F8x(Integer num) {
        EnumC72437Xdh enumC72437Xdh;
        float f;
        Integer num2;
        float f2;
        float f3 = 1.15f;
        switch (AbstractC72046XLm.A01(num)) {
            case 0:
                enumC72437Xdh = EnumC72437Xdh.A0A;
                f = 15.0f;
                num2 = C05F.A00;
                f2 = 0.245f;
                return new CSN(new COS(f3), num2, enumC72437Xdh, f, f2);
            case 1:
                enumC72437Xdh = EnumC72437Xdh.A0B;
                f = 15.0f;
                num2 = C05F.A0N;
                f2 = 0.245f;
                return new CSN(new COS(f3), num2, enumC72437Xdh, f, f2);
            case 2:
                enumC72437Xdh = EnumC72437Xdh.A03;
                f = 28.0f;
                num2 = C05F.A00;
                f2 = 0.35f;
                f3 = 0.945f;
                return new CSN(new COS(f3), num2, enumC72437Xdh, f, f2);
            case 3:
                enumC72437Xdh = EnumC72437Xdh.A03;
                f = 24.0f;
                num2 = C05F.A00;
                f2 = 0.32f;
                f3 = 0.96f;
                return new CSN(new COS(f3), num2, enumC72437Xdh, f, f2);
            case 4:
                enumC72437Xdh = EnumC72437Xdh.A03;
                f = 17.0f;
                num2 = C05F.A00;
                f2 = 0.3f;
                f3 = 0.95f;
                return new CSN(new COS(f3), num2, enumC72437Xdh, f, f2);
            case 5:
                enumC72437Xdh = EnumC72437Xdh.A0A;
                f = 13.0f;
                num2 = C05F.A00;
                f2 = 0.15f;
                f3 = 1.2f;
                return new CSN(new COS(f3), num2, enumC72437Xdh, f, f2);
            case 6:
                enumC72437Xdh = EnumC72437Xdh.A0B;
                f = 13.0f;
                num2 = C05F.A0N;
                f2 = 0.15f;
                f3 = 1.1f;
                return new CSN(new COS(f3), num2, enumC72437Xdh, f, f2);
            case 7:
                enumC72437Xdh = EnumC72437Xdh.A04;
                f = 17.0f;
                num2 = C05F.A00;
                f2 = 0.3f;
                f3 = 1.05f;
                return new CSN(new COS(f3), num2, enumC72437Xdh, f, f2);
            case 8:
                enumC72437Xdh = EnumC72437Xdh.A0B;
                f = 15.0f;
                num2 = C05F.A00;
                f2 = 0.25f;
                return new CSN(new COS(f3), num2, enumC72437Xdh, f, f2);
            case 9:
                enumC72437Xdh = EnumC72437Xdh.A05;
                f = 12.0f;
                num2 = C05F.A00;
                f2 = -0.04f;
                f3 = 1.17f;
                return new CSN(new COS(f3), num2, enumC72437Xdh, f, f2);
            default:
                throw new RuntimeException();
        }
    }
}
