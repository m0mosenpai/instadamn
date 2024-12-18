package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog;
import java.util.List;

/* renamed from: X.OMp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54844OMp {
    public DialogInterface.OnClickListener A00;
    public DialogInterface.OnClickListener A01;
    public DialogInterface.OnDismissListener A02;
    public InterfaceC58118Pph A03;
    public CharSequence A04;
    public CharSequence A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Context A0E;

    public C54844OMp(Context context) {
        C14360o3.A0B(context, 1);
        this.A0E = context;
        this.A07 = "";
        this.A05 = "";
        this.A04 = "";
        this.A08 = AbstractC166997dE.A0p(context, 2131968948);
        this.A06 = C05F.A00;
        this.A0C = true;
    }

    public final void A02(DialogInterface.OnClickListener onClickListener, String str) {
        C14360o3.A0B(str, 0);
        this.A08 = str;
        this.A00 = onClickListener;
    }

    public final void A03(DialogInterface.OnClickListener onClickListener, String str) {
        C14360o3.A0B(str, 0);
        this.A09 = str;
        this.A01 = onClickListener;
    }

    public final void A04(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        this.A03 = new P31(drawable);
    }

    public final void A05(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        this.A05 = charSequence;
    }

    public final void A06(String str) {
        C14360o3.A0B(str, 0);
        this.A07 = str;
    }

    public final Dialog A00() {
        Context context = this.A0E;
        String str = this.A07;
        boolean z = this.A0D;
        CharSequence charSequence = this.A05;
        List list = this.A0A;
        CharSequence charSequence2 = this.A04;
        String str2 = this.A08;
        DialogInterface.OnClickListener onClickListener = this.A00;
        String str3 = this.A09;
        return new IgdsPrismPromoDialog(context, onClickListener, this.A01, this.A02, this.A03, charSequence, charSequence2, this.A06, str, str2, str3, list, z, this.A0B, this.A0C).A00;
    }

    public final void A01() {
        C0fJ.A00(A00());
    }
}
