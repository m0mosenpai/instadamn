package X;

import android.content.res.XmlResourceParser;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public abstract class SUP {
    public static final Object A00 = AbstractC58318PtA.A0b();
    public static volatile ArrayList A01;

    public static String A00(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlResourceParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }
}
