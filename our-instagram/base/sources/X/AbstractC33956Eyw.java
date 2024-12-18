package X;

import android.os.Bundle;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Eyw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33956Eyw {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        int A0H = AbstractC166987dD.A0H(c6fw.A01());
        String str = (String) c6fw.A02();
        InterfaceC103384lE A0H2 = AbstractC31175DnJ.A0H(c6fw);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C6WD.A00 = new FIH(c6fq, A0H2);
        Bundle A0E = AbstractC31174DnI.A0E(str, 1);
        A0E.putInt("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_SECONDS", A0H);
        A0E.putString(AbstractC111324zv.A00(368), str);
        AbstractC31173DnH.A0Z(C6BQ.A04(c6fq), A0E, A0B, ModalActivity.class, AbstractC111324zv.A00(3837)).A0A(C6BQ.A04(c6fq), 1003);
        return null;
    }
}
