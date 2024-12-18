package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.6f3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144216f3 {
    public final View A00;
    public final View A01;
    public final ImageView A02;

    public C144216f3(C57012jc c57012jc) {
        View A01 = c57012jc.A01();
        C14360o3.A07(A01);
        this.A01 = A01.requireViewById(R.id.question_sticker_container_view);
        this.A02 = (ImageView) A01.requireViewById(R.id.question_sticker_view);
        this.A00 = A01.requireViewById(R.id.question_sticker_response_count_view);
    }
}
