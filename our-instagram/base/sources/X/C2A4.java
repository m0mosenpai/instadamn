package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Locale;

/* renamed from: X.2A4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2A4 {
    public ConnectivityManager A00;
    public String A01;
    public final Context A02;
    public final boolean A03;

    public final String A00() {
        NetworkInfo activeNetworkInfo;
        String typeName;
        String str = this.A01;
        if (str == null) {
            if (this.A00 == null) {
                try {
                    this.A00 = (ConnectivityManager) this.A02.getSystemService("connectivity");
                } catch (NullPointerException unused) {
                }
            }
            ConnectivityManager connectivityManager = this.A00;
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && (typeName = activeNetworkInfo.getTypeName()) != null) {
                if (this.A03) {
                    this.A01 = typeName.toUpperCase(Locale.US);
                    return typeName;
                }
                return typeName;
            }
            return "UNKNOWN";
        }
        return str;
    }

    public final boolean A01() {
        NetworkInfo activeNetworkInfo;
        String str = this.A01;
        if (str != null) {
            return str.equals("WIFI");
        }
        if (this.A00 == null) {
            try {
                this.A00 = (ConnectivityManager) this.A02.getSystemService("connectivity");
            } catch (NullPointerException unused) {
            }
        }
        ConnectivityManager connectivityManager = this.A00;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return true;
    }

    public C2A4(Context context, boolean z) {
        AbstractC05810Sj.A00(context);
        this.A02 = context;
        this.A03 = z;
    }
}
