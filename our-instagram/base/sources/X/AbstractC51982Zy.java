package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.2Zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC51982Zy {
    public static int A00 = -100;
    public static C53082bp A02;
    public static C53082bp A03;
    public static Boolean A04;
    public static boolean A05;
    public static ExecutorC52032a3 A01 = new ExecutorC52032a3(new Object());
    public static final C012504o A06 = new C012504o(0);
    public static final Object A07 = new Object();
    public static final Object A08 = new Object();

    public static void A01(int i) {
        if ((i != -1 && i != 0 && i != 1 && i != 2 && i != 3) || A00 == i) {
            return;
        }
        A00 = i;
        synchronized (A07) {
            Iterator it = A06.iterator();
            while (it.hasNext()) {
                AbstractC51982Zy abstractC51982Zy = (AbstractC51982Zy) ((WeakReference) it.next()).get();
                if (abstractC51982Zy != null) {
                    LayoutInflaterFactory2C52042a4.A0E((LayoutInflaterFactory2C52042a4) abstractC51982Zy, true, true);
                }
            }
        }
    }

    public abstract Context A0G(Context context);

    public abstract VK7 A0H(XDW xdw);

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K(int i);

    public abstract void A0L(Bundle bundle);

    public abstract void A0M(View view);

    public abstract void A0N(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0O(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0P(CharSequence charSequence);

    public abstract boolean A0Q(int i);

    public static Object A00() {
        Context context;
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            AbstractC51982Zy abstractC51982Zy = (AbstractC51982Zy) ((Reference) it.next()).get();
            if (abstractC51982Zy != null && (context = ((LayoutInflaterFactory2C52042a4) abstractC51982Zy).A0l) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static /* synthetic */ void A03(Context context) {
        C53082bp c53082bp;
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                Object A002 = A00();
                if (A002 != null) {
                    LocaleList A003 = AD0.A00(A002);
                    C53082bp c53082bp2 = C53082bp.A01;
                    c53082bp = new C53082bp(new C53092bq(A003));
                } else {
                    c53082bp = C53082bp.A01;
                }
                if (((C53092bq) c53082bp.A00).A00.isEmpty()) {
                    String A004 = AbstractC196448ma.A00(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        AD0.A01(LocaleList.forLanguageTags(A004), systemService);
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
        A05 = true;
    }

    public static void A04(AbstractC51982Zy abstractC51982Zy) {
        synchronized (A07) {
            Iterator it = A06.iterator();
            while (it.hasNext()) {
                AbstractC51982Zy abstractC51982Zy2 = (AbstractC51982Zy) ((WeakReference) it.next()).get();
                if (abstractC51982Zy2 == abstractC51982Zy || abstractC51982Zy2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static boolean A05(Context context) {
        if (A04 == null) {
            try {
                Bundle bundle = ((PackageItemInfo) context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), 640)).metaData;
                if (bundle != null) {
                    A04 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                A04 = false;
            }
        }
        return A04.booleanValue();
    }

    public static void A02(final Context context) {
        if (A05(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!A05) {
                    A01.execute(new Runnable() { // from class: X.TJ3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC51982Zy.A03(context);
                        }
                    });
                    return;
                }
                return;
            }
            synchronized (A08) {
                C53082bp c53082bp = A02;
                if (c53082bp == null) {
                    C53082bp c53082bp2 = A03;
                    if (c53082bp2 == null) {
                        c53082bp2 = C53082bp.A00(AbstractC196448ma.A00(context));
                        A03 = c53082bp2;
                    }
                    if (!((C53092bq) c53082bp2.A00).A00.isEmpty()) {
                        A02 = A03;
                    }
                } else if (!c53082bp.equals(A03)) {
                    C53082bp c53082bp3 = A02;
                    A03 = c53082bp3;
                    String languageTags = ((C53092bq) c53082bp3.A00).A00.toLanguageTags();
                    synchronized (AbstractC196448ma.A00) {
                        if (languageTags.equals("")) {
                            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        } else {
                            try {
                                FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                                XmlSerializer newSerializer = android.util.Xml.newSerializer();
                                try {
                                    try {
                                        newSerializer.setOutput(openFileOutput, null);
                                        newSerializer.startDocument(ReactWebViewManager.HTML_ENCODING, true);
                                        newSerializer.startTag(null, "locales");
                                        newSerializer.attribute(null, "application_locales", languageTags);
                                        newSerializer.endTag(null, "locales");
                                        newSerializer.endDocument();
                                    } catch (Exception e) {
                                        android.util.Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                                    }
                                    if (openFileOutput != null) {
                                        try {
                                            openFileOutput.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (Throwable th) {
                                    if (openFileOutput != null) {
                                        try {
                                            openFileOutput.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (FileNotFoundException unused3) {
                                android.util.Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
                            }
                        }
                    }
                }
            }
        }
    }
}
