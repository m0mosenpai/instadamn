package X;

import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.SvZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63901SvZ implements InterfaceC65333TiE {
    public final /* synthetic */ SettableFuture A00;
    public final /* synthetic */ String A01;

    public C63901SvZ(SettableFuture settableFuture, String str) {
        this.A01 = str;
        this.A00 = settableFuture;
    }

    @Override // X.InterfaceC65333TiE
    public final void CyN(List list, List list2, List list3, List list4) {
        ArrayList A1E = AbstractC166987dD.A1E();
        String str = this.A01;
        if (AbstractC001800i.A0u(NameAutofillData.A00, str)) {
            A1E.addAll(list);
        } else if (AbstractC001800i.A0u(TelephoneAutofillData.A01, str)) {
            A1E.addAll(list2);
        } else {
            C14360o3.A0B(str, 0);
            if (AddressAutofillData.A00.contains(str)) {
                A1E.addAll(list3);
            } else {
                A1E.addAll(list4);
            }
        }
        this.A00.set(A1E);
    }
}
