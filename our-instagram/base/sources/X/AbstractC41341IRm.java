package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.model.mediatype.ProductType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IRm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41341IRm {
    public static final C75363a3 A01(QuestionMediaResponseModelIntf questionMediaResponseModelIntf) {
        String videoDashManifest;
        float f;
        Integer BRq = questionMediaResponseModelIntf.BRq();
        int i = EnumC40111tc.A0a.A00;
        C88583xH c88583xH = null;
        if (BRq == null || BRq.intValue() != i) {
            return null;
        }
        Integer num = C05F.A01;
        ProductType productType = ProductType.STORY_INTERACTION_RESPONSE;
        List CFe = questionMediaResponseModelIntf.CFe();
        if (CFe != null) {
            SpritesheetInfo C8E = questionMediaResponseModelIntf.C8E();
            boolean z = false;
            if (C8E != null) {
                int A03 = AbstractC31177DnL.A03(C8E.BQ8());
                Float C80 = C8E.C80();
                float f2 = 0.0f;
                if (C80 != null) {
                    f = C80.floatValue();
                } else {
                    f = 0.0f;
                }
                int A0K = AbstractC167017dG.A0K(C8E.C82());
                int A032 = AbstractC31177DnL.A03(C8E.C8D());
                int A033 = AbstractC31177DnL.A03(C8E.C8F());
                Float CFE = C8E.CFE();
                if (CFE != null) {
                    f2 = CFE.floatValue();
                }
                C1H4.A01(f2);
                c88583xH = new C88583xH(C8E.BzQ(), f, A03, A0K, A032, A033);
            }
            ArrayList A00 = AbstractC75353a2.A00(CFe);
            if ((A00 != null && !A00.isEmpty()) || ((videoDashManifest = questionMediaResponseModelIntf.getVideoDashManifest()) != null && videoDashManifest.length() != 0)) {
                z = true;
            }
            String id = questionMediaResponseModelIntf.getId();
            if (id != null) {
                String videoDashManifest2 = questionMediaResponseModelIntf.getVideoDashManifest();
                if (videoDashManifest2 != null) {
                    Integer CSN = questionMediaResponseModelIntf.CSN();
                    if (CSN != null) {
                        String videoCodec = questionMediaResponseModelIntf.getVideoCodec();
                        if (videoCodec != null) {
                            Boolean BB7 = questionMediaResponseModelIntf.BB7();
                            if (BB7 != null) {
                                return new C75363a3(null, productType, c88583xH, BB7, null, num, CSN, id, null, null, videoDashManifest2, null, videoCodec, null, null, null, A00, null, null, -1, -1, 0L, false, false, false, false, false, false, z, false);
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final ExtendedImageUrl A00(Context context, ImageInfo imageInfo, int i, int i2) {
        Integer num;
        AbstractC167017dG.A1N(imageInfo, context);
        if (i2 > 0 && i > 0 && i == i2) {
            num = C05F.A0C;
        } else {
            num = C05F.A01;
        }
        return AbstractC40161tk.A04(imageInfo, num, Math.min(AbstractC13880nE.A0A(context), 1080));
    }
}
