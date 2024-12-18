package X;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.pdf.PdfDocument;
import android.media.ThumbnailUtils;
import android.os.Build;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.JZn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC43825JZn implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public CallableC43825JZn(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x02e4: INVOKE (r1 I:android.database.Cursor) INTERFACE call: android.database.Cursor.close():void A[MD:():void (c)] (LINE:740), block:B:166:0x02e4 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x02e7: INVOKE (r4 I:X.1ov) VIRTUAL call: X.1ov.A00():void A[MD:():void (m)] (LINE:743), block:B:166:0x02e4 */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        Context context;
        String str;
        Bitmap.CompressFormat compressFormat;
        C1YP c1yp;
        Object obj;
        C37581ov c37581ov;
        Cursor A00;
        ArrayList arrayList;
        boolean z2;
        try {
            try {
                switch (this.A00) {
                    case 0:
                        C1823987e c1823987e = (C1823987e) this.A01;
                        c1yp = c1823987e.A01;
                        c1yp.beginTransaction();
                        c1823987e.A00.insert((Iterable) this.A02);
                        c1yp.setTransactionSuccessful();
                        obj = C0eB.A00;
                        return obj;
                    case 1:
                        Context context2 = ((L8D) this.A02).A03;
                        File A002 = AbstractC15860qg.A00(context2, ".png");
                        if (A002 != null) {
                            C1NC.A0K(context2, Bitmap.CompressFormat.PNG, (Bitmap) this.A01, A002);
                            AbstractC50633MWu.A09(context2, A002);
                            z2 = true;
                            return Boolean.valueOf(z2);
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    case 2:
                        File createTempFile = File.createTempFile(AnonymousClass001.A0Q("qrcode_", System.currentTimeMillis()), ".pdf");
                        if (createTempFile != null) {
                            C1F3 A003 = new L76(((L8D) this.A02).A03, LI4.A01(4)).A00(AnonymousClass001.A0e("qrcode_", ".pdf", System.currentTimeMillis()), MSV.A00(921));
                            try {
                                ((PdfDocument) this.A01).writeTo(A003.CHy());
                                z2 = true;
                                return Boolean.valueOf(z2);
                            } finally {
                                A003.AIh();
                                createTempFile.delete();
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    case 3:
                        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = (DirectPrivateStoryRecipientController) this.A01;
                        C3AY c3ay = (C3AY) this.A02;
                        Context requireContext = directPrivateStoryRecipientController.A0w.requireContext();
                        UserSession userSession = directPrivateStoryRecipientController.A0B;
                        android.net.Uri uri = (android.net.Uri) c3ay.A00;
                        String str2 = (String) c3ay.A01;
                        C14360o3.A0B(userSession, 0);
                        C14360o3.A0B(uri, 1);
                        if (!uri.equals(android.net.Uri.EMPTY)) {
                            try {
                                C44059Jdk A004 = C44059Jdk.A00(new B1W(requireContext, uri, userSession, null, null, null, str2).call().A0X, 0);
                                C14360o3.A07(A004);
                                String str3 = A004.A07;
                                C14360o3.A07(str3);
                                long j = A004.A03;
                                ClipInfo A03 = MY3.A03(userSession, str3, j, j);
                                A03.A00 = A03.A09 / A03.A06;
                                String str4 = A03.A0F;
                                if (str4 != null) {
                                    Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str4, 1);
                                    File createTempFile2 = File.createTempFile(MediaStreamTrack.VIDEO_TRACK_KIND, ".jpg", requireContext.getCacheDir());
                                    if (createVideoThumbnail != null) {
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile2);
                                            try {
                                                AbstractC50673MYr.A00(Bitmap.CompressFormat.JPEG, createVideoThumbnail, fileOutputStream);
                                                fileOutputStream.flush();
                                                fileOutputStream.close();
                                                createVideoThumbnail.recycle();
                                            } finally {
                                            }
                                        } catch (Throwable th) {
                                            createVideoThumbnail.recycle();
                                            throw th;
                                        }
                                    }
                                    String path = createTempFile2.getPath();
                                    C14360o3.A07(path);
                                    C47589Kzz c47589Kzz = new C47589Kzz(A03, path);
                                    c47589Kzz.A00.A0B.A00(directPrivateStoryRecipientController.A0A);
                                    return c47589Kzz;
                                }
                                throw new IllegalStateException("Required value was null.");
                            } catch (IOException e) {
                                throw new IOException(StringFormatUtil.formatStrLocaleSafe("DirectExternalMediaShareHelper#getClipInfo failure: %s", e.toString()), e);
                            }
                        }
                        throw new IllegalArgumentException("Video uri is empty");
                    case 4:
                        DirectPrivateStoryRecipientController directPrivateStoryRecipientController2 = (DirectPrivateStoryRecipientController) this.A01;
                        C183978Ee A005 = AbstractC46988Kq7.A00(directPrivateStoryRecipientController2.A0w.requireContext(), (android.net.Uri) this.A02, directPrivateStoryRecipientController2.A0B);
                        A005.A01().A00(directPrivateStoryRecipientController2.A0A);
                        return A005;
                    case 5:
                        AnonymousClass983 anonymousClass983 = (AnonymousClass983) this.A02;
                        Context context3 = anonymousClass983.A02;
                        if (context3 == null) {
                            C14360o3.A0F("context");
                            throw C00O.createAndThrow();
                        }
                        Context applicationContext = context3.getApplicationContext();
                        C14360o3.A07(applicationContext);
                        return AbstractC46988Kq7.A00(applicationContext, (android.net.Uri) this.A01, anonymousClass983.A10);
                    case 6:
                        L3P l3p = (L3P) this.A02;
                        InputStream inputStream = (InputStream) this.A01;
                        String valueOf = String.valueOf(System.nanoTime());
                        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                        int width = decodeStream.getWidth();
                        int height = decodeStream.getHeight();
                        if (width >= 1024 && height >= 1024) {
                            File A04 = AbstractC13530mf.A04(l3p.A00);
                            C14360o3.A07(A04);
                            C1NC.A0M(decodeStream, A04);
                            decodeStream.recycle();
                            String canonicalPath = A04.getCanonicalPath();
                            C14360o3.A07(canonicalPath);
                            return OY4.A00(l3p.A02, valueOf, canonicalPath);
                        }
                        throw new IOException("Image provided is too small", new IllegalArgumentException());
                    case 7:
                        C1YP c1yp2 = ((C2043892u) this.A01).A00;
                        c37581ov = (C37581ov) this.A02;
                        A00 = C3EP.A00(c1yp2, c37581ov, false);
                        arrayList = new ArrayList(A00.getCount());
                        while (A00.moveToNext()) {
                            arrayList.add(A00.getString(0));
                        }
                        A00.close();
                        c37581ov.A00();
                        return arrayList;
                    case 8:
                    case 10:
                    default:
                        C1YP c1yp3 = ((C43612JQv) this.A01).A01;
                        C37581ov A006 = (C37581ov) this.A02;
                        Cursor close = C3EP.A00(c1yp3, A006, false);
                        try {
                            int A01 = AbstractC37601ox.A01(close, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            int A012 = AbstractC37601ox.A01(close, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            int A013 = AbstractC37601ox.A01(close, "data");
                            int A014 = AbstractC37601ox.A01(close, "stored_time");
                            int A015 = AbstractC37601ox.A01(close, "ranking_score");
                            ArrayList arrayList2 = new ArrayList(close.getCount());
                            while (close.moveToNext()) {
                                arrayList2.add(new C126495nk(close.getString(A01), close.getString(A012), close.getBlob(A013), close.getFloat(A015), close.getLong(A014)));
                            }
                            return arrayList2;
                        } finally {
                            close.close();
                            A006.A00();
                        }
                    case 9:
                        C43612JQv c43612JQv = (C43612JQv) this.A01;
                        c1yp = c43612JQv.A01;
                        c1yp.beginTransaction();
                        c43612JQv.A00.insert((Iterable) this.A02);
                        c1yp.setTransactionSuccessful();
                        obj = C0eB.A00;
                        return obj;
                    case 11:
                        L0C l0c = (L0C) this.A01;
                        c1yp = l0c.A01;
                        c1yp.beginTransaction();
                        l0c.A00.insert((Iterable) this.A02);
                        c1yp.setTransactionSuccessful();
                        obj = C0eB.A00;
                        return obj;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        C47915LEj c47915LEj = (C47915LEj) this.A01;
                        c1yp = c47915LEj.A01;
                        c1yp.beginTransaction();
                        obj = c47915LEj.A00.insertAndReturnIdsList((List) this.A02);
                        c1yp.setTransactionSuccessful();
                        return obj;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        C1YP c1yp4 = ((C47915LEj) this.A01).A01;
                        c37581ov = (C37581ov) this.A02;
                        A00 = C3EP.A00(c1yp4, c37581ov, false);
                        arrayList = new ArrayList(A00.getCount());
                        while (A00.moveToNext()) {
                            arrayList.add(A00.getString(0));
                        }
                        A00.close();
                        c37581ov.A00();
                        return arrayList;
                    case 14:
                        StringBuilder sb = new StringBuilder();
                        sb.append("DELETE FROM drafts WHERE id in (");
                        List list = (List) this.A02;
                        AbstractC73723Sa.A00(sb, list.size());
                        sb.append(")");
                        String obj2 = sb.toString();
                        C1YP c1yp5 = ((MXP) this.A01).A02;
                        InterfaceC37561ot compileStatement = c1yp5.compileStatement(obj2);
                        Iterator it = list.iterator();
                        int i = 1;
                        while (it.hasNext()) {
                            compileStatement.ADi(i, ((Number) it.next()).intValue());
                            i++;
                        }
                        c1yp5.beginTransaction();
                        try {
                            compileStatement.ATb();
                            c1yp5.setTransactionSuccessful();
                            return C0eB.A00;
                        } finally {
                            c1yp5.endTransaction();
                        }
                    case Process.SIGTERM /* 15 */:
                        C47773L7v c47773L7v = (C47773L7v) this.A02;
                        try {
                            C121275eQ c121275eQ = new C121275eQ(new CallableC43825JZn(16, this.A01, c47773L7v), 1775937301);
                            c121275eQ.A00 = c47773L7v.A00;
                            C1GJ.A03(c121275eQ);
                        } catch (Exception unused) {
                        }
                        return C0eB.A00;
                    case 16:
                        Context context4 = ((C47773L7v) this.A02).A01;
                        File A007 = AbstractC15860qg.A00(context4, ".png");
                        if (A007 != null) {
                            C1NC.A0K(context4, Bitmap.CompressFormat.PNG, C62Z.A00((InterfaceC137546La) this.A01), A007);
                            AbstractC50633MWu.A09(context4, A007);
                            return A007;
                        }
                        return null;
                    case 17:
                        LJY ljy = (LJY) this.A01;
                        c1yp = ljy.A01;
                        c1yp.beginTransaction();
                        ljy.A00.insert((Iterable) this.A02);
                        c1yp.setTransactionSuccessful();
                        obj = C0eB.A00;
                        return obj;
                    case 18:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("DELETE FROM qs_realtime_signals WHERE signal_id IN (");
                        Collection collection = (Collection) this.A02;
                        AbstractC73723Sa.A00(sb2, collection.size());
                        sb2.append(")");
                        String obj3 = sb2.toString();
                        C1YP c1yp6 = ((LJY) this.A01).A01;
                        InterfaceC37561ot compileStatement2 = c1yp6.compileStatement(obj3);
                        Iterator it2 = collection.iterator();
                        int i2 = 1;
                        while (it2.hasNext()) {
                            compileStatement2.ADp(i2, (String) it2.next());
                            i2++;
                        }
                        c1yp6.beginTransaction();
                        try {
                            compileStatement2.ATb();
                            c1yp6.setTransactionSuccessful();
                            return C0eB.A00;
                        } finally {
                            c1yp6.endTransaction();
                        }
                    case Process.SIGSTOP /* 19 */:
                        if (Build.VERSION.SDK_INT >= 30) {
                            z = true;
                            context = ((LLI) this.A02).A04;
                            str = ".png";
                        } else {
                            z = false;
                            context = ((LLI) this.A02).A04;
                            str = ".jpg";
                        }
                        File A008 = AbstractC15860qg.A00(context, str);
                        if (A008 != null) {
                            Bitmap bitmap = (Bitmap) this.A01;
                            if (z) {
                                compressFormat = Bitmap.CompressFormat.PNG;
                            } else {
                                compressFormat = Bitmap.CompressFormat.JPEG;
                            }
                            C1NC.A0K(context, compressFormat, bitmap, A008);
                            AbstractC50633MWu.A09(context, A008);
                            return true;
                        }
                        return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } finally {
            c1yp.endTransaction();
        }
    }
}
