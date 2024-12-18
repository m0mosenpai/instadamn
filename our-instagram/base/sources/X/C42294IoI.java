package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import java.util.Collections;
import java.util.List;

/* renamed from: X.IoI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42294IoI implements InterfaceC66482zP {
    public final MultiProductComponent A00;
    public final List A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "product_collection";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C42294IoI c42294IoI = (C42294IoI) obj;
        C14360o3.A0B(c42294IoI, 0);
        return C14360o3.A0K(this.A01, c42294IoI.A01);
    }

    public C42294IoI(MultiProductComponent multiProductComponent) {
        this.A00 = multiProductComponent;
        this.A01 = AbstractC166987dD.A1F(Collections.unmodifiableList(multiProductComponent.A03.A03));
    }
}
