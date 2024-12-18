package X;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.StJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63763StJ implements InterfaceC65570Tn3 {
    public Object A00;
    public final ContentResolver A01;
    public final android.net.Uri A02;

    @Override // X.InterfaceC65570Tn3
    public final void cancel() {
    }

    @Override // X.InterfaceC65570Tn3
    public final Integer Avo() {
        return C05F.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[Catch: FileNotFoundException -> 0x0072, TryCatch #0 {FileNotFoundException -> 0x0072, blocks: (B:2:0x0000, B:4:0x0008, B:10:0x0018, B:12:0x0032, B:13:0x003c, B:15:0x004d, B:17:0x002b, B:18:0x001d, B:20:0x0023, B:21:0x002a, B:22:0x003d, B:24:0x0041, B:26:0x0049, B:27:0x0067, B:28:0x0071, B:29:0x0053, B:31:0x005b, B:32:0x0065), top: B:1:0x0000 }] */
    @Override // X.InterfaceC65570Tn3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ChQ(X.EnumC61107RfN r6, X.InterfaceC65471Tko r7) {
        /*
            r5 = this;
            android.net.Uri r2 = r5.A02     // Catch: java.io.FileNotFoundException -> L72
            android.content.ContentResolver r4 = r5.A01     // Catch: java.io.FileNotFoundException -> L72
            boolean r0 = r5 instanceof X.QBA     // Catch: java.io.FileNotFoundException -> L72
            if (r0 == 0) goto L3d
            r3 = r2
            android.content.UriMatcher r0 = X.QBA.A00     // Catch: java.io.FileNotFoundException -> L72
            int r1 = r0.match(r2)     // Catch: java.io.FileNotFoundException -> L72
            r0 = 1
            if (r1 == r0) goto L1d
            r0 = 3
            if (r1 == r0) goto L2b
            r0 = 5
            if (r1 == r0) goto L1d
            java.io.InputStream r0 = r4.openInputStream(r2)     // Catch: java.io.FileNotFoundException -> L72
            goto L30
        L1d:
            android.net.Uri r3 = android.provider.ContactsContract.Contacts.lookupContact(r4, r2)     // Catch: java.io.FileNotFoundException -> L72
            if (r3 != 0) goto L2b
            java.lang.String r1 = "Contact cannot be found"
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L72
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> L72
            throw r0     // Catch: java.io.FileNotFoundException -> L72
        L2b:
            r0 = 1
            java.io.InputStream r0 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r4, r3, r0)     // Catch: java.io.FileNotFoundException -> L72
        L30:
            if (r0 != 0) goto L4d
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()     // Catch: java.io.FileNotFoundException -> L72
            java.lang.String r0 = "InputStream is null for "
            java.io.FileNotFoundException r0 = X.AbstractC58323PtF.A0c(r2, r0, r1)     // Catch: java.io.FileNotFoundException -> L72
            throw r0     // Catch: java.io.FileNotFoundException -> L72
        L3d:
            boolean r0 = r5 instanceof X.QB9     // Catch: java.io.FileNotFoundException -> L72
            if (r0 == 0) goto L53
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r0 = r4.openAssetFileDescriptor(r2, r0)     // Catch: java.io.FileNotFoundException -> L72
            if (r0 == 0) goto L67
            android.os.ParcelFileDescriptor r0 = r0.getParcelFileDescriptor()     // Catch: java.io.FileNotFoundException -> L72
        L4d:
            r5.A00 = r0     // Catch: java.io.FileNotFoundException -> L72
            r7.D9H(r0)     // Catch: java.io.FileNotFoundException -> L72
            goto L66
        L53:
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r0 = r4.openAssetFileDescriptor(r2, r0)     // Catch: java.io.FileNotFoundException -> L72
            if (r0 != 0) goto L4d
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()     // Catch: java.io.FileNotFoundException -> L72
            java.lang.String r0 = "FileDescriptor is null for: "
            java.io.FileNotFoundException r0 = X.AbstractC58323PtF.A0c(r2, r0, r1)     // Catch: java.io.FileNotFoundException -> L72
            throw r0     // Catch: java.io.FileNotFoundException -> L72
        L66:
            return
        L67:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()     // Catch: java.io.FileNotFoundException -> L72
            java.lang.String r0 = "FileDescriptor is null for: "
            java.io.FileNotFoundException r0 = X.AbstractC58323PtF.A0c(r2, r0, r1)     // Catch: java.io.FileNotFoundException -> L72
            throw r0     // Catch: java.io.FileNotFoundException -> L72
        L72:
            r2 = move-exception
            r1 = 3
            java.lang.String r0 = "LocalUriFetcher"
            android.util.Log.isLoggable(r0, r1)
            r7.DPj(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63763StJ.ChQ(X.RfN, X.Tko):void");
    }

    @Override // X.InterfaceC65570Tn3
    public final void cleanup() {
        Object obj = this.A00;
        if (obj != null) {
            try {
                if (this instanceof QBA) {
                    ((InputStream) obj).close();
                } else if (this instanceof QB9) {
                    ((ParcelFileDescriptor) obj).close();
                } else {
                    ((AssetFileDescriptor) obj).close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public AbstractC63763StJ(ContentResolver contentResolver, android.net.Uri uri) {
        this.A01 = contentResolver;
        this.A02 = uri;
    }
}
