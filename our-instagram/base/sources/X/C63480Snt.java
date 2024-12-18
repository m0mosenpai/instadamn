package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.Snt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63480Snt implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public C63480Snt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new C63480Snt(obj, i));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
            case 2:
            default:
                ((InterfaceC16660sJ) this.A01).invoke(String.valueOf(editable));
                return;
            case 3:
                C58771Q8d c58771Q8d = ((Q81) this.A01).A01;
                c58771Q8d.A02 = editable.toString();
                c58771Q8d.A06.A0A(null);
                return;
            case 4:
                ((C58765Q7u) this.A01).A01.A03(editable.toString());
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A00 == 0) {
            SearchView searchView = (SearchView) this.A01;
            Editable text = searchView.A0d.getText();
            searchView.A07 = text;
            boolean A1X = AbstractC31171DnF.A1X(text);
            SearchView.A03(searchView, A1X);
            boolean z = !A1X;
            int i4 = 8;
            if (searchView.A0C && !searchView.A08 && z) {
                searchView.A0a.setVisibility(8);
                i4 = 0;
            }
            searchView.A0c.setVisibility(i4);
            SearchView.A01(searchView);
            SearchView.A02(searchView);
            if (searchView.A04 != null && !TextUtils.equals(charSequence, searchView.A06)) {
                InterfaceC65175TfJ interfaceC65175TfJ = searchView.A04;
                String charSequence2 = charSequence.toString();
                C14360o3.A0B(charSequence2, 0);
                C58721Q4x c58721Q4x = ((C63541Sp9) interfaceC65175TfJ).A00.A01;
                if (c58721Q4x == null) {
                    C14360o3.A0F("adapter");
                    throw C00O.createAndThrow();
                }
                c58721Q4x.getFilter().filter(charSequence2);
            }
            searchView.A06 = charSequence.toString();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
