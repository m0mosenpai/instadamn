package X;

import android.graphics.RectF;
import com.instagram.model.reels.Reel;

/* renamed from: X.GJy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36799GJy implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        if (this.A00 != 0) {
            Reel reel = (Reel) obj;
            C14360o3.A0B(reel, 0);
            C7KE c7ke = (C7KE) this.A04;
            String str = this.A05;
            c7ke.A05.post(new GR8((RectF) this.A02, (InterfaceC11380iw) this.A01, c7ke, reel, (C3G2) this.A03, str, null, null, C16930sl.A00));
            return;
        }
        if (!((EnumC61185Rgl) obj).A01) {
            String str2 = this.A05;
            if (str2.length() > 0) {
                ((C56138Ovy) this.A02).A04(new C35863Fsd((C6FQ) this.A01, (InterfaceC103384lE) this.A04, (InterfaceC103384lE) this.A03, str2), null, AbstractC166987dD.A1J(str2));
                return;
            }
        }
        InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
        C131845xK.A00((C6FQ) this.A01, C6FW.A01, interfaceC103384lE);
    }

    public C36799GJy(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A04 = obj3;
        this.A05 = str;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj4;
    }
}
