package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.Map;

/* renamed from: X.2Zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51842Zh extends C2ZT {
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51842Zh(long j, String str, String str2) {
        super(j, str);
        C14360o3.A0B(str2, 3);
        this.A00 = str2;
    }

    @Override // X.C2ZT
    public final int A00() {
        return 0;
    }

    @Override // X.C2ZT
    public final String A03() {
        return "undefined";
    }

    @Override // X.C2ZT
    public final void A05(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        sb.append(this.A00);
        sb.append("|");
    }

    @Override // X.C2ZT
    public final Map A04() {
        return AbstractC16850sd.A0M(new C09530e4(DevServerEntity.COLUMN_DESCRIPTION, this.A00));
    }

    @Override // X.C2ZT
    public final String A01() {
        return AnonymousClass001.A0S("undefined(", this.A00, ')');
    }

    @Override // X.C2ZT
    public final String A02() {
        return AnonymousClass001.A0S("user interacted with the app (", this.A00, ')');
    }
}
