package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VQ3 {
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.1oF] */
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        InterfaceC11380iw c70676Wew;
        String str = (String) c6fw.A01();
        List list = c6fw.A00;
        String str2 = (String) list.get(1);
        String str3 = (String) list.get(2);
        if (TextUtils.isEmpty(str2)) {
            c70676Wew = C6BQ.A08(c6fq);
        } else {
            c70676Wew = new C70676Wew(str2);
        }
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        EnumC72410Xcy enumC72410Xcy = (EnumC72410Xcy) EnumHelper.A00(str, EnumC72410Xcy.A1F);
        if (AbstractC167007dF.A1X(enumC72410Xcy, EnumC72410Xcy.A02)) {
            Bundle bundle = new Bundle();
            bundle.putString(AbstractC111324zv.A00(AbstractC62862SUj.MAX_FACTORIAL), c70676Wew.getModuleName());
            bundle.putString("location", str);
            bundle.putString(AbstractC31581Du9.A00(), str3);
            AbstractC25228BEl.A1G(A04, bundle, userSession, ModalActivity.class, AbstractC111324zv.A00(3829));
            return null;
        }
        if (C37171oF.A00 == null) {
            C37171oF.A00 = new Object();
        }
        C37171oF A00 = VXN.A00();
        AbstractC25230BEn.A15(1, A04, userSession);
        AbstractC167007dF.A1E(c70676Wew, 2, enumC72410Xcy);
        C37171oF.A00(A04, c70676Wew, userSession, enumC72410Xcy, A00, str3, null).A05();
        return null;
    }
}
