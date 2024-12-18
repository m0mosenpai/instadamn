package X;

import java.util.List;

/* renamed from: X.MwE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51870MwE extends C0T6 implements InterfaceC57855PlL {
    public final String A00;
    public final List A01;

    public C51870MwE(List list, String str) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51870MwE) {
                C51870MwE c51870MwE = (C51870MwE) obj;
                if (!C14360o3.A0K(this.A01, c51870MwE.A01) || !C14360o3.A0K(this.A00, c51870MwE.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallJoiningStateModel(callTargetAvatarUrls=");
        A1C.append(this.A01);
        A1C.append(", callTarget=");
        return AbstractC25236BEt.A0Y(this.A00, A1C);
    }
}
