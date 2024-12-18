package X;

import com.instagram.direct.model.messaginguser.MessagingUser;

/* renamed from: X.7SW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SW extends AbstractC162707Qh {
    public final MessagingUser A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7SW) {
                C7SW c7sw = (C7SW) obj;
                if (!C14360o3.A0K(this.A00, c7sw.A00) || !C14360o3.A0K(this.A01, c7sw.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        String str = this.A01;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Visible(senderUser=");
        sb.append(this.A00);
        sb.append(", primaryName=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C7SW(MessagingUser messagingUser, String str) {
        this.A00 = messagingUser;
        this.A01 = str;
    }
}
