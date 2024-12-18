package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.url.UrlHandlerActivity;

/* renamed from: X.Dqj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31379Dqj extends C14H {
    @Override // X.C14H
    public final Intent A02(Context context, int i) {
        C14360o3.A0B(context, 0);
        return A03(context, i);
    }

    @Override // X.C14H
    public final Intent A03(Context context, int i) {
        Intent intent;
        C14360o3.A0B(context, 0);
        String packageName = context.getPackageName();
        if (packageName != null) {
            intent = AbstractC31171DnF.A04();
            intent.setComponent(new ComponentName(packageName, "com.instagram.mainactivity.InstagramMainActivity"));
        } else {
            intent = new Intent(context, (Class<?>) InstagramMainActivity.class);
        }
        intent.setFlags(i);
        return intent;
    }

    @Override // X.C14H
    public final Intent A04(Context context, android.net.Uri uri) {
        AbstractC167017dG.A1N(context, uri);
        Intent intent = new Intent(context, (Class<?>) UrlHandlerActivity.class);
        intent.setData(uri);
        return intent;
    }
}
