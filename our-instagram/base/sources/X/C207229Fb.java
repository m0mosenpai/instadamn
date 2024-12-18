package X;

import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.Arrays;

/* renamed from: X.9Fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207229Fb extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207229Fb(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A05 = obj;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            Object obj = this.A03;
            C14360o3.A0C(obj, AbstractC43591JPw.A00(46));
            MediaFrameLayout mediaFrameLayout = ((C143556du) obj).A1p;
            String format = String.format("Story Position %d Item %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(((C41551w4) this.A04).A03(((C146226iL) this.A05).A07, (C41181vS) this.A02))}, 2));
            C14360o3.A07(format);
            mediaFrameLayout.setContentDescription(format);
        } else {
            C183328Bf c183328Bf = (C183328Bf) this.A05;
            C115475Kh c115475Kh = (C115475Kh) this.A04;
            int i = this.A01;
            C8Ba c8Ba = (C8Ba) this.A02;
            C183328Bf.A01(c183328Bf, c8Ba, c115475Kh, (String) new C206899Du(c8Ba, 49).invoke(c115475Kh), new C9GQ(c183328Bf, 5), (InterfaceC16620sF) this.A03, null, i, false, true);
        }
        return C0eB.A00;
    }
}
