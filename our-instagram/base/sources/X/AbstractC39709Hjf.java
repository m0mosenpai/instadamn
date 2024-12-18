package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.Hjf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39709Hjf {
    public static Fragment A00(Context context) {
        AbstractC10360h2 supportFragmentManager;
        List A04;
        FragmentActivity fragmentActivity = (FragmentActivity) AbstractC167197dY.A00(context, FragmentActivity.class);
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (A04 = supportFragmentManager.A0U.A04()) == null || A04.isEmpty()) {
            return null;
        }
        return (Fragment) A04.get(AbstractC25226BEj.A05(A04));
    }
}
