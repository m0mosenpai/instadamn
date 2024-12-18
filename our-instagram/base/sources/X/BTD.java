package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class BTD {
    public final int A00;
    public final MWE A01;
    public final C28939Cpn A02;
    public final List A03;
    public volatile C50882Vk A04;
    public volatile C78373f3 A05;
    public volatile C75803al A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTD) {
                BTD btd = (BTD) obj;
                if (this.A00 != btd.A00 || !C14360o3.A0K(this.A06, btd.A06) || !C14360o3.A0K(this.A05, btd.A05) || !C14360o3.A0K(this.A04, btd.A04) || !C14360o3.A0K(this.A03, btd.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Cpn, java.lang.Object] */
    public /* synthetic */ BTD(C75803al c75803al) {
        int andIncrement = C75793ak.A06.getAndIncrement();
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A00 = andIncrement;
        this.A06 = c75803al;
        this.A05 = null;
        this.A04 = null;
        this.A03 = A1E;
        this.A02 = new Object();
        this.A01 = new MWE();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = this.A00 * 31;
        int i2 = 0;
        if (this.A06 == null) {
            hashCode = 0;
        } else {
            hashCode = this.A06.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        if (this.A05 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = this.A05.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        if (this.A04 != null) {
            i2 = this.A04.hashCode();
        }
        return AbstractC166987dD.A0I(this.A03, (i4 + i2) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NestedLithoTreeState(id=");
        A1C.append(this.A00);
        A1C.append(", currentState=");
        A1C.append(this.A06);
        A1C.append(", currentResolveResult=");
        A1C.append(this.A05);
        A1C.append(AbstractC111324zv.A00(1407));
        A1C.append(this.A04);
        A1C.append(", pendingStateUpdates=");
        return AbstractC167017dG.A0o(this.A03, A1C);
    }
}
