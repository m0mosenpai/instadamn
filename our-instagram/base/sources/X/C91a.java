package X;

import com.facebook.msys.mca.MailboxCallback;
import java.util.HashMap;

/* renamed from: X.91a, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C91a extends C0T6 {
    public final MailboxCallback A00;
    public final C132515ya A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final HashMap A05;

    public C91a(MailboxCallback mailboxCallback, C132515ya c132515ya, String str, String str2, String str3, HashMap hashMap) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = hashMap;
        this.A01 = c132515ya;
        this.A00 = mailboxCallback;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C91a) {
                C91a c91a = (C91a) obj;
                if (!C14360o3.A0K(this.A02, c91a.A02) || !C14360o3.A0K(this.A03, c91a.A03) || !C14360o3.A0K(this.A04, c91a.A04) || !C14360o3.A0K(this.A05, c91a.A05) || !C14360o3.A0K(this.A01, c91a.A01) || !C14360o3.A0K(this.A00, c91a.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31;
        HashMap hashMap = this.A05;
        int hashCode2 = (hashCode + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        C132515ya c132515ya = this.A01;
        int hashCode3 = (hashCode2 + (c132515ya == null ? 0 : c132515ya.hashCode())) * 31;
        MailboxCallback mailboxCallback = this.A00;
        return hashCode3 + (mailboxCallback != null ? mailboxCallback.hashCode() : 0);
    }
}
