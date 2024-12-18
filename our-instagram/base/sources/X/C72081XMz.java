package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.XMz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72081XMz {
    public final C72080XMy A00;

    public final C72080XMy A00() {
        C72080XMy c72080XMy = this.A00;
        if (!TextUtils.isEmpty(c72080XMy.A0B)) {
            Intent[] intentArr = c72080XMy.A0P;
            if (intentArr != null && intentArr.length != 0) {
                return c72080XMy;
            }
            throw new IllegalArgumentException(AbstractC58317Pt9.A00(623));
        }
        throw new IllegalArgumentException(AbstractC58317Pt9.A00(622));
    }

    public C72081XMz(Context context, ShortcutInfo shortcutInfo) {
        Y3n[] y3nArr;
        C72080XMy c72080XMy = new C72080XMy();
        this.A00 = c72080XMy;
        c72080XMy.A05 = context;
        c72080XMy.A0D = shortcutInfo.getId();
        c72080XMy.A0E = shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        c72080XMy.A0P = (Intent[]) Arrays.copyOf(intents, intents.length);
        c72080XMy.A04 = shortcutInfo.getActivity();
        c72080XMy.A0B = shortcutInfo.getShortLabel();
        c72080XMy.A0C = shortcutInfo.getLongLabel();
        c72080XMy.A0A = shortcutInfo.getDisabledMessage();
        c72080XMy.A00 = shortcutInfo.getDisabledReason();
        c72080XMy.A0F = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        if (extras != null && extras.containsKey("extraPersonCount")) {
            int i = extras.getInt("extraPersonCount");
            y3nArr = new Y3n[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                PersistableBundle persistableBundle = extras.getPersistableBundle(AnonymousClass001.A0O("extraPerson_", i3));
                y3nArr[i2] = new Y3n(null, persistableBundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), persistableBundle.getString("key"), persistableBundle.getString("uri"), persistableBundle.getBoolean("isBot"), persistableBundle.getBoolean("isImportant"));
                i2 = i3;
            }
        } else {
            y3nArr = null;
        }
        c72080XMy.A0Q = y3nArr;
        c72080XMy.A07 = shortcutInfo.getUserHandle();
        c72080XMy.A03 = shortcutInfo.getLastChangedTimestamp();
        if (Build.VERSION.SDK_INT >= 30) {
            c72080XMy.A0I = shortcutInfo.isCached();
        }
        c72080XMy.A0K = shortcutInfo.isDynamic();
        c72080XMy.A0O = shortcutInfo.isPinned();
        c72080XMy.A0J = shortcutInfo.isDeclaredInManifest();
        c72080XMy.A0M = shortcutInfo.isImmutable();
        c72080XMy.A0L = shortcutInfo.isEnabled();
        c72080XMy.A0G = shortcutInfo.hasKeyFieldsOnly();
        c72080XMy.A08 = C72080XMy.A00(shortcutInfo);
        c72080XMy.A02 = shortcutInfo.getRank();
        c72080XMy.A06 = shortcutInfo.getExtras();
    }

    public C72081XMz(C72080XMy c72080XMy) {
        C72080XMy c72080XMy2 = new C72080XMy();
        this.A00 = c72080XMy2;
        c72080XMy2.A05 = c72080XMy.A05;
        c72080XMy2.A0D = c72080XMy.A0D;
        c72080XMy2.A0E = c72080XMy.A0E;
        Intent[] intentArr = c72080XMy.A0P;
        c72080XMy2.A0P = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
        c72080XMy2.A04 = c72080XMy.A04;
        c72080XMy2.A0B = c72080XMy.A0B;
        c72080XMy2.A0C = c72080XMy.A0C;
        c72080XMy2.A0A = c72080XMy.A0A;
        c72080XMy2.A00 = c72080XMy.A00;
        c72080XMy2.A09 = c72080XMy.A09;
        c72080XMy2.A0H = c72080XMy.A0H;
        c72080XMy2.A07 = c72080XMy.A07;
        c72080XMy2.A03 = c72080XMy.A03;
        c72080XMy2.A0I = c72080XMy.A0I;
        c72080XMy2.A0K = c72080XMy.A0K;
        c72080XMy2.A0O = c72080XMy.A0O;
        c72080XMy2.A0J = c72080XMy.A0J;
        c72080XMy2.A0M = c72080XMy.A0M;
        c72080XMy2.A0L = c72080XMy.A0L;
        c72080XMy2.A08 = c72080XMy.A08;
        c72080XMy2.A0N = c72080XMy.A0N;
        c72080XMy2.A0G = c72080XMy.A0G;
        c72080XMy2.A02 = c72080XMy.A02;
        Y3n[] y3nArr = c72080XMy.A0Q;
        if (y3nArr != null) {
            c72080XMy2.A0Q = (Y3n[]) Arrays.copyOf(y3nArr, y3nArr.length);
        }
        java.util.Set set = c72080XMy.A0F;
        if (set != null) {
            c72080XMy2.A0F = new HashSet(set);
        }
        PersistableBundle persistableBundle = c72080XMy.A06;
        if (persistableBundle != null) {
            c72080XMy2.A06 = persistableBundle;
        }
        c72080XMy2.A01 = c72080XMy.A01;
    }

    public C72081XMz(Context context, String str) {
        C72080XMy c72080XMy = new C72080XMy();
        this.A00 = c72080XMy;
        c72080XMy.A05 = context;
        c72080XMy.A0D = str;
    }
}
