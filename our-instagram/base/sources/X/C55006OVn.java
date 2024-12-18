package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.LinkedList;

/* renamed from: X.OVn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55006OVn {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC58147PqC A02;
    public final Integer A03;
    public final LinkedList A04 = new LinkedList();

    public static final void A00(C55006OVn c55006OVn, OWX owx) {
        String str;
        String str2;
        String str3 = owx.A02.A04;
        File A11 = AbstractC166987dD.A11(str3);
        String name = A11.getName();
        C14360o3.A0A(name);
        String substring = TextUtils.substring(name, 0, AbstractC50522MSa.A0A(name));
        ContentValues contentValues = new ContentValues();
        contentValues.put(DialogModule.KEY_TITLE, substring);
        contentValues.put("_display_name", name);
        contentValues.put("datetaken", AbstractC31173DnH.A0g());
        String A00 = AbstractC13570mj.A00(name);
        if (A00 == null) {
            A00 = "unknown";
        }
        contentValues.put("mime_type", A00);
        contentValues.put("_size", Long.valueOf(A11.length()));
        owx.A02(c55006OVn.A01);
        Context context = c55006OVn.A00;
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT <= 29) {
            contentValues.put("_data", str3);
            try {
                contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                return;
            } catch (Exception e) {
                e = e;
                str = "ImageRendererSaveHelper";
                str2 = "Save photo failed (legacy)";
            }
        } else {
            contentValues.put("relative_path", AbstractC15860qg.A03(context));
            try {
                android.net.Uri insert = contentResolver.insert(MediaStore.Images.Media.getContentUri("external"), contentValues);
                if (insert != null) {
                    contentResolver.update(insert, contentValues, null, null);
                    return;
                } else {
                    AbstractC12120kG.A0D("ImageRendererSaveHelper", "Save photo failed (11+): could not update file metadata", null);
                    return;
                }
            } catch (Exception e2) {
                e = e2;
                str = "ImageRendererSaveHelper";
                str2 = "Save photo failed (11+)";
            }
        }
        AbstractC12120kG.A0D(str, str2, e);
    }

    public C55006OVn(Context context, UserSession userSession, InterfaceC58147PqC interfaceC58147PqC, Integer num) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = interfaceC58147PqC;
        this.A03 = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a2, code lost:
    
        if (X.C18U.A06(r1, r0, r2) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (r14 == r11) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0179, code lost:
    
        if (r6.intValue() > 0) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OA9 A01(android.graphics.Bitmap r28, X.OA8 r29, X.O7U r30, X.OEN r31, int r32, int r33, int r34, int r35, int r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55006OVn.A01(android.graphics.Bitmap, X.OA8, X.O7U, X.OEN, int, int, int, int, int, boolean, boolean):X.OA9");
    }
}
