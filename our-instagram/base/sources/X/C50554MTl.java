package X;

import android.content.Context;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.MTl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50554MTl implements InterfaceC140606Xo {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ C3G2 A01;
    public final /* synthetic */ C38E A02;
    public final /* synthetic */ C3Ow A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;

    public C50554MTl(Reel reel, C3G2 c3g2, C38E c38e, C3Ow c3Ow, String str, List list, List list2, List list3) {
        this.A02 = c38e;
        this.A03 = c3Ow;
        this.A00 = reel;
        this.A05 = list;
        this.A07 = list2;
        this.A06 = list3;
        this.A01 = c3g2;
        this.A04 = str;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.MTo] */
    @Override // X.InterfaceC140606Xo
    public final void Cge(long j, boolean z) {
        C3Ow c3Ow = this.A03;
        if (c3Ow != null) {
            c3Ow.Blo().A08();
        }
        C38E c38e = this.A02;
        Reel reel = this.A00;
        List list = this.A05;
        List list2 = this.A07;
        List list3 = this.A06;
        Context context = c38e.A0L.getContext();
        ?? obj = new Object();
        obj.A01 = c3Ow;
        obj.A00 = context;
        C38E.A01(reel, this.A01, c38e, obj, this.A04, list, list2, list3, j, z);
    }
}
