package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;

/* renamed from: X.Nsv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53922Nsv {
    public static final GenAIToolInfoDict A00(OTK otk) {
        OUP oup = otk.A01;
        String str = oup.A00;
        String str2 = oup.A01;
        String str3 = oup.A02;
        String str4 = oup.A06;
        CameraTool cameraTool = otk.A00;
        String str5 = oup.A07;
        return new GenAIToolInfoDict(cameraTool, str, str2, str3, oup.A03, oup.A04, oup.A05, str4, str5);
    }
}
