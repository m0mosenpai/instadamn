package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.charset.Charset;

/* renamed from: X.15W, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C15W {
    public static final Charset A00;
    public static final Charset A01;
    public static final Charset A02;
    public static final Charset A03;
    public static final Charset A04;
    public static final Charset A05;

    static {
        Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
        C14360o3.A07(forName);
        A05 = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C14360o3.A07(forName2);
        A02 = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C14360o3.A07(forName3);
        A03 = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C14360o3.A07(forName4);
        A04 = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C14360o3.A07(forName5);
        A01 = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C14360o3.A07(forName6);
        A00 = forName6;
    }
}
