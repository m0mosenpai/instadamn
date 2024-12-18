package X;

import android.content.Intent;

/* renamed from: X.3JH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3JH extends C1KO {
    public Intent A00;

    @Override // X.C1KO, X.C1KP
    public final String A00() {
        return "app foregrounded";
    }

    @Override // X.C1KO
    public final String toString() {
        StringBuilder sb;
        String str;
        String str2 = this.A01;
        if (C14360o3.A0K(str2, "cold_start")) {
            sb = new StringBuilder();
            str = "Cold Start at ";
        } else {
            sb = new StringBuilder();
            sb.append("App foregrounded on  ");
            sb.append(str2);
            str = " at ";
        }
        sb.append(str);
        sb.append(((C1KP) this).A00);
        return sb.toString();
    }
}
