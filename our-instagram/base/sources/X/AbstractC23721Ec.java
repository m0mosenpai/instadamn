package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

/* renamed from: X.1Ec, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23721Ec implements InterfaceC23731Ed {
    public MUD A02;
    public C51743MtS A03;
    public InterfaceC216113n A04;
    public Integer A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public List A0H;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0V;
    public final AbstractC12990ll A0X;
    public final C1Ee A0W = new C1Ee();
    public Integer A07 = C05F.A00;
    public long A00 = -1;
    public long A01 = -1;
    public boolean A0U = true;
    public EnumC23341Bw A06 = EnumC23341Bw.API;
    public java.util.Set A0J = C16910sj.A00;
    public Map A0I = new LinkedHashMap();
    public C1Ef A05 = C1Ef.OnScreen;
    public String A0G = "undefined";

    public final void A03() {
        this.A0K = true;
    }

    public final void A07(File file, String str) {
        C14360o3.A0B(file, 1);
        this.A0W.A00.put(str, new TFC(file, "application/octet-stream"));
    }

    public final void A08(Integer num) {
        C14360o3.A0B(num, 0);
        this.A07 = num;
    }

    public final void A09(Integer num) {
        C14360o3.A0B(num, 0);
        this.A08 = num;
    }

    public final void A0B(String str) {
        C14360o3.A0B(str, 0);
        this.A0E = str;
    }

    public final void A0C(String str, float f) {
        this.A0W.A05(str, String.valueOf(f));
    }

    public final void A0H(String str, String str2) {
        C14360o3.A0B(str, 0);
        if (str2 != null) {
            A9s(str, str2);
        }
    }

    public final void A0K(String str, byte[] bArr) {
        C14360o3.A0B(str, 0);
        this.A0W.A00.put(str, new C58616Pyk(bArr));
    }

    public final void A0L(String str, Object... objArr) {
        C14360o3.A0B(str, 0);
        A0B(AbstractC13670mt.A06(str, Arrays.copyOf(objArr, objArr.length)));
    }

    public final void A0M(String... strArr) {
        this.A0R = true;
        this.A0J = AbstractC009903n.A0K(strArr);
    }

    @Override // X.InterfaceC23731Ed
    public final AbstractC23721Ec A9s(String str, String str2) {
        C14360o3.A0B(str, 0);
        this.A0W.A05(str, str2);
        return this;
    }

    @Override // X.InterfaceC23731Ed
    @Deprecated(message = "We shouldn't need this in most cases, in most places we just dump json into a\n          field as normal text.")
    public final AbstractC23721Ec AA6(String str, String str2) {
        C14360o3.A0B(str, 0);
        this.A0I.put(str, str2);
        return this;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:121|(1:123)|124|(1:447)(1:(2:128|(3:130|(1:132)|133))(2:445|446))|134|(3:136|(2:139|137)|140)|141|(1:143)|144|145|(1:147)(1:442)|148|(2:150|151)(1:440)|152|153|(1:155)(1:437)|156|(65:158|159|(1:161)|162|(1:164)(2:432|(1:434))|165|(1:167)|168|169|170|171|3a8|176|3c3|181|(3:183|(1:185)(1:187)|186)|188|(1:190)|191|(2:193|(1:195))|(2:197|(1:199))|200|(1:204)|205|(2:207|(4:209|(1:232)(1:213)|214|(3:216|(3:228|(1:230)|231)(3:223|(1:225)|226)|227))(1:233))|234|(2:236|(4:238|239|240|(1:242)))|(1:248)|249|(2:251|(2:253|254))|419|256|(6:258|(8:260|(1:262)|264|265|(4:267|(2:270|268)|271|272)|273|(1:275)|277)|279|(7:281|(1:283)|285|286|(4:288|(2:291|289)|292|293)|294|295)|298|(2:300|301))|304|(1:306)|(1:311)(1:414)|312|(1:314)|315|(1:321)|322|(1:324)|325|(1:327)|328|(1:330)|331|(1:333)|334|(1:336)|(4:338|(1:340)|341|(1:343))|344|(1:346)|(4:348|(4:350|(1:354)|355|(5:357|835|366|367|(1:371)))|377|(5:379|88b|388|389|(1:393)))|399|(1:401)|402|(1:404)|405|(1:407)|408|(1:410)|411|412|413)|435|159|(0)|162|(0)(0)|165|(0)|168|169|170|171|3a8) */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x059a, code lost:
    
        if (((java.lang.Boolean) r0).booleanValue() == true) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05c9, code lost:
    
        if (r13 != null) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x064c, code lost:
    
        if (r13 != null) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (X.AbstractC001900j.A0a(r4, "feed/user", false) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0399, code lost:
    
        X.C0w9.A03("StringFormatter", X.AnonymousClass001.A0N("Unable to add network bandwidth header for bandwidth ", r2));
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034a A[Catch: all -> 0x098e, TryCatch #3 {all -> 0x098e, blocks: (B:11:0x0020, B:13:0x0028, B:14:0x0030, B:16:0x0034, B:18:0x0038, B:20:0x0046, B:23:0x0052, B:25:0x0056, B:27:0x005a, B:29:0x0062, B:31:0x006f, B:32:0x007b, B:34:0x0088, B:36:0x0091, B:39:0x009d, B:41:0x00a3, B:43:0x00b8, B:45:0x00c1, B:48:0x00cd, B:50:0x00d5, B:52:0x00de, B:55:0x00ac, B:58:0x00fc, B:60:0x0102, B:62:0x010a, B:63:0x0967, B:108:0x098d, B:65:0x0110, B:67:0x0114, B:69:0x0126, B:71:0x012d, B:72:0x0134, B:74:0x0140, B:76:0x0146, B:77:0x014f, B:79:0x0162, B:80:0x0180, B:82:0x0186, B:85:0x0194, B:90:0x019a, B:91:0x01a2, B:93:0x01a8, B:96:0x01c0, B:101:0x01c7, B:103:0x01d4, B:104:0x01e9, B:107:0x0980, B:109:0x01f0, B:111:0x01f4, B:112:0x01fa, B:118:0x0216, B:119:0x021a, B:121:0x022f, B:123:0x0241, B:124:0x024c, B:128:0x0258, B:130:0x0260, B:132:0x0264, B:133:0x0275, B:134:0x0288, B:136:0x028c, B:137:0x0290, B:139:0x0296, B:141:0x02a5, B:143:0x02aa, B:144:0x02b5, B:147:0x02c7, B:148:0x02d3, B:151:0x02e7, B:152:0x02eb, B:155:0x02f9, B:156:0x0305, B:158:0x030b, B:159:0x0345, B:161:0x034a, B:162:0x0355, B:164:0x035b, B:165:0x035e, B:167:0x0368, B:168:0x036d, B:170:0x0385, B:171:0x03a4, B:172:0x03a8, B:175:0x03ab, B:176:0x03ac, B:177:0x03c3, B:180:0x03c6, B:181:0x03c7, B:183:0x03dc, B:186:0x03e6, B:188:0x03eb, B:190:0x03f2, B:191:0x03f9, B:193:0x0400, B:195:0x0410, B:197:0x041c, B:199:0x042c, B:200:0x0431, B:202:0x0446, B:204:0x044a, B:205:0x0457, B:209:0x0463, B:211:0x046e, B:213:0x0474, B:214:0x0477, B:219:0x0490, B:221:0x0496, B:223:0x049c, B:227:0x04a5, B:228:0x04e7, B:232:0x0485, B:233:0x048c, B:234:0x04a8, B:236:0x04be, B:238:0x04d6, B:240:0x04f1, B:242:0x053b, B:246:0x0542, B:248:0x054f, B:249:0x0554, B:251:0x0571, B:254:0x058b, B:256:0x059c, B:258:0x05b2, B:260:0x05bb, B:262:0x05bf, B:265:0x05cb, B:267:0x05e7, B:268:0x05fb, B:270:0x0601, B:272:0x0611, B:273:0x0617, B:275:0x0632, B:277:0x0637, B:279:0x063a, B:281:0x063e, B:283:0x0642, B:286:0x064e, B:288:0x066a, B:289:0x067e, B:291:0x0684, B:293:0x0694, B:294:0x069a, B:295:0x06a9, B:298:0x06ac, B:301:0x06b2, B:304:0x06c9, B:306:0x06cd, B:308:0x06d6, B:312:0x06e9, B:314:0x06f2, B:315:0x070b, B:317:0x071a, B:319:0x0720, B:321:0x0726, B:322:0x072b, B:324:0x0733, B:325:0x0735, B:327:0x075b, B:328:0x0760, B:330:0x077e, B:331:0x0789, B:333:0x0791, B:334:0x0796, B:336:0x079b, B:338:0x07a8, B:340:0x07b3, B:341:0x07c0, B:343:0x07cb, B:344:0x07dd, B:346:0x07ec, B:348:0x07f7, B:350:0x07fb, B:352:0x080f, B:354:0x0815, B:355:0x081a, B:357:0x0829, B:358:0x0835, B:367:0x0859, B:369:0x0865, B:371:0x086b, B:377:0x0870, B:379:0x087f, B:380:0x088b, B:389:0x08c5, B:391:0x08d1, B:393:0x08d7, B:399:0x08dc, B:402:0x08e3, B:404:0x08f4, B:405:0x08fa, B:407:0x0903, B:408:0x090a, B:410:0x0942, B:411:0x094d, B:416:0x06db, B:422:0x095a, B:427:0x095d, B:431:0x0399, B:432:0x0377, B:434:0x0381, B:435:0x0324, B:437:0x02fe, B:439:0x0312, B:440:0x02df, B:442:0x02cc, B:444:0x0337, B:445:0x0278, B:447:0x027f, B:448:0x095f, B:450:0x01ff, B:452:0x0203, B:453:0x020a, B:458:0x00ea, B:459:0x00f2, B:461:0x00f4, B:462:0x096d, B:464:0x0976, B:179:0x03c4, B:174:0x03a9), top: B:10:0x0020, inners: #2, #5, #6, #10, #11, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x035b A[Catch: all -> 0x098e, TryCatch #3 {all -> 0x098e, blocks: (B:11:0x0020, B:13:0x0028, B:14:0x0030, B:16:0x0034, B:18:0x0038, B:20:0x0046, B:23:0x0052, B:25:0x0056, B:27:0x005a, B:29:0x0062, B:31:0x006f, B:32:0x007b, B:34:0x0088, B:36:0x0091, B:39:0x009d, B:41:0x00a3, B:43:0x00b8, B:45:0x00c1, B:48:0x00cd, B:50:0x00d5, B:52:0x00de, B:55:0x00ac, B:58:0x00fc, B:60:0x0102, B:62:0x010a, B:63:0x0967, B:108:0x098d, B:65:0x0110, B:67:0x0114, B:69:0x0126, B:71:0x012d, B:72:0x0134, B:74:0x0140, B:76:0x0146, B:77:0x014f, B:79:0x0162, B:80:0x0180, B:82:0x0186, B:85:0x0194, B:90:0x019a, B:91:0x01a2, B:93:0x01a8, B:96:0x01c0, B:101:0x01c7, B:103:0x01d4, B:104:0x01e9, B:107:0x0980, B:109:0x01f0, B:111:0x01f4, B:112:0x01fa, B:118:0x0216, B:119:0x021a, B:121:0x022f, B:123:0x0241, B:124:0x024c, B:128:0x0258, B:130:0x0260, B:132:0x0264, B:133:0x0275, B:134:0x0288, B:136:0x028c, B:137:0x0290, B:139:0x0296, B:141:0x02a5, B:143:0x02aa, B:144:0x02b5, B:147:0x02c7, B:148:0x02d3, B:151:0x02e7, B:152:0x02eb, B:155:0x02f9, B:156:0x0305, B:158:0x030b, B:159:0x0345, B:161:0x034a, B:162:0x0355, B:164:0x035b, B:165:0x035e, B:167:0x0368, B:168:0x036d, B:170:0x0385, B:171:0x03a4, B:172:0x03a8, B:175:0x03ab, B:176:0x03ac, B:177:0x03c3, B:180:0x03c6, B:181:0x03c7, B:183:0x03dc, B:186:0x03e6, B:188:0x03eb, B:190:0x03f2, B:191:0x03f9, B:193:0x0400, B:195:0x0410, B:197:0x041c, B:199:0x042c, B:200:0x0431, B:202:0x0446, B:204:0x044a, B:205:0x0457, B:209:0x0463, B:211:0x046e, B:213:0x0474, B:214:0x0477, B:219:0x0490, B:221:0x0496, B:223:0x049c, B:227:0x04a5, B:228:0x04e7, B:232:0x0485, B:233:0x048c, B:234:0x04a8, B:236:0x04be, B:238:0x04d6, B:240:0x04f1, B:242:0x053b, B:246:0x0542, B:248:0x054f, B:249:0x0554, B:251:0x0571, B:254:0x058b, B:256:0x059c, B:258:0x05b2, B:260:0x05bb, B:262:0x05bf, B:265:0x05cb, B:267:0x05e7, B:268:0x05fb, B:270:0x0601, B:272:0x0611, B:273:0x0617, B:275:0x0632, B:277:0x0637, B:279:0x063a, B:281:0x063e, B:283:0x0642, B:286:0x064e, B:288:0x066a, B:289:0x067e, B:291:0x0684, B:293:0x0694, B:294:0x069a, B:295:0x06a9, B:298:0x06ac, B:301:0x06b2, B:304:0x06c9, B:306:0x06cd, B:308:0x06d6, B:312:0x06e9, B:314:0x06f2, B:315:0x070b, B:317:0x071a, B:319:0x0720, B:321:0x0726, B:322:0x072b, B:324:0x0733, B:325:0x0735, B:327:0x075b, B:328:0x0760, B:330:0x077e, B:331:0x0789, B:333:0x0791, B:334:0x0796, B:336:0x079b, B:338:0x07a8, B:340:0x07b3, B:341:0x07c0, B:343:0x07cb, B:344:0x07dd, B:346:0x07ec, B:348:0x07f7, B:350:0x07fb, B:352:0x080f, B:354:0x0815, B:355:0x081a, B:357:0x0829, B:358:0x0835, B:367:0x0859, B:369:0x0865, B:371:0x086b, B:377:0x0870, B:379:0x087f, B:380:0x088b, B:389:0x08c5, B:391:0x08d1, B:393:0x08d7, B:399:0x08dc, B:402:0x08e3, B:404:0x08f4, B:405:0x08fa, B:407:0x0903, B:408:0x090a, B:410:0x0942, B:411:0x094d, B:416:0x06db, B:422:0x095a, B:427:0x095d, B:431:0x0399, B:432:0x0377, B:434:0x0381, B:435:0x0324, B:437:0x02fe, B:439:0x0312, B:440:0x02df, B:442:0x02cc, B:444:0x0337, B:445:0x0278, B:447:0x027f, B:448:0x095f, B:450:0x01ff, B:452:0x0203, B:453:0x020a, B:458:0x00ea, B:459:0x00f2, B:461:0x00f4, B:462:0x096d, B:464:0x0976, B:179:0x03c4, B:174:0x03a9), top: B:10:0x0020, inners: #2, #5, #6, #10, #11, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0368 A[Catch: all -> 0x098e, TryCatch #3 {all -> 0x098e, blocks: (B:11:0x0020, B:13:0x0028, B:14:0x0030, B:16:0x0034, B:18:0x0038, B:20:0x0046, B:23:0x0052, B:25:0x0056, B:27:0x005a, B:29:0x0062, B:31:0x006f, B:32:0x007b, B:34:0x0088, B:36:0x0091, B:39:0x009d, B:41:0x00a3, B:43:0x00b8, B:45:0x00c1, B:48:0x00cd, B:50:0x00d5, B:52:0x00de, B:55:0x00ac, B:58:0x00fc, B:60:0x0102, B:62:0x010a, B:63:0x0967, B:108:0x098d, B:65:0x0110, B:67:0x0114, B:69:0x0126, B:71:0x012d, B:72:0x0134, B:74:0x0140, B:76:0x0146, B:77:0x014f, B:79:0x0162, B:80:0x0180, B:82:0x0186, B:85:0x0194, B:90:0x019a, B:91:0x01a2, B:93:0x01a8, B:96:0x01c0, B:101:0x01c7, B:103:0x01d4, B:104:0x01e9, B:107:0x0980, B:109:0x01f0, B:111:0x01f4, B:112:0x01fa, B:118:0x0216, B:119:0x021a, B:121:0x022f, B:123:0x0241, B:124:0x024c, B:128:0x0258, B:130:0x0260, B:132:0x0264, B:133:0x0275, B:134:0x0288, B:136:0x028c, B:137:0x0290, B:139:0x0296, B:141:0x02a5, B:143:0x02aa, B:144:0x02b5, B:147:0x02c7, B:148:0x02d3, B:151:0x02e7, B:152:0x02eb, B:155:0x02f9, B:156:0x0305, B:158:0x030b, B:159:0x0345, B:161:0x034a, B:162:0x0355, B:164:0x035b, B:165:0x035e, B:167:0x0368, B:168:0x036d, B:170:0x0385, B:171:0x03a4, B:172:0x03a8, B:175:0x03ab, B:176:0x03ac, B:177:0x03c3, B:180:0x03c6, B:181:0x03c7, B:183:0x03dc, B:186:0x03e6, B:188:0x03eb, B:190:0x03f2, B:191:0x03f9, B:193:0x0400, B:195:0x0410, B:197:0x041c, B:199:0x042c, B:200:0x0431, B:202:0x0446, B:204:0x044a, B:205:0x0457, B:209:0x0463, B:211:0x046e, B:213:0x0474, B:214:0x0477, B:219:0x0490, B:221:0x0496, B:223:0x049c, B:227:0x04a5, B:228:0x04e7, B:232:0x0485, B:233:0x048c, B:234:0x04a8, B:236:0x04be, B:238:0x04d6, B:240:0x04f1, B:242:0x053b, B:246:0x0542, B:248:0x054f, B:249:0x0554, B:251:0x0571, B:254:0x058b, B:256:0x059c, B:258:0x05b2, B:260:0x05bb, B:262:0x05bf, B:265:0x05cb, B:267:0x05e7, B:268:0x05fb, B:270:0x0601, B:272:0x0611, B:273:0x0617, B:275:0x0632, B:277:0x0637, B:279:0x063a, B:281:0x063e, B:283:0x0642, B:286:0x064e, B:288:0x066a, B:289:0x067e, B:291:0x0684, B:293:0x0694, B:294:0x069a, B:295:0x06a9, B:298:0x06ac, B:301:0x06b2, B:304:0x06c9, B:306:0x06cd, B:308:0x06d6, B:312:0x06e9, B:314:0x06f2, B:315:0x070b, B:317:0x071a, B:319:0x0720, B:321:0x0726, B:322:0x072b, B:324:0x0733, B:325:0x0735, B:327:0x075b, B:328:0x0760, B:330:0x077e, B:331:0x0789, B:333:0x0791, B:334:0x0796, B:336:0x079b, B:338:0x07a8, B:340:0x07b3, B:341:0x07c0, B:343:0x07cb, B:344:0x07dd, B:346:0x07ec, B:348:0x07f7, B:350:0x07fb, B:352:0x080f, B:354:0x0815, B:355:0x081a, B:357:0x0829, B:358:0x0835, B:367:0x0859, B:369:0x0865, B:371:0x086b, B:377:0x0870, B:379:0x087f, B:380:0x088b, B:389:0x08c5, B:391:0x08d1, B:393:0x08d7, B:399:0x08dc, B:402:0x08e3, B:404:0x08f4, B:405:0x08fa, B:407:0x0903, B:408:0x090a, B:410:0x0942, B:411:0x094d, B:416:0x06db, B:422:0x095a, B:427:0x095d, B:431:0x0399, B:432:0x0377, B:434:0x0381, B:435:0x0324, B:437:0x02fe, B:439:0x0312, B:440:0x02df, B:442:0x02cc, B:444:0x0337, B:445:0x0278, B:447:0x027f, B:448:0x095f, B:450:0x01ff, B:452:0x0203, B:453:0x020a, B:458:0x00ea, B:459:0x00f2, B:461:0x00f4, B:462:0x096d, B:464:0x0976, B:179:0x03c4, B:174:0x03a9), top: B:10:0x0020, inners: #2, #5, #6, #10, #11, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0377 A[Catch: all -> 0x098e, TryCatch #3 {all -> 0x098e, blocks: (B:11:0x0020, B:13:0x0028, B:14:0x0030, B:16:0x0034, B:18:0x0038, B:20:0x0046, B:23:0x0052, B:25:0x0056, B:27:0x005a, B:29:0x0062, B:31:0x006f, B:32:0x007b, B:34:0x0088, B:36:0x0091, B:39:0x009d, B:41:0x00a3, B:43:0x00b8, B:45:0x00c1, B:48:0x00cd, B:50:0x00d5, B:52:0x00de, B:55:0x00ac, B:58:0x00fc, B:60:0x0102, B:62:0x010a, B:63:0x0967, B:108:0x098d, B:65:0x0110, B:67:0x0114, B:69:0x0126, B:71:0x012d, B:72:0x0134, B:74:0x0140, B:76:0x0146, B:77:0x014f, B:79:0x0162, B:80:0x0180, B:82:0x0186, B:85:0x0194, B:90:0x019a, B:91:0x01a2, B:93:0x01a8, B:96:0x01c0, B:101:0x01c7, B:103:0x01d4, B:104:0x01e9, B:107:0x0980, B:109:0x01f0, B:111:0x01f4, B:112:0x01fa, B:118:0x0216, B:119:0x021a, B:121:0x022f, B:123:0x0241, B:124:0x024c, B:128:0x0258, B:130:0x0260, B:132:0x0264, B:133:0x0275, B:134:0x0288, B:136:0x028c, B:137:0x0290, B:139:0x0296, B:141:0x02a5, B:143:0x02aa, B:144:0x02b5, B:147:0x02c7, B:148:0x02d3, B:151:0x02e7, B:152:0x02eb, B:155:0x02f9, B:156:0x0305, B:158:0x030b, B:159:0x0345, B:161:0x034a, B:162:0x0355, B:164:0x035b, B:165:0x035e, B:167:0x0368, B:168:0x036d, B:170:0x0385, B:171:0x03a4, B:172:0x03a8, B:175:0x03ab, B:176:0x03ac, B:177:0x03c3, B:180:0x03c6, B:181:0x03c7, B:183:0x03dc, B:186:0x03e6, B:188:0x03eb, B:190:0x03f2, B:191:0x03f9, B:193:0x0400, B:195:0x0410, B:197:0x041c, B:199:0x042c, B:200:0x0431, B:202:0x0446, B:204:0x044a, B:205:0x0457, B:209:0x0463, B:211:0x046e, B:213:0x0474, B:214:0x0477, B:219:0x0490, B:221:0x0496, B:223:0x049c, B:227:0x04a5, B:228:0x04e7, B:232:0x0485, B:233:0x048c, B:234:0x04a8, B:236:0x04be, B:238:0x04d6, B:240:0x04f1, B:242:0x053b, B:246:0x0542, B:248:0x054f, B:249:0x0554, B:251:0x0571, B:254:0x058b, B:256:0x059c, B:258:0x05b2, B:260:0x05bb, B:262:0x05bf, B:265:0x05cb, B:267:0x05e7, B:268:0x05fb, B:270:0x0601, B:272:0x0611, B:273:0x0617, B:275:0x0632, B:277:0x0637, B:279:0x063a, B:281:0x063e, B:283:0x0642, B:286:0x064e, B:288:0x066a, B:289:0x067e, B:291:0x0684, B:293:0x0694, B:294:0x069a, B:295:0x06a9, B:298:0x06ac, B:301:0x06b2, B:304:0x06c9, B:306:0x06cd, B:308:0x06d6, B:312:0x06e9, B:314:0x06f2, B:315:0x070b, B:317:0x071a, B:319:0x0720, B:321:0x0726, B:322:0x072b, B:324:0x0733, B:325:0x0735, B:327:0x075b, B:328:0x0760, B:330:0x077e, B:331:0x0789, B:333:0x0791, B:334:0x0796, B:336:0x079b, B:338:0x07a8, B:340:0x07b3, B:341:0x07c0, B:343:0x07cb, B:344:0x07dd, B:346:0x07ec, B:348:0x07f7, B:350:0x07fb, B:352:0x080f, B:354:0x0815, B:355:0x081a, B:357:0x0829, B:358:0x0835, B:367:0x0859, B:369:0x0865, B:371:0x086b, B:377:0x0870, B:379:0x087f, B:380:0x088b, B:389:0x08c5, B:391:0x08d1, B:393:0x08d7, B:399:0x08dc, B:402:0x08e3, B:404:0x08f4, B:405:0x08fa, B:407:0x0903, B:408:0x090a, B:410:0x0942, B:411:0x094d, B:416:0x06db, B:422:0x095a, B:427:0x095d, B:431:0x0399, B:432:0x0377, B:434:0x0381, B:435:0x0324, B:437:0x02fe, B:439:0x0312, B:440:0x02df, B:442:0x02cc, B:444:0x0337, B:445:0x0278, B:447:0x027f, B:448:0x095f, B:450:0x01ff, B:452:0x0203, B:453:0x020a, B:458:0x00ea, B:459:0x00f2, B:461:0x00f4, B:462:0x096d, B:464:0x0976, B:179:0x03c4, B:174:0x03a9), top: B:10:0x0020, inners: #2, #5, #6, #10, #11, #13, #14 }] */
    /* JADX WARN: Type inference failed for: r1v95, types: [X.1Q1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1QZ A02() {
        /*
            Method dump skipped, instructions count: 2463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23721Ec.A02():X.1QZ");
    }

    public final void A04() {
        A08(C05F.A0Y);
    }

    public final void A05() {
        A09(C05F.A01);
    }

    public final void A06() {
        A09(C05F.A0N);
    }

    public final void A0A(Integer num, String str) {
        if (num != null) {
            A0D(str, num.intValue());
        }
    }

    public final void A0D(String str, int i) {
        this.A0W.A05(str, String.valueOf(i));
    }

    public final void A0E(String str, long j) {
        this.A0W.A05(str, String.valueOf(j));
    }

    public final void A0F(String str, Boolean bool) {
        if (bool != null) {
            A0I(str, bool.booleanValue());
        }
    }

    public final void A0G(String str, String str2) {
        List list = this.A0H;
        if (list == null) {
            list = new ArrayList();
            this.A0H = list;
        }
        list.add(new C23781El(str, str2));
    }

    public final void A0I(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        A9s(str, str2);
    }

    public final void A0J(String str, boolean z) {
        String str2;
        if (z) {
            str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str2 = "0";
        }
        A9s(str, str2);
    }

    public String toString() {
        String str = this.A0E;
        if (str == null) {
            return "IgApiRequest";
        }
        return str;
    }

    public AbstractC23721Ec(AbstractC12990ll abstractC12990ll) {
        this.A0X = abstractC12990ll;
    }
}
