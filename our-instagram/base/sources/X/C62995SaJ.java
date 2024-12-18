package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.SaJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62995SaJ {
    public final int A00;
    public final int A01;
    public final Class A02;

    public static void A00(C63194Sew c63194Sew, Class cls, int i) {
        c63194Sew.A03(new C62995SaJ(cls, i, 0));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C62995SaJ)) {
            return false;
        }
        C62995SaJ c62995SaJ = (C62995SaJ) obj;
        if (this.A02 != c62995SaJ.A02 || this.A01 != c62995SaJ.A01 || this.A00 != c62995SaJ.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.A02.hashCode() ^ 1000003) * 1000003) ^ this.A01) * 1000003) ^ this.A00;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A0s = AbstractC58318PtA.A0s("Dependency{anInterface=");
        A0s.append(this.A02);
        A0s.append(", type=");
        if (this.A01 == 1) {
            str = "required";
        } else {
            str = "set";
        }
        A0s.append(str);
        A0s.append(", injection=");
        if (this.A00 != 0) {
            str2 = "provider";
        } else {
            str2 = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
        }
        return AbstractC50523MSb.A0W(str2, A0s);
    }

    public C62995SaJ(Class cls, int i, int i2) {
        this.A02 = cls;
        this.A01 = i;
        this.A00 = i2;
    }
}
