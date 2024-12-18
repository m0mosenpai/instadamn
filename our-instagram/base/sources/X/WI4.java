package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import android.widget.ListView;

/* loaded from: classes11.dex */
public final class WI4 implements DialogInterface.OnClickListener, InterfaceC71999XEn {
    public UD9 A00;
    public CharSequence A01;
    public ListAdapter A02;
    public final /* synthetic */ UCx A03;

    @Override // X.InterfaceC71999XEn
    public final Drawable Aes() {
        return null;
    }

    @Override // X.InterfaceC71999XEn
    public final int BEJ() {
        return 0;
    }

    @Override // X.InterfaceC71999XEn
    public final int CEs() {
        return 0;
    }

    public WI4(UCx uCx) {
        this.A03 = uCx;
    }

    @Override // X.InterfaceC71999XEn
    public final CharSequence BED() {
        return this.A01;
    }

    @Override // X.InterfaceC71999XEn
    public final boolean CdI() {
        UD9 ud9 = this.A00;
        if (ud9 != null) {
            return ud9.isShowing();
        }
        return false;
    }

    @Override // X.InterfaceC71999XEn
    public final void EQC(Drawable drawable) {
        android.util.Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // X.InterfaceC71999XEn
    public final void EVp(int i) {
        android.util.Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // X.InterfaceC71999XEn
    public final void EVq(int i) {
        android.util.Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // X.InterfaceC71999XEn
    public final void Egm(int i) {
        android.util.Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // X.InterfaceC71999XEn
    public final void Ek9(int i, int i2) {
        if (this.A02 != null) {
            UCx uCx = this.A03;
            C69797Vvh c69797Vvh = new C69797Vvh(uCx.A04);
            CharSequence charSequence = this.A01;
            if (charSequence != null) {
                c69797Vvh.A08(charSequence);
            }
            ListAdapter listAdapter = this.A02;
            int selectedItemPosition = uCx.getSelectedItemPosition();
            C69487VoA c69487VoA = c69797Vvh.A01;
            c69487VoA.A0B = listAdapter;
            c69487VoA.A03 = this;
            c69487VoA.A00 = selectedItemPosition;
            c69487VoA.A0I = true;
            UD9 A00 = c69797Vvh.A00();
            this.A00 = A00;
            ListView listView = A00.A00.A0I;
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            C0fJ.A00(this.A00);
        }
    }

    @Override // X.InterfaceC71999XEn
    public final void dismiss() {
        UD9 ud9 = this.A00;
        if (ud9 != null) {
            ud9.dismiss();
            this.A00 = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UCx uCx = this.A03;
        uCx.setSelection(i);
        if (uCx.getOnItemClickListener() != null) {
            uCx.performItemClick(null, i, this.A02.getItemId(i));
        }
        dismiss();
    }

    @Override // X.InterfaceC71999XEn
    public final void EPH(ListAdapter listAdapter) {
        this.A02 = listAdapter;
    }

    @Override // X.InterfaceC71999XEn
    public final void Ebn(CharSequence charSequence) {
        this.A01 = charSequence;
    }
}
