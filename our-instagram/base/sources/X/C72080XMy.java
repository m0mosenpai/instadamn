package X;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.XMy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72080XMy {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public ComponentName A04;
    public Context A05;
    public PersistableBundle A06;
    public UserHandle A07;
    public Y20 A08;
    public IconCompat A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public String A0D;
    public String A0E;
    public java.util.Set A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public Intent[] A0P;
    public Y3n[] A0Q;

    public static Y20 A00(ShortcutInfo shortcutInfo) {
        String string;
        if (Build.VERSION.SDK_INT >= 29) {
            if (shortcutInfo.getLocusId() == null) {
                return null;
            }
            return Y20.A00(shortcutInfo.getLocusId());
        }
        PersistableBundle extras = shortcutInfo.getExtras();
        if (extras == null || (string = extras.getString("extraLocusId")) == null) {
            return null;
        }
        return new Y20(string);
    }

    public final ShortcutInfo A01() {
        int length;
        String str;
        int length2;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.A05, this.A0D).setShortLabel(this.A0B).setIntents(this.A0P);
        IconCompat iconCompat = this.A09;
        if (iconCompat != null) {
            intents.setIcon(AbstractC58497PwQ.A00(this.A05, iconCompat));
        }
        if (!TextUtils.isEmpty(this.A0C)) {
            intents.setLongLabel(this.A0C);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            intents.setDisabledMessage(this.A0A);
        }
        ComponentName componentName = this.A04;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        java.util.Set<String> set = this.A0F;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.A02);
        PersistableBundle persistableBundle = this.A06;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Y3n[] y3nArr = this.A0Q;
            if (y3nArr != null && (length2 = y3nArr.length) > 0) {
                Person[] personArr = new Person[length2];
                int i2 = 0;
                do {
                    personArr[i2] = AbstractC72875Xq9.A00(this.A0Q[i2]);
                    i2++;
                } while (i2 < length2);
                intents.setPersons(personArr);
            }
            Y20 y20 = this.A08;
            if (y20 != null) {
                intents.setLocusId(y20.A01());
            }
            intents.setLongLived(this.A0N);
            if (i >= 33) {
                XN0.A00(intents, this.A01);
            }
        } else {
            PersistableBundle persistableBundle2 = this.A06;
            if (persistableBundle2 == null) {
                persistableBundle2 = new PersistableBundle();
                this.A06 = persistableBundle2;
            }
            Y3n[] y3nArr2 = this.A0Q;
            if (y3nArr2 != null && (length = y3nArr2.length) > 0) {
                persistableBundle2.putInt("extraPersonCount", length);
                int i3 = 0;
                while (true) {
                    Y3n[] y3nArr3 = this.A0Q;
                    if (i3 >= y3nArr3.length) {
                        break;
                    }
                    PersistableBundle persistableBundle3 = this.A06;
                    int i4 = i3 + 1;
                    String A0O = AnonymousClass001.A0O("extraPerson_", i4);
                    Y3n y3n = y3nArr3[i3];
                    PersistableBundle persistableBundle4 = new PersistableBundle();
                    CharSequence charSequence = y3n.A01;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle4.putString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                    persistableBundle4.putString("uri", y3n.A03);
                    persistableBundle4.putString("key", y3n.A02);
                    persistableBundle4.putBoolean("isBot", y3n.A04);
                    persistableBundle4.putBoolean("isImportant", y3n.A05);
                    persistableBundle3.putPersistableBundle(A0O, persistableBundle4);
                    i3 = i4;
                }
            }
            Y20 y202 = this.A08;
            if (y202 != null) {
                this.A06.putString("extraLocusId", y202.A00);
            }
            this.A06.putBoolean("extraLongLived", this.A0N);
            intents.setExtras(this.A06);
        }
        return intents.build();
    }
}
