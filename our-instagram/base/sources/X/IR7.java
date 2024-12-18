package X;

import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.api.schemas.StoryAdKeywordTypeEnum;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IR7 {
    public static C110864yy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("keywords".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38816H7g parseFromJson = I38.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("model_version".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C110864yy(arrayList, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C110864yy c110864yy) {
        anonymousClass182.A0d();
        List list = c110864yy.A01;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "keywords", list);
            while (A0q.hasNext()) {
                JMQ jmq = (JMQ) A0q.next();
                if (jmq != null) {
                    C38816H7g F5l = jmq.F5l();
                    anonymousClass182.A0d();
                    Integer num = F5l.A02;
                    if (num != null) {
                        anonymousClass182.A0Q("end_index", num.intValue());
                    }
                    String str = F5l.A04;
                    if (str != null) {
                        anonymousClass182.A0S("keyword_background_color", str);
                    }
                    String str2 = F5l.A05;
                    if (str2 != null) {
                        anonymousClass182.A0S("keyword_color", str2);
                    }
                    StoryAdKeywordStyleEnum storyAdKeywordStyleEnum = F5l.A00;
                    if (storyAdKeywordStyleEnum != null) {
                        anonymousClass182.A0S("keyword_style", storyAdKeywordStyleEnum.A00);
                    }
                    StoryAdKeywordTypeEnum storyAdKeywordTypeEnum = F5l.A01;
                    if (storyAdKeywordTypeEnum != null) {
                        anonymousClass182.A0S("keyword_type", storyAdKeywordTypeEnum.A00);
                    }
                    Integer num2 = F5l.A03;
                    if (num2 != null) {
                        anonymousClass182.A0Q("start_index", num2.intValue());
                    }
                    String str3 = F5l.A06;
                    if (str3 != null) {
                        anonymousClass182.A0S("token", str3);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        String str4 = c110864yy.A00;
        if (str4 != null) {
            anonymousClass182.A0S("model_version", str4);
        }
        anonymousClass182.A0a();
    }
}
