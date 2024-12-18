package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Eyx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33957Eyx {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str = (String) c6fw.A01();
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 1);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C6WE.A00 = new GJ1(c6fq, A0I);
        C35028Fc1 A00 = C35028Fc1.A00(str);
        A00.A0N = true;
        A00.A0U = true;
        A00.A0L = true;
        AbstractC31174DnI.A0a(A04, A00.A01(), A0B, ModalActivity.class, "single_media_feed").A0A(A04, 1001);
        return null;
    }
}
