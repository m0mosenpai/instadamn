package X;

import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: X.StR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63771StR implements InterfaceC65570Tn3 {
    public static final String[] A0A = {"_data"};
    public final int A00;
    public final int A01;
    public final Context A02;
    public final android.net.Uri A03;
    public final C63729Ssj A04;
    public final InterfaceC65477Tku A05;
    public final InterfaceC65477Tku A06;
    public final Class A07;
    public volatile InterfaceC65570Tn3 A08;
    public volatile boolean A09;

    @Override // X.InterfaceC65570Tn3
    public final void cancel() {
        this.A09 = true;
        InterfaceC65570Tn3 interfaceC65570Tn3 = this.A08;
        if (interfaceC65570Tn3 != null) {
            interfaceC65570Tn3.cancel();
        }
    }

    @Override // X.InterfaceC65570Tn3
    public final Class Avg() {
        return this.A07;
    }

    @Override // X.InterfaceC65570Tn3
    public final Integer Avo() {
        return C05F.A00;
    }

    @Override // X.InterfaceC65570Tn3
    public final void cleanup() {
        InterfaceC65570Tn3 interfaceC65570Tn3 = this.A08;
        if (interfaceC65570Tn3 != null) {
            interfaceC65570Tn3.cleanup();
        }
    }

    public C63771StR(Context context, android.net.Uri uri, C63729Ssj c63729Ssj, InterfaceC65477Tku interfaceC65477Tku, InterfaceC65477Tku interfaceC65477Tku2, Class cls, int i, int i2) {
        this.A02 = context.getApplicationContext();
        this.A05 = interfaceC65477Tku;
        this.A06 = interfaceC65477Tku2;
        this.A03 = uri;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = c63729Ssj;
        this.A07 = cls;
    }

    @Override // X.InterfaceC65570Tn3
    public final void ChQ(EnumC61107RfN enumC61107RfN, InterfaceC65471Tko interfaceC65471Tko) {
        android.net.Uri uri;
        SFV AEj;
        try {
            if (Environment.isExternalStorageLegacy()) {
                InterfaceC65477Tku interfaceC65477Tku = this.A05;
                uri = this.A03;
                Cursor cursor = null;
                try {
                    Cursor A01 = C0fI.A01(this.A02.getContentResolver(), uri, null, null, A0A, null, 2079316357);
                    if (A01 != null && A01.moveToFirst()) {
                        String A0p = AbstractC58319PtB.A0p(A01, "_data");
                        if (!TextUtils.isEmpty(A0p)) {
                            File A11 = AbstractC166987dD.A11(A0p);
                            A01.close();
                            AEj = interfaceC65477Tku.AEj(this.A04, A11, this.A01, this.A00);
                        } else {
                            throw AbstractC58323PtF.A0c(uri, "File path was empty in media store for: ", AbstractC166987dD.A1C());
                        }
                    } else {
                        throw AbstractC58323PtF.A0c(uri, "Failed to media store entry for: ", AbstractC166987dD.A1C());
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            } else {
                boolean A1N = AbstractC167007dF.A1N(this.A02.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION"));
                android.net.Uri uri2 = this.A03;
                uri = uri2;
                if (A1N) {
                    uri2 = MediaStore.setRequireOriginal(uri2);
                }
                AEj = this.A06.AEj(this.A04, uri2, this.A01, this.A00);
            }
            if (AEj != null) {
                InterfaceC65570Tn3 interfaceC65570Tn3 = AEj.A01;
                this.A08 = interfaceC65570Tn3;
                if (this.A09) {
                    cancel();
                    return;
                } else {
                    interfaceC65570Tn3.ChQ(enumC61107RfN, interfaceC65471Tko);
                    return;
                }
            }
            interfaceC65471Tko.DPj(AbstractC37303Gc4.A0M(uri, "Failed to build fetcher for: ", AbstractC166987dD.A1C()));
        } catch (FileNotFoundException e) {
            interfaceC65471Tko.DPj(e);
        }
    }
}
