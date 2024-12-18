package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4nI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104524nI implements InterfaceC104454nB {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final C104544nK A03;
    public final AbstractC104504nG A04;
    public final Map A05;
    public final java.util.Set A06;
    public final InterfaceC09390do A07;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.4nK, java.lang.Object] */
    public C104524nI(UserSession userSession, EnumC104514nH enumC104514nH, AbstractC104504nG abstractC104504nG, int i, int i2) {
        this.A06 = AbstractC16830sb.A07(new C09530e4(enumC104514nH, EnumC104534nJ.A05), new C09530e4(enumC104514nH, EnumC104534nJ.A04), new C09530e4(enumC104514nH, EnumC104534nJ.A02), new C09530e4(enumC104514nH, EnumC104534nJ.A03));
        this.A02 = userSession;
        this.A04 = abstractC104504nG;
        this.A01 = i;
        this.A00 = i2;
        int A02 = abstractC104504nG.A02();
        ?? obj = new Object();
        obj.A00 = A02;
        this.A03 = obj;
        this.A05 = new LinkedHashMap();
        this.A07 = AbstractC09440dt.A01(new C206839Do(this, 6));
    }

    @Override // X.InterfaceC104454nB
    public final int BOC(boolean z) {
        if (z) {
            return this.A03.A00;
        }
        return ((Number) this.A07.getValue()).intValue();
    }
}
