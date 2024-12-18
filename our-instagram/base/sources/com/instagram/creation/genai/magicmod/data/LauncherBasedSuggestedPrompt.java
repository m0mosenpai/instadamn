package com.instagram.creation.genai.magicmod.data;

import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.C71738X0d;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class LauncherBasedSuggestedPrompt extends C0T6 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71738X0d.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LauncherBasedSuggestedPrompt) {
                LauncherBasedSuggestedPrompt launcherBasedSuggestedPrompt = (LauncherBasedSuggestedPrompt) obj;
                if (!C14360o3.A0K(this.A01, launcherBasedSuggestedPrompt.A01) || !C14360o3.A0K(this.A00, launcherBasedSuggestedPrompt.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ LauncherBasedSuggestedPrompt(String str, String str2, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(C71738X0d.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A01 = str;
        if ((i & 2) != 0) {
            this.A00 = str2;
        }
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + AbstractC167017dG.A0O(this.A00);
    }
}
