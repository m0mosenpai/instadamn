package X;

import android.content.res.Resources;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.570, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass570 {
    public String A00;
    public String A01 = "";
    public String A02;
    public String A03;
    public boolean A04;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String A00(Resources resources) {
        int i;
        String str = this.A02;
        if (str != null) {
            switch (str.hashCode()) {
                case -726649920:
                    if (str.equals("undecrypted_encrypted_message")) {
                        return resources.getString(2131953200, this.A00);
                    }
                    break;
                case -631247455:
                    if (str.equals("decryption_failed")) {
                        i = 2131953198;
                        break;
                    }
                    break;
                case -576456558:
                    if (str.equals(AbstractC43591JPw.A00(428))) {
                        i = 2131953201;
                        break;
                    }
                    break;
                case 360948404:
                    if (str.equals("undiscovered_device")) {
                        i = 2131953202;
                        break;
                    }
                    break;
                case 1544803905:
                    if (str.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                        i = 2131953199;
                        break;
                    }
                    break;
            }
            return resources.getString(i);
        }
        return this.A01;
    }

    public AnonymousClass570(String str) {
        this.A02 = str;
    }

    public AnonymousClass570() {
    }
}
