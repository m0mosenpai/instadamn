package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import com.google.firebase.iid.zzm;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class RMT extends Q3U {
    public final /* synthetic */ C63151Sdy A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RMT(Looper looper, C63151Sdy c63151Sdy) {
        super(looper);
        this.A00 = c63151Sdy;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        String str2;
        String group;
        Bundle extras;
        C63151Sdy c63151Sdy = this.A00;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C61057ReW());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzm) {
                        c63151Sdy.A01 = (zzm) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c63151Sdy.A00 = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    action = intent2.getStringExtra("registration_id");
                    if (action == null) {
                        action = intent2.getStringExtra("unregistered");
                    }
                    if (action == null) {
                        String stringExtra = intent2.getStringExtra("error");
                        str = "FirebaseInstanceId";
                        if (stringExtra == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            str2 = MSZ.A0u("Unexpected response, no error or registration id ", valueOf, AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 49));
                        } else {
                            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                                String.valueOf(stringExtra);
                            }
                            if (stringExtra.startsWith("|")) {
                                String[] split = stringExtra.split("\\|");
                                if (split.length > 2 && "ID".equals(split[1])) {
                                    group = split[2];
                                    String str3 = split[3];
                                    if (str3.startsWith(":")) {
                                        str3 = str3.substring(1);
                                    }
                                    extras = intent2.putExtra("error", str3).getExtras();
                                } else {
                                    str2 = AbstractC58321PtD.A0w("Unexpected structured response ", stringExtra);
                                }
                            } else {
                                C005001p c005001p = c63151Sdy.A04;
                                synchronized (c005001p) {
                                    for (int i = 0; i < c005001p.size(); i++) {
                                        C63151Sdy.A01(intent2.getExtras(), c63151Sdy, (String) c005001p.A05(i));
                                    }
                                }
                                return;
                            }
                        }
                        android.util.Log.w(str, str2);
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(action);
                    if (matcher.matches()) {
                        group = matcher.group(1);
                        String group2 = matcher.group(2);
                        extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                    }
                    C63151Sdy.A01(extras, c63151Sdy, group);
                    return;
                }
                if (!android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                    return;
                }
                String.valueOf(action);
                return;
            }
        }
        str = "FirebaseInstanceId";
        str2 = "Dropping invalid message";
        android.util.Log.w(str, str2);
    }
}
