package com.instagram.wellbeing.livechat;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.C3SG;
import X.C57120PVj;
import X.C57121PVk;
import java.util.ArrayList;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes9.dex */
public final class LiveChatNonceList extends C0T6 {
    public final ArrayList A00;
    public static final Companion Companion = new Object();
    public static final C3R9[] A01 = {new C3SG(C57120PVj.A00)};

    /* loaded from: classes9.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C57121PVk.A00;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LiveChatNonceList) && C14360o3.A0K(this.A00, ((LiveChatNonceList) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public LiveChatNonceList(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LiveChatNonceList(liveChatNonceList=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public /* synthetic */ LiveChatNonceList(ArrayList arrayList, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(C57121PVk.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = arrayList;
    }
}
