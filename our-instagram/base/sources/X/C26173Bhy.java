package X;

import java.util.List;

/* renamed from: X.Bhy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26173Bhy extends C0T6 implements InterfaceC66482zP {
    public final C38686GzR A00;
    public final C26069Bfx A01;
    public final Integer A02;
    public final List A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26173Bhy) {
                C26173Bhy c26173Bhy = (C26173Bhy) obj;
                if (this.A02 != c26173Bhy.A02 || !C14360o3.A0K(this.A03, c26173Bhy.A03) || !C14360o3.A0K(this.A01, c26173Bhy.A01) || !C14360o3.A0K(this.A00, c26173Bhy.A00) || this.A04 != c26173Bhy.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str;
        C26069Bfx c26069Bfx = this.A01;
        if (c26069Bfx == null || (str = c26069Bfx.A01) == null) {
            return "";
        }
        return str;
    }

    public final int hashCode() {
        Integer num = this.A02;
        return AbstractC166987dD.A0K(this.A04, (((AbstractC166997dE.A0J(this.A03, AbstractC25230BEn.A0C(num, AbstractC68481VSm.A00(num)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00)) * 31);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C26173Bhy c26173Bhy = (C26173Bhy) obj;
        C14360o3.A0B(c26173Bhy, 0);
        return C14360o3.A0K(this.A03, c26173Bhy.A03);
    }

    public C26173Bhy(C38686GzR c38686GzR, C26069Bfx c26069Bfx, Integer num, List list, boolean z) {
        this.A02 = num;
        this.A03 = list;
        this.A01 = c26069Bfx;
        this.A00 = c38686GzR;
        this.A04 = z;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SuggestedPromptPillsModel(entityType=");
        Integer num = this.A02;
        if (num != null) {
            str = AbstractC68481VSm.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", prompts=");
        A1C.append(this.A03);
        A1C.append(", responseToPersistExtras=");
        A1C.append(this.A01);
        A1C.append(", searchPluginResponse=");
        A1C.append(this.A00);
        A1C.append(", shouldRemoveRedundantBottomPadding=");
        return AbstractC25236BEt.A0a(A1C, this.A04);
    }
}
