package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

/* renamed from: X.Ofa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55261Ofa implements DialogInterface.OnClickListener {
    public final /* synthetic */ OU7 A00;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ClipsDraftRepository clipsDraftRepository;
        C19L c19l;
        InterfaceC16620sF pYc;
        C14360o3.A0B(dialogInterface, 0);
        dialogInterface.dismiss();
        OU7 ou7 = this.A00;
        CharSequence charSequence = OU7.A00(ou7)[i];
        P6K p6k = ou7.A01;
        Context A0L = AbstractC166997dE.A0L(p6k.A0C);
        if (C14360o3.A0K(A0L.getString(2131969479), charSequence)) {
            p6k.A02(true);
            return;
        }
        if (C14360o3.A0K(A0L.getString(2131969475), charSequence)) {
            C47Z c47z = p6k.A02;
            if (c47z == null) {
                return;
            }
            C40121td A00 = p6k.A00();
            A00.A06(c47z);
            c47z.A0Q(0L);
            A00.A05.A04();
            return;
        }
        if (C14360o3.A0K(A0L.getString(2131969463), charSequence)) {
            C47Z c47z2 = p6k.A02;
            if (c47z2 == null) {
                return;
            }
            C40121td A002 = p6k.A00();
            C40121td.A02(c47z2);
            c19l = A002.A0A;
            pYc = new PZU(A002, c47z2, (InterfaceC23621Ds) null, 38);
        } else {
            if (C14360o3.A0K(A0L.getString(2131969467), charSequence)) {
                C193328hC A0I = AbstractC31171DnF.A0I(A0L);
                A0I.A0A(2131969468);
                DialogInterfaceOnClickListenerC55319Ogh.A01(A0I, ou7, 69, 2131969466);
                A0I.A0s(true);
                A0I.A0t(true);
                AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC55300OgN.A00, A0I);
                return;
            }
            if (C14360o3.A0K(A0L.getString(2131969465), charSequence) && (clipsDraftRepository = p6k.A01) != null) {
                C47Z c47z3 = p6k.A02;
                if (c47z3 != null) {
                    String str = c47z3.A35;
                    C14360o3.A0B(str, 0);
                    c19l = ((C4A7) clipsDraftRepository).A01;
                    pYc = new PYc(clipsDraftRepository, str, null, 2);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A1D(AbstractC167017dG.A0n(charSequence, "Menu item click not handled: ", AbstractC166987dD.A1C()));
            }
        }
        AbstractC166987dD.A1Z(pYc, c19l);
    }

    public DialogInterfaceOnClickListenerC55261Ofa(OU7 ou7) {
        this.A00 = ou7;
    }
}
