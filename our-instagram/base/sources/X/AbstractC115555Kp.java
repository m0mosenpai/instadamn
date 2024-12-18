package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5Kp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115555Kp {
    public static C115525Km parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C115525Km c115525Km = new C115525Km();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                if ("file_path".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    c115525Km.A0F = str;
                } else if ("original_file_path".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c115525Km.A0G = str2;
                } else if ("cover_thumbnail_path".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    c115525Km.A0E = str3;
                } else if ("date_taken".equals(A0q)) {
                    c115525Km.A0A = c16l.A0y();
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    c115525Km.A09 = c16l.A1D();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    c115525Km.A05 = c16l.A1D();
                } else if ("colorTransfer".equals(A0q)) {
                    c115525Km.A01 = c16l.A1D();
                } else if ("orientation".equals(A0q)) {
                    c115525Km.A07 = c16l.A1D();
                } else if ("camera_position".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    c115525Km.A0D = str4;
                } else if ("camera_id".equals(A0q)) {
                    c115525Km.A00 = c16l.A1D();
                } else if ("origin".equals(A0q)) {
                    c115525Km.A08 = c16l.A1D();
                } else if ("duration_ms".equals(A0q)) {
                    c115525Km.A04 = c16l.A1D();
                } else if ("trim_start_time_ms".equals(A0q)) {
                    c115525Km.A03 = c16l.A1D();
                } else if ("trim_end_time_ms".equals(A0q)) {
                    c115525Km.A02 = c16l.A1D();
                } else if ("original_media_folder".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str5 = c16l.A1P();
                    }
                    c115525Km.A0H = str5;
                } else if ("in_flight_video_calculated_duration_ms".equals(A0q)) {
                    c115525Km.A06 = c16l.A1D();
                } else if ("media_upload_metadata".equals(A0q)) {
                    MediaUploadMetadata parseFromJson = AbstractC93554Hv.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c115525Km.A0B = parseFromJson;
                } else if ("was_photo".equals(A0q)) {
                    c115525Km.A0K = c16l.A0d();
                } else if ("source_photo_file_path".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str6 = c16l.A1P();
                    }
                    c115525Km.A0I = str6;
                } else if ("external_media_segment_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C51743MtS parseFromJson2 = AbstractC23030ADm.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c115525Km.A0J = arrayList;
                } else if ("is_remix".equals(A0q)) {
                    c115525Km.A0C = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (c115525Km.A0F != null) {
                if (c115525Km.A06 == -1) {
                    c115525Km.A06 = c115525Km.A02 - c115525Km.A03;
                    return c115525Km;
                }
                return c115525Km;
            }
            throw new IOException("File path cannot be null in source video");
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
