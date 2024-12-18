package com.instagram.model.direct.messageid;

import X.C14360o3;
import X.C2EY;
import java.util.Arrays;
import kotlin.Deprecated;

/* loaded from: classes3.dex */
public final class DirectMessageIdentifier extends MessageIdentifier {
    public String A00;
    public final C2EY A01;
    public final String A02;

    public final DirectMessageIdentifier A01(DirectMessageIdentifier directMessageIdentifier) {
        C14360o3.A0B(directMessageIdentifier, 0);
        if (A02(directMessageIdentifier)) {
            String str = this.A02;
            if (str == null) {
                str = directMessageIdentifier.A02;
            }
            String str2 = this.A00;
            if (str2 == null) {
                str2 = directMessageIdentifier.A00;
            }
            C2EY c2ey = this.A01;
            if (c2ey == null) {
                c2ey = directMessageIdentifier.A01;
            }
            return new DirectMessageIdentifier(c2ey, str, str2);
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // com.instagram.model.direct.messageid.MessageIdentifier
    @Deprecated(message = "This method checks for strict equality. Use [DirectMessageIdentifier#identifySameMessage] to see if two identifiers refer to the same  message.")
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            DirectMessageIdentifier directMessageIdentifier = (DirectMessageIdentifier) obj;
            if (!C14360o3.A0K(this.A02, directMessageIdentifier.A02) || !C14360o3.A0K(this.A00, directMessageIdentifier.A00) || this.A01 != directMessageIdentifier.A01) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DirectMessageIdentifier(X.C2EY r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            if (r4 != 0) goto Lf
            if (r5 == 0) goto L11
            r0 = r5
        L5:
            r2.<init>(r0, r5)
            r2.A02 = r4
            r2.A00 = r5
            r2.A01 = r3
            return
        Lf:
            r0 = r4
            goto L5
        L11:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.direct.messageid.DirectMessageIdentifier.<init>(X.2EY, java.lang.String, java.lang.String):void");
    }

    public final boolean A02(DirectMessageIdentifier directMessageIdentifier) {
        if (directMessageIdentifier != null) {
            String str = this.A02;
            String str2 = this.A00;
            String str3 = directMessageIdentifier.A02;
            String str4 = directMessageIdentifier.A00;
            if (str != null && str.equals(str3)) {
                return true;
            }
            if (str2 != null && str2.equals(str4)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.instagram.model.direct.messageid.MessageIdentifier
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A01});
    }
}
