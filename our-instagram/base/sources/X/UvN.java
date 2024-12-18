package X;

import android.util.SparseArray;
import com.facebook.R;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebookpay.form.cell.selector.CountrySelectorCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public final class UvN extends AbstractC129455t8 {
    public final AddressFormFieldsConfig A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UvN(Country country, AddressFormFieldsConfig addressFormFieldsConfig, String str, int i, boolean z, boolean z2) {
        super(i, z, z2);
        C14360o3.A0B(addressFormFieldsConfig, 6);
        SparseArray sparseArray = this.A04;
        sparseArray.put(9, str == null ? "" : str);
        sparseArray.put(10, country == null ? Country.A00(null, addressFormFieldsConfig.A00.A00.getCountry()) : country);
        this.A05.A0B(sparseArray.clone());
        this.A00 = addressFormFieldsConfig;
        A0K();
    }

    @Override // X.AbstractC129435t5
    public final boolean A0H() {
        Object A02 = this.A05.A02();
        if (A02 != null) {
            SparseArray sparseArray = (SparseArray) A02;
            SparseArray sparseArray2 = this.A04;
            Object obj = sparseArray2.get(10);
            if (obj != null) {
                String A00 = AbstractC58317Pt9.A00(28);
                String iSO3Country = ((LocaleMember) obj).A00.getISO3Country();
                C14360o3.A07(iSO3Country);
                Object obj2 = sparseArray.get(10);
                C14360o3.A0C(obj2, A00);
                String iSO3Country2 = ((LocaleMember) obj2).A00.getISO3Country();
                C14360o3.A07(iSO3Country2);
                if (iSO3Country.equals(iSO3Country2)) {
                    Object obj3 = sparseArray2.get(9);
                    Object obj4 = null;
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    Object obj5 = sparseArray.get(9);
                    if (obj5 instanceof String) {
                        obj4 = obj5;
                    }
                    if (C14360o3.A0K(obj3, obj4)) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AbstractC129455t8
    public final ImmutableList A0J() {
        Object A02 = this.A05.A02();
        if (A02 != null) {
            SparseArray sparseArray = (SparseArray) A02;
            Object obj = sparseArray.get(10);
            C14360o3.A0C(obj, AbstractC58317Pt9.A00(28));
            Country country = (Country) obj;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            if (C14360o3.A0K(country.A00.getCountry(), "US")) {
                C67664Uuw c67664Uuw = new C67664Uuw(9);
                ((AbstractC69334Vlg) c67664Uuw).A01 = R.id.zip_code_field;
                c67664Uuw.A03 = 2131954862;
                Object obj2 = sparseArray.get(9);
                C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
                c67664Uuw.A0B = (String) obj2;
                builder.add((Object) c67664Uuw.A00());
            }
            C67661Uut c67661Uut = new C67661Uut(country, AbstractC31173DnH.A0L(this.A00.A01));
            ((AbstractC69334Vlg) c67661Uut).A01 = R.id.country_field;
            c67661Uut.A00 = 2131954853;
            builder.add((Object) new CountrySelectorCellParams(c67661Uut));
            ImmutableList build = builder.build();
            C14360o3.A07(build);
            return build;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC129455t8
    public final void A0L(AbstractC129435t5 abstractC129435t5, Object obj, Object obj2) {
        if ((abstractC129435t5 instanceof C5t6) && !C14360o3.A0K(obj, obj2)) {
            A0K();
        }
    }
}
