package X;

import java.util.Arrays;

/* renamed from: X.FyS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36214FyS implements InterfaceC66482zP {
    public final E90 A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(GUY.A00);

    public boolean equals(Object obj) {
        if ((obj instanceof AbstractC36214FyS) && C14360o3.A0K(this.A00, ((AbstractC36214FyS) obj).A00)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166987dD.A17(this.A01);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public AbstractC36214FyS(E90 e90) {
        this.A00 = e90;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
