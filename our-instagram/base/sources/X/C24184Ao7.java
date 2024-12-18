package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.Ao7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24184Ao7 implements BD6 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C26086BgF A02;
    public final /* synthetic */ Medium A03;
    public final /* synthetic */ C7FG A04;
    public final /* synthetic */ C211689Zc A05;
    public final /* synthetic */ C47Z A06;
    public final /* synthetic */ Long A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ ConcurrentLinkedQueue A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    @Override // X.BD6
    public final void DYT(Exception exc) {
    }

    public C24184Ao7(C26086BgF c26086BgF, Medium medium, C7FG c7fg, C211689Zc c211689Zc, C47Z c47z, Long l, String str, ConcurrentLinkedQueue concurrentLinkedQueue, int i, int i2, boolean z, boolean z2) {
        this.A0A = z;
        this.A04 = c7fg;
        this.A00 = i;
        this.A09 = concurrentLinkedQueue;
        this.A01 = i2;
        this.A08 = str;
        this.A0B = z2;
        this.A03 = medium;
        this.A06 = c47z;
        this.A05 = c211689Zc;
        this.A02 = c26086BgF;
        this.A07 = l;
    }

    @Override // X.BD6
    public final void DYU(C183978Ee c183978Ee) {
        c183978Ee.A12 = this.A0A;
        C7FG c7fg = this.A04;
        int i = this.A00;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A09;
        int i2 = this.A01;
        String str = this.A08;
        boolean z = this.A0B;
        Medium medium = this.A03;
        String str2 = medium.A0X;
        MediaUploadMetadata mediaUploadMetadata = medium.A0G;
        C47Z c47z = this.A06;
        c7fg.A04(this.A02, mediaUploadMetadata, this.A05, c47z, c183978Ee, this.A07, str, str2, concurrentLinkedQueue, i, i2, z);
    }
}
