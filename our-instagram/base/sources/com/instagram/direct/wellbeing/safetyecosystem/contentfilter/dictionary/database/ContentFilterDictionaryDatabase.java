package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database;

import X.C2043692r;
import X.C2043892u;
import X.C2043992v;
import com.instagram.roomdb.IgRoomDatabase;

/* loaded from: classes4.dex */
public abstract class ContentFilterDictionaryDatabase extends IgRoomDatabase {
    public static final C2043692r A00 = new Object();

    public final C2043992v A00() {
        C2043992v c2043992v;
        ContentFilterDictionaryDatabase_Impl contentFilterDictionaryDatabase_Impl = (ContentFilterDictionaryDatabase_Impl) this;
        if (contentFilterDictionaryDatabase_Impl.A00 != null) {
            return contentFilterDictionaryDatabase_Impl.A00;
        }
        synchronized (contentFilterDictionaryDatabase_Impl) {
            if (contentFilterDictionaryDatabase_Impl.A00 == null) {
                contentFilterDictionaryDatabase_Impl.A00 = new C2043992v(contentFilterDictionaryDatabase_Impl);
            }
            c2043992v = contentFilterDictionaryDatabase_Impl.A00;
        }
        return c2043992v;
    }

    public final C2043892u A01() {
        C2043892u c2043892u;
        ContentFilterDictionaryDatabase_Impl contentFilterDictionaryDatabase_Impl = (ContentFilterDictionaryDatabase_Impl) this;
        if (contentFilterDictionaryDatabase_Impl.A01 != null) {
            return contentFilterDictionaryDatabase_Impl.A01;
        }
        synchronized (contentFilterDictionaryDatabase_Impl) {
            if (contentFilterDictionaryDatabase_Impl.A01 == null) {
                contentFilterDictionaryDatabase_Impl.A01 = new C2043892u(contentFilterDictionaryDatabase_Impl);
            }
            c2043892u = contentFilterDictionaryDatabase_Impl.A01;
        }
        return c2043892u;
    }
}
