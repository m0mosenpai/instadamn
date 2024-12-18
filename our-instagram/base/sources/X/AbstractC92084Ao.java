package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.4Ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC92084Ao extends DefaultHandler implements InterfaceC92094Ap {
    public long A00 = 0;
    public C92104Aq A01;
    public String A02;
    public final String A03;
    public final XmlPullParserFactory A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public static final Pattern A0C = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern A08 = Pattern.compile("CC([1-4])=.*");
    public static final Pattern A09 = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final Pattern A0A = Pattern.compile("^https?:\\/\\/[^\\/]+(\\/.+)$");
    public static final int[] A0B = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public static float A00(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = A0C.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                float f2 = parseInt;
                if (!TextUtils.isEmpty(matcher.group(2))) {
                    return f2 / Integer.parseInt(r1);
                }
                return f2;
            }
            return f;
        }
        return f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A01(java.lang.String r6) {
        /*
            r5 = 0
            if (r6 == 0) goto Lf
            int r0 = r6.hashCode()
            r4 = 8
            r3 = 4
            r2 = 2
            r1 = 1
            switch(r0) {
                case -2060497896: goto L7c;
                case -1724546052: goto L71;
                case -1580883024: goto L66;
                case -1574842690: goto L63;
                case -1408024454: goto L5a;
                case -1396432756: goto L57;
                case 99825: goto L4c;
                case 3343801: goto L43;
                case 3530173: goto L38;
                case 552573414: goto L2d;
                case 899152809: goto L19;
                case 1629013393: goto L22;
                case 1855372047: goto L10;
                default: goto Lf;
            }
        Lf:
            return r5
        L10:
            java.lang.String r0 = "supplementary"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            return r3
        L19:
            java.lang.String r0 = "commentary"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L2c
            return r5
        L22:
            java.lang.String r0 = "emergency"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r4 = 32
        L2c:
            return r4
        L2d:
            java.lang.String r0 = "caption"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r4 = 64
            return r4
        L38:
            java.lang.String r0 = "sign"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r4 = 256(0x100, float:3.59E-43)
            return r4
        L43:
            java.lang.String r0 = "main"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            return r1
        L4c:
            java.lang.String r0 = "dub"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r4 = 16
            return r4
        L57:
            java.lang.String r0 = "forced-subtitle"
            goto L7e
        L5a:
            java.lang.String r0 = "alternate"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            return r2
        L63:
            java.lang.String r0 = "forced_subtitle"
            goto L7e
        L66:
            java.lang.String r0 = "enhanced-audio-intelligibility"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r4 = 2048(0x800, float:2.87E-42)
            return r4
        L71:
            java.lang.String r0 = "description"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r4 = 512(0x200, float:7.17E-43)
            return r4
        L7c:
            java.lang.String r0 = "subtitle"
        L7e:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r4 = 128(0x80, float:1.8E-43)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC92084Ao.A01(java.lang.String):int");
    }

    public static int A02(String str, XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Integer.parseInt(attributeValue);
        }
        return i;
    }

    public static final int A04(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        if (!"image".equals(attributeValue)) {
            return -1;
        }
        return 4;
    }

    public static long A05(String str, XmlPullParser xmlPullParser, long j) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            Matcher matcher = Util.A05.matcher(attributeValue);
            if (matcher.matches()) {
                boolean z = !TextUtils.isEmpty(matcher.group(1));
                String group = matcher.group(3);
                double d6 = 0.0d;
                if (group != null) {
                    d = Double.parseDouble(group) * 3.1556908E7d;
                } else {
                    d = 0.0d;
                }
                String group2 = matcher.group(5);
                if (group2 != null) {
                    d2 = Double.parseDouble(group2) * 2629739.0d;
                } else {
                    d2 = 0.0d;
                }
                double d7 = d + d2;
                String group3 = matcher.group(7);
                if (group3 != null) {
                    d3 = Double.parseDouble(group3) * 86400.0d;
                } else {
                    d3 = 0.0d;
                }
                double d8 = d7 + d3;
                String group4 = matcher.group(10);
                if (group4 != null) {
                    d4 = Double.parseDouble(group4) * 3600.0d;
                } else {
                    d4 = 0.0d;
                }
                double d9 = d8 + d4;
                String group5 = matcher.group(12);
                if (group5 != null) {
                    d5 = Double.parseDouble(group5) * 60.0d;
                } else {
                    d5 = 0.0d;
                }
                double d10 = d9 + d5;
                String group6 = matcher.group(14);
                if (group6 != null) {
                    d6 = Double.parseDouble(group6);
                }
                long j2 = (long) ((d10 + d6) * 1000.0d);
                if (z) {
                    return -j2;
                }
                return j2;
            }
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        return j;
    }

    public static long A06(String str, XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Long.parseLong(attributeValue);
        }
        return j;
    }

    public static final long A07(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue != null) {
            if ("INF".equals(attributeValue)) {
                return Long.MAX_VALUE;
            }
            return Float.parseFloat(attributeValue) * 1000000.0f;
        }
        return j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.util.Pair A08(org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC92084Ao.A08(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a3. Please report as an issue. */
    public static final CU5 A0A(CU5 cu5, String str, XmlPullParser xmlPullParser) {
        String str2;
        int i;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            String[] strArr = new String[5];
            int[] iArr = new int[4];
            String[] strArr2 = new String[4];
            strArr[0] = "";
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int length = attributeValue.length();
                if (i2 < length) {
                    int indexOf = attributeValue.indexOf("$", i2);
                    if (indexOf == -1) {
                        strArr[i3] = AnonymousClass001.A0R(strArr[i3], attributeValue.substring(i2));
                        i2 = length;
                    } else if (indexOf != i2) {
                        strArr[i3] = AnonymousClass001.A0R(strArr[i3], attributeValue.substring(i2, indexOf));
                        i2 = indexOf;
                    } else if (attributeValue.startsWith("$$", i2)) {
                        strArr[i3] = AnonymousClass001.A0R(strArr[i3], "$");
                        i2 += 2;
                    } else {
                        int i4 = i2 + 1;
                        int indexOf2 = attributeValue.indexOf("$", i4);
                        String substring = attributeValue.substring(i4, indexOf2);
                        if (substring.equals("RepresentationID")) {
                            iArr[i3] = 1;
                        } else {
                            int indexOf3 = substring.indexOf("%0");
                            if (indexOf3 != -1) {
                                str2 = substring.substring(indexOf3);
                                if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                                    str2 = AnonymousClass001.A0R(str2, "d");
                                }
                                substring = substring.substring(0, indexOf3);
                            } else {
                                str2 = "%01d";
                            }
                            switch (substring.hashCode()) {
                                case -1950496919:
                                    if (!substring.equals("Number")) {
                                        break;
                                    } else {
                                        iArr[i3] = 2;
                                        strArr2[i3] = str2;
                                        break;
                                    }
                                case 2606829:
                                    if (!substring.equals("Time")) {
                                        break;
                                    } else {
                                        i = 4;
                                        iArr[i3] = i;
                                        strArr2[i3] = str2;
                                        break;
                                    }
                                case 38199441:
                                    if (!substring.equals("Bandwidth")) {
                                        break;
                                    } else {
                                        i = 3;
                                        iArr[i3] = i;
                                        strArr2[i3] = str2;
                                        break;
                                    }
                            }
                        }
                        i3++;
                        strArr[i3] = "";
                        i2 = indexOf2 + 1;
                    }
                } else {
                    return new CU5(iArr, strArr, strArr2, i3);
                }
            }
            throw new IllegalArgumentException(AnonymousClass001.A0R("Invalid template: ", attributeValue));
        }
        return cu5;
    }

    public static final ArrayList A0C(List list, XmlPullParser xmlPullParser, boolean z) {
        int i;
        int i2;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = Integer.MIN_VALUE;
            if (z) {
                i = 1;
            }
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i2 = Integer.parseInt(attributeValue2);
        } else {
            i2 = 1;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                A0D(xmlPullParser);
            }
        } while (!AbstractC92154Av.A00("BaseURL", xmlPullParser));
        if (str != null && AbstractC92174Ax.A02(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return AbstractC92144Au.A01(new C92134At(str, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C92134At c92134At = (C92134At) list.get(i3);
            String A00 = AbstractC92174Ax.A00(c92134At.A03, str);
            String str2 = attributeValue3;
            if (attributeValue3 == null) {
                str2 = A00;
            }
            if (z) {
                i = c92134At.A00;
                i2 = c92134At.A01;
                str2 = c92134At.A02;
            }
            arrayList.add(new C92134At(A00, str2, i, i2));
        }
        return arrayList;
    }

    public static boolean A0E(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4BI c4bi = (C4BI) it.next();
            if (c4bi != null) {
                int i2 = 0;
                for (C4BF c4bf : c4bi.A03) {
                    if (c4bf != null && c4bf.A01 == i && (i2 = i2 + 1) > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean A0F(List list) {
        String str;
        if (!A0E(2, list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4BI c4bi = (C4BI) it.next();
                if (c4bi != null) {
                    for (C4BF c4bf : c4bi.A03) {
                        if (c4bf != null && c4bf.A01 == 2) {
                            String str2 = "";
                            for (C4BB c4bb : c4bf.A07) {
                                if (c4bb != null && (str = c4bb.A02.A0W) != null && !TextUtils.isEmpty(str)) {
                                    if (TextUtils.isEmpty(str2)) {
                                        str2 = str;
                                    } else if (!str2.equals(str)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C4B0 A0H(String str, String str2, XmlPullParser xmlPullParser) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return new C4B0(attributeValue, j, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return new C4B0(attributeValue, j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if (r3.equals("a000") == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A03(org.xmlpull.v1.XmlPullParser r4) {
        /*
            java.lang.String r0 = "schemeIdUri"
            r3 = 0
            r2 = r3
            java.lang.String r0 = r4.getAttributeValue(r3, r0)
            if (r0 == 0) goto Lb
            r2 = r0
        Lb:
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -2128649360: goto Lb4;
                case -1352850286: goto La4;
                case -1138141449: goto L5f;
                case -986633423: goto L44;
                case -79006963: goto L1f;
                case 312179081: goto L26;
                case 2036691300: goto L23;
                default: goto L13;
            }
        L13:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = X.AbstractC92154Av.A00(r0, r4)
            if (r0 == 0) goto L13
            return r1
        L1f:
            java.lang.String r0 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            goto Lb6
        L23:
            java.lang.String r0 = "urn:dolby:dash:audio_channel_configuration:2011"
            goto L61
        L26:
            java.lang.String r0 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = "value"
            java.lang.String r2 = r4.getAttributeValue(r3, r0)
            if (r2 == 0) goto L13
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r2, r0)
            int r0 = java.lang.Integer.bitCount(r0)
            if (r0 == 0) goto L13
            r1 = r0
            goto L13
        L44:
            java.lang.String r0 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = "value"
            r3 = -1
            int r2 = A02(r0, r4, r1)
            if (r2 < 0) goto L5d
            int[] r1 = X.AbstractC92084Ao.A0B
            r0 = 21
            if (r2 >= r0) goto L5d
            r3 = r1[r2]
        L5d:
            r1 = r3
            goto L13
        L5f:
            java.lang.String r0 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
        L61:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = "value"
            java.lang.String r0 = r4.getAttributeValue(r3, r0)
            if (r0 == 0) goto L13
            java.lang.String r3 = X.C4B2.A00(r0)
            int r0 = r3.hashCode()
            r2 = 2
            switch(r0) {
                case 1596796: goto L7c;
                case 2937391: goto L86;
                case 3094035: goto L8f;
                case 3133436: goto L99;
                default: goto L7b;
            }
        L7b:
            goto L13
        L7c:
            java.lang.String r0 = "4000"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L13
            r1 = 1
            goto L13
        L86:
            java.lang.String r0 = "a000"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lca
            goto L13
        L8f:
            java.lang.String r0 = "f801"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L13
            r2 = 6
            goto Lca
        L99:
            java.lang.String r0 = "fa01"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L13
            r2 = 8
            goto Lca
        La4:
            java.lang.String r0 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = "value"
            int r1 = A02(r0, r4, r1)
            goto L13
        Lb4:
            java.lang.String r0 = "urn:dts:dash:audio_channel_configuration:2012"
        Lb6:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = "value"
            r2 = -1
            int r1 = A02(r0, r4, r1)
            if (r1 <= 0) goto Lca
            r0 = 33
            if (r1 >= r0) goto Lca
            r2 = r1
        Lca:
            r1 = r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC92084Ao.A03(org.xmlpull.v1.XmlPullParser):int");
    }

    public static C92164Aw A09(String str, XmlPullParser xmlPullParser) {
        String str2 = "";
        String str3 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            str2 = attributeValue;
        }
        String str4 = null;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        if (attributeValue2 != null) {
            str4 = attributeValue2;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (attributeValue3 != null) {
            str3 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!AbstractC92154Av.A00(str, xmlPullParser));
        return new C92164Aw(str2, str4, str3);
    }

    private String A0B(StringBuilder sb, List list) {
        String str = "";
        sb.append(AnonymousClass001.A0g("VideoId: ", this.A03, "\n"));
        sb.append("++++++++++++++++++++++++++++++++++++++++\n");
        sb.append("Is MCM: ");
        sb.append(A0F(list));
        sb.append("\n");
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            int i = 0;
            for (C4BF c4bf : ((C4BI) it.next()).A03) {
                if (c4bf != null && c4bf.A01 == 2) {
                    sb.append("Adaptation set ");
                    sb.append(i);
                    sb.append("\n");
                    i++;
                    int i2 = 0;
                    for (C4BB c4bb : c4bf.A07) {
                        sb.append("  [");
                        sb.append(i2);
                        sb.append("]");
                        C4B6 c4b6 = c4bb.A02;
                        String str2 = c4b6.A0W;
                        sb.append(str2);
                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        sb.append(c4b6.A0L);
                        sb.append("x");
                        sb.append(c4b6.A0A);
                        sb.append(",aoai: ");
                        C4B5 c4b5 = c4b6.A0N;
                        sb.append(c4b5.A09);
                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        sb.append(c4b5.A07);
                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        sb.append(c4b6.A05);
                        sb.append("bps\n");
                        i2++;
                        Number num = new Integer(0);
                        if (hashMap.containsKey(str2) && (num = (Number) hashMap.get(str2)) == null) {
                            num = new Integer(0);
                        }
                        hashMap.put(str2, Integer.valueOf(num.intValue() + 1));
                    }
                }
            }
        }
        sb.append("----------------------------------------\n");
        if (hashMap.isEmpty()) {
            return "";
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            str = AnonymousClass001.A0R(AnonymousClass001.A0R(str, String.format(Locale.US, "%d%s", entry.getValue(), entry.getKey())), "+");
        }
        int length = str.length();
        if (length > 1) {
            return str.substring(0, length - 1);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r2 == null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, X.XfD] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C67737Ux5 A0I(X.C67737Ux5 r28, org.xmlpull.v1.XmlPullParser r29, long r30, long r32, long r34, long r36) {
        /*
            r27 = this;
            r4 = 1
            r0 = r28
            if (r28 == 0) goto Ld3
            long r1 = r0.A01
        L8:
            java.lang.String r6 = "timescale"
            r3 = r29
            long r11 = A06(r6, r3, r1)
            if (r28 == 0) goto Lcf
            long r1 = r0.A00
        L14:
            java.lang.String r6 = "presentationTimeOffset"
            long r13 = A06(r6, r3, r1)
            if (r28 == 0) goto Lc8
            long r1 = r0.A02
        L1e:
            java.lang.String r6 = "duration"
            long r17 = A06(r6, r3, r1)
            if (r28 == 0) goto L28
            long r4 = r0.A05
        L28:
            java.lang.String r1 = "startNumber"
            long r15 = A06(r1, r3, r4)
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r34 > r19 ? 1 : (r34 == r19 ? 0 : -1))
            if (r1 == 0) goto L39
            r32 = r34
        L39:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r1 == 0) goto L44
            r19 = r32
        L44:
            r6 = 0
            r9 = r6
            r7 = r6
            r1 = r6
        L48:
            r3.next()
            java.lang.String r2 = "Initialization"
            boolean r4 = X.AbstractC92154Av.A01(r2, r3)
            r2 = r27
            if (r4 == 0) goto L9c
            java.lang.String r5 = "sourceURL"
            java.lang.String r4 = "range"
            X.4B0 r7 = r2.A0H(r5, r4, r3)
        L5d:
            java.lang.String r2 = "SegmentList"
            boolean r2 = X.AbstractC92154Av.A00(r2, r3)
            if (r2 == 0) goto L48
            if (r28 == 0) goto L86
            if (r7 != 0) goto L6b
            X.4B0 r7 = r0.A02
        L6b:
            if (r1 == 0) goto L71
            java.util.List r2 = r1.A02
            if (r2 != 0) goto L82
        L71:
            java.util.List r5 = r0.A06
            int r4 = r0.A00
            long r2 = r0.A03
            X.XfD r1 = new X.XfD
            r1.<init>()
            r1.A02 = r5
            r1.A00 = r4
            r1.A01 = r2
        L82:
            if (r9 != 0) goto L86
            java.util.List r9 = r0.A00
        L86:
            java.util.List r8 = r1.A02
            int r10 = r1.A00
            long r0 = r1.A01
            long r21 = com.google.android.exoplayer2.util.Util.A07(r36)
            long r23 = com.google.android.exoplayer2.util.Util.A07(r30)
            X.Ux5 r6 = new X.Ux5
            r25 = r0
            r6.<init>(r7, r8, r9, r10, r11, r13, r15, r17, r19, r21, r23, r25)
            return r6
        L9c:
            java.lang.String r4 = "SegmentTimeline"
            boolean r4 = X.AbstractC92154Av.A01(r4, r3)
            if (r4 == 0) goto La9
            X.XfD r1 = r2.A0K(r6, r3)
            goto L5d
        La9:
            java.lang.String r4 = "SegmentURL"
            boolean r4 = X.AbstractC92154Av.A01(r4, r3)
            if (r4 == 0) goto Lc4
            if (r9 != 0) goto Lb8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        Lb8:
            java.lang.String r5 = "media"
            java.lang.String r4 = "mediaRange"
            X.4B0 r2 = r2.A0H(r5, r4, r3)
            r9.add(r2)
            goto L5d
        Lc4:
            A0D(r3)
            goto L5d
        Lc8:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L1e
        Lcf:
            r1 = 0
            goto L14
        Ld3:
            r1 = 1
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC92084Ao.A0I(X.Ux5, org.xmlpull.v1.XmlPullParser, long, long, long, long):X.Ux5");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        if (r30.A05 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f4, code lost:
    
        if (r4 != (-1)) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.XfD] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, X.XfD] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4BD A0J(X.C4BD r31, java.util.List r32, org.xmlpull.v1.XmlPullParser r33, long r34, long r36, long r38, long r40, boolean r42) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC92084Ao.A0J(X.4BD, java.util.List, org.xmlpull.v1.XmlPullParser, long, long, long, long, boolean):X.4BD");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r34 == null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.XfD] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C72499XfD A0K(X.CS4 r34, org.xmlpull.v1.XmlPullParser r35) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC92084Ao.A0K(X.CS4, org.xmlpull.v1.XmlPullParser):X.XfD");
    }

    public C92184Ay A0L(C92184Ay c92184Ay, XmlPullParser xmlPullParser) {
        long j;
        long j2;
        long j3;
        if (c92184Ay != null) {
            j = ((AbstractC92194Az) c92184Ay).A01;
        } else {
            j = 1;
        }
        long A06 = A06("timescale", xmlPullParser, j);
        long j4 = 0;
        if (c92184Ay != null) {
            j2 = ((AbstractC92194Az) c92184Ay).A00;
        } else {
            j2 = 0;
        }
        long A062 = A06("presentationTimeOffset", xmlPullParser, j2);
        if (c92184Ay != null) {
            j3 = c92184Ay.A01;
            j4 = c92184Ay.A00;
        } else {
            j3 = 0;
        }
        C4B0 c4b0 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j3 = Long.parseLong(split[0]);
            j4 = (Long.parseLong(split[1]) - j3) + 1;
        }
        if (c92184Ay != null) {
            c4b0 = c92184Ay.A02;
        }
        do {
            xmlPullParser.next();
            if (AbstractC92154Av.A01("Initialization", xmlPullParser)) {
                c4b0 = A0H("sourceURL", "range", xmlPullParser);
            } else {
                A0D(xmlPullParser);
            }
        } while (!AbstractC92154Av.A00("SegmentBase", xmlPullParser));
        return new C92184Ay(c4b0, A06, A062, j3, j4);
    }

    public AbstractC92084Ao(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = null;
        this.A07 = z;
        this.A05 = z2;
        this.A03 = str == null ? "null" : str;
        this.A06 = z3;
        if (z4 && !z5) {
            C92104Aq c92104Aq = C92104Aq.A01;
            if (c92104Aq == null) {
                synchronized (C92104Aq.class) {
                    c92104Aq = C92104Aq.A01;
                    if (c92104Aq == null) {
                        c92104Aq = new C92104Aq(i);
                        C92104Aq.A01 = c92104Aq;
                    }
                }
            }
            this.A01 = c92104Aq;
        }
        try {
            this.A04 = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException(AbstractC111324zv.A00(1561), e);
        }
    }

    public static void A0D(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (true) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                } else {
                    continue;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x13de, code lost:
    
        if (r0 != null) goto L920;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x13af, code lost:
    
        if (r158 != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x12a1, code lost:
    
        if (r2 == null) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x05c7, code lost:
    
        if (r1.contains("hvq_mobile_landscape") == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x05cd, code lost:
    
        r51 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x05d5, code lost:
    
        if (r1.contains("hvq_mobile_portrait") != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x05d7, code lost:
    
        r51 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x05d9, code lost:
    
        if (r1 == null) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x05e5, code lost:
    
        r45 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x05e7, code lost:
    
        if (r1 == null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x05e9, code lost:
    
        r44 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x05f1, code lost:
    
        if (r1.contains("avoid_on_cellular_intentional") != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x05f7, code lost:
    
        r41 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x05ff, code lost:
    
        if (r1.contains("avoid_on_cell_datasaver") != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x0601, code lost:
    
        r41 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0603, code lost:
    
        if (r1 == null) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x060f, code lost:
    
        r40 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0611, code lost:
    
        if (r1 == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x0613, code lost:
    
        r38 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x061b, code lost:
    
        if (r1.contains("avoid_on_abr") != false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0621, code lost:
    
        r53 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0629, code lost:
    
        if (r1.contains("avoid_on_abr_intentional") != false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x062b, code lost:
    
        r53 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x062d, code lost:
    
        r157 = null;
        r0 = r3.getAttributeValue(null, "FBPlaybackResolutionMos");
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x0635, code lost:
    
        if (r0 == null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0637, code lost:
    
        r157 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0639, code lost:
    
        r133 = null;
        r0 = r3.getAttributeValue(null, "FBPlaybackResolutionMosConfidenceLevel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0641, code lost:
    
        if (r0 == null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0643, code lost:
    
        r133 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x0645, code lost:
    
        r132 = null;
        r0 = r3.getAttributeValue(null, "FBPlaybackResolutionCsvqm");
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x064d, code lost:
    
        if (r0 == null) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x064f, code lost:
    
        r132 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0651, code lost:
    
        r128 = null;
        r0 = r3.getAttributeValue(null, "FBEncodingTag");
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0659, code lost:
    
        if (r0 == null) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x065b, code lost:
    
        r128 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x065d, code lost:
    
        r37 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0669, code lost:
    
        if (A02("FBUltraLowLatencyEncoding", r3, 0) != 1) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x066b, code lost:
    
        r37 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x066d, code lost:
    
        r126 = null;
        r0 = r3.getAttributeValue(null, "FBPaqMos");
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x0675, code lost:
    
        if (r0 == null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0677, code lost:
    
        r126 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x0679, code lost:
    
        if (r10 != false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x067b, code lost:
    
        r36 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x0685, code lost:
    
        if (A02("FBDefaultQuality", r3, 0) == 0) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x0689, code lost:
    
        r10 = r64;
        r120 = null;
        r177 = null;
        r178 = null;
        r112 = false;
        r8 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0694, code lost:
    
        r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x069d, code lost:
    
        if (X.AbstractC92154Av.A01("BaseURL", r3) == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x069f, code lost:
    
        if (r112 != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x06a1, code lost:
    
        r10 = A07(r3, r10);
        r112 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x06a7, code lost:
    
        r58.addAll(A0C(r165, r3, r30));
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x06e2, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x06c8, code lost:
    
        if (X.AbstractC92154Av.A00("Representation", r3) == false) goto L1054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x06ce, code lost:
    
        if (r61.size() > 0) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x079f, code lost:
    
        if (r114 == false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x07a2, code lost:
    
        r1 = r164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x07a8, code lost:
    
        if (X.C2IH.A04(r164) == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x07aa, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x07ab, code lost:
    
        if (r47 == null) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x07b1, code lost:
    
        if (android.text.TextUtils.isEmpty(r47) == false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x07b3, code lost:
    
        r2 = new java.lang.String[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x07b7, code lost:
    
        r5 = r2.length;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x07c7, code lost:
    
        if (r0 >= r5) goto L1056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x07c9, code lost:
    
        r1 = X.C2IH.A02(r2[r0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x07cf, code lost:
    
        if (r1 == null) goto L1057;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x07d5, code lost:
    
        if (X.C2IH.A04(r1) == false) goto L1058;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x0843, code lost:
    
        if ("audio/eac3".equals(r1) == false) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x0848, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x084d, code lost:
    
        if (r1 >= r55.size()) goto L1060;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x084f, code lost:
    
        r0 = (X.C92164Aw) r55.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x085f, code lost:
    
        if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(r0.A01) == false) goto L1061;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x0869, code lost:
    
        if ("ec+3".equals(r0.A02) == false) goto L1062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x086b, code lost:
    
        r1 = "audio/eac3-joc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0873, code lost:
    
        if ("audio/eac3-joc".equals(r1) == false) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x0875, code lost:
    
        r47 = "ec+3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x0878, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x087b, code lost:
    
        r1 = "audio/eac3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x087d, code lost:
    
        r2 = 0;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x0883, code lost:
    
        if (r2 >= r82.size()) goto L1063;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x0885, code lost:
    
        r0 = (X.C92164Aw) r82.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x0895, code lost:
    
        if (X.C4B2.A02("urn:mpeg:dash:role:2011", r0.A01) == false) goto L1065;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0897, code lost:
    
        r0 = r0.A02;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x089a, code lost:
    
        if (r0 == null) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x08a2, code lost:
    
        if (r0.equals("forced_subtitle") != false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x08aa, code lost:
    
        if (r0.equals("forced-subtitle") != false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x08ad, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x08ae, code lost:
    
        r11 = r11 | r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x08af, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x08b2, code lost:
    
        r2 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x08b8, code lost:
    
        if (r2 >= r82.size()) goto L1066;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x08ba, code lost:
    
        r0 = (X.C92164Aw) r82.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x08ca, code lost:
    
        if (X.C4B2.A02("urn:mpeg:dash:role:2011", r0.A01) == false) goto L1068;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x08cc, code lost:
    
        r5 = r5 | A01(r0.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x08d3, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x08d6, code lost:
    
        r6 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x08dc, code lost:
    
        if (r6 >= r83.size()) goto L1069;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x08de, code lost:
    
        r0 = (X.C92164Aw) r83.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x08ee, code lost:
    
        if (X.C4B2.A02("urn:mpeg:dash:role:2011", r0.A01) == false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x08f0, code lost:
    
        r7 = A01(r0.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x0943, code lost:
    
        r10 = r10 | r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x0944, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x08ff, code lost:
    
        if (X.C4B2.A02("urn:tva:metadata:cs:AudioPurposeCS:2007", r0.A01) == false) goto L1071;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x0901, code lost:
    
        r2 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x0903, code lost:
    
        if (r2 == null) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0905, code lost:
    
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x090a, code lost:
    
        switch(r2.hashCode()) {
            case 49: goto L436;
            case 50: goto L439;
            case 51: goto L442;
            case 52: goto L445;
            case 53: goto L435;
            case 54: goto L448;
            default: goto L435;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0914, code lost:
    
        if (r2.equals(com.instagram.realtimeclient.RealtimeSubscription.GRAPHQL_MQTT_VERSION) == false) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x0916, code lost:
    
        r7 = 512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x091f, code lost:
    
        if (r2.equals("2") == false) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x0921, code lost:
    
        r7 = X.C3OO.FLAG_MOVED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x092a, code lost:
    
        if (r2.equals("3") != false) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x0933, code lost:
    
        if (r2.equals("4") == false) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x0941, code lost:
    
        r7 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0936, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x093d, code lost:
    
        if (r2.equals("6") != false) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x093f, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x0947, code lost:
    
        r5 = r5 | r10;
        r2 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x094e, code lost:
    
        if (r2 >= r59.size()) goto L1072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x0960, code lost:
    
        if (X.C4B2.A02("http://dashif.org/guidelines/trickmode", ((X.C92164Aw) r59.get(r2)).A01) == false) goto L1074;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0962, code lost:
    
        r6 = r6 | com.facebook.common.dextricks.Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0964, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x0967, code lost:
    
        r5 = r5 | r6;
        r2 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x096e, code lost:
    
        if (r2 >= r55.size()) goto L1075;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x0980, code lost:
    
        if (X.C4B2.A02("http://dashif.org/guidelines/trickmode", ((X.C92164Aw) r55.get(r2)).A01) == false) goto L1077;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x0982, code lost:
    
        r6 = r6 | com.facebook.common.dextricks.Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x0984, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0987, code lost:
    
        r5 = r5 | r6;
        r6 = 0;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:913:0x07c5, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:916:0x07ba, code lost:
    
        r2 = r47.trim().split("(\\s*,\\s*)", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:917:0x080d, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:919:0x07dc, code lost:
    
        if (X.C2IH.A06(r164) == false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:920:0x07de, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:921:0x07df, code lost:
    
        if (r47 == null) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:923:0x07e5, code lost:
    
        if (android.text.TextUtils.isEmpty(r47) == false) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:924:0x07e7, code lost:
    
        r2 = new java.lang.String[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:925:0x07eb, code lost:
    
        r5 = r2.length;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:926:0x07f9, code lost:
    
        if (r0 >= r5) goto L1094;
     */
    /* JADX WARN: Code restructure failed: missing block: B:927:0x07fb, code lost:
    
        r7 = X.C2IH.A02(r2[r0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:928:0x0801, code lost:
    
        if (r7 == null) goto L1095;
     */
    /* JADX WARN: Code restructure failed: missing block: B:930:0x0807, code lost:
    
        if (X.C2IH.A06(r7) == false) goto L1096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:934:0x080a, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:937:0x07ee, code lost:
    
        r2 = r47.trim().split("(\\s*,\\s*)", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:939:0x0813, code lost:
    
        if (X.C2IH.A05(r164) != false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:941:0x081f, code lost:
    
        if ("image".equals(X.C2IH.A03(r164)) != false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:943:0x082d, code lost:
    
        if (X.AbstractC111324zv.A00(1924).equals(r164) == false) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:944:0x082f, code lost:
    
        r1 = X.C2IH.A02(r47);
     */
    /* JADX WARN: Code restructure failed: missing block: B:945:0x0839, code lost:
    
        if ("text/vtt".equals(r1) == false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:946:0x083b, code lost:
    
        r1 = "application/x-mp4-vtt";
     */
    /* JADX WARN: Code restructure failed: missing block: B:947:0x0846, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:948:0x07a1, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:951:0x06bb, code lost:
    
        if (X.AbstractC92154Av.A01("AudioChannelConfiguration", r3) == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:952:0x06bd, code lost:
    
        r39 = A03(r3);
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:954:0x06d8, code lost:
    
        if (X.AbstractC92154Av.A01("SegmentBase", r3) == false) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:955:0x06da, code lost:
    
        r8 = A0L((X.C92184Ay) r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:957:0x06ea, code lost:
    
        if (X.AbstractC92154Av.A01("SegmentList", r3) == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:958:0x06ec, code lost:
    
        r6 = A07(r3, r6);
        r12 = false;
        r8 = A0I((X.C67737Ux5) r8, r3, r184, r10, r6, r138);
     */
    /* JADX WARN: Code restructure failed: missing block: B:959:0x0706, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:960:0x070d, code lost:
    
        if (X.AbstractC92154Av.A01("SegmentTemplate", r3) == false) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:961:0x070f, code lost:
    
        r6 = A07(r3, r6);
        r8 = A0J((X.C4BD) r8, r88, r3, r184, r10, r6, r138, r156);
     */
    /* JADX WARN: Code restructure failed: missing block: B:963:0x0730, code lost:
    
        if (X.AbstractC92154Av.A01("ContentProtection", r3) == false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:964:0x0732, code lost:
    
        r1 = A08(r3);
        r0 = r1.first;
     */
    /* JADX WARN: Code restructure failed: missing block: B:965:0x0738, code lost:
    
        if (r0 == null) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:966:0x073a, code lost:
    
        r120 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:967:0x073e, code lost:
    
        r1 = r1.second;
     */
    /* JADX WARN: Code restructure failed: missing block: B:968:0x0740, code lost:
    
        if (r1 == null) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:969:0x0742, code lost:
    
        r61.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:971:0x074f, code lost:
    
        if (X.AbstractC92154Av.A01("InbandEventStream", r3) == false) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:972:0x0751, code lost:
    
        r60.add(A09("InbandEventStream", r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:974:0x0760, code lost:
    
        if (X.AbstractC92154Av.A01("EssentialProperty", r3) == false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:975:0x0762, code lost:
    
        r59.add(A09("EssentialProperty", r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:977:0x0771, code lost:
    
        if (X.AbstractC92154Av.A01("SupplementalProperty", r3) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:978:0x0773, code lost:
    
        r55.add(A09("SupplementalProperty", r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:980:0x0784, code lost:
    
        if (X.AbstractC92154Av.A01("FBInitializationBinary", r3) == false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:981:0x0786, code lost:
    
        r177 = r3.nextText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:983:0x0792, code lost:
    
        if (X.AbstractC92154Av.A01("FBSegmentIndexBinary", r3) == false) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:984:0x0794, code lost:
    
        r178 = r3.nextText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:985:0x079a, code lost:
    
        A0D(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:986:0x0687, code lost:
    
        r36 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:987:0x061d, code lost:
    
        r38 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:988:0x061f, code lost:
    
        if (r1 == null) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:989:0x0605, code lost:
    
        r40 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:990:0x060d, code lost:
    
        if (r1.contains("avoid_on_cell_datasaver_intentional") != false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:991:0x05f3, code lost:
    
        r44 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:992:0x05f5, code lost:
    
        if (r1 == null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:993:0x05db, code lost:
    
        r45 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:994:0x05e3, code lost:
    
        if (r1.contains("avoid_on_cellular") != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:996:0x05cb, code lost:
    
        if (r1 != null) goto L243;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:846:0x0b6d A[Catch: XmlPullParserException -> 0x1448, TryCatch #3 {XmlPullParserException -> 0x1448, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0019, B:12:0x002c, B:21:0x0030, B:22:0x0031, B:23:0x0032, B:25:0x0049, B:27:0x0057, B:29:0x0065, B:30:0x006b, B:32:0x0071, B:34:0x007c, B:38:0x0081, B:40:0x0093, B:41:0x0097, B:43:0x00b1, B:45:0x00b9, B:46:0x00cd, B:48:0x00da, B:52:0x00fd, B:55:0x010a, B:57:0x0126, B:58:0x012a, B:60:0x0152, B:61:0x0158, B:63:0x0162, B:64:0x0168, B:66:0x0172, B:67:0x0178, B:70:0x018b, B:73:0x01a1, B:75:0x01a7, B:78:0x01b6, B:81:0x01c2, B:84:0x01d5, B:87:0x01e6, B:90:0x01f2, B:93:0x020d, B:97:0x022f, B:100:0x023e, B:101:0x0246, B:102:0x109e, B:111:0x10d0, B:113:0x10d6, B:115:0x10fa, B:117:0x1106, B:118:0x110f, B:120:0x1115, B:124:0x11ad, B:125:0x1120, B:126:0x1126, B:128:0x112c, B:131:0x1134, B:134:0x113a, B:135:0x1140, B:137:0x1146, B:140:0x114e, B:143:0x1156, B:144:0x115a, B:146:0x1160, B:149:0x1168, B:152:0x116e, B:153:0x1174, B:155:0x117a, B:158:0x1182, B:161:0x1188, B:175:0x118d, B:176:0x119e, B:178:0x11a2, B:179:0x11a6, B:192:0x11d0, B:193:0x11f2, B:195:0x1209, B:201:0x13b3, B:203:0x13c8, B:205:0x13ce, B:211:0x13dc, B:214:0x1427, B:215:0x1428, B:217:0x121e, B:218:0x1227, B:220:0x122d, B:221:0x1240, B:223:0x1246, B:225:0x1252, B:227:0x1259, B:230:0x125c, B:233:0x126b, B:235:0x1275, B:237:0x127b, B:238:0x127f, B:240:0x1285, B:243:0x129d, B:245:0x1372, B:247:0x137e, B:249:0x1384, B:251:0x138e, B:253:0x139c, B:255:0x1398, B:261:0x13a0, B:266:0x12a7, B:267:0x12a9, B:270:0x12b2, B:271:0x12b3, B:273:0x12bb, B:274:0x12c9, B:276:0x12cf, B:277:0x12d3, B:279:0x12d9, B:282:0x12f1, B:284:0x12fb, B:286:0x1301, B:287:0x130b, B:288:0x1311, B:290:0x1317, B:293:0x1323, B:296:0x1329, B:305:0x1330, B:316:0x1424, B:317:0x1425, B:319:0x1339, B:320:0x133d, B:322:0x1343, B:327:0x136e, B:331:0x135e, B:333:0x1364, B:338:0x11b4, B:339:0x1429, B:340:0x1439, B:343:0x0255, B:345:0x025d, B:348:0x0268, B:352:0x1082, B:354:0x108d, B:355:0x1091, B:358:0x1097, B:360:0x10a7, B:362:0x10af, B:363:0x10b4, B:365:0x10bc, B:366:0x10c1, B:367:0x0276, B:369:0x027e, B:370:0x0293, B:372:0x029b, B:373:0x02a5, B:376:0x02c2, B:378:0x02d1, B:379:0x02df, B:382:0x02e5, B:384:0x02ee, B:386:0x02f6, B:388:0x02ff, B:389:0x0303, B:391:0x030c, B:392:0x0311, B:395:0x031d, B:398:0x0327, B:400:0x033d, B:401:0x0345, B:402:0x0369, B:406:0x0ff2, B:407:0x0ffa, B:408:0x1007, B:412:0x1011, B:414:0x1017, B:417:0x1024, B:419:0x102c, B:423:0x104a, B:424:0x103a, B:426:0x1043, B:433:0x104e, B:436:0x1051, B:441:0x107b, B:443:0x140a, B:444:0x1422, B:448:0x106f, B:449:0x106d, B:451:0x0378, B:453:0x0382, B:456:0x038c, B:459:0x03a7, B:462:0x03b3, B:465:0x03bf, B:467:0x03c9, B:468:0x03cf, B:470:0x03d9, B:471:0x03df, B:472:0x044c, B:476:0x0c4c, B:477:0x0c54, B:478:0x0c61, B:481:0x0c69, B:482:0x0c73, B:484:0x0c79, B:486:0x0c8a, B:487:0x0c8e, B:490:0x0c96, B:492:0x0c9c, B:494:0x0cae, B:496:0x0cb5, B:499:0x0cb8, B:500:0x0cba, B:502:0x0cc0, B:503:0x0cc4, B:506:0x0cca, B:509:0x0cd9, B:511:0x0cdf, B:513:0x0cef, B:516:0x0cf3, B:517:0x0cf6, B:519:0x0cfc, B:521:0x0d0c, B:523:0x0d10, B:525:0x0d1c, B:557:0x0d1f, B:529:0x0d22, B:530:0x0d26, B:532:0x0d2a, B:536:0x0d35, B:538:0x0d3b, B:540:0x0d45, B:542:0x0d49, B:545:0x0d51, B:549:0x0d55, B:555:0x0d58, B:560:0x0d6c, B:562:0x0d7e, B:563:0x0da1, B:564:0x0e01, B:565:0x0da5, B:567:0x0da9, B:568:0x0dd3, B:570:0x0de5, B:572:0x1402, B:573:0x1409, B:575:0x0e05, B:577:0x045b, B:579:0x0465, B:581:0x046d, B:582:0x0471, B:584:0x0475, B:585:0x047c, B:587:0x0484, B:590:0x048e, B:592:0x0499, B:601:0x04a8, B:602:0x04b2, B:604:0x04ba, B:605:0x04c5, B:607:0x04cf, B:608:0x04d5, B:610:0x04dd, B:611:0x04e8, B:613:0x04f0, B:614:0x04fb, B:616:0x0503, B:617:0x050e, B:619:0x0518, B:622:0x0522, B:625:0x052c, B:628:0x054a, B:631:0x0554, B:634:0x059f, B:637:0x05af, B:641:0x05bf, B:643:0x05cd, B:649:0x05e9, B:651:0x05f7, B:657:0x0613, B:659:0x0621, B:662:0x062d, B:665:0x0639, B:668:0x0645, B:671:0x0651, B:674:0x065d, B:677:0x066d, B:681:0x067b, B:684:0x0694, B:687:0x06a1, B:688:0x06a7, B:690:0x06c2, B:693:0x06ca, B:697:0x07a2, B:701:0x07ad, B:703:0x07b3, B:704:0x07b7, B:706:0x07c9, B:913:0x07c5, B:708:0x07d1, B:712:0x083d, B:716:0x0849, B:718:0x084f, B:720:0x0861, B:724:0x086d, B:728:0x0878, B:733:0x087f, B:735:0x0885, B:737:0x0897, B:739:0x089c, B:741:0x08a4, B:745:0x08ae, B:747:0x08af, B:751:0x08b4, B:753:0x08ba, B:755:0x08cc, B:757:0x08d3, B:761:0x08d8, B:763:0x08de, B:765:0x08f0, B:766:0x0943, B:768:0x0944, B:769:0x08f7, B:771:0x0901, B:773:0x0905, B:774:0x090a, B:776:0x090e, B:779:0x0919, B:782:0x0924, B:785:0x092d, B:789:0x0936, B:794:0x0947, B:795:0x094a, B:797:0x0950, B:799:0x0962, B:801:0x0964, B:804:0x0967, B:805:0x096a, B:807:0x0970, B:809:0x0982, B:811:0x0984, B:814:0x0987, B:815:0x098a, B:817:0x0990, B:819:0x09a2, B:823:0x09ac, B:825:0x09b0, B:828:0x09bd, B:831:0x09da, B:834:0x0a00, B:835:0x0a08, B:838:0x0a0f, B:839:0x0a17, B:841:0x0a1f, B:842:0x0a2b, B:843:0x0a7a, B:844:0x0a81, B:846:0x0b6d, B:847:0x0b72, B:850:0x0b7a, B:856:0x0ba3, B:858:0x0ba7, B:859:0x0a88, B:861:0x0a8e, B:862:0x0ab8, B:864:0x0abe, B:866:0x0ac6, B:869:0x0b51, B:870:0x0ad1, B:872:0x0ad7, B:874:0x0ae9, B:876:0x0aed, B:878:0x0afb, B:882:0x0b47, B:880:0x0b08, B:887:0x0b0b, B:889:0x0b11, B:891:0x0b23, B:893:0x0b27, B:895:0x0b35, B:897:0x0b42, B:902:0x0b55, B:904:0x0b61, B:916:0x07ba, B:918:0x07d8, B:922:0x07e1, B:924:0x07e7, B:925:0x07eb, B:927:0x07fb, B:929:0x0803, B:934:0x080a, B:937:0x07ee, B:938:0x080f, B:940:0x0815, B:942:0x0821, B:944:0x082f, B:950:0x06b5, B:952:0x06bd, B:953:0x06d2, B:955:0x06da, B:956:0x06e4, B:958:0x06ec, B:959:0x0706, B:961:0x070f, B:962:0x072a, B:964:0x0732, B:966:0x073a, B:967:0x073e, B:969:0x0742, B:970:0x0749, B:972:0x0751, B:973:0x075c, B:975:0x0762, B:976:0x076d, B:978:0x0773, B:979:0x077e, B:981:0x0786, B:982:0x078c, B:984:0x0794, B:985:0x079a, B:989:0x0605, B:993:0x05db, B:997:0x0bb1, B:999:0x0bb9, B:1000:0x0bc3, B:1002:0x0bcb, B:1003:0x0be6, B:1005:0x0bee, B:1006:0x0c0b, B:1008:0x0c13, B:1009:0x0c1d, B:1012:0x0c27, B:1014:0x0c31, B:1015:0x0c35, B:1020:0x0c3c, B:1021:0x0c40, B:1023:0x0c48, B:1024:0x0e1f, B:1026:0x0e27, B:1029:0x0e34, B:1032:0x0e3e, B:1033:0x0e5a, B:1035:0x0e65, B:1038:0x0e96, B:1039:0x0ea6, B:1041:0x0eaf, B:1042:0x0eb4, B:1044:0x0eb8, B:1048:0x0ec0, B:1051:0x0ec8, B:1054:0x0ed0, B:1057:0x0ed8, B:1060:0x0ee0, B:1063:0x0ee8, B:1066:0x0ef0, B:1069:0x0efc, B:1070:0x0f07, B:1072:0x0f0d, B:1075:0x0f1f, B:1078:0x0f23, B:1084:0x0f2c, B:1086:0x0f39, B:1087:0x0f3d, B:1088:0x0f53, B:1091:0x0f59, B:1092:0x0f66, B:1094:0x0f6c, B:1096:0x0f83, B:1098:0x0f50, B:1099:0x0f90, B:1101:0x0f98, B:1102:0x0fa1, B:1104:0x0fa9, B:1105:0x0fc0, B:1107:0x0fc8, B:1108:0x0fe1, B:1110:0x0fe9, B:1111:0x0fee, B:1113:0x107e, B:1115:0x01fb, B:1117:0x0207, B:1118:0x01e0, B:1123:0x143a, B:1124:0x1447, B:269:0x12aa, B:207:0x13cf, B:209:0x13d5, B:9:0x001a, B:18:0x0022), top: B:2:0x0005, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:849:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:852:0x0b9d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, X.4Fv, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v567, types: [X.X9r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable, X.4Fv, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v119, types: [X.Ux4, X.4aM] */
    /* JADX WARN: Type inference failed for: r1v131, types: [java.lang.Throwable, X.4Fv, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v149, types: [java.lang.Throwable, X.4Fv, java.io.IOException] */
    @Override // X.InterfaceC92094Ap
    /* renamed from: A0G, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C92124As E3N(android.net.Uri r216, java.io.InputStream r217) {
        /*
            Method dump skipped, instructions count: 5248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC92084Ao.E3N(android.net.Uri, java.io.InputStream):X.4As");
    }
}
