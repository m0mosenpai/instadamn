package X;

import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.Omw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55613Omw implements YPu {
    public final AvatarsNativeInputDelegate A00;
    public final /* synthetic */ C55143Od2 A01;

    @Override // X.YPu
    public final String Bcg() {
        return null;
    }

    @Override // X.YPu
    public final void EN6(String str) {
        C14360o3.A0B(str, 0);
        O1J o1j = this.A01.A0D.A00;
        if (o1j != null) {
            C55143Od2 c55143Od2 = o1j.A00;
            c55143Od2.A0J.F8m(new C51498Moj(str));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55613Omw(C55143Od2 c55143Od2) {
        this();
        this.A01 = c55143Od2;
    }

    @Override // X.YPu
    public final void Cyg() {
        C55143Od2 c55143Od2 = this.A01;
        if (c55143Od2.A0K) {
            c55143Od2.A0A = true;
        }
        C55143Od2.A02(c55143Od2, C05F.A06);
    }

    @Override // X.YPu
    public final void DM3() {
        C55143Od2.A02(this.A01, C05F.A04);
    }

    @Override // X.YPu
    public final void DPm(String str) {
        C55143Od2 c55143Od2 = this.A01;
        if (c55143Od2.A0K) {
            C55143Od2.A02(c55143Od2, C05F.A08);
        }
    }

    @Override // X.YPu
    public final void DPy(String str) {
        QuickPerformanceLogger quickPerformanceLogger;
        C55143Od2 c55143Od2 = this.A01;
        if (c55143Od2.A0K) {
            c55143Od2.A08 = true;
            C47815L9x c47815L9x = c55143Od2.A0C;
            if (c47815L9x != null && c47815L9x.A09 && (quickPerformanceLogger = c55143Od2.A0G) != null) {
                quickPerformanceLogger.markerPoint(603995461, "avatar_load_end");
            }
        }
    }

    @Override // X.YPu
    public final void EN7(String str, String str2, boolean z, String str3) {
        AbstractC167017dG.A1N(str, str2);
        C14360o3.A0B(str3, 3);
        O1J o1j = this.A01.A0D.A00;
        if (o1j != null) {
            C55143Od2 c55143Od2 = o1j.A00;
            c55143Od2.A0J.F8m(new C51499Mok(z, str3));
        }
    }

    public C55613Omw() {
        this.A00 = new AvatarsNativeInputDelegate();
    }
}
