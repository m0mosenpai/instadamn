package X;

import com.facebook.odin.model.OdinContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3Ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73683Ru implements InterfaceC73623Ro {
    public final C73673Rt A00;
    public final String A01;
    public final List A02;

    public C73683Ru(C73673Rt c73673Rt, String str, List list) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A02 = list;
        this.A00 = c73673Rt;
    }

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        C73673Rt c73673Rt = this.A00;
        if (c73673Rt != null) {
            c73673Rt.A00();
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC73623Ro interfaceC73623Ro : this.A02) {
            C3SN ATr = interfaceC73623Ro.ATr(odinContext);
            if (c73673Rt != null) {
                c73673Rt.A03(AnonymousClass001.A0R("extracted_", interfaceC73623Ro.getId()), String.valueOf(ATr.A02));
            }
            if (ATr.A02) {
                arrayList.addAll((Collection) ATr.A00);
            }
        }
        if (c73673Rt != null) {
            c73673Rt.A04(true, null);
        }
        return new C3SN(arrayList, null, true);
    }

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return this.A01;
    }
}
