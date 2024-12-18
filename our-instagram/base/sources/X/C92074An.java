package X;

import android.content.Context;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.4An, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92074An extends AbstractC92084Ao {
    public final Context A00;
    public final HeroPlayerSetting A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C92074An(android.content.Context r9, com.facebook.video.heroplayer.setting.HeroPlayerSetting r10, java.lang.String r11, boolean r12) {
        /*
            r8 = this;
            X.22Z r0 = r10.A13
            if (r0 == 0) goto L19
            boolean r3 = r0.A00
        L6:
            boolean r4 = r10.A1K
            boolean r5 = r10.A2s
            boolean r6 = r10.A1t
            int r2 = r10.A0C
            r0 = r8
            r1 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.A01 = r10
            r8.A00 = r9
            return
        L19:
            r3 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92074An.<init>(android.content.Context, com.facebook.video.heroplayer.setting.HeroPlayerSetting, java.lang.String, boolean):void");
    }

    @Override // X.AbstractC92084Ao
    public final C92184Ay A0L(C92184Ay c92184Ay, XmlPullParser xmlPullParser) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7 = -1;
        if (c92184Ay != null && (c92184Ay instanceof C4B1)) {
            j = ((C4B1) c92184Ay).A00;
        } else {
            j = -1;
        }
        String attributeValue = xmlPullParser.getAttributeValue(null, "FBFirstSegmentRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            if (split.length == 2) {
                j = Long.parseLong(split[1]);
            } else {
                j = -1;
            }
        }
        if (c92184Ay != null && (c92184Ay instanceof C4B1)) {
            j2 = ((C4B1) c92184Ay).A04;
        } else {
            j2 = -1;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "FBSecondSegmentRange");
        if (attributeValue2 != null) {
            String[] split2 = attributeValue2.split("-");
            if (split2.length == 2) {
                j2 = Long.parseLong(split2[1]);
            } else {
                j2 = -1;
            }
        }
        if (c92184Ay != null && (c92184Ay instanceof C4B1)) {
            j3 = ((C4B1) c92184Ay).A05;
        } else {
            j3 = -1;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "FBThirdSegmentRange");
        if (attributeValue3 != null) {
            String[] split3 = attributeValue3.split("-");
            if (split3.length == 2) {
                j3 = Long.parseLong(split3[1]);
            } else {
                j3 = -1;
            }
        }
        if (c92184Ay != null && (c92184Ay instanceof C4B1)) {
            j4 = ((C4B1) c92184Ay).A05;
        } else {
            j4 = -1;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "FBFourthSegmentRange");
        if (attributeValue4 != null) {
            String[] split4 = attributeValue4.split("-");
            if (split4.length == 2) {
                j4 = Long.parseLong(split4[1]);
            } else {
                j4 = -1;
            }
        }
        if (c92184Ay != null && (c92184Ay instanceof C4B1)) {
            j5 = ((C4B1) c92184Ay).A03;
        } else {
            j5 = -1;
        }
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "FBPrefetchSegmentRange");
        if (attributeValue5 != null) {
            String[] split5 = attributeValue5.split("-");
            if (split5.length == 2) {
                j5 = Long.parseLong(split5[1]);
            } else {
                j5 = -1;
            }
        }
        if (c92184Ay != null && (c92184Ay instanceof C4B1)) {
            j6 = ((C4B1) c92184Ay).A02;
        } else {
            j6 = -1;
        }
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "FBMinimumPrefetchRange");
        if (attributeValue6 != null) {
            String[] split6 = attributeValue6.split("-");
            if (split6 != null) {
                try {
                    if (split6.length > 1) {
                        j7 = Long.parseLong(split6[1]);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        } else {
            j7 = j6;
        }
        C92184Ay A0L = super.A0L(c92184Ay, xmlPullParser);
        return new C4B1(A0L.A02, ((AbstractC92194Az) A0L).A01, ((AbstractC92194Az) A0L).A00, A0L.A01, A0L.A00, j, j2, j3, j4, j5, j7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C92074An() {
        /*
            r4 = this;
            X.1wX r3 = new X.1wX
            r3.<init>()
            r2 = 0
            r3.A03 = r2
            r3.A1d = r2
            r0 = 1
            r3.A1Y = r0
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = new com.facebook.video.heroplayer.setting.HeroPlayerSetting
            r1.<init>(r3)
            r0 = 0
            r4.<init>(r0, r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92074An.<init>():void");
    }
}
