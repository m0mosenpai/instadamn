package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.TQu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64713TQu implements Runnable {
    public final /* synthetic */ InterfaceC65622ToD A00;
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public RunnableC64713TQu(InterfaceC65622ToD interfaceC65622ToD, IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule, String str, String str2) {
        this.A01 = igReactPurchaseExperienceBridgeModule;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = interfaceC65622ToD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.fragment.app.Fragment, X.RE9] */
    @Override // java.lang.Runnable
    public final void run() {
        Activity A01 = AbstractC58321PtD.A0b(this.A01).A01();
        A01.getClass();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putInt("STYLE_RES", R.style.Ig4aFbPay_AddShopPayBottomSheet);
        Bundle A0b2 = AbstractC166987dD.A0b();
        A0b2.putSerializable("viewmodel_class", REJ.class);
        C62697SMl c62697SMl = new C62697SMl();
        c62697SMl.A00(this.A03);
        AbstractC58322PtE.A19(A0b2, c62697SMl);
        A0b2.putString(IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY, this.A02);
        ?? fragment = new Fragment();
        fragment.setArguments(A0b2);
        C67752UxP c67752UxP = new C67752UxP();
        c67752UxP.setArguments(A0b);
        c67752UxP.A0J(fragment, ((FragmentActivity) A01).getSupportFragmentManager(), null);
        fragment.A00 = new C64195T3e(c67752UxP, this);
    }
}
