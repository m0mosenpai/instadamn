package X;

import com.instagram.model.keyword.Keyword;
import java.util.List;

/* renamed from: X.5z6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132835z6 {
    public EnumC127875qG A00;
    public Keyword A01;
    public Integer A02;
    public String A03;
    public String A04;
    public List A05;

    public C132835z6() {
        Integer num = C05F.A01;
        EnumC127875qG enumC127875qG = EnumC127875qG.A05;
        this.A03 = "";
        this.A05 = null;
        this.A02 = num;
        this.A00 = enumC127875qG;
        this.A04 = "midscroll_pivot";
    }

    public final Keyword A00() {
        Keyword keyword = this.A01;
        if (keyword != null) {
            return keyword;
        }
        C14360o3.A0F("keyword");
        throw C00O.createAndThrow();
    }

    public final Integer A01() {
        if (this.A00 == EnumC127875qG.A05) {
            return C05F.A1F;
        }
        return C05F.A1I;
    }
}
