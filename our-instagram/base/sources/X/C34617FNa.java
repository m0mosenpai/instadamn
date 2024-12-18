package X;

import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

/* renamed from: X.FNa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34617FNa {
    public C34953Fad A00;
    public String A01;
    public boolean A02 = false;
    public final TextWatcher A03 = new Em2(this, 14);
    public final AutoCompleteTextView A04;
    public final ImageView A05;

    public C34617FNa(AutoCompleteTextView autoCompleteTextView, ImageView imageView, AbstractC59962oe abstractC59962oe, AbstractC12990ll abstractC12990ll, EnumC31713DwI enumC31713DwI) {
        this.A04 = autoCompleteTextView;
        this.A05 = imageView;
        this.A00 = new C34953Fad(abstractC59962oe.getActivity(), autoCompleteTextView, abstractC12990ll, enumC31713DwI);
    }
}
