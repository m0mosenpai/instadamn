package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.io.File;

/* renamed from: X.StP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63769StP implements InterfaceC65570Tn3 {
    public static final String[] A02 = {"_data"};
    public final Context A00;
    public final android.net.Uri A01;

    @Override // X.InterfaceC65570Tn3
    public final void cancel() {
    }

    @Override // X.InterfaceC65570Tn3
    public final void cleanup() {
    }

    @Override // X.InterfaceC65570Tn3
    public final Class Avg() {
        return File.class;
    }

    @Override // X.InterfaceC65570Tn3
    public final Integer Avo() {
        return C05F.A00;
    }

    @Override // X.InterfaceC65570Tn3
    public final void ChQ(EnumC61107RfN enumC61107RfN, InterfaceC65471Tko interfaceC65471Tko) {
        ContentResolver contentResolver = this.A00.getContentResolver();
        android.net.Uri uri = this.A01;
        Cursor A01 = C0fI.A01(contentResolver, uri, null, null, A02, null, 579858521);
        String str = null;
        if (A01 != null) {
            try {
                if (A01.moveToFirst()) {
                    str = AbstractC58319PtB.A0p(A01, "_data");
                }
            } finally {
                A01.close();
            }
        }
        if (TextUtils.isEmpty(str)) {
            interfaceC65471Tko.DPj(AbstractC58323PtF.A0c(uri, "Failed to find file path for: ", AbstractC166987dD.A1C()));
        } else {
            interfaceC65471Tko.D9H(AbstractC166987dD.A11(str));
        }
    }

    public C63769StP(Context context, android.net.Uri uri) {
        this.A00 = context;
        this.A01 = uri;
    }
}
