package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.YCo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73419YCo implements InterfaceC73605YNu {
    public final InterfaceC73605YNu[] A00;
    public final Xl6 A01;
    public volatile Object[] A02;

    @Override // X.InterfaceC73605YNu
    public final Object get(Object obj) {
        boolean z;
        Object obj2;
        Object[] objArr = this.A02;
        Object[] objArr2 = new Object[2];
        objArr2[0] = this.A00[0].get(obj);
        if (objArr != null) {
            Object obj3 = objArr2[0];
            Object obj4 = objArr[0];
            if (obj3 != null ? obj3.equals(obj4) : obj3 == obj4) {
                return objArr[1];
            }
        }
        switch (((YDI) this.A01.A00).A00) {
            case 0:
            case 8:
                z = true;
                obj2 = Boolean.valueOf(z);
                break;
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                z = false;
                obj2 = Boolean.valueOf(z);
                break;
            case 2:
            case 3:
                obj2 = 0;
                break;
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj2 = "";
                break;
        }
        objArr2[1] = obj2;
        this.A02 = objArr2;
        return obj2;
    }

    public C73419YCo(Xl6 xl6, InterfaceC73605YNu[] interfaceC73605YNuArr) {
        this.A00 = interfaceC73605YNuArr;
        this.A01 = xl6;
    }
}
