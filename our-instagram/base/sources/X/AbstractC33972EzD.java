package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.EzD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33972EzD {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP c102884kP = (C102884kP) c6fw.A01();
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("bottom_sheet_content_fragment", "bloks");
        A0b.putInt("bloks_data", U6N.A00(A0B).A01(c102884kP));
        C6XJ A0L = AbstractC31171DnF.A0L(A04, A0b, A0B, TransparentModalActivity.class, "bottom_sheet");
        InterfaceC103384lE A0B2 = c102884kP.A0B(40);
        if (A0B2 != null) {
            C6BQ.A0K(c6fq, new EVL(c6fq, A0B2, 4));
            A0L.A0D(C6BQ.A01(c6fq), 32779);
            return null;
        }
        A0L.A0C(A04);
        return null;
    }
}
