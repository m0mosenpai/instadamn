package X;

import android.content.Context;

/* renamed from: X.Jzu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45214Jzu extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final Context A01;
    public final C47251KuO A02;
    public final EnumC46170Kc8 A03;
    public final Boolean A04;
    public final Integer A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45214Jzu) {
                C45214Jzu c45214Jzu = (C45214Jzu) obj;
                if (this.A00 != c45214Jzu.A00 || !C14360o3.A0K(this.A05, c45214Jzu.A05) || !C14360o3.A0K(this.A04, c45214Jzu.A04) || !C14360o3.A0K(this.A01, c45214Jzu.A01) || !C14360o3.A0K(this.A02, c45214Jzu.A02) || this.A06 != c45214Jzu.A06 || this.A03 != c45214Jzu.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC167007dF.A0D(this.A06, ((((((((this.A00 * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02)) * 31));
    }

    public C45214Jzu(Context context, C47251KuO c47251KuO, EnumC46170Kc8 enumC46170Kc8, Boolean bool, Integer num, int i, boolean z) {
        this.A00 = i;
        this.A05 = num;
        this.A04 = bool;
        this.A01 = context;
        this.A02 = c47251KuO;
        this.A06 = z;
        this.A03 = enumC46170Kc8;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
