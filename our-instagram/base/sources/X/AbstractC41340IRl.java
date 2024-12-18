package X;

import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.model.mediasize.SpritesheetInfoImpl;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IRl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41340IRl {
    public static QuestionMediaResponseModel parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            ImageInfoImpl imageInfoImpl = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            SpritesheetInfoImpl spritesheetInfoImpl = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_audio".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("image_versions2".equals(A0s)) {
                    imageInfoImpl = AbstractC39101rj.parseFromJson(c16l);
                } else if ("is_dash_eligible".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1O(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("original_height".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("original_width".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("thumbnails".equals(A0s)) {
                    spritesheetInfoImpl = AbstractC88323wj.parseFromJson(c16l);
                } else if ("video_codec".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("video_dash_manifest".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("video_path".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("video_versions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            VideoVersion parseFromJson = AbstractC40001tP.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new QuestionMediaResponseModel(imageInfoImpl, spritesheetInfoImpl, bool, num, num2, num3, num4, str, str2, str3, str4, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, QuestionMediaResponseModel questionMediaResponseModel) {
        anonymousClass182.A0d();
        Boolean bool = questionMediaResponseModel.A02;
        if (bool != null) {
            anonymousClass182.A0T("has_audio", bool.booleanValue());
        }
        AbstractC37301Gc2.A1D(anonymousClass182, questionMediaResponseModel.A07);
        AbstractC37303Gc4.A13(anonymousClass182, questionMediaResponseModel.A00);
        Integer num = questionMediaResponseModel.A03;
        if (num != null) {
            anonymousClass182.A0Q("is_dash_eligible", num.intValue());
        }
        Integer num2 = questionMediaResponseModel.A04;
        if (num2 != null) {
            anonymousClass182.A0Q("media_type", num2.intValue());
        }
        Integer num3 = questionMediaResponseModel.A05;
        if (num3 != null) {
            anonymousClass182.A0Q("original_height", num3.intValue());
        }
        Integer num4 = questionMediaResponseModel.A06;
        if (num4 != null) {
            anonymousClass182.A0Q("original_width", num4.intValue());
        }
        SpritesheetInfo spritesheetInfo = questionMediaResponseModel.A01;
        if (spritesheetInfo != null) {
            anonymousClass182.A0r("thumbnails");
            AbstractC88323wj.A00(anonymousClass182, spritesheetInfo.F5D());
        }
        String str = questionMediaResponseModel.A08;
        if (str != null) {
            anonymousClass182.A0S("video_codec", str);
        }
        String str2 = questionMediaResponseModel.A09;
        if (str2 != null) {
            anonymousClass182.A0S("video_dash_manifest", str2);
        }
        String str3 = questionMediaResponseModel.A0A;
        if (str3 != null) {
            anonymousClass182.A0S("video_path", str3);
        }
        List list = questionMediaResponseModel.A0B;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "video_versions", list);
            while (A0q.hasNext()) {
                VideoVersion videoVersion = (VideoVersion) A0q.next();
                if (videoVersion != null) {
                    AbstractC40001tP.A00(anonymousClass182, videoVersion);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
