package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fbpay.w3c.Address;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Tcp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65060Tcp extends C0YY implements InterfaceC16660sJ {
    public static final C65060Tcp A00 = new C65060Tcp();

    public C65060Tcp() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        C62713SNc c62713SNc = (C62713SNc) obj;
        C14360o3.A0B(c62713SNc, 0);
        ImmutableList immutableList = c62713SNc.A01;
        if (immutableList != null) {
            arrayList = AbstractC167017dG.A0q(immutableList);
            Iterator<E> it = immutableList.iterator();
            while (it.hasNext()) {
                C2JS A0l = AbstractC25225BEi.A0l(it);
                arrayList.add(new Address(A0l.A09("care_of"), A0l.A0A("city_name"), null, A0l.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID), A0l.A0C("state_name"), A0l.getOptionalStringField(7, "street1"), A0l.A0D("street2"), A0l.A0B("postal_code")));
            }
        } else {
            arrayList = null;
        }
        C14360o3.A0A(arrayList);
        return arrayList;
    }
}
