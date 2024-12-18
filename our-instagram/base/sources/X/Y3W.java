package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import java.util.List;

/* loaded from: classes12.dex */
public final class Y3W {
    public android.net.Uri A00;
    public Bundle A01 = new Bundle();
    public String A02;
    public final long A03;
    public final Y3n A04;
    public final CharSequence A05;

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A00(android.os.Parcelable[] r19) {
        /*
            r9 = r19
            int r8 = r9.length
            java.util.ArrayList r7 = X.AbstractC25225BEi.A17(r8)
            r6 = 0
        L8:
            if (r6 >= r8) goto La9
            r5 = r9[r6]
            boolean r0 = r5 instanceof android.os.Bundle
            if (r0 == 0) goto La5
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r4 = "uri"
            java.lang.String r3 = "extras"
            java.lang.String r2 = "type"
            java.lang.String r11 = "sender"
            java.lang.String r12 = "sender_person"
            java.lang.String r13 = "person"
            java.lang.String r10 = "time"
            java.lang.String r1 = "text"
            r14 = 0
            boolean r0 = r5.containsKey(r1)     // Catch: java.lang.ClassCastException -> L9f
            if (r0 == 0) goto L9f
            boolean r0 = r5.containsKey(r10)     // Catch: java.lang.ClassCastException -> L9f
            if (r0 == 0) goto L9f
            boolean r0 = r5.containsKey(r13)     // Catch: java.lang.ClassCastException -> L9f
            if (r0 == 0) goto L74
            android.os.Bundle r0 = r5.getBundle(r13)     // Catch: java.lang.ClassCastException -> L9f
            X.Y3n r13 = X.Y3n.A00(r0)     // Catch: java.lang.ClassCastException -> L9f
        L3d:
            java.lang.CharSequence r11 = r5.getCharSequence(r1)     // Catch: java.lang.ClassCastException -> L9f
            long r0 = r5.getLong(r10)     // Catch: java.lang.ClassCastException -> L9f
            X.Y3W r10 = new X.Y3W     // Catch: java.lang.ClassCastException -> L9f
            r10.<init>(r13, r11, r0)     // Catch: java.lang.ClassCastException -> L9f
            boolean r0 = r5.containsKey(r2)     // Catch: java.lang.ClassCastException -> L9f
            if (r0 == 0) goto L64
            boolean r0 = r5.containsKey(r4)     // Catch: java.lang.ClassCastException -> L9f
            if (r0 == 0) goto L64
            java.lang.String r1 = r5.getString(r2)     // Catch: java.lang.ClassCastException -> L9f
            android.os.Parcelable r0 = r5.getParcelable(r4)     // Catch: java.lang.ClassCastException -> L9f
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.ClassCastException -> L9f
            r10.A02 = r1     // Catch: java.lang.ClassCastException -> L9f
            r10.A00 = r0     // Catch: java.lang.ClassCastException -> L9f
        L64:
            boolean r0 = r5.containsKey(r3)     // Catch: java.lang.ClassCastException -> L9f
            if (r0 == 0) goto La0
            android.os.Bundle r1 = r10.A01     // Catch: java.lang.ClassCastException -> L9f
            android.os.Bundle r0 = r5.getBundle(r3)     // Catch: java.lang.ClassCastException -> L9f
            r1.putAll(r0)     // Catch: java.lang.ClassCastException -> L9f
            goto La0
        L74:
            boolean r0 = r5.containsKey(r12)     // Catch: java.lang.ClassCastException -> L9f
            if (r0 == 0) goto L85
            android.os.Parcelable r0 = r5.getParcelable(r12)     // Catch: java.lang.ClassCastException -> L9f
            android.app.Person r0 = (android.app.Person) r0     // Catch: java.lang.ClassCastException -> L9f
            X.Y3n r13 = X.AbstractC72875Xq9.A01(r0)     // Catch: java.lang.ClassCastException -> L9f
            goto L3d
        L85:
            boolean r0 = r5.containsKey(r11)     // Catch: java.lang.ClassCastException -> L9f
            if (r0 == 0) goto L9d
            java.lang.CharSequence r15 = r5.getCharSequence(r11)     // Catch: java.lang.ClassCastException -> L9f
            r18 = 0
            X.Y3n r13 = new X.Y3n     // Catch: java.lang.ClassCastException -> L9f
            r16 = r14
            r17 = r14
            r19 = r18
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.ClassCastException -> L9f
            goto L3d
        L9d:
            r13 = r14
            goto L3d
        L9f:
            r10 = r14
        La0:
            if (r10 == 0) goto La5
            r7.add(r10)
        La5:
            int r6 = r6 + 1
            goto L8
        La9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y3W.A00(android.os.Parcelable[]):java.util.ArrayList");
    }

    public Y3W(Y3n y3n, CharSequence charSequence, long j) {
        this.A05 = charSequence;
        this.A03 = j;
        this.A04 = y3n;
    }

    public static Bundle[] A01(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Y3W y3w = (Y3W) list.get(i);
            Bundle bundle = new Bundle();
            CharSequence charSequence = y3w.A05;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", y3w.A03);
            Y3n y3n = y3w.A04;
            if (y3n != null) {
                bundle.putCharSequence("sender", y3n.A01);
                bundle.putParcelable("sender_person", AbstractC72875Xq9.A00(y3n));
            }
            String str = y3w.A02;
            if (str != null) {
                bundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            }
            android.net.Uri uri = y3w.A00;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            bundle.putBundle(Location.EXTRAS, y3w.A01);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
