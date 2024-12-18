package X;

import ca.psiphon.PsiphonTunnel;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.session.UserSession;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Ci4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28510Ci4 {
    public final UserSession A00;

    public final Long A0W(int i) {
        if (i <= 274) {
            switch (i) {
                case 0:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592545836696156L);
                case 1:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592545837089375L);
                case 2:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592545837023838L);
                case 3:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592545836892765L);
                case 6:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592532951401045L);
                case 8:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592666095518352L);
                case 9:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592666095452815L);
                case 10:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592666095387278L);
                case 14:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987490619477L);
                case 18:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592743404864168L);
                case Process.SIGSTOP /* 19 */:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592743404798631L);
                case 20:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592558721204837L);
                case 23:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591966015717450L);
                case 24:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592056210096336L);
                case 25:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592558721270374L);
                case 26:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592399807414759L);
                case 58:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592575901270652L);
                case 59:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592575901205115L);
                case 60:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592575901336189L);
                case 71:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039030685845L);
                case 72:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039030358160L);
                case 73:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039030947992L);
                case 74:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039030554771L);
                case 75:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039030161549L);
                case 79:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039030882455L);
                case 80:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039030292623L);
                case 85:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592073389899997L);
                case 86:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593065527346085L);
                case 87:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593065527477159L);
                case 88:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593065527411622L);
                case 91:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592056210030799L);
                case 98:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031168000913L);
                case 99:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031168459668L);
                case 101:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031168525205L);
                case 108:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592537246368343L);
                case 109:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592537246433880L);
                case 110:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592335382905275L);
                case 111:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592335382970812L);
                case 112:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592335383101886L);
                case 113:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592335383036349L);
                case 114:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591884411338797L);
                case 117:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081980948727L);
                case HucClient.BODY_UPLOAD_TIMEOUT_SECONDS /* 120 */:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592386923364814L);
                case StringTreeSet.MAX_SYMBOL_COUNT /* 127 */:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592537246499417L);
                case 128:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592537246564954L);
                case 134:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962448130815L);
                case 135:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107749703964L);
                case 136:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107749900573L);
                case 137:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107749638427L);
                case 138:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051916505257L);
                case 139:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051916898479L);
                case 142:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031168131987L);
                case 145:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031168066450L);
                case 146:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031167673231L);
                case 147:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081981473017L);
                case 148:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081981341944L);
                case 149:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051916964016L);
                case 150:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051917488308L);
                case 151:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051916701868L);
                case 152:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592391217545688L);
                case 153:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051916767405L);
                case 155:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442757284342L);
                case 162:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593009692836746L);
                case 164:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039030489234L);
                case 165:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039030423697L);
                case 168:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031167804304L);
                case 172:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592030440292486L);
                case 173:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593001102967685L);
                case 174:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593001102902148L);
                case 175:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593001102836611L);
                case 176:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593001103033222L);
                case 182:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592000375717997L);
                case 183:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592000375652460L);
                case 184:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592000375455849L);
                case 185:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592000375586923L);
                case 186:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592000375521386L);
                case 187:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592928088392440L);
                case 188:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592928088589051L);
                case 189:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592928088654588L);
                case 190:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592928088523514L);
                case 191:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592928088457977L);
                case 192:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592880843948778L);
                case 193:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592880844014315L);
                case 194:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592880843752167L);
                case 195:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592880843883241L);
                case 196:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592880843817704L);
                case 197:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592030440358023L);
                case 199:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592923793425143L);
                case 200:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593009692771209L);
                case 202:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592898023621359L);
                case 203:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591970310684747L);
                case 212:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592558721401448L);
                case 213:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592558721335911L);
                case 220:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081981669626L);
                case 221:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592661800419981L);
                case 222:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592756289700521L);
                case 223:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592756289831595L);
                case 224:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592756289766058L);
                case 228:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592103454736666L);
                case 232:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592464231924278L);
                case 241:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592043325128865L);
                case 242:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592043325194402L);
                case 243:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592554426303076L);
                case 244:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592966743360273L);
                case 245:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592966743425810L);
                case 246:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592966743163663L);
                case 248:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592966743098126L);
                case 255:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593039757542304L);
                case 256:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593039757607841L);
                case 263:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591871526436908L);
                case 266:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592176469770582L);
                case 267:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592176469836119L);
                case 268:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592176470229337L);
                case 271:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592176469115218L);
                case 274:
                    return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592472821858872L);
                default:
                    return null;
            }
        }
        if (i <= 549) {
            return A00(i);
        }
        if (i <= 825) {
            return A01(i);
        }
        if (i <= 1100) {
            return A02(i);
        }
        if (i <= 1376) {
            return A08(i);
        }
        if (i <= 1651) {
            return A09(i);
        }
        if (i <= 1926) {
            return A0A(i);
        }
        if (i <= 2202) {
            return A0B(i);
        }
        if (i <= 2477) {
            return A0C(i);
        }
        if (i <= 2753) {
            return A0D(i);
        }
        if (i <= 3028) {
            return A0E(i);
        }
        if (i <= 3303) {
            return A0F(i);
        }
        if (i <= 3579) {
            return A03(i);
        }
        if (i <= 3854) {
            return A04(i);
        }
        if (i <= 4130) {
            return A05(i);
        }
        if (i <= 4405) {
            return A06(i);
        }
        return A07(i);
    }

    public final Long A0X(int i) {
        if (i <= 274) {
            switch (i) {
                case 0:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592545836696156L);
                case 1:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592545837089375L);
                case 2:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592545837023838L);
                case 3:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592545836892765L);
                case 6:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592532951401045L);
                case 8:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592666095518352L);
                case 9:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592666095452815L);
                case 10:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592666095387278L);
                case 14:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987490619477L);
                case 18:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592743404864168L);
                case Process.SIGSTOP /* 19 */:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592743404798631L);
                case 20:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592558721204837L);
                case 23:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591966015717450L);
                case 24:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592056210096336L);
                case 25:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592558721270374L);
                case 26:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592399807414759L);
                case 58:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592575901270652L);
                case 59:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592575901205115L);
                case 60:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592575901336189L);
                case 71:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039030685845L);
                case 72:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039030358160L);
                case 73:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039030947992L);
                case 74:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039030554771L);
                case 75:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039030161549L);
                case 79:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039030882455L);
                case 80:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039030292623L);
                case 85:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592073389899997L);
                case 86:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593065527346085L);
                case 87:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593065527477159L);
                case 88:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593065527411622L);
                case 91:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592056210030799L);
                case 98:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031168000913L);
                case 99:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031168459668L);
                case 101:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031168525205L);
                case 108:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592537246368343L);
                case 109:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592537246433880L);
                case 110:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592335382905275L);
                case 111:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592335382970812L);
                case 112:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592335383101886L);
                case 113:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592335383036349L);
                case 114:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591884411338797L);
                case 117:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081980948727L);
                case HucClient.BODY_UPLOAD_TIMEOUT_SECONDS /* 120 */:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592386923364814L);
                case StringTreeSet.MAX_SYMBOL_COUNT /* 127 */:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592537246499417L);
                case 128:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592537246564954L);
                case 134:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962448130815L);
                case 135:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107749703964L);
                case 136:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107749900573L);
                case 137:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107749638427L);
                case 138:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051916505257L);
                case 139:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051916898479L);
                case 142:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031168131987L);
                case 145:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031168066450L);
                case 146:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031167673231L);
                case 147:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081981473017L);
                case 148:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081981341944L);
                case 149:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051916964016L);
                case 150:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051917488308L);
                case 151:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051916701868L);
                case 152:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592391217545688L);
                case 153:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051916767405L);
                case 155:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442757284342L);
                case 162:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593009692836746L);
                case 164:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039030489234L);
                case 165:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039030423697L);
                case 168:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031167804304L);
                case 172:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592030440292486L);
                case 173:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593001102967685L);
                case 174:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593001102902148L);
                case 175:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593001102836611L);
                case 176:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593001103033222L);
                case 182:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592000375717997L);
                case 183:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592000375652460L);
                case 184:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592000375455849L);
                case 185:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592000375586923L);
                case 186:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592000375521386L);
                case 187:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592928088392440L);
                case 188:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592928088589051L);
                case 189:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592928088654588L);
                case 190:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592928088523514L);
                case 191:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592928088457977L);
                case 192:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592880843948778L);
                case 193:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592880844014315L);
                case 194:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592880843752167L);
                case 195:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592880843883241L);
                case 196:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592880843817704L);
                case 197:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592030440358023L);
                case 199:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592923793425143L);
                case 200:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593009692771209L);
                case 202:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592898023621359L);
                case 203:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591970310684747L);
                case 212:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592558721401448L);
                case 213:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592558721335911L);
                case 220:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081981669626L);
                case 221:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592661800419981L);
                case 222:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592756289700521L);
                case 223:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592756289831595L);
                case 224:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592756289766058L);
                case 228:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592103454736666L);
                case 232:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592464231924278L);
                case 241:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592043325128865L);
                case 242:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592043325194402L);
                case 243:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592554426303076L);
                case 244:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592966743360273L);
                case 245:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592966743425810L);
                case 246:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592966743163663L);
                case 248:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592966743098126L);
                case 255:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593039757542304L);
                case 256:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593039757607841L);
                case 263:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591871526436908L);
                case 266:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592176469770582L);
                case 267:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592176469836119L);
                case 268:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592176470229337L);
                case 271:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592176469115218L);
                case 274:
                    return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592472821858872L);
                default:
                    return null;
            }
        }
        if (i <= 549) {
            return A0G(i);
        }
        if (i <= 825) {
            return A0H(i);
        }
        if (i <= 1100) {
            return A0I(i);
        }
        if (i <= 1376) {
            return A0O(i);
        }
        if (i <= 1651) {
            return A0P(i);
        }
        if (i <= 1926) {
            return A0Q(i);
        }
        if (i <= 2202) {
            return A0R(i);
        }
        if (i <= 2477) {
            return A0S(i);
        }
        if (i <= 2753) {
            return A0T(i);
        }
        if (i <= 3028) {
            return A0U(i);
        }
        if (i <= 3303) {
            return A0V(i);
        }
        if (i <= 3579) {
            return A0J(i);
        }
        if (i <= 3854) {
            return A0K(i);
        }
        if (i <= 4130) {
            return A0L(i);
        }
        if (i <= 4405) {
            return A0M(i);
        }
        return A0N(i);
    }

    public C28510Ci4(UserSession userSession) {
        this.A00 = userSession;
    }

    private Long A00(int i) {
        switch (i) {
            case 277:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592842189046492L);
            case 283:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592116339573055L);
            case 284:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039030620308L);
            case 285:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039030816918L);
            case 286:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039030227086L);
            case 287:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592374037610946L);
            case 288:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592374037742020L);
            case 289:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592374037676483L);
            case 294:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442757153269L);
            case 295:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975336375100L);
            case 296:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591961720750153L);
            case 302:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592412692382185L);
            case 307:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051917422771L);
            case 308:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592034735194252L);
            case 309:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593044052509602L);
            case 316:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592674685321875L);
            case 317:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592674685452949L);
            case 318:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592674685387412L);
            case 319:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592674685518486L);
            case 320:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592979628000070L);
            case 321:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592979628065607L);
            case 334:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592386923430351L);
            case 341:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051916636331L);
            case 342:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975336244026L);
            case 343:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975335654195L);
            case 344:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975334998828L);
            case 345:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975335719732L);
            case 346:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975336178489L);
            case 347:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975336440637L);
            case 348:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975336112952L);
            case 349:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975335457585L);
            case 350:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975336506174L);
            case 351:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975336571711L);
            case 352:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975335195439L);
            case 353:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975335064365L);
            case 354:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975335326512L);
            case 355:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975336047415L);
            case 356:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975335785269L);
            case 357:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975335850806L);
            case 358:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975335129902L);
            case 359:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975335588658L);
            case 373:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592176469967192L);
            case 382:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592008965390446L);
            case 385:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592919498457846L);
            case 390:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592378332840394L);
            case 393:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592176469311828L);
            case 398:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051917291698L);
            case 399:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051916570794L);
            case 401:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051917095089L);
            case 402:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975336309563L);
            case 403:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592386923626962L);
            case 404:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592386923233740L);
            case 405:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592386923495888L);
            case 406:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592386923561425L);
            case 407:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592386923299277L);
            case 408:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592386923168203L);
            case 420:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592966743294736L);
            case 421:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592966743491347L);
            case 425:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592176469377365L);
            case 426:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395513430492L);
            case 430:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395513233881L);
            case 434:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592563016237677L);
            case 435:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592580196041346L);
            case 436:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592580196106883L);
            case 437:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591974605717581L);
            case 438:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077685129438L);
            case 439:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592563016172140L);
            case 440:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592563016303214L);
            case 444:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862936502294L);
            case 446:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987490553940L);
            case 453:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592734814864035L);
            case 456:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591996080488552L);
            case 457:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592176469180755L);
            case 458:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971038065433L);
            case 465:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592584491008647L);
            case 466:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592069095063772L);
            case 467:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592520066499156L);
            case 470:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592060504998097L);
            case 474:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395513364955L);
            case 475:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591974605652044L);
            case 478:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395513299418L);
            case 479:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592691865256601L);
            case 480:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769174799024L);
            case 481:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051916832942L);
            case 484:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592180764082524L);
            case 486:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592833599111898L);
            case 494:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051917684917L);
            case 497:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592133519442248L);
            case 498:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395513758173L);
            case 500:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592472821989945L);
            case 501:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592812124340953L);
            case 502:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592812124275416L);
            case 503:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593074117280684L);
            case 509:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592588786041481L);
            case 510:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592588785975944L);
            case 511:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077685194975L);
            case 515:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592399807480296L);
            case 516:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395513823710L);
            case 517:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592472822055482L);
            case 518:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591923066044475L);
            case 519:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592112044605748L);
            case 520:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592112044671285L);
            case 521:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592112044736822L);
            case 523:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077685326048L);
            case 526:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592580196172420L);
            case 527:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592124929638722L);
            case 528:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592124929507648L);
            case 529:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592124929573185L);
            case 531:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592447052055084L);
            case 532:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078412247981L);
            case 533:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078412313518L);
            case 534:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078412379055L);
            case 535:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078412444592L);
            case 541:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971038130970L);
            case 542:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592008965455983L);
            default:
                return null;
        }
    }

    private Long A01(int i) {
        switch (i) {
            case 551:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077685391585L);
            case 552:
            case 553:
            case 554:
            case 555:
            case 556:
            case 557:
            case 562:
            case 566:
            case 567:
            case 569:
            case 580:
            case 583:
            case 584:
            case 586:
            case 587:
            case 589:
            case 592:
            case 598:
            case 601:
            case 603:
            case 605:
            case 608:
            case 610:
            case 619:
            case 620:
            case 622:
            case 623:
            case 625:
            case 626:
            case 634:
            case 635:
            case 636:
            case 639:
            case 640:
            case 647:
            case 649:
            case 657:
            case 658:
            case 659:
            case 660:
            case 662:
            case 663:
            case 664:
            case 665:
            case 666:
            case 667:
            case 668:
            case 669:
            case 671:
            case 672:
            case 673:
            case 676:
            case 677:
            case 683:
            case 689:
            case 690:
            case 691:
            case 692:
            case 694:
            case 700:
            case 713:
            case 719:
            case 721:
            case 722:
            case 723:
            case 724:
            case 727:
            case 728:
            case 729:
            case 730:
            case 731:
            case 732:
            case 733:
            case 734:
            case 735:
            case 736:
            case 737:
            case 738:
            case 739:
            case 740:
            case 741:
            case 743:
            case 771:
            case 776:
            case 777:
            case 798:
            case 800:
            case 812:
            case 814:
            default:
                return null;
            case 558:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591978900684880L);
            case 559:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592133519507785L);
            case 560:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592558721466985L);
            case 561:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786354471624L);
            case 563:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786354537161L);
            case 564:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591978900750417L);
            case 565:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591991785586790L);
            case 568:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077685719266L);
            case 570:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078412772277L);
            case 571:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078412837814L);
            case 572:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078412641203L);
            case 573:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078412510129L);
            case 574:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078412706740L);
            case 575:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592833599177435L);
            case 576:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786354668235L);
            case 577:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786354602698L);
            case 578:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592502886629971L);
            case 579:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591983195586643L);
            case 581:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039031013529L);
            case 582:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039031079066L);
            case 585:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592610260943500L);
            case 588:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592202238919013L);
            case 590:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077685981411L);
            case 591:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769174930097L);
            case 593:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786354733772L);
            case 594:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078412575666L);
            case 595:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078412903351L);
            case 596:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591777037156355L);
            case 597:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591777037221892L);
            case 599:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593082707346368L);
            case 600:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593087002182593L);
            case 602:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593095592117186L);
            case 604:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077686112484L);
            case 606:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593104182051780L);
            case 607:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592060505063634L);
            case 609:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592580196237957L);
            case 611:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769175257782L);
            case 612:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769174995634L);
            case 613:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769175061171L);
            case 614:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769175126708L);
            case 615:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769175192245L);
            case 616:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592030440620168L);
            case 617:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051917815991L);
            case 618:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051917750454L);
            case 621:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592060505129171L);
            case 624:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593151426692063L);
            case 627:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591978900881490L);
            case 628:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593194376365030L);
            case 629:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593194376430567L);
            case 630:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593194376496104L);
            case 631:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077686309093L);
            case 632:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592447052120621L);
            case 633:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769175388855L);
            case 637:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769175519929L);
            case 638:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769175454392L);
            case 641:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769175585466L);
            case 642:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769175651003L);
            case 643:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769175716540L);
            case 644:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769175782077L);
            case 645:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258800874489L);
            case 646:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258800940026L);
            case 648:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593245915972597L);
            case 650:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593263095841864L);
            case 651:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593267390809161L);
            case 652:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078412968888L);
            case 653:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593254505907192L);
            case 654:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593280275711051L);
            case 655:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593284570678348L);
            case 656:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593288865645645L);
            case 661:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592202238984550L);
            case 670:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031168852886L);
            case 674:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593310340482143L);
            case 675:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593310340547680L);
            case 678:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593318930416738L);
            case 679:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593318930482275L);
            case 680:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593318930547812L);
            case 681:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593318930613349L);
            case 682:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039031144603L);
            case 684:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593323225384039L);
            case 685:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593323225449576L);
            case 686:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593323225515113L);
            case 687:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593323225580650L);
            case 688:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593327520351348L);
            case 693:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336110351479L);
            case 695:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336110482552L);
            case 696:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336110548089L);
            case 697:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336110613626L);
            case 698:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336110679163L);
            case 699:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336110744700L);
            case 701:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336110875773L);
            case 702:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336110941310L);
            case 703:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111006847L);
            case 704:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111072384L);
            case 705:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111137921L);
            case 706:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111203458L);
            case 707:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111268995L);
            case 708:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111334532L);
            case 709:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111400069L);
            case 710:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111465606L);
            case 711:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111531143L);
            case 712:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111596680L);
            case 714:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593177196495840L);
            case 715:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593288865776718L);
            case 716:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593370470024409L);
            case 717:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374765057245L);
            case 718:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374764991708L);
            case 720:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593396239893755L);
            case 725:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111727753L);
            case 726:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111793290L);
            case 742:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077686571238L);
            case 744:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592176470491482L);
            case 745:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593426304599292L);
            case 746:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439189697846L);
            case 747:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439189763383L);
            case 748:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439189828920L);
            case 749:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439189894457L);
            case 750:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439189959994L);
            case 751:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439190025531L);
            case 752:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439190091068L);
            case 753:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439190156605L);
            case 754:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439190222142L);
            case 755:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439189501235L);
            case 756:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439189566772L);
            case 757:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439189632309L);
            case 758:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593237326169075L);
            case 759:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592893728785132L);
            case 760:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593288865842255L);
            case 761:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258801005563L);
            case 762:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111858827L);
            case 763:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111924364L);
            case 764:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336111989901L);
            case 765:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507908978007L);
            case 766:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593516498978157L);
            case 767:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593525088847214L);
            case 768:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593525088912751L);
            case 769:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593525088978288L);
            case 770:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593486434207050L);
            case 772:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593288865973328L);
            case 773:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031169311639L);
            case 774:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336112120975L);
            case 775:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336112055438L);
            case 778:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593237326234612L);
            case 779:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430600287494L);
            case 780:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430600156420L);
            case 781:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430600353031L);
            case 782:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430600418568L);
            case 783:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430600484105L);
            case 784:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430599566589L);
            case 785:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430599632126L);
            case 786:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430599697663L);
            case 787:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430599763200L);
            case 788:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430599828737L);
            case 789:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430599894274L);
            case 790:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430599959811L);
            case 791:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430600221957L);
            case 792:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592537246761563L);
            case 793:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971038196507L);
            case 794:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971038262044L);
            case 795:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971038327581L);
            case 796:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971038393118L);
            case 797:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593486434272587L);
            case 799:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593542268781938L);
            case 801:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258801398783L);
            case 802:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258801464320L);
            case 803:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258801267710L);
            case 804:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258801071100L);
            case 805:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258801136637L);
            case 806:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593576628454781L);
            case 807:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593104182117317L);
            case 808:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623873160595L);
            case 809:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623873226132L);
            case 810:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623873095058L);
            case 811:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593632463029700L);
            case 813:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975336964928L);
            case 815:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593550858716532L);
            case 816:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593550858847605L);
            case 817:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593550858913142L);
            case 818:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593550858650995L);
            case 819:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862937354268L);
            case 820:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862937419805L);
            case 821:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862937485342L);
            case 822:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862937157659L);
            case 823:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862936633367L);
            case 824:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862936698904L);
            case 825:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862936764441L);
        }
    }

    private Long A02(int i) {
        switch (i) {
            case 826:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862937616415L);
            case 827:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769176044222L);
            case 828:
            case 832:
            case 835:
            case 836:
            case 837:
            case 840:
            case 841:
            case 842:
            case 843:
            case 855:
            case 856:
            case 857:
            case 861:
            case 864:
            case 870:
            case 877:
            case 879:
            case 880:
            case 881:
            case 882:
            case 884:
            case 886:
            case 887:
            case 889:
            case 890:
            case 892:
            case 893:
            case 894:
            case 895:
            case 896:
            case 897:
            case 898:
            case 899:
            case 900:
            case 901:
            case 902:
            case 912:
            case 913:
            case 914:
            case 915:
            case 916:
            case 927:
            case 928:
            case 931:
            case 932:
            case 933:
            case 937:
            case 945:
            case 949:
            case 950:
            case 953:
            case 955:
            case 956:
            case 961:
            case 965:
            case 966:
            case 967:
            case 969:
            case 970:
            case 980:
            case 982:
            case 986:
            case 993:
            case 994:
            case 995:
            case 997:
            case 1002:
            case 1003:
            case 1004:
            case 1005:
            case 1006:
            case 1007:
            case 1008:
            case 1009:
            case 1010:
            case 1011:
            case 1012:
            case 1013:
            case 1014:
            case 1015:
            case 1016:
            case 1017:
            case 1018:
            case 1019:
            case 1020:
            case 1021:
            case 1022:
            case 1023:
            case 1028:
            case 1030:
            case 1031:
            case 1043:
            case 1044:
            case 1045:
            case 1046:
            case 1047:
            case 1056:
            case 1057:
            case 1058:
            case 1063:
            case 1071:
            case 1074:
            case 1075:
            case 1076:
            case 1077:
            case 1081:
            case 1082:
            case 1083:
            case 1084:
            case 1085:
            case 1086:
            case 1087:
            case 1090:
            case 1091:
            case 1093:
            default:
                return null;
            case 829:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593619578127761L);
            case 830:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786354864846L);
            case 831:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786354799309L);
            case 833:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786355061455L);
            case 834:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786355126992L);
            case 838:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593593808323978L);
            case 839:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593593808455051L);
            case 844:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593636758193608L);
            case 845:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593636758062534L);
            case 846:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593636758128071L);
            case 847:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593636757996997L);
            case 848:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336112252048L);
            case 849:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593636758259145L);
            case 850:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336112317585L);
            case 851:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336112383122L);
            case 852:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031169377176L);
            case 853:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593653937866192L);
            case 854:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593653937997265L);
            case 858:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623873291669L);
            case 859:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623873422742L);
            case 860:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971038524191L);
            case 862:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987490816086L);
            case 863:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987490947159L);
            case 865:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593705477473756L);
            case 866:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593735542244834L);
            case 867:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593735542375907L);
            case 868:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395513889247L);
            case 869:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593739837277668L);
            case 871:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077686898919L);
            case 872:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107750097182L);
            case 873:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593748427146731L);
            case 874:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593752722114028L);
            case 875:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593752722179565L);
            case 876:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593752722245102L);
            case 878:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593765607081459L);
            case 883:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593774196950519L);
            case 885:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971038655264L);
            case 888:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107750293791L);
            case 891:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592043325259939L);
            case 903:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593765607278068L);
            case 904:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593774197016056L);
            case 905:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593842916427273L);
            case 906:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258801529857L);
            case 907:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258801595394L);
            case 908:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258801660931L);
            case 909:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593834326492677L);
            case 910:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593834326558214L);
            case 911:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593804261721601L);
            case 917:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593791376885243L);
            case 918:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439190484287L);
            case 919:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592060505260245L);
            case 920:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592060505325782L);
            case 921:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592060505391319L);
            case 922:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592060505522392L);
            case 923:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592060505194708L);
            case 924:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395513954784L);
            case 925:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593872981198351L);
            case 926:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051918274744L);
            case 929:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593881571132944L);
            case 930:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593881571198481L);
            case 934:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593890161067541L);
            case 935:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593890161133078L);
            case 936:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593095592182723L);
            case 938:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594122089301591L);
            case 939:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594109204399688L);
            case 940:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593752722441712L);
            case 941:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593752722376175L);
            case 942:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971038720801L);
            case 943:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593765607343605L);
            case 944:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593847211394573L);
            case 946:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336112448659L);
            case 947:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594152154072667L);
            case 948:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594152154138204L);
            case 951:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051918536889L);
            case 952:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594147859105370L);
            case 954:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336112645270L);
            case 957:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430600680714L);
            case 958:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430600746251L);
            case 959:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430600811788L);
            case 960:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594177923876490L);
            case 962:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336112514196L);
            case 963:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336112579733L);
            case 964:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591777037418501L);
            case 968:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156449302109L);
            case 971:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039031210140L);
            case 972:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962448458499L);
            case 973:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962448196352L);
            case 974:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962448261889L);
            case 975:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962448327426L);
            case 976:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962448589573L);
            case 977:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962448524036L);
            case 978:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216578582167L);
            case 979:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592060505587929L);
            case 981:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593486434403660L);
            case 983:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442757677559L);
            case 984:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593194376627177L);
            case 985:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077687554280L);
            case 987:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430601270544L);
            case 988:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430601336081L);
            case 989:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430601008397L);
            case 990:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430601139470L);
            case 991:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430601205007L);
            case 992:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051918602426L);
            case 996:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077687816425L);
            case 998:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258801726468L);
            case 999:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107750490400L);
            case 1000:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594250938386088L);
            case 1001:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594250938320551L);
            case 1024:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031169704858L);
            case 1025:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031169639321L);
            case 1026:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971038786338L);
            case 1027:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430601467154L);
            case 1029:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594298182960812L);
            case 1032:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594311067862703L);
            case 1033:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962449113868L);
            case 1034:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962448786183L);
            case 1035:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962448851720L);
            case 1036:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962448917257L);
            case 1037:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962448982794L);
            case 1038:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962449048331L);
            case 1039:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962448720646L);
            case 1040:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594319657797296L);
            case 1041:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594319657928369L);
            case 1042:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077688013034L);
            case 1048:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862936829978L);
            case 1049:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594190808843917L);
            case 1050:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594190808909454L);
            case 1051:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594190808974991L);
            case 1052:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594190808778380L);
            case 1053:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592726225257117L);
            case 1054:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593104182182854L);
            case 1055:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594272413157034L);
            case 1059:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594358312568519L);
            case 1060:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442757743096L);
            case 1061:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077688144107L);
            case 1062:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975337030465L);
            case 1064:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594371197404874L);
            case 1065:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594371197470411L);
            case 1066:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592124930097475L);
            case 1067:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592124930163012L);
            case 1068:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592124930228549L);
            case 1069:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592124930294086L);
            case 1070:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592124930359623L);
            case 1072:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594302477993645L);
            case 1073:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594302478059182L);
            case 1078:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594358312699592L);
            case 1079:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594358312765129L);
            case 1080:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592756289897132L);
            case 1088:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594409852569303L);
            case 1089:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594409852110547L);
            case 1092:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594409852307156L);
            case 1094:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594409852438229L);
            case 1095:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594409852503766L);
            case 1096:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593323225711723L);
            case 1097:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593323225777260L);
            case 1098:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430601598227L);
        }
    }

    private Long A03(int i) {
        switch (i) {
            case 3304:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703365696101L);
            case 3305:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703365761638L);
            case 3306:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703365958249L);
            case 3307:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703365827175L);
            case 3308:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703365892712L);
            case 3309:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623876699572L);
            case 3310:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623876765109L);
            case 3311:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600762108743669L);
            case 3312:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600762108809206L);
            case 3313:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600762108940279L);
            case 3314:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598541610781931L);
            case 3315:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598541610716394L);
            case 3316:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336119002318L);
            case 3317:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157904783721L);
            case 3318:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600783583580158L);
            case 3319:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600779288612860L);
            case 3320:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600233828486983L);
            case 3321:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600233828355909L);
            case 3322:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600233828421446L);
            case 3323:
            case 3326:
            case 3327:
            case 3330:
            case 3332:
            case 3363:
            case 3365:
            case 3377:
            case 3379:
            case 3383:
            case 3404:
            case 3405:
            case 3423:
            case 3440:
            case 3441:
            case 3443:
            case 3445:
            case 3447:
            case 3461:
            case 3463:
            case 3465:
            case 3466:
            case 3467:
            case 3468:
            case 3482:
            case 3486:
            case 3489:
            case 3492:
            case 3493:
            case 3495:
            case 3498:
            case 3513:
            case 3520:
            case 3527:
            case 3534:
            case 3538:
            case 3545:
            case 3547:
            case 3549:
            case 3554:
            case 3555:
            case 3556:
            case 3557:
            case 3562:
            case 3563:
            case 3565:
            default:
                return null;
            case 3324:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374766499052L);
            case 3325:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374766564589L);
            case 3328:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738454780870L);
            case 3329:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600457166065552L);
            case 3331:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600457166262161L);
            case 3333:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594409853355741L);
            case 3334:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738454977479L);
            case 3335:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442761347598L);
            case 3336:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336119133391L);
            case 3337:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987491602526L);
            case 3338:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051919716551L);
            case 3339:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051919323329L);
            case 3340:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051919388866L);
            case 3341:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051919454403L);
            case 3342:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051919519940L);
            case 3343:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051919585477L);
            case 3344:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051919651014L);
            case 3345:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336119198928L);
            case 3346:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029742762L);
            case 3347:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029349541L);
            case 3348:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029415078L);
            case 3349:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432785377757L);
            case 3350:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432785443294L);
            case 3351:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029087393L);
            case 3352:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029152930L);
            case 3353:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029218467L);
            case 3354:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029284004L);
            case 3355:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029480615L);
            case 3356:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029611688L);
            case 3357:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029677225L);
            case 3358:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593194377217005L);
            case 3359:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442761478671L);
            case 3360:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336118871244L);
            case 3361:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336118936781L);
            case 3362:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336118805707L);
            case 3364:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593598104798606L);
            case 3366:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593245916890103L);
            case 3367:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596527271447076L);
            case 3368:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596527271381539L);
            case 3369:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596527271512613L);
            case 3370:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442761544208L);
            case 3371:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432785508831L);
            case 3372:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432785574368L);
            case 3373:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862280272557L);
            case 3374:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862280338094L);
            case 3375:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862280403631L);
            case 3376:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455043016L);
            case 3378:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703366154858L);
            case 3380:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987491668063L);
            case 3381:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600976857108560L);
            case 3382:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600976857174097L);
            case 3384:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253188670L);
            case 3385:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253254207L);
            case 3386:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253319744L);
            case 3387:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253385281L);
            case 3388:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253450818L);
            case 3389:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253516355L);
            case 3390:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253581892L);
            case 3391:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253647429L);
            case 3392:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253712966L);
            case 3393:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253778503L);
            case 3394:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253844040L);
            case 3395:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895252729911L);
            case 3396:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895252795448L);
            case 3397:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895252860985L);
            case 3398:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895252926522L);
            case 3399:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895252992059L);
            case 3400:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253057596L);
            case 3401:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253123133L);
            case 3402:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597863005883444L);
            case 3403:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786355651285L);
            case 3406:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258805855273L);
            case 3407:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258805920810L);
            case 3408:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601019806912610L);
            case 3409:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601019807109220L);
            case 3410:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601019807043683L);
            case 3411:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601019806781536L);
            case 3412:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601019806847073L);
            case 3413:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599628237442673L);
            case 3414:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258805986347L);
            case 3415:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597519408499550L);
            case 3416:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820058766354L);
            case 3417:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258806051884L);
            case 3418:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600959677501518L);
            case 3419:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600959677435981L);
            case 3420:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600959677370444L);
            case 3421:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600959677567055L);
            case 3422:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601019807174757L);
            case 3424:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593598104864143L);
            case 3425:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601092821225590L);
            case 3426:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186585485088L);
            case 3427:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596527271578150L);
            case 3428:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592575901926014L);
            case 3429:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592558721663595L);
            case 3430:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258806117421L);
            case 3431:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596870868503220L);
            case 3432:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430607824178L);
            case 3433:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593310340744289L);
            case 3434:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600813648351240L);
            case 3435:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235942427408L);
            case 3436:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235942492945L);
            case 3437:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235942558482L);
            case 3438:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598515841109223L);
            case 3439:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600762109071352L);
            case 3442:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374767088878L);
            case 3444:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595556608772276L);
            case 3446:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057734696669L);
            case 3448:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057734762206L);
            case 3449:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049146203852L);
            case 3450:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049146269389L);
            case 3451:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049146334926L);
            case 3452:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049146400463L);
            case 3453:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601127181226112L);
            case 3454:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601127180963964L);
            case 3455:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601127181029501L);
            case 3456:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601127181095038L);
            case 3457:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601127181160575L);
            case 3458:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594903774332903L);
            case 3459:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594903774398440L);
            case 3460:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186585812769L);
            case 3462:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442761609745L);
            case 3464:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336119330001L);
            case 3469:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442761740819L);
            case 3470:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442761806356L);
            case 3471:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442761871893L);
            case 3472:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442761937430L);
            case 3473:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442761675282L);
            case 3474:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601268914884750L);
            case 3475:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442762002967L);
            case 3476:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820058831891L);
            case 3477:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820058897428L);
            case 3478:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601354814296227L);
            case 3479:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601354814230690L);
            case 3480:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601354814361764L);
            case 3481:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442762068504L);
            case 3483:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601367699263660L);
            case 3484:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601367699329197L);
            case 3485:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601367699394734L);
            case 3487:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601367699525807L);
            case 3488:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601367699591344L);
            case 3490:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592575901991551L);
            case 3491:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600508705804193L);
            case 3494:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593288867087445L);
            case 3496:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601371994099889L);
            case 3497:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601440713576660L);
            case 3499:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601371994165426L);
            case 3500:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601341929328798L);
            case 3501:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601341929394335L);
            case 3502:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601341929459872L);
            case 3503:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601462188413151L);
            case 3504:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601462188478688L);
            case 3505:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601462188544225L);
            case 3506:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432785902051L);
            case 3507:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432785967588L);
            case 3508:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432785705441L);
            case 3509:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432785770978L);
            case 3510:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601492253184228L);
            case 3511:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601470778413282L);
            case 3512:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595105637271579L);
            case 3514:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601530907889910L);
            case 3515:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608217628935L);
            case 3516:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608217694472L);
            case 3517:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601019807436902L);
            case 3518:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608217497861L);
            case 3519:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608217563398L);
            case 3521:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049146466000L);
            case 3522:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049146531537L);
            case 3523:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057734893279L);
            case 3524:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593288867152982L);
            case 3525:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601629692137786L);
            case 3526:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595646802757856L);
            case 3528:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600895253975113L);
            case 3529:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061302414742L);
            case 3530:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601685526712639L);
            case 3531:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601685526778176L);
            case 3532:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601685526843713L);
            case 3533:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601685526909250L);
            case 3535:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061302349205L);
            case 3536:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599417784438302L);
            case 3537:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599860166069915L);
            case 3539:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439191467331L);
            case 3540:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601389173969080L);
            case 3541:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601389174034617L);
            case 3542:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601389174100154L);
            case 3543:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601389174165691L);
            case 3544:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601389174231228L);
            case 3546:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107752325425L);
            case 3548:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820059028501L);
            case 3550:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597588128041836L);
            case 3551:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051919782088L);
            case 3552:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592043325325476L);
            case 3553:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336119395538L);
            case 3558:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601840145535349L);
            case 3559:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593598104929680L);
            case 3560:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442762265113L);
            case 3561:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596733429811826L);
            case 3564:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592893728916205L);
            case 3566:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601685526974787L);
            case 3567:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432786033125L);
            case 3568:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596733429746289L);
            case 3569:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051919847625L);
            case 3570:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051919913162L);
            case 3571:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820059094038L);
            case 3572:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820059159575L);
            case 3573:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926044881293L);
            case 3574:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926045208976L);
            case 3575:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926045274513L);
            case 3576:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926045077902L);
            case 3577:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926045143439L);
            case 3578:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601947519717788L);
        }
    }

    private Long A04(int i) {
        switch (i) {
            case 3581:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616807301402L);
            case 3582:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616807366939L);
            case 3583:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061302480279L);
            case 3584:
            case 3585:
            case 3586:
            case 3587:
            case 3629:
            case 3637:
            case 3645:
            case 3646:
            case 3651:
            case 3662:
            case 3673:
            case 3684:
            case 3687:
            case 3690:
            case 3725:
            case 3726:
            case 3727:
            case 3728:
            case 3729:
            case 3730:
            case 3731:
            case 3732:
            case 3733:
            case 3734:
            case 3735:
            case 3736:
            case 3737:
            case 3768:
            case 3769:
            case 3770:
            case 3799:
            case 3805:
            case 3820:
            case 3821:
            case 3835:
            case 3846:
            default:
                return null;
            case 3588:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597863005948981L);
            case 3589:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016239587783L);
            case 3590:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016239653320L);
            case 3591:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016239718857L);
            case 3592:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016239784394L);
            case 3593:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016239849931L);
            case 3594:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016239915468L);
            case 3595:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016239981005L);
            case 3596:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240046542L);
            case 3597:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240112079L);
            case 3598:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240177616L);
            case 3599:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240243153L);
            case ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS /* 3600 */:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016239194561L);
            case 3601:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016239260098L);
            case 3602:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016239325635L);
            case 3603:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016239391172L);
            case 3604:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016239456709L);
            case 3605:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016239522246L);
            case 3606:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029808299L);
            case 3607:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029873836L);
            case 3608:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602033419063852L);
            case 3609:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616807432476L);
            case 3610:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442762330650L);
            case 3611:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597450690005835L);
            case 3612:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024829850085L);
            case 3613:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024829915622L);
            case 3614:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830112233L);
            case 3615:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830177770L);
            case 3616:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830243307L);
            case 3617:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024829653474L);
            case 3618:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024829719011L);
            case 3619:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029124751880L);
            case 3620:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029124817417L);
            case 3621:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029124882954L);
            case 3622:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029124948491L);
            case 3623:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125014028L);
            case 3624:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125079565L);
            case 3625:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125145102L);
            case 3626:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125210639L);
            case 3627:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029124620806L);
            case 3628:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029124686343L);
            case 3630:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024829981159L);
            case 3631:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830046696L);
            case 3632:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024829784548L);
            case 3633:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600117863976695L);
            case 3634:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608217825546L);
            case 3635:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608217760009L);
            case 3636:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608217891083L);
            case 3638:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830374381L);
            case 3639:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125276176L);
            case 3640:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125341713L);
            case 3641:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830308844L);
            case 3642:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616807498013L);
            case 3643:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598296797646002L);
            case 3644:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598296797711539L);
            case 3647:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616807563550L);
            case 3648:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616807629087L);
            case 3649:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593194377282542L);
            case 3650:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592043325391013L);
            case 3652:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594873710217175L);
            case 3653:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432786098662L);
            case 3654:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432786164199L);
            case 3655:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601685527040324L);
            case 3656:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601685527105861L);
            case 3657:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601685527171398L);
            case 3658:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601685527236935L);
            case 3659:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592043325456550L);
            case 3660:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593791377147390L);
            case 3661:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602540225270457L);
            case 3663:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601092821422199L);
            case 3664:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439191598405L);
            case 3665:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439191532868L);
            case 3666:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531635860133L);
            case 3667:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531635925670L);
            case 3668:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531635991207L);
            case 3669:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057735155427L);
            case 3670:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057735220964L);
            case 3671:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057735286501L);
            case 3672:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057735352038L);
            case 3674:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057734958816L);
            case 3675:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057735024353L);
            case 3676:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057735089890L);
            case 3677:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608217956620L);
            case 3678:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600976857370706L);
            case 3679:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057735483111L);
            case 3680:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531635270302L);
            case 3681:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531635335839L);
            case 3682:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531635401376L);
            case 3683:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531635466913L);
            case 3685:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531635597986L);
            case 3686:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531635663523L);
            case 3688:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531635794596L);
            case 3689:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593288867218519L);
            case 3691:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439864893L);
            case 3692:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595646802823393L);
            case 3693:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623877027256L);
            case 3694:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623876896182L);
            case 3695:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623876961719L);
            case 3696:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592043325587624L);
            case 3697:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926045405587L);
            case 3698:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926045471124L);
            case 3699:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926045340050L);
            case 3700:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820059225112L);
            case 3701:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616807891232L);
            case 3702:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820059290649L);
            case 3703:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336120116435L);
            case 3704:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432786622954L);
            case 3705:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432786819563L);
            case 3706:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432786885100L);
            case 3707:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432786360808L);
            case 3708:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432786557417L);
            case 3709:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592043325522087L);
            case 3710:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125407250L);
            case 3711:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125472787L);
            case 3712:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125538324L);
            case 3713:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125603861L);
            case 3714:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125669398L);
            case 3715:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125734935L);
            case 3716:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830439918L);
            case 3717:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830505455L);
            case 3718:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830570992L);
            case 3719:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830636529L);
            case 3720:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830702066L);
            case 3721:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830767603L);
            case 3722:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616807956769L);
            case 3723:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595625328380125L);
            case 3724:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432786950637L);
            case 3738:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602574584943295L);
            case 3739:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817882523584L);
            case 3740:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817882589121L);
            case 3741:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817882654658L);
            case 3742:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817882720195L);
            case 3743:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817882785732L);
            case 3744:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817882458047L);
            case 3745:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601260325212300L);
            case 3746:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031171277727L);
            case 3747:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602587469845194L);
            case 3748:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593370470155483L);
            case 3749:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455108553L);
            case 3750:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455174090L);
            case 3751:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455239627L);
            case 3752:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601947519848861L);
            case 3753:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600762109202425L);
            case 3754:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081985339660L);
            case 3755:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602630419518161L);
            case 3756:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987491930208L);
            case 3757:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602596059779788L);
            case 3758:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442762396187L);
            case 3759:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602690549191416L);
            case 3760:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602690549256953L);
            case 3761:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602690549322490L);
            case 3762:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602690549125879L);
            case 3763:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258806182958L);
            case 3764:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602699138994939L);
            case 3765:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602699139060476L);
            case 3766:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602699139191549L);
            case 3767:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987491995745L);
            case 3771:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862938468392L);
            case 3772:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862938533929L);
            case 3773:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862938271781L);
            case 3774:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862938337318L);
            case 3775:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862938402855L);
            case 3776:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616808022306L);
            case 3777:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746383700751L);
            case 3778:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746383766288L);
            case 3779:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746383831825L);
            case 3780:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746383897362L);
            case 3781:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746383962899L);
            case 3782:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384028436L);
            case 3783:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384093973L);
            case 3784:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384159510L);
            case 3785:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384225047L);
            case 3786:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384290584L);
            case 3787:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384356121L);
            case 3788:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384421658L);
            case 3789:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384487195L);
            case 3790:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384552732L);
            case 3791:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384618269L);
            case 3792:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384683806L);
            case 3793:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384749343L);
            case 3794:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830833140L);
            case 3795:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125800472L);
            case 3796:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384814880L);
            case 3797:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746383635214L);
            case 3798:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987492061282L);
            case 3800:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602763563569980L);
            case 3801:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602763563635517L);
            case 3802:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602763563504443L);
            case 3803:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602810808537929L);
            case 3804:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602810808603466L);
            case 3806:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650440052692L);
            case 3807:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650440118229L);
            case 3808:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650439987155L);
            case 3809:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602763563701054L);
            case 3810:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600976857436243L);
            case 3811:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600976857501780L);
            case 3812:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602840872915795L);
            case 3813:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602840872981332L);
            case 3814:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602840873046869L);
            case 3815:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602879527621469L);
            case 3816:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602879527687006L);
            case 3817:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602879527752543L);
            case 3818:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602879527818080L);
            case 3819:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602879527883617L);
            case 3822:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602892412588898L);
            case 3823:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602896707490659L);
            case 3824:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240308690L);
            case 3825:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258806248495L);
            case 3826:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240439764L);
            case 3827:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240505301L);
            case 3828:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240570838L);
            case 3829:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240374227L);
            case 3830:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608218415373L);
            case 3831:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608218480910L);
            case 3832:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186586140450L);
            case 3833:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602986901803889L);
            case 3834:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608218546447L);
            case 3836:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258806314032L);
            case 3837:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820059356186L);
            case 3838:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456440061504L);
            case 3839:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456440127041L);
            case 3840:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439930430L);
            case 3841:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439995967L);
            case 3842:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596733429877363L);
            case 3843:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595341860407425L);
            case 3844:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817882851269L);
            case 3845:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603115750822791L);
            case 3847:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987492126819L);
            case 3848:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186586205987L);
            case 3849:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186586271524L);
            case 3850:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603132930691978L);
            case 3851:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061302611352L);
            case 3852:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603077096379267L);
            case 3853:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603077096182658L);
        }
    }

    private Long A05(int i) {
        switch (i) {
            case 3855:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051920502990L);
            case 3856:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051920306379L);
            case 3857:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051920371916L);
            case 3858:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051920437453L);
            case 3859:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830898677L);
            case 3860:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024830964214L);
            case 3861:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125866009L);
            case 3862:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029125931546L);
            case 3863:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384880417L);
            case 3864:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746384945954L);
            case 3865:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593881571395091L);
            case 3866:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616808087843L);
            case 3867:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603205945136030L);
            case 3868:
            case 3879:
            case 3886:
            case 3897:
            case 3898:
            case 3901:
            case 3903:
            case 3915:
            case 3923:
            case 3925:
            case 3930:
            case 3946:
            case 3968:
            case 3970:
            case 3974:
            case 3975:
            case 3990:
            case 3996:
            case CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS /* 4000 */:
            case 4013:
            case 4027:
            case 4028:
            case 4031:
            case 4052:
            case 4055:
            case 4060:
            case 4066:
            case 4067:
            case 4072:
            case 4074:
            case 4075:
            case 4076:
            case 4077:
            case 4079:
            case 4082:
            case 4090:
            case 4093:
            case 4096:
            case 4098:
            case 4099:
            case 4100:
            case 4111:
            case 4115:
            case 4116:
            default:
                return null;
            case 3869:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480028183057L);
            case 3870:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480028248594L);
            case 3871:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480028117520L);
            case 3872:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374767154415L);
            case 3873:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597450690071372L);
            case 3874:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603253189776297L);
            case 3875:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603253189841834L);
            case 3876:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616808218916L);
            case 3877:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599538043457117L);
            case 3878:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616808284453L);
            case 3880:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602578880238273L);
            case 3881:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602578880172736L);
            case 3882:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820059421723L);
            case 3883:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820059487260L);
            case 3884:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288935681525L);
            case 3885:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288935747062L);
            case 3887:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602578880500419L);
            case 3888:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602578880565956L);
            case 3889:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602578880631493L);
            case 3890:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442762461724L);
            case 3891:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442762527261L);
            case 3892:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616808349990L);
            case 3893:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432787081710L);
            case 3894:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258806576177L);
            case 3895:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258806641714L);
            case 3896:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987492192356L);
            case 3899:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602578880434882L);
            case 3900:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593765607802358L);
            case 3902:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258806707251L);
            case 3904:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600976857567317L);
            case 3905:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603446463435705L);
            case 3906:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603446463501242L);
            case 3907:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603446463566779L);
            case 3908:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603446463304631L);
            case 3909:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603446463370168L);
            case 3910:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603424988468146L);
            case 3911:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603424988533683L);
            case 3912:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603424988599220L);
            case 3913:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603424988664757L);
            case 3914:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603424988730294L);
            case 3916:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608218808592L);
            case 3917:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862280469168L);
            case 3918:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862280534705L);
            case 3919:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593001103098759L);
            case 3920:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240636375L);
            case 3921:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049146597074L);
            case 3922:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601019807502439L);
            case 3924:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602630419714770L);
            case 3926:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602578880828102L);
            case 3927:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603334794154923L);
            case 3928:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600813649006607L);
            case 3929:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600813648941070L);
            case 3931:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600813648809996L);
            case 3932:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600813648416777L);
            case 3933:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600813648875533L);
            case 3934:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600813648547850L);
            case 3935:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600813648613387L);
            case 3936:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603132930757515L);
            case 3937:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603132930823052L);
            case 3938:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603132930888589L);
            case 3939:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598047689739359L);
            case 3940:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862938599466L);
            case 3941:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862938730539L);
            case 3942:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029939373L);
            case 3943:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271030004910L);
            case 3944:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603132930954126L);
            case 3945:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616808415527L);
            case 3947:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594779219625818L);
            case 3948:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029126390302L);
            case 3949:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029126455839L);
            case 3950:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746385208099L);
            case 3951:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746385273636L);
            case 3952:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746385339173L);
            case 3953:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746385404710L);
            case 3954:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746385470247L);
            case 3955:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024831226359L);
            case 3956:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024831291896L);
            case 3957:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024831357433L);
            case 3958:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024831422970L);
            case 3959:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024831488507L);
            case 3960:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029126193691L);
            case 3961:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029126259228L);
            case 3962:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029126324765L);
            case 3963:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616808481064L);
            case 3964:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432787147247L);
            case 3965:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603571017356241L);
            case 3966:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792105183076L);
            case 3967:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531636056744L);
            case 3969:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603528067683273L);
            case 3971:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024831619580L);
            case 3972:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029126586912L);
            case 3973:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746385601320L);
            case 3976:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926045602198L);
            case 3977:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926045667735L);
            case 3978:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926045733272L);
            case 3979:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926045798809L);
            case 3980:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926045864346L);
            case 3981:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601926045536661L);
            case 3982:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288935878135L);
            case 3983:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288935943672L);
            case 3984:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288936009209L);
            case 3985:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507910157664L);
            case 3986:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029126783522L);
            case 3987:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746385666857L);
            case 3988:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746385797930L);
            case 3989:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029126652449L);
            case 3991:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351179360679L);
            case 3992:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235942624019L);
            case 3993:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456440192578L);
            case 3994:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240701912L);
            case 3995:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600233828552520L);
            case 3997:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650440249302L);
            case 3998:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240767449L);
            case 3999:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603768585851872L);
            case 4001:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603506592846783L);
            case 4002:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598047689804896L);
            case 4003:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603802945786857L);
            case 4004:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603802945852394L);
            case 4005:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603802945917931L);
            case 4006:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603802945983468L);
            case 4007:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603802946049005L);
            case 4008:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603802946114542L);
            case 4009:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603802946180079L);
            case 4010:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603802946245616L);
            case 4011:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603802945655783L);
            case 4012:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603802945721320L);
            case 4014:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432787212784L);
            case 4015:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024831750653L);
            case 4016:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029126914595L);
            case 4017:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746385929003L);
            case 4018:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598704819539219L);
            case 4019:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024832012799L);
            case 4020:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029126980132L);
            case 4021:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029127176741L);
            case 4022:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746385994540L);
            case 4023:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746386256685L);
            case 4024:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024831816190L);
            case 4025:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061302742425L);
            case 4026:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061302807962L);
            case 4029:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602763563766591L);
            case 4030:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36603115750888328L);
            case 4032:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602578881024711L);
            case 4033:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746386387758L);
            case 4034:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024832143872L);
            case 4035:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029127307814L);
            case 4036:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971040162603L);
            case 4037:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507910288737L);
            case 4038:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029127373351L);
            case 4039:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746386453295L);
            case 4040:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024832274946L);
            case 4041:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029127438888L);
            case 4042:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746386518832L);
            case 4043:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024832209409L);
            case 4044:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597863006014518L);
            case 4045:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597863006080055L);
            case 4046:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240832986L);
            case 4047:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240898523L);
            case 4048:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016240964060L);
            case 4049:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016241029597L);
            case 4050:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602578881090248L);
            case 4051:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604034873955342L);
            case 4053:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593834326885896L);
            case 4054:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593791377212927L);
            case 4056:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623877092793L);
            case 4057:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442762658334L);
            case 4058:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016241160670L);
            case 4059:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604095003366432L);
            case 4061:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604107888268321L);
            case 4062:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597798581504999L);
            case 4063:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600779288678397L);
            case 4064:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604150837941289L);
            case 4065:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600783583645695L);
            case 4068:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597588128107373L);
            case 4069:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593318930678886L);
            case 4070:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507910354274L);
            case 4071:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594113500612180L);
            case 4073:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602763563897664L);
            case 4078:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604361291338811L);
            case 4080:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604382766175300L);
            case 4081:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600508706066338L);
            case 4083:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336121230549L);
            case 4084:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336121165012L);
            case 4085:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258806838324L);
            case 4086:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258806903861L);
            case 4087:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592893729309422L);
            case 4088:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608219201812L);
            case 4089:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608218874129L);
            case 4091:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608219005202L);
            case 4092:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608219070739L);
            case 4094:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604318341665847L);
            case 4095:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374767219952L);
            case 4097:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616808677673L);
            case 4101:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650440511447L);
            case 4102:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650440904665L);
            case 4103:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650440839128L);
            case 4104:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604563154801745L);
            case 4105:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604623284409447L);
            case 4106:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604623284474984L);
            case 4107:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604623284343910L);
            case 4108:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792105510757L);
            case 4109:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792105576294L);
            case 4110:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820059749405L);
            case 4112:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604687708918893L);
            case 4113:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336121296086L);
            case 4114:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597798581570536L);
            case 4117:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604700593755250L);
            case 4118:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616808743210L);
            case 4119:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604365586306108L);
            case 4120:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599769971363455L);
            case 4121:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600976857632854L);
            case 4122:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600976857698391L);
            case 4123:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288936336890L);
            case 4124:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650441035738L);
            case 4125:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792105641831L);
            case 4126:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746386584369L);
            case 4127:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024832340483L);
            case 4128:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029127504425L);
            case 4129:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530840279212L);
            case 4130:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604855212643464L);
        }
    }

    private Long A06(int i) {
        switch (i) {
            case 4131:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604855212709001L);
            case 4132:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604855212577927L);
            case 4133:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604979766629567L);
            case 4134:
            case 4143:
            case 4154:
            case 4155:
            case 4156:
            case 4158:
            case 4175:
            case 4176:
            case 4178:
            case 4179:
            case 4196:
            case 4197:
            case 4200:
            case 4201:
            case 4203:
            case 4204:
            case 4213:
            case 4215:
            case 4223:
            case 4229:
            case 4231:
            case 4250:
            case 4252:
            case 4257:
            case 4259:
            case 4267:
            case 4272:
            case 4278:
            case 4303:
            case 4304:
            case 4305:
            case 4306:
            case 4307:
            case 4308:
            case 4340:
            case 4345:
            case 4354:
            case 4371:
            case 4398:
            default:
                return null;
            case 4135:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455305164L);
            case 4136:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455370701L);
            case 4137:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455436238L);
            case 4138:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107752390962L);
            case 4139:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455501775L);
            case 4140:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455567312L);
            case 4141:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455632849L);
            case 4142:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455698386L);
            case 4144:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455763923L);
            case 4145:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455829460L);
            case 4146:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455894997L);
            case 4147:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604709183689843L);
            case 4148:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604709183755380L);
            case 4149:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395514413541L);
            case 4150:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595612443609301L);
            case 4151:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595612443674838L);
            case 4152:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595612443740375L);
            case 4153:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595612443543764L);
            case 4157:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592374038397384L);
            case 4159:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987492257893L);
            case 4160:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604807967937661L);
            case 4161:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650441166811L);
            case 4162:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592898023817968L);
            case 4163:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592374038462921L);
            case 4164:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233170093291L);
            case 4165:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233170158828L);
            case 4166:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233170224365L);
            case 4167:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233169700069L);
            case 4168:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233169765606L);
            case 4169:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233169831143L);
            case 4170:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233169896680L);
            case 4171:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233169962217L);
            case 4172:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233170027754L);
            case 4173:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604988356564160L);
            case 4174:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605314774078717L);
            case 4177:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288936730108L);
            case 4180:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592898023883505L);
            case 4181:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592575902515841L);
            case 4182:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592575902450304L);
            case 4183:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081985536270L);
            case 4184:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081985470733L);
            case 4185:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288936402427L);
            case 4186:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605048486106310L);
            case 4187:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605048486171847L);
            case 4188:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605164450223327L);
            case 4189:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605164450288864L);
            case 4190:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817882916806L);
            case 4191:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862280731314L);
            case 4192:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233170420975L);
            case 4193:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233170486512L);
            case 4194:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233170289902L);
            case 4195:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233170552049L);
            case 4198:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081985601807L);
            case 4199:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605550997280040L);
            case 4202:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605499457672479L);
            case 4205:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599825805938310L);
            case 4206:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595157177337922L);
            case 4207:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595157177403459L);
            case 4208:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595157177468996L);
            case 4209:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439191663942L);
            case 4210:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602699139453695L);
            case 4211:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602699139388158L);
            case 4212:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596733429942900L);
            case 4214:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605237464667382L);
            case 4216:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600976857895001L);
            case 4217:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600976857829464L);
            case 4218:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605808695383389L);
            case 4219:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605804400350554L);
            case 4220:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605804400416091L);
            case 4221:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605808695317852L);
            case 4222:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288936926717L);
            case 4224:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432787278321L);
            case 4225:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602699139519232L);
            case 4226:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507910550883L);
            case 4227:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258807034935L);
            case 4228:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258806969398L);
            case 4230:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531636187817L);
            case 4232:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439191729479L);
            case 4233:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595015442958341L);
            case 4234:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595015443023878L);
            case 4235:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595015443089415L);
            case 4236:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595015442827267L);
            case 4237:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595015442892804L);
            case 4238:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606225307145605L);
            case 4239:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606225307211142L);
            case 4240:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606190947407232L);
            case 4241:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442762723871L);
            case 4242:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442762789408L);
            case 4243:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606315501524403L);
            case 4244:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531636318891L);
            case 4245:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531636384428L);
            case 4246:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531636449965L);
            case 4247:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531636253354L);
            case 4248:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602699139584769L);
            case 4249:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602699139650306L);
            case 4251:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606332681328062L);
            case 4253:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061302873499L);
            case 4254:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061302939036L);
            case 4255:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820059880478L);
            case 4256:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593576629175681L);
            case 4258:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606427170608588L);
            case 4260:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604807968068735L);
            case 4261:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604807968330880L);
            case 4262:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604807968396417L);
            case 4263:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606551724660207L);
            case 4264:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604807968461954L);
            case 4265:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604807968003198L);
            case 4266:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606551724725744L);
            case 4268:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547429692893L);
            case 4269:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547429758430L);
            case 4270:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547429823967L);
            case 4271:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606315501655476L);
            case 4273:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600783583776768L);
            case 4274:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601058461618291L);
            case 4275:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600813649072144L);
            case 4276:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351179426216L);
            case 4277:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351179491753L);
            case 4279:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507910616420L);
            case 4280:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606779357992457L);
            case 4281:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606779358385675L);
            case 4282:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606779358320138L);
            case 4283:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606775062959624L);
            case 4284:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591974605914191L);
            case 4285:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606856667338256L);
            case 4286:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606405695837634L);
            case 4287:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602896707556196L);
            case 4288:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547430020576L);
            case 4289:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547430151650L);
            case 4290:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547430086113L);
            case 4291:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061303004573L);
            case 4292:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061303070110L);
            case 4293:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061303135647L);
            case 4294:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608219660568L);
            case 4295:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608219398421L);
            case 4296:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608219463958L);
            case 4297:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601608219529495L);
            case 4298:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607028466030110L);
            case 4299:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547430217187L);
            case 4300:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607045645899296L);
            case 4301:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606942566684185L);
            case 4302:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594113500677717L);
            case 4309:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600813649137681L);
            case 4310:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912966061L);
            case 4311:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306913228209L);
            case 4312:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306913031598L);
            case 4313:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306913293746L);
            case 4314:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306913097135L);
            case 4315:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912769450L);
            case 4316:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912834987L);
            case 4317:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306911655321L);
            case 4318:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306911720858L);
            case 4319:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306911786395L);
            case 4320:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306911851932L);
            case 4321:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306911917469L);
            case 4322:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306911983006L);
            case 4323:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912048543L);
            case 4324:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912114080L);
            case 4325:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912179617L);
            case 4326:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912245154L);
            case 4327:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912310691L);
            case 4328:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912376228L);
            case 4329:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912441765L);
            case 4330:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912507302L);
            case 4331:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306911524247L);
            case 4332:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912900524L);
            case 4333:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306911589784L);
            case 4334:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306913162672L);
            case 4335:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912572839L);
            case 4336:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912638376L);
            case 4337:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606306912703913L);
            case 4338:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601058461749364L);
            case 4339:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598047689870433L);
            case 4341:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602763564159810L);
            case 4342:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602763564028737L);
            case 4343:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607037055964703L);
            case 4344:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600783583842305L);
            case 4346:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607251804329528L);
            case 4347:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607251804395065L);
            case 4348:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607251804460602L);
            case 4349:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607251804526139L);
            case 4350:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607251804591676L);
            case 4351:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607251804657213L);
            case 4352:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607251804722750L);
            case 4353:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547430413796L);
            case 4355:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016241357280L);
            case 4356:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016241291743L);
            case 4357:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817883047880L);
            case 4358:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817874921328L);
            case 4359:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817874986865L);
            case 4360:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817883113417L);
            case 4361:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817883178954L);
            case 4362:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817883244491L);
            case 4363:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817874659181L);
            case 4364:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817882982343L);
            case 4365:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594113500743254L);
            case 4366:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258807100472L);
            case 4367:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507910681957L);
            case 4368:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650441428956L);
            case 4369:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592726225781410L);
            case 4370:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607393538250333L);
            case 4372:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078413362108L);
            case 4373:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616808808747L);
            case 4374:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531636646576L);
            case 4375:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531636712113L);
            case 4376:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531636515502L);
            case 4377:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531636581039L);
            case 4378:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605666966508865L);
            case 4379:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605666967295298L);
            case 4380:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605666967360835L);
            case 4381:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605666967426372L);
            case 4382:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598142178888829L);
            case 4383:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598142178954366L);
            case 4384:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598142179019903L);
            case 4385:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607621171517049L);
            case 4386:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650441494493L);
            case 4387:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650441691103L);
            case 4388:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650441560030L);
            case 4389:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607681301059208L);
            case 4390:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607526682236529L);
            case 4391:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600976857960538L);
            case 4392:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600976858026075L);
            case 4393:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600976858157148L);
            case 4394:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531636777650L);
            case 4395:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607810150078107L);
            case 4396:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351179753898L);
            case 4397:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547430544869L);
            case 4399:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258807166009L);
            case 4400:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258807231546L);
            case 4401:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607908934325925L);
            case 4402:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607947589097127L);
            case 4403:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336121427159L);
            case 4404:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336121492696L);
            case 4405:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600783583907842L);
        }
    }

    private Long A07(int i) {
        switch (i) {
            case 4406:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608063553214128L);
            case 4407:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608063553279665L);
            case 4408:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608063553345202L);
            case 4409:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608063553148591L);
            case 4410:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531637039796L);
            case 4411:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531636974259L);
            case 4412:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604807968527491L);
            case 4413:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616808874284L);
            case 4414:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786355716822L);
            case 4415:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602699139715843L);
            case 4416:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602699139781380L);
            case 4417:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595204421519454L);
            case 4418:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595208716486758L);
            case 4419:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608252531709626L);
            case 4420:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608252531775163L);
            case 4421:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650441756640L);
            case 4422:
            case 4429:
            case 4430:
            case 4431:
            case 4464:
            case 4468:
            case 4484:
            case 4549:
            case 4561:
            case 4569:
            case 4634:
            case 4647:
            default:
                return null;
            case 4423:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288936992254L);
            case 4424:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395514479078L);
            case 4425:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608364200859362L);
            case 4426:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258807297083L);
            case 4427:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827201221L);
            case 4428:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827266758L);
            case 4432:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827332295L);
            case 4433:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827397832L);
            case 4434:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827463369L);
            case 4435:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827528906L);
            case 4436:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827594443L);
            case 4437:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827659980L);
            case 4438:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827725517L);
            case 4439:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827791054L);
            case 4440:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827856591L);
            case 4441:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256826676925L);
            case 4442:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256826742462L);
            case 4443:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256826807999L);
            case 4444:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256826873536L);
            case 4445:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256826939073L);
            case 4446:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827004610L);
            case 4447:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827922128L);
            case 4448:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827070147L);
            case 4449:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827135684L);
            case 4450:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608299776349912L);
            case 4451:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233170617586L);
            case 4452:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608441510270700L);
            case 4453:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602016241422817L);
            case 4454:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608437215303403L);
            case 4455:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608535999551221L);
            case 4456:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608535999616758L);
            case 4457:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608574654256896L);
            case 4458:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608566064322299L);
            case 4459:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608566064518910L);
            case 4460:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608566064584447L);
            case 4461:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608566064387836L);
            case 4462:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608566064453373L);
            case 4463:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608252531840700L);
            case 4465:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608690618373907L);
            case 4466:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600783583973379L);
            case 4467:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600783584038916L);
            case 4469:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608299776415449L);
            case 4470:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608299776480986L);
            case 4471:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608299776546523L);
            case 4472:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608931136542504L);
            case 4473:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531637105333L);
            case 4474:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601260325277837L);
            case 4475:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081460397888L);
            case 4476:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602763564356420L);
            case 4477:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602763564290883L);
            case 4478:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593001103164296L);
            case 4479:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601092821618809L);
            case 4480:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601092821684346L);
            case 4481:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601092821553272L);
            case 4482:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595182946879566L);
            case 4483:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081460856644L);
            case 4485:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081460528961L);
            case 4486:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081460594498L);
            case 4487:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081460791107L);
            case 4488:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258807362620L);
            case 4489:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258807428157L);
            case 4490:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258807493694L);
            case 4491:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593718362506718L);
            case 4492:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591923066896446L);
            case 4493:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591923066961983L);
            case 4494:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591923067027520L);
            case 4495:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609253259089783L);
            case 4496:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746386649906L);
            case 4497:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602746386715443L);
            case 4498:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024832406020L);
            case 4499:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602024832471557L);
            case 4500:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029127635498L);
            case 4501:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602029127701035L);
            case 4502:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081460922181L);
            case 4503:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36607393538315870L);
            case 4504:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36602531637170870L);
            case 4505:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598571675487473L);
            case 4506:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258807559231L);
            case 4507:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461053255L);
            case 4508:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461118792L);
            case 4509:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461184329L);
            case 4510:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081460987718L);
            case 4511:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608690618439444L);
            case 4512:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461249866L);
            case 4513:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461315403L);
            case 4514:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461380940L);
            case 4515:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461446477L);
            case 4516:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461512014L);
            case 4517:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650441822177L);
            case 4518:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256827987665L);
            case 4519:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258807624768L);
            case 4520:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623877158330L);
            case 4521:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623877223867L);
            case 4522:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623877289404L);
            case 4523:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623877354941L);
            case 4524:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650441887714L);
            case 4525:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608256828053202L);
            case 4526:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547430675943L);
            case 4527:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547430610406L);
            case 4528:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461577551L);
            case 4529:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461643088L);
            case 4530:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461708625L);
            case 4531:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461774162L);
            case 4532:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461839699L);
            case 4533:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461905236L);
            case 4534:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081461970773L);
            case 4535:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081462036310L);
            case 4536:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081462101847L);
            case 4537:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081462167384L);
            case 4538:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081462232921L);
            case 4539:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608965496411951L);
            case 4540:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608965496280878L);
            case 4541:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608965496674098L);
            case 4542:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608965496739635L);
            case 4543:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608965496543024L);
            case 4544:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608965496608561L);
            case 4545:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595084162959381L);
            case 4546:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596922408897228L);
            case 4547:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081462363995L);
            case 4548:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609081462298458L);
            case 4550:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609760065230812L);
            case 4551:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609760065427422L);
            case 4552:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609760065361885L);
            case 4553:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442763575841L);
            case 4554:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609850259544035L);
            case 4555:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608441510336237L);
            case 4556:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258807755842L);
            case 4557:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258807690305L);
            case 4558:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258807821379L);
            case 4559:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547430938088L);
            case 4560:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547431003625L);
            case 4562:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36610073597843464L);
            case 4563:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36610073597909001L);
            case 4564:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36610073597974538L);
            case 4565:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36610172382091281L);
            case 4566:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507910813030L);
            case 4567:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233170748660L);
            case 4568:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233170683123L);
            case 4570:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078413493181L);
            case 4571:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258808149061L);
            case 4572:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258808083524L);
            case 4573:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604709183886453L);
            case 4574:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507910878567L);
            case 4575:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36610374245554212L);
            case 4576:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605233171010805L);
            case 4577:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258808214598L);
            case 4578:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258808280135L);
            case 4579:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547431134698L);
            case 4580:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599392014503443L);
            case 4581:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616808939821L);
            case 4582:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36601616809005358L);
            case 4583:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547431265771L);
            case 4584:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36610357066012707L);
            case 4585:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36610357065750560L);
            case 4586:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36610357065816097L);
            case 4587:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36610357065881634L);
            case 4588:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288937123327L);
            case 4589:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738455960534L);
            case 4590:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36610739317774537L);
            case 4591:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598142179085440L);
            case 4592:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507910944104L);
            case 4593:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507911009641L);
            case 4594:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608965496805172L);
            case 4595:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608965496870709L);
            case 4596:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608965496936246L);
            case 4597:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547431462380L);
            case 4598:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547431527917L);
            case 4599:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078413558718L);
            case 4600:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597863006342200L);
            case 4601:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442763641378L);
            case 4602:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608690618570518L);
            case 4603:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608690618504981L);
            case 4604:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36608690618636055L);
            case 4605:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597863006407737L);
            case 4606:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597863006473274L);
            case 4607:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769177092805L);
            case 4608:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611396447770897L);
            case 4609:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442763706915L);
            case 4610:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594770629494613L);
            case 4611:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507911075178L);
            case 4612:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442763837989L);
            case 4613:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442763903526L);
            case 4614:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442763772452L);
            case 4615:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744340515140L);
            case 4616:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744340580677L);
            case 4617:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744340252992L);
            case 4618:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744340318529L);
            case 4619:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744340384066L);
            case 4620:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744340449603L);
            case 4621:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744340121918L);
            case 4622:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744340187455L);
            case 4623:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507911140715L);
            case 4624:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611752930056525L);
            case 4625:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36605550997345577L);
            case 4626:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507911206252L);
            case 4627:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442763969063L);
            case 4628:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442764034600L);
            case 4629:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442764100137L);
            case 4630:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442764165674L);
            case 4631:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612122297244003L);
            case 4632:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744340646214L);
            case 4633:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744340711751L);
            case 4635:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744340842824L);
            case 4636:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744340908361L);
            case 4637:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744340973898L);
            case 4638:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744341039435L);
            case 4639:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36611744341104972L);
            case 4640:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351179819435L);
            case 4641:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592666096239250L);
            case 4642:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157904914794L);
            case 4643:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36609850259609572L);
            case 4644:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606315501721013L);
            case 4645:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442764231211L);
            case 4646:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36606547431593454L);
            case 4648:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612221081819505L);
            case 4649:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612221081885042L);
            case 4650:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612221082147189L);
            case 4651:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612221081753968L);
            case 4652:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612221081950579L);
            case 4653:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612221082278262L);
            case 4654:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612221082081652L);
            case 4655:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612212491622767L);
            case 4656:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592898024080114L);
            case 4657:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612453009725832L);
            case 4658:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36604107888333858L);
            case 4659:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107752456499L);
            case 4660:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078413755327L);
            case 4661:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792105772904L);
            case 4662:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480028576279L);
            case 4663:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480028641816L);
            case 4664:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480028707353L);
            case 4665:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480028314131L);
            case 4666:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480028379668L);
            case 4667:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480028445205L);
            case 4668:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480028510742L);
            case 4669:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157904980331L);
            case 4670:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081985732880L);
            case 4671:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597863006604347L);
            case 4672:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612753657502108L);
            case 4673:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612753657567645L);
            case 4674:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612753657633182L);
            case 4675:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36612753657436571L);
            case 4676:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623878010307L);
            case 4677:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623877748160L);
            case 4678:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623877617086L);
            case 4679:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623877682623L);
            case 4680:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623877813697L);
            case 4681:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623877879234L);
        }
    }

    private Long A08(int i) {
        switch (i) {
            case 1103:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594444211848935L);
            case 1104:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594448506816233L);
            case 1105:
            case 1113:
            case 1114:
            case 1115:
            case 1116:
            case 1118:
            case 1121:
            case 1129:
            case 1132:
            case 1133:
            case 1135:
            case 1136:
            case 1137:
            case 1138:
            case 1139:
            case 1141:
            case 1142:
            case 1144:
            case 1145:
            case 1148:
            case 1149:
            case 1150:
            case 1151:
            case 1152:
            case 1162:
            case 1163:
            case 1164:
            case 1166:
            case 1168:
            case 1170:
            case 1175:
            case 1179:
            case 1180:
            case 1191:
            case 1198:
            case 1199:
            case 1200:
            case 1201:
            case 1209:
            case 1216:
            case 1226:
            case 1227:
            case 1230:
            case 1235:
            case 1238:
            case 1240:
            case 1243:
            case 1244:
            case 1245:
            case 1250:
            case 1251:
            case 1252:
            case 1253:
            case 1254:
            case 1255:
            case 1256:
            case 1260:
            case 1261:
            case 1262:
            case 1263:
            case 1264:
            case 1265:
            case 1266:
            case 1268:
            case 1269:
            case 1270:
            case 1271:
            case 1272:
            case 1273:
            case 1277:
            case 1278:
            case 1280:
            case 1281:
            case 1282:
            case 1283:
            case 1284:
            case 1285:
            case 1287:
            case 1288:
            case 1289:
            case 1290:
            case 1291:
            case 1292:
            case 1293:
            case 1294:
            case 1298:
            case 1303:
            case 1304:
            case 1305:
            case 1306:
            case 1309:
            case 1310:
            case 1311:
            case 1314:
            case 1315:
            case 1316:
            case 1318:
            case 1319:
            case 1321:
            case 1322:
            case 1323:
            case 1324:
            case 1330:
            case 1343:
            case 1344:
            case 1345:
            case 1346:
            case 1347:
            case 1348:
            case 1349:
            case 1350:
            case 1352:
            case 1362:
            case 1368:
            default:
                return null;
            case 1106:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594439917274852L);
            case 1107:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594439916881630L);
            case 1108:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594439916947167L);
            case 1109:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594439917012704L);
            case 1110:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594439917078241L);
            case 1111:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594439917143778L);
            case 1112:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594439917209315L);
            case 1117:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439190811968L);
            case 1119:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593778491983353L);
            case 1120:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594500046423795L);
            case 1122:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594469981652717L);
            case 1123:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594525816227586L);
            case 1124:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430601663764L);
            case 1125:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430601729301L);
            case 1126:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430601925911L);
            case 1127:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430601860374L);
            case 1128:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594495751456496L);
            case 1130:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769176175295L);
            case 1131:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592030440685705L);
            case 1134:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594512931325684L);
            case 1140:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594542996096778L);
            case 1143:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442758136313L);
            case 1146:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593842916492810L);
            case 1147:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987491078232L);
            case 1153:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430602450200L);
            case 1154:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430602646811L);
            case 1155:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430602515737L);
            case 1156:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430602581274L);
            case 1157:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594577355835167L);
            case 1158:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594607420606256L);
            case 1159:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594607420671793L);
            case 1160:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594607420737330L);
            case 1161:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593486434469197L);
            case 1165:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594409852634840L);
            case 1167:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594590240737064L);
            case 1169:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591777037484038L);
            case 1171:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592374037938629L);
            case 1172:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594637485377334L);
            case 1173:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594624600475445L);
            case 1174:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594641780344631L);
            case 1176:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593705477539293L);
            case 1177:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258801792005L);
            case 1178:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623873553815L);
            case 1181:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594560176293645L);
            case 1182:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594689024984893L);
            case 1183:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594701909886784L);
            case 1184:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594113499891277L);
            case 1185:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594113499956814L);
            case 1186:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594113500022351L);
            case 1187:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594113500087888L);
            case 1188:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594113499760203L);
            case 1189:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594113499825740L);
            case 1190:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594641780475704L);
            case 1192:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081982587132L);
            case 1193:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081982521595L);
            case 1194:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081982652669L);
            case 1195:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430602777884L);
            case 1196:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594714794919750L);
            case 1197:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594714794985287L);
            case 1202:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594714794788676L);
            case 1203:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594714794854213L);
            case 1204:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374765122782L);
            case 1205:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594757744461648L);
            case 1206:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594770629363540L);
            case 1207:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594731974657868L);
            case 1208:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594560176555790L);
            case 1210:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594779219298134L);
            case 1211:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594766334592851L);
            case 1212:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594766334527314L);
            case 1213:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594658960213817L);
            case 1214:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594658960279354L);
            case 1215:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594749154527055L);
            case 1217:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593576628847998L);
            case 1218:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081982718206L);
            case 1219:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081982783743L);
            case 1220:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792104200027L);
            case 1221:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792104265564L);
            case 1222:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594439917405925L);
            case 1223:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258802054151L);
            case 1224:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258801988614L);
            case 1225:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594800694134633L);
            case 1228:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817874003819L);
            case 1229:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081982980352L);
            case 1231:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081983111425L);
            case 1232:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592060505653466L);
            case 1233:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594830758905804L);
            case 1234:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594809284069226L);
            case 1236:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594847938774990L);
            case 1237:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594839348840397L);
            case 1239:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591974605848654L);
            case 1241:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594869413611475L);
            case 1242:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594495751522033L);
            case 1246:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395514151394L);
            case 1247:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395514085857L);
            case 1248:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594856528709583L);
            case 1249:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594856528775120L);
            case 1257:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594873708578772L);
            case 1258:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594873708644309L);
            case 1259:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594873708709846L);
            case 1267:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591777037549575L);
            case 1274:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081983439106L);
            case 1275:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081983504643L);
            case 1276:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336112710807L);
            case 1279:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594908068317161L);
            case 1286:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592726225322654L);
            case 1295:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594951018055669L);
            case 1296:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594903773480927L);
            case 1297:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594903773546464L);
            case 1299:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081983570180L);
            case 1300:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595015442499582L);
            case 1301:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595015442565119L);
            case 1302:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595015442630656L);
            case 1307:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594946723088367L);
            case 1308:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593288866038865L);
            case 1312:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081983635717L);
            case 1313:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594444211914472L);
            case 1317:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594998262695932L);
            case 1320:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595058392172557L);
            case 1325:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081983766791L);
            case 1326:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081983701254L);
            case 1327:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595058392238094L);
            case 1328:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595058392303631L);
            case 1329:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595028327467018L);
            case 1331:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507909567833L);
            case 1332:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507909633370L);
            case 1333:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507909698907L);
            case 1334:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507909764444L);
            case 1335:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507909829981L);
            case 1336:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507909895518L);
            case 1337:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507909502296L);
            case 1338:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039031275677L);
            case 1339:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039031341214L);
            case 1340:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594946723153904L);
            case 1341:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374765188319L);
            case 1342:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595118521714728L);
            case 1351:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595122816682029L);
            case 1353:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595109931780124L);
            case 1354:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595105637009433L);
            case 1355:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595105637074970L);
            case 1356:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595105636812822L);
            case 1357:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595105636878359L);
            case 1358:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595105636943896L);
            case 1359:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595118521780265L);
            case 1360:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971038982947L);
            case 1361:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595114226812958L);
            case 1363:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595114226944031L);
            case 1364:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595114227009568L);
            case 1365:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595114227075105L);
            case 1366:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595114227140642L);
            case 1367:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595114226747421L);
            case 1369:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595127111649330L);
            case 1370:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595127111714867L);
            case 1371:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595127111780404L);
            case 1372:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595152881453112L);
            case 1373:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595152881518649L);
            case 1374:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595152881584186L);
            case 1375:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258802119688L);
            case 1376:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595135701583926L);
        }
    }

    private Long A09(int i) {
        switch (i) {
            case 1379:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595084161976336L);
            case 1380:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595084162107409L);
            case 1381:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595157176420411L);
            case 1382:
            case 1383:
            case 1386:
            case 1387:
            case 1389:
            case 1405:
            case 1407:
            case 1408:
            case 1409:
            case 1410:
            case 1411:
            case 1414:
            case 1421:
            case 1423:
            case 1424:
            case 1425:
            case 1426:
            case 1427:
            case 1428:
            case 1432:
            case 1441:
            case 1442:
            case 1443:
            case 1449:
            case 1462:
            case 1464:
            case 1465:
            case 1466:
            case 1489:
            case 1494:
            case 1497:
            case PsiphonTunnel.VPN_INTERFACE_MTU /* 1500 */:
            case 1501:
            case 1503:
            case 1504:
            case 1505:
            case 1507:
            case 1508:
            case 1509:
            case 1512:
            case 1513:
            case 1514:
            case 1515:
            case 1516:
            case 1517:
            case 1518:
            case 1519:
            case 1520:
            case 1521:
            case 1522:
            case 1523:
            case 1524:
            case 1546:
            case 1549:
            case 1550:
            case 1551:
            case 1552:
            case 1553:
            case 1554:
            case 1555:
            case 1556:
            case 1558:
            case 1559:
            case 1560:
            case 1561:
            case 1563:
            case 1570:
            case 1584:
            case 1590:
            case 1592:
            case 1593:
            case 1598:
            case 1599:
            case 1600:
            case 1604:
            case 1605:
            case 1606:
            case 1610:
            case 1616:
            case 1617:
            case 1620:
            case 1626:
            case 1630:
            case 1631:
            case 1632:
            case 1633:
            case 1636:
            case 1637:
            case 1639:
            case 1647:
            default:
                return null;
            case 1384:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591777037615112L);
            case 1385:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595195831126102L);
            case 1388:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595170061322309L);
            case 1390:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595182946224199L);
            case 1391:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595204421126232L);
            case 1392:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595204421191769L);
            case 1393:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595204421257306L);
            case 1394:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595204421322843L);
            case 1395:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595204421388380L);
            case 1396:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595204421453917L);
            case 1397:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595208716027999L);
            case 1398:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595208716093536L);
            case 1399:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595208716159073L);
            case 1400:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595208716224610L);
            case 1401:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595208716290147L);
            case 1402:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595208716355684L);
            case 1403:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595204421060695L);
            case 1404:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595208716421221L);
            case 1406:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595178651256902L);
            case 1412:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430603040029L);
            case 1413:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430603105566L);
            case 1415:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051918733500L);
            case 1416:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051918667963L);
            case 1417:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430603171103L);
            case 1418:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595238780930153L);
            case 1419:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595238780864616L);
            case 1420:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595238780799079L);
            case 1422:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336112841880L);
            case 1429:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595122816747566L);
            case 1430:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595122816813103L);
            case 1431:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595015442696193L);
            case 1433:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336112907417L);
            case 1434:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595264550602859L);
            case 1435:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595268845570157L);
            case 1436:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430603367714L);
            case 1437:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430603236640L);
            case 1438:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430603302177L);
            case 1439:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258802185225L);
            case 1440:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593507909961055L);
            case 1444:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592966743622421L);
            case 1445:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592966743687958L);
            case 1446:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592966743753495L);
            case 1447:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592966743819032L);
            case 1448:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592966743556884L);
            case 1450:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595303205308533L);
            case 1451:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595303205439606L);
            case 1452:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595337565046905L);
            case 1453:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595337565112442L);
            case 1454:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595337565177979L);
            case 1455:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595341860014204L);
            case 1456:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592112045130040L);
            case 1457:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592112045195577L);
            case 1458:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592112045261114L);
            case 1459:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592112045064503L);
            case 1460:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593842916558347L);
            case 1461:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593842916689420L);
            case 1463:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081983897864L);
            case 1467:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593576628913535L);
            case 1468:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595286025439345L);
            case 1469:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593104182313927L);
            case 1470:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595376219752590L);
            case 1471:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593194376692714L);
            case 1472:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594714795050824L);
            case 1473:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594714795116361L);
            case 1474:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593890161460762L);
            case 1475:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593890161198615L);
            case 1476:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593890161264152L);
            case 1477:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593890161329689L);
            case 1478:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374765253856L);
            case 1479:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374765319393L);
            case 1480:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593598103815564L);
            case 1481:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107750818084L);
            case 1482:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107750883621L);
            case 1483:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107750949158L);
            case 1484:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107751014695L);
            case 1485:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107751080232L);
            case 1486:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107750621473L);
            case 1487:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107750687010L);
            case 1488:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107750752547L);
            case 1490:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592112045392188L);
            case 1491:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592112045457725L);
            case 1492:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592112045326651L);
            case 1493:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592386923954644L);
            case 1495:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592386923889107L);
            case 1496:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051918799037L);
            case 1498:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078413034425L);
            case 1499:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078413099962L);
            case 1502:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595423464392851L);
            case 1506:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592386924020181L);
            case 1510:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595118521845802L);
            case 1511:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595457824131221L);
            case 1525:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817876363139L);
            case 1526:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817875773307L);
            case 1527:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817875838844L);
            case 1528:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817875904381L);
            case 1529:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817875969918L);
            case 1530:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817876428676L);
            case 1531:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817876494213L);
            case 1532:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817874069356L);
            case 1533:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817876035455L);
            case 1534:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817875052402L);
            case 1535:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817875117939L);
            case 1536:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817875183476L);
            case 1537:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817875249013L);
            case 1538:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817876166528L);
            case 1539:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817876232065L);
            case 1540:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817875380086L);
            case 1541:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817875445623L);
            case 1542:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817875511160L);
            case 1543:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817875576697L);
            case 1544:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817875642234L);
            case 1545:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817876297602L);
            case 1547:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591991785783399L);
            case 1548:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593486434534734L);
            case 1557:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593847211460110L);
            case 1562:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593078413165499L);
            case 1564:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442759315962L);
            case 1565:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595556608444591L);
            case 1566:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595556608379054L);
            case 1567:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530839427239L);
            case 1568:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530838575260L);
            case 1569:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530838640797L);
            case 1571:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530838771870L);
            case 1572:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530838837407L);
            case 1573:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530838902944L);
            case 1574:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530838968481L);
            case 1575:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530839034018L);
            case 1576:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530839099555L);
            case 1577:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530839165092L);
            case 1578:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530839230629L);
            case 1579:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530839296166L);
            case 1580:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430603629859L);
            case 1581:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430603695396L);
            case 1582:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430604023077L);
            case 1583:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430604154150L);
            case 1585:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051918864574L);
            case 1586:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595341860079741L);
            case 1587:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591777037680649L);
            case 1588:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592472822121019L);
            case 1589:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592558721598058L);
            case 1591:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987491143769L);
            case 1594:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595084162172946L);
            case 1595:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081984028937L);
            case 1596:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081984094474L);
            case 1597:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595118521911339L);
            case 1601:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595586673150151L);
            case 1602:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595621032954074L);
            case 1603:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595621032888537L);
            case 1607:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593323226104941L);
            case 1608:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430604416295L);
            case 1609:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817876625286L);
            case 1611:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595646802692319L);
            case 1612:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595118522042412L);
            case 1613:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595651097659618L);
            case 1614:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595638212823262L);
            case 1615:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595616737921240L);
            case 1618:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592030440816778L);
            case 1619:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595625327855835L);
            case 1621:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595612442953931L);
            case 1622:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595612443019468L);
            case 1623:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595612443085005L);
            case 1624:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595612443150542L);
            case 1625:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595685457463525L);
            case 1627:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593194376889323L);
            case 1628:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595685457397988L);
            case 1629:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595685457529062L);
            case 1634:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592726225388191L);
            case 1635:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258802643978L);
            case 1638:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595698342299885L);
            case 1640:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595264550668396L);
            case 1641:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595268845635694L);
            case 1642:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595694047332584L);
            case 1643:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595694047398121L);
            case 1644:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595694047463658L);
            case 1645:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595694047529195L);
            case 1646:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595694047594732L);
            case ReactTextInputManager.IME_ACTION_ID /* 1648 */:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595681162430691L);
        }
    }

    private Long A0A(int i) {
        switch (i) {
            case 1655:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595303205570679L);
            case 1656:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595745586940152L);
            case 1657:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595749881907449L);
            case 1658:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594113500153425L);
            case 1659:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336113431706L);
            case 1660:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336113562779L);
            case 1661:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595719817136372L);
            case 1662:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595698342430959L);
            case 1663:
            case 1664:
            case 1665:
            case 1669:
            case 1671:
            case 1672:
            case 1674:
            case 1675:
            case 1676:
            case 1677:
            case 1680:
            case 1683:
            case 1684:
            case 1686:
            case 1687:
            case 1689:
            case 1691:
            case 1692:
            case 1693:
            case 1694:
            case 1695:
            case 1697:
            case 1698:
            case 1699:
            case 1700:
            case 1701:
            case 1703:
            case 1704:
            case 1709:
            case 1710:
            case 1711:
            case 1712:
            case 1713:
            case 1714:
            case 1715:
            case 1717:
            case 1721:
            case 1722:
            case 1723:
            case 1726:
            case 1731:
            case 1732:
            case 1733:
            case 1734:
            case 1735:
            case 1743:
            case 1744:
            case 1745:
            case 1746:
            case 1747:
            case 1754:
            case 1755:
            case 1756:
            case 1757:
            case 1758:
            case 1761:
            case 1766:
            case 1768:
            case 1769:
            case 1771:
            case 1772:
            case 1773:
            case 1776:
            case 1777:
            case 1780:
            case 1781:
            case 1791:
            case 1799:
            case 1800:
            case 1801:
            case 1806:
            case 1807:
            case 1809:
            case 1810:
            case 1812:
            case 1820:
            case 1821:
            case 1822:
            case 1832:
            case 1834:
            case 1842:
            case 1843:
            case 1844:
            case 1845:
            case 1848:
            case 1849:
            case 1850:
            case 1852:
            case 1853:
            case 1854:
            case 1855:
            case 1856:
            case 1862:
            case 1869:
            case 1870:
            case 1878:
            case 1879:
            case 1880:
            case 1881:
            case 1883:
            case 1884:
            case 1885:
            case 1887:
            case 1889:
            case 1890:
            case 1893:
            case 1904:
            case 1906:
            case 1908:
            case 1909:
            case 1911:
            case 1912:
            case 1913:
            case 1916:
            case 1919:
            case 1920:
            case 1921:
            default:
                return null;
            case 1666:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595698342365422L);
            case 1667:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591777037746186L);
            case 1668:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595702637267187L);
            case 1670:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595788536613121L);
            case 1673:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595801421515011L);
            case 1678:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595844371187982L);
            case 1679:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595698342496496L);
            case 1681:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595805716547847L);
            case 1682:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595805716482310L);
            case 1685:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786355389137L);
            case 1688:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595848666220817L);
            case 1690:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031170818971L);
            case 1696:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591923066175548L);
            case 1702:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595801421580548L);
            case 1705:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595934565501208L);
            case 1706:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595934565566745L);
            case 1707:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595934565632282L);
            case 1708:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595934565697819L);
            case 1716:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595943155435804L);
            case 1718:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595157176748092L);
            case 1719:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595157176813629L);
            case 1720:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594409852831449L);
            case 1724:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592545837220448L);
            case 1725:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107751342380L);
            case 1727:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107751473453L);
            case 1728:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107751145769L);
            case 1729:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107751211306L);
            case 1730:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107751276843L);
            case 1736:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593288866169938L);
            case 1737:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374765450467L);
            case 1738:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374765384930L);
            case 1739:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595157176879166L);
            case 1740:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595157176944703L);
            case 1741:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971039507236L);
            case 1742:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336113628316L);
            case 1748:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594903773677537L);
            case 1749:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596041939749161L);
            case 1750:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596041939814698L);
            case 1751:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596041939683624L);
            case 1752:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592008965849201L);
            case 1753:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592008965783664L);
            case 1759:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595157177010240L);
            case 1760:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595157177075777L);
            case 1762:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592386924675543L);
            case 1763:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592386924610006L);
            case 1764:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594903773874146L);
            case 1765:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336113759389L);
            case 1767:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077688340716L);
            case 1770:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596063414520118L);
            case 1774:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594903773939683L);
            case 1775:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594113500350034L);
            case 1778:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596093479291194L);
            case 1779:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336113824926L);
            case 1782:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595556608510128L);
            case 1783:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595556608575665L);
            case 1784:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877149578L);
            case 1785:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817876887432L);
            case 1786:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877215115L);
            case 1787:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877280652L);
            case 1788:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817876690823L);
            case 1789:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877084041L);
            case 1790:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594109204465225L);
            case 1792:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258802906123L);
            case 1793:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258803102732L);
            case 1794:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975337423682L);
            case 1795:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596110659357002L);
            case 1796:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596110659160391L);
            case 1797:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596110659225928L);
            case 1798:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596110659291465L);
            case 1802:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594607420933939L);
            case 1803:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596114954127692L);
            case 1804:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596041939880235L);
            case 1805:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530839820456L);
            case 1808:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596063414585655L);
            case 1811:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596123544062291L);
            case 1813:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157904062815L);
            case 1814:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157903800667L);
            case 1815:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157903866204L);
            case 1816:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157903931741L);
            case 1817:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157904128352L);
            case 1818:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157903997278L);
            case 1819:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596093479356731L);
            case 1823:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595590968248520L);
            case 1824:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975337489219L);
            case 1825:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596209443408247L);
            case 1826:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596213738375544L);
            case 1827:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596166493735276L);
            case 1828:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596166493800813L);
            case 1829:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596166493866350L);
            case 1830:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592030440882315L);
            case 1831:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258803168269L);
            case 1833:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596153608833370L);
            case 1835:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591777037942795L);
            case 1836:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596136428964181L);
            case 1837:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596136429029718L);
            case 1838:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596140723931479L);
            case 1839:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596196558506351L);
            case 1840:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395514348004L);
            case 1841:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592395514282467L);
            case 1846:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594856528840657L);
            case 1847:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596260983015808L);
            case 1851:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596273867917699L);
            case 1857:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596196558571888L);
            case 1858:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596196558637425L);
            case 1859:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596196558702962L);
            case 1860:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596295342754181L);
            case 1861:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596295342819718L);
            case 1863:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596093479422268L);
            case 1864:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258803364880L);
            case 1865:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258803233806L);
            case 1866:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595814306482442L);
            case 1867:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258803299343L);
            case 1868:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595122816878640L);
            case 1871:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596329702492555L);
            case 1872:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596329702558092L);
            case 1873:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596329702623629L);
            case 1874:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596329702689166L);
            case 1875:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596329702754703L);
            case 1876:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596329702820240L);
            case 1877:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595749881972986L);
            case 1882:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077688537325L);
            case 1886:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596424191773110L);
            case 1888:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596402717067698L);
            case 1891:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596407011903923L);
            case 1892:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596419896805812L);
            case 1894:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596419896936885L);
            case 1895:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596355472427438L);
            case 1896:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595801421646085L);
            case 1897:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596355472296364L);
            case 1898:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596355472361901L);
            case 1899:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596355472492975L);
            case 1900:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592674685584023L);
            case 1901:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351177329044L);
            case 1902:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351177394581L);
            case 1903:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351177460118L);
            case 1905:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596196558768499L);
            case 1907:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596454256544251L);
            case 1910:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596484321315354L);
            case 1914:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592532951532118L);
            case 1915:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432781773250L);
            case 1917:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432781904323L);
            case 1918:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432781707713L);
            case 1922:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596527270988317L);
            case 1923:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596527271053854L);
            case 1924:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596527271119391L);
            case 1925:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596527271184928L);
        }
    }

    private Long A0B(int i) {
        switch (i) {
            case 1927:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596540155890218L);
            case 1928:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596535861053992L);
            case 1929:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336114152607L);
            case 1930:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336114218144L);
            case 1931:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374765516004L);
            case 1932:
            case 1934:
            case 1936:
            case 1943:
            case 1944:
            case 1945:
            case 1949:
            case 1950:
            case 1951:
            case 1952:
            case 1953:
            case 1954:
            case 1956:
            case 1957:
            case 1959:
            case 1964:
            case 1966:
            case 1970:
            case 1975:
            case 1976:
            case 1979:
            case 1983:
            case 1986:
            case 1989:
            case 1990:
            case 1993:
            case 1994:
            case 1995:
            case 1996:
            case 1998:
            case 1999:
            case CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS /* 2000 */:
            case 2008:
            case 2020:
            case 2023:
            case 2024:
            case 2025:
            case 2026:
            case 2027:
            case 2028:
            case 2029:
            case 2030:
            case 2034:
            case 2036:
            case 2039:
            case 2052:
            case 2053:
            case 2054:
            case 2055:
            case 2057:
            case 2064:
            case 2070:
            case 2071:
            case 2072:
            case 2073:
            case 2074:
            case 2076:
            case 2098:
            case 2102:
            case 2104:
            case 2105:
            case 2107:
            case 2108:
            case 2109:
            case 2110:
            case 2111:
            case 2112:
            case 2114:
            case 2115:
            case 2116:
            case 2117:
            case 2118:
            case 2122:
            case 2126:
            case 2130:
            case 2131:
            case 2133:
            case 2139:
            case 2140:
            case 2141:
            case 2143:
            case 2155:
            case 2156:
            case 2157:
            case 2162:
            case 2163:
            case 2168:
            case 2170:
            case 2173:
            case 2175:
            case 2176:
            case 2180:
            case 2184:
            case 2185:
            case 2188:
            case 2189:
            case 2190:
            case 2198:
            default:
                return null;
            case 1933:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595015442761730L);
            case 1935:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336114414754L);
            case 1937:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336114349217L);
            case 1938:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596570220857909L);
            case 1939:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596570220661298L);
            case 1940:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596570220726835L);
            case 1941:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596570220792372L);
            case 1942:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596574515628598L);
            case 1946:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596239508441468L);
            case 1947:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596239508179323L);
            case 1948:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596239508638077L);
            case 1955:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596428486937023L);
            case 1958:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594946723678193L);
            case 1960:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596574515890744L);
            case 1961:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596574515759671L);
            case 1962:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769176437440L);
            case 1963:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593370470089946L);
            case 1965:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592983923032904L);
            case 1967:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596630350203461L);
            case 1968:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336114873508L);
            case 1969:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336114939045L);
            case 1971:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336114742435L);
            case 1972:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594113500415571L);
            case 1973:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596295342885255L);
            case 1974:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430605268265L);
            case 1977:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430605137192L);
            case 1978:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596093479487805L);
            case 1980:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596647530072652L);
            case 1981:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596647530138189L);
            case 1982:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596647530203726L);
            case 1984:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592580196303494L);
            case 1985:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596196558965108L);
            case 1987:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596484321446427L);
            case 1988:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596093479618878L);
            case 1991:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596196559096182L);
            case 1992:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596196559030645L);
            case 1997:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596729134451309L);
            case 2001:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703365106271L);
            case 2002:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703364778587L);
            case 2003:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703364844124L);
            case 2004:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703364909661L);
            case 2005:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703364647513L);
            case 2006:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703364713050L);
            case 2007:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703364975198L);
            case 2009:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596711954582123L);
            case 2010:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596742019353205L);
            case 2011:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592545837417057L);
            case 2012:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596733429549679L);
            case 2013:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596733429484142L);
            case 2014:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596041940011308L);
            case 2015:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596041940142381L);
            case 2016:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596754904255097L);
            case 2017:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769176502977L);
            case 2018:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430606251307L);
            case 2019:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430606316844L);
            case 2021:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430606185770L);
            case 2022:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975337554756L);
            case 2031:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792104462173L);
            case 2032:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442759512571L);
            case 2033:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430606513454L);
            case 2035:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430606447917L);
            case 2037:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031170884508L);
            case 2038:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595127111845941L);
            case 2040:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596832213666454L);
            case 2041:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351177787799L);
            case 2042:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351177853336L);
            case 2043:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336115266726L);
            case 2044:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592545837810274L);
            case 2045:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596815033797260L);
            case 2046:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592374038135238L);
            case 2047:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592374038200775L);
            case C3OO.FLAG_MOVED /* 2048 */:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862278437527L);
            case 2049:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862278503064L);
            case 2050:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351177918873L);
            case 2051:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596780674058883L);
            case 2056:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596776379091586L);
            case 2058:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596875163339445L);
            case 2059:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596870868372147L);
            case 2060:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596827918699152L);
            case 2061:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077688799471L);
            case 2062:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077688865008L);
            case 2063:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077688733934L);
            case 2065:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596883753274039L);
            case 2066:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596883753339576L);
            case 2067:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596883753405113L);
            case 2068:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596883753470650L);
            case 2069:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596883753536187L);
            case 2075:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592726225453728L);
            case 2077:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862278568601L);
            case 2078:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862278634138L);
            case 2079:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862278699675L);
            case 2080:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862278765212L);
            case 2081:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862278830749L);
            case 2082:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862278896286L);
            case 2083:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862278961823L);
            case 2084:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862279027360L);
            case 2085:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862279092897L);
            case 2086:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862279158434L);
            case 2087:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862279223971L);
            case 2088:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862279289508L);
            case 2089:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862279355045L);
            case 2090:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862279420582L);
            case 2091:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862279486119L);
            case 2092:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862279551656L);
            case 2093:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862279617193L);
            case 2094:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862279682730L);
            case 2095:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862279748267L);
            case 2096:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596862279813804L);
            case 2097:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596943882816205L);
            case 2099:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596922407979714L);
            case 2100:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596922408307395L);
            case 2101:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596922408372932L);
            case 2103:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442759643644L);
            case 2106:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594469982045934L);
            case 2113:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596982537521878L);
            case 2119:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077688930545L);
            case 2120:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077688996082L);
            case 2121:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596565925759537L);
            case 2123:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595084162369556L);
            case 2124:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595084162238483L);
            case 2125:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597004012423896L);
            case 2127:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596991127456471L);
            case 2128:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595685457725671L);
            case 2129:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336115397799L);
            case 2132:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596110659619147L);
            case 2134:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430607168815L);
            case 2135:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594946723809266L);
            case 2136:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594946723874803L);
            case 2137:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592855074734813L);
            case 2138:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374765581541L);
            case 2142:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596827918764689L);
            case 2144:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593323226236014L);
            case 2145:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597085616736997L);
            case 2146:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862937944096L);
            case 2147:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596424191904183L);
            case 2148:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596424191969720L);
            case 2149:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596424192035257L);
            case 2150:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596424192100794L);
            case 2151:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596424192166331L);
            case 2152:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596424192231868L);
            case 2153:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596424192297405L);
            case 2154:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596424192362942L);
            case 2158:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597029782162139L);
            case 2159:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597029782227676L);
            case 2160:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597119976475367L);
            case 2161:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703365171808L);
            case 2164:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593323226367087L);
            case 2165:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595556608641202L);
            case 2166:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595341860210814L);
            case 2167:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595341860276351L);
            case 2169:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595135701649463L);
            case 2171:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430607234352L);
            case 2172:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077689192691L);
            case 2174:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597175811050222L);
            case 2177:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597192990919410L);
            case 2178:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592060505719003L);
            case 2179:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595698343020785L);
            case 2181:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258803758099L);
            case 2182:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258803430417L);
            case 2183:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258803495954L);
            case 2186:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031171081117L);
            case 2187:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597244530526998L);
            case 2191:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769176568514L);
            case 2192:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351178443167L);
            case 2193:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351178115482L);
            case 2194:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351178181019L);
            case 2195:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351178246556L);
            case 2196:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351178312093L);
            case 2197:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351178377630L);
            case 2199:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597132861508333L);
            case 2200:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596827918830226L);
            case 2201:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594779219429207L);
            case 2202:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594779219494744L);
        }
    }

    private Long A0C(int i) {
        switch (i) {
            case 2204:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596093479946559L);
            case 2205:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597278890265367L);
            case 2206:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592563016696431L);
            case 2207:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597119976540904L);
            case 2208:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597119976606441L);
            case 2209:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597287480199965L);
            case 2210:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594109204596298L);
            case 2211:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442759774718L);
            case 2212:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442759709181L);
            case 2213:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156449629793L);
            case 2214:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156449695330L);
            case 2215:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156449760867L);
            case 2216:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156449826404L);
            case 2217:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156449891941L);
            case 2218:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156449957478L);
            case 2219:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450023015L);
            case 2220:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450088552L);
            case 2221:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450154089L);
            case 2222:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450219626L);
            case 2223:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450285163L);
            case 2224:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450350700L);
            case 2225:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450416237L);
            case 2226:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450481774L);
            case 2227:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450547311L);
            case 2228:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450612848L);
            case 2229:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450678385L);
            case 2230:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450743922L);
            case 2231:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450809459L);
            case 2232:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450874996L);
            case 2233:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156450940533L);
            case 2234:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156451006070L);
            case 2235:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156451071607L);
            case 2236:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156451137144L);
            case 2237:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156451202681L);
            case 2238:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156451268218L);
            case 2239:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156451333755L);
            case 2240:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156451399292L);
            case 2241:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156451464829L);
            case 2242:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156449433182L);
            case 2243:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156449498719L);
            case 2244:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594156449564256L);
            case 2245:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597304660069151L);
            case 2246:
            case 2249:
            case 2250:
            case 2252:
            case 2253:
            case 2256:
            case 2261:
            case 2267:
            case 2268:
            case 2269:
            case 2270:
            case 2277:
            case 2278:
            case 2279:
            case 2289:
            case 2292:
            case 2293:
            case 2294:
            case 2295:
            case 2302:
            case 2321:
            case 2322:
            case 2323:
            case 2325:
            case 2331:
            case 2349:
            case 2364:
            case 2367:
            case 2368:
            case 2372:
            case 2396:
            case 2397:
            case 2418:
            case 2419:
            case 2426:
            case 2432:
            case 2433:
            case 2436:
            case 2437:
            case 2438:
            case 2439:
            case 2444:
            case 2452:
            case 2460:
            case 2465:
            case 2468:
            case 2471:
            case 2474:
            case 2476:
            default:
                return null;
            case 2247:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432782035396L);
            case 2248:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596810738895499L);
            case 2251:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592674685649560L);
            case 2254:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351178508704L);
            case 2255:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235941182210L);
            case 2257:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235940985600L);
            case 2258:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235940592380L);
            case 2259:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235941116673L);
            case 2260:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235940657917L);
            case 2262:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597373379545900L);
            case 2263:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480026413565L);
            case 2264:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480026479102L);
            case 2265:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480026544639L);
            case 2266:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480026610176L);
            case 2271:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480026872323L);
            case 2272:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480026806786L);
            case 2273:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480026675713L);
            case 2274:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595612443216079L);
            case 2275:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593323226629234L);
            case 2276:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351178639777L);
            case 2280:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597450688957249L);
            case 2281:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597450689088322L);
            case 2282:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336115528872L);
            case 2283:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336115594409L);
            case 2284:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597463573859160L);
            case 2285:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593525089109361L);
            case 2286:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597476458761050L);
            case 2287:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593791376950780L);
            case 2288:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595122816944177L);
            case 2290:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597497933597531L);
            case 2291:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597497933663068L);
            case 2296:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592447052251694L);
            case 2297:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592447052317231L);
            case 2298:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077689323764L);
            case 2299:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594779219560281L);
            case 2300:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597519408434013L);
            case 2301:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703365302881L);
            case 2303:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593031171146654L);
            case 2304:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596093480405312L);
            case 2305:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703365368418L);
            case 2306:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593890161526299L);
            case 2307:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593890161591836L);
            case 2308:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593890161657373L);
            case 2309:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595028327532555L);
            case 2310:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596093480470849L);
            case 2311:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235941313283L);
            case 2312:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235941378820L);
            case 2313:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235941444357L);
            case 2314:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235941509894L);
            case 2315:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235941575431L);
            case 2316:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235941640968L);
            case 2317:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235941706505L);
            case 2318:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235941772042L);
            case 2319:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374765647078L);
            case 2320:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971039572773L);
            case 2324:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258803954708L);
            case 2326:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258804020245L);
            case 2327:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480027003396L);
            case 2328:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336115725483L);
            case 2329:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336115659946L);
            case 2330:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597588127910763L);
            case 2332:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877411726L);
            case 2333:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877477263L);
            case 2334:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877542800L);
            case 2335:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877608337L);
            case 2336:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877673874L);
            case 2337:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877739411L);
            case 2338:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877804948L);
            case 2339:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877870485L);
            case 2340:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877936022L);
            case 2341:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817878001559L);
            case 2342:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817877346189L);
            case 2343:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596093480536386L);
            case 2344:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597570948172643L);
            case 2345:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597570948238180L);
            case 2346:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597119976671978L);
            case 2347:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597119976737515L);
            case 2348:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597119976803052L);
            case 2350:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597716976929694L);
            case 2351:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597716977191841L);
            case 2352:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597716977060767L);
            case 2353:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597716977126304L);
            case 2354:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862938009633L);
            case 2355:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862938075170L);
            case 2356:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862938140707L);
            case 2357:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442759840255L);
            case 2358:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336115856556L);
            case 2359:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336115922093L);
            case 2360:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336115987630L);
            case 2361:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336116053167L);
            case 2362:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623873750424L);
            case 2363:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594658960344891L);
            case 2365:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597747041700834L);
            case 2366:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597450689153859L);
            case 2369:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595556608706739L);
            case 2370:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591862938206244L);
            case 2371:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593576629044608L);
            case 2373:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738451831720L);
            case 2374:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738451766183L);
            case 2375:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336116249778L);
            case 2376:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336116118704L);
            case 2377:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336116184241L);
            case 2378:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336116315315L);
            case 2379:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703365499492L);
            case 2380:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596703365433955L);
            case 2381:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432782232005L);
            case 2382:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592962449179405L);
            case 2383:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597798581373926L);
            case 2384:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056341493L);
            case 2385:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056407030L);
            case 2386:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056472567L);
            case 2387:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056538104L);
            case 2388:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056603641L);
            case 2389:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056669178L);
            case 2390:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056734715L);
            case 2391:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056800252L);
            case 2392:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056144882L);
            case 2393:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056210419L);
            case 2394:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056275956L);
            case 2395:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432782297542L);
            case 2398:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597450689416007L);
            case 2399:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597450689219396L);
            case 2400:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597450689284933L);
            case 2401:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597450689350470L);
            case 2402:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216579630753L);
            case 2403:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216579106459L);
            case 2404:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216579696290L);
            case 2405:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216579237532L);
            case 2406:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216579761827L);
            case 2407:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216579434142L);
            case 2408:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216578713240L);
            case 2409:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216579368605L);
            case 2410:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216579499679L);
            case 2411:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216578844313L);
            case 2412:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216579565216L);
            case 2413:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216578975386L);
            case 2414:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216579827364L);
            case 2415:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216579892901L);
            case 2416:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594216579958438L);
            case 2417:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597682617191296L);
            case 2420:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597863005817907L);
            case 2421:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593065527542696L);
            case 2422:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738451962793L);
            case 2423:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595114227206179L);
            case 2424:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595114227271716L);
            case 2425:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595114227337253L);
            case 2427:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595182946289736L);
            case 2428:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258804151318L);
            case 2429:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596827918961300L);
            case 2430:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596827919026837L);
            case 2431:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596827918895763L);
            case 2434:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597923135360073L);
            case 2435:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595182946355273L);
            case 2440:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235940723454L);
            case 2441:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235940788991L);
            case 2442:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597901660523587L);
            case 2443:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597901660589124L);
            case 2445:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598013330066517L);
            case 2446:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598013330000980L);
            case 2447:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820057062400L);
            case 2448:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056865789L);
            case 2449:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056931326L);
            case 2450:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820056996863L);
            case 2451:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786355454674L);
            case 2453:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594946723940340L);
            case 2454:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595341860341888L);
            case 2455:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598060574313572L);
            case 2456:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598047689411675L);
            case 2457:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786355520211L);
            case 2458:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597716977716130L);
            case 2459:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597716977781667L);
            case 2461:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598047689477212L);
            case 2462:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738452224940L);
            case 2463:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738452028330L);
            case 2464:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738452093867L);
            case 2466:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432782428615L);
            case 2467:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051919192255L);
            case 2469:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594409853028058L);
            case 2470:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595844371253519L);
            case 2472:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597570948434789L);
            case 2473:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077689389301L);
            case 2475:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598099229019245L);
            case 2477:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594495751849714L);
        }
    }

    private Long A0D(int i) {
        switch (i) {
            case 2488:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374765712615L);
            case 2489:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258804216855L);
            case 2490:
            case 2491:
            case 2493:
            case 2505:
            case 2507:
            case 2511:
            case 2512:
            case 2513:
            case 2514:
            case 2515:
            case 2516:
            case 2521:
            case 2523:
            case 2524:
            case 2525:
            case 2526:
            case 2527:
            case 2531:
            case 2534:
            case 2539:
            case 2542:
            case 2545:
            case 2548:
            case 2550:
            case 2551:
            case 2553:
            case 2554:
            case 2555:
            case 2556:
            case 2564:
            case 2565:
            case 2566:
            case 2567:
            case 2568:
            case 2570:
            case 2572:
            case 2573:
            case 2576:
            case 2578:
            case 2582:
            case 2584:
            case 2585:
            case 2586:
            case 2587:
            case 2589:
            case 2590:
            case 2591:
            case 2593:
            case 2599:
            case 2600:
            case 2611:
            case 2612:
            case 2613:
            case 2620:
            case 2621:
            case 2622:
            case 2626:
            case 2630:
            case 2631:
            case 2636:
            case 2640:
            case 2641:
            case 2642:
            case 2643:
            case 2644:
            case 2647:
            case 2648:
            case 2649:
            case 2652:
            case 2657:
            case 2661:
            case 2671:
            case 2673:
            case 2685:
            case 2686:
            case 2688:
            case 2692:
            case 2693:
            case 2694:
            case 2696:
            case 2704:
            case 2715:
            case 2716:
            case 2720:
            case 2721:
            case 2722:
            case 2723:
            case 2730:
            case 2737:
            case 2738:
            case 2743:
            case 2744:
            case 2745:
            case 2750:
            case 2751:
            default:
                return null;
            case 2492:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792104593246L);
            case 2494:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480027462152L);
            case 2495:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480027200005L);
            case 2496:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480027265542L);
            case 2497:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480027331079L);
            case 2498:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596093480798531L);
            case 2499:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598142178692219L);
            case 2500:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598163653528714L);
            case 2501:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598163653659787L);
            case 2502:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592447052382768L);
            case 2503:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432782887368L);
            case 2504:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432782952905L);
            case 2506:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593430607627569L);
            case 2508:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592081985143051L);
            case 2509:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792104658783L);
            case 2510:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792104724320L);
            case 2517:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820057193474L);
            case 2518:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820057127937L);
            case 2519:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971039703846L);
            case 2520:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971039769383L);
            case 2522:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336116511924L);
            case 2528:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595182946551882L);
            case 2529:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595182946617419L);
            case 2530:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595114227468326L);
            case 2532:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592855074865886L);
            case 2533:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593486434927951L);
            case 2535:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598313977449665L);
            case 2536:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598313977384128L);
            case 2537:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598313977515202L);
            case 2538:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595719817267445L);
            case 2540:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598296797514928L);
            case 2541:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971039834920L);
            case 2543:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593323226432624L);
            case 2544:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593323226498161L);
            case 2546:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480027658761L);
            case 2547:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351178770850L);
            case 2549:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597304660200224L);
            case 2552:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351178836387L);
            case 2557:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595182946748492L);
            case 2558:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595182946814029L);
            case 2559:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235941968651L);
            case 2560:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598313977580739L);
            case 2561:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271027842193L);
            case 2562:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593486434993488L);
            case 2563:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598404171697363L);
            case 2569:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598386991828173L);
            case 2571:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107752063278L);
            case 2574:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792104789857L);
            case 2575:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792104855394L);
            case 2577:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480027724298L);
            case 2579:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593288866628691L);
            case 2580:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595698343348466L);
            case 2581:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598425646664924L);
            case 2583:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598425646599387L);
            case 2588:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738452290477L);
            case 2592:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592176471212379L);
            case 2594:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596428488051136L);
            case 2595:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596922408438469L);
            case 2596:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596922408504006L);
            case 2597:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598494366010591L);
            case 2598:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598391286795470L);
            case 2601:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480027920909L);
            case 2602:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480027789835L);
            case 2603:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480027855372L);
            case 2604:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598533020716264L);
            case 2605:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480027986446L);
            case 2606:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598515840847075L);
            case 2607:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598515840912612L);
            case 2608:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157904193889L);
            case 2609:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157904259426L);
            case 2610:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336116708533L);
            case 2614:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593486435648849L);
            case 2615:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271027907730L);
            case 2616:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271027973267L);
            case 2617:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598571675421936L);
            case 2618:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598047689542749L);
            case 2619:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598047689608286L);
            case 2623:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598331157384390L);
            case 2624:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598331157449927L);
            case 2625:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598331157253317L);
            case 2627:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820057455619L);
            case 2628:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820057521156L);
            case 2629:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820057586693L);
            case 2632:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595612443281616L);
            case 2633:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598550200585455L);
            case 2634:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598545905618156L);
            case 2635:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598545905683693L);
            case 2637:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738452356014L);
            case 2638:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738452421551L);
            case 2639:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738452487088L);
            case 2645:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596883753601724L);
            case 2646:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336116774070L);
            case 2650:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598339747187912L);
            case 2651:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598339747253449L);
            case 2653:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592975337620293L);
            case 2654:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598597445225716L);
            case 2655:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336116839607L);
            case 2656:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592112045523262L);
            case 2658:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596329702885777L);
            case 2659:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596329702951314L);
            case 2660:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596329703016851L);
            case 2662:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374765909224L);
            case 2663:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374765974761L);
            case 2664:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374766105835L);
            case 2665:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593374766040298L);
            case 2666:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439191205185L);
            case 2667:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593439191270722L);
            case 2668:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598361222024396L);
            case 2669:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598601740258549L);
            case 2670:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598515840978149L);
            case 2672:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598541610650857L);
            case 2674:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432783608267L);
            case 2675:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432783149514L);
            case 2676:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432783673804L);
            case 2677:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598644689865983L);
            case 2678:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336116970681L);
            case 2679:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336116905144L);
            case 2680:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598640394898686L);
            case 2681:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107752194351L);
            case 2682:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769176830659L);
            case 2683:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623873881498L);
            case 2684:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623873947035L);
            case 2687:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623874274717L);
            case 2689:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623874143644L);
            case 2690:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623873815961L);
            case 2691:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598691934506256L);
            case 2695:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593245916693494L);
            case 2697:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597450689678152L);
            case 2698:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592077690044662L);
            case 2699:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598704819408145L);
            case 2700:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598704819473682L);
            case 2701:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594255234729641L);
            case 2702:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598764949015843L);
            case 2703:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594792104920931L);
            case 2705:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598760653983010L);
            case 2706:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598769244179752L);
            case 2707:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598769244245289L);
            case 2708:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598769244310826L);
            case 2709:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598769243917604L);
            case 2710:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598769243983141L);
            case 2711:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598769244048678L);
            case 2712:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598769244114215L);
            case 2713:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597450689743689L);
            case 2714:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597450689809226L);
            case 2717:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351178901924L);
            case 2718:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598790718754092L);
            case 2719:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432783870413L);
            case 2724:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596922408569543L);
            case 2725:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596922408635080L);
            case 2726:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596922408700617L);
            case 2727:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596922408766154L);
            case 2728:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596922408831691L);
            case 2729:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442760233472L);
            case 2731:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623874930081L);
            case 2732:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623874733471L);
            case 2733:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623874536862L);
            case 2734:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623874799008L);
            case 2735:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598816488557874L);
            case 2736:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595848666286354L);
            case 2739:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039031865504L);
            case 2740:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592039031799967L);
            case 2741:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738452618161L);
            case 2742:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598850848296252L);
            case 2746:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592786355585748L);
            case 2747:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594409853093595L);
            case 2748:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593791377081853L);
            case 2749:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595844371319056L);
            case 2752:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820057848838L);
        }
    }

    private Long A0E(int i) {
        switch (i) {
            case 2755:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258804347929L);
            case 2756:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235942099724L);
            case 2757:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235942165261L);
            case 2758:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271028104340L);
            case 2759:
            case 2760:
            case 2761:
            case 2762:
            case 2764:
            case 2765:
            case 2767:
            case 2776:
            case 2780:
            case 2788:
            case 2791:
            case 2797:
            case 2798:
            case 2799:
            case 2814:
            case 2815:
            case 2821:
            case 2825:
            case 2829:
            case 2830:
            case 2831:
            case 2833:
            case 2835:
            case 2847:
            case 2855:
            case 2856:
            case 2857:
            case 2864:
            case 2873:
            case 2874:
            case 2878:
            case 2885:
            case 2886:
            case 2887:
            case 2888:
            case 2895:
            case 2896:
            case 2901:
            case 2904:
            case 2906:
            case 2909:
            case 2910:
            case 2913:
            case 2930:
            case 2933:
            case 2939:
            case 2940:
            case 2943:
            case 2967:
            case 2983:
            case 2992:
            case 2993:
            case 2994:
            case 2997:
            case 3014:
            default:
                return null;
            case 2763:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820057914375L);
            case 2766:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598983992282468L);
            case 2768:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599057006726543L);
            case 2769:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235942230798L);
            case 2770:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351179098533L);
            case 2771:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442760299009L);
            case 2772:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599087071497665L);
            case 2773:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596093480929604L);
            case 2774:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596093480995141L);
            case 2775:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623875126692L);
            case 2777:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623875061155L);
            case 2778:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623874995618L);
            case 2779:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594409853224668L);
            case 2781:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599138611629519L);
            case 2782:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599138611301834L);
            case 2783:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599138611367371L);
            case 2784:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599138611498445L);
            case 2785:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599138611563982L);
            case 2786:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599138611105225L);
            case 2787:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599138611432908L);
            case 2789:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598296797580465L);
            case 2790:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599065596661152L);
            case 2792:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623875192229L);
            case 2793:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971039965993L);
            case 2794:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592971040031530L);
            case 2795:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442760364546L);
            case 2796:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599155791039954L);
            case 2800:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595359040145540L);
            case 2801:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595359040211077L);
            case 2802:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595359040276614L);
            case 2803:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820057979912L);
            case 2804:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820058045449L);
            case 2805:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820058110986L);
            case 2806:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598545905814766L);
            case 2807:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738452945846L);
            case 2808:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738453011383L);
            case 2809:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738452683698L);
            case 2810:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738452749235L);
            case 2811:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738452814772L);
            case 2812:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738453076920L);
            case 2813:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738452880309L);
            case 2816:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623875257766L);
            case 2817:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623875323303L);
            case 2818:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623875388840L);
            case 2819:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817878198168L);
            case 2820:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817878263705L);
            case 2822:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596535861185065L);
            case 2823:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258804282392L);
            case 2824:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593194377085932L);
            case 2826:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599207330581977L);
            case 2827:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593834326820359L);
            case 2828:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593881571329554L);
            case 2832:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432783935950L);
            case 2834:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598515841043686L);
            case 2836:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599392014175758L);
            case 2837:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594439917668070L);
            case 2838:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817878656922L);
            case 2839:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432784067023L);
            case 2840:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432784132560L);
            case 2841:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596239509031294L);
            case 2842:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820058176523L);
            case 2843:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593598104536461L);
            case 2844:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288935091696L);
            case 2845:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288934960622L);
            case 2846:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288935026159L);
            case 2848:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599417783979543L);
            case 2849:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599417784045080L);
            case 2850:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599417784110617L);
            case 2851:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599417784176154L);
            case 2852:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599417784307228L);
            case 2853:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599417784241691L);
            case 2854:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599426373914143L);
            case 2858:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456438685229L);
            case 2859:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456438750766L);
            case 2860:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456438816303L);
            case 2861:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456438881840L);
            case 2862:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456438947377L);
            case 2863:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439012914L);
            case 2865:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439143987L);
            case 2866:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439209524L);
            case 2867:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439275061L);
            case 2868:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439340598L);
            case 2869:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439406135L);
            case 2870:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439471672L);
            case 2871:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439537209L);
            case 2872:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439602746L);
            case 2875:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598210898234508L);
            case 2876:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598210898300045L);
            case 2877:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598210898365582L);
            case 2879:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469323652675L);
            case 2880:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469323914822L);
            case 2881:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530840213675L);
            case 2882:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596480028051983L);
            case 2883:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530840082601L);
            case 2884:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595530840148138L);
            case 2889:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599336179600901L);
            case 2890:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599336179666438L);
            case 2891:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599336179731975L);
            case 2892:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599336179797512L);
            case 2893:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599336179863049L);
            case 2894:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599336179928586L);
            case 2897:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599572402933342L);
            case 2898:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599572402998879L);
            case 2899:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599572403064416L);
            case 2900:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599572403129953L);
            case 2902:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599572403261026L);
            case 2903:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599572403326563L);
            case 2905:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599602467573356L);
            case 2907:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599623942409839L);
            case 2908:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623875454377L);
            case 2911:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599495093390931L);
            case 2912:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599495093456468L);
            case 2914:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817878787995L);
            case 2915:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817878984605L);
            case 2916:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817879181215L);
            case 2917:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599606762540653L);
            case 2918:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817880491941L);
            case 2919:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817880557478L);
            case 2920:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817880623015L);
            case 2921:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817880688552L);
            case 2922:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817880754089L);
            case 2923:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817880819626L);
            case 2924:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817880229793L);
            case 2925:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817874790254L);
            case 2926:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817874855791L);
            case 2927:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817880295330L);
            case 2928:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817880360867L);
            case 2929:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817880426404L);
            case 2931:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469323783749L);
            case 2932:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469323980359L);
            case 2934:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469324242504L);
            case 2935:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469323718212L);
            case 2936:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623875519914L);
            case 2937:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623875585451L);
            case 2938:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592726225584801L);
            case 2941:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817880885163L);
            case 2942:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596733429680752L);
            case 2944:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623875716524L);
            case 2945:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592769176961732L);
            case 2946:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599392014306832L);
            case 2947:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599392014241295L);
            case 2948:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738453142457L);
            case 2949:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271028169877L);
            case 2950:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061301824912L);
            case 2951:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061301890449L);
            case 2952:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061302021522L);
            case 2953:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738453207994L);
            case 2954:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881540533L);
            case 2955:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881606070L);
            case 2956:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817880950700L);
            case 2957:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881147311L);
            case 2958:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881212848L);
            case 2959:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881278385L);
            case 2960:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881081774L);
            case 2961:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881343922L);
            case 2962:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881409459L);
            case 2963:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881474996L);
            case 2964:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881016237L);
            case 2965:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591923066437693L);
            case 2966:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439668283L);
            case 2968:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599748496526972L);
            case 2969:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595114227730471L);
            case 2970:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442760626694L);
            case 2971:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442760757768L);
            case 2972:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442760692231L);
            case 2973:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881737143L);
            case 2974:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599860165611156L);
            case 2975:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599860165676693L);
            case 2976:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599860165742230L);
            case 2977:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599860165807767L);
            case 2978:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599860165873304L);
            case 2979:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599860165938841L);
            case 2980:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599860166004378L);
            case 2981:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597235942361871L);
            case 2982:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599881640447645L);
            case 2984:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442760430083L);
            case 2985:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599662597115508L);
            case 2986:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336117626044L);
            case 2987:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336117560507L);
            case 2988:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594903774201829L);
            case 2989:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594903774136292L);
            case 2990:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336117691581L);
            case 2991:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336117757118L);
            case 2995:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738453535675L);
            case 2996:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738453928893L);
            case 2998:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738453732284L);
            case 2999:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599881640513182L);
            case 3000:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599971834826416L);
            case 3001:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599971834760879L);
            case 3002:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157904324963L);
            case 3003:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157904456037L);
            case 3004:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157904587110L);
            case 3005:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599825805872773L);
            case 3006:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599714136723066L);
            case 3007:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271028235414L);
            case 3008:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271028300951L);
            case 3009:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271028366488L);
            case 3010:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271028432025L);
            case 3011:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288935157233L);
            case 3012:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599830100840071L);
            case 3013:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599911705218720L);
            case 3015:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593323226891379L);
            case 3016:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057734106836L);
            case 3017:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057734172373L);
            case 3018:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057734237910L);
            case 3019:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057734303447L);
            case 3020:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057734368984L);
            case 3021:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057734434521L);
            case 3022:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057734500058L);
            case 3023:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057734565595L);
            case 3024:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600057734631132L);
            case 3025:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336117822655L);
            case 3026:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599946065022629L);
            case 3027:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599946065088166L);
            case 3028:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599946064957092L);
        }
    }

    private Long A0F(int i) {
        switch (i) {
            case 3029:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599907410251423L);
            case 3030:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469324635726L);
            case 3031:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469324308041L);
            case 3032:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469324373578L);
            case 3033:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469324439115L);
            case 3034:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469324504652L);
            case 3035:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469324570189L);
            case 3036:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157904652647L);
            case 3037:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258804413466L);
            case 3038:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258804479003L);
            case 3039:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336117494970L);
            case 3040:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442760495620L);
            case 3041:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442760561157L);
            case 3042:
            case 3043:
            case 3044:
            case 3045:
            case 3046:
            case 3051:
            case 3054:
            case 3055:
            case 3056:
            case 3057:
            case 3058:
            case 3059:
            case 3060:
            case 3061:
            case 3062:
            case 3072:
            case 3073:
            case 3075:
            case 3076:
            case 3077:
            case 3081:
            case 3095:
            case 3123:
            case 3126:
            case 3128:
            case 3132:
            case 3134:
            case 3145:
            case 3148:
            case 3152:
            case 3155:
            case 3156:
            case 3157:
            case 3158:
            case 3159:
            case 3162:
            case 3166:
            case 3167:
            case 3168:
            case 3173:
            case 3174:
            case 3185:
            case 3207:
            case 3208:
            case 3209:
            case 3215:
            case 3216:
            case 3217:
            case 3232:
            case 3247:
            case 3248:
            case 3250:
            case 3251:
            case 3255:
            case 3261:
            case 3265:
            case 3293:
            case 3294:
            case 3295:
            case 3298:
            case 3299:
            default:
                return null;
            case 3047:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157904718184L);
            case 3048:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820058373134L);
            case 3049:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820058242060L);
            case 3050:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820058307597L);
            case 3052:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593890161919518L);
            case 3053:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987491274842L);
            case 3063:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049145745095L);
            case 3064:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049144237758L);
            case 3065:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049145679558L);
            case 3066:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049144303295L);
            case 3067:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049144368832L);
            case 3068:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049144434369L);
            case 3069:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049144499906L);
            case 3070:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049144565443L);
            case 3071:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049144630980L);
            case 3074:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049144827589L);
            case 3078:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623875782061L);
            case 3079:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738454125503L);
            case 3080:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738454059966L);
            case 3082:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600031964499643L);
            case 3083:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600031964565180L);
            case 3084:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600031964630717L);
            case 3085:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061302087059L);
            case 3086:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600031964303032L);
            case 3087:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600031964368569L);
            case 3088:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600031964434106L);
            case 3089:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599628237377136L);
            case 3090:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600096388812522L);
            case 3091:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258804741150L);
            case 3092:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258804610076L);
            case 3093:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258804675613L);
            case 3094:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592051919257792L);
            case 3096:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598142178823292L);
            case 3097:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600117863649011L);
            case 3098:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583256834L);
            case 3099:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583322371L);
            case 3100:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583387908L);
            case 3101:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583453445L);
            case 3102:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583518982L);
            case 3103:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583584519L);
            case 3104:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583650056L);
            case 3105:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583715593L);
            case 3106:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583781130L);
            case 3107:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583846667L);
            case 3108:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583912204L);
            case 3109:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583977741L);
            case 3110:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584043278L);
            case 3111:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584108815L);
            case 3112:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584174352L);
            case 3113:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584239889L);
            case 3114:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584305426L);
            case 3115:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584370963L);
            case 3116:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584436500L);
            case 3117:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584502037L);
            case 3118:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584567574L);
            case 3119:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584633111L);
            case 3120:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584698648L);
            case 3121:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584764185L);
            case 3122:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584829722L);
            case 3124:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186584960795L);
            case 3125:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186585026332L);
            case 3127:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186585157405L);
            case 3129:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583125760L);
            case 3130:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186583191297L);
            case 3131:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623875847598L);
            case 3133:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600233827766079L);
            case 3135:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432784394705L);
            case 3136:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258804806687L);
            case 3137:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596239509096831L);
            case 3138:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596527271250465L);
            case 3139:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881933754L);
            case 3140:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881802680L);
            case 3141:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881868217L);
            case 3142:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817881999291L);
            case 3143:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598391286861007L);
            case 3144:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598391286926544L);
            case 3146:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600233827897153L);
            case 3147:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600233827831616L);
            case 3149:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595612443347153L);
            case 3150:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595612443412690L);
            case 3151:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595612443478227L);
            case 3153:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258804937760L);
            case 3154:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258805068833L);
            case 3160:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049145810632L);
            case 3161:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049145876169L);
            case 3163:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623875978671L);
            case 3164:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599808626069123L);
            case 3165:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820058438671L);
            case 3169:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36595625328314588L);
            case 3170:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336117888192L);
            case 3171:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336117953729L);
            case 3172:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987491405915L);
            case 3175:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600341201948543L);
            case 3176:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600341202014080L);
            case 3177:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600117863714548L);
            case 3178:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258805330979L);
            case 3179:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258805396516L);
            case 3180:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258805658663L);
            case 3181:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258805527589L);
            case 3182:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258805593126L);
            case 3183:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258805265442L);
            case 3184:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600233828028226L);
            case 3186:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600053439270611L);
            case 3187:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600027669335735L);
            case 3188:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987491471452L);
            case 3189:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596351179164070L);
            case 3190:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593288866956372L);
            case 3191:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36591987491536989L);
            case 3192:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738454256576L);
            case 3193:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592666096108177L);
            case 3194:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599456439733820L);
            case 3195:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598391286992081L);
            case 3196:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598391287057618L);
            case 3197:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820058569744L);
            case 3198:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597820058700817L);
            case 3199:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817882064828L);
            case 3200:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598313977646276L);
            case 3201:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336118019266L);
            case 3202:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336118084803L);
            case 3203:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336118150340L);
            case 3204:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336118215877L);
            case 3205:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336118281414L);
            case 3206:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336118346951L);
            case 3210:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288935550451L);
            case 3211:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288935615988L);
            case 3212:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599288935222770L);
            case 3213:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600379856654210L);
            case 3214:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593486435714386L);
            case 3218:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600117863780085L);
            case 3219:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600117863845622L);
            case 3220:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271028563098L);
            case 3221:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442760954377L);
            case 3222:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336118674633L);
            case 3223:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336118609096L);
            case 3224:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469324701263L);
            case 3225:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469324766800L);
            case 3226:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469324832337L);
            case 3227:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817882130365L);
            case 3228:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817878853532L);
            case 3229:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817879050142L);
            case 3230:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817882195902L);
            case 3231:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594817879246752L);
            case 3233:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738454453187L);
            case 3234:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738454387650L);
            case 3235:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599469324897874L);
            case 3236:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271028628635L);
            case 3237:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271028694172L);
            case 3238:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049146072778L);
            case 3239:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600049146138315L);
            case 3240:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600508705738656L);
            case 3241:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593336118740170L);
            case 3242:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738454322113L);
            case 3243:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600530180509605L);
            case 3244:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738454649796L);
            case 3245:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36597738454715333L);
            case 3246:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600220942864190L);
            case 3249:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623876306354L);
            case 3252:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592107752259888L);
            case 3253:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271028825245L);
            case 3254:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271028890782L);
            case 3256:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442761216524L);
            case 3257:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442761282061L);
            case 3258:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442761085450L);
            case 3259:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36592442761150987L);
            case 3260:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593623876437427L);
            case 3262:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600616079855560L);
            case 3263:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600616080052169L);
            case 3264:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36594903774267366L);
            case 3266:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600233828290372L);
            case 3267:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600233828224835L);
            case 3268:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599392014372369L);
            case 3269:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599392014437906L);
            case 3270:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650439593933L);
            case 3271:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650439659470L);
            case 3272:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650439725007L);
            case 3273:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650439790544L);
            case 3274:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650439856081L);
            case 3275:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600650439921618L);
            case 3276:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186585354014L);
            case 3277:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600186585419551L);
            case 3278:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599417784372765L);
            case 3279:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432784525779L);
            case 3280:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432784591316L);
            case 3281:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432784656853L);
            case 3282:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432784722390L);
            case 3283:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432784787927L);
            case 3284:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432784853464L);
            case 3285:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432784919001L);
            case 3286:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432784984538L);
            case 3287:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432785050075L);
            case 3288:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432785115612L);
            case 3289:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271028956319L);
            case 3290:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596432784460242L);
            case 3291:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599662597246581L);
            case 3292:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596157904390500L);
            case 3296:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36593258805724200L);
            case 3297:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36598271029021856L);
            case 3300:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600706274168810L);
            case 3301:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36599061302283668L);
            case 3302:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36600706274234347L);
            case 3303:
                return AbstractC166997dE.A0i(C06090Tz.A05, this.A00, 36596527271316002L);
        }
    }

    private Long A0G(int i) {
        switch (i) {
            case 277:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592842189046492L);
            case 283:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592116339573055L);
            case 284:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039030620308L);
            case 285:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039030816918L);
            case 286:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039030227086L);
            case 287:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592374037610946L);
            case 288:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592374037742020L);
            case 289:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592374037676483L);
            case 294:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442757153269L);
            case 295:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975336375100L);
            case 296:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591961720750153L);
            case 302:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592412692382185L);
            case 307:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051917422771L);
            case 308:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592034735194252L);
            case 309:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593044052509602L);
            case 316:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592674685321875L);
            case 317:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592674685452949L);
            case 318:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592674685387412L);
            case 319:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592674685518486L);
            case 320:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592979628000070L);
            case 321:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592979628065607L);
            case 334:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592386923430351L);
            case 341:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051916636331L);
            case 342:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975336244026L);
            case 343:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975335654195L);
            case 344:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975334998828L);
            case 345:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975335719732L);
            case 346:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975336178489L);
            case 347:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975336440637L);
            case 348:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975336112952L);
            case 349:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975335457585L);
            case 350:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975336506174L);
            case 351:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975336571711L);
            case 352:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975335195439L);
            case 353:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975335064365L);
            case 354:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975335326512L);
            case 355:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975336047415L);
            case 356:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975335785269L);
            case 357:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975335850806L);
            case 358:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975335129902L);
            case 359:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975335588658L);
            case 373:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592176469967192L);
            case 382:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592008965390446L);
            case 385:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592919498457846L);
            case 390:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592378332840394L);
            case 393:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592176469311828L);
            case 398:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051917291698L);
            case 399:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051916570794L);
            case 401:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051917095089L);
            case 402:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975336309563L);
            case 403:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592386923626962L);
            case 404:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592386923233740L);
            case 405:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592386923495888L);
            case 406:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592386923561425L);
            case 407:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592386923299277L);
            case 408:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592386923168203L);
            case 420:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592966743294736L);
            case 421:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592966743491347L);
            case 425:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592176469377365L);
            case 426:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395513430492L);
            case 430:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395513233881L);
            case 434:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592563016237677L);
            case 435:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592580196041346L);
            case 436:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592580196106883L);
            case 437:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591974605717581L);
            case 438:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077685129438L);
            case 439:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592563016172140L);
            case 440:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592563016303214L);
            case 444:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862936502294L);
            case 446:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987490553940L);
            case 453:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592734814864035L);
            case 456:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591996080488552L);
            case 457:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592176469180755L);
            case 458:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971038065433L);
            case 465:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592584491008647L);
            case 466:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592069095063772L);
            case 467:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592520066499156L);
            case 470:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592060504998097L);
            case 474:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395513364955L);
            case 475:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591974605652044L);
            case 478:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395513299418L);
            case 479:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592691865256601L);
            case 480:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769174799024L);
            case 481:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051916832942L);
            case 484:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592180764082524L);
            case 486:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592833599111898L);
            case 494:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051917684917L);
            case 497:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592133519442248L);
            case 498:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395513758173L);
            case 500:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592472821989945L);
            case 501:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592812124340953L);
            case 502:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592812124275416L);
            case 503:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593074117280684L);
            case 509:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592588786041481L);
            case 510:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592588785975944L);
            case 511:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077685194975L);
            case 515:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592399807480296L);
            case 516:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395513823710L);
            case 517:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592472822055482L);
            case 518:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591923066044475L);
            case 519:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592112044605748L);
            case 520:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592112044671285L);
            case 521:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592112044736822L);
            case 523:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077685326048L);
            case 526:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592580196172420L);
            case 527:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592124929638722L);
            case 528:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592124929507648L);
            case 529:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592124929573185L);
            case 531:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592447052055084L);
            case 532:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078412247981L);
            case 533:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078412313518L);
            case 534:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078412379055L);
            case 535:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078412444592L);
            case 541:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971038130970L);
            case 542:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592008965455983L);
            default:
                return null;
        }
    }

    private Long A0H(int i) {
        switch (i) {
            case 551:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077685391585L);
            case 552:
            case 553:
            case 554:
            case 555:
            case 556:
            case 557:
            case 562:
            case 566:
            case 567:
            case 569:
            case 580:
            case 583:
            case 584:
            case 586:
            case 587:
            case 589:
            case 592:
            case 598:
            case 601:
            case 603:
            case 605:
            case 608:
            case 610:
            case 619:
            case 620:
            case 622:
            case 623:
            case 625:
            case 626:
            case 634:
            case 635:
            case 636:
            case 639:
            case 640:
            case 647:
            case 649:
            case 657:
            case 658:
            case 659:
            case 660:
            case 662:
            case 663:
            case 664:
            case 665:
            case 666:
            case 667:
            case 668:
            case 669:
            case 671:
            case 672:
            case 673:
            case 676:
            case 677:
            case 683:
            case 689:
            case 690:
            case 691:
            case 692:
            case 694:
            case 700:
            case 713:
            case 719:
            case 721:
            case 722:
            case 723:
            case 724:
            case 727:
            case 728:
            case 729:
            case 730:
            case 731:
            case 732:
            case 733:
            case 734:
            case 735:
            case 736:
            case 737:
            case 738:
            case 739:
            case 740:
            case 741:
            case 743:
            case 771:
            case 776:
            case 777:
            case 798:
            case 800:
            case 812:
            case 814:
            default:
                return null;
            case 558:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591978900684880L);
            case 559:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592133519507785L);
            case 560:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592558721466985L);
            case 561:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786354471624L);
            case 563:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786354537161L);
            case 564:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591978900750417L);
            case 565:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591991785586790L);
            case 568:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077685719266L);
            case 570:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078412772277L);
            case 571:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078412837814L);
            case 572:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078412641203L);
            case 573:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078412510129L);
            case 574:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078412706740L);
            case 575:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592833599177435L);
            case 576:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786354668235L);
            case 577:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786354602698L);
            case 578:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592502886629971L);
            case 579:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591983195586643L);
            case 581:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039031013529L);
            case 582:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039031079066L);
            case 585:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592610260943500L);
            case 588:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592202238919013L);
            case 590:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077685981411L);
            case 591:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769174930097L);
            case 593:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786354733772L);
            case 594:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078412575666L);
            case 595:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078412903351L);
            case 596:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591777037156355L);
            case 597:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591777037221892L);
            case 599:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593082707346368L);
            case 600:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593087002182593L);
            case 602:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593095592117186L);
            case 604:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077686112484L);
            case 606:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593104182051780L);
            case 607:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592060505063634L);
            case 609:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592580196237957L);
            case 611:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769175257782L);
            case 612:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769174995634L);
            case 613:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769175061171L);
            case 614:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769175126708L);
            case 615:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769175192245L);
            case 616:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592030440620168L);
            case 617:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051917815991L);
            case 618:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051917750454L);
            case 621:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592060505129171L);
            case 624:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593151426692063L);
            case 627:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591978900881490L);
            case 628:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593194376365030L);
            case 629:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593194376430567L);
            case 630:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593194376496104L);
            case 631:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077686309093L);
            case 632:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592447052120621L);
            case 633:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769175388855L);
            case 637:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769175519929L);
            case 638:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769175454392L);
            case 641:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769175585466L);
            case 642:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769175651003L);
            case 643:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769175716540L);
            case 644:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769175782077L);
            case 645:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258800874489L);
            case 646:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258800940026L);
            case 648:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593245915972597L);
            case 650:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593263095841864L);
            case 651:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593267390809161L);
            case 652:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078412968888L);
            case 653:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593254505907192L);
            case 654:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593280275711051L);
            case 655:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593284570678348L);
            case 656:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593288865645645L);
            case 661:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592202238984550L);
            case 670:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031168852886L);
            case 674:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593310340482143L);
            case 675:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593310340547680L);
            case 678:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593318930416738L);
            case 679:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593318930482275L);
            case 680:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593318930547812L);
            case 681:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593318930613349L);
            case 682:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039031144603L);
            case 684:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593323225384039L);
            case 685:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593323225449576L);
            case 686:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593323225515113L);
            case 687:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593323225580650L);
            case 688:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593327520351348L);
            case 693:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336110351479L);
            case 695:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336110482552L);
            case 696:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336110548089L);
            case 697:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336110613626L);
            case 698:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336110679163L);
            case 699:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336110744700L);
            case 701:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336110875773L);
            case 702:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336110941310L);
            case 703:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111006847L);
            case 704:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111072384L);
            case 705:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111137921L);
            case 706:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111203458L);
            case 707:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111268995L);
            case 708:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111334532L);
            case 709:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111400069L);
            case 710:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111465606L);
            case 711:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111531143L);
            case 712:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111596680L);
            case 714:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593177196495840L);
            case 715:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593288865776718L);
            case 716:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593370470024409L);
            case 717:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374765057245L);
            case 718:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374764991708L);
            case 720:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593396239893755L);
            case 725:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111727753L);
            case 726:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111793290L);
            case 742:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077686571238L);
            case 744:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592176470491482L);
            case 745:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593426304599292L);
            case 746:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439189697846L);
            case 747:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439189763383L);
            case 748:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439189828920L);
            case 749:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439189894457L);
            case 750:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439189959994L);
            case 751:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439190025531L);
            case 752:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439190091068L);
            case 753:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439190156605L);
            case 754:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439190222142L);
            case 755:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439189501235L);
            case 756:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439189566772L);
            case 757:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439189632309L);
            case 758:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593237326169075L);
            case 759:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592893728785132L);
            case 760:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593288865842255L);
            case 761:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258801005563L);
            case 762:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111858827L);
            case 763:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111924364L);
            case 764:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336111989901L);
            case 765:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507908978007L);
            case 766:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593516498978157L);
            case 767:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593525088847214L);
            case 768:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593525088912751L);
            case 769:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593525088978288L);
            case 770:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593486434207050L);
            case 772:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593288865973328L);
            case 773:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031169311639L);
            case 774:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336112120975L);
            case 775:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336112055438L);
            case 778:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593237326234612L);
            case 779:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430600287494L);
            case 780:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430600156420L);
            case 781:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430600353031L);
            case 782:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430600418568L);
            case 783:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430600484105L);
            case 784:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430599566589L);
            case 785:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430599632126L);
            case 786:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430599697663L);
            case 787:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430599763200L);
            case 788:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430599828737L);
            case 789:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430599894274L);
            case 790:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430599959811L);
            case 791:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430600221957L);
            case 792:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592537246761563L);
            case 793:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971038196507L);
            case 794:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971038262044L);
            case 795:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971038327581L);
            case 796:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971038393118L);
            case 797:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593486434272587L);
            case 799:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593542268781938L);
            case 801:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258801398783L);
            case 802:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258801464320L);
            case 803:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258801267710L);
            case 804:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258801071100L);
            case 805:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258801136637L);
            case 806:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593576628454781L);
            case 807:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593104182117317L);
            case 808:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623873160595L);
            case 809:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623873226132L);
            case 810:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623873095058L);
            case 811:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593632463029700L);
            case 813:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975336964928L);
            case 815:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593550858716532L);
            case 816:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593550858847605L);
            case 817:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593550858913142L);
            case 818:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593550858650995L);
            case 819:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862937354268L);
            case 820:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862937419805L);
            case 821:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862937485342L);
            case 822:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862937157659L);
            case 823:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862936633367L);
            case 824:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862936698904L);
            case 825:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862936764441L);
        }
    }

    private Long A0I(int i) {
        switch (i) {
            case 826:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862937616415L);
            case 827:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769176044222L);
            case 828:
            case 832:
            case 835:
            case 836:
            case 837:
            case 840:
            case 841:
            case 842:
            case 843:
            case 855:
            case 856:
            case 857:
            case 861:
            case 864:
            case 870:
            case 877:
            case 879:
            case 880:
            case 881:
            case 882:
            case 884:
            case 886:
            case 887:
            case 889:
            case 890:
            case 892:
            case 893:
            case 894:
            case 895:
            case 896:
            case 897:
            case 898:
            case 899:
            case 900:
            case 901:
            case 902:
            case 912:
            case 913:
            case 914:
            case 915:
            case 916:
            case 927:
            case 928:
            case 931:
            case 932:
            case 933:
            case 937:
            case 945:
            case 949:
            case 950:
            case 953:
            case 955:
            case 956:
            case 961:
            case 965:
            case 966:
            case 967:
            case 969:
            case 970:
            case 980:
            case 982:
            case 986:
            case 993:
            case 994:
            case 995:
            case 997:
            case 1002:
            case 1003:
            case 1004:
            case 1005:
            case 1006:
            case 1007:
            case 1008:
            case 1009:
            case 1010:
            case 1011:
            case 1012:
            case 1013:
            case 1014:
            case 1015:
            case 1016:
            case 1017:
            case 1018:
            case 1019:
            case 1020:
            case 1021:
            case 1022:
            case 1023:
            case 1028:
            case 1030:
            case 1031:
            case 1043:
            case 1044:
            case 1045:
            case 1046:
            case 1047:
            case 1056:
            case 1057:
            case 1058:
            case 1063:
            case 1071:
            case 1074:
            case 1075:
            case 1076:
            case 1077:
            case 1081:
            case 1082:
            case 1083:
            case 1084:
            case 1085:
            case 1086:
            case 1087:
            case 1090:
            case 1091:
            case 1093:
            default:
                return null;
            case 829:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593619578127761L);
            case 830:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786354864846L);
            case 831:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786354799309L);
            case 833:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786355061455L);
            case 834:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786355126992L);
            case 838:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593593808323978L);
            case 839:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593593808455051L);
            case 844:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593636758193608L);
            case 845:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593636758062534L);
            case 846:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593636758128071L);
            case 847:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593636757996997L);
            case 848:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336112252048L);
            case 849:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593636758259145L);
            case 850:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336112317585L);
            case 851:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336112383122L);
            case 852:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031169377176L);
            case 853:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593653937866192L);
            case 854:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593653937997265L);
            case 858:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623873291669L);
            case 859:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623873422742L);
            case 860:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971038524191L);
            case 862:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987490816086L);
            case 863:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987490947159L);
            case 865:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593705477473756L);
            case 866:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593735542244834L);
            case 867:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593735542375907L);
            case 868:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395513889247L);
            case 869:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593739837277668L);
            case 871:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077686898919L);
            case 872:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107750097182L);
            case 873:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593748427146731L);
            case 874:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593752722114028L);
            case 875:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593752722179565L);
            case 876:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593752722245102L);
            case 878:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593765607081459L);
            case 883:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593774196950519L);
            case 885:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971038655264L);
            case 888:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107750293791L);
            case 891:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592043325259939L);
            case 903:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593765607278068L);
            case 904:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593774197016056L);
            case 905:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593842916427273L);
            case 906:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258801529857L);
            case 907:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258801595394L);
            case 908:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258801660931L);
            case 909:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593834326492677L);
            case 910:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593834326558214L);
            case 911:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593804261721601L);
            case 917:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593791376885243L);
            case 918:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439190484287L);
            case 919:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592060505260245L);
            case 920:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592060505325782L);
            case 921:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592060505391319L);
            case 922:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592060505522392L);
            case 923:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592060505194708L);
            case 924:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395513954784L);
            case 925:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593872981198351L);
            case 926:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051918274744L);
            case 929:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593881571132944L);
            case 930:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593881571198481L);
            case 934:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593890161067541L);
            case 935:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593890161133078L);
            case 936:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593095592182723L);
            case 938:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594122089301591L);
            case 939:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594109204399688L);
            case 940:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593752722441712L);
            case 941:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593752722376175L);
            case 942:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971038720801L);
            case 943:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593765607343605L);
            case 944:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593847211394573L);
            case 946:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336112448659L);
            case 947:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594152154072667L);
            case 948:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594152154138204L);
            case 951:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051918536889L);
            case 952:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594147859105370L);
            case 954:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336112645270L);
            case 957:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430600680714L);
            case 958:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430600746251L);
            case 959:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430600811788L);
            case 960:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594177923876490L);
            case 962:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336112514196L);
            case 963:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336112579733L);
            case 964:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591777037418501L);
            case 968:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156449302109L);
            case 971:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039031210140L);
            case 972:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962448458499L);
            case 973:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962448196352L);
            case 974:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962448261889L);
            case 975:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962448327426L);
            case 976:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962448589573L);
            case 977:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962448524036L);
            case 978:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216578582167L);
            case 979:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592060505587929L);
            case 981:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593486434403660L);
            case 983:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442757677559L);
            case 984:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593194376627177L);
            case 985:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077687554280L);
            case 987:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430601270544L);
            case 988:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430601336081L);
            case 989:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430601008397L);
            case 990:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430601139470L);
            case 991:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430601205007L);
            case 992:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051918602426L);
            case 996:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077687816425L);
            case 998:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258801726468L);
            case 999:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107750490400L);
            case 1000:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594250938386088L);
            case 1001:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594250938320551L);
            case 1024:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031169704858L);
            case 1025:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031169639321L);
            case 1026:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971038786338L);
            case 1027:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430601467154L);
            case 1029:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594298182960812L);
            case 1032:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594311067862703L);
            case 1033:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962449113868L);
            case 1034:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962448786183L);
            case 1035:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962448851720L);
            case 1036:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962448917257L);
            case 1037:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962448982794L);
            case 1038:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962449048331L);
            case 1039:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962448720646L);
            case 1040:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594319657797296L);
            case 1041:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594319657928369L);
            case 1042:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077688013034L);
            case 1048:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862936829978L);
            case 1049:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594190808843917L);
            case 1050:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594190808909454L);
            case 1051:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594190808974991L);
            case 1052:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594190808778380L);
            case 1053:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592726225257117L);
            case 1054:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593104182182854L);
            case 1055:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594272413157034L);
            case 1059:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594358312568519L);
            case 1060:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442757743096L);
            case 1061:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077688144107L);
            case 1062:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975337030465L);
            case 1064:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594371197404874L);
            case 1065:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594371197470411L);
            case 1066:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592124930097475L);
            case 1067:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592124930163012L);
            case 1068:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592124930228549L);
            case 1069:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592124930294086L);
            case 1070:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592124930359623L);
            case 1072:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594302477993645L);
            case 1073:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594302478059182L);
            case 1078:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594358312699592L);
            case 1079:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594358312765129L);
            case 1080:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592756289897132L);
            case 1088:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594409852569303L);
            case 1089:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594409852110547L);
            case 1092:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594409852307156L);
            case 1094:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594409852438229L);
            case 1095:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594409852503766L);
            case 1096:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593323225711723L);
            case 1097:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593323225777260L);
            case 1098:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430601598227L);
        }
    }

    private Long A0J(int i) {
        switch (i) {
            case 3304:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703365696101L);
            case 3305:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703365761638L);
            case 3306:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703365958249L);
            case 3307:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703365827175L);
            case 3308:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703365892712L);
            case 3309:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623876699572L);
            case 3310:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623876765109L);
            case 3311:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600762108743669L);
            case 3312:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600762108809206L);
            case 3313:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600762108940279L);
            case 3314:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598541610781931L);
            case 3315:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598541610716394L);
            case 3316:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336119002318L);
            case 3317:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157904783721L);
            case 3318:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600783583580158L);
            case 3319:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600779288612860L);
            case 3320:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600233828486983L);
            case 3321:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600233828355909L);
            case 3322:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600233828421446L);
            case 3323:
            case 3326:
            case 3327:
            case 3330:
            case 3332:
            case 3363:
            case 3365:
            case 3377:
            case 3379:
            case 3383:
            case 3404:
            case 3405:
            case 3423:
            case 3440:
            case 3441:
            case 3443:
            case 3445:
            case 3447:
            case 3461:
            case 3463:
            case 3465:
            case 3466:
            case 3467:
            case 3468:
            case 3482:
            case 3486:
            case 3489:
            case 3492:
            case 3493:
            case 3495:
            case 3498:
            case 3513:
            case 3520:
            case 3527:
            case 3534:
            case 3538:
            case 3545:
            case 3547:
            case 3549:
            case 3554:
            case 3555:
            case 3556:
            case 3557:
            case 3562:
            case 3563:
            case 3565:
            default:
                return null;
            case 3324:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374766499052L);
            case 3325:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374766564589L);
            case 3328:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738454780870L);
            case 3329:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600457166065552L);
            case 3331:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600457166262161L);
            case 3333:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594409853355741L);
            case 3334:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738454977479L);
            case 3335:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442761347598L);
            case 3336:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336119133391L);
            case 3337:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987491602526L);
            case 3338:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051919716551L);
            case 3339:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051919323329L);
            case 3340:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051919388866L);
            case 3341:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051919454403L);
            case 3342:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051919519940L);
            case 3343:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051919585477L);
            case 3344:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051919651014L);
            case 3345:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336119198928L);
            case 3346:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029742762L);
            case 3347:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029349541L);
            case 3348:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029415078L);
            case 3349:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432785377757L);
            case 3350:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432785443294L);
            case 3351:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029087393L);
            case 3352:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029152930L);
            case 3353:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029218467L);
            case 3354:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029284004L);
            case 3355:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029480615L);
            case 3356:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029611688L);
            case 3357:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029677225L);
            case 3358:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593194377217005L);
            case 3359:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442761478671L);
            case 3360:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336118871244L);
            case 3361:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336118936781L);
            case 3362:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336118805707L);
            case 3364:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593598104798606L);
            case 3366:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593245916890103L);
            case 3367:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596527271447076L);
            case 3368:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596527271381539L);
            case 3369:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596527271512613L);
            case 3370:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442761544208L);
            case 3371:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432785508831L);
            case 3372:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432785574368L);
            case 3373:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862280272557L);
            case 3374:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862280338094L);
            case 3375:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862280403631L);
            case 3376:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455043016L);
            case 3378:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703366154858L);
            case 3380:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987491668063L);
            case 3381:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600976857108560L);
            case 3382:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600976857174097L);
            case 3384:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253188670L);
            case 3385:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253254207L);
            case 3386:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253319744L);
            case 3387:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253385281L);
            case 3388:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253450818L);
            case 3389:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253516355L);
            case 3390:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253581892L);
            case 3391:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253647429L);
            case 3392:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253712966L);
            case 3393:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253778503L);
            case 3394:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253844040L);
            case 3395:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895252729911L);
            case 3396:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895252795448L);
            case 3397:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895252860985L);
            case 3398:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895252926522L);
            case 3399:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895252992059L);
            case 3400:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253057596L);
            case 3401:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253123133L);
            case 3402:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597863005883444L);
            case 3403:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786355651285L);
            case 3406:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258805855273L);
            case 3407:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258805920810L);
            case 3408:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601019806912610L);
            case 3409:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601019807109220L);
            case 3410:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601019807043683L);
            case 3411:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601019806781536L);
            case 3412:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601019806847073L);
            case 3413:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599628237442673L);
            case 3414:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258805986347L);
            case 3415:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597519408499550L);
            case 3416:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820058766354L);
            case 3417:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258806051884L);
            case 3418:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600959677501518L);
            case 3419:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600959677435981L);
            case 3420:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600959677370444L);
            case 3421:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600959677567055L);
            case 3422:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601019807174757L);
            case 3424:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593598104864143L);
            case 3425:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601092821225590L);
            case 3426:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186585485088L);
            case 3427:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596527271578150L);
            case 3428:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592575901926014L);
            case 3429:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592558721663595L);
            case 3430:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258806117421L);
            case 3431:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596870868503220L);
            case 3432:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430607824178L);
            case 3433:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593310340744289L);
            case 3434:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600813648351240L);
            case 3435:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235942427408L);
            case 3436:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235942492945L);
            case 3437:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235942558482L);
            case 3438:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598515841109223L);
            case 3439:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600762109071352L);
            case 3442:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374767088878L);
            case 3444:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595556608772276L);
            case 3446:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057734696669L);
            case 3448:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057734762206L);
            case 3449:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049146203852L);
            case 3450:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049146269389L);
            case 3451:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049146334926L);
            case 3452:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049146400463L);
            case 3453:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601127181226112L);
            case 3454:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601127180963964L);
            case 3455:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601127181029501L);
            case 3456:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601127181095038L);
            case 3457:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601127181160575L);
            case 3458:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594903774332903L);
            case 3459:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594903774398440L);
            case 3460:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186585812769L);
            case 3462:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442761609745L);
            case 3464:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336119330001L);
            case 3469:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442761740819L);
            case 3470:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442761806356L);
            case 3471:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442761871893L);
            case 3472:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442761937430L);
            case 3473:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442761675282L);
            case 3474:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601268914884750L);
            case 3475:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442762002967L);
            case 3476:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820058831891L);
            case 3477:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820058897428L);
            case 3478:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601354814296227L);
            case 3479:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601354814230690L);
            case 3480:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601354814361764L);
            case 3481:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442762068504L);
            case 3483:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601367699263660L);
            case 3484:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601367699329197L);
            case 3485:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601367699394734L);
            case 3487:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601367699525807L);
            case 3488:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601367699591344L);
            case 3490:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592575901991551L);
            case 3491:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600508705804193L);
            case 3494:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593288867087445L);
            case 3496:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601371994099889L);
            case 3497:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601440713576660L);
            case 3499:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601371994165426L);
            case 3500:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601341929328798L);
            case 3501:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601341929394335L);
            case 3502:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601341929459872L);
            case 3503:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601462188413151L);
            case 3504:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601462188478688L);
            case 3505:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601462188544225L);
            case 3506:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432785902051L);
            case 3507:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432785967588L);
            case 3508:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432785705441L);
            case 3509:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432785770978L);
            case 3510:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601492253184228L);
            case 3511:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601470778413282L);
            case 3512:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595105637271579L);
            case 3514:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601530907889910L);
            case 3515:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608217628935L);
            case 3516:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608217694472L);
            case 3517:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601019807436902L);
            case 3518:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608217497861L);
            case 3519:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608217563398L);
            case 3521:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049146466000L);
            case 3522:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049146531537L);
            case 3523:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057734893279L);
            case 3524:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593288867152982L);
            case 3525:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601629692137786L);
            case 3526:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595646802757856L);
            case 3528:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600895253975113L);
            case 3529:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061302414742L);
            case 3530:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601685526712639L);
            case 3531:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601685526778176L);
            case 3532:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601685526843713L);
            case 3533:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601685526909250L);
            case 3535:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061302349205L);
            case 3536:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599417784438302L);
            case 3537:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599860166069915L);
            case 3539:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439191467331L);
            case 3540:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601389173969080L);
            case 3541:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601389174034617L);
            case 3542:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601389174100154L);
            case 3543:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601389174165691L);
            case 3544:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601389174231228L);
            case 3546:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107752325425L);
            case 3548:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820059028501L);
            case 3550:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597588128041836L);
            case 3551:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051919782088L);
            case 3552:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592043325325476L);
            case 3553:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336119395538L);
            case 3558:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601840145535349L);
            case 3559:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593598104929680L);
            case 3560:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442762265113L);
            case 3561:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596733429811826L);
            case 3564:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592893728916205L);
            case 3566:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601685526974787L);
            case 3567:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432786033125L);
            case 3568:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596733429746289L);
            case 3569:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051919847625L);
            case 3570:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051919913162L);
            case 3571:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820059094038L);
            case 3572:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820059159575L);
            case 3573:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926044881293L);
            case 3574:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926045208976L);
            case 3575:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926045274513L);
            case 3576:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926045077902L);
            case 3577:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926045143439L);
            case 3578:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601947519717788L);
        }
    }

    private Long A0K(int i) {
        switch (i) {
            case 3581:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616807301402L);
            case 3582:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616807366939L);
            case 3583:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061302480279L);
            case 3584:
            case 3585:
            case 3586:
            case 3587:
            case 3629:
            case 3637:
            case 3645:
            case 3646:
            case 3651:
            case 3662:
            case 3673:
            case 3684:
            case 3687:
            case 3690:
            case 3725:
            case 3726:
            case 3727:
            case 3728:
            case 3729:
            case 3730:
            case 3731:
            case 3732:
            case 3733:
            case 3734:
            case 3735:
            case 3736:
            case 3737:
            case 3768:
            case 3769:
            case 3770:
            case 3799:
            case 3805:
            case 3820:
            case 3821:
            case 3835:
            case 3846:
            default:
                return null;
            case 3588:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597863005948981L);
            case 3589:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016239587783L);
            case 3590:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016239653320L);
            case 3591:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016239718857L);
            case 3592:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016239784394L);
            case 3593:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016239849931L);
            case 3594:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016239915468L);
            case 3595:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016239981005L);
            case 3596:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240046542L);
            case 3597:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240112079L);
            case 3598:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240177616L);
            case 3599:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240243153L);
            case ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS /* 3600 */:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016239194561L);
            case 3601:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016239260098L);
            case 3602:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016239325635L);
            case 3603:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016239391172L);
            case 3604:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016239456709L);
            case 3605:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016239522246L);
            case 3606:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029808299L);
            case 3607:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029873836L);
            case 3608:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602033419063852L);
            case 3609:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616807432476L);
            case 3610:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442762330650L);
            case 3611:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597450690005835L);
            case 3612:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024829850085L);
            case 3613:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024829915622L);
            case 3614:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830112233L);
            case 3615:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830177770L);
            case 3616:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830243307L);
            case 3617:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024829653474L);
            case 3618:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024829719011L);
            case 3619:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029124751880L);
            case 3620:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029124817417L);
            case 3621:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029124882954L);
            case 3622:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029124948491L);
            case 3623:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125014028L);
            case 3624:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125079565L);
            case 3625:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125145102L);
            case 3626:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125210639L);
            case 3627:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029124620806L);
            case 3628:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029124686343L);
            case 3630:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024829981159L);
            case 3631:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830046696L);
            case 3632:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024829784548L);
            case 3633:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600117863976695L);
            case 3634:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608217825546L);
            case 3635:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608217760009L);
            case 3636:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608217891083L);
            case 3638:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830374381L);
            case 3639:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125276176L);
            case 3640:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125341713L);
            case 3641:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830308844L);
            case 3642:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616807498013L);
            case 3643:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598296797646002L);
            case 3644:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598296797711539L);
            case 3647:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616807563550L);
            case 3648:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616807629087L);
            case 3649:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593194377282542L);
            case 3650:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592043325391013L);
            case 3652:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594873710217175L);
            case 3653:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432786098662L);
            case 3654:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432786164199L);
            case 3655:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601685527040324L);
            case 3656:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601685527105861L);
            case 3657:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601685527171398L);
            case 3658:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601685527236935L);
            case 3659:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592043325456550L);
            case 3660:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593791377147390L);
            case 3661:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602540225270457L);
            case 3663:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601092821422199L);
            case 3664:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439191598405L);
            case 3665:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439191532868L);
            case 3666:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531635860133L);
            case 3667:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531635925670L);
            case 3668:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531635991207L);
            case 3669:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057735155427L);
            case 3670:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057735220964L);
            case 3671:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057735286501L);
            case 3672:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057735352038L);
            case 3674:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057734958816L);
            case 3675:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057735024353L);
            case 3676:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057735089890L);
            case 3677:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608217956620L);
            case 3678:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600976857370706L);
            case 3679:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057735483111L);
            case 3680:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531635270302L);
            case 3681:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531635335839L);
            case 3682:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531635401376L);
            case 3683:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531635466913L);
            case 3685:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531635597986L);
            case 3686:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531635663523L);
            case 3688:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531635794596L);
            case 3689:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593288867218519L);
            case 3691:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439864893L);
            case 3692:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595646802823393L);
            case 3693:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623877027256L);
            case 3694:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623876896182L);
            case 3695:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623876961719L);
            case 3696:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592043325587624L);
            case 3697:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926045405587L);
            case 3698:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926045471124L);
            case 3699:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926045340050L);
            case 3700:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820059225112L);
            case 3701:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616807891232L);
            case 3702:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820059290649L);
            case 3703:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336120116435L);
            case 3704:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432786622954L);
            case 3705:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432786819563L);
            case 3706:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432786885100L);
            case 3707:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432786360808L);
            case 3708:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432786557417L);
            case 3709:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592043325522087L);
            case 3710:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125407250L);
            case 3711:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125472787L);
            case 3712:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125538324L);
            case 3713:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125603861L);
            case 3714:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125669398L);
            case 3715:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125734935L);
            case 3716:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830439918L);
            case 3717:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830505455L);
            case 3718:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830570992L);
            case 3719:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830636529L);
            case 3720:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830702066L);
            case 3721:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830767603L);
            case 3722:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616807956769L);
            case 3723:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595625328380125L);
            case 3724:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432786950637L);
            case 3738:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602574584943295L);
            case 3739:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817882523584L);
            case 3740:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817882589121L);
            case 3741:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817882654658L);
            case 3742:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817882720195L);
            case 3743:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817882785732L);
            case 3744:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817882458047L);
            case 3745:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601260325212300L);
            case 3746:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031171277727L);
            case 3747:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602587469845194L);
            case 3748:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593370470155483L);
            case 3749:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455108553L);
            case 3750:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455174090L);
            case 3751:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455239627L);
            case 3752:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601947519848861L);
            case 3753:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600762109202425L);
            case 3754:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081985339660L);
            case 3755:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602630419518161L);
            case 3756:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987491930208L);
            case 3757:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602596059779788L);
            case 3758:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442762396187L);
            case 3759:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602690549191416L);
            case 3760:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602690549256953L);
            case 3761:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602690549322490L);
            case 3762:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602690549125879L);
            case 3763:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258806182958L);
            case 3764:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602699138994939L);
            case 3765:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602699139060476L);
            case 3766:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602699139191549L);
            case 3767:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987491995745L);
            case 3771:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862938468392L);
            case 3772:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862938533929L);
            case 3773:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862938271781L);
            case 3774:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862938337318L);
            case 3775:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862938402855L);
            case 3776:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616808022306L);
            case 3777:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746383700751L);
            case 3778:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746383766288L);
            case 3779:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746383831825L);
            case 3780:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746383897362L);
            case 3781:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746383962899L);
            case 3782:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384028436L);
            case 3783:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384093973L);
            case 3784:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384159510L);
            case 3785:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384225047L);
            case 3786:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384290584L);
            case 3787:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384356121L);
            case 3788:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384421658L);
            case 3789:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384487195L);
            case 3790:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384552732L);
            case 3791:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384618269L);
            case 3792:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384683806L);
            case 3793:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384749343L);
            case 3794:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830833140L);
            case 3795:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125800472L);
            case 3796:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384814880L);
            case 3797:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746383635214L);
            case 3798:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987492061282L);
            case 3800:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602763563569980L);
            case 3801:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602763563635517L);
            case 3802:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602763563504443L);
            case 3803:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602810808537929L);
            case 3804:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602810808603466L);
            case 3806:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650440052692L);
            case 3807:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650440118229L);
            case 3808:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650439987155L);
            case 3809:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602763563701054L);
            case 3810:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600976857436243L);
            case 3811:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600976857501780L);
            case 3812:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602840872915795L);
            case 3813:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602840872981332L);
            case 3814:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602840873046869L);
            case 3815:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602879527621469L);
            case 3816:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602879527687006L);
            case 3817:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602879527752543L);
            case 3818:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602879527818080L);
            case 3819:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602879527883617L);
            case 3822:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602892412588898L);
            case 3823:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602896707490659L);
            case 3824:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240308690L);
            case 3825:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258806248495L);
            case 3826:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240439764L);
            case 3827:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240505301L);
            case 3828:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240570838L);
            case 3829:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240374227L);
            case 3830:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608218415373L);
            case 3831:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608218480910L);
            case 3832:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186586140450L);
            case 3833:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602986901803889L);
            case 3834:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608218546447L);
            case 3836:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258806314032L);
            case 3837:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820059356186L);
            case 3838:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456440061504L);
            case 3839:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456440127041L);
            case 3840:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439930430L);
            case 3841:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439995967L);
            case 3842:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596733429877363L);
            case 3843:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595341860407425L);
            case 3844:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817882851269L);
            case 3845:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603115750822791L);
            case 3847:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987492126819L);
            case 3848:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186586205987L);
            case 3849:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186586271524L);
            case 3850:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603132930691978L);
            case 3851:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061302611352L);
            case 3852:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603077096379267L);
            case 3853:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603077096182658L);
        }
    }

    private Long A0L(int i) {
        switch (i) {
            case 3855:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051920502990L);
            case 3856:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051920306379L);
            case 3857:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051920371916L);
            case 3858:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051920437453L);
            case 3859:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830898677L);
            case 3860:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024830964214L);
            case 3861:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125866009L);
            case 3862:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029125931546L);
            case 3863:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384880417L);
            case 3864:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746384945954L);
            case 3865:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593881571395091L);
            case 3866:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616808087843L);
            case 3867:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603205945136030L);
            case 3868:
            case 3879:
            case 3886:
            case 3897:
            case 3898:
            case 3901:
            case 3903:
            case 3915:
            case 3923:
            case 3925:
            case 3930:
            case 3946:
            case 3968:
            case 3970:
            case 3974:
            case 3975:
            case 3990:
            case 3996:
            case CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS /* 4000 */:
            case 4013:
            case 4027:
            case 4028:
            case 4031:
            case 4052:
            case 4055:
            case 4060:
            case 4066:
            case 4067:
            case 4072:
            case 4074:
            case 4075:
            case 4076:
            case 4077:
            case 4079:
            case 4082:
            case 4090:
            case 4093:
            case 4096:
            case 4098:
            case 4099:
            case 4100:
            case 4111:
            case 4115:
            case 4116:
            default:
                return null;
            case 3869:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480028183057L);
            case 3870:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480028248594L);
            case 3871:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480028117520L);
            case 3872:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374767154415L);
            case 3873:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597450690071372L);
            case 3874:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603253189776297L);
            case 3875:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603253189841834L);
            case 3876:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616808218916L);
            case 3877:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599538043457117L);
            case 3878:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616808284453L);
            case 3880:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602578880238273L);
            case 3881:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602578880172736L);
            case 3882:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820059421723L);
            case 3883:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820059487260L);
            case 3884:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288935681525L);
            case 3885:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288935747062L);
            case 3887:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602578880500419L);
            case 3888:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602578880565956L);
            case 3889:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602578880631493L);
            case 3890:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442762461724L);
            case 3891:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442762527261L);
            case 3892:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616808349990L);
            case 3893:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432787081710L);
            case 3894:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258806576177L);
            case 3895:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258806641714L);
            case 3896:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987492192356L);
            case 3899:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602578880434882L);
            case 3900:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593765607802358L);
            case 3902:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258806707251L);
            case 3904:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600976857567317L);
            case 3905:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603446463435705L);
            case 3906:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603446463501242L);
            case 3907:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603446463566779L);
            case 3908:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603446463304631L);
            case 3909:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603446463370168L);
            case 3910:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603424988468146L);
            case 3911:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603424988533683L);
            case 3912:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603424988599220L);
            case 3913:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603424988664757L);
            case 3914:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603424988730294L);
            case 3916:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608218808592L);
            case 3917:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862280469168L);
            case 3918:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862280534705L);
            case 3919:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593001103098759L);
            case 3920:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240636375L);
            case 3921:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049146597074L);
            case 3922:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601019807502439L);
            case 3924:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602630419714770L);
            case 3926:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602578880828102L);
            case 3927:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603334794154923L);
            case 3928:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600813649006607L);
            case 3929:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600813648941070L);
            case 3931:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600813648809996L);
            case 3932:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600813648416777L);
            case 3933:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600813648875533L);
            case 3934:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600813648547850L);
            case 3935:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600813648613387L);
            case 3936:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603132930757515L);
            case 3937:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603132930823052L);
            case 3938:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603132930888589L);
            case 3939:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598047689739359L);
            case 3940:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862938599466L);
            case 3941:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862938730539L);
            case 3942:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029939373L);
            case 3943:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271030004910L);
            case 3944:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603132930954126L);
            case 3945:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616808415527L);
            case 3947:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594779219625818L);
            case 3948:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029126390302L);
            case 3949:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029126455839L);
            case 3950:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746385208099L);
            case 3951:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746385273636L);
            case 3952:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746385339173L);
            case 3953:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746385404710L);
            case 3954:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746385470247L);
            case 3955:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024831226359L);
            case 3956:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024831291896L);
            case 3957:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024831357433L);
            case 3958:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024831422970L);
            case 3959:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024831488507L);
            case 3960:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029126193691L);
            case 3961:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029126259228L);
            case 3962:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029126324765L);
            case 3963:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616808481064L);
            case 3964:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432787147247L);
            case 3965:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603571017356241L);
            case 3966:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792105183076L);
            case 3967:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531636056744L);
            case 3969:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603528067683273L);
            case 3971:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024831619580L);
            case 3972:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029126586912L);
            case 3973:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746385601320L);
            case 3976:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926045602198L);
            case 3977:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926045667735L);
            case 3978:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926045733272L);
            case 3979:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926045798809L);
            case 3980:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926045864346L);
            case 3981:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601926045536661L);
            case 3982:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288935878135L);
            case 3983:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288935943672L);
            case 3984:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288936009209L);
            case 3985:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507910157664L);
            case 3986:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029126783522L);
            case 3987:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746385666857L);
            case 3988:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746385797930L);
            case 3989:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029126652449L);
            case 3991:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351179360679L);
            case 3992:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235942624019L);
            case 3993:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456440192578L);
            case 3994:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240701912L);
            case 3995:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600233828552520L);
            case 3997:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650440249302L);
            case 3998:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240767449L);
            case 3999:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603768585851872L);
            case 4001:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603506592846783L);
            case 4002:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598047689804896L);
            case 4003:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603802945786857L);
            case 4004:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603802945852394L);
            case 4005:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603802945917931L);
            case 4006:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603802945983468L);
            case 4007:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603802946049005L);
            case 4008:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603802946114542L);
            case 4009:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603802946180079L);
            case 4010:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603802946245616L);
            case 4011:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603802945655783L);
            case 4012:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603802945721320L);
            case 4014:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432787212784L);
            case 4015:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024831750653L);
            case 4016:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029126914595L);
            case 4017:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746385929003L);
            case 4018:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598704819539219L);
            case 4019:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024832012799L);
            case 4020:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029126980132L);
            case 4021:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029127176741L);
            case 4022:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746385994540L);
            case 4023:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746386256685L);
            case 4024:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024831816190L);
            case 4025:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061302742425L);
            case 4026:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061302807962L);
            case 4029:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602763563766591L);
            case 4030:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36603115750888328L);
            case 4032:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602578881024711L);
            case 4033:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746386387758L);
            case 4034:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024832143872L);
            case 4035:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029127307814L);
            case 4036:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971040162603L);
            case 4037:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507910288737L);
            case 4038:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029127373351L);
            case 4039:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746386453295L);
            case 4040:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024832274946L);
            case 4041:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029127438888L);
            case 4042:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746386518832L);
            case 4043:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024832209409L);
            case 4044:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597863006014518L);
            case 4045:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597863006080055L);
            case 4046:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240832986L);
            case 4047:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240898523L);
            case 4048:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016240964060L);
            case 4049:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016241029597L);
            case 4050:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602578881090248L);
            case 4051:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604034873955342L);
            case 4053:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593834326885896L);
            case 4054:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593791377212927L);
            case 4056:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623877092793L);
            case 4057:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442762658334L);
            case 4058:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016241160670L);
            case 4059:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604095003366432L);
            case 4061:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604107888268321L);
            case 4062:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597798581504999L);
            case 4063:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600779288678397L);
            case 4064:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604150837941289L);
            case 4065:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600783583645695L);
            case 4068:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597588128107373L);
            case 4069:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593318930678886L);
            case 4070:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507910354274L);
            case 4071:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594113500612180L);
            case 4073:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602763563897664L);
            case 4078:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604361291338811L);
            case 4080:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604382766175300L);
            case 4081:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600508706066338L);
            case 4083:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336121230549L);
            case 4084:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336121165012L);
            case 4085:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258806838324L);
            case 4086:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258806903861L);
            case 4087:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592893729309422L);
            case 4088:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608219201812L);
            case 4089:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608218874129L);
            case 4091:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608219005202L);
            case 4092:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608219070739L);
            case 4094:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604318341665847L);
            case 4095:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374767219952L);
            case 4097:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616808677673L);
            case 4101:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650440511447L);
            case 4102:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650440904665L);
            case 4103:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650440839128L);
            case 4104:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604563154801745L);
            case 4105:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604623284409447L);
            case 4106:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604623284474984L);
            case 4107:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604623284343910L);
            case 4108:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792105510757L);
            case 4109:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792105576294L);
            case 4110:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820059749405L);
            case 4112:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604687708918893L);
            case 4113:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336121296086L);
            case 4114:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597798581570536L);
            case 4117:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604700593755250L);
            case 4118:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616808743210L);
            case 4119:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604365586306108L);
            case 4120:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599769971363455L);
            case 4121:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600976857632854L);
            case 4122:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600976857698391L);
            case 4123:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288936336890L);
            case 4124:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650441035738L);
            case 4125:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792105641831L);
            case 4126:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746386584369L);
            case 4127:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024832340483L);
            case 4128:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029127504425L);
            case 4129:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530840279212L);
            case 4130:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604855212643464L);
        }
    }

    private Long A0M(int i) {
        switch (i) {
            case 4131:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604855212709001L);
            case 4132:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604855212577927L);
            case 4133:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604979766629567L);
            case 4134:
            case 4143:
            case 4154:
            case 4155:
            case 4156:
            case 4158:
            case 4175:
            case 4176:
            case 4178:
            case 4179:
            case 4196:
            case 4197:
            case 4200:
            case 4201:
            case 4203:
            case 4204:
            case 4213:
            case 4215:
            case 4223:
            case 4229:
            case 4231:
            case 4250:
            case 4252:
            case 4257:
            case 4259:
            case 4267:
            case 4272:
            case 4278:
            case 4303:
            case 4304:
            case 4305:
            case 4306:
            case 4307:
            case 4308:
            case 4340:
            case 4345:
            case 4354:
            case 4371:
            case 4398:
            default:
                return null;
            case 4135:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455305164L);
            case 4136:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455370701L);
            case 4137:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455436238L);
            case 4138:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107752390962L);
            case 4139:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455501775L);
            case 4140:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455567312L);
            case 4141:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455632849L);
            case 4142:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455698386L);
            case 4144:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455763923L);
            case 4145:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455829460L);
            case 4146:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455894997L);
            case 4147:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604709183689843L);
            case 4148:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604709183755380L);
            case 4149:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395514413541L);
            case 4150:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595612443609301L);
            case 4151:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595612443674838L);
            case 4152:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595612443740375L);
            case 4153:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595612443543764L);
            case 4157:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592374038397384L);
            case 4159:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987492257893L);
            case 4160:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604807967937661L);
            case 4161:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650441166811L);
            case 4162:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592898023817968L);
            case 4163:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592374038462921L);
            case 4164:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233170093291L);
            case 4165:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233170158828L);
            case 4166:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233170224365L);
            case 4167:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233169700069L);
            case 4168:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233169765606L);
            case 4169:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233169831143L);
            case 4170:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233169896680L);
            case 4171:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233169962217L);
            case 4172:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233170027754L);
            case 4173:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604988356564160L);
            case 4174:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605314774078717L);
            case 4177:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288936730108L);
            case 4180:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592898023883505L);
            case 4181:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592575902515841L);
            case 4182:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592575902450304L);
            case 4183:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081985536270L);
            case 4184:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081985470733L);
            case 4185:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288936402427L);
            case 4186:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605048486106310L);
            case 4187:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605048486171847L);
            case 4188:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605164450223327L);
            case 4189:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605164450288864L);
            case 4190:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817882916806L);
            case 4191:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862280731314L);
            case 4192:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233170420975L);
            case 4193:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233170486512L);
            case 4194:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233170289902L);
            case 4195:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233170552049L);
            case 4198:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081985601807L);
            case 4199:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605550997280040L);
            case 4202:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605499457672479L);
            case 4205:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599825805938310L);
            case 4206:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595157177337922L);
            case 4207:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595157177403459L);
            case 4208:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595157177468996L);
            case 4209:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439191663942L);
            case 4210:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602699139453695L);
            case 4211:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602699139388158L);
            case 4212:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596733429942900L);
            case 4214:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605237464667382L);
            case 4216:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600976857895001L);
            case 4217:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600976857829464L);
            case 4218:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605808695383389L);
            case 4219:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605804400350554L);
            case 4220:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605804400416091L);
            case 4221:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605808695317852L);
            case 4222:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288936926717L);
            case 4224:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432787278321L);
            case 4225:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602699139519232L);
            case 4226:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507910550883L);
            case 4227:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258807034935L);
            case 4228:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258806969398L);
            case 4230:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531636187817L);
            case 4232:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439191729479L);
            case 4233:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595015442958341L);
            case 4234:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595015443023878L);
            case 4235:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595015443089415L);
            case 4236:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595015442827267L);
            case 4237:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595015442892804L);
            case 4238:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606225307145605L);
            case 4239:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606225307211142L);
            case 4240:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606190947407232L);
            case 4241:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442762723871L);
            case 4242:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442762789408L);
            case 4243:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606315501524403L);
            case 4244:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531636318891L);
            case 4245:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531636384428L);
            case 4246:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531636449965L);
            case 4247:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531636253354L);
            case 4248:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602699139584769L);
            case 4249:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602699139650306L);
            case 4251:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606332681328062L);
            case 4253:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061302873499L);
            case 4254:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061302939036L);
            case 4255:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820059880478L);
            case 4256:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593576629175681L);
            case 4258:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606427170608588L);
            case 4260:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604807968068735L);
            case 4261:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604807968330880L);
            case 4262:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604807968396417L);
            case 4263:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606551724660207L);
            case 4264:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604807968461954L);
            case 4265:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604807968003198L);
            case 4266:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606551724725744L);
            case 4268:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547429692893L);
            case 4269:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547429758430L);
            case 4270:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547429823967L);
            case 4271:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606315501655476L);
            case 4273:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600783583776768L);
            case 4274:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601058461618291L);
            case 4275:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600813649072144L);
            case 4276:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351179426216L);
            case 4277:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351179491753L);
            case 4279:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507910616420L);
            case 4280:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606779357992457L);
            case 4281:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606779358385675L);
            case 4282:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606779358320138L);
            case 4283:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606775062959624L);
            case 4284:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591974605914191L);
            case 4285:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606856667338256L);
            case 4286:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606405695837634L);
            case 4287:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602896707556196L);
            case 4288:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547430020576L);
            case 4289:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547430151650L);
            case 4290:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547430086113L);
            case 4291:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061303004573L);
            case 4292:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061303070110L);
            case 4293:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061303135647L);
            case 4294:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608219660568L);
            case 4295:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608219398421L);
            case 4296:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608219463958L);
            case 4297:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601608219529495L);
            case 4298:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607028466030110L);
            case 4299:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547430217187L);
            case 4300:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607045645899296L);
            case 4301:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606942566684185L);
            case 4302:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594113500677717L);
            case 4309:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600813649137681L);
            case 4310:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912966061L);
            case 4311:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306913228209L);
            case 4312:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306913031598L);
            case 4313:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306913293746L);
            case 4314:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306913097135L);
            case 4315:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912769450L);
            case 4316:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912834987L);
            case 4317:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306911655321L);
            case 4318:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306911720858L);
            case 4319:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306911786395L);
            case 4320:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306911851932L);
            case 4321:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306911917469L);
            case 4322:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306911983006L);
            case 4323:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912048543L);
            case 4324:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912114080L);
            case 4325:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912179617L);
            case 4326:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912245154L);
            case 4327:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912310691L);
            case 4328:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912376228L);
            case 4329:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912441765L);
            case 4330:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912507302L);
            case 4331:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306911524247L);
            case 4332:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912900524L);
            case 4333:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306911589784L);
            case 4334:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306913162672L);
            case 4335:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912572839L);
            case 4336:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912638376L);
            case 4337:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606306912703913L);
            case 4338:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601058461749364L);
            case 4339:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598047689870433L);
            case 4341:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602763564159810L);
            case 4342:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602763564028737L);
            case 4343:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607037055964703L);
            case 4344:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600783583842305L);
            case 4346:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607251804329528L);
            case 4347:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607251804395065L);
            case 4348:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607251804460602L);
            case 4349:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607251804526139L);
            case 4350:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607251804591676L);
            case 4351:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607251804657213L);
            case 4352:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607251804722750L);
            case 4353:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547430413796L);
            case 4355:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016241357280L);
            case 4356:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016241291743L);
            case 4357:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817883047880L);
            case 4358:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817874921328L);
            case 4359:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817874986865L);
            case 4360:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817883113417L);
            case 4361:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817883178954L);
            case 4362:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817883244491L);
            case 4363:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817874659181L);
            case 4364:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817882982343L);
            case 4365:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594113500743254L);
            case 4366:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258807100472L);
            case 4367:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507910681957L);
            case 4368:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650441428956L);
            case 4369:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592726225781410L);
            case 4370:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607393538250333L);
            case 4372:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078413362108L);
            case 4373:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616808808747L);
            case 4374:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531636646576L);
            case 4375:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531636712113L);
            case 4376:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531636515502L);
            case 4377:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531636581039L);
            case 4378:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605666966508865L);
            case 4379:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605666967295298L);
            case 4380:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605666967360835L);
            case 4381:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605666967426372L);
            case 4382:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598142178888829L);
            case 4383:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598142178954366L);
            case 4384:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598142179019903L);
            case 4385:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607621171517049L);
            case 4386:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650441494493L);
            case 4387:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650441691103L);
            case 4388:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650441560030L);
            case 4389:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607681301059208L);
            case 4390:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607526682236529L);
            case 4391:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600976857960538L);
            case 4392:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600976858026075L);
            case 4393:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600976858157148L);
            case 4394:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531636777650L);
            case 4395:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607810150078107L);
            case 4396:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351179753898L);
            case 4397:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547430544869L);
            case 4399:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258807166009L);
            case 4400:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258807231546L);
            case 4401:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607908934325925L);
            case 4402:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607947589097127L);
            case 4403:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336121427159L);
            case 4404:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336121492696L);
            case 4405:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600783583907842L);
        }
    }

    private Long A0N(int i) {
        switch (i) {
            case 4406:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608063553214128L);
            case 4407:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608063553279665L);
            case 4408:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608063553345202L);
            case 4409:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608063553148591L);
            case 4410:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531637039796L);
            case 4411:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531636974259L);
            case 4412:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604807968527491L);
            case 4413:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616808874284L);
            case 4414:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786355716822L);
            case 4415:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602699139715843L);
            case 4416:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602699139781380L);
            case 4417:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595204421519454L);
            case 4418:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595208716486758L);
            case 4419:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608252531709626L);
            case 4420:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608252531775163L);
            case 4421:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650441756640L);
            case 4422:
            case 4429:
            case 4430:
            case 4431:
            case 4464:
            case 4468:
            case 4484:
            case 4549:
            case 4561:
            case 4569:
            case 4634:
            case 4647:
            default:
                return null;
            case 4423:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288936992254L);
            case 4424:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395514479078L);
            case 4425:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608364200859362L);
            case 4426:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258807297083L);
            case 4427:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827201221L);
            case 4428:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827266758L);
            case 4432:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827332295L);
            case 4433:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827397832L);
            case 4434:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827463369L);
            case 4435:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827528906L);
            case 4436:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827594443L);
            case 4437:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827659980L);
            case 4438:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827725517L);
            case 4439:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827791054L);
            case 4440:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827856591L);
            case 4441:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256826676925L);
            case 4442:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256826742462L);
            case 4443:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256826807999L);
            case 4444:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256826873536L);
            case 4445:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256826939073L);
            case 4446:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827004610L);
            case 4447:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827922128L);
            case 4448:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827070147L);
            case 4449:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827135684L);
            case 4450:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608299776349912L);
            case 4451:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233170617586L);
            case 4452:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608441510270700L);
            case 4453:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602016241422817L);
            case 4454:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608437215303403L);
            case 4455:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608535999551221L);
            case 4456:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608535999616758L);
            case 4457:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608574654256896L);
            case 4458:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608566064322299L);
            case 4459:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608566064518910L);
            case 4460:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608566064584447L);
            case 4461:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608566064387836L);
            case 4462:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608566064453373L);
            case 4463:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608252531840700L);
            case 4465:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608690618373907L);
            case 4466:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600783583973379L);
            case 4467:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600783584038916L);
            case 4469:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608299776415449L);
            case 4470:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608299776480986L);
            case 4471:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608299776546523L);
            case 4472:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608931136542504L);
            case 4473:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531637105333L);
            case 4474:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601260325277837L);
            case 4475:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081460397888L);
            case 4476:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602763564356420L);
            case 4477:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602763564290883L);
            case 4478:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593001103164296L);
            case 4479:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601092821618809L);
            case 4480:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601092821684346L);
            case 4481:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601092821553272L);
            case 4482:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595182946879566L);
            case 4483:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081460856644L);
            case 4485:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081460528961L);
            case 4486:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081460594498L);
            case 4487:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081460791107L);
            case 4488:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258807362620L);
            case 4489:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258807428157L);
            case 4490:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258807493694L);
            case 4491:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593718362506718L);
            case 4492:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591923066896446L);
            case 4493:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591923066961983L);
            case 4494:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591923067027520L);
            case 4495:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609253259089783L);
            case 4496:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746386649906L);
            case 4497:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602746386715443L);
            case 4498:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024832406020L);
            case 4499:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602024832471557L);
            case 4500:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029127635498L);
            case 4501:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602029127701035L);
            case 4502:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081460922181L);
            case 4503:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36607393538315870L);
            case 4504:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36602531637170870L);
            case 4505:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598571675487473L);
            case 4506:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258807559231L);
            case 4507:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461053255L);
            case 4508:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461118792L);
            case 4509:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461184329L);
            case 4510:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081460987718L);
            case 4511:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608690618439444L);
            case 4512:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461249866L);
            case 4513:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461315403L);
            case 4514:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461380940L);
            case 4515:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461446477L);
            case 4516:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461512014L);
            case 4517:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650441822177L);
            case 4518:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256827987665L);
            case 4519:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258807624768L);
            case 4520:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623877158330L);
            case 4521:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623877223867L);
            case 4522:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623877289404L);
            case 4523:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623877354941L);
            case 4524:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650441887714L);
            case 4525:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608256828053202L);
            case 4526:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547430675943L);
            case 4527:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547430610406L);
            case 4528:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461577551L);
            case 4529:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461643088L);
            case 4530:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461708625L);
            case 4531:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461774162L);
            case 4532:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461839699L);
            case 4533:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461905236L);
            case 4534:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081461970773L);
            case 4535:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081462036310L);
            case 4536:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081462101847L);
            case 4537:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081462167384L);
            case 4538:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081462232921L);
            case 4539:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608965496411951L);
            case 4540:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608965496280878L);
            case 4541:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608965496674098L);
            case 4542:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608965496739635L);
            case 4543:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608965496543024L);
            case 4544:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608965496608561L);
            case 4545:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595084162959381L);
            case 4546:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596922408897228L);
            case 4547:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081462363995L);
            case 4548:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609081462298458L);
            case 4550:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609760065230812L);
            case 4551:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609760065427422L);
            case 4552:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609760065361885L);
            case 4553:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442763575841L);
            case 4554:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609850259544035L);
            case 4555:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608441510336237L);
            case 4556:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258807755842L);
            case 4557:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258807690305L);
            case 4558:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258807821379L);
            case 4559:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547430938088L);
            case 4560:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547431003625L);
            case 4562:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36610073597843464L);
            case 4563:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36610073597909001L);
            case 4564:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36610073597974538L);
            case 4565:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36610172382091281L);
            case 4566:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507910813030L);
            case 4567:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233170748660L);
            case 4568:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233170683123L);
            case 4570:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078413493181L);
            case 4571:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258808149061L);
            case 4572:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258808083524L);
            case 4573:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604709183886453L);
            case 4574:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507910878567L);
            case 4575:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36610374245554212L);
            case 4576:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605233171010805L);
            case 4577:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258808214598L);
            case 4578:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258808280135L);
            case 4579:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547431134698L);
            case 4580:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599392014503443L);
            case 4581:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616808939821L);
            case 4582:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36601616809005358L);
            case 4583:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547431265771L);
            case 4584:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36610357066012707L);
            case 4585:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36610357065750560L);
            case 4586:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36610357065816097L);
            case 4587:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36610357065881634L);
            case 4588:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288937123327L);
            case 4589:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738455960534L);
            case 4590:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36610739317774537L);
            case 4591:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598142179085440L);
            case 4592:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507910944104L);
            case 4593:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507911009641L);
            case 4594:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608965496805172L);
            case 4595:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608965496870709L);
            case 4596:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608965496936246L);
            case 4597:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547431462380L);
            case 4598:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547431527917L);
            case 4599:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078413558718L);
            case 4600:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597863006342200L);
            case 4601:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442763641378L);
            case 4602:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608690618570518L);
            case 4603:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608690618504981L);
            case 4604:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36608690618636055L);
            case 4605:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597863006407737L);
            case 4606:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597863006473274L);
            case 4607:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769177092805L);
            case 4608:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611396447770897L);
            case 4609:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442763706915L);
            case 4610:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594770629494613L);
            case 4611:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507911075178L);
            case 4612:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442763837989L);
            case 4613:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442763903526L);
            case 4614:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442763772452L);
            case 4615:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744340515140L);
            case 4616:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744340580677L);
            case 4617:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744340252992L);
            case 4618:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744340318529L);
            case 4619:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744340384066L);
            case 4620:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744340449603L);
            case 4621:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744340121918L);
            case 4622:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744340187455L);
            case 4623:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507911140715L);
            case 4624:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611752930056525L);
            case 4625:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36605550997345577L);
            case 4626:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507911206252L);
            case 4627:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442763969063L);
            case 4628:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442764034600L);
            case 4629:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442764100137L);
            case 4630:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442764165674L);
            case 4631:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612122297244003L);
            case 4632:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744340646214L);
            case 4633:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744340711751L);
            case 4635:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744340842824L);
            case 4636:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744340908361L);
            case 4637:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744340973898L);
            case 4638:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744341039435L);
            case 4639:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36611744341104972L);
            case 4640:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351179819435L);
            case 4641:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592666096239250L);
            case 4642:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157904914794L);
            case 4643:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36609850259609572L);
            case 4644:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606315501721013L);
            case 4645:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442764231211L);
            case 4646:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36606547431593454L);
            case 4648:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612221081819505L);
            case 4649:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612221081885042L);
            case 4650:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612221082147189L);
            case 4651:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612221081753968L);
            case 4652:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612221081950579L);
            case 4653:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612221082278262L);
            case 4654:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612221082081652L);
            case 4655:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612212491622767L);
            case 4656:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592898024080114L);
            case 4657:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612453009725832L);
            case 4658:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36604107888333858L);
            case 4659:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107752456499L);
            case 4660:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078413755327L);
            case 4661:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792105772904L);
            case 4662:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480028576279L);
            case 4663:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480028641816L);
            case 4664:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480028707353L);
            case 4665:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480028314131L);
            case 4666:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480028379668L);
            case 4667:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480028445205L);
            case 4668:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480028510742L);
            case 4669:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157904980331L);
            case 4670:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081985732880L);
            case 4671:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597863006604347L);
            case 4672:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612753657502108L);
            case 4673:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612753657567645L);
            case 4674:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612753657633182L);
            case 4675:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36612753657436571L);
            case 4676:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623878010307L);
            case 4677:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623877748160L);
            case 4678:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623877617086L);
            case 4679:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623877682623L);
            case 4680:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623877813697L);
            case 4681:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623877879234L);
        }
    }

    private Long A0O(int i) {
        switch (i) {
            case 1103:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594444211848935L);
            case 1104:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594448506816233L);
            case 1105:
            case 1113:
            case 1114:
            case 1115:
            case 1116:
            case 1118:
            case 1121:
            case 1129:
            case 1132:
            case 1133:
            case 1135:
            case 1136:
            case 1137:
            case 1138:
            case 1139:
            case 1141:
            case 1142:
            case 1144:
            case 1145:
            case 1148:
            case 1149:
            case 1150:
            case 1151:
            case 1152:
            case 1162:
            case 1163:
            case 1164:
            case 1166:
            case 1168:
            case 1170:
            case 1175:
            case 1179:
            case 1180:
            case 1191:
            case 1198:
            case 1199:
            case 1200:
            case 1201:
            case 1209:
            case 1216:
            case 1226:
            case 1227:
            case 1230:
            case 1235:
            case 1238:
            case 1240:
            case 1243:
            case 1244:
            case 1245:
            case 1250:
            case 1251:
            case 1252:
            case 1253:
            case 1254:
            case 1255:
            case 1256:
            case 1260:
            case 1261:
            case 1262:
            case 1263:
            case 1264:
            case 1265:
            case 1266:
            case 1268:
            case 1269:
            case 1270:
            case 1271:
            case 1272:
            case 1273:
            case 1277:
            case 1278:
            case 1280:
            case 1281:
            case 1282:
            case 1283:
            case 1284:
            case 1285:
            case 1287:
            case 1288:
            case 1289:
            case 1290:
            case 1291:
            case 1292:
            case 1293:
            case 1294:
            case 1298:
            case 1303:
            case 1304:
            case 1305:
            case 1306:
            case 1309:
            case 1310:
            case 1311:
            case 1314:
            case 1315:
            case 1316:
            case 1318:
            case 1319:
            case 1321:
            case 1322:
            case 1323:
            case 1324:
            case 1330:
            case 1343:
            case 1344:
            case 1345:
            case 1346:
            case 1347:
            case 1348:
            case 1349:
            case 1350:
            case 1352:
            case 1362:
            case 1368:
            default:
                return null;
            case 1106:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594439917274852L);
            case 1107:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594439916881630L);
            case 1108:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594439916947167L);
            case 1109:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594439917012704L);
            case 1110:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594439917078241L);
            case 1111:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594439917143778L);
            case 1112:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594439917209315L);
            case 1117:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439190811968L);
            case 1119:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593778491983353L);
            case 1120:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594500046423795L);
            case 1122:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594469981652717L);
            case 1123:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594525816227586L);
            case 1124:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430601663764L);
            case 1125:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430601729301L);
            case 1126:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430601925911L);
            case 1127:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430601860374L);
            case 1128:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594495751456496L);
            case 1130:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769176175295L);
            case 1131:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592030440685705L);
            case 1134:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594512931325684L);
            case 1140:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594542996096778L);
            case 1143:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442758136313L);
            case 1146:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593842916492810L);
            case 1147:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987491078232L);
            case 1153:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430602450200L);
            case 1154:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430602646811L);
            case 1155:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430602515737L);
            case 1156:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430602581274L);
            case 1157:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594577355835167L);
            case 1158:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594607420606256L);
            case 1159:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594607420671793L);
            case 1160:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594607420737330L);
            case 1161:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593486434469197L);
            case 1165:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594409852634840L);
            case 1167:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594590240737064L);
            case 1169:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591777037484038L);
            case 1171:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592374037938629L);
            case 1172:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594637485377334L);
            case 1173:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594624600475445L);
            case 1174:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594641780344631L);
            case 1176:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593705477539293L);
            case 1177:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258801792005L);
            case 1178:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623873553815L);
            case 1181:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594560176293645L);
            case 1182:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594689024984893L);
            case 1183:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594701909886784L);
            case 1184:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594113499891277L);
            case 1185:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594113499956814L);
            case 1186:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594113500022351L);
            case 1187:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594113500087888L);
            case 1188:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594113499760203L);
            case 1189:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594113499825740L);
            case 1190:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594641780475704L);
            case 1192:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081982587132L);
            case 1193:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081982521595L);
            case 1194:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081982652669L);
            case 1195:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430602777884L);
            case 1196:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594714794919750L);
            case 1197:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594714794985287L);
            case 1202:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594714794788676L);
            case 1203:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594714794854213L);
            case 1204:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374765122782L);
            case 1205:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594757744461648L);
            case 1206:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594770629363540L);
            case 1207:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594731974657868L);
            case 1208:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594560176555790L);
            case 1210:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594779219298134L);
            case 1211:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594766334592851L);
            case 1212:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594766334527314L);
            case 1213:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594658960213817L);
            case 1214:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594658960279354L);
            case 1215:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594749154527055L);
            case 1217:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593576628847998L);
            case 1218:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081982718206L);
            case 1219:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081982783743L);
            case 1220:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792104200027L);
            case 1221:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792104265564L);
            case 1222:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594439917405925L);
            case 1223:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258802054151L);
            case 1224:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258801988614L);
            case 1225:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594800694134633L);
            case 1228:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817874003819L);
            case 1229:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081982980352L);
            case 1231:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081983111425L);
            case 1232:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592060505653466L);
            case 1233:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594830758905804L);
            case 1234:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594809284069226L);
            case 1236:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594847938774990L);
            case 1237:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594839348840397L);
            case 1239:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591974605848654L);
            case 1241:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594869413611475L);
            case 1242:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594495751522033L);
            case 1246:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395514151394L);
            case 1247:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395514085857L);
            case 1248:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594856528709583L);
            case 1249:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594856528775120L);
            case 1257:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594873708578772L);
            case 1258:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594873708644309L);
            case 1259:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594873708709846L);
            case 1267:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591777037549575L);
            case 1274:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081983439106L);
            case 1275:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081983504643L);
            case 1276:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336112710807L);
            case 1279:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594908068317161L);
            case 1286:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592726225322654L);
            case 1295:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594951018055669L);
            case 1296:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594903773480927L);
            case 1297:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594903773546464L);
            case 1299:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081983570180L);
            case 1300:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595015442499582L);
            case 1301:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595015442565119L);
            case 1302:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595015442630656L);
            case 1307:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594946723088367L);
            case 1308:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593288866038865L);
            case 1312:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081983635717L);
            case 1313:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594444211914472L);
            case 1317:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594998262695932L);
            case 1320:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595058392172557L);
            case 1325:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081983766791L);
            case 1326:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081983701254L);
            case 1327:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595058392238094L);
            case 1328:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595058392303631L);
            case 1329:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595028327467018L);
            case 1331:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507909567833L);
            case 1332:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507909633370L);
            case 1333:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507909698907L);
            case 1334:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507909764444L);
            case 1335:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507909829981L);
            case 1336:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507909895518L);
            case 1337:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507909502296L);
            case 1338:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039031275677L);
            case 1339:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039031341214L);
            case 1340:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594946723153904L);
            case 1341:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374765188319L);
            case 1342:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595118521714728L);
            case 1351:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595122816682029L);
            case 1353:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595109931780124L);
            case 1354:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595105637009433L);
            case 1355:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595105637074970L);
            case 1356:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595105636812822L);
            case 1357:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595105636878359L);
            case 1358:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595105636943896L);
            case 1359:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595118521780265L);
            case 1360:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971038982947L);
            case 1361:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595114226812958L);
            case 1363:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595114226944031L);
            case 1364:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595114227009568L);
            case 1365:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595114227075105L);
            case 1366:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595114227140642L);
            case 1367:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595114226747421L);
            case 1369:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595127111649330L);
            case 1370:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595127111714867L);
            case 1371:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595127111780404L);
            case 1372:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595152881453112L);
            case 1373:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595152881518649L);
            case 1374:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595152881584186L);
            case 1375:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258802119688L);
            case 1376:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595135701583926L);
        }
    }

    private Long A0P(int i) {
        switch (i) {
            case 1379:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595084161976336L);
            case 1380:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595084162107409L);
            case 1381:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595157176420411L);
            case 1382:
            case 1383:
            case 1386:
            case 1387:
            case 1389:
            case 1405:
            case 1407:
            case 1408:
            case 1409:
            case 1410:
            case 1411:
            case 1414:
            case 1421:
            case 1423:
            case 1424:
            case 1425:
            case 1426:
            case 1427:
            case 1428:
            case 1432:
            case 1441:
            case 1442:
            case 1443:
            case 1449:
            case 1462:
            case 1464:
            case 1465:
            case 1466:
            case 1489:
            case 1494:
            case 1497:
            case PsiphonTunnel.VPN_INTERFACE_MTU /* 1500 */:
            case 1501:
            case 1503:
            case 1504:
            case 1505:
            case 1507:
            case 1508:
            case 1509:
            case 1512:
            case 1513:
            case 1514:
            case 1515:
            case 1516:
            case 1517:
            case 1518:
            case 1519:
            case 1520:
            case 1521:
            case 1522:
            case 1523:
            case 1524:
            case 1546:
            case 1549:
            case 1550:
            case 1551:
            case 1552:
            case 1553:
            case 1554:
            case 1555:
            case 1556:
            case 1558:
            case 1559:
            case 1560:
            case 1561:
            case 1563:
            case 1570:
            case 1584:
            case 1590:
            case 1592:
            case 1593:
            case 1598:
            case 1599:
            case 1600:
            case 1604:
            case 1605:
            case 1606:
            case 1610:
            case 1616:
            case 1617:
            case 1620:
            case 1626:
            case 1630:
            case 1631:
            case 1632:
            case 1633:
            case 1636:
            case 1637:
            case 1639:
            case 1647:
            default:
                return null;
            case 1384:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591777037615112L);
            case 1385:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595195831126102L);
            case 1388:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595170061322309L);
            case 1390:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595182946224199L);
            case 1391:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595204421126232L);
            case 1392:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595204421191769L);
            case 1393:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595204421257306L);
            case 1394:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595204421322843L);
            case 1395:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595204421388380L);
            case 1396:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595204421453917L);
            case 1397:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595208716027999L);
            case 1398:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595208716093536L);
            case 1399:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595208716159073L);
            case 1400:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595208716224610L);
            case 1401:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595208716290147L);
            case 1402:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595208716355684L);
            case 1403:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595204421060695L);
            case 1404:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595208716421221L);
            case 1406:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595178651256902L);
            case 1412:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430603040029L);
            case 1413:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430603105566L);
            case 1415:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051918733500L);
            case 1416:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051918667963L);
            case 1417:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430603171103L);
            case 1418:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595238780930153L);
            case 1419:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595238780864616L);
            case 1420:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595238780799079L);
            case 1422:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336112841880L);
            case 1429:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595122816747566L);
            case 1430:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595122816813103L);
            case 1431:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595015442696193L);
            case 1433:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336112907417L);
            case 1434:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595264550602859L);
            case 1435:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595268845570157L);
            case 1436:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430603367714L);
            case 1437:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430603236640L);
            case 1438:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430603302177L);
            case 1439:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258802185225L);
            case 1440:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593507909961055L);
            case 1444:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592966743622421L);
            case 1445:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592966743687958L);
            case 1446:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592966743753495L);
            case 1447:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592966743819032L);
            case 1448:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592966743556884L);
            case 1450:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595303205308533L);
            case 1451:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595303205439606L);
            case 1452:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595337565046905L);
            case 1453:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595337565112442L);
            case 1454:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595337565177979L);
            case 1455:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595341860014204L);
            case 1456:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592112045130040L);
            case 1457:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592112045195577L);
            case 1458:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592112045261114L);
            case 1459:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592112045064503L);
            case 1460:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593842916558347L);
            case 1461:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593842916689420L);
            case 1463:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081983897864L);
            case 1467:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593576628913535L);
            case 1468:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595286025439345L);
            case 1469:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593104182313927L);
            case 1470:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595376219752590L);
            case 1471:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593194376692714L);
            case 1472:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594714795050824L);
            case 1473:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594714795116361L);
            case 1474:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593890161460762L);
            case 1475:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593890161198615L);
            case 1476:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593890161264152L);
            case 1477:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593890161329689L);
            case 1478:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374765253856L);
            case 1479:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374765319393L);
            case 1480:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593598103815564L);
            case 1481:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107750818084L);
            case 1482:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107750883621L);
            case 1483:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107750949158L);
            case 1484:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107751014695L);
            case 1485:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107751080232L);
            case 1486:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107750621473L);
            case 1487:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107750687010L);
            case 1488:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107750752547L);
            case 1490:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592112045392188L);
            case 1491:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592112045457725L);
            case 1492:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592112045326651L);
            case 1493:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592386923954644L);
            case 1495:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592386923889107L);
            case 1496:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051918799037L);
            case 1498:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078413034425L);
            case 1499:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078413099962L);
            case 1502:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595423464392851L);
            case 1506:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592386924020181L);
            case 1510:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595118521845802L);
            case 1511:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595457824131221L);
            case 1525:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817876363139L);
            case 1526:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817875773307L);
            case 1527:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817875838844L);
            case 1528:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817875904381L);
            case 1529:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817875969918L);
            case 1530:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817876428676L);
            case 1531:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817876494213L);
            case 1532:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817874069356L);
            case 1533:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817876035455L);
            case 1534:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817875052402L);
            case 1535:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817875117939L);
            case 1536:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817875183476L);
            case 1537:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817875249013L);
            case 1538:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817876166528L);
            case 1539:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817876232065L);
            case 1540:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817875380086L);
            case 1541:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817875445623L);
            case 1542:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817875511160L);
            case 1543:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817875576697L);
            case 1544:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817875642234L);
            case 1545:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817876297602L);
            case 1547:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591991785783399L);
            case 1548:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593486434534734L);
            case 1557:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593847211460110L);
            case 1562:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593078413165499L);
            case 1564:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442759315962L);
            case 1565:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595556608444591L);
            case 1566:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595556608379054L);
            case 1567:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530839427239L);
            case 1568:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530838575260L);
            case 1569:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530838640797L);
            case 1571:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530838771870L);
            case 1572:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530838837407L);
            case 1573:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530838902944L);
            case 1574:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530838968481L);
            case 1575:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530839034018L);
            case 1576:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530839099555L);
            case 1577:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530839165092L);
            case 1578:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530839230629L);
            case 1579:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530839296166L);
            case 1580:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430603629859L);
            case 1581:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430603695396L);
            case 1582:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430604023077L);
            case 1583:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430604154150L);
            case 1585:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051918864574L);
            case 1586:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595341860079741L);
            case 1587:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591777037680649L);
            case 1588:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592472822121019L);
            case 1589:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592558721598058L);
            case 1591:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987491143769L);
            case 1594:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595084162172946L);
            case 1595:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081984028937L);
            case 1596:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081984094474L);
            case 1597:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595118521911339L);
            case 1601:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595586673150151L);
            case 1602:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595621032954074L);
            case 1603:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595621032888537L);
            case 1607:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593323226104941L);
            case 1608:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430604416295L);
            case 1609:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817876625286L);
            case 1611:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595646802692319L);
            case 1612:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595118522042412L);
            case 1613:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595651097659618L);
            case 1614:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595638212823262L);
            case 1615:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595616737921240L);
            case 1618:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592030440816778L);
            case 1619:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595625327855835L);
            case 1621:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595612442953931L);
            case 1622:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595612443019468L);
            case 1623:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595612443085005L);
            case 1624:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595612443150542L);
            case 1625:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595685457463525L);
            case 1627:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593194376889323L);
            case 1628:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595685457397988L);
            case 1629:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595685457529062L);
            case 1634:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592726225388191L);
            case 1635:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258802643978L);
            case 1638:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595698342299885L);
            case 1640:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595264550668396L);
            case 1641:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595268845635694L);
            case 1642:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595694047332584L);
            case 1643:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595694047398121L);
            case 1644:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595694047463658L);
            case 1645:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595694047529195L);
            case 1646:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595694047594732L);
            case ReactTextInputManager.IME_ACTION_ID /* 1648 */:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595681162430691L);
        }
    }

    private Long A0Q(int i) {
        switch (i) {
            case 1655:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595303205570679L);
            case 1656:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595745586940152L);
            case 1657:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595749881907449L);
            case 1658:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594113500153425L);
            case 1659:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336113431706L);
            case 1660:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336113562779L);
            case 1661:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595719817136372L);
            case 1662:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595698342430959L);
            case 1663:
            case 1664:
            case 1665:
            case 1669:
            case 1671:
            case 1672:
            case 1674:
            case 1675:
            case 1676:
            case 1677:
            case 1680:
            case 1683:
            case 1684:
            case 1686:
            case 1687:
            case 1689:
            case 1691:
            case 1692:
            case 1693:
            case 1694:
            case 1695:
            case 1697:
            case 1698:
            case 1699:
            case 1700:
            case 1701:
            case 1703:
            case 1704:
            case 1709:
            case 1710:
            case 1711:
            case 1712:
            case 1713:
            case 1714:
            case 1715:
            case 1717:
            case 1721:
            case 1722:
            case 1723:
            case 1726:
            case 1731:
            case 1732:
            case 1733:
            case 1734:
            case 1735:
            case 1743:
            case 1744:
            case 1745:
            case 1746:
            case 1747:
            case 1754:
            case 1755:
            case 1756:
            case 1757:
            case 1758:
            case 1761:
            case 1766:
            case 1768:
            case 1769:
            case 1771:
            case 1772:
            case 1773:
            case 1776:
            case 1777:
            case 1780:
            case 1781:
            case 1791:
            case 1799:
            case 1800:
            case 1801:
            case 1806:
            case 1807:
            case 1809:
            case 1810:
            case 1812:
            case 1820:
            case 1821:
            case 1822:
            case 1832:
            case 1834:
            case 1842:
            case 1843:
            case 1844:
            case 1845:
            case 1848:
            case 1849:
            case 1850:
            case 1852:
            case 1853:
            case 1854:
            case 1855:
            case 1856:
            case 1862:
            case 1869:
            case 1870:
            case 1878:
            case 1879:
            case 1880:
            case 1881:
            case 1883:
            case 1884:
            case 1885:
            case 1887:
            case 1889:
            case 1890:
            case 1893:
            case 1904:
            case 1906:
            case 1908:
            case 1909:
            case 1911:
            case 1912:
            case 1913:
            case 1916:
            case 1919:
            case 1920:
            case 1921:
            default:
                return null;
            case 1666:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595698342365422L);
            case 1667:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591777037746186L);
            case 1668:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595702637267187L);
            case 1670:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595788536613121L);
            case 1673:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595801421515011L);
            case 1678:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595844371187982L);
            case 1679:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595698342496496L);
            case 1681:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595805716547847L);
            case 1682:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595805716482310L);
            case 1685:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786355389137L);
            case 1688:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595848666220817L);
            case 1690:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031170818971L);
            case 1696:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591923066175548L);
            case 1702:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595801421580548L);
            case 1705:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595934565501208L);
            case 1706:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595934565566745L);
            case 1707:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595934565632282L);
            case 1708:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595934565697819L);
            case 1716:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595943155435804L);
            case 1718:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595157176748092L);
            case 1719:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595157176813629L);
            case 1720:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594409852831449L);
            case 1724:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592545837220448L);
            case 1725:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107751342380L);
            case 1727:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107751473453L);
            case 1728:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107751145769L);
            case 1729:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107751211306L);
            case 1730:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107751276843L);
            case 1736:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593288866169938L);
            case 1737:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374765450467L);
            case 1738:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374765384930L);
            case 1739:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595157176879166L);
            case 1740:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595157176944703L);
            case 1741:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971039507236L);
            case 1742:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336113628316L);
            case 1748:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594903773677537L);
            case 1749:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596041939749161L);
            case 1750:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596041939814698L);
            case 1751:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596041939683624L);
            case 1752:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592008965849201L);
            case 1753:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592008965783664L);
            case 1759:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595157177010240L);
            case 1760:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595157177075777L);
            case 1762:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592386924675543L);
            case 1763:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592386924610006L);
            case 1764:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594903773874146L);
            case 1765:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336113759389L);
            case 1767:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077688340716L);
            case 1770:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596063414520118L);
            case 1774:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594903773939683L);
            case 1775:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594113500350034L);
            case 1778:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596093479291194L);
            case 1779:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336113824926L);
            case 1782:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595556608510128L);
            case 1783:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595556608575665L);
            case 1784:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877149578L);
            case 1785:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817876887432L);
            case 1786:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877215115L);
            case 1787:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877280652L);
            case 1788:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817876690823L);
            case 1789:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877084041L);
            case 1790:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594109204465225L);
            case 1792:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258802906123L);
            case 1793:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258803102732L);
            case 1794:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975337423682L);
            case 1795:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596110659357002L);
            case 1796:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596110659160391L);
            case 1797:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596110659225928L);
            case 1798:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596110659291465L);
            case 1802:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594607420933939L);
            case 1803:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596114954127692L);
            case 1804:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596041939880235L);
            case 1805:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530839820456L);
            case 1808:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596063414585655L);
            case 1811:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596123544062291L);
            case 1813:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157904062815L);
            case 1814:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157903800667L);
            case 1815:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157903866204L);
            case 1816:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157903931741L);
            case 1817:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157904128352L);
            case 1818:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157903997278L);
            case 1819:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596093479356731L);
            case 1823:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595590968248520L);
            case 1824:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975337489219L);
            case 1825:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596209443408247L);
            case 1826:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596213738375544L);
            case 1827:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596166493735276L);
            case 1828:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596166493800813L);
            case 1829:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596166493866350L);
            case 1830:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592030440882315L);
            case 1831:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258803168269L);
            case 1833:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596153608833370L);
            case 1835:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591777037942795L);
            case 1836:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596136428964181L);
            case 1837:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596136429029718L);
            case 1838:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596140723931479L);
            case 1839:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596196558506351L);
            case 1840:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395514348004L);
            case 1841:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592395514282467L);
            case 1846:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594856528840657L);
            case 1847:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596260983015808L);
            case 1851:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596273867917699L);
            case 1857:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596196558571888L);
            case 1858:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596196558637425L);
            case 1859:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596196558702962L);
            case 1860:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596295342754181L);
            case 1861:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596295342819718L);
            case 1863:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596093479422268L);
            case 1864:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258803364880L);
            case 1865:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258803233806L);
            case 1866:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595814306482442L);
            case 1867:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258803299343L);
            case 1868:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595122816878640L);
            case 1871:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596329702492555L);
            case 1872:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596329702558092L);
            case 1873:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596329702623629L);
            case 1874:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596329702689166L);
            case 1875:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596329702754703L);
            case 1876:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596329702820240L);
            case 1877:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595749881972986L);
            case 1882:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077688537325L);
            case 1886:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596424191773110L);
            case 1888:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596402717067698L);
            case 1891:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596407011903923L);
            case 1892:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596419896805812L);
            case 1894:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596419896936885L);
            case 1895:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596355472427438L);
            case 1896:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595801421646085L);
            case 1897:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596355472296364L);
            case 1898:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596355472361901L);
            case 1899:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596355472492975L);
            case 1900:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592674685584023L);
            case 1901:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351177329044L);
            case 1902:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351177394581L);
            case 1903:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351177460118L);
            case 1905:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596196558768499L);
            case 1907:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596454256544251L);
            case 1910:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596484321315354L);
            case 1914:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592532951532118L);
            case 1915:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432781773250L);
            case 1917:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432781904323L);
            case 1918:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432781707713L);
            case 1922:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596527270988317L);
            case 1923:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596527271053854L);
            case 1924:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596527271119391L);
            case 1925:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596527271184928L);
        }
    }

    private Long A0R(int i) {
        switch (i) {
            case 1927:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596540155890218L);
            case 1928:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596535861053992L);
            case 1929:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336114152607L);
            case 1930:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336114218144L);
            case 1931:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374765516004L);
            case 1932:
            case 1934:
            case 1936:
            case 1943:
            case 1944:
            case 1945:
            case 1949:
            case 1950:
            case 1951:
            case 1952:
            case 1953:
            case 1954:
            case 1956:
            case 1957:
            case 1959:
            case 1964:
            case 1966:
            case 1970:
            case 1975:
            case 1976:
            case 1979:
            case 1983:
            case 1986:
            case 1989:
            case 1990:
            case 1993:
            case 1994:
            case 1995:
            case 1996:
            case 1998:
            case 1999:
            case CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS /* 2000 */:
            case 2008:
            case 2020:
            case 2023:
            case 2024:
            case 2025:
            case 2026:
            case 2027:
            case 2028:
            case 2029:
            case 2030:
            case 2034:
            case 2036:
            case 2039:
            case 2052:
            case 2053:
            case 2054:
            case 2055:
            case 2057:
            case 2064:
            case 2070:
            case 2071:
            case 2072:
            case 2073:
            case 2074:
            case 2076:
            case 2098:
            case 2102:
            case 2104:
            case 2105:
            case 2107:
            case 2108:
            case 2109:
            case 2110:
            case 2111:
            case 2112:
            case 2114:
            case 2115:
            case 2116:
            case 2117:
            case 2118:
            case 2122:
            case 2126:
            case 2130:
            case 2131:
            case 2133:
            case 2139:
            case 2140:
            case 2141:
            case 2143:
            case 2155:
            case 2156:
            case 2157:
            case 2162:
            case 2163:
            case 2168:
            case 2170:
            case 2173:
            case 2175:
            case 2176:
            case 2180:
            case 2184:
            case 2185:
            case 2188:
            case 2189:
            case 2190:
            case 2198:
            default:
                return null;
            case 1933:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595015442761730L);
            case 1935:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336114414754L);
            case 1937:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336114349217L);
            case 1938:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596570220857909L);
            case 1939:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596570220661298L);
            case 1940:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596570220726835L);
            case 1941:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596570220792372L);
            case 1942:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596574515628598L);
            case 1946:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596239508441468L);
            case 1947:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596239508179323L);
            case 1948:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596239508638077L);
            case 1955:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596428486937023L);
            case 1958:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594946723678193L);
            case 1960:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596574515890744L);
            case 1961:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596574515759671L);
            case 1962:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769176437440L);
            case 1963:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593370470089946L);
            case 1965:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592983923032904L);
            case 1967:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596630350203461L);
            case 1968:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336114873508L);
            case 1969:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336114939045L);
            case 1971:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336114742435L);
            case 1972:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594113500415571L);
            case 1973:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596295342885255L);
            case 1974:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430605268265L);
            case 1977:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430605137192L);
            case 1978:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596093479487805L);
            case 1980:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596647530072652L);
            case 1981:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596647530138189L);
            case 1982:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596647530203726L);
            case 1984:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592580196303494L);
            case 1985:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596196558965108L);
            case 1987:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596484321446427L);
            case 1988:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596093479618878L);
            case 1991:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596196559096182L);
            case 1992:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596196559030645L);
            case 1997:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596729134451309L);
            case 2001:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703365106271L);
            case 2002:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703364778587L);
            case 2003:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703364844124L);
            case 2004:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703364909661L);
            case 2005:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703364647513L);
            case 2006:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703364713050L);
            case 2007:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703364975198L);
            case 2009:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596711954582123L);
            case 2010:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596742019353205L);
            case 2011:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592545837417057L);
            case 2012:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596733429549679L);
            case 2013:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596733429484142L);
            case 2014:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596041940011308L);
            case 2015:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596041940142381L);
            case 2016:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596754904255097L);
            case 2017:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769176502977L);
            case 2018:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430606251307L);
            case 2019:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430606316844L);
            case 2021:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430606185770L);
            case 2022:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975337554756L);
            case 2031:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792104462173L);
            case 2032:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442759512571L);
            case 2033:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430606513454L);
            case 2035:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430606447917L);
            case 2037:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031170884508L);
            case 2038:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595127111845941L);
            case 2040:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596832213666454L);
            case 2041:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351177787799L);
            case 2042:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351177853336L);
            case 2043:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336115266726L);
            case 2044:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592545837810274L);
            case 2045:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596815033797260L);
            case 2046:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592374038135238L);
            case 2047:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592374038200775L);
            case C3OO.FLAG_MOVED /* 2048 */:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862278437527L);
            case 2049:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862278503064L);
            case 2050:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351177918873L);
            case 2051:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596780674058883L);
            case 2056:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596776379091586L);
            case 2058:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596875163339445L);
            case 2059:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596870868372147L);
            case 2060:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596827918699152L);
            case 2061:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077688799471L);
            case 2062:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077688865008L);
            case 2063:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077688733934L);
            case 2065:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596883753274039L);
            case 2066:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596883753339576L);
            case 2067:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596883753405113L);
            case 2068:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596883753470650L);
            case 2069:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596883753536187L);
            case 2075:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592726225453728L);
            case 2077:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862278568601L);
            case 2078:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862278634138L);
            case 2079:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862278699675L);
            case 2080:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862278765212L);
            case 2081:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862278830749L);
            case 2082:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862278896286L);
            case 2083:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862278961823L);
            case 2084:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862279027360L);
            case 2085:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862279092897L);
            case 2086:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862279158434L);
            case 2087:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862279223971L);
            case 2088:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862279289508L);
            case 2089:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862279355045L);
            case 2090:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862279420582L);
            case 2091:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862279486119L);
            case 2092:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862279551656L);
            case 2093:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862279617193L);
            case 2094:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862279682730L);
            case 2095:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862279748267L);
            case 2096:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596862279813804L);
            case 2097:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596943882816205L);
            case 2099:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596922407979714L);
            case 2100:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596922408307395L);
            case 2101:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596922408372932L);
            case 2103:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442759643644L);
            case 2106:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594469982045934L);
            case 2113:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596982537521878L);
            case 2119:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077688930545L);
            case 2120:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077688996082L);
            case 2121:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596565925759537L);
            case 2123:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595084162369556L);
            case 2124:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595084162238483L);
            case 2125:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597004012423896L);
            case 2127:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596991127456471L);
            case 2128:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595685457725671L);
            case 2129:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336115397799L);
            case 2132:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596110659619147L);
            case 2134:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430607168815L);
            case 2135:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594946723809266L);
            case 2136:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594946723874803L);
            case 2137:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592855074734813L);
            case 2138:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374765581541L);
            case 2142:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596827918764689L);
            case 2144:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593323226236014L);
            case 2145:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597085616736997L);
            case 2146:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862937944096L);
            case 2147:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596424191904183L);
            case 2148:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596424191969720L);
            case 2149:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596424192035257L);
            case 2150:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596424192100794L);
            case 2151:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596424192166331L);
            case 2152:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596424192231868L);
            case 2153:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596424192297405L);
            case 2154:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596424192362942L);
            case 2158:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597029782162139L);
            case 2159:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597029782227676L);
            case 2160:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597119976475367L);
            case 2161:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703365171808L);
            case 2164:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593323226367087L);
            case 2165:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595556608641202L);
            case 2166:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595341860210814L);
            case 2167:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595341860276351L);
            case 2169:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595135701649463L);
            case 2171:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430607234352L);
            case 2172:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077689192691L);
            case 2174:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597175811050222L);
            case 2177:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597192990919410L);
            case 2178:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592060505719003L);
            case 2179:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595698343020785L);
            case 2181:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258803758099L);
            case 2182:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258803430417L);
            case 2183:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258803495954L);
            case 2186:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031171081117L);
            case 2187:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597244530526998L);
            case 2191:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769176568514L);
            case 2192:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351178443167L);
            case 2193:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351178115482L);
            case 2194:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351178181019L);
            case 2195:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351178246556L);
            case 2196:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351178312093L);
            case 2197:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351178377630L);
            case 2199:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597132861508333L);
            case 2200:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596827918830226L);
            case 2201:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594779219429207L);
            case 2202:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594779219494744L);
        }
    }

    private Long A0S(int i) {
        switch (i) {
            case 2204:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596093479946559L);
            case 2205:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597278890265367L);
            case 2206:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592563016696431L);
            case 2207:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597119976540904L);
            case 2208:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597119976606441L);
            case 2209:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597287480199965L);
            case 2210:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594109204596298L);
            case 2211:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442759774718L);
            case 2212:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442759709181L);
            case 2213:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156449629793L);
            case 2214:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156449695330L);
            case 2215:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156449760867L);
            case 2216:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156449826404L);
            case 2217:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156449891941L);
            case 2218:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156449957478L);
            case 2219:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450023015L);
            case 2220:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450088552L);
            case 2221:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450154089L);
            case 2222:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450219626L);
            case 2223:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450285163L);
            case 2224:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450350700L);
            case 2225:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450416237L);
            case 2226:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450481774L);
            case 2227:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450547311L);
            case 2228:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450612848L);
            case 2229:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450678385L);
            case 2230:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450743922L);
            case 2231:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450809459L);
            case 2232:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450874996L);
            case 2233:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156450940533L);
            case 2234:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156451006070L);
            case 2235:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156451071607L);
            case 2236:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156451137144L);
            case 2237:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156451202681L);
            case 2238:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156451268218L);
            case 2239:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156451333755L);
            case 2240:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156451399292L);
            case 2241:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156451464829L);
            case 2242:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156449433182L);
            case 2243:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156449498719L);
            case 2244:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594156449564256L);
            case 2245:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597304660069151L);
            case 2246:
            case 2249:
            case 2250:
            case 2252:
            case 2253:
            case 2256:
            case 2261:
            case 2267:
            case 2268:
            case 2269:
            case 2270:
            case 2277:
            case 2278:
            case 2279:
            case 2289:
            case 2292:
            case 2293:
            case 2294:
            case 2295:
            case 2302:
            case 2321:
            case 2322:
            case 2323:
            case 2325:
            case 2331:
            case 2349:
            case 2364:
            case 2367:
            case 2368:
            case 2372:
            case 2396:
            case 2397:
            case 2418:
            case 2419:
            case 2426:
            case 2432:
            case 2433:
            case 2436:
            case 2437:
            case 2438:
            case 2439:
            case 2444:
            case 2452:
            case 2460:
            case 2465:
            case 2468:
            case 2471:
            case 2474:
            case 2476:
            default:
                return null;
            case 2247:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432782035396L);
            case 2248:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596810738895499L);
            case 2251:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592674685649560L);
            case 2254:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351178508704L);
            case 2255:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235941182210L);
            case 2257:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235940985600L);
            case 2258:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235940592380L);
            case 2259:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235941116673L);
            case 2260:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235940657917L);
            case 2262:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597373379545900L);
            case 2263:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480026413565L);
            case 2264:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480026479102L);
            case 2265:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480026544639L);
            case 2266:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480026610176L);
            case 2271:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480026872323L);
            case 2272:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480026806786L);
            case 2273:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480026675713L);
            case 2274:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595612443216079L);
            case 2275:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593323226629234L);
            case 2276:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351178639777L);
            case 2280:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597450688957249L);
            case 2281:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597450689088322L);
            case 2282:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336115528872L);
            case 2283:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336115594409L);
            case 2284:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597463573859160L);
            case 2285:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593525089109361L);
            case 2286:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597476458761050L);
            case 2287:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593791376950780L);
            case 2288:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595122816944177L);
            case 2290:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597497933597531L);
            case 2291:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597497933663068L);
            case 2296:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592447052251694L);
            case 2297:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592447052317231L);
            case 2298:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077689323764L);
            case 2299:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594779219560281L);
            case 2300:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597519408434013L);
            case 2301:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703365302881L);
            case 2303:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593031171146654L);
            case 2304:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596093480405312L);
            case 2305:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703365368418L);
            case 2306:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593890161526299L);
            case 2307:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593890161591836L);
            case 2308:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593890161657373L);
            case 2309:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595028327532555L);
            case 2310:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596093480470849L);
            case 2311:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235941313283L);
            case 2312:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235941378820L);
            case 2313:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235941444357L);
            case 2314:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235941509894L);
            case 2315:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235941575431L);
            case 2316:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235941640968L);
            case 2317:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235941706505L);
            case 2318:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235941772042L);
            case 2319:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374765647078L);
            case 2320:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971039572773L);
            case 2324:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258803954708L);
            case 2326:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258804020245L);
            case 2327:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480027003396L);
            case 2328:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336115725483L);
            case 2329:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336115659946L);
            case 2330:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597588127910763L);
            case 2332:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877411726L);
            case 2333:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877477263L);
            case 2334:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877542800L);
            case 2335:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877608337L);
            case 2336:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877673874L);
            case 2337:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877739411L);
            case 2338:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877804948L);
            case 2339:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877870485L);
            case 2340:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877936022L);
            case 2341:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817878001559L);
            case 2342:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817877346189L);
            case 2343:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596093480536386L);
            case 2344:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597570948172643L);
            case 2345:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597570948238180L);
            case 2346:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597119976671978L);
            case 2347:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597119976737515L);
            case 2348:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597119976803052L);
            case 2350:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597716976929694L);
            case 2351:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597716977191841L);
            case 2352:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597716977060767L);
            case 2353:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597716977126304L);
            case 2354:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862938009633L);
            case 2355:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862938075170L);
            case 2356:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862938140707L);
            case 2357:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442759840255L);
            case 2358:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336115856556L);
            case 2359:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336115922093L);
            case 2360:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336115987630L);
            case 2361:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336116053167L);
            case 2362:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623873750424L);
            case 2363:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594658960344891L);
            case 2365:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597747041700834L);
            case 2366:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597450689153859L);
            case 2369:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595556608706739L);
            case 2370:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591862938206244L);
            case 2371:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593576629044608L);
            case 2373:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738451831720L);
            case 2374:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738451766183L);
            case 2375:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336116249778L);
            case 2376:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336116118704L);
            case 2377:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336116184241L);
            case 2378:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336116315315L);
            case 2379:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703365499492L);
            case 2380:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596703365433955L);
            case 2381:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432782232005L);
            case 2382:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592962449179405L);
            case 2383:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597798581373926L);
            case 2384:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056341493L);
            case 2385:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056407030L);
            case 2386:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056472567L);
            case 2387:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056538104L);
            case 2388:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056603641L);
            case 2389:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056669178L);
            case 2390:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056734715L);
            case 2391:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056800252L);
            case 2392:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056144882L);
            case 2393:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056210419L);
            case 2394:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056275956L);
            case 2395:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432782297542L);
            case 2398:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597450689416007L);
            case 2399:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597450689219396L);
            case 2400:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597450689284933L);
            case 2401:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597450689350470L);
            case 2402:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216579630753L);
            case 2403:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216579106459L);
            case 2404:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216579696290L);
            case 2405:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216579237532L);
            case 2406:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216579761827L);
            case 2407:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216579434142L);
            case 2408:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216578713240L);
            case 2409:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216579368605L);
            case 2410:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216579499679L);
            case 2411:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216578844313L);
            case 2412:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216579565216L);
            case 2413:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216578975386L);
            case 2414:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216579827364L);
            case 2415:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216579892901L);
            case 2416:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594216579958438L);
            case 2417:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597682617191296L);
            case 2420:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597863005817907L);
            case 2421:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593065527542696L);
            case 2422:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738451962793L);
            case 2423:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595114227206179L);
            case 2424:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595114227271716L);
            case 2425:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595114227337253L);
            case 2427:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595182946289736L);
            case 2428:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258804151318L);
            case 2429:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596827918961300L);
            case 2430:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596827919026837L);
            case 2431:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596827918895763L);
            case 2434:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597923135360073L);
            case 2435:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595182946355273L);
            case 2440:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235940723454L);
            case 2441:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235940788991L);
            case 2442:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597901660523587L);
            case 2443:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597901660589124L);
            case 2445:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598013330066517L);
            case 2446:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598013330000980L);
            case 2447:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820057062400L);
            case 2448:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056865789L);
            case 2449:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056931326L);
            case 2450:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820056996863L);
            case 2451:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786355454674L);
            case 2453:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594946723940340L);
            case 2454:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595341860341888L);
            case 2455:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598060574313572L);
            case 2456:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598047689411675L);
            case 2457:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786355520211L);
            case 2458:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597716977716130L);
            case 2459:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597716977781667L);
            case 2461:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598047689477212L);
            case 2462:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738452224940L);
            case 2463:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738452028330L);
            case 2464:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738452093867L);
            case 2466:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432782428615L);
            case 2467:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051919192255L);
            case 2469:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594409853028058L);
            case 2470:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595844371253519L);
            case 2472:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597570948434789L);
            case 2473:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077689389301L);
            case 2475:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598099229019245L);
            case 2477:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594495751849714L);
        }
    }

    private Long A0T(int i) {
        switch (i) {
            case 2488:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374765712615L);
            case 2489:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258804216855L);
            case 2490:
            case 2491:
            case 2493:
            case 2505:
            case 2507:
            case 2511:
            case 2512:
            case 2513:
            case 2514:
            case 2515:
            case 2516:
            case 2521:
            case 2523:
            case 2524:
            case 2525:
            case 2526:
            case 2527:
            case 2531:
            case 2534:
            case 2539:
            case 2542:
            case 2545:
            case 2548:
            case 2550:
            case 2551:
            case 2553:
            case 2554:
            case 2555:
            case 2556:
            case 2564:
            case 2565:
            case 2566:
            case 2567:
            case 2568:
            case 2570:
            case 2572:
            case 2573:
            case 2576:
            case 2578:
            case 2582:
            case 2584:
            case 2585:
            case 2586:
            case 2587:
            case 2589:
            case 2590:
            case 2591:
            case 2593:
            case 2599:
            case 2600:
            case 2611:
            case 2612:
            case 2613:
            case 2620:
            case 2621:
            case 2622:
            case 2626:
            case 2630:
            case 2631:
            case 2636:
            case 2640:
            case 2641:
            case 2642:
            case 2643:
            case 2644:
            case 2647:
            case 2648:
            case 2649:
            case 2652:
            case 2657:
            case 2661:
            case 2671:
            case 2673:
            case 2685:
            case 2686:
            case 2688:
            case 2692:
            case 2693:
            case 2694:
            case 2696:
            case 2704:
            case 2715:
            case 2716:
            case 2720:
            case 2721:
            case 2722:
            case 2723:
            case 2730:
            case 2737:
            case 2738:
            case 2743:
            case 2744:
            case 2745:
            case 2750:
            case 2751:
            default:
                return null;
            case 2492:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792104593246L);
            case 2494:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480027462152L);
            case 2495:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480027200005L);
            case 2496:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480027265542L);
            case 2497:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480027331079L);
            case 2498:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596093480798531L);
            case 2499:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598142178692219L);
            case 2500:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598163653528714L);
            case 2501:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598163653659787L);
            case 2502:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592447052382768L);
            case 2503:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432782887368L);
            case 2504:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432782952905L);
            case 2506:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593430607627569L);
            case 2508:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592081985143051L);
            case 2509:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792104658783L);
            case 2510:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792104724320L);
            case 2517:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820057193474L);
            case 2518:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820057127937L);
            case 2519:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971039703846L);
            case 2520:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971039769383L);
            case 2522:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336116511924L);
            case 2528:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595182946551882L);
            case 2529:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595182946617419L);
            case 2530:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595114227468326L);
            case 2532:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592855074865886L);
            case 2533:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593486434927951L);
            case 2535:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598313977449665L);
            case 2536:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598313977384128L);
            case 2537:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598313977515202L);
            case 2538:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595719817267445L);
            case 2540:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598296797514928L);
            case 2541:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971039834920L);
            case 2543:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593323226432624L);
            case 2544:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593323226498161L);
            case 2546:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480027658761L);
            case 2547:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351178770850L);
            case 2549:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597304660200224L);
            case 2552:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351178836387L);
            case 2557:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595182946748492L);
            case 2558:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595182946814029L);
            case 2559:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235941968651L);
            case 2560:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598313977580739L);
            case 2561:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271027842193L);
            case 2562:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593486434993488L);
            case 2563:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598404171697363L);
            case 2569:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598386991828173L);
            case 2571:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107752063278L);
            case 2574:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792104789857L);
            case 2575:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792104855394L);
            case 2577:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480027724298L);
            case 2579:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593288866628691L);
            case 2580:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595698343348466L);
            case 2581:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598425646664924L);
            case 2583:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598425646599387L);
            case 2588:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738452290477L);
            case 2592:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592176471212379L);
            case 2594:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596428488051136L);
            case 2595:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596922408438469L);
            case 2596:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596922408504006L);
            case 2597:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598494366010591L);
            case 2598:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598391286795470L);
            case 2601:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480027920909L);
            case 2602:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480027789835L);
            case 2603:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480027855372L);
            case 2604:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598533020716264L);
            case 2605:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480027986446L);
            case 2606:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598515840847075L);
            case 2607:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598515840912612L);
            case 2608:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157904193889L);
            case 2609:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157904259426L);
            case 2610:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336116708533L);
            case 2614:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593486435648849L);
            case 2615:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271027907730L);
            case 2616:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271027973267L);
            case 2617:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598571675421936L);
            case 2618:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598047689542749L);
            case 2619:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598047689608286L);
            case 2623:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598331157384390L);
            case 2624:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598331157449927L);
            case 2625:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598331157253317L);
            case 2627:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820057455619L);
            case 2628:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820057521156L);
            case 2629:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820057586693L);
            case 2632:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595612443281616L);
            case 2633:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598550200585455L);
            case 2634:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598545905618156L);
            case 2635:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598545905683693L);
            case 2637:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738452356014L);
            case 2638:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738452421551L);
            case 2639:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738452487088L);
            case 2645:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596883753601724L);
            case 2646:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336116774070L);
            case 2650:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598339747187912L);
            case 2651:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598339747253449L);
            case 2653:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592975337620293L);
            case 2654:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598597445225716L);
            case 2655:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336116839607L);
            case 2656:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592112045523262L);
            case 2658:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596329702885777L);
            case 2659:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596329702951314L);
            case 2660:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596329703016851L);
            case 2662:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374765909224L);
            case 2663:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374765974761L);
            case 2664:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374766105835L);
            case 2665:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593374766040298L);
            case 2666:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439191205185L);
            case 2667:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593439191270722L);
            case 2668:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598361222024396L);
            case 2669:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598601740258549L);
            case 2670:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598515840978149L);
            case 2672:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598541610650857L);
            case 2674:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432783608267L);
            case 2675:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432783149514L);
            case 2676:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432783673804L);
            case 2677:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598644689865983L);
            case 2678:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336116970681L);
            case 2679:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336116905144L);
            case 2680:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598640394898686L);
            case 2681:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107752194351L);
            case 2682:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769176830659L);
            case 2683:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623873881498L);
            case 2684:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623873947035L);
            case 2687:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623874274717L);
            case 2689:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623874143644L);
            case 2690:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623873815961L);
            case 2691:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598691934506256L);
            case 2695:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593245916693494L);
            case 2697:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597450689678152L);
            case 2698:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592077690044662L);
            case 2699:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598704819408145L);
            case 2700:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598704819473682L);
            case 2701:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594255234729641L);
            case 2702:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598764949015843L);
            case 2703:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594792104920931L);
            case 2705:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598760653983010L);
            case 2706:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598769244179752L);
            case 2707:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598769244245289L);
            case 2708:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598769244310826L);
            case 2709:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598769243917604L);
            case 2710:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598769243983141L);
            case 2711:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598769244048678L);
            case 2712:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598769244114215L);
            case 2713:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597450689743689L);
            case 2714:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597450689809226L);
            case 2717:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351178901924L);
            case 2718:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598790718754092L);
            case 2719:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432783870413L);
            case 2724:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596922408569543L);
            case 2725:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596922408635080L);
            case 2726:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596922408700617L);
            case 2727:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596922408766154L);
            case 2728:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596922408831691L);
            case 2729:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442760233472L);
            case 2731:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623874930081L);
            case 2732:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623874733471L);
            case 2733:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623874536862L);
            case 2734:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623874799008L);
            case 2735:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598816488557874L);
            case 2736:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595848666286354L);
            case 2739:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039031865504L);
            case 2740:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592039031799967L);
            case 2741:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738452618161L);
            case 2742:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598850848296252L);
            case 2746:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592786355585748L);
            case 2747:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594409853093595L);
            case 2748:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593791377081853L);
            case 2749:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595844371319056L);
            case 2752:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820057848838L);
        }
    }

    private Long A0U(int i) {
        switch (i) {
            case 2755:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258804347929L);
            case 2756:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235942099724L);
            case 2757:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235942165261L);
            case 2758:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271028104340L);
            case 2759:
            case 2760:
            case 2761:
            case 2762:
            case 2764:
            case 2765:
            case 2767:
            case 2776:
            case 2780:
            case 2788:
            case 2791:
            case 2797:
            case 2798:
            case 2799:
            case 2814:
            case 2815:
            case 2821:
            case 2825:
            case 2829:
            case 2830:
            case 2831:
            case 2833:
            case 2835:
            case 2847:
            case 2855:
            case 2856:
            case 2857:
            case 2864:
            case 2873:
            case 2874:
            case 2878:
            case 2885:
            case 2886:
            case 2887:
            case 2888:
            case 2895:
            case 2896:
            case 2901:
            case 2904:
            case 2906:
            case 2909:
            case 2910:
            case 2913:
            case 2930:
            case 2933:
            case 2939:
            case 2940:
            case 2943:
            case 2967:
            case 2983:
            case 2992:
            case 2993:
            case 2994:
            case 2997:
            case 3014:
            default:
                return null;
            case 2763:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820057914375L);
            case 2766:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598983992282468L);
            case 2768:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599057006726543L);
            case 2769:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235942230798L);
            case 2770:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351179098533L);
            case 2771:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442760299009L);
            case 2772:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599087071497665L);
            case 2773:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596093480929604L);
            case 2774:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596093480995141L);
            case 2775:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623875126692L);
            case 2777:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623875061155L);
            case 2778:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623874995618L);
            case 2779:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594409853224668L);
            case 2781:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599138611629519L);
            case 2782:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599138611301834L);
            case 2783:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599138611367371L);
            case 2784:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599138611498445L);
            case 2785:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599138611563982L);
            case 2786:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599138611105225L);
            case 2787:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599138611432908L);
            case 2789:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598296797580465L);
            case 2790:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599065596661152L);
            case 2792:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623875192229L);
            case 2793:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971039965993L);
            case 2794:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592971040031530L);
            case 2795:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442760364546L);
            case 2796:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599155791039954L);
            case 2800:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595359040145540L);
            case 2801:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595359040211077L);
            case 2802:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595359040276614L);
            case 2803:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820057979912L);
            case 2804:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820058045449L);
            case 2805:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820058110986L);
            case 2806:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598545905814766L);
            case 2807:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738452945846L);
            case 2808:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738453011383L);
            case 2809:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738452683698L);
            case 2810:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738452749235L);
            case 2811:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738452814772L);
            case 2812:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738453076920L);
            case 2813:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738452880309L);
            case 2816:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623875257766L);
            case 2817:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623875323303L);
            case 2818:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623875388840L);
            case 2819:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817878198168L);
            case 2820:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817878263705L);
            case 2822:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596535861185065L);
            case 2823:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258804282392L);
            case 2824:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593194377085932L);
            case 2826:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599207330581977L);
            case 2827:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593834326820359L);
            case 2828:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593881571329554L);
            case 2832:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432783935950L);
            case 2834:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598515841043686L);
            case 2836:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599392014175758L);
            case 2837:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594439917668070L);
            case 2838:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817878656922L);
            case 2839:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432784067023L);
            case 2840:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432784132560L);
            case 2841:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596239509031294L);
            case 2842:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820058176523L);
            case 2843:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593598104536461L);
            case 2844:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288935091696L);
            case 2845:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288934960622L);
            case 2846:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288935026159L);
            case 2848:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599417783979543L);
            case 2849:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599417784045080L);
            case 2850:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599417784110617L);
            case 2851:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599417784176154L);
            case 2852:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599417784307228L);
            case 2853:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599417784241691L);
            case 2854:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599426373914143L);
            case 2858:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456438685229L);
            case 2859:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456438750766L);
            case 2860:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456438816303L);
            case 2861:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456438881840L);
            case 2862:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456438947377L);
            case 2863:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439012914L);
            case 2865:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439143987L);
            case 2866:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439209524L);
            case 2867:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439275061L);
            case 2868:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439340598L);
            case 2869:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439406135L);
            case 2870:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439471672L);
            case 2871:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439537209L);
            case 2872:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439602746L);
            case 2875:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598210898234508L);
            case 2876:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598210898300045L);
            case 2877:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598210898365582L);
            case 2879:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469323652675L);
            case 2880:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469323914822L);
            case 2881:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530840213675L);
            case 2882:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596480028051983L);
            case 2883:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530840082601L);
            case 2884:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595530840148138L);
            case 2889:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599336179600901L);
            case 2890:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599336179666438L);
            case 2891:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599336179731975L);
            case 2892:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599336179797512L);
            case 2893:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599336179863049L);
            case 2894:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599336179928586L);
            case 2897:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599572402933342L);
            case 2898:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599572402998879L);
            case 2899:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599572403064416L);
            case 2900:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599572403129953L);
            case 2902:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599572403261026L);
            case 2903:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599572403326563L);
            case 2905:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599602467573356L);
            case 2907:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599623942409839L);
            case 2908:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623875454377L);
            case 2911:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599495093390931L);
            case 2912:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599495093456468L);
            case 2914:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817878787995L);
            case 2915:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817878984605L);
            case 2916:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817879181215L);
            case 2917:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599606762540653L);
            case 2918:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817880491941L);
            case 2919:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817880557478L);
            case 2920:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817880623015L);
            case 2921:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817880688552L);
            case 2922:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817880754089L);
            case 2923:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817880819626L);
            case 2924:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817880229793L);
            case 2925:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817874790254L);
            case 2926:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817874855791L);
            case 2927:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817880295330L);
            case 2928:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817880360867L);
            case 2929:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817880426404L);
            case 2931:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469323783749L);
            case 2932:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469323980359L);
            case 2934:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469324242504L);
            case 2935:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469323718212L);
            case 2936:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623875519914L);
            case 2937:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623875585451L);
            case 2938:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592726225584801L);
            case 2941:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817880885163L);
            case 2942:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596733429680752L);
            case 2944:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623875716524L);
            case 2945:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592769176961732L);
            case 2946:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599392014306832L);
            case 2947:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599392014241295L);
            case 2948:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738453142457L);
            case 2949:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271028169877L);
            case 2950:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061301824912L);
            case 2951:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061301890449L);
            case 2952:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061302021522L);
            case 2953:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738453207994L);
            case 2954:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881540533L);
            case 2955:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881606070L);
            case 2956:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817880950700L);
            case 2957:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881147311L);
            case 2958:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881212848L);
            case 2959:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881278385L);
            case 2960:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881081774L);
            case 2961:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881343922L);
            case 2962:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881409459L);
            case 2963:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881474996L);
            case 2964:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881016237L);
            case 2965:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591923066437693L);
            case 2966:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439668283L);
            case 2968:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599748496526972L);
            case 2969:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595114227730471L);
            case 2970:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442760626694L);
            case 2971:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442760757768L);
            case 2972:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442760692231L);
            case 2973:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881737143L);
            case 2974:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599860165611156L);
            case 2975:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599860165676693L);
            case 2976:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599860165742230L);
            case 2977:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599860165807767L);
            case 2978:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599860165873304L);
            case 2979:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599860165938841L);
            case 2980:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599860166004378L);
            case 2981:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597235942361871L);
            case 2982:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599881640447645L);
            case 2984:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442760430083L);
            case 2985:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599662597115508L);
            case 2986:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336117626044L);
            case 2987:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336117560507L);
            case 2988:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594903774201829L);
            case 2989:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594903774136292L);
            case 2990:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336117691581L);
            case 2991:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336117757118L);
            case 2995:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738453535675L);
            case 2996:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738453928893L);
            case 2998:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738453732284L);
            case 2999:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599881640513182L);
            case 3000:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599971834826416L);
            case 3001:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599971834760879L);
            case 3002:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157904324963L);
            case 3003:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157904456037L);
            case 3004:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157904587110L);
            case 3005:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599825805872773L);
            case 3006:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599714136723066L);
            case 3007:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271028235414L);
            case 3008:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271028300951L);
            case 3009:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271028366488L);
            case 3010:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271028432025L);
            case 3011:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288935157233L);
            case 3012:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599830100840071L);
            case 3013:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599911705218720L);
            case 3015:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593323226891379L);
            case 3016:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057734106836L);
            case 3017:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057734172373L);
            case 3018:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057734237910L);
            case 3019:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057734303447L);
            case 3020:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057734368984L);
            case 3021:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057734434521L);
            case 3022:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057734500058L);
            case 3023:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057734565595L);
            case 3024:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600057734631132L);
            case 3025:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336117822655L);
            case 3026:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599946065022629L);
            case 3027:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599946065088166L);
            case 3028:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599946064957092L);
        }
    }

    private Long A0V(int i) {
        switch (i) {
            case 3029:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599907410251423L);
            case 3030:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469324635726L);
            case 3031:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469324308041L);
            case 3032:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469324373578L);
            case 3033:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469324439115L);
            case 3034:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469324504652L);
            case 3035:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469324570189L);
            case 3036:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157904652647L);
            case 3037:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258804413466L);
            case 3038:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258804479003L);
            case 3039:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336117494970L);
            case 3040:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442760495620L);
            case 3041:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442760561157L);
            case 3042:
            case 3043:
            case 3044:
            case 3045:
            case 3046:
            case 3051:
            case 3054:
            case 3055:
            case 3056:
            case 3057:
            case 3058:
            case 3059:
            case 3060:
            case 3061:
            case 3062:
            case 3072:
            case 3073:
            case 3075:
            case 3076:
            case 3077:
            case 3081:
            case 3095:
            case 3123:
            case 3126:
            case 3128:
            case 3132:
            case 3134:
            case 3145:
            case 3148:
            case 3152:
            case 3155:
            case 3156:
            case 3157:
            case 3158:
            case 3159:
            case 3162:
            case 3166:
            case 3167:
            case 3168:
            case 3173:
            case 3174:
            case 3185:
            case 3207:
            case 3208:
            case 3209:
            case 3215:
            case 3216:
            case 3217:
            case 3232:
            case 3247:
            case 3248:
            case 3250:
            case 3251:
            case 3255:
            case 3261:
            case 3265:
            case 3293:
            case 3294:
            case 3295:
            case 3298:
            case 3299:
            default:
                return null;
            case 3047:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157904718184L);
            case 3048:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820058373134L);
            case 3049:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820058242060L);
            case 3050:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820058307597L);
            case 3052:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593890161919518L);
            case 3053:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987491274842L);
            case 3063:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049145745095L);
            case 3064:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049144237758L);
            case 3065:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049145679558L);
            case 3066:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049144303295L);
            case 3067:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049144368832L);
            case 3068:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049144434369L);
            case 3069:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049144499906L);
            case 3070:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049144565443L);
            case 3071:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049144630980L);
            case 3074:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049144827589L);
            case 3078:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623875782061L);
            case 3079:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738454125503L);
            case 3080:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738454059966L);
            case 3082:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600031964499643L);
            case 3083:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600031964565180L);
            case 3084:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600031964630717L);
            case 3085:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061302087059L);
            case 3086:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600031964303032L);
            case 3087:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600031964368569L);
            case 3088:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600031964434106L);
            case 3089:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599628237377136L);
            case 3090:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600096388812522L);
            case 3091:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258804741150L);
            case 3092:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258804610076L);
            case 3093:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258804675613L);
            case 3094:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592051919257792L);
            case 3096:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598142178823292L);
            case 3097:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600117863649011L);
            case 3098:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583256834L);
            case 3099:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583322371L);
            case 3100:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583387908L);
            case 3101:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583453445L);
            case 3102:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583518982L);
            case 3103:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583584519L);
            case 3104:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583650056L);
            case 3105:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583715593L);
            case 3106:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583781130L);
            case 3107:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583846667L);
            case 3108:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583912204L);
            case 3109:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583977741L);
            case 3110:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584043278L);
            case 3111:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584108815L);
            case 3112:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584174352L);
            case 3113:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584239889L);
            case 3114:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584305426L);
            case 3115:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584370963L);
            case 3116:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584436500L);
            case 3117:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584502037L);
            case 3118:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584567574L);
            case 3119:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584633111L);
            case 3120:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584698648L);
            case 3121:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584764185L);
            case 3122:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584829722L);
            case 3124:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186584960795L);
            case 3125:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186585026332L);
            case 3127:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186585157405L);
            case 3129:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583125760L);
            case 3130:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186583191297L);
            case 3131:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623875847598L);
            case 3133:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600233827766079L);
            case 3135:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432784394705L);
            case 3136:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258804806687L);
            case 3137:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596239509096831L);
            case 3138:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596527271250465L);
            case 3139:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881933754L);
            case 3140:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881802680L);
            case 3141:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881868217L);
            case 3142:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817881999291L);
            case 3143:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598391286861007L);
            case 3144:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598391286926544L);
            case 3146:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600233827897153L);
            case 3147:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600233827831616L);
            case 3149:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595612443347153L);
            case 3150:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595612443412690L);
            case 3151:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595612443478227L);
            case 3153:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258804937760L);
            case 3154:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258805068833L);
            case 3160:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049145810632L);
            case 3161:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049145876169L);
            case 3163:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623875978671L);
            case 3164:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599808626069123L);
            case 3165:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820058438671L);
            case 3169:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36595625328314588L);
            case 3170:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336117888192L);
            case 3171:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336117953729L);
            case 3172:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987491405915L);
            case 3175:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600341201948543L);
            case 3176:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600341202014080L);
            case 3177:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600117863714548L);
            case 3178:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258805330979L);
            case 3179:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258805396516L);
            case 3180:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258805658663L);
            case 3181:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258805527589L);
            case 3182:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258805593126L);
            case 3183:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258805265442L);
            case 3184:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600233828028226L);
            case 3186:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600053439270611L);
            case 3187:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600027669335735L);
            case 3188:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987491471452L);
            case 3189:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596351179164070L);
            case 3190:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593288866956372L);
            case 3191:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36591987491536989L);
            case 3192:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738454256576L);
            case 3193:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592666096108177L);
            case 3194:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599456439733820L);
            case 3195:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598391286992081L);
            case 3196:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598391287057618L);
            case 3197:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820058569744L);
            case 3198:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597820058700817L);
            case 3199:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817882064828L);
            case 3200:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598313977646276L);
            case 3201:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336118019266L);
            case 3202:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336118084803L);
            case 3203:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336118150340L);
            case 3204:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336118215877L);
            case 3205:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336118281414L);
            case 3206:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336118346951L);
            case 3210:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288935550451L);
            case 3211:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288935615988L);
            case 3212:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599288935222770L);
            case 3213:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600379856654210L);
            case 3214:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593486435714386L);
            case 3218:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600117863780085L);
            case 3219:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600117863845622L);
            case 3220:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271028563098L);
            case 3221:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442760954377L);
            case 3222:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336118674633L);
            case 3223:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336118609096L);
            case 3224:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469324701263L);
            case 3225:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469324766800L);
            case 3226:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469324832337L);
            case 3227:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817882130365L);
            case 3228:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817878853532L);
            case 3229:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817879050142L);
            case 3230:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817882195902L);
            case 3231:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594817879246752L);
            case 3233:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738454453187L);
            case 3234:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738454387650L);
            case 3235:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599469324897874L);
            case 3236:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271028628635L);
            case 3237:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271028694172L);
            case 3238:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049146072778L);
            case 3239:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600049146138315L);
            case 3240:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600508705738656L);
            case 3241:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593336118740170L);
            case 3242:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738454322113L);
            case 3243:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600530180509605L);
            case 3244:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738454649796L);
            case 3245:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36597738454715333L);
            case 3246:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600220942864190L);
            case 3249:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623876306354L);
            case 3252:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592107752259888L);
            case 3253:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271028825245L);
            case 3254:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271028890782L);
            case 3256:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442761216524L);
            case 3257:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442761282061L);
            case 3258:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442761085450L);
            case 3259:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36592442761150987L);
            case 3260:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593623876437427L);
            case 3262:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600616079855560L);
            case 3263:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600616080052169L);
            case 3264:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36594903774267366L);
            case 3266:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600233828290372L);
            case 3267:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600233828224835L);
            case 3268:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599392014372369L);
            case 3269:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599392014437906L);
            case 3270:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650439593933L);
            case 3271:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650439659470L);
            case 3272:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650439725007L);
            case 3273:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650439790544L);
            case 3274:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650439856081L);
            case 3275:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600650439921618L);
            case 3276:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186585354014L);
            case 3277:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600186585419551L);
            case 3278:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599417784372765L);
            case 3279:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432784525779L);
            case 3280:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432784591316L);
            case 3281:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432784656853L);
            case 3282:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432784722390L);
            case 3283:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432784787927L);
            case 3284:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432784853464L);
            case 3285:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432784919001L);
            case 3286:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432784984538L);
            case 3287:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432785050075L);
            case 3288:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432785115612L);
            case 3289:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271028956319L);
            case 3290:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596432784460242L);
            case 3291:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599662597246581L);
            case 3292:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596157904390500L);
            case 3296:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36593258805724200L);
            case 3297:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36598271029021856L);
            case 3300:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600706274168810L);
            case 3301:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36599061302283668L);
            case 3302:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36600706274234347L);
            case 3303:
                return AbstractC166997dE.A0i(C06090Tz.A06, this.A00, 36596527271316002L);
        }
    }
}
