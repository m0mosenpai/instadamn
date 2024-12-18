package X;

import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.PwK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58492PwK {
    public static String A00(String str, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlPullParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }

    public static void A01(String str, String str2, XmlSerializer xmlSerializer) {
        if (!TextUtils.isEmpty(str2)) {
            xmlSerializer.attribute(null, str, str2);
        }
    }
}
