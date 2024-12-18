package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;

/* renamed from: X.Ioc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42314Ioc implements InterfaceC66482zP {
    public final MultiProductComponent A00;
    public final String A01;
    public final InterfaceC09390do A02;

    public C42314Ioc(MultiProductComponent multiProductComponent, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = multiProductComponent;
        this.A02 = C43205J8c.A00(this, 36);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Object obj2;
        C42314Ioc c42314Ioc = (C42314Ioc) obj;
        Object value = this.A02.getValue();
        if (c42314Ioc != null) {
            obj2 = c42314Ioc.A02.getValue();
        } else {
            obj2 = null;
        }
        return C14360o3.A0K(value, obj2);
    }
}
