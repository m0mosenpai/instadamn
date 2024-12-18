package X;

import com.instagram.user.model.User;

/* renamed from: X.Wok, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71149Wok implements X8Y {
    public final long A00;
    public final long A01;
    public final User A02;
    public final EnumC53318Nhu A03;
    public final String A04;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("SelectedQuestion{displayTimestampMs=");
        sb.append(this.A00);
        sb.append(AbstractC111324zv.A00(282));
        sb.append(this.A01);
        sb.append(", questionBody='");
        sb.append(this.A04);
        sb.append("', user='");
        User user = this.A02;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("', questionSource=");
        return AbstractC58320PtC.A11(this.A03, sb);
    }

    public C71149Wok(User user, EnumC53318Nhu enumC53318Nhu, String str, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A04 = str;
        this.A02 = user;
        this.A03 = enumC53318Nhu;
    }
}
