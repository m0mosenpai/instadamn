package X;

import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.EnumSet;

/* renamed from: X.2wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64832wh implements InterfaceC55202gL {
    public final Fragment A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final EnumSet A03;
    public final EnumSet A04;

    @Override // X.InterfaceC55202gL
    public final GYB BAv(EnumC55212gM enumC55212gM) {
        int i;
        Object c36632GDe;
        if (enumC55212gM == null) {
            i = -1;
        } else {
            i = FEE.A00[enumC55212gM.ordinal()];
        }
        String A00 = AbstractC43591JPw.A00(0);
        switch (i) {
            case 1:
                c36632GDe = new C36643GDp(this.A00, this.A02);
                break;
            case 2:
                c36632GDe = new C36644GDq(this.A00, this.A02);
                break;
            case 3:
                c36632GDe = new C36646GDs(this.A00.requireActivity(), this.A02);
                break;
            case 4:
                Fragment fragment = this.A00;
                c36632GDe = new C36660GEg(fragment.requireContext(), AbstractC018607g.A00(fragment), this.A02);
                break;
            case 5:
                c36632GDe = new C36658GEe(this.A00.requireActivity(), this.A02);
                break;
            case 6:
                Fragment fragment2 = this.A00;
                c36632GDe = new C36671GEr(fragment2.requireContext(), fragment2.requireActivity(), AbstractC018607g.A00(fragment2), this.A02);
                break;
            case 7:
                c36632GDe = new C36651GDx(this.A00.requireActivity(), this.A02);
                break;
            case 8:
                c36632GDe = new C36669GEp(this.A00.requireContext(), this.A02);
                break;
            case 9:
                c36632GDe = new GDC(this.A00.requireContext(), this.A02);
                break;
            case 10:
                Fragment fragment3 = this.A00;
                c36632GDe = new C36659GEf(fragment3.requireContext(), AbstractC018607g.A00(fragment3), this.A02);
                break;
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c36632GDe = new C36666GEm(this.A00.requireActivity(), this.A02, this.A01.getModuleName());
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c36632GDe = new GDZ(this.A00.requireActivity(), this.A02);
                break;
            case 14:
                c36632GDe = new C36606GCe(this.A00.requireContext());
                break;
            case Process.SIGTERM /* 15 */:
                c36632GDe = new C36605GCd(this.A02);
                break;
            case 16:
                c36632GDe = new GE3(this.A00.requireActivity(), this.A02);
                break;
            case 17:
                c36632GDe = new GE2(this.A00.requireActivity(), this.A02);
                break;
            case 18:
            case Process.SIGSTOP /* 19 */:
                c36632GDe = new GCX(this.A00.requireContext());
                break;
            case 20:
                c36632GDe = new C36640GDm(this.A00.requireActivity(), this.A02);
                break;
            case 21:
                c36632GDe = new C24000Ake(this.A00, this.A02);
                break;
            case 22:
                c36632GDe = new P7L(this.A00, this.A02);
                break;
            case 23:
                c36632GDe = new GCZ(this.A00);
                break;
            case 24:
                c36632GDe = new C36604GCc(this.A00);
                break;
            case 25:
                c36632GDe = new C36603GCb(this.A00);
                break;
            case 26:
                c36632GDe = new C36602GCa(this.A00.requireActivity());
                break;
            case 27:
                Fragment fragment4 = this.A00;
                c36632GDe = new C36674GEu(fragment4.requireActivity(), AbstractC018607g.A00(fragment4), this.A01, this.A02);
                break;
            case 28:
                c36632GDe = new C36608GCg(this.A02);
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                c36632GDe = new C36624GCw(this.A00.requireActivity(), this.A02);
                break;
            case 30:
            case 31:
            case 32:
                c36632GDe = new C36662GEi(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 33:
                c36632GDe = new C36648GDu(this.A00, this.A02);
                break;
            case 34:
                c36632GDe = new C36628GDa(this.A00.requireActivity(), this.A02);
                break;
            case 35:
                c36632GDe = new C36650GDw(this.A00, this.A02);
                break;
            case 36:
                c36632GDe = new C36647GDt(this.A00, this.A02);
                break;
            case 37:
                c36632GDe = new C36661GEh(this.A00, this.A01, this.A02);
                break;
            case 38:
                c36632GDe = new GEA(this.A00, this.A02);
                break;
            case 39:
                c36632GDe = new GEC(this.A00, this.A02);
                break;
            case 40:
                c36632GDe = new GDT(this.A00, this.A02);
                break;
            case Seq.NULL_REFNUM /* 41 */:
                c36632GDe = new C36636GDi(this.A00, this.A02);
                break;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                c36632GDe = new C36645GDr(this.A00, this.A02);
                break;
            case 43:
                c36632GDe = new GEE(this.A00, this.A02);
                break;
            case 44:
                c36632GDe = new C36615GCn(this.A00, this.A02);
                break;
            case 45:
                c36632GDe = new GE5(this.A00, this.A02);
                break;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                c36632GDe = new GE6(this.A00, this.A02);
                break;
            case 47:
                c36632GDe = new P7M(this.A00, this.A02);
                break;
            case 48:
                c36632GDe = new C36637GDj(this.A00.requireActivity(), this.A02);
                break;
            case 49:
                c36632GDe = new C36639GDl(this.A00, this.A02);
                break;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                c36632GDe = new C36641GDn(this.A00, this.A02);
                break;
            case 51:
                c36632GDe = new GE9(this.A00, this.A02);
                break;
            case 52:
                c36632GDe = new GED(this.A00, this.A02);
                break;
            case 53:
                c36632GDe = new GEB(this.A00, this.A02);
                break;
            case 54:
                c36632GDe = new C36653GDz(this.A00, this.A02);
                break;
            case 55:
                c36632GDe = new C29355Cwo(this.A00, this.A02);
                break;
            case 56:
                c36632GDe = new GE0(this.A00, this.A02);
                break;
            case 57:
                c36632GDe = new C29354Cwn(this.A00, this.A02);
                break;
            case 58:
                c36632GDe = new P7G(this.A02);
                break;
            case 59:
                Fragment fragment5 = this.A00;
                c36632GDe = new C36657GEd(fragment5.requireContext(), fragment5, this.A02);
                break;
            case 60:
                c36632GDe = new C36656GEc(this.A00.requireContext());
                break;
            case 61:
                Fragment fragment6 = this.A00;
                c36632GDe = new GDW(fragment6.requireContext(), fragment6);
                break;
            case 62:
                Fragment fragment7 = this.A00;
                C14360o3.A0C(fragment7, A00);
                c36632GDe = new GET((AbstractC59962oe) fragment7, this.A02);
                break;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                Fragment fragment8 = this.A00;
                C14360o3.A0C(fragment8, A00);
                c36632GDe = new C36614GCm((AbstractC59962oe) fragment8, this.A02);
                break;
            case 64:
                Fragment fragment9 = this.A00;
                C14360o3.A0C(fragment9, A00);
                c36632GDe = new GEU((AbstractC59962oe) fragment9, this.A02);
                break;
            case 65:
                c36632GDe = new C36635GDh(this.A00.requireActivity(), this.A02);
                break;
            case 66:
                c36632GDe = new GD8(this.A00.requireActivity(), this.A02);
                break;
            case 67:
                c36632GDe = new GD9(this.A00.requireActivity(), this.A02);
                break;
            case 68:
                c36632GDe = new GDA(this.A00.requireActivity(), this.A02);
                break;
            case 69:
                c36632GDe = new GD7(this.A00.requireActivity(), this.A02);
                break;
            case 70:
                c36632GDe = new GD6(this.A00.requireActivity(), this.A02);
                break;
            case 71:
                c36632GDe = new C36649GDv(this.A00.requireActivity(), this.A02);
                break;
            case 72:
                c36632GDe = new GE8(this.A00.requireActivity(), this.A02);
                break;
            case 73:
                c36632GDe = new GEJ(this.A00, this.A02);
                break;
            case 74:
                c36632GDe = new GEI(this.A00, this.A02);
                break;
            case 75:
                Fragment fragment10 = this.A00;
                C14360o3.A0C(fragment10, A00);
                c36632GDe = new C42775IwD((AbstractC59962oe) fragment10, this.A02);
                break;
            case 76:
                Fragment fragment11 = this.A00;
                C14360o3.A0C(fragment11, A00);
                c36632GDe = new C49560LvE((AbstractC59962oe) fragment11, this.A02);
                break;
            case 77:
                Fragment fragment12 = this.A00;
                C14360o3.A0C(fragment12, A00);
                c36632GDe = new C42769Iw7((AbstractC59962oe) fragment12, this.A02);
                break;
            case 78:
                c36632GDe = new C42770Iw8(this.A02, this.A00.requireActivity());
                break;
            case 79:
                c36632GDe = new C42768Iw6(this.A00, this.A02);
                break;
            case 80:
                c36632GDe = new GDU(this.A00.requireActivity(), this.A02);
                break;
            case 81:
                c36632GDe = new C36665GEl(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 82:
                c36632GDe = new C36620GCs(this.A00.requireActivity(), this.A02);
                break;
            case 83:
                c36632GDe = new GDF(this.A00.requireActivity(), this.A02);
                break;
            case 84:
                c36632GDe = new GDG(this.A00.requireActivity(), this.A02);
                break;
            case 85:
                c36632GDe = new C23999Akd(this.A00.requireActivity(), this.A02);
                break;
            case 86:
                c36632GDe = new C36611GCj(this.A00.requireActivity(), this.A02);
                break;
            case 87:
                c36632GDe = new C36670GEq(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 88:
                c36632GDe = new C36630GDc(this.A00.requireActivity(), this.A02);
                break;
            case 89:
                c36632GDe = new GDK(this.A00, this.A02);
                break;
            case 90:
                c36632GDe = new C70982Wlq(this.A00, this.A01, this.A02);
                break;
            case 91:
                c36632GDe = new GDH(this.A00.requireActivity(), this.A02);
                break;
            case 92:
                c36632GDe = new GEG(this.A00, this.A02);
                break;
            case 93:
                c36632GDe = new GCY(this.A00.requireActivity());
                break;
            case 94:
                c36632GDe = new C36621GCt(this.A00.requireActivity(), this.A02);
                break;
            case 95:
                c36632GDe = new GER(this.A00.requireActivity(), this.A02);
                break;
            case 96:
                c36632GDe = new GDJ(this.A00.requireActivity(), this.A02);
                break;
            case 97:
                c36632GDe = new C36634GDg(this.A00.requireActivity(), this.A02);
                break;
            case 98:
                c36632GDe = new GDM(this.A00.requireActivity(), this.A02);
                break;
            case 99:
                c36632GDe = new GDL(this.A00.requireActivity(), this.A02);
                break;
            case 100:
                c36632GDe = new GDN(this.A00.requireActivity(), this.A02);
                break;
            case 101:
                c36632GDe = new GEZ(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 102:
                c36632GDe = new GEF(this.A00.requireActivity(), this.A02);
                break;
            case 103:
                c36632GDe = new GEN(this.A00.requireActivity(), this.A02);
                break;
            case 104:
                c36632GDe = new GEO(this.A00.requireActivity(), this.A02);
                break;
            case 105:
                c36632GDe = new GEM(this.A00.requireActivity(), this.A02);
                break;
            case 106:
                c36632GDe = new C36629GDb(this.A00.requireActivity(), this.A02);
                break;
            case 107:
                c36632GDe = new GD2(this.A00, this.A02);
                break;
            case 108:
                c36632GDe = new P7J(this.A00.requireContext(), this.A02);
                break;
            case 109:
                c36632GDe = new GCW(this.A00);
                break;
            case 110:
                c36632GDe = new GE7(this.A00.requireActivity(), this.A02);
                break;
            case 111:
                Fragment fragment13 = this.A00;
                c36632GDe = new C36654GEa(fragment13.requireActivity(), this.A02, fragment13.mTag);
                break;
            case 112:
                c36632GDe = new GDR(this.A00.requireActivity(), this.A02);
                break;
            case 113:
                c36632GDe = new C36612GCk(this.A00, this.A02);
                break;
            case 114:
                c36632GDe = new GE4(this.A00.requireActivity(), this.A02);
                break;
            case 115:
                c36632GDe = new P7I(this.A00.requireContext(), this.A02);
                break;
            case 116:
                c36632GDe = new GE1(this.A00.requireActivity(), this.A02);
                break;
            case 117:
                c36632GDe = new C42774IwC(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 118:
                c36632GDe = new GDY(this.A00.requireActivity(), this.A02);
                break;
            case 119:
                c36632GDe = new C29353Cwm(this.A00.requireActivity(), this.A02);
                break;
            case HucClient.BODY_UPLOAD_TIMEOUT_SECONDS /* 120 */:
                c36632GDe = new C49557LvB(this.A00.requireActivity(), this.A02);
                break;
            case 121:
            case 122:
                return new C42773IwB(this.A02, this.A00.requireActivity());
            case 123:
                c36632GDe = new C42771Iw9(this.A00.requireActivity(), this.A02);
                break;
            case 124:
                c36632GDe = new Object();
                break;
            case 125:
                c36632GDe = new GDV(this.A00, this.A02);
                break;
            case 126:
                c36632GDe = new C36668GEo(this.A00, this.A02);
                break;
            case StringTreeSet.MAX_SYMBOL_COUNT /* 127 */:
                c36632GDe = new P7N(this.A00.requireActivity(), this.A02);
                break;
            case 128:
                c36632GDe = new C36607GCf(this.A00);
                break;
            case 129:
                c36632GDe = new GDO(this.A00.requireActivity(), this.A02);
                break;
            case 130:
                c36632GDe = new C42772IwA(this.A00.requireActivity(), this.A02);
                break;
            case 131:
                c36632GDe = new C49558LvC(this.A00.requireActivity(), this.A02);
                break;
            case 132:
                c36632GDe = new C36664GEk(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 133:
                c36632GDe = new C36663GEj(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 134:
                c36632GDe = new GEH(this.A00.requireActivity(), this.A02);
                break;
            case 135:
                c36632GDe = new C36619GCr(this.A00.requireActivity(), this.A02);
                break;
            case 136:
                c36632GDe = new C36617GCp(this.A00.requireActivity(), this.A02);
                break;
            case 137:
                c36632GDe = new C36652GDy(this.A00, this.A02);
                break;
            case 138:
                c36632GDe = new GDB(this.A00.requireActivity(), this.A02);
                break;
            case 139:
                c36632GDe = new C36672GEs(this.A00.requireActivity(), this.A02);
                break;
            case 140:
                c36632GDe = new GDQ(this.A00, this.A02);
                break;
            case 141:
                c36632GDe = new GDP(this.A00, this.A02);
                break;
            case 142:
                c36632GDe = new C70981Wlp(this.A00.requireActivity(), this.A02);
                break;
            case 143:
                c36632GDe = new C36613GCl(this.A00.requireActivity(), this.A02);
                break;
            case 144:
                c36632GDe = new C36616GCo(this.A00.requireActivity(), this.A02);
                break;
            case 145:
                c36632GDe = new C36623GCv(this.A00, this.A02);
                break;
            case 146:
                c36632GDe = new C36625GCx(this.A00.requireActivity(), this.A02);
                break;
            case 147:
                c36632GDe = new C36622GCu(this.A00.requireActivity(), this.A02);
                break;
            case 148:
                c36632GDe = new C36655GEb(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 149:
                Fragment fragment14 = this.A00;
                UserSession userSession = this.A02;
                c36632GDe = new C70983Wlr(fragment14.requireContext(), fragment14, this.A01, userSession);
                break;
            case 150:
                c36632GDe = new C49556LvA(this.A00, this.A02);
                break;
            case 151:
                c36632GDe = new GD3(this.A00, this.A02);
                break;
            case 152:
                c36632GDe = new C49555Lv9(this.A02);
                break;
            case 153:
                c36632GDe = new C70980Wlo(this.A00, this.A02);
                break;
            case 154:
                c36632GDe = new C36610GCi(this.A00.requireActivity(), this.A02);
                break;
            case 155:
                c36632GDe = new GD5(this.A00.requireActivity(), this.A02);
                break;
            case 156:
                c36632GDe = new C49559LvD(this.A00.requireContext(), this.A02);
                break;
            case 157:
                c36632GDe = new C36609GCh(this.A00.requireActivity());
                break;
            case 158:
                c36632GDe = new C49561LvF(this.A00, this.A01, this.A02);
                break;
            case 159:
                Fragment fragment15 = this.A00;
                c36632GDe = new GEY(fragment15.requireContext(), fragment15.requireActivity(), this.A02);
                break;
            case 160:
                c36632GDe = new GDI(this.A00.requireActivity(), this.A02);
                break;
            case 161:
                c36632GDe = new GDE(this.A00.requireActivity(), this.A02);
                break;
            case 162:
                c36632GDe = new GDD(this.A00.requireContext(), this.A02);
                break;
            case 163:
                c36632GDe = new GEL(this.A00.requireActivity(), this.A02);
                break;
            case 164:
                c36632GDe = new C36642GDo(this.A00, this.A02);
                break;
            case 165:
                c36632GDe = new GEV(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 166:
                c36632GDe = new GEK(this.A00.requireActivity(), this.A02);
                break;
            case 167:
                c36632GDe = new GEP(this.A00.requireActivity(), this.A02);
                break;
            case 168:
                c36632GDe = new C36627GCz(this.A00.requireActivity(), this.A02);
                break;
            case 169:
                c36632GDe = new C36626GCy(this.A00.requireActivity(), this.A02);
                break;
            case AbstractC62862SUj.MAX_FACTORIAL /* 170 */:
                c36632GDe = new GD0(this.A00.requireActivity(), this.A02);
                break;
            case 171:
                c36632GDe = new GD1(this.A00.requireActivity(), this.A02);
                break;
            case 172:
                c36632GDe = new GEX(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 173:
                c36632GDe = new C29352Cwl(this.A00.requireActivity(), this.A02);
                break;
            case 174:
                c36632GDe = new GEQ(this.A00, this.A02);
                break;
            case 175:
                c36632GDe = new C36633GDf(this.A00.requireActivity(), this.A02);
                break;
            case 176:
                c36632GDe = new P7K(this.A00.requireActivity(), this.A02);
                break;
            case 177:
                c36632GDe = new GDS(this.A00.requireActivity(), this.A02);
                break;
            case 178:
                c36632GDe = new C36618GCq(this.A00.requireActivity(), this.A02);
                break;
            case 179:
                c36632GDe = new GD4(this.A00.requireActivity(), this.A02);
                break;
            case 180:
                c36632GDe = new P7O(this.A00, this.A02);
                break;
            case 181:
                c36632GDe = new C36631GDd(this.A00, this.A02);
                break;
            case 182:
                c36632GDe = new C36638GDk(this.A00.requireActivity(), this.A02);
                break;
            case 183:
                c36632GDe = new GDX(this.A00, this.A02);
                break;
            case 184:
                Fragment fragment16 = this.A00;
                C14360o3.A0C(fragment16, A00);
                c36632GDe = new C36673GEt((AbstractC59962oe) fragment16, this.A02);
                break;
            case 185:
                Fragment fragment17 = this.A00;
                c36632GDe = new GEW(fragment17.requireContext(), AbstractC018607g.A00(fragment17), this.A02);
                break;
            case 186:
                Fragment fragment18 = this.A00;
                c36632GDe = new C36667GEn(fragment18.requireActivity(), fragment18, this.A01, this.A02);
                break;
            case 187:
                c36632GDe = new C29351Cwk(this.A00.requireActivity(), this.A02);
                break;
            case 188:
                c36632GDe = new GES(this.A01, this.A02);
                break;
            case 189:
                c36632GDe = new C36632GDe(this.A00, this.A02);
                break;
            default:
                return null;
        }
        return (GYB) c36632GDe;
    }

    @Override // X.InterfaceC55202gL
    public final EnumSet C4E() {
        return this.A04;
    }

    public C64832wh(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        EnumSet allOf = EnumSet.allOf(EnumC55212gM.class);
        this.A03 = allOf;
        C14360o3.A07(allOf);
        this.A04 = allOf;
    }
}
