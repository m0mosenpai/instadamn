package X;

import android.os.Bundle;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AWq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23345AWq implements C83W, BCI {
    public final List A00 = AbstractC166987dD.A1E();

    @Override // X.C83W
    public final void CMb() {
        AbstractC167027dH.A15(C05F.A01, this.A00, AbstractC167007dF.A0o("serviceType", 38));
    }

    @Override // X.C83W
    public final void EhG(C83X c83x, List list, List list2, List list3) {
        C14360o3.A0B(c83x, 0);
        this.A00.add(AbstractC61636Rr0.A00(AbstractC167007dF.A0o("serviceType", 38), AbstractC167027dH.A0Y(C05F.A00), AbstractC167007dF.A0o("autoInstructionType", c83x.ordinal()), AbstractC166987dD.A1L(IgReactMediaPickerNativeModule.WIDTH, list2), AbstractC166987dD.A1L(IgReactMediaPickerNativeModule.HEIGHT, list3)));
    }

    @Override // X.C83W
    public final void El0(String str) {
        C14360o3.A0B(str, 0);
        AbstractC167027dH.A14("token", str, this.A00, AbstractC167007dF.A0o("serviceType", 38), AbstractC167027dH.A0Y(C05F.A0C));
    }

    @Override // X.C83W
    public final void El1(String str) {
        C14360o3.A0B(str, 0);
        AbstractC167027dH.A14("text", str, this.A00, AbstractC167007dF.A0o("serviceType", 38), AbstractC167027dH.A0Y(C05F.A0N));
    }

    @Override // X.BCI
    public final List Epm(Bundle bundle) {
        List list = this.A00;
        ArrayList A0U = AbstractC001800i.A0U(list);
        list.clear();
        return A0U;
    }
}
