package X;

import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.FQd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34692FQd {
    public FQV A00;
    public EHO A01;
    public String A02;
    public boolean A03 = false;
    public final TextWatcher A04 = new Em2(this, 15);
    public final AutoCompleteTextView A05;
    public final ImageView A06;
    public final TextView A07;
    public final AbstractC59962oe A08;
    public final AbstractC12990ll A09;
    public final EnumC31713DwI A0A;

    public final String A00() {
        FQV fqv = this.A00;
        fqv.getClass();
        if (fqv.A04 == null) {
            return "";
        }
        return AbstractC35259Fgt.A00(this.A00.A04.A00(), AbstractC13880nE.A0J(this.A05));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.FQV] */
    public C34692FQd(AutoCompleteTextView autoCompleteTextView, ImageView imageView, TextView textView, AbstractC59962oe abstractC59962oe, AbstractC12990ll abstractC12990ll, CountryCodeData countryCodeData, EnumC31713DwI enumC31713DwI) {
        this.A09 = abstractC12990ll;
        this.A05 = autoCompleteTextView;
        this.A06 = imageView;
        this.A0A = enumC31713DwI;
        this.A07 = textView;
        this.A08 = abstractC59962oe;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        ?? obj = new Object();
        obj.A00 = requireActivity;
        obj.A01 = autoCompleteTextView;
        obj.A02 = textView;
        obj.A05 = enumC31713DwI;
        obj.A03 = abstractC12990ll;
        if (countryCodeData == null) {
            obj.A04 = AnonymousClass780.A00(requireActivity);
        } else {
            obj.A04 = countryCodeData;
        }
        this.A00 = obj;
    }
}
