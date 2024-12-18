package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: X.0g3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0g3 {
    public static C0g3 A09;
    public final Integer[] A07;
    public boolean A00 = false;
    public final BitSet A04 = new BitSet(103);
    public final BitSet A03 = new BitSet(103);
    public final BitSet A02 = new BitSet(103);
    public final java.util.Set A05 = new HashSet();
    public final String[] A08 = new String[103];
    public final C09910fs[] A06 = new C09910fs[103];
    public final ArrayList A01 = new ArrayList();

    public final synchronized Integer A01(int i) {
        Integer num;
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        if (z) {
            num = this.A07[i];
        } else {
            num = C05F.A01;
        }
        return num;
    }

    public final synchronized void A03(int i, Integer num) {
        if (AbstractC10100gN.A01(i)) {
            Integer[] numArr = this.A07;
            if (numArr[i] != num) {
                numArr[i] = num;
                Iterator it = this.A01.iterator();
                while (it.hasNext()) {
                    C0g2 c0g2 = (C0g2) it.next();
                    c0g2.A01.execute(new C0g0(c0g2, num, AbstractC09930fu.getModuleName(i)));
                }
                if (C0K8.A01.isLoggable(3)) {
                    AbstractC09930fu.getModuleName(i);
                }
            }
        }
    }

    public final synchronized void A04(C0g4 c0g4, Executor executor) {
        C0g2 c0g2 = new C0g2(c0g4, executor);
        this.A01.add(c0g2);
        int i = 0;
        do {
            String moduleName = AbstractC09930fu.getModuleName(i);
            Integer[] numArr = this.A07;
            if (numArr[i] != C05F.A00) {
                c0g2.A01.execute(new C0g0(c0g2, numArr[i], moduleName));
            }
            if (this.A04.get(i)) {
                c0g2.A01.execute(new C0g1(c0g2, moduleName));
            }
            i++;
        } while (i < 103);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0071. Please report as an issue. */
    public final synchronized boolean A06(Context context) {
        boolean z;
        z = true;
        if (!this.A00) {
            if (!C09890fq.A00(context)) {
                this.A00 = true;
            } else {
                try {
                    AssetManager assets = context.getAssets();
                    try {
                        JsonReader jsonReader = new JsonReader(new InputStreamReader(assets.open("app_modules.json"), ReactWebViewManager.HTML_ENCODING));
                        try {
                            jsonReader.beginObject();
                            ArrayList arrayList = null;
                            ArrayList arrayList2 = null;
                            while (jsonReader.hasNext()) {
                                String nextName = jsonReader.nextName();
                                if (C14360o3.A0K(nextName, "downloadable")) {
                                    new Object();
                                    arrayList = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext() && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                                        jsonReader.beginObject();
                                        String str = null;
                                        String str2 = null;
                                        Boolean bool = null;
                                        Boolean bool2 = null;
                                        while (jsonReader.hasNext()) {
                                            String nextName2 = jsonReader.nextName();
                                            if (nextName2 != null) {
                                                switch (nextName2.hashCode()) {
                                                    case 3195150:
                                                        if (!nextName2.equals("hash")) {
                                                            break;
                                                        } else {
                                                            str2 = jsonReader.nextString();
                                                        }
                                                    case 3373707:
                                                        if (!nextName2.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                                                            break;
                                                        } else {
                                                            str = jsonReader.nextString();
                                                        }
                                                    case 270940796:
                                                        if (!nextName2.equals("disabled")) {
                                                            break;
                                                        } else {
                                                            bool = Boolean.valueOf(jsonReader.nextBoolean());
                                                        }
                                                    case 1385644488:
                                                        if (!nextName2.equals("requires_native")) {
                                                            break;
                                                        } else {
                                                            bool2 = Boolean.valueOf(jsonReader.nextBoolean());
                                                        }
                                                }
                                            }
                                            throw new RuntimeException(AnonymousClass001.A0R("unknown key ", nextName2));
                                        }
                                        jsonReader.endObject();
                                        if (str != null && str2 != null && bool != null && bool2 != null) {
                                            arrayList.add(new C19400xQ(str, str2, bool.booleanValue(), bool2.booleanValue()));
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                if (C14360o3.A0K(nextName, "built_in")) {
                                    new Object();
                                    arrayList2 = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext() && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                                        jsonReader.beginObject();
                                        String str3 = null;
                                        Boolean bool3 = null;
                                        while (jsonReader.hasNext()) {
                                            String nextName3 = jsonReader.nextName();
                                            if (C14360o3.A0K(nextName3, PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                                                str3 = jsonReader.nextString();
                                            } else if (C14360o3.A0K(nextName3, "requires_native")) {
                                                bool3 = Boolean.valueOf(jsonReader.nextBoolean());
                                            } else {
                                                throw new RuntimeException(AnonymousClass001.A0R("unknown key ", nextName3));
                                            }
                                        }
                                        jsonReader.endObject();
                                        if (str3 != null && bool3 != null) {
                                            arrayList2.add(new C19420xS(str3, bool3.booleanValue()));
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                throw new RuntimeException(AnonymousClass001.A0R("unknown key ", nextName));
                                jsonReader.endArray();
                            }
                            jsonReader.endObject();
                            if (arrayList != null && arrayList2 != null) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    C19400xQ c19400xQ = (C19400xQ) it.next();
                                    String str4 = c19400xQ.A01;
                                    int A00 = AbstractC10100gN.A00(str4);
                                    String str5 = c19400xQ.A00;
                                    try {
                                        if (AbstractC10100gN.A01(A00)) {
                                            this.A08[A00] = str5;
                                            if (C0K8.A01.isLoggable(3) && A00 != -2 && A00 != -1 && A00 >= 0) {
                                                AbstractC09930fu.getModuleName(A00);
                                            }
                                        }
                                        boolean z2 = c19400xQ.A02;
                                        if (AbstractC10100gN.A01(A00)) {
                                            this.A02.set(A00, z2);
                                            if (C0K8.A01.isLoggable(3) && A00 != -2 && A00 != -1 && A00 >= 0) {
                                                AbstractC09930fu.getModuleName(A00);
                                            }
                                        }
                                        if (c19400xQ.A03) {
                                            this.A05.add(str4);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    C19420xS c19420xS = (C19420xS) it2.next();
                                    if (c19420xS.A01) {
                                        this.A05.add(c19420xS.A00);
                                    }
                                }
                                this.A00 = true;
                            }
                            throw new IllegalStateException("Required value was null.");
                        } finally {
                            jsonReader.close();
                        }
                    } catch (FileNotFoundException e) {
                        throw new IOException(String.format(Locale.US, "app_modules.json not found, assets = %s", Arrays.toString(assets.list(""))), e);
                    }
                } catch (IOException e2) {
                    C0K8.A0K("AppModuleStateCache", "Error loading downloadable module metadata", e2);
                    z = false;
                }
            }
        }
        return z;
    }

    public final synchronized boolean A08(String str) {
        boolean z = false;
        synchronized (this) {
            int A00 = AbstractC10100gN.A00(str);
            if (A00 >= 0) {
                try {
                    if (this.A08[A00] != null) {
                        z = this.A02.get(A00);
                    }
                } finally {
                }
            } else {
                z = true;
            }
        }
        return z;
    }

    public C0g3() {
        int i = 0;
        Integer[] numArr = new Integer[103];
        this.A07 = numArr;
        do {
            numArr[i] = C05F.A00;
            i++;
        } while (i < 103);
    }

    public static synchronized C0g3 A00() {
        C0g3 c0g3;
        synchronized (C0g3.class) {
            c0g3 = A09;
            if (c0g3 == null) {
                c0g3 = new C0g3();
                A09 = c0g3;
            }
        }
        return c0g3;
    }

    public final String A02(String str) {
        String str2;
        int A00 = AbstractC10100gN.A00(str);
        synchronized (this) {
            str2 = null;
            if (A00 != -3 && A00 != -2 && A00 != -1) {
                if (AbstractC10100gN.A01(A00)) {
                    str2 = this.A08[A00];
                }
            }
        }
        return str2;
    }

    public final void A05(String str, Integer num) {
        A03(AbstractC10100gN.A00(str), num);
    }

    public final boolean A07(String str) {
        int A00 = AbstractC10100gN.A00(str);
        synchronized (this) {
            boolean z = false;
            if (A00 != -3 && A00 != -2) {
                if (A00 != -1) {
                    if (AbstractC10100gN.A01(A00)) {
                        z = this.A04.get(A00);
                    }
                } else {
                    return true;
                }
            }
            return z;
        }
    }
}
