package X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes11.dex */
public final class WSU implements InterfaceC71939XBo {
    public final XmlPullParserFactory A00;
    public static final Pattern A07 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern A08 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern A03 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern A06 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern A04 = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern A05 = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern A02 = Pattern.compile("^(\\d+) (\\d+)$");
    public static final C69039Vgg A01 = new C69039Vgg(1, 1, 30.0f);

    @Override // X.InterfaceC71939XBo
    public final /* synthetic */ void reset() {
    }

    public static long A00(C69039Vgg c69039Vgg, String str) {
        double parseDouble;
        double d;
        double d2;
        double d3;
        double d4;
        Matcher matcher = A07.matcher(str);
        if (matcher.matches()) {
            double A0E = (AbstractC58322PtE.A0E(matcher, 1) * 3600) + (AbstractC58322PtE.A0E(matcher, 2) * 60) + AbstractC58322PtE.A0E(matcher, 3);
            String group = matcher.group(4);
            double d5 = 0.0d;
            if (group != null) {
                d3 = Double.parseDouble(group);
            } else {
                d3 = 0.0d;
            }
            double d6 = A0E + d3;
            String group2 = matcher.group(5);
            if (group2 != null) {
                d4 = ((float) Long.parseLong(group2)) / c69039Vgg.A00;
            } else {
                d4 = 0.0d;
            }
            double d7 = d6 + d4;
            if (matcher.group(6) != null) {
                d5 = (Long.parseLong(r0) / c69039Vgg.A01) / c69039Vgg.A00;
            }
            parseDouble = d7 + d5;
        } else {
            Matcher matcher2 = A08.matcher(str);
            if (matcher2.matches()) {
                String group3 = matcher2.group(1);
                group3.getClass();
                parseDouble = Double.parseDouble(group3);
                String group4 = matcher2.group(2);
                group4.getClass();
                switch (group4.hashCode()) {
                    case 102:
                        if (group4.equals("f")) {
                            d = c69039Vgg.A00;
                            parseDouble /= d;
                            break;
                        }
                        break;
                    case 104:
                        if (group4.equals("h")) {
                            d2 = 3600.0d;
                            parseDouble *= d2;
                            break;
                        }
                        break;
                    case 109:
                        if (group4.equals("m")) {
                            d2 = 60.0d;
                            parseDouble *= d2;
                            break;
                        }
                        break;
                    case 116:
                        if (group4.equals("t")) {
                            d = c69039Vgg.A02;
                            parseDouble /= d;
                            break;
                        }
                        break;
                    case 3494:
                        if (group4.equals("ms")) {
                            d = 1000.0d;
                            parseDouble /= d;
                            break;
                        }
                        break;
                }
            } else {
                throw new Exception(AnonymousClass001.A0R("Malformed time expression: ", str));
            }
        }
        return (long) (parseDouble * 1000000.0d);
    }

    public WSU() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.A00 = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException(AbstractC111324zv.A00(1561), e);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Layout.Alignment A01(java.lang.String r1) {
        /*
            java.lang.String r1 = X.C4B2.A00(r1)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1364013995: goto L29;
                case 100571: goto L1e;
                case 3317767: goto L13;
                case 108511772: goto L10;
                case 109757538: goto Ld;
                default: goto Lb;
            }
        Lb:
            r0 = 0
            return r0
        Ld:
            java.lang.String r0 = "start"
            goto L15
        L10:
            java.lang.String r0 = "right"
            goto L20
        L13:
            java.lang.String r0 = "left"
        L15:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r0
        L1e:
            java.lang.String r0 = "end"
        L20:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r0
        L29:
            java.lang.String r0 = "center"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WSU.A01(java.lang.String):android.text.Layout$Alignment");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01dc, code lost:
    
        if (r2 != 3387192) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e4, code lost:
    
        if (r5.equals(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_NONE) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e6, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e7, code lost:
    
        r0 = new X.W2W(r7, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f0, code lost:
    
        r5 = X.AbstractC103614ld.A01(X.W2W.A03, r8);
        r8 = X.AbstractC103614ld.A01(X.W2W.A04, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0200, code lost:
    
        if (r5.isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0206, code lost:
    
        if (r8.isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r12 = r6;
        r0 = r2.split("\\s+", -1);
        r8 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0209, code lost:
    
        r5 = r5.iterator();
        r6 = "filled";
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0213, code lost:
    
        if (r5.hasNext() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0215, code lost:
    
        r6 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0219, code lost:
    
        r6 = (java.lang.String) r6;
        r5 = r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0222, code lost:
    
        if (r5 == (-1274499742)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0227, code lost:
    
        if (r5 != 3417674) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0229, code lost:
    
        r0 = r6.equals("open");
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0230, code lost:
    
        if (r0 != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0233, code lost:
    
        r5 = r8.iterator();
        r7 = "circle";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r8 != 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x023d, code lost:
    
        if (r5.hasNext() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x023f, code lost:
    
        r7 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0243, code lost:
    
        r7 = (java.lang.String) r7;
        r5 = r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x024c, code lost:
    
        if (r5 == (-1360216880)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0251, code lost:
    
        if (r5 == (-905816648)) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0256, code lost:
    
        if (r5 != 99657) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x025e, code lost:
    
        if (r7.equals("dot") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r8 = X.WSU.A03.matcher(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0260, code lost:
    
        r0 = new X.W2W(r2, r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0266, code lost:
    
        r2 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x026d, code lost:
    
        if (r7.equals("sesame") != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x026f, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0232, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0271, code lost:
    
        r0 = r5.equals("outside");
        r1 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b9, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01ec, code lost:
    
        r12.A0E = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0278, code lost:
    
        if (r12 != null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x027a, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027f, code lost:
    
        r12.A02 = X.W18.A00(r2, false);
        r12.A0H = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x028b, code lost:
    
        r1 = new java.lang.StringBuilder();
        r0 = "Failed parsing background value: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x029b, code lost:
    
        if (r12 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x029d, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02a2, code lost:
    
        r12.A0C = A01(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r8.matches() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02aa, code lost:
    
        r1 = X.C4B2.A00(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02b2, code lost:
    
        switch(r1.hashCode()) {
            case -1461280213: goto L134;
            case -1026963764: goto L139;
            case 913457136: goto L145;
            case 1679736913: goto L150;
            default: goto L268;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02bd, code lost:
    
        if (r1.equals("nounderline") == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02bf, code lost:
    
        if (r12 != null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02c1, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c6, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02d8, code lost:
    
        r12.A0B = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r10 = r8.group(3);
        r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ce, code lost:
    
        if (r1.equals("underline") == false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02d0, code lost:
    
        if (r12 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02d2, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02d7, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02e2, code lost:
    
        if (r1.equals("nolinethrough") == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e4, code lost:
    
        if (r12 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02e6, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        switch(r10.hashCode()) {
            case 37: goto L22;
            case 3240: goto L25;
            case 3592: goto L28;
            default: goto L20;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02eb, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02fd, code lost:
    
        r12.A07 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02f3, code lost:
    
        if (r1.equals("linethrough") == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02f5, code lost:
    
        if (r12 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02f7, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02fc, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r1 = new java.lang.Exception(X.AnonymousClass001.A0g("Invalid unit for fontSize: '", r10, "'."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x030b, code lost:
    
        if ("style".equals(r13.getName()) == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x030d, code lost:
    
        if (r12 != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x030f, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0314, code lost:
    
        r12.A0G = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0318, code lost:
    
        r1 = X.C4B2.A00(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0320, code lost:
    
        switch(r1.hashCode()) {
            case -618561360: goto L164;
            case -410956671: goto L165;
            case -250518009: goto L170;
            case -136074796: goto L175;
            case 3016401: goto L176;
            case 3556653: goto L182;
            default: goto L269;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0325, code lost:
    
        r0 = "baseContainer";
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0353, code lost:
    
        if (r1.equals(r0) == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0355, code lost:
    
        if (r12 != null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0357, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x035c, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x036e, code lost:
    
        r12.A09 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x032e, code lost:
    
        if (r1.equals("container") == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0330, code lost:
    
        if (r12 != null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0332, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0337, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x033f, code lost:
    
        if (r1.equals("delimiter") == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0341, code lost:
    
        if (r12 != null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0343, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0348, code lost:
    
        r0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        r1 = new java.lang.StringBuilder();
        r0 = "Failed parsing fontSize value: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x034a, code lost:
    
        r0 = "textContainer";
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0364, code lost:
    
        if (r1.equals(r0) == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0366, code lost:
    
        if (r12 != null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0368, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x036d, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x034d, code lost:
    
        r0 = "base";
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x035e, code lost:
    
        r0 = "text";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0292, code lost:
    
        X.AbstractC63374Sil.A04("TtmlParser", X.MSZ.A0u(r0, r2, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0372, code lost:
    
        r1 = X.C4B2.A00(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x037c, code lost:
    
        if (r1.equals("all") != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0384, code lost:
    
        if (r1.equals(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_NONE) == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0386, code lost:
    
        if (r12 != null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0388, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x038d, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x038e, code lost:
    
        r12.A0A = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0392, code lost:
    
        if (r12 != null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0394, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0399, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x039b, code lost:
    
        r1 = X.C4B2.A00(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03a5, code lost:
    
        if (r1.equals("before") != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03ad, code lost:
    
        if (r1.equals("after") == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03af, code lost:
    
        if (r12 != null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03b1, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x03b6, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03b7, code lost:
    
        r12.A08 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x03bb, code lost:
    
        if (r12 != null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x03bd, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x03c2, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0442, code lost:
    
        if (r0 == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r10.equals("%") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r6.A05 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        r0 = r8.group(1);
        r0.getClass();
        r6.A00 = java.lang.Float.parseFloat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r10.equals("em") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        r6.A05 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r10.equals("px") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        r6.A05 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        r1 = new java.lang.Exception(X.AnonymousClass001.A0g("Invalid expression for fontSize: '", r2, "'."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        if (r8 != 2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        r8 = X.WSU.A03.matcher(r0[1]);
        X.AbstractC63374Sil.A04("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        r1 = new java.lang.Exception(X.AnonymousClass001.A0c("Invalid number of entries for fontSize: ", ".", r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0022, code lost:
    
        r6 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
    
        if (r12 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        r12.A06 = "italic".equalsIgnoreCase(r2) ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
    
        if (r12 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        r12.A0F = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        if (r12 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
    
        r12.A0D = A01(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e9, code lost:
    
        if (r12 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00eb, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f0, code lost:
    
        r12.A03 = "bold".equalsIgnoreCase(r2) ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fa, code lost:
    
        if (r12 != null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
    
        r12.A04 = X.W18.A00(r2, false);
        r12.A0I = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010d, code lost:
    
        r1 = new java.lang.StringBuilder();
        r0 = "Failed parsing color value: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0116, code lost:
    
        if (r12 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0118, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011d, code lost:
    
        r1 = X.WSU.A06.matcher(r2);
        r6 = Float.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012a, code lost:
    
        if (r1.matches() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012c, code lost:
    
        X.AbstractC63374Sil.A04("TtmlParser", X.AnonymousClass001.A0R("Invalid value for shear: ", r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013a, code lost:
    
        r0 = r1.group(1);
        r0.getClass();
        r6 = java.lang.Math.min(100.0f, java.lang.Math.max(-100.0f, java.lang.Float.parseFloat(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0152, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0153, code lost:
    
        X.AbstractC63374Sil.A06("TtmlParser", X.AnonymousClass001.A0R("Failed to parse shear: ", r2), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015d, code lost:
    
        if (r12 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        switch(r1) {
            case 0: goto L37;
            case 1: goto L40;
            case 2: goto L43;
            case 3: goto L131;
            case 4: goto L46;
            case 5: goto L156;
            case 6: goto L161;
            case 7: goto L49;
            case 8: goto L53;
            case 9: goto L189;
            case 10: goto L10;
            case 11: goto L63;
            case 12: goto L200;
            case 13: goto L123;
            case 14: goto L128;
            default: goto L239;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x015f, code lost:
    
        r12 = new X.C69666Vt7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0164, code lost:
    
        r0 = X.W2W.A03;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0167, code lost:
    
        if (r2 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0169, code lost:
    
        r2 = X.C4B2.A00(r2.trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0175, code lost:
    
        if (r2.isEmpty() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0177, code lost:
    
        r8 = com.google.common.collect.ImmutableSet.A04(android.text.TextUtils.split(r2, X.W2W.A07));
        r1 = X.AbstractC103614ld.A01(X.W2W.A05, r8).iterator();
        r5 = "outside";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0192, code lost:
    
        if (r1.hasNext() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0194, code lost:
    
        r5 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0198, code lost:
    
        r5 = (java.lang.String) r5;
        r1 = r5.hashCode();
        r2 = 2;
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a4, code lost:
    
        if (r1 == (-1392885889)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a9, code lost:
    
        if (r1 == (-1106037339)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ae, code lost:
    
        if (r1 != 92734940) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b0, code lost:
    
        r0 = r5.equals("after");
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b7, code lost:
    
        if (r0 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ba, code lost:
    
        r5 = X.AbstractC103614ld.A01(X.W2W.A06, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c4, code lost:
    
        if (r5.isEmpty() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c6, code lost:
    
        r5 = (java.lang.String) r5.iterator().next();
        r2 = r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d7, code lost:
    
        if (r2 == 3005871) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r12 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C69666Vt7 A02(X.C69666Vt7 r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WSU.A02(X.Vt7, org.xmlpull.v1.XmlPullParser):X.Vt7");
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x050a, code lost:
    
        if (r1 == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0559, code lost:
    
        if (X.W6M.A02("metadata", r0) != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x055b, code lost:
    
        r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0564, code lost:
    
        if (X.W6M.A02("image", r0) == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0566, code lost:
    
        r4 = X.W6M.A00(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x056c, code lost:
    
        if (r4 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x056e, code lost:
    
        r20.put(r4, r0.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x057b, code lost:
    
        if (X.W6M.A01("metadata", r0) == false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02d1, code lost:
    
        if (r1 != r9) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01da, code lost:
    
        if (r13.equals("information") != false) goto L80;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:138:0x04ed. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04e5 A[Catch: IOException -> 0x0783, XmlPullParserException -> 0x078c, TryCatch #6 {IOException -> 0x0783, XmlPullParserException -> 0x078c, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0061, B:11:0x0069, B:13:0x006f, B:15:0x0079, B:16:0x007d, B:18:0x0087, B:20:0x0098, B:21:0x00ac, B:23:0x00b5, B:24:0x00b9, B:26:0x00c2, B:27:0x00c6, B:29:0x00d5, B:31:0x00e5, B:34:0x00ee, B:38:0x010a, B:39:0x011f, B:41:0x0127, B:43:0x0135, B:45:0x013f, B:47:0x015a, B:51:0x0116, B:54:0x0165, B:56:0x016b, B:58:0x0173, B:60:0x017b, B:62:0x0183, B:64:0x018b, B:66:0x0193, B:68:0x019b, B:70:0x01a3, B:72:0x01ab, B:74:0x01b3, B:76:0x01bb, B:78:0x01c3, B:80:0x01cb, B:82:0x01d3, B:86:0x01e1, B:89:0x0393, B:90:0x01f0, B:177:0x01f8, B:179:0x0217, B:180:0x0223, B:183:0x0299, B:184:0x0227, B:186:0x022f, B:188:0x0237, B:192:0x023c, B:194:0x0244, B:196:0x024e, B:197:0x0251, B:203:0x0255, B:205:0x0260, B:207:0x0268, B:210:0x026d, B:212:0x0275, B:215:0x027a, B:217:0x0282, B:220:0x0287, B:222:0x028f, B:230:0x029f, B:234:0x02ae, B:237:0x02b4, B:242:0x02c4, B:243:0x02d3, B:245:0x02ed, B:247:0x02f1, B:248:0x02f8, B:253:0x02cd, B:92:0x039c, B:94:0x03a7, B:96:0x0384, B:98:0x0388, B:99:0x038d, B:103:0x03b6, B:105:0x03c0, B:106:0x03c3, B:108:0x03d0, B:110:0x03c6, B:111:0x03e0, B:113:0x03e8, B:115:0x03f0, B:117:0x03f8, B:160:0x0410, B:123:0x0453, B:125:0x045b, B:127:0x046b, B:128:0x04ae, B:130:0x04b6, B:132:0x04c2, B:134:0x04ca, B:135:0x04d8, B:137:0x04e5, B:138:0x04ed, B:140:0x04f1, B:143:0x050e, B:144:0x04f8, B:145:0x04ff, B:147:0x04ce, B:149:0x0486, B:152:0x048e, B:157:0x0532, B:154:0x054a, B:155:0x054e, B:153:0x0543, B:119:0x042b, B:122:0x0433, B:158:0x0538, B:162:0x052d, B:164:0x0553, B:166:0x055b, B:168:0x0566, B:170:0x056e, B:171:0x0577, B:259:0x02fe, B:263:0x030a, B:265:0x0349, B:266:0x0350, B:270:0x0357, B:272:0x0361, B:273:0x0375, B:277:0x037b, B:281:0x0381, B:285:0x057f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02ed A[Catch: UFj -> 0x02fd, IOException -> 0x0783, XmlPullParserException -> 0x078c, TryCatch #2 {UFj -> 0x02fd, blocks: (B:177:0x01f8, B:179:0x0217, B:180:0x0223, B:183:0x0299, B:184:0x0227, B:186:0x022f, B:188:0x0237, B:192:0x023c, B:194:0x0244, B:196:0x024e, B:197:0x0251, B:203:0x0255, B:205:0x0260, B:207:0x0268, B:210:0x026d, B:212:0x0275, B:215:0x027a, B:217:0x0282, B:220:0x0287, B:222:0x028f, B:230:0x029f, B:234:0x02ae, B:237:0x02b4, B:242:0x02c4, B:243:0x02d3, B:245:0x02ed, B:247:0x02f1, B:248:0x02f8, B:253:0x02cd), top: B:176:0x01f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127 A[Catch: IOException -> 0x0783, XmlPullParserException -> 0x078c, TryCatch #6 {IOException -> 0x0783, XmlPullParserException -> 0x078c, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0061, B:11:0x0069, B:13:0x006f, B:15:0x0079, B:16:0x007d, B:18:0x0087, B:20:0x0098, B:21:0x00ac, B:23:0x00b5, B:24:0x00b9, B:26:0x00c2, B:27:0x00c6, B:29:0x00d5, B:31:0x00e5, B:34:0x00ee, B:38:0x010a, B:39:0x011f, B:41:0x0127, B:43:0x0135, B:45:0x013f, B:47:0x015a, B:51:0x0116, B:54:0x0165, B:56:0x016b, B:58:0x0173, B:60:0x017b, B:62:0x0183, B:64:0x018b, B:66:0x0193, B:68:0x019b, B:70:0x01a3, B:72:0x01ab, B:74:0x01b3, B:76:0x01bb, B:78:0x01c3, B:80:0x01cb, B:82:0x01d3, B:86:0x01e1, B:89:0x0393, B:90:0x01f0, B:177:0x01f8, B:179:0x0217, B:180:0x0223, B:183:0x0299, B:184:0x0227, B:186:0x022f, B:188:0x0237, B:192:0x023c, B:194:0x0244, B:196:0x024e, B:197:0x0251, B:203:0x0255, B:205:0x0260, B:207:0x0268, B:210:0x026d, B:212:0x0275, B:215:0x027a, B:217:0x0282, B:220:0x0287, B:222:0x028f, B:230:0x029f, B:234:0x02ae, B:237:0x02b4, B:242:0x02c4, B:243:0x02d3, B:245:0x02ed, B:247:0x02f1, B:248:0x02f8, B:253:0x02cd, B:92:0x039c, B:94:0x03a7, B:96:0x0384, B:98:0x0388, B:99:0x038d, B:103:0x03b6, B:105:0x03c0, B:106:0x03c3, B:108:0x03d0, B:110:0x03c6, B:111:0x03e0, B:113:0x03e8, B:115:0x03f0, B:117:0x03f8, B:160:0x0410, B:123:0x0453, B:125:0x045b, B:127:0x046b, B:128:0x04ae, B:130:0x04b6, B:132:0x04c2, B:134:0x04ca, B:135:0x04d8, B:137:0x04e5, B:138:0x04ed, B:140:0x04f1, B:143:0x050e, B:144:0x04f8, B:145:0x04ff, B:147:0x04ce, B:149:0x0486, B:152:0x048e, B:157:0x0532, B:154:0x054a, B:155:0x054e, B:153:0x0543, B:119:0x042b, B:122:0x0433, B:158:0x0538, B:162:0x052d, B:164:0x0553, B:166:0x055b, B:168:0x0566, B:170:0x056e, B:171:0x0577, B:259:0x02fe, B:263:0x030a, B:265:0x0349, B:266:0x0350, B:270:0x0357, B:272:0x0361, B:273:0x0375, B:277:0x037b, B:281:0x0381, B:285:0x057f), top: B:2:0x0006 }] */
    @Override // X.InterfaceC71939XBo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E3P(X.InterfaceC71874X8h r41, X.C70003VzN r42, byte[] r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 1982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WSU.E3P(X.X8h, X.VzN, byte[], int, int):void");
    }
}
