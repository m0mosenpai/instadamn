package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35350FiR implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC60442pS A02;
    public final /* synthetic */ String A03;

    public DialogInterfaceOnClickListenerC35350FiR(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A03 = str;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String A0g = AnonymousClass001.A0g("fb://shops_product_details/?productID=", this.A03, "&refID=0&refType=0");
        AbstractC35190Ffi.A01(this.A00, this.A02, this.A01, "ig_product_wishlist", null, A0g);
    }
}
