package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.Fab, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34951Fab {
    public int A00;
    public int A01;
    public String A02;
    public String A03;

    public C34951Fab(String str, String str2, int i, int i2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = i;
        this.A00 = i2;
    }

    public static C34951Fab A00(Context context) {
        return new C34951Fab(context.getString(2131963208), context.getString(2131965049), R.drawable.instagram_insights_pano_outline_24, R.drawable.ig_illustrations_illo_user_insights_refresh);
    }
}
