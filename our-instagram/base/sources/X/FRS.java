package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class FRS {
    public final Context A00;

    public final void A02(DialogInterface.OnClickListener onClickListener, String str, int i) {
        C14360o3.A0B(str, 0);
        Context context = this.A00;
        String A0p = AbstractC166997dE.A0p(context, 2131972728);
        String A0r = AbstractC25231BEo.A0r(context.getResources(), str, R.plurals.save_home_bulk_edit_move_to_collection_confirmation_message, i);
        String A0p2 = AbstractC166997dE.A0p(context, 2131966909);
        C193328hC A0a = AbstractC31176DnK.A0a(context, A0r, A0p);
        A0a.A0Z(onClickListener, EnumC193348hE.A04, A0p2, true);
        A0a.A0D(DialogInterfaceOnClickListenerC35436Fjt.A00);
        AbstractC31178DnM.A1R(A0a, true);
    }

    public final void A00(DialogInterface.OnClickListener onClickListener) {
        Context context = this.A00;
        String A0p = AbstractC166997dE.A0p(context, 2131972730);
        String A0p2 = AbstractC166997dE.A0p(context, 2131972729);
        String A0p3 = AbstractC166997dE.A0p(context, 2131972274);
        C193328hC A0a = AbstractC31176DnK.A0a(context, A0p2, A0p);
        A0a.A0Z(onClickListener, EnumC193348hE.A06, A0p3, true);
        A0a.A0D(DialogInterfaceOnClickListenerC35436Fjt.A00);
        AbstractC31178DnM.A1R(A0a, true);
    }

    public final void A01(DialogInterface.OnClickListener onClickListener, int i) {
        Context context = this.A00;
        String quantityString = context.getResources().getQuantityString(R.plurals.save_home_bulk_edit_remove_confirmation_title, i);
        C14360o3.A07(quantityString);
        String quantityString2 = context.getResources().getQuantityString(R.plurals.save_home_bulk_edit_remove_confirmation_message, i);
        C14360o3.A07(quantityString2);
        String A0p = AbstractC166997dE.A0p(context, 2131976205);
        C193328hC A0a = AbstractC31176DnK.A0a(context, quantityString2, quantityString);
        A0a.A0Z(onClickListener, EnumC193348hE.A06, A0p, true);
        A0a.A0D(DialogInterfaceOnClickListenerC35436Fjt.A00);
        AbstractC31178DnM.A1R(A0a, true);
    }

    public FRS(Context context) {
        this.A00 = context;
    }
}
