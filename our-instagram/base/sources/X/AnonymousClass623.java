package X;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.623, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass623 {
    public final Context A00;
    public final Map A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.StringBuilder, java.lang.Object] */
    public final LinkedHashSet A00(String str, String str2) {
        ArrayList<C09530e4> arrayList;
        String str3;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        AnonymousClass621[] anonymousClass621Arr = (AnonymousClass621[]) this.A01.get(AbstractC225179wg.A00(str2));
        if (anonymousClass621Arr != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AnonymousClass621 anonymousClass621 : anonymousClass621Arr) {
                String str4 = anonymousClass621.A00;
                String packageName = this.A00.getPackageName();
                C14360o3.A07(packageName);
                boolean z = false;
                if (!C14360o3.A0K(str4, packageName) && ((!packageName.equals("com.facebook.katana") || !C14360o3.A0K(str4, "com.facebook.wakizashi")) && (!packageName.equals("com.facebook.wakizashi") || !C14360o3.A0K(str4, "com.facebook.katana")))) {
                    z = true;
                }
                if (z) {
                    arrayList2.add(anonymousClass621);
                }
            }
            arrayList = new ArrayList(AbstractC06950Ym.A1E(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str5 = ((AnonymousClass621) it.next()).A00;
                ?? sb = new StringBuilder();
                sb.append("content://");
                sb.append(str5);
                sb.append(".ShareKey/");
                sb.append(str2);
                sb.append('/');
                sb.append(str);
                try {
                    sb = AbstractC08820cl.A03(sb.toString());
                } catch (SecurityException unused) {
                }
                if (sb != 0) {
                    arrayList.add(new C09530e4(str5, sb));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        } else {
            arrayList = null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (arrayList != null) {
            for (C09530e4 c09530e4 : arrayList) {
                String str6 = (String) c09530e4.A00;
                try {
                    Cursor A01 = C0fI.A01(this.A00.getContentResolver(), (android.net.Uri) c09530e4.A01, null, null, null, null, -1354073294);
                    boolean z2 = true;
                    if (A01 == null || !A01.moveToFirst()) {
                        z2 = false;
                    }
                    if (z2) {
                        str3 = A01.getString(0);
                    } else {
                        str3 = null;
                    }
                    if (A01 != null) {
                        A01.close();
                    }
                } catch (SecurityException unused2) {
                    str3 = null;
                }
                if (str3 != null) {
                    linkedHashSet.add(new C50679MYx(str3, str6, 0));
                }
            }
        }
        return linkedHashSet;
    }

    public AnonymousClass623(Context context, Map map) {
        this.A00 = context;
        this.A01 = map;
    }
}
