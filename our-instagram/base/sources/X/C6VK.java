package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;

/* renamed from: X.6VK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VK {
    public Context A00;
    public SharedPreferences A01;
    public C95F A02;
    public C95F A03;
    public final String A04;

    public C6VK(Context context, String str) {
        this.A04 = str;
        this.A00 = context;
    }

    public final void A00(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            SharedPreferences sharedPreferences = this.A01;
            if (sharedPreferences == null) {
                sharedPreferences = this.A00.getSharedPreferences("asset_preferences", 0);
                this.A01 = sharedPreferences;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            C95F c95f = this.A02;
            if (c95f == null) {
                c95f = (C95F) C95E.A04.A00(this.A04).A00("location");
                this.A02 = c95f;
            }
            edit.putString(c95f.toString(), canonicalPath).apply();
        } catch (IOException e) {
            C0w9.A06("FileStateStorage", "Failed to save path", e);
        }
    }
}
