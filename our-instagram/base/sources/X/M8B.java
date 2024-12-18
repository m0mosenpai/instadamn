package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class M8B implements Callable {
    public final /* synthetic */ C9CK A00;
    public final /* synthetic */ C26086BgF A01;
    public final /* synthetic */ AnonymousClass442 A02;
    public final /* synthetic */ C7TG A03;
    public final /* synthetic */ C47588Kzy A04;
    public final /* synthetic */ DirectThreadKey A05;
    public final /* synthetic */ ClipInfo A06;
    public final /* synthetic */ C47Z A07;
    public final /* synthetic */ Boolean A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ boolean A0D;

    public M8B(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C7TG c7tg, C47588Kzy c47588Kzy, DirectThreadKey directThreadKey, ClipInfo clipInfo, C47Z c47z, Boolean bool, String str, String str2, String str3, String str4, boolean z) {
        this.A03 = c7tg;
        this.A01 = c26086BgF;
        this.A05 = directThreadKey;
        this.A0D = z;
        this.A02 = anonymousClass442;
        this.A0C = str;
        this.A04 = c47588Kzy;
        this.A0B = str2;
        this.A09 = str3;
        this.A06 = clipInfo;
        this.A0A = str4;
        this.A07 = c47z;
        this.A08 = bool;
        this.A00 = c9ck;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C7TG c7tg = this.A03;
        C26086BgF c26086BgF = this.A01;
        DirectThreadKey directThreadKey = this.A05;
        boolean z = this.A0D;
        AnonymousClass442 anonymousClass442 = this.A02;
        String str = this.A0C;
        C47588Kzy c47588Kzy = this.A04;
        String str2 = this.A0B;
        String str3 = this.A09;
        ClipInfo clipInfo = this.A06;
        String str4 = this.A0A;
        C7TG.A01(c26086BgF, anonymousClass442, c7tg, c47588Kzy, directThreadKey, str, str2, str3, new MEM(this.A00, c26086BgF, anonymousClass442, c7tg, c47588Kzy, directThreadKey, clipInfo, this.A07, this.A08, str4, str, str2, str3, z), z);
        return C0eB.A00;
    }
}
