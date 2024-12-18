package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;

/* loaded from: classes10.dex */
public abstract class QE5 extends QEF {
    public C5G6 A00;
    public C63380Siu A01;
    public boolean A02;
    public boolean A03;

    @Override // X.C0SG, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        InterfaceC172727mi interfaceC172727mi;
        QF6 C9a;
        Bundle bundle;
        String str;
        C14360o3.A0B(dialogInterface, 0);
        C63380Siu c63380Siu = this.A01;
        if (c63380Siu != null && (bundle = this.mArguments) != null) {
            Parcelable parcelable = null;
            Parcelable parcelable2 = bundle.getParcelable("contact_info");
            Parcelable.Creator creator = AutofillData.CREATOR;
            C14360o3.A08(creator);
            AutofillData autofillData = (AutofillData) C0B1.A01(creator, parcelable2, AutofillData.class);
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                parcelable = bundle2.getParcelable("payment_info");
            }
            Parcelable.Creator creator2 = CardDetails.CREATOR;
            C14360o3.A08(creator2);
            SYH A00 = AbstractC61731Rsm.A00(autofillData, (CardDetails) C0B1.A01(creator2, parcelable, CardDetails.class));
            if (A00 != null) {
                C5G6 c5g6 = c63380Siu.A0Q;
                EnumC61149RgA enumC61149RgA = (EnumC61149RgA) c5g6.A00.A0K.A00;
                EnumC61149RgA enumC61149RgA2 = EnumC61149RgA.A03;
                if (enumC61149RgA == enumC61149RgA2) {
                    str = "DECLINED_SAVE";
                } else {
                    str = "DECLINED_ADD_NEW_CARD";
                }
                c63380Siu.A0J = true;
                C61602RqR A08 = c63380Siu.A08(str);
                C58883QEt c58883QEt = c63380Siu.A03;
                AbstractC63223SfY.A04(c58883QEt, A08);
                A08.A07 = AbstractC62770SQm.A00(A00);
                AbstractC63402SjX.A0A(c58883QEt.A03(), c5g6, A08.A00());
                if (enumC61149RgA == enumC61149RgA2) {
                    A08.A0I = "NOT_NOW_CLICK";
                    AbstractC63402SjX.A0B(c5g6, c58883QEt, A08);
                }
            }
        }
        C63380Siu c63380Siu2 = this.A01;
        if (c63380Siu2 != null) {
            C5G6 c5g62 = c63380Siu2.A0Q;
            if (c5g62.A00.A09.A03) {
                if (AbstractC31177DnL.A1U(C06090Tz.A06, c5g62.A04.A00, 36322800415418942L) && (interfaceC172727mi = ((AbstractC63223SfY) c63380Siu2.A03).A04) != null && (C9a = interfaceC172727mi.C9a()) != null) {
                    C9a.A08();
                }
            }
        }
    }
}
