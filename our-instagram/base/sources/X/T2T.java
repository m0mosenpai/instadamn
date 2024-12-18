package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.iabadscontext.DisclaimerBodyUrlRanges;
import com.facebook.iabadscontext.DisclaimerText;
import java.util.List;

/* loaded from: classes10.dex */
public final class T2T implements InterfaceC65619ToA {
    public final int A00;
    public final int A01;
    public final DisclaimerBodyUrlRanges A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC65619ToA
    public final int AtZ() {
        return this.A00;
    }

    @Override // X.InterfaceC65619ToA
    public final int Atd() {
        return this.A01;
    }

    @Override // X.InterfaceC65619ToA
    public final String getDescription() {
        return this.A03;
    }

    @Override // X.InterfaceC65619ToA
    public final String getText() {
        return this.A04;
    }

    public T2T(Context context, DisclaimerText disclaimerText) {
        int i;
        String string;
        List list = disclaimerText.A01;
        DisclaimerBodyUrlRanges disclaimerBodyUrlRanges = list != null ? (DisclaimerBodyUrlRanges) AbstractC001800i.A0J(list) : null;
        this.A02 = disclaimerBodyUrlRanges;
        if (disclaimerBodyUrlRanges != null) {
            i = disclaimerBodyUrlRanges.A01;
        } else {
            i = 0;
        }
        this.A00 = i;
        this.A01 = i + (disclaimerBodyUrlRanges != null ? disclaimerBodyUrlRanges.A00 : 0);
        String str = disclaimerText.A00;
        String str2 = "";
        this.A04 = str == null ? "" : str;
        if (context != null && (string = context.getString(R.string.res_0x7f13007e_name_removed)) != null) {
            str2 = string;
        }
        this.A03 = str2;
    }
}
