package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.Ds3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31459Ds3 implements InterfaceC66482zP {
    public final int A00;
    public final DirectShareTarget A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C31459Ds3(DirectShareTarget directShareTarget, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(directShareTarget, 1);
        String A08 = directShareTarget.A08();
        this.A02 = A08 == null ? AbstractC31173DnH.A0o(directShareTarget) : A08;
        this.A01 = directShareTarget;
        this.A00 = i;
        this.A08 = z;
        this.A05 = z2;
        this.A03 = list;
        this.A04 = z3;
        this.A06 = z4;
        this.A07 = z5;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C31459Ds3 c31459Ds3 = (C31459Ds3) obj;
        C14360o3.A0B(c31459Ds3, 0);
        return C14360o3.A0K(this.A01, c31459Ds3.A01);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }
}
