package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* loaded from: classes6.dex */
public final class E8Z extends C0T6 implements InterfaceC66482zP {
    public final String A00 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E8Z) {
                E8Z e8z = (E8Z) obj;
                if (this.A01 != e8z.A01 || !C14360o3.A0K(this.A00, e8z.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public E8Z(boolean z) {
        this.A01 = z;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC25225BEi.A08(this.A01));
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
