package com.instagram.wellbeing.livechat;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC68612VXn;
import X.AnonymousClass001;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.C57120PVj;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes9.dex */
public final class LiveChatNonce extends C0T6 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    /* loaded from: classes9.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C57120PVj.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LiveChatNonce) {
                LiveChatNonce liveChatNonce = (LiveChatNonce) obj;
                if (!C14360o3.A0K(this.A02, liveChatNonce.A02) || !C14360o3.A0K(this.A00, liveChatNonce.A00) || !C14360o3.A0K(this.A01, liveChatNonce.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A14("LiveChatNonce(userId=", this.A02, ", nonce=", this.A00, ", supportUid=", this.A01, ')');
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public LiveChatNonce(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public /* synthetic */ LiveChatNonce(String str, String str2, String str3, int i) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C57120PVj.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
