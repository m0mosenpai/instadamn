package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.user.model.User;
import go.Seq;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.2y3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65672y3 extends AbstractC65632xz implements InterfaceC65652y1 {
    public static final int A0b = EnumC65592xv.values().length;
    public InterfaceC686036x A00;
    public C39W A01;
    public AnonymousClass398 A02;
    public C33P A03;
    public C77013cn A04;
    public C692439k A05;
    public final Context A06;
    public final FragmentActivity A07;
    public final C62862tP A08;
    public final UserSession A09;
    public final C61142qc A0A;
    public final InterfaceC63362uJ A0B;
    public final InterfaceC60442pS A0C;
    public final C57332k8 A0D;
    public final SearchContext A0E;
    public final C1M1 A0F;
    public final Boolean A0G;
    public final Integer A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final C07X A0U;
    public final C2d4 A0V;
    public final C19260xA A0W;
    public final InterfaceC65702y7 A0X;
    public final C65682y4 A0Y;
    public final C60972qL A0Z;
    public final Integer A0a;

    /* JADX WARN: Code restructure failed: missing block: B:131:0x019f, code lost:
    
        if (r1.A04() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01a8, code lost:
    
        if (r5.A0B.A0G == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0482, code lost:
    
        if (r1 != null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x049c, code lost:
    
        if (r1.A4s() != false) goto L217;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02df A[Catch: all -> 0x0739, TryCatch #0 {all -> 0x0739, blocks: (B:5:0x003d, B:7:0x0043, B:9:0x0047, B:10:0x0056, B:12:0x0057, B:17:0x0063, B:21:0x007c, B:23:0x0082, B:24:0x008e, B:26:0x0096, B:33:0x00a3, B:40:0x00ad, B:42:0x00bb, B:47:0x00d4, B:49:0x00d8, B:54:0x00df, B:56:0x00e3, B:57:0x00ec, B:59:0x00f4, B:60:0x00fd, B:62:0x0105, B:64:0x0110, B:66:0x011b, B:68:0x0121, B:69:0x0131, B:73:0x0602, B:74:0x0609, B:76:0x0615, B:78:0x0636, B:80:0x063e, B:82:0x0644, B:84:0x064c, B:85:0x0655, B:87:0x0660, B:88:0x0669, B:90:0x066d, B:92:0x0673, B:94:0x068d, B:95:0x0696, B:97:0x069a, B:99:0x069e, B:107:0x0707, B:109:0x070b, B:110:0x071f, B:111:0x0712, B:112:0x0719, B:113:0x06ae, B:115:0x061d, B:117:0x0625, B:119:0x062d, B:120:0x062f, B:121:0x06a3, B:123:0x06ab, B:124:0x0147, B:128:0x0190, B:130:0x019b, B:132:0x01a4, B:134:0x01aa, B:136:0x01ae, B:137:0x01b7, B:139:0x01c5, B:140:0x01d1, B:142:0x01d9, B:144:0x01e6, B:145:0x01f2, B:147:0x01f8, B:148:0x0204, B:151:0x020c, B:153:0x0214, B:154:0x0220, B:156:0x0228, B:157:0x0234, B:159:0x023c, B:161:0x0240, B:162:0x024c, B:164:0x0271, B:166:0x0283, B:168:0x028b, B:170:0x0293, B:172:0x0297, B:174:0x02a7, B:176:0x02ae, B:178:0x02b6, B:179:0x02ba, B:181:0x02be, B:183:0x02cb, B:184:0x02d1, B:185:0x02d7, B:187:0x02df, B:188:0x02e8, B:190:0x02ec, B:192:0x02f2, B:193:0x02fe, B:195:0x0304, B:197:0x030c, B:199:0x0312, B:201:0x031a, B:203:0x0320, B:205:0x032d, B:206:0x0336, B:208:0x0340, B:209:0x034c, B:211:0x0352, B:213:0x035f, B:214:0x0368, B:216:0x0370, B:217:0x0379, B:219:0x037f, B:221:0x0398, B:228:0x03f7, B:235:0x03ff, B:237:0x040c, B:241:0x0416, B:242:0x0425, B:243:0x0419, B:245:0x0423, B:246:0x0420, B:247:0x042f, B:249:0x043d, B:251:0x0446, B:253:0x0453, B:254:0x046d, B:256:0x047c, B:258:0x0484, B:260:0x048a, B:262:0x0490, B:265:0x049e, B:266:0x0498, B:268:0x04a7, B:270:0x04ad, B:272:0x04b3, B:274:0x04b9, B:275:0x04c2, B:277:0x04dd, B:278:0x04f3, B:280:0x04fd, B:282:0x0503, B:283:0x050c, B:285:0x0510, B:287:0x0514, B:289:0x0518, B:290:0x0521, B:292:0x0529, B:293:0x0535, B:295:0x054f, B:297:0x0555, B:298:0x0588, B:300:0x058c, B:303:0x0592, B:304:0x059c, B:306:0x05a2, B:308:0x055e, B:310:0x0562, B:312:0x056d, B:313:0x0576, B:315:0x057e, B:317:0x05c0, B:318:0x05c9, B:320:0x05d3, B:322:0x05dd, B:324:0x05e3, B:325:0x05e5, B:326:0x05ed, B:328:0x05ff, B:329:0x06b7, B:332:0x03a0, B:333:0x03a8, B:336:0x03b1, B:338:0x03b7, B:340:0x03c4, B:342:0x03c8, B:343:0x03d2, B:344:0x03da, B:346:0x03e2, B:348:0x03ef, B:349:0x02a1, B:350:0x0277, B:351:0x01a1, B:353:0x0152, B:354:0x016b, B:356:0x0176, B:358:0x017c, B:359:0x06c0, B:361:0x0072, B:362:0x06c9), top: B:4:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0340 A[Catch: all -> 0x0739, TryCatch #0 {all -> 0x0739, blocks: (B:5:0x003d, B:7:0x0043, B:9:0x0047, B:10:0x0056, B:12:0x0057, B:17:0x0063, B:21:0x007c, B:23:0x0082, B:24:0x008e, B:26:0x0096, B:33:0x00a3, B:40:0x00ad, B:42:0x00bb, B:47:0x00d4, B:49:0x00d8, B:54:0x00df, B:56:0x00e3, B:57:0x00ec, B:59:0x00f4, B:60:0x00fd, B:62:0x0105, B:64:0x0110, B:66:0x011b, B:68:0x0121, B:69:0x0131, B:73:0x0602, B:74:0x0609, B:76:0x0615, B:78:0x0636, B:80:0x063e, B:82:0x0644, B:84:0x064c, B:85:0x0655, B:87:0x0660, B:88:0x0669, B:90:0x066d, B:92:0x0673, B:94:0x068d, B:95:0x0696, B:97:0x069a, B:99:0x069e, B:107:0x0707, B:109:0x070b, B:110:0x071f, B:111:0x0712, B:112:0x0719, B:113:0x06ae, B:115:0x061d, B:117:0x0625, B:119:0x062d, B:120:0x062f, B:121:0x06a3, B:123:0x06ab, B:124:0x0147, B:128:0x0190, B:130:0x019b, B:132:0x01a4, B:134:0x01aa, B:136:0x01ae, B:137:0x01b7, B:139:0x01c5, B:140:0x01d1, B:142:0x01d9, B:144:0x01e6, B:145:0x01f2, B:147:0x01f8, B:148:0x0204, B:151:0x020c, B:153:0x0214, B:154:0x0220, B:156:0x0228, B:157:0x0234, B:159:0x023c, B:161:0x0240, B:162:0x024c, B:164:0x0271, B:166:0x0283, B:168:0x028b, B:170:0x0293, B:172:0x0297, B:174:0x02a7, B:176:0x02ae, B:178:0x02b6, B:179:0x02ba, B:181:0x02be, B:183:0x02cb, B:184:0x02d1, B:185:0x02d7, B:187:0x02df, B:188:0x02e8, B:190:0x02ec, B:192:0x02f2, B:193:0x02fe, B:195:0x0304, B:197:0x030c, B:199:0x0312, B:201:0x031a, B:203:0x0320, B:205:0x032d, B:206:0x0336, B:208:0x0340, B:209:0x034c, B:211:0x0352, B:213:0x035f, B:214:0x0368, B:216:0x0370, B:217:0x0379, B:219:0x037f, B:221:0x0398, B:228:0x03f7, B:235:0x03ff, B:237:0x040c, B:241:0x0416, B:242:0x0425, B:243:0x0419, B:245:0x0423, B:246:0x0420, B:247:0x042f, B:249:0x043d, B:251:0x0446, B:253:0x0453, B:254:0x046d, B:256:0x047c, B:258:0x0484, B:260:0x048a, B:262:0x0490, B:265:0x049e, B:266:0x0498, B:268:0x04a7, B:270:0x04ad, B:272:0x04b3, B:274:0x04b9, B:275:0x04c2, B:277:0x04dd, B:278:0x04f3, B:280:0x04fd, B:282:0x0503, B:283:0x050c, B:285:0x0510, B:287:0x0514, B:289:0x0518, B:290:0x0521, B:292:0x0529, B:293:0x0535, B:295:0x054f, B:297:0x0555, B:298:0x0588, B:300:0x058c, B:303:0x0592, B:304:0x059c, B:306:0x05a2, B:308:0x055e, B:310:0x0562, B:312:0x056d, B:313:0x0576, B:315:0x057e, B:317:0x05c0, B:318:0x05c9, B:320:0x05d3, B:322:0x05dd, B:324:0x05e3, B:325:0x05e5, B:326:0x05ed, B:328:0x05ff, B:329:0x06b7, B:332:0x03a0, B:333:0x03a8, B:336:0x03b1, B:338:0x03b7, B:340:0x03c4, B:342:0x03c8, B:343:0x03d2, B:344:0x03da, B:346:0x03e2, B:348:0x03ef, B:349:0x02a1, B:350:0x0277, B:351:0x01a1, B:353:0x0152, B:354:0x016b, B:356:0x0176, B:358:0x017c, B:359:0x06c0, B:361:0x0072, B:362:0x06c9), top: B:4:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0370 A[Catch: all -> 0x0739, TryCatch #0 {all -> 0x0739, blocks: (B:5:0x003d, B:7:0x0043, B:9:0x0047, B:10:0x0056, B:12:0x0057, B:17:0x0063, B:21:0x007c, B:23:0x0082, B:24:0x008e, B:26:0x0096, B:33:0x00a3, B:40:0x00ad, B:42:0x00bb, B:47:0x00d4, B:49:0x00d8, B:54:0x00df, B:56:0x00e3, B:57:0x00ec, B:59:0x00f4, B:60:0x00fd, B:62:0x0105, B:64:0x0110, B:66:0x011b, B:68:0x0121, B:69:0x0131, B:73:0x0602, B:74:0x0609, B:76:0x0615, B:78:0x0636, B:80:0x063e, B:82:0x0644, B:84:0x064c, B:85:0x0655, B:87:0x0660, B:88:0x0669, B:90:0x066d, B:92:0x0673, B:94:0x068d, B:95:0x0696, B:97:0x069a, B:99:0x069e, B:107:0x0707, B:109:0x070b, B:110:0x071f, B:111:0x0712, B:112:0x0719, B:113:0x06ae, B:115:0x061d, B:117:0x0625, B:119:0x062d, B:120:0x062f, B:121:0x06a3, B:123:0x06ab, B:124:0x0147, B:128:0x0190, B:130:0x019b, B:132:0x01a4, B:134:0x01aa, B:136:0x01ae, B:137:0x01b7, B:139:0x01c5, B:140:0x01d1, B:142:0x01d9, B:144:0x01e6, B:145:0x01f2, B:147:0x01f8, B:148:0x0204, B:151:0x020c, B:153:0x0214, B:154:0x0220, B:156:0x0228, B:157:0x0234, B:159:0x023c, B:161:0x0240, B:162:0x024c, B:164:0x0271, B:166:0x0283, B:168:0x028b, B:170:0x0293, B:172:0x0297, B:174:0x02a7, B:176:0x02ae, B:178:0x02b6, B:179:0x02ba, B:181:0x02be, B:183:0x02cb, B:184:0x02d1, B:185:0x02d7, B:187:0x02df, B:188:0x02e8, B:190:0x02ec, B:192:0x02f2, B:193:0x02fe, B:195:0x0304, B:197:0x030c, B:199:0x0312, B:201:0x031a, B:203:0x0320, B:205:0x032d, B:206:0x0336, B:208:0x0340, B:209:0x034c, B:211:0x0352, B:213:0x035f, B:214:0x0368, B:216:0x0370, B:217:0x0379, B:219:0x037f, B:221:0x0398, B:228:0x03f7, B:235:0x03ff, B:237:0x040c, B:241:0x0416, B:242:0x0425, B:243:0x0419, B:245:0x0423, B:246:0x0420, B:247:0x042f, B:249:0x043d, B:251:0x0446, B:253:0x0453, B:254:0x046d, B:256:0x047c, B:258:0x0484, B:260:0x048a, B:262:0x0490, B:265:0x049e, B:266:0x0498, B:268:0x04a7, B:270:0x04ad, B:272:0x04b3, B:274:0x04b9, B:275:0x04c2, B:277:0x04dd, B:278:0x04f3, B:280:0x04fd, B:282:0x0503, B:283:0x050c, B:285:0x0510, B:287:0x0514, B:289:0x0518, B:290:0x0521, B:292:0x0529, B:293:0x0535, B:295:0x054f, B:297:0x0555, B:298:0x0588, B:300:0x058c, B:303:0x0592, B:304:0x059c, B:306:0x05a2, B:308:0x055e, B:310:0x0562, B:312:0x056d, B:313:0x0576, B:315:0x057e, B:317:0x05c0, B:318:0x05c9, B:320:0x05d3, B:322:0x05dd, B:324:0x05e3, B:325:0x05e5, B:326:0x05ed, B:328:0x05ff, B:329:0x06b7, B:332:0x03a0, B:333:0x03a8, B:336:0x03b1, B:338:0x03b7, B:340:0x03c4, B:342:0x03c8, B:343:0x03d2, B:344:0x03da, B:346:0x03e2, B:348:0x03ef, B:349:0x02a1, B:350:0x0277, B:351:0x01a1, B:353:0x0152, B:354:0x016b, B:356:0x0176, B:358:0x017c, B:359:0x06c0, B:361:0x0072, B:362:0x06c9), top: B:4:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x037f A[Catch: all -> 0x0739, TryCatch #0 {all -> 0x0739, blocks: (B:5:0x003d, B:7:0x0043, B:9:0x0047, B:10:0x0056, B:12:0x0057, B:17:0x0063, B:21:0x007c, B:23:0x0082, B:24:0x008e, B:26:0x0096, B:33:0x00a3, B:40:0x00ad, B:42:0x00bb, B:47:0x00d4, B:49:0x00d8, B:54:0x00df, B:56:0x00e3, B:57:0x00ec, B:59:0x00f4, B:60:0x00fd, B:62:0x0105, B:64:0x0110, B:66:0x011b, B:68:0x0121, B:69:0x0131, B:73:0x0602, B:74:0x0609, B:76:0x0615, B:78:0x0636, B:80:0x063e, B:82:0x0644, B:84:0x064c, B:85:0x0655, B:87:0x0660, B:88:0x0669, B:90:0x066d, B:92:0x0673, B:94:0x068d, B:95:0x0696, B:97:0x069a, B:99:0x069e, B:107:0x0707, B:109:0x070b, B:110:0x071f, B:111:0x0712, B:112:0x0719, B:113:0x06ae, B:115:0x061d, B:117:0x0625, B:119:0x062d, B:120:0x062f, B:121:0x06a3, B:123:0x06ab, B:124:0x0147, B:128:0x0190, B:130:0x019b, B:132:0x01a4, B:134:0x01aa, B:136:0x01ae, B:137:0x01b7, B:139:0x01c5, B:140:0x01d1, B:142:0x01d9, B:144:0x01e6, B:145:0x01f2, B:147:0x01f8, B:148:0x0204, B:151:0x020c, B:153:0x0214, B:154:0x0220, B:156:0x0228, B:157:0x0234, B:159:0x023c, B:161:0x0240, B:162:0x024c, B:164:0x0271, B:166:0x0283, B:168:0x028b, B:170:0x0293, B:172:0x0297, B:174:0x02a7, B:176:0x02ae, B:178:0x02b6, B:179:0x02ba, B:181:0x02be, B:183:0x02cb, B:184:0x02d1, B:185:0x02d7, B:187:0x02df, B:188:0x02e8, B:190:0x02ec, B:192:0x02f2, B:193:0x02fe, B:195:0x0304, B:197:0x030c, B:199:0x0312, B:201:0x031a, B:203:0x0320, B:205:0x032d, B:206:0x0336, B:208:0x0340, B:209:0x034c, B:211:0x0352, B:213:0x035f, B:214:0x0368, B:216:0x0370, B:217:0x0379, B:219:0x037f, B:221:0x0398, B:228:0x03f7, B:235:0x03ff, B:237:0x040c, B:241:0x0416, B:242:0x0425, B:243:0x0419, B:245:0x0423, B:246:0x0420, B:247:0x042f, B:249:0x043d, B:251:0x0446, B:253:0x0453, B:254:0x046d, B:256:0x047c, B:258:0x0484, B:260:0x048a, B:262:0x0490, B:265:0x049e, B:266:0x0498, B:268:0x04a7, B:270:0x04ad, B:272:0x04b3, B:274:0x04b9, B:275:0x04c2, B:277:0x04dd, B:278:0x04f3, B:280:0x04fd, B:282:0x0503, B:283:0x050c, B:285:0x0510, B:287:0x0514, B:289:0x0518, B:290:0x0521, B:292:0x0529, B:293:0x0535, B:295:0x054f, B:297:0x0555, B:298:0x0588, B:300:0x058c, B:303:0x0592, B:304:0x059c, B:306:0x05a2, B:308:0x055e, B:310:0x0562, B:312:0x056d, B:313:0x0576, B:315:0x057e, B:317:0x05c0, B:318:0x05c9, B:320:0x05d3, B:322:0x05dd, B:324:0x05e3, B:325:0x05e5, B:326:0x05ed, B:328:0x05ff, B:329:0x06b7, B:332:0x03a0, B:333:0x03a8, B:336:0x03b1, B:338:0x03b7, B:340:0x03c4, B:342:0x03c8, B:343:0x03d2, B:344:0x03da, B:346:0x03e2, B:348:0x03ef, B:349:0x02a1, B:350:0x0277, B:351:0x01a1, B:353:0x0152, B:354:0x016b, B:356:0x0176, B:358:0x017c, B:359:0x06c0, B:361:0x0072, B:362:0x06c9), top: B:4:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x040c A[Catch: all -> 0x0739, TryCatch #0 {all -> 0x0739, blocks: (B:5:0x003d, B:7:0x0043, B:9:0x0047, B:10:0x0056, B:12:0x0057, B:17:0x0063, B:21:0x007c, B:23:0x0082, B:24:0x008e, B:26:0x0096, B:33:0x00a3, B:40:0x00ad, B:42:0x00bb, B:47:0x00d4, B:49:0x00d8, B:54:0x00df, B:56:0x00e3, B:57:0x00ec, B:59:0x00f4, B:60:0x00fd, B:62:0x0105, B:64:0x0110, B:66:0x011b, B:68:0x0121, B:69:0x0131, B:73:0x0602, B:74:0x0609, B:76:0x0615, B:78:0x0636, B:80:0x063e, B:82:0x0644, B:84:0x064c, B:85:0x0655, B:87:0x0660, B:88:0x0669, B:90:0x066d, B:92:0x0673, B:94:0x068d, B:95:0x0696, B:97:0x069a, B:99:0x069e, B:107:0x0707, B:109:0x070b, B:110:0x071f, B:111:0x0712, B:112:0x0719, B:113:0x06ae, B:115:0x061d, B:117:0x0625, B:119:0x062d, B:120:0x062f, B:121:0x06a3, B:123:0x06ab, B:124:0x0147, B:128:0x0190, B:130:0x019b, B:132:0x01a4, B:134:0x01aa, B:136:0x01ae, B:137:0x01b7, B:139:0x01c5, B:140:0x01d1, B:142:0x01d9, B:144:0x01e6, B:145:0x01f2, B:147:0x01f8, B:148:0x0204, B:151:0x020c, B:153:0x0214, B:154:0x0220, B:156:0x0228, B:157:0x0234, B:159:0x023c, B:161:0x0240, B:162:0x024c, B:164:0x0271, B:166:0x0283, B:168:0x028b, B:170:0x0293, B:172:0x0297, B:174:0x02a7, B:176:0x02ae, B:178:0x02b6, B:179:0x02ba, B:181:0x02be, B:183:0x02cb, B:184:0x02d1, B:185:0x02d7, B:187:0x02df, B:188:0x02e8, B:190:0x02ec, B:192:0x02f2, B:193:0x02fe, B:195:0x0304, B:197:0x030c, B:199:0x0312, B:201:0x031a, B:203:0x0320, B:205:0x032d, B:206:0x0336, B:208:0x0340, B:209:0x034c, B:211:0x0352, B:213:0x035f, B:214:0x0368, B:216:0x0370, B:217:0x0379, B:219:0x037f, B:221:0x0398, B:228:0x03f7, B:235:0x03ff, B:237:0x040c, B:241:0x0416, B:242:0x0425, B:243:0x0419, B:245:0x0423, B:246:0x0420, B:247:0x042f, B:249:0x043d, B:251:0x0446, B:253:0x0453, B:254:0x046d, B:256:0x047c, B:258:0x0484, B:260:0x048a, B:262:0x0490, B:265:0x049e, B:266:0x0498, B:268:0x04a7, B:270:0x04ad, B:272:0x04b3, B:274:0x04b9, B:275:0x04c2, B:277:0x04dd, B:278:0x04f3, B:280:0x04fd, B:282:0x0503, B:283:0x050c, B:285:0x0510, B:287:0x0514, B:289:0x0518, B:290:0x0521, B:292:0x0529, B:293:0x0535, B:295:0x054f, B:297:0x0555, B:298:0x0588, B:300:0x058c, B:303:0x0592, B:304:0x059c, B:306:0x05a2, B:308:0x055e, B:310:0x0562, B:312:0x056d, B:313:0x0576, B:315:0x057e, B:317:0x05c0, B:318:0x05c9, B:320:0x05d3, B:322:0x05dd, B:324:0x05e3, B:325:0x05e5, B:326:0x05ed, B:328:0x05ff, B:329:0x06b7, B:332:0x03a0, B:333:0x03a8, B:336:0x03b1, B:338:0x03b7, B:340:0x03c4, B:342:0x03c8, B:343:0x03d2, B:344:0x03da, B:346:0x03e2, B:348:0x03ef, B:349:0x02a1, B:350:0x0277, B:351:0x01a1, B:353:0x0152, B:354:0x016b, B:356:0x0176, B:358:0x017c, B:359:0x06c0, B:361:0x0072, B:362:0x06c9), top: B:4:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x043d A[Catch: all -> 0x0739, TryCatch #0 {all -> 0x0739, blocks: (B:5:0x003d, B:7:0x0043, B:9:0x0047, B:10:0x0056, B:12:0x0057, B:17:0x0063, B:21:0x007c, B:23:0x0082, B:24:0x008e, B:26:0x0096, B:33:0x00a3, B:40:0x00ad, B:42:0x00bb, B:47:0x00d4, B:49:0x00d8, B:54:0x00df, B:56:0x00e3, B:57:0x00ec, B:59:0x00f4, B:60:0x00fd, B:62:0x0105, B:64:0x0110, B:66:0x011b, B:68:0x0121, B:69:0x0131, B:73:0x0602, B:74:0x0609, B:76:0x0615, B:78:0x0636, B:80:0x063e, B:82:0x0644, B:84:0x064c, B:85:0x0655, B:87:0x0660, B:88:0x0669, B:90:0x066d, B:92:0x0673, B:94:0x068d, B:95:0x0696, B:97:0x069a, B:99:0x069e, B:107:0x0707, B:109:0x070b, B:110:0x071f, B:111:0x0712, B:112:0x0719, B:113:0x06ae, B:115:0x061d, B:117:0x0625, B:119:0x062d, B:120:0x062f, B:121:0x06a3, B:123:0x06ab, B:124:0x0147, B:128:0x0190, B:130:0x019b, B:132:0x01a4, B:134:0x01aa, B:136:0x01ae, B:137:0x01b7, B:139:0x01c5, B:140:0x01d1, B:142:0x01d9, B:144:0x01e6, B:145:0x01f2, B:147:0x01f8, B:148:0x0204, B:151:0x020c, B:153:0x0214, B:154:0x0220, B:156:0x0228, B:157:0x0234, B:159:0x023c, B:161:0x0240, B:162:0x024c, B:164:0x0271, B:166:0x0283, B:168:0x028b, B:170:0x0293, B:172:0x0297, B:174:0x02a7, B:176:0x02ae, B:178:0x02b6, B:179:0x02ba, B:181:0x02be, B:183:0x02cb, B:184:0x02d1, B:185:0x02d7, B:187:0x02df, B:188:0x02e8, B:190:0x02ec, B:192:0x02f2, B:193:0x02fe, B:195:0x0304, B:197:0x030c, B:199:0x0312, B:201:0x031a, B:203:0x0320, B:205:0x032d, B:206:0x0336, B:208:0x0340, B:209:0x034c, B:211:0x0352, B:213:0x035f, B:214:0x0368, B:216:0x0370, B:217:0x0379, B:219:0x037f, B:221:0x0398, B:228:0x03f7, B:235:0x03ff, B:237:0x040c, B:241:0x0416, B:242:0x0425, B:243:0x0419, B:245:0x0423, B:246:0x0420, B:247:0x042f, B:249:0x043d, B:251:0x0446, B:253:0x0453, B:254:0x046d, B:256:0x047c, B:258:0x0484, B:260:0x048a, B:262:0x0490, B:265:0x049e, B:266:0x0498, B:268:0x04a7, B:270:0x04ad, B:272:0x04b3, B:274:0x04b9, B:275:0x04c2, B:277:0x04dd, B:278:0x04f3, B:280:0x04fd, B:282:0x0503, B:283:0x050c, B:285:0x0510, B:287:0x0514, B:289:0x0518, B:290:0x0521, B:292:0x0529, B:293:0x0535, B:295:0x054f, B:297:0x0555, B:298:0x0588, B:300:0x058c, B:303:0x0592, B:304:0x059c, B:306:0x05a2, B:308:0x055e, B:310:0x0562, B:312:0x056d, B:313:0x0576, B:315:0x057e, B:317:0x05c0, B:318:0x05c9, B:320:0x05d3, B:322:0x05dd, B:324:0x05e3, B:325:0x05e5, B:326:0x05ed, B:328:0x05ff, B:329:0x06b7, B:332:0x03a0, B:333:0x03a8, B:336:0x03b1, B:338:0x03b7, B:340:0x03c4, B:342:0x03c8, B:343:0x03d2, B:344:0x03da, B:346:0x03e2, B:348:0x03ef, B:349:0x02a1, B:350:0x0277, B:351:0x01a1, B:353:0x0152, B:354:0x016b, B:356:0x0176, B:358:0x017c, B:359:0x06c0, B:361:0x0072, B:362:0x06c9), top: B:4:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0451  */
    @Override // X.InterfaceC65642y0
    /* renamed from: A06, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void buildRowViewTypes(X.AnonymousClass306 r27, X.C3XG r28, X.C75113Zb r29) {
        /*
            Method dump skipped, instructions count: 1863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65672y3.buildRowViewTypes(X.306, X.3XG, X.3Zb):void");
    }

    @Override // X.InterfaceC65652y1
    public final void AHY(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        String str;
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        if (i == EnumC65592xv.A0I.ordinal()) {
            AnonymousClass398 anonymousClass398 = this.A02;
            if (anonymousClass398 == null) {
                str = "binders";
            } else {
                C3A1 c3a1 = (C3A1) anonymousClass398.A0k.getValue();
                String id = c38321qM.getId();
                if (id != null) {
                    c3a1.A00.AGQ();
                    c3a1.A01.remove(id);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C692439k c692439k = this.A05;
            if (c692439k == null) {
                str = "lithoFeedBinderGroup";
            } else {
                c692439k.AHY(c38321qM, c75113Zb, i);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC65652y1
    public final void E5V(C38321qM c38321qM, C75113Zb c75113Zb, Integer num, int i) {
        String str;
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(num, 3);
        if (i == EnumC65592xv.A0I.ordinal()) {
            AnonymousClass398 anonymousClass398 = this.A02;
            if (anonymousClass398 == null) {
                str = "binders";
            } else {
                C3A1 c3a1 = (C3A1) anonymousClass398.A0k.getValue();
                String id = c38321qM.getId();
                if (id != null) {
                    c3a1.A03(id, new C206209Bd(((C691939f) ((C691539b) this.A0M.getValue()).A0K.getValue()).A00(), c38321qM, c75113Zb), Integer.valueOf(getViewModelHash(i, c38321qM, c75113Zb)));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C692439k c692439k = this.A05;
            if (c692439k == null) {
                str = "lithoFeedBinderGroup";
            } else {
                c692439k.E5V(c38321qM, c75113Zb, num, i);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "FeedItem";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        if (EnumC65592xv.values()[i] == EnumC65592xv.A0v) {
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.FeedCommentRowModelAndState");
            return ((C79233gU) obj2).A01.hashCode();
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
        return Arrays.hashCode(new Object[]{((InterfaceC38371qR) obj).BQN().getId(), Integer.valueOf(i)});
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A02, 36319596370009651L) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0146, code lost:
    
        if (r4.A0O != false) goto L29;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0054. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023d  */
    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getViewModelHash(int r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65672y3.getViewModelHash(int, java.lang.Object, java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r2 != 95) goto L10;
     */
    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getViewSubTypeName(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            X.2xv[] r0 = X.EnumC65592xv.values()
            r1 = r0[r5]
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia"
            X.C14360o3.A0C(r6, r0)
            X.1qR r6 = (X.InterfaceC38371qR) r6
            X.1qM r3 = r6.BQN()
            int r2 = r1.ordinal()
            r0 = 36
            r1 = 0
            if (r2 == r0) goto L39
            r0 = 6
            if (r2 == r0) goto L2a
            r0 = 87
            if (r2 == r0) goto L39
            r0 = 95
            if (r2 == r0) goto L2a
        L29:
            return r1
        L2a:
            int r0 = r3.A0x()
            X.1qM r0 = r3.A1e(r0)
            if (r0 == 0) goto L29
            X.1tc r0 = r0.BRp()
            goto L3d
        L39:
            X.1tc r0 = r3.BRp()
        L3d:
            java.lang.String r1 = r0.name()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65672y3.getViewSubTypeName(int, java.lang.Object):java.lang.String");
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        C14360o3.A0B(view, 0);
        if (i == EnumC65592xv.A0D.ordinal()) {
            AbstractC25651Mw.A00(this.A09).A02((InterfaceC41501vz) view.getTag(), LYK.class);
        }
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewRecycled(View view, int i, Object obj, Object obj2) {
        C14360o3.A0B(view, 0);
        if (EnumC65592xv.values()[i] == EnumC65592xv.A0I) {
            AnonymousClass398 anonymousClass398 = this.A02;
            if (anonymousClass398 == null) {
                C14360o3.A0F("binders");
                throw C00O.createAndThrow();
            }
            ((C46u) anonymousClass398.A0k.getValue()).A05(view);
        }
    }

    private final void A00() {
        C77013cn c77013cn = this.A04;
        String str = "inlineSurveyDelegate";
        if (c77013cn != null) {
            InterfaceC686036x interfaceC686036x = this.A00;
            if (interfaceC686036x == null) {
                str = "delegate";
            } else {
                C3FQ scrollingViewProxy = interfaceC686036x.Br6().getScrollingViewProxy();
                C77013cn c77013cn2 = this.A04;
                if (c77013cn2 != null) {
                    c77013cn.A01 = new C41583IaW(c77013cn2, scrollingViewProxy);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A02(View view, EnumC65592xv enumC65592xv, C40971v4 c40971v4, Object obj) {
        AbstractC41561w6.A00(this.A09).A01(c40971v4);
        if (obj instanceof C75113Zb) {
            C691539b c691539b = (C691539b) this.A0M.getValue();
            C75113Zb c75113Zb = (C75113Zb) obj;
            C14360o3.A0B(c40971v4, 0);
            C14360o3.A0B(c75113Zb, 1);
            C38321qM c38321qM = c40971v4.A0K;
            A01(view, new C79003g6(C691539b.A00(c691539b, c38321qM, c75113Zb), c38321qM, c75113Zb), enumC65592xv);
            return;
        }
        C38321qM c38321qM2 = c40971v4.A0K;
        A04(view, enumC65592xv, c38321qM2, obj);
        A03(view, enumC65592xv, c38321qM2, obj);
    }

    @Deprecated(message = "This function is not type safe - you should not be using this - if you can move viewTypes from here you should")
    private final void A03(View view, EnumC65592xv enumC65592xv, Object obj, Object obj2) {
        AnonymousClass398 anonymousClass398 = this.A02;
        if (anonymousClass398 == null) {
            C14360o3.A0F("binders");
            throw C00O.createAndThrow();
        }
        int ordinal = enumC65592xv.ordinal();
        if (ordinal != 24) {
            if (ordinal == 35) {
                C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.FeedCommentRowModelAndState");
                C79233gU c79233gU = (C79233gU) obj2;
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
                InterfaceC38371qR interfaceC38371qR = (InterfaceC38371qR) obj;
                c79233gU.A00 = AbstractC76883ca.A00(interfaceC38371qR.BQN(), c79233gU.A03, true);
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
                C38321qM BQN = interfaceC38371qR.BQN();
                C85823sB c85823sB = (C85823sB) anonymousClass398.A0S.getValue();
                Object tag = view.getTag();
                if (tag != null) {
                    UserSession userSession = this.A09;
                    InterfaceC60442pS interfaceC60442pS = this.A0C;
                    c85823sB.A06(AbstractC99644dh.A01(userSession, BQN, interfaceC60442pS, c79233gU), (C87323uq) tag, interfaceC60442pS, c79233gU);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.comments.row.FeedCommentRowViewBinder.Holder");
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Item type unhandled, item type = ");
                sb.append(enumC65592xv);
                throw new UnsupportedOperationException(sb.toString());
            }
        } else {
            C77293dF c77293dF = (C77293dF) ((C691939f) ((C691539b) this.A0M.getValue()).A0K.getValue()).A0O.getValue();
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.ui.listview.gapview.gapviewmodel.GapViewModel");
            C76993cl c76993cl = (C76993cl) obj;
            Context context = this.A06;
            C14360o3.A0B(c76993cl, 0);
            C14360o3.A0B(context, 1);
            AbstractC13880nE.A0W(view, c77293dF.A00(context, c76993cl.A00, c76993cl.A01));
        }
        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, obj, obj2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x003b. Please report as an issue. */
    private final void A04(View view, EnumC65592xv enumC65592xv, Object obj, Object obj2) {
        InterfaceC60442pS interfaceC60442pS;
        C86933u7 c86933u7;
        if (obj instanceof InterfaceC38371qR) {
            UserSession userSession = this.A09;
            C71313Hs A00 = C71313Hs.A00(userSession);
            C14360o3.A07(A00);
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
            C38321qM BQN = ((InterfaceC38371qR) obj).BQN();
            int ordinal = enumC65592xv.ordinal();
            if (ordinal != 43 && ordinal != 39) {
                if (ordinal != 1 && ordinal != 11) {
                    if (ordinal != 44) {
                        if (ordinal != 82) {
                            if (ordinal != 92 && ordinal != 91) {
                                switch (ordinal) {
                                    case 35:
                                    case 81:
                                    case 83:
                                        break;
                                    default:
                                        A00.A04(view);
                                        return;
                                }
                            }
                        }
                    }
                }
                if (!(obj2 instanceof C75113Zb)) {
                    return;
                }
                interfaceC60442pS = this.A0C;
                c86933u7 = new C86933u7(this.A06, (InterfaceC75133Zd) obj2, userSession, BQN);
                A00.A0A(view, new C79623hD(c86933u7, userSession, BQN, interfaceC60442pS));
            }
            interfaceC60442pS = this.A0C;
            c86933u7 = null;
            A00.A0A(view, new C79623hD(c86933u7, userSession, BQN, interfaceC60442pS));
        }
    }

    public final C33P A05() {
        C33P c33p = this.A03;
        if (c33p != null) {
            return c33p;
        }
        C14360o3.A0F("feedVideoModule");
        throw C00O.createAndThrow();
    }

    public final void A07(C19260xA c19260xA) {
        AnonymousClass398 anonymousClass398 = this.A02;
        if (anonymousClass398 == null) {
            C14360o3.A0F("binders");
            throw C00O.createAndThrow();
        }
        ((C85793s8) anonymousClass398.A0g.getValue()).A00 = c19260xA;
    }

    public final void A08(InterfaceC686036x interfaceC686036x) {
        this.A00 = interfaceC686036x;
        Context context = this.A06;
        UserSession userSession = this.A09;
        InterfaceC60442pS interfaceC60442pS = this.A0C;
        boolean z = this.A0Q;
        FragmentActivity fragmentActivity = this.A07;
        C57332k8 c57332k8 = this.A0D;
        C33P A05 = A05();
        C1M1 c1m1 = this.A0F;
        C2d4 c2d4 = this.A0V;
        InterfaceC65702y7 interfaceC65702y7 = this.A0X;
        boolean z2 = this.A0T;
        String str = this.A0I;
        C07X c07x = this.A0U;
        C65502xm c65502xm = (C65502xm) this.A0N.getValue();
        C62862tP c62862tP = this.A08;
        boolean z3 = false;
        AnonymousClass398 anonymousClass398 = new AnonymousClass398(context, fragmentActivity, c07x, c2d4, c62862tP, userSession, interfaceC65702y7, interfaceC686036x, interfaceC60442pS, c57332k8, c65502xm, A05, c1m1, str, "FeedItem", z, z2, false, true);
        this.A02 = anonymousClass398;
        if (this.A0B != null) {
            this.A01 = new C39W(context, (C39V) anonymousClass398.A0W.getValue());
        }
        C60972qL c60972qL = this.A0Z;
        InterfaceC09390do interfaceC09390do = this.A0M;
        C691939f c691939f = (C691939f) ((C691539b) interfaceC09390do.getValue()).A0K.getValue();
        C692339j c692339j = (C692339j) ((C691539b) interfaceC09390do.getValue()).A0J.getValue();
        AnonymousClass398 anonymousClass3982 = this.A02;
        if (anonymousClass3982 == null) {
            C14360o3.A0F("binders");
            throw C00O.createAndThrow();
        }
        if (this.A0S) {
            z3 = true;
        }
        C206989Ed c206989Ed = new C206989Ed(this, 29);
        C33P A052 = A05();
        String str2 = this.A0K;
        Integer num = this.A0a;
        this.A05 = new C692439k(c62862tP, this.A0W, this.A0Y, c692339j, c691939f, c60972qL, anonymousClass3982, A052, c1m1, num, "FeedItemBinderGroup", str2, this.A0J, c206989Ed, z3);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return A0b;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getViewTypeName(int i) {
        return AnonymousClass001.A0S("FeedItem[", EnumC65592xv.values()[i].A00, ']');
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.2y7, java.lang.Object] */
    public C65672y3(FragmentActivity fragmentActivity, C07X c07x, C2d4 c2d4, C62862tP c62862tP, C19260xA c19260xA, C65682y4 c65682y4, C61142qc c61142qc, InterfaceC63362uJ interfaceC63362uJ, C60972qL c60972qL, C57332k8 c57332k8, SearchContext searchContext, C1M1 c1m1, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.A07 = fragmentActivity;
        this.A0Z = c60972qL;
        this.A0A = c61142qc;
        this.A0F = c1m1;
        this.A0U = c07x;
        this.A0D = c57332k8;
        this.A0B = interfaceC63362uJ;
        this.A08 = c62862tP;
        this.A0T = z;
        this.A0V = c2d4;
        this.A0I = str;
        this.A0H = num;
        this.A0R = z2;
        this.A0S = z3;
        this.A0J = str2;
        this.A0a = num2;
        this.A0Y = c65682y4;
        this.A0W = c19260xA;
        this.A0K = str3;
        this.A0L = str4;
        this.A0G = bool;
        this.A0E = searchContext;
        this.A09 = c60972qL.A01;
        Context context = c60972qL.A00;
        this.A06 = context;
        this.A0C = c60972qL.A02;
        this.A0N = AbstractC09440dt.A01(new C206939Dy(this, 39));
        this.A0P = AbstractC09440dt.A01(new C206939Dy(this, 41));
        this.A0O = AbstractC09440dt.A00(EnumC09460dv.A04, new C206939Dy(this, 40));
        this.A0M = AbstractC09440dt.A01(new C206939Dy(this, 38));
        this.A0X = new Object();
        this.A0Q = AbstractC56862jK.A00(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r10, android.view.View r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r9 = this;
            r0 = -1341396650(0xffffffffb00be956, float:-5.0899496E-10)
            int r3 = X.C0f9.A03(r0)
            r4 = 1
            X.C14360o3.A0B(r11, r4)
            r0 = 2
            X.C14360o3.A0B(r12, r0)
            r0 = 3
            X.C14360o3.A0B(r13, r0)
            X.2xv[] r0 = X.EnumC65592xv.values()     // Catch: java.lang.Throwable -> Lce
            r2 = r0[r10]     // Catch: java.lang.Throwable -> Lce
            r7 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L2f
            java.lang.String r1 = "FeedItemBinderGroup.bindView: "
            java.lang.String r0 = r2.A00     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)     // Catch: java.lang.Throwable -> Lce
            r0 = -105738237(0xfffffffff9b29003, float:-1.1589372E35)
            X.C0fO.A01(r1, r0)     // Catch: java.lang.Throwable -> Lce
        L2f:
            X.0do r0 = r9.A0M     // Catch: java.lang.Throwable -> Lce
            java.lang.Object r6 = r0.getValue()     // Catch: java.lang.Throwable -> Lce
            X.39b r6 = (X.C691539b) r6     // Catch: java.lang.Throwable -> Lce
            boolean r0 = r12 instanceof X.C40971v4     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L5a
            r1 = r12
            X.1v4 r1 = (X.C40971v4) r1     // Catch: java.lang.Throwable -> Lce
            r0 = 0
            X.9BL r6 = new X.9BL     // Catch: java.lang.Throwable -> Lce
            r6.<init>(r1, r0)     // Catch: java.lang.Throwable -> Lce
        L44:
            X.3g8 r6 = (X.InterfaceC79013g8) r6     // Catch: java.lang.Throwable -> Lce
            r5 = r6
            r1 = 0
            boolean r0 = r6 instanceof X.C9BL     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto La3
            X.9BL r5 = (X.C9BL) r5     // Catch: java.lang.Throwable -> Lce
            int r0 = r5.A00     // Catch: java.lang.Throwable -> Lce
            if (r0 != r1) goto L99
            java.lang.Object r0 = r5.A01     // Catch: java.lang.Throwable -> Lce
            X.1v4 r0 = (X.C40971v4) r0     // Catch: java.lang.Throwable -> Lce
            r9.A02(r11, r2, r0, r13)     // Catch: java.lang.Throwable -> Lce
            goto Lb3
        L5a:
            boolean r0 = r12 instanceof X.C38321qM     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L96
            r5 = r12
            X.1qM r5 = (X.C38321qM) r5     // Catch: java.lang.Throwable -> Lce
            boolean r0 = r5.CdW()     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L85
            java.util.concurrent.ConcurrentMap r1 = r6.A0H     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = r5.getId()     // Catch: java.lang.Throwable -> Lce
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L85
            java.lang.String r0 = r5.getId()     // Catch: java.lang.Throwable -> Lce
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto Lc6
            X.1v4 r0 = (X.C40971v4) r0     // Catch: java.lang.Throwable -> Lce
            X.9BL r6 = new X.9BL     // Catch: java.lang.Throwable -> Lce
            r6.<init>(r0, r4)     // Catch: java.lang.Throwable -> Lce
            goto L44
        L85:
            boolean r0 = r13 instanceof X.C75113Zb     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L96
            r1 = r13
            X.3Zb r1 = (X.C75113Zb) r1     // Catch: java.lang.Throwable -> Lce
            X.3g4 r0 = X.C691539b.A00(r6, r5, r1)     // Catch: java.lang.Throwable -> Lce
            X.3g6 r6 = new X.3g6     // Catch: java.lang.Throwable -> Lce
            r6.<init>(r0, r5, r1)     // Catch: java.lang.Throwable -> Lce
            goto L44
        L96:
            X.4e7 r6 = X.C99854e7.A00     // Catch: java.lang.Throwable -> Lce
            goto L44
        L99:
            if (r0 != r4) goto La3
            java.lang.Object r0 = r5.A01     // Catch: java.lang.Throwable -> Lce
            X.1v4 r0 = (X.C40971v4) r0     // Catch: java.lang.Throwable -> Lce
            r9.A02(r11, r2, r0, r13)     // Catch: java.lang.Throwable -> Lce
            goto Lb3
        La3:
            boolean r0 = r6 instanceof X.C79003g6     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto Lad
            X.3g6 r6 = (X.C79003g6) r6     // Catch: java.lang.Throwable -> Lce
            r9.A01(r11, r6, r2)     // Catch: java.lang.Throwable -> Lce
            goto Lb3
        Lad:
            r9.A04(r11, r2, r12, r13)     // Catch: java.lang.Throwable -> Lce
            r9.A03(r11, r2, r12, r13)     // Catch: java.lang.Throwable -> Lce
        Lb3:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto Lbf
            r0 = -750788923(0xffffffffd33fdec5, float:-8.240762E11)
            X.C0fO.A00(r0)
        Lbf:
            r0 = -625944826(0xffffffffdab0d706, float:-2.4888008E16)
            X.C0f9.A0A(r0, r3)
            return
        Lc6:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lce
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lce
            throw r0     // Catch: java.lang.Throwable -> Lce
        Lce:
            r2 = move-exception
            r0 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r0)
            if (r0 == 0) goto Ldd
            r0 = 287815056(0x1127b590, float:1.3229925E-28)
            X.C0fO.A00(r0)
        Ldd:
            r0 = -69090336(0xfffffffffbe1c3e0, float:-2.3444792E36)
            X.C0f9.A0A(r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65672y3.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
    
        if (r2 != null) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x004b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x06b7  */
    /* JADX WARN: Type inference failed for: r0v114, types: [X.3cT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v128, types: [X.3cT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v130, types: [X.3cT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v132, types: [X.3cT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v134, types: [X.3cT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v136, types: [X.3cT, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View createView(int r31, android.view.ViewGroup r32) {
        /*
            Method dump skipped, instructions count: 1956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65672y3.createView(int, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0068. Please report as an issue. */
    private final void A01(View view, C79003g6 c79003g6, EnumC65592xv enumC65592xv) {
        C92474Ce c92474Ce;
        Object tag;
        String str;
        float f;
        InterfaceC16620sF interfaceC16620sF;
        C33P A05;
        Object tag2;
        C38321qM c38321qM = c79003g6.A01;
        C75113Zb c75113Zb = c79003g6.A02;
        A04(view, enumC65592xv, c38321qM, c75113Zb);
        C692439k c692439k = this.A05;
        if (c692439k == null) {
            C14360o3.A0F("lithoFeedBinderGroup");
            throw C00O.createAndThrow();
        }
        boolean A00 = c692439k.A00(view, enumC65592xv, c38321qM, c75113Zb);
        C78983g4 c78983g4 = c79003g6.A00;
        if (A00) {
            if (enumC65592xv == EnumC65592xv.A0l) {
                interfaceC16620sF = c78983g4.A0f;
                A05 = A05();
                Object tag3 = view.getTag();
                if (tag3 != null) {
                    tag2 = ((C81463kG) tag3).A06;
                    interfaceC16620sF.invoke(A05, tag2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.feedfullheightmedia.viewholder.FeedFullHeightMediaViewHolder");
                }
            }
            ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
            return;
        }
        AnonymousClass398 anonymousClass398 = this.A02;
        if (anonymousClass398 != null) {
            switch (enumC65592xv.ordinal()) {
                case 0:
                    if (this.A0Q) {
                        ((CTT) anonymousClass398.A07.getValue()).A00(view, (AnonymousClass414) c78983g4.A00.invoke());
                    }
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 1:
                    c92474Ce = (C92474Ce) anonymousClass398.A0A.getValue();
                    tag = view.getTag();
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                    }
                    c92474Ce.A02((C5LT) c78983g4.A0X.invoke(enumC65592xv), (C81373k7) tag, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 2:
                    c92474Ce = (C92474Ce) anonymousClass398.A0B.getValue();
                    tag = view.getTag();
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                    }
                    c92474Ce.A02((C5LT) c78983g4.A0X.invoke(enumC65592xv), (C81373k7) tag, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 3:
                    c92474Ce = (C92474Ce) anonymousClass398.A0D.getValue();
                    tag = view.getTag();
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                    }
                    c92474Ce.A02((C5LT) c78983g4.A0X.invoke(enumC65592xv), (C81373k7) tag, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 4:
                    anonymousClass398.A0F.getValue();
                    Object tag4 = view.getTag();
                    if (tag4 != null) {
                        C37514GfW.A00((C51760Mtj) c78983g4.A04.invoke(), (C4Cm) tag4, this.A0C);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.brandedcontent.BrandedContentTagViewBinder.Holder");
                case 5:
                    anonymousClass398.A0a.getValue();
                    Object tag5 = view.getTag();
                    if (tag5 != null) {
                        C38459Gvg c38459Gvg = (C38459Gvg) tag5;
                        C26079Bg8 c26079Bg8 = (C26079Bg8) c78983g4.A0C.invoke();
                        C14360o3.A0B(c38459Gvg, 0);
                        C14360o3.A0B(c26079Bg8, 1);
                        InterfaceC09390do interfaceC09390do = c38459Gvg.A01;
                        Object value = interfaceC09390do.getValue();
                        C14360o3.A07(value);
                        ((TextView) value).setText(c26079Bg8.A04);
                        View view2 = c38459Gvg.A00;
                        Context context = view2.getContext();
                        view2.setBackgroundColor(context.getColor(AbstractC53242c7.A0D(context)));
                        if (c26079Bg8.A05) {
                            Object value2 = interfaceC09390do.getValue();
                            C14360o3.A07(value2);
                            ((TextView) value2).setTextAppearance(R.style.igds_emphasized_body_2);
                            Object value3 = interfaceC09390do.getValue();
                            C14360o3.A07(value3);
                            ((TextView) value3).setTextColor(context.getColor(AbstractC53242c7.A07(context)));
                            Object value4 = c38459Gvg.A02.getValue();
                            C14360o3.A07(value4);
                            ((ImageView) value4).setImageResource(R.drawable.instagram_gift_card_pano_outline_24);
                        }
                        String str2 = c26079Bg8.A03;
                        if (str2 != null) {
                            Object value5 = interfaceC09390do.getValue();
                            C14360o3.A07(value5);
                            Object value6 = interfaceC09390do.getValue();
                            C14360o3.A07(value6);
                            String A06 = AbstractC13670mt.A06("%s %s", ((TextView) value6).getText(), str2);
                            Object value7 = interfaceC09390do.getValue();
                            C14360o3.A07(value7);
                            Context context2 = ((View) value7).getContext();
                            Object value8 = interfaceC09390do.getValue();
                            C14360o3.A07(value8);
                            AnonymousClass773.A07(new C52188N8b(new C012804r(16, (CharSequence) null), c26079Bg8, C05F.A01, str2, context2.getColor(AbstractC53242c7.A06(((View) value8).getContext()))), (TextView) value5, str2, A06);
                        }
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.shopping.adapter.incentives.IgFeedFundedIncentiveBannerSectionViewBinder.Holder");
                case 6:
                    C3VW c3vw = (C3VW) anonymousClass398.A0I.getValue();
                    Object tag6 = view.getTag();
                    if (tag6 != null) {
                        c3vw.A02(this.A08, (C41J) c78983g4.A07.invoke(), (C41H) c78983g4.A0V.invoke(this.A07), (C3W3) tag6, this.A0C, c75113Zb);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.carousel.media.ui.viewbinder.CarouselMediaViewHolder");
                case 7:
                    AbstractC101834hu.A00(this.A07, this.A06, this.A09, (C909043h) view.getTag(), (C85083qw) c78983g4.A06.invoke(), c75113Zb, false);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 8:
                    anonymousClass398.A0G.getValue();
                    Object tag7 = view.getTag();
                    if (tag7 != null) {
                        C47935LFj.A00((C9CD) c78983g4.A05.invoke(), this.A0C, (LYW) tag7, c75113Zb);
                        Object tag8 = view.getTag();
                        if (tag8 != null) {
                            AbstractC25651Mw.A00(this.A09).A01((LYW) tag8, LYK.class);
                            ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.channel.BroadcastChannelCTABarViewBinder.Holder");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.channel.BroadcastChannelCTABarViewBinder.Holder");
                case 9:
                    anonymousClass398.A0M.getValue();
                    Object tag9 = view.getTag();
                    if (tag9 != null) {
                        C41654Ibm.A01((C41103IHu) tag9, (JFV) c78983g4.A08.invoke());
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.ui.rows.collaborative.CollaborativePostInviteLegacyBinder.Holder");
                case 10:
                    c92474Ce = (C92474Ce) anonymousClass398.A0N.getValue();
                    tag = view.getTag();
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                    }
                    c92474Ce.A02((C5LT) c78983g4.A0X.invoke(enumC65592xv), (C81373k7) tag, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 11:
                    Object tag10 = view.getTag();
                    if (tag10 != null) {
                        C3Y6 c3y6 = (C3Y6) tag10;
                        ((C37504GfM) anonymousClass398.A0O.getValue()).A00(this.A07, this.A0X, (C38662Gz3) c78983g4.A0b.invoke(c3y6, A05()), c3y6, this.A0C, c75113Zb);
                        c78983g4.A0e.invoke(A05(), c3y6);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.collection.holder.CollectionTopMainBottomThumbnailsViewHolder");
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    Object tag11 = view.getTag();
                    C14360o3.A0C(tag11, "null cannot be cast to non-null type com.instagram.feed.comments.row.CommentsLoadingSpinnerViewBinder.Holder");
                    ((C38411Gum) tag11).A00.setLoadingStatus(C3T1.LOADING);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case 14:
                    anonymousClass398.A0Q.getValue();
                    Object tag12 = view.getTag();
                    if (tag12 != null) {
                        AbstractC27459CAb abstractC27459CAb = (AbstractC27459CAb) tag12;
                        C9BH c9bh = (C9BH) c78983g4.A0A.invoke();
                        C14360o3.A0B(c38321qM, 1);
                        C14360o3.A0B(abstractC27459CAb, 2);
                        C14360o3.A0B(c9bh, 3);
                        InterfaceC104934o6 B5q = c38321qM.A0C.B5q();
                        if (B5q != null) {
                            abstractC27459CAb.A02(B5q);
                            abstractC27459CAb.A01(c9bh, B5q);
                            abstractC27459CAb.A00(c9bh);
                        }
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.contentcontrol.ContentControlHolder");
                case Process.SIGTERM /* 15 */:
                    C39Q c39q = anonymousClass398.A03;
                    Object tag13 = view.getTag();
                    if (tag13 != null) {
                        c39q.A00((C38523Gwj) tag13, c38321qM, c75113Zb);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.featuredproducts.FeaturedProductsUpsellCTAViewBinder.Holder");
                case 16:
                    C39701HjX c39701HjX = (C39701HjX) anonymousClass398.A0R.getValue();
                    Object tag14 = view.getTag();
                    if (tag14 != null) {
                        c39701HjX.A00((C211739Zk) c78983g4.A0B.invoke(), this.A0C, (C41126IIr) tag14);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.feedaddyours.FeedAddYoursMediaCTABarViewBinder.Holder");
                case 17:
                case 18:
                case Process.SIGSTOP /* 19 */:
                case 20:
                case 21:
                case 23:
                case 24:
                case 28:
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                case 30:
                case 32:
                case 35:
                case 45:
                case 52:
                case 54:
                case StringTreeSet.PAYLOAD_MASK /* 63 */:
                case 68:
                case 70:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                default:
                    A03(view, enumC65592xv, c38321qM, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 22:
                    Object tag15 = view.getTag();
                    if (tag15 != null) {
                        C81463kG c81463kG = (C81463kG) tag15;
                        C97404Za c97404Za = (C97404Za) c78983g4.A0W.invoke(A05());
                        AnonymousClass398 anonymousClass3982 = this.A02;
                        if (anonymousClass3982 != null) {
                            ((C4FZ) anonymousClass3982.A0V.getValue()).A01(c97404Za, c81463kG, c75113Zb);
                            c78983g4.A0f.invoke(A05(), c81463kG.A06);
                            ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                            return;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.feedfullheightmedia.viewholder.FeedFullHeightMediaViewHolder");
                    }
                    break;
                case 25:
                    view.setTag(new Object());
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 26:
                    C39446HbY c39446HbY = (C39446HbY) anonymousClass398.A0u.getValue();
                    Object tag16 = view.getTag();
                    if (tag16 != null) {
                        c39446HbY.A06((C206329Bp) c78983g4.A0P.invoke(), (C38420Guv) tag16);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.shopping.adapter.ifu.ShoppingIFUViewBinder.Holder");
                case 27:
                    c92474Ce = (C92474Ce) anonymousClass398.A0b.getValue();
                    tag = view.getTag();
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                    }
                    c92474Ce.A02((C5LT) c78983g4.A0X.invoke(enumC65592xv), (C81373k7) tag, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 31:
                    c92474Ce = (C92474Ce) anonymousClass398.A0Z.getValue();
                    tag = view.getTag();
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                    }
                    c92474Ce.A02((C5LT) c78983g4.A0X.invoke(enumC65592xv), (C81373k7) tag, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 33:
                    UserSession userSession = this.A09;
                    C36274FzR A002 = FCM.A00(userSession);
                    User A2E = c38321qM.A2E(userSession);
                    if (A2E != null) {
                        C31363DqS c31363DqS = new C31363DqS((List) A002.A00.get(A2E.getId()));
                        Integer num = this.A0a;
                        if (num != null) {
                            C31444Dro c31444Dro = AbstractC37932GmU.A00;
                            Context context3 = this.A06;
                            FragmentActivity fragmentActivity = this.A07;
                            InterfaceC60442pS interfaceC60442pS = this.A0C;
                            Object tag17 = view.getTag();
                            if (tag17 != null) {
                                C31478DsN c31478DsN = (C31478DsN) tag17;
                                InterfaceC686036x interfaceC686036x = this.A00;
                                if (interfaceC686036x != null) {
                                    InterfaceC75603aR BxQ = interfaceC686036x.BxQ();
                                    C65682y4 c65682y4 = this.A0Y;
                                    C19260xA c19260xA = this.A0W;
                                    c31444Dro.A01(context3, c75113Zb.A0d, fragmentActivity, interfaceC60442pS, c19260xA, userSession, new C32967Eey(fragmentActivity, interfaceC60442pS, c19260xA, userSession, c65682y4, c38321qM, c75113Zb, BxQ, num), c31363DqS, c31478DsN, new C42676IuX(c75113Zb), null, null, null, false, false);
                                }
                                C14360o3.A0F("delegate");
                                throw C00O.createAndThrow();
                            }
                            throw new NullPointerException(AbstractC111324zv.A00(2786));
                        }
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                case 34:
                    C114665Fw c114665Fw = (C114665Fw) c78983g4.A02.invoke();
                    if (c114665Fw != null) {
                        Object tag18 = view.getTag();
                        if (tag18 != null) {
                            IQa.A01(this.A08, c114665Fw, (C38454Gvb) tag18, 0, 0);
                        } else {
                            throw new NullPointerException(AbstractC111324zv.A00(4985));
                        }
                    }
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 36:
                    C85993sW c85993sW = (C85993sW) anonymousClass398.A0n.getValue();
                    Object tag19 = view.getTag();
                    if (tag19 != null) {
                        C81303k0 c81303k0 = (C81303k0) tag19;
                        C79723hN c79723hN = (C79723hN) c78983g4.A0d.invoke(A05(), this.A0X);
                        int position = c75113Zb.getPosition();
                        InterfaceC60442pS interfaceC60442pS2 = this.A0C;
                        int i = -1;
                        C56352iT AYT = this.A0V.AYT();
                        if (AYT != null) {
                            i = AYT.AYS();
                        }
                        c85993sW.A07(interfaceC60442pS2, new C86203sr(null, i, false, false), c79723hN, c81303k0, position, true);
                        interfaceC16620sF = c78983g4.A0f;
                        A05 = A05();
                        tag2 = view.getTag();
                        if (tag2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.ui.rows.video.holder.FeedVideoViewHolder");
                        }
                        interfaceC16620sF.invoke(A05, tag2);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.ui.rows.mediaview.ui.holder.MediaViewHolder");
                case 37:
                    A8L a8l = (A8L) anonymousClass398.A0x.getValue();
                    C206289Bl c206289Bl = (C206289Bl) c78983g4.A0Q.invoke();
                    Object tag20 = view.getTag();
                    if (tag20 != null) {
                        C81473kH c81473kH = (C81473kH) tag20;
                        C62862tP c62862tP = this.A08;
                        InterfaceC686036x interfaceC686036x2 = this.A00;
                        if (interfaceC686036x2 != null) {
                            InterfaceC904641g BzI = interfaceC686036x2.BzI();
                            C14360o3.A0B(c206289Bl, 0);
                            C14360o3.A0B(c81473kH, 1);
                            C14360o3.A0B(BzI, 3);
                            IgShowreelComposition igShowreelComposition = (IgShowreelComposition) c206289Bl.A05;
                            C6PT c6pt = (C6PT) c206289Bl.A06;
                            C26082BgB c26082BgB = (C26082BgB) c206289Bl.A01;
                            InterfaceC139376Ss interfaceC139376Ss = (InterfaceC139376Ss) ((InterfaceC16820sZ) c26082BgB.A02).invoke();
                            if (c6pt != null) {
                                c81473kH.A05.setVisibility(8);
                                ShowreelNativeMediaView showreelNativeMediaView = c81473kH.A06;
                                showreelNativeMediaView.setVisibility(0);
                                C37416Gdw c37416Gdw = (C37416Gdw) c6pt;
                                Float valueOf = c37416Gdw.A01 != null ? Float.valueOf(r5.intValue()) : null;
                                Float valueOf2 = c37416Gdw.A00 != null ? Float.valueOf(r5.intValue()) : null;
                                if (valueOf != null && valueOf2 != null) {
                                    float floatValue = valueOf.floatValue();
                                    if (floatValue > 0.0f) {
                                        float floatValue2 = valueOf2.floatValue();
                                        if (floatValue2 > 0.0f) {
                                            f = floatValue / floatValue2;
                                            MediaFrameLayout mediaFrameLayout = c81473kH.A09;
                                            mediaFrameLayout.A00 = f;
                                            showreelNativeMediaView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            showreelNativeMediaView.A06(interfaceC139376Ss, c6pt, a8l.A02, a8l.A01.getModuleName(), true);
                                            ((InterfaceC16660sJ) c26082BgB.A03).invoke(mediaFrameLayout);
                                        }
                                    }
                                }
                                f = 1.0f;
                                MediaFrameLayout mediaFrameLayout2 = c81473kH.A09;
                                mediaFrameLayout2.A00 = f;
                                showreelNativeMediaView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                showreelNativeMediaView.A06(interfaceC139376Ss, c6pt, a8l.A02, a8l.A01.getModuleName(), true);
                                ((InterfaceC16660sJ) c26082BgB.A03).invoke(mediaFrameLayout2);
                            } else if (igShowreelComposition != null) {
                                c81473kH.A06.setVisibility(8);
                                IgShowreelCompositionView igShowreelCompositionView = c81473kH.A05;
                                igShowreelCompositionView.setVisibility(0);
                                if (c62862tP != null) {
                                    igShowreelCompositionView.setShowreelAnimation(a8l.A02, igShowreelComposition, new C138956Rc(interfaceC139376Ss, 0, 0, 1, 0), c62862tP);
                                }
                            }
                            C75113Zb c75113Zb2 = (C75113Zb) c206289Bl.A04;
                            c81473kH.A00 = c75113Zb2;
                            LikeActionView likeActionView = c81473kH.A08;
                            likeActionView.A00();
                            c81473kH.A09.setOnTouchListener(new ViewOnTouchListenerC42054IkN(c206289Bl, BzI, c81473kH, a8l));
                            C3YH c3yh = c81473kH.A07.A04;
                            if (c3yh != null) {
                                AbstractC86443tH.A00(a8l.A02, BzI.BRk(), (C80243iD) ((InterfaceC16820sZ) c26082BgB.A01).invoke(), c3yh, false, false);
                            }
                            C86043sb c86043sb = c81473kH.A03;
                            C9C6 c9c6 = (C9C6) c206289Bl.A03;
                            Context context4 = a8l.A00;
                            UserSession userSession2 = a8l.A02;
                            String moduleName = a8l.A01.getModuleName();
                            C38321qM c38321qM2 = (C38321qM) c206289Bl.A02;
                            if (c9c6 != null) {
                                str = c9c6.A03;
                            } else {
                                str = null;
                            }
                            C86553tT.A00(c9c6, c86043sb, c75113Zb2, AbstractC86543tS.A00(context4, userSession2, c38321qM2, moduleName, str));
                            ((InterfaceC16660sJ) c26082BgB.A04).invoke(likeActionView);
                            ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                            return;
                        }
                        C14360o3.A0F("delegate");
                        throw C00O.createAndThrow();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.sponsoredrendering.SponsoredContentBinder.Holder");
                case 38:
                    C114665Fw c114665Fw2 = (C114665Fw) c78983g4.A03.invoke();
                    if (c114665Fw2 != null) {
                        Object tag21 = view.getTag();
                        if (tag21 != null) {
                            IGX igx = (IGX) tag21;
                            C62862tP c62862tP2 = this.A08;
                            C14360o3.A0B(igx, 0);
                            C14360o3.A0B(c62862tP2, 2);
                            C6T7 c6t7 = c114665Fw2.A00;
                            if (c6t7 == null) {
                                C6T7 A003 = C6T7.A00(igx.A01.getContext(), C1338462s.A02(null, c114665Fw2.A01.A01()), c62862tP2).A00();
                                c114665Fw2.A00 = c6t7;
                                c62862tP2.A05(new HH6(c62862tP2, A003, c114665Fw2));
                                c6t7 = A003;
                            }
                            C6T7 c6t72 = igx.A00;
                            if (c6t72 != c6t7) {
                                if (c6t72 != null) {
                                    c6t72.A04();
                                }
                                igx.A00 = c6t7;
                                c6t7.A07(igx.A02);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.instagram.mediadebug.BloksMediaDebugInfoViewBinder.Holder");
                        }
                    }
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 39:
                    C87023uI c87023uI = (C87023uI) anonymousClass398.A0d.getValue();
                    Context context5 = this.A06;
                    C87183ub c87183ub = (C87183ub) c78983g4.A0E.invoke();
                    Object tag22 = view.getTag();
                    if (tag22 != null) {
                        c87023uI.A06(context5, c87183ub, (C81323k2) tag22, c75113Zb);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.feedback.ui.MediaFeedbackViewBinder.Holder");
                case 40:
                    IQN.A01(this.A07, this.A08, (C41127IIs) c78983g4.A0F.invoke(), (JFT) c78983g4.A0G.invoke(), (C38496GwH) view.getTag());
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case Seq.NULL_REFNUM /* 41 */:
                    c92474Ce = (C92474Ce) anonymousClass398.A0X.getValue();
                    tag = view.getTag();
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                    }
                    c92474Ce.A02((C5LT) c78983g4.A0X.invoke(enumC65592xv), (C81373k7) tag, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case Seq.RefTracker.REF_OFFSET /* 42 */:
                    IJZ ijz = (IJZ) anonymousClass398.A0e.getValue();
                    Object tag23 = view.getTag();
                    if (tag23 != null) {
                        C41157IJw c41157IJw = (C41157IJw) tag23;
                        C38666Gz7 c38666Gz7 = (C38666Gz7) c78983g4.A0Y.invoke(this.A0X);
                        C14360o3.A0B(c41157IJw, 0);
                        C14360o3.A0B(c38666Gz7, 1);
                        MediaFrameLayout mediaFrameLayout3 = c41157IJw.A06;
                        mediaFrameLayout3.A00 = c38666Gz7.A00;
                        mediaFrameLayout3.setOnTouchListener(new ViewOnTouchListenerC42046IkF(c38666Gz7, c41157IJw, ijz));
                        C0fQ.A00(new ViewOnClickListenerC41900Iht(c38666Gz7, c41157IJw), mediaFrameLayout3);
                        IgProgressImageView igProgressImageView = c41157IJw.A03;
                        ColorDrawable colorDrawable = ijz.A00;
                        if (colorDrawable == null) {
                            Context context6 = ijz.A01;
                            colorDrawable = new ColorDrawable(context6.getColor(AbstractC53242c7.A0H(context6, R.attr.igds_color_primary_background)));
                            ijz.A00 = colorDrawable;
                        }
                        igProgressImageView.setPlaceHolderColor(colorDrawable);
                        igProgressImageView.setAlpha(255.0f);
                        igProgressImageView.getIgImageView().clearColorFilter();
                        C26082BgB c26082BgB2 = c38666Gz7.A02;
                        ((InterfaceC16660sJ) c26082BgB2.A03).invoke(igProgressImageView);
                        igProgressImageView.A0A(new C42670IuR(c38666Gz7), R.id.listener_id_for_media_view_binder);
                        igProgressImageView.setOnFallbackListener(new C42353IpF(c38666Gz7));
                        igProgressImageView.A0D.put(R.id.listener_id_for_media_view_binder, new C42674IuV(c38666Gz7));
                        igProgressImageView.setPostProcessor(c38666Gz7.A03);
                        igProgressImageView.setProgressiveImageConfig(new C80673iw());
                        C75113Zb c75113Zb3 = c38666Gz7.A06;
                        c75113Zb3.A0U = 0;
                        C80113i0 c80113i0 = (C80113i0) ijz.A04.getValue();
                        C38321qM c38321qM3 = c38666Gz7.A07.A00;
                        Context context7 = ijz.A01;
                        C80143i3 A004 = c80113i0.A00(context7, c38321qM3);
                        InterfaceC60442pS interfaceC60442pS3 = c38666Gz7.A05;
                        AbstractC80683ix.A00(interfaceC60442pS3, A004, igProgressImageView);
                        C75113Zb c75113Zb4 = c41157IJw.A00;
                        if (c75113Zb4 != null && c75113Zb4 != c75113Zb3) {
                            LikeActionView likeActionView2 = c41157IJw.A05;
                            c75113Zb4.A0V(likeActionView2);
                            C75113Zb c75113Zb5 = c41157IJw.A00;
                            if (c75113Zb5 != null) {
                                c75113Zb5.A0Y(likeActionView2);
                            }
                        }
                        c41157IJw.A00 = c75113Zb3;
                        Context context8 = igProgressImageView.getContext();
                        C14360o3.A07(context8);
                        UserSession userSession3 = ijz.A02;
                        Resources resources = igProgressImageView.getResources();
                        C14360o3.A07(resources);
                        boolean z = ijz.A05;
                        igProgressImageView.setContentDescription(AbstractC79753hQ.A01(context8, resources, interfaceC60442pS3, userSession3, c38321qM3, null, z));
                        C3YD c3yd = c41157IJw.A04;
                        c3yd.A0D = !z;
                        LikeActionView likeActionView3 = c41157IJw.A05;
                        likeActionView3.A00();
                        c75113Zb3.A0T(likeActionView3);
                        c75113Zb3.A0X(likeActionView3);
                        AbstractC86923u6.A00(context7, mediaFrameLayout3, userSession3, c38321qM3, interfaceC60442pS3, c75113Zb3);
                        JMX jmx = c38666Gz7.A04;
                        if (jmx != null) {
                            IgTextView igTextView = c41157IJw.A01;
                            igTextView.setVisibility(0);
                            igTextView.setText(I1G.A00(context7, I1B.A00(jmx.CBT().toString()), jmx.BXg()));
                            IgTextView igTextView2 = c41157IJw.A02;
                            igTextView2.setVisibility(0);
                            igTextView2.setText(jmx.getTitle());
                        } else {
                            c41157IJw.A01.setVisibility(8);
                            c41157IJw.A02.setVisibility(8);
                        }
                        igProgressImageView.A06(R.id.listener_id_for_media_tag_indicator);
                        AbstractC86373tA.A00((View.OnClickListener) ((InterfaceC16610sE) c26082BgB2.A00).invoke(c3yd, interfaceC60442pS3, userSession3), ijz.A03.BRj(), C79413go.A00.A00(context7, userSession3, c38321qM3, c38321qM3, interfaceC60442pS3, c75113Zb3, null), null, c3yd);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.ui.rows.mediaguide.MediaGuideViewBinder.Holder");
                case 43:
                    Object invoke = c78983g4.A0H.invoke();
                    C85793s8 c85793s8 = (C85793s8) anonymousClass398.A0g.getValue();
                    Object tag24 = view.getTag();
                    if (tag24 != null) {
                        c85793s8.A06(this.A0C, new C77043cq(((C691939f) ((C691539b) this.A0M.getValue()).A0K.getValue()).A01()), (C81283jy) tag24, (InterfaceC76863cY) c78983g4.A0Z.invoke(invoke), c75113Zb, c75113Zb.getPosition());
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.ui.rows.mediaheader.MediaHeaderViewHolder");
                case 44:
                    Context context9 = this.A06;
                    boolean z2 = this.A0Q;
                    Object tag25 = view.getTag();
                    if (tag25 != null) {
                        C132415yM.A01(context9, (C9BH) c78983g4.A0I.invoke(), this.A09, (C132425yN) tag25, this.A0C, c75113Zb, this.A0D, z2);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediaheadline.MediaHeadlineRowViewBinder.Holder");
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                    C39V c39v = (C39V) anonymousClass398.A0W.getValue();
                    Object tag26 = view.getTag();
                    if (tag26 != null) {
                        c39v.A01(((C77263dC) ((C691939f) ((C691539b) this.A0M.getValue()).A0K.getValue()).A0M.getValue()).A00(c38321qM, c75113Zb), (C3QT) tag26, c75113Zb);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException(AbstractC111324zv.A00(2782));
                case 47:
                    C41222IMn c41222IMn = (C41222IMn) c78983g4.A0R.invoke();
                    if (c41222IMn.A00() > 0) {
                        A00();
                        Context context10 = this.A06;
                        Object tag27 = view.getTag();
                        if (tag27 != null) {
                            C38497GwI c38497GwI = (C38497GwI) tag27;
                            C42666IuN c42666IuN = c75113Zb.A05().A00;
                            C77013cn c77013cn = this.A04;
                            if (c77013cn != null) {
                                AbstractC41752IeR.A02(context10, c77013cn, c38497GwI, c42666IuN, c41222IMn.A01(0), c41222IMn, true);
                                ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                                return;
                            }
                            C14360o3.A0F("inlineSurveyDelegate");
                            throw C00O.createAndThrow();
                        }
                        throw new NullPointerException(AbstractC111324zv.A00(2785));
                    }
                    throw new IllegalStateException("Check failed.");
                case 48:
                    C41222IMn c41222IMn2 = (C41222IMn) c78983g4.A0R.invoke();
                    Object tag28 = view.getTag();
                    if (tag28 != null) {
                        C38526Gwm c38526Gwm = (C38526Gwm) tag28;
                        C42666IuN c42666IuN2 = c75113Zb.A05().A00;
                        C77013cn c77013cn2 = this.A04;
                        if (c77013cn2 != null) {
                            AbstractC41686IdF.A01(c77013cn2, c38526Gwm, c42666IuN2, c41222IMn2);
                            ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                            return;
                        }
                        C14360o3.A0F("inlineSurveyDelegate");
                        throw C00O.createAndThrow();
                    }
                    throw new NullPointerException(AbstractC111324zv.A00(2784));
                case 49:
                    C41007IEc A052 = c75113Zb.A05();
                    int position2 = c75113Zb.getPosition();
                    A052.A01.A00(position2);
                    A052.A00.A00(position2);
                    C105854pw c105854pw = (C105854pw) c78983g4.A0S.invoke();
                    InterfaceC16620sF interfaceC16620sF2 = c78983g4.A0c;
                    InterfaceC686036x interfaceC686036x3 = this.A00;
                    if (interfaceC686036x3 != null) {
                        InterfaceC65282xQ B5p = interfaceC686036x3.B5p();
                        if (B5p != null) {
                            C77013cn c77013cn3 = (C77013cn) interfaceC16620sF2.invoke(B5p, c105854pw);
                            this.A04 = c77013cn3;
                            if (c77013cn3 != null) {
                                c77013cn3.A02(c38321qM);
                                A00();
                                Object tag29 = view.getTag();
                                if (tag29 != null) {
                                    C38492GwD c38492GwD = (C38492GwD) tag29;
                                    C42665IuM c42665IuM = c75113Zb.A05().A01;
                                    InterfaceC60442pS interfaceC60442pS4 = this.A0C;
                                    C77013cn c77013cn4 = this.A04;
                                    if (c77013cn4 != null) {
                                        IQW.A01(interfaceC60442pS4, c77013cn4, c38492GwD, c42665IuM, c105854pw);
                                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                                        return;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.simpleaction.SimpleActionViewBinder.Holder");
                                }
                            }
                            C14360o3.A0F("inlineSurveyDelegate");
                            throw C00O.createAndThrow();
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    C14360o3.A0F("delegate");
                    throw C00O.createAndThrow();
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    C105854pw c105854pw2 = (C105854pw) c78983g4.A0S.invoke();
                    ((C693439u) anonymousClass398.A10.getValue()).A00(view, (C51757Mtg) c78983g4.A0a.invoke(C3XH.A02(c105854pw2)), this.A09, c105854pw2, c75113Zb.A05());
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 51:
                    C65788Tu6 c65788Tu6 = C65788Tu6.A00;
                    Object tag30 = view.getTag();
                    if (tag30 != null) {
                        c65788Tu6.A01(this.A09, (C65789Tu7) c78983g4.A0J.invoke(), (C65790Tu8) tag30, c38321qM, this.A0C, c75113Zb);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediainsights.MediaInsightsViewBinder.Holder");
                case 53:
                    C48Z c48z = (C48Z) anonymousClass398.A0c.getValue();
                    Object tag31 = view.getTag();
                    if (tag31 != null) {
                        c48z.A01((C9BR) c78983g4.A0D.invoke(), (C81333k3) tag31);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.labelbelowcomments.LabelBelowCommentsViewBinder.Holder");
                case 55:
                    C25341BJk c25341BJk = (C25341BJk) anonymousClass398.A0i.getValue();
                    Object tag32 = view.getTag();
                    if (tag32 != null) {
                        CSW csw = (CSW) tag32;
                        C26070Bfy c26070Bfy = (C26070Bfy) c78983g4.A0L.invoke();
                        C27889CRa c27889CRa = (C27889CRa) c78983g4.A0K.invoke();
                        String A2u = c38321qM.A2u();
                        if (A2u != null) {
                            c25341BJk.A00(c26070Bfy, c27889CRa, csw, A2u);
                            ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.ui.rows.medianotice.ui.MediaNoticeViewBinder.Holder");
                case 56:
                    c92474Ce = (C92474Ce) anonymousClass398.A0o.getValue();
                    tag = view.getTag();
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                    }
                    c92474Ce.A02((C5LT) c78983g4.A0X.invoke(enumC65592xv), (C81373k7) tag, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 57:
                    c92474Ce = (C92474Ce) anonymousClass398.A0q.getValue();
                    tag = view.getTag();
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                    }
                    c92474Ce.A02((C5LT) c78983g4.A0X.invoke(enumC65592xv), (C81373k7) tag, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 58:
                    C9BR c9br = (C9BR) c78983g4.A0M.invoke();
                    Object tag33 = view.getTag();
                    if (tag33 != null) {
                        C25944Bdl c25944Bdl = (C25944Bdl) tag33;
                        InterfaceC686036x interfaceC686036x4 = this.A00;
                        if (interfaceC686036x4 != null) {
                            C28479ChX.A03(c9br, this.A0C, c25944Bdl, interfaceC686036x4.BRM());
                            ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                            return;
                        }
                        C14360o3.A0F("delegate");
                        throw C00O.createAndThrow();
                    }
                    throw new NullPointerException(AbstractC111324zv.A00(2780));
                case 59:
                    C27952CTo c27952CTo = (C27952CTo) anonymousClass398.A0j.getValue();
                    Object tag34 = view.getTag();
                    if (tag34 != null) {
                        c27952CTo.A00((C206189Bb) c78983g4.A0N.invoke(), (C27890CRb) tag34);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.ui.rows.topicheader.MediaTopicHeaderViewBinder.Holder");
                case 60:
                    C85833sC c85833sC = (C85833sC) anonymousClass398.A0m.getValue();
                    C85233rE c85233rE = (C85233rE) c78983g4.A0O.invoke();
                    Object tag35 = view.getTag();
                    if (tag35 != null) {
                        c85833sC.A06((C81313k1) tag35, c85233rE, c75113Zb);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.ufi.MediaUFIViewBinder.Holder");
                case 61:
                    anonymousClass398.A14.getValue();
                    Object tag36 = view.getTag();
                    if (tag36 != null) {
                        C85843sD.A00((C206249Bh) c78983g4.A0U.invoke(), (C4Cn) tag36);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.comments.row.ViewAllCommentsViewBinder.Holder");
                case 62:
                    C25342BJl c25342BJl = (C25342BJl) anonymousClass398.A0P.getValue();
                    Object tag37 = view.getTag();
                    if (tag37 != null) {
                        c25342BJl.A00((C51755Mte) c78983g4.A09.invoke(), (C25922BdP) tag37);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.comments.row.CommentsOffManageControlsViewBinder.Holder");
                case 64:
                    if (view.getTag() != null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.shopping.widget.chiclets.ChicletHscrollViewBinder.Holder");
                case 65:
                    Context context11 = this.A06;
                    UserSession userSession4 = this.A09;
                    InterfaceC60442pS interfaceC60442pS5 = this.A0C;
                    Object tag38 = view.getTag();
                    if (tag38 != null) {
                        C38486Gw7 c38486Gw7 = (C38486Gw7) tag38;
                        InterfaceC686036x interfaceC686036x5 = this.A00;
                        if (interfaceC686036x5 != null) {
                            InterfaceC64872wl Bh3 = interfaceC686036x5.Bh3();
                            String A2u2 = c38321qM.A2u();
                            if (A2u2 != null) {
                                AbstractC41667Ibz.A02(context11, interfaceC60442pS5, userSession4, Bh3, c38486Gw7, A2u2);
                                ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        C14360o3.A0F("delegate");
                        throw C00O.createAndThrow();
                    }
                    throw new NullPointerException(AbstractC111324zv.A00(1144));
                case 66:
                    c92474Ce = (C92474Ce) anonymousClass398.A0s.getValue();
                    tag = view.getTag();
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                    }
                    c92474Ce.A02((C5LT) c78983g4.A0X.invoke(enumC65592xv), (C81373k7) tag, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 67:
                    InterfaceC09390do interfaceC09390do2 = anonymousClass398.A0t;
                    C37512GfU c37512GfU = (C37512GfU) interfaceC09390do2.getValue();
                    Object tag39 = view.getTag();
                    if (tag39 != null) {
                        c37512GfU.A02((C38439GvM) tag39, c38321qM);
                        if (view.getTag() != null) {
                            interfaceC09390do2.getValue();
                            ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.scheduledcontent.ScheduledContentPublishTimeViewBinder.Holder");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.scheduledcontent.ScheduledContentPublishTimeViewBinder.Holder");
                case 69:
                    c92474Ce = (C92474Ce) anonymousClass398.A0v.getValue();
                    tag = view.getTag();
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                    }
                    c92474Ce.A02((C5LT) c78983g4.A0X.invoke(enumC65592xv), (C81373k7) tag, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 71:
                case 75:
                    ((C693439u) anonymousClass398.A10.getValue()).A00(view, (C51757Mtg) c78983g4.A0a.invoke(c38321qM), this.A09, c38321qM, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 72:
                case 73:
                case 74:
                    C70131W5v c70131W5v = (C70131W5v) anonymousClass398.A08.getValue();
                    Object tag40 = view.getTag();
                    if (tag40 != null) {
                        c70131W5v.A04((C51760Mtj) c78983g4.A01.invoke(), this.A0C, (C69433VnI) tag40);
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new NullPointerException(AbstractC111324zv.A00(2781));
                case 76:
                    ((C37516GfY) anonymousClass398.A11.getValue()).A00((C9BH) c78983g4.A0T.invoke(), (C38478Gvz) view.getTag());
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 77:
                    c92474Ce = (C92474Ce) anonymousClass398.A12.getValue();
                    tag = view.getTag();
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                    }
                    c92474Ce.A02((C5LT) c78983g4.A0X.invoke(enumC65592xv), (C81373k7) tag, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 78:
                    c92474Ce = (C92474Ce) anonymousClass398.A13.getValue();
                    tag = view.getTag();
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                    }
                    c92474Ce.A02((C5LT) c78983g4.A0X.invoke(enumC65592xv), (C81373k7) tag, c75113Zb);
                    ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                    return;
                case 94:
                    C3A1 c3a1 = (C3A1) anonymousClass398.A0k.getValue();
                    String id = c38321qM.getId();
                    if (id != null) {
                        c3a1.A02(view, id, new C206209Bd(((C691939f) ((C691539b) this.A0M.getValue()).A0K.getValue()).A00(), c38321qM, c75113Zb), new C9FY(16, c75113Zb, this, c38321qM, enumC65592xv));
                        ((C691539b) this.A0M.getValue()).A03(view, enumC65592xv, c38321qM, c75113Zb);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
            }
        }
        C14360o3.A0F("binders");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C65672y3(FragmentActivity fragmentActivity, C07X c07x, C2d4 c2d4, C62862tP c62862tP, C61142qc c61142qc, InterfaceC63362uJ interfaceC63362uJ, C60972qL c60972qL, C57332k8 c57332k8, C1M1 c1m1, String str) {
        this(fragmentActivity, c07x, c2d4, c62862tP, null, null, c61142qc, interfaceC63362uJ, c60972qL, c57332k8, null, c1m1, null, null, null, str, "explore_unconnected", null, null, false, true, false);
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(c60972qL, 2);
        C14360o3.A0B(c61142qc, 3);
        C14360o3.A0B(c07x, 5);
        C14360o3.A0B(c57332k8, 6);
        C14360o3.A0B(c62862tP, 8);
        C14360o3.A0B(c2d4, 10);
    }
}
