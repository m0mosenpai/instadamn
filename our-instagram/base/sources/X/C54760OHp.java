package X;

import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.List;

/* renamed from: X.OHp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54760OHp {
    public final View A00;
    public final List A01 = AbstractC166987dD.A1E();

    public final MediaFrameLayout A00(int i) {
        List list = this.A01;
        if (i < list.size() && i >= 0) {
            return ((C56552P8y) list.get(i)).A0E;
        }
        throw new IndexOutOfBoundsException(StringFormatUtil.formatStrLocaleSafe("Failed to get grid item view - position=%d itemHoldersSize=%d", Integer.valueOf(i), AbstractC43592JPx.A0s(list)));
    }

    public C54760OHp(View view) {
        this.A00 = view;
    }
}
