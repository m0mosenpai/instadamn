package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;

/* renamed from: X.73p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1571073p implements InterfaceC41141vN {
    public final int A00;

    public final C3KD A00(Activity activity, Context context) {
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A02();
        c146106i8.A04 = activity.getDrawable(R.drawable.instagram_direct_pano_outline_24);
        Resources resources = context.getResources();
        int i = this.A00;
        c146106i8.A0D = resources.getQuantityString(R.plurals.rff_message_sent_confirmation, i, Integer.valueOf(i));
        return new C3KD(c146106i8.A00());
    }

    public C1571073p(int i) {
        this.A00 = i;
    }
}
