package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Eyu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33954Eyu {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A00(C6FQ c6fq) {
        InterfaceC53782dH interfaceC53782dH;
        FragmentActivity A04 = C6BQ.A04(c6fq);
        boolean z = false;
        if (A04 instanceof InterfaceC53782dH) {
            interfaceC53782dH = (InterfaceC53782dH) A04;
        } else {
            if ((A04 instanceof ModalActivity) && AbstractC54852fj.A00() != null) {
                interfaceC53782dH = (InterfaceC53782dH) AbstractC54852fj.A00();
                z = true;
            }
            return null;
        }
        if (interfaceC53782dH != null) {
            interfaceC53782dH.Als().Emy(EnumC33447EqK.A0J, EnumC69983Ch.A02);
            if (z) {
                A04.finish();
            }
        }
        return null;
    }
}
