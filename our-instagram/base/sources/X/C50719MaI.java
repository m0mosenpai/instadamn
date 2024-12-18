package X;

import android.media.MediaFormat;
import android.text.TextUtils;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.MaI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50719MaI implements InterfaceC57910PmG {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public String A08;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.MaI, java.lang.Object] */
    public static C50719MaI A00(InterfaceC58105PpU interfaceC58105PpU, String str) {
        String string;
        int i;
        InterfaceC58194Pr0 ALI = interfaceC58105PpU.ALI();
        try {
            ALI.ESw(str);
            MediaFormat mediaFormat = AbstractC50670MYo.A00(ALI).A01;
            ?? obj = new Object();
            if (mediaFormat.containsKey(IgReactMediaPickerNativeModule.HEIGHT)) {
                obj.A05 = mediaFormat.getInteger(IgReactMediaPickerNativeModule.HEIGHT);
                if (mediaFormat.containsKey(IgReactMediaPickerNativeModule.WIDTH)) {
                    obj.A07 = mediaFormat.getInteger(IgReactMediaPickerNativeModule.WIDTH);
                    if (mediaFormat.containsKey("frame-rate")) {
                        obj.A04 = mediaFormat.getInteger("frame-rate");
                        if (mediaFormat.containsKey("durationUs")) {
                            mediaFormat.getLong("durationUs");
                            if (mediaFormat.containsKey("rotation-degrees")) {
                                obj.A06 = mediaFormat.getInteger("rotation-degrees");
                            } else if (mediaFormat.containsKey("rotation")) {
                                obj.A06 = mediaFormat.getInteger("rotation");
                            } else {
                                obj.A06 = 0;
                            }
                            if (mediaFormat.containsKey("mime") && (string = mediaFormat.getString("mime")) != null) {
                                obj.A08 = string;
                                if (mediaFormat.containsKey("profile")) {
                                    obj.A03 = mediaFormat.getInteger("profile");
                                    if (mediaFormat.containsKey("color-transfer")) {
                                        obj.A00 = mediaFormat.getInteger("color-range");
                                        obj.A02 = mediaFormat.getInteger("color-transfer");
                                        i = mediaFormat.getInteger("color-standard");
                                    } else {
                                        obj.A00 = 2;
                                        obj.A02 = 3;
                                        i = 1;
                                    }
                                    obj.A01 = i;
                                    return obj;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        } catch (C52036N0k | C52040N0o | IOException unused) {
            return null;
        } finally {
            ALI.release();
        }
    }

    @Override // X.InterfaceC57910PmG
    public final boolean CTw(InterfaceC57910PmG interfaceC57910PmG) {
        if (!(interfaceC57910PmG instanceof C50719MaI)) {
            return false;
        }
        C50719MaI c50719MaI = (C50719MaI) interfaceC57910PmG;
        if (this.A05 != c50719MaI.A05 || this.A07 != c50719MaI.A07 || this.A06 != c50719MaI.A06 || this.A03 != c50719MaI.A03 || this.A02 != c50719MaI.A02 || !TextUtils.equals(this.A08, c50719MaI.A08)) {
            return false;
        }
        return true;
    }
}
