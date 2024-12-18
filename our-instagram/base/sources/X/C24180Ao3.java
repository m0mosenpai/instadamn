package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.MediaStore;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.regex.Pattern;

/* renamed from: X.Ao3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24180Ao3 implements BCF {
    public ContentResolver A00;
    public Cursor A01;
    public boolean A02;
    public final int A03;
    public final android.net.Uri A04;
    public final String A05;
    public final C223016j A06;
    public static final String[] A08 = {"image/jpeg", "image/png", "image/gif"};
    public static final String[] A09 = {"_id", "_data", "datetaken", "mini_thumb_magic", "orientation", DialogModule.KEY_TITLE, "mime_type", "date_modified"};
    public static final Pattern A07 = Pattern.compile("(.*)/\\d+");

    public static final synchronized Cursor A00(C24180Ao3 c24180Ao3) {
        Cursor cursor;
        synchronized (c24180Ao3) {
            Cursor cursor2 = c24180Ao3.A01;
            if (cursor2 != null && c24180Ao3.A02) {
                cursor2.requery();
                c24180Ao3.A02 = false;
            }
            cursor = c24180Ao3.A01;
        }
        return cursor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (X.C14360o3.A0K(r4, r2) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        r5 = r15.A06;
        r4 = java.lang.Integer.valueOf(r4);
        r9 = (X.C24176Anz) r5.A02(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        r12 = r6.getString(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r12 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        r14 = r6.getString(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        if (r14 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        if (r14.length() != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        if (r6.getLong(2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        r6.getLong(7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        r10 = r15.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
    
        if (r10 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:
    
        r0 = r6.getLong(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        if (android.content.ContentUris.parseId(r11) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b9, code lost:
    
        X.C0K8.A0C("ImageList", "id mismatch");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
    
        r11 = android.content.ContentUris.withAppendedId(r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e7, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
    
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    @Override // X.BCF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC197178nn BGe(android.net.Uri r16) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24180Ao3.BGe(android.net.Uri):X.8nn");
    }

    public C24180Ao3(ContentResolver contentResolver, android.net.Uri uri, String str, int i) {
        String str2;
        String[] strArr;
        String str3;
        this.A00 = contentResolver;
        this.A04 = uri;
        this.A03 = i;
        this.A05 = str;
        C223016j c223016j = new C223016j(512);
        this.A06 = c223016j;
        ContentResolver contentResolver2 = this.A00;
        if (contentResolver2 != null) {
            android.net.Uri uri2 = this.A04;
            String[] strArr2 = A09;
            String str4 = this.A05;
            if (str4 == null) {
                str2 = "(mime_type in (?, ?, ?))";
            } else {
                str2 = "(mime_type in (?, ?, ?)) AND bucket_id = ?";
            }
            String[] strArr3 = A08;
            if (str4 != null) {
                strArr = new String[4];
                System.arraycopy(strArr3, 0, strArr, 0, 3);
                strArr[3] = str4;
            } else {
                strArr = strArr3;
            }
            if (this.A03 == 1) {
                str3 = " ASC";
            } else {
                str3 = " DESC";
            }
            Cursor query = MediaStore.Images.Media.query(contentResolver2, uri2, strArr2, str2, strArr, AnonymousClass001.A0u("case ifnull(datetaken,0) when 0 then date_modified*1000 else datetaken end", str3, ", _id", str3));
            C14360o3.A07(query);
            this.A01 = query;
            c223016j.A05(-1);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
