package X;

import com.instagram.api.schemas.IGAdProfileProductTabDictImpl;
import com.instagram.api.schemas.IGAdProfileProductTabFeatureModeEnum;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Eun, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33699Eun {
    public static IGAdProfileProductTabDictImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IGAdProfileProductTabFeatureModeEnum iGAdProfileProductTabFeatureModeEnum = null;
            Boolean bool = null;
            Boolean bool2 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("feature_mode".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGAdProfileProductTabFeatureModeEnum = (IGAdProfileProductTabFeatureModeEnum) IGAdProfileProductTabFeatureModeEnum.A01.get(A1P);
                    if (iGAdProfileProductTabFeatureModeEnum == null) {
                        iGAdProfileProductTabFeatureModeEnum = IGAdProfileProductTabFeatureModeEnum.A07;
                    }
                } else if ("is_price_eligible".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (MSV.A00(232).equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("products".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ProductDetailsProductItemDict parseFromJson = AbstractC111134zU.parseFromJson(c16l);
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
            return new IGAdProfileProductTabDictImpl(iGAdProfileProductTabFeatureModeEnum, bool, bool2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
