package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* renamed from: X.S3w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62251S3w {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.fragment.app.Fragment, X.RE9] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 0);
        String A0s2 = AbstractC31173DnH.A0s(list, 1);
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 2);
        InterfaceC103384lE A0t2 = AbstractC25228BEl.A0t(list, 3);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putInt("STYLE_RES", R.style.Ig4aFbPay_AddShopPayBottomSheet);
        Bundle A0b2 = AbstractC166987dD.A0b();
        A0b2.putSerializable("viewmodel_class", REJ.class);
        C62697SMl c62697SMl = new C62697SMl();
        c62697SMl.A00(A0s2);
        AbstractC58322PtE.A19(A0b2, c62697SMl);
        A0b2.putString(IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY, A0s);
        ?? fragment = new Fragment();
        fragment.setArguments(A0b2);
        C67752UxP c67752UxP = new C67752UxP();
        c67752UxP.setArguments(A0b);
        AbstractC10360h2 supportFragmentManager = C6BQ.A04(c6fq).getSupportFragmentManager();
        C14360o3.A07(supportFragmentManager);
        c67752UxP.A0J(fragment, supportFragmentManager, null);
        fragment.A00 = new C64196T3f(c67752UxP, c6fq, A0t, A0t2);
        return null;
    }
}
