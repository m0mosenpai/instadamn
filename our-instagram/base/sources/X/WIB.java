package X;

import android.content.DialogInterface;

/* loaded from: classes11.dex */
public final class WIB implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ UG7 A00;

    public WIB(UG7 ug7) {
        this.A00 = ug7;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        boolean remove;
        UG7 ug7 = this.A00;
        boolean z2 = ug7.A01;
        java.util.Set set = ug7.A00;
        String charSequence = ug7.A03[i].toString();
        if (z) {
            remove = set.add(charSequence);
        } else {
            remove = set.remove(charSequence);
        }
        ug7.A01 = remove | z2;
    }
}
