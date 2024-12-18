package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.PwW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58503PwW implements Runnable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A00;
    public final /* synthetic */ File A01;

    public RunnableC58503PwW(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, File file) {
        this.A00 = shortcutInfoCompatSaverImpl;
        this.A01 = file;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.01p, java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() {
        ComponentName unflattenFromString;
        try {
            File file = this.A01;
            if ((!file.exists() || file.isDirectory() || file.delete()) && !file.exists()) {
                file.mkdirs();
            }
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.A00;
            File file2 = shortcutInfoCompatSaverImpl.A01;
            if ((!file2.exists() || file2.isDirectory() || file2.delete()) && !file2.exists()) {
                file2.mkdirs();
            }
            Map map = shortcutInfoCompatSaverImpl.A04;
            File file3 = shortcutInfoCompatSaverImpl.A02;
            Context context = shortcutInfoCompatSaverImpl.A00;
            ?? c005001p = new C005001p(0);
            try {
                FileInputStream fileInputStream = new FileInputStream(file3);
                try {
                    if (file3.exists()) {
                        XmlPullParser newPullParser = android.util.Xml.newPullParser();
                        newPullParser.setInput(fileInputStream, "UTF_8");
                        while (true) {
                            int next = newPullParser.next();
                            if (next == 1) {
                                break;
                            }
                            if (next == 2 && newPullParser.getName().equals("target") && newPullParser.getName().equals("target")) {
                                String A00 = AbstractC58492PwK.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, newPullParser);
                                String A002 = AbstractC58492PwK.A00("short_label", newPullParser);
                                if (!TextUtils.isEmpty(A00) && !TextUtils.isEmpty(A002)) {
                                    int parseInt = Integer.parseInt(AbstractC58492PwK.A00("rank", newPullParser));
                                    String A003 = AbstractC58492PwK.A00("long_label", newPullParser);
                                    String A004 = AbstractC58492PwK.A00("disabled_message", newPullParser);
                                    String A005 = AbstractC58492PwK.A00("component", newPullParser);
                                    if (TextUtils.isEmpty(A005)) {
                                        unflattenFromString = null;
                                    } else {
                                        unflattenFromString = ComponentName.unflattenFromString(A005);
                                    }
                                    String A006 = AbstractC58492PwK.A00("icon_resource_name", newPullParser);
                                    String A007 = AbstractC58492PwK.A00("icon_bitmap_path", newPullParser);
                                    ArrayList arrayList = new ArrayList();
                                    HashSet hashSet = new HashSet();
                                    while (true) {
                                        int next2 = newPullParser.next();
                                        if (next2 != 1) {
                                            if (next2 == 2) {
                                                String name = newPullParser.getName();
                                                if (!name.equals("intent")) {
                                                    if (name.equals("categories")) {
                                                        String A008 = AbstractC58492PwK.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, newPullParser);
                                                        if (!TextUtils.isEmpty(A008)) {
                                                            hashSet.add(A008);
                                                        }
                                                    }
                                                } else {
                                                    String A009 = AbstractC58492PwK.A00("action", newPullParser);
                                                    String A0010 = AbstractC58492PwK.A00("targetPackage", newPullParser);
                                                    String A0011 = AbstractC58492PwK.A00("targetClass", newPullParser);
                                                    if (A009 != null) {
                                                        Intent intent = new Intent(A009);
                                                        if (!TextUtils.isEmpty(A0010) && !TextUtils.isEmpty(A0011)) {
                                                            intent.setClassName(A0010, A0011);
                                                        }
                                                        arrayList.add(intent);
                                                    }
                                                }
                                            } else if (next2 == 3 && newPullParser.getName().equals("target")) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    C72081XMz c72081XMz = new C72081XMz(context, A00);
                                    C72080XMy c72080XMy = c72081XMz.A00;
                                    c72080XMy.A0B = A002;
                                    c72080XMy.A02 = parseInt;
                                    if (!TextUtils.isEmpty(A003)) {
                                        c72080XMy.A0C = A003;
                                    }
                                    if (!TextUtils.isEmpty(A004)) {
                                        c72080XMy.A0A = A004;
                                    }
                                    if (unflattenFromString != null) {
                                        c72080XMy.A04 = unflattenFromString;
                                    }
                                    if (!arrayList.isEmpty()) {
                                        c72080XMy.A0P = (Intent[]) arrayList.toArray(new Intent[0]);
                                    }
                                    if (!hashSet.isEmpty()) {
                                        C012504o c012504o = new C012504o(0);
                                        c012504o.addAll(hashSet);
                                        c72080XMy.A0F = c012504o;
                                    }
                                    C58495PwN c58495PwN = new C58495PwN(c72081XMz.A00(), A006, A007);
                                    c005001p.put(c58495PwN.A00.A0D, c58495PwN);
                                }
                            }
                        }
                    }
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                file3.delete();
                android.util.Log.e("ShortcutInfoCompatSaver", AnonymousClass001.A0g("Failed to load saved values from file ", file3.getAbsolutePath(), ". Old state removed, new added"), e);
            }
            map.putAll(c005001p);
            shortcutInfoCompatSaverImpl.A02(AbstractC31180DnO.A0n(map));
        } catch (Exception e2) {
            android.util.Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e2);
        }
    }
}
