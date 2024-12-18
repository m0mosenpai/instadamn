package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Eyk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33944Eyk {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        EnumC114765Gh enumC114765Gh;
        String str = (String) c6fw.A01();
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 1);
        boolean A1a = AbstractC166987dD.A1a(c6fw.A00());
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C6WF.A01 = new C36773GIw(c6fq, A0I);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C35028Fc1 A00 = C35028Fc1.A00(str);
        A00.A0N = true;
        A00.A0P = !A1a;
        if (A1a) {
            enumC114765Gh = EnumC114765Gh.A06;
        } else {
            enumC114765Gh = EnumC114765Gh.A04;
        }
        A00.A04 = enumC114765Gh;
        AbstractC31174DnI.A0a(A04, A00.A01(), A0B, ModalActivity.class, "single_media_feed").A0A(A04, 1005);
        return null;
    }
}
