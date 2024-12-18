package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.fileregistry.OwnerHelper;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.48k, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C48k {
    public static C48k A08;
    public List A00;
    public List A01;
    public boolean A02;
    public boolean A03 = false;
    public final Context A04;
    public final C18240vB A05;
    public final C916848m A06;
    public final HashMap A07;

    public final synchronized void A02(final InterfaceC120515cw interfaceC120515cw, final String str) {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                try {
                    str = new File(str).getCanonicalPath();
                } catch (IOException unused) {
                }
                HashMap hashMap = this.A07;
                InterfaceC120515cw interfaceC120515cw2 = (InterfaceC120515cw) hashMap.get(str);
                if ((interfaceC120515cw2 == null || !interfaceC120515cw2.equals(interfaceC120515cw)) && A03(str)) {
                    hashMap.put(str, interfaceC120515cw);
                    this.A05.ATO(new AbstractRunnableC14200nk() { // from class: X.9jC
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(272);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("file_path", str);
                            StringWriter stringWriter = new StringWriter();
                            try {
                                InterfaceC37481ol A00 = C48k.this.A06.A00("fileRegistry_register");
                                try {
                                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                                    OwnerHelper.A00.A02(A0A, interfaceC120515cw);
                                    A0A.close();
                                    contentValues.put("owner_json", stringWriter.toString());
                                    A00.COa(contentValues, "file_registry", 0);
                                    A00.close();
                                } finally {
                                }
                            } catch (IOException unused2) {
                                C0w9.A03("file_registry_save", "Failed to serialize owner");
                            }
                        }
                    });
                }
            }
        }
    }

    public final boolean A03(String str) {
        String canonicalPath;
        String A0R;
        try {
            canonicalPath = new File(str).getCanonicalPath();
        } catch (IOException unused) {
        }
        if (canonicalPath == null) {
            A0R = "invalid file path in registry";
        } else {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                if (canonicalPath.startsWith((String) it.next())) {
                    Iterator it2 = this.A01.iterator();
                    while (it2.hasNext()) {
                        if (canonicalPath.startsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            A0R = AnonymousClass001.A0R("filepath outside of app scoped directories. parent folder: ", new File(canonicalPath).getParent());
        }
        C0w9.A03("FileRegistry#isWithinAppScopedDirectory", A0R);
        return false;
    }

    public static synchronized C48k A00(Context context) {
        C48k c48k;
        synchronized (C48k.class) {
            if (A08 == null) {
                C0o0 A00 = AbstractC14350nz.A00();
                A00.A01 = "PendingMediaStoreSerializer";
                final C48k c48k2 = new C48k(context, new C18240vB(A00));
                A08 = c48k2;
                List asList = Arrays.asList(AbstractC916948n.A03(), (File) C1Q3.A01.getValue(), AbstractC916948n.A07(), AbstractC917048o.A01(), AbstractC916948n.A02(), AbstractC916948n.A05(), AbstractC916948n.A04(), AbstractC23881Ey.A00().CHo(null, 761593505), new File(context.getFilesDir(), "pending_media_"));
                List asList2 = Arrays.asList(context.getFilesDir(), context.getExternalFilesDir(null));
                synchronized (c48k2) {
                    c48k2.A00 = A01(asList2);
                    c48k2.A01 = A01(asList);
                    if (!c48k2.A02) {
                        c48k2.A02 = true;
                        c48k2.A05.ATO(new AbstractRunnableC14200nk() { // from class: X.48p
                            {
                                super(516);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC37481ol A002;
                                C48k c48k3 = C48k.this;
                                synchronized (c48k3) {
                                    if (c48k3.A03) {
                                        return;
                                    }
                                    try {
                                        A002 = c48k3.A06.A00("FileRegistry_init");
                                    } catch (IOException unused) {
                                    }
                                    try {
                                        StringBuilder sb = new StringBuilder(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
                                        sb.append("SELECT ");
                                        sb.append("* ");
                                        sb.append("FROM ");
                                        sb.append("file_registry");
                                        String obj = sb.toString();
                                        C14360o3.A07(obj);
                                        Cursor E7N = A002.E7N(new C37491om(obj, null));
                                        try {
                                            int columnIndex = E7N.getColumnIndex("file_path");
                                            int columnIndex2 = E7N.getColumnIndex("owner_json");
                                            E7N.moveToFirst();
                                            while (!E7N.isAfterLast()) {
                                                String string = E7N.getString(columnIndex);
                                                String string2 = E7N.getString(columnIndex2);
                                                try {
                                                    string2.getClass();
                                                    C16L A03 = AbstractC221915u.A00.A03(string2);
                                                    A03.A1J();
                                                    InterfaceC120515cw interfaceC120515cw = (InterfaceC120515cw) OwnerHelper.A00.A01(A03);
                                                    synchronized (c48k3) {
                                                        c48k3.A07.put(string, interfaceC120515cw);
                                                    }
                                                } catch (C90123zt | IOException e) {
                                                    C0w9.A06("file_registry_init", AnonymousClass001.A0R("Failed to parse: ", string2), e);
                                                }
                                                E7N.moveToNext();
                                            }
                                            E7N.close();
                                            A002.close();
                                            c48k3.A03 = true;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                            }
                        });
                    }
                }
            }
            c48k = A08;
        }
        return c48k;
    }

    public static List A01(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null) {
                try {
                    arrayList.add(file.getCanonicalPath());
                } catch (IOException unused) {
                    C0w9.A03(AbstractC111324zv.A00(786), AbstractC111324zv.A00(638));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.1Yw, java.lang.Object] */
    public C48k(Context context, C18240vB c18240vB) {
        Context applicationContext = context.getApplicationContext();
        this.A04 = applicationContext;
        this.A05 = c18240vB;
        this.A07 = new HashMap();
        this.A01 = Collections.emptyList();
        this.A00 = Collections.emptyList();
        C14360o3.A0B(applicationContext, 0);
        this.A06 = new C916848m(applicationContext, AbstractC28981ab.A00(applicationContext, new AbstractC28901aT(2), "fileregistry.db", false, false), new Object());
    }
}
