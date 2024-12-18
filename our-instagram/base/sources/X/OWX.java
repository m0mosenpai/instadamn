package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.util.creation.RenderBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class OWX {
    public final int A00;
    public final int A01;
    public final OEN A02;
    public final int A03;
    public final int A04;
    public final Bitmap A05;
    public final String A06;

    public final void A01(ContentResolver contentResolver, UserSession userSession, String str) {
        String str2 = this.A02.A04;
        File A11 = AbstractC166987dD.A11(str2);
        String name = A11.getName();
        C14360o3.A0A(name);
        C09530e4 A1L = AbstractC166987dD.A1L(DialogModule.KEY_TITLE, TextUtils.substring(name, 0, AbstractC50522MSa.A0A(name)));
        C09530e4 A1L2 = AbstractC166987dD.A1L("_display_name", name);
        C09530e4 A1L3 = AbstractC166987dD.A1L("datetaken", AbstractC31173DnH.A0g());
        String A00 = AbstractC13570mj.A00(name);
        if (A00 == null) {
            A00 = "unknown";
        }
        C09530e4[] c09530e4Arr = {A1L, A1L2, A1L3, AbstractC166987dD.A1L("mime_type", A00), AbstractC166987dD.A1L("_size", Long.valueOf(A11.length()))};
        ContentValues contentValues = new ContentValues(5);
        int i = 0;
        do {
            C09530e4 c09530e4 = c09530e4Arr[i];
            String str3 = (String) c09530e4.A00;
            Object obj = c09530e4.A01;
            if (obj == null) {
                contentValues.putNull(str3);
            } else if (obj instanceof String) {
                contentValues.put(str3, (String) obj);
            } else if (obj instanceof Integer) {
                contentValues.put(str3, (Integer) obj);
            } else if (obj instanceof Long) {
                contentValues.put(str3, (Long) obj);
            } else if (obj instanceof Boolean) {
                contentValues.put(str3, (Boolean) obj);
            } else if (obj instanceof Float) {
                contentValues.put(str3, (Float) obj);
            } else if (obj instanceof Double) {
                contentValues.put(str3, (Double) obj);
            } else if (obj instanceof byte[]) {
                contentValues.put(str3, (byte[]) obj);
            } else if (obj instanceof Byte) {
                contentValues.put(str3, (Byte) obj);
            } else if (obj instanceof Short) {
                contentValues.put(str3, (Short) obj);
            } else {
                throw AbstractC166987dD.A12(AnonymousClass001.A0v("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str3, '\"'));
            }
            i++;
        } while (i < 5);
        if (Build.VERSION.SDK_INT >= 29) {
            A00(contentResolver, contentValues, userSession, str);
            return;
        }
        A02(userSession);
        contentValues.put("_data", str2);
        try {
            contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        } catch (Exception e) {
            AbstractC12120kG.A0D("SavePhotoUtil_ScopedStorage", "Save photo to MediaStore failed (legacy)", e);
        }
    }

    public final boolean A02(UserSession userSession) {
        Bitmap bitmap;
        FileOutputStream A0x;
        Bitmap.CompressFormat compressFormat;
        C14360o3.A0B(userSession, 0);
        String str = this.A06;
        int hashCode = str.hashCode();
        boolean z = true;
        if (hashCode != -1487464693) {
            if (hashCode != -1487394660) {
                if (hashCode == -1487018032 && str.equals("image/webp")) {
                    Bitmap bitmap2 = this.A05;
                    if (bitmap2 != null) {
                        try {
                            String str2 = this.A02.A04;
                            A0x = MSW.A0x(AbstractC166987dD.A11(str2));
                            try {
                                if (Build.VERSION.SDK_INT >= 30) {
                                    if (C18U.A06(C06090Tz.A05, userSession, 36327812643437447L)) {
                                        compressFormat = Bitmap.CompressFormat.WEBP_LOSSLESS;
                                    } else {
                                        compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
                                    }
                                } else {
                                    compressFormat = Bitmap.CompressFormat.WEBP;
                                }
                                int i = this.A01;
                                C0fK.A01(compressFormat, bitmap2, i);
                                if (!bitmap2.compress(compressFormat, i, A0x)) {
                                    C0f5 AEp = C18950wb.A01.AEp("bitmap_compress_error", 817892527);
                                    AEp.ABW("path", str2);
                                    AEp.report();
                                    A0x.close();
                                } else {
                                    A0x.close();
                                    return true;
                                }
                            } finally {
                            }
                        } catch (IOException e) {
                            AbstractC12120kG.A0D("webp_image_local_save_error", "saveWebpToFile failed", e);
                        }
                    }
                    return false;
                }
            } else if (str.equals("image/jpeg")) {
                int i2 = this.A00;
                if (i2 != -1) {
                    RenderBridge.mirrorImage(i2);
                    OEN oen = this.A02;
                    if (RenderBridge.saveAndClearCachedImageFull(i2, oen.A04, false, false, this.A01, C18U.A06(C06090Tz.A05, userSession, 36313278472783729L), false) != -1) {
                        return true;
                    }
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Failure writing ");
                    A1C.append(oen.A02);
                    AbstractC12120kG.A0D("SavePhotoUtil_save_jpeg_error", AbstractC166997dE.A0x(" image to file", A1C), null);
                }
                Bitmap bitmap3 = this.A05;
                if (bitmap3 != null) {
                    try {
                        String str3 = this.A02.A04;
                        A0x = MSW.A0x(AbstractC166987dD.A11(str3));
                        try {
                            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.JPEG;
                            int i3 = this.A01;
                            C0fK.A01(compressFormat2, bitmap3, i3);
                            if (!bitmap3.compress(compressFormat2, i3, A0x)) {
                                C0f5 AEp2 = C18950wb.A01.AEp("bitmap_compress_error", 817901427);
                                AEp2.ABW("path", str3);
                                AEp2.report();
                                A0x.close();
                            } else {
                                A0x.close();
                                return true;
                            }
                        } finally {
                        }
                    } catch (IOException e2) {
                        AbstractC12120kG.A0D("jpeg_image_local_save_error", "", e2);
                        C0K8.A0C("UltraHDR", "jpeg_image_local_save_error");
                    }
                }
                return false;
            }
        } else if (str.equals("image/heic")) {
            boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36317697994855906L);
            if (A06) {
                bitmap = AbstractC54877OOp.A00(this.A00, this.A04, this.A03);
            } else {
                bitmap = this.A05;
            }
            if (bitmap != null) {
                try {
                    C2ST.A00(AbstractC43592JPx.A0W(C12L.A00, 207111648), new C57173PZr(bitmap, userSession, this, (InterfaceC23621Ds) null, this.A01));
                } catch (Exception e3) {
                    EnumC12410kj enumC12410kj = EnumC12410kj.A03;
                    String message = e3.getMessage();
                    if (message == null) {
                        message = "null";
                    }
                    C0w9.A02(enumC12410kj, "heic_image_upload_error", message, e3);
                    C0K8.A0F("SavePhotoUtil", "heic_image_upload_error", e3);
                }
                if (!A06 && bitmap != null) {
                    bitmap.recycle();
                    return z;
                }
            }
            z = false;
            return !A06 ? z : z;
        }
        AbstractC12120kG.A0D("jpeg_bitmap_compress_error", "No image to save", null);
        return false;
    }

    private final void A00(ContentResolver contentResolver, ContentValues contentValues, UserSession userSession, String str) {
        contentValues.put("relative_path", str);
        contentValues.put("is_pending", (Integer) 1);
        try {
            android.net.Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (insert != null) {
                A02(userSession);
                contentValues.clear();
                contentValues.put("is_pending", AbstractC25227BEk.A0p());
                contentResolver.update(insert, contentValues, null, null);
                return;
            }
            AbstractC12120kG.A0D("SavePhotoUtil_ScopedStorage", "Save photo failed (11+): could not get file URI", null);
        } catch (Exception e) {
            AbstractC12120kG.A0D("SavePhotoUtil_ScopedStorage", "Save photo failed (11+)", e);
        }
    }

    public OWX(Bitmap bitmap, OEN oen, String str, int i, int i2, int i3, int i4) {
        this.A04 = i;
        this.A03 = i2;
        this.A02 = oen;
        this.A01 = i3;
        this.A05 = bitmap;
        this.A00 = i4;
        this.A06 = str;
    }
}
