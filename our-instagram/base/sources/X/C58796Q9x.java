package X;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Q9x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58796Q9x extends AbstractC63646SrC {
    public final Pattern A00;

    public C58796Q9x() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.A00 = Pattern.compile("\\A\\d+");
    }

    @Override // X.AbstractC63646SrC
    public final boolean A00() {
        return AbstractC43593JPy.A1Z(Build.VERSION.SDK_INT, 33);
    }

    @Override // X.AbstractC63646SrC
    public final boolean A01() {
        boolean A01 = super.A01();
        if (A01 && Build.VERSION.SDK_INT < 29) {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage == null) {
                return false;
            }
            Matcher matcher = this.A00.matcher(currentWebViewPackage.versionName);
            if (!matcher.find() || Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) < 105) {
                return false;
            }
            return true;
        }
        return A01;
    }
}
