package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.CjJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28578CjJ implements InputFilter {
    public final /* synthetic */ InterfaceC16620sF A00;

    public C28578CjJ(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = interfaceC16620sF;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String obj = spanned.toString();
        StringBuilder sb = new StringBuilder(obj);
        sb.replace(i3, i4, charSequence.toString());
        if (AbstractC166987dD.A1a(this.A00.invoke(obj, AbstractC166987dD.A19(sb)))) {
            return null;
        }
        return spanned.subSequence(i3, i4);
    }
}
