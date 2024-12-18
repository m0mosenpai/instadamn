package X;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class NGI extends AbstractRunnableC14200nk {
    public final /* synthetic */ OUE A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGI(OUE oue) {
        super(625, 4, false, false);
        this.A00 = oue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long availableBlocksLong;
        long blockCountLong;
        EnumC40111tc enumC40111tc;
        File externalFilesDir;
        OUE oue = this.A00;
        if (!oue.A00) {
            Context context = oue.A01;
            if (OUE.A05 == null && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
                OUE.A05 = externalFilesDir;
            }
            if (OUE.A06 == null) {
                OUE.A06 = context.getCacheDir();
            }
            oue.A00 = true;
        }
        try {
            C006802i c006802i = oue.A02;
            c006802i.markerStart(57868289);
            File file = OUE.A06;
            if (file != null) {
                StatFs statFs = new StatFs(file.getAbsolutePath());
                long availableBlocksLong2 = (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576;
                File file2 = OUE.A06;
                if (file2 != null) {
                    StatFs statFs2 = new StatFs(file2.getAbsolutePath());
                    long blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / 1048576;
                    File file3 = OUE.A05;
                    if (file3 == null) {
                        availableBlocksLong = 0;
                    } else {
                        StatFs statFs3 = new StatFs(file3.getAbsolutePath());
                        availableBlocksLong = statFs3.getAvailableBlocksLong() * statFs3.getBlockSizeLong();
                    }
                    long j = availableBlocksLong / 1048576;
                    File file4 = OUE.A05;
                    if (file4 == null) {
                        blockCountLong = 0;
                    } else {
                        StatFs statFs4 = new StatFs(file4.getAbsolutePath());
                        blockCountLong = statFs4.getBlockCountLong() * statFs4.getBlockSizeLong();
                    }
                    boolean isExternalStorageEmulated = Environment.isExternalStorageEmulated();
                    boolean isExternalStorageRemovable = Environment.isExternalStorageRemovable();
                    c006802i.markerAnnotate(57868289, "external_emulated", isExternalStorageEmulated);
                    c006802i.markerAnnotate(57868289, "external_removable", isExternalStorageRemovable);
                    c006802i.markerAnnotate(57868289, "internal_free_mb", availableBlocksLong2);
                    c006802i.markerAnnotate(57868289, "internal_total_mb", blockCountLong2);
                    c006802i.markerAnnotate(57868289, "external_free_mb", j);
                    c006802i.markerAnnotate(57868289, "external_total_mb", blockCountLong / 1048576);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    ArrayList A1E3 = AbstractC166987dD.A1E();
                    ArrayList A1E4 = AbstractC166987dD.A1E();
                    JSONArray A0p = AbstractC31171DnF.A0p();
                    Iterator A13 = AbstractC166997dE.A13(oue.A03);
                    while (A13.hasNext()) {
                        C47Z c47z = (C47Z) AbstractC166997dE.A0l(A13);
                        long seconds = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - Long.parseLong(c47z.A3t));
                        ArrayList A1E5 = AbstractC166987dD.A1E();
                        if (!C14360o3.A0K(c47z.A1N, (ClipInfo) ClipInfo.A0Q.getValue())) {
                            A1E5.add(c47z.A1N.A0F);
                        }
                        List list = c47z.A4G;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                A1E5.add(((ClipInfo) it.next()).A0F);
                            }
                        }
                        A1E5.add(c47z.A3V);
                        A1E5.add(c47z.A3m);
                        A1E5.add(c47z.A33);
                        A1E5.add(c47z.A2k);
                        A1E5.add(c47z.A3Z);
                        Iterator it2 = c47z.A1j.A06.iterator();
                        while (it2.hasNext()) {
                            A1E5.add(((C51580MqY) it2.next()).A06);
                        }
                        List list2 = c47z.A4a;
                        if (list2 != null && AbstractC166987dD.A1b(list2)) {
                            List list3 = c47z.A4a;
                            if (list3 != null) {
                                Iterator it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    A1E5.add(((C5NJ) it3.next()).A05);
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                        Iterator it4 = A1E5.iterator();
                        long j2 = 0;
                        while (it4.hasNext()) {
                            j2 += AbstractC13530mf.A03(AbstractC166987dD.A1B(it4));
                        }
                        long j3 = j2 / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
                        Long valueOf = Long.valueOf(seconds);
                        Long valueOf2 = Long.valueOf(j3);
                        A1E.add(valueOf);
                        A1E2.add(valueOf2);
                        if (c47z.A0z()) {
                            enumC40111tc = EnumC40111tc.A0a;
                        } else {
                            enumC40111tc = c47z.A1G;
                        }
                        A1E3.add(enumC40111tc.name());
                        A1E4.add(c47z.A0D().name());
                        A0p.put(new JSONObject(C47Y.A00(c47z)));
                    }
                    Object[] array = A1E.toArray();
                    int length = array.length;
                    long[] jArr = new long[length];
                    for (int i = 0; i < length; i++) {
                        Object obj = array[i];
                        obj.getClass();
                        jArr[i] = AbstractC166987dD.A0N(obj);
                    }
                    c006802i.markerAnnotate(57868289, "age_sec_array", jArr);
                    Object[] array2 = A1E2.toArray();
                    int length2 = array2.length;
                    long[] jArr2 = new long[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        Object obj2 = array2[i2];
                        obj2.getClass();
                        jArr2[i2] = AbstractC166987dD.A0N(obj2);
                    }
                    c006802i.markerAnnotate(57868289, "footage_kb_array", jArr2);
                    OUE.A00(oue, "age_sec", A1E);
                    OUE.A00(oue, "footage_kb", A1E2);
                    c006802i.markerAnnotate(57868289, "media_type_array", (String[]) AbstractC58576Pxu.A00(A1E3).A04());
                    c006802i.markerAnnotate(57868289, "share_type_array", (String[]) AbstractC58576Pxu.A00(A1E4).A04());
                    c006802i.markerAnnotate(57868289, "media_json_array", String.valueOf(A0p));
                    c006802i.markerEnd(57868289, (short) 2);
                }
            }
        } catch (Throwable th) {
            oue.A02.markerEnd(57868289, (short) 3);
            C0w9.A07("ingestion_disk_footage_err", th);
        }
    }
}
