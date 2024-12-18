package X;

import com.facebook.rsys.groupexpansion.gen.GroupExpansionCompletedCallback;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import java.util.ArrayList;

/* renamed from: X.MzK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52015MzK extends GroupExpansionProxy {
    public final GroupExpansionProxy A00;

    @Override // com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy
    public final void expand(String str, String str2, ArrayList arrayList, ArrayList arrayList2, int i, int i2, GroupExpansionCompletedCallback groupExpansionCompletedCallback) {
        AbstractC167017dG.A1N(str, str2);
        AbstractC25229BEm.A1I(arrayList2, 3, groupExpansionCompletedCallback);
        this.A00.expand(str, str2, arrayList, arrayList2, i, i2, groupExpansionCompletedCallback);
    }

    public C52015MzK(GroupExpansionProxy groupExpansionProxy) {
        this.A00 = groupExpansionProxy;
    }
}
