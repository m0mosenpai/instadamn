package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;

/* renamed from: X.41p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C905441p {
    public final C57012jc A00;

    public C905441p(View view) {
        ViewStub viewStub;
        View findViewById = view.findViewById(R.id.carousel_sub_media_deletion_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        this.A00 = new C57012jc(viewStub);
    }
}
