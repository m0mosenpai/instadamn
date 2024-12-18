package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.IoV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42307IoV implements InterfaceC66482zP {
    public final C38623GyQ A00;
    public final IHI A01;

    public C42307IoV(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, String str, String str2, List list, List list2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC37302Gc3.A1U(list, list2);
        C38623GyQ c38623GyQ = new C38623GyQ(imageUrl, str, str2, list, list2);
        IHI ihi = new IHI(interfaceC11380iw, interfaceC16820sZ, interfaceC16660sJ);
        this.A00 = c38623GyQ;
        this.A01 = ihi;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "checker_tile";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C38623GyQ c38623GyQ;
        C42307IoV c42307IoV = (C42307IoV) obj;
        C38623GyQ c38623GyQ2 = this.A00;
        if (c42307IoV != null) {
            c38623GyQ = c42307IoV.A00;
        } else {
            c38623GyQ = null;
        }
        return C14360o3.A0K(c38623GyQ2, c38623GyQ);
    }
}
