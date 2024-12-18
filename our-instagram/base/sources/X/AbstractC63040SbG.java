package X;

import android.content.Context;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.SbG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63040SbG {
    /* JADX WARN: Code restructure failed: missing block: B:130:?, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(X.AnonymousClass001.A0R(r7.getPositionDescription(), ": <item> tag requires a 'color' attribute and a 'offset' attribute!"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.SFF A01(android.content.res.Resources.Theme r25, android.content.res.TypedArray r26, java.lang.String r27, org.xmlpull.v1.XmlPullParser r28, int r29) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63040SbG.A01(android.content.res.Resources$Theme, android.content.res.TypedArray, java.lang.String, org.xmlpull.v1.XmlPullParser, int):X.SFF");
    }

    public static int A00(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static boolean A02(String str, XmlPullParser xmlPullParser) {
        return AbstractC167007dF.A1W(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str));
    }
}
