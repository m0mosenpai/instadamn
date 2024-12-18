package X;

import android.graphics.RectF;
import com.instagram.model.reels.Reel;
import java.util.List;

/* loaded from: classes6.dex */
public final class GK2 implements InterfaceC42241xE {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C7KE A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public GK2(RectF rectF, InterfaceC11380iw interfaceC11380iw, C7KE c7ke, String str, String str2, String str3, List list) {
        this.A02 = c7ke;
        this.A05 = str;
        this.A00 = rectF;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = interfaceC11380iw;
        this.A06 = list;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Reel reel = (Reel) obj;
        C14360o3.A0B(reel, 0);
        C7KE c7ke = this.A02;
        String str = this.A05;
        RectF rectF = this.A00;
        String str2 = this.A04;
        String str3 = this.A03;
        c7ke.A05.post(new GR8(rectF, this.A01, c7ke, reel, c7ke.A08, str, str2, str3, this.A06));
    }
}
