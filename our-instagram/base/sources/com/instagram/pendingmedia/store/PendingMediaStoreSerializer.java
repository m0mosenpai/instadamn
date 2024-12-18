package com.instagram.pendingmedia.store;

import X.AbstractC13670mt;
import X.AbstractC14350nz;
import X.AbstractC221915u;
import X.AbstractRunnableC14200nk;
import X.AnonymousClass001;
import X.C06090Tz;
import X.C0K8;
import X.C0o0;
import X.C0w9;
import X.C120295cS;
import X.C18240vB;
import X.C18U;
import X.C20I;
import X.C25A;
import X.C47Y;
import X.C47Z;
import X.EnumC915447k;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.common.io.Closeables;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class PendingMediaStoreSerializer {
    public boolean A00;
    public final Context A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final UserSession A03;
    public final AbstractRunnableC14200nk A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final C18240vB A09;

    private final synchronized boolean A02(String str, String str2) {
        boolean z;
        String A06;
        String str3;
        Context context = this.A01;
        File file = new File(context.getFilesDir(), str);
        File file2 = new File(context.getFilesDir(), str2);
        if (!file.exists()) {
            A06 = AnonymousClass001.A0R("Source file does not exist: ", file.getName());
            str3 = "PendingMediaStoreSerializer_rename_srcFileDoesNotExist";
        } else {
            if (!file.renameTo(file2)) {
                if (!file2.exists()) {
                    A06 = AbstractC13670mt.A06("Unable to rename %s to %s. Destination file does not exist.", file.getName(), file2.getName());
                    str3 = "PendingMediaStoreSerializer_rename_dstFileDoesNotExist";
                } else if (!file2.delete()) {
                    A06 = AbstractC13670mt.A06("Unable to rename %s to %s. Unable to delete destination file.", file.getName(), file2.getName());
                    str3 = "PendingMediaStoreSerializer_rename_dstFileDeleteFail";
                } else if (!file.renameTo(file2)) {
                    A06 = AbstractC13670mt.A06("Unable to rename %s to %s", file.getName(), file2.getName());
                    str3 = "PendingMediaStoreSerializer_rename_srcFileRenameToFinalFileFail";
                }
            }
            z = true;
        }
        C0w9.A04(str3, A06, 1);
        z = false;
        return z;
    }

    public static final ArrayList A00(PendingMediaStore pendingMediaStore, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C47Z A03 = pendingMediaStore.A03((String) it.next());
            if (A03 != null) {
                arrayList.add(A03);
            }
        }
        return arrayList;
    }

    public final void A03() {
        if (!C25A.A00(this.A03).A0E()) {
            this.A09.ATO(new AbstractRunnableC14200nk() { // from class: X.25D
                {
                    super(526, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FileInputStream openFileInput;
                    final PendingMediaStoreSerializer pendingMediaStoreSerializer = PendingMediaStoreSerializer.this;
                    synchronized (pendingMediaStoreSerializer) {
                        C0K8.A0C("PendingMediaStoreSerializer", "deserialize start");
                        if (!pendingMediaStoreSerializer.A00) {
                            String str = pendingMediaStoreSerializer.A06;
                            if (str.length() == 0) {
                                C0w9.A04("PendingMediaStoreSerializer_deserialize_invalidFinalFileName", "Null or empty filename", 1);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                try {
                                    try {
                                        C0K8.A0C("PendingMediaStoreSerializer", "start reading pending media");
                                        try {
                                            openFileInput = pendingMediaStoreSerializer.A01.openFileInput(str);
                                            C14360o3.A07(openFileInput);
                                        } catch (FileNotFoundException e) {
                                            Context context = pendingMediaStoreSerializer.A01;
                                            File file = new File(context.getFilesDir(), "pending_media.json");
                                            if (file.exists()) {
                                                file.renameTo(new File(context.getFilesDir(), str));
                                                openFileInput = context.openFileInput(str);
                                                C14360o3.A07(openFileInput);
                                            } else {
                                                throw e;
                                            }
                                        }
                                        C07880b8 c07880b8 = C07950bF.A04;
                                        UserSession userSession = pendingMediaStoreSerializer.A03;
                                        C14360o3.A0B(userSession, 0);
                                        C07950bF A00 = C07880b8.A00(AbstractC221915u.A00.A01(openFileInput), userSession);
                                        A00.A1J();
                                        ArrayList arrayList5 = new ArrayList();
                                        if (A00.A11() != C16R.A0C) {
                                            A00.A0z();
                                        } else {
                                            while (A00.A1J() != C16R.A08) {
                                                C47Z parseFromJson = C47Y.parseFromJson(A00);
                                                C14360o3.A07(parseFromJson);
                                                arrayList5.add(parseFromJson);
                                                parseFromJson.A6K = pendingMediaStoreSerializer.A04;
                                            }
                                        }
                                        Closeables.A01(openFileInput);
                                        Closeables.A00(A00, true);
                                        C0K8.A0C("PendingMediaStoreSerializer", "finish reading pending media ");
                                        if (!arrayList5.isEmpty()) {
                                            arrayList5.size();
                                            Iterator it = arrayList5.iterator();
                                            while (it.hasNext()) {
                                                C47Z c47z = (C47Z) it.next();
                                                C14360o3.A0B(c47z, 0);
                                                c47z.A5Q = true;
                                                if (c47z.A1f == EnumC915447k.A04 && !c47z.A0r() && c47z.A5Q) {
                                                    c47z.A0Z(EnumC915447k.A02);
                                                } else if (!c47z.A5V || c47z.A0D() != ShareType.A0V || c47z.A0g >= System.currentTimeMillis() - 86400000) {
                                                    if (c47z.A0D() != ShareType.A0K) {
                                                        if (c47z.A0t() && c47z.A6J.equals(EnumC915447k.A02)) {
                                                            arrayList2.add(c47z);
                                                        }
                                                        if (c47z.A10() && c47z.A6J.equals(EnumC915447k.A02)) {
                                                            arrayList4.add(c47z);
                                                        }
                                                        if (c47z.A5w && c47z.A6J.equals(EnumC915447k.A02)) {
                                                            arrayList3.add(c47z);
                                                        }
                                                        arrayList.add(c47z);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (IOException e2) {
                                        String message = e2.getMessage();
                                        if (message == null) {
                                            message = "empty_message";
                                        }
                                        C0w9.A05("PendingMediaStoreSerializer_deserialize_IOException", message, 1, e2);
                                        pendingMediaStoreSerializer.A01.deleteFile(str);
                                    }
                                } catch (FileNotFoundException unused) {
                                } catch (RuntimeException e3) {
                                    pendingMediaStoreSerializer.A01.deleteFile(str);
                                    String message2 = e3.getMessage();
                                    if (message2 == null) {
                                        message2 = "";
                                    }
                                    if ((e3 instanceof IllegalArgumentException) && (message2.startsWith("No enum constant") || AbstractC001900j.A0a(message2, "is not a constant in", false))) {
                                        String message3 = e3.getMessage();
                                        if (message3 == null) {
                                            message3 = "empty_message";
                                        }
                                        C0w9.A05("PendingMediaStoreSerializer_deserialize_downgrade", message3, 1, e3);
                                    } else {
                                        throw e3;
                                    }
                                }
                                final PendingMediaStore A002 = C25A.A00(pendingMediaStoreSerializer.A03);
                                if (!arrayList.isEmpty()) {
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        C47Z c47z2 = (C47Z) it2.next();
                                        A002.A06.put(c47z2.A35, c47z2);
                                        c47z2.A6K = new Runnable() { // from class: X.484
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                AnonymousClass257.A00(PendingMediaStore.this.A05).A05();
                                            }
                                        };
                                        A002.A04.E4s(new AnonymousClass485(c47z2));
                                    }
                                    A002.A0A();
                                }
                                C0K8.A0C("PendingMediaStoreSerializer", "Set the submedia on albums");
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    C47Z c47z3 = (C47Z) it3.next();
                                    c47z3.A0j(PendingMediaStoreSerializer.A00(A002, c47z3.A0L()));
                                    if (c47z3.A0K().isEmpty()) {
                                        C0K8.A0O("PendingMediaStoreSerializer", "submedia missing in album: %s, submedia %s", c47z3.A35, c47z3.A0L());
                                        C0w9.A03("missing_submedia_err", AbstractC13670mt.A06("upload_id: %s\tsubmedia %s", c47z3.A3t, c47z3.A0L()));
                                        String str2 = c47z3.A35;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("submedia missing in album: upload_id:");
                                        sb.append(c47z3.A3t);
                                        sb.append(", submedia keys: ");
                                        sb.append(c47z3.A0L());
                                        A002.A04(str2, sb.toString());
                                    }
                                }
                                C0K8.A0C("PendingMediaStoreSerializer", "Set the submedia on post threads");
                                Iterator it4 = arrayList4.iterator();
                                while (it4.hasNext()) {
                                    C47Z c47z4 = (C47Z) it4.next();
                                    ArrayList A003 = PendingMediaStoreSerializer.A00(A002, c47z4.A4n);
                                    c47z4.A4m = A003;
                                    if (A003.isEmpty()) {
                                        C0K8.A0O("PendingMediaStoreSerializer", "submedia missing in post thread: %s, submedia %s", c47z4.A35, c47z4.A4n);
                                        C0w9.A03("missing_post_thread_submedia_err", AbstractC13670mt.A06("upload_id: %s\tsubmedia %s", c47z4.A3t, c47z4.A4n));
                                        String str3 = c47z4.A35;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("submedia missing in post thread: upload_id:");
                                        sb2.append(c47z4.A3t);
                                        sb2.append(", submedia keys: ");
                                        sb2.append(c47z4.A0L());
                                        A002.A04(str3, sb2.toString());
                                    }
                                }
                                C0K8.A0C("PendingMediaStoreSerializer", "Set the submedia on story templates");
                                Iterator it5 = arrayList3.iterator();
                                while (it5.hasNext()) {
                                    C47Z c47z5 = (C47Z) it5.next();
                                    c47z5.A0j(PendingMediaStoreSerializer.A00(A002, c47z5.A0L()));
                                    if (c47z5.A0K().isEmpty()) {
                                        C0K8.A0O("PendingMediaStoreSerializer", "submedia missing in story template: %s, submedia %s", c47z5.A35, c47z5.A0L());
                                        C0w9.A03("missing_submedia_err", AbstractC13670mt.A06("upload_id: %s\tstory template %s", c47z5.A3t, c47z5.A0L()));
                                        String str4 = c47z5.A35;
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("submedia missing in story template: upload_id:");
                                        sb3.append(c47z5.A3t);
                                        sb3.append(", submedia keys: ");
                                        sb3.append(c47z5.A0L());
                                        A002.A04(str4, sb3.toString());
                                    }
                                }
                                pendingMediaStoreSerializer.A00 = true;
                                C0K8.A0C("PendingMediaStoreSerializer", "deserialize is done. start calling callbacks");
                                pendingMediaStoreSerializer.A02.post(new Runnable() { // from class: X.486
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C0K8.A0C("PendingMediaStoreSerializer", "wait for deserialization lock");
                                        PendingMediaStoreSerializer pendingMediaStoreSerializer2 = pendingMediaStoreSerializer;
                                        Object obj = pendingMediaStoreSerializer2.A05;
                                        PendingMediaStore pendingMediaStore = A002;
                                        synchronized (obj) {
                                            synchronized (pendingMediaStore) {
                                                pendingMediaStore.A01 = true;
                                            }
                                            C0K8.A0C("PendingMediaStoreSerializer", "calling callbacks");
                                            List list = pendingMediaStoreSerializer2.A08;
                                            Iterator it6 = list.iterator();
                                            while (it6.hasNext()) {
                                                ((Runnable) it6.next()).run();
                                            }
                                            list.clear();
                                        }
                                    }
                                });
                                C0K8.A0C("PendingMediaStoreSerializer", "deserialize end");
                            }
                        }
                    }
                }
            });
        }
    }

    public final void A04() {
        this.A09.ATO(this.A04);
    }

    public final synchronized void A05() {
        long j;
        String str;
        String str2;
        String str3;
        String A0R;
        String str4 = this.A06;
        if (str4.length() == 0) {
            str3 = "PendingMediaStoreSerializer_serialize_invalidFinalFileName";
            A0R = "Null or empty filename";
        } else {
            UserSession userSession = this.A03;
            if (!C25A.A00(userSession).A0E()) {
                C0w9.A03("PendingMediaStoreSerializer_serialize_tooEarly", "Tried to serialize data before initial deserialization happened.");
            } else {
                PendingMediaStore A00 = C25A.A00(userSession);
                UserSession userSession2 = A00.A05;
                C06090Tz c06090Tz = C06090Tz.A05;
                long A01 = C18U.A01(c06090Tz, userSession2, 36601861620371834L);
                if (A01 > 0 && C18U.A06(c06090Tz, userSession2, 36320386643730865L)) {
                    j = TimeUnit.DAYS.toMillis(A01);
                } else {
                    j = -1;
                }
                ArrayList arrayList = new ArrayList();
                for (C47Z c47z : A00.A06.values()) {
                    if (c47z.A1f != EnumC915447k.A02) {
                        if (!c47z.A5U && !c47z.A5v && !c47z.A5R && !c47z.A5S && j > 0 && c47z.A0g + j <= System.currentTimeMillis()) {
                        }
                        arrayList.add(c47z);
                    } else {
                        long j2 = c47z.A0V;
                        if (j2 > 0) {
                            long j3 = c47z.A0W;
                            if (j3 > 0 && System.currentTimeMillis() < j3 + j2) {
                                arrayList.add(c47z);
                            }
                        }
                    }
                }
                if (C18U.A06(C06090Tz.A06, userSession, 36330720335447021L)) {
                    A01(arrayList, true);
                } else if (arrayList.isEmpty()) {
                    this.A01.deleteFile(str4);
                } else {
                    try {
                        Context context = this.A01;
                        str2 = this.A07;
                        FileOutputStream openFileOutput = context.openFileOutput(str2, 0);
                        try {
                            C120295cS A08 = AbstractC221915u.A00.A08(openFileOutput);
                            try {
                                str = "PendingMediaStoreSerializer";
                                arrayList.size();
                                A08.A0c();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    C47Z c47z2 = (C47Z) it.next();
                                    synchronized (c47z2) {
                                        C47Y.A01(A08, c47z2);
                                    }
                                }
                                A08.A0Z();
                                A08.close();
                                if (openFileOutput != null) {
                                    openFileOutput.close();
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } catch (FileNotFoundException e) {
                        String str5 = this.A07;
                        C0K8.A0L("PendingMediaStoreSerializer", "File not found while getting output stream for %s", e, str5);
                        str3 = "PendingMediaStoreSerializer_serialize_unableToOpenTempFileName";
                        A0R = AnonymousClass001.A0R("Failed to acquire output stream for ", str5);
                    } catch (IOException e2) {
                        str = "PendingMediaStoreSerializer";
                        str2 = this.A07;
                        C0K8.A0L("PendingMediaStoreSerializer", "Exception while writing out %s", e2, str2);
                        C0w9.A05("PendingMediaStoreSerializer_serialize_IOException", AnonymousClass001.A0R("Exception while writing to ", str2), 1, e2);
                    }
                    if (!A02(str2, str4)) {
                        C0K8.A0O(str, "Unable to rename %s to %s", str2, str4);
                    }
                }
            }
        }
        C0w9.A04(str3, A0R, 1);
    }

    public final void A06(Runnable runnable) {
        synchronized (this.A05) {
            if (C25A.A00(this.A03).A0E()) {
                runnable.run();
            } else {
                this.A08.add(runnable);
            }
        }
    }

    public PendingMediaStoreSerializer(UserSession userSession) {
        this.A03 = userSession;
        this.A01 = userSession.deviceSession.A06();
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "PendingMediaStoreSerializer";
        this.A09 = new C18240vB(A00);
        this.A04 = new AbstractRunnableC14200nk() { // from class: X.259
            {
                super(527, 3, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                PendingMediaStoreSerializer.this.A05();
            }
        };
        this.A05 = new Object();
        this.A08 = new ArrayList();
        String str = userSession.userId;
        this.A07 = AnonymousClass001.A0R(str, "_pending_media.json.tmp");
        this.A06 = AnonymousClass001.A0R(str, "_pending_media.json");
    }

    private final void A01(List list, boolean z) {
        String str;
        String str2;
        if (list.isEmpty()) {
            this.A01.deleteFile(this.A06);
            return;
        }
        try {
            Context context = this.A01;
            str2 = this.A07;
            FileOutputStream openFileOutput = context.openFileOutput(str2, 0);
            try {
                C120295cS A08 = AbstractC221915u.A00.A08(openFileOutput);
                try {
                    str = "PendingMediaStoreSerializer";
                    list.size();
                    A08.A0c();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C47Z c47z = (C47Z) it.next();
                        synchronized (c47z) {
                            C47Y.A01(A08, c47z);
                        }
                    }
                    A08.A0Z();
                    A08.close();
                    if (openFileOutput != null) {
                        openFileOutput.close();
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C20I.A00(openFileOutput, th);
                    throw th2;
                }
            }
        } catch (FileNotFoundException e) {
            String str3 = this.A07;
            C0K8.A0L("PendingMediaStoreSerializer", "File not found while getting output stream for %s", e, str3);
            C0w9.A04("PendingMediaStoreSerializer_serialize_unableToOpenTempFileName", AnonymousClass001.A0R("Failed to acquire output stream for ", str3), 1);
            return;
        } catch (IOException e2) {
            str = "PendingMediaStoreSerializer";
            str2 = this.A07;
            C0K8.A0L("PendingMediaStoreSerializer", "Exception while writing out %s", e2, str2);
            C0w9.A05("PendingMediaStoreSerializer_serialize_IOException", AnonymousClass001.A0R("Exception while writing to ", str2), 1, e2);
        } catch (Exception e3) {
            if (z) {
                if (C18U.A06(C06090Tz.A05, this.A03, 36330720335447021L)) {
                    A01(list, false);
                    return;
                }
            }
            throw e3;
        }
        String str4 = this.A06;
        if (A02(str2, str4)) {
            return;
        }
        C0K8.A0O(str, "Unable to rename %s to %s", str2, str4);
    }
}
